package defpackage;

/* JADX INFO: renamed from: ᛴᛶᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0688 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f3312;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int[] f3313;

    public C0688() {
            r1 = this;
            r1.<init>()
            r0 = 10
            int[] r0 = new int[r0]
            r1.f3313 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m1574() {
            r1 = this;
            int r0 = r1.f3312
            r0 = r0 & 16
            if (r0 == 0) goto Lc
            int[] r1 = r1.f3313
            r0 = 4
            r1 = r1[r0]
            return r1
        Lc:
            r1 = 65535(0xffff, float:9.1834E-41)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1575(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L11
            int[] r0 = r3.f3313
            int r1 = r0.length
            if (r4 < r1) goto L8
            goto L11
        L8:
            r1 = 1
            int r1 = r1 << r4
            int r2 = r3.f3312
            r1 = r1 | r2
            r3.f3312 = r1
            r0[r4] = r5
        L11:
            return
    }
}
