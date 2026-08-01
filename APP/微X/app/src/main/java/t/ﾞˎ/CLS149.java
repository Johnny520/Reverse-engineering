// Decompiled by JEB v5.42.0.202606242140

package t.ﾞˎ;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import t.ˆʿ.CLS33;

public final class CLS149 extends TextView {
    public boolean FLD982;
    public final Context FLD983;
    public int FLD984;
    public int FLD985;
    public final GradientDrawable FLD986;
    public int FLD987;
    public boolean FLD988;
    public int FLD989;

    public CLS149(Context context0) {
        super(context0, null, 0);
        this.FLD986 = new GradientDrawable();
        this.FLD983 = context0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, CLS33.FLD458);
        this.FLD985 = typedArray0.getColor(0, 0);
        this.FLD987 = typedArray0.getDimensionPixelSize(1, 0);
        this.FLD984 = typedArray0.getDimensionPixelSize(5, 0);
        this.FLD989 = typedArray0.getColor(4, 0);
        this.FLD988 = typedArray0.getBoolean(2, false);
        this.FLD982 = typedArray0.getBoolean(3, false);
        typedArray0.recycle();
    }

    @Override  // android.widget.TextView
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(this.FLD988) {
            this.setCornerRadius(this.getHeight() / 2);
            return;
        }
        this.MTH2200();
    }

    @Override  // android.widget.TextView
    public final void onMeasure(int v, int v1) {
        if(this.FLD982 && this.getWidth() > 0 && this.getHeight() > 0) {
            int v2 = View.MeasureSpec.makeMeasureSpec(Math.max(this.getWidth(), this.getHeight()), 0x40000000);
            super.onMeasure(v2, v2);
            return;
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        this.FLD985 = v;
        this.MTH2200();
    }

    public void setCornerRadius(int v) {
        this.FLD987 = (int)(((float)v) * this.FLD983.getResources().getDisplayMetrics().density + 0.5f);
        this.MTH2200();
    }

    public void setIsRadiusHalfHeight(boolean z) {
        this.FLD988 = z;
        this.MTH2200();
    }

    public void setStrokeWidth(int v) {
        this.FLD984 = (int)(((float)v) * this.FLD983.getResources().getDisplayMetrics().density + 0.5f);
        this.MTH2200();
    }

    public final void MTH2200() {
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        int v = this.FLD989;
        this.FLD986.setColor(this.FLD985);
        this.FLD986.setCornerRadius(((float)this.FLD987));
        this.FLD986.setStroke(this.FLD984, v);
        stateListDrawable0.addState(new int[]{0xFEFEFF59}, this.FLD986);
        if(Build.VERSION.SDK_INT >= 16) {
            this.setBackground(stateListDrawable0);
            return;
        }
        this.setBackgroundDrawable(stateListDrawable0);
    }
}

