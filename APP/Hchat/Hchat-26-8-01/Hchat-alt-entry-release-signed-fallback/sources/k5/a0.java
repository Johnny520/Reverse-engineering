package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends o5.t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k5.b0 f7172j;

    public a0(k5.b0 r1, androidx.lifecycle.x r2, int r3) {
            r0 = this;
            r0.f7172j = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // o5.t
    public final java.lang.Object a(a5.a r9) {
            r8 = this;
            int r0 = r9.f56h
            k5.b0 r1 = r8.f7172j
            int r2 = r1.f7178h
            ac.k r1 = r1.f7179i
            r3 = 0
            if (r0 < r2) goto Lf
            r9 = 3
            r8.f9546g = r9
            return r3
        Lf:
            java.lang.Object r4 = r1.f178i
            k5.u r4 = (k5.u) r4
            java.lang.Object r5 = r9.f57i
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5
            int r0 = r5.O(r0)
            if (r0 != 0) goto L23
            int r0 = r9.f56h
            int r0 = r5.P(r0)
        L23:
            f5.g r5 = r4.f7265c
            r5.getClass()
            r6 = 256(0x100, float:3.59E-43)
            if (r0 == r6) goto L48
            r6 = 512(0x200, float:7.17E-43)
            if (r0 == r6) goto L45
            r6 = 768(0x300, float:1.076E-42)
            if (r0 == r6) goto L42
            if (r0 < 0) goto L40
            java.lang.Object r5 = r5.f3299d
            f5.f[] r5 = (f5.f[]) r5
            int r6 = r5.length
            if (r0 >= r6) goto L40
            r0 = r5[r0]
            goto L4a
        L40:
            r0 = r3
            goto L4a
        L42:
            f5.f r0 = f5.f.f3287u
            goto L4a
        L45:
            f5.f r0 = f5.f.f3286t
            goto L4a
        L48:
            f5.f r0 = f5.f.f3285s
        L4a:
            int r5 = r9.f56h
            androidx.lifecycle.x r6 = r4.f7263a
            r6.getClass()
            if (r0 != 0) goto L5c
            l5.f0 r0 = new l5.f0
            f5.f r6 = f5.f.f3280n
            r0.<init>(r4, r6, r5)
            goto L16d
        L5c:
            int r6 = r0.f3295m
            int r7 = t3.c.b(r6)
            switch(r7) {
                case 0: goto L165;
                case 1: goto L15e;
                case 2: goto L156;
                case 3: goto L14f;
                case 4: goto L147;
                case 5: goto L140;
                case 6: goto L138;
                case 7: goto L131;
                case 8: goto L129;
                case 9: goto L121;
                case 10: goto L119;
                case 11: goto L112;
                case 12: goto L10a;
                case 13: goto L104;
                case 14: goto Lfe;
                case 15: goto Lf7;
                case 16: goto Lf1;
                case 17: goto Lea;
                case 18: goto Le4;
                case 19: goto Ldd;
                case 20: goto Ld7;
                case 21: goto Ld0;
                case 22: goto Lca;
                case 23: goto Lc3;
                case 24: goto Lbd;
                case 25: goto Lb7;
                case 26: goto Lb1;
                case 27: goto Lab;
                case 28: goto La5;
                case 29: goto L9f;
                case 30: goto L99;
                case 31: goto L93;
                case 32: goto L8a;
                case 33: goto L83;
                case 34: goto L7c;
                case 35: goto L75;
                default: goto L65;
            }
        L65:
            d6.f r9 = new d6.f
            java.lang.String r0 = eh.a.B(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Unexpected opcode format: %s"
            r9.<init>(r3, r1, r0)
            throw r9
        L75:
            l5.e0 r0 = new l5.e0
            r0.<init>(r4, r5)
            goto L16d
        L7c:
            l5.c0 r0 = new l5.c0
            r0.<init>(r4, r5)
            goto L16d
        L83:
            l5.b r0 = new l5.b
            r0.<init>(r4, r5)
            goto L16d
        L8a:
            l5.j r6 = new l5.j
            r7 = 1
            r6.<init>(r4, r0, r5, r7)
        L90:
            r0 = r6
            goto L16d
        L93:
            l5.z r6 = new l5.z
            r6.<init>(r4, r0, r5)
            goto L90
        L99:
            l5.y r6 = new l5.y
            r6.<init>(r4, r0, r5)
            goto L90
        L9f:
            l5.x r6 = new l5.x
            r6.<init>(r4, r0, r5)
            goto L90
        La5:
            l5.w r6 = new l5.w
            r6.<init>(r4, r0, r5)
            goto L90
        Lab:
            l5.v r6 = new l5.v
            r6.<init>(r4, r0, r5)
            goto L90
        Lb1:
            l5.u r6 = new l5.u
            r6.<init>(r4, r0, r5)
            goto L90
        Lb7:
            l5.t r6 = new l5.t
            r6.<init>(r4, r0, r5)
            goto L90
        Lbd:
            l5.s r6 = new l5.s
            r6.<init>(r4, r0, r5)
            goto L90
        Lc3:
            l5.g r6 = new l5.g
            r7 = 2
            r6.<init>(r4, r0, r5, r7)
            goto L90
        Lca:
            l5.r r6 = new l5.r
            r6.<init>(r4, r0, r5)
            goto L90
        Ld0:
            l5.e r6 = new l5.e
            r7 = 3
            r6.<init>(r4, r0, r5, r7)
            goto L90
        Ld7:
            l5.q r6 = new l5.q
            r6.<init>(r4, r0, r5)
            goto L90
        Ldd:
            l5.c r6 = new l5.c
            r7 = 2
            r6.<init>(r4, r0, r5, r7)
            goto L90
        Le4:
            l5.p r6 = new l5.p
            r6.<init>(r4, r0, r5)
            goto L90
        Lea:
            l5.g r6 = new l5.g
            r7 = 1
            r6.<init>(r4, r0, r5, r7)
            goto L90
        Lf1:
            l5.o r6 = new l5.o
            r6.<init>(r4, r0, r5)
            goto L90
        Lf7:
            l5.l r6 = new l5.l
            r7 = 1
            r6.<init>(r4, r0, r5, r7)
            goto L90
        Lfe:
            l5.n r6 = new l5.n
            r6.<init>(r4, r0, r5)
            goto L90
        L104:
            l5.m r6 = new l5.m
            r6.<init>(r4, r0, r5)
            goto L90
        L10a:
            l5.l r6 = new l5.l
            r7 = 0
            r6.<init>(r4, r0, r5, r7)
            goto L90
        L112:
            l5.k r6 = new l5.k
            r6.<init>(r4, r0, r5)
            goto L90
        L119:
            l5.e r6 = new l5.e
            r7 = 2
            r6.<init>(r4, r0, r5, r7)
            goto L90
        L121:
            l5.j r6 = new l5.j
            r7 = 0
            r6.<init>(r4, r0, r5, r7)
            goto L90
        L129:
            l5.e r6 = new l5.e
            r7 = 1
            r6.<init>(r4, r0, r5, r7)
            goto L90
        L131:
            l5.i r6 = new l5.i
            r6.<init>(r4, r0, r5)
            goto L90
        L138:
            l5.c r6 = new l5.c
            r7 = 1
            r6.<init>(r4, r0, r5, r7)
            goto L90
        L140:
            l5.h r6 = new l5.h
            r6.<init>(r4, r0, r5)
            goto L90
        L147:
            l5.g r6 = new l5.g
            r7 = 0
            r6.<init>(r4, r0, r5, r7)
            goto L90
        L14f:
            l5.f r6 = new l5.f
            r6.<init>(r4, r0, r5)
            goto L90
        L156:
            l5.e r6 = new l5.e
            r7 = 0
            r6.<init>(r4, r0, r5, r7)
            goto L90
        L15e:
            l5.d r6 = new l5.d
            r6.<init>(r4, r0, r5)
            goto L90
        L165:
            l5.c r6 = new l5.c
            r7 = 0
            r6.<init>(r4, r0, r5, r7)
            goto L90
        L16d:
            int r4 = r0.c()
            int r4 = r4 * 2
            int r5 = r9.f56h
            int r5 = r5 + r4
            r9.f56h = r5
            if (r5 > r2) goto L17d
            if (r5 < 0) goto L17d
            return r0
        L17d:
            d6.f r9 = new d6.f
            java.lang.Object r0 = r1.f179j
            k5.z r0 = (k5.z) r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "The last instruction in method %s is truncated"
            r9.<init>(r3, r1, r0)
            throw r9
    }
}
