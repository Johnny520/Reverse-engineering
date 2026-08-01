// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import b.ʾᵢ.CLS27;

public final class CLS72 implements View.OnTouchListener {
    public final CLS90 FLD241;

    public CLS72(CLS90 ᐧⁱ0) {
        this.FLD241 = ᐧⁱ0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        CLS90 ᐧⁱ0 = this.FLD241;
        ᐧⁱ0.getClass();
        try {
            Context context0 = (Context)ᐧⁱ0.FLD376.get();
            float f = motionEvent0.getRawX();
            float f1 = motionEvent0.getRawY();
            int v = motionEvent0.getAction();
            Point point0 = ᐧⁱ0.FLD377;
            PointF pointF0 = ᐧⁱ0.FLD373;
            switch(v) {
                case 0: {
                    Long long0 = System.currentTimeMillis();
                    if(((long)long0) - ((long)ᐧⁱ0.FLD368) <= 300L) {
                        ᐧⁱ0.MTH1727();
                    }
                    ᐧⁱ0.FLD368 = long0;
                    pointF0.x = f;
                    pointF0.y = f1;
                    point0.x = ᐧⁱ0.FLD372.x;
                    point0.y = ᐧⁱ0.FLD372.y;
                    return true;
                label_19:
                    if(v == 2) {
                        try {
                            ᐧⁱ0.FLD372.x = (int)Math.max(Math.min(((float)point0.x) + f - pointF0.x, ᐧⁱ0.FLD369.x), 0.0f);
                            ᐧⁱ0.FLD372.y = (int)Math.max(Math.min(((float)point0.y) + f1 - pointF0.y, ᐧⁱ0.FLD369.y), 0.0f);
                            ᐧⁱ0.FLD364.updateViewLayout(ᐧⁱ0.FLD366, ᐧⁱ0.FLD372);
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                        return true;
                    }
                    break;
                }
                case 1: {
                    if(Math.abs(f - pointF0.x) < ((float)CLS90.MTH1729(context0)) && Math.abs(f1 - pointF0.y) < ((float)CLS90.MTH1729(context0))) {
                        MediaPlayer mediaPlayer0 = ᐧⁱ0.FLD363;
                        if(mediaPlayer0 != null) {
                            if(mediaPlayer0.isPlaying()) {
                                ᐧⁱ0.FLD363.pause();
                                return true;
                            }
                            ᐧⁱ0.FLD363.start();
                            return true;
                        }
                    }
                    break;
                }
                default: {
                    goto label_19;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return true;
    }
}

