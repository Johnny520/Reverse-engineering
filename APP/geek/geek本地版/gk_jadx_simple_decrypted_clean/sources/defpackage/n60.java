package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class n60 {
    public static String[] a(DecimalFormatSymbols r0) {
        return r0.getDigitStrings();
    }

    public static PrecomputedText.Params b(TextView r0) {
        return r0.getTextMetricsParams();
    }

    public static void c(TextView r0, int r1) {
        r0.setFirstBaselineToTopHeight(r1);
    }
}
