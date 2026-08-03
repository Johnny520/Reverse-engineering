package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends v7.z implements java.lang.Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.String f14197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14198p;

    static {
            v7.y r0 = new v7.y
            r1 = 16
            r0.<init>(r1)
            return
    }

    public y(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f14198p = r1
            return
    }

    public static char[] U(byte r6, byte r7, char r8) {
            r0 = r6 & 128(0x80, float:1.8E-43)
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L27
            r0 = r7 & 31
            byte r0 = (byte) r0
            r7 = r7 & 224(0xe0, float:3.14E-43)
            int r7 = r7 >> 5
            r4 = r6 & 3
            r5 = 3
            int r4 = r4 << r5
            int r7 = r7 + r4
            byte r7 = (byte) r7
            r6 = r6 & 124(0x7c, float:1.74E-43)
            int r6 = r6 >> r3
            byte r6 = (byte) r6
            int r0 = r0 + r8
            char r0 = (char) r0
            int r7 = r7 + r8
            char r7 = (char) r7
            int r6 = r6 + r8
            char r6 = (char) r6
            char[] r8 = new char[r5]
            r8[r2] = r0
            r8[r1] = r7
            r8[r3] = r6
            return r8
        L27:
            if (r6 == 0) goto L34
            if (r7 == 0) goto L34
            char r6 = (char) r6
            char r7 = (char) r7
            char[] r8 = new char[r3]
            r8[r2] = r6
            r8[r1] = r7
            return r8
        L34:
            char[] r6 = new char[r3]
            return r6
    }

    public final java.lang.String T() {
            r16 = this;
            r0 = r16
            int r1 = r0.hashCode()
            java.lang.String r2 = r0.f14197o
            if (r2 == 0) goto Le
            int r2 = r0.f14198p
            if (r2 == r1) goto L328
        Le:
            m.a r2 = new m.a
            r3 = 22
            r4 = 0
            r2.<init>(r3, r4)
            v7.a0 r3 = r0.f14200n
            byte[] r4 = r3.r()
            boolean r4 = v7.z.R(r4)
            if (r4 == 0) goto L26
            java.lang.String r2 = ""
            goto L324
        L26:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2.f8069h = r4
            java.lang.String r4 = "mcc"
            r5 = 0
            r6 = 2
            int r7 = r3.T(r5, r6)
            r2.i(r7, r4)
            java.lang.String r4 = "mnc"
            int r7 = r3.T(r6, r6)
            r2.i(r7, r4)
            r7.f r4 = r0.f14199m
            int r7 = r4.f11560n
            r8 = 16
            r9 = 4
            if (r7 >= r8) goto L4d
            byte[] r7 = new byte[r6]
            goto L51
        L4d:
            byte[] r7 = r3.S(r9, r6)
        L51:
            r10 = r7[r5]
            r11 = 1
            r7 = r7[r11]
            r12 = 97
            char[] r7 = U(r10, r7, r12)
            r10 = r5
        L5d:
            int r12 = r7.length
            if (r10 >= r12) goto L6d
            char r12 = r7[r10]
            if (r12 == 0) goto L6a
            java.lang.String r10 = new java.lang.String
            r10.<init>(r7)
            goto L6e
        L6a:
            int r10 = r10 + 1
            goto L5d
        L6d:
            r10 = 0
        L6e:
            r7 = 6
            byte[] r7 = r3.S(r7, r6)
            r12 = r7[r5]
            r7 = r7[r11]
            r14 = 48
            char[] r7 = U(r12, r7, r14)
            r12 = r5
        L7e:
            int r15 = r7.length
            if (r12 >= r15) goto L8e
            char r15 = r7[r12]
            if (r15 == 0) goto L8b
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7)
            goto L8f
        L8b:
            int r12 = r12 + 1
            goto L7e
        L8e:
            r12 = 0
        L8f:
            r7 = 32
            byte[] r7 = r3.S(r7, r9)
            boolean r9 = v7.z.R(r7)
            if (r9 == 0) goto L9d
            r15 = 0
            goto Lae
        L9d:
            int r9 = r7.length
            char[] r15 = new char[r9]
            r13 = r5
        La1:
            if (r13 >= r9) goto Lae
            r5 = r7[r13]
            r5 = r5 & 255(0xff, float:3.57E-43)
            char r5 = (char) r5
            r15[r13] = r5
            int r13 = r13 + 1
            r5 = 0
            goto La1
        Lae:
            char[] r5 = v7.z.S(r15)
            if (r5 != 0) goto Lb6
            r7 = 0
            goto Lbb
        Lb6:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r5)
        Lbb:
            r5 = 3
            if (r7 != 0) goto Lc0
            r7 = 0
            goto Lc4
        Lc0:
            java.lang.String r7 = v7.z.Q(r5, r7)
        Lc4:
            r9 = 36
            r13 = 8
            byte[] r9 = r3.S(r9, r13)
            boolean r15 = v7.z.R(r9)
            if (r15 == 0) goto Ld4
            r8 = 0
            goto Le6
        Ld4:
            int r15 = r9.length
            char[] r8 = new char[r15]
            r13 = 0
        Ld8:
            if (r13 >= r15) goto Le6
            r14 = r9[r13]
            r14 = r14 & 255(0xff, float:3.57E-43)
            char r14 = (char) r14
            r8[r13] = r14
            int r13 = r13 + 1
            r14 = 48
            goto Ld8
        Le6:
            char[] r8 = v7.z.S(r8)
            if (r8 != 0) goto Lee
            r9 = 0
            goto Lf3
        Lee:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
        Lf3:
            if (r9 != 0) goto Lf7
            r8 = 0
            goto L100
        Lf7:
            r8 = 5
            java.lang.String r8 = v7.z.Q(r8, r9)
            java.lang.String r8 = r8.toUpperCase()
        L100:
            r9 = 45
            if (r10 != 0) goto L107
            if (r12 != 0) goto L107
            goto L14f
        L107:
            java.lang.Object r13 = r2.f8069h
            java.lang.StringBuilder r13 = (java.lang.StringBuilder) r13
            if (r7 != 0) goto L11a
            if (r8 != 0) goto L11a
            if (r12 == 0) goto L118
            int r14 = r12.length()
            if (r14 != r5) goto L118
            goto L11a
        L118:
            r14 = r9
            goto L124
        L11a:
            r13.append(r9)
            r14 = 98
            r13.append(r14)
            r14 = 43
        L124:
            if (r10 == 0) goto L12c
            r13.append(r14)
            r13.append(r10)
        L12c:
            if (r12 == 0) goto L13f
            r13.append(r14)
            int r10 = r12.length()
            if (r10 != r6) goto L13c
            r10 = 114(0x72, float:1.6E-43)
            r13.append(r10)
        L13c:
            r13.append(r12)
        L13f:
            if (r7 == 0) goto L147
            r13.append(r14)
            r13.append(r7)
        L147:
            if (r8 == 0) goto L14f
            r13.append(r14)
            r13.append(r8)
        L14f:
            r7 = 15
            int r8 = r3.T(r7, r11)
            v7.l[] r10 = v7.l.f14184i
            v7.k r8 = v7.k.a(r10, r5, r8)
            v7.l r8 = (v7.l) r8
            r2.h(r8)
            r8 = 24
            int r10 = r3.T(r8, r11)
            v7.r[] r12 = v7.r.f14190i
            r13 = 192(0xc0, float:2.69E-43)
            v7.k r10 = v7.k.a(r12, r13, r10)
            v7.r r10 = (v7.r) r10
            r2.h(r10)
            r10 = 26
            int r10 = r3.T(r10, r6)
            java.lang.String r12 = "sw"
            r2.g(r10, r12)
            r10 = 28
            int r10 = r3.T(r10, r6)
            java.lang.String r12 = "w"
            r2.g(r10, r12)
            r10 = 30
            int r10 = r3.T(r10, r6)
            java.lang.String r12 = "h"
            r2.g(r10, r12)
            int r10 = r3.T(r8, r11)
            v7.u[] r12 = v7.u.f14193i
            v7.k r10 = v7.k.a(r12, r7, r10)
            v7.u r10 = (v7.u) r10
            r2.h(r10)
            int r8 = r3.T(r8, r11)
            v7.s[] r10 = v7.s.f14191i
            r12 = 48
            v7.k r8 = v7.k.a(r10, r12, r8)
            v7.s r8 = (v7.s) r8
            r2.h(r8)
            r8 = 44
            int r8 = r3.T(r8, r11)
            v7.t[] r10 = v7.t.f14192i
            v7.k r8 = v7.k.a(r10, r5, r8)
            v7.t r8 = (v7.t) r8
            r2.h(r8)
            int r8 = r3.T(r9, r11)
            v7.i[] r10 = v7.i.f14158i
            v7.k r8 = v7.k.a(r10, r5, r8)
            v7.i r8 = (v7.i) r8
            r2.h(r8)
            int r8 = r3.T(r9, r11)
            v7.h[] r10 = v7.h.f14155i
            r12 = 12
            v7.k r8 = v7.k.a(r10, r12, r8)
            v7.h r8 = (v7.h) r8
            r2.h(r8)
            r8 = 8
            int r10 = r3.T(r8, r11)
            v7.q[] r8 = v7.q.f14189i
            v7.k r8 = v7.k.a(r8, r7, r10)
            v7.q r8 = (v7.q) r8
            r2.h(r8)
            r8 = 25
            int r10 = r3.T(r8, r11)
            v7.x[] r13 = v7.x.f14196i
            v7.k r10 = v7.k.a(r13, r7, r10)
            v7.x r10 = (v7.x) r10
            r2.h(r10)
            int r8 = r3.T(r8, r11)
            v7.w[] r10 = v7.w.f14195i
            r13 = 48
            v7.k r8 = v7.k.a(r10, r13, r8)
            v7.w r8 = (v7.w) r8
            r2.h(r8)
            r8 = 10
            int r8 = r3.T(r8, r6)
            if (r8 != 0) goto L222
            r10 = 0
            goto L23b
        L222:
            v7.j[] r10 = v7.j.f14160i
            r13 = 65535(0xffff, float:9.1834E-41)
            v7.k r10 = v7.k.a(r10, r13, r8)
            v7.j r10 = (v7.j) r10
            if (r10 != 0) goto L23b
            r8 = r8 & r13
            v7.j r10 = new v7.j
            java.lang.String r13 = "dpi"
            java.lang.String r13 = p.a.i(r8, r13)
            r10.<init>(r13, r8)
        L23b:
            r2.h(r10)
            r8 = 9
            int r8 = r3.T(r8, r11)
            v7.v[] r10 = v7.v.f14194i
            v7.k r8 = v7.k.a(r10, r7, r8)
            v7.v r8 = (v7.v) r8
            r2.h(r8)
            r8 = 14
            int r10 = r3.T(r8, r11)
            v7.m[] r13 = v7.m.f14185i
            v7.k r5 = v7.k.a(r13, r5, r10)
            v7.m r5 = (v7.m) r5
            r2.h(r5)
            int r5 = r3.T(r12, r11)
            v7.o[] r10 = v7.o.f14187i
            v7.k r5 = v7.k.a(r10, r7, r5)
            v7.o r5 = (v7.o) r5
            r2.h(r5)
            int r5 = r3.T(r8, r11)
            v7.n[] r8 = v7.n.f14186i
            v7.k r5 = v7.k.a(r8, r12, r5)
            v7.n r5 = (v7.n) r5
            r2.h(r5)
            r5 = 13
            int r5 = r3.T(r5, r11)
            v7.p[] r8 = v7.p.f14188i
            v7.k r5 = v7.k.a(r8, r7, r5)
            v7.p r5 = (v7.p) r5
            r2.h(r5)
            r5 = 16
            int r5 = r3.T(r5, r6)
            r7 = 18
            int r7 = r3.T(r7, r6)
            if (r5 != 0) goto L2a0
            if (r7 != 0) goto L2a0
            goto L2b2
        L2a0:
            java.lang.Object r8 = r2.f8069h
            java.lang.StringBuilder r8 = (java.lang.StringBuilder) r8
            r8.append(r9)
            r8.append(r5)
            r5 = 120(0x78, float:1.68E-43)
            r8.append(r5)
            r8.append(r7)
        L2b2:
            r5 = 20
            int r5 = r3.T(r5, r6)
            java.lang.String r7 = "v"
            r2.i(r5, r7)
            int r4 = r4.f11560n
            int r4 = r4 + (-52)
            r12 = 48
            byte[] r3 = r3.S(r12, r4)
            if (r3 != 0) goto L2cc
        L2c9:
            r3 = 0
        L2ca:
            r5 = 0
            goto L2e9
        L2cc:
            r4 = -1
            r7 = r4
            r5 = 0
        L2cf:
            int r8 = r3.length
            if (r5 >= r8) goto L2da
            r8 = r3[r5]
            if (r8 == 0) goto L2d7
            r7 = r5
        L2d7:
            int r5 = r5 + 1
            goto L2cf
        L2da:
            if (r7 != r4) goto L2dd
            goto L2c9
        L2dd:
            int r7 = r7 + r11
            int r4 = r3.length
            if (r7 != r4) goto L2e2
            goto L2ca
        L2e2:
            byte[] r4 = new byte[r7]
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r7)
            r3 = r4
        L2e9:
            boolean r4 = v7.z.R(r3)
            if (r4 == 0) goto L2f1
            r13 = 0
            goto L30a
        L2f1:
            int r4 = r3.length
            r8 = 8
            if (r4 >= r8) goto L2f8
            int r13 = r3.length
            goto L2f9
        L2f8:
            r13 = r8
        L2f9:
            r4 = 0
        L2fa:
            if (r5 >= r13) goto L309
            r7 = r3[r5]
            long r7 = (long) r7
            r10 = 255(0xff, double:1.26E-321)
            long r7 = r7 & r10
            java.lang.String r4 = y7.a.m(r6, r4, r7)
            int r5 = r5 + 1
            goto L2fa
        L309:
            r13 = r4
        L30a:
            if (r13 != 0) goto L30d
            goto L31c
        L30d:
            java.lang.Object r3 = r2.f8069h
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            r3.append(r9)
            java.lang.String r4 = "unknown_bytes"
            r3.append(r4)
            r3.append(r13)
        L31c:
            java.lang.Object r2 = r2.f8069h
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            java.lang.String r2 = r2.toString()
        L324:
            r0.f14197o = r2
            r0.f14198p = r1
        L328:
            java.lang.String r1 = r0.f14197o
            return r1
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r8) {
            r7 = this;
            v7.y r8 = (v7.y) r8
            v7.a0 r0 = r7.f14200n
            r1 = 2
            int r2 = r0.T(r1, r1)
            v7.a0 r3 = r8.f14200n
            v7.a0 r8 = r8.f14200n
            int r3 = r3.T(r1, r1)
            int r2 = y7.a.b(r2, r3)
            if (r2 == 0) goto L18
            return r2
        L18:
            r2 = 0
            int r3 = r0.T(r2, r1)
            int r4 = r8.T(r2, r1)
            int r3 = y7.a.b(r3, r4)
            if (r3 == 0) goto L28
            return r3
        L28:
            r3 = 6
            int r4 = r0.T(r3, r1)
            int r3 = r8.T(r3, r1)
            int r3 = y7.a.b(r4, r3)
            r4 = 4
            if (r3 != 0) goto L44
            int r3 = r0.T(r4, r1)
            int r5 = r8.T(r4, r1)
            int r3 = y7.a.b(r3, r5)
        L44:
            if (r3 != 0) goto L54
            r3 = 32
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
        L54:
            if (r3 != 0) goto L70
            byte[] r3 = r0.f11553k
            r4 = 36
            long r5 = k7.a.t(r3, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            byte[] r5 = r8.f11553k
            long r4 = k7.a.t(r5, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            int r3 = y7.a.c(r3, r4)
        L70:
            if (r3 == 0) goto L73
            return r3
        L73:
            r3 = 15
            r4 = 1
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto L85
            return r3
        L85:
            r3 = 10
            int r5 = r0.T(r3, r1)
            int r3 = r8.T(r3, r1)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto L96
            return r3
        L96:
            r3 = 9
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto La7
            return r3
        La7:
            r3 = 8
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto Lb8
            return r3
        Lb8:
            r3 = 13
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto Lc9
            return r3
        Lc9:
            r3 = 12
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto Lda
            return r3
        Lda:
            r3 = 14
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto Leb
            return r3
        Leb:
            r3 = 16
            int r5 = r0.T(r3, r1)
            int r3 = r8.T(r3, r1)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto Lfc
            return r3
        Lfc:
            r3 = 18
            int r5 = r0.T(r3, r1)
            int r3 = r8.T(r3, r1)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto L10d
            return r3
        L10d:
            r3 = 20
            int r5 = r0.T(r3, r1)
            int r3 = r8.T(r3, r1)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto L11e
            return r3
        L11e:
            r3 = 24
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto L12f
            return r3
        L12f:
            r3 = 44
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto L140
            return r3
        L140:
            r3 = 45
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto L151
            return r3
        L151:
            r3 = 25
            int r5 = r0.T(r3, r4)
            int r3 = r8.T(r3, r4)
            int r3 = y7.a.b(r5, r3)
            if (r3 == 0) goto L162
            return r3
        L162:
            r3 = 26
            int r4 = r0.T(r3, r1)
            int r3 = r8.T(r3, r1)
            int r3 = y7.a.b(r4, r3)
            if (r3 == 0) goto L173
            return r3
        L173:
            r3 = 30
            int r4 = r0.T(r3, r1)
            int r3 = r8.T(r3, r1)
            int r3 = y7.a.b(r4, r3)
            if (r3 == 0) goto L184
            return r3
        L184:
            r3 = 28
            int r0 = r0.T(r3, r1)
            int r8 = r8.T(r3, r1)
            int r8 = y7.a.b(r0, r8)
            if (r8 == 0) goto L195
            return r8
        L195:
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L3
            goto L1a
        L3:
            if (r2 != 0) goto L6
            goto L29
        L6:
            boolean r0 = r2 instanceof v7.y
            if (r0 == 0) goto L29
            v7.y r2 = (v7.y) r2
            v7.a0 r0 = r1.f14200n
            byte[] r0 = r0.r()
            v7.a0 r2 = r2.f14200n
            byte[] r2 = r2.r()
            if (r0 != r2) goto L1c
        L1a:
            r2 = 1
            return r2
        L1c:
            byte[] r0 = r7.c.R(r0)
            byte[] r2 = r7.c.R(r2)
            boolean r2 = r7.c.N(r0, r2)
            return r2
        L29:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            v7.a0 r0 = r1.f14200n
            byte[] r0 = r0.r()
            byte[] r0 = r7.c.R(r0)
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.T()
            int r1 = r0.length()
            if (r1 != 0) goto Ld
            java.lang.String r0 = "[DEFAULT]"
            return r0
        Ld:
            java.lang.String r1 = "["
            java.lang.String r2 = "]"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
    }
}
