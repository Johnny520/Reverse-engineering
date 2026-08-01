package defpackage;

/* JADX INFO: renamed from: ᲁᲇᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1953 implements defpackage.InterfaceC0598 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.util.LinkedHashMap f8502;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8503;

    public /* synthetic */ C1953(java.util.LinkedHashMap r1, int r2) {
            r0 = this;
            r0.f8503 = r2
            r0.f8502 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0598
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final java.lang.Object mo617(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f8503
            r1 = 6
            r2 = 0
            ᲁᲀᛱᲁ r3 = defpackage.C1907.f8270
            java.util.LinkedHashMap r6 = r6.f8502
            switch(r0) {
                case 0: goto L145;
                case 1: goto Le8;
                case 2: goto Ld4;
                case 3: goto L77;
                case 4: goto L41;
                default: goto Lb;
            }
        Lb:
            ᲀᲀᛵᛸ r7 = (defpackage.C1741) r7
            r0 = -670337305321006(0xfffd9e54ef0961d2, double:NaN)
            java.lang.Object r7 = r7.f7704
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L1e
            r2 = r7
            java.util.List r2 = (java.util.List) r2
        L1e:
            if (r2 == 0) goto L40
            java.util.Iterator r7 = r2.iterator()
        L24:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r7.next()
            ᲇᛲᛱᛳ r1 = defpackage.C1993.f8629
            r4 = -670388844928558(0xfffd9e48ef0961d2, double:NaN)
            java.lang.String r2 = "homepage_home"
            r1.getClass()
            defpackage.C1993.m3393(r0, r6, r2)
            goto L24
        L40:
            return r3
        L41:
            ᲀᲀᛵᛸ r7 = (defpackage.C1741) r7
            r0 = -669847679049262(0xfffd9ec6ef0961d2, double:NaN)
            java.lang.Object r7 = r7.f7704
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L54
            r2 = r7
            java.util.List r2 = (java.util.List) r2
        L54:
            if (r2 == 0) goto L76
            java.util.Iterator r7 = r2.iterator()
        L5a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r7.next()
            ᲇᛲᛱᛳ r1 = defpackage.C1993.f8629
            r4 = -669899218656814(0xfffd9ebaef0961d2, double:NaN)
            java.lang.String r2 = "home_top"
            r1.getClass()
            defpackage.C1993.m3393(r0, r6, r2)
            goto L5a
        L76:
            return r3
        L77:
            ᲀᲀᛵᛸ r7 = (defpackage.C1741) r7
            r4 = -670496219110958(0xfffd9e2fef0961d2, double:NaN)
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r0.getClass()
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5161
            ᲁᛷᛶᛶ[] r2 = defpackage.C1141.f5221
            r4 = 1
            r2 = r2[r4]
            java.lang.Object r0 = r0.m3169(r2)
            java.lang.String r0 = (java.lang.String) r0
            r4 = -670564938587694(0xfffd9e1fef0961d2, double:NaN)
            java.lang.String r2 = "|"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.util.List r0 = defpackage.AbstractC1347.m2519(r0, r2, r1)
            java.lang.Object r1 = r7.f7704
            r4 = -670573528522286(0xfffd9e1def0961d2, double:NaN)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lb9:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ld1
            java.lang.Object r4 = r1.next()
            java.lang.Object r5 = r6.get(r4)
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto Lb9
            r2.add(r4)
            goto Lb9
        Ld1:
            r7.f7704 = r2
            return r3
        Ld4:
            ᛸᲀᛸᛴ r7 = (defpackage.C1561) r7
            r0 = -670448974470702(0xfffd9e3aef0961d2, double:NaN)
            ᲁᲇᲇᲀ r0 = new ᲁᲇᲇᲀ
            r1 = 5
            r0.<init>(r6, r1)
            r7.m2828(r0)
            return r3
        Le8:
            ᲀᲀᛵᛸ r7 = (defpackage.C1741) r7
            r4 = -669985118002734(0xfffd9ea6ef0961d2, double:NaN)
            ᛶᲀᛵ r0 = defpackage.C1141.f5173
            r0.getClass()
            ᲀᲇᛸᛶ r0 = defpackage.C1141.f5172
            ᲁᛷᛶᛶ[] r2 = defpackage.C1141.f5221
            r4 = 0
            r2 = r2[r4]
            java.lang.Object r0 = r0.m3169(r2)
            java.lang.String r0 = (java.lang.String) r0
            r4 = -670053837479470(0xfffd9e96ef0961d2, double:NaN)
            java.lang.String r2 = "|"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.util.List r0 = defpackage.AbstractC1347.m2519(r0, r2, r1)
            java.lang.Object r1 = r7.f7704
            r4 = -670062427414062(0xfffd9e94ef0961d2, double:NaN)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L12a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L142
            java.lang.Object r4 = r1.next()
            java.lang.Object r5 = r6.get(r4)
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L12a
            r2.add(r4)
            goto L12a
        L142:
            r7.f7704 = r2
            return r3
        L145:
            ᛸᲀᛸᛴ r7 = (defpackage.C1561) r7
            r0 = -669937873362478(0xfffd9eb1ef0961d2, double:NaN)
            ᲁᲇᲇᲀ r0 = new ᲁᲇᲇᲀ
            r1 = 4
            r0.<init>(r6, r1)
            r7.m2828(r0)
            return r3
    }
}
