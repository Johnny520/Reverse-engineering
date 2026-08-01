package p006D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* JADX INFO: renamed from: D.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0088q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m228a(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static ColorStateList m229b(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m230c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m231d(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m232e(TextView textView, int i2) {
        textView.setBreakStrategy(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m233f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m234g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m235h(TextView textView, int i2) {
        textView.setHyphenationFrequency(i2);
    }
}
