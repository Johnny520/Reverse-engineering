package org.apache.commons.lang3;

import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class IntegerRange extends NumberRange<Integer> {
    private static final long serialVersionUID = 1;

    private IntegerRange(Integer num, Integer num2) {
        super(num, num2, null);
    }

    public static IntegerRange of(int i, int i2) {
        return of(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntStream toIntStream() {
        return IntStream.rangeClosed(((Integer) getMinimum()).intValue(), ((Integer) getMaximum()).intValue());
    }

    public static IntegerRange of(Integer num, Integer num2) {
        return new IntegerRange(num, num2);
    }
}
