package defpackage;

/* JADX INFO: renamed from: ᲈᛷᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2292 extends defpackage.C0818 {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.ThreadLocal f9706;

    public C2292(defpackage.InterfaceC0493 r3, defpackage.InterfaceC0140 r4) {
            r2 = this;
            ᲁᛱᲁᛸ r0 = defpackage.C1803.f7900
            ᛶᲁᛳᲈ r1 = r3.mo970(r0)
            if (r1 != 0) goto Ld
            ᛳᛵᲈᛵ r0 = r3.mo971(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f9706 = r0
            ᛳᛵᲈᛵ r4 = r4.mo663()
            ᲀᛴᛱᛱ r0 = defpackage.C1654.f7364
            ᛶᲁᛳᲈ r4 = r4.mo970(r0)
            boolean r4 = r4 instanceof defpackage.AbstractC1805
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = defpackage.C1825.m3215(r3, r4)
            defpackage.C1825.m3216(r3, r4)
            r2.m3708(r3, r4)
        L31:
            return
    }

    @Override // defpackage.C0818, defpackage.AbstractC0624
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final void mo1436(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r5.threadLocalIsSet
            if (r0 == 0) goto L20
            java.lang.ThreadLocal r0 = r5.f9706
            java.lang.Object r0 = r0.get()
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto L1b
            java.lang.Object r1 = r0.component1()
            ᛳᛵᲈᛵ r1 = (defpackage.InterfaceC0493) r1
            java.lang.Object r0 = r0.component2()
            defpackage.C1825.m3216(r1, r0)
        L1b:
            java.lang.ThreadLocal r0 = r5.f9706
            r0.remove()
        L20:
            java.lang.Object r6 = defpackage.AbstractC1849.m3244(r6)
            ᛱᛸᛲᲀ r0 = r5.f3779
            ᛳᛵᲈᛵ r1 = r0.mo663()
            r2 = 0
            java.lang.Object r3 = defpackage.C1825.m3215(r1, r2)
            ᛳᛴᛵᛱ r4 = defpackage.C1825.f7959
            if (r3 == r4) goto L37
            ᲈᛷᛸᛸ r2 = defpackage.AbstractC0762.m1686(r0, r1, r3)
        L37:
            ᛱᛸᛲᲀ r5 = r5.f3779     // Catch: java.lang.Throwable -> L4a
            r5.mo662(r6)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L46
            boolean r5 = r2.m3709()
            if (r5 == 0) goto L45
            goto L46
        L45:
            return
        L46:
            defpackage.C1825.m3216(r1, r3)
            return
        L4a:
            r5 = move-exception
            if (r2 == 0) goto L53
            boolean r6 = r2.m3709()
            if (r6 == 0) goto L56
        L53:
            defpackage.C1825.m3216(r1, r3)
        L56:
            throw r5
    }

    /* JADX INFO: renamed from: ᛲᛵᲁᛲ, reason: contains not printable characters */
    public final void m3708(defpackage.InterfaceC0493 r2, java.lang.Object r3) {
            r1 = this;
            r0 = 1
            r1.threadLocalIsSet = r0
            java.lang.ThreadLocal r1 = r1.f9706
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r3)
            r1.set(r0)
            return
    }

    /* JADX INFO: renamed from: ᛴᛶᛸᲈ, reason: contains not printable characters */
    public final boolean m3709() {
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.ThreadLocal r0 = r2.f9706
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.ThreadLocal r2 = r2.f9706
            r2.remove()
            r2 = r0 ^ 1
            return r2
    }
}
