package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qy0 {

    /* JADX INFO: renamed from: α */
    public static final p000.qy0 f9157 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f9158 = null;

    /* JADX INFO: renamed from: γ */
    public static volatile int f9159;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ExecutorService f9160 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.ConcurrentHashMap f9161 = null;

    static {
            qy0 r0 = new qy0
            r0.<init>()
            p000.qy0.f9157 = r0
            java.lang.String r6 = "emoji_download_tree_uri"
            java.lang.String r7 = "download_uri"
            java.lang.String r1 = "video_download_tree_uri"
            java.lang.String r2 = "image_download_tree_uri"
            java.lang.String r3 = "animated_download_tree_uri"
            java.lang.String r4 = "live_photo_download_tree_uri"
            java.lang.String r5 = "audio_download_uri"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.qy0.f9158 = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            p000.qy0.f9159 = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            p000.qy0.f9160 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.qy0.f9161 = r0
            r0 = 3
            java.util.concurrent.Executors.newFixedThreadPool(r0)
            nq r0 = new nq
            r1 = 1
            r2 = 1
            r3 = 60
            r4 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r3, r4, r1, r2)
            return
    }

    /* JADX INFO: renamed from: Α */
    public static java.lang.String m4951(byte[] r6, int r7) {
            java.lang.String r0 = ""
            r1 = 8
            r2 = 4
            r3 = 12
            if (r7 < r3) goto La6
            int r4 = r6.length
            if (r4 >= r1) goto Le
            r4 = r0
            goto L15
        Le:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = p000.AbstractC0547mf.f7107
            r4.<init>(r6, r2, r2, r5)
        L15:
            java.lang.String r5 = "ftyp"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto La6
            int r7 = r6.length
            if (r7 >= r3) goto L21
            goto L28
        L21:
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r7 = p000.AbstractC0547mf.f7107
            r0.<init>(r6, r1, r2, r7)
        L28:
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r6 = r0.toLowerCase(r6)
            r6.getClass()
            int r7 = r6.hashCode()
            switch(r7) {
                case 3006482: goto L9a;
                case 3006495: goto L91;
                case 3198679: goto L85;
                case 3198700: goto L7c;
                case 3199082: goto L72;
                case 3199103: goto L68;
                case 3351335: goto L5b;
                case 3360945: goto L51;
                case 3632040: goto L44;
                case 3632090: goto L3a;
                default: goto L38;
            }
        L38:
            goto Le1
        L3a:
            java.lang.String r7 = "vvic"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L4e
            goto Le1
        L44:
            java.lang.String r7 = "vvi1"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L4e
            goto Le1
        L4e:
            java.lang.String r6 = "image/vvic"
            return r6
        L51:
            java.lang.String r7 = "msf1"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L65
            goto Le1
        L5b:
            java.lang.String r7 = "mif1"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L65
            goto Le1
        L65:
            java.lang.String r6 = "image/heif"
            return r6
        L68:
            java.lang.String r7 = "hevx"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L8e
            goto Le1
        L72:
            java.lang.String r7 = "hevc"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L8e
            goto Le1
        L7c:
            java.lang.String r7 = "heix"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L8e
            goto Le1
        L85:
            java.lang.String r7 = "heic"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L8e
            goto Le1
        L8e:
            java.lang.String r6 = "image/heic"
            return r6
        L91:
            java.lang.String r7 = "avis"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto La3
            goto Le1
        L9a:
            java.lang.String r7 = "avif"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto La3
            goto Le1
        La3:
            java.lang.String r6 = "image/avif"
            return r6
        La6:
            if (r7 < r1) goto Le4
            int r3 = r6.length
            if (r3 >= r1) goto Lac
            goto Lb3
        Lac:
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = p000.AbstractC0547mf.f7107
            r0.<init>(r6, r2, r2, r1)
        Lb3:
            int r1 = r0.hashCode()
            r2 = 3151468(0x30166c, float:4.416147E-39)
            if (r1 == r2) goto Ld9
            r2 = 3346442(0x33100a, float:4.689364E-39)
            if (r1 == r2) goto Ld0
            r2 = 3357449(0x333b09, float:4.704788E-39)
            if (r1 == r2) goto Lc7
            goto Le4
        Lc7:
            java.lang.String r1 = "moov"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Le1
            goto Le4
        Ld0:
            java.lang.String r1 = "mdat"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Le1
            goto Le4
        Ld9:
            java.lang.String r1 = "free"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le4
        Le1:
            java.lang.String r6 = "video/mp4"
            return r6
        Le4:
            java.lang.String r6 = p000.jx0.m3055(r6, r7)
            return r6
    }

    /* JADX INFO: renamed from: Δ */
    public static final void m4952(java.util.concurrent.atomic.AtomicInteger r3, int r4, java.util.concurrent.atomic.AtomicInteger r5, android.app.Activity r6, boolean r7, android.app.NotificationManager r8, int r9, p000.C0276f8 r10) {
            int r3 = r3.get()
            int r5 = r5.get()
            java.lang.String r0 = "/"
            java.lang.String r1 = " · 成功 "
            java.lang.String r2 = "进度: "
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r0 = 0
            if (r4 <= 0) goto L20
            int r1 = r3 * 100
            int r1 = r1 / r4
            goto L21
        L20:
            r1 = r0
        L21:
            java.lang.String r2 = "批量下载"
            m4997(r1, r6, r2, r5)
            if (r7 == 0) goto L62
            x31 r7 = new x31
            r7.<init>(r6)
            r6 = 17301633(0x1080081, float:2.4979616E-38)
            android.app.Notification r1 = r7.f12043
            r1.icon = r6
            if (r10 == 0) goto L3a
            java.lang.String r6 = r10.f3793
            if (r6 != 0) goto L3c
        L3a:
            java.lang.String r6 = "主页作品"
        L3c:
            java.lang.String r10 = "正在批量下载 "
            java.lang.String r6 = r10.concat(r6)
            java.lang.CharSequence r6 = p000.x31.m6513(r6)
            r7.f12034 = r6
            java.lang.CharSequence r5 = p000.x31.m6513(r5)
            r7.f12035 = r5
            r7.f12037 = r4
            r7.f12038 = r3
            r7.f12039 = r0
            r3 = 2
            r7.m6515(r3)
            r3 = 1
            r7.f12044 = r3
            android.app.Notification r3 = r7.m6514()
            r8.notify(r9, r3)
        L62:
            return
    }

    /* JADX INFO: renamed from: Ε */
    public static void m4953(java.lang.String r1) {
            boolean r0 = p000.C0888ux.m5984()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "[downoload dev][DOWNLOAD] "
            java.lang.String r1 = r0.concat(r1)
            java.lang.String r0 = "DYHelper"
            p000.C0888ux.m5975(r0, r1)
            return
    }

    /* JADX INFO: renamed from: Ι */
    public static final void m4954(java.util.LinkedHashSet r2, java.lang.String r3) {
            if (r3 == 0) goto L1f
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto L9
            goto L1f
        L9:
            java.lang.String r0 = "http"
            r1 = 1
            boolean r0 = p000.x02.m6485(r3, r0, r1)
            if (r0 == 0) goto L1f
            boolean r0 = p000.jx0.m3016(r3)
            if (r0 != 0) goto L1f
            java.lang.String r3 = m5001(r3)
            r2.add(r3)
        L1f:
            return
    }

    /* JADX INFO: renamed from: Ξ */
    public static void m4955(android.app.Activity r6, p000.C0276f8 r7, java.util.List r8, java.lang.String r9) {
            m4960(r6)
            boolean r4 = m4988(r6)
            int r0 = r8.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "共 "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " 项，准备中..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "选择下载"
            m4996(r6, r1, r0)
            int r0 = r8.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "开始下载已选 "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " 项..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m4991(r6, r0)
            bf0 r0 = new bf0
            r2 = r6
            r3 = r7
            r1 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6 = 23
            java.lang.String r7 = "dl-selected-media"
            p000.p91.m4411(r6, r0, r7)
            return
    }

    /* JADX INFO: renamed from: Ο */
    public static void m4956(java.lang.String r13, java.io.OutputStream r14, android.content.Context r15, int r16, java.lang.String r17, boolean r18, java.lang.String r19, p000.e80 r20, p000.e80 r21) {
            r1 = 0
            t41 r0 = p000.C0963wx.f11880     // Catch: java.lang.Throwable -> L26
            java.lang.String r13 = m5001(r13)     // Catch: java.lang.Throwable -> L26
            r0 = 30
            vx r1 = p000.C0963wx.m6411(r13, r1, r1, r0)     // Catch: java.lang.Throwable -> L26
            java.io.BufferedInputStream r2 = r1.f11459     // Catch: java.lang.Throwable -> L26
            long r7 = r1.f11461     // Catch: java.lang.Throwable -> L26
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            m4983(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L26
            r1.m6283()
            return
        L26:
            r0 = move-exception
            r13 = r0
            if (r1 == 0) goto L2d
            r1.m6283()
        L2d:
            throw r13
    }

    /* JADX INFO: renamed from: Ρ */
    public static final void m4957(android.app.Activity r8, p000.C0276f8 r9, p000.C0299fv r10, java.lang.String r11) {
            m4960(r8)
            java.lang.String r0 = "下载视频"
            java.lang.String r1 = "正在连接..."
            m4996(r8, r0, r1)
            java.lang.String r0 = "开始下载视频..."
            m4991(r8, r0)
            java.lang.String r7 = r10.f4139
            m4960(r8)
            qy0 r10 = p000.qy0.f9157
            int r4 = r10.m5031()
            boolean r6 = m4988(r8)
            by0 r1 = new by0
            r3 = r8
            r2 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = 23
            java.lang.String r9 = "dl-video-final"
            p000.p91.m4411(r8, r1, r9)
            return
    }

    /* JADX INFO: renamed from: Σ */
    public static void m4958(android.content.Context r11, java.lang.String r12, java.io.File r13, int r14, java.lang.String r15, boolean r16, java.lang.String r17, p000.e80 r18, p000.e80 r19) {
            boolean r0 = r13.exists()
            if (r0 == 0) goto L9
            r13.delete()
        L9:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L28
            qy0 r1 = p000.qy0.f9157     // Catch: java.lang.Throwable -> L2b
            r4 = r11
            r2 = r12
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r1.m5027(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2b
            r3.close()     // Catch: java.lang.Throwable -> L28
            pu0 r11 = p000.pu0.f8717     // Catch: java.lang.Throwable -> L28
            r11.m4640(r13, r12)     // Catch: java.lang.Throwable -> L28
            return
        L28:
            r0 = move-exception
            r11 = r0
            goto L34
        L2b:
            r0 = move-exception
            r11 = r0
            throw r11     // Catch: java.lang.Throwable -> L2e
        L2e:
            r0 = move-exception
            r12 = r0
            p000.AbstractC0978xb.m6584(r3, r11)     // Catch: java.lang.Throwable -> L28
            throw r12     // Catch: java.lang.Throwable -> L28
        L34:
            r13.delete()
            throw r11
    }

    /* JADX INFO: renamed from: Υ */
    public static final void m4959(java.util.LinkedHashSet r2, java.lang.String r3) {
            if (r3 == 0) goto L25
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto L9
            goto L25
        L9:
            java.lang.String r0 = "http"
            r1 = 1
            boolean r0 = p000.x02.m6485(r3, r0, r1)
            if (r0 == 0) goto L25
            boolean r0 = p000.jx0.m3016(r3)
            if (r0 != 0) goto L25
            boolean r0 = p000.pu0.m4601(r3)
            if (r0 != 0) goto L25
            java.lang.String r3 = m5001(r3)
            r2.add(r3)
        L25:
            return
    }

    /* JADX INFO: renamed from: Φ */
    public static void m4960(android.content.Context r4) {
            java.lang.String r0 = "notification"
            java.lang.Object r4 = r4.getSystemService(r0)
            r4.getClass()
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            java.lang.String r0 = "dyhelper_download"
            android.app.NotificationChannel r1 = r4.getNotificationChannel(r0)
            if (r1 != 0) goto L27
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            java.lang.String r2 = "DY Helper 下载"
            r3 = 2
            r1.<init>(r0, r2, r3)
            java.lang.String r0 = "下载进度通知"
            r1.setDescription(r0)
            r0 = 0
            r1.setSound(r0, r0)
            r4.createNotificationChannel(r1)
        L27:
            return
    }

    /* JADX INFO: renamed from: Χ */
    public static java.lang.String m4961(long r5) {
            r0 = 1024(0x400, double:5.06E-321)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "B"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L18:
            r0 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 1
            java.lang.String r2 = "%.1f"
            if (r0 >= 0) goto L3d
            double r5 = (double) r5
            r3 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r5 = r5 / r3
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String r5 = java.lang.String.format(r2, r5)
            java.lang.String r6 = "KB"
            java.lang.String r5 = r5.concat(r6)
            return r5
        L3d:
            double r5 = (double) r5
            r3 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r5 = r5 / r3
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String r5 = java.lang.String.format(r2, r5)
            java.lang.String r6 = "MB"
            java.lang.String r5 = r5.concat(r6)
            return r5
    }

    /* JADX INFO: renamed from: Ψ */
    public static java.lang.String m4962(java.lang.String r2) {
            r2.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            java.lang.String r0 = ".jpg"
            r1 = 0
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = ".jpeg"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L1f
            goto Ld4
        L1f:
            java.lang.String r0 = ".png"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L29
            goto L95
        L29:
            java.lang.String r0 = ".webp"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L33
            goto La0
        L33:
            java.lang.String r0 = ".gif"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L3d
            goto Lab
        L3d:
            java.lang.String r0 = ".bmp"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L48
            java.lang.String r2 = "image/bmp"
            return r2
        L48:
            java.lang.String r0 = ".heic"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L51
            goto Lb6
        L51:
            java.lang.String r0 = ".heif"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L5a
            goto Lc1
        L5a:
            java.lang.String r0 = ".avif"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L63
            goto Lcc
        L63:
            java.lang.String r0 = ".vvic"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "format=vvic"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "image_type=vvic"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L7c
            goto Ld1
        L7c:
            java.lang.String r0 = "format=jpeg"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto Ld4
            java.lang.String r0 = "format=jpg"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L8d
            goto Ld4
        L8d:
            java.lang.String r0 = "format=png"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L98
        L95:
            java.lang.String r2 = "image/png"
            return r2
        L98:
            java.lang.String r0 = "format=webp"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto La3
        La0:
            java.lang.String r2 = "image/webp"
            return r2
        La3:
            java.lang.String r0 = "format=gif"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto Lae
        Lab:
            java.lang.String r2 = "image/gif"
            return r2
        Lae:
            java.lang.String r0 = "format=heic"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto Lb9
        Lb6:
            java.lang.String r2 = "image/heic"
            return r2
        Lb9:
            java.lang.String r0 = "format=heif"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto Lc4
        Lc1:
            java.lang.String r2 = "image/heif"
            return r2
        Lc4:
            java.lang.String r0 = "format=avif"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto Lcf
        Lcc:
            java.lang.String r2 = "image/avif"
            return r2
        Lcf:
            r2 = 0
            return r2
        Ld1:
            java.lang.String r2 = "image/vvic"
            return r2
        Ld4:
            java.lang.String r2 = "image/jpeg"
            return r2
    }

    /* JADX INFO: renamed from: Ω */
    public static java.util.List m4963(java.lang.Iterable r3) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            if (r3 == 0) goto L28
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m4964(r1)
            if (r1 == 0) goto Lb
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L24
            goto Lb
        L24:
            r0.add(r1)
            goto Lb
        L28:
            java.util.List r3 = p000.AbstractC0984xh.m6666(r0)
            return r3
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m4964(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto Lc
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r3 != 0) goto L11
            java.lang.String r3 = ""
        L11:
            java.lang.String r1 = "http"
            r2 = 1
            boolean r1 = p000.x02.m6485(r3, r1, r2)
            if (r1 == 0) goto L1b
            return r3
        L1b:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static boolean m4965(java.lang.String r7) {
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r2 = p000.qy0.f9161
            java.util.Set r3 = r2.entrySet()
            mc r4 = new mc
            r5 = 4
            r4.<init>(r5, r0)
            wi r5 = new wi
            r6 = 4
            r5.<init>(r4, r6)
            r3.removeIf(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r7 = r2.putIfAbsent(r7, r0)
            if (r7 != 0) goto L25
            r7 = 1
            return r7
        L25:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m4966(android.content.Context r2, p000.C0276f8 r3, java.lang.String r4) {
            java.util.Set r0 = p000.AbstractC0488ku.f6117
            java.lang.String r0 = "download_name_pattern"
            r1 = 0
            int r2 = m5010(r1, r2, r0)
            java.lang.String r2 = p000.AbstractC0488ku.m3414(r3, r4, r2)
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m4967(int r4, int r5, java.lang.String r6, java.lang.String r7) {
            java.util.Set r0 = p000.AbstractC0488ku.f6117
            r6.getClass()
            r7.getClass()
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 46
            r3 = 0
            r1[r3] = r2
            java.lang.String r7 = p000.q02.m4664(r7, r1)
            boolean r1 = p000.q02.m4671(r7)
            if (r1 == 0) goto L24
            java.lang.String r7 = "dat"
        L24:
            java.lang.String r6 = p000.AbstractC0488ku.m3417(r6)
            boolean r1 = p000.q02.m4671(r6)
            if (r1 == 0) goto L38
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = "dyhelper_"
            java.lang.String r6 = p000.AbstractC0602nx.m4126(r1, r6)
        L38:
            if (r5 > r0) goto L3b
            goto L42
        L3b:
            int r4 = r4 + r0
            java.lang.String r5 = "_img"
            java.lang.String r6 = p000.AbstractC0602nx.m4130(r6, r5, r4)
        L42:
            java.lang.String r4 = "."
            java.lang.String r4 = p000.lz1.m3688(r6, r4, r7)
            return r4
    }

    /* JADX INFO: renamed from: ε */
    public static java.util.List m4968(p000.C0276f8 r4) {
            lu r0 = m4998()
            r4.getClass()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.List r4 = r4.f3778
            if (r4 != 0) goto L12
            jz r4 = p000.C0450jz.f5672
        L12:
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = p000.kn0.m3343(r2, r0)
            if (r2 != 0) goto L29
            goto L16
        L29:
            java.lang.String r3 = p000.ln0.m3617(r2)
            r1.putIfAbsent(r3, r2)
            goto L16
        L31:
            java.util.Collection r4 = r1.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            return r4
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m4969(android.content.Context r2, p000.C0276f8 r3) {
            java.util.Set r0 = p000.AbstractC0488ku.f6117
            java.lang.String r0 = "download_name_pattern"
            r1 = 0
            int r2 = m5010(r1, r2, r0)
            r3.getClass()
            java.lang.String r0 = "mp4"
            java.lang.String r2 = p000.AbstractC0488ku.m3414(r3, r0, r2)
            java.lang.String r2 = p000.q02.m4692(r2)
            java.lang.String r3 = "_livephoto"
            java.lang.String r2 = r2.concat(r3)
            java.lang.String r2 = p000.AbstractC0488ku.m3417(r2)
            r3 = 100
            java.lang.String r2 = p000.q02.m4693(r2, r3)
            boolean r3 = p000.q02.m4671(r2)
            if (r3 == 0) goto L36
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "livephoto_"
            java.lang.String r2 = p000.AbstractC0602nx.m4126(r2, r0)
        L36:
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static java.util.List m4970(p000.C0276f8 r15) {
            lu r0 = m4998()
            r15.getClass()
            java.util.List r1 = r15.f3796
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto Le
            r1 = r2
        Le:
            java.util.List r3 = r15.f3786
            if (r3 != 0) goto L13
            r3 = r2
        L13:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r3.iterator()
            r6 = 0
            r7 = r6
        L1e:
            boolean r8 = r5.hasNext()
            java.lang.String r9 = ""
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r5.next()
            int r10 = r7 + 1
            r11 = 0
            if (r7 < 0) goto L66
            qu0 r8 = (p000.qu0) r8
            java.util.List r7 = p000.kn0.m3368(r8, r0)
            int r12 = r8.f9110
            boolean r13 = r7.isEmpty()
            if (r13 == 0) goto L3e
            goto L5f
        L3e:
            java.lang.Object r11 = p000.AbstractC0984xh.m6641(r12, r1)
            java.lang.String r11 = (java.lang.String) r11
            java.util.ArrayList r8 = p000.kn0.m3367(r8, r11, r0)
            r11 = 1
            java.util.List r8 = p000.AbstractC0984xh.m6662(r8, r11)
            ru0 r13 = new ru0
            int r14 = r3.size()
            if (r14 <= r11) goto L5b
            java.lang.String r9 = "_item"
            java.lang.String r9 = p000.a12.m17(r9, r10)
        L5b:
            r13.<init>(r12, r8, r7, r9)
            r11 = r13
        L5f:
            if (r11 == 0) goto L64
            r4.add(r11)
        L64:
            r7 = r10
            goto L1e
        L66:
            p000.AbstractC1021yh.m6917()
            throw r11
        L6a:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L71
            return r4
        L71:
            java.util.List r1 = p000.kn0.m3372(r15, r0)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L7c
            return r2
        L7c:
            ru0 r2 = new ru0
            java.util.ArrayList r15 = p000.kn0.m3369(r15, r0)
            r2.<init>(r6, r15, r1, r9)
            java.util.List r15 = p000.AbstractC1021yh.m6896(r2)
            return r15
    }

    /* JADX INFO: renamed from: θ */
    public static java.util.List m4971(p000.C0276f8 r4) {
            r4.getClass()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.String r1 = r4.m2046()
            if (r1 == 0) goto L11
            r0.add(r1)
        L11:
            java.lang.String r1 = r4.m2047()
            if (r1 == 0) goto L1a
            r0.add(r1)
        L1a:
            java.util.List r1 = r4.f3778
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto L21
            r1 = r2
        L21:
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
            goto L25
        L35:
            java.util.List r1 = r4.f3795
            if (r1 != 0) goto L3a
            r1 = r2
        L3a:
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
            goto L3e
        L4e:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.List r3 = r4.f3796
            if (r3 != 0) goto L58
            goto L59
        L58:
            r2 = r3
        L59:
            java.util.Iterator r2 = r2.iterator()
        L5d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            p000.kn0.m3371(r0, r1, r3)
            goto L5d
        L6d:
            java.lang.String r2 = r4.m2045()
            p000.kn0.m3371(r0, r1, r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L7f
            java.lang.String r4 = r4.f3783
            p000.kn0.m3371(r0, r1, r4)
        L7f:
            java.util.Collection r4 = r1.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            return r4
    }

    /* JADX INFO: renamed from: ι */
    public static final java.lang.String m4972(java.lang.String r1, java.lang.String r2) {
            boolean r0 = p000.q02.m4671(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.String r1 = p000.AbstractC0602nx.m4129(r2, r1)
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.String m4973(android.content.Context r1, p000.C0276f8 r2, p000.zy0 r3, java.lang.String r4, java.lang.String r5) {
            if (r5 == 0) goto Ld
            boolean r0 = p000.q02.m4671(r5)
            if (r0 != 0) goto L9
            goto La
        L9:
            r5 = 0
        La:
            if (r5 == 0) goto Ld
            goto L17
        Ld:
            java.lang.String r5 = "dat"
            java.lang.String r1 = m4966(r1, r2, r5)
            java.lang.String r5 = p000.q02.m4692(r1)
        L17:
            int r1 = r3.f13352
            int r1 = r1 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = "_"
            r2.append(r3)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = p000.AbstractC0488ku.m3417(r1)
            r2 = 100
            java.lang.String r1 = p000.q02.m4693(r1, r2)
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L58
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
        L58:
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public static java.util.ArrayList m4974(p000.C0276f8 r28) {
            r0 = r28
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.List r3 = r0.f3788
            java.util.List r11 = r0.f3786
            h8 r12 = r0.f3798
            jz r13 = p000.C0450jz.f5672
            if (r3 != 0) goto L17
            r3 = r13
        L17:
            uh0 r4 = new uh0
            r5 = 15
            r4.<init>(r5)
            java.util.List r3 = p000.AbstractC0984xh.m6658(r3, r4)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L4d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r3.iterator()
        L31:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L47
            java.lang.Object r6 = r5.next()
            g8 r6 = (p000.C0313g8) r6
            java.lang.String r6 = r6.m2268()
            if (r6 == 0) goto L31
            r4.add(r6)
            goto L31
        L47:
            java.util.List r4 = m4963(r4)
        L4b:
            r14 = r4
            goto L54
        L4d:
            java.util.List r4 = r0.f3796
            java.util.List r4 = m4963(r4)
            goto L4b
        L54:
            h8 r4 = p000.EnumC0350h8.f4617
            r16 = 1
            if (r12 == r4) goto L99
            boolean r4 = r0.m2051()
            if (r4 != 0) goto L99
            java.lang.Integer r4 = r0.f3779
            if (r4 != 0) goto L65
            goto L6d
        L65:
            int r4 = r4.intValue()
            r5 = 59
            if (r4 == r5) goto L99
        L6d:
            java.lang.String r4 = r0.f3780
            if (r4 == 0) goto L77
            boolean r4 = p000.q02.m4671(r4)
            if (r4 == 0) goto L99
        L77:
            java.lang.String r4 = r0.m2046()
            if (r4 == 0) goto L83
            boolean r4 = p000.q02.m4671(r4)
            if (r4 == 0) goto L99
        L83:
            java.lang.String r4 = r0.m2045()
            if (r4 == 0) goto L8f
            boolean r4 = p000.q02.m4671(r4)
            if (r4 == 0) goto L99
        L8f:
            if (r11 == 0) goto L97
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L99
        L97:
            r4 = 0
            goto L9b
        L99:
            r4 = r16
        L9b:
            boolean r5 = r3.isEmpty()
            az0 r17 = p000.az0.f1383
            az0 r18 = p000.az0.f1381
            az0 r19 = p000.az0.f1384
            java.lang.String r6 = " 页"
            java.lang.String r7 = "第 "
            if (r5 != 0) goto L1f5
            java.lang.String r5 = r0.f3800
            int r9 = r3.size()
            java.lang.String r10 = ", structuredPages="
            java.lang.String r8 = ", trustedLivePhoto="
            java.lang.String r15 = "buildSelectableMediaItems awemeId="
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4135(r9, r15, r5, r10, r8)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            m4953(r5)
            java.util.Iterator r15 = r3.iterator()
        Lc9:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L1f5
            java.lang.Object r3 = r15.next()
            g8 r3 = (p000.C0313g8) r3
            i8 r5 = r3.f4275
            if (r5 == 0) goto Ldc
            java.util.List r8 = r5.f4955
            goto Ldd
        Ldc:
            r8 = 0
        Ldd:
            if (r8 != 0) goto Le0
            r8 = r13
        Le0:
            if (r5 == 0) goto Le5
            java.util.List r5 = r5.f4957
            goto Le6
        Le5:
            r5 = 0
        Le6:
            if (r5 != 0) goto Le9
            r5 = r13
        Le9:
            java.util.ArrayList r5 = p000.AbstractC0984xh.m6651(r8, r5)
            i8 r8 = r3.f4275
            if (r8 == 0) goto Lf4
            java.util.List r8 = r8.f4956
            goto Lf5
        Lf4:
            r8 = 0
        Lf5:
            if (r8 != 0) goto Lf8
            r8 = r13
        Lf8:
            java.util.ArrayList r5 = p000.AbstractC0984xh.m6651(r5, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L105:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L11b
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = m4964(r9)
            if (r9 == 0) goto L105
            r8.add(r9)
            goto L105
        L11b:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L129:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L149
            java.lang.Object r9 = r8.next()
            r21 = r9
            java.lang.String r21 = (java.lang.String) r21
            r22 = r1
            java.lang.String r1 = m5004(r21)
            boolean r1 = r5.add(r1)
            if (r1 == 0) goto L146
            r10.add(r9)
        L146:
            r1 = r22
            goto L129
        L149:
            r22 = r1
            java.lang.String r1 = r3.m2268()
            java.lang.String r1 = m4964(r1)
            int r5 = r3.f4267
            if (r1 != 0) goto L15a
            java.lang.String r8 = "null"
            goto L15b
        L15a:
            r8 = r1
        L15b:
            int r9 = r10.size()
            r21 = r1
            java.lang.Integer r1 = r3.f4269
            r23 = r2
            java.lang.Integer r2 = r3.f4271
            r24 = r4
            java.lang.String r4 = ", still="
            r25 = r10
            java.lang.String r10 = ", videoCandidates="
            r26 = r11
            java.lang.String r11 = "selectable page="
            java.lang.StringBuilder r4 = p000.a12.m20(r5, r11, r4, r8, r10)
            r4.append(r9)
            java.lang.String r5 = ", clipType="
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = ", livePhotoType="
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            m4953(r1)
            boolean r1 = r25.isEmpty()
            if (r1 != 0) goto L1c4
            if (r24 == 0) goto L19c
            r1 = r19
            goto L19e
        L19c:
            r1 = r17
        L19e:
            int r4 = r3.f4267
            int r2 = r4 + 1
            java.lang.String r5 = p000.AbstractC0602nx.m4127(r7, r2, r6)
            java.lang.Object r2 = p000.AbstractC0984xh.m6640(r25)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r2 = r6
            java.lang.String r6 = "动图"
            r8 = r21
            r3 = r13
            r13 = r7
            r7 = r21
            r21 = r3
            r3 = r1
            r11 = r2
            r1 = r22
            r2 = r23
            r10 = r25
            m4975(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L1eb
        L1c4:
            r1 = r13
            r13 = r7
            r7 = r21
            r21 = r1
            r11 = r6
            r1 = r22
            r2 = r23
            if (r7 == 0) goto L1eb
            boolean r4 = p000.q02.m4671(r7)
            if (r4 == 0) goto L1d8
            goto L1eb
        L1d8:
            int r4 = r3.f4267
            int r3 = r4 + 1
            java.lang.String r5 = p000.AbstractC0602nx.m4127(r13, r3, r11)
            java.lang.String r6 = "图片"
            r9 = 0
            r8 = r7
            r3 = r18
            r10 = r21
            m4975(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L1eb:
            r6 = r11
            r7 = r13
            r13 = r21
            r4 = r24
            r11 = r26
            goto Lc9
        L1f5:
            r24 = r4
            r26 = r11
            r21 = r13
            r11 = r6
            r13 = r7
            if (r24 == 0) goto L23f
            if (r26 != 0) goto L203
            r26 = r21
        L203:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r26.iterator()
        L20c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L232
            java.lang.Object r5 = r4.next()
            r6 = r5
            qu0 r6 = (p000.qu0) r6
            java.lang.String r7 = r6.f9111
            if (r7 == 0) goto L223
            boolean r7 = p000.q02.m4671(r7)
            if (r7 == 0) goto L22e
        L223:
            java.util.List r6 = r6.f9114
            if (r6 == 0) goto L20c
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L22e
            goto L20c
        L22e:
            r3.add(r5)
            goto L20c
        L232:
            uh0 r4 = new uh0
            r5 = 16
            r4.<init>(r5)
            java.util.List r3 = p000.AbstractC0984xh.m6658(r3, r4)
            r15 = r3
            goto L241
        L23f:
            r15 = r21
        L241:
            boolean r3 = r15.isEmpty()
            if (r3 != 0) goto L3f3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r4 = r15.iterator()
        L250:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L277
            java.lang.Object r5 = r4.next()
            r6 = r5
            qu0 r6 = (p000.qu0) r6
            int r6 = r6.f9110
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r3.get(r6)
            if (r7 != 0) goto L271
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.put(r6, r7)
        L271:
            java.util.List r7 = (java.util.List) r7
            r7.add(r5)
            goto L250
        L277:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            int r5 = r3.size()
            int r5 = p000.ex0.m1970(r5)
            r4.<init>(r5)
            java.util.Set r3 = r3.entrySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L28e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L2ae
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = p000.AbstractC0984xh.m6638(r5)
            qu0 r5 = (p000.qu0) r5
            r4.put(r6, r5)
            goto L28e
        L2ae:
            java.util.Set r3 = r4.keySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Comparable r3 = p000.AbstractC0984xh.m6647(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L2c1
            int r3 = r3.intValue()
            goto L2c2
        L2c1:
            r3 = -1
        L2c2:
            int r5 = r14.size()
            int r3 = r3 + 1
            int r3 = java.lang.Math.max(r5, r3)
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r6 = 0
        L2d2:
            if (r6 >= r3) goto L384
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r4.get(r7)
            qu0 r7 = (p000.qu0) r7
            if (r7 == 0) goto L34a
            lu r8 = m4998()
            java.util.List r10 = p000.kn0.m3368(r7, r8)
            lu r8 = m4998()
            r9 = 0
            java.util.ArrayList r8 = p000.kn0.m3367(r7, r9, r8)
            java.lang.Object r8 = p000.AbstractC0984xh.m6640(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = m4964(r8)
            if (r8 != 0) goto L313
            java.lang.Object r8 = p000.AbstractC0984xh.m6641(r6, r14)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L313
            java.lang.String r8 = r7.f9113
            java.lang.String r8 = m4964(r8)
            if (r8 != 0) goto L313
            java.lang.String r7 = r7.f9112
            java.lang.String r8 = m4964(r7)
        L313:
            r7 = r8
            boolean r8 = r10.isEmpty()
            if (r8 != 0) goto L34a
            int r8 = r6 + 1
            java.lang.String r8 = p000.AbstractC0602nx.m4127(r13, r8, r11)
            java.lang.Object r9 = p000.AbstractC0984xh.m6640(r10)
            java.lang.String r9 = (java.lang.String) r9
            r22 = r4
            r4 = r6
            java.lang.String r6 = "动图"
            r23 = r5
            r5 = r8
            r8 = r7
            r27 = r19
            r19 = r3
            r3 = r27
            r27 = r23
            r23 = r15
            r15 = r27
            m4975(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r25 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r15.add(r3)
        L347:
            r3 = r18
            goto L375
        L34a:
            r22 = r4
            r4 = r6
            r23 = r15
            r25 = r19
            r19 = r3
            r15 = r5
            java.lang.Object r3 = p000.AbstractC0984xh.m6641(r4, r14)
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L347
            boolean r3 = p000.q02.m4671(r7)
            if (r3 == 0) goto L364
            goto L347
        L364:
            int r6 = r4 + 1
            java.lang.String r5 = p000.AbstractC0602nx.m4127(r13, r6, r11)
            java.lang.String r6 = "图片"
            r9 = 0
            r8 = r7
            r3 = r18
            r10 = r21
            m4975(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L375:
            int r6 = r4 + 1
            r18 = r3
            r5 = r15
            r3 = r19
            r4 = r22
            r15 = r23
            r19 = r25
            goto L2d2
        L384:
            r23 = r15
            r25 = r19
            r15 = r5
            java.util.Iterator r18 = r23.iterator()
        L38d:
            boolean r3 = r18.hasNext()
            if (r3 == 0) goto L3ef
            java.lang.Object r3 = r18.next()
            qu0 r3 = (p000.qu0) r3
            int r4 = r3.f9110
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r15.contains(r4)
            if (r4 != 0) goto L38d
            lu r4 = m4998()
            java.util.List r10 = p000.kn0.m3368(r3, r4)
            boolean r4 = r10.isEmpty()
            if (r4 != 0) goto L38d
            lu r4 = m4998()
            r9 = 0
            java.util.ArrayList r4 = p000.kn0.m3367(r3, r9, r4)
            java.lang.Object r4 = p000.AbstractC0984xh.m6640(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m4964(r4)
            if (r4 != 0) goto L3d6
            java.lang.String r4 = r3.f9113
            java.lang.String r4 = m4964(r4)
            if (r4 != 0) goto L3d6
            java.lang.String r4 = r3.f9112
            java.lang.String r4 = m4964(r4)
        L3d6:
            r7 = r4
            int r4 = r3.f9110
            int r3 = r4 + 1
            java.lang.String r5 = p000.AbstractC0602nx.m4127(r13, r3, r11)
            java.lang.Object r3 = p000.AbstractC0984xh.m6640(r10)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r6 = "动图"
            r8 = r7
            r3 = r25
            m4975(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L38d
        L3ef:
            r11 = r25
            goto L46b
        L3f3:
            r3 = r18
            r25 = r19
            java.util.Iterator r15 = r14.iterator()
            r4 = 0
        L3fc:
            boolean r5 = r15.hasNext()
            if (r5 == 0) goto L427
            java.lang.Object r5 = r15.next()
            int r6 = r4 + 1
            if (r4 < 0) goto L421
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r5 = p000.AbstractC0602nx.m4127(r13, r6, r11)
            r8 = r6
            java.lang.String r6 = "图片"
            r9 = 0
            r10 = r8
            r8 = r7
            r18 = r10
            r10 = r21
            m4975(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r4 = r18
            goto L3fc
        L421:
            p000.AbstractC1021yh.m6917()
            r20 = 0
            throw r20
        L427:
            if (r24 == 0) goto L3ef
            lu r3 = m4998()
            java.util.List r10 = p000.kn0.m3372(r0, r3)
            boolean r3 = r10.isEmpty()
            if (r3 != 0) goto L3ef
            java.lang.String r3 = p000.kn0.m3365(r0)
            java.lang.String r3 = m4964(r3)
            if (r3 != 0) goto L457
            java.lang.String r3 = r0.f3783
            java.lang.String r3 = m4964(r3)
            if (r3 != 0) goto L457
            java.lang.String r3 = r0.f3782
            java.lang.String r3 = m4964(r3)
            if (r3 != 0) goto L457
            java.lang.Object r3 = p000.AbstractC0984xh.m6640(r14)
            java.lang.String r3 = (java.lang.String) r3
        L457:
            r7 = r3
            java.lang.Object r3 = p000.AbstractC0984xh.m6640(r10)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            r4 = 0
            java.lang.String r5 = "动图"
            java.lang.String r6 = "动图"
            r8 = r7
            r3 = r25
            m4975(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11 = r3
        L46b:
            if (r24 == 0) goto L4f9
            java.util.List r3 = r0.f3778
            java.util.List r3 = m4963(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L47c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L493
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p000.jx0.m3022(r6)
            if (r6 != 0) goto L47c
            r4.add(r5)
            goto L47c
        L493:
            java.util.Iterator r13 = r4.iterator()
            r3 = 0
        L498:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L4f9
            java.lang.Object r4 = r13.next()
            int r15 = r3 + 1
            if (r3 < 0) goto L4f3
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            boolean r4 = p000.jx0.m3019(r9)
            if (r4 != 0) goto L4b8
            boolean r4 = p000.jx0.m3023(r9)
            if (r4 == 0) goto L4b6
            goto L4b8
        L4b6:
            r4 = 0
            goto L4ba
        L4b8:
            r4 = r16
        L4ba:
            if (r4 == 0) goto L4be
            r5 = r11
            goto L4c0
        L4be:
            r5 = r17
        L4c0:
            if (r4 == 0) goto L4d2
            java.lang.Object r4 = p000.AbstractC0984xh.m6641(r3, r14)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L4d0
            java.lang.Object r4 = p000.AbstractC0984xh.m6640(r14)
            java.lang.String r4 = (java.lang.String) r4
        L4d0:
            r7 = r4
            goto L4d3
        L4d2:
            r7 = r9
        L4d3:
            int r4 = r14.size()
            int r4 = r4 + r3
            java.lang.String r3 = "动图 "
            java.lang.String r3 = p000.a12.m17(r3, r15)
            if (r5 != r11) goto L4e2
            r8 = r7
            goto L4e3
        L4e2:
            r8 = 0
        L4e3:
            java.util.List r10 = p000.AbstractC1021yh.m6896(r9)
            java.lang.String r6 = "动图"
            r27 = r5
            r5 = r3
            r3 = r27
            m4975(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = r15
            goto L498
        L4f3:
            p000.AbstractC1021yh.m6917()
            r20 = 0
            throw r20
        L4f9:
            h8 r3 = p000.EnumC0350h8.f4615
            if (r12 != r3) goto L58f
            boolean r3 = r0.m2050()
            if (r3 != 0) goto L58f
            if (r24 != 0) goto L58f
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.lang.String r4 = r0.m2047()
            java.lang.String r4 = m4964(r4)
            if (r4 != 0) goto L515
            goto L51e
        L515:
            boolean r5 = p000.jx0.m3019(r4)
            if (r5 == 0) goto L51e
            r3.add(r4)
        L51e:
            java.util.List r13 = r0.f3795
            if (r13 != 0) goto L524
            r13 = r21
        L524:
            uh0 r0 = new uh0
            r4 = 17
            r0.<init>(r4)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r13, r0)
            java.util.Iterator r0 = r0.iterator()
        L533:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L550
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m4964(r4)
            if (r4 != 0) goto L546
            goto L533
        L546:
            boolean r5 = p000.jx0.m3019(r4)
            if (r5 == 0) goto L533
            r3.add(r4)
            goto L533
        L550:
            java.util.Iterator r10 = r3.iterator()
            r3 = 0
        L555:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L58f
            java.lang.Object r0 = r10.next()
            int r15 = r3 + 1
            if (r3 < 0) goto L589
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r3 != 0) goto L56c
            java.lang.String r0 = "视频"
        L56a:
            r4 = r0
            goto L573
        L56c:
            java.lang.String r0 = "视频 "
            java.lang.String r0 = p000.a12.m17(r0, r15)
            goto L56a
        L573:
            r7 = 0
            java.util.List r9 = p000.AbstractC1021yh.m6896(r8)
            r23 = r2
            az0 r2 = p000.az0.f1382
            java.lang.String r5 = "视频"
            r6 = 0
            r0 = r1
            r1 = r23
            m4975(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r1
            r1 = r0
            r3 = r15
            goto L555
        L589:
            p000.AbstractC1021yh.m6917()
            r20 = 0
            throw r20
        L58f:
            return r2
    }

    /* JADX INFO: renamed from: μ */
    public static final void m4975(java.util.LinkedHashSet r11, java.util.ArrayList r12, p000.az0 r13, int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.List r20) {
            java.lang.String r7 = m4964(r18)
            java.lang.String r0 = m4964(r17)
            if (r0 != 0) goto Lc
            r6 = r7
            goto Ld
        Lc:
            r6 = r0
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r20.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = m4964(r2)
            if (r2 == 0) goto L16
            r0.add(r2)
            goto L16
        L2c:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = m5004(r3)
            boolean r3 = r1.add(r3)
            if (r3 == 0) goto L3a
            r9.add(r2)
            goto L3a
        L55:
            java.lang.String r0 = m4964(r19)
            if (r0 != 0) goto L61
            java.lang.Object r0 = p000.AbstractC0984xh.m6640(r9)
            java.lang.String r0 = (java.lang.String) r0
        L61:
            r8 = r0
            int r0 = r13.ordinal()
            r1 = 1
            if (r0 == 0) goto L81
            if (r0 == r1) goto L76
            r2 = 2
            if (r0 == r2) goto L76
            r2 = 3
            if (r0 != r2) goto L72
            goto L76
        L72:
            p000.C1080.m7272()
            return
        L76:
            if (r8 != 0) goto L7f
            java.lang.Object r0 = p000.AbstractC0984xh.m6640(r9)
            java.lang.String r0 = (java.lang.String) r0
            goto L82
        L7f:
            r0 = r8
            goto L82
        L81:
            r0 = r7
        L82:
            if (r0 != 0) goto L85
            goto Lb2
        L85:
            az0 r2 = p000.az0.f1381
            if (r13 == r2) goto L90
            boolean r2 = p000.jx0.m3022(r0)
            if (r2 == 0) goto L90
            goto Lb2
        L90:
            java.lang.String r2 = r13.name()
            java.lang.String r0 = m5004(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "|"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            boolean r0 = r11.add(r0)
            if (r0 != 0) goto Lb3
        Lb2:
            return
        Lb3:
            java.util.Iterator r0 = r9.iterator()
        Lb7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Le1
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r13.name()
            java.lang.String r3 = m5004(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r2)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r11.add(r3)
            goto Lb7
        Le1:
            zy0 r0 = new zy0
            int r11 = r12.size()
            int r3 = r11 + 1
            r10 = 0
            r1 = r13
            r2 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.add(r0)
            return
    }

    /* JADX INFO: renamed from: ν */
    public static java.lang.String m4976(java.lang.String r4) {
            java.util.Set r0 = p000.AbstractC0488ku.f6117
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 46
            r0[r1] = r2
            java.lang.String r4 = p000.q02.m4664(r4, r0)
            boolean r0 = p000.q02.m4671(r4)
            if (r0 == 0) goto L1e
            java.lang.String r4 = "dat"
        L1e:
            java.lang.String r0 = "comment_emoji"
            java.lang.String r0 = p000.AbstractC0488ku.m3417(r0)
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L2c
            java.lang.String r0 = "dyhelper"
        L2c:
            java.lang.String r1 = p000.AbstractC0488ku.m3420()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "_"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            boolean r1 = p000.q02.m4655(r0, r2)
            if (r1 == 0) goto L4b
            return r0
        L4b:
            java.lang.String r1 = "."
            java.lang.String r4 = p000.lz1.m3688(r0, r1, r4)
            return r4
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.String m4977(byte[] r4, int r5) {
            r0 = 16
            int r5 = java.lang.Math.min(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        Lc:
            if (r1 >= r5) goto L32
            r2 = r4[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r3 = "%02X"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.append(r2)
            int r2 = r5 + (-1)
            if (r1 == r2) goto L2f
            java.lang.String r2 = " "
            r0.append(r2)
        L2f:
            int r1 = r1 + 1
            goto Lc
        L32:
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ο */
    public static java.lang.String m4978(byte[] r5, int r6) {
            r0 = 48
            int r6 = java.lang.Math.min(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        Lc:
            if (r1 >= r6) goto L41
            r2 = r5[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 32
            if (r3 > r2) goto L1b
            r4 = 127(0x7f, float:1.78E-43)
            if (r2 >= r4) goto L1b
            goto L23
        L1b:
            r4 = 128(0x80, float:1.8E-43)
            if (r4 > r2) goto L28
            r4 = 256(0x100, float:3.59E-43)
            if (r2 >= r4) goto L28
        L23:
            char r2 = (char) r2
            r0.append(r2)
            goto L3e
        L28:
            r4 = 10
            if (r2 == r4) goto L3b
            r4 = 13
            if (r2 == r4) goto L3b
            r4 = 9
            if (r2 != r4) goto L35
            goto L3b
        L35:
            r2 = 46
            r0.append(r2)
            goto L3e
        L3b:
            r0.append(r3)
        L3e:
            int r1 = r1 + 1
            goto Lc
        L41:
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: π */
    public static void m4979(p000.ky0 r1) {
            if (r1 != 0) goto L3
            return
        L3:
            java.io.BufferedInputStream r0 = r1.f6311     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
        L8:
            vx r1 = r1.f6310
            r1.m6283()
            return
    }

    /* JADX INFO: renamed from: ρ */
    public static void m4980(android.app.Activity r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, p000.a80 r10) {
            java.lang.String r0 = "download_confirm_filename"
            r1 = 0
            boolean r0 = m5009(r6, r0, r1)
            if (r0 != 0) goto L11
            java.lang.String r6 = m4981(r9, r9)
            r10.invoke(r6)
            return
        L11:
            v8 r0 = new v8
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r1.runOnUiThread(r0)
            return
    }

    /* JADX INFO: renamed from: σ */
    public static final java.lang.String m4981(java.lang.String r2, java.lang.String r3) {
            java.util.Set r0 = p000.AbstractC0488ku.f6117
            r2.getClass()
            if (r3 == 0) goto L10
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            goto L11
        L10:
            r3 = 0
        L11:
            java.lang.String r0 = ""
            if (r3 != 0) goto L16
            r3 = r0
        L16:
            boolean r1 = p000.q02.m4671(r3)
            if (r1 == 0) goto L24
            java.lang.CharSequence r3 = p000.q02.m4660(r2)
            java.lang.String r3 = r3.toString()
        L24:
            java.lang.String r3 = p000.AbstractC0488ku.m3418(r3)
            r1 = 46
            java.lang.String r0 = p000.q02.m4687(r3, r1, r0)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = p000.AbstractC0602nx.m4134(r1, r0, r1)
            java.util.Set r1 = p000.AbstractC0488ku.f6117
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L40
            java.lang.String r3 = p000.q02.m4691(r3, r3)
        L40:
            java.lang.String r3 = p000.AbstractC0488ku.m3417(r3)
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto L5f
            java.lang.String r2 = p000.AbstractC0488ku.m3417(r2)
            boolean r3 = p000.q02.m4671(r2)
            if (r3 == 0) goto L5e
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "dyhelper_"
            java.lang.String r2 = p000.AbstractC0602nx.m4126(r2, r0)
        L5e:
            return r2
        L5f:
            return r3
    }

    /* JADX INFO: renamed from: τ */
    public static void m4982(android.app.Activity r2, java.lang.String r3, p000.a80 r4) {
            java.lang.String r0 = "download_confirm_filename"
            r1 = 0
            boolean r0 = m5009(r2, r0, r1)
            if (r0 != 0) goto Ld
            r4.invoke(r3)
            return
        Ld:
            e9 r0 = new e9
            r1 = 18
            r0.<init>(r2, r3, r4, r1)
            r2.runOnUiThread(r0)
            return
    }

    /* JADX INFO: renamed from: υ */
    public static void m4983(java.io.BufferedInputStream r25, java.io.OutputStream r26, android.content.Context r27, int r28, java.lang.String r29, long r30, boolean r32, java.lang.String r33, p000.e80 r34, p000.e80 r35) {
            r1 = r26
            r0 = r27
            r2 = r28
            r3 = r33
            r4 = r34
            r5 = r35
            java.lang.String r6 = "notification"
            java.lang.Object r6 = r0.getSystemService(r6)
            r6.getClass()
            android.app.NotificationManager r6 = (android.app.NotificationManager) r6
            r7 = 8192(0x2000, float:1.148E-41)
            byte[] r7 = new byte[r7]
            r11 = 0
            r13 = 0
            r15 = 0
            r10 = r25
            r17 = 0
        L25:
            int r8 = r10.read(r7)     // Catch: java.lang.Throwable -> L7f
            r9 = -1
            if (r8 == r9) goto Le0
            r9 = 0
            r1.write(r7, r9, r8)     // Catch: java.lang.Throwable -> L7f
            long r9 = (long) r8     // Catch: java.lang.Throwable -> L7f
            long r11 = r11 + r9
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7f
            if (r32 == 0) goto L97
            long r21 = r8 - r13
            r23 = 500(0x1f4, double:2.47E-321)
            int r10 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r10 <= 0) goto L97
            x31 r10 = new x31     // Catch: java.lang.Throwable -> L7f
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L7f
            android.app.Notification r13 = r10.f12043     // Catch: java.lang.Throwable -> L7f
            r14 = 17301633(0x1080081, float:2.4979616E-38)
            r13.icon = r14     // Catch: java.lang.Throwable -> L7f
            java.lang.String r13 = "正在下载"
            java.lang.CharSequence r13 = p000.x31.m6513(r13)     // Catch: java.lang.Throwable -> L7f
            r10.f12034 = r13     // Catch: java.lang.Throwable -> L7f
            java.lang.CharSequence r13 = p000.x31.m6513(r29)     // Catch: java.lang.Throwable -> L7f
            r10.f12035 = r13     // Catch: java.lang.Throwable -> L7f
            r13 = 2
            r10.m6515(r13)     // Catch: java.lang.Throwable -> L7f
            r13 = 1
            r10.f12044 = r13     // Catch: java.lang.Throwable -> L7f
            int r13 = (r30 > r17 ? 1 : (r30 == r17 ? 0 : -1))
            if (r13 <= 0) goto L81
            r13 = 100
            r21 = r7
            r22 = r8
            long r7 = (long) r13     // Catch: java.lang.Throwable -> L7f
            long r7 = r7 * r11
            long r7 = r7 / r30
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L7f
            r8 = 0
            int r7 = p000.j81.m2906(r7, r8, r13)     // Catch: java.lang.Throwable -> L7f
            r10.f12037 = r13     // Catch: java.lang.Throwable -> L7f
            r10.f12038 = r7     // Catch: java.lang.Throwable -> L7f
            r10.f12039 = r8     // Catch: java.lang.Throwable -> L7f
            goto L8d
        L7c:
            r2 = r0
            goto L131
        L7f:
            r0 = move-exception
            goto L7c
        L81:
            r21 = r7
            r22 = r8
            r8 = 0
            r10.f12037 = r8     // Catch: java.lang.Throwable -> L7f
            r10.f12038 = r8     // Catch: java.lang.Throwable -> L7f
            r13 = 1
            r10.f12039 = r13     // Catch: java.lang.Throwable -> L7f
        L8d:
            android.app.Notification r7 = r10.m6514()     // Catch: java.lang.Throwable -> L7f
            r6.notify(r2, r7)     // Catch: java.lang.Throwable -> L7f
            r13 = r22
            goto L9b
        L97:
            r21 = r7
            r22 = r8
        L9b:
            if (r3 == 0) goto Lda
            long r8 = r22 - r15
            r19 = 800(0x320, double:3.953E-321)
            int r7 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r7 <= 0) goto Lda
            if (r4 == 0) goto Lb7
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L7f
            java.lang.Long r8 = java.lang.Long.valueOf(r30)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r7 = r4.invoke(r7, r8)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L7f
            if (r7 != 0) goto Lb9
        Lb7:
            r7 = r29
        Lb9:
            if (r5 == 0) goto Lce
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L7f
            java.lang.Long r9 = java.lang.Long.valueOf(r30)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r8 = r5.invoke(r8, r9)     // Catch: java.lang.Throwable -> L7f
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L7f
            int r9 = r8.intValue()     // Catch: java.lang.Throwable -> L7f
            goto Lcf
        Lce:
            r9 = -1
        Lcf:
            m4997(r9, r0, r3, r7)     // Catch: java.lang.Throwable -> L7f
            r10 = r25
            r7 = r21
            r15 = r22
            goto L25
        Lda:
            r10 = r25
            r7 = r21
            goto L25
        Le0:
            r1.flush()     // Catch: java.lang.Throwable -> L7f
            r1.close()
            int r1 = (r30 > r17 ? 1 : (r30 == r17 ? 0 : -1))
            if (r1 <= 0) goto L105
            int r1 = (r11 > r30 ? 1 : (r11 == r30 ? 0 : -1))
            if (r1 < 0) goto Lef
            goto L105
        Lef:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = m4961(r11)
            java.lang.String r2 = m4961(r30)
            java.lang.String r3 = "下载不完整: "
            java.lang.String r4 = "/"
            java.lang.String r1 = p000.a12.m18(r3, r1, r4, r2)
            r0.<init>(r1)
            throw r0
        L105:
            if (r32 == 0) goto L130
            x31 r1 = new x31
            r1.<init>(r0)
            r0 = 17301634(0x1080082, float:2.497962E-38)
            android.app.Notification r3 = r1.f12043
            r3.icon = r0
            java.lang.String r0 = "下载完成"
            java.lang.CharSequence r0 = p000.x31.m6513(r0)
            r1.f12034 = r0
            java.lang.CharSequence r0 = p000.x31.m6513(r29)
            r1.f12035 = r0
            r0 = 16
            r1.m6515(r0)
            r13 = 1
            r1.f12044 = r13
            android.app.Notification r0 = r1.m6514()
            r6.notify(r2, r0)
        L130:
            return
        L131:
            throw r2     // Catch: java.lang.Throwable -> L132
        L132:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r1, r2)
            throw r0
    }

    /* JADX INFO: renamed from: φ */
    public static void m4984(java.io.File r8, java.io.File r9) {
            boolean r0 = r8.exists()
            if (r0 == 0) goto L108
            long r0 = r8.length()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L108
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L31
            r0.setDataSource(r8)     // Catch: java.lang.Throwable -> L31
            r8 = 9
            java.lang.String r8 = r0.extractMetadata(r8)     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L34
            r1 = 10
            java.lang.Long r8 = p000.x02.m6489(r8, r1)     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L34
            long r4 = r8.longValue()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r8 = move-exception
            goto L104
        L34:
            r4 = r2
        L35:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L31
            r8.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            r8.add(r1)     // Catch: java.lang.Throwable -> L31
            r6 = 300000(0x493e0, double:1.482197E-318)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L31
            r8.add(r1)     // Catch: java.lang.Throwable -> L31
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L5c
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r6 = 2
            long r4 = r4 / r6
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L31
            r8.add(r1)     // Catch: java.lang.Throwable -> L31
        L5c:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L31
            r8.getClass()     // Catch: java.lang.Throwable -> L31
            r1 = 0
            r4 = r1
        L65:
            boolean r5 = r8.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto La6
            java.lang.Object r4 = r8.next()     // Catch: java.lang.Throwable -> L31
            r4.getClass()     // Catch: java.lang.Throwable -> L31
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L31
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L31
            r6 = 2
            android.graphics.Bitmap r6 = r0.getFrameAtTime(r4, r6)     // Catch: java.lang.Throwable -> L7e
            goto L85
        L7e:
            r6 = move-exception
            eo1 r7 = new eo1     // Catch: java.lang.Throwable -> L31
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r6 = r7
        L85:
            boolean r7 = r6 instanceof p000.eo1     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L8a
            r6 = r1
        L8a:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto La3
            r6 = 3
            android.graphics.Bitmap r4 = r0.getFrameAtTime(r4, r6)     // Catch: java.lang.Throwable -> L94
            goto L9b
        L94:
            r4 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L31
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L31
            r4 = r5
        L9b:
            boolean r5 = r4 instanceof p000.eo1     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto La0
            r4 = r1
        La0:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.lang.Throwable -> L31
            goto La4
        La3:
            r4 = r6
        La4:
            if (r4 == 0) goto L65
        La6:
            if (r4 == 0) goto Lfc
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le0
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Le0
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> Le2
            r5 = 95
            boolean r1 = r4.compress(r1, r5, r8)     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto Le4
            r8.flush()     // Catch: java.lang.Throwable -> Le2
            r8.close()     // Catch: java.lang.Throwable -> Le0
            boolean r8 = r4.isRecycled()     // Catch: java.lang.Throwable -> L31
            if (r8 != 0) goto Lc6
            r4.recycle()     // Catch: java.lang.Throwable -> L31
        Lc6:
            boolean r8 = r9.exists()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto Ld8
            long r8 = r9.length()     // Catch: java.lang.Throwable -> L31
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto Ld8
            r0.release()     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            return
        Ld8:
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = "视频首帧 JPEG 输出为空"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L31
            throw r8     // Catch: java.lang.Throwable -> L31
        Le0:
            r8 = move-exception
            goto Lf2
        Le2:
            r9 = move-exception
            goto Lec
        Le4:
            java.lang.Exception r9 = new java.lang.Exception     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = "视频首帧 JPEG 压缩失败"
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Le2
            throw r9     // Catch: java.lang.Throwable -> Le2
        Lec:
            throw r9     // Catch: java.lang.Throwable -> Led
        Led:
            r1 = move-exception
            p000.AbstractC0978xb.m6584(r8, r9)     // Catch: java.lang.Throwable -> Le0
            throw r1     // Catch: java.lang.Throwable -> Le0
        Lf2:
            boolean r9 = r4.isRecycled()     // Catch: java.lang.Throwable -> L31
            if (r9 != 0) goto Lfb
            r4.recycle()     // Catch: java.lang.Throwable -> L31
        Lfb:
            throw r8     // Catch: java.lang.Throwable -> L31
        Lfc:
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = "无法从视频中提取可用帧"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L31
            throw r8     // Catch: java.lang.Throwable -> L31
        L104:
            r0.release()     // Catch: java.lang.Throwable -> L107
        L107:
            throw r8
        L108:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "视频文件为空，无法提取首帧"
            r8.<init>(r9)
            throw r8
    }

    /* JADX INFO: renamed from: χ */
    public static android.net.Uri m4985(android.content.Context r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
            r1 = r21
            r2 = r25
            java.lang.String r3 = m5005(r24)
            java.lang.String r4 = p000.AbstractC0488ku.m3418(r23)
            cv r5 = p000.AbstractC0262ev.m1964(r22)
            if (r5 == 0) goto L15
            java.lang.String r0 = r5.f2777
            goto L17
        L15:
            r0 = r22
        L17:
            java.lang.String r6 = p000.AbstractC0262ev.m1963(r0)
            r7 = 10
            r8 = 1
            if (r5 == 0) goto Le2
            android.content.ContentResolver r0 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L4b
            java.util.List r0 = r0.getPersistedUriPermissions()     // Catch: java.lang.Throwable -> L4b
            r0.getClass()     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r10.<init>()     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4b
        L34:
            boolean r11 = r0.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L4d
            java.lang.Object r11 = r0.next()     // Catch: java.lang.Throwable -> L4b
            r12 = r11
            android.content.UriPermission r12 = (android.content.UriPermission) r12     // Catch: java.lang.Throwable -> L4b
            boolean r12 = r12.isWritePermission()     // Catch: java.lang.Throwable -> L4b
            if (r12 == 0) goto L34
            r10.add(r11)     // Catch: java.lang.Throwable -> L4b
            goto L34
        L4b:
            r0 = move-exception
            goto L77
        L4d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            int r11 = p000.AbstractC1021yh.m6889(r10, r7)     // Catch: java.lang.Throwable -> L4b
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L4b
        L5a:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L72
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L4b
            android.content.UriPermission r11 = (android.content.UriPermission) r11     // Catch: java.lang.Throwable -> L4b
            android.net.Uri r11 = r11.getUri()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L4b
            r0.add(r11)     // Catch: java.lang.Throwable -> L4b
            goto L5a
        L72:
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r0)     // Catch: java.lang.Throwable -> L4b
            goto L7d
        L77:
            eo1 r10 = new eo1
            r10.<init>(r0)
            r0 = r10
        L7d:
            boolean r10 = r0 instanceof p000.eo1
            if (r10 == 0) goto L83
            nz r0 = p000.C0604nz.f7825
        L83:
            java.util.Set r0 = (java.util.Set) r0
            java.util.List r10 = p000.qy0.f9158
            f7 r10 = p000.AbstractC0984xh.m6661(r10)
            kv0 r11 = new kv0
            r11.<init>(r1, r8)
            y30 r10 = p000.us1.m5943(r10, r11)
            θ r11 = new θ
            r12 = 26
            r11.<init>(r12, r0)
            y30 r0 = new y30
            r0.<init>(r10, r8, r11)
            cu r0 = p000.us1.m5952(r0)
            θ r10 = new θ
            r11 = 27
            r10.<init>(r11, r5)
            y30 r0 = p000.us1.m5943(r0, r10)
            x30 r10 = new x30
            r10.<init>(r0)
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto Lbc
            r0 = 0
            goto Ldf
        Lbc:
            java.lang.Object r0 = r10.next()
            boolean r11 = r10.hasNext()
            if (r11 != 0) goto Lc7
            goto Ldf
        Lc7:
            r11 = r0
            ly0 r11 = (p000.ly0) r11
            int r11 = r11.f6841
        Lcc:
            java.lang.Object r12 = r10.next()
            r13 = r12
            ly0 r13 = (p000.ly0) r13
            int r13 = r13.f6841
            if (r11 >= r13) goto Ld9
            r0 = r12
            r11 = r13
        Ld9:
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto Lcc
        Ldf:
            ly0 r0 = (p000.ly0) r0
            goto Le3
        Le2:
            r0 = 0
        Le3:
            if (r0 == 0) goto Led
            android.net.Uri r10 = r0.f6839
            java.lang.String r10 = r10.toString()
            if (r10 != 0) goto Lfb
        Led:
            if (r5 != 0) goto Lfa
            android.net.Uri r10 = p000.AbstractC1021yh.m6864(r1)
            if (r10 == 0) goto Lfa
            java.lang.String r10 = r10.toString()
            goto Lfb
        Lfa:
            r10 = 0
        Lfb:
            java.lang.String r11 = "_display_name"
            java.lang.String r12 = ", mime="
            java.lang.String r13 = "DYHelper"
            java.lang.String r14 = "/"
            if (r10 == 0) goto L10b
            boolean r15 = p000.q02.m4671(r10)
            if (r15 == 0) goto L10f
        L10b:
            r24 = r6
            goto L271
        L10f:
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L126
            cw1 r10 = p000.cw1.m1627(r1, r10)     // Catch: java.lang.Throwable -> L126
            boolean r15 = r10.m1628()     // Catch: java.lang.Throwable -> L126
            if (r15 == 0) goto L24f
            dv r15 = p000.AbstractC0262ev.m1965(r6)     // Catch: java.lang.Throwable -> L126
            if (r0 == 0) goto L12b
            java.lang.String r15 = r0.f6840     // Catch: java.lang.Throwable -> L126
            goto L147
        L126:
            r0 = move-exception
            r24 = r6
            goto L259
        L12b:
            if (r15 == 0) goto L146
            java.lang.Object r9 = r10.f2789     // Catch: java.lang.Throwable -> L126
            android.content.Context r9 = (android.content.Context) r9     // Catch: java.lang.Throwable -> L126
            java.lang.Object r7 = r10.f2790     // Catch: java.lang.Throwable -> L126
            android.net.Uri r7 = (android.net.Uri) r7     // Catch: java.lang.Throwable -> L126
            java.lang.String r7 = p000.AbstractC0073bd.m858(r9, r7, r11)     // Catch: java.lang.Throwable -> L126
            if (r7 == 0) goto L146
            java.lang.String r9 = r15.f3298     // Catch: java.lang.Throwable -> L126
            boolean r7 = r7.equalsIgnoreCase(r9)     // Catch: java.lang.Throwable -> L126
            if (r7 != r8) goto L146
            java.lang.String r15 = r15.f3299     // Catch: java.lang.Throwable -> L126
            goto L147
        L146:
            r15 = r6
        L147:
            if (r0 == 0) goto L14e
            java.lang.String r0 = p000.AbstractC0262ev.m1963(r15)     // Catch: java.lang.Throwable -> L126
            goto L152
        L14e:
            java.lang.String r0 = m5003(r10, r15)     // Catch: java.lang.Throwable -> L126
        L152:
            boolean r7 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L126
            if (r7 != 0) goto L205
            java.lang.String[] r7 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L126
            r9 = 6
            java.util.List r7 = p000.q02.m4683(r0, r7, r9)     // Catch: java.lang.Throwable -> L126
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L126
            r15 = 10
            int r15 = p000.AbstractC1021yh.m6889(r7, r15)     // Catch: java.lang.Throwable -> L126
            r9.<init>(r15)     // Catch: java.lang.Throwable -> L126
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L126
        L170:
            boolean r15 = r7.hasNext()     // Catch: java.lang.Throwable -> L126
            if (r15 == 0) goto L184
            java.lang.Object r15 = r7.next()     // Catch: java.lang.Throwable -> L126
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L126
            java.lang.String r15 = p000.AbstractC0488ku.m3416(r15)     // Catch: java.lang.Throwable -> L126
            r9.add(r15)     // Catch: java.lang.Throwable -> L126
            goto L170
        L184:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L126
            r7.<init>()     // Catch: java.lang.Throwable -> L126
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L126
        L18d:
            boolean r15 = r9.hasNext()     // Catch: java.lang.Throwable -> L126
            if (r15 == 0) goto L1a5
            java.lang.Object r15 = r9.next()     // Catch: java.lang.Throwable -> L126
            r16 = r15
            java.lang.String r16 = (java.lang.String) r16     // Catch: java.lang.Throwable -> L126
            boolean r16 = p000.q02.m4671(r16)     // Catch: java.lang.Throwable -> L126
            if (r16 != 0) goto L18d
            r7.add(r15)     // Catch: java.lang.Throwable -> L126
            goto L18d
        L1a5:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L126
        L1a9:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L126
            if (r9 == 0) goto L205
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L126
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L126
            cw1 r15 = r10.m1629(r9)     // Catch: java.lang.Throwable -> L126
            if (r15 == 0) goto L1c5
            boolean r16 = r15.m1631()     // Catch: java.lang.Throwable -> L126
            if (r16 == 0) goto L1c5
            r24 = r6
            r10 = r15
            goto L1e8
        L1c5:
            java.lang.Object r15 = r10.f2789     // Catch: java.lang.Throwable -> L126
            android.content.Context r15 = (android.content.Context) r15     // Catch: java.lang.Throwable -> L126
            java.lang.Object r10 = r10.f2790     // Catch: java.lang.Throwable -> L126
            android.net.Uri r10 = (android.net.Uri) r10     // Catch: java.lang.Throwable -> L126
            java.lang.String r8 = "vnd.android.document/directory"
            r24 = r6
            android.content.ContentResolver r6 = r15.getContentResolver()     // Catch: java.lang.Exception -> L1da java.lang.Throwable -> L203
            android.net.Uri r6 = android.provider.DocumentsContract.createDocument(r6, r10, r8, r9)     // Catch: java.lang.Exception -> L1da java.lang.Throwable -> L203
            goto L1db
        L1da:
            r6 = 0
        L1db:
            if (r6 == 0) goto L1e4
            cw1 r8 = new cw1     // Catch: java.lang.Throwable -> L203
            r10 = 1
            r8.<init>(r15, r10, r6)     // Catch: java.lang.Throwable -> L203
            goto L1e5
        L1e4:
            r8 = 0
        L1e5:
            if (r8 == 0) goto L1ec
            r10 = r8
        L1e8:
            r6 = r24
            r8 = 1
            goto L1a9
        L1ec:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L203
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L203
            r6.<init>()     // Catch: java.lang.Throwable -> L203
            java.lang.String r7 = "无法在授权目录创建子目录: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L203
            r6.append(r9)     // Catch: java.lang.Throwable -> L203
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L203
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L203
            throw r0     // Catch: java.lang.Throwable -> L203
        L203:
            r0 = move-exception
            goto L259
        L205:
            r24 = r6
            java.lang.Object r6 = r10.f2789     // Catch: java.lang.Throwable -> L203
            android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Throwable -> L203
            java.lang.Object r7 = r10.f2790     // Catch: java.lang.Throwable -> L203
            android.net.Uri r7 = (android.net.Uri) r7     // Catch: java.lang.Throwable -> L203
            android.content.ContentResolver r8 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L203 java.lang.Exception -> L218
            android.net.Uri r7 = android.provider.DocumentsContract.createDocument(r8, r7, r3, r4)     // Catch: java.lang.Throwable -> L203 java.lang.Exception -> L218
            goto L219
        L218:
            r7 = 0
        L219:
            if (r7 == 0) goto L222
            cw1 r8 = new cw1     // Catch: java.lang.Throwable -> L203
            r10 = 1
            r8.<init>(r6, r10, r7)     // Catch: java.lang.Throwable -> L203
            goto L223
        L222:
            r8 = 0
        L223:
            if (r8 == 0) goto L251
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L203
            r6.<init>()     // Catch: java.lang.Throwable -> L203
            java.lang.String r7 = "[SAF] name="
            r6.append(r7)     // Catch: java.lang.Throwable -> L203
            r6.append(r4)     // Catch: java.lang.Throwable -> L203
            r6.append(r12)     // Catch: java.lang.Throwable -> L203
            r6.append(r3)     // Catch: java.lang.Throwable -> L203
            java.lang.String r7 = ", subDir="
            r6.append(r7)     // Catch: java.lang.Throwable -> L203
            r6.append(r0)     // Catch: java.lang.Throwable -> L203
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L203
            p000.C0888ux.m5975(r13, r0)     // Catch: java.lang.Throwable -> L203
            java.lang.Object r0 = r8.f2790     // Catch: java.lang.Throwable -> L203
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.Throwable -> L203
            r0.getClass()     // Catch: java.lang.Throwable -> L203
            return r0
        L24f:
            r24 = r6
        L251:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L203
            java.lang.String r6 = "授权目录不可写或无法创建文件"
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L203
            throw r0     // Catch: java.lang.Throwable -> L203
        L259:
            if (r5 != 0) goto L261
            java.lang.String r6 = "SAF 创建文件失败，改用当前用户空间 MediaStore"
            p000.C0888ux.m5977(r13, r6, r0)
            goto L271
        L261:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "模板目录授权已失效，请在下载路径设置中重新选择目录: "
            java.lang.String r2 = p000.lz1.m3687(r3, r2)
            r1.<init>(r2, r0)
            throw r1
        L271:
            dv r0 = p000.AbstractC0262ev.m1965(r24)
            if (r5 == 0) goto L2ec
            java.lang.String r6 = r5.f2776
            java.lang.String r7 = r5.f2777
            java.lang.String r5 = r5.f2775
            java.lang.String r8 = "primary"
            boolean r5 = p000.x02.m6480(r5, r8)
            if (r5 == 0) goto L287
            if (r0 != 0) goto L2ec
        L287:
            boolean r0 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L293
            if (r0 == 0) goto L295
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L293
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L293
            goto L29a
        L293:
            r0 = move-exception
            goto L2cc
        L295:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L293
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L293
        L29a:
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L293
            if (r1 != 0) goto L2a8
            boolean r1 = r0.mkdirs()     // Catch: java.lang.Throwable -> L293
            if (r1 != 0) goto L2a8
        L2a6:
            r9 = 0
            goto L2db
        L2a8:
            boolean r1 = r0.isDirectory()     // Catch: java.lang.Throwable -> L293
            if (r1 == 0) goto L2a6
            boolean r1 = r0.canWrite()     // Catch: java.lang.Throwable -> L293
            if (r1 != 0) goto L2b5
            goto L2a6
        L2b5:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L293
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L293
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L293
            if (r0 != 0) goto L2c7
            boolean r0 = r1.createNewFile()     // Catch: java.lang.Throwable -> L293
            if (r0 != 0) goto L2c7
            goto L2a6
        L2c7:
            android.net.Uri r0 = android.net.Uri.fromFile(r1)     // Catch: java.lang.Throwable -> L293
            goto L2d2
        L2cc:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L2d2:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L2d8
            r9 = 0
            goto L2d9
        L2d8:
            r9 = r0
        L2d9:
            android.net.Uri r9 = (android.net.Uri) r9
        L2db:
            if (r9 == 0) goto L2de
            return r9
        L2de:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "路径 "
            java.lang.String r2 = " 需要在下载路径设置中点击“选择目录”完成授权"
            java.lang.String r1 = p000.lz1.m3689(r1, r6, r14, r7, r2)
            r0.<init>(r1)
            throw r0
        L2ec:
            java.lang.String r5 = "download_path"
            java.lang.String r5 = m5011(r1, r5, r13)
            if (r5 != 0) goto L2f5
            r5 = r13
        L2f5:
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            r10 = 1
            char[] r6 = new char[r10]
            r7 = 0
            r8 = 47
            r6[r7] = r8
            java.lang.String r5 = p000.q02.m4664(r5, r6)
            char[] r6 = new char[r10]
            r6[r7] = r8
            java.lang.String r5 = p000.q02.m4663(r5, r6)
            boolean r6 = p000.q02.m4671(r5)
            if (r6 == 0) goto L31f
            l91 r5 = new l91
            r6 = 0
            r5.<init>(r2, r6)
            goto L390
        L31f:
            java.lang.String r15 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.lang.String r16 = android.os.Environment.DIRECTORY_MOVIES
            java.lang.String r17 = android.os.Environment.DIRECTORY_PICTURES
            java.lang.String r18 = android.os.Environment.DIRECTORY_DCIM
            java.lang.String r19 = android.os.Environment.DIRECTORY_MUSIC
            java.lang.String r20 = android.os.Environment.DIRECTORY_DOCUMENTS
            java.lang.String[] r6 = new java.lang.String[]{r15, r16, r17, r18, r19, r20}
            java.util.List r6 = p000.AbstractC1021yh.m6897(r6)
            java.util.Iterator r6 = r6.iterator()
        L337:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L38a
            java.lang.Object r9 = r6.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = r5.equalsIgnoreCase(r9)
            if (r10 == 0) goto L350
            l91 r5 = new l91
            r6 = 0
            r5.<init>(r9, r6)
            goto L390
        L350:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r15 = 1
            boolean r10 = p000.x02.m6485(r5, r10, r15)
            if (r10 == 0) goto L337
            int r2 = r9.length()
            int r2 = r2 + r15
            java.lang.String r2 = r5.substring(r2)
            char[] r5 = new char[r15]
            r5[r7] = r8
            java.lang.String r2 = p000.q02.m4661(r2, r5)
            boolean r5 = p000.q02.m4671(r2)
            if (r5 != 0) goto L383
            l91 r5 = new l91
            r5.<init>(r9, r2)
            goto L390
        L383:
            l91 r5 = new l91
            r10 = 0
            r5.<init>(r9, r10)
            goto L390
        L38a:
            l91 r6 = new l91
            r6.<init>(r2, r5)
            r5 = r6
        L390:
            if (r0 == 0) goto L395
            java.lang.String r2 = r0.f3298
            goto L399
        L395:
            java.lang.Object r2 = r5.f6502
            java.lang.String r2 = (java.lang.String) r2
        L399:
            if (r0 == 0) goto L3a2
            java.lang.String r0 = r0.f3299
            java.lang.String r0 = p000.AbstractC0262ev.m1963(r0)
            goto L3c1
        L3a2:
            java.lang.Object r0 = r5.f6503
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = p000.AbstractC0262ev.m1963(r0)
            java.lang.String r5 = p000.AbstractC0262ev.m1963(r24)
            boolean r6 = p000.q02.m4671(r0)
            if (r6 == 0) goto L3b6
            r0 = r5
            goto L3c1
        L3b6:
            boolean r6 = p000.q02.m4671(r5)
            if (r6 == 0) goto L3bd
            goto L3c1
        L3bd:
            java.lang.String r0 = p000.lz1.m3688(r0, r14, r5)
        L3c1:
            java.lang.String r5 = android.os.Environment.DIRECTORY_MOVIES
            boolean r5 = p000.ln0.m3626(r2, r5)
            if (r5 == 0) goto L3d0
            android.net.Uri r5 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r5.getClass()
            goto L43b
        L3d0:
            java.lang.String r5 = android.os.Environment.DIRECTORY_PICTURES
            boolean r5 = p000.ln0.m3626(r2, r5)
            if (r5 == 0) goto L3de
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r5.getClass()
            goto L43b
        L3de:
            java.lang.String r5 = android.os.Environment.DIRECTORY_DCIM
            boolean r5 = p000.ln0.m3626(r2, r5)
            if (r5 == 0) goto L3ec
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r5.getClass()
            goto L43b
        L3ec:
            java.lang.String r5 = android.os.Environment.DIRECTORY_MUSIC
            boolean r5 = p000.ln0.m3626(r2, r5)
            if (r5 == 0) goto L3fa
            android.net.Uri r5 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            r5.getClass()
            goto L43b
        L3fa:
            java.lang.String r5 = android.os.Environment.DIRECTORY_DOWNLOADS
            boolean r5 = p000.ln0.m3626(r2, r5)
            if (r5 == 0) goto L408
            android.net.Uri r5 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI
            r5.getClass()
            goto L43b
        L408:
            java.lang.String r5 = android.os.Environment.DIRECTORY_DOCUMENTS
            boolean r5 = p000.ln0.m3626(r2, r5)
            if (r5 == 0) goto L416
            android.net.Uri r5 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI
            r5.getClass()
            goto L43b
        L416:
            java.lang.String r5 = m5005(r3)
            java.lang.String r6 = "video"
            boolean r6 = p000.x02.m6485(r5, r6, r7)
            if (r6 == 0) goto L428
            android.net.Uri r5 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r5.getClass()
            goto L43b
        L428:
            java.lang.String r6 = "image"
            boolean r5 = p000.x02.m6485(r5, r6, r7)
            if (r5 == 0) goto L436
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r5.getClass()
            goto L43b
        L436:
            android.net.Uri r5 = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI
            r5.getClass()
        L43b:
            boolean r6 = p000.q02.m4671(r0)
            if (r6 == 0) goto L442
            goto L446
        L442:
            java.lang.String r2 = p000.lz1.m3688(r2, r14, r0)
        L446:
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r0.put(r11, r4)
            java.lang.String r6 = "mime_type"
            r0.put(r6, r3)
            java.lang.String r6 = "relative_path"
            r0.put(r6, r2)
            java.lang.String r6 = "is_pending"
            r10 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r0.put(r6, r7)
            java.lang.String r6 = "[MediaStore] name="
            java.lang.String r7 = ", path="
            java.lang.StringBuilder r3 = p000.lz1.m3695(r6, r4, r12, r3, r7)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            p000.C0888ux.m5975(r13, r3)
            android.content.ContentResolver r1 = r1.getContentResolver()
            android.net.Uri r0 = r1.insert(r5, r0)
            if (r0 == 0) goto L47f
            return r0
        L47f:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "MediaStore 插入失败: path="
            java.lang.String r1 = p000.lz1.m3687(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ψ */
    public static android.graphics.Bitmap m4986(p000.qy0 r1, byte[] r2) {
            int r1 = r2.length
            if (r1 == 0) goto L14
            int r1 = r2.length
            r0 = 0
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1)
            if (r1 == 0) goto Lc
            return r1
        Lc:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "BitmapFactory 解码失败"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "图片内容为空"
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ω */
    public static void m4987(android.content.Context r2, android.net.Uri r3) {
            if (r3 != 0) goto L3
            goto L26
        L3:
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = p000.x02.m6480(r0, r1)
            if (r0 == 0) goto L1e
            java.lang.String r2 = r3.getPath()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L26
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L26
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L26
            r3.delete()     // Catch: java.lang.Throwable -> L26
            return
        L1e:
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L26
            r0 = 0
            r2.delete(r3, r0, r0)     // Catch: java.lang.Throwable -> L26
        L26:
            return
    }

    /* JADX INFO: renamed from: А */
    public static boolean m4988(android.content.Context r2) {
            java.lang.String r0 = "download_show_notification"
            r1 = 0
            boolean r2 = m5009(r2, r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: Б */
    public static void m4989(p000.C0276f8 r1, android.app.Activity r2) {
            r2.getClass()
            r1.getClass()
            zk0 r0 = new zk0
            r0.<init>(r1, r2)
            r2.runOnUiThread(r0)
            return
    }

    /* JADX INFO: renamed from: В */
    public static java.util.List m4990(p000.C0276f8 r7) {
            java.util.List r0 = r7.f3788
            if (r0 != 0) goto L6
            jz r0 = p000.C0450jz.f5672
        L6:
            uh0 r1 = new uh0
            r2 = 21
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            g8 r2 = (p000.C0313g8) r2
            java.lang.String r2 = r2.m2268()
            if (r2 == 0) goto L37
            java.lang.String r4 = "http"
            r5 = 1
            boolean r4 = p000.x02.m6485(r2, r4, r5)
            if (r4 == 0) goto L37
            r3 = r2
        L37:
            if (r3 == 0) goto L1a
            r1.add(r3)
            goto L1a
        L3d:
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r1)
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L4c
            return r3
        L4c:
            java.lang.String r1 = r7.f3800
            java.util.List r2 = r7.f3788
            r3 = 0
            if (r2 == 0) goto L58
            int r2 = r2.size()
            goto L59
        L58:
            r2 = r3
        L59:
            java.util.List r7 = r7.f3796
            if (r7 == 0) goto L61
            int r3 = r7.size()
        L61:
            int r7 = r0.size()
            java.lang.String r4 = ", pageMediaItems="
            java.lang.String r5 = ", rawImages="
            java.lang.String r6 = "structured image override awemeId="
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4135(r2, r6, r1, r4, r5)
            r1.append(r3)
            java.lang.String r2 = ", selectedImages="
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            m4953(r7)
            return r0
    }

    /* JADX INFO: renamed from: Г */
    public static void m4991(android.app.Activity r1, java.lang.String r2) {
            r0 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r0)
            r1.show()
            return
    }

    /* JADX INFO: renamed from: Д */
    public static java.lang.String m4992(java.lang.String r2) {
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto L10
            java.lang.String r2 = "default"
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "download:"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: Е */
    public static void m4993(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            java.lang.String r0 = "download_show_top_notification"
            r1 = 1
            boolean r0 = m5009(r9, r0, r1)
            if (r0 != 0) goto La
            goto L1f
        La:
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694     // Catch: java.lang.Throwable -> L35
            java.lang.String r12 = m4992(r12)     // Catch: java.lang.Throwable -> L35
            r9.getClass()     // Catch: java.lang.Throwable -> L35
            boolean r0 = r9 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L1b
            android.app.Activity r9 = (android.app.Activity) r9     // Catch: java.lang.Throwable -> L35
        L19:
            r6 = r9
            goto L1d
        L1b:
            r9 = 0
            goto L19
        L1d:
            if (r6 != 0) goto L20
        L1f:
            return
        L20:
            java.lang.String r1 = com.example.dyhelper.p002ui.C0182.m1593(r12)     // Catch: java.lang.Throwable -> L35
            f52 r5 = p000.f52.f3754     // Catch: java.lang.Throwable -> L35
            d52 r0 = new d52     // Catch: java.lang.Throwable -> L35
            r4 = 100
            r7 = 1600(0x640, double:7.905E-321)
            r2 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L35
            com.example.dyhelper.p002ui.C0182.m1597(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r0 = move-exception
            r9 = r0
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "DYHelper: 顶部通知 complete 失败: "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            p000.C0888ux.m5974(r9)
            return
    }

    /* JADX INFO: renamed from: Ж */
    public static void m4994(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
            java.lang.String r0 = "download_show_top_notification"
            r1 = 1
            boolean r0 = m5009(r9, r0, r1)
            if (r0 != 0) goto La
            goto L26
        La:
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694     // Catch: java.lang.Throwable -> L42
            java.lang.String r11 = m4992(r11)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "下载失败"
            java.lang.String r0 = "请稍后重试"
            if (r10 != 0) goto L17
            r10 = r0
        L17:
            r9.getClass()     // Catch: java.lang.Throwable -> L42
            boolean r1 = r9 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L22
            android.app.Activity r9 = (android.app.Activity) r9     // Catch: java.lang.Throwable -> L42
        L20:
            r6 = r9
            goto L24
        L22:
            r9 = 0
            goto L20
        L24:
            if (r6 != 0) goto L27
        L26:
            return
        L27:
            java.lang.String r1 = com.example.dyhelper.p002ui.C0182.m1593(r11)     // Catch: java.lang.Throwable -> L42
            boolean r9 = p000.q02.m4671(r10)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L33
            r3 = r0
            goto L34
        L33:
            r3 = r10
        L34:
            f52 r5 = p000.f52.f3755     // Catch: java.lang.Throwable -> L42
            d52 r0 = new d52     // Catch: java.lang.Throwable -> L42
            r4 = -1
            r7 = 2200(0x898, double:1.087E-320)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L42
            com.example.dyhelper.p002ui.C0182.m1597(r0)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r0 = move-exception
            r9 = r0
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "DYHelper: 顶部通知 error 失败: "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            p000.C0888ux.m5974(r9)
            return
    }

    /* JADX INFO: renamed from: а */
    public static boolean m4995(java.lang.String r1) {
            java.lang.String r0 = ";"
            java.lang.String r1 = p000.q02.m4690(r1, r0, r1)
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1487394660: goto L4c;
                case -1487018032: goto L43;
                case -879272239: goto L3a;
                case -879267568: goto L31;
                case -879264467: goto L28;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L54
        L1f:
            java.lang.String r0 = "image/png"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L56
            goto L54
        L28:
            java.lang.String r0 = "image/jpg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L56
            goto L54
        L31:
            java.lang.String r0 = "image/gif"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L56
            goto L54
        L3a:
            java.lang.String r0 = "image/bmp"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L56
            goto L54
        L43:
            java.lang.String r0 = "image/webp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L54
            goto L56
        L4c:
            java.lang.String r0 = "image/jpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L56
        L54:
            r1 = 0
            return r1
        L56:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: б */
    public static void m4996(android.content.Context r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = "download_show_top_notification"
            r1 = 1
            boolean r0 = m5009(r7, r0, r1)
            if (r0 != 0) goto La
            goto L2c
        La:
            boolean r0 = r7 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L12
            android.app.Activity r7 = (android.app.Activity) r7     // Catch: java.lang.Throwable -> L2d
        L10:
            r5 = r7
            goto L14
        L12:
            r7 = 0
            goto L10
        L14:
            if (r5 == 0) goto L2c
            android.os.Handler r7 = com.example.dyhelper.p002ui.C0182.f2694     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = m4992(r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = com.example.dyhelper.p002ui.C0182.m1593(r7)     // Catch: java.lang.Throwable -> L2d
            by0 r0 = new by0     // Catch: java.lang.Throwable -> L2d
            r4 = -1
            r6 = 1
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            com.example.dyhelper.p002ui.C0182.m1597(r0)     // Catch: java.lang.Throwable -> L2d
        L2c:
            return
        L2d:
            r0 = move-exception
            r7 = r0
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "DYHelper: 顶部通知 show 失败: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            p000.C0888ux.m5974(r7)
            return
    }

    /* JADX INFO: renamed from: в */
    public static void m4997(int r2, android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "download_show_top_notification"
            r1 = 1
            boolean r0 = m5009(r3, r0, r1)
            if (r0 != 0) goto La
            return
        La:
            if (r2 >= 0) goto Le
            r2 = -1
            goto L17
        Le:
            r0 = 100
            int r2 = r2 * r0
            int r2 = r2 / r0
            r1 = 0
            int r2 = p000.j81.m2906(r2, r1, r0)     // Catch: java.lang.Throwable -> L21
        L17:
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = m4992(r4)     // Catch: java.lang.Throwable -> L21
            com.example.dyhelper.p002ui.C0182.m1600(r3, r0, r4, r5, r2)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DYHelper: 顶部通知 update 失败: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            p000.C0888ux.m5974(r2)
            return
    }

    /* JADX INFO: renamed from: г */
    public static p000.C0525lu m4998() {
            lu r0 = new lu
            ng r1 = new ng
            r7 = 0
            r8 = 29
            r2 = 1
            pu0 r3 = p000.pu0.f8717
            java.lang.Class<pu0> r4 = p000.pu0.class
            java.lang.String r5 = "isWatermarkVideoUrl"
            java.lang.String r6 = "isWatermarkVideoUrl(Ljava/lang/String;)Z"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            ny0 r9 = new ny0
            r15 = 0
            r16 = 0
            r10 = 1
            java.lang.Class<pu0> r12 = p000.pu0.class
            java.lang.String r13 = "videoUrlWatermarkScore"
            java.lang.String r14 = "videoUrlWatermarkScore(Ljava/lang/String;)I"
            r11 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0.<init>(r1, r9)
            return r0
    }

    /* JADX INFO: renamed from: д */
    public static void m4999(android.content.Context r4, android.net.Uri r5) {
            java.lang.String r0 = r5.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = p000.x02.m6480(r0, r1)
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.String r5 = r5.getPath()
            if (r5 == 0) goto L4a
            java.lang.String[] r5 = new java.lang.String[]{r5}
            android.media.MediaScannerConnection.scanFile(r4, r5, r1, r1)
            return
        L1b:
            java.lang.String r0 = r5.getAuthority()
            if (r0 != 0) goto L23
            java.lang.String r0 = ""
        L23:
            java.lang.String r2 = "externalstorage.documents"
            r3 = 0
            boolean r2 = p000.q02.m4654(r0, r2, r3)
            if (r2 != 0) goto L4a
            java.lang.String r2 = "downloads"
            boolean r0 = p000.q02.m4654(r0, r2, r3)
            if (r0 == 0) goto L35
            goto L4a
        L35:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L4a
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "is_pending"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L4a
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L4a
            r4.update(r5, r0, r1, r1)     // Catch: java.lang.Throwable -> L4a
        L4a:
            return
    }

    /* JADX INFO: renamed from: е */
    public static java.lang.String m5000(java.lang.String r7, p000.C0276f8 r8, java.util.ArrayList r9) {
            r8.getClass()
            java.lang.String r8 = r8.f3800
            if (r8 == 0) goto L11
            boolean r0 = p000.q02.m4671(r8)
            if (r0 != 0) goto Le
            goto Lf
        Le:
            r8 = 0
        Lf:
            if (r8 != 0) goto L13
        L11:
            java.lang.String r8 = "no_aweme"
        L13:
            hm r5 = new hm
            r0 = 21
            r5.<init>(r0)
            r6 = 30
            java.lang.String r1 = "|"
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r9
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r0, r1, r2, r3, r4, r5, r6)
            int r9 = r9.hashCode()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "|"
            r0.append(r7)
            r0.append(r8)
            r0.append(r7)
            r0.append(r9)
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: з */
    public static java.lang.String m5001(java.lang.String r2) {
            r2.getClass()
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "//"
            r1 = 0
            boolean r0 = p000.x02.m6485(r2, r0, r1)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "https:"
            java.lang.String r2 = r0.concat(r2)
        L1a:
            java.lang.String r0 = "&amp;"
            java.lang.String r1 = "&"
            java.lang.String r2 = p000.x02.m6483(r2, r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: и */
    public static java.lang.String m5002(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L1d
            java.lang.String r1 = ";"
            java.lang.String r2 = p000.q02.m4690(r2, r1, r2)
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1d
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r1)
            r2.getClass()
            goto L1e
        L1d:
            r2 = r0
        L1e:
            if (r2 == 0) goto L28
            boolean r1 = p000.q02.m4671(r2)
            if (r1 == 0) goto L27
            goto L28
        L27:
            return r2
        L28:
            return r0
    }

    /* JADX INFO: renamed from: й */
    public static java.lang.String m5003(p000.cw1 r10, java.lang.String r11) {
            java.lang.String r11 = p000.AbstractC0262ev.m1963(r11)
            java.lang.String r0 = "/"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            java.util.List r11 = p000.q02.m4683(r11, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L1e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r11.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L1e
        L36:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto L3f
            r11.add(r1)
            goto L3f
        L56:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r11)
        L5b:
            boolean r11 = r3.isEmpty()
            if (r11 != 0) goto Lac
            java.lang.Object r11 = p000.AbstractC0984xh.m6638(r3)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r10.f2789
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r10.f2790
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r2 = "_display_name"
            java.lang.String r0 = p000.AbstractC0073bd.m858(r0, r1, r2)
            if (r0 != 0) goto L79
            java.lang.String r0 = ""
        L79:
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L86
            boolean r0 = p000.x02.m6480(r11, r0)
            if (r0 == 0) goto L86
            goto La7
        L86:
            java.util.List r0 = p000.AbstractC0262ev.f3673
            if (r0 == 0) goto L91
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L91
            goto Lac
        L91:
            java.util.Iterator r0 = r0.iterator()
        L95:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = p000.x02.m6480(r11, r1)
            if (r1 == 0) goto L95
        La7:
            r11 = 0
            r3.remove(r11)
            goto L5b
        Lac:
            r8 = 0
            r9 = 62
            java.lang.String r4 = "/"
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = p000.AbstractC0984xh.m6644(r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    /* JADX INFO: renamed from: к */
    public static java.lang.String m5004(java.lang.String r1) {
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "#"
            java.lang.String r1 = p000.q02.m4690(r1, r0, r1)
            java.lang.String r0 = "?"
            java.lang.String r1 = p000.q02.m4690(r1, r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: л */
    public static java.lang.String m5005(java.lang.String r2) {
            r2.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r2.toLowerCase(r0)
            r0.getClass()
            java.lang.String r1 = "image/vvic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            java.lang.String r2 = "image/heif"
        L16:
            return r2
    }

    /* JADX INFO: renamed from: м */
    public static void m5006(android.content.Context r2, int r3, java.lang.String r4, boolean r5) {
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.String r5 = "notification"
            java.lang.Object r5 = r2.getSystemService(r5)
            r5.getClass()
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5
            x31 r0 = new x31
            r0.<init>(r2)
            r2 = 17301634(0x1080082, float:2.497962E-38)
            android.app.Notification r1 = r0.f12043
            r1.icon = r2
            java.lang.String r2 = "下载完成"
            java.lang.CharSequence r2 = p000.x31.m6513(r2)
            r0.f12034 = r2
            java.lang.CharSequence r2 = p000.x31.m6513(r4)
            r0.f12035 = r2
            r2 = 16
            r0.m6515(r2)
            r2 = 1
            r0.f12044 = r2
            android.app.Notification r2 = r0.m6514()
            r5.notify(r3, r2)
            return
    }

    /* JADX INFO: renamed from: н */
    public static java.io.InputStream m5007(android.content.Context r4, p000.h41 r5) {
            java.lang.String r0 = r5.f4570
            java.lang.String r5 = r5.f4571
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L11
            goto L18
        L11:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L18:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r1 = 0
        L1d:
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L45
            java.lang.String r2 = r1.getScheme()
            if (r2 == 0) goto L45
            boolean r2 = p000.q02.m4671(r2)
            if (r2 == 0) goto L2e
            goto L45
        L2e:
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.io.InputStream r4 = r4.openInputStream(r1)
            if (r4 == 0) goto L39
            return r4
        L39:
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r0 = "无法读取官方合并输出: "
            java.lang.String r5 = p000.lz1.m3687(r0, r5)
            r4.<init>(r5)
            throw r4
        L45:
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            boolean r0 = r4.exists()
            if (r0 == 0) goto L60
            long r0 = r4.length()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L60
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r4)
            return r5
        L60:
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r0 = "官方合并输出文件不存在或为空: "
            java.lang.String r5 = p000.lz1.m3687(r0, r5)
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: о */
    public static p000.ky0 m5008(java.lang.String r18) {
            java.lang.String r0 = "响应内容不是图片: headerMime="
            java.lang.String r1 = "无法识别图片格式: sourceMime="
            java.lang.String r3 = m5001(r18)
            r2 = 0
            r4 = 30
            vx r4 = p000.C0963wx.m6411(r3, r2, r2, r4)
            java.lang.String r2 = r4.f11460     // Catch: java.lang.Throwable -> L4e
            java.lang.String r7 = m5002(r2)     // Catch: java.lang.Throwable -> L4e
            long r13 = r4.f11461     // Catch: java.lang.Throwable -> L4e
            java.io.BufferedInputStream r5 = r4.f11459     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r5.markSupported()     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto Lec
            r2 = 131072(0x20000, float:1.83671E-40)
            r5.mark(r2)     // Catch: java.lang.Throwable -> L4e
            r2 = 64
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L4e
            int r6 = r5.read(r2)     // Catch: java.lang.Throwable -> L4e
            if (r6 <= 0) goto Le4
            r5.reset()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r8 = p000.jx0.m3055(r2, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r9 = m4962(r18)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r10 = m4978(r2, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r15 = m4977(r2, r6)     // Catch: java.lang.Throwable -> L4e
            r11 = 0
            if (r7 == 0) goto L51
            java.lang.String r12 = "text/"
            boolean r12 = p000.x02.m6485(r7, r12, r11)     // Catch: java.lang.Throwable -> L4e
            r11 = 1
            if (r12 == r11) goto Ld2
            goto L51
        L4e:
            r0 = move-exception
            goto Lf4
        L51:
            java.lang.String r11 = "application/json"
            boolean r11 = p000.ln0.m3626(r7, r11)     // Catch: java.lang.Throwable -> L4e
            if (r11 != 0) goto Ld2
            java.lang.String r11 = "{"
            r12 = 0
            boolean r11 = p000.x02.m6485(r10, r11, r12)     // Catch: java.lang.Throwable -> L4e
            if (r11 != 0) goto Ld2
            java.lang.String r11 = "<"
            boolean r11 = p000.x02.m6485(r10, r11, r12)     // Catch: java.lang.Throwable -> L4e
            if (r11 != 0) goto Ld2
            java.lang.String r11 = "<html"
            r12 = 1
            boolean r11 = p000.q02.m4654(r10, r11, r12)     // Catch: java.lang.Throwable -> L4e
            if (r11 != 0) goto Ld2
            java.lang.String r0 = "image/jpeg"
            java.lang.String r11 = "image/"
            if (r8 == 0) goto L88
            r16 = r0
            r12 = 0
            boolean r0 = p000.x02.m6485(r8, r11, r12)     // Catch: java.lang.Throwable -> L4e
            r12 = 1
            if (r0 != r12) goto L8a
            r17 = r3
            r12 = r8
            r0 = 0
            goto La0
        L88:
            r16 = r0
        L8a:
            if (r7 == 0) goto L97
            r17 = r3
            r0 = 0
            boolean r3 = p000.x02.m6485(r7, r11, r0)     // Catch: java.lang.Throwable -> L4e
            if (r3 != r12) goto L9a
            r12 = r7
            goto La0
        L97:
            r17 = r3
            r0 = 0
        L9a:
            if (r9 != 0) goto L9f
            r12 = r16
            goto La0
        L9f:
            r12 = r9
        La0:
            boolean r0 = p000.x02.m6485(r12, r11, r0)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto Lc8
            boolean r0 = m4995(r12)     // Catch: java.lang.Throwable -> L4e
            r11 = r0 ^ 1
            if (r0 != 0) goto Lb1
            r9 = r16
            goto Lb2
        Lb1:
            r9 = r12
        Lb2:
            java.lang.String r0 = "jpg"
            java.lang.String r0 = p000.jx0.m3058(r9, r0)     // Catch: java.lang.Throwable -> L4e
            ky0 r1 = new ky0     // Catch: java.lang.Throwable -> L4e
            byte[] r6 = java.util.Arrays.copyOf(r2, r6)     // Catch: java.lang.Throwable -> L4e
            r2 = r1
            r16 = r10
            r3 = r17
            r10 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16)     // Catch: java.lang.Throwable -> L4e
            return r2
        Lc8:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r1.concat(r12)     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        Ld2:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4e
            r2.append(r7)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L4e
        Le4:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "读取文件头失败"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        Lec:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "输入流不支持 mark/reset"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        Lf4:
            r4.m6283()
            throw r0
    }

    /* JADX INFO: renamed from: р */
    public static boolean m5009(android.content.Context r2, java.lang.String r3, boolean r4) {
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            boolean r2 = p000.ui1.m5887(r3, r4)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            r2 = move-exception
            goto L1d
        Ld:
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "dyhelper_prefs"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> Lb
            boolean r2 = r2.getBoolean(r3, r4)     // Catch: java.lang.Throwable -> Lb
            return r2
        L1d:
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelper: 读取布尔配置失败 key="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ", err="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            p000.C0888ux.m5974(r2)
            return r4
    }

    /* JADX INFO: renamed from: с */
    public static int m5010(int r2, android.content.Context r3, java.lang.String r4) {
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto Lf
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Le
            int r2 = r3.getInt(r4, r2)     // Catch: java.lang.Throwable -> Le
        Le:
            return r2
        Lf:
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "dyhelper_prefs"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L1f
            int r2 = r3.getInt(r4, r2)     // Catch: java.lang.Throwable -> L1f
            return r2
        L1f:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelper: 读取整型配置失败 key="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = ", err="
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            p000.C0888ux.m5974(r3)
            return r2
    }

    /* JADX INFO: renamed from: т */
    public static java.lang.String m5011(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            java.lang.String r2 = ""
            java.lang.String r2 = p000.ui1.m5893(r3, r2)     // Catch: java.lang.Throwable -> L13
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L13
            if (r3 <= 0) goto L26
            return r2
        L13:
            r2 = move-exception
            goto L28
        L15:
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = "dyhelper_prefs"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L13
            if (r2 != 0) goto L27
        L26:
            return r4
        L27:
            return r2
        L28:
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelper: 读取字符串配置失败 key="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ", err="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            p000.C0888ux.m5974(r2)
            return r4
    }

    /* JADX INFO: renamed from: у */
    public static p000.C0562mu m5012(java.lang.String r3) {
            r3.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            r3.getClass()
            java.lang.String r0 = ".mp4"
            r1 = 0
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            java.lang.String r2 = "video/mp4"
            if (r0 != 0) goto La3
            java.lang.String r0 = "format=mp4"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto La3
            java.lang.String r0 = "mime=video/mp4"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L29
            goto La3
        L29:
            java.lang.String r0 = ".mov"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto La1
            java.lang.String r0 = "format=mov"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto La1
            java.lang.String r0 = "quicktime"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L42
            goto La1
        L42:
            java.lang.String r0 = ".gif"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L9e
            java.lang.String r0 = "format=gif"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L53
            goto L9e
        L53:
            java.lang.String r0 = ".webp"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L9b
            java.lang.String r0 = "format=webp"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L64
            goto L9b
        L64:
            java.lang.String r0 = ".png"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L98
            java.lang.String r0 = "format=png"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L75
            goto L98
        L75:
            java.lang.String r0 = ".jpg"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L95
            java.lang.String r0 = ".jpeg"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L95
            java.lang.String r0 = "format=jpeg"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L95
            java.lang.String r0 = "format=jpg"
            boolean r3 = p000.q02.m4654(r3, r0, r1)
            if (r3 == 0) goto La3
        L95:
            java.lang.String r2 = "image/jpeg"
            goto La3
        L98:
            java.lang.String r2 = "image/png"
            goto La3
        L9b:
            java.lang.String r2 = "image/webp"
            goto La3
        L9e:
            java.lang.String r2 = "image/gif"
            goto La3
        La1:
            java.lang.String r2 = "video/quicktime"
        La3:
            java.lang.String r3 = "video"
            boolean r0 = p000.x02.m6485(r2, r3, r1)
            if (r0 == 0) goto Lae
            java.lang.String r0 = "mp4"
            goto Lb0
        Lae:
            java.lang.String r0 = "gif"
        Lb0:
            java.lang.String r0 = p000.jx0.m3058(r2, r0)
            boolean r3 = p000.x02.m6485(r2, r3, r1)
            if (r3 == 0) goto Lbd
            java.lang.String r3 = android.os.Environment.DIRECTORY_MOVIES
            goto Lbf
        Lbd:
            java.lang.String r3 = android.os.Environment.DIRECTORY_PICTURES
        Lbf:
            mu r1 = new mu
            r3.getClass()
            r1.<init>(r2, r0, r3)
            return r1
    }

    /* JADX INFO: renamed from: ф */
    public static p000.C0964wy m5013(p000.C0228dy r12, boolean r13, boolean r14) {
            byte[] r0 = r12.f3323
            int r1 = r0.length
            java.lang.String r1 = p000.jx0.m3055(r0, r1)
            if (r1 != 0) goto L13
            java.lang.String r12 = r12.f3324
            java.lang.String r1 = m4962(r12)
            if (r1 != 0) goto L13
            java.lang.String r1 = "image/jpeg"
        L13:
            java.lang.String r12 = "jpg"
            java.lang.String r12 = p000.jx0.m3058(r1, r12)
            int r2 = r0.length
            r3 = 131072(0x20000, float:1.83671E-40)
            int r2 = java.lang.Math.min(r2, r3)
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "image/"
            r3 = 1
            boolean r2 = p000.x02.m6485(r1, r2, r3)
            if (r2 == 0) goto L2f
            r2 = r1
            goto L30
        L2f:
            r2 = 0
        L30:
            if (r2 != 0) goto L33
            goto L34
        L33:
            r1 = r2
        L34:
            java.lang.String r2 = ";"
            java.lang.String r1 = p000.q02.m4690(r1, r2, r1)
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r1 = p000.AbstractC0602nx.m4134(r4, r1, r4)
            java.lang.String r5 = r1.toLowerCase(r4)
            r5.getClass()
            java.lang.String r6 = "image/vvic"
            boolean r5 = r5.equals(r6)
            java.lang.String r6 = "image/heif"
            if (r5 == 0) goto L5a
            r1 = r6
        L5a:
            wy r5 = new wy
            java.lang.String r12 = p000.jx0.m3058(r1, r12)
            dz r7 = p000.EnumC0229dz.f3334
            r5.<init>(r1, r12, r7)
            if (r13 != 0) goto L69
            goto L14e
        L69:
            java.lang.String r12 = "image/webp"
            boolean r13 = r1.equals(r12)
            java.lang.String r7 = "image/gif"
            if (r13 == 0) goto L83
            boolean r13 = p000.AbstractC0978xb.m6564(r0)
            if (r13 == 0) goto L83
            wy r12 = new wy
            java.lang.String r13 = "gif"
            dz r14 = p000.EnumC0229dz.f3336
            r12.<init>(r7, r13, r14)
            return r12
        L83:
            if (r14 != 0) goto L14e
            java.lang.String r13 = p000.q02.m4690(r1, r2, r1)
            java.lang.CharSequence r13 = p000.q02.m4660(r13)
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = r13.toLowerCase(r4)
            r13.getClass()
            int r14 = r13.hashCode()
            java.lang.String r1 = "image/png"
            r2 = 0
            switch(r14) {
                case -1487464693: goto Lcd;
                case -1487464690: goto Lc6;
                case -1487018032: goto Lb9;
                case -879267568: goto Lb2;
                case -879258763: goto La3;
                default: goto La2;
            }
        La2:
            goto Ld5
        La3:
            boolean r12 = r13.equals(r1)
            if (r12 != 0) goto Laa
            goto Ld5
        Laa:
            java.lang.String r12 = "acTL"
            boolean r3 = p000.AbstractC0978xb.m6588(r12, r0)
            goto L141
        Lb2:
            boolean r12 = r13.equals(r7)
            if (r12 != 0) goto L141
            goto Ld5
        Lb9:
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto Lc0
            goto Ld5
        Lc0:
            boolean r3 = p000.AbstractC0978xb.m6564(r0)
            goto L141
        Lc6:
            boolean r12 = r13.equals(r6)
            if (r12 != 0) goto Ld8
            goto Ld5
        Lcd:
            java.lang.String r12 = "image/heic"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto Ld8
        Ld5:
            r3 = r2
            goto L141
        Ld8:
            int r12 = r0.length
            r13 = 16
            if (r12 < r13) goto Ld5
            r12 = 4
            java.lang.String r14 = p000.AbstractC0978xb.m6583(r0, r12)
            java.lang.String r4 = "ftyp"
            boolean r14 = r14.equals(r4)
            if (r14 != 0) goto Leb
            goto Ld5
        Leb:
            int r14 = r0.length
            r4 = 8
            if (r14 >= r12) goto Lf3
            r6 = -1
            goto L10f
        Lf3:
            r12 = r0[r2]
            long r6 = (long) r12
            r8 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r8
            r12 = 24
            long r6 = r6 << r12
            r12 = r0[r3]
            long r10 = (long) r12
            long r10 = r10 & r8
            long r10 = r10 << r13
            long r6 = r6 | r10
            r12 = 2
            r12 = r0[r12]
            long r10 = (long) r12
            long r10 = r10 & r8
            long r10 = r10 << r4
            long r6 = r6 | r10
            r12 = 3
            r12 = r0[r12]
            long r10 = (long) r12
            long r8 = r8 & r10
            long r6 = r6 | r8
        L10f:
            r8 = 16
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 < 0) goto Ld5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 <= 0) goto L11d
            goto Ld5
        L11d:
            int r12 = r0.length
            int r14 = (int) r6
            int r12 = java.lang.Math.min(r12, r14)
            java.lang.String r14 = p000.AbstractC0978xb.m6583(r0, r4)
            java.lang.String r4 = "msf1"
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L130
            goto L141
        L130:
            int r14 = r13 + 4
            if (r14 > r12) goto Ld5
            java.lang.String r13 = p000.AbstractC0978xb.m6583(r0, r13)
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L13f
            goto L141
        L13f:
            r13 = r14
            goto L130
        L141:
            if (r3 == 0) goto L144
            goto L14e
        L144:
            wy r12 = new wy
            java.lang.String r13 = "png"
            dz r14 = p000.EnumC0229dz.f3335
            r12.<init>(r1, r13, r14)
            return r12
        L14e:
            return r5
    }

    /* JADX INFO: renamed from: х */
    public static p000.C0299fv m5014(p000.qy0 r0, android.content.Context r1, java.lang.Object r2, p000.jy0 r3, java.lang.String r4) {
            r0.getClass()
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L21;
                case 1: goto L1e;
                case 2: goto L1b;
                case 3: goto L18;
                case 4: goto L15;
                case 5: goto L12;
                case 6: goto Lf;
                default: goto La;
            }
        La:
            p000.C1080.m7272()
            r0 = 0
            return r0
        Lf:
            gv r0 = p000.EnumC0336gv.f4477
            goto L23
        L12:
            gv r0 = p000.EnumC0336gv.f4476
            goto L23
        L15:
            gv r0 = p000.EnumC0336gv.f4475
            goto L23
        L18:
            gv r0 = p000.EnumC0336gv.f4474
            goto L23
        L1b:
            gv r0 = p000.EnumC0336gv.f4473
            goto L23
        L1e:
            gv r0 = p000.EnumC0336gv.f4472
            goto L23
        L21:
            gv r0 = p000.EnumC0336gv.f4471
        L23:
            fv r0 = p000.pd2.m4468(r1, r2, r0, r4)
            return r0
    }

    /* JADX INFO: renamed from: ю */
    public static java.lang.String m5015(p000.qy0 r1, java.lang.String r2) {
            r1.getClass()
            r2.getClass()
            int r1 = r2.length()
            r0 = 140(0x8c, float:1.96E-43)
            if (r1 > r0) goto Lf
            return r2
        Lf:
            java.lang.String r1 = p000.q02.m4693(r2, r0)
            java.lang.String r2 = "..."
            java.lang.String r1 = r1.concat(r2)
            return r1
    }

    /* JADX INFO: renamed from: я */
    public static boolean m5016(android.content.Context r3) {
            java.lang.String r0 = "live_photo_merge_after_download"
            r1 = 0
            boolean r2 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto Le
            boolean r3 = p000.ui1.m5887(r0, r1)     // Catch: java.lang.Throwable -> L13
            return r3
        Le:
            boolean r3 = m5009(r3, r0, r1)     // Catch: java.lang.Throwable -> L13
            return r3
        L13:
            boolean r3 = m5009(r3, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: Β */
    public final void m5017(p000.C0276f8 r10, android.app.Activity r11) {
            r9 = this;
            r11.getClass()
            r10.getClass()
            java.util.List r0 = m4990(r10)
            if (r0 != 0) goto Le
            java.util.List r0 = r10.f3796
        Le:
            java.lang.String r1 = r10.f3800
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L50
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L50
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = p000.ln0.m3616(r6)
            java.lang.String r7 = "http"
            boolean r7 = p000.x02.m6485(r6, r7, r3)
            if (r7 == 0) goto L22
            int r4 = r4 + 1
            java.lang.String r7 = p000.ln0.m3617(r6)
            boolean r8 = p000.q02.m4671(r7)
            if (r8 != 0) goto L22
            boolean r7 = r2.add(r7)
            if (r7 == 0) goto L22
            r5.add(r6)
            goto L22
        L50:
            int r0 = r5.size()
            java.lang.String r2 = "DYHelper"
            if (r4 == r0) goto L70
            int r0 = r5.size()
            java.lang.String r6 = ", raw="
            java.lang.String r7 = ", dedup="
            java.lang.String r8 = "[MEDIA-DEDUPE] label=all_images, awemeId="
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4135(r4, r8, r1, r6, r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5975(r2, r0)
        L70:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7c
            java.lang.String r9 = "未找到图片链接"
            m4991(r11, r9)
            return
        L7c:
            iu r0 = p000.AbstractC1021yh.m6915(r11)
            java.lang.String r1 = r0.f5186
            if (r1 == 0) goto L96
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L8b
            goto L96
        L8b:
            boolean r0 = r0.m2799()
            if (r0 != 0) goto L96
            java.lang.String r0 = "[DOWNLOAD-STORAGE] 当前空间无可用 SAF 授权，改用 MediaStore"
            p000.C0888ux.m5975(r2, r0)
        L96:
            java.lang.String r0 = "jpg"
            java.lang.String r0 = m4966(r11, r10, r0)
            java.lang.String r0 = p000.q02.m4692(r0)
            jy0 r1 = p000.jy0.f5661
            fv r7 = m5014(r9, r11, r10, r1, r0)
            int r9 = r5.size()
            if (r9 > r3) goto Laf
            java.lang.String r9 = "将保存 1 张图片。"
            goto Lbb
        Laf:
            int r9 = r5.size()
            java.lang.String r0 = "将保存 "
            java.lang.String r1 = " 张图片，文件名会自动追加 _img1、_img2。"
            java.lang.String r9 = p000.AbstractC0602nx.m4127(r0, r9, r1)
        Lbb:
            java.lang.String r0 = r7.f4140
            ti0 r3 = new ti0
            r8 = 1
            r4 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r10 = "确认图片文件名"
            m4980(r6, r10, r9, r0, r3)
            return
    }

    /* JADX INFO: renamed from: Γ */
    public final void m5018(p000.C0276f8 r14, android.app.Activity r15) {
            r13 = this;
            r15.getClass()
            r14.getClass()
            java.lang.String r5 = r14.m2044()
            if (r5 == 0) goto L12
            int r0 = r5.length()
            if (r0 != 0) goto L15
        L12:
            r1 = r15
            goto L15c
        L15:
            iu r0 = p000.AbstractC1021yh.m6915(r15)
            java.lang.String r1 = r0.f5186
            if (r1 == 0) goto L31
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L24
            goto L31
        L24:
            boolean r0 = r0.m2799()
            if (r0 != 0) goto L31
            java.lang.String r0 = "DYHelper"
            java.lang.String r1 = "[DOWNLOAD-STORAGE] 当前空间无可用 SAF 授权，改用 MediaStore"
            p000.C0888ux.m5975(r0, r1)
        L31:
            java.lang.String r0 = "audio_download_name_pattern"
            r1 = 0
            int r0 = m5010(r1, r15, r0)
            java.lang.String r2 = p000.AbstractC0488ku.m3420()
            java.lang.String r3 = r14.f3793
            r4 = 20
            java.lang.String r3 = p000.AbstractC0488ku.m3419(r3, r4)
            java.lang.String r4 = r14.f3773
            if (r4 != 0) goto L4a
            java.lang.String r4 = ""
        L4a:
            r6 = 30
            java.lang.String r4 = p000.AbstractC0488ku.m3419(r4, r6)
            java.lang.String r6 = r14.f3800
            if (r6 != 0) goto L56
            java.lang.String r6 = "unknown"
        L56:
            java.util.List r7 = r14.f3772
            java.lang.String r8 = "mp3"
            java.lang.String r9 = ".aac"
            if (r7 == 0) goto L7e
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L65
            goto L7e
        L65:
            java.util.Iterator r7 = r7.iterator()
        L69:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L7e
            java.lang.Object r10 = r7.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = p000.q02.m4654(r10, r9, r1)
            if (r10 == 0) goto L69
            java.lang.String r7 = "aac"
            goto L7f
        L7e:
            r7 = r8
        L7f:
            java.lang.String r10 = "."
            java.lang.String r11 = "_"
            if (r0 == 0) goto Le2
            r12 = 1
            if (r0 == r12) goto Ld9
            r4 = 2
            if (r0 == r4) goto Lc0
            r4 = 3
            if (r0 == r4) goto La7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r11)
            r0.append(r2)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto Lfa
        La7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r11)
            r0.append(r6)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto Lfa
        Lc0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r11)
            r0.append(r2)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto Lfa
        Ld9:
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r3, r11, r4, r11, r2)
            java.lang.String r0 = p000.lz1.m3691(r0, r10, r7)
            goto Lfa
        Le2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r11)
            r0.append(r2)
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
        Lfa:
            java.lang.String r0 = p000.q02.m4692(r0)
            jy0 r2 = p000.jy0.f5664
            fv r2 = m5014(r13, r15, r14, r2, r0)
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r13 = r5.toLowerCase(r13)
            r13.getClass()
            boolean r0 = p000.q02.m4654(r13, r9, r1)
            if (r0 == 0) goto L117
            java.lang.String r13 = "audio/aac"
        L115:
            r3 = r13
            goto L146
        L117:
            java.lang.String r0 = ".m4a"
            boolean r0 = p000.q02.m4654(r13, r0, r1)
            if (r0 == 0) goto L122
            java.lang.String r13 = "audio/mp4"
            goto L115
        L122:
            java.lang.String r0 = ".ogg"
            boolean r0 = p000.q02.m4654(r13, r0, r1)
            if (r0 == 0) goto L12d
            java.lang.String r13 = "audio/ogg"
            goto L115
        L12d:
            java.lang.String r0 = ".wav"
            boolean r0 = p000.q02.m4654(r13, r0, r1)
            if (r0 == 0) goto L138
            java.lang.String r13 = "audio/wav"
            goto L115
        L138:
            java.lang.String r0 = ".flac"
            boolean r13 = p000.q02.m4654(r13, r0, r1)
            if (r13 == 0) goto L143
            java.lang.String r13 = "audio/flac"
            goto L115
        L143:
            java.lang.String r13 = "audio/mpeg"
            goto L115
        L146:
            java.lang.String r13 = p000.jx0.m3058(r3, r8)
            java.lang.String r0 = r2.f4140
            java.lang.String r13 = p000.lz1.m3688(r0, r10, r13)
            m90 r0 = new m90
            r6 = 2
            r4 = r14
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            m4982(r1, r13, r0)
            return
        L15c:
            java.lang.String r13 = "未找到音频链接"
            m4991(r1, r13)
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public final void m5019(java.io.File r8, java.lang.String r9) {
            r7 = this;
            t41 r0 = p000.C0963wx.f11880
            java.lang.String r9 = m5001(r9)
            r0 = 0
            r1 = 30
            vx r9 = p000.C0963wx.m6411(r9, r0, r0, r1)
            java.io.BufferedInputStream r0 = r9.f11459     // Catch: java.lang.Throwable -> L6c
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L14a
            r1.<init>()     // Catch: java.lang.Throwable -> L14a
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L24
        L18:
            int r3 = r0.read(r2)     // Catch: java.lang.Throwable -> L24
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L27
            r1.write(r2, r5, r3)     // Catch: java.lang.Throwable -> L24
            goto L18
        L24:
            r7 = move-exception
            goto L14c
        L27:
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L24
            r1.close()     // Catch: java.lang.Throwable -> L14a
            r0.close()     // Catch: java.lang.Throwable -> L6c
            r2.getClass()     // Catch: java.lang.Throwable -> L6c
            int r0 = r2.length     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L142
            int r0 = r2.length     // Catch: java.lang.Throwable -> L6c
            r1 = 64
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r9.f11460     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = m5002(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = p000.jx0.m3055(r2, r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = m4978(r2, r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.CharSequence r0 = p000.q02.m4660(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6c
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L6c
            r4.getClass()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r0.toLowerCase(r4)     // Catch: java.lang.Throwable -> L6c
            r0.getClass()     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L6f
            java.lang.String r4 = "text/"
            boolean r4 = p000.x02.m6485(r1, r4, r5)     // Catch: java.lang.Throwable -> L6c
            r6 = 1
            if (r4 == r6) goto L12b
            goto L6f
        L6c:
            r7 = move-exception
            goto L158
        L6f:
            java.lang.String r4 = "application/json"
            boolean r4 = p000.ln0.m3626(r1, r4)     // Catch: java.lang.Throwable -> L6c
            if (r4 != 0) goto L12b
            java.lang.String r4 = "{"
            boolean r4 = p000.x02.m6485(r0, r4, r5)     // Catch: java.lang.Throwable -> L6c
            if (r4 != 0) goto L12b
            java.lang.String r4 = "["
            boolean r4 = p000.x02.m6485(r0, r4, r5)     // Catch: java.lang.Throwable -> L6c
            if (r4 != 0) goto L12b
            java.lang.String r4 = "<"
            boolean r4 = p000.x02.m6485(r0, r4, r5)     // Catch: java.lang.Throwable -> L6c
            if (r4 != 0) goto L12b
            java.lang.String r4 = "<html"
            boolean r0 = p000.q02.m4654(r0, r4, r5)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L12b
            android.graphics.Bitmap r7 = m4986(r7, r2)     // Catch: java.lang.Throwable -> Lf1
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ld5
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Ld5
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> Ld7
            r2 = 95
            boolean r1 = r7.compress(r1, r2, r0)     // Catch: java.lang.Throwable -> Ld7
            if (r1 == 0) goto Ld9
            r0.flush()     // Catch: java.lang.Throwable -> Ld7
            r0.close()     // Catch: java.lang.Throwable -> Ld5
            boolean r0 = r7.isRecycled()     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto Lb9
            r7.recycle()     // Catch: java.lang.Throwable -> L6c
        Lb9:
            boolean r7 = r8.exists()     // Catch: java.lang.Throwable -> L6c
            if (r7 == 0) goto Lcd
            long r7 = r8.length()     // Catch: java.lang.Throwable -> L6c
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto Lcd
            r9.m6283()
            return
        Lcd:
            java.lang.Exception r7 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = "JPEG 输出为空"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6c
            throw r7     // Catch: java.lang.Throwable -> L6c
        Ld5:
            r8 = move-exception
            goto Le7
        Ld7:
            r8 = move-exception
            goto Le1
        Ld9:
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = "JPEG 压缩失败"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Ld7
            throw r8     // Catch: java.lang.Throwable -> Ld7
        Le1:
            throw r8     // Catch: java.lang.Throwable -> Le2
        Le2:
            r1 = move-exception
            p000.AbstractC0978xb.m6584(r0, r8)     // Catch: java.lang.Throwable -> Ld5
            throw r1     // Catch: java.lang.Throwable -> Ld5
        Le7:
            boolean r0 = r7.isRecycled()     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto Lf0
            r7.recycle()     // Catch: java.lang.Throwable -> L6c
        Lf0:
            throw r8     // Catch: java.lang.Throwable -> L6c
        Lf1:
            r7 = move-exception
            java.lang.String r0 = "image/jpeg"
            boolean r0 = p000.ln0.m3626(r3, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L110
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6c
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6c
            r7.write(r2)     // Catch: java.lang.Throwable -> L109
            r7.close()     // Catch: java.lang.Throwable -> L6c
            r9.m6283()
            return
        L109:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L10b
        L10b:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r7, r8)     // Catch: java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.Throwable -> L6c
        L110:
            java.lang.Exception r8 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r0.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "无法解码图片用于合并: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L6c
            r0.append(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L6c
            throw r8     // Catch: java.lang.Throwable -> L6c
        L12b:
            java.lang.Exception r7 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "响应内容不是图片: mime="
            r8.append(r0)     // Catch: java.lang.Throwable -> L6c
            r8.append(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6c
            throw r7     // Catch: java.lang.Throwable -> L6c
        L142:
            java.lang.Exception r7 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = "图片内容为空"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6c
            throw r7     // Catch: java.lang.Throwable -> L6c
        L14a:
            r7 = move-exception
            goto L152
        L14c:
            throw r7     // Catch: java.lang.Throwable -> L14d
        L14d:
            r8 = move-exception
            p000.AbstractC0978xb.m6584(r1, r7)     // Catch: java.lang.Throwable -> L14a
            throw r8     // Catch: java.lang.Throwable -> L14a
        L152:
            throw r7     // Catch: java.lang.Throwable -> L153
        L153:
            r8 = move-exception
            p000.AbstractC0978xb.m6584(r0, r7)     // Catch: java.lang.Throwable -> L6c
            throw r8     // Catch: java.lang.Throwable -> L6c
        L158:
            r9.m6283()
            throw r7
    }

    /* JADX INFO: renamed from: Η */
    public final boolean m5020(android.content.Context r17, p000.C0276f8 r18, java.lang.String r19, java.lang.String r20, boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
            r16 = this;
            r1 = r17
            r10 = r20
            r0 = r24
            java.lang.String r11 = "DYHelper"
            java.lang.String r12 = "[LIVEPHOTO-ANIM-FAIL] file="
            java.lang.String r2 = "[LIVEPHOTO-ANIM-DL] awemeId="
            r13 = 0
            mu r3 = m5012(r19)     // Catch: java.lang.Throwable -> L22
            java.lang.String r14 = r3.f7274     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r3.f7272     // Catch: java.lang.Throwable -> L22
            r4 = r18
            java.lang.String r4 = r4.f3800     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L26
            java.lang.String r5 = ""
        L1d:
            r15 = r16
            r6 = r19
            goto L28
        L22:
            r0 = move-exception
            r2 = r13
            goto Le3
        L26:
            r5 = r0
            goto L1d
        L28:
            java.lang.String r7 = m5015(r15, r6)     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L22
            r8.append(r4)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = ", mime="
            r8.append(r2)     // Catch: java.lang.Throwable -> L22
            r8.append(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = ", file="
            r8.append(r2)     // Catch: java.lang.Throwable -> L22
            r8.append(r10)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = ", dir="
            r8.append(r2)     // Catch: java.lang.Throwable -> L22
            r8.append(r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = ", url="
            r8.append(r2)     // Catch: java.lang.Throwable -> L22
            r8.append(r7)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Throwable -> L22
            p000.C0888ux.m5975(r11, r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "video/mp4"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L9e
            boolean r2 = p000.jx0.m3023(r6)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L6a
            goto L9e
        L6a:
            android.net.Uri r9 = m4985(r1, r0, r10, r3, r14)     // Catch: java.lang.Throwable -> L22
            android.content.ContentResolver r0 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L8f
            java.io.OutputStream r0 = r0.openOutputStream(r9)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L96
            int r3 = r15.m5031()     // Catch: java.lang.Throwable -> L8f
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = r21
            r4 = r23
            r2 = r1
            r1 = r0
            r0 = r19
            m4956(r0, r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L93
            r1 = r2
            m4999(r1, r9)     // Catch: java.lang.Throwable -> L8f
            goto Ld5
        L8f:
            r0 = move-exception
        L90:
            r2 = r13
            r13 = r9
            goto Le3
        L93:
            r0 = move-exception
            r1 = r2
            goto L90
        L96:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L8f
            java.lang.String r2 = "无法打开输出流"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        L9e:
            java.lang.String r2 = "dyhelper_livephoto_anim_"
            java.lang.String r3 = ".mp4"
            java.io.File r4 = r1.getCacheDir()     // Catch: java.lang.Throwable -> L22
            java.io.File r2 = java.io.File.createTempFile(r2, r3, r4)     // Catch: java.lang.Throwable -> L22
            r2.getClass()     // Catch: java.lang.Throwable -> Le2
            int r4 = r15.m5031()     // Catch: java.lang.Throwable -> Le2
            cc r8 = new cc     // Catch: java.lang.Throwable -> Le2
            r3 = 5
            r5 = r23
            r8.<init>(r3, r5)     // Catch: java.lang.Throwable -> Le2
            ig r9 = new ig     // Catch: java.lang.Throwable -> Le2
            r3 = 26
            r9.<init>(r3)     // Catch: java.lang.Throwable -> Le2
            r6 = r21
            r7 = r22
            r3 = r2
            r2 = r19
            m4958(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ldf
            r1 = r17
            r2 = r3
            r4 = r10
            r5 = r14
            r3 = r0
            r0 = r15
            r0.m5032(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Ldc
            r13 = r2
        Ld5:
            r0 = 1
            if (r13 == 0) goto Ldb
            r13.delete()
        Ldb:
            return r0
        Ldc:
            r0 = move-exception
            r10 = r4
            goto Le3
        Ldf:
            r0 = move-exception
            r2 = r3
            goto Le3
        Le2:
            r0 = move-exception
        Le3:
            m4987(r1, r13)     // Catch: java.lang.Throwable -> L108
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L108
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L108
            r1.<init>(r12)     // Catch: java.lang.Throwable -> L108
            r1.append(r10)     // Catch: java.lang.Throwable -> L108
            java.lang.String r3 = ", err="
            r1.append(r3)     // Catch: java.lang.Throwable -> L108
            r1.append(r0)     // Catch: java.lang.Throwable -> L108
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L108
            p000.C0888ux.m5975(r11, r0)     // Catch: java.lang.Throwable -> L108
            if (r2 == 0) goto L106
            r2.delete()
        L106:
            r0 = 0
            return r0
        L108:
            r0 = move-exception
            if (r2 == 0) goto L10e
            r2.delete()
        L10e:
            throw r0
    }

    /* JADX INFO: renamed from: Θ */
    public final boolean m5021(android.content.Context r22, p000.C0276f8 r23, int r24, int r25) {
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r23
            r11 = 1
            int r0 = r24 + 1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r12 = "/"
            r4.append(r12)
            r0 = r25
            r4.append(r0)
            java.lang.String r13 = r4.toString()
            h8 r0 = r3.f3798
            h8 r4 = p000.EnumC0350h8.f4617
            if (r0 == r4) goto L2b
            boolean r4 = r3.m2051()
            if (r4 == 0) goto L33
        L2b:
            r4 = r2
            r18 = r11
            r25 = 0
            r7 = 0
            goto L2d2
        L33:
            h8 r4 = p000.EnumC0350h8.f4615
            jz r5 = p000.C0450jz.f5672
            if (r0 != r4) goto L1db
            boolean r4 = r3.m2053()
            if (r4 == 0) goto L1db
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.lang.String r0 = r3.m2047()
            java.lang.String r6 = r3.f3800
            m4954(r4, r0)
            java.util.List r0 = r3.f3795
            if (r0 != 0) goto L52
            goto L53
        L52:
            r5 = r0
        L53:
            uh0 r0 = new uh0
            r8 = 18
            r0.<init>(r8)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r5, r0)
            java.util.Iterator r0 = r0.iterator()
        L62:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L72
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            m4954(r4, r5)
            goto L62
        L72:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L8c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelper: [VIDEO-SKIP] 批量视频跳过: awemeId="
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5974(r0)
            r11 = 0
            goto L2d1
        L8c:
            java.lang.String r0 = "mp4"
            java.lang.String r0 = m4966(r2, r3, r0)
            java.lang.String r0 = p000.q02.m4692(r0)
            jy0 r5 = p000.jy0.f5660
            fv r3 = m5014(r1, r2, r3, r5, r0)
            java.lang.String r0 = r3.f4140
            java.lang.String r5 = ".mp4"
            java.lang.String r16 = p000.AbstractC0602nx.m4129(r0, r5)
            java.util.Iterator r17 = r4.iterator()
            r0 = 0
            r8 = 0
        Laa:
            boolean r9 = r17.hasNext()
            if (r9 == 0) goto L1bc
            int r8 = r8 + r11
            java.lang.Object r0 = r17.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r9 = "dyhelper_batch_video_"
            java.io.File r10 = r2.getCacheDir()
            java.io.File r9 = java.io.File.createTempFile(r9, r5, r10)
            int r10 = r4.size()     // Catch: java.lang.Throwable -> L16d
            java.lang.String r7 = m5015(r1, r0)     // Catch: java.lang.Throwable -> L16d
            r18 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15f
            r11.<init>()     // Catch: java.lang.Throwable -> L15f
            r25 = 0
            java.lang.String r14 = "DYHelper: [VIDEO-DL-BATCH] awemeId="
            r11.append(r14)     // Catch: java.lang.Throwable -> L157
            r11.append(r6)     // Catch: java.lang.Throwable -> L157
            java.lang.String r14 = ", candidate="
            r11.append(r14)     // Catch: java.lang.Throwable -> L157
            r11.append(r8)     // Catch: java.lang.Throwable -> L157
            r11.append(r12)     // Catch: java.lang.Throwable -> L157
            r11.append(r10)     // Catch: java.lang.Throwable -> L157
            java.lang.String r10 = ", url="
            r11.append(r10)     // Catch: java.lang.Throwable -> L157
            r11.append(r7)     // Catch: java.lang.Throwable -> L157
            java.lang.String r7 = r11.toString()     // Catch: java.lang.Throwable -> L157
            p000.C0888ux.m5974(r7)     // Catch: java.lang.Throwable -> L157
            r9.getClass()     // Catch: java.lang.Throwable -> L157
            r7 = r5
            int r5 = r1.m5031()     // Catch: java.lang.Throwable -> L14a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14a
            r10.<init>()     // Catch: java.lang.Throwable -> L14a
            r10.append(r13)     // Catch: java.lang.Throwable -> L14a
            java.lang.String r11 = " (视频)"
            r10.append(r11)     // Catch: java.lang.Throwable -> L14a
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14a
            r11 = r4
            r4 = r9
            r9 = 0
            r14 = r6
            r6 = r10
            r10 = 0
            r19 = r8
            r8 = 0
            r15 = r14
            r14 = r11
            r11 = r19
            r19 = r15
            r15 = r3
            r20 = r7
            r7 = 0
            r3 = r0
            m4958(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L148
            r3 = r4
            java.lang.String r4 = r15.f4139     // Catch: java.lang.Throwable -> L141
            java.lang.String r6 = android.os.Environment.DIRECTORY_MOVIES     // Catch: java.lang.Throwable -> L141
            r6.getClass()     // Catch: java.lang.Throwable -> L141
            r2 = r22
            r5 = r16
            r1.m5032(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L13e
            r4 = r3
            r4.delete()
            r11 = r18
            goto L2d1
        L13e:
            r0 = move-exception
            r4 = r3
            goto L17d
        L141:
            r0 = move-exception
            r2 = r22
            r4 = r3
        L145:
            r5 = r16
            goto L17d
        L148:
            r0 = move-exception
            goto L145
        L14a:
            r0 = move-exception
            r15 = r3
            r14 = r4
            r19 = r6
            r20 = r7
        L151:
            r11 = r8
            r4 = r9
            r5 = r16
        L155:
            r7 = 0
            goto L17d
        L157:
            r0 = move-exception
            r15 = r3
            r14 = r4
            r20 = r5
            r19 = r6
            goto L151
        L15f:
            r0 = move-exception
            r15 = r3
            r14 = r4
            r20 = r5
            r19 = r6
            r11 = r8
            r4 = r9
            r5 = r16
            r25 = 0
            goto L155
        L16d:
            r0 = move-exception
            r15 = r3
            r14 = r4
            r20 = r5
            r19 = r6
            r4 = r9
            r18 = r11
            r5 = r16
            r25 = 0
            r7 = 0
            r11 = r8
        L17d:
            int r3 = r14.size()     // Catch: java.lang.Throwable -> L1b7
            java.lang.String r6 = r0.getMessage()     // Catch: java.lang.Throwable -> L1b7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b7
            r8.<init>()     // Catch: java.lang.Throwable -> L1b7
            java.lang.String r9 = "DYHelper: [VIDEO-DL-BATCH-RETRY] 候选 "
            r8.append(r9)     // Catch: java.lang.Throwable -> L1b7
            r8.append(r11)     // Catch: java.lang.Throwable -> L1b7
            r8.append(r12)     // Catch: java.lang.Throwable -> L1b7
            r8.append(r3)     // Catch: java.lang.Throwable -> L1b7
            java.lang.String r3 = " 失败: "
            r8.append(r3)     // Catch: java.lang.Throwable -> L1b7
            r8.append(r6)     // Catch: java.lang.Throwable -> L1b7
            java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L1b7
            p000.C0888ux.m5974(r3)     // Catch: java.lang.Throwable -> L1b7
            r4.delete()
            r16 = r5
            r8 = r11
            r4 = r14
            r3 = r15
            r11 = r18
            r6 = r19
            r5 = r20
            goto Laa
        L1b7:
            r0 = move-exception
            r4.delete()
            throw r0
        L1bc:
            r25 = 0
            if (r0 == 0) goto L1c5
            java.lang.String r15 = r0.getMessage()
            goto L1c6
        L1c5:
            r15 = 0
        L1c6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelper: [VIDEO-DL-BATCH-FAIL] 全部候选失败: "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5974(r0)
            r11 = r25
            goto L2d1
        L1db:
            r18 = r11
            r25 = 0
            r7 = 0
            h8 r4 = p000.EnumC0350h8.f4616
            if (r0 != r4) goto L2e3
            boolean r0 = r3.m2050()
            if (r0 == 0) goto L2e3
            java.util.List r0 = m4990(r3)
            if (r0 != 0) goto L1f6
            java.util.List r0 = r3.f3796
            if (r0 != 0) goto L1f6
            r8 = r5
            goto L1f7
        L1f6:
            r8 = r0
        L1f7:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L201
            r14 = r25
            goto L2d0
        L201:
            java.lang.String r0 = "jpg"
            java.lang.String r0 = m4966(r2, r3, r0)
            java.lang.String r0 = p000.q02.m4692(r0)
            jy0 r4 = p000.jy0.f5661
            fv r9 = m5014(r1, r2, r3, r4, r0)
            java.util.Iterator r10 = r8.iterator()
            r0 = r25
            r11 = r0
        L218:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L2c8
            int r14 = r0 + 1
            java.lang.Object r3 = r10.next()
            java.lang.String r3 = (java.lang.String) r3
            ky0 r3 = m5008(r3)     // Catch: java.lang.Throwable -> L2a0
            java.lang.String r4 = r9.f4140     // Catch: java.lang.Throwable -> L29b
            java.lang.String r5 = r3.f6316     // Catch: java.lang.Throwable -> L29b
            int r6 = r8.size()     // Catch: java.lang.Throwable -> L29b
            java.lang.String r0 = m4967(r0, r6, r4, r5)     // Catch: java.lang.Throwable -> L29b
            java.lang.String r4 = r9.f4139     // Catch: java.lang.Throwable -> L29b
            java.lang.String r5 = r3.f6315     // Catch: java.lang.Throwable -> L29b
            java.lang.String r6 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L29b
            r6.getClass()     // Catch: java.lang.Throwable -> L29b
            android.net.Uri r15 = m4985(r2, r4, r0, r5, r6)     // Catch: java.lang.Throwable -> L29b
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L28d
            java.io.OutputStream r0 = r0.openOutputStream(r15)     // Catch: java.lang.Throwable -> L28d
            if (r0 == 0) goto L291
            int r5 = r1.m5031()     // Catch: java.lang.Throwable -> L28d
            int r4 = r8.size()     // Catch: java.lang.Throwable -> L28d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28d
            r6.<init>()     // Catch: java.lang.Throwable -> L28d
            r6.append(r13)     // Catch: java.lang.Throwable -> L28d
            java.lang.String r7 = " (图片 "
            r6.append(r7)     // Catch: java.lang.Throwable -> L288
            r6.append(r14)     // Catch: java.lang.Throwable -> L288
            r6.append(r12)     // Catch: java.lang.Throwable -> L288
            r6.append(r4)     // Catch: java.lang.Throwable -> L288
            java.lang.String r4 = ")"
            r6.append(r4)     // Catch: java.lang.Throwable -> L288
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L288
            r4 = r2
            r2 = r3
            r7 = 0
            r3 = r0
            r1.m5022(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L285
            m4999(r4, r15)     // Catch: java.lang.Throwable -> L285
            int r11 = r11 + 1
        L280:
            r1 = r21
            r2 = r4
            r0 = r14
            goto L218
        L285:
            r0 = move-exception
            r3 = r2
            goto L2a4
        L288:
            r0 = move-exception
            r4 = r2
            r2 = r3
            r7 = 0
            goto L2a4
        L28d:
            r0 = move-exception
            r4 = r2
            r2 = r3
            goto L2a4
        L291:
            r4 = r2
            r2 = r3
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L285
            java.lang.String r1 = "无法打开输出流"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L285
            throw r0     // Catch: java.lang.Throwable -> L285
        L29b:
            r0 = move-exception
            r4 = r2
            r2 = r3
        L29e:
            r15 = 0
            goto L2a4
        L2a0:
            r0 = move-exception
            r4 = r2
            r3 = 0
            goto L29e
        L2a4:
            m4987(r4, r15)
            m4979(r3)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DYHelper: [IMG-FAIL] 批量图片"
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r2 = "失败: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5974(r0)
            goto L280
        L2c8:
            if (r11 <= 0) goto L2cd
            r11 = r18
            goto L2cf
        L2cd:
            r11 = r25
        L2cf:
            r14 = r11
        L2d0:
            r11 = r14
        L2d1:
            return r11
        L2d2:
            r5 = 0
            r6 = 0
            r1 = r21
            r2 = r4
            r4 = r7
            java.util.ArrayList r0 = r1.m5035(r2, r3, r4, r5, r6)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e3
            return r18
        L2e3:
            return r25
    }

    /* JADX INFO: renamed from: Κ */
    public final void m5022(p000.ky0 r14, java.io.OutputStream r15, android.content.Context r16, int r17, java.lang.String r18, boolean r19) {
            r13 = this;
            r3 = r16
            vx r12 = r14.f6310
            java.io.BufferedInputStream r1 = r14.f6311
            boolean r0 = r14.f6317     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L49
            r13.m5028(r14, r15)     // Catch: java.lang.Throwable -> L46
            if (r19 == 0) goto L58
            java.lang.String r13 = "notification"
            java.lang.Object r13 = r3.getSystemService(r13)     // Catch: java.lang.Throwable -> L46
            r13.getClass()     // Catch: java.lang.Throwable -> L46
            android.app.NotificationManager r13 = (android.app.NotificationManager) r13     // Catch: java.lang.Throwable -> L46
            x31 r14 = new x31     // Catch: java.lang.Throwable -> L46
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L46
            android.app.Notification r0 = r14.f12043     // Catch: java.lang.Throwable -> L46
            r2 = 17301634(0x1080082, float:2.497962E-38)
            r0.icon = r2     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "下载完成"
            java.lang.CharSequence r0 = p000.x31.m6513(r0)     // Catch: java.lang.Throwable -> L46
            r14.f12034 = r0     // Catch: java.lang.Throwable -> L46
            java.lang.CharSequence r0 = p000.x31.m6513(r18)     // Catch: java.lang.Throwable -> L46
            r14.f12035 = r0     // Catch: java.lang.Throwable -> L46
            r0 = 16
            r14.m6515(r0)     // Catch: java.lang.Throwable -> L46
            r0 = 1
            r14.f12044 = r0     // Catch: java.lang.Throwable -> L46
            android.app.Notification r14 = r14.m6514()     // Catch: java.lang.Throwable -> L46
            r4 = r17
            r13.notify(r4, r14)     // Catch: java.lang.Throwable -> L46
            goto L58
        L46:
            r0 = move-exception
            r13 = r0
            goto L62
        L49:
            r4 = r17
            long r6 = r14.f6319     // Catch: java.lang.Throwable -> L46
            r10 = 0
            r9 = 0
            r11 = 0
            r2 = r15
            r5 = r18
            r8 = r19
            m4983(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L46
        L58:
            r15.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            r1.close()     // Catch: java.lang.Throwable -> L5e
        L5e:
            r12.m6283()
            return
        L62:
            r15.close()     // Catch: java.lang.Throwable -> L65
        L65:
            r1.close()     // Catch: java.lang.Throwable -> L68
        L68:
            r12.m6283()
            throw r13
    }

    /* JADX INFO: renamed from: Λ */
    public final boolean m5023(android.content.Context r22, p000.C0276f8 r23, p000.zy0 r24, boolean r25, java.lang.String r26) {
            r21 = this;
            r2 = r22
            r3 = r23
            r10 = r24
            java.lang.String r11 = "."
            java.util.List r0 = r10.f13359
            az0 r12 = r10.f13351
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L18
            java.lang.String r0 = r10.f13358
            java.util.List r0 = p000.AbstractC1021yh.m6898(r0)
        L18:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L37
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m4964(r4)
            if (r4 == 0) goto L21
            r1.add(r4)
            goto L21
        L37:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = m5004(r5)
            boolean r5 = r0.add(r5)
            if (r5 == 0) goto L45
            r13.add(r4)
            goto L45
        L60:
            boolean r0 = r13.isEmpty()
            r14 = 0
            if (r0 == 0) goto L68
            return r14
        L68:
            int r0 = r12.ordinal()
            r15 = 1
            if (r0 == r15) goto L79
            r1 = 3
            if (r0 == r1) goto L76
            java.lang.String r0 = "anim"
        L74:
            r1 = r0
            goto L7c
        L76:
            java.lang.String r0 = "live"
            goto L74
        L79:
            java.lang.String r0 = "video"
            goto L74
        L7c:
            int r0 = r12.ordinal()
            if (r0 == r15) goto L86
            java.lang.String r0 = "已选动图"
        L84:
            r4 = r0
            goto L89
        L86:
            java.lang.String r0 = "已选视频"
            goto L84
        L89:
            java.util.Iterator r16 = r13.iterator()
            r0 = 0
            r5 = r14
        L8f:
            boolean r6 = r16.hasNext()
            java.lang.String r7 = "DYHelper"
            if (r6 == 0) goto L164
            int r5 = r5 + r15
            java.lang.Object r6 = r16.next()
            java.lang.String r6 = (java.lang.String) r6
            mu r8 = m5012(r6)     // Catch: java.lang.Throwable -> L137
            java.lang.String r9 = "dat"
            java.lang.String r9 = m4966(r2, r3, r9)     // Catch: java.lang.Throwable -> L137
            java.lang.String r9 = p000.q02.m4692(r9)     // Catch: java.lang.Throwable -> L137
            r17 = r14
            az0 r14 = p000.az0.f1382     // Catch: java.lang.Throwable -> Lb9
            if (r12 != r14) goto Lc5
            jy0 r14 = p000.jy0.f5660     // Catch: java.lang.Throwable -> Lb9
        Lb4:
            r18 = r15
            r15 = r21
            goto Lc8
        Lb9:
            r0 = move-exception
            r19 = r1
            r14 = r5
            r20 = r11
            r18 = r15
            r15 = r4
        Lc2:
            r11 = r7
            goto L144
        Lc5:
            jy0 r14 = p000.jy0.f5662     // Catch: java.lang.Throwable -> Lb9
            goto Lb4
        Lc8:
            fv r9 = m5014(r15, r2, r3, r14, r9)     // Catch: java.lang.Throwable -> Ld1
            if (r26 != 0) goto Ld9
            java.lang.String r14 = r9.f4140     // Catch: java.lang.Throwable -> Ld1
            goto Ldb
        Ld1:
            r0 = move-exception
            r19 = r1
        Ld4:
            r15 = r4
            r14 = r5
            r20 = r11
            goto Lc2
        Ld9:
            r14 = r26
        Ldb:
            java.lang.String r14 = m4973(r2, r3, r10, r1, r14)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r8 = r8.f7273     // Catch: java.lang.Throwable -> Ld1
            r19 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L135
            r1.<init>()     // Catch: java.lang.Throwable -> L135
            r1.append(r14)     // Catch: java.lang.Throwable -> L135
            r1.append(r11)     // Catch: java.lang.Throwable -> L135
            r1.append(r8)     // Catch: java.lang.Throwable -> L135
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L135
            int r8 = r10.f13353     // Catch: java.lang.Throwable -> L135
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L135
            r14.<init>()     // Catch: java.lang.Throwable -> L135
            r14.append(r4)     // Catch: java.lang.Throwable -> L135
            r20 = r1
            java.lang.String r1 = " "
            r14.append(r1)     // Catch: java.lang.Throwable -> L135
            r14.append(r8)     // Catch: java.lang.Throwable -> L135
            java.lang.String r8 = r14.toString()     // Catch: java.lang.Throwable -> L135
            java.lang.String r9 = r9.f4139     // Catch: java.lang.Throwable -> L135
            r1 = r7
            r7 = 0
            r14 = r5
            r5 = r20
            r20 = r11
            r11 = r1
            r1 = r15
            r15 = r4
            r4 = r6
            r6 = r25
            boolean r4 = r1.m5020(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L133
            if (r4 == 0) goto L123
            return r18
        L123:
            r2 = r22
            r3 = r23
            r5 = r14
            r4 = r15
            r14 = r17
            r15 = r18
            r1 = r19
            r11 = r20
            goto L8f
        L133:
            r0 = move-exception
            goto L144
        L135:
            r0 = move-exception
            goto Ld4
        L137:
            r0 = move-exception
            r19 = r1
            r20 = r11
            r17 = r14
            r18 = r15
            r15 = r4
            r14 = r5
            goto Lc2
        L144:
            java.lang.String r1 = r10.f13354
            int r2 = r13.size()
            java.lang.String r3 = " 候选 "
            java.lang.String r4 = "/"
            java.lang.String r5 = "[SELECT-ANIM-RETRY] "
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4135(r14, r5, r1, r3, r4)
            r1.append(r2)
            java.lang.String r2 = " 失败"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p000.C0888ux.m5977(r11, r1, r0)
            goto L123
        L164:
            r11 = r7
            r17 = r14
            java.lang.String r1 = "[SELECT-ANIM-FAIL]"
            p000.C0888ux.m5977(r11, r1, r0)
            return r17
    }

    /* JADX INFO: renamed from: Μ */
    public final boolean m5024(android.content.Context r15, p000.C0276f8 r16, p000.zy0 r17, boolean r18, java.lang.String r19) {
            r14 = this;
            r1 = r16
            r2 = r17
            java.lang.String r7 = "DYHelper"
            java.lang.String r4 = "."
            java.lang.String r5 = "[SELECT-IMG-DL] page="
            java.lang.String r6 = r2.f13357
            java.lang.String r6 = m4964(r6)
            r8 = 0
            if (r6 != 0) goto L14
            return r8
        L14:
            r9 = 0
            ky0 r10 = m5008(r6)     // Catch: java.lang.Throwable -> La8
            java.lang.String r11 = "dat"
            java.lang.String r11 = m4966(r15, r1, r11)     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = p000.q02.m4692(r11)     // Catch: java.lang.Throwable -> L30
            jy0 r12 = p000.jy0.f5661     // Catch: java.lang.Throwable -> L30
            fv r11 = m5014(r14, r15, r1, r12, r11)     // Catch: java.lang.Throwable -> L30
            java.lang.String r12 = "image"
            if (r19 != 0) goto L34
            java.lang.String r13 = r11.f4140     // Catch: java.lang.Throwable -> L30
            goto L36
        L30:
            r0 = move-exception
            r1 = r10
            goto Laa
        L34:
            r13 = r19
        L36:
            java.lang.String r1 = m4973(r15, r1, r2, r12, r13)     // Catch: java.lang.Throwable -> L30
            java.lang.String r12 = r10.f6316     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r13.<init>()     // Catch: java.lang.Throwable -> L30
            r13.append(r1)     // Catch: java.lang.Throwable -> L30
            r13.append(r4)     // Catch: java.lang.Throwable -> L30
            r13.append(r12)     // Catch: java.lang.Throwable -> L30
            java.lang.String r1 = r13.toString()     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r11.f4139     // Catch: java.lang.Throwable -> L30
            java.lang.String r11 = r10.f6315     // Catch: java.lang.Throwable -> L30
            java.lang.String r12 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L30
            r12.getClass()     // Catch: java.lang.Throwable -> L30
            android.net.Uri r9 = m4985(r15, r4, r1, r11, r12)     // Catch: java.lang.Throwable -> L30
            android.content.ContentResolver r4 = r15.getContentResolver()     // Catch: java.lang.Throwable -> L30
            java.io.OutputStream r4 = r4.openOutputStream(r9)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L9f
            int r2 = r2.f13352     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = m5015(r14, r6)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r11.<init>(r5)     // Catch: java.lang.Throwable -> L30
            r11.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = ", file="
            r11.append(r2)     // Catch: java.lang.Throwable -> L30
            r11.append(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = ", url="
            r11.append(r2)     // Catch: java.lang.Throwable -> L30
            r11.append(r6)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = r11.toString()     // Catch: java.lang.Throwable -> L30
            p000.C0888ux.m5975(r7, r2)     // Catch: java.lang.Throwable -> L30
            r2 = r4
            int r4 = r14.m5031()     // Catch: java.lang.Throwable -> L30
            r0 = r14
            r3 = r15
            r6 = r18
            r5 = r1
            r1 = r10
            r0.m5022(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9d
            m4999(r15, r9)     // Catch: java.lang.Throwable -> L9d
            r0 = 1
            return r0
        L9d:
            r0 = move-exception
            goto Laa
        L9f:
            r1 = r10
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L9d
            java.lang.String r2 = "无法打开输出流"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        La8:
            r0 = move-exception
            r1 = r9
        Laa:
            m4987(r15, r9)
            m4979(r1)
            java.lang.String r1 = "[SELECT-IMG-FAIL]"
            p000.C0888ux.m5977(r7, r1, r0)
            return r8
    }

    /* JADX INFO: renamed from: Ν */
    public final boolean m5025(android.content.Context r21, p000.C0276f8 r22, p000.zy0 r23, boolean r24, java.lang.String r25) {
            r20 = this;
            r1 = r21
            r2 = r22
            r0 = r23
            java.util.List r3 = r0.f13359
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L14
            java.lang.String r3 = r0.f13358
            java.util.List r3 = p000.AbstractC1021yh.m6898(r3)
        L14:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L33
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = m4964(r5)
            if (r5 == 0) goto L1d
            r4.add(r5)
            goto L1d
        L33:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L41:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5c
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = m5004(r7)
            boolean r7 = r3.add(r7)
            if (r7 == 0) goto L41
            r5.add(r6)
            goto L41
        L5c:
            boolean r3 = r5.isEmpty()
            r17 = 0
            if (r3 == 0) goto L66
            goto L175
        L66:
            java.lang.String r3 = r0.f13357
            java.lang.String r6 = m4964(r3)
            java.lang.String r3 = r0.f13356
            java.lang.String r3 = m4964(r3)
            boolean r4 = m5016(r1)
            r7 = 0
            r18 = 1
            if (r4 == 0) goto L138
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch: java.lang.Throwable -> L112
            java.util.ArrayList r3 = p000.AbstractC0312g7.m2248(r3)     // Catch: java.lang.Throwable -> L112
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r3)     // Catch: java.lang.Throwable -> L112
            java.util.List r3 = p000.AbstractC0984xh.m6666(r3)     // Catch: java.lang.Throwable -> L112
            int r4 = r0.f13352     // Catch: java.lang.Throwable -> L112
            int r4 = r4 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L112
            r6.<init>()     // Catch: java.lang.Throwable -> L112
            java.lang.String r8 = "_page"
            r6.append(r8)     // Catch: java.lang.Throwable -> L112
            r6.append(r4)     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L112
            boolean r6 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L112
            if (r6 != 0) goto La7
            goto La8
        La7:
            r4 = r7
        La8:
            if (r4 != 0) goto Lac
            java.lang.String r4 = ""
        Lac:
            java.lang.Object r6 = p000.AbstractC0984xh.m6640(r3)     // Catch: java.lang.Throwable -> L112
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L112
            java.lang.String r6 = r2.f3793     // Catch: java.lang.Throwable -> L112
            java.lang.String r6 = m4972(r4, r6)     // Catch: java.lang.Throwable -> L112
            java.lang.String r8 = r2.f3794     // Catch: java.lang.Throwable -> L112
            java.lang.String r8 = m4972(r4, r8)     // Catch: java.lang.Throwable -> L112
            java.lang.String r9 = r2.f3800     // Catch: java.lang.Throwable -> L112
            if (r9 == 0) goto Lc8
            java.lang.String r4 = m4972(r4, r9)     // Catch: java.lang.Throwable -> L112
            goto Lc9
        Lc8:
            r4 = r7
        Lc9:
            boolean r9 = r3.isEmpty()     // Catch: java.lang.Throwable -> L112
            if (r9 != 0) goto Ld3
            r9 = r3
            r3 = r6
            r6 = r9
            goto Ld6
        Ld3:
            r9 = r3
            r3 = r6
            r6 = r7
        Ld6:
            java.lang.Object r11 = p000.AbstractC0984xh.m6640(r5)     // Catch: java.lang.Throwable -> L112
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L112
            boolean r12 = r9.isEmpty()     // Catch: java.lang.Throwable -> L112
            if (r12 != 0) goto Le4
            r13 = r9
            goto Le5
        Le4:
            r13 = r7
        Le5:
            r15 = -1073741968(0xffffffffbfffff70, float:-1.9999828)
            r16 = 7809(0x1e81, float:1.0943E-41)
            r9 = r7
            r7 = r4
            r4 = r8
            r8 = 0
            r14 = 0
            r12 = r9
            r9 = r11
            r11 = r10
            r19 = r12
            r12 = r5
            f8 r3 = p000.C0276f8.m2043(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = "dat"
            java.lang.String r4 = m4966(r1, r2, r4)     // Catch: java.lang.Throwable -> L112
            java.lang.String r4 = p000.q02.m4692(r4)     // Catch: java.lang.Throwable -> L112
            jy0 r5 = p000.jy0.f5663     // Catch: java.lang.Throwable -> L112
            r6 = r20
            fv r4 = m5014(r6, r1, r2, r5, r4)     // Catch: java.lang.Throwable -> L112
            java.lang.String r5 = "live"
            if (r25 != 0) goto L114
            java.lang.String r7 = r4.f4140     // Catch: java.lang.Throwable -> L112
            goto L116
        L112:
            r0 = move-exception
            goto L130
        L114:
            r7 = r25
        L116:
            java.lang.String r0 = m4973(r1, r2, r0, r5, r7)     // Catch: java.lang.Throwable -> L112
            r2 = 5
            r12 = 0
            fv r5 = p000.C0299fv.m2204(r4, r12, r0, r12, r2)     // Catch: java.lang.Throwable -> L112
            r4 = 0
            r2 = r3
            r0 = r6
            r3 = r24
            java.util.ArrayList r0 = r0.m5037(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L112
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L112
            r0 = r0 ^ 1
            return r0
        L130:
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "[SELECT-LIVE-MERGE-FAIL]"
            p000.C0888ux.m5977(r1, r2, r0)
            return r17
        L138:
            r12 = r7
            az0 r1 = p000.az0.f1383
            r3 = 1022(0x3fe, float:1.432E-42)
            zy0 r3 = p000.zy0.m7251(r0, r1, r12, r3)
            r1 = r21
            r4 = r24
            r5 = r25
            r7 = r0
            r0 = r20
            boolean r8 = r0.m5023(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L16e
            boolean r0 = p000.q02.m4671(r6)
            if (r0 == 0) goto L157
            goto L16e
        L157:
            az0 r0 = p000.az0.f1381
            r1 = 958(0x3be, float:1.342E-42)
            zy0 r3 = p000.zy0.m7251(r7, r0, r6, r1)
            r0 = r20
            r1 = r21
            r2 = r22
            r4 = r24
            r5 = r25
            boolean r0 = r0.m5024(r1, r2, r3, r4, r5)
            goto L170
        L16e:
            r0 = r17
        L170:
            if (r8 != 0) goto L176
            if (r0 == 0) goto L175
            goto L176
        L175:
            return r17
        L176:
            return r18
    }

    /* JADX INFO: renamed from: Π */
    public final void m5026(android.app.Activity r3, p000.C0276f8 r4, java.lang.String r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            iu r0 = p000.AbstractC1021yh.m6915(r3)
            java.lang.String r1 = r0.f5186
            if (r1 == 0) goto L22
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L15
            goto L22
        L15:
            boolean r0 = r0.m2799()
            if (r0 != 0) goto L22
            java.lang.String r0 = "DYHelper"
            java.lang.String r1 = "[DOWNLOAD-STORAGE] 当前空间无可用 SAF 授权，改用 MediaStore"
            p000.C0888ux.m5975(r0, r1)
        L22:
            java.lang.String r0 = "mp4"
            java.lang.String r0 = m4966(r3, r4, r0)
            java.lang.String r0 = p000.q02.m4692(r0)
            jy0 r1 = p000.jy0.f5660
            fv r2 = m5014(r2, r3, r4, r1, r0)
            java.lang.String r0 = r2.f4140
            java.lang.String r1 = ".mp4"
            java.lang.String r0 = p000.AbstractC0602nx.m4129(r0, r1)
            if (r5 == 0) goto L4b
            boolean r1 = p000.q02.m4671(r5)
            if (r1 == 0) goto L43
            goto L4b
        L43:
            java.lang.String r5 = p000.AbstractC0488ku.m3415(r5, r0)
            m4957(r3, r4, r2, r5)
            return
        L4b:
            my0 r5 = new my0
            r5.<init>(r3, r4, r2)
            m4982(r3, r0, r5)
            return
    }

    /* JADX INFO: renamed from: Τ */
    public final void m5027(java.lang.String r23, java.io.FileOutputStream r24, android.content.Context r25, int r26, java.lang.String r27, boolean r28, java.lang.String r29, p000.e80 r30, p000.e80 r31) {
            r22 = this;
            java.lang.String r0 = "响应是音频，不是视频: header="
            java.lang.String r1 = "video/mp4"
            java.lang.String r2 = "响应不是视频，疑似 JSON/HTML: mime="
            java.lang.String r3 = "响应类型不是 MP4: contentType="
            java.lang.String r4 = "响应是图片，不是视频: header="
            java.lang.String r5 = "响应不是可播放 MP4: contentType="
            boolean r6 = p000.jx0.m3016(r23)
            if (r6 != 0) goto L1e1
            r6 = 26
            r7 = 0
            r8 = r23
            vx r6 = p000.C0963wx.m6411(r8, r7, r7, r6)     // Catch: java.lang.Throwable -> L1cf
            java.lang.String r9 = r6.f11460     // Catch: java.lang.Throwable -> L1cb
            java.lang.String r10 = m5002(r9)     // Catch: java.lang.Throwable -> L1cb
            long r11 = r6.f11461     // Catch: java.lang.Throwable -> L1cb
            java.io.BufferedInputStream r7 = r6.f11459     // Catch: java.lang.Throwable -> L1cb
            boolean r13 = r7.markSupported()     // Catch: java.lang.Throwable -> L1b1
            if (r13 == 0) goto L1c0
            r13 = 131072(0x20000, float:1.83671E-40)
            r7.mark(r13)     // Catch: java.lang.Throwable -> L1b1
            r13 = 64
            byte[] r13 = new byte[r13]     // Catch: java.lang.Throwable -> L1b1
            int r14 = r7.read(r13)     // Catch: java.lang.Throwable -> L1b1
            if (r14 <= 0) goto L1b5
            r7.reset()     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r15 = m4951(r13, r14)     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r16 = m4978(r13, r14)     // Catch: java.lang.Throwable -> L1b1
            java.lang.CharSequence r16 = p000.q02.m4660(r16)     // Catch: java.lang.Throwable -> L1b1
            r22 = r6
            java.lang.String r6 = r16.toString()     // Catch: java.lang.Throwable -> L1ac
            r16 = r7
            java.util.Locale r7 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L178
            java.lang.String r6 = r6.toLowerCase(r7)     // Catch: java.lang.Throwable -> L178
            r6.getClass()     // Catch: java.lang.Throwable -> L178
            java.lang.String r7 = "#extm3u"
            r8 = 0
            boolean r7 = p000.x02.m6485(r6, r7, r8)     // Catch: java.lang.Throwable -> L178
            if (r7 != 0) goto L1a2
            java.lang.String r7 = "{"
            boolean r7 = p000.x02.m6485(r6, r7, r8)     // Catch: java.lang.Throwable -> L178
            if (r7 != 0) goto L18e
            java.lang.String r7 = "["
            boolean r7 = p000.x02.m6485(r6, r7, r8)     // Catch: java.lang.Throwable -> L178
            if (r7 != 0) goto L18e
            java.lang.String r7 = "<"
            boolean r7 = p000.x02.m6485(r6, r7, r8)     // Catch: java.lang.Throwable -> L178
            if (r7 != 0) goto L18e
            java.lang.String r7 = "<html"
            r17 = r8
            r8 = 1
            boolean r6 = p000.q02.m4654(r6, r7, r8)     // Catch: java.lang.Throwable -> L178
            if (r6 != 0) goto L18e
            r2 = 2
            if (r14 < r2) goto La9
            r2 = r13[r17]     // Catch: java.lang.Throwable -> La2
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6 = 31
            if (r2 != r6) goto La9
            r2 = r13[r8]     // Catch: java.lang.Throwable -> La2
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6 = 139(0x8b, float:1.95E-43)
            if (r2 == r6) goto L9a
            goto La9
        L9a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = "响应是 gzip 压缩内容，不是可直接播放 MP4"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La2
            throw r0     // Catch: java.lang.Throwable -> La2
        La2:
            r0 = move-exception
            r1 = r22
            r7 = r16
            goto L1d1
        La9:
            if (r10 == 0) goto Lba
            java.lang.String r2 = "text/"
            r6 = r17
            boolean r2 = p000.x02.m6485(r10, r2, r6)     // Catch: java.lang.Throwable -> La2
            if (r2 == r8) goto Lb6
            goto Lba
        Lb6:
            r11 = r16
            goto L17c
        Lba:
            java.lang.String r2 = "application/json"
            boolean r2 = p000.ln0.m3626(r10, r2)     // Catch: java.lang.Throwable -> L178
            if (r2 != 0) goto Lb6
            if (r10 == 0) goto Lcd
            java.lang.String r2 = "mpegurl"
            r6 = 0
            boolean r2 = p000.q02.m4654(r10, r2, r6)     // Catch: java.lang.Throwable -> La2
            if (r2 == r8) goto Lb6
        Lcd:
            java.lang.String r2 = "image/"
            if (r10 == 0) goto Ld9
            r6 = 0
            boolean r3 = p000.x02.m6485(r10, r2, r6)     // Catch: java.lang.Throwable -> La2
            if (r3 == r8) goto Le3
            goto Lda
        Ld9:
            r6 = 0
        Lda:
            if (r15 == 0) goto Lfd
            boolean r2 = p000.x02.m6485(r15, r2, r6)     // Catch: java.lang.Throwable -> La2
            if (r2 == r8) goto Le3
            goto Lfd
        Le3:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r1.<init>(r4)     // Catch: java.lang.Throwable -> La2
            r1.append(r10)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = " magic="
            r1.append(r2)     // Catch: java.lang.Throwable -> La2
            r1.append(r15)     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La2
            throw r0     // Catch: java.lang.Throwable -> La2
        Lfd:
            if (r10 == 0) goto L113
            java.lang.String r2 = "audio/"
            r6 = 0
            boolean r2 = p000.x02.m6485(r10, r2, r6)     // Catch: java.lang.Throwable -> La2
            if (r2 == r8) goto L109
            goto L113
        L109:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> La2
            java.lang.String r0 = r0.concat(r10)     // Catch: java.lang.Throwable -> La2
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La2
            throw r1     // Catch: java.lang.Throwable -> La2
        L113:
            boolean r0 = p000.ln0.m3626(r15, r1)     // Catch: java.lang.Throwable -> L178
            if (r0 != 0) goto L12d
            boolean r0 = p000.ln0.m3626(r10, r1)     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L12d
            java.lang.String r0 = "application/octet-stream"
            boolean r0 = p000.ln0.m3626(r10, r0)     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L143
            boolean r0 = p000.jx0.m3023(r23)     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L143
        L12d:
            r13 = r11
            r11 = r16
            r16 = r13
            r12 = r24
            r13 = r25
            r14 = r26
            r15 = r27
            r18 = r28
            r19 = r29
            r20 = r30
            r21 = r31
            goto L169
        L143:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = m4977(r13, r14)     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r2.<init>(r5)     // Catch: java.lang.Throwable -> La2
            r2.append(r9)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = ", magic="
            r2.append(r3)     // Catch: java.lang.Throwable -> La2
            r2.append(r15)     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = ", head="
            r2.append(r3)     // Catch: java.lang.Throwable -> La2
            r2.append(r1)     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> La2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La2
            throw r0     // Catch: java.lang.Throwable -> La2
        L169:
            m4983(r11, r12, r13, r14, r15, r16, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L173
            r11.close()     // Catch: java.lang.Throwable -> L16f
        L16f:
            r22.m6283()
            return
        L173:
            r0 = move-exception
        L174:
            r1 = r22
            r7 = r11
            goto L1d1
        L178:
            r0 = move-exception
            r11 = r16
            goto L174
        L17c:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L173
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L173
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L173
            r1.append(r9)     // Catch: java.lang.Throwable -> L173
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L173
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L173
            throw r0     // Catch: java.lang.Throwable -> L173
        L18e:
            r11 = r16
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L173
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L173
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L173
            r1.append(r10)     // Catch: java.lang.Throwable -> L173
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L173
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L173
            throw r0     // Catch: java.lang.Throwable -> L173
        L1a2:
            r11 = r16
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L173
            java.lang.String r1 = "响应是 m3u8 播放列表，不是 MP4"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L173
            throw r0     // Catch: java.lang.Throwable -> L173
        L1ac:
            r0 = move-exception
        L1ad:
            r11 = r7
        L1ae:
            r1 = r22
            goto L1d1
        L1b1:
            r0 = move-exception
            r22 = r6
            goto L1ad
        L1b5:
            r22 = r6
            r11 = r7
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L173
            java.lang.String r1 = "视频内容为空"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L173
            throw r0     // Catch: java.lang.Throwable -> L173
        L1c0:
            r22 = r6
            r11 = r7
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L173
            java.lang.String r1 = "输入流不支持 mark/reset"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L173
            throw r0     // Catch: java.lang.Throwable -> L173
        L1cb:
            r0 = move-exception
            r22 = r6
            goto L1ae
        L1cf:
            r0 = move-exception
            r1 = r7
        L1d1:
            r24.close()     // Catch: java.lang.Throwable -> L1d4
        L1d4:
            throw r0     // Catch: java.lang.Throwable -> L1d5
        L1d5:
            r0 = move-exception
            if (r7 == 0) goto L1db
            r7.close()     // Catch: java.lang.Throwable -> L1db
        L1db:
            if (r1 == 0) goto L1e0
            r1.m6283()
        L1e0:
            throw r0
        L1e1:
            r24.close()     // Catch: java.lang.Throwable -> L1e4
        L1e4:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = m5015(r22, r23)
            java.lang.String r2 = "候选地址不是可直接保存的 MP4 视频: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: З */
    public final void m5028(p000.ky0 r6, java.io.OutputStream r7) {
            r5 = this;
            java.lang.String r0 = r6.f6318
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L19
        Lb:
            java.io.BufferedInputStream r3 = r6.f6311     // Catch: java.lang.Throwable -> L19
            int r3 = r3.read(r2)     // Catch: java.lang.Throwable -> L19
            r4 = -1
            if (r3 == r4) goto L1c
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L19
            goto Lb
        L19:
            r5 = move-exception
            goto La2
        L1c:
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L19
            r1.close()
            r2.getClass()
            int r1 = r2.length
            if (r1 == 0) goto L9a
            android.graphics.Bitmap r1 = m4986(r5, r2)     // Catch: java.lang.Throwable -> L87
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L6d
            r3 = 95
            boolean r2 = r1.compress(r2, r3, r7)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L6f
            r7.flush()     // Catch: java.lang.Throwable -> L6d
            r7.close()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = "DYHelper"
            java.lang.String r6 = r6.f6309     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = m5015(r5, r6)     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r6.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r2 = "[IMG-TRANSCODE] "
            r6.append(r2)     // Catch: java.lang.Throwable -> L6b
            r6.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = " -> image/jpeg, url="
            r6.append(r0)     // Catch: java.lang.Throwable -> L6b
            r6.append(r5)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L6b
            p000.C0888ux.m5975(r7, r5)     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r1.isRecycled()
            if (r5 != 0) goto L6a
            r1.recycle()
        L6a:
            return
        L6b:
            r5 = move-exception
            goto L7d
        L6d:
            r5 = move-exception
            goto L77
        L6f:
            java.lang.Exception r5 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "JPEG 压缩失败"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6d
            throw r5     // Catch: java.lang.Throwable -> L6d
        L77:
            throw r5     // Catch: java.lang.Throwable -> L78
        L78:
            r6 = move-exception
            p000.AbstractC0978xb.m6584(r7, r5)     // Catch: java.lang.Throwable -> L6b
            throw r6     // Catch: java.lang.Throwable -> L6b
        L7d:
            boolean r6 = r1.isRecycled()
            if (r6 != 0) goto L86
            r1.recycle()
        L86:
            throw r5
        L87:
            r5 = move-exception
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r7 = "无法解码 "
            java.lang.String r1 = " 图片，已跳过: "
            java.lang.String r5 = p000.a12.m18(r7, r0, r1, r5)
            r6.<init>(r5)
            throw r6
        L9a:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r6 = "图片内容为空，无法转码"
            r5.<init>(r6)
            throw r5
        La2:
            throw r5     // Catch: java.lang.Throwable -> La3
        La3:
            r6 = move-exception
            p000.AbstractC0978xb.m6584(r1, r5)
            throw r6
    }

    /* JADX INFO: renamed from: И */
    public final void m5029(android.content.Context r20, android.net.Uri r21, java.lang.String r22) {
            r19 = this;
            r1 = r19
            r0 = r21
            r2 = r22
            java.lang.String r3 = "视频可播放校验失败: "
            java.lang.String r4 = "视频无有效尺寸 width="
            java.lang.String r5 = "[VIDEO-VALID] ok, mime="
            java.lang.String r6 = "MP4 无法解码首帧，疑似无视频帧/编码不兼容/特殊片段: "
            java.lang.String r7 = "视频无有效时长 duration="
            java.lang.String r8 = "文件不是视频 mime="
            android.media.MediaMetadataRetriever r9 = new android.media.MediaMetadataRetriever
            r9.<init>()
            r11 = r20
            r9.setDataSource(r11, r0)     // Catch: java.lang.Throwable -> L1e
            r11 = 0
            goto L31
        L1e:
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L173
            java.lang.String r12 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r0, r12)     // Catch: java.lang.Throwable -> L173
            if (r11 == 0) goto L16b
            java.io.FileDescriptor r0 = r11.getFileDescriptor()     // Catch: java.lang.Throwable -> L50
            r9.setDataSource(r0)     // Catch: java.lang.Throwable -> L50
        L31:
            r0 = 12
            java.lang.String r12 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L166
            r0 = 9
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L166
            r15 = 10
            if (r0 == 0) goto L54
            java.lang.Long r0 = p000.x02.m6489(r0, r15)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L54
            long r16 = r0.longValue()     // Catch: java.lang.Throwable -> L50
            r20 = r11
            r10 = r16
            goto L58
        L50:
            r0 = move-exception
            r10 = r11
            goto L175
        L54:
            r20 = r11
            r10 = 0
        L58:
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L6f
            r17 = 0
            r13 = 0
            if (r0 == 0) goto L74
            java.lang.Integer r0 = p000.x02.m6487(r0, r15)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L74
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L6f
            r14 = r0
            goto L75
        L6f:
            r0 = move-exception
        L70:
            r10 = r20
            goto L175
        L74:
            r14 = r13
        L75:
            r0 = 19
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L89
            java.lang.Integer r0 = p000.x02.m6487(r0, r15)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L89
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L6f
            r15 = r0
            goto L8a
        L89:
            r15 = r13
        L8a:
            if (r12 == 0) goto La6
            boolean r0 = p000.q02.m4671(r12)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L93
            goto La6
        L93:
            java.lang.String r0 = "video/"
            boolean r0 = p000.x02.m6485(r12, r0, r13)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L9c
            goto La6
        L9c:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r8.concat(r12)     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        La6:
            int r0 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r0 <= 0) goto L154
            if (r14 <= 0) goto L13a
            if (r15 <= 0) goto L13a
            r0 = 2
            r7 = r17
            android.graphics.Bitmap r0 = r9.getFrameAtTime(r7, r0)     // Catch: java.lang.Throwable -> Lb6
            goto Lbd
        Lb6:
            r0 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            r0 = r4
        Lbd:
            boolean r4 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto Lc2
            r0 = 0
        Lc2:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto Le3
            r7 = 300000(0x493e0, double:1.482197E-318)
            r0 = 3
            android.graphics.Bitmap r0 = r9.getFrameAtTime(r7, r0)     // Catch: java.lang.Throwable -> Lcf
            goto Ld6
        Lcf:
            r0 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L6f
            r0 = r4
        Ld6:
            boolean r4 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto Ldd
            r16 = 0
            goto Ldf
        Ldd:
            r16 = r0
        Ldf:
            r0 = r16
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L6f
        Le3:
            if (r0 == 0) goto L12c
            boolean r4 = r0.isRecycled()     // Catch: java.lang.Throwable -> L6f
            if (r4 != 0) goto Lee
            r0.recycle()     // Catch: java.lang.Throwable -> L6f
        Lee:
            java.lang.String r0 = "DYHelper"
            java.lang.String r1 = m5015(r1, r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L6f
            r2.append(r12)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = ", duration="
            r2.append(r4)     // Catch: java.lang.Throwable -> L6f
            r2.append(r10)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "ms, size="
            r2.append(r4)     // Catch: java.lang.Throwable -> L6f
            r2.append(r14)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "x"
            r2.append(r4)     // Catch: java.lang.Throwable -> L6f
            r2.append(r15)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = ", url="
            r2.append(r4)     // Catch: java.lang.Throwable -> L6f
            r2.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L6f
            p000.C0888ux.m5975(r0, r1)     // Catch: java.lang.Throwable -> L6f
            r9.release()     // Catch: java.lang.Throwable -> L126
        L126:
            if (r20 == 0) goto L12b
            r20.close()     // Catch: java.lang.Throwable -> L12b
        L12b:
            return
        L12c:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = m5015(r1, r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r6.concat(r1)     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L13a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L6f
            r1.append(r14)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = " height="
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f
            r1.append(r15)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L154:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L6f
            r1.append(r10)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L166:
            r0 = move-exception
            r20 = r11
            goto L70
        L16b:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L173
            java.lang.String r1 = "无法打开视频文件用于校验"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L173
            throw r0     // Catch: java.lang.Throwable -> L173
        L173:
            r0 = move-exception
            r10 = 0
        L175:
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L18b
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L18b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L18b
            r2.append(r0)     // Catch: java.lang.Throwable -> L18b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L18b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L18b
            throw r1     // Catch: java.lang.Throwable -> L18b
        L18b:
            r0 = move-exception
            r9.release()     // Catch: java.lang.Throwable -> L18f
        L18f:
            if (r10 == 0) goto L194
            r10.close()     // Catch: java.lang.Throwable -> L194
        L194:
            throw r0
    }

    /* JADX INFO: renamed from: К */
    public final void m5030(p000.C0228dy r29, java.io.OutputStream r30, p000.C0964wy r31, p000.C0568n r32) {
            r28 = this;
            r1 = r30
            java.lang.String r2 = "dispose"
            r0 = r29
            byte[] r0 = r0.f3323
            r3 = r31
            dz r3 = r3.f11894
            int r3 = r3.ordinal()
            if (r3 == 0) goto L340
            r5 = 1
            if (r3 == r5) goto L2f1
            r6 = 2
            if (r3 != r6) goto L2ed
            java.lang.String r3 = "getHeight"
            java.lang.String r6 = "getWidth"
            java.lang.String r7 = "~79044D3538AD43BD286720E4220A28BE7EDE3EA6695F9469A66D98AAFA17B052FD99C508"
            java.lang.String r7 = p000.jf0.m2957(r7)
            r8 = r32
            java.lang.Object r8 = r8.f7336
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            java.lang.Class r7 = java.lang.Class.forName(r7, r5, r8)
            java.lang.Class<byte[]> r8 = byte[].class
            java.lang.Class[] r8 = new java.lang.Class[]{r8}
            java.lang.String r9 = "create"
            java.lang.reflect.Method r7 = r7.getMethod(r9, r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r8 = 0
            java.lang.Object r7 = r7.invoke(r8, r0)
            if (r7 == 0) goto L2e7
            int r12 = p000.C0568n.m3916(r7, r6)     // Catch: java.lang.Throwable -> L2a4
            int r9 = p000.C0568n.m3916(r7, r3)     // Catch: java.lang.Throwable -> L2a4
            java.lang.String r0 = "getFrameCount"
            int r10 = p000.C0568n.m3916(r7, r0)     // Catch: java.lang.Throwable -> L2a4
            java.lang.String r0 = "getLoopCount"
            int r0 = p000.C0568n.m3916(r7, r0)     // Catch: java.lang.Throwable -> L2a4
            r11 = 65535(0xffff, float:9.1834E-41)
            r13 = 0
            int r11 = p000.j81.m2906(r0, r13, r11)     // Catch: java.lang.Throwable -> L2a4
            p000.C0568n.m3918(r12, r9, r10)     // Catch: java.lang.Throwable -> L2a4
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L77
            java.lang.String r14 = "getFrameDurations"
            java.lang.reflect.Method r0 = r0.getMethod(r14, r8)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r0.invoke(r7, r8)     // Catch: java.lang.Throwable -> L77
            boolean r14 = r0 instanceof int[]     // Catch: java.lang.Throwable -> L77
            if (r14 == 0) goto L79
            int[] r0 = (int[]) r0     // Catch: java.lang.Throwable -> L77
            goto L81
        L77:
            r0 = move-exception
            goto L7b
        L79:
            r0 = r8
            goto L81
        L7b:
            eo1 r14 = new eo1     // Catch: java.lang.Throwable -> L2a4
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L2a4
            r0 = r14
        L81:
            boolean r14 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L2a4
            if (r14 == 0) goto L86
            r0 = r8
        L86:
            r14 = r0
            int[] r14 = (int[]) r14     // Catch: java.lang.Throwable -> L2a4
            t3 r11 = p000.C0568n.m3919(r1, r12, r9, r11)     // Catch: java.lang.Throwable -> L2a4
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L2a4
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r12, r9, r0)     // Catch: java.lang.Throwable -> L2a4
            r15.getClass()     // Catch: java.lang.Throwable -> L2a4
            android.graphics.Bitmap r17 = android.graphics.Bitmap.createBitmap(r12, r9, r0)     // Catch: java.lang.Throwable -> L2a4
            r17.getClass()     // Catch: java.lang.Throwable -> L2a4
            r29 = 100
            android.graphics.Canvas r4 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L2a4
            r4.<init>(r15)     // Catch: java.lang.Throwable -> L2a4
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> L2a4
            r4.drawColor(r13, r0)     // Catch: java.lang.Throwable -> L2a4
            int r0 = r12 * r9
            r31 = r5
            int[] r5 = new int[r0]     // Catch: java.lang.Throwable -> L2a4
            int[] r8 = new int[r0]     // Catch: java.lang.Throwable -> L2a4
            r32 = r11
            r11 = r13
            r0 = 0
        Lb5:
            if (r11 >= r10) goto L266
            java.lang.Class r13 = r7.getClass()     // Catch: java.lang.Throwable -> L260
            r18 = r5
            java.lang.String r5 = "getFrame"
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L260
            r20 = r9
            java.lang.Class[] r9 = new java.lang.Class[]{r19}     // Catch: java.lang.Throwable -> L260
            java.lang.reflect.Method r5 = r13.getMethod(r5, r9)     // Catch: java.lang.Throwable -> L260
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L260
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L260
            java.lang.Object r5 = r5.invoke(r7, r9)     // Catch: java.lang.Throwable -> L260
            if (r5 == 0) goto L23d
            ue0 r21 = new ue0     // Catch: java.lang.Throwable -> L13b
            java.lang.String r9 = "getXOffset"
            int r22 = p000.C0568n.m3916(r5, r9)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r9 = "getYOffset"
            int r23 = p000.C0568n.m3916(r5, r9)     // Catch: java.lang.Throwable -> L13b
            int r24 = p000.C0568n.m3916(r5, r6)     // Catch: java.lang.Throwable -> L13b
            int r25 = p000.C0568n.m3916(r5, r3)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r9 = "isBlendWithPreviousFrame"
            boolean r26 = p000.C0568n.m3915(r5, r9)     // Catch: java.lang.Throwable -> L13b
            java.lang.String r9 = "shouldDisposeToBackgroundColor"
            boolean r27 = p000.C0568n.m3915(r5, r9)     // Catch: java.lang.Throwable -> L13b
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch: java.lang.Throwable -> L13b
            r19 = r3
            r9 = r21
            r13 = r22
            r3 = r23
            if (r0 == 0) goto L13d
            r21 = r6
            boolean r6 = r0.f10716     // Catch: java.lang.Throwable -> L13b
            if (r6 == 0) goto L10f
            goto L110
        L10f:
            r0 = 0
        L110:
            if (r0 == 0) goto L136
            r4.save()     // Catch: java.lang.Throwable -> L13b
            int r6 = r0.f10711     // Catch: java.lang.Throwable -> L13b
            r22 = r10
            int r10 = r0.f10712     // Catch: java.lang.Throwable -> L13b
            r23 = r11
            int r11 = r0.f10713     // Catch: java.lang.Throwable -> L13b
            int r11 = r11 + r6
            int r0 = r0.f10714     // Catch: java.lang.Throwable -> L13b
            int r0 = r0 + r10
            r4.clipRect(r6, r10, r11, r0)     // Catch: java.lang.Throwable -> L13b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> L13b
            r6 = 0
            r4.drawColor(r6, r0)     // Catch: java.lang.Throwable -> L13b
            r4.restore()     // Catch: java.lang.Throwable -> L13b
            goto L140
        L130:
            r23 = r15
        L132:
            r9 = r17
            goto L22d
        L136:
            r22 = r10
            r23 = r11
            goto L140
        L13b:
            r0 = move-exception
            goto L130
        L13d:
            r21 = r6
            goto L136
        L140:
            if (r26 != 0) goto L156
            r4.save()     // Catch: java.lang.Throwable -> L13b
            int r0 = r13 + r24
            int r6 = r3 + r25
            r4.clipRect(r13, r3, r0, r6)     // Catch: java.lang.Throwable -> L13b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> L13b
            r6 = 0
            r4.drawColor(r6, r0)     // Catch: java.lang.Throwable -> L13b
            r4.restore()     // Catch: java.lang.Throwable -> L13b
            goto L157
        L156:
            r6 = 0
        L157:
            p000.C0568n.m3917(r5, r9, r4)     // Catch: java.lang.Throwable -> L13b
            r13 = 0
            r3 = r14
            r14 = 0
            r11 = 0
            r10 = r9
            r9 = r15
            r15 = r12
            r6 = r32
            r32 = r4
            r16 = r20
            r4 = r23
            r20 = r10
            r10 = r18
            r9.getPixels(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L228
            r23 = r9
            r9 = r10
            java.lang.Integer r24 = p000.jx0.m3024(r9, r8)     // Catch: java.lang.Throwable -> L225
            r13 = 0
            r14 = 0
            r11 = 0
            r15 = r12
            r10 = r8
            r8 = r9
            r9 = r17
            r9.setPixels(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L198
            if (r3 == 0) goto L19b
            if (r4 < 0) goto L190
            int r0 = r3.length     // Catch: java.lang.Throwable -> L198
            if (r4 >= r0) goto L190
            r0 = r3[r4]     // Catch: java.lang.Throwable -> L198
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L198
            goto L191
        L190:
            r0 = 0
        L191:
            if (r0 == 0) goto L19b
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L198
            goto L1bc
        L198:
            r0 = move-exception
            goto L22d
        L19b:
            java.lang.String r0 = "getDurationMs"
            int r0 = p000.C0568n.m3916(r5, r0)     // Catch: java.lang.Throwable -> L1a6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1a6
            goto L1ad
        L1a6:
            r0 = move-exception
            eo1 r11 = new eo1     // Catch: java.lang.Throwable -> L198
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L198
            r0 = r11
        L1ad:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r29)     // Catch: java.lang.Throwable -> L198
            boolean r13 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L198
            if (r13 == 0) goto L1b6
            r0 = r11
        L1b6:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L198
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L198
        L1bc:
            r11 = 10
            if (r0 >= r11) goto L1c1
            r0 = r11
        L1c1:
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L198
            r11 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r11
            int r0 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L198
            r6.f10150 = r0     // Catch: java.lang.Throwable -> L198
            if (r24 == 0) goto L1d7
            int r0 = r24.intValue()     // Catch: java.lang.Throwable -> L198
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L198
            r6.f10147 = r0     // Catch: java.lang.Throwable -> L198
        L1d7:
            boolean r0 = r6.m5595(r9)     // Catch: java.lang.Throwable -> L198
            if (r0 == 0) goto L203
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L1e9
            r11 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r2, r11)     // Catch: java.lang.Throwable -> L1e9
            r0.invoke(r5, r11)     // Catch: java.lang.Throwable -> L1e9
        L1e9:
            int r11 = r4 + 1
            r4 = r32
            r14 = r3
            r32 = r6
            r5 = r8
            r17 = r9
            r8 = r10
            r9 = r16
            r3 = r19
            r0 = r20
            r6 = r21
            r10 = r22
            r15 = r23
            r13 = 0
            goto Lb5
        L203:
            int r11 = r4 + 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L198
            r0.<init>()     // Catch: java.lang.Throwable -> L198
            java.lang.String r1 = "GIF 编码器写入第 "
            r0.append(r1)     // Catch: java.lang.Throwable -> L198
            r0.append(r11)     // Catch: java.lang.Throwable -> L198
            java.lang.String r1 = " 帧失败"
            r0.append(r1)     // Catch: java.lang.Throwable -> L198
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L198
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L198
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L198
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L198
            throw r1     // Catch: java.lang.Throwable -> L198
        L225:
            r0 = move-exception
            goto L132
        L228:
            r0 = move-exception
            r23 = r9
            goto L132
        L22d:
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L239
            r11 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r2, r11)     // Catch: java.lang.Throwable -> L239
            r1.invoke(r5, r11)     // Catch: java.lang.Throwable -> L239
        L239:
            throw r0     // Catch: java.lang.Throwable -> L23a
        L23a:
            r0 = move-exception
            goto L2c7
        L23d:
            r4 = r11
            r23 = r15
            r9 = r17
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23a
            int r11 = r4 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23a
            r1.<init>()     // Catch: java.lang.Throwable -> L23a
            java.lang.String r3 = "宿主 WebP 第 "
            r1.append(r3)     // Catch: java.lang.Throwable -> L23a
            r1.append(r11)     // Catch: java.lang.Throwable -> L23a
            java.lang.String r3 = " 帧为空"
            r1.append(r3)     // Catch: java.lang.Throwable -> L23a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L23a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L23a
            throw r0     // Catch: java.lang.Throwable -> L23a
        L260:
            r0 = move-exception
            r23 = r15
            r9 = r17
            goto L2c7
        L266:
            r6 = r32
            r23 = r15
            r9 = r17
            boolean r0 = r6.f10151     // Catch: java.lang.Throwable -> L23a
            if (r0 != 0) goto L272
            r13 = 0
            goto L298
        L272:
            r3 = 0
            r6.f10151 = r3     // Catch: java.lang.Throwable -> L23a
            java.io.OutputStream r0 = r6.f10152     // Catch: java.lang.Throwable -> L23a java.io.IOException -> L285
            r3 = 59
            r0.write(r3)     // Catch: java.lang.Throwable -> L23a java.io.IOException -> L285
            java.io.OutputStream r0 = r6.f10152     // Catch: java.lang.Throwable -> L23a java.io.IOException -> L285
            r0.flush()     // Catch: java.lang.Throwable -> L23a java.io.IOException -> L285
            r13 = r31
        L283:
            r3 = 0
            goto L287
        L285:
            r13 = 0
            goto L283
        L287:
            r6.f10148 = r3     // Catch: java.lang.Throwable -> L23a
            r11 = 0
            r6.f10152 = r11     // Catch: java.lang.Throwable -> L23a
            r6.f10153 = r11     // Catch: java.lang.Throwable -> L23a
            r6.f10154 = r11     // Catch: java.lang.Throwable -> L23a
            r6.f10155 = r11     // Catch: java.lang.Throwable -> L23a
            r6.f10157 = r11     // Catch: java.lang.Throwable -> L23a
            r3 = r31
            r6.f10161 = r3     // Catch: java.lang.Throwable -> L23a
        L298:
            if (r13 == 0) goto L2bf
            boolean r0 = r23.isRecycled()     // Catch: java.lang.Throwable -> L2a4
            if (r0 != 0) goto L2a6
            r23.recycle()     // Catch: java.lang.Throwable -> L2a4
            goto L2a6
        L2a4:
            r0 = move-exception
            goto L2da
        L2a6:
            boolean r0 = r9.isRecycled()     // Catch: java.lang.Throwable -> L2a4
            if (r0 != 0) goto L2af
            r9.recycle()     // Catch: java.lang.Throwable -> L2a4
        L2af:
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L2bb
            r11 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r2, r11)     // Catch: java.lang.Throwable -> L2bb
            r0.invoke(r7, r11)     // Catch: java.lang.Throwable -> L2bb
        L2bb:
            r1.flush()
            return
        L2bf:
            java.lang.String r0 = "GIF 编码器结束输出失败"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23a
            throw r1     // Catch: java.lang.Throwable -> L23a
        L2c7:
            boolean r1 = r23.isRecycled()     // Catch: java.lang.Throwable -> L2a4
            if (r1 != 0) goto L2d0
            r23.recycle()     // Catch: java.lang.Throwable -> L2a4
        L2d0:
            boolean r1 = r9.isRecycled()     // Catch: java.lang.Throwable -> L2a4
            if (r1 != 0) goto L2d9
            r9.recycle()     // Catch: java.lang.Throwable -> L2a4
        L2d9:
            throw r0     // Catch: java.lang.Throwable -> L2a4
        L2da:
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> L2e6
            r11 = 0
            java.lang.reflect.Method r1 = r1.getMethod(r2, r11)     // Catch: java.lang.Throwable -> L2e6
            r1.invoke(r7, r11)     // Catch: java.lang.Throwable -> L2e6
        L2e6:
            throw r0
        L2e7:
            java.lang.String r0 = "宿主 WebP 解码器未创建动画"
            p000.C1080.m7279(r0)
            return
        L2ed:
            p000.C1080.m7272()
            return
        L2f1:
            r29 = 100
            int r2 = r0.length
            if (r2 == 0) goto L338
            r2 = r28
            android.graphics.Bitmap r2 = m4986(r2, r0)     // Catch: java.lang.Throwable -> L327
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L313
            r3 = r29
            boolean r0 = r2.compress(r0, r3, r1)     // Catch: java.lang.Throwable -> L313
            if (r0 == 0) goto L315
            r1.flush()     // Catch: java.lang.Throwable -> L313
            boolean r0 = r2.isRecycled()
            if (r0 != 0) goto L312
            r2.recycle()
        L312:
            return
        L313:
            r0 = move-exception
            goto L31d
        L315:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L313
            java.lang.String r1 = "PNG 压缩失败"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L313
            throw r0     // Catch: java.lang.Throwable -> L313
        L31d:
            boolean r1 = r2.isRecycled()
            if (r1 != 0) goto L326
            r2.recycle()
        L326:
            throw r0
        L327:
            r0 = move-exception
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "无法解码静态表情，无法转为 PNG: "
            java.lang.String r2 = p000.lz1.m3687(r3, r2)
            r1.<init>(r2, r0)
            throw r1
        L338:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "图片内容为空，无法转码"
            r0.<init>(r1)
            throw r0
        L340:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            r0 = 65536(0x10000, float:9.1835E-41)
            p000.h62.m2364(r2, r1, r0)     // Catch: java.lang.Throwable -> L351
            r2.close()
            r1.flush()
            return
        L351:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L354
        L354:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r2, r1)
            throw r0
    }

    /* JADX INFO: renamed from: ж */
    public final int m5031() {
            r2 = this;
            monitor-enter(r2)
            int r0 = p000.qy0.f9159     // Catch: java.lang.Throwable -> L9
            int r1 = r0 + 1
            p000.qy0.f9159 = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    /* JADX INFO: renamed from: п */
    public final void m5032(android.content.Context r5, java.io.File r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r4 = this;
            boolean r0 = r6.exists()
            if (r0 == 0) goto L63
            long r0 = r6.length()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L63
            r0 = 0
            java.lang.String r1 = "video/mp4"
            android.net.Uri r0 = m4985(r5, r7, r8, r1, r9)     // Catch: java.lang.Throwable -> L47
            android.content.ContentResolver r7 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L47
            java.io.OutputStream r7 = r7.openOutputStream(r0)     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L57
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L47
            r9.<init>(r6)     // Catch: java.lang.Throwable -> L47
            r6 = 131072(0x20000, float:1.83671E-40)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L35
        L2a:
            int r1 = r9.read(r6)     // Catch: java.lang.Throwable -> L35
            if (r1 <= 0) goto L37
            r2 = 0
            r7.write(r6, r2, r1)     // Catch: java.lang.Throwable -> L35
            goto L2a
        L35:
            r4 = move-exception
            goto L4b
        L37:
            r7.flush()     // Catch: java.lang.Throwable -> L35
            r7.close()     // Catch: java.lang.Throwable -> L49
            r9.close()     // Catch: java.lang.Throwable -> L47
            r4.m5029(r5, r0, r8)     // Catch: java.lang.Throwable -> L47
            m4999(r5, r0)     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r4 = move-exception
            goto L5f
        L49:
            r4 = move-exception
            goto L51
        L4b:
            throw r4     // Catch: java.lang.Throwable -> L4c
        L4c:
            r6 = move-exception
            p000.AbstractC0978xb.m6584(r7, r4)     // Catch: java.lang.Throwable -> L49
            throw r6     // Catch: java.lang.Throwable -> L49
        L51:
            throw r4     // Catch: java.lang.Throwable -> L52
        L52:
            r6 = move-exception
            p000.AbstractC0978xb.m6584(r9, r4)     // Catch: java.lang.Throwable -> L47
            throw r6     // Catch: java.lang.Throwable -> L47
        L57:
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = "无法打开输出流"
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L47
            throw r4     // Catch: java.lang.Throwable -> L47
        L5f:
            m4987(r5, r0)
            throw r4
        L63:
            java.lang.Exception r4 = new java.lang.Exception
            java.lang.String r5 = "视频临时文件为空"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ц */
    public final void m5033(android.content.Context r9, java.io.File r10, java.lang.String r11) {
            r8 = this;
            boolean r0 = r10.isFile()
            if (r0 == 0) goto L11b
            boolean r0 = r10.canRead()
            if (r0 == 0) goto L11b
            r0 = 64
            byte[] r0 = new byte[r0]
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r10)
            int r2 = r1.read(r0)     // Catch: java.lang.Throwable -> L114
            r1.close()
            if (r2 <= 0) goto L10e
            java.lang.String r0 = p000.jx0.m3055(r0, r2)
            if (r0 != 0) goto L26
            java.lang.String r0 = "image/jpeg"
        L26:
            java.lang.String r1 = "image/"
            r2 = 0
            boolean r1 = p000.x02.m6485(r0, r1, r2)
            if (r1 == 0) goto L104
            r1 = 0
            if (r11 == 0) goto L46
            boolean r2 = p000.q02.m4671(r11)
            if (r2 != 0) goto L39
            goto L3a
        L39:
            r11 = r1
        L3a:
            if (r11 == 0) goto L46
            java.io.File r2 = new java.io.File
            r2.<init>(r11)
            java.lang.String r11 = r2.getName()
            goto L47
        L46:
            r11 = r1
        L47:
            java.lang.String r2 = ""
            if (r11 != 0) goto L4c
            r11 = r2
        L4c:
            java.lang.String r3 = r10.getName()
            r3.getClass()
            r4 = 46
            boolean r4 = p000.q02.m4655(r3, r4)
            if (r4 == 0) goto L5c
            goto L5d
        L5c:
            r3 = r1
        L5d:
            if (r3 != 0) goto L60
            goto L61
        L60:
            r2 = r3
        L61:
            boolean r3 = p000.q02.m4671(r11)
            if (r3 == 0) goto L68
            r11 = r2
        L68:
            boolean r2 = p000.q02.m4671(r11)
            java.lang.String r3 = "."
            java.lang.String r4 = "jpg"
            if (r2 == 0) goto L8e
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = p000.jx0.m3058(r0, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "comment_image_"
            r2.<init>(r7)
            r2.append(r5)
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
        L8e:
            java.lang.String r11 = p000.AbstractC0488ku.m3418(r11)
            java.lang.String r11 = p000.q02.m4691(r11, r11)
            java.lang.String r2 = p000.jx0.m3058(r0, r4)
            jy0 r4 = p000.jy0.f5659
            fv r8 = m5014(r8, r9, r1, r4, r11)
            java.lang.String r11 = "评论区图片"
            fv r8 = p000.pd2.m4481(r8, r11)
            java.lang.String r11 = r8.f4140
            java.lang.String r11 = p000.lz1.m3688(r11, r3, r2)
            java.lang.String r8 = r8.f4139     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r2 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch: java.lang.Throwable -> Ld8
            r2.getClass()     // Catch: java.lang.Throwable -> Ld8
            android.net.Uri r1 = m4985(r9, r8, r11, r0, r2)     // Catch: java.lang.Throwable -> Ld8
            android.content.ContentResolver r8 = r9.getContentResolver()     // Catch: java.lang.Throwable -> Ld8
            java.io.OutputStream r8 = r8.openOutputStream(r1)     // Catch: java.lang.Throwable -> Ld8
            if (r8 == 0) goto Le9
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lda
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Lda
            r10 = 65536(0x10000, float:9.1835E-41)
            p000.h62.m2364(r11, r8, r10)     // Catch: java.lang.Throwable -> Ldc
            r11.close()     // Catch: java.lang.Throwable -> Lda
            r8.flush()     // Catch: java.lang.Throwable -> Lda
            r8.close()     // Catch: java.lang.Throwable -> Ld8
            m4999(r9, r1)     // Catch: java.lang.Throwable -> Ld8
            return
        Ld8:
            r8 = move-exception
            goto Lf1
        Lda:
            r10 = move-exception
            goto Le3
        Ldc:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> Lde
        Lde:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r11, r10)     // Catch: java.lang.Throwable -> Lda
            throw r0     // Catch: java.lang.Throwable -> Lda
        Le3:
            throw r10     // Catch: java.lang.Throwable -> Le4
        Le4:
            r11 = move-exception
            p000.AbstractC0978xb.m6584(r8, r10)     // Catch: java.lang.Throwable -> Ld8
            throw r11     // Catch: java.lang.Throwable -> Ld8
        Le9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r10 = "评论区图片输出流为空"
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Ld8
            throw r8     // Catch: java.lang.Throwable -> Ld8
        Lf1:
            m4987(r9, r1)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = r8.getMessage()
            java.lang.String r11 = "评论区图片写入用户下载路径失败: "
            java.lang.String r10 = p000.lz1.m3687(r11, r10)
            r9.<init>(r10, r8)
            throw r9
        L104:
            java.lang.String r8 = "宿主评论图片格式无效: "
            java.lang.String r8 = r8.concat(r0)
            p000.C1080.m7266(r8)
            return
        L10e:
            java.lang.String r8 = "宿主评论图片临时文件为空"
            p000.C1080.m7275(r8)
            return
        L114:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L116
        L116:
            r9 = move-exception
            p000.AbstractC0978xb.m6584(r1, r8)
            throw r9
        L11b:
            java.lang.String r8 = "宿主评论图片临时文件不可读"
            p000.C1080.m7275(r8)
            return
    }

    /* JADX INFO: renamed from: ч */
    public final java.util.ArrayList m5034(android.content.Context r30, p000.C0276f8 r31, p000.ru0 r32, boolean r33, java.lang.String r34, java.lang.String r35, p000.C0299fv r36) {
            r29 = this;
            r1 = r29
            r2 = r30
            r0 = r32
            r7 = r34
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r3 = m4969(r30, r31)
            if (r36 != 0) goto L1d
            jy0 r4 = p000.jy0.f5663
            r5 = r31
            fv r3 = m5014(r1, r2, r5, r4, r3)
            r12 = r3
            goto L21
        L1d:
            r5 = r31
            r12 = r36
        L21:
            java.lang.String r3 = r12.f4140
            java.lang.String r4 = r0.f9516
            java.util.List r13 = r0.f9514
            java.util.List r10 = r0.f9515
            int r14 = r0.f9513
            boolean r0 = p000.q02.m4671(r4)
            if (r0 == 0) goto L39
            int r0 = r14 + 1
            java.lang.String r4 = "_page"
            java.lang.String r4 = p000.a12.m17(r4, r0)
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = p000.AbstractC0488ku.m3417(r0)
            r15 = 100
            java.lang.String r0 = p000.q02.m4693(r0, r15)
            boolean r3 = p000.q02.m4671(r0)
            if (r3 == 0) goto L62
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "livephoto_fallback_"
            java.lang.String r0 = p000.AbstractC0602nx.m4126(r3, r0)
        L62:
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "[LIVEPHOTO-MERGE-DOWNGRADE] page="
            r0.<init>(r4)
            r0.append(r14)
            java.lang.String r4 = ", reason="
            r0.append(r4)
            r4 = r35
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "DYHelper"
            p000.C0888ux.m5975(r4, r0)
            if (r7 == 0) goto L89
            java.lang.String r0 = "合并失败，降级保存原始资源"
            r6 = 90
            m4997(r6, r2, r7, r0)
        L89:
            java.util.Iterator r0 = r10.iterator()
            r16 = 0
            r6 = r16
        L91:
            boolean r8 = r0.hasNext()
            java.lang.String r9 = "/"
            r36 = r10
            r10 = 1
            if (r8 == 0) goto Le9
            int r6 = r6 + r10
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            mu r15 = m5012(r8)
            java.lang.String r15 = r15.f7273
            r35 = r10
            java.lang.String r10 = "_fallback_video."
            java.lang.String r10 = p000.lz1.m3688(r3, r10, r15)
            int r15 = r36.size()
            r17 = r0
            java.lang.String r0 = "降级视频 "
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r6, r15, r0, r9)
            r15 = r9
            java.lang.String r9 = r12.f4139
            r18 = r15
            r15 = r3
            r3 = r5
            r5 = r10
            r10 = r18
            r18 = r13
            r13 = r4
            r4 = r8
            r8 = r0
            r0 = r6
            r6 = r33
            boolean r4 = r1.m5020(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto Ld9
            r11.add(r5)
            goto Lf0
        Ld9:
            r5 = r31
            r7 = r34
            r10 = r36
            r6 = r0
            r4 = r13
            r3 = r15
            r0 = r17
            r13 = r18
            r15 = 100
            goto L91
        Le9:
            r15 = r3
            r35 = r10
            r18 = r13
            r13 = r4
            r10 = r9
        Lf0:
            java.util.Iterator r17 = r18.iterator()
        Lf4:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L349
            int r3 = r16 + 1
            java.lang.Object r0 = r17.next()
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "_fallback_image"
            java.lang.String r0 = r15.concat(r0)
            int r5 = r18.size()
            java.lang.String r6 = "降级图片 "
            java.lang.String r5 = p000.AbstractC0602nx.m4125(r3, r5, r6, r10)
            java.lang.String r6 = r12.f4139
            java.lang.String r7 = "[LIVEPHOTO-RAW-IMAGE-FAIL] url="
            java.lang.String r8 = "[LIVEPHOTO-RAW-IMAGE-DL] file="
            r16 = 0
            ky0 r9 = m5008(r4)     // Catch: java.lang.Throwable -> L2e5
            r31 = r0
            java.lang.String r0 = r9.f6318     // Catch: java.lang.Throwable -> L2df
            r34 = r3
            java.lang.String r3 = "image/"
            r36 = r5
            r5 = r35
            boolean r3 = p000.x02.m6485(r0, r3, r5)     // Catch: java.lang.Throwable -> L2c5
            if (r3 == 0) goto L133
            r3 = r0
            goto L135
        L133:
            r3 = r16
        L135:
            if (r3 != 0) goto L152
            java.lang.String r3 = r9.f6315     // Catch: java.lang.Throwable -> L13a
            goto L152
        L13a:
            r0 = move-exception
            r20 = r34
            r28 = r5
            r26 = r10
            r24 = r11
            r23 = r12
            r21 = r14
            r19 = r15
            r6 = r16
            r27 = 100
            r15 = r1
            r14 = r4
            r11 = r7
            goto L2fc
        L152:
            java.lang.String r5 = m5005(r3)     // Catch: java.lang.Throwable -> L2ae
            r19 = r7
            java.lang.String r7 = r9.f6316     // Catch: java.lang.Throwable -> L29a
            java.lang.String r3 = p000.jx0.m3058(r3, r7)     // Catch: java.lang.Throwable -> L29a
            java.lang.String r7 = p000.AbstractC0488ku.m3417(r31)     // Catch: java.lang.Throwable -> L29a
            r20 = r10
            r10 = 100
            java.lang.String r7 = p000.q02.m4693(r7, r10)     // Catch: java.lang.Throwable -> L28a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26f
            r10.<init>()     // Catch: java.lang.Throwable -> L26f
            r10.append(r7)     // Catch: java.lang.Throwable -> L26f
            java.lang.String r7 = "."
            r10.append(r7)     // Catch: java.lang.Throwable -> L26f
            r10.append(r3)     // Catch: java.lang.Throwable -> L26f
            java.lang.String r3 = r10.toString()     // Catch: java.lang.Throwable -> L26f
            java.lang.String r7 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L26f
            r7.getClass()     // Catch: java.lang.Throwable -> L26f
            android.net.Uri r6 = m4985(r2, r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L26f
            android.content.ContentResolver r7 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L236
            java.io.OutputStream r7 = r7.openOutputStream(r6)     // Catch: java.lang.Throwable -> L236
            if (r7 == 0) goto L250
            java.lang.String r10 = m5015(r1, r4)     // Catch: java.lang.Throwable -> L236
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21b
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L21b
            r1.append(r3)     // Catch: java.lang.Throwable -> L21b
            java.lang.String r8 = ", mime="
            r1.append(r8)     // Catch: java.lang.Throwable -> L21b
            r1.append(r5)     // Catch: java.lang.Throwable -> L21b
            java.lang.String r5 = ", sourceMime="
            r1.append(r5)     // Catch: java.lang.Throwable -> L21b
            r1.append(r0)     // Catch: java.lang.Throwable -> L21b
            java.lang.String r0 = ", url="
            r1.append(r0)     // Catch: java.lang.Throwable -> L21b
            r1.append(r10)     // Catch: java.lang.Throwable -> L21b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L21b
            p000.C0888ux.m5975(r13, r0)     // Catch: java.lang.Throwable -> L21b
            java.io.BufferedInputStream r0 = r9.f6311     // Catch: java.lang.Throwable -> L21b
            r1 = r3
            int r3 = r29.m5031()     // Catch: java.lang.Throwable -> L21b
            r8 = r6
            long r5 = r9.f6319     // Catch: java.lang.Throwable -> L1ff
            r10 = r9
            r9 = 0
            r21 = r8
            r8 = 0
            r22 = r10
            r10 = 0
            r25 = r1
            r1 = r7
            r24 = r11
            r23 = r12
            r11 = r19
            r26 = r20
            r12 = r21
            r27 = 100
            r28 = 1
            r7 = r33
            r20 = r34
            r21 = r14
            r19 = r15
            r15 = r29
            r14 = r4
            r4 = r36
            m4983(r0, r1, r2, r3, r4, r5, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1f9
            m4999(r2, r12)     // Catch: java.lang.Throwable -> L1f9
            m4979(r22)
            r0 = r25
            goto L323
        L1f9:
            r0 = move-exception
            r6 = r12
            r9 = r22
            goto L2fc
        L1ff:
            r0 = move-exception
            r22 = r9
            r24 = r11
            r23 = r12
            r21 = r14
            r11 = r19
            r26 = r20
            r27 = 100
            r28 = 1
            r20 = r34
            r14 = r4
            r12 = r8
            r19 = r15
            r15 = r29
            r6 = r12
            goto L2fc
        L21b:
            r0 = move-exception
            r22 = r9
            r24 = r11
            r23 = r12
            r21 = r14
            r11 = r19
            r26 = r20
            r27 = 100
            r28 = 1
            r20 = r34
            r14 = r4
            r12 = r6
            r19 = r15
            r15 = r29
            goto L2fc
        L236:
            r0 = move-exception
            r22 = r9
            r24 = r11
            r23 = r12
            r21 = r14
            r11 = r19
            r26 = r20
            r27 = 100
            r28 = 1
            r20 = r34
            r14 = r4
            r12 = r6
            r19 = r15
            r15 = r1
            goto L2fc
        L250:
            r22 = r9
            r24 = r11
            r23 = r12
            r21 = r14
            r11 = r19
            r26 = r20
            r27 = 100
            r28 = 1
            r20 = r34
            r14 = r4
            r12 = r6
            r19 = r15
            r15 = r1
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L1f9
            java.lang.String r1 = "无法打开输出流"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1f9
            throw r0     // Catch: java.lang.Throwable -> L1f9
        L26f:
            r0 = move-exception
            r22 = r9
            r24 = r11
            r23 = r12
            r21 = r14
            r11 = r19
            r26 = r20
            r27 = 100
        L27e:
            r28 = 1
            r20 = r34
        L282:
            r14 = r4
            r19 = r15
            r15 = r1
        L286:
            r6 = r16
            goto L2fc
        L28a:
            r0 = move-exception
            r22 = r9
            r27 = r10
            r24 = r11
            r23 = r12
            r21 = r14
            r11 = r19
            r26 = r20
            goto L27e
        L29a:
            r0 = move-exception
            r20 = r34
            r22 = r9
            r26 = r10
            r24 = r11
            r23 = r12
            r21 = r14
            r11 = r19
            r27 = 100
            r28 = 1
            goto L282
        L2ae:
            r0 = move-exception
            r20 = r34
            r22 = r9
            r26 = r10
            r24 = r11
            r23 = r12
            r21 = r14
            r19 = r15
            r27 = 100
            r28 = 1
        L2c1:
            r15 = r1
            r14 = r4
            r11 = r7
            goto L286
        L2c5:
            r0 = move-exception
            r20 = r34
            r28 = r5
        L2ca:
            r22 = r9
            r26 = r10
            r24 = r11
            r23 = r12
            r21 = r14
            r19 = r15
            r27 = 100
            goto L2c1
        L2d9:
            r0 = move-exception
            r20 = r34
            r28 = r35
            goto L2ca
        L2df:
            r0 = move-exception
            r28 = r35
            r20 = r3
            goto L2ca
        L2e5:
            r0 = move-exception
            r28 = r35
            r20 = r3
            r26 = r10
            r24 = r11
            r23 = r12
            r21 = r14
            r19 = r15
            r27 = 100
            r15 = r1
            r14 = r4
            r11 = r7
            r6 = r16
            r9 = r6
        L2fc:
            m4987(r2, r6)     // Catch: java.lang.Throwable -> L344
            java.lang.String r1 = m5015(r15, r14)     // Catch: java.lang.Throwable -> L344
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L344
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L344
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L344
            r3.append(r1)     // Catch: java.lang.Throwable -> L344
            java.lang.String r1 = ", err="
            r3.append(r1)     // Catch: java.lang.Throwable -> L344
            r3.append(r0)     // Catch: java.lang.Throwable -> L344
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L344
            p000.C0888ux.m5975(r13, r0)     // Catch: java.lang.Throwable -> L344
            m4979(r9)
            r0 = r16
        L323:
            if (r0 == 0) goto L32b
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L32e
        L32b:
            r1 = r24
            goto L334
        L32e:
            r1 = r24
            r1.add(r0)
            goto L34c
        L334:
            r11 = r1
            r1 = r15
            r15 = r19
            r16 = r20
            r14 = r21
            r12 = r23
            r10 = r26
            r35 = r28
            goto Lf4
        L344:
            r0 = move-exception
            m4979(r9)
            throw r0
        L349:
            r1 = r11
            r21 = r14
        L34c:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L36a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[LIVEPHOTO-MERGE-DOWNGRADE-EMPTY] page="
            r0.<init>(r2)
            r2 = r21
            r0.append(r2)
            java.lang.String r2 = ", 没有成功降级保存任何资源"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r13, r0)
        L36a:
            return r1
    }

    /* JADX INFO: renamed from: ш */
    public final java.util.ArrayList m5035(android.content.Context r4, p000.C0276f8 r5, boolean r6, java.lang.String r7, p000.C0299fv r8) {
            r3 = this;
            boolean r0 = m5016(r4)
            if (r0 == 0) goto L20
            java.util.ArrayList r3 = r3.m5037(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb
            return r3
        Lb:
            r0 = move-exception
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "[LIVEPHOTO-MERGE-DOWNGRADE-ALL] 合并整体失败，降级保存原始资源"
            p000.C0888ux.m5977(r1, r2, r0)
            if (r7 == 0) goto L1b
            java.lang.String r0 = "合并失败，降级保存原始资源"
            r1 = 0
            m4997(r1, r4, r7, r0)
        L1b:
            java.util.ArrayList r3 = r3.m5036(r4, r5, r6, r7, r8)
            return r3
        L20:
            java.util.ArrayList r3 = r3.m5036(r4, r5, r6, r7, r8)
            return r3
    }

    /* JADX INFO: renamed from: щ */
    public final java.util.ArrayList m5036(android.content.Context r31, p000.C0276f8 r32, boolean r33, java.lang.String r34, p000.C0299fv r35) {
            r30 = this;
            r1 = r30
            r2 = r31
            r3 = r32
            r7 = r34
            java.util.List r10 = m4971(r3)
            java.lang.String r11 = r3.f3800
            java.util.List r0 = m4968(r3)
            lu r4 = m4998()
            java.util.List r12 = p000.kn0.m3372(r3, r4)
            boolean r4 = r10.isEmpty()
            if (r4 == 0) goto L35
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L35
            boolean r4 = r12.isEmpty()
            if (r4 != 0) goto L2d
            goto L35
        L2d:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "未找到无水印动图资源"
            r0.<init>(r1)
            throw r0
        L35:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r4 = m4969(r31, r32)
            if (r35 != 0) goto L48
            jy0 r5 = p000.jy0.f5663
            fv r4 = m5014(r1, r2, r3, r5, r4)
            r14 = r4
            goto L4a
        L48:
            r14 = r35
        L4a:
            java.lang.String r15 = r14.f4140
            int r4 = r10.size()
            int r5 = r0.size()
            int r5 = r5 + r4
            boolean r4 = r0.isEmpty()
            r8 = 1
            if (r4 == 0) goto L64
            boolean r4 = r12.isEmpty()
            if (r4 != 0) goto L64
            r4 = r8
            goto L65
        L64:
            r4 = 0
        L65:
            int r5 = r5 + r4
            if (r5 >= r8) goto L6a
            r4 = r8
            goto L6b
        L6a:
            r4 = r5
        L6b:
            boolean r5 = r0.isEmpty()
            java.lang.String r6 = " 失败"
            r16 = 100
            java.lang.String r9 = ", url="
            r17 = r8
            java.lang.String r8 = "."
            r18 = r10
            java.lang.String r10 = "DYHelper"
            r19 = 0
            r20 = r12
            java.lang.String r12 = "/"
            if (r5 != 0) goto L162
            java.util.Iterator r20 = r0.iterator()
            r5 = 0
            r21 = 0
        L8c:
            boolean r22 = r20.hasNext()
            if (r22 == 0) goto L149
            int r5 = r5 + 1
            java.lang.Object r22 = r20.next()
            java.lang.String r22 = (java.lang.String) r22
            r23 = r0
            int r0 = r21 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r12)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            int r1 = r21 + 1
            if (r7 == 0) goto Ld0
            int r1 = r1 * 100
            r24 = r1
            r1 = r17
            if (r4 >= r1) goto Lbf
            r17 = r1
            goto Lc1
        Lbf:
            r17 = r4
        Lc1:
            int r1 = r24 / r17
            r3 = r16
            r16 = r4
            r4 = 0
            int r1 = p000.j81.m2906(r1, r4, r3)
            m4997(r1, r2, r7, r0)
            goto Ld5
        Ld0:
            r3 = r16
            r16 = r4
            r4 = 0
        Ld5:
            mu r0 = m5012(r22)
            int r1 = r23.size()
            java.lang.String r3 = "_anim"
            r4 = 1
            if (r1 <= r4) goto Le6
            java.lang.String r3 = p000.a12.m17(r3, r5)
        Le6:
            java.lang.String r0 = r0.f7273
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r3)
            r1.append(r8)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r1 = r23.size()
            java.lang.String r3 = "动图 "
            java.lang.String r1 = p000.AbstractC0602nx.m4125(r5, r1, r3, r12)
            r3 = r9
            java.lang.String r9 = r14.f4139
            r17 = r5
            r5 = r0
            r0 = r17
            r17 = r16
            r16 = r14
            r14 = r17
            r27 = r3
            r17 = r4
            r26 = r6
            r28 = r8
            r4 = r22
            r3 = r32
            r6 = r33
            r8 = r1
            r22 = r10
            r10 = 100
            r1 = r30
            boolean r4 = r1.m5020(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L133
            r13.add(r5)
        L133:
            int r21 = r21 + 1
            r3 = r32
            r5 = r0
            r4 = r14
            r14 = r16
            r0 = r23
            r6 = r26
            r9 = r27
            r8 = r28
            r16 = r10
            r10 = r22
            goto L8c
        L149:
            r28 = r8
            r22 = r10
            r10 = r16
            r16 = r14
            r14 = r4
            r4 = r6
            r8 = r7
            r29 = r9
            r23 = r10
            r24 = r11
            r9 = r16
            r6 = r21
            r10 = r22
            goto L32b
        L162:
            r26 = r6
            r28 = r8
            r27 = r9
            r22 = r10
            r10 = r16
            r16 = r14
            r14 = r4
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L31d
            r0 = 0
            int r0 = r0 + 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r12)
            r3.append(r14)
            java.lang.String r0 = r3.toString()
            r3 = 0
            int r3 = r3 + 1
            if (r7 == 0) goto L1a0
            int r3 = r3 * r10
            r4 = r17
            if (r14 >= r4) goto L196
            r8 = 1
            goto L197
        L196:
            r8 = r14
        L197:
            int r3 = r3 / r8
            r4 = 0
            int r3 = p000.j81.m2906(r3, r4, r10)
            m4997(r3, r2, r7, r0)
        L1a0:
            java.lang.String r3 = ".mp4"
            java.lang.String r4 = p000.AbstractC0602nx.m4129(r15, r3)
            java.util.Iterator r21 = r20.iterator()
            r0 = r19
            r6 = 0
        L1ad:
            boolean r5 = r21.hasNext()
            if (r5 == 0) goto L2f0
            r17 = 1
            int r5 = r6 + 1
            java.lang.Object r0 = r21.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = "dyhelper_livephoto_fallback_"
            java.io.File r8 = r2.getCacheDir()
            java.io.File r6 = java.io.File.createTempFile(r6, r3, r8)
            int r8 = r20.size()     // Catch: java.lang.Throwable -> L2aa
            java.lang.String r9 = m5015(r1, r0)     // Catch: java.lang.Throwable -> L2aa
            r23 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29e
            r10.<init>()     // Catch: java.lang.Throwable -> L29e
            r32 = r0
            java.lang.String r0 = "[LIVEPHOTO-VIDEO-DL] awemeId="
            r10.append(r0)     // Catch: java.lang.Throwable -> L29e
            r10.append(r11)     // Catch: java.lang.Throwable -> L29e
            java.lang.String r0 = ", candidate="
            r10.append(r0)     // Catch: java.lang.Throwable -> L29e
            r10.append(r5)     // Catch: java.lang.Throwable -> L29e
            r10.append(r12)     // Catch: java.lang.Throwable -> L29e
            r10.append(r8)     // Catch: java.lang.Throwable -> L29e
            r8 = r27
            r10.append(r8)     // Catch: java.lang.Throwable -> L291
            r10.append(r9)     // Catch: java.lang.Throwable -> L291
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L291
            r10 = r22
            p000.C0888ux.m5975(r10, r0)     // Catch: java.lang.Throwable -> L284
            r6.getClass()     // Catch: java.lang.Throwable -> L284
            int r0 = r1.m5031()     // Catch: java.lang.Throwable -> L284
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L284
            r9.<init>()     // Catch: java.lang.Throwable -> L284
            r22 = r0
            java.lang.String r0 = "动图视频："
            r9.append(r0)     // Catch: java.lang.Throwable -> L284
            r9.append(r4)     // Catch: java.lang.Throwable -> L284
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L284
            r27 = r8
            ig r8 = new ig     // Catch: java.lang.Throwable -> L276
            r9 = 18
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L276
            ig r9 = new ig     // Catch: java.lang.Throwable -> L276
            r24 = r0
            r0 = 19
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L276
            r1 = r22
            r22 = r4
            r4 = r1
            r1 = r11
            r11 = r5
            r5 = r24
            r24 = r1
            r1 = r2
            r25 = r3
            r3 = r6
            r29 = r27
            r2 = r32
            r6 = r33
            m4958(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L26c
            r8 = r7
            r9 = r16
            java.lang.String r4 = r9.f4139     // Catch: java.lang.Throwable -> L263
            java.lang.String r6 = android.os.Environment.DIRECTORY_MOVIES     // Catch: java.lang.Throwable -> L263
            r6.getClass()     // Catch: java.lang.Throwable -> L263
            r1 = r30
            r2 = r31
            r5 = r22
            r1.m5032(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L260
            r13.add(r5)     // Catch: java.lang.Throwable -> L260
            r3.delete()
            r4 = r26
            goto L317
        L260:
            r0 = move-exception
            goto L2b2
        L263:
            r0 = move-exception
            r1 = r30
            r2 = r31
            r5 = r22
            goto L2b2
        L26c:
            r0 = move-exception
            r2 = r1
            r8 = r7
            r9 = r16
            r5 = r22
            r1 = r30
            goto L2b2
        L276:
            r0 = move-exception
            r25 = r3
            r3 = r6
            r8 = r7
            r24 = r11
            r9 = r16
        L27f:
            r29 = r27
            r11 = r5
        L282:
            r5 = r4
            goto L2b2
        L284:
            r0 = move-exception
            r25 = r3
            r3 = r6
            r29 = r8
            r24 = r11
            r9 = r16
        L28e:
            r11 = r5
            r8 = r7
            goto L282
        L291:
            r0 = move-exception
            r25 = r3
            r3 = r6
            r29 = r8
            r24 = r11
            r9 = r16
            r10 = r22
            goto L28e
        L29e:
            r0 = move-exception
            r25 = r3
            r3 = r6
            r8 = r7
        L2a3:
            r24 = r11
            r9 = r16
            r10 = r22
            goto L27f
        L2aa:
            r0 = move-exception
            r25 = r3
            r3 = r6
            r8 = r7
            r23 = r10
            goto L2a3
        L2b2:
            int r4 = r20.size()     // Catch: java.lang.Throwable -> L2eb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2eb
            r6.<init>()     // Catch: java.lang.Throwable -> L2eb
            java.lang.String r7 = "[LIVEPHOTO-VIDEO-RETRY] 候选 "
            r6.append(r7)     // Catch: java.lang.Throwable -> L2eb
            r6.append(r11)     // Catch: java.lang.Throwable -> L2eb
            r6.append(r12)     // Catch: java.lang.Throwable -> L2eb
            r6.append(r4)     // Catch: java.lang.Throwable -> L2eb
            r4 = r26
            r6.append(r4)     // Catch: java.lang.Throwable -> L2eb
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2eb
            p000.C0888ux.m5977(r10, r6, r0)     // Catch: java.lang.Throwable -> L2eb
            r3.delete()
            r26 = r4
            r4 = r5
            r7 = r8
            r16 = r9
            r22 = r10
            r6 = r11
            r10 = r23
            r11 = r24
            r3 = r25
            r27 = r29
            goto L1ad
        L2eb:
            r0 = move-exception
            r3.delete()
            throw r0
        L2f0:
            r8 = r7
            r23 = r10
            r24 = r11
            r9 = r16
            r10 = r22
            r4 = r26
            r29 = r27
            boolean r3 = r18.isEmpty()
            if (r3 == 0) goto L317
            java.lang.Exception r1 = new java.lang.Exception
            if (r0 == 0) goto L30b
            java.lang.String r19 = r0.getMessage()
        L30b:
            r0 = r19
            java.lang.String r2 = "动图视频全部候选下载失败: "
            java.lang.String r0 = p000.lz1.m3687(r2, r0)
            r1.<init>(r0)
            throw r1
        L317:
            r0 = 0
            r17 = 1
            int r6 = r0 + 1
            goto L32b
        L31d:
            r8 = r7
            r23 = r10
            r24 = r11
            r9 = r16
            r10 = r22
            r4 = r26
            r29 = r27
            r6 = 0
        L32b:
            java.util.Iterator r11 = r18.iterator()
            r16 = r6
            r6 = 0
        L332:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L527
            int r3 = r6 + 1
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            int r5 = r16 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r12)
            r6.append(r14)
            java.lang.String r5 = r6.toString()
            int r6 = r16 + 1
            if (r8 == 0) goto L36e
            int r6 = r6 * 100
            r7 = 1
            if (r14 >= r7) goto L35f
            r7 = 1
            goto L360
        L35f:
            r7 = r14
        L360:
            int r6 = r6 / r7
            r32 = r11
            r7 = r23
            r11 = 0
            int r6 = p000.j81.m2906(r6, r11, r7)
            m4997(r6, r2, r8, r5)
            goto L371
        L36e:
            r32 = r11
            r11 = 0
        L371:
            ky0 r5 = m5008(r0)     // Catch: java.lang.Throwable -> L4ee
            int r6 = r18.size()     // Catch: java.lang.Throwable -> L4e9
            java.lang.String r7 = "_image"
            r11 = 1
            if (r6 <= r11) goto L39e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38e
            r6.<init>()     // Catch: java.lang.Throwable -> L38e
            r6.append(r7)     // Catch: java.lang.Throwable -> L38e
            r6.append(r3)     // Catch: java.lang.Throwable -> L38e
            java.lang.String r7 = r6.toString()     // Catch: java.lang.Throwable -> L38e
            goto L39e
        L38e:
            r0 = move-exception
            r1 = r2
        L390:
            r22 = r9
            r20 = r14
            r21 = r15
            r27 = r29
            r14 = r3
            r15 = r4
        L39a:
            r4 = r19
            goto L4fd
        L39e:
            java.lang.String r6 = r5.f6316     // Catch: java.lang.Throwable -> L4e9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e9
            r11.<init>()     // Catch: java.lang.Throwable -> L4e9
            r11.append(r15)     // Catch: java.lang.Throwable -> L4e9
            r11.append(r7)     // Catch: java.lang.Throwable -> L4e9
            r7 = r28
            r11.append(r7)     // Catch: java.lang.Throwable -> L4e2
            r11.append(r6)     // Catch: java.lang.Throwable -> L4e2
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L4e2
            java.lang.String r6 = r9.f4139     // Catch: java.lang.Throwable -> L4e2
            r26 = r4
            java.lang.String r4 = r5.f6315     // Catch: java.lang.Throwable -> L4dc
            r28 = r7
            java.lang.String r7 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L4cc
            r7.getClass()     // Catch: java.lang.Throwable -> L4cc
            android.net.Uri r4 = m4985(r2, r6, r11, r4, r7)     // Catch: java.lang.Throwable -> L4cc
            android.content.ContentResolver r6 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L4b3
            java.io.OutputStream r6 = r6.openOutputStream(r4)     // Catch: java.lang.Throwable -> L4b3
            if (r6 == 0) goto L4b6
            int r7 = r18.size()     // Catch: java.lang.Throwable -> L4b3
            java.lang.String r2 = r5.f6315     // Catch: java.lang.Throwable -> L4a1
            r20 = r4
            java.lang.String r4 = r5.f6316     // Catch: java.lang.Throwable -> L48f
            java.lang.String r0 = m5015(r1, r0)     // Catch: java.lang.Throwable -> L48f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48f
            r1.<init>()     // Catch: java.lang.Throwable -> L48f
            r21 = r5
            java.lang.String r5 = "[LIVEPHOTO-IMAGE-DL] awemeId="
            r1.append(r5)     // Catch: java.lang.Throwable -> L47d
            r5 = r24
            r1.append(r5)     // Catch: java.lang.Throwable -> L489
            r24 = r5
            java.lang.String r5 = ", idx="
            r1.append(r5)     // Catch: java.lang.Throwable -> L47d
            r1.append(r3)     // Catch: java.lang.Throwable -> L47d
            r1.append(r12)     // Catch: java.lang.Throwable -> L47d
            r1.append(r7)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r5 = ", mime="
            r1.append(r5)     // Catch: java.lang.Throwable -> L47d
            r1.append(r2)     // Catch: java.lang.Throwable -> L47d
            java.lang.String r2 = ", ext="
            r1.append(r2)     // Catch: java.lang.Throwable -> L47d
            r1.append(r4)     // Catch: java.lang.Throwable -> L47d
            r2 = r29
            r1.append(r2)     // Catch: java.lang.Throwable -> L46a
            r1.append(r0)     // Catch: java.lang.Throwable -> L46a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L46a
            p000.C0888ux.m5975(r10, r0)     // Catch: java.lang.Throwable -> L46a
            int r5 = r30.m5031()     // Catch: java.lang.Throwable -> L46a
            int r0 = r18.size()     // Catch: java.lang.Throwable -> L46a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L46a
            r1.<init>()     // Catch: java.lang.Throwable -> L46a
            java.lang.String r4 = "动图图片 "
            r1.append(r4)     // Catch: java.lang.Throwable -> L46a
            r1.append(r3)     // Catch: java.lang.Throwable -> L46a
            r1.append(r12)     // Catch: java.lang.Throwable -> L46a
            r1.append(r0)     // Catch: java.lang.Throwable -> L46a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L46a
            r1 = r30
            r4 = r31
            r7 = r33
            r27 = r2
            r22 = r9
            r9 = r20
            r2 = r21
            r20 = r14
            r21 = r15
            r15 = r26
            r14 = r3
            r3 = r6
            r6 = r0
            r1.m5022(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L467
            r1 = r4
            m4999(r1, r9)     // Catch: java.lang.Throwable -> L462
            r13.add(r11)     // Catch: java.lang.Throwable -> L462
            goto L510
        L462:
            r0 = move-exception
        L463:
            r5 = r2
        L464:
            r4 = r9
            goto L4fd
        L467:
            r0 = move-exception
            r1 = r4
            goto L463
        L46a:
            r0 = move-exception
            r1 = r31
            r27 = r2
            r22 = r9
            r9 = r20
            r2 = r21
        L475:
            r20 = r14
            r21 = r15
            r15 = r26
            r14 = r3
            goto L463
        L47d:
            r0 = move-exception
            r1 = r31
        L480:
            r22 = r9
            r9 = r20
            r2 = r21
            r27 = r29
            goto L475
        L489:
            r0 = move-exception
            r1 = r31
            r24 = r5
            goto L480
        L48f:
            r0 = move-exception
            r1 = r31
            r2 = r5
            r22 = r9
            r21 = r15
            r9 = r20
            r15 = r26
            r27 = r29
            r20 = r14
            r14 = r3
            goto L464
        L4a1:
            r0 = move-exception
            r1 = r31
        L4a4:
            r2 = r5
            r22 = r9
            r20 = r14
            r21 = r15
            r15 = r26
            r27 = r29
            r14 = r3
            r9 = r4
            goto L4fd
        L4b3:
            r0 = move-exception
            r1 = r2
            goto L4a4
        L4b6:
            r1 = r2
            r2 = r5
            r22 = r9
            r20 = r14
            r21 = r15
            r15 = r26
            r27 = r29
            r14 = r3
            r9 = r4
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L462
            java.lang.String r3 = "无法打开输出流"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L462
            throw r0     // Catch: java.lang.Throwable -> L462
        L4cc:
            r0 = move-exception
            r1 = r2
            r2 = r5
        L4cf:
            r22 = r9
            r20 = r14
            r21 = r15
            r15 = r26
            r27 = r29
            r14 = r3
            goto L39a
        L4dc:
            r0 = move-exception
            r1 = r2
            r2 = r5
            r28 = r7
            goto L4cf
        L4e2:
            r0 = move-exception
            r1 = r2
            r2 = r5
            r28 = r7
            goto L390
        L4e9:
            r0 = move-exception
            r1 = r2
            r2 = r5
            goto L390
        L4ee:
            r0 = move-exception
            r1 = r2
            r22 = r9
            r20 = r14
            r21 = r15
            r27 = r29
            r14 = r3
            r15 = r4
            r4 = r19
            r5 = r4
        L4fd:
            m4987(r1, r4)
            m4979(r5)
            int r2 = r18.size()
            java.lang.String r3 = "[LIVEPHOTO-IMAGE-FAIL] 图片 "
            java.lang.String r2 = p000.AbstractC0602nx.m4128(r3, r14, r12, r2, r15)
            p000.C0888ux.m5977(r10, r2, r0)
        L510:
            int r16 = r16 + 1
            r11 = r32
            r2 = r1
            r6 = r14
            r4 = r15
            r14 = r20
            r15 = r21
            r9 = r22
            r29 = r27
            r17 = 1
            r23 = 100
            r1 = r30
            goto L332
        L527:
            r1 = r2
            if (r8 == 0) goto L531
            java.lang.String r0 = "下载完成"
            r10 = 100
            m4997(r10, r1, r8, r0)
        L531:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L538
            return r13
        L538:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "动图资源下载失败：没有成功保存任何文件"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: э */
    public final java.util.ArrayList m5037(android.content.Context r30, p000.C0276f8 r31, boolean r32, java.lang.String r33, p000.C0299fv r34) {
            r29 = this;
            r1 = r30
            r2 = r31
            r3 = r33
            java.util.List r17 = m4970(r2)
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L234
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r18 = r17.iterator()
            r6 = 0
            r0 = r6
        L20:
            boolean r7 = r18.hasNext()
            java.lang.String r8 = "DYHelper"
            if (r7 == 0) goto L1e4
            int r7 = r0 + 1
            java.lang.Object r9 = r18.next()
            ru0 r9 = (p000.ru0) r9
            int r10 = r17.size()
            r11 = 1
            if (r10 <= r11) goto L55
            if (r3 == 0) goto L55
            int r10 = r17.size()
            java.lang.String r11 = "正在合并动图 "
            java.lang.String r12 = "/"
            java.lang.String r10 = p000.AbstractC0602nx.m4125(r7, r10, r11, r12)
            int r0 = r0 * 100
            int r11 = r17.size()
            int r0 = r0 / r11
            r11 = 100
            int r0 = p000.j81.m2906(r0, r6, r11)
            m4997(r0, r1, r3, r10)
        L55:
            java.lang.String r0 = r9.f9516
            r10 = r5
            java.util.List r5 = r9.f9515
            boolean r11 = p000.q02.m4671(r0)
            r12 = 0
            if (r11 != 0) goto L62
            goto L63
        L62:
            r0 = r12
        L63:
            java.lang.String r19 = ""
            if (r0 != 0) goto L69
            r0 = r19
        L69:
            java.util.List r11 = r9.f9514
            java.lang.Object r13 = p000.AbstractC0984xh.m6640(r11)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = r2.f3793
            java.lang.String r14 = m4972(r0, r14)
            java.lang.String r15 = r2.f3794
            java.lang.String r15 = m4972(r0, r15)
            java.lang.String r6 = r2.f3800
            if (r6 == 0) goto L86
            java.lang.String r0 = m4972(r0, r6)
            goto L87
        L86:
            r0 = r12
        L87:
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L8f
            r6 = r11
            goto L90
        L8f:
            r6 = r12
        L90:
            java.lang.Object r20 = p000.AbstractC0984xh.m6640(r5)
            java.lang.String r20 = (java.lang.String) r20
            boolean r21 = r11.isEmpty()
            if (r21 != 0) goto La0
        L9c:
            r21 = r4
            r4 = r15
            goto La2
        La0:
            r11 = r12
            goto L9c
        La2:
            r15 = -1073741968(0xffffffffbfffff70, float:-1.9999828)
            r22 = 0
            r16 = 7809(0x1e81, float:1.0943E-41)
            r23 = r8
            r8 = 0
            r3 = r14
            r14 = 0
            r24 = r10
            r10 = r13
            r13 = r11
            r11 = r10
            r25 = r12
            r12 = r5
            r1 = r9
            r9 = r20
            r26 = r21
            r28 = r23
            r27 = r24
            r20 = r7
            r7 = r0
            r0 = r25
            f8 r3 = p000.C0276f8.m2043(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r12 = r1.f9516
            int r9 = r1.f9513
            r8 = r34
            if (r34 == 0) goto Lff
            java.lang.String r2 = r8.f4140
            boolean r4 = p000.q02.m4671(r12)
            if (r4 != 0) goto Lda
            r4 = r12
            goto Ldb
        Lda:
            r4 = r0
        Ldb:
            if (r4 != 0) goto Ldf
            r4 = r19
        Ldf:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = p000.AbstractC0488ku.m3417(r4)
            boolean r5 = p000.q02.m4671(r4)
            if (r5 == 0) goto Lf9
            goto Lfa
        Lf9:
            r2 = r4
        Lfa:
            r4 = 5
            fv r0 = p000.C0299fv.m2204(r8, r0, r2, r0, r4)
        Lff:
            r5 = r0
            java.lang.ClassLoader r0 = p000.j41.f5313     // Catch: java.lang.Throwable -> L136
            java.lang.String r6 = r3.f3800     // Catch: java.lang.Throwable -> L136
            java.util.List r7 = r1.f9514     // Catch: java.lang.Throwable -> L136
            java.util.List r10 = r1.f9515     // Catch: java.lang.Throwable -> L136
            m3 r11 = new m3     // Catch: java.lang.Throwable -> L136
            r0 = 3
            r2 = r30
            r11.<init>(r2, r3, r5, r0)     // Catch: java.lang.Throwable -> L136
            bf0 r0 = new bf0     // Catch: java.lang.Throwable -> L136
            r4 = r33
            r8 = r1
            r1 = r2
            r2 = r3
            r3 = r32
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L132
            r1 = r30
            r2 = r6
            r3 = r7
            r4 = r10
            r5 = r11
            r6 = r0
            java.util.List r0 = p000.j41.m2858(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L132
            r10 = r26
            p000.AbstractC0984xh.m6660(r10, r0)     // Catch: java.lang.Throwable -> L130
            r13 = r27
            goto L1d6
        L130:
            r0 = move-exception
            goto L139
        L132:
            r0 = move-exception
        L133:
            r10 = r26
            goto L139
        L136:
            r0 = move-exception
            r8 = r1
            goto L133
        L139:
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L143
            java.lang.String r1 = r0.toString()
        L143:
            r7 = r1
            java.lang.String r0 = "[LIVEPHOTO-MERGE-ITEM-FAIL] page="
            java.lang.String r1 = ", suffix="
            java.lang.String r11 = ", err="
            java.lang.StringBuilder r0 = p000.a12.m20(r9, r0, r1, r12, r11)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r12 = r28
            p000.C0888ux.m5975(r12, r0)
            int r0 = r9 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "第 "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " 页合并失败："
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            r13 = r27
            r13.add(r0)
            r1 = r29
            r2 = r30
            r3 = r31
            r5 = r32
            r6 = r33
            r4 = r8
            r8 = r34
            java.util.ArrayList r0 = r1.m5034(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L189
            goto L190
        L189:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L190:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L197
            goto L1b4
        L197:
            java.lang.String r0 = r1.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[LIVEPHOTO-MERGE-FALLBACK-FAIL] page="
            r1.<init>(r2)
            r1.append(r9)
            r1.append(r11)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5975(r12, r0)
            jz r0 = p000.C0450jz.f5672
        L1b4:
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1c0
            p000.AbstractC0984xh.m6660(r10, r0)
            goto L1d6
        L1c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[LIVEPHOTO-MERGE-ITEM-SKIP] page="
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", 合并失败且降级保存也失败"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r12, r0)
        L1d6:
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r10
            r5 = r13
            r0 = r20
            r6 = r22
            goto L20
        L1e4:
            r10 = r4
            r13 = r5
            r12 = r8
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L215
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L214
            int r0 = r10.size()
            int r1 = r13.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[LIVEPHOTO-MERGE-PARTIAL] saved="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", failed="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5975(r12, r0)
        L214:
            return r10
        L215:
            java.lang.Exception r0 = new java.lang.Exception
            r10 = 0
            r11 = 62
            java.lang.String r6 = "\n"
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r13
            java.lang.String r1 = p000.AbstractC0984xh.m6644(r5, r6, r7, r8, r9, r10, r11)
            r2 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = p000.q02.m4693(r1, r2)
            java.lang.String r2 = "全部动图合并失败，且降级保存也失败。\n\n"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L234:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "合并动图失败：未找到可直接保存的 MP4 视频资源"
            r0.<init>(r1)
            throw r0
    }
}
