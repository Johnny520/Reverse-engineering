package defpackage;

/* JADX INFO: renamed from: ᛴᲇᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0788 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f3661;

    public /* synthetic */ C0788(int r1) {
            r0 = this;
            r0.f3661 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static boolean m1710(defpackage.C0716 r1, defpackage.AbstractC1709 r2) {
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.C0452
            if (r0 != 0) goto L8
            goto L2e
        L8:
            ᛳᛴᛳᲈ r2 = (defpackage.C0452) r2
            java.util.regex.Pattern r1 = r1.f3369
            java.util.ArrayList r2 = r2.f2227
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.next()
            ᲀᛷᛶ r0 = (defpackage.AbstractC1709) r0
            java.lang.String r0 = m1711(r0)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L12
            r1 = 1
            return r1
        L2e:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m1711(defpackage.AbstractC1709 r1) {
            r1.getClass()
            boolean r0 = r1 instanceof defpackage.C2074
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof defpackage.C2156
            if (r0 == 0) goto Lc
            goto L1c
        Lc:
            boolean r0 = r1 instanceof defpackage.C2308
            if (r0 == 0) goto L19
            ᲈᛸᛶᛶ r1 = (defpackage.C2308) r1
            java.lang.Boolean r1 = r1.f9764
            java.lang.String r1 = r1.toString()
            return r1
        L19:
            java.lang.String r1 = ""
            return r1
        L1c:
            ᲇᛶᲀᲇ r1 = r1.mo3099()
            java.lang.String r1 = r1.f8904
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m1712(defpackage.AbstractC1709 r4, defpackage.AbstractC1709 r5, defpackage.C1412 r6) {
            r3 = this;
            int r3 = r3.f3661
            ᛴᛲᛸᛲ r0 = defpackage.EnumC0629.f3120
            r1 = 1
            r2 = 0
            switch(r3) {
                case 0: goto L4c4;
                case 1: goto L45b;
                case 2: goto L423;
                case 3: goto L3bc;
                case 4: goto L38c;
                case 5: goto L35c;
                case 6: goto L309;
                case 7: goto L2b6;
                case 8: goto L291;
                case 9: goto L23e;
                case 10: goto L1eb;
                case 11: goto L183;
                case 12: goto L175;
                case 13: goto L165;
                case 14: goto L15a;
                case 15: goto Ldd;
                case 16: goto L9c;
                case 17: goto L44;
                case 18: goto L35;
                case 19: goto L19;
                default: goto L9;
            }
        L9:
            java.util.HashMap r3 = defpackage.AbstractC0955.f4261
            ᛴᛲᛸᛲ r0 = defpackage.EnumC0629.f3123
            java.lang.Object r3 = r3.get(r0)
            ᛴᲇᲇᛱ r3 = (defpackage.C0788) r3
            boolean r3 = r3.m1712(r4, r5, r6)
        L17:
            r3 = r3 ^ r1
            return r3
        L19:
            java.lang.Class r3 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L28
            goto L34
        L28:
            java.util.HashMap r3 = defpackage.AbstractC0955.f4261
            java.lang.Object r3 = r3.get(r0)
            ᛴᲇᲇᛱ r3 = (defpackage.C0788) r3
            boolean r2 = r3.m1712(r4, r5, r6)
        L34:
            return r2
        L35:
            ᛶᲈᛷᲈ r3 = r5.mo2320()
            java.lang.Class r3 = r3.f5384
            java.lang.Class r4 = r4.mo483(r6)
            if (r3 != r4) goto L42
            goto L43
        L42:
            r1 = r2
        L43:
            return r1
        L44:
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C0063
            if (r3 == 0) goto L5e
            ᛱᛳᲇᛱ r5 = (defpackage.C0063) r5
            ᲀᛷᛶ r3 = r5.m480()
            r3.getClass()
            boolean r5 = r3 instanceof defpackage.C1127
            if (r5 == 0) goto L59
            goto L9a
        L59:
            ᛳᛴᛳᲈ r3 = r3.mo1228()
            goto L62
        L5e:
            ᛳᛴᛳᲈ r3 = r5.mo1228()
        L62:
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.C0063
            if (r5 == 0) goto L7c
            ᛱᛳᲇᛱ r4 = (defpackage.C0063) r4
            ᲀᛷᛶ r4 = r4.m480()
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.C1127
            if (r5 == 0) goto L77
            goto L9a
        L77:
            ᛳᛴᛳᲈ r4 = r4.mo1228()
            goto L80
        L7c:
            ᛳᛴᛳᲈ r4 = r4.mo1228()
        L80:
            java.util.ArrayList r4 = r4.f2227
            java.util.Iterator r4 = r4.iterator()
        L86:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9b
            java.lang.Object r5 = r4.next()
            ᲀᛷᛶ r5 = (defpackage.AbstractC1709) r5
            java.util.ArrayList r6 = r3.f2227
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L86
        L9a:
            r1 = r2
        L9b:
            return r1
        L9c:
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2156
            if (r3 != 0) goto La4
            goto Ldb
        La4:
            ᲇᲇᲈᲀ r5 = (defpackage.C2156) r5
            java.math.BigDecimal r3 = r5.f9175
            int r3 = r3.intValue()
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.C2074
            if (r5 == 0) goto Lbe
            ᲇᛶᲀᲇ r4 = (defpackage.C2074) r4
            java.lang.String r4 = r4.f8904
            int r4 = r4.length()
            if (r4 != r3) goto Ldb
            goto Ldc
        Lbe:
            boolean r5 = r4 instanceof defpackage.C0063
            if (r5 == 0) goto Ldb
            ᛱᛳᲇᛱ r4 = (defpackage.C0063) r4
            java.lang.Object r5 = r4.m481()
            boolean r5 = r5 instanceof java.util.List
            if (r5 == 0) goto Ld7
            java.lang.Object r4 = r4.m481()
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            goto Ld8
        Ld7:
            r4 = -1
        Ld8:
            if (r4 != r3) goto Ldb
            goto Ldc
        Ldb:
            r1 = r2
        Ldc:
            return r1
        Ldd:
            r4.getClass()
            boolean r3 = r4 instanceof defpackage.C0716
            r5.getClass()
            boolean r6 = r5 instanceof defpackage.C0716
            r6 = r6 ^ r3
            if (r6 != 0) goto Lec
            goto L159
        Lec:
            if (r3 == 0) goto L122
            boolean r3 = r5 instanceof defpackage.C0452
            if (r3 != 0) goto L113
            boolean r3 = r5 instanceof defpackage.C0063
            if (r3 == 0) goto L102
            r3 = r5
            ᛱᛳᲇᛱ r3 = (defpackage.C0063) r3
            java.lang.Object r3 = r3.m481()
            boolean r3 = r3 instanceof java.util.List
            if (r3 == 0) goto L102
            goto L113
        L102:
            ᛴᛷᲈᛱ r4 = (defpackage.C0716) r4
            java.lang.String r3 = m1711(r5)
            java.util.regex.Pattern r4 = r4.f3369
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r2 = r3.matches()
            goto L159
        L113:
            ᛴᛷᲈᛱ r4 = (defpackage.C0716) r4
            ᛱᛳᲇᛱ r3 = r5.mo482()
            ᲀᛷᛶ r3 = r3.m480()
            boolean r2 = m1710(r4, r3)
            goto L159
        L122:
            boolean r3 = r4 instanceof defpackage.C0452
            if (r3 != 0) goto L149
            boolean r3 = r4 instanceof defpackage.C0063
            if (r3 == 0) goto L136
            r3 = r4
            ᛱᛳᲇᛱ r3 = (defpackage.C0063) r3
            java.lang.Object r3 = r3.m481()
            boolean r3 = r3 instanceof java.util.List
            if (r3 == 0) goto L136
            goto L149
        L136:
            ᛴᛷᲈᛱ r3 = r5.mo1623()
            java.lang.String r4 = m1711(r4)
            java.util.regex.Pattern r3 = r3.f3369
            java.util.regex.Matcher r3 = r3.matcher(r4)
            boolean r2 = r3.matches()
            goto L159
        L149:
            ᛴᛷᲈᛱ r3 = r5.mo1623()
            ᛱᛳᲇᛱ r4 = r4.mo482()
            ᲀᛷᛶ r4 = r4.m480()
            boolean r2 = m1710(r3, r4)
        L159:
            return r2
        L15a:
            r5.getClass()
            ᛷᛴᛴᛸ r3 = new ᛷᛴᛴᛸ
            java.lang.String r4 = "Expected predicate node"
            r3.<init>(r4)
            throw r3
        L165:
            java.util.HashMap r3 = defpackage.AbstractC0955.f4261
            ᛴᛲᛸᛲ r0 = defpackage.EnumC0629.f3115
            java.lang.Object r3 = r3.get(r0)
            ᛴᲇᲇᛱ r3 = (defpackage.C0788) r3
            boolean r3 = r3.m1712(r4, r5, r6)
            goto L17
        L175:
            java.util.HashMap r3 = defpackage.AbstractC0955.f4261
            java.lang.Object r3 = r3.get(r0)
            ᛴᲇᲇᛱ r3 = (defpackage.C0788) r3
            boolean r3 = r3.m1712(r4, r5, r6)
            goto L17
        L183:
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C0063
            if (r3 == 0) goto L19d
            ᛱᛳᲇᛱ r5 = (defpackage.C0063) r5
            ᲀᛷᛶ r3 = r5.m480()
            r3.getClass()
            boolean r5 = r3 instanceof defpackage.C1127
            if (r5 == 0) goto L198
            goto L1e9
        L198:
            ᛳᛴᛳᲈ r3 = r3.mo1228()
            goto L1a1
        L19d:
            ᛳᛴᛳᲈ r3 = r5.mo1228()
        L1a1:
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.C0063
            if (r5 == 0) goto L1bb
            ᛱᛳᲇᛱ r4 = (defpackage.C0063) r4
            ᲀᛷᛶ r4 = r4.m480()
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.C1127
            if (r5 == 0) goto L1b6
            goto L1e9
        L1b6:
            ᛳᛴᛳᲈ r4 = r4.mo1228()
            goto L1bf
        L1bb:
            ᛳᛴᛳᲈ r4 = r4.mo1228()
        L1bf:
            java.util.ArrayList r4 = r4.f2227
            java.util.Iterator r4 = r4.iterator()
        L1c5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1ea
            java.lang.Object r5 = r4.next()
            ᲀᛷᛶ r5 = (defpackage.AbstractC1709) r5
            java.util.ArrayList r6 = r3.f2227
            java.util.Iterator r6 = r6.iterator()
        L1d7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L1c5
            java.lang.Object r0 = r6.next()
            ᲀᛷᛶ r0 = (defpackage.AbstractC1709) r0
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L1d7
        L1e9:
            r1 = r2
        L1ea:
            return r1
        L1eb:
            r4.getClass()
            boolean r3 = r4 instanceof defpackage.C2156
            if (r3 == 0) goto L208
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2156
            if (r3 == 0) goto L208
            ᲇᲇᲈᲀ r4 = (defpackage.C2156) r4
            java.math.BigDecimal r3 = r4.f9175
            ᲇᲇᲈᲀ r5 = (defpackage.C2156) r5
            java.math.BigDecimal r4 = r5.f9175
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L23c
            goto L23d
        L208:
            boolean r3 = r4 instanceof defpackage.C2074
            if (r3 == 0) goto L222
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2074
            if (r3 == 0) goto L222
            ᲇᛶᲀᲇ r4 = (defpackage.C2074) r4
            java.lang.String r3 = r4.f8904
            ᲇᛶᲀᲇ r5 = (defpackage.C2074) r5
            java.lang.String r4 = r5.f8904
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L23c
            goto L23d
        L222:
            boolean r3 = r4 instanceof defpackage.C1760
            if (r3 == 0) goto L23c
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C1760
            if (r3 == 0) goto L23c
            ᲀᲁᲁᛱ r4 = (defpackage.C1760) r4
            java.time.OffsetDateTime r3 = r4.f7777
            ᲀᲁᲁᛱ r5 = (defpackage.C1760) r5
            java.time.OffsetDateTime r4 = r5.f7777
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L23c
            goto L23d
        L23c:
            r1 = r2
        L23d:
            return r1
        L23e:
            r4.getClass()
            boolean r3 = r4 instanceof defpackage.C2156
            if (r3 == 0) goto L25b
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2156
            if (r3 == 0) goto L25b
            ᲇᲇᲈᲀ r4 = (defpackage.C2156) r4
            java.math.BigDecimal r3 = r4.f9175
            ᲇᲇᲈᲀ r5 = (defpackage.C2156) r5
            java.math.BigDecimal r4 = r5.f9175
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L28f
            goto L290
        L25b:
            boolean r3 = r4 instanceof defpackage.C2074
            if (r3 == 0) goto L275
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2074
            if (r3 == 0) goto L275
            ᲇᛶᲀᲇ r4 = (defpackage.C2074) r4
            java.lang.String r3 = r4.f8904
            ᲇᛶᲀᲇ r5 = (defpackage.C2074) r5
            java.lang.String r4 = r5.f8904
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L28f
            goto L290
        L275:
            boolean r3 = r4 instanceof defpackage.C1760
            if (r3 == 0) goto L28f
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C1760
            if (r3 == 0) goto L28f
            ᲀᲁᲁᛱ r4 = (defpackage.C1760) r4
            java.time.OffsetDateTime r3 = r4.f7777
            ᲀᲁᲁᛱ r5 = (defpackage.C1760) r5
            java.time.OffsetDateTime r4 = r5.f7777
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L28f
            goto L290
        L28f:
            r1 = r2
        L290:
            return r1
        L291:
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C0063
            if (r3 == 0) goto L2ab
            ᛱᛳᲇᛱ r5 = (defpackage.C0063) r5
            ᲀᛷᛶ r3 = r5.m480()
            r3.getClass()
            boolean r5 = r3 instanceof defpackage.C1127
            if (r5 == 0) goto L2a6
            goto L2b5
        L2a6:
            ᛳᛴᛳᲈ r3 = r3.mo1228()
            goto L2af
        L2ab:
            ᛳᛴᛳᲈ r3 = r5.mo1228()
        L2af:
            java.util.ArrayList r3 = r3.f2227
            boolean r2 = r3.contains(r4)
        L2b5:
            return r2
        L2b6:
            r4.getClass()
            boolean r3 = r4 instanceof defpackage.C2156
            if (r3 == 0) goto L2d3
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2156
            if (r3 == 0) goto L2d3
            ᲇᲇᲈᲀ r4 = (defpackage.C2156) r4
            java.math.BigDecimal r3 = r4.f9175
            ᲇᲇᲈᲀ r5 = (defpackage.C2156) r5
            java.math.BigDecimal r4 = r5.f9175
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L307
            goto L308
        L2d3:
            boolean r3 = r4 instanceof defpackage.C2074
            if (r3 == 0) goto L2ed
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2074
            if (r3 == 0) goto L2ed
            ᲇᛶᲀᲇ r4 = (defpackage.C2074) r4
            java.lang.String r3 = r4.f8904
            ᲇᛶᲀᲇ r5 = (defpackage.C2074) r5
            java.lang.String r4 = r5.f8904
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L307
            goto L308
        L2ed:
            boolean r3 = r4 instanceof defpackage.C1760
            if (r3 == 0) goto L307
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C1760
            if (r3 == 0) goto L307
            ᲀᲁᲁᛱ r4 = (defpackage.C1760) r4
            java.time.OffsetDateTime r3 = r4.f7777
            ᲀᲁᲁᛱ r5 = (defpackage.C1760) r5
            java.time.OffsetDateTime r4 = r5.f7777
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L307
            goto L308
        L307:
            r1 = r2
        L308:
            return r1
        L309:
            r4.getClass()
            boolean r3 = r4 instanceof defpackage.C2156
            if (r3 == 0) goto L326
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2156
            if (r3 == 0) goto L326
            ᲇᲇᲈᲀ r4 = (defpackage.C2156) r4
            java.math.BigDecimal r3 = r4.f9175
            ᲇᲇᲈᲀ r5 = (defpackage.C2156) r5
            java.math.BigDecimal r4 = r5.f9175
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L35a
            goto L35b
        L326:
            boolean r3 = r4 instanceof defpackage.C2074
            if (r3 == 0) goto L340
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2074
            if (r3 == 0) goto L340
            ᲇᛶᲀᲇ r4 = (defpackage.C2074) r4
            java.lang.String r3 = r4.f8904
            ᲇᛶᲀᲇ r5 = (defpackage.C2074) r5
            java.lang.String r4 = r5.f8904
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L35a
            goto L35b
        L340:
            boolean r3 = r4 instanceof defpackage.C1760
            if (r3 == 0) goto L35a
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C1760
            if (r3 == 0) goto L35a
            ᲀᲁᲁᛱ r4 = (defpackage.C1760) r4
            java.time.OffsetDateTime r3 = r4.f7777
            ᲀᲁᲁᛱ r5 = (defpackage.C1760) r5
            java.time.OffsetDateTime r4 = r5.f7777
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L35a
            goto L35b
        L35a:
            r1 = r2
        L35b:
            return r1
        L35c:
            r4.getClass()
            boolean r3 = r4 instanceof defpackage.C2308
            if (r3 != 0) goto L373
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2308
            if (r3 == 0) goto L36b
            goto L373
        L36b:
            ᛸᛵᛳᲀ r3 = new ᛸᛵᛳᲀ
            java.lang.String r4 = "Failed to evaluate exists expression"
            r3.<init>(r4)
            throw r3
        L373:
            ᲈᛸᛶᛶ r3 = r4.mo3102()
            java.lang.Boolean r3 = r3.f9764
            boolean r3 = r3.booleanValue()
            ᲈᛸᛶᛶ r4 = r5.mo3102()
            java.lang.Boolean r4 = r4.f9764
            boolean r4 = r4.booleanValue()
            if (r3 != r4) goto L38a
            goto L38b
        L38a:
            r1 = r2
        L38b:
            return r1
        L38c:
            r4.getClass()
            boolean r3 = r4 instanceof defpackage.C0063
            if (r3 == 0) goto L3b7
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C0063
            if (r3 == 0) goto L3b7
            ᛱᛳᲇᛱ r4 = (defpackage.C0063) r4
            ᛱᛳᲇᛱ r5 = (defpackage.C0063) r5
            if (r4 != r5) goto L3a1
            goto L3bb
        L3a1:
            java.lang.Object r3 = r4.f719
            if (r3 == 0) goto L3b0
            java.lang.Object r4 = r5.m481()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3bb
            goto L3b5
        L3b0:
            java.lang.Object r3 = r5.f719
            if (r3 != 0) goto L3b5
            goto L3bb
        L3b5:
            r1 = r2
            goto L3bb
        L3b7:
            boolean r1 = r4.equals(r5)
        L3bb:
            return r1
        L3bc:
            r4.getClass()
            boolean r3 = r4 instanceof defpackage.C2074
            if (r3 == 0) goto L3d8
            ᲇᛶᲀᲇ r4 = (defpackage.C2074) r4
            java.lang.String r3 = r4.f8904
            boolean r3 = r3.isEmpty()
            ᲈᛸᛶᛶ r4 = r5.mo3102()
            java.lang.Boolean r4 = r4.f9764
            boolean r4 = r4.booleanValue()
            if (r3 != r4) goto L421
            goto L422
        L3d8:
            boolean r3 = r4 instanceof defpackage.C0063
            if (r3 == 0) goto L421
            ᛱᛳᲇᛱ r4 = (defpackage.C0063) r4
            java.lang.Object r3 = r4.m481()
            boolean r3 = r3 instanceof java.util.List
            if (r3 != 0) goto L407
            java.lang.Object r3 = r4.m481()
            boolean r3 = r3 instanceof java.util.Map
            if (r3 == 0) goto L3ef
            goto L407
        L3ef:
            java.lang.Object r3 = r4.m481()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L403
            java.lang.Object r3 = r4.m481()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 != 0) goto L405
        L403:
            r3 = r1
            goto L414
        L405:
            r3 = r2
            goto L414
        L407:
            java.lang.Object r3 = r4.m481()
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            if (r3 != 0) goto L405
            goto L403
        L414:
            ᲈᛸᛶᛶ r4 = r5.mo3102()
            java.lang.Boolean r4 = r4.f9764
            boolean r4 = r4.booleanValue()
            if (r3 != r4) goto L421
            goto L422
        L421:
            r1 = r2
        L422:
            return r1
        L423:
            r4.getClass()
            boolean r3 = r4 instanceof defpackage.C2074
            if (r3 == 0) goto L43e
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C2074
            if (r3 == 0) goto L43e
            ᲇᛶᲀᲇ r4 = (defpackage.C2074) r4
            ᲇᛶᲀᲇ r5 = (defpackage.C2074) r5
            java.lang.String r3 = r5.f8904
            java.lang.String r4 = r4.f8904
            boolean r2 = r4.contains(r3)
            goto L45a
        L43e:
            boolean r3 = r4 instanceof defpackage.C0063
            if (r3 == 0) goto L45a
            ᛱᛳᲇᛱ r4 = (defpackage.C0063) r4
            ᲀᛷᛶ r3 = r4.m480()
            r3.getClass()
            boolean r4 = r3 instanceof defpackage.C1127
            if (r4 == 0) goto L450
            goto L45a
        L450:
            ᛳᛴᛳᲈ r3 = r3.mo1228()
            java.util.ArrayList r3 = r3.f2227
            boolean r2 = r3.contains(r5)
        L45a:
            return r2
        L45b:
            r5.getClass()
            boolean r3 = r5 instanceof defpackage.C0063
            if (r3 == 0) goto L475
            ᛱᛳᲇᛱ r5 = (defpackage.C0063) r5
            ᲀᛷᛶ r3 = r5.m480()
            r3.getClass()
            boolean r5 = r3 instanceof defpackage.C1127
            if (r5 == 0) goto L470
            goto L4c2
        L470:
            ᛳᛴᛳᲈ r3 = r3.mo1228()
            goto L479
        L475:
            ᛳᛴᛳᲈ r3 = r5.mo1228()
        L479:
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.C0063
            if (r5 == 0) goto L493
            ᛱᛳᲇᛱ r4 = (defpackage.C0063) r4
            ᲀᛷᛶ r4 = r4.m480()
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.C1127
            if (r5 == 0) goto L48e
            goto L4c2
        L48e:
            ᛳᛴᛳᲈ r4 = r4.mo1228()
            goto L497
        L493:
            ᛳᛴᛳᲈ r4 = r4.mo1228()
        L497:
            java.util.ArrayList r4 = r4.f2227
            java.util.Iterator r4 = r4.iterator()
        L49d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4c2
            java.lang.Object r5 = r4.next()
            ᲀᛷᛶ r5 = (defpackage.AbstractC1709) r5
            java.util.ArrayList r6 = r3.f2227
            java.util.Iterator r6 = r6.iterator()
        L4af:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L49d
            java.lang.Object r0 = r6.next()
            ᲀᛷᛶ r0 = (defpackage.AbstractC1709) r0
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4af
            goto L4c3
        L4c2:
            r1 = r2
        L4c3:
            return r1
        L4c4:
            ᛳᛴᛳᲈ r3 = r5.mo1228()
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.C0063
            if (r5 == 0) goto L4f8
            ᛱᛳᲇᛱ r4 = (defpackage.C0063) r4
            ᲀᛷᛶ r4 = r4.m480()
            r4.getClass()
            boolean r5 = r4 instanceof defpackage.C0452
            if (r5 == 0) goto L4f9
            ᛳᛴᛳᲈ r4 = (defpackage.C0452) r4
            java.util.ArrayList r3 = r3.f2227
            java.util.Iterator r3 = r3.iterator()
        L4e4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4f9
            java.lang.Object r5 = r3.next()
            ᲀᛷᛶ r5 = (defpackage.AbstractC1709) r5
            java.util.ArrayList r6 = r4.f2227
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L4e4
        L4f8:
            r1 = r2
        L4f9:
            return r1
    }
}
