package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲈᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0113 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0121 f497;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0121 f498;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f499;

    public /* synthetic */ C0113(xhss.AbstractC0121 r1, xhss.AbstractC0121 r2, int r3) {
            r0 = this;
            r0.f499 = r3
            r0.f497 = r1
            r0.f498 = r2
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r8) {
            r7 = this;
            int r0 = r7.f499
            xhss.ᛲᛱᛶᛴ r1 = r7.f498
            xhss.ᛲᛱᛶᛴ r7 = r7.f497
            r2 = 4
            r3 = 0
            java.lang.String r4 = "time"
            switch(r0) {
                case 0: goto L49;
                default: goto Ld;
            }
        Ld:
            r8.m743()
            r0 = r3
        L11:
            int r5 = r8.m762()
            java.lang.String r6 = "offset"
            if (r5 == r2) goto L3b
            java.lang.String r5 = r8.m765()
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L34
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L2d
            r8.m753()
            goto L11
        L2d:
            java.lang.Object r3 = r7.mo119(r8)
            java.time.LocalTime r3 = (java.time.LocalTime) r3
            goto L11
        L34:
            java.lang.Object r0 = r1.mo119(r8)
            java.time.ZoneOffset r0 = (java.time.ZoneOffset) r0
            goto L11
        L3b:
            r8.m750()
            xhss.C1070.m1732(r3, r4, r8)
            xhss.C1070.m1732(r0, r6, r8)
            java.time.OffsetTime r7 = java.time.OffsetTime.of(r3, r0)
            return r7
        L49:
            r8.m743()
            r0 = r3
        L4d:
            int r5 = r8.m762()
            java.lang.String r6 = "date"
            if (r5 == r2) goto L77
            java.lang.String r5 = r8.m765()
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L70
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L69
            r8.m753()
            goto L4d
        L69:
            java.lang.Object r0 = r1.mo119(r8)
            java.time.LocalTime r0 = (java.time.LocalTime) r0
            goto L4d
        L70:
            java.lang.Object r3 = r7.mo119(r8)
            java.time.LocalDate r3 = (java.time.LocalDate) r3
            goto L4d
        L77:
            r8.m750()
            xhss.C1070.m1732(r3, r6, r8)
            xhss.C1070.m1732(r0, r4, r8)
            java.time.LocalDateTime r7 = java.time.LocalDateTime.of(r3, r0)
            return r7
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f499
            xhss.ᛲᛱᛶᛴ r1 = r3.f498
            xhss.ᛲᛱᛶᛴ r3 = r3.f497
            java.lang.String r2 = "time"
            switch(r0) {
                case 0: goto L2a;
                default: goto Lb;
            }
        Lb:
            java.time.OffsetTime r5 = (java.time.OffsetTime) r5
            r4.m1407()
            r4.m1403(r2)
            java.time.LocalTime r0 = r5.toLocalTime()
            r3.mo120(r4, r0)
            java.lang.String r3 = "offset"
            r4.m1403(r3)
            java.time.ZoneOffset r3 = r5.getOffset()
            r1.mo120(r4, r3)
            r4.m1399()
            return
        L2a:
            java.time.LocalDateTime r5 = (java.time.LocalDateTime) r5
            r4.m1407()
            java.lang.String r0 = "date"
            r4.m1403(r0)
            java.time.LocalDate r0 = r5.toLocalDate()
            r3.mo120(r4, r0)
            r4.m1403(r2)
            java.time.LocalTime r3 = r5.toLocalTime()
            r1.mo120(r4, r3)
            r4.m1399()
            return
    }
}
