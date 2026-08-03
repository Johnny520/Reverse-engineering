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
    public int f1428b = -1;

    /* JADX INFO: renamed from: c */
    public boolean f1429c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0521M4 f1430d;

    public C0435K4(C0521M4 c0521m4) {
        this.f1430d = c0521m4;
        this.f1427a = c0521m4.f8818c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f1429c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f1428b;
        C0521M4 c0521m4 = this.f1430d;
        return AbstractC0585Nj.m1134a(key, c0521m4.m5002f(i)) && AbstractC0585Nj.m1134a(entry.getValue(), c0521m4.m5003j(this.f1428b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f1429c) {
            return this.f1430d.m5002f(this.f1428b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f1429c) {
            return this.f1430d.m5003j(this.f1428b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1428b < this.f1427a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f1429c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f1428b;
        C0521M4 c0521m4 = this.f1430d;
        Object objM5002f = c0521m4.m5002f(i);
        Object objM5003j = c0521m4.m5003j(this.f1428b);
        return (objM5002f == null ? 0 : objM5002f.hashCode()) ^ (objM5003j != null ? objM5003j.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1428b++;
        this.f1429c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1429c) {
            throw new IllegalStateException();
        }
        this.f1430d.mo4h(this.f1428b);
        this.f1428b--;
        this.f1427a--;
        this.f1429c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f1429c) {
            return this.f1430d.mo5i(this.f1428b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
