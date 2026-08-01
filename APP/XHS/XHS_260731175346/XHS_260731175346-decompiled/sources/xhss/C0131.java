package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛲᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0131 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f590;

    public /* synthetic */ C0131(int r1) {
            r0 = this;
            r0.f590 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.lang.String m361(xhss.AbstractC0052 r1) {
            r1.getClass()
            boolean r0 = r1 instanceof xhss.C1192
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof xhss.C0787
            if (r0 == 0) goto Lc
            goto L1c
        Lc:
            boolean r0 = r1 instanceof xhss.C0933
            if (r0 == 0) goto L19
            xhss.ᲁᛳᛲᛸ r1 = (xhss.C0933) r1
            java.lang.Boolean r1 = r1.f3020
            java.lang.String r1 = r1.toString()
            return r1
        L19:
            java.lang.String r1 = ""
            return r1
        L1c:
            xhss.ᲈᲇᛱᛶ r1 = r1.mo166()
            java.lang.String r1 = r1.f3847
            return r1
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static boolean m362(xhss.C0085 r1, xhss.AbstractC0052 r2) {
            r2.getClass()
            boolean r0 = r2 instanceof xhss.C0069
            if (r0 != 0) goto L8
            goto L2e
        L8:
            xhss.ᛱᛸᛱᲁ r2 = (xhss.C0069) r2
            java.util.regex.Pattern r1 = r1.f430
            java.util.ArrayList r2 = r2.f367
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.next()
            xhss.ᛱᛶᛶᛱ r0 = (xhss.AbstractC0052) r0
            java.lang.String r0 = m361(r0)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L12
            r1 = 1
            return r1
        L2e:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean m363(xhss.AbstractC0052 r4, xhss.AbstractC0052 r5, xhss.C1180 r6) {
            r3 = this;
            int r3 = r3.f590
            xhss.ᲈᲈᛳᛳ r0 = xhss.EnumC1203.f3897
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
            java.util.HashMap r3 = xhss.AbstractC1040.f3360
            xhss.ᲈᲈᛳᛳ r0 = xhss.EnumC1203.f3910
            java.lang.Object r3 = r3.get(r0)
            xhss.ᛲᛲᛴᛲ r3 = (xhss.C0131) r3
            boolean r3 = r3.m363(r4, r5, r6)
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
            java.util.HashMap r3 = xhss.AbstractC1040.f3360
            java.lang.Object r3 = r3.get(r0)
            xhss.ᛲᛲᛴᛲ r3 = (xhss.C0131) r3
            boolean r2 = r3.m363(r4, r5, r6)
        L34:
            return r2
        L35:
            xhss.ᲇᛴᲁᛷ r3 = r5.mo161()
            java.lang.Class r3 = r3.f3338
            java.lang.Class r4 = r4.mo167(r6)
            if (r3 != r4) goto L42
            goto L43
        L42:
            r1 = r2
        L43:
            return r1
        L44:
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0245
            if (r3 == 0) goto L5e
            xhss.ᛳᛲᲀᛷ r5 = (xhss.C0245) r5
            xhss.ᛱᛶᛶᛱ r3 = r5.m546()
            r3.getClass()
            boolean r5 = r3 instanceof xhss.C1175
            if (r5 == 0) goto L59
            goto L9a
        L59:
            xhss.ᛱᛸᛱᲁ r3 = r3.mo165()
            goto L62
        L5e:
            xhss.ᛱᛸᛱᲁ r3 = r5.mo165()
        L62:
            r4.getClass()
            boolean r5 = r4 instanceof xhss.C0245
            if (r5 == 0) goto L7c
            xhss.ᛳᛲᲀᛷ r4 = (xhss.C0245) r4
            xhss.ᛱᛶᛶᛱ r4 = r4.m546()
            r4.getClass()
            boolean r5 = r4 instanceof xhss.C1175
            if (r5 == 0) goto L77
            goto L9a
        L77:
            xhss.ᛱᛸᛱᲁ r4 = r4.mo165()
            goto L80
        L7c:
            xhss.ᛱᛸᛱᲁ r4 = r4.mo165()
        L80:
            java.util.ArrayList r4 = r4.f367
            java.util.Iterator r4 = r4.iterator()
        L86:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9b
            java.lang.Object r5 = r4.next()
            xhss.ᛱᛶᛶᛱ r5 = (xhss.AbstractC0052) r5
            java.util.ArrayList r6 = r3.f367
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L86
        L9a:
            r1 = r2
        L9b:
            return r1
        L9c:
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0787
            if (r3 != 0) goto La4
            goto Ldb
        La4:
            xhss.ᛸᛷᲈᛶ r5 = (xhss.C0787) r5
            java.math.BigDecimal r3 = r5.f2572
            int r3 = r3.intValue()
            r4.getClass()
            boolean r5 = r4 instanceof xhss.C1192
            if (r5 == 0) goto Lbe
            xhss.ᲈᲇᛱᛶ r4 = (xhss.C1192) r4
            java.lang.String r4 = r4.f3847
            int r4 = r4.length()
            if (r4 != r3) goto Ldb
            goto Ldc
        Lbe:
            boolean r5 = r4 instanceof xhss.C0245
            if (r5 == 0) goto Ldb
            xhss.ᛳᛲᲀᛷ r4 = (xhss.C0245) r4
            java.lang.Object r5 = r4.m545()
            boolean r5 = r5 instanceof java.util.List
            if (r5 == 0) goto Ld7
            java.lang.Object r4 = r4.m545()
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
            boolean r3 = r4 instanceof xhss.C0085
            r5.getClass()
            boolean r6 = r5 instanceof xhss.C0085
            r6 = r6 ^ r3
            if (r6 != 0) goto Lec
            goto L159
        Lec:
            if (r3 == 0) goto L122
            boolean r3 = r5 instanceof xhss.C0069
            if (r3 != 0) goto L113
            boolean r3 = r5 instanceof xhss.C0245
            if (r3 == 0) goto L102
            r3 = r5
            xhss.ᛳᛲᲀᛷ r3 = (xhss.C0245) r3
            java.lang.Object r3 = r3.m545()
            boolean r3 = r3 instanceof java.util.List
            if (r3 == 0) goto L102
            goto L113
        L102:
            xhss.ᛱᲀᛴᛴ r4 = (xhss.C0085) r4
            java.lang.String r3 = m361(r5)
            java.util.regex.Pattern r4 = r4.f430
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r2 = r3.matches()
            goto L159
        L113:
            xhss.ᛱᲀᛴᛴ r4 = (xhss.C0085) r4
            xhss.ᛳᛲᲀᛷ r3 = r5.mo162()
            xhss.ᛱᛶᛶᛱ r3 = r3.m546()
            boolean r2 = m362(r4, r3)
            goto L159
        L122:
            boolean r3 = r4 instanceof xhss.C0069
            if (r3 != 0) goto L149
            boolean r3 = r4 instanceof xhss.C0245
            if (r3 == 0) goto L136
            r3 = r4
            xhss.ᛳᛲᲀᛷ r3 = (xhss.C0245) r3
            java.lang.Object r3 = r3.m545()
            boolean r3 = r3 instanceof java.util.List
            if (r3 == 0) goto L136
            goto L149
        L136:
            xhss.ᛱᲀᛴᛴ r3 = r5.mo168()
            java.lang.String r4 = m361(r4)
            java.util.regex.Pattern r3 = r3.f430
            java.util.regex.Matcher r3 = r3.matcher(r4)
            boolean r2 = r3.matches()
            goto L159
        L149:
            xhss.ᛱᲀᛴᛴ r3 = r5.mo168()
            xhss.ᛳᛲᲀᛷ r4 = r4.mo162()
            xhss.ᛱᛶᛶᛱ r4 = r4.m546()
            boolean r2 = m362(r3, r4)
        L159:
            return r2
        L15a:
            r5.getClass()
            xhss.ᲁᲀᛳ r3 = new xhss.ᲁᲀᛳ
            java.lang.String r4 = "Expected predicate node"
            r3.<init>(r4)
            throw r3
        L165:
            java.util.HashMap r3 = xhss.AbstractC1040.f3360
            xhss.ᲈᲈᛳᛳ r0 = xhss.EnumC1203.f3903
            java.lang.Object r3 = r3.get(r0)
            xhss.ᛲᛲᛴᛲ r3 = (xhss.C0131) r3
            boolean r3 = r3.m363(r4, r5, r6)
            goto L17
        L175:
            java.util.HashMap r3 = xhss.AbstractC1040.f3360
            java.lang.Object r3 = r3.get(r0)
            xhss.ᛲᛲᛴᛲ r3 = (xhss.C0131) r3
            boolean r3 = r3.m363(r4, r5, r6)
            goto L17
        L183:
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0245
            if (r3 == 0) goto L19d
            xhss.ᛳᛲᲀᛷ r5 = (xhss.C0245) r5
            xhss.ᛱᛶᛶᛱ r3 = r5.m546()
            r3.getClass()
            boolean r5 = r3 instanceof xhss.C1175
            if (r5 == 0) goto L198
            goto L1e9
        L198:
            xhss.ᛱᛸᛱᲁ r3 = r3.mo165()
            goto L1a1
        L19d:
            xhss.ᛱᛸᛱᲁ r3 = r5.mo165()
        L1a1:
            r4.getClass()
            boolean r5 = r4 instanceof xhss.C0245
            if (r5 == 0) goto L1bb
            xhss.ᛳᛲᲀᛷ r4 = (xhss.C0245) r4
            xhss.ᛱᛶᛶᛱ r4 = r4.m546()
            r4.getClass()
            boolean r5 = r4 instanceof xhss.C1175
            if (r5 == 0) goto L1b6
            goto L1e9
        L1b6:
            xhss.ᛱᛸᛱᲁ r4 = r4.mo165()
            goto L1bf
        L1bb:
            xhss.ᛱᛸᛱᲁ r4 = r4.mo165()
        L1bf:
            java.util.ArrayList r4 = r4.f367
            java.util.Iterator r4 = r4.iterator()
        L1c5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1ea
            java.lang.Object r5 = r4.next()
            xhss.ᛱᛶᛶᛱ r5 = (xhss.AbstractC0052) r5
            java.util.ArrayList r6 = r3.f367
            java.util.Iterator r6 = r6.iterator()
        L1d7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L1c5
            java.lang.Object r0 = r6.next()
            xhss.ᛱᛶᛶᛱ r0 = (xhss.AbstractC0052) r0
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L1d7
        L1e9:
            r1 = r2
        L1ea:
            return r1
        L1eb:
            r4.getClass()
            boolean r3 = r4 instanceof xhss.C0787
            if (r3 == 0) goto L208
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0787
            if (r3 == 0) goto L208
            xhss.ᛸᛷᲈᛶ r4 = (xhss.C0787) r4
            java.math.BigDecimal r3 = r4.f2572
            xhss.ᛸᛷᲈᛶ r5 = (xhss.C0787) r5
            java.math.BigDecimal r4 = r5.f2572
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L23c
            goto L23d
        L208:
            boolean r3 = r4 instanceof xhss.C1192
            if (r3 == 0) goto L222
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C1192
            if (r3 == 0) goto L222
            xhss.ᲈᲇᛱᛶ r4 = (xhss.C1192) r4
            java.lang.String r3 = r4.f3847
            xhss.ᲈᲇᛱᛶ r5 = (xhss.C1192) r5
            java.lang.String r4 = r5.f3847
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L23c
            goto L23d
        L222:
            boolean r3 = r4 instanceof xhss.C0549
            if (r3 == 0) goto L23c
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0549
            if (r3 == 0) goto L23c
            xhss.ᛶᛳᛳᛶ r4 = (xhss.C0549) r4
            java.time.OffsetDateTime r3 = r4.f1970
            xhss.ᛶᛳᛳᛶ r5 = (xhss.C0549) r5
            java.time.OffsetDateTime r4 = r5.f1970
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L23c
            goto L23d
        L23c:
            r1 = r2
        L23d:
            return r1
        L23e:
            r4.getClass()
            boolean r3 = r4 instanceof xhss.C0787
            if (r3 == 0) goto L25b
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0787
            if (r3 == 0) goto L25b
            xhss.ᛸᛷᲈᛶ r4 = (xhss.C0787) r4
            java.math.BigDecimal r3 = r4.f2572
            xhss.ᛸᛷᲈᛶ r5 = (xhss.C0787) r5
            java.math.BigDecimal r4 = r5.f2572
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L28f
            goto L290
        L25b:
            boolean r3 = r4 instanceof xhss.C1192
            if (r3 == 0) goto L275
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C1192
            if (r3 == 0) goto L275
            xhss.ᲈᲇᛱᛶ r4 = (xhss.C1192) r4
            java.lang.String r3 = r4.f3847
            xhss.ᲈᲇᛱᛶ r5 = (xhss.C1192) r5
            java.lang.String r4 = r5.f3847
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L28f
            goto L290
        L275:
            boolean r3 = r4 instanceof xhss.C0549
            if (r3 == 0) goto L28f
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0549
            if (r3 == 0) goto L28f
            xhss.ᛶᛳᛳᛶ r4 = (xhss.C0549) r4
            java.time.OffsetDateTime r3 = r4.f1970
            xhss.ᛶᛳᛳᛶ r5 = (xhss.C0549) r5
            java.time.OffsetDateTime r4 = r5.f1970
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L28f
            goto L290
        L28f:
            r1 = r2
        L290:
            return r1
        L291:
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0245
            if (r3 == 0) goto L2ab
            xhss.ᛳᛲᲀᛷ r5 = (xhss.C0245) r5
            xhss.ᛱᛶᛶᛱ r3 = r5.m546()
            r3.getClass()
            boolean r5 = r3 instanceof xhss.C1175
            if (r5 == 0) goto L2a6
            goto L2b5
        L2a6:
            xhss.ᛱᛸᛱᲁ r3 = r3.mo165()
            goto L2af
        L2ab:
            xhss.ᛱᛸᛱᲁ r3 = r5.mo165()
        L2af:
            java.util.ArrayList r3 = r3.f367
            boolean r2 = r3.contains(r4)
        L2b5:
            return r2
        L2b6:
            r4.getClass()
            boolean r3 = r4 instanceof xhss.C0787
            if (r3 == 0) goto L2d3
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0787
            if (r3 == 0) goto L2d3
            xhss.ᛸᛷᲈᛶ r4 = (xhss.C0787) r4
            java.math.BigDecimal r3 = r4.f2572
            xhss.ᛸᛷᲈᛶ r5 = (xhss.C0787) r5
            java.math.BigDecimal r4 = r5.f2572
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L307
            goto L308
        L2d3:
            boolean r3 = r4 instanceof xhss.C1192
            if (r3 == 0) goto L2ed
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C1192
            if (r3 == 0) goto L2ed
            xhss.ᲈᲇᛱᛶ r4 = (xhss.C1192) r4
            java.lang.String r3 = r4.f3847
            xhss.ᲈᲇᛱᛶ r5 = (xhss.C1192) r5
            java.lang.String r4 = r5.f3847
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L307
            goto L308
        L2ed:
            boolean r3 = r4 instanceof xhss.C0549
            if (r3 == 0) goto L307
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0549
            if (r3 == 0) goto L307
            xhss.ᛶᛳᛳᛶ r4 = (xhss.C0549) r4
            java.time.OffsetDateTime r3 = r4.f1970
            xhss.ᛶᛳᛳᛶ r5 = (xhss.C0549) r5
            java.time.OffsetDateTime r4 = r5.f1970
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L307
            goto L308
        L307:
            r1 = r2
        L308:
            return r1
        L309:
            r4.getClass()
            boolean r3 = r4 instanceof xhss.C0787
            if (r3 == 0) goto L326
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0787
            if (r3 == 0) goto L326
            xhss.ᛸᛷᲈᛶ r4 = (xhss.C0787) r4
            java.math.BigDecimal r3 = r4.f2572
            xhss.ᛸᛷᲈᛶ r5 = (xhss.C0787) r5
            java.math.BigDecimal r4 = r5.f2572
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L35a
            goto L35b
        L326:
            boolean r3 = r4 instanceof xhss.C1192
            if (r3 == 0) goto L340
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C1192
            if (r3 == 0) goto L340
            xhss.ᲈᲇᛱᛶ r4 = (xhss.C1192) r4
            java.lang.String r3 = r4.f3847
            xhss.ᲈᲇᛱᛶ r5 = (xhss.C1192) r5
            java.lang.String r4 = r5.f3847
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L35a
            goto L35b
        L340:
            boolean r3 = r4 instanceof xhss.C0549
            if (r3 == 0) goto L35a
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0549
            if (r3 == 0) goto L35a
            xhss.ᛶᛳᛳᛶ r4 = (xhss.C0549) r4
            java.time.OffsetDateTime r3 = r4.f1970
            xhss.ᛶᛳᛳᛶ r5 = (xhss.C0549) r5
            java.time.OffsetDateTime r4 = r5.f1970
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L35a
            goto L35b
        L35a:
            r1 = r2
        L35b:
            return r1
        L35c:
            r4.getClass()
            boolean r3 = r4 instanceof xhss.C0933
            if (r3 != 0) goto L373
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0933
            if (r3 == 0) goto L36b
            goto L373
        L36b:
            xhss.ᛵᛲᛲᲇ r3 = new xhss.ᛵᛲᛲᲇ
            java.lang.String r4 = "Failed to evaluate exists expression"
            r3.<init>(r4)
            throw r3
        L373:
            xhss.ᲁᛳᛲᛸ r3 = r4.mo164()
            java.lang.Boolean r3 = r3.f3020
            boolean r3 = r3.booleanValue()
            xhss.ᲁᛳᛲᛸ r4 = r5.mo164()
            java.lang.Boolean r4 = r4.f3020
            boolean r4 = r4.booleanValue()
            if (r3 != r4) goto L38a
            goto L38b
        L38a:
            r1 = r2
        L38b:
            return r1
        L38c:
            r4.getClass()
            boolean r3 = r4 instanceof xhss.C0245
            if (r3 == 0) goto L3b7
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0245
            if (r3 == 0) goto L3b7
            xhss.ᛳᛲᲀᛷ r4 = (xhss.C0245) r4
            xhss.ᛳᛲᲀᛷ r5 = (xhss.C0245) r5
            if (r4 != r5) goto L3a1
            goto L3bb
        L3a1:
            java.lang.Object r3 = r4.f913
            if (r3 == 0) goto L3b0
            java.lang.Object r4 = r5.m545()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3bb
            goto L3b5
        L3b0:
            java.lang.Object r3 = r5.f913
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
            boolean r3 = r4 instanceof xhss.C1192
            if (r3 == 0) goto L3d8
            xhss.ᲈᲇᛱᛶ r4 = (xhss.C1192) r4
            java.lang.String r3 = r4.f3847
            boolean r3 = r3.isEmpty()
            xhss.ᲁᛳᛲᛸ r4 = r5.mo164()
            java.lang.Boolean r4 = r4.f3020
            boolean r4 = r4.booleanValue()
            if (r3 != r4) goto L421
            goto L422
        L3d8:
            boolean r3 = r4 instanceof xhss.C0245
            if (r3 == 0) goto L421
            xhss.ᛳᛲᲀᛷ r4 = (xhss.C0245) r4
            java.lang.Object r3 = r4.m545()
            boolean r3 = r3 instanceof java.util.List
            if (r3 != 0) goto L407
            java.lang.Object r3 = r4.m545()
            boolean r3 = r3 instanceof java.util.Map
            if (r3 == 0) goto L3ef
            goto L407
        L3ef:
            java.lang.Object r3 = r4.m545()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L403
            java.lang.Object r3 = r4.m545()
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
            java.lang.Object r3 = r4.m545()
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            if (r3 != 0) goto L405
            goto L403
        L414:
            xhss.ᲁᛳᛲᛸ r4 = r5.mo164()
            java.lang.Boolean r4 = r4.f3020
            boolean r4 = r4.booleanValue()
            if (r3 != r4) goto L421
            goto L422
        L421:
            r1 = r2
        L422:
            return r1
        L423:
            r4.getClass()
            boolean r3 = r4 instanceof xhss.C1192
            if (r3 == 0) goto L43e
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C1192
            if (r3 == 0) goto L43e
            xhss.ᲈᲇᛱᛶ r4 = (xhss.C1192) r4
            xhss.ᲈᲇᛱᛶ r5 = (xhss.C1192) r5
            java.lang.String r3 = r5.f3847
            java.lang.String r4 = r4.f3847
            boolean r2 = r4.contains(r3)
            goto L45a
        L43e:
            boolean r3 = r4 instanceof xhss.C0245
            if (r3 == 0) goto L45a
            xhss.ᛳᛲᲀᛷ r4 = (xhss.C0245) r4
            xhss.ᛱᛶᛶᛱ r3 = r4.m546()
            r3.getClass()
            boolean r4 = r3 instanceof xhss.C1175
            if (r4 == 0) goto L450
            goto L45a
        L450:
            xhss.ᛱᛸᛱᲁ r3 = r3.mo165()
            java.util.ArrayList r3 = r3.f367
            boolean r2 = r3.contains(r5)
        L45a:
            return r2
        L45b:
            r5.getClass()
            boolean r3 = r5 instanceof xhss.C0245
            if (r3 == 0) goto L475
            xhss.ᛳᛲᲀᛷ r5 = (xhss.C0245) r5
            xhss.ᛱᛶᛶᛱ r3 = r5.m546()
            r3.getClass()
            boolean r5 = r3 instanceof xhss.C1175
            if (r5 == 0) goto L470
            goto L4c2
        L470:
            xhss.ᛱᛸᛱᲁ r3 = r3.mo165()
            goto L479
        L475:
            xhss.ᛱᛸᛱᲁ r3 = r5.mo165()
        L479:
            r4.getClass()
            boolean r5 = r4 instanceof xhss.C0245
            if (r5 == 0) goto L493
            xhss.ᛳᛲᲀᛷ r4 = (xhss.C0245) r4
            xhss.ᛱᛶᛶᛱ r4 = r4.m546()
            r4.getClass()
            boolean r5 = r4 instanceof xhss.C1175
            if (r5 == 0) goto L48e
            goto L4c2
        L48e:
            xhss.ᛱᛸᛱᲁ r4 = r4.mo165()
            goto L497
        L493:
            xhss.ᛱᛸᛱᲁ r4 = r4.mo165()
        L497:
            java.util.ArrayList r4 = r4.f367
            java.util.Iterator r4 = r4.iterator()
        L49d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4c2
            java.lang.Object r5 = r4.next()
            xhss.ᛱᛶᛶᛱ r5 = (xhss.AbstractC0052) r5
            java.util.ArrayList r6 = r3.f367
            java.util.Iterator r6 = r6.iterator()
        L4af:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L49d
            java.lang.Object r0 = r6.next()
            xhss.ᛱᛶᛶᛱ r0 = (xhss.AbstractC0052) r0
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4af
            goto L4c3
        L4c2:
            r1 = r2
        L4c3:
            return r1
        L4c4:
            xhss.ᛱᛸᛱᲁ r3 = r5.mo165()
            r4.getClass()
            boolean r5 = r4 instanceof xhss.C0245
            if (r5 == 0) goto L4f8
            xhss.ᛳᛲᲀᛷ r4 = (xhss.C0245) r4
            xhss.ᛱᛶᛶᛱ r4 = r4.m546()
            r4.getClass()
            boolean r5 = r4 instanceof xhss.C0069
            if (r5 == 0) goto L4f9
            xhss.ᛱᛸᛱᲁ r4 = (xhss.C0069) r4
            java.util.ArrayList r3 = r3.f367
            java.util.Iterator r3 = r3.iterator()
        L4e4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4f9
            java.lang.Object r5 = r3.next()
            xhss.ᛱᛶᛶᛱ r5 = (xhss.AbstractC0052) r5
            java.util.ArrayList r6 = r4.f367
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L4e4
        L4f8:
            r1 = r2
        L4f9:
            return r1
    }
}
