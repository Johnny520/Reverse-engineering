package org.apache.commons.lang3.mutable;

import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.AbstractC6515;
import p385.InterfaceC9786;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class MutableBoolean implements InterfaceC9786, Serializable, Comparable<MutableBoolean> {
    private static final long serialVersionUID = -4830728138360036487L;
    private boolean value;

    public MutableBoolean(Boolean bool) {
        this.value = bool.booleanValue();
    }

    public boolean booleanValue() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public int compareTo(MutableBoolean mutableBoolean) {
        boolean z = this.value;
        boolean z2 = mutableBoolean.value;
        List list = AbstractC6515.f15960;
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableBoolean) && this.value == ((MutableBoolean) obj).booleanValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return getValue();
    }

    @Override // p385.InterfaceC9786
    @Deprecated
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }

    public int hashCode() {
        return (this.value ? Boolean.TRUE : Boolean.FALSE).hashCode();
    }

    public boolean isFalse() {
        return !this.value;
    }

    public boolean isTrue() {
        return this.value;
    }

    public void setFalse() {
        this.value = false;
    }

    public void setTrue() {
        this.value = true;
    }

    public void setValue(Boolean bool) {
        this.value = bool.booleanValue();
    }

    public Boolean toBoolean() {
        return Boolean.valueOf(booleanValue());
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public void setValue(boolean z) {
        this.value = z;
    }

    public MutableBoolean(boolean z) {
        this.value = z;
    }

    public MutableBoolean() {
    }
}
