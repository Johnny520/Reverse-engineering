package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends p4.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v4.a[] f10220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f10221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10222h;

    public r(p4.j r2, u4.t r3, u4.p r4, v4.a[] r5) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r1.f10220f = r5
            int r2 = r5.length
            int[] r2 = new int[r2]
            r1.f10221g = r2
            r2 = 0
        Lb:
            int[] r3 = r1.f10221g
            int r4 = r3.length
            r0 = -1
            if (r2 >= r4) goto L21
            r4 = r5[r2]
            if (r4 == 0) goto L1a
            r3[r2] = r0
            int r2 = r2 + 1
            goto Lb
        L1a:
            java.lang.String r2 = "constants[i] == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L21:
            r1.f10222h = r0
            return
    }

    public r(p4.j r1, u4.t r2, u4.p r3, v4.a[] r4, int[] r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.f10220f = r4
            r0.f10221g = r5
            r0.f10222h = r6
            return
    }

    @Override // p4.h
    public final java.lang.String a() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            v4.a[] r2 = r4.f10220f
            int r3 = r2.length
            if (r1 >= r3) goto L22
            int r3 = r0.length()
            if (r3 <= 0) goto L16
            java.lang.String r3 = ", "
            r0.append(r3)
        L16:
            r2 = r2[r1]
            java.lang.String r2 = r2.a()
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L22:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p4.h
    public final java.lang.String c() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            v4.a[] r2 = r5.f10220f
            int r3 = r2.length
            if (r1 >= r3) goto L44
            int[] r3 = r5.f10221g
            r3 = r3[r1]
            r4 = -1
            if (r3 == r4) goto L41
            if (r1 <= 0) goto L19
            java.lang.String r3 = ", "
            r0.append(r3)
        L19:
            r2 = r2[r1]
            java.lang.String r2 = r2.j()
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            int r2 = r5.m(r1)
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r3) goto L37
            java.lang.String r2 = a.a.X0(r2)
            r0.append(r2)
            goto L3e
        L37:
            java.lang.String r2 = a.a.Y0(r2)
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L6
        L41:
            java.lang.String r0 = ""
            return r0
        L44:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p4.h
    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.a()
            return r0
    }

    @Override // p4.l, p4.h
    public final p4.h i(p4.j r8) {
            r7 = this;
            p4.r r0 = new p4.r
            int[] r5 = r7.f10221g
            int r6 = r7.f10222h
            u4.t r2 = r7.f10115c
            u4.p r3 = r7.f10116d
            v4.a[] r4 = r7.f10220f
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // p4.h
    public final p4.h k(u4.p r8) {
            r7 = this;
            p4.r r0 = new p4.r
            int[] r5 = r7.f10221g
            int r6 = r7.f10222h
            p4.j r1 = r7.f10114b
            u4.t r2 = r7.f10115c
            v4.a[] r4 = r7.f10220f
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final int m(int r4) {
            r3 = this;
            int[] r0 = r3.f10221g
            r0 = r0[r4]
            r1 = -1
            if (r0 == r1) goto L8
            return r0
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "index not yet set for constant "
            java.lang.String r2 = " value = "
            java.lang.StringBuilder r1 = eh.a.t(r4, r1, r2)
            v4.a[] r2 = r3.f10220f
            r4 = r2[r4]
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
