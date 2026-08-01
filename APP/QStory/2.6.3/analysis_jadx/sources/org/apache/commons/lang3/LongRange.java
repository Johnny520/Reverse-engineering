package org.apache.commons.lang3;

import java.util.stream.LongStream;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class LongRange extends NumberRange<Long> {
    private static final long serialVersionUID = 1;

    private LongRange(Long l, Long l2) {
        super(l, l2, null);
    }

    public static LongRange of(long j, long j2) {
        return of(Long.valueOf(j), Long.valueOf(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LongStream toLongStream() {
        return LongStream.rangeClosed(((Long) getMinimum()).longValue(), ((Long) getMaximum()).longValue());
    }

    public static LongRange of(Long l, Long l2) {
        return new LongRange(l, l2);
    }
}
