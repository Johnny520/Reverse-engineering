package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.builder.C5639;
import p373.InterfaceC8975;
import p373.InterfaceC8976;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Pair<L, R> implements Map.Entry<L, R>, Comparable<Pair<L, R>>, Serializable {
    public static final Pair<?, ?>[] EMPTY_ARRAY = new Pair[0];
    private static final long serialVersionUID = 4954918890077093841L;

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> Pair<L, R>[] emptyArray() {
        return (Pair<L, R>[]) EMPTY_ARRAY;
    }

    public static <L, R> Pair<L, R> of(L l, R r) {
        return ImmutablePair.of((Object) l, (Object) r);
    }

    public static <L, R> Pair<L, R> ofNonNull(L l, R r) {
        return ImmutablePair.ofNonNull((Object) l, (Object) r);
    }

    public <E extends Throwable> void accept(InterfaceC8976 interfaceC8976) {
        interfaceC8976.accept(getKey(), getValue());
    }

    public <V, E extends Throwable> V apply(InterfaceC8975 interfaceC8975) {
        getKey();
        getValue();
        return (V) interfaceC8975.apply();
    }

    @Override // java.lang.Comparable
    public int compareTo(Pair<L, R> pair) {
        C5639 c5639 = new C5639();
        c5639.m11027(getLeft(), pair.getLeft());
        c5639.m11027(getRight(), pair.getRight());
        return c5639.f15521;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return getLeft();
    }

    public abstract L getLeft();

    public abstract R getRight();

    @Override // java.util.Map.Entry
    public R getValue() {
        return getRight();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hashCode(getValue()) ^ Objects.hashCode(getKey());
    }

    public String toString() {
        return "(" + getLeft() + ',' + getRight() + ')';
    }

    public static <L, R> Pair<L, R> of(Map.Entry<L, R> entry) {
        return ImmutablePair.of((Map.Entry) entry);
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getRight());
    }
}
