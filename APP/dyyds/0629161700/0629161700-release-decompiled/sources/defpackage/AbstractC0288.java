package defpackage;

/* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0288 extends defpackage.AbstractC0624 implements defpackage.InterfaceC0140, defpackage.InterfaceC1399 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC0493 f1569;

    public AbstractC0288(defpackage.InterfaceC0493 r1, boolean r2) {
            r0 = this;
            r0.<init>(r2)
            ᛷᲈᲀ r2 = defpackage.C1403.f6097
            ᛶᲁᛳᲈ r2 = r1.mo970(r2)
            ᲇᛳᛸᛳ r2 = (defpackage.InterfaceC2023) r2
            r0.m1443(r2)
            ᛳᛵᲈᛵ r1 = r1.mo971(r0)
            r0.f1569 = r1
            return
    }

    @Override // defpackage.AbstractC0624
    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public final void mo916(defpackage.C1486 r1) {
            r0 = this;
            ᛳᛵᲈᛵ r0 = r0.f1569
            defpackage.AbstractC2279.m3703(r0, r1)
            return
    }

    @Override // defpackage.AbstractC0624
    /* JADX INFO: renamed from: ᛳᛸᛱᲇ, reason: contains not printable characters */
    public final void mo917(java.lang.Object r3) {
            r2 = this;
            boolean r2 = r3 instanceof defpackage.C0142
            if (r2 == 0) goto Ld
            ᛱᛸᛳᛱ r3 = (defpackage.C0142) r3
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569
            long r0 = defpackage.C0142.f1091
            r2.getIntVolatile(r3, r0)
        Ld:
            return
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo662(java.lang.Object r3) {
            r2 = this;
            java.lang.Throwable r0 = defpackage.C2165.m3569(r3)
            if (r0 != 0) goto L7
            goto Ld
        L7:
            ᛱᛸᛳᛱ r3 = new ᛱᛸᛳᛱ
            r1 = 0
            r3.<init>(r0, r1)
        Ld:
            java.lang.Object r3 = r2.m1438(r3)
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC1754.f7747
            if (r3 != r0) goto L16
            return
        L16:
            r2.mo1436(r3)
            return
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.InterfaceC0493 mo663() {
            r0 = this;
            ᛳᛵᲈᛵ r0 = r0.f1569
            return r0
    }

    /* JADX INFO: renamed from: ᲀᲀᛲᛸ, reason: contains not printable characters */
    public final void m918(int r3, defpackage.AbstractC0288 r4, defpackage.InterfaceC2087 r5) {
            r2 = this;
            int r3 = defpackage.AbstractC0225.m812(r3)
            ᲁᲀᛱᲁ r0 = defpackage.C1907.f8270
            if (r3 == 0) goto L4e
            r1 = 1
            if (r3 == r1) goto L4d
            r1 = 2
            if (r3 == r1) goto L40
            r0 = 3
            if (r3 != r0) goto L3a
            ᛳᛵᲈᛵ r3 = r2.f1569     // Catch: java.lang.Throwable -> L2a
            r0 = 0
            java.lang.Object r0 = defpackage.C1825.m3215(r3, r0)     // Catch: java.lang.Throwable -> L2a
            defpackage.AbstractC1171.m2261(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r5.mo388(r4, r2)     // Catch: java.lang.Throwable -> L2c
            defpackage.C1825.m3216(r3, r0)     // Catch: java.lang.Throwable -> L2a
            ᛴᛵ r3 = defpackage.EnumC0670.f3246
            if (r4 == r3) goto L4d
            r2.mo662(r4)
            return
        L2a:
            r3 = move-exception
            goto L31
        L2c:
            r4 = move-exception
            defpackage.C1825.m3216(r3, r0)     // Catch: java.lang.Throwable -> L2a
            throw r4     // Catch: java.lang.Throwable -> L2a
        L31:
            ᛴᛸᛲᲀ r4 = new ᛴᛸᛲᲀ
            r4.<init>(r3)
            r2.mo662(r4)
            return
        L3a:
            ᛸᛵᛳᲀ r2 = new ᛸᛵᛳᲀ
            r2.<init>()
            throw r2
        L40:
            ᛴᛴᲈᛶ r5 = (defpackage.AbstractC0668) r5
            ᛱᛸᛲᲀ r2 = r5.mo389(r2, r4)
            ᛱᛸᛲᲀ r2 = defpackage.AbstractC0397.m1142(r2)
            r2.mo662(r0)
        L4d:
            return
        L4e:
            ᛴᛴᲈᛶ r5 = (defpackage.AbstractC0668) r5     // Catch: java.lang.Throwable -> L5c
            ᛱᛸᛲᲀ r3 = r5.mo389(r2, r4)     // Catch: java.lang.Throwable -> L5c
            ᛱᛸᛲᲀ r3 = defpackage.AbstractC0397.m1142(r3)     // Catch: java.lang.Throwable -> L5c
            defpackage.AbstractC1592.m2876(r3, r0)     // Catch: java.lang.Throwable -> L5c
            return
        L5c:
            r3 = move-exception
            ᛴᛸᛲᲀ r4 = new ᛴᛸᛲᲀ
            r4.<init>(r3)
            r2.mo662(r4)
            throw r3
    }

    @Override // defpackage.InterfaceC1399
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.InterfaceC0493 mo105() {
            r0 = this;
            ᛳᛵᲈᛵ r0 = r0.f1569
            return r0
    }

    @Override // defpackage.AbstractC0624
    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final java.lang.String mo919() {
            r1 = this;
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r0 = " was cancelled"
            java.lang.String r1 = r1.concat(r0)
            return r1
    }
}
