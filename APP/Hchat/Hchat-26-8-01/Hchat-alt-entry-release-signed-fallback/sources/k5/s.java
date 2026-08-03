package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends k5.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k5.u f7262h;

    public /* synthetic */ s(k5.u r1, int r2) {
            r0 = this;
            r0.f7261g = r2
            r0.f7262h = r1
            r0.<init>()
            return
    }

    public final java.lang.String b(int r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.f7261g
            switch(r1) {
                case 0: goto L1a;
                default: goto L7;
            }
        L7:
            int r1 = r17.c(r18)
            k5.u r2 = r0.f7262h
            androidx.lifecycle.x r3 = r2.f7263a
            int r1 = r3.N(r1)
            k5.s r2 = r2.f7280r
            java.lang.String r1 = r2.b(r1)
            return r1
        L1a:
            int r1 = r17.c(r18)
            k5.u r2 = r0.f7262h
            androidx.lifecycle.x r3 = r2.f7263a
            int r1 = r3.N(r1)
            androidx.lifecycle.x r2 = r2.f7264b
            r2.getClass()
            a5.a r3 = new a5.a
            r4 = 5
            r3.<init>(r1, r4, r2)
            r1 = 0
            int r4 = r3.o(r1)
            r5 = 1
            int[] r5 = new int[r5]
            java.lang.Object r2 = r2.f310h
            byte[] r2 = (byte[]) r2
            int r6 = r3.f56h
            d6.m r7 = d6.n.f2034a
            java.lang.Object r8 = r7.get()
            char[] r8 = (char[]) r8
            if (r8 == 0) goto L4c
            int r9 = r8.length
            if (r9 >= r4) goto L51
        L4c:
            char[] r8 = new char[r4]
            r7.set(r8)
        L51:
            r9 = r1
            r7 = r6
        L53:
            if (r4 <= 0) goto Lda
            r10 = r2[r7]
            r11 = r10 & 255(0xff, float:3.57E-43)
            int r12 = r11 >> 4
            r13 = 0
            r14 = 128(0x80, float:1.8E-43)
            switch(r12) {
                case 0: goto Lc3;
                case 1: goto Lc3;
                case 2: goto Lc3;
                case 3: goto Lc3;
                case 4: goto Lc3;
                case 5: goto Lc3;
                case 6: goto Lc3;
                case 7: goto Lc3;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L61;
                case 11: goto L61;
                case 12: goto L9d;
                case 13: goto L9d;
                case 14: goto L65;
                default: goto L61;
            }
        L61:
            d6.n.a(r11, r7)
            throw r13
        L65:
            int r11 = r7 + 1
            r12 = r2[r11]
            r15 = r12 & 255(0xff, float:3.57E-43)
            r18 = r13
            r13 = r12 & 192(0xc0, float:2.69E-43)
            if (r13 != r14) goto L99
            int r11 = r7 + 2
            r13 = r2[r11]
            r15 = r13 & 255(0xff, float:3.57E-43)
            r16 = r1
            r1 = r13 & 192(0xc0, float:2.69E-43)
            if (r1 != r14) goto L95
            r1 = r10 & 15
            int r1 = r1 << 12
            r10 = r12 & 63
            int r10 = r10 << 6
            r1 = r1 | r10
            r10 = r13 & 63
            r1 = r1 | r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r1 < r10) goto L91
            char r1 = (char) r1
            int r7 = r7 + 3
            goto Lcc
        L91:
            d6.n.a(r15, r11)
            throw r18
        L95:
            d6.n.a(r15, r11)
            throw r18
        L99:
            d6.n.a(r15, r11)
            throw r18
        L9d:
            r16 = r1
            r18 = r13
            int r1 = r7 + 1
            r11 = r2[r1]
            r12 = r11 & 255(0xff, float:3.57E-43)
            r13 = r11 & 192(0xc0, float:2.69E-43)
            if (r13 != r14) goto Lbf
            r10 = r10 & 31
            int r10 = r10 << 6
            r11 = r11 & 63
            r10 = r10 | r11
            if (r10 == 0) goto Lbb
            if (r10 < r14) goto Lb7
            goto Lbb
        Lb7:
            d6.n.a(r12, r1)
            throw r18
        Lbb:
            char r1 = (char) r10
            int r7 = r7 + 2
            goto Lcc
        Lbf:
            d6.n.a(r12, r1)
            throw r18
        Lc3:
            r16 = r1
            r18 = r13
            if (r11 == 0) goto Ld6
            char r1 = (char) r11
            int r7 = r7 + 1
        Lcc:
            r8[r9] = r1
            int r9 = r9 + 1
            int r4 = r4 + (-1)
            r1 = r16
            goto L53
        Ld6:
            d6.n.a(r11, r7)
            throw r18
        Lda:
            r16 = r1
            int r7 = r7 - r6
            r5[r16] = r7
            r5[r16] = r7
            java.lang.String r1 = new java.lang.String
            r2 = r16
            r1.<init>(r8, r2, r9)
            int r4 = r3.f56h
            r2 = r5[r2]
            int r4 = r4 + r2
            r3.f56h = r4
            return r1
    }

    public final int c(int r3) {
            r2 = this;
            int r0 = r2.f7261g
            switch(r0) {
                case 0: goto L2b;
                default: goto L5;
            }
        L5:
            k5.u r0 = r2.f7262h
            int r1 = r0.f7268f
            if (r3 < 0) goto L13
            if (r3 >= r1) goto L13
            int r0 = r0.f7269g
        Lf:
            int r3 = r3 * 4
            int r3 = r3 + r0
            return r3
        L13:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1}
            java.lang.String r1 = "Invalid type index %d, not in [0, %d)"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            r0.<init>(r3)
            throw r0
        L2b:
            k5.u r0 = r2.f7262h
            int r1 = r0.f7266d
            if (r3 < 0) goto L36
            if (r3 >= r1) goto L36
            int r0 = r0.f7267e
            goto Lf
        L36:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1}
            java.lang.String r1 = "Invalid string index %d, not in [0, %d)"
            java.lang.String r3 = java.lang.String.format(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    public final java.lang.String d(int r2) {
            r1 = this;
            int r0 = r1.f7261g
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            r0 = -1
            if (r2 != r0) goto La
            r2 = 0
            goto Le
        La:
            java.lang.String r2 = r1.b(r2)
        Le:
            return r2
        Lf:
            r0 = -1
            if (r2 != r0) goto L14
            r2 = 0
            goto L18
        L14:
            java.lang.String r2 = r1.b(r2)
        L18:
            return r2
    }

    @Override // k5.t, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.f7261g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = r1.b(r2)
            return r2
        La:
            java.lang.String r2 = r1.b(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f7261g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            k5.u r0 = r1.f7262h
            int r0 = r0.f7268f
            return r0
        La:
            k5.u r0 = r1.f7262h
            int r0 = r0.f7266d
            return r0
    }
}
