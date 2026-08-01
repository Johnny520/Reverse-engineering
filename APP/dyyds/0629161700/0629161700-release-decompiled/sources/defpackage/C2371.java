package defpackage;

/* JADX INFO: renamed from: ᲈᲈᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2371 extends defpackage.AbstractC1804 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.List f10253;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.String f10254;

    public C2371(java.util.List r2, char r3) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L12
            r1.f10253 = r2
            java.lang.String r2 = java.lang.Character.toString(r3)
            r1.f10254 = r2
            return
        L12:
            ᛷᛴᛴᛸ r1 = new ᛷᛴᛴᛸ
            java.lang.String r2 = "Empty properties"
            r1.<init>(r2)
            throw r1
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo788(java.lang.String r4, defpackage.AbstractC1109 r5, java.lang.Object r6, defpackage.C0323 r7) {
            r3 = this;
            ᛶᲈᛵᛲ r5 = r7.f1684
            ᛸᲈᛸᲈ r0 = r5.f5376
            r0.getClass()
            boolean r0 = r6 instanceof java.util.Map
            if (r0 != 0) goto L69
            boolean r7 = r3.m3194()
            if (r7 == 0) goto La4
            java.util.Set r7 = r5.f5375
            ᛸᛳᲇ r0 = defpackage.EnumC1463.f6485
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L1d
            goto La4
        L1d:
            if (r6 != 0) goto L22
            java.lang.String r6 = "null"
            goto L2a
        L22:
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
        L2a:
            ᛸᲇᛱᛵ r7 = new ᛸᲇᛱᛵ
            java.lang.String r3 = r3.mo789()
            ᛸᲈᛸᲈ r5 = r5.f5376
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected to find an object with property "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " in path "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " but found '"
            r0.append(r3)
            r0.append(r6)
            java.lang.String r3 = "'. This is not a json object according to the JsonProvider: '"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = "'."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r7.<init>(r3)
            throw r7
        L69:
            java.util.List r5 = r3.f10253
            int r0 = r5.size()
            r1 = 1
            if (r0 != r1) goto L73
            goto L7f
        L73:
            boolean r0 = r3.m3196()
            if (r0 == 0) goto L83
            int r0 = r5.size()
            if (r0 <= r1) goto L83
        L7f:
            r3.m3197(r4, r6, r7, r5)
            return
        L83:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r1 = 0
            r0.add(r1)
            java.util.Iterator r5 = r5.iterator()
        L90:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto La4
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            r0.set(r2, r1)
            r3.m3197(r4, r6, r7, r0)
            goto L90
        La4:
            return
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.String mo789() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.String r1 = r3.f10254
            java.util.List r3 = r3.f10253
            java.lang.String r2 = ","
            java.lang.String r3 = defpackage.AbstractC1849.m3251(r2, r1, r3)
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // defpackage.AbstractC1804
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final boolean mo790() {
            r3 = this;
            java.util.List r0 = r3.f10253
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto La
            goto L16
        La:
            boolean r3 = r3.m3196()
            if (r3 == 0) goto L17
            int r3 = r0.size()
            if (r3 <= r2) goto L17
        L16:
            return r2
        L17:
            r3 = 0
            return r3
    }
}
