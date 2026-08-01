package p000;

/* JADX INFO: renamed from: wx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0963wx {

    /* JADX INFO: renamed from: α */
    public static final p000.t41 f11880 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f11881 = null;

    static {
            s41 r0 = new s41
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r1.getClass()
            r1 = 15
            int r1 = p000.ud2.m5844(r1)
            r0.f9729 = r1
            r1 = 30
            int r1 = p000.ud2.m5844(r1)
            r0.f9730 = r1
            r1 = 1
            r0.f9719 = r1
            r0.f9720 = r1
            r0.f9716 = r1
            t41 r1 = new t41
            r1.<init>(r0)
            p000.C0963wx.f11880 = r1
            java.lang.String r7 = "range"
            java.lang.String r8 = "if-range"
            java.lang.String r2 = "host"
            java.lang.String r3 = "content-length"
            java.lang.String r4 = "content-type"
            java.lang.String r5 = "transfer-encoding"
            java.lang.String r6 = "connection"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.C0963wx.f11881 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static byte[] m6406(java.lang.String r5, java.util.Map r6, java.lang.String r7, int r8) {
            r5.getClass()
            r0 = 12
            vx r5 = m6411(r5, r6, r7, r0)
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L29
            r6.<init>()     // Catch: java.lang.Throwable -> L29
            r7 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r7]     // Catch: java.lang.Throwable -> L29
            r1 = 0
            r2 = r1
        L14:
            if (r2 >= r8) goto L2b
            int r3 = r8 - r2
            int r3 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L29
            java.io.BufferedInputStream r4 = r5.f11459     // Catch: java.lang.Throwable -> L29
            int r3 = r4.read(r0, r1, r3)     // Catch: java.lang.Throwable -> L29
            if (r3 <= 0) goto L2b
            r6.write(r0, r1, r3)     // Catch: java.lang.Throwable -> L29
            int r2 = r2 + r3
            goto L14
        L29:
            r6 = move-exception
            goto L36
        L2b:
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> L29
            r6.getClass()     // Catch: java.lang.Throwable -> L29
            r5.m6283()
            return r6
        L36:
            r5.m6283()
            throw r6
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m6407(java.lang.String r3, java.util.Map r4) {
            r3.getClass()
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "application/json"
            r2 = 2097152(0x200000, float:2.938736E-39)
            byte[] r3 = m6406(r3, r4, r1, r2)
            java.nio.charset.Charset r4 = p000.AbstractC0547mf.f7105
            r0.<init>(r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m6408(java.util.LinkedHashMap r4, java.lang.String r5) {
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        La:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.Object r0 = r4.next()
            r2 = r0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = p000.x02.m6480(r3, r5)
            if (r3 == 0) goto La
            java.lang.Object r2 = r2.getValue()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto La
            goto L32
        L31:
            r0 = r1
        L32:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L3d
            java.lang.Object r4 = r0.getValue()
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L3d:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static final void m6409(java.util.LinkedHashMap r3, java.lang.String r4, java.lang.String r5) {
            boolean r0 = p000.q02.m4671(r4)
            if (r0 != 0) goto L39
            boolean r0 = p000.q02.m4671(r5)
            if (r0 == 0) goto Ld
            goto L39
        Ld:
            java.util.Set r0 = r3.keySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = p000.x02.m6480(r2, r4)
            if (r2 == 0) goto L1a
            goto L2f
        L2e:
            r1 = 0
        L2f:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L36
            r3.remove(r1)
        L36:
            r3.put(r4, r5)
        L39:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static p000.C0926vx m6410(java.lang.String r14, java.util.Map r15, boolean r16, java.lang.String r17) {
            java.lang.String r1 = "DYHelper"
            r14.getClass()
            r15.getClass()
            r17.getClass()
            java.lang.CharSequence r14 = p000.q02.m4660(r14)
            java.lang.String r14 = r14.toString()
            r0 = 0
            java.lang.String r2 = "//"
            boolean r0 = p000.x02.m6485(r14, r2, r0)
            if (r0 == 0) goto L22
            java.lang.String r0 = "https:"
            java.lang.String r14 = r0.concat(r14)
        L22:
            java.lang.String r0 = "&amp;"
            java.lang.String r2 = "&"
            java.lang.String r4 = p000.x02.m6483(r14, r0, r2)
            if (r16 == 0) goto L39
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Boolean[] r14 = new java.lang.Boolean[]{r14, r0}
            java.util.List r14 = p000.AbstractC1021yh.m6897(r14)
            goto L41
        L39:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r16)
            java.util.List r14 = p000.AbstractC1021yh.m6896(r14)
        L41:
            java.util.Iterator r2 = r14.iterator()
            r3 = 0
            r0 = -1
            r5 = r3
        L48:
            boolean r6 = r2.hasNext()
            java.lang.String r7 = " "
            java.lang.String r8 = "HTTP "
            java.lang.String r9 = ""
            if (r6 == 0) goto L285
            java.lang.Object r0 = r2.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            java.util.Map r0 = p000.f31.m2027(r4)     // Catch: java.lang.Throwable -> L9f
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L9f
            r6.<init>()     // Catch: java.lang.Throwable -> L9f
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L9f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L9f
        L6f:
            boolean r10 = r0.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r10 == 0) goto La7
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L9f
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r11 = r10.getKey()     // Catch: java.lang.Throwable -> L9f
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch: java.lang.Throwable -> L9f
            boolean r11 = p000.q02.m4671(r11)     // Catch: java.lang.Throwable -> L9f
            if (r11 != 0) goto L6f
            java.lang.Object r11 = r10.getValue()     // Catch: java.lang.Throwable -> L9f
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11     // Catch: java.lang.Throwable -> L9f
            boolean r11 = p000.q02.m4671(r11)     // Catch: java.lang.Throwable -> L9f
            if (r11 != 0) goto L6f
            java.lang.Object r11 = r10.getKey()     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L9f
            r6.put(r11, r10)     // Catch: java.lang.Throwable -> L9f
            goto L6f
        L9f:
            r0 = move-exception
            java.lang.String r6 = "获取 OkHttp 下载 Header 失败"
            p000.C0888ux.m5977(r1, r6, r0)
            kz r6 = p000.C0493kz.f6332
        La7:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        Lb4:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Ld0
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            m6409(r0, r11, r10)
            goto Lb4
        Ld0:
            java.util.Set r6 = r15.entrySet()
            java.util.Iterator r6 = r6.iterator()
        Ld8:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Lf4
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            m6409(r0, r11, r10)
            goto Ld8
        Lf4:
            b8 r6 = new b8
            r10 = 6
            r6.<init>(r10)
            r6.m819(r4)
            java.lang.String r10 = "GET"
            r6.m817(r10, r3)
            java.lang.String r10 = "User-Agent"
            java.lang.String r11 = m6408(r0, r10)
            if (r11 != 0) goto L10c
            java.lang.String r11 = "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Mobile Safari/537.36"
        L10c:
            r6.m814(r10, r11)
            java.lang.String r10 = "Accept"
            java.lang.String r11 = m6408(r0, r10)
            if (r11 != 0) goto L119
            r11 = r17
        L119:
            r6.m814(r10, r11)
            java.lang.String r10 = "Accept-Encoding"
            java.lang.String r11 = "identity"
            r6.m814(r10, r11)
            java.lang.String r10 = "Accept-Language"
            java.lang.String r11 = m6408(r0, r10)
            if (r11 != 0) goto L12d
            java.lang.String r11 = "zh-CN,zh;q=0.9,en;q=0.8"
        L12d:
            r6.m814(r10, r11)
            java.lang.String r10 = "Referer"
            java.lang.String r11 = m6408(r0, r10)
            if (r11 != 0) goto L13a
            java.lang.String r11 = "https://www.douyin.com/"
        L13a:
            r6.m814(r10, r11)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L145:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L1a4
            java.lang.Object r10 = r0.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r12 = p000.AbstractC0602nx.m4134(r12, r11, r12)
            java.util.Set r13 = p000.C0963wx.f11881
            boolean r13 = r13.contains(r12)
            if (r13 != 0) goto L145
            int r13 = r12.hashCode()
            switch(r13) {
                case -1423461112: goto L197;
                case -167369608: goto L18e;
                case 486342275: goto L185;
                case 802785917: goto L17c;
                case 1085069613: goto L173;
                default: goto L172;
            }
        L172:
            goto L1a0
        L173:
            java.lang.String r13 = "referer"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L145
            goto L1a0
        L17c:
            java.lang.String r13 = "accept-language"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L145
            goto L1a0
        L185:
            java.lang.String r13 = "user-agent"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L145
            goto L1a0
        L18e:
            java.lang.String r13 = "accept-encoding"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L145
            goto L1a0
        L197:
            java.lang.String r13 = "accept"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L1a0
            goto L145
        L1a0:
            r6.m814(r11, r10)     // Catch: java.lang.Throwable -> L145
            goto L145
        L1a4:
            if (r5 == 0) goto L1ad
            java.lang.String r0 = "Range"
            java.lang.String r10 = "bytes=0-"
            r6.m814(r0, r10)
        L1ad:
            i5 r0 = new i5
            r0.<init>(r6)
            t41 r6 = p000.C0963wx.f11880
            r6.getClass()
            uk1 r10 = new uk1
            r10.<init>(r6, r0)
            zn1 r6 = r10.m5930()
            int r11 = r6.f13200
            java.lang.String r0 = r6.f13199
            r10 = 401(0x191, float:5.62E-43)
            if (r11 == r10) goto L1d1
            r10 = 403(0x193, float:5.65E-43)
            if (r11 == r10) goto L1d1
            r10 = 416(0x1a0, float:5.83E-43)
            if (r11 == r10) goto L1d1
            goto L20e
        L1d1:
            r6.close()
            if (r5 == 0) goto L20e
            int r5 = r14.size()
            r10 = 1
            if (r5 <= r10) goto L20e
            int r5 = r4.length()
            r6 = 140(0x8c, float:1.96E-43)
            if (r5 > r6) goto L1e7
            r5 = r4
            goto L1f1
        L1e7:
            java.lang.String r5 = p000.q02.m4693(r4, r6)
            java.lang.String r6 = "..."
            java.lang.String r5 = r5.concat(r6)
        L1f1:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[OKHTTP-RETRY] HTTP "
            r6.<init>(r7)
            r6.append(r11)
            java.lang.String r7 = " range=true url="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            p000.C0888ux.m5975(r1, r5)
            r5 = r0
            r0 = r11
            goto L48
        L20e:
            boolean r14 = r6.f13212
            if (r14 != 0) goto L23d
            r14 = 206(0xce, float:2.89E-43)
            if (r11 == r14) goto L23d
            r6.close()
            java.lang.Exception r14 = new java.lang.Exception
            if (r0 != 0) goto L21e
            goto L21f
        L21e:
            r9 = r0
        L21f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            r0.append(r11)
            r0.append(r7)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L23d:
            bo1 r14 = r6.f13203
            if (r14 == 0) goto L27a
            r1 = r3
            vx r3 = new vx
            i5 r0 = r6.f13197
            java.lang.Object r0 = r0.f4914
            og0 r0 = (p000.og0) r0
            java.lang.String r5 = r0.f8097
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream
            ad r0 = r14.mo567()
            java.io.InputStream r0 = r0.mo62()
            r7.<init>(r0)
            ez0 r0 = r14.mo566()
            if (r0 == 0) goto L266
            java.lang.String r0 = r0.f3690
            if (r0 != 0) goto L264
            goto L266
        L264:
            r8 = r0
            goto L272
        L266:
            java.lang.String r0 = "Content-Type"
            vc0 r2 = r6.f13202
            java.lang.String r0 = r2.m6168(r0)
            if (r0 != 0) goto L264
            r0 = r1
            goto L264
        L272:
            long r9 = r14.mo565()
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            return r3
        L27a:
            r6.close()
            java.lang.Exception r14 = new java.lang.Exception
            java.lang.String r0 = "响应体为空"
            r14.<init>(r0)
            throw r14
        L285:
            java.lang.Exception r14 = new java.lang.Exception
            if (r5 != 0) goto L28a
            r5 = r9
        L28a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            r1.append(r0)
            r1.append(r7)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
    }

    /* JADX INFO: renamed from: ζ */
    public static /* synthetic */ p000.C0926vx m6411(java.lang.String r1, java.util.Map r2, java.lang.String r3, int r4) {
            r0 = r4 & 2
            if (r0 == 0) goto L6
            kz r2 = p000.C0493kz.f6332
        L6:
            r0 = r4 & 4
            if (r0 == 0) goto Lc
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            r4 = r4 & 16
            if (r4 == 0) goto L13
            java.lang.String r3 = "*/*"
        L13:
            vx r1 = m6410(r1, r2, r0, r3)
            return r1
    }
}
