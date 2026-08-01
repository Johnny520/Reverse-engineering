package org.apache.commons.lang3;

import java.lang.Number;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class NumberRange<N extends Number> extends Range<N> {
    private static final long serialVersionUID = 1;

    public NumberRange(N n, N n2, Comparator<N> comparator) {
        super(n, n2, comparator);
    }
}
