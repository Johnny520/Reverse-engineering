package org.apache.commons.lang3.mutable;

import java.io.Serializable;
import java.util.Objects;
import p385.InterfaceC9786;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class MutableObject<T> implements InterfaceC9786, Serializable {
    private static final long serialVersionUID = 86241875189L;
    private T value;

    public MutableObject(T t) {
        this.value = t;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return Objects.equals(this.value, ((MutableObject) obj).value);
        }
        return false;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return getValue();
    }

    @Override // p385.InterfaceC9786
    @Deprecated
    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    public void setValue(T t) {
        this.value = t;
    }

    public String toString() {
        return Objects.toString(this.value);
    }

    public MutableObject() {
    }
}
