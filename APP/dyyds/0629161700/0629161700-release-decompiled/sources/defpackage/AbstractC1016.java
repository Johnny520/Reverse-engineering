package defpackage;

/* JADX INFO: renamed from: ᛶᛱᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1016 extends defpackage.AbstractC0668 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public transient defpackage.InterfaceC0140 f4526;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC0493 f4527;

    public AbstractC1016(defpackage.InterfaceC0140 r2) {
            r1 = this;
            if (r2 == 0) goto L7
            ᛳᛵᲈᛵ r0 = r2.mo663()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2)
            r1.f4527 = r0
            return
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛴᛸᲀ */
    public final void mo1503() {
            r6 = this;
            ᛱᛸᛲᲀ r0 = r6.f4526
            if (r0 == 0) goto L32
            if (r0 == r6) goto L32
            ᛳᛵᲈᛵ r1 = r6.f4527
            ᲀᛴᛱᛱ r2 = defpackage.C1654.f7364
            ᛶᲁᛳᲈ r1 = r1.mo970(r2)
            ᲁᛲᛱᛵ r1 = (defpackage.AbstractC1805) r1
            r1.getClass()
            ᛷᲇᲇᲇ r0 = (defpackage.C1395) r0
        L15:
            sun.misc.Unsafe r1 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C1395.f6052
            java.lang.Object r4 = r1.getObjectVolatile(r0, r2)
            ᛳᛴᛵᛱ r5 = defpackage.AbstractC1592.f7041
            if (r4 == r5) goto L15
            java.lang.Object r0 = r1.getObjectVolatile(r0, r2)
            boolean r1 = r0 instanceof defpackage.C2260
            if (r1 == 0) goto L2c
            ᲈᛶᛳᛷ r0 = (defpackage.C2260) r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            if (r0 == 0) goto L32
            r0.m3664()
        L32:
            ᛳᛱᲇᛸ r0 = defpackage.C0412.f2078
            r6.f4526 = r0
            return
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.InterfaceC0493 mo663() {
            r0 = this;
            ᛳᛵᲈᛵ r0 = r0.f4527
            return r0
    }
}
