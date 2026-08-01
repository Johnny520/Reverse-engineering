// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class CLS154 implements View.OnTouchListener {
    public float FLD1079;
    public long FLD1080;
    public float FLD1081;
    public final CLS309 FLD1082;

    public CLS154(CLS309 ʽﹶ0) {
        this.FLD1082 = ʽﹶ0;
        super();
        this.FLD1079 = 0.0f;
        this.FLD1081 = 0.0f;
        this.FLD1080 = 0L;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        switch(motionEvent0.getAction()) {
            case 0: {
                this.FLD1079 = motionEvent0.getRawX();
                this.FLD1081 = motionEvent0.getRawY();
                this.FLD1080 = System.currentTimeMillis();
                return false;
            }
            case 1: {
                if(System.currentTimeMillis() - this.FLD1080 < 300L) {
                    view0.performClick();
                    return true;
                }
                return false;
            }
            case 2: {
                float f = motionEvent0.getRawX() - this.FLD1079;
                float f1 = motionEvent0.getRawY() - this.FLD1081;
                float f2 = this.FLD1082.FLD1004.getX();
                float f3 = this.FLD1082.FLD1004.getY();
                this.FLD1079 = motionEvent0.getRawX();
                this.FLD1081 = motionEvent0.getRawY();
                this.FLD1082.FLD1004.setX(f2 + f);
                this.FLD1082.FLD1004.setY(f3 + f1);
                return false;
            }
            default: {
                return false;
            }
        }
    }
}

