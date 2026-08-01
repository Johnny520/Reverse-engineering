package org.apache.commons.lang3.tuple;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ImmutableTriple<L, M, R> extends Triple<L, M, R> {
    public static final ImmutableTriple<?, ?, ?>[] EMPTY_ARRAY = new ImmutableTriple[0];
    private static final ImmutableTriple NULL = new ImmutableTriple(null, null, null);
    private static final long serialVersionUID = 1;
    public final L left;
    public final M middle;
    public final R right;

    public ImmutableTriple(L l, M m, R r) {
        this.left = l;
        this.middle = m;
        this.right = r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, M, R> ImmutableTriple<L, M, R>[] emptyArray() {
        return (ImmutableTriple<L, M, R>[]) EMPTY_ARRAY;
    }

    public static <L, M, R> ImmutableTriple<L, M, R> nullTriple() {
        return NULL;
    }

    /* JADX INFO: renamed from: of */
    public static <L, M, R> ImmutableTriple<L, M, R> m543of(L l, M m, R r) {
        return ((m != null) || (l != null) || r != null) ? new ImmutableTriple<>(l, m, r) : nullTriple();
    }

    public static <L, M, R> ImmutableTriple<L, M, R> ofNonNull(L l, M m, R r) {
        Objects.requireNonNull(l, "left");
        Objects.requireNonNull(m, "middle");
        Objects.requireNonNull(r, "right");
        return m543of((Object) l, (Object) m, (Object) r);
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public L getLeft() {
        return this.left;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public M getMiddle() {
        return this.middle;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public R getRight() {
        return this.right;
    }
}
