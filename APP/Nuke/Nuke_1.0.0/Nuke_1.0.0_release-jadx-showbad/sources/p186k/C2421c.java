package p186k;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: k.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2421c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: d */
    public int f7830d;

    /* JADX INFO: renamed from: e */
    public int f7831e = -1;

    /* JADX INFO: renamed from: f */
    public boolean f7832f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2423e f7833g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2421c(C2423e c2423e) {
        this.f7833g = c2423e;
        this.f7830d = c2423e.f7820f - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f7832f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i5 = this.f7831e;
        C2423e c2423e = this.f7833g;
        return AbstractC1665j.m2981a(key, c2423e.m4304f(i5)) && AbstractC1665j.m2981a(entry.getValue(), c2423e.m4308j(this.f7831e));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f7832f) {
            return this.f7833g.m4304f(this.f7831e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f7832f) {
            return this.f7833g.m4308j(this.f7831e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7831e < this.f7830d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f7832f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i5 = this.f7831e;
        C2423e c2423e = this.f7833g;
        Object objM4304f = c2423e.m4304f(i5);
        Object objM4308j = c2423e.m4308j(this.f7831e);
        return (objM4304f == null ? 0 : objM4304f.hashCode()) ^ (objM4308j != null ? objM4308j.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7831e++;
        this.f7832f = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f7832f) {
            throw new IllegalStateException();
        }
        this.f7833g.mo4306h(this.f7831e);
        this.f7831e--;
        this.f7830d--;
        this.f7832f = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f7832f) {
            return this.f7833g.mo4307i(this.f7831e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
