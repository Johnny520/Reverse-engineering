package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
public final class C6547 implements java.util.Iterator<Yue.C6539>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f22937;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f22938;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final long f22939;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long f22940;

    public C6547(long r4, long r6, long r8) {
            r3 = this;
            r3.<init>()
            r3.f22937 = r6
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L15
            int r0 = java.lang.Long.compareUnsigned(r4, r6)
            if (r0 > 0) goto L1c
        L13:
            r1 = r2
            goto L1c
        L15:
            int r0 = java.lang.Long.compareUnsigned(r4, r6)
            if (r0 < 0) goto L1c
            goto L13
        L1c:
            r3.f22938 = r1
            long r8 = Yue.C6539.m25038(r8)
            r3.f22939 = r8
            boolean r8 = r3.f22938
            if (r8 == 0) goto L29
            goto L2a
        L29:
            r4 = r6
        L2a:
            r3.f22940 = r4
            return
    }

    public /* synthetic */ C6547(long r1, long r3, long r5, Yue.C1769 r7) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f22938
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Yue.C6539 next() {
            r2 = this;
            long r0 = r2.m25125()
            Yue.ۥۢۢۧ۟ r0 = Yue.C6539.m25033(r0)
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
    public long m25125() {
            r4 = this;
            long r0 = r4.f22940
            long r2 = r4.f22937
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L16
            boolean r2 = r4.f22938
            if (r2 == 0) goto L10
            r2 = 0
            r4.f22938 = r2
            goto L1f
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L16:
            long r2 = r4.f22939
            long r2 = r2 + r0
            long r2 = Yue.C6539.m25038(r2)
            r4.f22940 = r2
        L1f:
            return r0
    }
}
