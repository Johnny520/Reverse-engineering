package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Ow */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0641Ow extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f2049a = 0.0d;

    static {
        f2049a = Math.cos(Math.toRadians(45.0d));
    }

    /* JADX INFO: renamed from: a */
    public static float m1263a(float r6, float r7, boolean r8) {
        if (r8 == true) goto L4;
        return r6;
    L4:
        return (float) (((1.0d - f2049a) * ((double) r7)) + r6);
    }

    /* JADX INFO: renamed from: b */
    public static float m1264b(float r6, float r7, boolean r8) {
        if (r8 == false) goto L7;
        return (float) (((1.0d - f2049a) * ((double) r7)) + (r6 * 1.5f));
    L7:
        return r6 * 1.5f;
    }
}
