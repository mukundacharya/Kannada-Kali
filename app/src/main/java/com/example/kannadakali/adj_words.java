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
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class adj_words extends AppCompatActivity {
    public wordAdapter itemsAdapter;
    Context c;
    public ListView listView;
    MediaPlayer mp;
    ArrayList<word> num=new ArrayList<word>();
    int [] aud={R.raw.colours ,
            R.raw.black,
            R.raw.blue,
            R.raw.green,
            R.raw.orange,
            R.raw.red,
            R.raw.white,
            R.raw.big,
            R.raw.deep,
            R.raw.loong,
            R.raw.sshort,
            R.raw.small,
            R.raw.tall,
            R.raw.thick,
            R.raw.thin,
            R.raw.wide,
            R.raw.shapes,
            R.raw.straight,
            R.raw.taste,
            R.raw.bitter,
            R.raw.fresh,
            R.raw.salty,
            R.raw.sour,
            R.raw.spicy,
            R.raw.sweet,
            R.raw.bad,
            R.raw.clean,
            R.raw.dark,
            R.raw.difficult,
            R.raw.dirty,
            R.raw.dried,
            R.raw.easy,
            R.raw.empty,
            R.raw.expensive,
            R.raw.fast,
            R.raw.full,
            R.raw.good,
            R.raw.hard,
            R.raw.heavy,
            R.raw.lightweight,
            R.raw.local,
            R.raw.nnew,
            R.raw.noisy,
            R.raw.old,
            R.raw.powerful,
            R.raw.quiet,
            R.raw.correctly,
            R.raw.slow,
            R.raw.soft,
            R.raw.very,
            R.raw.weak,
            R.raw.wet,
            R.raw.wrong,
            R.raw.young,
            R.raw.few,
            R.raw.little,
            R.raw.many,
            R.raw.much,
            R.raw.part,
            R.raw.afew,
            R.raw.everything,
            R.raw.strong,
            R.raw.beautiful,
    };
    String[] eng={"Colours "
            ,"black"
            ,"blue"
            ,"green"
            ,"orange"
            ,"red"
            ,"white"
            ,"big"
            ,"deep"
            ,"long"
            ,"short"
            ,"small"
            ,"tall"
            ,"thick"
            ,"thin"
            ,"wide"
            ,"shapes"
            ,"straight"
            ,"taste"
            ,"bitter"
            ,"fresh"
            ,"salty"
            ,"sour"
            ,"spicy"
            ,"sweet"
            ,"bad"
            ,"clean"
            ,"dark"
            ,"difficult"
            ,"dirty"
            ,"dried"
            ,"easy"
            ,"empty"
            ,"expensive"
            ,"fast"
            ,"full"
            ,"good"
            ,"hard"
            ,"heavy"
            ,"light-weight"
            ,"local"
            ,"new"
            ,"noisy"
            ,"old"
            ,"powerful"
            ,"quiet"
            ,"correct"
            ,"slow"
            ,"soft"
            ,"very"
            ,"weak"
            ,"wet"
            ,"wrong"
            ,"young"
            ,"few"
            ,"little"
            ,"many"
            ,"much"
            ,"part"
            ,"a few"
            ,"everything"
            ,"strong"
            ,"beautiful"
    };
    String[] keng={"Bannagalu"
            ,"Kappu"
            ,"neeli"
            ,"hasiru"
            ,"kesari"
            ,"kempu"
            ,"bili"
            ,"doddadu"
            ,"aalavada"
            ,"uddha"
            ,"chikka"
            ,"sanna"
            ,"uddha"
            ,"dappa"
            ,"theluvada"
            ,"agala"
            ,"aakaragalu"
            ,"nera"
            ,"ruchi"
            ,"kahi"
            ,"thaja"
            ,"uppu"
            ,"huli"
            ,"khhara"
            ,"sihi"
            ,"kettadu"
            ,"Swacha"
            ,"kathhale"
            ,"kashta"
            ,"galiju"
            ,"onagida"
            ,"sulabha"
            ,"khali"
            ,"dhubhari"
            ,"sheeghra"
            ,"tumbide"
            ,"olleyadu"
            ,"Kaṭhiṇa"
            ,"bhhara"
            ,"hagura"
            ,"sthaleeya"
            ,"hosadu"
            ,"galate"
            ,"haleyadu"
            ,"shakthiyuta"
            ,"Stabdha"
            ,"sariyada"
            ,"nidhana"
            ,"komala"
            ,"thumbha"
            ,"dhurbhala"
            ,"Odde"
            ,"thappu"
            ,"yuva"
            ,"kelavu"
            ,"swalpha"
            ,"aneka"
            ,"jasthi"
            ,"bhagha"
            ,"kelavu"
            ,"Ellavu"
            ,"balavada"
            ,"sundara"
    };
    String [] kkan={"ಬಣ್ಣಗಳು"
            ,"ಕಪ್ಪು"
            ,"ನೀಲಿ"
            ,"ಹಸಿರು"
            ,"ಕೇಸರಿ"
            ,"ಕೆಂಪು"
            ,"ಬಿಳಿ"
            ,"ದೊಡ್ಡದು"
            ,"ಆಳವಾದ"
            ,"ಉದ್ಧ"
            ,"ಚಿಕ್ಕ"
            ,"ಸಣ್ಣ"
            ,"ಉದ್ಧ"
            ,"ದಪ್ಪ"
            ,"ತೆಳುವಾದ"
            ,"ಅಗಲ"
            ,"ಆಕಾರಗಳು"
            ,"ನೇರ"
            ,"ರುಚಿ"
            ,"ಕಹಿ"
            ,"ತಾಜಾ"
            ,"ಉಪ್ಪು"
            ,"ಹುಳಿ"
            ,"ಖಾರಾ"
            ,"ಸಿಹಿ"
            ,"ಕೆಟ್ಟದು"
            ,"ಸ್ವಚ್ಛ"
            ,"ಕತ್ತಲೆ"
            ,"ಕಷ್ಟ"
            ,"ಗಲೀಜು"
            ,"ಒಣಗಿದ"
            ,"ಸುಲಭ"
            ,"ಖಾಲಿ"
            ,"ದುಬಾರಿ"
            ,"ಶೀಗ್ರಾ"
            ,"ತುಂಬಿದೆ"
            ,"ಒಳ್ಳೆಯದು"
            ,"ಕಠಿಣ"
            ,"ಭಾರ"
            ,"ಹಗುರ"
            ,"ಸ್ಥಳೀಯ"
            ,"ಹೊಸದು"
            ," ಗಲಾಟೆ"
            ,"ಹಳೆಯದು"
            ,"ಶಕ್ತಿಯುತ"
            ,"ಸ್ತಬ್ಧ"
            ,"ಸರಿಯಾದ"
            ,"ನಿಧಾನ"
            ,"ಕೋಮಲ"
            ,"ತುಂಬಾ"
            ,"ದುರ್ಬಲ"
            ,"ಒದ್ದೆ"
            ,"ತಪ್ಪು"
            ,"ಯುವ"
            ,"ಕೆಲವು"
            ,"ಸ್ವಲ್ಪ"
            ,"ಅನೇಕ"
            ,"ಜಾಸ್ತಿ"
            ,"ಭಾಗ"
            ,"ಕೆಲವು"
            ,"ಎಲ್ಲವೂ"
            ,"ಬಲವಾದ"
            ,"ಸುಂದರ"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        c = getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adj_words);
        Typeface faceAkshar = Typeface.createFromAsset(getAssets(), "akshar.ttf");

        num = new ArrayList<word>();
        for(int i=0;i<eng.length;i++) {
            num.add(new word(eng[i],keng[i],kkan[i],aud[i]));
        }
        itemsAdapter = new wordAdapter(this, num);
        listView = (ListView)findViewById(R.id.listAdj);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
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
    public void playSound(Context c,int id) {
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
