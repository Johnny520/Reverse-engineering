package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z4.e implements java.lang.Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p4.c f10104i = null;

    static {
            p4.c r0 = new p4.c
            r1 = 0
            r0.<init>(r1)
            p4.c.f10104i = r0
            return
    }

    @Override // z4.e, z4.k
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r0 = r1.p(r0, r0)
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            p4.c r1 = (p4.c) r1
            int r1 = r0.o(r1)
            return r1
    }

    public final int o(p4.c r8) {
            r7 = this;
            r0 = 0
            if (r7 != r8) goto L4
            goto L2f
        L4:
            java.lang.Object[] r1 = r7.f22543h
            int r1 = r1.length
            java.lang.Object[] r2 = r8.f22543h
            int r2 = r2.length
            int r3 = java.lang.Math.min(r1, r2)
            r4 = r0
        Lf:
            if (r4 >= r3) goto L27
            java.lang.Object r5 = r7.l(r4)
            p4.b r5 = (p4.b) r5
            java.lang.Object r6 = r8.l(r4)
            p4.b r6 = (p4.b) r6
            int r5 = r5.a(r6)
            if (r5 == 0) goto L24
            return r5
        L24:
            int r4 = r4 + 1
            goto Lf
        L27:
            if (r1 >= r2) goto L2b
            r8 = -1
            return r8
        L2b:
            if (r1 <= r2) goto L2f
            r8 = 1
            return r8
        L2f:
            return r0
    }

    public final java.lang.String p(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Object[] r1 = r6.f22543h
            int r1 = r1.length
            r0.append(r7)
            r0.append(r8)
            java.lang.String r8 = "catch "
            r0.append(r8)
            r8 = 0
            r2 = r8
        L17:
            if (r2 >= r1) goto L75
            java.lang.Object r3 = r6.l(r2)
            p4.b r3 = (p4.b) r3
            if (r2 == 0) goto L2e
            java.lang.String r4 = ",\n"
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = "  "
            r0.append(r4)
        L2e:
            int r4 = r1 + (-1)
            if (r2 != r4) goto L51
            java.lang.Object[] r4 = r6.f22543h
            int r4 = r4.length
            if (r4 != 0) goto L39
            r4 = r8
            goto L49
        L39:
            int r4 = r4 + (-1)
            java.lang.Object r4 = r6.l(r4)
            p4.b r4 = (p4.b) r4
            v4.d0 r4 = r4.f10101g
            v4.d0 r5 = v4.d0.f14071j
            boolean r4 = r4.equals(r5)
        L49:
            if (r4 == 0) goto L51
            java.lang.String r4 = "<any>"
            r0.append(r4)
            goto L5c
        L51:
            v4.d0 r4 = r3.f10101g
            w4.c r4 = r4.f14088g
            java.lang.String r4 = r4.a()
            r0.append(r4)
        L5c:
            java.lang.String r4 = " -> "
            r0.append(r4)
            int r3 = r3.f10102h
            char r4 = (char) r3
            if (r3 != r4) goto L6b
            java.lang.String r3 = a.a.X0(r3)
            goto L6f
        L6b:
            java.lang.String r3 = a.a.Y0(r3)
        L6f:
            r0.append(r3)
            int r2 = r2 + 1
            goto L17
        L75:
            java.lang.String r7 = r0.toString()
            return r7
    }
}
