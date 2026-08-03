package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o5.t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s5.a[] f9514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o5.h f9515n;

    public f(o5.h r1, androidx.lifecycle.x r2, int r3, int r4, int r5, s5.a[] r6) {
            r0 = this;
            r0.f9515n = r1
            r0.f9513l = r5
            r0.f9514m = r6
            r0.<init>(r2, r3)
            r1 = 0
            r0.f9511j = r1
            r0.f9512k = r4
            return
    }

    @Override // o5.t
    public final java.lang.Object a(a5.a r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            o5.h r2 = r0.f9515n
            k5.u r2 = r2.f9522g
        L8:
            int r3 = r0.f9511j
            int r4 = r0.f9513l
            r5 = 0
            r6 = 3
            if (r3 > r4) goto L129
            int r3 = r1.n()
            l3.w r7 = o5.h.f9521j
            s5.a[] r8 = r0.f9514m
            r9 = 1
            r10 = 0
            switch(r3) {
                case 0: goto L126;
                case 1: goto L11b;
                case 2: goto L110;
                case 3: goto Le6;
                case 4: goto Lb2;
                case 5: goto L85;
                case 6: goto L5f;
                case 7: goto L56;
                case 8: goto L4d;
                case 9: goto L3a;
                default: goto L1d;
            }
        L1d:
            int r3 = r3 + (-10)
            int r1 = r0.f9511j
            int r2 = r3 / 15
            int r2 = r2 + r1
            r0.f9511j = r2
            int r1 = r0.f9512k
            int r3 = r3 % 15
            int r3 = r3 + (-4)
            int r3 = r3 + r1
            r0.f9512k = r3
            if (r2 <= r4) goto L34
            r0.f9546g = r6
            return r5
        L34:
            x5.d r1 = new x5.d
            r1.<init>(r2, r3)
            return r1
        L3a:
            k5.s r2 = r2.f7280r
            int r1 = r1.o(r10)
            int r1 = r1 - r9
            java.lang.String r1 = r2.d(r1)
            x5.f r2 = new x5.f
            int r3 = r0.f9511j
            r2.<init>(r3, r1)
            return r2
        L4d:
            x5.c r1 = new x5.c
            int r2 = r0.f9511j
            r3 = 0
            r1.<init>(r2, r3)
            return r1
        L56:
            x5.c r1 = new x5.c
            int r2 = r0.f9511j
            r3 = 1
            r1.<init>(r2, r3)
            return r1
        L5f:
            int r11 = r1.o(r10)
            if (r11 < 0) goto L6a
            int r1 = r8.length
            if (r11 >= r1) goto L6a
            r7 = r8[r11]
        L6a:
            x5.e r9 = new x5.e
            int r10 = r0.f9511j
            java.lang.String r12 = r7.getName()
            java.lang.String r13 = r7.getType()
            java.lang.String r14 = r7.e()
            r9.<init>(r10, r11, r12, r13, r14)
            if (r11 < 0) goto L84
            int r1 = r8.length
            if (r11 >= r1) goto L84
            r8[r11] = r9
        L84:
            return r9
        L85:
            int r4 = r1.o(r10)
            if (r4 < 0) goto L91
            int r1 = r8.length
            if (r4 >= r1) goto L91
            r1 = r8[r4]
            goto L93
        L91:
            r1 = r7
            r9 = r10
        L93:
            boolean r2 = r1 instanceof x5.b
            if (r2 == 0) goto L98
            goto L9a
        L98:
            r7 = r1
            r10 = r9
        L9a:
            x5.b r2 = new x5.b
            int r3 = r0.f9511j
            java.lang.String r5 = r7.getName()
            java.lang.String r6 = r7.getType()
            java.lang.String r7 = r7.e()
            r2.<init>(r3, r4, r5, r6, r7)
            if (r10 == 0) goto Lb1
            r8[r4] = r2
        Lb1:
            return r2
        Lb2:
            int r13 = r1.o(r10)
            k5.s r3 = r2.f7280r
            int r4 = r1.o(r10)
            int r4 = r4 - r9
            java.lang.String r14 = r3.d(r4)
            k5.s r3 = r2.f7281s
            int r4 = r1.o(r10)
            int r4 = r4 - r9
            java.lang.String r15 = r3.d(r4)
            k5.s r2 = r2.f7280r
            int r1 = r1.o(r10)
            int r1 = r1 - r9
            java.lang.String r16 = r2.d(r1)
            x5.g r11 = new x5.g
            int r12 = r0.f9511j
            r11.<init>(r12, r13, r14, r15, r16)
            if (r13 < 0) goto Le5
            int r1 = r8.length
            if (r13 >= r1) goto Le5
            r8[r13] = r11
        Le5:
            return r11
        Le6:
            int r4 = r1.o(r10)
            k5.s r3 = r2.f7280r
            int r5 = r1.o(r10)
            int r5 = r5 - r9
            java.lang.String r5 = r3.d(r5)
            k5.s r2 = r2.f7281s
            int r1 = r1.o(r10)
            int r1 = r1 - r9
            java.lang.String r6 = r2.d(r1)
            x5.g r2 = new x5.g
            int r3 = r0.f9511j
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            if (r4 < 0) goto L10f
            int r1 = r8.length
            if (r4 >= r1) goto L10f
            r8[r4] = r2
        L10f:
            return r2
        L110:
            int r3 = r1.m()
            int r4 = r0.f9512k
            int r4 = r4 + r3
            r0.f9512k = r4
            goto L8
        L11b:
            int r3 = r1.o(r10)
            int r4 = r0.f9511j
            int r4 = r4 + r3
            r0.f9511j = r4
            goto L8
        L126:
            r0.f9546g = r6
            return r5
        L129:
            r0.f9546g = r6
            return r5
    }
}
