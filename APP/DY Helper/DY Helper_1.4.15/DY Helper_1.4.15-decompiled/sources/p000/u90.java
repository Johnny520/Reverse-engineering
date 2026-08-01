package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class u90 {

    /* JADX INFO: renamed from: α */
    public static final long[] f10651 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.t41 f10652 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f10653 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f10654 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.ConcurrentHashMap f10655 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f10656 = null;

    static {
            r0 = 8
            long[] r0 = new long[r0]
            r0 = {x0036: FILL_ARRAY_DATA , data: [25000000, 25000000, 25000000, 25000000, 25000000, 25000000, 25000000, 10422799} // fill-array
            p000.u90.f10651 = r0
            s41 r0 = new s41
            r0.<init>()
            r1 = 1
            r0.f9716 = r1
            t41 r1 = new t41
            r1.<init>(r0)
            p000.u90.f10652 = r1
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.u90.f10653 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.u90.f10654 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.u90.f10655 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.u90.f10656 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m5829(java.util.concurrent.atomic.AtomicBoolean r0) {
            boolean r0 = r0.get()
            if (r0 != 0) goto L7
            return
        L7:
            k30 r0 = new k30
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: β */
    public static java.io.File m5830(android.content.Context r2) {
            r2.getClass()
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r1 = "geonames_regions.sqlite"
            r0.<init>(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m5831(android.content.Context r43, p000.s90 r44, java.util.concurrent.atomic.AtomicBoolean r45, java.util.concurrent.atomic.AtomicReference r46, p000.m90 r47) {
            r0 = r46
            r1 = r47
            java.lang.String r2 = "第 "
            java.io.File r3 = r43.getFilesDir()
            r3.mkdirs()
            long r4 = java.lang.System.nanoTime()
            r9 = 1
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
        L1c:
            java.lang.String r8 = "geonames_regions.zip."
            r6 = 9
            if (r9 >= r6) goto L2cf
            m5829(r45)
            java.io.File r6 = new java.io.File
            java.lang.String r8 = p000.a12.m17(r8, r9)
            r6.<init>(r3, r8)
            r8 = r44
            java.lang.String r7 = r8.m5377(r9)
            r22 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "开始下载第 "
            r4.<init>(r5)
            r4.append(r9)
            java.lang.String r5 = "/8 个 GeoNames 分卷，URL="
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "raf02e3c7781e553e"
            r8 = 4
            r24 = r10
            r10 = 0
            p000.C0888ux.m5988(r5, r4, r10, r8, r10)
            b8 r4 = new b8
            r10 = 6
            r4.<init>(r10)
            r4.m819(r7)
            i5 r10 = new i5
            r10.<init>(r4)
            t41 r4 = p000.u90.f10652
            r4.getClass()
            uk1 r11 = new uk1
            r11.<init>(r4, r10)
            r0.set(r11)
            zn1 r4 = r11.m5930()
            int r10 = r4.f13200
            boolean r11 = r4.f13212     // Catch: java.lang.Throwable -> L29c
            if (r11 == 0) goto L2aa
            bo1 r11 = r4.f13203     // Catch: java.lang.Throwable -> L29c
            if (r11 == 0) goto L2a0
            long[] r26 = p000.u90.f10651     // Catch: java.lang.Throwable -> L29c
            int r27 = r9 + (-1)
            r28 = r9
            r8 = r26[r27]     // Catch: java.lang.Throwable -> L29c
            r26 = r11
            i5 r11 = r4.f13197     // Catch: java.lang.Throwable -> L29c
            java.lang.Object r11 = r11.f4914     // Catch: java.lang.Throwable -> L29c
            og0 r11 = (p000.og0) r11     // Catch: java.lang.Throwable -> L29c
            r29 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29c
            r12.<init>()     // Catch: java.lang.Throwable -> L29c
            r12.append(r2)     // Catch: java.lang.Throwable -> L29c
            r13 = r28
            r12.append(r13)     // Catch: java.lang.Throwable -> L29c
            r27 = r14
            java.lang.String r14 = "/8 个 GeoNames 分卷已连接，HTTP="
            r12.append(r14)     // Catch: java.lang.Throwable -> L29c
            r12.append(r10)     // Catch: java.lang.Throwable -> L29c
            java.lang.String r10 = "，请求 URL="
            r12.append(r10)     // Catch: java.lang.Throwable -> L29c
            r12.append(r7)     // Catch: java.lang.Throwable -> L29c
            java.lang.String r10 = "，响应 URL="
            r12.append(r10)     // Catch: java.lang.Throwable -> L29c
            r12.append(r11)     // Catch: java.lang.Throwable -> L29c
            java.lang.String r10 = r12.toString()     // Catch: java.lang.Throwable -> L29c
            r11 = 4
            r12 = 0
            p000.C0888ux.m5988(r5, r10, r12, r11, r12)     // Catch: java.lang.Throwable -> L29c
            long r10 = r26.mo565()     // Catch: java.lang.Throwable -> L29c
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 <= 0) goto Lfc
            long r10 = r26.mo565()     // Catch: java.lang.Throwable -> Lf6
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto Ld1
            goto Lfc
        Ld1:
            long r0 = r26.mo565()     // Catch: java.lang.Throwable -> Lf6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf6
            r3.<init>()     // Catch: java.lang.Throwable -> Lf6
            r3.append(r2)     // Catch: java.lang.Throwable -> Lf6
            r3.append(r13)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r2 = " 个分卷长度异常: "
            r3.append(r2)     // Catch: java.lang.Throwable -> Lf6
            r3.append(r0)     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Lf6
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf6
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lf6
            throw r1     // Catch: java.lang.Throwable -> Lf6
        Lf6:
            r0 = move-exception
            r1 = r0
            r31 = r4
            goto L2c7
        Lfc:
            ad r10 = r26.mo567()     // Catch: java.lang.Throwable -> L29c
            java.io.InputStream r10 = r10.mo62()     // Catch: java.lang.Throwable -> L29c
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L292
            r11.<init>(r6)     // Catch: java.lang.Throwable -> L292
            r6 = 65536(0x10000, float:9.1835E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L232
            r14 = r18
            r26 = r27
        L111:
            int r12 = r10.read(r6)     // Catch: java.lang.Throwable -> L232
            if (r12 < 0) goto L23a
            m5829(r45)     // Catch: java.lang.Throwable -> L232
            if (r12 == 0) goto L236
            r28 = r3
            r3 = 0
            r11.write(r6, r3, r12)     // Catch: java.lang.Throwable -> L232
            r31 = r4
            long r3 = (long) r12
            long r14 = r14 + r3
            long r34 = r24 + r3
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L22f
            long r24 = r3 - r29
            r32 = 200000000(0xbebc200, double:9.8813129E-316)
            int r12 = (r24 > r32 ? 1 : (r24 == r32 ? 0 : -1))
            if (r12 >= 0) goto L141
            int r12 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r12 != 0) goto L13a
            goto L141
        L13a:
            r3 = r28
            r4 = r31
            r24 = r34
            goto L111
        L141:
            long r24 = r3 - r22
            r29 = 1
            int r12 = (r24 > r29 ? 1 : (r24 == r29 ? 0 : -1))
            if (r12 >= 0) goto L14a
            goto L14c
        L14a:
            r29 = r24
        L14c:
            long r32 = r34 - r16
            r39 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r32 = r32 * r39
            long r32 = r32 / r29
            int r12 = (r32 > r18 ? 1 : (r32 == r18 ? 0 : -1))
            if (r12 >= 0) goto L15c
            r36 = r18
            goto L15e
        L15c:
            r36 = r32
        L15e:
            r90 r32 = new r90     // Catch: java.lang.Throwable -> L22f
            q90 r33 = p000.q90.f8907     // Catch: java.lang.Throwable -> L22f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22f
            r12.<init>()     // Catch: java.lang.Throwable -> L22f
            r41 = r3
            java.lang.String r3 = "正在下载第 "
            r12.append(r3)     // Catch: java.lang.Throwable -> L22f
            r12.append(r13)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r3 = "/8 个分卷"
            r12.append(r3)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r38 = r12.toString()     // Catch: java.lang.Throwable -> L22f
            r32.<init>(r33, r34, r36, r38)     // Catch: java.lang.Throwable -> L22f
            r12 = r32
            r3 = r34
            r1.invoke(r12)     // Catch: java.lang.Throwable -> L22f
            long r29 = r41 - r26
            int r12 = (r29 > r39 ? 1 : (r29 == r39 ? 0 : -1))
            if (r12 >= 0) goto L18e
            int r12 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r12 != 0) goto L191
        L18e:
            r32 = r14
            goto L199
        L191:
            r34 = r3
            r36 = r6
            r32 = r14
            r4 = 4
            goto L20b
        L199:
            double r14 = (double) r3     // Catch: java.lang.Throwable -> L22f
            r26 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r14 = r14 * r26
            r34 = r3
            r20 = r14
            r3 = 185422799(0xb0d53cf, double:9.1611035E-316)
            double r14 = (double) r3     // Catch: java.lang.Throwable -> L22f
            double r14 = r20 / r14
            java.lang.String r12 = m5832(r34)     // Catch: java.lang.Throwable -> L22f
            r20 = r3
            java.lang.String r3 = m5832(r20)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r4 = "%.1f"
            java.lang.Double r14 = java.lang.Double.valueOf(r14)     // Catch: java.lang.Throwable -> L22f
            java.lang.Object[] r14 = new java.lang.Object[]{r14}     // Catch: java.lang.Throwable -> L22f
            r15 = 1
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r4 = java.lang.String.format(r4, r14)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r14 = m5832(r36)     // Catch: java.lang.Throwable -> L22f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22f
            r15.<init>()     // Catch: java.lang.Throwable -> L22f
            r36 = r6
            java.lang.String r6 = "GeoNames 下载进度："
            r15.append(r6)     // Catch: java.lang.Throwable -> L22f
            r15.append(r12)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r6 = " MB/"
            r15.append(r6)     // Catch: java.lang.Throwable -> L22f
            r15.append(r3)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r3 = " MB ("
            r15.append(r3)     // Catch: java.lang.Throwable -> L22f
            r15.append(r4)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r3 = "%)，速度="
            r15.append(r3)     // Catch: java.lang.Throwable -> L22f
            r15.append(r14)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r3 = " MB/s，第 "
            r15.append(r3)     // Catch: java.lang.Throwable -> L22f
            r15.append(r13)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r3 = "/8 个分卷，URL="
            r15.append(r3)     // Catch: java.lang.Throwable -> L22f
            r15.append(r7)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r3 = r15.toString()     // Catch: java.lang.Throwable -> L22f
            r4 = 4
            r12 = 0
            p000.C0888ux.m5988(r5, r3, r12, r4, r12)     // Catch: java.lang.Throwable -> L22f
            r26 = r41
        L20b:
            int r3 = (r24 > r39 ? 1 : (r24 == r39 ? 0 : -1))
            if (r3 < 0) goto L221
            r3 = r28
            r4 = r31
            r14 = r32
            r16 = r34
            r24 = r16
            r6 = r36
            r22 = r41
            r29 = r22
            goto L111
        L221:
            r3 = r28
            r4 = r31
            r14 = r32
            r24 = r34
            r6 = r36
            r29 = r41
            goto L111
        L22f:
            r0 = move-exception
        L230:
            r1 = r0
            goto L28c
        L232:
            r0 = move-exception
            r31 = r4
            goto L230
        L236:
            r31 = r4
            goto L111
        L23a:
            r28 = r3
            r31 = r4
            int r3 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r3 != 0) goto L263
            r11.close()     // Catch: java.lang.Throwable -> L260
            r10.close()     // Catch: java.lang.Throwable -> L25d
            r31.close()
            r12 = 0
            r0.set(r12)
            int r9 = r13 + 1
            r4 = r22
            r10 = r24
            r14 = r26
            r3 = r28
            r12 = r29
            goto L1c
        L25d:
            r0 = move-exception
        L25e:
            r1 = r0
            goto L2c7
        L260:
            r0 = move-exception
        L261:
            r1 = r0
            goto L296
        L263:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22f
            r0.<init>()     // Catch: java.lang.Throwable -> L22f
            r0.append(r2)     // Catch: java.lang.Throwable -> L22f
            r0.append(r13)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r1 = " 个分卷不完整: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L22f
            r0.append(r14)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r1 = "/"
            r0.append(r1)     // Catch: java.lang.Throwable -> L22f
            r0.append(r8)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L22f
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L22f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L22f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L22f
            throw r1     // Catch: java.lang.Throwable -> L22f
        L28c:
            throw r1     // Catch: java.lang.Throwable -> L28d
        L28d:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r11, r1)     // Catch: java.lang.Throwable -> L260
            throw r0     // Catch: java.lang.Throwable -> L260
        L292:
            r0 = move-exception
            r31 = r4
            goto L261
        L296:
            throw r1     // Catch: java.lang.Throwable -> L297
        L297:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r10, r1)     // Catch: java.lang.Throwable -> L25d
            throw r0     // Catch: java.lang.Throwable -> L25d
        L29c:
            r0 = move-exception
            r31 = r4
            goto L25e
        L2a0:
            r31 = r4
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L25d
            java.lang.String r1 = "响应内容为空"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L25d
            throw r0     // Catch: java.lang.Throwable -> L25d
        L2aa:
            r31 = r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25d
            r0.<init>()     // Catch: java.lang.Throwable -> L25d
            java.lang.String r1 = "HTTP "
            r0.append(r1)     // Catch: java.lang.Throwable -> L25d
            r0.append(r10)     // Catch: java.lang.Throwable -> L25d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L25d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L25d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L25d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L25d
            throw r1     // Catch: java.lang.Throwable -> L25d
        L2c7:
            throw r1     // Catch: java.lang.Throwable -> L2c8
        L2c8:
            r0 = move-exception
            r2 = r31
            p000.AbstractC0978xb.m6584(r2, r1)
            throw r0
        L2cf:
            r28 = r3
            m5829(r45)
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "geonames_regions.zip"
            r0.<init>(r3, r2)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r4.<init>(r0)
            xm0 r5 = new xm0     // Catch: java.lang.Throwable -> L31c
            r6 = 8
            r15 = 1
            r5.<init>(r15, r6, r15)     // Catch: java.lang.Throwable -> L31c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L31c
        L2ec:
            r7 = r5
            wm0 r7 = (p000.wm0) r7     // Catch: java.lang.Throwable -> L31c
            boolean r7 = r7.f11765     // Catch: java.lang.Throwable -> L31c
            r9 = 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L328
            r7 = r5
            wm0 r7 = (p000.wm0) r7     // Catch: java.lang.Throwable -> L31c
            int r7 = r7.nextInt()     // Catch: java.lang.Throwable -> L31c
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L31c
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L31c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31c
            r12.<init>()     // Catch: java.lang.Throwable -> L31c
            r12.append(r8)     // Catch: java.lang.Throwable -> L31c
            r12.append(r7)     // Catch: java.lang.Throwable -> L31c
            java.lang.String r7 = r12.toString()     // Catch: java.lang.Throwable -> L31c
            r11.<init>(r3, r7)     // Catch: java.lang.Throwable -> L31c
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L31c
            p000.h62.m2364(r10, r4, r9)     // Catch: java.lang.Throwable -> L320
            r10.close()     // Catch: java.lang.Throwable -> L31c
            goto L2ec
        L31c:
            r0 = move-exception
            r1 = r0
            goto L502
        L320:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L323
        L323:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r10, r1)     // Catch: java.lang.Throwable -> L31c
            throw r0     // Catch: java.lang.Throwable -> L31c
        L328:
            r4.close()
            long r4 = r0.length()
            r20 = 185422799(0xb0d53cf, double:9.1611035E-316)
            int r4 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r4 != 0) goto L4f4
            r90 r10 = new r90
            r14 = 0
            java.lang.String r16 = "正在校验压缩包完整性"
            q90 r11 = p000.q90.f8908
            r12 = 185422799(0xb0d53cf, double:9.1611035E-316)
            r10.<init>(r11, r12, r14, r16)
            r1.invoke(r10)
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "geonames_regions.sqlite.tmp"
            r4.<init>(r3, r5)
            r4.delete()
            r90 r10 = new r90
            java.lang.String r16 = "正在解压并校验 SQLite 数据库"
            q90 r11 = p000.q90.f8909
            r10.<init>(r11, r12, r14, r16)
            r1.invoke(r10)
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r0)
            r3.<init>(r5)
            java.util.zip.ZipEntry r0 = r3.getNextEntry()     // Catch: java.lang.Throwable -> L399
            r5 = 0
        L36c:
            if (r0 == 0) goto L3aa
            m5829(r45)     // Catch: java.lang.Throwable -> L399
            boolean r7 = r0.isDirectory()     // Catch: java.lang.Throwable -> L399
            if (r7 != 0) goto L3a5
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L399
            r0.getClass()     // Catch: java.lang.Throwable -> L399
            r7 = 47
            java.lang.String r0 = p000.q02.m4687(r0, r7, r0)     // Catch: java.lang.Throwable -> L399
            java.lang.String r7 = "geonames_regions.sqlite"
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Throwable -> L399
            if (r0 == 0) goto L3a5
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L399
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L399
            p000.h62.m2364(r3, r5, r9)     // Catch: java.lang.Throwable -> L39d
            r5.close()     // Catch: java.lang.Throwable -> L399
            r5 = 1
            goto L3a5
        L399:
            r0 = move-exception
            r1 = r0
            goto L4ee
        L39d:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L3a0
        L3a0:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r5, r1)     // Catch: java.lang.Throwable -> L399
            throw r0     // Catch: java.lang.Throwable -> L399
        L3a5:
            java.util.zip.ZipEntry r0 = r3.getNextEntry()     // Catch: java.lang.Throwable -> L399
            goto L36c
        L3aa:
            if (r5 == 0) goto L4e6
            r3.close()
            long r9 = r4.length()
            r11 = 562589696(0x21887000, double:2.779562415E-315)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L4d8
            java.lang.String r0 = r4.getPath()
            r12 = 0
            r15 = 1
            android.database.sqlite.SQLiteDatabase r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r0, r12, r15)
            java.lang.String r0 = "PRAGMA integrity_check"
            android.database.Cursor r5 = r3.rawQuery(r0, r12)     // Catch: java.lang.Throwable -> L4b8
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L4c1
            if (r0 == 0) goto L4c4
            r0 = 0
            java.lang.String r7 = r5.getString(r0)     // Catch: java.lang.Throwable -> L4c1
            java.lang.String r0 = "ok"
            boolean r0 = p000.x02.m6480(r7, r0)     // Catch: java.lang.Throwable -> L4c1
            if (r0 == 0) goto L4c4
            r5.close()     // Catch: java.lang.Throwable -> L4b8
            java.lang.String r0 = "geonames"
            java.lang.String r5 = "countries"
            java.lang.String r7 = "admin1"
            java.lang.String r9 = "admin2"
            java.lang.String[] r0 = new java.lang.String[]{r0, r5, r7, r9}     // Catch: java.lang.Throwable -> L4b8
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)     // Catch: java.lang.Throwable -> L4b8
            java.lang.String r5 = "SELECT name FROM sqlite_master WHERE type='table'"
            r12 = 0
            android.database.Cursor r5 = r3.rawQuery(r5, r12)     // Catch: java.lang.Throwable -> L4b8
            ws1 r7 = new ws1     // Catch: java.lang.Throwable -> L40b
            r7.<init>()     // Catch: java.lang.Throwable -> L40b
        L3fc:
            boolean r9 = r5.moveToNext()     // Catch: java.lang.Throwable -> L40b
            if (r9 == 0) goto L40f
            r9 = 0
            java.lang.String r10 = r5.getString(r9)     // Catch: java.lang.Throwable -> L40b
            r7.add(r10)     // Catch: java.lang.Throwable -> L40b
            goto L3fc
        L40b:
            r0 = move-exception
            r1 = r0
            goto L4bb
        L40f:
            zw0 r9 = r7.f11853     // Catch: java.lang.Throwable -> L40b
            r9.m7241()     // Catch: java.lang.Throwable -> L40b
            int r9 = r9.f13336     // Catch: java.lang.Throwable -> L40b
            if (r9 <= 0) goto L419
            goto L41b
        L419:
            ws1 r7 = p000.ws1.f11852     // Catch: java.lang.Throwable -> L40b
        L41b:
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L40b
            boolean r9 = r0 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L40b
            if (r9 == 0) goto L42b
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Throwable -> L40b
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L40b
            if (r9 == 0) goto L42b
            goto L44c
        L42b:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L40b
        L42f:
            boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> L40b
            if (r9 == 0) goto L44c
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L40b
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L40b
            zw0 r10 = r7.f11853     // Catch: java.lang.Throwable -> L40b
            boolean r9 = r10.containsKey(r9)     // Catch: java.lang.Throwable -> L40b
            if (r9 == 0) goto L444
            goto L42f
        L444:
            java.lang.String r0 = "SQLite 表结构不完整"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L40b
            throw r1     // Catch: java.lang.Throwable -> L40b
        L44c:
            r5.close()     // Catch: java.lang.Throwable -> L4b8
            r3.close()
            m5829(r45)
            java.io.File r0 = m5830(r43)
            r0.delete()
            java.io.File r0 = m5830(r43)
            boolean r0 = r4.renameTo(r0)
            if (r0 == 0) goto L4b2
            boolean r0 = m5833(r43)
            if (r0 == 0) goto L4ac
            java.io.File r0 = r43.getFilesDir()
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r2)
            r3.delete()
            xm0 r2 = new xm0
            r15 = 1
            r2.<init>(r15, r6, r15)
            java.util.Iterator r2 = r2.iterator()
        L482:
            r3 = r2
            wm0 r3 = (p000.wm0) r3
            boolean r4 = r3.f11765
            if (r4 == 0) goto L49a
            int r3 = r3.nextInt()
            java.io.File r4 = new java.io.File
            java.lang.String r3 = p000.a12.m17(r8, r3)
            r4.<init>(r0, r3)
            r4.delete()
            goto L482
        L49a:
            r90 r9 = new r90
            r13 = 0
            java.lang.String r15 = "数据库校验完成"
            q90 r10 = p000.q90.f8910
            r11 = 185422799(0xb0d53cf, double:9.1611035E-316)
            r9.<init>(r10, r11, r13, r15)
            r1.invoke(r9)
            return
        L4ac:
            java.lang.String r0 = "SQLite 文件大小校验失败"
            p000.C1080.m7279(r0)
            return
        L4b2:
            java.lang.String r0 = "SQLite 文件安装失败"
            p000.C1080.m7279(r0)
            return
        L4b8:
            r0 = move-exception
            r1 = r0
            goto L4d2
        L4bb:
            throw r1     // Catch: java.lang.Throwable -> L4bc
        L4bc:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r5, r1)     // Catch: java.lang.Throwable -> L4b8
            throw r0     // Catch: java.lang.Throwable -> L4b8
        L4c1:
            r0 = move-exception
            r1 = r0
            goto L4cc
        L4c4:
            java.lang.String r0 = "SQLite integrity_check 未通过"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4c1
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4c1
            throw r1     // Catch: java.lang.Throwable -> L4c1
        L4cc:
            throw r1     // Catch: java.lang.Throwable -> L4cd
        L4cd:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r5, r1)     // Catch: java.lang.Throwable -> L4b8
            throw r0     // Catch: java.lang.Throwable -> L4b8
        L4d2:
            throw r1     // Catch: java.lang.Throwable -> L4d3
        L4d3:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r3, r1)
            throw r0
        L4d8:
            long r0 = r4.length()
            java.lang.String r2 = "SQLite 文件长度异常: "
            java.lang.String r0 = p000.AbstractC0602nx.m4126(r0, r2)
            p000.C1080.m7273(r0)
            return
        L4e6:
            java.lang.String r0 = "压缩包中缺少 geonames_regions.sqlite"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L399
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L399
            throw r1     // Catch: java.lang.Throwable -> L399
        L4ee:
            throw r1     // Catch: java.lang.Throwable -> L4ef
        L4ef:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r3, r1)
            throw r0
        L4f4:
            long r0 = r0.length()
            java.lang.String r2 = "合并压缩包长度异常: "
            java.lang.String r0 = p000.AbstractC0602nx.m4126(r0, r2)
            p000.C1080.m7273(r0)
            return
        L502:
            throw r1     // Catch: java.lang.Throwable -> L503
        L503:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r4, r1)
            throw r0
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m5832(long r2) {
            double r2 = (double) r2
            r0 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r2 = r2 / r0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r3 = "%.1f"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m5833(android.content.Context r4) {
            r4.getClass()
            java.io.File r0 = m5830(r4)
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L1e
            java.io.File r4 = m5830(r4)
            long r0 = r4.length()
            r2 = 562589696(0x21887000, double:2.779562415E-315)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1e
            r4 = 1
            return r4
        L1e:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m5834(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L1c
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isDigit(r3)
            if (r4 == 0) goto L19
            r0.append(r3)
        L19:
            int r2 = r2 + 1
            goto La
        L1c:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m5835(android.content.Context r10, java.lang.String r11) {
            boolean r0 = m5833(r10)
            r1 = 0
            if (r0 != 0) goto L9
            goto Ld3
        L9:
            r0 = 10
            java.lang.Long r2 = p000.x02.m6489(r11, r0)
            if (r2 == 0) goto Ld3
            long r2 = r2.longValue()
            java.io.File r10 = m5830(r10)     // Catch: java.lang.Throwable -> La3
            java.lang.String r10 = r10.getPath()     // Catch: java.lang.Throwable -> La3
            r4 = 1
            android.database.sqlite.SQLiteDatabase r10 = android.database.sqlite.SQLiteDatabase.openDatabase(r10, r1, r4)     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "SELECT c.name,a1.name,a2.name,g.name FROM geonames g LEFT JOIN countries c ON c.country_code=g.country_code LEFT JOIN admin1 a1 ON a1.country_code=g.country_code AND a1.admin1_code=g.admin1_code LEFT JOIN admin2 a2 ON a2.country_code=g.country_code AND a2.admin1_code=g.admin1_code AND a2.admin2_code=g.admin2_code WHERE g.geoname_id=? ORDER BY g.population DESC LIMIT 1"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> La6
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> La6
            android.database.Cursor r2 = r10.rawQuery(r5, r2)     // Catch: java.lang.Throwable -> La6
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L6a
            if (r3 != 0) goto L38
            r0 = r1
            goto L9c
        L38:
            xm0 r3 = new xm0     // Catch: java.lang.Throwable -> L6a
            r5 = 0
            r6 = 3
            r3.<init>(r5, r6, r4)     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6a
            int r0 = p000.AbstractC1021yh.m6889(r3, r0)     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L6a
        L4c:
            r3 = r0
            wm0 r3 = (p000.wm0) r3     // Catch: java.lang.Throwable -> L6a
            boolean r3 = r3.f11765     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L6d
            r3 = r0
            wm0 r3 = (p000.wm0) r3     // Catch: java.lang.Throwable -> L6a
            int r3 = r3.nextInt()     // Catch: java.lang.Throwable -> L6a
            boolean r5 = r2.isNull(r3)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L62
            r3 = r1
            goto L66
        L62:
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L6a
        L66:
            r4.add(r3)     // Catch: java.lang.Throwable -> L6a
            goto L4c
        L6a:
            r0 = move-exception
            r3 = r0
            goto La9
        L6d:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6a
            r3.<init>()     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r0 = r4.iterator()     // Catch: java.lang.Throwable -> L6a
        L76:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L90
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L6a
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L76
            boolean r5 = p000.q02.m4671(r5)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L8c
            goto L76
        L8c:
            r3.add(r4)     // Catch: java.lang.Throwable -> L6a
            goto L76
        L90:
            java.lang.String r4 = " · "
            r8 = 0
            r9 = 62
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L6a
        L9c:
            r2.close()     // Catch: java.lang.Throwable -> La6
            r10.close()     // Catch: java.lang.Throwable -> La3
            goto Lba
        La3:
            r0 = move-exception
            r10 = r0
            goto Lb5
        La6:
            r0 = move-exception
            r2 = r0
            goto Laf
        La9:
            throw r3     // Catch: java.lang.Throwable -> Laa
        Laa:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r2, r3)     // Catch: java.lang.Throwable -> La6
            throw r0     // Catch: java.lang.Throwable -> La6
        Laf:
            throw r2     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r10, r2)     // Catch: java.lang.Throwable -> La3
            throw r0     // Catch: java.lang.Throwable -> La3
        Lb5:
            eo1 r0 = new eo1
            r0.<init>(r10)
        Lba:
            java.lang.Throwable r10 = p000.fo1.m2190(r0)
            if (r10 == 0) goto Lcb
            java.lang.String r2 = "国外地区查询失败 code="
            java.lang.String r11 = r2.concat(r11)
            java.lang.String r2 = "raf02e3c7781e553e"
            p000.C0888ux.m5977(r2, r11, r10)
        Lcb:
            boolean r10 = r0 instanceof p000.eo1
            if (r10 == 0) goto Ld0
            goto Ld1
        Ld0:
            r1 = r0
        Ld1:
            java.lang.String r1 = (java.lang.String) r1
        Ld3:
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static void m5836(android.content.Context r3, java.lang.String r4, p000.p70 r5) {
            java.lang.String r4 = m5834(r4)
            boolean r0 = p000.q02.m4671(r4)
            if (r0 != 0) goto L32
            java.util.concurrent.ConcurrentHashMap r0 = p000.u90.f10655
            java.lang.String r1 = m5834(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L17
            goto L32
        L17:
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = p000.u90.f10656
            boolean r0 = r0.add(r4)
            if (r0 != 0) goto L20
            return
        L20:
            java.lang.Thread r0 = new java.lang.Thread
            e9 r1 = new e9
            r2 = 14
            r1.<init>(r4, r3, r5, r2)
            java.lang.String r3 = "DY-GeoNames-Query"
            r0.<init>(r1, r3)
            r0.start()
            return
        L32:
            r5.invoke()
            return
    }
}
