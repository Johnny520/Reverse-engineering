package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 implements java.io.Closeable {

    /* JADX INFO: renamed from: θ */
    public static final java.util.logging.Logger f4361 = null;

    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0014ad f4362;

    /* JADX INFO: renamed from: ζ */
    public final p000.fg0 f4363;

    /* JADX INFO: renamed from: η */
    public final p000.lf0 f4364;

    static {
            java.lang.Class<vf0> r0 = p000.vf0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            r0.getClass()
            p000.gg0.f4361 = r0
            return
    }

    public gg0(p000.rk1 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f4362 = r2
            fg0 r0 = new fg0
            r0.<init>(r2)
            r1.f4363 = r0
            lf0 r2 = new lf0
            r2.<init>(r0)
            r1.f4364 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            ad r0 = r0.f4362
            r0.close()
            return
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m2306(boolean r14, p000.cg0 r15) {
            r13 = this;
            r0 = 0
            ad r1 = r13.f4362     // Catch: java.io.EOFException -> L33d
            r2 = 9
            r1.mo61(r2)     // Catch: java.io.EOFException -> L33d
            ad r1 = r13.f4362
            int r1 = p000.sd2.m5482(r1)
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r2) goto L334
            ad r3 = r13.f4362
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            ad r4 = r13.f4362
            byte r4 = r4.readByte()
            r5 = r4 & 255(0xff, float:3.57E-43)
            ad r6 = r13.f4362
            int r6 = r6.readInt()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r7 = r7 & r6
            r8 = 8
            r9 = 1
            if (r3 == r8) goto L42
            java.util.logging.Logger r10 = p000.gg0.f4361
            java.util.logging.Level r11 = java.util.logging.Level.FINE
            boolean r11 = r10.isLoggable(r11)
            if (r11 == 0) goto L42
            java.lang.String r11 = p000.vf0.m6215(r9, r7, r1, r3, r5)
            r10.fine(r11)
        L42:
            r10 = 4
            if (r14 == 0) goto L60
            if (r3 != r10) goto L48
            goto L60
        L48:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r14 = "Expected a SETTINGS frame but was "
            java.lang.String r15 = p000.vf0.m6214(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r14)
            r0.append(r15)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
        L60:
            r14 = 0
            r11 = 5
            r12 = 2
            switch(r3) {
                case 0: goto L330;
                case 1: goto L32c;
                case 2: goto L30d;
                case 3: goto L285;
                case 4: goto L1e5;
                case 5: goto L1e1;
                case 6: goto L17c;
                case 7: goto Le1;
                case 8: goto L6d;
                default: goto L66;
            }
        L66:
            ad r13 = r13.f4362
            long r14 = (long) r1
            r13.skip(r14)
            return r9
        L6d:
            java.lang.String r14 = "TYPE_WINDOW_UPDATE length !=4: "
            if (r1 != r10) goto Lc5
            ad r13 = r13.f4362     // Catch: java.lang.Exception -> Lc3
            int r13 = r13.readInt()     // Catch: java.lang.Exception -> Lc3
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r13 = (long) r13
            long r13 = r13 & r2
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto Lbb
            java.util.logging.Logger r2 = p000.gg0.f4361
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r3 = r2.isLoggable(r3)
            if (r3 == 0) goto L93
            java.lang.String r1 = p000.vf0.m6216(r9, r7, r1, r13)
            r2.fine(r1)
        L93:
            dg0 r15 = r15.f2106
            if (r7 != 0) goto La5
            monitor-enter(r15)
            long r0 = r15.f3127     // Catch: java.lang.Throwable -> La2
            long r0 = r0 + r13
            r15.f3127 = r0     // Catch: java.lang.Throwable -> La2
            r15.notifyAll()     // Catch: java.lang.Throwable -> La2
            monitor-exit(r15)
            return r9
        La2:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        La5:
            kg0 r15 = r15.m1739(r7)
            if (r15 == 0) goto L2f0
            monitor-enter(r15)
            long r1 = r15.f5903     // Catch: java.lang.Throwable -> Lb8
            long r1 = r1 + r13
            r15.f5903 = r1     // Catch: java.lang.Throwable -> Lb8
            if (r0 <= 0) goto Lb6
            r15.notifyAll()     // Catch: java.lang.Throwable -> Lb8
        Lb6:
            monitor-exit(r15)
            return r9
        Lb8:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        Lbb:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Exception -> Lc3
            java.lang.String r14 = "windowSizeIncrement was 0"
            r13.<init>(r14)     // Catch: java.lang.Exception -> Lc3
            throw r13     // Catch: java.lang.Exception -> Lc3
        Lc3:
            r13 = move-exception
            goto Ld7
        Lc5:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Exception -> Lc3
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc3
            r15.<init>(r14)     // Catch: java.lang.Exception -> Lc3
            r15.append(r1)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r14 = r15.toString()     // Catch: java.lang.Exception -> Lc3
            r13.<init>(r14)     // Catch: java.lang.Exception -> Lc3
            throw r13     // Catch: java.lang.Exception -> Lc3
        Ld7:
            java.util.logging.Logger r14 = p000.gg0.f4361
            java.lang.String r15 = p000.vf0.m6215(r9, r7, r1, r8, r5)
            r14.fine(r15)
            throw r13
        Le1:
            if (r1 < r8) goto L172
            if (r7 != 0) goto L16c
            ad r2 = r13.f4362
            int r2 = r2.readInt()
            ad r3 = r13.f4362
            int r3 = r3.readInt()
            int r1 = r1 - r8
            i2 r4 = p000.EnumC0816sz.f10086
            r4.getClass()
            sz[] r4 = p000.EnumC0816sz.values()
            int r5 = r4.length
            r6 = r0
        Lfd:
            if (r6 >= r5) goto L10a
            r7 = r4[r6]
            int r8 = r7.f10094
            if (r8 != r3) goto L107
            r14 = r7
            goto L10a
        L107:
            int r6 = r6 + 1
            goto Lfd
        L10a:
            if (r14 == 0) goto L162
            dd r14 = p000.C0208dd.f3085
            if (r1 <= 0) goto L117
            ad r13 = r13.f4362
            long r3 = (long) r1
            dd r14 = r13.mo58(r3)
        L117:
            r14.getClass()
            r14.mo1701()
            dg0 r13 = r15.f2106
            monitor-enter(r13)
            java.util.LinkedHashMap r14 = r13.f3133     // Catch: java.lang.Throwable -> L15f
            java.util.Collection r14 = r14.values()     // Catch: java.lang.Throwable -> L15f
            kg0[] r1 = new p000.kg0[r0]     // Catch: java.lang.Throwable -> L15f
            java.lang.Object[] r14 = r14.toArray(r1)     // Catch: java.lang.Throwable -> L15f
            r13.f3137 = r9     // Catch: java.lang.Throwable -> L15f
            monitor-exit(r13)
            kg0[] r14 = (p000.kg0[]) r14
            int r13 = r14.length
        L132:
            if (r0 >= r13) goto L2f0
            r1 = r14[r0]
            int r3 = r1.f5899
            if (r3 <= r2) goto L15c
            boolean r3 = r1.m3248()
            if (r3 == 0) goto L15c
            sz r3 = p000.EnumC0816sz.f10091
            monitor-enter(r1)
            sz r4 = r1.m3247()     // Catch: java.lang.Throwable -> L14f
            if (r4 != 0) goto L151
            r1.f5910 = r3     // Catch: java.lang.Throwable -> L14f
            r1.notifyAll()     // Catch: java.lang.Throwable -> L14f
            goto L151
        L14f:
            r13 = move-exception
            goto L15a
        L151:
            monitor-exit(r1)
            dg0 r3 = r15.f2106
            int r1 = r1.f5899
            r3.m1740(r1)
            goto L15c
        L15a:
            monitor-exit(r1)
            throw r13
        L15c:
            int r0 = r0 + 1
            goto L132
        L15f:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        L162:
            java.lang.String r13 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r13 = p000.a12.m17(r13, r3)
            p000.C1080.m7281(r13)
            return r0
        L16c:
            java.lang.String r13 = "TYPE_GOAWAY streamId != 0"
            p000.C1080.m7281(r13)
            return r0
        L172:
            java.lang.String r13 = "TYPE_GOAWAY length < 8: "
            java.lang.String r13 = p000.a12.m17(r13, r1)
            p000.C1080.m7281(r13)
            return r0
        L17c:
            if (r1 != r8) goto L1d7
            if (r7 != 0) goto L1d1
            ad r14 = r13.f4362
            int r14 = r14.readInt()
            ad r13 = r13.f4362
            int r13 = r13.readInt()
            r1 = r4 & 1
            if (r1 == 0) goto L191
            r0 = r9
        L191:
            dg0 r1 = r15.f2106
            if (r0 == 0) goto L1b5
            monitor-enter(r1)
            r2 = 1
            if (r14 == r9) goto L1ac
            if (r14 == r12) goto L1a6
            r13 = 3
            if (r14 == r13) goto L1a0
            goto L1b1
        L1a0:
            r1.notifyAll()     // Catch: java.lang.Throwable -> L1a4
            goto L1b1
        L1a4:
            r13 = move-exception
            goto L1b3
        L1a6:
            long r13 = r1.f3145     // Catch: java.lang.Throwable -> L1a4
            long r13 = r13 + r2
            r1.f3145 = r13     // Catch: java.lang.Throwable -> L1a4
            goto L1b1
        L1ac:
            long r13 = r1.f3143     // Catch: java.lang.Throwable -> L1a4
            long r13 = r13 + r2
            r1.f3143 = r13     // Catch: java.lang.Throwable -> L1a4
        L1b1:
            monitor-exit(r1)
            return r9
        L1b3:
            monitor-exit(r1)
            throw r13
        L1b5:
            w22 r0 = r1.f3139
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            dg0 r2 = r15.f2106
            java.lang.String r2 = r2.f3134
            java.lang.String r3 = " ping"
            java.lang.String r1 = p000.lz1.m3691(r1, r2, r3)
            dg0 r15 = r15.f2106
            h52 r2 = new h52
            r2.<init>(r15, r14, r13, r12)
            p000.w22.m6309(r0, r1, r2)
            return r9
        L1d1:
            java.lang.String r13 = "TYPE_PING streamId != 0"
            p000.C1080.m7281(r13)
            return r0
        L1d7:
            java.lang.String r13 = "TYPE_PING length != 8: "
            java.lang.String r13 = p000.a12.m17(r13, r1)
            p000.C1080.m7281(r13)
            return r0
        L1e1:
            r13.m2310(r15, r1, r5, r7)
            return r9
        L1e5:
            ad r13 = r13.f4362
            if (r7 != 0) goto L27f
            r14 = r4 & 1
            if (r14 == 0) goto L1f7
            if (r1 != 0) goto L1f1
            goto L2f0
        L1f1:
            java.lang.String r13 = "FRAME_SIZE_ERROR ack frame should be empty!"
            p000.C1080.m7281(r13)
            return r0
        L1f7:
            int r14 = r1 % 6
            if (r14 != 0) goto L275
            xs1 r14 = new xs1
            r14.<init>()
            xm0 r1 = p000.j81.m2893(r0, r1)
            r3 = 6
            vm0 r1 = p000.j81.m2889(r3, r1)
            int r3 = r1.f11347
            int r4 = r1.f11348
            int r1 = r1.f11349
            if (r1 <= 0) goto L213
            if (r3 <= r4) goto L217
        L213:
            if (r1 >= 0) goto L259
            if (r4 > r3) goto L259
        L217:
            short r5 = r13.readShort()
            byte[] r6 = p000.sd2.f9867
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            int r6 = r13.readInt()
            if (r5 == r12) goto L247
            if (r5 == r10) goto L23e
            if (r5 == r11) goto L22c
            goto L252
        L22c:
            if (r6 < r2) goto L234
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 > r7) goto L234
            goto L252
        L234:
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r13 = p000.a12.m17(r13, r6)
            p000.C1080.m7281(r13)
            return r0
        L23e:
            if (r6 < 0) goto L241
            goto L252
        L241:
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            p000.C1080.m7281(r13)
            return r0
        L247:
            if (r6 == 0) goto L252
            if (r6 != r9) goto L24c
            goto L252
        L24c:
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            p000.C1080.m7281(r13)
            return r0
        L252:
            r14.m6783(r5, r6)
            if (r3 == r4) goto L259
            int r3 = r3 + r1
            goto L217
        L259:
            dg0 r13 = r15.f2106
            w22 r0 = r13.f3139
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r13 = r13.f3134
            java.lang.String r2 = " applyAndAckSettings"
            java.lang.String r13 = p000.lz1.m3691(r1, r13, r2)
            p3 r1 = new p3
            r2 = 18
            r1.<init>(r15, r2, r14)
            p000.w22.m6309(r0, r13, r1)
            return r9
        L275:
            java.lang.String r13 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r13 = p000.a12.m17(r13, r1)
            p000.C1080.m7281(r13)
            return r0
        L27f:
            java.lang.String r13 = "TYPE_SETTINGS streamId != 0"
            p000.C1080.m7281(r13)
            return r0
        L285:
            if (r1 != r10) goto L301
            if (r7 == 0) goto L2fb
            ad r13 = r13.f4362
            int r13 = r13.readInt()
            i2 r1 = p000.EnumC0816sz.f10086
            r1.getClass()
            sz[] r1 = p000.EnumC0816sz.values()
            int r2 = r1.length
            r3 = r0
        L29a:
            if (r3 >= r2) goto L2a7
            r4 = r1[r3]
            int r5 = r4.f10094
            if (r5 != r13) goto L2a4
            r14 = r4
            goto L2a7
        L2a4:
            int r3 = r3 + 1
            goto L29a
        L2a7:
            if (r14 == 0) goto L2f1
            dg0 r13 = r15.f2106
            if (r7 == 0) goto L2d7
            r15 = r6 & 1
            if (r15 != 0) goto L2d7
            w22 r15 = r13.f3140
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r13.f3134
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "] onReset"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            zf0 r1 = new zf0
            r1.<init>(r13, r7, r14, r9)
            p000.w22.m6309(r15, r0, r1)
            return r9
        L2d7:
            kg0 r13 = r13.m1740(r7)
            if (r13 == 0) goto L2f0
            monitor-enter(r13)
            sz r15 = r13.m3247()     // Catch: java.lang.Throwable -> L2ea
            if (r15 != 0) goto L2ec
            r13.f5910 = r14     // Catch: java.lang.Throwable -> L2ea
            r13.notifyAll()     // Catch: java.lang.Throwable -> L2ea
            goto L2ec
        L2ea:
            r14 = move-exception
            goto L2ee
        L2ec:
            monitor-exit(r13)
            return r9
        L2ee:
            monitor-exit(r13)
            throw r14
        L2f0:
            return r9
        L2f1:
            java.lang.String r14 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r13 = p000.a12.m17(r14, r13)
            p000.C1080.m7281(r13)
            return r0
        L2fb:
            java.lang.String r13 = "TYPE_RST_STREAM streamId == 0"
            p000.C1080.m7281(r13)
            return r0
        L301:
            java.lang.String r13 = "TYPE_RST_STREAM length: "
            java.lang.String r14 = " != 4"
            java.lang.String r13 = p000.AbstractC0602nx.m4127(r13, r1, r14)
            p000.C1080.m7281(r13)
            return r0
        L30d:
            if (r1 != r11) goto L320
            if (r7 == 0) goto L31a
            ad r13 = r13.f4362
            r13.readInt()
            r13.readByte()
            return r9
        L31a:
            java.lang.String r13 = "TYPE_PRIORITY streamId == 0"
            p000.C1080.m7281(r13)
            return r0
        L320:
            java.lang.String r13 = "TYPE_PRIORITY length: "
            java.lang.String r14 = " != 5"
            java.lang.String r13 = p000.AbstractC0602nx.m4127(r13, r1, r14)
            p000.C1080.m7281(r13)
            return r0
        L32c:
            r13.m2309(r15, r1, r5, r7)
            return r9
        L330:
            r13.m2307(r15, r1, r5, r7)
            return r9
        L334:
            java.lang.String r13 = "FRAME_SIZE_ERROR: "
            java.lang.String r13 = p000.a12.m17(r13, r1)
            p000.C1080.m7281(r13)
        L33d:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final void m2307(p000.cg0 r17, int r18, int r19, int r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            if (r3 == 0) goto L12b
            r4 = r2 & 1
            r6 = 1
            if (r4 == 0) goto L11
            r4 = r6
            goto L13
        L11:
            r4 = r6
            r6 = 0
        L13:
            r7 = r2 & 32
            if (r7 != 0) goto L125
            r7 = r2 & 8
            if (r7 == 0) goto L28
            ad r7 = r0.f4362
            byte r7 = r7.readByte()
            byte[] r8 = p000.sd2.f9867
            r7 = r7 & 255(0xff, float:3.57E-43)
        L25:
            r8 = r18
            goto L2a
        L28:
            r7 = 0
            goto L25
        L2a:
            int r2 = p000.ln0.m3613(r8, r2, r7)
            ad r8 = r0.f4362
            r8.getClass()
            dg0 r9 = r1.f2106
            if (r3 == 0) goto L3d
            r10 = r3 & 1
            if (r10 != 0) goto L3d
            r10 = r4
            goto L3e
        L3d:
            r10 = 0
        L3e:
            if (r10 == 0) goto L75
            sc r4 = new sc
            r4.<init>()
            long r10 = (long) r2
            r8.mo61(r10)
            r8.mo2106(r10, r4)
            w22 r8 = r9.f3140
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = r9.f3134
            r1.append(r5)
            r5 = 91
            r1.append(r5)
            r1.append(r3)
            java.lang.String r5 = "] onData"
            r1.append(r5)
            java.lang.String r10 = r1.toString()
            yf0 r1 = new yf0
            r5 = r2
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            p000.w22.m6309(r8, r10, r1)
            goto L11e
        L75:
            kg0 r9 = r9.m1739(r3)
            if (r9 != 0) goto L8d
            dg0 r4 = r1.f2106
            sz r5 = p000.EnumC0816sz.f10088
            r4.m1744(r3, r5)
            dg0 r1 = r1.f2106
            long r2 = (long) r2
            r1.m1742(r2)
            r8.skip(r2)
            goto L11e
        L8d:
            java.util.TimeZone r1 = p000.ud2.f10709
            ig0 r1 = r9.f5906
            long r2 = (long) r2
            r1.getClass()
            r10 = r2
        L96:
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            kg0 r15 = r1.f5074
            if (r14 <= 0) goto L106
            monitor-enter(r15)
            boolean r14 = r1.f5070     // Catch: java.lang.Throwable -> L103
            sc r5 = r1.f5072     // Catch: java.lang.Throwable -> L103
            r17 = r12
            long r12 = r5.f9828     // Catch: java.lang.Throwable -> L103
            long r12 = r12 + r10
            long r4 = r1.f5069     // Catch: java.lang.Throwable -> L103
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lb0
            r4 = 1
            goto Lb1
        Lb0:
            r4 = 0
        Lb1:
            monitor-exit(r15)
            if (r4 == 0) goto Lbf
            r8.skip(r10)
            kg0 r1 = r1.f5074
            sz r2 = p000.EnumC0816sz.f10090
            r1.m3246(r2)
            goto L116
        Lbf:
            if (r14 == 0) goto Lc5
            r8.skip(r10)
            goto L116
        Lc5:
            sc r4 = r1.f5071
            long r4 = r8.mo2106(r10, r4)
            r12 = -1
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto Lfd
            long r10 = r10 - r4
            kg0 r4 = r1.f5074
            monitor-enter(r4)
            boolean r5 = r1.f5073     // Catch: java.lang.Throwable -> Le1
            if (r5 == 0) goto Le3
            sc r5 = r1.f5071     // Catch: java.lang.Throwable -> Le1
            long r12 = r5.f9828     // Catch: java.lang.Throwable -> Le1
            r5.skip(r12)     // Catch: java.lang.Throwable -> Le1
            goto Lf8
        Le1:
            r0 = move-exception
            goto Lfb
        Le3:
            sc r5 = r1.f5072     // Catch: java.lang.Throwable -> Le1
            long r12 = r5.f9828     // Catch: java.lang.Throwable -> Le1
            int r12 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r12 != 0) goto Led
            r12 = 1
            goto Lee
        Led:
            r12 = 0
        Lee:
            sc r13 = r1.f5071     // Catch: java.lang.Throwable -> Le1
            r5.m5465(r13)     // Catch: java.lang.Throwable -> Le1
            if (r12 == 0) goto Lf8
            r4.notifyAll()     // Catch: java.lang.Throwable -> Le1
        Lf8:
            monitor-exit(r4)
            r4 = 1
            goto L96
        Lfb:
            monitor-exit(r4)
            throw r0
        Lfd:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L103:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L106:
            java.util.TimeZone r4 = p000.ud2.f10709
            dg0 r4 = r15.f5900
            r4.m1742(r2)
            kg0 r1 = r1.f5074
            dg0 r1 = r1.f5900
            h40 r1 = r1.f3147
            r1.getClass()
        L116:
            if (r6 == 0) goto L11e
            vc0 r1 = p000.vc0.f11229
            r4 = 1
            r9.m3250(r1, r4)
        L11e:
            ad r0 = r0.f4362
            long r1 = (long) r7
            r0.skip(r1)
            return
        L125:
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            p000.C1080.m7281(r0)
            return
        L12b:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            p000.C1080.m7281(r0)
            return
    }

    /* JADX INFO: renamed from: θ */
    public final java.util.List m2308(int r4, int r5, int r6, int r7) {
            r3 = this;
            fg0 r0 = r3.f4363
            r0.f3927 = r4
            r0.f3924 = r4
            r0.f3928 = r5
            r0.f3925 = r6
            r0.f3926 = r7
            lf0 r3 = r3.f4364
            rk1 r4 = r3.f6597
            java.util.ArrayList r5 = r3.f6596
        L12:
            boolean r6 = r4.m5109()
            if (r6 != 0) goto L122
            byte r6 = r4.readByte()
            byte[] r7 = p000.sd2.f9867
            r7 = r6 & 255(0xff, float:3.57E-43)
            r0 = 0
            r1 = 128(0x80, float:1.8E-43)
            if (r7 == r1) goto L11c
            r2 = r6 & 128(0x80, float:1.8E-43)
            if (r2 != r1) goto L63
            r6 = 127(0x7f, float:1.78E-43)
            int r6 = r3.m3556(r7, r6)
            int r7 = r6 + (-1)
            if (r7 < 0) goto L40
            tc0[] r1 = p000.nf0.f7591
            int r2 = r1.length
            int r2 = r2 + (-1)
            if (r7 > r2) goto L40
            r6 = r1[r7]
            r5.add(r6)
            goto L12
        L40:
            tc0[] r1 = p000.nf0.f7591
            int r1 = r1.length
            int r7 = r7 - r1
            int r1 = r3.f6599
            int r1 = r1 + 1
            int r1 = r1 + r7
            if (r1 < 0) goto L59
            tc0[] r7 = r3.f6598
            int r2 = r7.length
            if (r1 >= r2) goto L59
            r6 = r7[r1]
            r6.getClass()
            r5.add(r6)
            goto L12
        L59:
            java.lang.String r3 = "Header index too large "
            java.lang.String r3 = p000.a12.m17(r3, r6)
            p000.C1080.m7281(r3)
            return r0
        L63:
            r1 = 64
            if (r7 != r1) goto L7d
            tc0[] r6 = p000.nf0.f7591
            dd r6 = r3.m3555()
            p000.nf0.m4038(r6)
            dd r7 = r3.m3555()
            tc0 r0 = new tc0
            r0.<init>(r6, r7)
            r3.m3554(r0)
            goto L12
        L7d:
            r2 = r6 & 64
            if (r2 != r1) goto L9b
            r6 = 63
            int r6 = r3.m3556(r7, r6)
            int r6 = r6 + (-1)
            dd r6 = r3.m3553(r6)
            dd r7 = r3.m3555()
            tc0 r0 = new tc0
            r0.<init>(r6, r7)
            r3.m3554(r0)
            goto L12
        L9b:
            r6 = r6 & 32
            r1 = 32
            if (r6 != r1) goto Le4
            r6 = 31
            int r6 = r3.m3556(r7, r6)
            r3.f6595 = r6
            if (r6 < 0) goto Lce
            r7 = 4096(0x1000, float:5.74E-42)
            if (r6 > r7) goto Lce
            int r7 = r3.f6601
            if (r6 >= r7) goto L12
            if (r6 != 0) goto Lc8
            tc0[] r6 = r3.f6598
            p000.AbstractC0312g7.m2246(r0, r6)
            tc0[] r6 = r3.f6598
            int r6 = r6.length
            int r6 = r6 + (-1)
            r3.f6599 = r6
            r6 = 0
            r3.f6600 = r6
            r3.f6601 = r6
            goto L12
        Lc8:
            int r7 = r7 - r6
            r3.m3552(r7)
            goto L12
        Lce:
            java.io.IOException r4 = new java.io.IOException
            int r3 = r3.f6595
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid dynamic table size update "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        Le4:
            r6 = 16
            if (r7 == r6) goto L105
            if (r7 != 0) goto Leb
            goto L105
        Leb:
            r6 = 15
            int r6 = r3.m3556(r7, r6)
            int r6 = r6 + (-1)
            dd r6 = r3.m3553(r6)
            dd r7 = r3.m3555()
            tc0 r0 = new tc0
            r0.<init>(r6, r7)
            r5.add(r0)
            goto L12
        L105:
            tc0[] r6 = p000.nf0.f7591
            dd r6 = r3.m3555()
            p000.nf0.m4038(r6)
            dd r7 = r3.m3555()
            tc0 r0 = new tc0
            r0.<init>(r6, r7)
            r5.add(r0)
            goto L12
        L11c:
            java.lang.String r3 = "index == 0"
            p000.C1080.m7281(r3)
            return r0
        L122:
            java.util.List r3 = p000.AbstractC0984xh.m6666(r5)
            r5.clear()
            return r3
    }

    /* JADX INFO: renamed from: κ */
    public final void m2309(p000.cg0 r10, int r11, int r12, int r13) {
            r9 = this;
            if (r13 == 0) goto Ld0
            r0 = r12 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            r7 = r2
            goto Lb
        La:
            r7 = r1
        Lb:
            r0 = r12 & 8
            if (r0 == 0) goto L1a
            ad r0 = r9.f4362
            byte r0 = r0.readByte()
            byte[] r3 = p000.sd2.f9867
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L1b
        L1a:
            r0 = r1
        L1b:
            r3 = r12 & 32
            if (r3 == 0) goto L2b
            ad r3 = r9.f4362
            r3.readInt()
            r3.readByte()
            byte[] r3 = p000.sd2.f9867
            int r11 = r11 + (-5)
        L2b:
            int r11 = p000.ln0.m3613(r11, r12, r0)
            java.util.List r9 = r9.m2308(r11, r0, r12, r13)
            dg0 r5 = r10.f2106
            if (r13 == 0) goto L3c
            r10 = r13 & 1
            if (r10 != 0) goto L3c
            r1 = r2
        L3c:
            r10 = 91
            if (r1 == 0) goto L64
            w22 r11 = r5.f3140
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r5.f3134
            r12.append(r0)
            r12.append(r10)
            r12.append(r13)
            java.lang.String r10 = "] onHeaders"
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            zf0 r12 = new zf0
            r12.<init>(r5, r13, r9, r7)
            p000.w22.m6309(r11, r10, r12)
            return
        L64:
            monitor-enter(r5)
            kg0 r11 = r5.m1739(r13)     // Catch: java.lang.Throwable -> Lc2
            if (r11 != 0) goto Lc5
            boolean r11 = r5.f3137     // Catch: java.lang.Throwable -> Lc2
            if (r11 == 0) goto L71
            monitor-exit(r5)
            return
        L71:
            int r11 = r5.f3135     // Catch: java.lang.Throwable -> Lc2
            if (r13 > r11) goto L77
            monitor-exit(r5)
            return
        L77:
            int r11 = r13 % 2
            int r12 = r5.f3136     // Catch: java.lang.Throwable -> Lc2
            int r12 = r12 % 2
            if (r11 != r12) goto L81
            monitor-exit(r5)
            return
        L81:
            vc0 r8 = p000.ud2.m5849(r9)     // Catch: java.lang.Throwable -> Lc2
            kg0 r3 = new kg0     // Catch: java.lang.Throwable -> Lc2
            r6 = 0
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc2
            r5.f3135 = r4     // Catch: java.lang.Throwable -> Lc2
            java.util.LinkedHashMap r9 = r5.f3133     // Catch: java.lang.Throwable -> Lc2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lc2
            r9.put(r11, r3)     // Catch: java.lang.Throwable -> Lc2
            x22 r9 = r5.f3138     // Catch: java.lang.Throwable -> Lc2
            w22 r9 = r9.m6509()     // Catch: java.lang.Throwable -> Lc2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            r11.<init>()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r12 = r5.f3134     // Catch: java.lang.Throwable -> Lc2
            r11.append(r12)     // Catch: java.lang.Throwable -> Lc2
            r11.append(r10)     // Catch: java.lang.Throwable -> Lc2
            r11.append(r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r10 = "] onStream"
            r11.append(r10)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> Lc2
            p3 r11 = new p3     // Catch: java.lang.Throwable -> Lc2
            r12 = 17
            r11.<init>(r5, r12, r3)     // Catch: java.lang.Throwable -> Lc2
            p000.w22.m6309(r9, r10, r11)     // Catch: java.lang.Throwable -> Lc2
            monitor-exit(r5)
            return
        Lc2:
            r0 = move-exception
            r9 = r0
            goto Lce
        Lc5:
            monitor-exit(r5)
            vc0 r9 = p000.ud2.m5849(r9)
            r11.m3250(r9, r7)
            return
        Lce:
            monitor-exit(r5)
            throw r9
        Ld0:
            java.lang.String r9 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            p000.C1080.m7281(r9)
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m2310(p000.cg0 r5, int r6, int r7, int r8) {
            r4 = this;
            if (r8 == 0) goto L71
            r0 = r7 & 8
            r1 = 0
            if (r0 == 0) goto L12
            ad r0 = r4.f4362
            byte r0 = r0.readByte()
            byte[] r2 = p000.sd2.f9867
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L13
        L12:
            r0 = r1
        L13:
            ad r2 = r4.f4362
            int r2 = r2.readInt()
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r3
            int r6 = r6 + (-4)
            int r6 = p000.ln0.m3613(r6, r7, r0)
            java.util.List r4 = r4.m2308(r6, r0, r7, r8)
            dg0 r5 = r5.f2106
            monitor-enter(r5)
            java.util.LinkedHashSet r6 = r5.f3131     // Catch: java.lang.Throwable -> L3d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3d
            boolean r6 = r6.contains(r7)     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L3f
            sz r4 = p000.EnumC0816sz.f10088     // Catch: java.lang.Throwable -> L3d
            r5.m1744(r2, r4)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            return
        L3d:
            r4 = move-exception
            goto L6f
        L3f:
            java.util.LinkedHashSet r6 = r5.f3131     // Catch: java.lang.Throwable -> L3d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3d
            r6.add(r7)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            w22 r6 = r5.f3140
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r5.f3134
            r7.append(r8)
            r8 = 91
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = "] onRequest"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            zf0 r8 = new zf0
            r8.<init>(r5, r2, r4, r1)
            p000.w22.m6309(r6, r7, r8)
            return
        L6f:
            monitor-exit(r5)
            throw r4
        L71:
            java.lang.String r4 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            p000.C1080.m7281(r4)
            return
    }
}
