package p000;

import android.widget.TextView;

/* JADX INFO: renamed from: j4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2083j4 {
    /* JADX INFO: renamed from: a */
    public static int m4249a(TextView r0) {
        return r0.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m4250b(TextView r0, int r1, int r2, int r3, int r4) {
        r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: c */
    public static void m4251c(TextView r0, int[] r1, int r2) {
        r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4252d(TextView r0, String r1) {
        return r0.setFontVariationSettings(r1);
    }
}
