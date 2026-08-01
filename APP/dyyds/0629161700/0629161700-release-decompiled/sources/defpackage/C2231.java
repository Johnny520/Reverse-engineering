package defpackage;

/* JADX INFO: renamed from: ᲈᛴᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2231 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f9520;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f9521;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1606 f9522;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f9523;

    public C2231(defpackage.C1606 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f9523 = r0
            r0 = -1
            r1.f9521 = r0
            r1.f9520 = r0
            r1.f9522 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m3623(int r1, int r2) {
            r0 = this;
            r0.m3624()
            ᛸᲈᛸᲈ r0 = r0.f9522
            java.lang.Object r0 = r0.f7101
            ᛳᛸᲁᛷ r0 = (defpackage.AbstractC0534) r0
            r0.notifyItemMoved(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3624() {
            r4 = this;
            int r0 = r4.f9523
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1
            ᛸᲈᛸᲈ r2 = r4.f9522
            if (r0 == r1) goto L26
            r1 = 2
            if (r0 == r1) goto L1e
            r1 = 3
            if (r0 == r1) goto L11
            goto L2d
        L11:
            int r0 = r4.f9521
            int r1 = r4.f9520
            java.lang.Object r2 = r2.f7101
            ᛳᛸᲁᛷ r2 = (defpackage.AbstractC0534) r2
            r3 = 0
            r2.notifyItemRangeChanged(r0, r1, r3)
            goto L2d
        L1e:
            int r0 = r4.f9521
            int r1 = r4.f9520
            r2.m2896(r0, r1)
            goto L2d
        L26:
            int r0 = r4.f9521
            int r1 = r4.f9520
            r2.m2895(r0, r1)
        L2d:
            r0 = 0
            r4.f9523 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m3625(int r5, int r6) {
            r4 = this;
            int r0 = r4.f9523
            r1 = 3
            if (r0 != r1) goto L20
            int r0 = r4.f9521
            int r2 = r4.f9520
            int r2 = r2 + r0
            if (r5 > r2) goto L20
            int r3 = r5 + r6
            if (r3 < r0) goto L20
            int r5 = java.lang.Math.min(r5, r0)
            r4.f9521 = r5
            int r5 = java.lang.Math.max(r2, r3)
            int r6 = r4.f9521
            int r5 = r5 - r6
            r4.f9520 = r5
            return
        L20:
            r4.m3624()
            r4.f9521 = r5
            r4.f9520 = r6
            r4.f9523 = r1
            return
    }
}
