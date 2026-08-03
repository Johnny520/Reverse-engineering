package p063j;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0964i implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f3421a;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0956a f3424d;

    /* JADX INFO: renamed from: c */
    public boolean f3423c = false;

    /* JADX INFO: renamed from: b */
    public int f3422b = -1;

    public C0964i(C0956a c0956a) {
        this.f3424d = c0956a;
        this.f3421a = c0956a.m2292d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f3423c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f3422b;
        C0956a c0956a = this.f3424d;
        Object objM2290b = c0956a.m2290b(i2, 0);
        if (key != objM2290b && (key == null || !key.equals(objM2290b))) {
            return false;
        }
        Object value = entry.getValue();
        Object objM2290b2 = c0956a.m2290b(this.f3422b, 1);
        return value == objM2290b2 || (value != null && value.equals(objM2290b2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f3423c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f3424d.m2290b(this.f3422b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f3423c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f3424d.m2290b(this.f3422b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3422b < this.f3421a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f3423c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f3422b;
        C0956a c0956a = this.f3424d;
        Object objM2290b = c0956a.m2290b(i2, 0);
        Object objM2290b2 = c0956a.m2290b(this.f3422b, 1);
        return (objM2290b == null ? 0 : objM2290b.hashCode()) ^ (objM2290b2 != null ? objM2290b2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3422b++;
        this.f3423c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3423c) {
            throw new IllegalStateException();
        }
        this.f3424d.m2296h(this.f3422b);
        this.f3422b--;
        this.f3421a--;
        this.f3423c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f3423c) {
            return this.f3424d.m2297i(this.f3422b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
