package defpackage;

/* JADX INFO: renamed from: ᲇᲈᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2160 extends defpackage.AbstractC1804 {
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final boolean m3568(java.lang.String r2, java.lang.Object r3, defpackage.C0323 r4) {
            r1 = this;
            ᛶᲈᛵᛲ r4 = r4.f1684
            ᛸᛳᲇ r0 = defpackage.EnumC1463.f6485
            if (r3 != 0) goto L23
            boolean r1 = r1.m3194()
            if (r1 == 0) goto L4f
            java.util.Set r1 = r4.f5375
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L15
            goto L4f
        L15:
            ᛸᲇᛱᛵ r1 = new ᛸᲇᛱᛵ
            java.lang.String r3 = "The path "
            java.lang.String r4 = " is null"
            java.lang.String r2 = defpackage.AbstractC0225.m817(r3, r2, r4)
            r1.<init>(r2)
            throw r1
        L23:
            ᛸᲈᛸᲈ r2 = r4.f5376
            r2.getClass()
            boolean r2 = r3 instanceof java.util.List
            if (r2 != 0) goto L51
            boolean r2 = r1.m3194()
            if (r2 == 0) goto L4f
            java.util.Set r2 = r4.f5375
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L3b
            goto L4f
        L3b:
            ᛸᲇᛱᛵ r2 = new ᛸᲇᛱᛵ
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}
            java.lang.String r3 = "Filter: %s can only be applied to arrays. Current context is: %s"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r2.<init>(r1)
            throw r2
        L4f:
            r1 = 0
            return r1
        L51:
            r1 = 1
            return r1
    }
}
