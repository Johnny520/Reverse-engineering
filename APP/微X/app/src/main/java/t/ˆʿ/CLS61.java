// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SeekBar;

public final class CLS61 {
    public static void MTH1500(SeekBar seekBar0, ColorStateList colorStateList0) {
        seekBar0.setProgressTintList(colorStateList0);
    }

    public static void MTH1501(ViewGroup viewGroup0) {
        viewGroup0.setElevation(0.0f);
    }

    public static int MTH1503(Window window0) {
        return window0.getStatusBarColor();
    }

    public static void MTH1504(View view0) {
        view0.setElevation(5.0f);
    }

    public static void MTH1505(RippleDrawable rippleDrawable0, float f, float f1) {
        rippleDrawable0.setHotspot(f, f1);
    }

    public static void MTH1507(Outline outline0, int v, int v1) {
        outline0.setOval(0, 0, v, v1);
    }

    public static void MTH1508(RippleDrawable rippleDrawable0) {
        rippleDrawable0.setVisible(true, true);
    }

    public static void MTH1509(View view0) {
        view0.setElevation(1.0f);
    }

    public static void MTH1510(RippleDrawable rippleDrawable0, int[] arr_v) {
        rippleDrawable0.setState(arr_v);
    }
}

