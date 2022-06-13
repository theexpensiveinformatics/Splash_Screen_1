package tei.krushang.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    TextView h_one,t_one,textview2;
    LinearLayout next;
    ImageView imageView3,imageView2,imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h_one=(TextView)findViewById(R.id.h_one);
        t_one=(TextView)findViewById(R.id.t_one);
        textview2=(TextView)findViewById(R.id.textView2);
        imageView=(ImageView) findViewById(R.id.imageView);
        imageView2=(ImageView) findViewById(R.id.imageView2);
        imageView3=(ImageView) findViewById(R.id.imageView3);
        next=(LinearLayout) findViewById(R.id.next);
         Timer _timer = new Timer();

        _Animator(h_one, "translationY", 300, 0);
        _Animator(h_one, "alpha", 0, 0);
        _Animator(t_one, "translationY", 300, 0);
        _Animator(t_one, "alpha", 0, 0);
        _Animator(h_one, "translationY", 0, 800);
        _Animator(h_one, "alpha", 1, 800);
        _Animator(imageView,"translationY",150,0);
        _Animator(imageView,"translationY",150,0);
        _Animator(imageView2,"translationY",150,0);
        _Animator(imageView3,"translationY",150,0);
        _Animator(next,"translationX",400,0);
        _Animator(next,"alpha",0,0);


        TimerTask timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(t_one, "translationY", 0, 400);
                        _Animator(t_one, "alpha", 1, 400);
                    }
                });
            }
        };
            _timer.schedule(timer, (int)(600));


            //timer for imageview
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(imageView,"translationY",-100,200);

                    }
                });
            }
        };
        _timer.schedule(timer, (int)(800));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(imageView,"translationY",0,200);

                    }
                });
            }
        };
        _timer.schedule(timer, (int)(1000));

        //timer for image view2
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(imageView2,"translationY",-100,200);

                    }
                });
            }
        };
        _timer.schedule(timer, (int)(1200));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(imageView2,"translationY",0,200);

                    }
                });
            }
        };
        _timer.schedule(timer, (int)(1400));


        //timer for imageview 3
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(imageView3,"translationY",-100,200);

                    }
                });
            }
        };
        _timer.schedule(timer, (int)(1600));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(imageView3,"translationY",0,200);

                    }
                });
            }
        };
        _timer.schedule(timer, (int)(1800));


        //timer for next linear
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(next,"translationX",-100,400);
                        _Animator(next,"alpha",1,400);

                    }
                });
            }
        };
        _timer.schedule(timer, (int)(1800));
        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        _Animator(next,"translationX",0,400);
                        _Animator(next,"alpha",1,400);
                    }
                });
            }
        };
        _timer.schedule(timer, (int)(2200));

        LinearLayout next = findViewById(R.id.next);
        next.setOnClickListener(v -> next());

    }
    private void next() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }



    public void _Animator (final View _view, final String _propertyName, final double _value, final double _duration) {
        ObjectAnimator anim = new ObjectAnimator();
        anim.setTarget(_view);
        anim.setPropertyName(_propertyName);
        anim.setFloatValues((float)_value);
        anim.setDuration((long)_duration);
        anim.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        anim.start();
    }
}