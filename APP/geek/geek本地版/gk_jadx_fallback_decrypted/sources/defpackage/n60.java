package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class n60 {
    public static java.lang.String[] a(android.icu.text.DecimalFormatSymbols r0) {
            java.lang.String[] r0 = r0.getDigitStrings()
            return r0
    }

    public static android.text.PrecomputedText.Params b(android.widget.TextView r0) {
            android.text.PrecomputedText$Params r0 = r0.getTextMetricsParams()
            return r0
    }

    public static void c(android.widget.TextView r0, int r1) {
            r0.setFirstBaselineToTopHeight(r1)
            return
    }
}
