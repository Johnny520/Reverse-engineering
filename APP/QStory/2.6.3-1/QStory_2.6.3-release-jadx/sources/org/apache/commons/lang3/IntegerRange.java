package org.apache.commons.lang3;

import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class IntegerRange extends NumberRange<Integer> {
    private static final long serialVersionUID = 1;

    private IntegerRange(Integer num, Integer num2) {
        super(num, num2, null);
    }

    /* JADX INFO: renamed from: of */
    public static IntegerRange m533of(int i, int i2) {
        return m534of(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntStream toIntStream() {
        return IntStream.rangeClosed(((Integer) getMinimum()).intValue(), ((Integer) getMaximum()).intValue());
    }

    /* JADX INFO: renamed from: of */
    public static IntegerRange m534of(Integer num, Integer num2) {
        return new IntegerRange(num, num2);
    }
}
