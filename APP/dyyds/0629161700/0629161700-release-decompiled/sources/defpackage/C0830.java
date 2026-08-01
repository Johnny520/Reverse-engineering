package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0830 extends defpackage.AbstractC1804 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.List f3835;

    public C0830(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            r0.f3835 = r1
            return
    }

    public C0830(defpackage.C1532 r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.f3835 = r1
            return
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo788(java.lang.String r5, defpackage.AbstractC1109 r6, java.lang.Object r7, defpackage.C0323 r8) {
            r4 = this;
            ᛶᲈᛵᛲ r6 = r8.f1684
            java.lang.Object r0 = r8.f1681
            ᛸᲈᛸᲈ r1 = r6.f5376
            r1.getClass()
            boolean r1 = r7 instanceof java.util.Map
            if (r1 == 0) goto L27
            boolean r6 = r4.m1761(r7, r0, r6, r8)
            if (r6 == 0) goto L57
            boolean r6 = r4.m3196()
            ᲈᛴᛸᛴ r0 = defpackage.AbstractC1109.f4975
            if (r6 == 0) goto L1f
            r8.m996(r5, r0, r7)
            return
        L1f:
            ᲁᛱᲈᲁ r4 = r4.m3195()
            r4.mo788(r5, r0, r7, r8)
            return
        L27:
            ᛸᲈᛸᲈ r1 = r6.f5376
            r1.getClass()
            boolean r1 = r7 instanceof java.util.List
            if (r1 == 0) goto L51
            ᛸᲈᛸᲈ r1 = r6.f5376
            java.lang.Iterable r1 = r1.m2893(r7)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L3b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            boolean r3 = r4.m1761(r3, r0, r6, r8)
            if (r3 == 0) goto L4e
            r4.m3198(r2, r5, r7, r8)
        L4e:
            int r2 = r2 + 1
            goto L3b
        L51:
            boolean r5 = r4.m3194()
            if (r5 != 0) goto L58
        L57:
            return
        L58:
            ᛷᛴᛴᛸ r5 = new ᛷᛴᛴᛸ
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r7}
            java.lang.String r6 = "Filter: %s can not be applied to primitives. Current context is: %s"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final boolean m1761(java.lang.Object r2, java.lang.Object r3, defpackage.C1184 r4, defpackage.C0323 r5) {
            r1 = this;
            ᛸᛱᛲ r0 = new ᛸᛱᛲ
            java.util.HashMap r5 = r5.f1686
            r0.<init>(r2, r3, r4, r5)
            java.util.List r1 = r1.f3835
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            ᲀᛳᛴᛵ r2 = (defpackage.InterfaceC1644) r2
            r3 = 0
            boolean r2 = r2.mo837(r0)     // Catch: defpackage.C1255 -> L20
            if (r2 != 0) goto Ld
        L20:
            return r3
        L21:
            r1 = 1
            return r1
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.String mo789() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            r1 = 0
        L8:
            java.util.List r2 = r3.f3835
            int r2 = r2.size()
            if (r1 >= r2) goto L1f
            if (r1 == 0) goto L17
            java.lang.String r2 = ","
            r0.append(r2)
        L17:
            java.lang.String r2 = "?"
            r0.append(r2)
            int r1 = r1 + 1
            goto L8
        L1f:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final boolean mo790() {
            r0 = this;
            r0 = 0
            return r0
    }
}
