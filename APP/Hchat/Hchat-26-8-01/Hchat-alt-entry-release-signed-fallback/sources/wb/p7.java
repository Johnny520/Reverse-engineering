package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p7 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18415j;

    public /* synthetic */ p7(i0.a1 r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f18412g = r4
            r0.f18413h = r1
            r0.f18414i = r2
            r0.f18415j = r3
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            int r0 = r6.f18412g
            r.d r7 = (r.d) r7
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.getClass()
            r7 = r9 & 17
            switch(r0) {
                case 0: goto L2ba;
                case 1: goto L28b;
                case 2: goto L25c;
                case 3: goto L22d;
                case 4: goto L1fe;
                case 5: goto L1ce;
                case 6: goto L19f;
                case 7: goto L16f;
                case 8: goto L13f;
                case 9: goto L10f;
                case 10: goto Le0;
                case 11: goto Lb1;
                case 12: goto L81;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L1b
            r7 = r1
            goto L1c
        L1b:
            r7 = 0
        L1c:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L7b
            r7 = 10
            float r2 = (float) r7
            r4 = 0
            r5 = 13
            y0.l r0 = y0.l.f21818a
            r1 = 0
            r3 = 0
            y0.o r7 = p.d.p(r0, r1, r2, r3, r4, r5)
            i0.a1 r9 = r6.f18413h
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L50
            i0.a1 r9 = r6.f18414i
            java.lang.Object r9 = r9.getValue()
            java.util.List r9 = (java.util.List) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L50
            java.lang.String r9 = "-"
            goto L60
        L50:
            i0.a1 r9 = r6.f18415j
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        L60:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "在线插件("
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = ")"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r0 = 48
            r1 = 12
            sh.s.j(r9, r7, r8, r0, r1)
            goto L7e
        L7b:
            r8.V()
        L7e:
            sf.n r7 = sf.n.f12433a
            return r7
        L81:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L88
            r7 = r1
            goto L89
        L88:
            r7 = 0
        L89:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto Lab
            wb.la r7 = new wb.la
            r9 = 18
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = -1716477862(0xffffffff99b0a05a, float:-1.8262739E-23)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto Lae
        Lab:
            r8.V()
        Lae:
            sf.n r7 = sf.n.f12433a
            return r7
        Lb1:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto Lb8
            r7 = r1
            goto Lb9
        Lb8:
            r7 = 0
        Lb9:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto Lda
            wb.la r7 = new wb.la
            r9 = 2
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = -716895030(0xffffffffd5450cca, float:-1.354117E13)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto Ldd
        Lda:
            r8.V()
        Ldd:
            sf.n r7 = sf.n.f12433a
            return r7
        Le0:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto Le7
            r7 = r1
            goto Le8
        Le7:
            r7 = 0
        Le8:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L109
            wb.la r7 = new wb.la
            r9 = 0
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = 1659677987(0x62ecad23, float:2.1829537E21)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L10c
        L109:
            r8.V()
        L10c:
            sf.n r7 = sf.n.f12433a
            return r7
        L10f:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L116
            r7 = r1
            goto L117
        L116:
            r7 = 0
        L117:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L139
            wb.la r7 = new wb.la
            r9 = 11
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = 1487826116(0x58ae6cc4, float:1.5342573E15)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L13c
        L139:
            r8.V()
        L13c:
            sf.n r7 = sf.n.f12433a
            return r7
        L13f:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L146
            r7 = r1
            goto L147
        L146:
            r7 = 0
        L147:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L169
            wb.la r7 = new wb.la
            r9 = 12
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = -162896563(0xfffffffff64a654d, float:-1.02626815E33)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L16c
        L169:
            r8.V()
        L16c:
            sf.n r7 = sf.n.f12433a
            return r7
        L16f:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L176
            r7 = r1
            goto L177
        L176:
            r7 = 0
        L177:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L199
            wb.la r7 = new wb.la
            r9 = 8
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = 1698911863(0x65435677, float:5.765353E22)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L19c
        L199:
            r8.V()
        L19c:
            sf.n r7 = sf.n.f12433a
            return r7
        L19f:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L1a6
            r7 = r1
            goto L1a7
        L1a6:
            r7 = 0
        L1a7:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L1c8
            wb.la r7 = new wb.la
            r9 = 3
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = 1198709305(0x4772da39, float:62170.223)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L1cb
        L1c8:
            r8.V()
        L1cb:
            sf.n r7 = sf.n.f12433a
            return r7
        L1ce:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L1d5
            r7 = r1
            goto L1d6
        L1d5:
            r7 = 0
        L1d6:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L1f8
            wb.la r7 = new wb.la
            r9 = 9
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = 698506747(0x29a25dfb, float:7.210548E-14)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L1fb
        L1f8:
            r8.V()
        L1fb:
            sf.n r7 = sf.n.f12433a
            return r7
        L1fe:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L205
            r7 = r1
            goto L206
        L205:
            r7 = 0
        L206:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L227
            wb.la r7 = new wb.la
            r9 = 6
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = 34878467(0x2143403, float:1.0888249E-37)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L22a
        L227:
            r8.V()
        L22a:
            sf.n r7 = sf.n.f12433a
            return r7
        L22d:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L234
            r7 = r1
            goto L235
        L234:
            r7 = 0
        L235:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L256
            wb.la r7 = new wb.la
            r9 = 4
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = 70270071(0x4303c77, float:2.0716465E-36)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L259
        L256:
            r8.V()
        L259:
            sf.n r7 = sf.n.f12433a
            return r7
        L25c:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L263
            r7 = r1
            goto L264
        L263:
            r7 = 0
        L264:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L285
            wb.la r7 = new wb.la
            r9 = 5
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = -1841086498(0xffffffff92433fde, float:-6.1609873E-28)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L288
        L285:
            r8.V()
        L288:
            sf.n r7 = sf.n.f12433a
            return r7
        L28b:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L292
            r7 = r1
            goto L293
        L292:
            r7 = 0
        L293:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L2b4
            wb.la r7 = new wb.la
            r9 = 7
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = 775526933(0x2e399a15, float:4.2200982E-11)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L2b7
        L2b4:
            r8.V()
        L2b7:
            sf.n r7 = sf.n.f12433a
            return r7
        L2ba:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L2c1
            r7 = r1
            goto L2c2
        L2c1:
            r7 = 0
        L2c2:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L2e3
            wb.la r7 = new wb.la
            r9 = 1
            i0.a1 r0 = r6.f18413h
            i0.a1 r2 = r6.f18414i
            i0.a1 r3 = r6.f18415j
            r7.<init>(r0, r2, r3, r9)
            r9 = 1376155096(0x520675d8, float:1.4437568E11)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L2e6
        L2e3:
            r8.V()
        L2e6:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
