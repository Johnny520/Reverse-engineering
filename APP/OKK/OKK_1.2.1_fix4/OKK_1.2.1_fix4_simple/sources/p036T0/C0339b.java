package p036T0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: T0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0339b implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final int f660a;

    /* JADX INFO: renamed from: b */
    public final int f661b;

    /* JADX INFO: renamed from: c */
    public boolean f662c;

    /* JADX INFO: renamed from: d */
    public int f663d;

    public C0339b(int r3, int r4, int r5) {
        this.f660a = r5;
        this.f661b = r4;
        boolean r02 = false;
        if (r5 <= 0) goto L6;
        if (r3 > r4) goto L8;
    L5:
        r02 = true;
    L8:
        this.f662c = r02;
        if (r02 == true) goto L12;
        r3 = r4;
    L12:
        this.f663d = r3;
        return;
    L6:
        if (r3 < r4) goto L8;
        goto L8
    }

    /* JADX INFO: renamed from: a */
    public final int m757a() {
        int r02 = this.f663d;
        if (r02 == this.f661b) goto L5;
        this.f663d = this.f660a + r02;
    L10:
        return r02;
    L5:
        if (this.f662c == false) goto L8;
        this.f662c = false;
        goto L10
    L8:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f662c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(m757a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
