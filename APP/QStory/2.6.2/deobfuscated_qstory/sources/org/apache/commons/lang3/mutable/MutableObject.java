package org.apache.commons.lang3.mutable;

import java.io.Serializable;
import java.util.Objects;
import p369.InterfaceC8961;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class MutableObject<T> implements InterfaceC8961, Serializable {
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

    @Override // p369.InterfaceC8961
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
