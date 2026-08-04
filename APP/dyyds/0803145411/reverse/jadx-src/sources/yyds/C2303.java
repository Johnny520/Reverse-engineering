package yyds;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲁᛸᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2303 implements Map.Entry, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f11308;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0728 f11309;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f11310;

    public C2303(C0728 c0728, int i) {
        this.f11309 = c0728;
        this.f11310 = i;
        this.f11308 = c0728.f3405;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC1544.m3188(entry.getKey(), getKey()) && AbstractC1544.m3188(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m4318();
        return this.f11309.f3406[this.f11310];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m4318();
        return this.f11309.f3408[this.f11310];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m4318();
        C0728 c0728 = this.f11309;
        c0728.m1672();
        Object[] objArr = c0728.f3408;
        if (objArr == null) {
            int length = c0728.f3406.length;
            if (length < 0) {
                C0188.m798("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            c0728.f3408 = objArr;
        }
        int i = this.f11310;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4318() {
        if (this.f11309.f3405 != this.f11308) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }
}
