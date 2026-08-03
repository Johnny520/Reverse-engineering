package p057g;

import android.widget.TextView;

/* JADX INFO: renamed from: g.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0856E {
    /* JADX INFO: renamed from: a */
    public static int m2168a(TextView r02) {
        return r02.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m2169b(TextView r02, int r1, int r2, int r3, int r4) {
        r02.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: c */
    public static void m2170c(TextView r02, int[] r1, int r2) {
        r02.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2171d(TextView r02, String r1) {
        return r02.setFontVariationSettings(r1);
    }
}
