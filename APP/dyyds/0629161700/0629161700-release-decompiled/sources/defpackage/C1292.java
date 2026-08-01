package defpackage;

/* JADX INFO: renamed from: ᛷᛶᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1292 extends defpackage.AbstractC2000 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0150 f5737 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC1709 f5738;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.AbstractC1709 f5739;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.EnumC0629 f5740;

    static {
            java.lang.Class<ᛷᛶᛵᲁ> r0 = defpackage.C1292.class
            ᛱᛸᲀᛱ r0 = defpackage.AbstractC1011.m1965(r0)
            defpackage.C1292.f5737 = r0
            return
    }

    public C1292(defpackage.AbstractC1709 r1, defpackage.EnumC0629 r2, defpackage.AbstractC1709 r3) {
            r0 = this;
            r0.<init>()
            r0.f5739 = r1
            r0.f5740 = r2
            r0.f5738 = r3
            ᛱᛸᲀᛱ r1 = defpackage.C1292.f5737
            java.lang.String r0 = r0.toString()
            r1.mo681(r0)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            ᛴᛲᛸᛲ r0 = r3.f5740
            ᛴᛲᛸᛲ r1 = defpackage.EnumC0629.f3119
            ᲀᛷᛶ r2 = r3.f5739
            if (r0 != r1) goto Ld
            java.lang.String r3 = r2.toString()
            return r3
        Ld:
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = r0.f3124
            ᲀᛷᛶ r3 = r3.f5738
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            r2.append(r0)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            return r3
    }

    @Override // defpackage.InterfaceC1644
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo837(defpackage.C1412 r4) {
            r3 = this;
            ᲀᛷᛶ r0 = r3.f5739
            r0.getClass()
            boolean r1 = r0 instanceof defpackage.C0217
            if (r1 == 0) goto L11
            ᛱᲈᛵᛶ r0 = r0.mo792()
            ᲀᛷᛶ r0 = r0.m791(r4)
        L11:
            ᲀᛷᛶ r1 = r3.f5738
            r1.getClass()
            boolean r2 = r1 instanceof defpackage.C0217
            if (r2 == 0) goto L22
            ᛱᲈᛵᛶ r1 = r1.mo792()
            ᲀᛷᛶ r1 = r1.m791(r4)
        L22:
            ᛴᛲᛸᛲ r3 = r3.f5740
            java.util.HashMap r2 = defpackage.AbstractC0955.f4261
            java.lang.Object r3 = r2.get(r3)
            ᛴᲇᲇᛱ r3 = (defpackage.C0788) r3
            if (r3 == 0) goto L33
            boolean r3 = r3.m1712(r0, r1, r4)
            return r3
        L33:
            r3 = 0
            return r3
    }
}
