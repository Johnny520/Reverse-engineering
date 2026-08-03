package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0568 implements java.util.Iterator {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.lang.Object[] f1476;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f1477;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f1478;

    public C0568(java.lang.Object[] r3) {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.<init>(r3, r1, r0)
            return
    }

    public C0568(java.lang.Object[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r3 < 0) goto L20
            int r0 = r2.length
            if (r3 > r0) goto L1a
            int r0 = r2.length
            int r0 = r0 - r3
            if (r4 > r0) goto L14
            r1.f1476 = r2
            r1.f1478 = r3
            int r4 = r4 + r3
            r1.f1477 = r4
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.f1478
            int r1 = r2.f1477
            if (r0 >= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r3 = this;
            int r0 = r3.f1478
            int r1 = r3.f1477
            if (r0 >= r1) goto Lf
            java.lang.Object[] r1 = r3.f1476
            int r2 = r0 + 1
            r3.f1478 = r2
            r0 = r1[r0]
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
