package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f6801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f6802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f6805g;

    public i(long r1, int r3, java.lang.String r4, java.lang.String r5, long r6, long r8, java.util.List r10) {
            r0 = this;
            r0.<init>()
            r0.f6799a = r1
            r0.f6800b = r3
            r0.f6801c = r4
            r0.f6802d = r5
            r0.f6803e = r6
            r0.f6804f = r8
            r0.f6805g = r10
            return
    }

    public final java.lang.String a() {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r10.f6802d
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L19
            r2 = r4
            goto L1a
        L19:
            r2 = r3
        L1a:
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L23
            r0.add(r1)
        L23:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L30
            java.lang.String r1 = r10.b()
            r0.add(r1)
        L30:
            long r1 = r10.f6804f
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L4f
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            java.lang.String r8 = "yyyy-MM-dd"
            java.util.Locale r9 = java.util.Locale.getDefault()
            r7.<init>(r8, r9)
            java.util.Date r8 = new java.util.Date
            r8.<init>(r1)
            java.lang.String r1 = r7.format(r8)
            r0.add(r1)
        L4f:
            long r1 = r10.f6803e
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto Laa
            if (r5 > 0) goto L5a
            java.lang.String r1 = "0 B"
            goto La7
        L5a:
            java.lang.String r5 = "MB"
            java.lang.String r6 = "GB"
            java.lang.String r7 = "B"
            java.lang.String r8 = "KB"
            java.lang.String[] r5 = new java.lang.String[]{r7, r8, r5, r6}
            double r1 = (double) r1
        L67:
            r6 = 4652218415073722368(0x4090000000000000, double:1024.0)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 < 0) goto L74
            r8 = 3
            if (r3 >= r8) goto L74
            double r1 = r1 / r6
            int r3 = r3 + 1
            goto L67
        L74:
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L9a
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r1 % r6
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L85
            goto L9a
        L85:
            java.util.Locale r6 = java.util.Locale.US
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r2 = "%.1f"
            java.lang.String r1 = java.lang.String.format(r6, r2, r1)
            goto L9f
        L9a:
            int r1 = (int) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L9f:
            r2 = r5[r3]
            java.lang.String r3 = " "
            java.lang.String r1 = wb.en.h(r1, r3, r2)
        La7:
            r0.add(r1)
        Laa:
            r4 = 0
            r5 = 62
            java.lang.String r1 = " · "
            r2 = 0
            r3 = 0
            java.lang.String r0 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public final java.lang.String b() {
            r3 = this;
            r0 = 10
            java.lang.String r1 = "笔记"
            int r2 = r3.f6800b
            if (r2 == r0) goto L3d
            r0 = 14
            if (r2 == r0) goto L3a
            r0 = 18
            if (r2 == r0) goto L39
            r0 = 19
            if (r2 == r0) goto L36
            switch(r2) {
                case 1: goto L33;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L27;
                case 6: goto L24;
                case 7: goto L21;
                case 8: goto L1e;
                default: goto L17;
            }
        L17:
            java.lang.String r0 = "类型"
            java.lang.String r0 = eh.a.l(r2, r0)
            return r0
        L1e:
            java.lang.String r0 = "文件"
            return r0
        L21:
            java.lang.String r0 = "音乐"
            return r0
        L24:
            java.lang.String r0 = "位置"
            return r0
        L27:
            java.lang.String r0 = "链接"
            return r0
        L2a:
            java.lang.String r0 = "视频"
            return r0
        L2d:
            java.lang.String r0 = "语音"
            return r0
        L30:
            java.lang.String r0 = "图片"
            return r0
        L33:
            java.lang.String r0 = "文字"
            return r0
        L36:
            java.lang.String r0 = "小程序"
            return r0
        L39:
            return r1
        L3a:
            java.lang.String r0 = "聊天记录"
            return r0
        L3d:
            return r1
    }
}
