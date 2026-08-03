package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: K4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0435K4 implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f1427a;

    /* JADX INFO: renamed from: b */
    public int f1428b;

    /* JADX INFO: renamed from: c */
    public boolean f1429c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0521M4 f1430d;

    public C0435K4(C0521M4 r1) {
        this.f1430d = r1;
        this.f1427a = r1.f8818c - 1;
        this.f1428b = -1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r4) {
        if (this.f1429c == false) goto L16;
        if ((r4 instanceof Map.Entry) == false) goto L18;
        Map.Entry r42 = (Map.Entry) r4;
        Object r0 = r42.getKey();
        int r1 = this.f1428b;
        C0521M4 r2 = this.f1430d;
        if (AbstractC0585Nj.m1134a(r0, r2.m5002f(r1)) == true) goto L10;
        return false;
    L10:
        if (AbstractC0585Nj.m1134a(r42.getValue(), r2.m5003j(this.f1428b)) == false) goto L17;
        return true;
    L17:
        return false;
    L18:
        return false;
    L16:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f1429c == false) goto L7;
        return this.f1430d.m5002f(this.f1428b);
    L7:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f1429c == false) goto L7;
        return this.f1430d.m5003j(this.f1428b);
    L7:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1428b >= this.f1427a) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (this.f1429c == false) goto L14;
        int r0 = this.f1428b;
        C0521M4 r1 = this.f1430d;
        Object r02 = r1.m5002f(r0);
        Object r12 = r1.m5003j(this.f1428b);
        int r2 = 0;
        if (r02 != null) goto L7;
        int r03 = 0;
    L8:
        if (r12 == null) goto L12;
        r2 = r12.hashCode();
    L12:
        return r03 ^ r2;
    L7:
        r03 = r02.hashCode();
        goto L8
    L14:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        this.f1428b++;
        this.f1429c = true;
        return this;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f1429c == false) goto L7;
        this.f1430d.mo4h(this.f1428b);
        this.f1428b--;
        this.f1427a--;
        this.f1429c = false;
        return;
    L7:
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r3) {
        if (this.f1429c == false) goto L7;
        return this.f1430d.mo5i(this.f1428b, r3);
    L7:
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
