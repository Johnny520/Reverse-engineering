// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import t.ˈˊ.CLS88;

public final class CLS156 implements View.OnTouchListener {
    public float FLD1090;
    public long FLD1091;
    public float FLD1092;
    public final CLS88 FLD1093;

    public CLS156(CLS88 ˊﾞ0) {
        this.FLD1093 = ˊﾞ0;
        super();
        this.FLD1090 = 0.0f;
        this.FLD1092 = 0.0f;
        this.FLD1091 = 0L;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.FLD1090 = motionEvent0.getRawX();
                this.FLD1092 = motionEvent0.getRawY();
                this.FLD1091 = System.currentTimeMillis();
                return false;
            }
            case 1: {
                if(System.currentTimeMillis() - this.FLD1091 < 300L) {
                    view0.performClick();
                    return true;
                }
                return false;
            }
            case 2: {
                float f = motionEvent0.getRawX() - this.FLD1090;
                float f1 = motionEvent0.getRawY() - this.FLD1092;
                float f2 = this.FLD1093.getX();
                float f3 = this.FLD1093.getY();
                this.FLD1090 = motionEvent0.getRawX();
                this.FLD1092 = motionEvent0.getRawY();
                this.FLD1093.setX(f2 + f);
                this.FLD1093.setY(f3 + f1);
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

