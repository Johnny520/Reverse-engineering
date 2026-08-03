package p085v;

import android.graphics.Color;

/* JADX INFO: renamed from: v.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1100a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4247a = 0;

    static {
        new ThreadLocal();
    }

    /* JADX INFO: renamed from: a */
    public static int m2592a(double r17, double r19, double r21) {
        double r02 = (((-0.4986d) * r21) + (((-1.5372d) * r19) + (3.2406d * r17))) / 100.0d;
        double r4 = ((0.0415d * r21) + ((1.8758d * r19) + ((-0.9689d) * r17))) / 100.0d;
        double r6 = ((1.057d * r21) + (((-0.204d) * r19) + (0.0557d * r17))) / 100.0d;
        if (r02 <= 0.0031308d) goto L5;
        double r03 = (Math.pow(r02, 0.4166666666666667d) * 1.055d) - 0.055d;
    L7:
        if (r4 <= 0.0031308d) goto L9;
        double r42 = (Math.pow(r4, 0.4166666666666667d) * 1.055d) - 0.055d;
    L11:
        if (r6 <= 0.0031308d) goto L13;
        double r2 = (Math.pow(r6, 0.4166666666666667d) * 1.055d) - 0.055d;
    L14:
        int r04 = (int) Math.round(r03 * 255.0d);
        int r8 = 0;
        if (r04 >= 0) goto L17;
        int r05 = 0;
    L18:
        int r43 = (int) Math.round(r42 * 255.0d);
        if (r43 >= 0) goto L21;
        int r44 = 0;
    L22:
        int r22 = (int) Math.round(r2 * 255.0d);
        if (r22 < 0) goto L27;
        r8 = Math.min(r22, 255);
    L27:
        return Color.rgb(r05, r44, r8);
    L21:
        r44 = Math.min(r43, 255);
        goto L22
    L17:
        r05 = Math.min(r04, 255);
        goto L18
    L13:
        r2 = r6 * 12.92d;
        goto L14
    L9:
        r42 = r4 * 12.92d;
        goto L11
    L5:
        r03 = r02 * 12.92d;
        goto L7
    }

    /* JADX INFO: renamed from: b */
    public static int m2593b(int r6, int r7) {
        int r02 = Color.alpha(r7);
        int r1 = Color.alpha(r6);
        int r3 = 255 - r1;
        int r2 = 255 - ((r3 * (255 - r02)) / 255);
        return Color.argb(r2, m2594c(Color.red(r6), r1, Color.red(r7), r02, r2), m2594c(Color.green(r6), r1, Color.green(r7), r02, r2), m2594c(Color.blue(r6), r1, Color.blue(r7), r02, r2));
    }

    /* JADX INFO: renamed from: c */
    public static int m2594c(int r02, int r1, int r2, int r3, int r4) {
        if (r4 != 0) goto L5;
        return 0;
    L5:
        int r03 = (r02 * 255) * r1;
        int r12 = 255 - r1;
        return ((r12 * (r2 * r3)) + r03) / (r4 * 255);
    }

    /* JADX INFO: renamed from: d */
    public static int m2595d(int r1, int r2) {
        if (r2 < 0) goto L8;
        if (r2 > 255) goto L8;
        return (r1 & 16777215) | (r2 << 24);
    L8:
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
