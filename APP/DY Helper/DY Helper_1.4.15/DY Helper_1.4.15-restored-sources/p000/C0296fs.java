package p000;

/* JADX INFO: renamed from: fs */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0296fs extends p000.j02 implements p000.c02 {

    /* JADX INFO: renamed from: ζ */
    public final p000.p70 f4080;

    /* JADX INFO: renamed from: η */
    public p000.C0259es f4081;

    public C0296fs(p000.p70 r3) {
            r2 = this;
            r2.<init>()
            r2.f4080 = r3
            es r3 = new es
            tw1 r0 = p000.ax1.m628()
            long r0 = r0.mo5759()
            r3.<init>(r0)
            r2.f4081 = r3
            return
    }

    @Override // p000.c02
    public final java.lang.Object getValue() {
            r4 = this;
            tw1 r0 = p000.ax1.m628()
            a80 r0 = r0.mo2001()
            if (r0 == 0) goto Ld
            r0.invoke(r4)
        Ld:
            tw1 r0 = p000.ax1.m628()
            es r1 = r4.f4081
            k02 r1 = p000.ax1.m627(r1, r0)
            es r1 = (p000.C0259es) r1
            r2 = 1
            p70 r3 = r4.f4080
            es r4 = r4.m2202(r1, r0, r2, r3)
            java.lang.Object r4 = r4.f3655
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            es r0 = r3.f4081
            k02 r0 = p000.ax1.m626(r0)
            es r0 = (p000.C0259es) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DerivedState(value="
            r0.<init>(r1)
            es r1 = r3.f4081
            k02 r1 = p000.ax1.m626(r1)
            es r1 = (p000.C0259es) r1
            tw1 r2 = p000.ax1.m628()
            boolean r2 = r1.m1951(r3, r2)
            if (r2 == 0) goto L28
            java.lang.Object r1 = r1.f3655
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L2a
        L28:
            java.lang.String r1 = "<Not calculated>"
        L2a:
            r0.append(r1)
            java.lang.String r1 = ")@"
            r0.append(r1)
            int r3 = r3.hashCode()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: α */
    public final p000.k02 mo2200() {
            r0 = this;
            es r0 = r0.f4081
            return r0
    }

    @Override // p000.i02
    /* JADX INFO: renamed from: γ */
    public final void mo2201(p000.k02 r1) {
            r0 = this;
            r1.getClass()
            es r1 = (p000.C0259es) r1
            r0.f4081 = r1
            return
    }

    /* JADX INFO: renamed from: η */
    public final p000.C0259es m2202(p000.C0259es r21, p000.tw1 r22, boolean r23, p000.p70 r24) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r1.m1951(r0, r2)
            if (r3 == 0) goto Lc2
            if (r23 == 0) goto Lc1
            k21 r3 = p000.j81.m2912()
            java.lang.Object[] r0 = r3.f5716
            int r5 = r3.f5718
            r6 = 0
        L17:
            if (r6 >= r5) goto L23
            r7 = r0[r6]
            u80 r7 = (p000.u80) r7
            r7.m5801()
            int r6 = r6 + 1
            goto L17
        L23:
            u11 r0 = r1.f3654     // Catch: java.lang.Throwable -> L38
            m6 r5 = p000.gx1.f4502     // Catch: java.lang.Throwable -> L38
            java.lang.Object r6 = r5.m3786()     // Catch: java.lang.Throwable -> L38
            zm0 r6 = (p000.zm0) r6     // Catch: java.lang.Throwable -> L38
            if (r6 != 0) goto L3b
            zm0 r6 = new zm0     // Catch: java.lang.Throwable -> L38
            r6.<init>()     // Catch: java.lang.Throwable -> L38
            r5.m3767(r6)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r0 = move-exception
            goto Laf
        L3b:
            int r5 = r6.f13169     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r7 = r0.f10556     // Catch: java.lang.Throwable -> L38
            int[] r8 = r0.f10557     // Catch: java.lang.Throwable -> L38
            long[] r0 = r0.f10555     // Catch: java.lang.Throwable -> L38
            int r9 = r0.length     // Catch: java.lang.Throwable -> L38
            int r9 = r9 + (-2)
            if (r9 < 0) goto L9c
            r10 = 0
        L49:
            r11 = r0[r10]     // Catch: java.lang.Throwable -> L38
            long r13 = ~r11     // Catch: java.lang.Throwable -> L38
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L97
            int r13 = r10 - r9
            int r13 = ~r13     // Catch: java.lang.Throwable -> L38
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L63:
            if (r15 >= r13) goto L94
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L8b
            int r16 = r10 << 3
            int r16 = r16 + r15
            r17 = r7[r16]     // Catch: java.lang.Throwable -> L38
            r16 = r8[r16]     // Catch: java.lang.Throwable -> L38
            r4 = r17
            i02 r4 = (p000.i02) r4     // Catch: java.lang.Throwable -> L38
            r20 = r14
            int r14 = r5 + r16
            r6.f13169 = r14     // Catch: java.lang.Throwable -> L38
            a80 r14 = r2.mo2001()     // Catch: java.lang.Throwable -> L38
            if (r14 == 0) goto L8d
            r14.invoke(r4)     // Catch: java.lang.Throwable -> L38
            goto L8d
        L8b:
            r20 = r14
        L8d:
            long r11 = r11 >> r20
            int r15 = r15 + 1
            r14 = r20
            goto L63
        L94:
            r4 = r14
            if (r13 != r4) goto L9c
        L97:
            if (r10 == r9) goto L9c
            int r10 = r10 + 1
            goto L49
        L9c:
            r6.f13169 = r5     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r0 = r3.f5716
            int r2 = r3.f5718
            r4 = 0
        La3:
            if (r4 >= r2) goto Lc1
            r3 = r0[r4]
            u80 r3 = (p000.u80) r3
            r3.m5800()
            int r4 = r4 + 1
            goto La3
        Laf:
            java.lang.Object[] r1 = r3.f5716
            int r2 = r3.f5718
            r4 = 0
        Lb4:
            if (r4 >= r2) goto Lc0
            r3 = r1[r4]
            u80 r3 = (p000.u80) r3
            r3.m5800()
            int r4 = r4 + 1
            goto Lb4
        Lc0:
            throw r0
        Lc1:
            return r1
        Lc2:
            u11 r1 = new u11
            r1.<init>()
            m6 r2 = p000.gx1.f4502
            java.lang.Object r3 = r2.m3786()
            zm0 r3 = (p000.zm0) r3
            if (r3 != 0) goto Ld9
            zm0 r3 = new zm0
            r3.<init>()
            r2.m3767(r3)
        Ld9:
            int r2 = r3.f13169
            k21 r4 = p000.j81.m2912()
            java.lang.Object[] r5 = r4.f5716
            int r6 = r4.f5718
            r7 = 0
        Le4:
            if (r7 >= r6) goto Lf0
            r8 = r5[r7]
            u80 r8 = (p000.u80) r8
            r8.m5801()
            int r7 = r7 + 1
            goto Le4
        Lf0:
            int r5 = r2 + 1
            r3.f13169 = r5     // Catch: java.lang.Throwable -> L16a
            ds r5 = new ds     // Catch: java.lang.Throwable -> L16a
            r5.<init>(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L16a
            r6 = r24
            java.lang.Object r5 = p000.e81.m1883(r5, r6)     // Catch: java.lang.Throwable -> L16a
            r3.f13169 = r2     // Catch: java.lang.Throwable -> L16a
            java.lang.Object[] r2 = r4.f5716
            int r3 = r4.f5718
            r4 = 0
        L106:
            if (r4 >= r3) goto L112
            r6 = r2[r4]
            u80 r6 = (p000.u80) r6
            r6.m5800()
            int r4 = r4 + 1
            goto L106
        L112:
            java.lang.Object r2 = p000.ax1.f1362
            monitor-enter(r2)
            tw1 r3 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L163
            es r4 = r0.f4081     // Catch: java.lang.Throwable -> L163
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L163
            k02 r6 = p000.ax1.m631(r4, r0)     // Catch: java.lang.Throwable -> L165
            r6.mo1083(r4)     // Catch: java.lang.Throwable -> L165
            long r7 = r3.mo5759()     // Catch: java.lang.Throwable -> L165
            r6.f5697 = r7     // Catch: java.lang.Throwable -> L165
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L163
            es r6 = (p000.C0259es) r6     // Catch: java.lang.Throwable -> L163
            r6.f3654 = r1     // Catch: java.lang.Throwable -> L163
            int r0 = r6.m1952(r0, r3)     // Catch: java.lang.Throwable -> L163
            r6.f3656 = r0     // Catch: java.lang.Throwable -> L163
            r6.f3655 = r5     // Catch: java.lang.Throwable -> L163
            monitor-exit(r2)
            m6 r0 = p000.gx1.f4502
            java.lang.Object r0 = r0.m3786()
            zm0 r0 = (p000.zm0) r0
            if (r0 == 0) goto L162
            int r0 = r0.f13169
            if (r0 != 0) goto L162
            tw1 r0 = p000.ax1.m628()
            r0.mo2007()
            monitor-enter(r2)
            tw1 r0 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L15f
            long r3 = r0.mo5759()     // Catch: java.lang.Throwable -> L15f
            r6.f3652 = r3     // Catch: java.lang.Throwable -> L15f
            int r0 = r0.mo2003()     // Catch: java.lang.Throwable -> L15f
            r6.f3653 = r0     // Catch: java.lang.Throwable -> L15f
            monitor-exit(r2)
            return r6
        L15f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L162:
            return r6
        L163:
            r0 = move-exception
            goto L168
        L165:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L163
            throw r0     // Catch: java.lang.Throwable -> L163
        L168:
            monitor-exit(r2)
            throw r0
        L16a:
            r0 = move-exception
            java.lang.Object[] r1 = r4.f5716
            int r2 = r4.f5718
            r4 = 0
        L170:
            if (r4 >= r2) goto L17c
            r3 = r1[r4]
            u80 r3 = (p000.u80) r3
            r3.m5800()
            int r4 = r4 + 1
            goto L170
        L17c:
            throw r0
    }

    /* JADX INFO: renamed from: θ */
    public final p000.C0259es m2203() {
            r4 = this;
            tw1 r0 = p000.ax1.m628()
            es r1 = r4.f4081
            k02 r1 = p000.ax1.m627(r1, r0)
            es r1 = (p000.C0259es) r1
            r2 = 0
            p70 r3 = r4.f4080
            es r4 = r4.m2202(r1, r0, r2, r3)
            return r4
    }
}
