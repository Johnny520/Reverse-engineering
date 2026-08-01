// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.media.MediaPlayer;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageButton;

public final class CLS478 implements View.OnClickListener {
    public final int FLD4694;
    public final ImageButton FLD4695;
    public final MediaPlayer FLD4696;
    public final Runnable[] FLD4697;
    public final ImageButton FLD4698;

    public CLS478(Runnable[] arr_runnable, MediaPlayer mediaPlayer0, ImageButton imageButton0, ImageButton imageButton1, int v) {
        this.FLD4694 = v;
        this.FLD4697 = arr_runnable;
        this.FLD4696 = mediaPlayer0;
        this.FLD4698 = imageButton0;
        this.FLD4695 = imageButton1;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MediaPlayer mediaPlayer0 = this.FLD4696;
        ImageButton imageButton0 = this.FLD4695;
        ImageButton imageButton1 = this.FLD4698;
        Runnable[] arr_runnable = this.FLD4697;
        switch(this.FLD4694) {
            case 0: {
                try {
                    CLS476.FLD4666.removeCallbacks(arr_runnable[0]);
                    if(mediaPlayer0 != null) {
                        if(CLS476.FLD4664) {
                            mediaPlayer0.start();
                            CLS476.FLD4664 = false;
                            CLS476.FLD4666.postDelayed(arr_runnable[0], 100L);
                        }
                        else {
                            mediaPlayer0.pause();
                            CLS476.FLD4664 = true;
                        }
                    }
                    imageButton1.setVisibility(8);
                    imageButton0.setVisibility(0);
                }
                catch(Throwable throwable1) {
                    throwable1.printStackTrace();
                }
                return;
            }
            case 1: {
                try {
                    CLS476.FLD4666.removeCallbacks(arr_runnable[0]);
                    if(mediaPlayer0 != null) {
                        if(CLS476.FLD4664) {
                            mediaPlayer0.start();
                            CLS476.FLD4664 = false;
                            CLS476.FLD4666.postDelayed(arr_runnable[0], 100L);
                        }
                        else {
                            mediaPlayer0.pause();
                            CLS476.FLD4664 = true;
                        }
                    }
                    imageButton1.setVisibility(8);
                    imageButton0.setVisibility(0);
                }
                catch(Throwable throwable2) {
                    throwable2.printStackTrace();
                }
                return;
            }
            default: {
                try {
                    CLS476.FLD4666.removeCallbacks(arr_runnable[0]);
                    if(mediaPlayer0 != null) {
                        if(CLS476.FLD4664) {
                            mediaPlayer0.start();
                            CLS476.FLD4664 = false;
                            CLS476.FLD4666.postDelayed(arr_runnable[0], 100L);
                        }
                        else {
                            mediaPlayer0.pause();
                            CLS476.FLD4664 = true;
                        }
                    }
                    imageButton1.setVisibility(8);
                    imageButton0.setVisibility(0);
                }
                catch(Throwable throwable0) {
                    throwable0.printStackTrace();
                }
            }
        }
    }
}

