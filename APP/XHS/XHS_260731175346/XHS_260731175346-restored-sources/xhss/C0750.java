package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛴᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0750 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f2512;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object f2513;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2514;

    public /* synthetic */ C0750(xhss.AbstractC0121 r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f2514 = r3
            r0.f2512 = r1
            r0.f2513 = r2
            r0.<init>()
            return
    }

    public C0750(xhss.C0839 r2, java.lang.Class r3) {
            r1 = this;
            r0 = 2
            r1.f2514 = r0
            r1.<init>()
            r1.f2513 = r2
            r1.f2512 = r3
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r8) {
            r7 = this;
            int r0 = r7.f2514
            r1 = 0
            java.lang.Object r2 = r7.f2513
            java.lang.Object r7 = r7.f2512
            switch(r0) {
                case 0: goto L98;
                case 1: goto L53;
                default: goto La;
            }
        La:
            java.lang.Class r7 = (java.lang.Class) r7
            xhss.ᲀᛲᛵᛲ r2 = (xhss.C0839) r2
            xhss.ᛲᛱᛶᛴ r0 = r2.f2723
            java.lang.Object r0 = r0.mo119(r8)
            if (r0 == 0) goto L52
            boolean r1 = r7.isInstance(r0)
            if (r1 == 0) goto L1d
            goto L52
        L1d:
            xhss.ᛱᲈᛲᛷ r1 = new xhss.ᛱᲈᛲᛷ
            java.lang.String r7 = r7.getName()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2 = 1
            java.lang.String r8 = r8.m764(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected a "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = " but was "
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = "; at path "
            r2.append(r7)
            r2.append(r8)
            java.lang.String r7 = r2.toString()
            r1.<init>(r7)
            throw r1
        L52:
            return r0
        L53:
            r8.m743()
            r0 = r1
        L57:
            int r3 = r8.m762()
            r4 = 4
            java.lang.String r5 = "dateTime"
            java.lang.String r6 = "offset"
            if (r3 == r4) goto L8a
            java.lang.String r3 = r8.m765()
            boolean r4 = r3.equals(r6)
            if (r4 != 0) goto L80
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L76
            r8.m753()
            goto L57
        L76:
            r1 = r7
            xhss.ᛲᛲᛸᲇ r1 = (xhss.C0136) r1
            java.lang.Object r1 = r1.mo119(r8)
            java.time.LocalDateTime r1 = (java.time.LocalDateTime) r1
            goto L57
        L80:
            r0 = r2
            xhss.ᛲᛱᛶᛴ r0 = (xhss.AbstractC0121) r0
            java.lang.Object r0 = r0.mo119(r8)
            java.time.ZoneOffset r0 = (java.time.ZoneOffset) r0
            goto L57
        L8a:
            r8.m750()
            xhss.C1070.m1732(r1, r5, r8)
            xhss.C1070.m1732(r0, r6, r8)
            java.time.OffsetDateTime r7 = java.time.OffsetDateTime.of(r1, r0)
            return r7
        L98:
            int r0 = r8.m762()
            r3 = 9
            if (r0 != r3) goto La4
            r8.m756()
            goto Lc6
        La4:
            xhss.ᲁᲀᛶᛲ r2 = (xhss.InterfaceC0979) r2
            java.lang.Object r0 = r2.mo964()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            r8.m735()
        Lb0:
            boolean r0 = r8.m744()
            if (r0 == 0) goto Lc3
            r0 = r7
            xhss.ᲈᛱᛲᛴ r0 = (xhss.C1113) r0
            xhss.ᛲᛱᛶᛴ r0 = r0.f3589
            java.lang.Object r0 = r0.mo119(r8)
            r1.add(r0)
            goto Lb0
        Lc3:
            r8.m752()
        Lc6:
            return r1
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f2514
            java.lang.Object r1 = r2.f2512
            java.lang.Object r2 = r2.f2513
            switch(r0) {
                case 0: goto L36;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            xhss.ᲀᛲᛵᛲ r2 = (xhss.C0839) r2
            xhss.ᛲᛱᛶᛴ r2 = r2.f2723
            r2.mo120(r3, r4)
            return
        L11:
            java.time.OffsetDateTime r4 = (java.time.OffsetDateTime) r4
            r3.m1407()
            java.lang.String r0 = "dateTime"
            r3.m1403(r0)
            xhss.ᛲᛲᛸᲇ r1 = (xhss.C0136) r1
            java.time.LocalDateTime r0 = r4.toLocalDateTime()
            r1.mo120(r3, r0)
            java.lang.String r0 = "offset"
            r3.m1403(r0)
            xhss.ᛲᛱᛶᛴ r2 = (xhss.AbstractC0121) r2
            java.time.ZoneOffset r4 = r4.getOffset()
            r2.mo120(r3, r4)
            r3.m1399()
            return
        L36:
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 != 0) goto L3e
            r3.m1396()
            goto L59
        L3e:
            r3.m1395()
            java.util.Iterator r2 = r4.iterator()
        L45:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r2.next()
            r0 = r1
            xhss.ᲈᛱᛲᛴ r0 = (xhss.C1113) r0
            r0.mo120(r3, r4)
            goto L45
        L56:
            r3.m1401()
        L59:
            return
    }
}
