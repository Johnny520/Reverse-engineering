package defpackage;

/* JADX INFO: renamed from: ᛴᲀᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0751 extends defpackage.AbstractC2160 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0150 f3524 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1126 f3525;

    static {
            java.lang.Class<ᛴᲀᛸᛸ> r0 = defpackage.C0751.class
            ᛱᛸᲀᛱ r0 = defpackage.AbstractC1011.m1965(r0)
            defpackage.C0751.f3524 = r0
            return
    }

    public C0751(defpackage.C1126 r1) {
            r0 = this;
            r0.<init>()
            r0.f3525 = r1
            return
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo788(java.lang.String r7, defpackage.AbstractC1109 r8, java.lang.Object r9, defpackage.C0323 r10) {
            r6 = this;
            ᛶᲈᛵᛲ r8 = r10.f1684
            ᛶᛸᛶᛲ r0 = r6.f3525
            java.lang.Object r1 = r0.f5013
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r2 = r0.f5014
            java.lang.Integer r2 = (java.lang.Integer) r2
            boolean r3 = r6.m3568(r7, r9, r10)
            if (r3 != 0) goto L14
            goto Lc6
        L14:
            int r0 = r0.f5016
            int r0 = defpackage.AbstractC0225.m812(r0)
            r3 = 0
            ᛱᛸᲀᛱ r4 = defpackage.C0751.f3524
            if (r0 == 0) goto L8d
            r5 = 1
            if (r0 == r5) goto L5c
            r3 = 2
            if (r0 == r3) goto L27
            goto Lc6
        L27:
            ᛸᲈᛸᲈ r8 = r8.f5376
            int r8 = r8.m2902(r9)
            int r0 = r2.intValue()
            int r1 = r1.intValue()
            int r1 = java.lang.Math.min(r8, r1)
            if (r0 >= r1) goto Lc6
            if (r8 != 0) goto L3f
            goto Lc6
        L3f:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = r6.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r2, r3, r5}
            java.lang.String r2 = "Slice between indexes on array with length: {}. From index: {} to: {}. Input: {}"
            r4.mo682(r2, r8)
        L54:
            if (r0 >= r1) goto Lc6
            r6.m3198(r0, r7, r9, r10)
            int r0 = r0 + 1
            goto L54
        L5c:
            ᛸᲈᛸᲈ r8 = r8.f5376
            int r8 = r8.m2902(r9)
            if (r8 != 0) goto L65
            goto Lc6
        L65:
            int r0 = r1.intValue()
            if (r0 >= 0) goto L6c
            int r0 = r0 + r8
        L6c:
            int r0 = java.lang.Math.min(r8, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = r6.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r1, r2}
            java.lang.String r1 = "Slice to index on array with length: {}. From index: 0 to: {}. Input: {}"
            r4.mo682(r1, r8)
        L85:
            if (r3 >= r0) goto Lc6
            r6.m3198(r3, r7, r9, r10)
            int r3 = r3 + 1
            goto L85
        L8d:
            ᛸᲈᛸᲈ r8 = r8.f5376
            int r8 = r8.m2902(r9)
            int r0 = r2.intValue()
            if (r0 >= 0) goto L9a
            int r0 = r0 + r8
        L9a:
            int r0 = java.lang.Math.max(r3, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r3 = r8 + (-1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = r6.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r5}
            java.lang.String r2 = "Slice from index on array with length: {}. From index: {} to: {}. Input: {}"
            r4.mo682(r2, r1)
            if (r8 == 0) goto Lc6
            if (r0 < r8) goto Lbe
            goto Lc6
        Lbe:
            if (r0 >= r8) goto Lc6
            r6.m3198(r0, r7, r9, r10)
            int r0 = r0 + 1
            goto Lbe
        Lc6:
            return
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.String mo789() {
            r0 = this;
            ᛶᛸᛶᛲ r0 = r0.f3525
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final boolean mo790() {
            r0 = this;
            r0 = 0
            return r0
    }
}
