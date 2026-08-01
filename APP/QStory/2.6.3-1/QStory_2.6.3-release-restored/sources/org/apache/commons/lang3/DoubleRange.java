package org.apache.commons.lang3;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class DoubleRange extends NumberRange<Double> {
    private static final long serialVersionUID = 1;

    private DoubleRange(Double d, Double d2) {
        super(d, d2, null);
    }

    /* JADX INFO: renamed from: of */
    public static DoubleRange m531of(double d, double d2) {
        return m532of(Double.valueOf(d), Double.valueOf(d2));
    }

    /* JADX INFO: renamed from: of */
    public static DoubleRange m532of(Double d, Double d2) {
        return new DoubleRange(d, d2);
    }
}
