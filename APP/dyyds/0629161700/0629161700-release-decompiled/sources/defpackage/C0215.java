package defpackage;

/* JADX INFO: renamed from: ᛱᲈᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0215 extends defpackage.AbstractC1804 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.util.List f1328;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.String f1329;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.String f1330;

    public C0215(java.lang.String r3, java.util.ArrayList r4) {
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto Le
            int r0 = r4.size()
            if (r0 <= 0) goto Le
            java.lang.String r0 = "(...)"
            goto L10
        Le:
            java.lang.String r0 = "()"
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.f1330 = r0
            if (r3 == 0) goto L28
            r2.f1329 = r3
            r2.f1328 = r4
            return
        L28:
            r3 = 0
            r2.f1329 = r3
            r2.f1328 = r3
            return
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo788(java.lang.String r3, defpackage.AbstractC1109 r4, java.lang.Object r5, defpackage.C0323 r6) {
            r2 = this;
            ᛶᲈᛵᛲ r3 = r6.f1684
            java.util.Map r4 = defpackage.AbstractC0585.f2922
            java.lang.String r5 = r2.f1329
            java.lang.Object r4 = r4.get(r5)
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 == 0) goto L83
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.Exception -> L74
            if (r4 != 0) goto L6e
            java.util.List r2 = r2.f1328
            if (r2 == 0) goto L6c
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r2.next()
            ᛸᛸᛸᛶ r4 = (defpackage.C1545) r4
            int r5 = r4.f6863
            int r5 = defpackage.AbstractC0225.m812(r5)
            if (r5 == 0) goto L54
            r0 = 1
            if (r5 == r0) goto L34
            goto L1c
        L34:
            ᛶᛱᲇᲀ r5 = new ᛶᛱᲇᲀ
            ᛶᛱᛳᲁ r0 = r4.f6864
            java.lang.Object r1 = r6.f1681
            r5.<init>(r0, r1, r3)
            java.lang.Boolean r0 = r4.f6861
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4d
            ᲀᲇᛴᛷ r0 = r4.f6862
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L1c
        L4d:
            r4.f6862 = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.f6861 = r5
            goto L1c
        L54:
            java.lang.Boolean r5 = r4.f6861
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L1c
            ᛸᛶᛱᛵ r5 = new ᛸᛶᛱᛵ
            ᛸᲈᛸᲈ r0 = r3.f5376
            r0 = 29
            r5.<init>(r0)
            r4.f6862 = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.f6861 = r5
            goto L1c
        L6c:
            r2 = 0
            throw r2
        L6e:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException     // Catch: java.lang.Exception -> L74
            r2.<init>()     // Catch: java.lang.Exception -> L74
            throw r2     // Catch: java.lang.Exception -> L74
        L74:
            r2 = move-exception
            ᛷᛴᛴᛸ r3 = new ᛷᛴᛴᛸ
            java.lang.String r4 = "Function of name: "
            java.lang.String r6 = " cannot be created"
            java.lang.String r4 = defpackage.AbstractC0225.m817(r4, r5, r6)
            r3.<init>(r4, r2)
            throw r3
        L83:
            ᛷᛴᛴᛸ r2 = new ᛷᛴᛴᛸ
            java.lang.String r3 = "Function with name: "
            java.lang.String r4 = " does not exist."
            java.lang.String r3 = defpackage.AbstractC0225.m817(r3, r5, r4)
            r2.<init>(r3)
            throw r2
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String mo789() {
            r1 = this;
            java.lang.String r1 = r1.f1330
            java.lang.String r0 = "."
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean mo790() {
            r0 = this;
            r0 = 1
            return r0
    }
}
