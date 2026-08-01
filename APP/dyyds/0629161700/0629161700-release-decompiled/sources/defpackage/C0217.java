package defpackage;

/* JADX INFO: renamed from: ᛱᲈᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0217 extends defpackage.AbstractC1709 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.InterfaceC0150 f1333 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean f1334;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final boolean f1335;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1003 f1336;

    static {
            java.lang.Class<ᛱᲈᛵᛶ> r0 = defpackage.C0217.class
            ᛱᛸᲀᛱ r0 = defpackage.AbstractC1011.m1965(r0)
            defpackage.C0217.f1333 = r0
            return
    }

    public C0217(java.lang.CharSequence r3, boolean r4) {
            r2 = this;
            java.lang.String r3 = r3.toString()
            r0 = 0
            ᲀᛳᛴᛵ[] r1 = new defpackage.InterfaceC1644[r0]
            ᛶᛱᛳᲁ r3 = defpackage.C0682.m1534(r3, r1)
            r2.<init>(r3, r0, r4)
            return
    }

    public C0217(defpackage.C1003 r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f1336 = r1
            r0.f1335 = r2
            r0.f1334 = r3
            ᛱᛸᲀᛱ r0 = defpackage.C0217.f1333
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.mo683(r1, r2)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.f1335
            ᛶᛱᛳᲁ r1 = r3.f1336
            if (r0 == 0) goto L20
            boolean r3 = r3.f1334
            if (r3 != 0) goto L20
            ᲀᛳᲁᛵ r3 = r1.f4461
            java.lang.String r3 = r3.toString()
            r0 = 2
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r0]
            java.lang.String r1 = "!"
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = defpackage.AbstractC1849.m3254(r0)
            return r3
        L20:
            ᲀᛳᲁᛵ r3 = r1.f4461
            java.lang.String r3 = r3.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.AbstractC1709 m791(defpackage.C1412 r5) {
            r4 = this;
            ᛶᲈᛵᛲ r0 = r5.f6184
            java.lang.String r1 = "Could not convert "
            boolean r2 = r4.f1335
            r3 = 0
            ᛶᛱᛳᲁ r4 = r4.f1336
            if (r2 == 0) goto L41
            ᛲᛶᛲᲁ r1 = defpackage.C1184.m2312()     // Catch: defpackage.C1579 -> L3e
            ᛸᲈᛸᲈ r0 = r0.f5376     // Catch: defpackage.C1579 -> L3e
            r1.f1616 = r0     // Catch: defpackage.C1579 -> L3e
            ᛸᛳᲇ r0 = defpackage.EnumC1463.f6486     // Catch: defpackage.C1579 -> L3e
            ᛸᛳᲇ[] r0 = new defpackage.EnumC1463[]{r0}     // Catch: defpackage.C1579 -> L3e
            java.lang.Object r2 = r1.f1618     // Catch: defpackage.C1579 -> L3e
            java.util.EnumSet r2 = (java.util.EnumSet) r2     // Catch: defpackage.C1579 -> L3e
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: defpackage.C1579 -> L3e
            r2.addAll(r0)     // Catch: defpackage.C1579 -> L3e
            ᛶᲈᛵᛲ r0 = r1.m965()     // Catch: defpackage.C1579 -> L3e
            java.lang.Object r1 = r5.f6185     // Catch: defpackage.C1579 -> L3e
            java.lang.Object r5 = r5.f6186     // Catch: defpackage.C1579 -> L3e
            ᛲᛷᛸ r4 = r4.m1958(r1, r5, r0)     // Catch: defpackage.C1579 -> L3e
            java.lang.Object r4 = r4.m995(r3)     // Catch: defpackage.C1579 -> L3e
            java.lang.Object r5 = defpackage.C1606.f7100     // Catch: defpackage.C1579 -> L3e
            if (r4 != r5) goto L3b
            ᲈᛸᛶᛶ r4 = defpackage.InterfaceC1196.f5399     // Catch: defpackage.C1579 -> L3e
            return r4
        L3b:
            ᲈᛸᛶᛶ r4 = defpackage.InterfaceC1196.f5401     // Catch: defpackage.C1579 -> L3e
            return r4
        L3e:
            ᲈᛸᛶᛶ r4 = defpackage.InterfaceC1196.f5399
            return r4
        L41:
            java.lang.Object r4 = r5.m2597(r4)     // Catch: defpackage.C1579 -> Le8
            ᛸᲈᛸᲈ r5 = r0.f5376     // Catch: defpackage.C1579 -> Le8
            r5.getClass()     // Catch: defpackage.C1579 -> Le8
            boolean r5 = r4 instanceof java.lang.Number     // Catch: defpackage.C1579 -> Le8
            if (r5 == 0) goto L58
            java.lang.String r4 = r4.toString()     // Catch: defpackage.C1579 -> Le8
            ᲇᲇᲈᲀ r5 = new ᲇᲇᲈᲀ     // Catch: defpackage.C1579 -> Le8
            r5.<init>(r4)     // Catch: defpackage.C1579 -> Le8
            return r5
        L58:
            boolean r5 = r4 instanceof java.lang.String     // Catch: defpackage.C1579 -> Le8
            if (r5 == 0) goto L66
            java.lang.String r4 = r4.toString()     // Catch: defpackage.C1579 -> Le8
            ᲇᛶᲀᲇ r5 = new ᲇᛶᲀᲇ     // Catch: defpackage.C1579 -> Le8
            r5.<init>(r4, r3)     // Catch: defpackage.C1579 -> Le8
            return r5
        L66:
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: defpackage.C1579 -> Le8
            if (r5 == 0) goto L7e
            java.lang.String r4 = r4.toString()     // Catch: defpackage.C1579 -> Le8
            java.lang.String r4 = r4.toString()     // Catch: defpackage.C1579 -> Le8
            boolean r4 = java.lang.Boolean.parseBoolean(r4)     // Catch: defpackage.C1579 -> Le8
            if (r4 == 0) goto L7b
            ᲈᛸᛶᛶ r4 = defpackage.InterfaceC1196.f5401     // Catch: defpackage.C1579 -> Le8
            return r4
        L7b:
            ᲈᛸᛶᛶ r4 = defpackage.InterfaceC1196.f5399     // Catch: defpackage.C1579 -> Le8
            return r4
        L7e:
            boolean r5 = r4 instanceof java.time.OffsetDateTime     // Catch: defpackage.C1579 -> Le8
            if (r5 == 0) goto L8c
            java.lang.String r4 = r4.toString()     // Catch: defpackage.C1579 -> Le8
            ᲀᲁᲁᛱ r5 = new ᲀᲁᲁᛱ     // Catch: defpackage.C1579 -> Le8
            r5.<init>(r4)     // Catch: defpackage.C1579 -> Le8
            return r5
        L8c:
            if (r4 != 0) goto L91
            ᲁᛵᛸᲇ r4 = defpackage.InterfaceC1196.f5400     // Catch: defpackage.C1579 -> Le8
            return r4
        L91:
            ᛸᲈᛸᲈ r5 = r0.f5376     // Catch: defpackage.C1579 -> Le8
            ᛱᲈᲇ r2 = r0.f5377     // Catch: defpackage.C1579 -> Le8
            r5.getClass()     // Catch: defpackage.C1579 -> Le8
            boolean r5 = r4 instanceof java.util.List     // Catch: defpackage.C1579 -> Le8
            if (r5 == 0) goto La8
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Object r4 = r2.m832(r4, r5, r0)     // Catch: defpackage.C1579 -> Le8
            ᛱᛳᲇᛱ r5 = new ᛱᛳᲇᛱ     // Catch: defpackage.C1579 -> Le8
            r5.<init>(r4)     // Catch: defpackage.C1579 -> Le8
            return r5
        La8:
            ᛸᲈᛸᲈ r5 = r0.f5376     // Catch: defpackage.C1579 -> Le8
            r5.getClass()     // Catch: defpackage.C1579 -> Le8
            boolean r5 = r4 instanceof java.util.Map     // Catch: defpackage.C1579 -> Le8
            if (r5 == 0) goto Lbd
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            java.lang.Object r4 = r2.m832(r4, r5, r0)     // Catch: defpackage.C1579 -> Le8
            ᛱᛳᲇᛱ r5 = new ᛱᛳᲇᛱ     // Catch: defpackage.C1579 -> Le8
            r5.<init>(r4)     // Catch: defpackage.C1579 -> Le8
            return r5
        Lbd:
            ᛸᛵᛳᲀ r5 = new ᛸᛵᛳᲀ     // Catch: defpackage.C1579 -> Le8
            java.lang.Class r0 = r4.getClass()     // Catch: defpackage.C1579 -> Le8
            java.lang.String r0 = r0.toString()     // Catch: defpackage.C1579 -> Le8
            java.lang.String r4 = r4.toString()     // Catch: defpackage.C1579 -> Le8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: defpackage.C1579 -> Le8
            r2.<init>(r1)     // Catch: defpackage.C1579 -> Le8
            r2.append(r0)     // Catch: defpackage.C1579 -> Le8
            java.lang.String r0 = ":"
            r2.append(r0)     // Catch: defpackage.C1579 -> Le8
            r2.append(r4)     // Catch: defpackage.C1579 -> Le8
            java.lang.String r4 = " to a ValueNode"
            r2.append(r4)     // Catch: defpackage.C1579 -> Le8
            java.lang.String r4 = r2.toString()     // Catch: defpackage.C1579 -> Le8
            r5.<init>(r4)     // Catch: defpackage.C1579 -> Le8
            throw r5     // Catch: defpackage.C1579 -> Le8
        Le8:
            ᛶᛸᛷ r4 = defpackage.InterfaceC1196.f5398
            return r4
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.Class mo483(defpackage.C1412 r1) {
            r0 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0217 mo792() {
            r0 = this;
            return r0
    }
}
