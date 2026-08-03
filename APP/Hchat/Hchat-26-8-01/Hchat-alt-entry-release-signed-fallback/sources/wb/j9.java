package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j9 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sh.x f16991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r.z f16992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f16993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16995l;

    public /* synthetic */ j9(sh.x r1, r.z r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5, int r6) {
            r0 = this;
            r0.f16990g = r6
            r0.f16991h = r1
            r0.f16992i = r2
            r0.f16993j = r3
            r0.f16994k = r4
            r0.f16995l = r5
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            r12 = this;
            int r0 = r12.f16990g
            p.x0 r13 = (p.x0) r13
            r9 = r14
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r13.getClass()
            r15 = r14 & 6
            switch(r0) {
                case 0: goto L16b;
                case 1: goto Lf9;
                case 2: goto L87;
                default: goto L15;
            }
        L15:
            if (r15 != 0) goto L21
            boolean r15 = r9.f(r13)
            if (r15 == 0) goto L1f
            r15 = 4
            goto L20
        L1f:
            r15 = 2
        L20:
            r14 = r14 | r15
        L21:
            r15 = r14 & 19
            r0 = 18
            r1 = 1
            if (r15 == r0) goto L2a
            r15 = r1
            goto L2b
        L2a:
            r15 = 0
        L2b:
            r14 = r14 & r1
            boolean r14 = r9.S(r14, r15)
            if (r14 == 0) goto L81
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f16991h
            m.a r15 = r15.f12897e
            r0 = 0
            y0.o r0 = r1.f.a(r14, r15, r0)
            float r14 = r13.c()
            r15 = 8
            float r15 = (float) r15
            float r14 = r14 + r15
            float r13 = r13.a()
            r15 = 84
            float r15 = (float) r15
            float r13 = r13 + r15
            r15 = 5
            p.z0 r2 = p.d.b(r14, r13, r15)
            android.content.SharedPreferences r13 = r12.f16993j
            boolean r14 = r9.h(r13)
            java.lang.Object r15 = r9.P()
            if (r14 != 0) goto L62
            i0.e r14 = i0.l.f5952a
            if (r15 != r14) goto L70
        L62:
            wb.bc r15 = new wb.bc
            r14 = 12
            i0.a1 r1 = r12.f16994k
            i0.a1 r3 = r12.f16995l
            r15.<init>(r13, r1, r3, r14)
            r9.k0(r15)
        L70:
            r8 = r15
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f16992i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L84
        L81:
            r9.V()
        L84:
            sf.n r13 = sf.n.f12433a
            return r13
        L87:
            if (r15 != 0) goto L93
            boolean r15 = r9.f(r13)
            if (r15 == 0) goto L91
            r15 = 4
            goto L92
        L91:
            r15 = 2
        L92:
            r14 = r14 | r15
        L93:
            r15 = r14 & 19
            r0 = 18
            r1 = 1
            if (r15 == r0) goto L9c
            r15 = r1
            goto L9d
        L9c:
            r15 = 0
        L9d:
            r14 = r14 & r1
            boolean r14 = r9.S(r14, r15)
            if (r14 == 0) goto Lf3
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f16991h
            m.a r15 = r15.f12897e
            r0 = 0
            y0.o r0 = r1.f.a(r14, r15, r0)
            float r14 = r13.c()
            r15 = 8
            float r15 = (float) r15
            float r14 = r14 + r15
            float r13 = r13.a()
            r15 = 84
            float r15 = (float) r15
            float r13 = r13 + r15
            r15 = 5
            p.z0 r2 = p.d.b(r14, r13, r15)
            android.content.SharedPreferences r13 = r12.f16993j
            boolean r14 = r9.h(r13)
            java.lang.Object r15 = r9.P()
            if (r14 != 0) goto Ld4
            i0.e r14 = i0.l.f5952a
            if (r15 != r14) goto Le2
        Ld4:
            wb.bc r15 = new wb.bc
            r14 = 11
            i0.a1 r1 = r12.f16994k
            i0.a1 r3 = r12.f16995l
            r15.<init>(r13, r1, r3, r14)
            r9.k0(r15)
        Le2:
            r8 = r15
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f16992i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto Lf6
        Lf3:
            r9.V()
        Lf6:
            sf.n r13 = sf.n.f12433a
            return r13
        Lf9:
            if (r15 != 0) goto L105
            boolean r15 = r9.f(r13)
            if (r15 == 0) goto L103
            r15 = 4
            goto L104
        L103:
            r15 = 2
        L104:
            r14 = r14 | r15
        L105:
            r15 = r14 & 19
            r0 = 18
            r1 = 1
            if (r15 == r0) goto L10e
            r15 = r1
            goto L10f
        L10e:
            r15 = 0
        L10f:
            r14 = r14 & r1
            boolean r14 = r9.S(r14, r15)
            if (r14 == 0) goto L165
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f16991h
            m.a r15 = r15.f12897e
            r0 = 0
            y0.o r0 = r1.f.a(r14, r15, r0)
            float r14 = r13.c()
            r15 = 8
            float r15 = (float) r15
            float r14 = r14 + r15
            float r13 = r13.a()
            r15 = 84
            float r15 = (float) r15
            float r13 = r13 + r15
            r15 = 5
            p.z0 r2 = p.d.b(r14, r13, r15)
            android.content.SharedPreferences r13 = r12.f16993j
            boolean r14 = r9.h(r13)
            java.lang.Object r15 = r9.P()
            if (r14 != 0) goto L146
            i0.e r14 = i0.l.f5952a
            if (r15 != r14) goto L154
        L146:
            wb.bc r15 = new wb.bc
            r14 = 10
            i0.a1 r1 = r12.f16994k
            i0.a1 r3 = r12.f16995l
            r15.<init>(r13, r1, r3, r14)
            r9.k0(r15)
        L154:
            r8 = r15
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f16992i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L168
        L165:
            r9.V()
        L168:
            sf.n r13 = sf.n.f12433a
            return r13
        L16b:
            if (r15 != 0) goto L177
            boolean r15 = r9.f(r13)
            if (r15 == 0) goto L175
            r15 = 4
            goto L176
        L175:
            r15 = 2
        L176:
            r14 = r14 | r15
        L177:
            r15 = r14 & 19
            r0 = 18
            r1 = 1
            if (r15 == r0) goto L180
            r15 = r1
            goto L181
        L180:
            r15 = 0
        L181:
            r14 = r14 & r1
            boolean r14 = r9.S(r14, r15)
            if (r14 == 0) goto L1d7
            p.a0 r14 = p.h1.f9915c
            sh.x r15 = r12.f16991h
            m.a r15 = r15.f12897e
            r0 = 0
            y0.o r0 = r1.f.a(r14, r15, r0)
            float r14 = r13.c()
            r15 = 8
            float r15 = (float) r15
            float r14 = r14 + r15
            float r13 = r13.a()
            r15 = 84
            float r15 = (float) r15
            float r13 = r13 + r15
            r15 = 5
            p.z0 r2 = p.d.b(r14, r13, r15)
            android.content.SharedPreferences r13 = r12.f16993j
            boolean r14 = r9.h(r13)
            java.lang.Object r15 = r9.P()
            if (r14 != 0) goto L1b8
            i0.e r14 = i0.l.f5952a
            if (r15 != r14) goto L1c6
        L1b8:
            wb.bc r15 = new wb.bc
            r14 = 8
            i0.a1 r1 = r12.f16994k
            i0.a1 r3 = r12.f16995l
            r15.<init>(r13, r1, r3, r14)
            r9.k0(r15)
        L1c6:
            r8 = r15
            fg.l r8 = (fg.l) r8
            r10 = 0
            r11 = 504(0x1f8, float:7.06E-43)
            r.z r1 = r12.f16992i
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L1da
        L1d7:
            r9.V()
        L1da:
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
