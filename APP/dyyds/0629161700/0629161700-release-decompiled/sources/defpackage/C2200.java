package defpackage;

/* JADX INFO: renamed from: ᲈᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2200 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f9376;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractC0758 f9377;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f9378;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f9379;

    public /* synthetic */ C2200(java.lang.Object r1, defpackage.AbstractC0758 r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f9378 = r4
            r0.f9379 = r1
            r0.f9377 = r2
            r0.f9376 = r3
            r0.<init>()
            return
    }

    public C2200(defpackage.C1578 r1, defpackage.C2200 r2, defpackage.C2200 r3, defpackage.InterfaceC0464 r4) {
            r0 = this;
            r1 = 1
            r0.f9378 = r1
            r0.<init>()
            r0.f9379 = r2
            r0.f9377 = r3
            r0.f9376 = r4
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f9378
            java.lang.Object r1 = r3.f9379
            java.lang.Object r2 = r3.f9376
            ᛴᲀᲈᛴ r3 = r3.f9377
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
            ᲁᲇᲀᛸ r1 = (defpackage.C1950) r1
            ᲁᲇᛸᲈ r2 = new ᲁᲇᛸᲈ
            r2.<init>(r0)
            ᛴᲀᲈᛴ r0 = r1.m3367(r2)
            boolean r1 = r0 instanceof defpackage.AbstractC0761
            if (r1 != 0) goto L2f
            goto L45
        L2f:
            r1 = r3
        L30:
            boolean r2 = r1 instanceof defpackage.AbstractC1024
            if (r2 == 0) goto L40
            r2 = r1
            ᛶᛲᛶᲇ r2 = (defpackage.AbstractC1024) r2
            ᛴᲀᲈᛴ r2 = r2.mo1979()
            if (r2 != r1) goto L3e
            goto L40
        L3e:
            r1 = r2
            goto L30
        L40:
            boolean r1 = r1 instanceof defpackage.AbstractC0761
            if (r1 != 0) goto L45
            goto L46
        L45:
            r3 = r0
        L46:
            r3.mo561(r4, r5)
            return
        L4a:
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L52
            r4.m1067()
            goto L82
        L52:
            r4.m1069()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L5d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.m1072(r1)
            r1 = r3
            ᲈᛲᲈ r1 = (defpackage.C2200) r1
            java.lang.Object r0 = r0.getValue()
            r1.mo561(r4, r0)
            goto L5d
        L7f:
            r4.m1073()
        L82:
            return
        L83:
            java.time.ZonedDateTime r5 = (java.time.ZonedDateTime) r5
            if (r5 != 0) goto L8b
            r4.m1067()
            goto Lb9
        L8b:
            r4.m1069()
            java.lang.String r0 = "dateTime"
            r4.m1072(r0)
            ᛴᛶᲁᛸ r1 = (defpackage.C0699) r1
            java.time.LocalDateTime r0 = r5.toLocalDateTime()
            r1.mo561(r4, r0)
            java.lang.String r0 = "offset"
            r4.m1072(r0)
            java.time.ZoneOffset r0 = r5.getOffset()
            r3.mo561(r4, r0)
            java.lang.String r3 = "zone"
            r4.m1072(r3)
            ᛴᲀᲈᛴ r2 = (defpackage.AbstractC0758) r2
            java.time.ZoneId r3 = r5.getZone()
            r2.mo561(r4, r3)
            r4.m1073()
        Lb9:
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r11) {
            r10 = this;
            int r0 = r10.f9378
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto Ld5;
                case 1: goto Le;
                default: goto L7;
            }
        L7:
            ᛴᲀᲈᛴ r10 = r10.f9377
            java.lang.Object r10 = r10.mo562(r11)
            return r10
        Le:
            int r0 = r11.m2090()
            r3 = 9
            if (r0 != r3) goto L1b
            r11.m2108()
            goto Ld4
        L1b:
            java.lang.Object r2 = r10.f9376
            ᛳᛴᲁᛸ r2 = (defpackage.InterfaceC0464) r2
            java.lang.Object r2 = r2.mo741()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r4 = "duplicate key: "
            if (r0 != r1) goto L6c
            r11.m2101()
        L2c:
            boolean r0 = r11.m2082()
            if (r0 == 0) goto L68
            r11.m2101()
            java.lang.Object r0 = r10.f9379
            ᲈᛲᲈ r0 = (defpackage.C2200) r0
            ᛴᲀᲈᛴ r0 = r0.f9377
            java.lang.Object r0 = r0.mo562(r11)
            ᛴᲀᲈᛴ r1 = r10.f9377
            ᲈᛲᲈ r1 = (defpackage.C2200) r1
            ᛴᲀᲈᛴ r1 = r1.f9377
            java.lang.Object r1 = r1.mo562(r11)
            boolean r3 = r2.containsKey(r0)
            if (r3 != 0) goto L56
            r2.put(r0, r1)
            r11.m2083()
            goto L2c
        L56:
            ᛲᛱᛶᲀ r10 = new ᛲᛱᛶᲀ
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r4)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L68:
            r11.m2083()
            goto Ld4
        L6c:
            r11.m2110()
        L6f:
            boolean r0 = r11.m2082()
            if (r0 == 0) goto Ld1
            ᛷᲈᲀ r0 = defpackage.C1403.f6099
            r0.getClass()
            int r0 = r11.f4915
            if (r0 != 0) goto L82
            int r0 = r11.m2081()
        L82:
            r1 = 13
            if (r0 != r1) goto L89
            r11.f4915 = r3
            goto L9a
        L89:
            r1 = 12
            if (r0 != r1) goto L92
            r0 = 8
            r11.f4915 = r0
            goto L9a
        L92:
            r1 = 14
            if (r0 != r1) goto Lca
            r0 = 10
            r11.f4915 = r0
        L9a:
            java.lang.Object r0 = r10.f9379
            ᲈᛲᲈ r0 = (defpackage.C2200) r0
            ᛴᲀᲈᛴ r0 = r0.f9377
            java.lang.Object r0 = r0.mo562(r11)
            ᛴᲀᲈᛴ r1 = r10.f9377
            ᲈᛲᲈ r1 = (defpackage.C2200) r1
            ᛴᲀᲈᛴ r1 = r1.f9377
            java.lang.Object r1 = r1.mo562(r11)
            boolean r5 = r2.containsKey(r0)
            if (r5 != 0) goto Lb8
            r2.put(r0, r1)
            goto L6f
        Lb8:
            ᛲᛱᛶᲀ r10 = new ᛲᛱᛶᲀ
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r4)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lca:
            java.lang.String r10 = "a name"
            java.lang.IllegalStateException r10 = r11.m2091(r10)
            throw r10
        Ld1:
            r11.m2093()
        Ld4:
            return r2
        Ld5:
            r11.m2110()
            r0 = r2
            r3 = r0
        Lda:
            int r4 = r11.m2090()
            r5 = 4
            java.lang.String r6 = "dateTime"
            java.lang.String r7 = "zone"
            java.lang.String r8 = "offset"
            if (r4 == r5) goto L134
            java.lang.String r4 = r11.m2102()
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
            r11.m2086()
            goto Lda
        L115:
            java.lang.Object r2 = r10.f9379
            ᛴᛶᲁᛸ r2 = (defpackage.C0699) r2
            java.lang.Object r2 = r2.mo562(r11)
            java.time.LocalDateTime r2 = (java.time.LocalDateTime) r2
            goto Lda
        L120:
            java.lang.Object r3 = r10.f9376
            ᛴᲀᲈᛴ r3 = (defpackage.AbstractC0758) r3
            java.lang.Object r3 = r3.mo562(r11)
            java.time.ZoneId r3 = (java.time.ZoneId) r3
            goto Lda
        L12b:
            ᛴᲀᲈᛴ r0 = r10.f9377
            java.lang.Object r0 = r0.mo562(r11)
            java.time.ZoneOffset r0 = (java.time.ZoneOffset) r0
            goto Lda
        L134:
            r11.m2093()
            defpackage.C0736.m1654(r2, r6, r11)
            defpackage.C0736.m1654(r0, r8, r11)
            defpackage.C0736.m1654(r3, r7, r11)
            java.time.ZonedDateTime r10 = java.time.ZonedDateTime.ofInstant(r2, r0, r3)
            return r10
    }
}
