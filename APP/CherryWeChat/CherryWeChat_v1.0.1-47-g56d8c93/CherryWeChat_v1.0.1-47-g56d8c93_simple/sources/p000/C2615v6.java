package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: v6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2615v6 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f9068a;

    /* JADX INFO: renamed from: b */
    public final int f9069b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2701x6 f9070c;

    public C2615v6(C2701x6 r2) {
        this.f9070c = r2;
        this.f9068a = 0;
        this.f9069b = r2.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9068a >= this.f9069b) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.f9068a;
        if (r0 >= this.f9069b) goto L7;
        this.f9068a = r0 + 1;
        return Byte.valueOf(this.f9070c.mo5223j(r0));
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
