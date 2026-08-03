package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
public final class C6536 implements java.util.Iterator<Yue.C6528>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f22918;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f22919;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f22920;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f22921;

    public C6536(int r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r3.f22918 = r5
            r0 = 0
            r1 = 1
            int r2 = java.lang.Integer.compareUnsigned(r4, r5)
            if (r6 <= 0) goto L11
            if (r2 > 0) goto L14
        Lf:
            r0 = r1
            goto L14
        L11:
            if (r2 < 0) goto L14
            goto Lf
        L14:
            r3.f22919 = r0
            int r6 = Yue.C6528.m24937(r6)
            r3.f22920 = r6
            boolean r6 = r3.f22919
            if (r6 == 0) goto L21
            goto L22
        L21:
            r4 = r5
        L22:
            r3.f22921 = r4
            return
    }

    public /* synthetic */ C6536(int r1, int r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f22919
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Yue.C6528 next() {
            r1 = this;
            int r0 = r1.m25024()
            Yue.ۥۢۢۦۣ r0 = Yue.C6528.m24932(r0)
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m25024() {
            r2 = this;
            int r0 = r2.f22921
            int r1 = r2.f22918
            if (r0 != r1) goto L14
            boolean r1 = r2.f22919
            if (r1 == 0) goto Le
            r1 = 0
            r2.f22919 = r1
            goto L1d
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.f22920
            int r1 = r1 + r0
            int r1 = Yue.C6528.m24937(r1)
            r2.f22921 = r1
        L1d:
            return r0
    }
}
