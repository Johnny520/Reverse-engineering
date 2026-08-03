package p000a;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p000a.C0437Y3;

/* JADX INFO: renamed from: a.Na */
/* JADX INFO: loaded from: classes.dex */
public final class C0247Na {
    /* JADX INFO: renamed from: a */
    public static int m683a(Context context, int i, int i2) {
        Integer numValueOf;
        TypedValue typedValueM2244a = C0955za.m2244a(context, i);
        if (typedValueM2244a != null) {
            int i3 = typedValueM2244a.resourceId;
            numValueOf = Integer.valueOf(i3 != 0 ? C0437Y3.b.m1095a(context, i3) : typedValueM2244a.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m684b(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueM2246c = C0955za.m2246c(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = typedValueM2246c.resourceId;
        return i2 != 0 ? C0437Y3.b.m1095a(context, i2) : typedValueM2246c.data;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m685c(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal<double[]> threadLocal = C0872v3.f3417a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    /* JADX INFO: renamed from: d */
    public static int m686d(int i, int i2, float f) {
        return C0872v3.m2084b(C0872v3.m2086d(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
