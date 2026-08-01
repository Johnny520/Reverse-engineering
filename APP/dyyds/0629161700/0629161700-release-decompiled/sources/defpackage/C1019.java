package defpackage;

/* JADX INFO: renamed from: ᛶᛱᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1019 implements defpackage.InterfaceC1765 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1184 f4544;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f4545;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1003 f4546;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object f4547;

    public C1019(defpackage.C1003 r2, java.lang.Object r3, defpackage.C1184 r4) {
            r1 = this;
            r1.<init>()
            r1.f4546 = r2
            java.lang.String r0 = r3.toString()
            r1.f4545 = r0
            r1.f4544 = r4
            ᛲᛷᛸ r2 = r2.m1958(r3, r3, r4)
            r3 = 1
            java.lang.Object r2 = r2.m995(r3)
            r1.f4547 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2e
            java.lang.Class<ᛶᛱᲇᲀ> r2 = defpackage.C1019.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2e
        L10:
            ᛶᛱᲇᲀ r5 = (defpackage.C1019) r5
            ᛶᛱᛳᲁ r2 = r4.f4546
            ᛶᛱᛳᲁ r3 = r5.f4546
            if (r2 == r3) goto L19
            goto L2e
        L19:
            java.lang.String r2 = r4.f4545
            java.lang.String r3 = r5.f4545
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2e
            ᛶᲈᛵᛲ r4 = r4.f4544
            ᛶᲈᛵᛲ r5 = r5.f4544
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L2e
            return r0
        L2e:
            return r1
    }
}
