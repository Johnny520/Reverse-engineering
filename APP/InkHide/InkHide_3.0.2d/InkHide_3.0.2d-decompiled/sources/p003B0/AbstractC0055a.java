package p003B0;

import android.util.TypedValue;
import java.util.HashMap;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;

/* JADX INFO: renamed from: B0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0055a {

    /* JADX INFO: renamed from: a */
    public static final HashMap f298a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashMap f299b = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final float m100a(float f) {
        HashMap map = f299b;
        Float f2 = (Float) map.get(String.valueOf(f));
        if (f2 != null) {
            return f2.floatValue();
        }
        float fApplyDimension = TypedValue.applyDimension(1, f, AbstractC0503h.m991x().getResources().getDisplayMetrics());
        map.put(String.valueOf(f), Float.valueOf(fApplyDimension));
        return fApplyDimension;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final int m101b(int i2) {
        HashMap map = f298a;
        Integer num = (Integer) map.get(String.valueOf(i2));
        if (num != null) {
            return num.intValue();
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, i2, AbstractC0503h.m991x().getResources().getDisplayMetrics());
        map.put(String.valueOf(i2), Integer.valueOf(iApplyDimension));
        return iApplyDimension;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final Class m102c(String str) {
        ClassLoader classLoader = AbstractC0503h.m991x().getClassLoader();
        AbstractC0223g.m418e(classLoader, "classLoader");
        return AbstractC0514f.f1622b.mo1021l(classLoader, str);
    }
}
