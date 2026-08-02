package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oe1 implements Map.Entry, r41 {

    /* JADX INFO: renamed from: h */
    public final pe1 f7644h;

    /* JADX INFO: renamed from: i */
    public final int f7645i;

    /* JADX INFO: renamed from: j */
    public final int f7646j;

    public oe1(pe1 pe1Var, int i) {
        pe1Var.getClass();
        this.f7644h = pe1Var;
        this.f7645i = i;
        this.f7646j = pe1Var.f8278o;
    }

    /* JADX INFO: renamed from: a */
    public final void m3560a() {
        if (this.f7644h.f8278o != this.f7646j) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return t11.m5086l(entry.getKey(), getKey()) && t11.m5086l(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m3560a();
        return this.f7644h.f8271h[this.f7645i];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m3560a();
        Object[] objArr = this.f7644h.f8272i;
        objArr.getClass();
        return objArr[this.f7645i];
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
        m3560a();
        pe1 pe1Var = this.f7644h;
        pe1Var.m3853c();
        Object[] objArr = pe1Var.f8272i;
        if (objArr == null) {
            int length = pe1Var.f8271h.length;
            if (length < 0) {
                C0676s.m4651j("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            pe1Var.f8272i = objArr;
        }
        int i = this.f7645i;
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
}
