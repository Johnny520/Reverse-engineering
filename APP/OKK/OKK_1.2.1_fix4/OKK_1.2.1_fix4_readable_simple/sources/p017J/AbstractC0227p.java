package p017J;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: renamed from: J.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0227p {
    /* JADX INFO: renamed from: a */
    public static CharSequence m625a(PrecomputedText r02) {
        return r02;
    }

    /* JADX INFO: renamed from: b */
    public static String[] m626b(DecimalFormatSymbols r02) {
        return r02.getDigitStrings();
    }

    /* JADX INFO: renamed from: c */
    public static PrecomputedText.Params m627c(TextView r02) {
        return r02.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: d */
    public static void m628d(TextView r02, int r1) {
        r02.setFirstBaselineToTopHeight(r1);
    }
}
