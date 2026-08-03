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

    public C2246mq(C2332oq r1, int r2) {
        this.f7945a = r1;
        this.f7946b = r2;
        this.f7947c = r1.f8188h;
    }

    /* JADX INFO: renamed from: a */
    public final void m4581a() {
        if (this.f7945a.f8188h != this.f7947c) goto L6;
        return;
    L6:
        throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r3) {
        if ((r3 instanceof Map.Entry) == false) goto L10;
        Map.Entry r32 = (Map.Entry) r3;
        if (AbstractC0585Nj.m1134a(r32.getKey(), getKey()) == true) goto L7;
        return false;
    L7:
        if (AbstractC0585Nj.m1134a(r32.getValue(), getValue()) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
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
        Object r0 = getKey();
        int r1 = 0;
        if (r0 == null) goto L5;
        int r02 = r0.hashCode();
    L6:
        Object r2 = getValue();
        if (r2 == null) goto L10;
        r1 = r2.hashCode();
    L10:
        return r02 ^ r1;
    L5:
        r02 = 0;
        goto L6
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r4) {
        m4581a();
        C2332oq r0 = this.f7945a;
        r0.m4729b();
        Object[] r1 = r0.f8182b;
        if (r1 != null) goto L8;
        int r12 = r0.f8181a.length;
        if (r12 < 0) goto L11;
        r1 = new Object[r12];
        r0.f8182b = r1;
        goto L8
    L11:
        throw new IllegalArgumentException("capacity must be non-negative.");
    L8:
        int r02 = this.f7946b;
        Object r2 = r1[r02];
        r1[r02] = r4;
        return r2;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(getKey());
        r0.append('=');
        r0.append(getValue());
        return r0.toString();
    }
}
