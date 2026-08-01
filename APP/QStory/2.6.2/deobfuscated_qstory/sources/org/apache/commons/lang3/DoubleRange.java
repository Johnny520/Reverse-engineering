package org.apache.commons.lang3;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class DoubleRange extends NumberRange<Double> {
    private static final long serialVersionUID = 1;

    private DoubleRange(Double d, Double d2) {
        super(d, d2, null);
    }

    public static DoubleRange of(double d, double d2) {
        return of(Double.valueOf(d), Double.valueOf(d2));
    }

    public static DoubleRange of(Double d, Double d2) {
        return new DoubleRange(d, d2);
    }
}
