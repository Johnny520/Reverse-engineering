package defpackage;

/* JADX INFO: renamed from: ᛸᛴᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1475 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Throwable f6521;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.InterfaceC0077 f6522;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0077 f6523;

    public C1475(defpackage.InterfaceC0077 r1, defpackage.InterfaceC0077 r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>()
            r0.f6522 = r1
            r0.f6523 = r2
            r0.f6521 = r3
            return
    }

    public /* synthetic */ C1475(defpackage.InterfaceC0077 r3, defpackage.C1437 r4, java.lang.Throwable r5, int r6) {
            r2 = this;
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            r2.<init>(r3, r4, r5)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C1475
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛸᛴᛸᛵ r5 = (defpackage.C1475) r5
            ᛱᛴᛶᛳ r1 = r4.f6522
            ᛱᛴᛶᛳ r3 = r5.f6522
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            ᛱᛴᛶᛳ r1 = r4.f6523
            ᛱᛴᛶᛳ r3 = r5.f6523
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Throwable r4 = r4.f6521
            java.lang.Throwable r5 = r5.f6521
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            ᛱᛴᛶᛳ r0 = r3.f6522
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            ᛱᛴᛶᛳ r2 = r3.f6523
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Throwable r3 = r3.f6521
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConnectResult(plan="
            r0.<init>(r1)
            ᛱᛴᛶᛳ r1 = r2.f6522
            r0.append(r1)
            java.lang.String r1 = ", nextPlan="
            r0.append(r1)
            ᛱᛴᛶᛳ r1 = r2.f6523
            r0.append(r1)
            java.lang.String r1 = ", throwable="
            r0.append(r1)
            java.lang.Throwable r2 = r2.f6521
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
