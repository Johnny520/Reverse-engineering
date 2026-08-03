package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: mq */
/* JADX INFO: loaded from: classes.dex */
public final class C2246mq implements Map.Entry, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final C2332oq f7945a;

    /* JADX INFO: renamed from: b */
    public final int f7946b;

    /* JADX INFO: renamed from: c */
    public final int f7947c;

    public C2246mq(C2332oq c2332oq, int i) {
        this.f7945a = c2332oq;
        this.f7946b = i;
        this.f7947c = c2332oq.f8188h;
    }

    /* JADX INFO: renamed from: a */
    public final void m4581a() {
        if (this.f7945a.f8188h != this.f7947c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC0585Nj.m1134a(entry.getKey(), getKey()) && AbstractC0585Nj.m1134a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m4581a();
        return this.f7945a.f8181a[this.f7946b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m4581a();
        return this.f7945a.f8182b[this.f7946b];
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
        m4581a();
        C2332oq c2332oq = this.f7945a;
        c2332oq.m4729b();
        Object[] objArr = c2332oq.f8182b;
        if (objArr == null) {
            int length = c2332oq.f8181a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c2332oq.f8182b = objArr;
        }
        int i = this.f7946b;
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
