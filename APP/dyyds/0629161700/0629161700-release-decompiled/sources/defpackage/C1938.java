package defpackage;

/* JADX INFO: renamed from: ᲁᲇᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1938 extends defpackage.AbstractC1683 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C2260 f8440;

    public C1938(defpackage.C2260 r1) {
            r0 = this;
            r0.<init>()
            r0.f8440 = r1
            return
    }

    @Override // defpackage.AbstractC1683
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final boolean mo987() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.AbstractC1683
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo988(java.lang.Throwable r15) {
            r14 = this;
            ᛴᛲᛵᛵ r15 = r14.f7495
            if (r15 == 0) goto L5
            goto L6
        L5:
            r15 = 0
        L6:
            ᲈᛶᛳᛷ r14 = r14.f8440
            java.lang.Throwable r5 = r14.mo1323(r15)
            boolean r15 = r14.m3665()
            if (r15 != 0) goto L13
            goto L4b
        L13:
            ᛱᛸᛲᲀ r15 = r14.f9597
            r1 = r15
            ᛷᲇᲇᲇ r1 = (defpackage.C1395) r1
            long r12 = defpackage.C1395.f6052
        L1a:
            sun.misc.Unsafe r15 = defpackage.AbstractC0051.f569
            java.lang.Object r10 = r15.getObjectVolatile(r1, r12)
            ᛳᛴᛵᛱ r4 = defpackage.AbstractC1592.f7041
            boolean r15 = defpackage.AbstractC0498.m1280(r10, r4)
            if (r15 == 0) goto L3a
        L28:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C1395.f6052
            boolean r15 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r15 == 0) goto L33
            goto L57
        L33:
            java.lang.Object r15 = r0.getObjectVolatile(r1, r12)
            if (r15 == r4) goto L28
            goto L1a
        L3a:
            boolean r15 = r10 instanceof java.lang.Throwable
            if (r15 == 0) goto L3f
            goto L57
        L3f:
            sun.misc.Unsafe r6 = defpackage.AbstractC0051.f569
            long r8 = defpackage.C1395.f6052
            r11 = 0
            r7 = r1
            boolean r15 = r6.compareAndSwapObject(r7, r8, r10, r11)
            if (r15 == 0) goto L58
        L4b:
            r14.m3663(r5)
            boolean r15 = r14.m3665()
            if (r15 != 0) goto L57
            r14.m3664()
        L57:
            return
        L58:
            java.lang.Object r15 = r6.getObjectVolatile(r1, r12)
            if (r15 == r10) goto L3f
            goto L1a
    }
}
