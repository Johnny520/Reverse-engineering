package p069i;

import android.widget.TextView;

/* JADX INFO: renamed from: i.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0660a0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m1273a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1274b(TextView textView, int i2, int i3, int i4, int i5) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1275c(TextView textView, int[] iArr, int i2) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m1276d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
