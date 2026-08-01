package p000;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class t60 {
    /* JADX INFO: renamed from: a */
    public static String[] m2400a(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: b */
    public static PrecomputedText.Params m2401b(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: c */
    public static void m2402c(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
