package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: v6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2615v6 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f9068a = 0;

    /* JADX INFO: renamed from: b */
    public final int f9069b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2701x6 f9070c;

    public C2615v6(C2701x6 c2701x6) {
        this.f9070c = c2701x6;
        this.f9069b = c2701x6.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9068a < this.f9069b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9068a;
        if (i >= this.f9069b) {
            throw new NoSuchElementException();
        }
        this.f9068a = i + 1;
        return Byte.valueOf(this.f9070c.mo5223j(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
