package defpackage;

/* JADX INFO: renamed from: ᲁᲇᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1946 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean f8464;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f8465;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f8466;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final byte[] f8467;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f8468;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C1946 f8469;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C1946 f8470;

    public C1946() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.f8467 = r0
            r0 = 1
            r1.f8464 = r0
            r0 = 0
            r1.f8465 = r0
            return
    }

    public C1946(byte[] r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f8467 = r1
            r0.f8468 = r2
            r0.f8466 = r3
            r0.f8465 = r4
            r1 = 0
            r0.f8464 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3359(defpackage.C1946 r6, int r7) {
            r5 = this;
            byte[] r0 = r6.f8467
            boolean r1 = r6.f8464
            if (r1 == 0) goto L42
            int r1 = r6.f8466
            int r2 = r1 + r7
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 <= r3) goto L2d
            boolean r4 = r6.f8465
            if (r4 != 0) goto L29
            int r4 = r6.f8468
            int r2 = r2 - r4
            if (r2 > r3) goto L25
            defpackage.AbstractC2315.m3772(r0, r0, r4, r1)
            int r1 = r6.f8466
            int r2 = r6.f8468
            int r1 = r1 - r2
            r6.f8466 = r1
            r2 = 0
            r6.f8468 = r2
            goto L2d
        L25:
            defpackage.C0086.m557()
            return
        L29:
            defpackage.C0086.m557()
            return
        L2d:
            int r2 = r5.f8468
            int r3 = r2 + r7
            int r3 = r3 - r2
            byte[] r4 = r5.f8467
            java.lang.System.arraycopy(r4, r2, r0, r1, r3)
            int r0 = r6.f8466
            int r0 = r0 + r7
            r6.f8466 = r0
            int r6 = r5.f8468
            int r6 = r6 + r7
            r5.f8468 = r6
            return
        L42:
            java.lang.String r5 = "only owner can write"
            defpackage.C2264.m3676(r5)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1946 m3360() {
            r4 = this;
            r0 = 1
            r4.f8465 = r0
            ᲁᲇᛶᛶ r1 = new ᲁᲇᛶᛶ
            int r2 = r4.f8468
            int r3 = r4.f8466
            byte[] r4 = r4.f8467
            r1.<init>(r4, r2, r3, r0)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1946 m3361() {
            r4 = this;
            ᲁᲇᛶᛶ r0 = r4.f8469
            r1 = 0
            if (r0 == r4) goto L7
            r2 = r0
            goto L8
        L7:
            r2 = r1
        L8:
            ᲁᲇᛶᛶ r3 = r4.f8470
            r3.f8469 = r0
            ᲁᲇᛶᛶ r0 = r4.f8469
            r0.f8470 = r3
            r4.f8469 = r1
            r4.f8470 = r1
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3362(defpackage.C1946 r2) {
            r1 = this;
            r2.f8470 = r1
            ᲁᲇᛶᛶ r0 = r1.f8469
            r2.f8469 = r0
            ᲁᲇᛶᛶ r0 = r1.f8469
            r0.f8470 = r2
            r1.f8469 = r2
            return
    }
}
