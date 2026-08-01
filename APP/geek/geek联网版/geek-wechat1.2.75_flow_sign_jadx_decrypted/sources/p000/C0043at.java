package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: at */
/* JADX INFO: loaded from: classes.dex */
public final class C0043at implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f631a;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0474m6 f634d;

    /* JADX INFO: renamed from: c */
    public boolean f633c = false;

    /* JADX INFO: renamed from: b */
    public int f632b = -1;

    public C0043at(C0474m6 c0474m6) {
        this.f634d = c0474m6;
        this.f631a = c0474m6.m1811d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f633c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f632b;
        C0474m6 c0474m6 = this.f634d;
        Object objM1809b = c0474m6.m1809b(i, 0);
        if (key != objM1809b && (key == null || !key.equals(objM1809b))) {
            return false;
        }
        Object value = entry.getValue();
        Object objM1809b2 = c0474m6.m1809b(this.f632b, 1);
        return value == objM1809b2 || (value != null && value.equals(objM1809b2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f633c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f634d.m1809b(this.f632b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f633c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f634d.m1809b(this.f632b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f632b < this.f631a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f633c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f632b;
        C0474m6 c0474m6 = this.f634d;
        Object objM1809b = c0474m6.m1809b(i, 0);
        Object objM1809b2 = c0474m6.m1809b(this.f632b, 1);
        return (objM1809b == null ? 0 : objM1809b.hashCode()) ^ (objM1809b2 != null ? objM1809b2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f632b++;
        this.f633c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f633c) {
            throw new IllegalStateException();
        }
        this.f634d.m1814g(this.f632b);
        this.f632b--;
        this.f631a--;
        this.f633c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f633c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f632b;
        C0474m6 c0474m6 = this.f634d;
        switch (c0474m6.f3079d) {
            case Base64.DEFAULT /* 0 */:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((C0511n6) c0474m6.f3080e).f680b;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
