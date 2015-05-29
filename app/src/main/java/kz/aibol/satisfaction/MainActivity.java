package kz.aibol.satisfaction;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private MediaPlayer minus, pushme, touchme, getmine, satisfaction;
    private MediaPlayer fpushme, ftouchme, fgetmine, fsatisfaction;
    private boolean minusPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minusPlaying = false;

        minus = MediaPlayer.create(getApplicationContext(), R.raw.minus);
        pushme = MediaPlayer.create(getApplicationContext(), R.raw.pushme);
        touchme = MediaPlayer.create(getApplicationContext(), R.raw.touchme);
        getmine = MediaPlayer.create(getApplicationContext(), R.raw.getmine);
        satisfaction = MediaPlayer.create(getApplicationContext(), R.raw.satisfaction);

        fpushme = MediaPlayer.create(getApplicationContext(), R.raw.female_pushme);
        ftouchme = MediaPlayer.create(getApplicationContext(), R.raw.female_touchme);
        fgetmine = MediaPlayer.create(getApplicationContext(), R.raw.female_getmine);
        fsatisfaction = MediaPlayer.create(getApplicationContext(), R.raw.female_satisfaction);


    }

    @Override
    protected void onPause() {
        super.onPause();
        minus.stop();
    }

    public void playMusic(View v) {
        Toast.makeText(getApplicationContext(), "NOW", Toast.LENGTH_LONG).show();
        switch (v.getId()) {
            case R.id.start:
                if(!minusPlaying)
                    minus.start();
                else {
                    minus.pause();
                }
                minusPlaying = !minusPlaying;
                break;
            case R.id.pushme:
                pushme.start();
                break;
            case R.id.touchme:
                touchme.start();
                break;
            case R.id.getmine:
                getmine.start();
                break;
            case R.id.satisfaction:
                satisfaction.start();
                break;
            case R.id.fpushme:
                fpushme.start();
                break;
            case R.id.ftouchme:
                ftouchme.start();
                break;
            case R.id.fgetmine:
                fgetmine.start();
                break;
            case R.id.fsatisfaction:
                fsatisfaction.start();
                break;
            default:
                break;
        }
    }

}
