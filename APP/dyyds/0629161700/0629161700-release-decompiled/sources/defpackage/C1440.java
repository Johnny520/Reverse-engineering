package defpackage;

/* JADX INFO: renamed from: ᛸᛲᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1440 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC0758 f6323;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f6324;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC0758 f6325;

    public /* synthetic */ C1440(defpackage.AbstractC0758 r1, defpackage.AbstractC0758 r2, int r3) {
            r0 = this;
            r0.f6324 = r3
            r0.f6325 = r1
            r0.f6323 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f6324
            ᛴᲀᲈᛴ r1 = r3.f6323
            ᛴᲀᲈᛴ r3 = r3.f6325
            java.lang.String r2 = "time"
            switch(r0) {
                case 0: goto L2a;
                default: goto Lb;
            }
        Lb:
            java.time.OffsetTime r5 = (java.time.OffsetTime) r5
            r4.m1069()
            r4.m1072(r2)
            java.time.LocalTime r0 = r5.toLocalTime()
            r3.mo561(r4, r0)
            java.lang.String r3 = "offset"
            r4.m1072(r3)
            java.time.ZoneOffset r3 = r5.getOffset()
            r1.mo561(r4, r3)
            r4.m1073()
            return
        L2a:
            java.time.LocalDateTime r5 = (java.time.LocalDateTime) r5
            r4.m1069()
            java.lang.String r0 = "date"
            r4.m1072(r0)
            java.time.LocalDate r0 = r5.toLocalDate()
            r3.mo561(r4, r0)
            r4.m1072(r2)
            java.time.LocalTime r3 = r5.toLocalTime()
            r1.mo561(r4, r3)
            r4.m1073()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r8) {
            r7 = this;
            int r0 = r7.f6324
            ᛴᲀᲈᛴ r1 = r7.f6323
            ᛴᲀᲈᛴ r7 = r7.f6325
            r2 = 4
            r3 = 0
            java.lang.String r4 = "time"
            switch(r0) {
                case 0: goto L49;
                default: goto Ld;
            }
        Ld:
            r8.m2110()
            r0 = r3
        L11:
            int r5 = r8.m2090()
            java.lang.String r6 = "offset"
            if (r5 == r2) goto L3b
            java.lang.String r5 = r8.m2102()
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L34
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L2d
            r8.m2086()
            goto L11
        L2d:
            java.lang.Object r3 = r7.mo562(r8)
            java.time.LocalTime r3 = (java.time.LocalTime) r3
            goto L11
        L34:
            java.lang.Object r0 = r1.mo562(r8)
            java.time.ZoneOffset r0 = (java.time.ZoneOffset) r0
            goto L11
        L3b:
            r8.m2093()
            defpackage.C0736.m1654(r3, r4, r8)
            defpackage.C0736.m1654(r0, r6, r8)
            java.time.OffsetTime r7 = java.time.OffsetTime.of(r3, r0)
            return r7
        L49:
            r8.m2110()
            r0 = r3
        L4d:
            int r5 = r8.m2090()
            java.lang.String r6 = "date"
            if (r5 == r2) goto L77
            java.lang.String r5 = r8.m2102()
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L70
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L69
            r8.m2086()
            goto L4d
        L69:
            java.lang.Object r0 = r1.mo562(r8)
            java.time.LocalTime r0 = (java.time.LocalTime) r0
            goto L4d
        L70:
            java.lang.Object r3 = r7.mo562(r8)
            java.time.LocalDate r3 = (java.time.LocalDate) r3
            goto L4d
        L77:
            r8.m2093()
            defpackage.C0736.m1654(r3, r6, r8)
            defpackage.C0736.m1654(r0, r4, r8)
            java.time.LocalDateTime r7 = java.time.LocalDateTime.of(r3, r0)
            return r7
    }
}
