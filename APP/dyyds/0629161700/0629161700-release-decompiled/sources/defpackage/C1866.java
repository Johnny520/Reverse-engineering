package defpackage;

/* JADX INFO: renamed from: ᲁᛵᲁᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1866 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f8118;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8119;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f8120;

    public C1866(defpackage.C0459 r2, java.lang.Class r3) {
            r1 = this;
            r0 = 2
            r1.f8119 = r0
            r1.<init>()
            r1.f8118 = r2
            r1.f8120 = r3
            return
    }

    public /* synthetic */ C1866(defpackage.AbstractC0758 r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f8119 = r3
            r0.f8120 = r1
            r0.f8118 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f8119
            java.lang.Object r1 = r2.f8120
            java.lang.Object r2 = r2.f8118
            switch(r0) {
                case 0: goto L36;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            ᛳᛴᛷᲈ r2 = (defpackage.C0459) r2
            ᛴᲀᲈᛴ r2 = r2.f2301
            r2.mo561(r3, r4)
            return
        L11:
            java.time.OffsetDateTime r4 = (java.time.OffsetDateTime) r4
            r3.m1069()
            java.lang.String r0 = "dateTime"
            r3.m1072(r0)
            ᛴᛶᲁᛸ r1 = (defpackage.C0699) r1
            java.time.LocalDateTime r0 = r4.toLocalDateTime()
            r1.mo561(r3, r0)
            java.lang.String r0 = "offset"
            r3.m1072(r0)
            ᛴᲀᲈᛴ r2 = (defpackage.AbstractC0758) r2
            java.time.ZoneOffset r4 = r4.getOffset()
            r2.mo561(r3, r4)
            r3.m1073()
            return
        L36:
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 != 0) goto L3e
            r3.m1067()
            goto L59
        L3e:
            r3.m1082()
            java.util.Iterator r2 = r4.iterator()
        L45:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r2.next()
            r0 = r1
            ᲈᛲᲈ r0 = (defpackage.C2200) r0
            r0.mo561(r3, r4)
            goto L45
        L56:
            r3.m1068()
        L59:
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r8) {
            r7 = this;
            int r0 = r7.f8119
            r1 = 0
            java.lang.Object r2 = r7.f8118
            java.lang.Object r7 = r7.f8120
            switch(r0) {
                case 0: goto L98;
                case 1: goto L53;
                default: goto La;
            }
        La:
            java.lang.Class r7 = (java.lang.Class) r7
            ᛳᛴᛷᲈ r2 = (defpackage.C0459) r2
            ᛴᲀᲈᛴ r0 = r2.f2301
            java.lang.Object r0 = r0.mo562(r8)
            if (r0 == 0) goto L52
            boolean r1 = r7.isInstance(r0)
            if (r1 == 0) goto L1d
            goto L52
        L1d:
            ᛲᛱᛶᲀ r1 = new ᛲᛱᛶᲀ
            java.lang.String r7 = r7.getName()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2 = 1
            java.lang.String r8 = r8.m2106(r2)
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
            r8.m2110()
            r0 = r1
        L57:
            int r3 = r8.m2090()
            r4 = 4
            java.lang.String r5 = "dateTime"
            java.lang.String r6 = "offset"
            if (r3 == r4) goto L8a
            java.lang.String r3 = r8.m2102()
            boolean r4 = r3.equals(r6)
            if (r4 != 0) goto L80
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L76
            r8.m2086()
            goto L57
        L76:
            r1 = r7
            ᛴᛶᲁᛸ r1 = (defpackage.C0699) r1
            java.lang.Object r1 = r1.mo562(r8)
            java.time.LocalDateTime r1 = (java.time.LocalDateTime) r1
            goto L57
        L80:
            r0 = r2
            ᛴᲀᲈᛴ r0 = (defpackage.AbstractC0758) r0
            java.lang.Object r0 = r0.mo562(r8)
            java.time.ZoneOffset r0 = (java.time.ZoneOffset) r0
            goto L57
        L8a:
            r8.m2093()
            defpackage.C0736.m1654(r1, r5, r8)
            defpackage.C0736.m1654(r0, r6, r8)
            java.time.OffsetDateTime r7 = java.time.OffsetDateTime.of(r1, r0)
            return r7
        L98:
            int r0 = r8.m2090()
            r3 = 9
            if (r0 != r3) goto La4
            r8.m2108()
            goto Lc6
        La4:
            ᛳᛴᲁᛸ r2 = (defpackage.InterfaceC0464) r2
            java.lang.Object r0 = r2.mo741()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            r8.m2101()
        Lb0:
            boolean r0 = r8.m2082()
            if (r0 == 0) goto Lc3
            r0 = r7
            ᲈᛲᲈ r0 = (defpackage.C2200) r0
            ᛴᲀᲈᛴ r0 = r0.f9377
            java.lang.Object r0 = r0.mo562(r8)
            r1.add(r0)
            goto Lb0
        Lc3:
            r8.m2083()
        Lc6:
            return r1
    }
}
