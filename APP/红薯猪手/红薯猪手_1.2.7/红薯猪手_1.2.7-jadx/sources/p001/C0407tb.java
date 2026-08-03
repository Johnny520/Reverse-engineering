package p001;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: renamed from: ۟.tb */
/* JADX INFO: loaded from: classes.dex */
public final class C0407tb {
    /* JADX INFO: renamed from: ۥ */
    public static int m943(int i) {
        return Color.argb((i >> 24) & 255, (int) (((i >> 16) & 255) * 0.95f), (int) (((i >> 8) & 255) * 0.95f), (int) ((i & 255) * 0.95f));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static GradientDrawable m944(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        float f = i;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static GradientDrawable m1248(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(i);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static int m1249(float f) {
        return (int) C0167c4.m1038(1, f);
    }
}
