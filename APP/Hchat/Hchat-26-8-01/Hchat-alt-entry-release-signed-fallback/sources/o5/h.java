package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends o5.j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l3.w f9521j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k5.u f9522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ac.k f9524i;

    static {
            l3.w r0 = new l3.w
            r1 = 10
            r0.<init>(r1)
            o5.h.f9521j = r0
            return
    }

    public h(k5.u r1, int r2, ac.k r3) {
            r0 = this;
            r0.<init>()
            r0.f9522g = r1
            r0.f9523h = r2
            r0.f9524i = r3
            return
    }

    @Override // o5.j
    public final /* bridge */ /* synthetic */ java.util.Iterator a() {
            r1 = this;
            r0 = 0
            o5.g r0 = r1.b(r0)
            return r0
    }

    public final o5.g b(a5.a r4) {
            r3 = this;
            if (r4 != 0) goto L15
            k5.u r4 = r3.f9522g
            androidx.lifecycle.x r4 = r4.f7264b
            r4.getClass()
            a5.a r0 = new a5.a
            r1 = 5
            int r2 = r3.f9523h
            r0.<init>(r2, r1, r4)
            r0.q()
            r4 = r0
        L15:
            r0 = 0
            int r0 = r4.o(r0)
            o5.g r1 = new o5.g
            r1.<init>(r3, r4, r0)
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r18 = this;
            r1 = r18
            ac.k r0 = r1.f9524i
            java.lang.Object r2 = r0.f179j
            k5.z r2 = (k5.z) r2
            k5.u r3 = r1.f9522g
            androidx.lifecycle.x r4 = r3.f7264b
            r4.getClass()
            a5.a r5 = new a5.a
            r6 = 5
            int r7 = r1.f9523h
            r5.<init>(r7, r6, r4)
            java.lang.Object r4 = r4.f310h
            byte[] r4 = (byte[]) r4
            int r6 = r7 + 1
            r8 = r4[r7]
            r9 = r8 & 255(0xff, float:3.57E-43)
            r10 = 0
            r11 = 127(0x7f, float:1.78E-43)
            if (r9 <= r11) goto L55
            int r9 = r7 + 2
            r6 = r4[r6]
            r12 = r6 & 255(0xff, float:3.57E-43)
            r8 = r8 & r11
            r6 = r6 & r11
            int r6 = r6 << 7
            r6 = r6 | r8
            if (r12 <= r11) goto L67
            int r8 = r7 + 3
            r9 = r4[r9]
            r12 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 & r11
            int r9 = r9 << 14
            r9 = r9 | r6
            if (r12 <= r11) goto L54
            int r6 = r7 + 4
            r8 = r4[r8]
            r12 = r8 & 255(0xff, float:3.57E-43)
            r8 = r8 & r11
            int r8 = r8 << 21
            r9 = r9 | r8
            if (r12 <= r11) goto L55
            int r8 = r7 + 5
            r4 = r4[r6]
            if (r4 < 0) goto L57
            int r4 = r4 << 28
            r9 = r9 | r4
        L54:
            r6 = r8
        L55:
            r4 = r9
            goto L69
        L57:
            d6.f r0 = new d6.f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "Invalid uleb128 integer encountered at offset 0x%x"
            r0.<init>(r10, r3, r2)
            throw r0
        L67:
            r4 = r6
            r6 = r9
        L69:
            r5.f56h = r6
            int r6 = r0.t()
            java.lang.Object r7 = r0.f178i
            k5.u r7 = (k5.u) r7
            androidx.lifecycle.x r7 = r7.f7264b
            int r8 = r0.f177h
            int r8 = r8 + 12
            int r7 = r7.N(r8)
            k5.b0 r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        L85:
            r8 = r0
            o5.t r8 = (o5.t) r8
            java.lang.Object r9 = r8.next()
            boolean r8 = r8.hasNext()
            if (r8 != 0) goto L15b
            t5.d r9 = (t5.d) r9
            int r0 = r9.c()
            int r7 = r7 - r0
            s5.a[] r0 = new s5.a[r6]
            l3.w r8 = o5.h.f9521j
            java.util.Arrays.fill(r0, r8)
            java.util.List r9 = r2.g1()
            k5.u r11 = r2.f7302j
            int r12 = r2.f7306n
            if (r12 <= 0) goto Lb7
            androidx.lifecycle.x r13 = r11.f7264b
            int r13 = r13.N(r12)
            k5.y r14 = new k5.y
            r15 = 3
            r14.<init>(r11, r12, r13, r15)
            goto Lb9
        Lb7:
            java.util.List r14 = java.util.Collections.EMPTY_LIST
        Lb9:
            o5.g r11 = r1.b(r5)
            java.util.Iterator r9 = r9.iterator()
            java.util.Iterator r12 = r14.iterator()
            f5.a r13 = f5.a.f3258l
            int r2 = r2.f7304l
            boolean r2 = r13.a(r2)
            r14 = 0
            if (r2 != 0) goto Lda
            m.a r2 = new m.a
            r15 = 8
            r2.<init>(r1, r15)
            r0[r14] = r2
            r14 = 1
        Lda:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L11f
            int r2 = r14 + 1
            java.lang.Object r15 = r9.next()
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            java.lang.String r15 = r15.toString()
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto Lfb
            java.lang.Object r16 = r12.next()
            java.util.Set r16 = (java.util.Set) r16
        Lf8:
            r10 = r16
            goto Lfe
        Lfb:
            java.util.Set r16 = java.util.Collections.EMPTY_SET
            goto Lf8
        Lfe:
            boolean r16 = r11.hasNext()
            if (r16 == 0) goto L111
            java.lang.Object r16 = r11.next()
            java.lang.String r16 = (java.lang.String) r16
            r13 = r16
        L10c:
            r17 = r0
            r16 = 1
            goto L113
        L111:
            r13 = 0
            goto L10c
        L113:
            o5.p r0 = new o5.p
            r0.<init>(r13, r15, r10)
            r17[r14] = r0
            r14 = r2
            r0 = r17
            r10 = 0
            goto Lda
        L11f:
            r17 = r0
            r16 = 1
            if (r14 >= r6) goto L14e
            int r6 = r6 + (-1)
        L127:
            r0 = -1
            int r14 = r14 + r0
            if (r14 <= r0) goto L14e
            r2 = r17[r14]
            java.lang.String r9 = r2.getType()
            if (r9 == 0) goto L148
            java.lang.String r10 = "J"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L143
            java.lang.String r10 = "D"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L148
        L143:
            int r6 = r6 + (-1)
            if (r6 != r14) goto L148
            goto L14e
        L148:
            r17[r6] = r2
            r17[r14] = r8
            int r6 = r6 + r0
            goto L127
        L14e:
            o5.f r0 = new o5.f
            androidx.lifecycle.x r2 = r3.f7264b
            int r3 = r5.f56h
            r5 = r7
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L15b:
            r1 = r18
            goto L85
    }
}
