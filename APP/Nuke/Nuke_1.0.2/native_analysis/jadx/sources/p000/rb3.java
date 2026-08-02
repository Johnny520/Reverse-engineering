package p000;

import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rb3 {
    /* JADX INFO: renamed from: a */
    public static final long m4426a(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = m33.f6465c;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: b */
    public static final ia1 m4427b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            ia1 ia1Var = tag instanceof ia1 ? (ia1) tag : null;
            if (ia1Var != null) {
                return ia1Var;
            }
            Object objM3845b = pb3.m3845b(view);
            view = objM3845b instanceof View ? (View) objM3845b : null;
        }
        return null;
    }
}
