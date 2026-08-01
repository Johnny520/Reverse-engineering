package defpackage;

/* JADX INFO: renamed from: ᛵᲁᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0967 extends defpackage.AbstractC0624 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean f4289;

    public C0967(defpackage.InterfaceC2023 r7) {
            r6 = this;
            r0 = 1
            r6.<init>(r0)
            r6.m1443(r7)
            sun.misc.Unsafe r7 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC0624.f3090
            java.lang.Object r7 = r7.getObjectVolatile(r6, r1)
            ᲀᲁᛸᛵ r7 = (defpackage.InterfaceC1757) r7
            boolean r3 = r7 instanceof defpackage.C0313
            r4 = 0
            if (r3 == 0) goto L19
            ᛲᛶᲁᛱ r7 = (defpackage.C0313) r7
            goto L1a
        L19:
            r7 = r4
        L1a:
            r3 = 0
            if (r7 == 0) goto L47
            ᛴᛲᛵᛵ r7 = r7.f7495
            if (r7 == 0) goto L22
            goto L23
        L22:
            r7 = r4
        L23:
            if (r7 != 0) goto L26
            goto L47
        L26:
            boolean r5 = r7.mo1458()
            if (r5 == 0) goto L2d
            goto L48
        L2d:
            sun.misc.Unsafe r5 = defpackage.AbstractC0051.f569
            java.lang.Object r7 = r5.getObjectVolatile(r7, r1)
            ᲀᲁᛸᛵ r7 = (defpackage.InterfaceC1757) r7
            boolean r5 = r7 instanceof defpackage.C0313
            if (r5 == 0) goto L3c
            ᛲᛶᲁᛱ r7 = (defpackage.C0313) r7
            goto L3d
        L3c:
            r7 = r4
        L3d:
            if (r7 == 0) goto L47
            ᛴᛲᛵᛵ r7 = r7.f7495
            if (r7 == 0) goto L44
            goto L45
        L44:
            r7 = r4
        L45:
            if (r7 != 0) goto L26
        L47:
            r0 = r3
        L48:
            r6.f4289 = r0
            return
    }

    @Override // defpackage.AbstractC0624
    /* JADX INFO: renamed from: ᲁᲈᛳ */
    public final boolean mo1455() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.AbstractC0624
    /* JADX INFO: renamed from: ᲇᛳᛴᲈ */
    public final boolean mo1458() {
            r0 = this;
            boolean r0 = r0.f4289
            return r0
    }
}
