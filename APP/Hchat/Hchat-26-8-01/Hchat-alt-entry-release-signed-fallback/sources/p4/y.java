package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.h f10238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b5.c f10240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p4.t f10241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hb.c f10242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f10244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10246i;

    public y(f1.h r10, int r11, int r12, n4.a r13) {
            r9 = this;
            r9.<init>()
            r9.f10238a = r10
            r9.f10239b = r11
            b5.c r11 = new b5.c
            r11.<init>()
            java.lang.Object r0 = r10.f3058i
            u4.c r0 = (u4.c) r0
            int r1 = r0.o()
            p4.f[] r2 = new p4.f[r1]
            r11.f469a = r2
            p4.f[] r2 = new p4.f[r1]
            r11.f470b = r2
            p4.f[] r1 = new p4.f[r1]
            r11.f471c = r1
            java.lang.Object[] r1 = r0.f22543h
            int r1 = r1.length
            r2 = 0
            r3 = r2
        L25:
            if (r3 >= r1) goto L63
            java.lang.Object r4 = r0.l(r3)
            u4.b r4 = (u4.b) r4
            h4.u r5 = r4.f13366b
            int r4 = r4.f13365a
            java.lang.Object r6 = r5.l(r2)
            u4.i r6 = (u4.i) r6
            java.lang.Object r7 = r11.f469a
            p4.f[] r7 = (p4.f[]) r7
            p4.f r8 = new p4.f
            u4.t r6 = r6.f13383h
            r8.<init>(r6, r2)
            r7[r4] = r8
            u4.i r5 = r5.p()
            u4.t r5 = r5.f13383h
            java.lang.Object r6 = r11.f470b
            p4.f[] r6 = (p4.f[]) r6
            p4.f r7 = new p4.f
            r7.<init>(r5, r2)
            r6[r4] = r7
            java.lang.Object r6 = r11.f471c
            p4.f[] r6 = (p4.f[]) r6
            p4.f r7 = new p4.f
            r7.<init>(r5, r2)
            r6[r4] = r7
            int r3 = r3 + 1
            goto L25
        L63:
            r9.f10240c = r11
            r9.f10245h = r12
            r11 = 0
            r9.f10244g = r11
            r11 = 1
            boolean[] r0 = new boolean[r11]
            r0[r2] = r11
            java.lang.Object r10 = r10.f3058i
            u4.c r10 = (u4.c) r10
            int r11 = r10.r()
            i.u1 r1 = new i.u1
            r1.<init>(r0, r11, r12)
            java.lang.Object[] r11 = r10.f22543h
            int r11 = r11.length
            r3 = r2
        L80:
            if (r3 >= r11) goto L9f
            java.lang.Object r4 = r10.l(r3)
            u4.b r4 = (u4.b) r4
            h4.u r4 = r4.f13366b
            java.lang.Object[] r5 = r4.f22543h
            int r5 = r5.length
            r6 = r2
        L8e:
            if (r6 >= r5) goto L9c
            java.lang.Object r7 = r4.l(r6)
            u4.i r7 = (u4.i) r7
            r7.d(r1)
            int r6 = r6 + 1
            goto L8e
        L9c:
            int r3 = r3 + 1
            goto L80
        L9f:
            boolean r11 = r0[r2]
            r9.f10246i = r11
            java.lang.Object[] r0 = r10.f22543h
            int r1 = r0.length
            int r6 = r1 * 3
            int r0 = r0.length
            r1 = r2
            r3 = r1
        Lab:
            if (r1 >= r0) goto Lbe
            java.lang.Object[] r4 = r10.f22543h
            r4 = r4[r1]
            u4.b r4 = (u4.b) r4
            if (r4 == 0) goto Lbb
            h4.u r4 = r4.f13366b
            java.lang.Object[] r4 = r4.f22543h
            int r4 = r4.length
            int r3 = r3 + r4
        Lbb:
            int r1 = r1 + 1
            goto Lab
        Lbe:
            int r5 = r3 + r6
            int r10 = r10.r()
            if (r11 == 0) goto Lc7
            goto Lc8
        Lc7:
            r2 = r12
        Lc8:
            int r7 = r10 + r2
            r9.f10243f = r7
            p4.t r3 = new p4.t
            r8 = r12
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f10241d = r3
            hb.c r10 = new hb.c
            r10.<init>()
            r10.f5341j = r9
            r10.f5338g = r3
            r9.f10242e = r10
            return
    }

    public static u4.p a(u4.i r5, u4.o r6) {
            u4.p r0 = r5.f13385j
            u4.r r5 = r5.f13382g
            int r5 = r5.f13406a
            r1 = 14
            r2 = 0
            if (r5 == r1) goto L13
            r1 = 16
            if (r5 == r1) goto L13
            switch(r5) {
                case 20: goto L13;
                case 21: goto L13;
                case 22: goto L13;
                default: goto L12;
            }
        L12:
            goto L36
        L13:
            java.lang.Object[] r5 = r0.f22543h
            int r5 = r5.length
            r1 = 2
            if (r5 != r1) goto L36
            int r5 = r6.f13400g
            r1 = 1
            java.lang.Object r3 = r0.l(r1)
            u4.o r3 = (u4.o) r3
            int r3 = r3.f13400g
            if (r5 != r3) goto L36
            java.lang.Object r5 = r0.l(r1)
            u4.o r5 = (u4.o) r5
            java.lang.Object r0 = r0.l(r2)
            u4.o r0 = (u4.o) r0
            u4.p r0 = u4.p.q(r5, r0)
        L36:
            if (r6 != 0) goto L39
            return r0
        L39:
            java.lang.Object[] r5 = r0.f22543h
            int r5 = r5.length
            u4.p r1 = new u4.p
            int r3 = r5 + 1
            r1.<init>(r3)
            r3 = r2
        L44:
            if (r3 >= r5) goto L51
            int r4 = r3 + 1
            java.lang.Object r3 = r0.l(r3)
            r1.m(r4, r3)
            r3 = r4
            goto L44
        L51:
            r1.m(r2, r6)
            boolean r5 = r0.f22555g
            if (r5 != 0) goto L5a
            r1.f22555g = r2
        L5a:
            return r1
    }

    public static i4.a b(f1.h r24, int r25, int r26, n4.a r27) {
            r0 = r24
            int r1 = r0.f3057h
            p4.y r2 = new p4.y
            r3 = r25
            r4 = r26
            r5 = r27
            r2.<init>(r0, r3, r4, r5)
            java.lang.Object r3 = r0.f3058i
            u4.c r3 = (u4.c) r3
            java.lang.Object[] r4 = r3.f22543h
            int r4 = r4.length
            int r5 = r3.o()
            int[] r6 = x6.d.L(r5)
            int[] r5 = x6.d.L(r5)
            r8 = 0
        L23:
            if (r8 >= r4) goto L33
            java.lang.Object r9 = r3.l(r8)
            u4.b r9 = (u4.b) r9
            int r9 = r9.f13365a
            x6.d.g0(r6, r9)
            int r8 = r8 + 1
            goto L23
        L33:
            int[] r8 = new int[r4]
            r9 = r1
            r10 = 0
        L37:
            r12 = -1
            if (r9 == r12) goto L180
        L3a:
            java.lang.Object r14 = r0.f3060k
            z4.g r14 = (z4.g) r14
            if (r14 != 0) goto Lc8
            int r14 = r3.o()
            z4.g[] r15 = new z4.g[r14]
            z4.g r11 = new z4.g
            r13 = 10
            r11.<init>(r13)
            java.lang.Object[] r12 = r3.f22543h
            int r12 = r12.length
            r7 = 0
        L51:
            if (r7 >= r12) goto La1
            java.lang.Object r16 = r3.l(r7)
            r13 = r16
            u4.b r13 = (u4.b) r13
            r16 = r1
            int r1 = r13.f13365a
            z4.g r13 = r13.f13367c
            r18 = r7
            int r7 = r13.f22552i
            if (r7 != 0) goto L6f
            r11.l(r1)
            r19 = r12
        L6c:
            r12 = 10
            goto L99
        L6f:
            r19 = r12
            r12 = 0
        L72:
            if (r12 >= r7) goto L6c
            int r20 = r13.n(r12)
            r21 = r15[r20]
            r22 = r7
            if (r21 != 0) goto L8a
            z4.g r7 = new z4.g
            r23 = r12
            r12 = 10
            r7.<init>(r12)
            r15[r20] = r7
            goto L90
        L8a:
            r23 = r12
            r12 = 10
            r7 = r21
        L90:
            r7.l(r1)
            int r7 = r23 + 1
            r12 = r7
            r7 = r22
            goto L72
        L99:
            int r7 = r18 + 1
            r13 = r12
            r1 = r16
            r12 = r19
            goto L51
        La1:
            r16 = r1
            r1 = 0
        La4:
            if (r1 >= r14) goto Lb5
            r7 = r15[r1]
            if (r7 == 0) goto Lb1
            r7.s()
            r12 = 0
            r7.f22555g = r12
            goto Lb2
        Lb1:
            r12 = 0
        Lb2:
            int r1 = r1 + 1
            goto La4
        Lb5:
            r12 = 0
            r11.s()
            r11.f22555g = r12
            r1 = r15[r16]
            if (r1 != 0) goto Lc3
            z4.g r1 = z4.g.f22550k
            r15[r16] = r1
        Lc3:
            r0.f3059j = r15
            r0.f3060k = r11
            goto Lca
        Lc8:
            r16 = r1
        Lca:
            java.lang.Object r1 = r0.f3059j
            z4.g[] r1 = (z4.g[]) r1
            r1 = r1[r9]
            if (r1 == 0) goto L171
            int r7 = r1.f22552i
            r11 = 0
        Ld5:
            if (r11 >= r7) goto Lfd
            int r12 = r1.n(r11)
            boolean r13 = x6.d.z(r5, r12)
            if (r13 == 0) goto Le2
            goto Lfd
        Le2:
            boolean r13 = x6.d.z(r6, r12)
            if (r13 != 0) goto Le9
            goto Lfa
        Le9:
            u4.b r13 = r3.s(r12)
            int r13 = r13.f13368d
            if (r13 != r9) goto Lfa
            x6.d.g0(r5, r12)
            r9 = r12
            r1 = r16
            r12 = -1
            goto L3a
        Lfa:
            int r11 = r11 + 1
            goto Ld5
        Lfd:
            r1 = -1
        Lfe:
            if (r9 == r1) goto L13a
            x6.d.q(r6, r9)
            x6.d.q(r5, r9)
            r8[r10] = r9
            int r10 = r10 + 1
            u4.b r1 = r3.s(r9)
            z4.g r7 = r1.f13367c
            int r1 = r1.f13368d
            int r9 = r7.f22552i
            if (r9 == 0) goto L136
            r11 = 1
            if (r9 == r11) goto L12b
            r9 = -1
            if (r1 == r9) goto L121
            u4.b r11 = r3.s(r1)
            goto L138
        L121:
            r12 = 0
            int r11 = r7.n(r12)
            u4.b r11 = r3.s(r11)
            goto L138
        L12b:
            r9 = -1
            r12 = 0
            int r11 = r7.n(r12)
            u4.b r11 = r3.s(r11)
            goto L138
        L136:
            r9 = -1
            r11 = 0
        L138:
            if (r11 != 0) goto L13c
        L13a:
            r12 = 0
            goto L169
        L13c:
            int r11 = r11.f13365a
            boolean r12 = x6.d.z(r6, r11)
            if (r12 == 0) goto L146
            r12 = r11
            goto L166
        L146:
            if (r1 == r11) goto L152
            if (r1 < 0) goto L152
            boolean r11 = x6.d.z(r6, r1)
            if (r11 == 0) goto L152
            r12 = r1
            goto L166
        L152:
            int r1 = r7.f22552i
            r11 = 0
        L155:
            if (r11 >= r1) goto L165
            int r12 = r7.n(r11)
            boolean r13 = x6.d.z(r6, r12)
            if (r13 == 0) goto L162
            goto L166
        L162:
            int r11 = r11 + 1
            goto L155
        L165:
            r12 = r9
        L166:
            r1 = r9
            r9 = r12
            goto Lfe
        L169:
            int r9 = x6.d.x(r6, r12)
            r1 = r16
            goto L37
        L171:
            java.lang.String r0 = a.a.X0(r9)
            java.lang.String r1 = "no such block: "
            java.lang.String r0 = r1.concat(r0)
            bsh.j.g(r0)
            r0 = 0
            return r0
        L180:
            r9 = r12
            if (r10 != r4) goto L2ba
            r2.f10244g = r8
            r12 = 0
        L186:
            p4.t r1 = r2.f10241d
            b5.c r5 = r2.f10240c
            if (r12 >= r4) goto L24f
            int r6 = r12 + 1
            if (r6 != r4) goto L192
            r7 = r9
            goto L194
        L192:
            r7 = r8[r6]
        L194:
            r10 = r8[r12]
            u4.b r10 = r3.s(r10)
            java.lang.Object r11 = r5.f469a
            p4.f[] r11 = (p4.f[]) r11
            int r12 = r10.f13365a
            int r13 = r10.f13368d
            h4.u r14 = r10.f13366b
            r15 = r11[r12]
            java.lang.Object r9 = r1.f10224h
            p4.u r9 = (p4.u) r9
            java.lang.Object r1 = r1.f10224h
            p4.u r1 = (p4.u) r1
            r9.a(r15)
            java.lang.Object r9 = r5.f470b
            p4.f[] r9 = (p4.f[]) r9
            r9 = r9[r12]
            hb.c r15 = r2.f10242e
            r15.f5339h = r10
            r15.f5340i = r9
            java.lang.Object[] r9 = r14.f22543h
            int r9 = r9.length
            r16 = r3
            r3 = 0
        L1c3:
            if (r3 >= r9) goto L1d5
            java.lang.Object r17 = r14.l(r3)
            r18 = r3
            r3 = r17
            u4.i r3 = (u4.i) r3
            r3.d(r15)
            int r3 = r18 + 1
            goto L1c3
        L1d5:
            java.lang.Object r3 = r5.f471c
            p4.f[] r3 = (p4.f[]) r3
            r3 = r3[r12]
            r1.a(r3)
            u4.i r3 = r14.p()
            if (r13 < 0) goto L247
            if (r13 == r7) goto L247
            u4.r r5 = r3.f13382g
            int r5 = r5.f13410e
            r9 = 4
            if (r5 != r9) goto L234
            z4.g r5 = r10.f13367c
            int r9 = r5.f22552i
            r10 = 2
            if (r9 != r10) goto L22d
            r12 = 0
            int r9 = r5.n(r12)
            if (r9 != r13) goto L201
            r14 = 1
            int r9 = r5.n(r14)
            goto L202
        L201:
            r14 = 1
        L202:
            if (r9 != r7) goto L236
            r3 = r11[r13]
            java.util.ArrayList r5 = r1.f10228c
            int r5 = r5.size()
            int r5 = r5 - r10
            java.util.ArrayList r7 = r1.f10228c     // Catch: java.lang.ClassCastException -> L21f java.lang.IndexOutOfBoundsException -> L226
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.ClassCastException -> L21f java.lang.IndexOutOfBoundsException -> L226
            p4.b0 r7 = (p4.b0) r7     // Catch: java.lang.ClassCastException -> L21f java.lang.IndexOutOfBoundsException -> L226
            java.util.ArrayList r1 = r1.f10228c
            p4.b0 r3 = r7.o(r3)
            r1.set(r5, r3)
            goto L249
        L21f:
            java.lang.String r0 = "non-reversible instruction"
            j8.o.t(r0)
            r0 = 0
            return r0
        L226:
            java.lang.String r0 = "too few instructions"
            j8.o.t(r0)
            r0 = 0
            return r0
        L22d:
            java.lang.String r0 = "block doesn't have exactly two successors"
            j8.o.w(r0)
            r0 = 0
            return r0
        L234:
            r12 = 0
            r14 = 1
        L236:
            p4.b0 r5 = new p4.b0
            p4.j r7 = p4.k.I
            u4.t r3 = r3.f13383h
            u4.p r9 = u4.p.f13403i
            r10 = r11[r13]
            r5.<init>(r7, r3, r9, r10)
            r1.a(r5)
            goto L249
        L247:
            r12 = 0
            r14 = 1
        L249:
            r12 = r6
            r3 = r16
            r9 = -1
            goto L186
        L24f:
            r12 = 0
            b5.c r3 = new b5.c
            int[] r4 = r2.f10244g
            r3.<init>()
            if (r4 == 0) goto L2b3
            if (r5 == 0) goto L2ac
            r3.f469a = r0
            r3.f470b = r4
            r3.f471c = r5
            i4.a r0 = new i4.a
            java.lang.Object r4 = r1.f10224h
            p4.u r4 = (p4.u) r4
            java.lang.Object r5 = r1.f10225i
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 == 0) goto L2a5
            int r5 = r5.size()
            r7 = r12
        L272:
            if (r7 >= r5) goto L284
            java.lang.Object r6 = r1.f10225i
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r6 = r6.get(r7)
            p4.h r6 = (p4.h) r6
            r4.a(r6)
            int r7 = r7 + 1
            goto L272
        L284:
            r6 = 0
            r1.f10225i = r6
            r0.<init>()
            if (r4 == 0) goto L29e
            int r1 = r2.f10239b
            r0.f6407g = r1
            r0.f6408h = r4
            r0.f6409i = r3
            r1 = 0
            r0.f6410j = r1
            r0.f6411k = r1
            r0.f6412l = r1
            r0.f6413m = r1
            return r0
        L29e:
            java.lang.String r0 = "unprocessedInsns == null"
            bsh.j.c(r0)
            r0 = 0
            throw r0
        L2a5:
            java.lang.String r0 = "already processed"
            j8.o.w(r0)
            r0 = 0
            return r0
        L2ac:
            java.lang.String r0 = "addresses == null"
            bsh.j.c(r0)
            r0 = 0
            throw r0
        L2b3:
            java.lang.String r0 = "order == null"
            bsh.j.c(r0)
            r0 = 0
            throw r0
        L2ba:
            java.lang.String r0 = "shouldn't happen"
            bsh.j.g(r0)
            r0 = 0
            return r0
    }
}
