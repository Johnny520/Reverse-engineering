package defpackage;

/* JADX INFO: renamed from: ᛶᛱᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1003 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0150 f4460 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1650 f4461;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean f4462;

    static {
            java.lang.Class<ᛶᛱᛳᲁ> r0 = defpackage.C1003.class
            ᛱᛸᲀᛱ r0 = defpackage.AbstractC1011.m1965(r0)
            defpackage.C1003.f4460 = r0
            return
    }

    public C1003(defpackage.C1650 r5, boolean r6) {
            r4 = this;
            r4.<init>()
            ᲁᛱᲈᲁ r0 = r5.f7345
            boolean r0 = r0 instanceof defpackage.C0215
            if (r0 == 0) goto L54
            ᲁᛱᲈᲁ r0 = r5.m3195()
            boolean r0 = r0 instanceof defpackage.C2119
            if (r0 == 0) goto L54
            r0 = 0
            r1 = r5
            r2 = r0
        L14:
            ᲁᛱᲈᲁ r1 = r1.m3195()
            if (r1 == 0) goto L20
            boolean r3 = r1 instanceof defpackage.C0215
            if (r3 != 0) goto L20
            r2 = r1
            goto L14
        L20:
            boolean r3 = r1 instanceof defpackage.C0215
            if (r3 == 0) goto L54
            r2.f7907 = r0
            r5.f7345 = r2
            ᛸᛸᛸᛶ r0 = new ᛸᛸᛸᛶ
            r0.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.f6861 = r2
            ᛶᛱᛳᲁ r2 = new ᛶᛱᛳᲁ
            r3 = 1
            r2.<init>(r5, r3)
            r0.f6864 = r2
            r5 = 2
            r0.f6863 = r5
            r5 = r1
            ᛱᲈᛴᛲ r5 = (defpackage.C0215) r5
            ᛸᛸᛸᛶ[] r0 = new defpackage.C1545[]{r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.f1328 = r0
            ᲀᛳᲁᛵ r5 = new ᲀᛳᲁᛵ
            r0 = 36
            r5.<init>(r0)
            r5.f7345 = r1
            r5.f7907 = r1
        L54:
            r4.f4461 = r5
            r4.f4462 = r6
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            ᲀᛳᲁᛵ r0 = r0.f4461
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0323 m1958(java.lang.Object r4, java.lang.Object r5, defpackage.C1184 r6) {
            r3 = this;
            ᛱᛸᲀᛱ r0 = defpackage.C1003.f4460
            boolean r1 = r0.mo677()
            ᲀᛳᲁᛵ r2 = r3.f4461
            if (r1 == 0) goto L11
            java.lang.String r1 = r2.toString()
            r0.mo679(r1)
        L11:
            ᛲᛷᛸ r0 = new ᛲᛷᛸ
            r0.<init>(r3, r5, r6)
            ᲈᛴᛸᛴ r3 = defpackage.AbstractC1109.f4975     // Catch: defpackage.C1997 -> L1d
            java.lang.String r5 = ""
            r2.mo788(r5, r3, r4, r0)     // Catch: defpackage.C1997 -> L1d
        L1d:
            return r0
    }
}
