package p017J;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: renamed from: J.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0227p {
    /* JADX INFO: renamed from: a */
    public static CharSequence m625a(PrecomputedText precomputedText) {
        return precomputedText;
    }

    /* JADX INFO: renamed from: b */
    public static String[] m626b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: c */
    public static PrecomputedText.Params m627c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: d */
    public static void m628d(TextView textView, int i2) {
        textView.setFirstBaselineToTopHeight(i2);
    }
}
