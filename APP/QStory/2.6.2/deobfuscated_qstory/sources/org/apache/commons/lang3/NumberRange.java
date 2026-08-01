package org.apache.commons.lang3;

import java.lang.Number;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class NumberRange<N extends Number> extends Range<N> {
    private static final long serialVersionUID = 1;

    public NumberRange(N n, N n2, Comparator<N> comparator) {
        super(n, n2, comparator);
    }
}
