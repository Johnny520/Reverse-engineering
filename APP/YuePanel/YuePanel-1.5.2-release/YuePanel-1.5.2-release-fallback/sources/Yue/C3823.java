package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3823 extends Yue.AbstractC3820 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f12107;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final long f12108;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f12109;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long f12110;

    public C3823(long r3, long r5, long r7) {
            r2 = this;
            r2.<init>()
            r2.f12107 = r7
            r2.f12108 = r5
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r8 = 0
            r0 = 1
            if (r7 <= 0) goto L15
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L1a
        L13:
            r8 = r0
            goto L1a
        L15:
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L1a
            goto L13
        L1a:
            r2.f12109 = r8
            if (r8 == 0) goto L1f
            goto L20
        L1f:
            r3 = r5
        L20:
            r2.f12110 = r3
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f12109
            return r0
    }

    @Override // Yue.AbstractC3820
    /* JADX INFO: renamed from: ۥ۟ */
    public long mo2037() {
            r4 = this;
            long r0 = r4.f12110
            long r2 = r4.f12108
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L16
            boolean r2 = r4.f12109
            if (r2 == 0) goto L10
            r2 = 0
            r4.f12109 = r2
            goto L1b
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L16:
            long r2 = r4.f12107
            long r2 = r2 + r0
            r4.f12110 = r2
        L1b:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long m15293() {
            r2 = this;
            long r0 = r2.f12107
            return r0
    }
}
