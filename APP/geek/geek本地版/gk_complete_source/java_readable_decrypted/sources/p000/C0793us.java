package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: us */
/* JADX INFO: loaded from: classes.dex */
public final class C0793us implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: a */
    public int f4756a;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0474m6 f4759d;

    /* JADX INFO: renamed from: c */
    public boolean f4758c = false;

    /* JADX INFO: renamed from: b */
    public int f4757b = -1;

    public C0793us(C0474m6 c0474m6) {
        this.f4759d = c0474m6;
        this.f4756a = c0474m6.m1789d() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f4758c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f4757b;
        C0474m6 c0474m6 = this.f4759d;
        Object objM1787b = c0474m6.m1787b(i, 0);
        if (key != objM1787b && (key == null || !key.equals(objM1787b))) {
            return false;
        }
        Object value = entry.getValue();
        Object objM1787b2 = c0474m6.m1787b(this.f4757b, 1);
        return value == objM1787b2 || (value != null && value.equals(objM1787b2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f4758c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f4759d.m1787b(this.f4757b, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f4758c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f4759d.m1787b(this.f4757b, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4757b < this.f4756a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f4758c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f4757b;
        C0474m6 c0474m6 = this.f4759d;
        Object objM1787b = c0474m6.m1787b(i, 0);
        Object objM1787b2 = c0474m6.m1787b(this.f4757b, 1);
        return (objM1787b == null ? 0 : objM1787b.hashCode()) ^ (objM1787b2 != null ? objM1787b2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4757b++;
        this.f4758c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4758c) {
            throw new IllegalStateException();
        }
        this.f4759d.m1792g(this.f4757b);
        this.f4757b--;
        this.f4756a--;
        this.f4758c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f4758c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f4757b;
        C0474m6 c0474m6 = this.f4759d;
        switch (c0474m6.f3149d) {
            case Base64.DEFAULT /* 0 */:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((C0511n6) c0474m6.f3150e).f4661b;
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
