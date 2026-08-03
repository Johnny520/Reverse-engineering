package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Ow */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0641Ow extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f2049a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m1263a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f2049a) * ((double) f2)) + ((double) f));
    }

    /* JADX INFO: renamed from: b */
    public static float m1264b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f2049a) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}
