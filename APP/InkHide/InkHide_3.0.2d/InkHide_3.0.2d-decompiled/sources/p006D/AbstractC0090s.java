package p006D;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: renamed from: D.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0090s {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String[] m238b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static PrecomputedText.Params m239c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m240d(TextView textView, int i2) {
        textView.setFirstBaselineToTopHeight(i2);
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m237a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
