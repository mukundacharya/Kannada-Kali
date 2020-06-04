package com.example.kannadakali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class verb_words extends AppCompatActivity {
    public wordAdapter itemsAdapter;
    public ListView listView;
    MediaPlayer mp;
    Context c;
    ArrayList<word> num=new ArrayList<word>();
    int [] aud={R.raw.v1,
            R.raw.v2,
            R.raw.v3,
            R.raw.v4,
            R.raw.v5,
            R.raw.v6,
            R.raw.v7,
            R.raw.v8,
            R.raw.v9,
            R.raw.v10,
            R.raw.v11,
            R.raw.v13,
            R.raw.v14,
            R.raw.v15,
            R.raw.v16,
            R.raw.v17,
            R.raw.v18,
            R.raw.v19,
            R.raw.v20,
            R.raw.v21,
            R.raw.v22,
            R.raw.v23,
            R.raw.v24,
            R.raw.v25,
            R.raw.v26,
            R.raw.v27,
            R.raw.v28,
            R.raw.v29,
            R.raw.v30,
            R.raw.v31,
            R.raw.v32,
            R.raw.v33,
            R.raw.v34,
            R.raw.v35,
            R.raw.v36,
            R.raw.v37,
            R.raw.v38,
            R.raw.v39,
            R.raw.v40,
            R.raw.v41,
            R.raw.v42,
            R.raw.v43,
            R.raw.v44,
            R.raw.v45,
            R.raw.v46,
            R.raw.v47,
            R.raw.v48,
            R.raw.v49,
            R.raw.v50,
            R.raw.v51
    };
    String[] eng={"I wrote"
            ,"I drove"
            ,"I loved"
            ,"I gave"
            ,"I smiled"
            ,"I took"
            ,"he spoke"
            ,"he wrote"
            ,"he drove"
            ,"he loves"
            ,"he gave"
            ,"he smiled"
            ,"he took"
            ,"we spoke"
            ,"we wrote"
            ,"we drove"
            ,"we loved"
            ,"we gave"
            ,"we smiled"
            ,"we took"
            ,"Future"
            ,"I will speak"
            ,"I will write"
            ,"I will drive"
            ,"I will love"
            ,"I will give"
            ,"I will smile"
            ,"I will take"
            ,"he will speak"
            ,"he will write"
            ,"he will drive"
            ,"he will love"
            ,"he will give"
            ,"he will smile"
            ,"he will take"
            ,"we will speak"
            ,"we will write"
            ,"we will drive"
            ,"we will love"
            ,"we will give"
            ,"we will smile"
            ,"we will take"
            ,"Present"
            ,"I am speaking"
            ,"I am writing"
            ,"I drive"
            ,"I love"
            ,"I give"
            ,"I smile"
            ,"I take"
    };
    String [] keng={"naanu baredhe"
            ,"naanu odisidhe"
            ,"naanu preethisida"
            ,"naanu kotte"
            ,"naanu nakke"
            ,"naanu tagonde"
            ,"avanu mathanadida"
            ,"avanu baredha"
            ,"Avanu ōḍisidanu"
            ,"Avanu prītisuttāne"
            ,"Avaru nīḍidaru"
            ,"avanu nakkanu"
            ,"avanu tegedukonda"
            ,"naavu mathanadidhevu"
            ,"naavu baredhevu"
            ,"naavu odisidhevu"
            ,"naavu preethisidevu"
            ,"naavu kottevu"
            ,"Nāvu naguttiddevu"
            ,"naavu tegedukondevu"
            ,"bhavishya kala"
            ,"naanu mathanaduthhene"
            ,"naanu bareyutheeni"
            ,"Nānu chālane māḍuttēne"
            ,"Nānu prītisuve"
            ,"naanu koduthene"
            ,"naanu naguthenne"
            ,"Nānu tegedukoḷḷuve"
            ,"avanu mathanaduthhane"
            ,"Avaru bareyuttāre"
            ,"avanu odisutthane"
            ,"avanu preethisuthhane"
            ,"avanu koduthhane"
            ,"avanu naguthhane"
            ,"Avanu tegedukoḷḷuvanu"
            ,"Nāvu mātanāḍuttēve"
            ,"Nāvu bareyuttēve"
            ,"Nāvu chālane māḍuttēve"
            ,"Nāvu prītisuttēve"
            ,"naavu kodona"
            ,"naavu nagona"
            ,"naavu thagolonna"
            ,"Prastuta"
            ,"Nānu mātanāḍuttiddēne"
            ,"naanu bareyuthenne"
            ,"Nānu cālane māḍuttēne"
            ,"Nānu prītisuttiddēne"
            ,"Nānu nīḍuttēne"
            ,"nannu nagutheene"
            ,"naanu tegedukolluthene"
    };
    String[] kkan={"ನಾನು ಬರೆದೆ"
            ,"ನಾನು ಓಡಿಸಿದೆ"
            ,"ನಾನು ಪ್ರೀತಿಸಿದ"
            ,"ನಾನು ಕೊಟ್ಟೆ"
            ,"ನಾನು ನಕ್ಕೆ"
            ,"ನಾನು ತೊಗೊಂಡೆ"
            ,"ಅವನು ಮಾತನಾಡಿದ"
            ,"ಅವನು ಬರೆದ"
            ,"ಅವನು ಓಡಿಸಿದನು"
            ,"ಅವನು ಪ್ರೀತಿಸುತ್ತಾನೆ"
            ,"ಅವರು ನೀಡಿದರು"
            ,"ಅವನು ನಕ್ಕನು"
            ,"ಅವರು ತೆಗೆದುಕೊಂಡರು"
            ,"ನಾವು ಮಾತನಾಡಿದೆವು"
            ,"ನಾವು ಬರೆದಿದ್ದೇವೆ"
            ,"ನಾವು ಓಡಿಸಿದೆವು"
            ,"ನಾವು ಪ್ರೀತಿಸಿದ್ದೇವೆ"
            ,"ನಾವು ಕೊಟ್ಟೆವು"
            ,"ನಾವು ನಗುತ್ತಿದ್ದೆವು"
            ,"ನಾವು ತೆಗೆದುಕೊಂಡೆವು"
            ,"ಭವಿಷ್ಯ"
            ,"ನಾನು ಮಾತನಾಡುತ್ತೇನೆ"
            ,"ನಾನು ಬರೆಯುತ್ತೇನೆ"
            ,"ನಾನು ಚಾಲನೆ ಮಾಡುತ್ತೇನೆ"
            ,"ನಾನು ಪ್ರೀತಿಸುವೆ"
            ,"ನಾನು ಕೊಡುತ್ತೇನೆ"
            ,"ನಾನು ನಗುತ್ತೇನೆ"
            ,"ನಾನು ತೆಗೆದುಕೊಳ್ಳುವೆ"
            ,"ಅವನು ಮಾತನಾಡುತ್ತಾನೆ"
            ,"ಅವರು ಬರೆಯುತ್ತಾರೆ"
            ,"ಅವನು ಓಡಿಸುವನು"
            ,"ಅವನು ಪ್ರೀತಿಸುವನು"
            ,"ಅವನು ಕೊಡುವನು"
            ,"ಅವನು ಕಿರುನಗೆ ಮಾಡುತ್ತಾನೆ"
            ,"ಅವನು ತೆಗೆದುಕೊಳ್ಳುವನು"
            ,"ನಾವು ಮಾತನಾಡುತ್ತೇವೆ"
            ,"ನಾವು ಬರೆಯುತ್ತೇವೆ"
            ,"ನಾವು ಚಾಲನೆ ಮಾಡುತ್ತೇವೆ"
            ,"ನಾವು ಪ್ರೀತಿಸುತ್ತೇವೆ"
            ,"ನಾವು ನೀಡುತ್ತೇವೆ"
            ,"ನಾವು ಕಿರುನಗೆ ಮಾಡುತ್ತೇವೆ"
            ,"ನಾವು ತೆಗೆದುಕೊಳ್ಳುತ್ತೇವೆ"
            ,"ಪ್ರಸ್ತುತ"
            ,"ನಾನು ಮಾತನಾಡುತ್ತಿದ್ದೇನೆ"
            ,"ನಾನು ಬರೆಯುತ್ತೇನೆ"
            ,"ನಾನು ಚಾಲನೆ ಮಾಡುತ್ತೇನೆ"
            ,"ನಾನು ಪ್ರೀತಿಸುತ್ತಿದ್ದೇನೆ"
            ,"ನಾನು ನೀಡುತ್ತೇನೆ"
            ,"ನಾನು ನಗುತ್ತೇನೆ"
            ,"ನಾನು ತೆಗೆದುಕೊಳ್ಳುತ್ತೇನೆ"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        c=getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verb_words);
        Typeface faceAkshar = Typeface.createFromAsset(getAssets(), "akshar.ttf");



        num = new ArrayList<word>();
        for(int i=0;i<eng.length;i++) {
            num.add(new word(eng[i],keng[i],kkan[i],aud[i]));
        }
        itemsAdapter = new wordAdapter(this, num);
        listView = (ListView)findViewById(R.id.listVerb);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word w=num.get(position);
                int aud_id=w.getVoice_id();
                playSound(c,aud_id);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        MenuItem mySearchMenuItem=menu.findItem(R.id.searchMenu);
        SearchView searchView=(SearchView)mySearchMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)) {
                    itemsAdapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    itemsAdapter.filter(newText);
                }
                return true;
            }
        });
        return true;
    }
    public void playSound(Context c, int id) {
        mp= MediaPlayer.create(c,id);
        mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mp.start();
            }
        });
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.release();
            }
        });
    }
}
