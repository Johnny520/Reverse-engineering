package defpackage;

/* JADX INFO: renamed from: ᲇᛳᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2030 extends defpackage.AbstractC1952 {

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public defpackage.AbstractC1725 f8750;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final java.lang.Class f8751;

    public C2030(defpackage.C1326 r1, java.lang.Class r2) {
            r0 = this;
            r0.<init>(r1)
            java.lang.Class r1 = r2.getComponentType()
            r0.f8751 = r1
            return
    }

    @Override // defpackage.AbstractC1725
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo545(java.lang.Object r4) {
            r3 = this;
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            java.lang.Class r3 = r3.f8751
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L13:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L13
        L23:
            return r3
    }

    @Override // defpackage.AbstractC1725
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final defpackage.AbstractC1725 mo1178(java.lang.String r2) {
            r1 = this;
            ᲀᛸᛶᛶ r2 = r1.f8750
            if (r2 != 0) goto Le
            ᛷᛸᛱᛸ r2 = r1.f7645
            java.lang.Class r0 = r1.f8751
            ᲀᛸᛶᛶ r2 = r2.m2481(r0)
            r1.f8750 = r2
        Le:
            return r2
    }

    @Override // defpackage.AbstractC1725
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final defpackage.AbstractC1725 mo1179(java.lang.String r2) {
            r1 = this;
            ᲀᛸᛶᛶ r2 = r1.f8750
            if (r2 != 0) goto Le
            ᛷᛸᛱᛸ r2 = r1.f7645
            java.lang.Class r0 = r1.f8751
            ᲀᛸᛶᛶ r2 = r2.m2481(r0)
            r1.f8750 = r2
        Le:
            return r2
    }
}
