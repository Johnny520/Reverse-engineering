package defpackage;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l implements RandomAccess {
    public final l a;
    public final int b;
    public final int c;

    public k(l r1, int r2, int r3) {
        this.a = r1;
        this.b = r2;
        a80.d(r2, r3, r1.a());
        this.c = r3 - r2;
    }

    @Override // defpackage.l
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int r5) {
        int r0 = this.c;
        if (r5 < 0) goto L8;
        if (r5 >= r0) goto L8;
        return this.a.get(this.b + r5);
    L8:
        throw new IndexOutOfBoundsException("index: " + r5 + ", size: " + r0);
    }
}
