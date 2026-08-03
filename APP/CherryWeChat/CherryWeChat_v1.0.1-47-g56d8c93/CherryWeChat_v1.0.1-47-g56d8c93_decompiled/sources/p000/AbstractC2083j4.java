package p000;

import android.widget.TextView;

/* JADX INFO: renamed from: j4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2083j4 {
    /* JADX INFO: renamed from: a */
    public static int m4249a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m4250b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static void m4251c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4252d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
