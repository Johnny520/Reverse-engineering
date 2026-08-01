package p000;

import android.widget.TextView;

/* JADX INFO: renamed from: b5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0056b5 {
    /* JADX INFO: renamed from: a */
    public static int m512a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m513b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static void m514c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m515d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
