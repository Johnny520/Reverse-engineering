package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import java.util.Objects;
import org.apache.commons.lang3.builder.C5639;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Triple<L, M, R> implements Comparable<Triple<L, M, R>>, Serializable {
    public static final Triple<?, ?, ?>[] EMPTY_ARRAY = new Triple[0];
    private static final long serialVersionUID = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, M, R> Triple<L, M, R>[] emptyArray() {
        return (Triple<L, M, R>[]) EMPTY_ARRAY;
    }

    public static <L, M, R> Triple<L, M, R> of(L l, M m, R r) {
        return ImmutableTriple.of((Object) l, (Object) m, (Object) r);
    }

    public static <L, M, R> Triple<L, M, R> ofNonNull(L l, M m, R r) {
        return ImmutableTriple.ofNonNull((Object) l, (Object) m, (Object) r);
    }

    @Override // java.lang.Comparable
    public int compareTo(Triple<L, M, R> triple) {
        C5639 c5639 = new C5639();
        c5639.m11027(getLeft(), triple.getLeft());
        c5639.m11027(getMiddle(), triple.getMiddle());
        c5639.m11027(getRight(), triple.getRight());
        return c5639.f15521;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Triple) {
            Triple triple = (Triple) obj;
            if (Objects.equals(getLeft(), triple.getLeft()) && Objects.equals(getMiddle(), triple.getMiddle()) && Objects.equals(getRight(), triple.getRight())) {
                return true;
            }
        }
        return false;
    }

    public abstract L getLeft();

    public abstract M getMiddle();

    public abstract R getRight();

    public int hashCode() {
        return Objects.hashCode(getRight()) ^ (Objects.hashCode(getLeft()) ^ Objects.hashCode(getMiddle()));
    }

    public String toString() {
        return "(" + getLeft() + "," + getMiddle() + "," + getRight() + ")";
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getMiddle(), getRight());
    }
}
