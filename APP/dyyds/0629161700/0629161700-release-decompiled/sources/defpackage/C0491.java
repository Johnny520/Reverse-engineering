package defpackage;

/* JADX INFO: renamed from: ᛳᛵᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0491 extends defpackage.AbstractC1804 {
    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo788(java.lang.String r5, defpackage.AbstractC1109 r6, java.lang.Object r7, defpackage.C0323 r8) {
            r4 = this;
            ᛶᲈᛵᛲ r6 = r8.f1684
            ᛸᲈᛸᲈ r0 = r6.f5376
            r0.getClass()
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L29
            ᛸᲈᛸᲈ r6 = r6.f5376
            java.util.Set r6 = r6.m2904(r7)
            java.util.Iterator r6 = r6.iterator()
        L15:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r4.m3197(r5, r7, r8, r0)
            goto L15
        L29:
            ᛸᲈᛸᲈ r0 = r6.f5376
            r0.getClass()
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L4e
            r0 = 0
        L33:
            ᛸᲈᛸᲈ r1 = r6.f5376
            int r1 = r1.m2902(r7)
            if (r0 >= r1) goto L4e
            r4.m3198(r0, r5, r7, r8)     // Catch: defpackage.C1579 -> L3f
            goto L4a
        L3f:
            r1 = move-exception
            java.util.Set r2 = r6.f5375
            ᛸᛳᲇ r3 = defpackage.EnumC1463.f6486
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L4d
        L4a:
            int r0 = r0 + 1
            goto L33
        L4d:
            throw r1
        L4e:
            return
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.String mo789() {
            r0 = this;
            java.lang.String r0 = "[*]"
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
