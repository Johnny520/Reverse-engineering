package p000;

/* JADX INFO: renamed from: lc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0507lc implements p000.jn0 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f6538;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f6539;

    public C0507lc(p000.t41 r2) {
            r1 = this;
            r0 = 1
            r1.f6538 = r0
            r2.getClass()
            r1.<init>()
            r1.f6539 = r2
            return
    }

    public C0507lc(p000.C0966x r2) {
            r1 = this;
            r0 = 0
            r1.f6538 = r0
            r2.getClass()
            r1.<init>()
            r1.f6539 = r2
            return
    }

    /* JADX INFO: renamed from: δ */
    public static int m3544(p000.zn1 r1, int r2) {
            vc0 r1 = r1.f13202
            java.lang.String r0 = "Retry-After"
            java.lang.String r1 = r1.m6168(r0)
            if (r1 != 0) goto Lb
            r1 = 0
        Lb:
            if (r1 != 0) goto Le
            return r2
        Le:
            java.lang.String r2 = "\\d+"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r2.getClass()
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L2d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r1.getClass()
            int r1 = r1.intValue()
            return r1
        L2d:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    @Override // p000.jn0
    /* JADX INFO: renamed from: α */
    public final p000.zn1 mo2973(p000.yk1 r35) {
            r34 = this;
            r1 = r34
            r2 = r35
            int r0 = r1.f6538
            switch(r0) {
                case 0: goto L18b;
                default: goto L9;
            }
        L9:
            i5 r0 = r2.f12664
            uk1 r6 = r2.f12660
            jz r7 = p000.C0450jz.f5672
            r8 = r7
            r19 = 0
            r20 = 0
            r7 = r0
        L15:
            r0 = 1
        L16:
            zz r9 = r6.f10897
            if (r9 != 0) goto L183
            monitor-enter(r6)
            boolean r9 = r6.f10899     // Catch: java.lang.Throwable -> L16b
            if (r9 != 0) goto L178
            boolean r9 = r6.f10898     // Catch: java.lang.Throwable -> L16b
            if (r9 != 0) goto L169
            boolean r9 = r6.f10901     // Catch: java.lang.Throwable -> L16b
            if (r9 != 0) goto L169
            boolean r9 = r6.f10900     // Catch: java.lang.Throwable -> L16b
            if (r9 != 0) goto L169
            monitor-exit(r6)
            if (r0 == 0) goto Ld1
            al1 r0 = new al1
            t41 r9 = r6.f10888
            x22 r10 = r9.f10173
            r11 = r8
            xk1 r8 = r6.f10890
            int r12 = r9.f10197
            r13 = r10
            int r10 = r9.f10198
            r14 = r11
            int r11 = r2.f12665
            r15 = r12
            int r12 = r2.f12666
            r16 = r13
            boolean r13 = r9.f10179
            r17 = r14
            boolean r14 = r9.f10180
            java.lang.Object r5 = r7.f4914
            og0 r5 = (p000.og0) r5
            r5.getClass()
            java.lang.String r3 = r5.f8090
            java.lang.String r4 = "https"
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L74
            javax.net.ssl.SSLSocketFactory r3 = r9.f10189
            if (r3 == 0) goto L6c
            r41 r4 = r9.f10193
            r18 = r0
            je r0 = r9.f10194
            r29 = r0
            r27 = r3
            r28 = r4
            goto L7c
        L6c:
            java.lang.String r0 = "CLEARTEXT-only client"
            p000.C1080.m7279(r0)
        L71:
            r5 = 0
            goto L18a
        L74:
            r18 = r0
            r27 = 0
            r28 = 0
            r29 = 0
        L7c:
            p r22 = new p
            java.lang.String r0 = r5.f8093
            int r3 = r5.f8094
            x r4 = r9.f10185
            javax.net.SocketFactory r5 = r9.f10188
            r23 = r0
            x r0 = r9.f10187
            r30 = r0
            java.util.List r0 = r9.f10192
            r31 = r0
            java.util.List r0 = r9.f10191
            java.net.ProxySelector r9 = r9.f10186
            r32 = r0
            r24 = r3
            r25 = r4
            r26 = r5
            r33 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            t41 r0 = r6.f10888
            ij0 r0 = r0.f10172
            r9 = r15
            r3 = r17
            r15 = r22
            r17 = r6
            r6 = r18
            r18 = r7
            r7 = r16
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4 = r17
            r7 = r18
            t41 r0 = r4.f10888
            boolean r5 = r0.f10180
            if (r5 == 0) goto Lc9
            j00 r5 = new j00
            x22 r0 = r0.f10173
            r5.<init>(r6, r0)
            goto Lce
        Lc9:
            y21 r5 = new y21
            r5.<init>(r6)
        Lce:
            r4.f10894 = r5
            goto Ld3
        Ld1:
            r4 = r6
            r3 = r8
        Ld3:
            boolean r0 = r4.f10903     // Catch: java.lang.Throwable -> Le8
            if (r0 != 0) goto L15d
            zn1 r0 = r2.m6922(r7)     // Catch: java.lang.Throwable -> Le8 java.io.IOException -> L130
            yn1 r0 = r0.m7206()     // Catch: java.lang.Throwable -> Le8
            r0.f12691 = r7     // Catch: java.lang.Throwable -> Le8
            if (r19 == 0) goto Lec
            zn1 r5 = p000.p91.m4410(r19)     // Catch: java.lang.Throwable -> Le8
            goto Led
        Le8:
            r0 = move-exception
            r6 = 1
            goto L165
        Lec:
            r5 = 0
        Led:
            r0.f12701 = r5     // Catch: java.lang.Throwable -> Le8
            zn1 r0 = r0.m6945()     // Catch: java.lang.Throwable -> Le8
            zz r5 = r4.f10897     // Catch: java.lang.Throwable -> Le8
            i5 r7 = r1.m3545(r0, r5)     // Catch: java.lang.Throwable -> Le8
            if (r7 != 0) goto L102
            r5 = 0
            r4.m5931(r5)
            r5 = r0
            goto L18a
        L102:
            bo1 r5 = r0.f13203     // Catch: java.lang.Throwable -> Le8
            p000.sd2.m5472(r5)     // Catch: java.lang.Throwable -> Le8
            int r5 = r20 + 1
            r6 = 20
            if (r5 > r6) goto L119
            r6 = 1
            r4.m5931(r6)
            r19 = r0
            r8 = r3
            r6 = r4
            r20 = r5
            goto L15
        L119:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Le8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le8
            r1.<init>()     // Catch: java.lang.Throwable -> Le8
            java.lang.String r2 = "Too many follow-up requests: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Le8
            r1.append(r5)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le8
            throw r0     // Catch: java.lang.Throwable -> Le8
        L130:
            r0 = move-exception
            boolean r5 = r1.m3546(r0, r4, r7)     // Catch: java.lang.Throwable -> Le8
            if (r5 != 0) goto L151
            byte[] r1 = p000.sd2.f9867     // Catch: java.lang.Throwable -> Le8
            r3.getClass()     // Catch: java.lang.Throwable -> Le8
            java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Throwable -> Le8
        L140:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Le8
            if (r2 == 0) goto L150
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Le8
            java.lang.Exception r2 = (java.lang.Exception) r2     // Catch: java.lang.Throwable -> Le8
            p000.ln0.m3624(r0, r2)     // Catch: java.lang.Throwable -> Le8
            goto L140
        L150:
            throw r0     // Catch: java.lang.Throwable -> Le8
        L151:
            java.util.ArrayList r8 = p000.AbstractC0984xh.m6650(r0, r3)     // Catch: java.lang.Throwable -> Le8
            r6 = 1
            r4.m5931(r6)
            r6 = r4
            r0 = 0
            goto L16
        L15d:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Le8
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le8
            throw r0     // Catch: java.lang.Throwable -> Le8
        L165:
            r4.m5931(r6)
            throw r0
        L169:
            r4 = r6
            goto L16e
        L16b:
            r0 = move-exception
            r4 = r6
            goto L181
        L16e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L176
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L176
            throw r0     // Catch: java.lang.Throwable -> L176
        L176:
            r0 = move-exception
            goto L181
        L178:
            r4 = r6
            java.lang.String r0 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L176
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L176
            throw r1     // Catch: java.lang.Throwable -> L176
        L181:
            monitor-exit(r4)
            throw r0
        L183:
            java.lang.String r0 = "Check failed."
            p000.C1080.m7279(r0)
            goto L71
        L18a:
            return r5
        L18b:
            r6 = 1
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r3 = "User-Agent"
            java.lang.Object r1 = r1.f6539
            x r1 = (p000.C0966x) r1
            java.lang.String r4 = "gzip"
            java.lang.String r5 = "Accept-Encoding"
            java.lang.String r7 = "Connection"
            java.lang.String r8 = "Host"
            java.lang.String r9 = "Transfer-Encoding"
            java.lang.String r10 = "Content-Type"
            java.lang.String r11 = "Content-Length"
            i5 r12 = r2.f12664
            b8 r13 = r12.m2620()
            java.lang.Object r14 = r12.f4914
            og0 r14 = (p000.og0) r14
            java.lang.Object r15 = r12.f4916
            vc0 r15 = (p000.vc0) r15
            java.lang.Object r12 = r12.f4917
            kn1 r12 = (p000.kn1) r12
            r34 = r7
            r16 = -1
            if (r12 == 0) goto L1e6
            ez0 r6 = r12.f6056
            if (r6 == 0) goto L1c3
            java.lang.String r6 = r6.f3690
            r13.m814(r10, r6)
        L1c3:
            long r6 = r12.m3382()
            int r12 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r12 == 0) goto L1da
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r13.m814(r11, r6)
            java.lang.Object r6 = r13.f1557
            uc0 r6 = (p000.uc0) r6
            r6.m5841(r9)
            goto L1e6
        L1da:
            java.lang.String r6 = "chunked"
            r13.m814(r9, r6)
            java.lang.Object r6 = r13.f1557
            uc0 r6 = (p000.uc0) r6
            r6.m5841(r11)
        L1e6:
            java.lang.String r6 = r15.m6168(r8)
            if (r6 != 0) goto L1f7
            r6 = 0
            java.lang.String r7 = p000.ud2.m5850(r14, r6)
            r13.m814(r8, r7)
        L1f4:
            r7 = r34
            goto L1f9
        L1f7:
            r6 = 0
            goto L1f4
        L1f9:
            java.lang.String r8 = r15.m6168(r7)
            if (r8 != 0) goto L204
            java.lang.String r8 = "Keep-Alive"
            r13.m814(r7, r8)
        L204:
            java.lang.String r7 = r15.m6168(r5)
            if (r7 != 0) goto L218
            java.lang.String r7 = "Range"
            java.lang.String r7 = r15.m6168(r7)
            if (r7 != 0) goto L218
            r13.m814(r5, r4)
            r21 = 1
            goto L21a
        L218:
            r21 = r6
        L21a:
            r1.getClass()
            r14.getClass()
            java.lang.String r5 = r15.m6168(r3)
            if (r5 != 0) goto L22b
            java.lang.String r5 = "okhttp/5.3.2"
            r13.m814(r3, r5)
        L22b:
            i5 r3 = new i5
            r3.<init>(r13)
            zn1 r2 = r2.m6922(r3)
            vc0 r5 = r2.f13202
            java.lang.Object r6 = r3.f4914
            og0 r6 = (p000.og0) r6
            p000.mg0.m3823(r1, r6, r5)
            yn1 r1 = r2.m7206()
            r1.f12691 = r3
            if (r21 == 0) goto L290
            java.lang.String r3 = r5.m6168(r0)
            if (r3 != 0) goto L24c
            r3 = 0
        L24c:
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L290
            boolean r3 = p000.mg0.m3822(r2)
            if (r3 == 0) goto L290
            bo1 r2 = r2.f13203
            if (r2 == 0) goto L290
            mc0 r3 = new mc0
            ad r2 = r2.mo567()
            r3.<init>(r2)
            uc0 r2 = r5.m6170()
            r2.m5841(r0)
            r2.m5841(r11)
            vc0 r0 = r2.m5839()
            uc0 r0 = r0.m6170()
            r1.f12696 = r0
            java.lang.String r0 = r5.m6168(r10)
            if (r0 != 0) goto L281
            r5 = 0
            goto L282
        L281:
            r5 = r0
        L282:
            zk1 r0 = new zk1
            rk1 r2 = new rk1
            r2.<init>(r3)
            r3 = r16
            r0.<init>(r5, r3, r2)
            r1.f12697 = r0
        L290:
            zn1 r0 = r1.m6945()
            return r0
    }

    /* JADX INFO: renamed from: β */
    public p000.C0384i5 m3545(p000.zn1 r11, p000.C1076zz r12) {
            r10 = this;
            r0 = 0
            if (r12 == 0) goto La
            vk1 r1 = r12.m7253()
            zo1 r1 = r1.f11325
            goto Lb
        La:
            r1 = r0
        Lb:
            int r2 = r11.f13200
            i5 r3 = r11.f13197
            java.lang.Object r3 = r3.f4915
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = 1
            r6 = 308(0x134, float:4.32E-43)
            r7 = 307(0x133, float:4.3E-43)
            if (r2 == r7) goto Lcb
            if (r2 == r6) goto Lcb
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto Lc1
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L8a
            r12 = 503(0x1f7, float:7.05E-43)
            if (r2 == r12) goto L74
            r12 = 407(0x197, float:5.7E-43)
            if (r2 == r12) goto L55
            r12 = 408(0x198, float:5.72E-43)
            if (r2 == r12) goto L36
            switch(r2) {
                case 300: goto Lcb;
                case 301: goto Lcb;
                case 302: goto Lcb;
                case 303: goto Lcb;
                default: goto L34;
            }
        L34:
            goto L114
        L36:
            java.lang.Object r10 = r10.f6539
            t41 r10 = (p000.t41) r10
            boolean r10 = r10.f10179
            if (r10 != 0) goto L40
            goto L114
        L40:
            zn1 r10 = r11.f13207
            if (r10 == 0) goto L4a
            int r10 = r10.f13200
            if (r10 != r12) goto L4a
            goto L114
        L4a:
            int r10 = m3544(r11, r4)
            if (r10 <= 0) goto L52
            goto L114
        L52:
            i5 r10 = r11.f13197
            return r10
        L55:
            r1.getClass()
            java.net.Proxy r11 = r1.f13230
            java.net.Proxy$Type r11 = r11.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.HTTP
            if (r11 != r12) goto L6c
            java.lang.Object r10 = r10.f6539
            t41 r10 = (p000.t41) r10
            x r10 = r10.f10187
            r10.getClass()
            return r0
        L6c:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r10.<init>(r11)
            throw r10
        L74:
            zn1 r10 = r11.f13207
            if (r10 == 0) goto L7e
            int r10 = r10.f13200
            if (r10 != r12) goto L7e
            goto L114
        L7e:
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r10 = m3544(r11, r10)
            if (r10 != 0) goto L114
            i5 r10 = r11.f13197
            return r10
        L8a:
            if (r12 == 0) goto L114
            java.lang.Object r10 = r12.f13381
            c00 r10 = (p000.c00) r10
            al1 r10 = r10.mo1094()
            p r10 = r10.f316
            og0 r10 = r10.f8371
            java.lang.String r10 = r10.f8093
            java.lang.Object r1 = r12.f13382
            b00 r1 = (p000.b00) r1
            a00 r1 = r1.mo650()
            zo1 r1 = r1.mo2()
            p r1 = r1.f13229
            og0 r1 = r1.f8371
            java.lang.String r1 = r1.f8093
            boolean r10 = p000.ln0.m3626(r10, r1)
            if (r10 == 0) goto Lb3
            goto L114
        Lb3:
            vk1 r10 = r12.m7253()
            monitor-enter(r10)
            r10.f11333 = r5     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r10)
            i5 r10 = r11.f13197
            return r10
        Lbe:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        Lc1:
            java.lang.Object r10 = r10.f6539
            t41 r10 = (p000.t41) r10
            x r10 = r10.f10181
            r10.getClass()
            return r0
        Lcb:
            java.lang.String r12 = "PROPFIND"
            java.lang.Object r10 = r10.f6539
            t41 r10 = (p000.t41) r10
            boolean r1 = r10.f10182
            if (r1 != 0) goto Ld6
            goto L114
        Ld6:
            java.lang.String r1 = "Location"
            vc0 r2 = r11.f13202
            java.lang.String r1 = r2.m6168(r1)
            if (r1 != 0) goto Le1
            r1 = r0
        Le1:
            i5 r2 = r11.f13197
            if (r1 != 0) goto Le6
            goto L114
        Le6:
            java.lang.Object r8 = r2.f4914
            og0 r8 = (p000.og0) r8
            r8.getClass()
            ng0 r9 = new ng0     // Catch: java.lang.IllegalArgumentException -> Lf6
            r9.<init>()     // Catch: java.lang.IllegalArgumentException -> Lf6
            r9.m4042(r8, r1)     // Catch: java.lang.IllegalArgumentException -> Lf6
            goto Lf7
        Lf6:
            r9 = r0
        Lf7:
            if (r9 == 0) goto Lfe
            og0 r1 = r9.m4040()
            goto Lff
        Lfe:
            r1 = r0
        Lff:
            if (r1 != 0) goto L102
            goto L114
        L102:
            java.lang.String r8 = r1.f8090
            java.lang.Object r9 = r2.f4914
            og0 r9 = (p000.og0) r9
            java.lang.String r9 = r9.f8090
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 != 0) goto L115
            boolean r10 = r10.f10183
            if (r10 != 0) goto L115
        L114:
            return r0
        L115:
            b8 r10 = r2.m2620()
            boolean r8 = p000.jx0.m3031(r3)
            if (r8 == 0) goto L163
            int r11 = r11.f13200
            boolean r8 = r3.equals(r12)
            if (r8 != 0) goto L12b
            if (r11 == r6) goto L12b
            if (r11 != r7) goto L12c
        L12b:
            r4 = r5
        L12c:
            boolean r12 = r3.equals(r12)
            if (r12 != 0) goto L13c
            if (r11 == r6) goto L13c
            if (r11 == r7) goto L13c
            java.lang.String r11 = "GET"
            r10.m817(r11, r0)
            goto L146
        L13c:
            if (r4 == 0) goto L143
            java.lang.Object r11 = r2.f4917
            r0 = r11
            kn1 r0 = (p000.kn1) r0
        L143:
            r10.m817(r3, r0)
        L146:
            if (r4 != 0) goto L163
            java.lang.String r11 = "Transfer-Encoding"
            java.lang.Object r12 = r10.f1557
            uc0 r12 = (p000.uc0) r12
            r12.m5841(r11)
            java.lang.String r11 = "Content-Length"
            java.lang.Object r12 = r10.f1557
            uc0 r12 = (p000.uc0) r12
            r12.m5841(r11)
            java.lang.String r11 = "Content-Type"
            java.lang.Object r12 = r10.f1557
            uc0 r12 = (p000.uc0) r12
            r12.m5841(r11)
        L163:
            java.lang.Object r11 = r2.f4914
            og0 r11 = (p000.og0) r11
            boolean r11 = p000.ud2.m5843(r11, r1)
            if (r11 != 0) goto L176
            java.lang.String r11 = "Authorization"
            java.lang.Object r12 = r10.f1557
            uc0 r12 = (p000.uc0) r12
            r12.m5841(r11)
        L176:
            r10.f1555 = r1
            i5 r11 = new i5
            r11.<init>(r10)
            return r11
    }

    /* JADX INFO: renamed from: γ */
    public boolean m3546(java.io.IOException r1, p000.uk1 r2, p000.C0384i5 r3) {
            r0 = this;
            boolean r3 = r1 instanceof p000.C0593no
            java.lang.Object r0 = r0.f6539
            t41 r0 = (p000.t41) r0
            boolean r0 = r0.f10179
            if (r0 != 0) goto Lb
            goto L57
        Lb:
            if (r3 != 0) goto L12
            boolean r0 = r1 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L12
            goto L57
        L12:
            boolean r0 = r1 instanceof java.net.ProtocolException
            if (r0 == 0) goto L17
            goto L57
        L17:
            boolean r0 = r1 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L22
            boolean r0 = r1 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L57
            if (r3 == 0) goto L57
            goto L34
        L22:
            boolean r0 = r1 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L2f
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            if (r0 == 0) goto L2f
            goto L57
        L2f:
            boolean r0 = r1 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L34
            goto L57
        L34:
            zz r0 = r2.f10904
            if (r0 == 0) goto L57
            boolean r0 = r0.f13379
            r1 = 1
            if (r0 != r1) goto L57
            c00 r0 = r2.f10894
            r0.getClass()
            al1 r0 = r0.mo1094()
            zz r2 = r2.f10904
            if (r2 == 0) goto L4f
            vk1 r2 = r2.m7253()
            goto L50
        L4f:
            r2 = 0
        L50:
            boolean r0 = r0.m173(r2)
            if (r0 == 0) goto L57
            return r1
        L57:
            r0 = 0
            return r0
    }
}
