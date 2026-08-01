package org.apache.commons.lang3.builder;

import java.lang.reflect.Type;
import java.util.Objects;
import org.apache.commons.lang3.AbstractC6522;
import org.apache.commons.lang3.ObjectUtils$Null;
import org.apache.commons.lang3.tuple.Pair;
import p384.AbstractC9785;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Diff<T> extends Pair<T, T> {
    private static final long serialVersionUID = 1;
    private final String fieldName;
    private final Type type;

    public Diff(String str) {
        Objects.requireNonNull(str);
        this.fieldName = str;
        Class cls = (Type) AbstractC9785.m15126(getClass(), Diff.class, null).get(Diff.class.getTypeParameters()[0]);
        ObjectUtils$Null objectUtils$Null = AbstractC6522.f15970;
        this.type = cls == null ? Object.class : cls;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    @Deprecated
    public final Type getType() {
        return this.type;
    }

    @Override // java.util.Map.Entry
    public final T setValue(T t) {
        throw new UnsupportedOperationException("Cannot alter Diff object.");
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public final String toString() {
        return String.format("[%s: %s, %s]", this.fieldName, getLeft(), getRight());
    }

    public Diff(String str, Type type) {
        Objects.requireNonNull(str);
        this.fieldName = str;
        Objects.requireNonNull(type);
        this.type = type;
    }
}
