package com.example.kannadakali;

import android.content.Context;
import android.media.MediaPlayer;

public class word {
    String engWord;
    String kEngWord;
    String kWord;
    int voice_id;

    public String getEWord() {
        return engWord;
    }

    public String getKEngWord() {
        return kEngWord;
    }

    public String getKWord() {
        return kWord;
    }

    public int getVoice_id() {
        return voice_id;
    }



    public word(String a, String b, String c) {
        engWord = a;
        kEngWord = b;
        kWord=c;
    }

    public word(String a, String b, String c, int d) {
        engWord = a;
        kEngWord = b;
        kWord = c;
        voice_id=d;
    }
    public static void playDisSound(Context c, int soundID){
        //Play short tune
        MediaPlayer mediaPlayer = MediaPlayer.create(c, soundID);
        mediaPlayer.setOnCompletionListener( new MediaPlayer.OnCompletionListener(){
            @Override
            public void onCompletion( MediaPlayer mp){
                mp.release();
            }
        });
        mediaPlayer.start();
    }
}

