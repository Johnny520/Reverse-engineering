// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.view.View;

public final class CLS163 extends View {
    public Paint FLD1125;
    public int FLD1126;
    public int FLD1127;
    public Path FLD1128;
    public int FLD1129;
    public boolean FLD1130;

    public CLS163(Context context0) {
        super(context0);
        this.FLD1127 = 0xFF888888;
        this.FLD1130 = false;
        this.FLD1129 = ((int)this.getContext().getResources().getDisplayMetrics().scaledDensity) * 2;
        this.FLD1126 = 1;
        Paint paint0 = new Paint();
        this.FLD1125 = paint0;
        paint0.setAntiAlias(true);
        this.FLD1125.setColor(this.FLD1127);
        this.FLD1128 = new Path();
        this.setWillNotDraw(false);
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        int v = canvas0.getWidth();
        int v1 = canvas0.getHeight();
        canvas0.rotate(-45.0f, ((float)v), ((float)(v1 / 2)));
        this.FLD1128.reset();
        this.FLD1128.moveTo(((float)v), ((float)(v1 / 2)));
        float f = (float)this.FLD1126;
        this.FLD1128.lineTo(((float)v), f);
        int v2 = v - this.FLD1126;
        this.FLD1128.addCircle(((float)v2), ((float)this.FLD1126), ((float)this.FLD1126), Path.Direction.CCW);
        this.FLD1128.lineTo(((float)(v2 - this.FLD1126)), f);
        int v3 = v1 / 2 - this.FLD1129;
        this.FLD1128.lineTo(((float)(v - this.FLD1129)), ((float)v3));
        float f1 = (float)(v - v1 / 2 + this.FLD1126);
        this.FLD1128.lineTo(f1, ((float)v3));
        int v4 = v3 + this.FLD1126;
        canvas0.drawCircle(f1, ((float)v4), ((float)this.FLD1126), this.FLD1125);
        this.FLD1128.lineTo(f1, ((float)(v4 + this.FLD1126)));
        this.FLD1128.lineTo(((float)v), ((float)(v1 / 2)));
        canvas0.drawPath(this.FLD1128, this.FLD1125);
        this.FLD1130 = true;
    }

    public void setColor(int v) {
        this.FLD1127 = v;
        Paint paint0 = this.FLD1125;
        if(paint0 != null) {
            paint0.setColor(v);
        }
        if(this.FLD1130) {
            this.invalidate();
        }
    }
}

