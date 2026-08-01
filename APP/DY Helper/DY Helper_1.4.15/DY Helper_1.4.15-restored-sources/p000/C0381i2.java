package p000;

/* JADX INFO: renamed from: i2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0381i2 implements p000.e50, p000.InterfaceC0771rr, p000.x32, p000.InterfaceC0824t6, p000.p52, p000.InterfaceC0843tp, p000.ox1 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4874;

    public C0381i2() {
            r1 = this;
            r0 = 8
            r1.f4874 = r0
            r1.<init>()
            kw0 r1 = new kw0
            r0 = 16
            r1.<init>(r0)
            long[] r1 = p000.tq1.f10431
            b21 r1 = new b21
            r1.<init>()
            return
    }

    public /* synthetic */ C0381i2(int r1) {
            r0 = this;
            r0.f4874 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: Α */
    public static boolean m2583(p000.w90 r2, p000.x90 r3) {
            r2.getClass()
            r3.getClass()
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto Ld
            goto L71
        Ld:
            w90 r2 = m2599(r2)
            w90 r2 = m2584(r2, r3)
            java.lang.String r0 = "gesture_grid_first_vertical"
            float r1 = r2.f11606
            p000.ui1.m5872(r0, r1)
            java.lang.String r0 = "gesture_grid_second_vertical"
            float r1 = r2.f11607
            p000.ui1.m5872(r0, r1)
            java.lang.String r0 = "gesture_grid_first_horizontal"
            float r1 = r2.f11608
            p000.ui1.m5872(r0, r1)
            java.lang.String r0 = "gesture_grid_second_horizontal"
            float r1 = r2.f11609
            p000.ui1.m5872(r0, r1)
            java.lang.String r0 = "gesture_grid_left_margin"
            float r1 = r2.f11610
            p000.ui1.m5872(r0, r1)
            java.lang.String r0 = "gesture_grid_right_margin"
            float r1 = r2.f11611
            p000.ui1.m5872(r0, r1)
            java.lang.String r0 = "gesture_grid_top_margin"
            float r1 = r2.f11612
            p000.ui1.m5872(r0, r1)
            java.lang.String r0 = "gesture_grid_bottom_margin"
            float r1 = r2.f11613
            p000.ui1.m5872(r0, r1)
            java.lang.String r0 = "gesture_grid_sync_left_right"
            boolean r1 = r3.f12079
            p000.ui1.m5871(r0, r1)
            java.lang.String r0 = "gesture_grid_sync_top_bottom"
            boolean r1 = r3.f12080
            p000.ui1.m5871(r0, r1)
            w90 r0 = m2596()
            boolean r2 = p000.w90.m6331(r0, r2)
            if (r2 == 0) goto L71
            x90 r2 = m2597()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L71
            r2 = 1
            return r2
        L71:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: Β */
    public static p000.w90 m2584(p000.w90 r10, p000.x90 r11) {
            r10.getClass()
            r11.getClass()
            w90 r0 = m2599(r10)
            float r10 = r0.f11610
            float r1 = r0.f11611
            float r2 = r10 + r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            r4 = 1051931443(0x3eb33333, float:0.35)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L1b
            r2 = r4
        L1b:
            float r5 = r0.f11612
            float r6 = r0.f11613
            float r7 = r5 + r6
            float r7 = r7 / r3
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 <= 0) goto L27
            goto L28
        L27:
            r4 = r7
        L28:
            boolean r3 = r11.f12079
            if (r3 == 0) goto L2d
            r10 = r2
        L2d:
            if (r3 == 0) goto L30
            r1 = r2
        L30:
            boolean r11 = r11.f12080
            if (r11 == 0) goto L36
            r7 = r4
            goto L37
        L36:
            r7 = r5
        L37:
            if (r11 == 0) goto L3b
            r8 = r4
            goto L3c
        L3b:
            r8 = r6
        L3c:
            r9 = 15
            r6 = r1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r10
            w90 r10 = p000.w90.m6330(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    /* JADX INFO: renamed from: ε */
    public static final p000.C0870uf m2585(p000.C0381i2 r1, java.lang.String r2) {
            uf r1 = new uf
            r1.<init>(r2)
            java.util.LinkedHashMap r0 = p000.C0870uf.f10720
            r0.put(r2, r1)
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static final void m2586(p000.C0386i7 r8) {
            v r0 = p000.C0386i7.f4931
            i7 r0 = p000.C0386i7.f4932
            r1 = 1
            if (r0 != 0) goto L1b
            i7 r0 = new i7
            r0.<init>()
            p000.C0386i7.f4932 = r0
            h7 r0 = new h7
            java.lang.String r2 = "Okio Watchdog"
            r0.<init>(r2)
            r0.setDaemon(r1)
            r0.start()
        L1b:
            long r2 = java.lang.System.nanoTime()
            long r4 = r8.f6938
            boolean r0 = r8.f6936
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L38
            if (r0 == 0) goto L38
            long r6 = r8.mo2870()
            long r6 = r6 - r2
            long r4 = java.lang.Math.min(r4, r6)
            long r4 = r4 + r2
            r8.f4939 = r4
            goto L46
        L38:
            if (r6 == 0) goto L3e
            long r2 = r2 + r4
            r8.f4939 = r2
            goto L46
        L3e:
            if (r0 == 0) goto L6d
            long r2 = r8.mo2870()
            r8.f4939 = r2
        L46:
            v r0 = p000.C0386i7.f4931
            int r2 = r0.f11044
            int r2 = r2 + r1
            r0.f11044 = r2
            java.lang.Object r3 = r0.f11045
            i7[] r3 = (p000.C0386i7[]) r3
            int r4 = r3.length
            if (r2 != r4) goto L60
            int r4 = r2 * 2
            i7[] r4 = new p000.C0386i7[r4]
            r5 = 14
            r6 = 0
            p000.AbstractC0312g7.m2240(r3, r4, r6, r6, r5)
            r0.f11045 = r4
        L60:
            r0.m6012(r2, r8)
            int r8 = r8.f4938
            if (r8 != r1) goto L6c
            java.util.concurrent.locks.Condition r8 = p000.C0386i7.f4934
            r8.signal()
        L6c:
            return
        L6d:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
    }

    /* JADX INFO: renamed from: η */
    public static final float m2587(float r7, float[] r8, float[] r9) {
            float r0 = java.lang.Math.abs(r7)
            float r1 = java.lang.Math.signum(r7)
            int r2 = java.util.Arrays.binarySearch(r8, r0)
            if (r2 < 0) goto L12
            r7 = r9[r2]
            float r1 = r1 * r7
            return r1
        L12:
            int r2 = r2 + 1
            int r2 = -r2
            int r3 = r2 + (-1)
            int r4 = r8.length
            int r4 = r4 + (-1)
            r5 = 0
            if (r3 < r4) goto L2f
            int r0 = r8.length
            int r0 = r0 + (-1)
            r0 = r8[r0]
            int r8 = r8.length
            int r8 = r8 + (-1)
            r8 = r9[r8]
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 != 0) goto L2c
            return r5
        L2c:
            float r8 = r8 / r0
            float r8 = r8 * r7
            return r8
        L2f:
            r7 = -1
            if (r3 != r7) goto L3b
            r7 = 0
            r8 = r8[r7]
            r7 = r9[r7]
            r9 = r8
            r8 = r5
            r3 = r8
            goto L47
        L3b:
            r7 = r8[r3]
            r8 = r8[r2]
            r3 = r9[r3]
            r9 = r9[r2]
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L47:
            int r2 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r2 != 0) goto L4d
            r0 = r5
            goto L50
        L4d:
            float r0 = r0 - r8
            float r9 = r9 - r8
            float r0 = r0 / r9
        L50:
            r8 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r8, r0)
            float r8 = java.lang.Math.max(r5, r8)
            float r7 = r7 - r3
            float r7 = r7 * r8
            float r7 = r7 + r3
            float r7 = r7 * r1
            return r7
    }

    /* JADX INFO: renamed from: θ */
    public static p000.C0386i7 m2588() {
            v r0 = p000.C0386i7.f4931
            java.lang.Object r1 = r0.f11045
            i7[] r1 = (p000.C0386i7[]) r1
            r2 = 1
            r1 = r1[r2]
            r3 = 0
            if (r1 != 0) goto L30
            long r4 = java.lang.System.nanoTime()
            java.util.concurrent.locks.Condition r1 = p000.C0386i7.f4934
            long r6 = p000.C0386i7.f4935
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.await(r6, r8)
            java.lang.Object r0 = r0.f11045
            i7[] r0 = (p000.C0386i7[]) r0
            r0 = r0[r2]
            if (r0 != 0) goto L2f
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r4
            long r4 = p000.C0386i7.f4936
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L2f
            i7 r0 = p000.C0386i7.f4932
            return r0
        L2f:
            return r3
        L30:
            long r4 = java.lang.System.nanoTime()
            long r6 = r1.f4939
            long r6 = r6 - r4
            r4 = 0
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 <= 0) goto L45
            java.util.concurrent.locks.Condition r0 = p000.C0386i7.f4934
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.await(r6, r1)
            return r3
        L45:
            r0.m6014(r1)
            r0 = 2
            r1.f4937 = r0
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static p000.v90 m2589(float r5, float r6, p000.w90 r7) {
            r7.getClass()
            w90 r7 = m2599(r7)
            v90 r0 = new v90
            float r1 = r7.f11610
            float r1 = r1 * r5
            float r2 = r7.f11612
            float r2 = r2 * r6
            float r3 = r7.f11611
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 - r3
            float r3 = r3 * r5
            float r5 = r7.f11613
            float r4 = r4 - r5
            float r4 = r4 * r6
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static p000.C0208dd m2590(java.lang.String r5) {
            int r0 = r5.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L36
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L11:
            if (r2 >= r0) goto L30
            int r3 = r2 * 2
            char r4 = r5.charAt(r3)
            int r4 = p000.AbstractC1021yh.m6876(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5.charAt(r3)
            int r3 = p000.AbstractC1021yh.m6876(r3)
            int r3 = r3 + r4
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L11
        L30:
            dd r5 = new dd
            r5.<init>(r1)
            return r5
        L36:
            java.lang.String r0 = "Unexpected hex string: "
            java.lang.String r5 = r0.concat(r5)
            p000.C1080.m7266(r5)
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.String m2591(java.lang.String r1) {
            java.lang.String r1 = m2598(r1)
            java.lang.String r0 = "无"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le
            java.lang.String r1 = "未设置"
        Le:
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public static p000.C0208dd m2592(java.lang.String r2) {
            r2.getClass()
            dd r0 = new dd
            java.nio.charset.Charset r1 = p000.AbstractC0547mf.f7105
            byte[] r1 = r2.getBytes(r1)
            r1.getClass()
            r0.<init>(r1)
            r0.f3088 = r2
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m2593(p000.C0704py r7, android.text.Editable r8, int r9, int r10, boolean r11) {
            r0 = 0
            if (r8 == 0) goto Lef
            if (r9 < 0) goto Lef
            if (r10 >= 0) goto L9
            goto Lef
        L9:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto Lef
            if (r2 == r3) goto Lef
            if (r1 == r2) goto L1a
            goto Lef
        L1a:
            r4 = 1
            if (r11 == 0) goto La5
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L2c
            if (r11 >= r1) goto L2a
            goto L2c
        L2a:
            if (r9 >= 0) goto L2e
        L2c:
            r1 = r3
            goto L5d
        L2e:
            r11 = r0
        L2f:
            if (r9 != 0) goto L32
            goto L5d
        L32:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L3b
            if (r11 == 0) goto L39
            goto L2c
        L39:
            r1 = r0
            goto L5d
        L3b:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L4b
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L48
            goto L2c
        L48:
            int r9 = r9 + (-1)
            goto L2e
        L4b:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L54
            int r9 = r9 + (-1)
            goto L2f
        L54:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L5b
            goto L2c
        L5b:
            r11 = r4
            goto L2f
        L5d:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L6c
            if (r10 >= r2) goto L6a
            goto L6c
        L6a:
            if (r9 >= 0) goto L6e
        L6c:
            r10 = r3
            goto La0
        L6e:
            r11 = r0
        L6f:
            if (r9 != 0) goto L73
            r10 = r2
            goto La0
        L73:
            if (r2 < r10) goto L78
            if (r11 == 0) goto La0
            goto L6c
        L78:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L8a
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L85
            goto L6c
        L85:
            int r9 = r9 + (-1)
            int r2 = r2 + 1
            goto L6e
        L8a:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L95
            int r9 = r9 + (-1)
            int r2 = r2 + 1
            goto L6f
        L95:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L9c
            goto L6c
        L9c:
            int r2 = r2 + 1
            r11 = r4
            goto L6f
        La0:
            if (r1 == r3) goto Lef
            if (r10 != r3) goto Lb3
            goto Lef
        La5:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        Lb3:
            java.lang.Class<l62> r9 = p000.l62.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            l62[] r9 = (p000.l62[]) r9
            if (r9 == 0) goto Lef
            int r11 = r9.length
            if (r11 <= 0) goto Lef
            int r11 = r9.length
            r2 = r0
        Lc2:
            if (r2 >= r11) goto Ld9
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto Lc2
        Ld9:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            return r4
        Lef:
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static java.lang.String m2594(float r3, float r4, float r5, float r6, p000.w90 r7) {
            r7.getClass()
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 <= 0) goto La3
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 <= 0) goto La3
            float r1 = java.lang.Math.abs(r3)
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto La3
            float r1 = java.lang.Math.abs(r4)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto La3
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto La3
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto La3
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto La3
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L31
            goto La3
        L31:
            w90 r7 = m2599(r7)
            v90 r5 = m2589(r5, r6, r7)
            float r6 = r5.f11185
            float r0 = r5.f11184
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 < 0) goto La3
            float r1 = r5.f11186
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto La3
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto La3
            float r1 = r5.f11187
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L52
            goto La3
        L52:
            float r3 = r3 - r0
            float r0 = r5.m6140()
            float r3 = r3 / r0
            float r4 = r4 - r6
            float r5 = r5.m6139()
            float r4 = r4 / r5
            float r5 = r7.f11606
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r6 = 2
            r0 = 1
            r1 = 0
            if (r5 >= 0) goto L69
            r3 = r1
            goto L72
        L69:
            float r5 = r7.f11607
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L71
            r3 = r0
            goto L72
        L71:
            r3 = r6
        L72:
            float r5 = r7.f11608
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L7a
            r6 = r1
            goto L81
        L7a:
            float r5 = r7.f11609
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L81
            r6 = r0
        L81:
            int r6 = r6 * 3
            int r6 = r6 + r3
            switch(r6) {
                case 0: goto La0;
                case 1: goto L9d;
                case 2: goto L9a;
                case 3: goto L97;
                case 4: goto L94;
                case 5: goto L91;
                case 6: goto L8e;
                case 7: goto L8b;
                case 8: goto L88;
                default: goto L87;
            }
        L87:
            goto La3
        L88:
            java.lang.String r3 = "右下区域"
            return r3
        L8b:
            java.lang.String r3 = "底部区域"
            return r3
        L8e:
            java.lang.String r3 = "左下区域"
            return r3
        L91:
            java.lang.String r3 = "右侧互动区"
            return r3
        L94:
            java.lang.String r3 = "中间区域"
            return r3
        L97:
            java.lang.String r3 = "左侧互动区"
            return r3
        L9a:
            java.lang.String r3 = "右上区域"
            return r3
        L9d:
            java.lang.String r3 = "顶部区域"
            return r3
        La0:
            java.lang.String r3 = "左上区域"
            return r3
        La3:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ρ */
    public static boolean m2595(java.lang.String r1) {
            java.util.Set r0 = com.example.dyhelper.p002ui.GestureAreaView.f2529
            java.lang.String r1 = m2598(r1)
            boolean r1 = r0.contains(r1)
            return r1
    }

    /* JADX INFO: renamed from: σ */
    public static p000.w90 m2596() {
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L9
            w90 r0 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            return r0
        L9:
            w90 r1 = new w90
            java.lang.String r0 = "gesture_grid_first_vertical"
            w90 r2 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            r2 = 1051372203(0x3eaaaaab, float:0.33333334)
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L1b
            float r0 = r3.getFloat(r0, r2)     // Catch: java.lang.Throwable -> L1b
            goto L1c
        L1b:
            r0 = r2
        L1c:
            java.lang.String r3 = "gesture_grid_second_vertical"
            r4 = 1059760811(0x3f2aaaab, float:0.6666667)
            android.content.SharedPreferences r5 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L2a
            float r3 = r5.getFloat(r3, r4)     // Catch: java.lang.Throwable -> L2a
            goto L2b
        L2a:
            r3 = r4
        L2b:
            java.lang.String r5 = "gesture_grid_first_horizontal"
            android.content.SharedPreferences r6 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L35
            float r2 = r6.getFloat(r5, r2)     // Catch: java.lang.Throwable -> L35
        L35:
            java.lang.String r5 = "gesture_grid_second_horizontal"
            android.content.SharedPreferences r6 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L3f
            float r4 = r6.getFloat(r5, r4)     // Catch: java.lang.Throwable -> L3f
        L3f:
            r5 = r4
            java.lang.String r4 = "gesture_grid_left_margin"
            r6 = 0
            android.content.SharedPreferences r7 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L4c
            float r4 = r7.getFloat(r4, r6)     // Catch: java.lang.Throwable -> L4c
            goto L4d
        L4c:
            r4 = r6
        L4d:
            java.lang.String r7 = "gesture_grid_right_margin"
            android.content.SharedPreferences r8 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L58
            float r7 = r8.getFloat(r7, r6)     // Catch: java.lang.Throwable -> L58
            goto L59
        L58:
            r7 = r6
        L59:
            java.lang.String r8 = "gesture_grid_top_margin"
            android.content.SharedPreferences r9 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L64
            float r8 = r9.getFloat(r8, r6)     // Catch: java.lang.Throwable -> L64
            goto L65
        L64:
            r8 = r6
        L65:
            java.lang.String r9 = "gesture_grid_bottom_margin"
            android.content.SharedPreferences r10 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L6f
            float r6 = r10.getFloat(r9, r6)     // Catch: java.lang.Throwable -> L6f
        L6f:
            r9 = r6
            r6 = r4
            r4 = r2
            r2 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            w90 r0 = m2599(r1)
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static p000.x90 m2597() {
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L9
            x90 r0 = com.example.dyhelper.p002ui.GestureAreaView.f2523
            return r0
        L9:
            x90 r0 = new x90
            java.lang.String r1 = "gesture_grid_sync_left_right"
            r2 = 1
            boolean r1 = p000.ui1.m5887(r1, r2)
            java.lang.String r3 = "gesture_grid_sync_top_bottom"
            boolean r2 = p000.ui1.m5887(r3, r2)
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static java.lang.String m2598(java.lang.String r7) {
            if (r7 == 0) goto Lb
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            goto Lc
        Lb:
            r7 = 0
        Lc:
            if (r7 != 0) goto L10
            java.lang.String r7 = ""
        L10:
            int r0 = r7.hashCode()
            java.lang.String r1 = "打开评论区"
            java.lang.String r2 = "分享作品"
            java.lang.String r3 = "关注作者"
            java.lang.String r4 = "打开作者主页"
            java.lang.String r5 = "收藏作品"
            java.lang.String r6 = "点赞作品"
            switch(r0) {
                case -1864099483: goto L11d;
                case -1763824809: goto L115;
                case -982340854: goto L111;
                case -943367974: goto L107;
                case -917170281: goto Lfd;
                case 619829985: goto Lf3;
                case 631146295: goto Le9;
                case 631739728: goto Ldf;
                case 632348663: goto Ld5;
                case 635158013: goto Lcb;
                case 645556490: goto Lc3;
                case 648627390: goto Lba;
                case 660505209: goto Lb0;
                case 660508393: goto La6;
                case 660671597: goto L9b;
                case 660764889: goto L90;
                case 660979082: goto L86;
                case 663177879: goto L7b;
                case 692437008: goto L73;
                case 789348200: goto L6c;
                case 805455358: goto L64;
                case 831946447: goto L59;
                case 895108970: goto L51;
                case 958306521: goto L46;
                case 1354647929: goto L3b;
                case 1581080322: goto L30;
                case 1705654023: goto L25;
                default: goto L23;
            }
        L23:
            goto L125
        L25:
            java.lang.String r0 = "添加个人主页书签"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L2f
            goto L125
        L2f:
            return r0
        L30:
            java.lang.String r0 = "添加作品书签"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L3a
            goto L125
        L3a:
            return r0
        L3b:
            java.lang.String r0 = "切换隐藏联系人"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L45
            goto L125
        L45:
            return r0
        L46:
            java.lang.String r0 = "清爽模式开关"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L50
            goto L125
        L50:
            return r0
        L51:
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L9a
            goto L125
        L59:
            java.lang.String r0 = "模块菜单"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L63
            goto L125
        L63:
            return r0
        L64:
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto La5
            goto L125
        L6c:
            java.lang.String r0 = "操作菜单"
        L6e:
            r7.equals(r0)
            goto L125
        L73:
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L106
            goto L125
        L7b:
            java.lang.String r0 = "发布按钮"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L85
            goto L125
        L85:
            return r0
        L86:
            java.lang.String r0 = "右侧评论"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L11c
            goto L125
        L90:
            java.lang.String r0 = "右侧点赞"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L9a
            goto L125
        L9a:
            return r6
        L9b:
            java.lang.String r0 = "右侧收藏"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto La5
            goto L125
        La5:
            return r5
        La6:
            java.lang.String r0 = "右侧关注"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Lc2
            goto L125
        Lb0:
            java.lang.String r0 = "右侧分享"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Lca
            goto L125
        Lba:
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto Lc2
            goto L125
        Lc2:
            return r3
        Lc3:
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto Lca
            goto L125
        Lca:
            return r2
        Lcb:
            java.lang.String r0 = "修改倍速"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Ld4
            goto L125
        Ld4:
            return r0
        Ld5:
            java.lang.String r0 = "一键已读"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Lde
            goto L125
        Lde:
            return r0
        Ldf:
            java.lang.String r0 = "下载音频"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Le8
            goto L125
        Le8:
            return r0
        Le9:
            java.lang.String r0 = "下载作品"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Lf2
            goto L125
        Lf2:
            return r0
        Lf3:
            java.lang.String r0 = "不感兴趣"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto Lfc
            goto L125
        Lfc:
            return r0
        Lfd:
            java.lang.String r0 = "右侧作者主页"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L106
            goto L125
        L106:
            return r4
        L107:
            java.lang.String r0 = "观看历史记录"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L110
            goto L125
        L110:
            return r0
        L111:
            java.lang.String r0 = "调试右侧扫描"
            goto L6e
        L115:
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L11c
            goto L125
        L11c:
            return r1
        L11d:
            java.lang.String r0 = "一键续火花"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L128
        L125:
            java.lang.String r7 = "无"
            return r7
        L128:
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public static p000.w90 m2599(p000.w90 r17) {
            r0 = r17
            r0.getClass()
            float r1 = r0.f11606
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            float r1 = java.lang.Math.abs(r1)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r1 > 0) goto L18
            goto L19
        L18:
            r2 = r4
        L19:
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            if (r2 == 0) goto L23
            float r2 = r2.floatValue()
            goto L26
        L23:
            w90 r2 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            r2 = r1
        L26:
            float r5 = r0.f11607
            java.lang.Float r6 = java.lang.Float.valueOf(r5)
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L35
            goto L36
        L35:
            r6 = r4
        L36:
            r5 = 1059760811(0x3f2aaaab, float:0.6666667)
            if (r6 == 0) goto L40
            float r6 = r6.floatValue()
            goto L43
        L40:
            w90 r6 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            r6 = r5
        L43:
            float r7 = r0.f11608
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 > 0) goto L52
            goto L53
        L52:
            r8 = r4
        L53:
            if (r8 == 0) goto L5a
            float r1 = r8.floatValue()
            goto L5c
        L5a:
            w90 r7 = com.example.dyhelper.p002ui.GestureAreaView.f2522
        L5c:
            float r7 = r0.f11609
            java.lang.Float r8 = java.lang.Float.valueOf(r7)
            float r7 = java.lang.Math.abs(r7)
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 > 0) goto L6b
            r4 = r8
        L6b:
            if (r4 == 0) goto L72
            float r5 = r4.floatValue()
            goto L74
        L72:
            w90 r3 = com.example.dyhelper.p002ui.GestureAreaView.f2522
        L74:
            float r3 = r0.f11610
            float r4 = r0.f11611
            w90 r7 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            l91 r3 = m2600(r3, r4)
            float r4 = r0.f11612
            float r0 = r0.f11613
            l91 r0 = m2600(r4, r0)
            r4 = 1041865114(0x3e19999a, float:0.15)
            r7 = 1060320051(0x3f333333, float:0.7)
            float r9 = p000.j81.m2905(r2, r4, r7)
            float r2 = r9 + r4
            r8 = 1062836634(0x3f59999a, float:0.85)
            float r10 = p000.j81.m2905(r6, r2, r8)
            float r11 = p000.j81.m2905(r1, r4, r7)
            float r4 = r4 + r11
            float r12 = p000.j81.m2905(r5, r4, r8)
            w90 r8 = new w90
            java.lang.Object r1 = r3.f6502
            java.lang.Number r1 = (java.lang.Number) r1
            float r13 = r1.floatValue()
            java.lang.Object r1 = r3.f6503
            java.lang.Number r1 = (java.lang.Number) r1
            float r14 = r1.floatValue()
            java.lang.Object r1 = r0.f6502
            java.lang.Number r1 = (java.lang.Number) r1
            float r15 = r1.floatValue()
            java.lang.Object r0 = r0.f6503
            java.lang.Number r0 = (java.lang.Number) r0
            float r16 = r0.floatValue()
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r8
    }

    /* JADX INFO: renamed from: χ */
    public static p000.l91 m2600(float r5, float r6) {
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            float r5 = java.lang.Math.abs(r5)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r2 = 0
            if (r5 > 0) goto L11
            goto L12
        L11:
            r0 = r2
        L12:
            r5 = 0
            r3 = 1055286886(0x3ee66666, float:0.45)
            if (r0 == 0) goto L21
            float r0 = r0.floatValue()
            float r0 = p000.j81.m2905(r0, r5, r3)
            goto L22
        L21:
            r0 = r5
        L22:
            java.lang.Float r4 = java.lang.Float.valueOf(r6)
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 > 0) goto L2f
            r2 = r4
        L2f:
            if (r2 == 0) goto L39
            float r6 = r2.floatValue()
            float r5 = p000.j81.m2905(r6, r5, r3)
        L39:
            float r6 = r0 + r5
            r1 = 1060320051(0x3f333333, float:0.7)
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 <= 0) goto L45
            float r1 = r1 / r6
            float r0 = r0 * r1
            float r5 = r5 * r1
        L45:
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            l91 r0 = new l91
            r0.<init>(r6, r5)
            return r0
    }

    /* JADX INFO: renamed from: ψ */
    public static float m2601(float r6) {
            float r0 = java.lang.Math.abs(r6)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L59
            java.util.List r0 = com.example.dyhelper.p002ui.GestureAreaView.f2526
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L19
            r6 = 0
            goto L50
        L19:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L25
        L23:
            r6 = r1
            goto L50
        L25:
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 - r6
            float r2 = java.lang.Math.abs(r2)
        L31:
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r4 = r4 - r6
            float r4 = java.lang.Math.abs(r4)
            int r5 = java.lang.Float.compare(r2, r4)
            if (r5 <= 0) goto L49
            r1 = r3
            r2 = r4
        L49:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L31
            goto L23
        L50:
            java.lang.Float r6 = (java.lang.Float) r6
            if (r6 == 0) goto L59
            float r6 = r6.floatValue()
            return r6
        L59:
            r6 = 1073741824(0x40000000, float:2.0)
            return r6
    }

    /* JADX INFO: renamed from: ω */
    public static java.lang.String m2602(java.lang.String r2, java.lang.String r3) {
            r2.getClass()
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "gesture_"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "_"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f4874
            switch(r0) {
                case 5: goto L13;
                case 6: goto L10;
                case 13: goto Ld;
                case 14: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = "CompositionErrorContext"
            return r1
        Ld:
            java.lang.String r1 = "Empty"
            return r1
        L10:
            java.lang.String r1 = "Arrangement#Top"
            return r1
        L13:
            java.lang.String r1 = "Arrangement#Start"
            return r1
    }

    @Override // p000.InterfaceC0771rr
    /* JADX INFO: renamed from: α */
    public boolean mo2603(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.android.gms.org.conscrypt."
            r0 = 0
            boolean r1 = p000.x02.m6485(r1, r2, r0)
            return r1
    }

    @Override // p000.InterfaceC0771rr
    /* JADX INFO: renamed from: γ */
    public p000.mx1 mo2604(javax.net.ssl.SSLSocket r3) {
            r2 = this;
            java.lang.Class r2 = r3.getClass()
            r3 = r2
        L5:
            java.lang.String r0 = r3.getSimpleName()
            java.lang.String r1 = "OpenSSLSocketImpl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            java.lang.Class r3 = r3.getSuperclass()
            if (r3 == 0) goto L18
            goto L5
        L18:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No OpenSSLSocketImpl superclass of socket of type "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L2c:
            c3 r2 = new c3
            r2.<init>(r3)
            return r2
    }

    @Override // p000.InterfaceC0824t6
    /* JADX INFO: renamed from: δ */
    public void mo2605(int r1, p000.rx0 r2, int[] r3, int[] r4) {
            r0 = this;
            r0 = 0
            p000.AbstractC0861u6.m5787(r3, r4, r0)
            return
    }

    /* JADX INFO: renamed from: κ */
    public long m2606(long r6, long r8) {
            r5 = this;
            int r5 = r5.f4874
            r0 = 32
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            switch(r5) {
                case 15: goto L70;
                case 16: goto L5a;
                default: goto Lc;
            }
        Lc:
            long r3 = r6 >> r0
            int r5 = (int) r3
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r3 = r8 >> r0
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L44
            long r3 = r6 & r1
            int r5 = (int) r3
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r3 = r8 & r1
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L44
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = java.lang.Float.floatToRawIntBits(r5)
            long r6 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r8 = (long) r5
            long r5 = r6 << r0
            long r7 = r8 & r1
            long r5 = r5 | r7
            int r7 = p000.sq1.f9999
            goto L59
        L44:
            float r5 = p000.kn0.m3361(r6, r8)
            int r6 = java.lang.Float.floatToRawIntBits(r5)
            long r6 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r8 = (long) r5
            long r5 = r6 << r0
            long r7 = r8 & r1
            long r5 = r5 | r7
            int r7 = p000.sq1.f9999
        L59:
            return r5
        L5a:
            float r5 = p000.kn0.m3361(r6, r8)
            int r6 = java.lang.Float.floatToRawIntBits(r5)
            long r6 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r8 = (long) r5
            long r5 = r6 << r0
            long r7 = r8 & r1
            long r5 = r5 | r7
            int r7 = p000.sq1.f9999
            return r5
        L70:
            long r3 = r8 >> r0
            int r5 = (int) r3
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r3 = r6 >> r0
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r5 = r5 / r3
            long r8 = r8 & r1
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r6 = r6 & r1
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r8 = r8 / r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            int r7 = java.lang.Float.floatToRawIntBits(r8)
            long r7 = (long) r7
            long r5 = r5 << r0
            long r7 = r7 & r1
            long r5 = r5 | r7
            int r7 = p000.sq1.f9999
            return r5
    }

    /* JADX INFO: renamed from: ξ */
    public synchronized p000.C0870uf m2607(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            r7.getClass()     // Catch: java.lang.Throwable -> L41
            java.util.LinkedHashMap r0 = p000.C0870uf.f10720     // Catch: java.lang.Throwable -> L41
            java.lang.Object r1 = r0.get(r7)     // Catch: java.lang.Throwable -> L41
            uf r1 = (p000.C0870uf) r1     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L46
            java.lang.String r1 = "SSL_"
            java.lang.String r2 = "TLS_"
            r3 = 0
            boolean r4 = p000.x02.m6485(r7, r2, r3)     // Catch: java.lang.Throwable -> L41
            r5 = 4
            if (r4 == 0) goto L23
            java.lang.String r2 = r7.substring(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L41
            goto L33
        L23:
            boolean r1 = p000.x02.m6485(r7, r1, r3)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L32
            java.lang.String r1 = r7.substring(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L41
            goto L33
        L32:
            r1 = r7
        L33:
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L41
            uf r1 = (p000.C0870uf) r1     // Catch: java.lang.Throwable -> L41
            if (r1 != 0) goto L43
            uf r1 = new uf     // Catch: java.lang.Throwable -> L41
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r7 = move-exception
            goto L48
        L43:
            r0.put(r7, r1)     // Catch: java.lang.Throwable -> L41
        L46:
            monitor-exit(r6)
            return r1
        L48:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L41
            throw r7
    }
}
