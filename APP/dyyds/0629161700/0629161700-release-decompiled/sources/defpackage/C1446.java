package defpackage;

/* JADX INFO: renamed from: ᛸᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1446 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1971 f6347 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1950 f6348;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f6349;

    static {
            ᲁᲈᲀᛸ r0 = new ᲁᲈᲀᛸ
            r1 = 1
            r0.<init>(r1)
            defpackage.C1446.f6347 = r0
            return
    }

    public C1446(defpackage.C1950 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f6348 = r1
            r0.f6349 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.io.Serializable m2653(int r3, defpackage.C1103 r4) {
            r2 = this;
            int r0 = defpackage.AbstractC0225.m812(r3)
            r1 = 5
            if (r0 == r1) goto L34
            r1 = 6
            if (r0 == r1) goto L2d
            r2 = 7
            if (r0 == r2) goto L24
            r2 = 8
            r1 = 0
            if (r0 != r2) goto L16
            r4.m2108()
            return r1
        L16:
            java.lang.String r2 = defpackage.AbstractC0225.m824(r3)
            java.lang.String r3 = "Unexpected token: "
            java.lang.String r2 = r3.concat(r2)
            defpackage.C2264.m3676(r2)
            return r1
        L24:
            boolean r2 = r4.m2100()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L2d:
            int r2 = r2.f6349
            java.lang.Number r2 = defpackage.AbstractC1124.m2149(r2, r4)
            return r2
        L34:
            java.lang.String r2 = r4.m2096()
            return r2
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r2, java.lang.Object r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r2.m1067()
            return
        L6:
            ᲁᲇᲀᛸ r1 = r1.f6348
            java.lang.Class r0 = r3.getClass()
            ᛴᲀᲈᛴ r1 = r1.m3366(r0)
            boolean r0 = r1 instanceof defpackage.C1446
            if (r0 == 0) goto L1b
            r2.m1069()
            r2.m1073()
            return
        L1b:
            r1.mo561(r2, r3)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r10) {
            r9 = this;
            int r0 = r10.m2090()
            int r1 = defpackage.AbstractC0225.m812(r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1a
            if (r1 == r2) goto L11
            r1 = r4
            goto L22
        L11:
            r10.m2110()
            ᛵᲇᛳᛳ r1 = new ᛵᲇᛳᛳ
            r1.<init>(r3)
            goto L22
        L1a:
            r10.m2101()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L22:
            if (r1 != 0) goto L29
            java.io.Serializable r9 = r9.m2653(r0, r10)
            return r9
        L29:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
        L2e:
            boolean r5 = r10.m2082()
            if (r5 == 0) goto L80
            boolean r5 = r1 instanceof java.util.Map
            if (r5 == 0) goto L3d
            java.lang.String r5 = r10.m2102()
            goto L3e
        L3d:
            r5 = r4
        L3e:
            int r6 = r10.m2090()
            int r7 = defpackage.AbstractC0225.m812(r6)
            if (r7 == 0) goto L55
            if (r7 == r2) goto L4c
            r7 = r4
            goto L5d
        L4c:
            r10.m2110()
            ᛵᲇᛳᛳ r7 = new ᛵᲇᛳᛳ
            r7.<init>(r3)
            goto L5d
        L55:
            r10.m2101()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L5d:
            if (r7 == 0) goto L61
            r8 = r3
            goto L62
        L61:
            r8 = 0
        L62:
            if (r7 != 0) goto L68
            java.io.Serializable r7 = r9.m2653(r6, r10)
        L68:
            boolean r6 = r1 instanceof java.util.List
            if (r6 == 0) goto L73
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            r5.add(r7)
            goto L79
        L73:
            r6 = r1
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r5, r7)
        L79:
            if (r8 == 0) goto L2e
            r0.addLast(r1)
            r1 = r7
            goto L2e
        L80:
            boolean r5 = r1 instanceof java.util.List
            if (r5 == 0) goto L88
            r10.m2083()
            goto L8b
        L88:
            r10.m2093()
        L8b:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L92
            return r1
        L92:
            java.lang.Object r1 = r0.removeLast()
            goto L2e
    }
}
