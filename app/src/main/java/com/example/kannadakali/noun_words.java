package com.example.kannadakali;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;

public class noun_words extends AppCompatActivity {
    public wordAdapter itemsAdapter;
    public ListView listView;
    ArrayList<word> num=new ArrayList<word>();
    ImageButton btn;
    MediaPlayer mp;
    String[] eng={"Time","Year","People","Way","Day","Man","Thing","Woman","Life","Child","World","School","State","Family","Student","Group","Country","Problem","Hand","Part" ,"Place" ,"Case"  ,"Week" ,"Company" ,"System","Program" ,"Question" ,"Work","Government" ,"Number" ,"Night" ,"Home","Water" ,"Room" ,"Mother" ,"Area" ,"Money" ,"Story" ,"Month","Right","Study","Book","Eye","Job","Word","Business","Issue","Head","House","Service","Friend","Teacher"};
    String[] keng={"Samaya","Varsa","Janaru","Dari","Dina","Manusya","Viṣaya","Mahiḷe","Jīvana","Magu","Prapancha","Shale","Rājya","Kuṭumba","Vidyārthi","Gumpu","Desha","Samasye","Kai","Bhāga","Sthaḷa","Prakaraṇa","Vāra","Kampani","Vyavasthe","Kāryakrama","Praśne"
            ,"Kelasa"
            ,"Sarkāra"
            ,"Saṅkhye"
            ,"Rātri"
            ,"Mane"
            ,"Neeru"
            ,"Kotadi"
            ,"Tayi"
            ,"Pradesha"
            ,"Hana"
            ,"Kathe"
            ,"Tingalu"
            ,"Sari"
            ,"Adhyayana"
            ,"Pustaka"
            ,"Kannu"
            ,"Kelasa"
            ,"Pada"
            ,"Vyavahāra"
            ,"Samasye"
            ,"Tale"
            ,"Mane"
            ,"Seve"
            ,"Snēhita"
            ,"Sikshaka"
    };
    String[] kkan={"ಸಮಯ"
            ,"ವರ್ಷ"
            ,"ಜನರು"
            ,"ದಾರಿ"
            ,"ದಿನ"
            ,"ಮನುಷ್ಯ"
            ,"ವಿಷಯ"
            ,"ಮಹಿಳೆ"
            ,"ಜೀವನ"
            ,"ಮಗು"
            ,"ಪ್ರಪಂಚ"
            ,"ಶಾಲೆ"
            ,"ರಾಜ್ಯ"
            ,"ಕುಟುಂಬ"
            ,"ವಿದ್ಯಾರ್ಥಿ"
            ,"ಗುಂಪು"
            ,"ದೇಶ"
            ,"ಸಮಸ್ಯೆ"
            ,"ಕೈ"
            ,"ಭಾಗ"
            ,"ಸ್ಥಳ"
            ,"ಪ್ರಕರಣ"
            ,"ವಾರ"
            ,"ಕಂಪನಿ"
            ,"ವ್ಯವಸ್ಥೆ"
            ,"ಕಾರ್ಯಕ್ರಮ"
            ,"ಪ್ರಶ್ನೆ"
            ,"ಕೆಲಸ"
            ,"ಸರ್ಕಾರ"
            ,"ಸಂಖ್ಯೆ"
            ,"ರಾತ್ರಿ"
            ,"ಮನೆ"
            ,"ನೀರು"
            ,"ಕೊಠಡಿ"
            ,"ತಾಯಿ"
            ,"ಪ್ರದೇಶ"
            ,"ಹಣ"
            ,"ಕಥೆ"
            ,"ತಿಂಗಳು"
            ,"ಸರಿ"
            ,"ಅಧ್ಯಯನ"
            ,"ಪುಸ್ತಕ"
            ,"ಕಣ್ಣು"
            ,"ಕೆಲಸ"
            ,"ಪದ"
            ,"ವ್ಯವಹಾರ"
            ,"ಸಮಸ್ಯೆ"
            ,"ತಲೆ"
            ,"ಮನೆ"
            ,"ಸೇವೆ"
            ,"ಸ್ನೇಹಿತ"
            ,"ಶಿಕ್ಷಕ"
    };
    int [] aud={R.raw.time,
            R.raw.year,
            R.raw.people,
            R.raw.way,
            R.raw.day,
            R.raw.man,
            R.raw.thing,
            R.raw.women,
            R.raw.life,
            R.raw.child,
            R.raw.world,
            R.raw.school,
            R.raw.state,
            R.raw.family,
            R.raw.student,
    R.raw.group,
    R.raw.country,
    R.raw.problem,
    R.raw.hand,
    R.raw.part,
    R.raw.place,
    R.raw.ccase,
    R.raw.week,
    R.raw.company,
    R.raw.system,
    R.raw.program,
    R.raw.question,
    R.raw.work,
    R.raw.government,
    R.raw.number,
    R.raw.night,
    R.raw.home,
    R.raw.water,
    R.raw.room,
    R.raw.mother,
    R.raw.area,
    R.raw.money,
    R.raw.story,
    R.raw.month,
    R.raw.right,
    R.raw.study,
    R.raw.book,
    R.raw.eye,
    R.raw.job,
    R.raw.word,
    R.raw.business,
    R.raw.issue,
    R.raw.head,
    R.raw.house,
    R.raw.service,
    R.raw.friend,
    R.raw.teacher,
};
    Context c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        c=getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noun_words);
        Typeface faceAkshar = Typeface.createFromAsset(getAssets(), "akshar.ttf");
        //EditText theFilter = (EditText) findViewById(R.id.searchFilter);
        num = new ArrayList<word>();
        for(int i=0;i<eng.length;i++) {
            num.add(new word(eng[i],keng[i],kkan[i],aud[i]));
        }
        itemsAdapter = new wordAdapter(this, num);
        listView = (ListView)findViewById(R.id.listNoun);
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
