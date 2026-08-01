package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛱᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1113 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f3588;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.AbstractC0121 f3589;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3590;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object f3591;

    public /* synthetic */ C1113(java.lang.Object r1, xhss.AbstractC0121 r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f3590 = r4
            r0.f3588 = r1
            r0.f3589 = r2
            r0.f3591 = r3
            r0.<init>()
            return
    }

    public C1113(xhss.C1108 r1, xhss.C1113 r2, xhss.C1113 r3, xhss.InterfaceC0979 r4) {
            r0 = this;
            r1 = 1
            r0.f3590 = r1
            r0.<init>()
            r0.f3588 = r2
            r0.f3589 = r3
            r0.f3591 = r4
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r11) {
            r10 = this;
            int r0 = r10.f3590
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto Ld5;
                case 1: goto Le;
                default: goto L7;
            }
        L7:
            xhss.ᛲᛱᛶᛴ r10 = r10.f3589
            java.lang.Object r10 = r10.mo119(r11)
            return r10
        Le:
            int r0 = r11.m762()
            r3 = 9
            if (r0 != r3) goto L1b
            r11.m756()
            goto Ld4
        L1b:
            java.lang.Object r2 = r10.f3591
            xhss.ᲁᲀᛶᛲ r2 = (xhss.InterfaceC0979) r2
            java.lang.Object r2 = r2.mo964()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r4 = "duplicate key: "
            if (r0 != r1) goto L6c
            r11.m735()
        L2c:
            boolean r0 = r11.m744()
            if (r0 == 0) goto L68
            r11.m735()
            java.lang.Object r0 = r10.f3588
            xhss.ᲈᛱᛲᛴ r0 = (xhss.C1113) r0
            xhss.ᛲᛱᛶᛴ r0 = r0.f3589
            java.lang.Object r0 = r0.mo119(r11)
            xhss.ᛲᛱᛶᛴ r1 = r10.f3589
            xhss.ᲈᛱᛲᛴ r1 = (xhss.C1113) r1
            xhss.ᛲᛱᛶᛴ r1 = r1.f3589
            java.lang.Object r1 = r1.mo119(r11)
            boolean r3 = r2.containsKey(r0)
            if (r3 != 0) goto L56
            r2.put(r0, r1)
            r11.m752()
            goto L2c
        L56:
            xhss.ᛱᲈᛲᛷ r10 = new xhss.ᛱᲈᛲᛷ
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r4)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L68:
            r11.m752()
            goto Ld4
        L6c:
            r11.m743()
        L6f:
            boolean r0 = r11.m744()
            if (r0 == 0) goto Ld1
            xhss.ᛶᛵᲇᛸ r0 = xhss.C0564.f1993
            r0.getClass()
            int r0 = r11.f1384
            if (r0 != 0) goto L82
            int r0 = r11.m757()
        L82:
            r1 = 13
            if (r0 != r1) goto L89
            r11.f1384 = r3
            goto L9a
        L89:
            r1 = 12
            if (r0 != r1) goto L92
            r0 = 8
            r11.f1384 = r0
            goto L9a
        L92:
            r1 = 14
            if (r0 != r1) goto Lca
            r0 = 10
            r11.f1384 = r0
        L9a:
            java.lang.Object r0 = r10.f3588
            xhss.ᲈᛱᛲᛴ r0 = (xhss.C1113) r0
            xhss.ᛲᛱᛶᛴ r0 = r0.f3589
            java.lang.Object r0 = r0.mo119(r11)
            xhss.ᛲᛱᛶᛴ r1 = r10.f3589
            xhss.ᲈᛱᛲᛴ r1 = (xhss.C1113) r1
            xhss.ᛲᛱᛶᛴ r1 = r1.f3589
            java.lang.Object r1 = r1.mo119(r11)
            boolean r5 = r2.containsKey(r0)
            if (r5 != 0) goto Lb8
            r2.put(r0, r1)
            goto L6f
        Lb8:
            xhss.ᛱᲈᛲᛷ r10 = new xhss.ᛱᲈᛲᛷ
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r4)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lca:
            java.lang.String r10 = "a name"
            java.lang.IllegalStateException r10 = r11.m745(r10)
            throw r10
        Ld1:
            r11.m750()
        Ld4:
            return r2
        Ld5:
            r11.m743()
            r0 = r2
            r3 = r0
        Lda:
            int r4 = r11.m762()
            r5 = 4
            java.lang.String r6 = "dateTime"
            java.lang.String r7 = "zone"
            java.lang.String r8 = "offset"
            if (r4 == r5) goto L134
            java.lang.String r4 = r11.m765()
            int r5 = r4.hashCode()
            r9 = -1
            switch(r5) {
                case -1019779949: goto L106;
                case 3744684: goto Lfd;
                case 1792749467: goto Lf4;
                default: goto Lf3;
            }
        Lf3:
            goto L10e
        Lf4:
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto Lfb
            goto L10e
        Lfb:
            r9 = 2
            goto L10e
        Lfd:
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L104
            goto L10e
        L104:
            r9 = r1
            goto L10e
        L106:
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L10d
            goto L10e
        L10d:
            r9 = 0
        L10e:
            switch(r9) {
                case 0: goto L12b;
                case 1: goto L120;
                case 2: goto L115;
                default: goto L111;
            }
        L111:
            r11.m753()
            goto Lda
        L115:
            java.lang.Object r2 = r10.f3588
            xhss.ᛲᛲᛸᲇ r2 = (xhss.C0136) r2
            java.lang.Object r2 = r2.mo119(r11)
            java.time.LocalDateTime r2 = (java.time.LocalDateTime) r2
            goto Lda
        L120:
            java.lang.Object r3 = r10.f3591
            xhss.ᛲᛱᛶᛴ r3 = (xhss.AbstractC0121) r3
            java.lang.Object r3 = r3.mo119(r11)
            java.time.ZoneId r3 = (java.time.ZoneId) r3
            goto Lda
        L12b:
            xhss.ᛲᛱᛶᛴ r0 = r10.f3589
            java.lang.Object r0 = r0.mo119(r11)
            java.time.ZoneOffset r0 = (java.time.ZoneOffset) r0
            goto Lda
        L134:
            r11.m750()
            xhss.C1070.m1732(r2, r6, r11)
            xhss.C1070.m1732(r0, r8, r11)
            xhss.C1070.m1732(r3, r7, r11)
            java.time.ZonedDateTime r10 = java.time.ZonedDateTime.ofInstant(r2, r0, r3)
            return r10
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f3590
            java.lang.Object r1 = r3.f3588
            java.lang.Object r2 = r3.f3591
            xhss.ᛲᛱᛶᛴ r3 = r3.f3589
            switch(r0) {
                case 0: goto L83;
                case 1: goto L4a;
                default: goto Lb;
            }
        Lb:
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r5 == 0) goto L1c
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 != 0) goto L17
            boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L1c
        L17:
            java.lang.Class r0 = r5.getClass()
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == r2) goto L46
            xhss.ᲈᛲᛶᛴ r1 = (xhss.C1125) r1
            xhss.ᛱᛳᲈᛷ r2 = new xhss.ᛱᛳᲈᛷ
            r2.<init>(r0)
            xhss.ᛲᛱᛶᛴ r0 = r1.m1815(r2)
            boolean r1 = r0 instanceof xhss.AbstractC0562
            if (r1 != 0) goto L2f
            goto L45
        L2f:
            r1 = r3
        L30:
            boolean r2 = r1 instanceof xhss.AbstractC0278
            if (r2 == 0) goto L40
            r2 = r1
            xhss.ᛳᛵᲇᛶ r2 = (xhss.AbstractC0278) r2
            xhss.ᛲᛱᛶᛴ r2 = r2.mo589()
            if (r2 != r1) goto L3e
            goto L40
        L3e:
            r1 = r2
            goto L30
        L40:
            boolean r1 = r1 instanceof xhss.AbstractC0562
            if (r1 != 0) goto L45
            goto L46
        L45:
            r3 = r0
        L46:
            r3.mo120(r4, r5)
            return
        L4a:
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L52
            r4.m1396()
            goto L82
        L52:
            r4.m1407()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L5d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.m1403(r1)
            r1 = r3
            xhss.ᲈᛱᛲᛴ r1 = (xhss.C1113) r1
            java.lang.Object r0 = r0.getValue()
            r1.mo120(r4, r0)
            goto L5d
        L7f:
            r4.m1399()
        L82:
            return
        L83:
            java.time.ZonedDateTime r5 = (java.time.ZonedDateTime) r5
            if (r5 != 0) goto L8b
            r4.m1396()
            goto Lb9
        L8b:
            r4.m1407()
            java.lang.String r0 = "dateTime"
            r4.m1403(r0)
            xhss.ᛲᛲᛸᲇ r1 = (xhss.C0136) r1
            java.time.LocalDateTime r0 = r5.toLocalDateTime()
            r1.mo120(r4, r0)
            java.lang.String r0 = "offset"
            r4.m1403(r0)
            java.time.ZoneOffset r0 = r5.getOffset()
            r3.mo120(r4, r0)
            java.lang.String r3 = "zone"
            r4.m1403(r3)
            xhss.ᛲᛱᛶᛴ r2 = (xhss.AbstractC0121) r2
            java.time.ZoneId r3 = r5.getZone()
            r2.mo120(r4, r3)
            r4.m1399()
        Lb9:
            return
    }
}
