package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dz0 {

    /* JADX INFO: renamed from: μ */
    public static final java.util.concurrent.ExecutorService f3338 = null;

    /* JADX INFO: renamed from: ν */
    public static final p000.C0595nq f3339 = null;

    /* JADX INFO: renamed from: α */
    public final android.app.Activity f3340;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f3341;

    /* JADX INFO: renamed from: γ */
    public final p000.yy0 f3342;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f3343;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f3344;

    /* JADX INFO: renamed from: ζ */
    public final p000.a80 f3345;

    /* JADX INFO: renamed from: η */
    public final java.util.LinkedHashSet f3346;

    /* JADX INFO: renamed from: θ */
    public final java.util.ArrayList f3347;

    /* JADX INFO: renamed from: ι */
    public p000.bz0 f3348;

    /* JADX INFO: renamed from: κ */
    public android.app.AlertDialog f3349;

    /* JADX INFO: renamed from: λ */
    public int f3350;

    static {
            r0 = 3
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            p000.dz0.f3338 = r0
            nq r0 = new nq
            r1 = 1
            r2 = 2
            r3 = 50
            r4 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r3, r4, r1, r2)
            p000.dz0.f3339 = r0
            return
    }

    public dz0(android.app.Activity r1, java.util.ArrayList r2, p000.yy0 r3, java.lang.String r4, java.lang.String r5, p000.a80 r6) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.f3340 = r1
            r0.f3341 = r2
            r0.f3342 = r3
            r0.f3343 = r4
            r0.f3344 = r5
            r0.f3345 = r6
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f3346 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3347 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static android.graphics.Bitmap m1819(byte[] r8, int r9, int r10) {
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto L5
            return r1
        L5:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r2 = 1
            r0.inJustDecodeBounds = r2
            int r3 = r8.length
            r4 = 0
            android.graphics.BitmapFactory.decodeByteArray(r8, r4, r3, r0)
            int r3 = r0.outWidth
            if (r3 <= 0) goto L4c
            int r3 = r0.outHeight
            if (r3 <= 0) goto L4c
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
            r3.<init>()
            int r5 = r0.outWidth
            int r0 = r0.outHeight
            if (r0 > r10) goto L2a
            if (r5 <= r9) goto L28
            goto L2a
        L28:
            r6 = r2
            goto L3a
        L2a:
            int r0 = r0 / 2
            int r5 = r5 / 2
            r6 = r2
        L2f:
            int r7 = r0 / r6
            if (r7 < r10) goto L3a
            int r7 = r5 / r6
            if (r7 < r9) goto L3a
            int r6 = r6 * 2
            goto L2f
        L3a:
            if (r6 >= r2) goto L3d
            goto L3e
        L3d:
            r2 = r6
        L3e:
            r3.inSampleSize = r2
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r3.inPreferredConfig = r0
            int r0 = r8.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r8, r4, r0, r3)
            if (r0 == 0) goto L4c
            return r0
        L4c:
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)     // Catch: java.lang.Throwable -> L5e
            android.graphics.ImageDecoder$Source r8 = android.graphics.ImageDecoder.createSource(r8)     // Catch: java.lang.Throwable -> L5e
            xy0 r0 = new xy0     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r9, r10)     // Catch: java.lang.Throwable -> L5e
            android.graphics.Bitmap r8 = android.graphics.ImageDecoder.decodeBitmap(r8, r0)     // Catch: java.lang.Throwable -> L5e
            goto L65
        L5e:
            r8 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        L65:
            boolean r9 = r8 instanceof p000.eo1
            if (r9 == 0) goto L6a
            goto L6b
        L6a:
            r1 = r8
        L6b:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static android.graphics.drawable.GradientDrawable m1820(p000.dz0 r0, int r1, int r2) {
            android.graphics.drawable.GradientDrawable r1 = p000.lz1.m3681(r1)
            int r0 = r0.m1825(r2)
            float r0 = (float) r0
            r1.setCornerRadius(r0)
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static final void m1821(p000.dz0 r21, android.widget.TextView r22, android.widget.Button r23, android.widget.Button r24, android.widget.TextView r25, android.widget.TextView r26, android.widget.TextView r27, android.widget.TextView r28, android.widget.ProgressBar r29, android.widget.ImageView r30, android.widget.ScrollView r31, android.widget.GridLayout r32, android.widget.HorizontalScrollView r33, android.widget.LinearLayout r34, int r35, p000.zy0 r36, android.view.ViewGroup r37, boolean r38) {
            r0 = r21
            r1 = r36
            r6 = r37
            x01 r2 = p000.x01.f11964
            android.app.Activity r3 = r0.f3340
            android.view.LayoutInflater r2 = r2.m6477(r3)
            r3 = 2131492947(0x7f0c0053, float:1.860936E38)
            r4 = 0
            android.view.View r7 = r2.inflate(r3, r6, r4)
            r2 = 8
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r38 == 0) goto L46
            android.widget.GridLayout$LayoutParams r5 = new android.widget.GridLayout$LayoutParams
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            android.widget.GridLayout$Spec r9 = android.widget.GridLayout.spec(r8, r3)
            android.widget.GridLayout$Spec r8 = android.widget.GridLayout.spec(r8, r3)
            r5.<init>(r9, r8)
            r5.width = r4
            r8 = 132(0x84, float:1.85E-43)
            int r8 = r0.m1825(r8)
            r5.height = r8
            r8 = 4
            int r9 = r0.m1825(r8)
            int r8 = r0.m1825(r8)
            int r10 = r0.m1825(r2)
            r5.setMargins(r9, r4, r8, r10)
            goto L5e
        L46:
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r8 = 74
            int r8 = r0.m1825(r8)
            r9 = 82
            int r9 = r0.m1825(r9)
            r5.<init>(r8, r9)
            int r8 = r0.m1825(r2)
            r5.setMarginEnd(r8)
        L5e:
            r7.setLayoutParams(r5)
            bz0 r5 = r0.f3348
            java.lang.String r8 = "theme"
            if (r5 == 0) goto L213
            int r5 = r5.f1897
            r10 = 12
            android.graphics.drawable.GradientDrawable r5 = m1820(r0, r5, r10)
            r7.setBackground(r5)
            r11 = 1
            r7.setClipToOutline(r11)
            r5 = 2131296772(0x7f090204, float:1.821147E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r12 = 2131297039(0x7f09030f, float:1.8212012E38)
            android.view.View r12 = r7.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131297040(0x7f090310, float:1.8212014E38)
            android.view.View r13 = r7.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131297038(0x7f09030e, float:1.821201E38)
            android.view.View r14 = r7.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r5.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            int r15 = r0.f3350
            r3 = r35
            if (r3 != r15) goto Lae
            r15 = r11
            goto Laf
        Lae:
            r15 = r4
        Laf:
            java.util.LinkedHashSet r10 = r0.f3346
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r10.contains(r2)
            int r10 = r1.f13353
            az0 r9 = r1.f13351
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r12.setText(r10)
            java.lang.String r10 = r1.f13355
            r13.setText(r10)
            r10 = 17
            r12.setGravity(r10)
            r12.setIncludeFontPadding(r4)
            r4 = -1
            r12.setTextColor(r4)
            r4 = 0
            r12.setTypeface(r4, r11)
            java.lang.String r4 = "#99000000"
            int r11 = android.graphics.Color.parseColor(r4)
            r10 = 8
            android.graphics.drawable.GradientDrawable r11 = m1820(r0, r11, r10)
            r12.setBackground(r11)
            r11 = 17
            r13.setGravity(r11)
            r11 = 0
            r13.setIncludeFontPadding(r11)
            r12 = -1
            r13.setTextColor(r12)
            int r4 = android.graphics.Color.parseColor(r4)
            android.graphics.drawable.GradientDrawable r4 = m1820(r0, r4, r10)
            r13.setBackground(r4)
            r0.m1828(r14, r2, r11)
            bz0 r4 = r0.f3348
            if (r4 == 0) goto L20d
            int r8 = r4.f1902
            int r10 = r4.f1897
            if (r15 != 0) goto L112
            if (r2 == 0) goto L110
            goto L112
        L110:
            r11 = 1
            goto L113
        L112:
            r11 = 2
        L113:
            if (r15 == 0) goto L116
            goto L134
        L116:
            if (r2 == 0) goto L132
            r4 = 180(0xb4, float:2.52E-43)
            r12 = 255(0xff, float:3.57E-43)
            r13 = 0
            int r4 = p000.j81.m2906(r4, r13, r12)
            int r12 = android.graphics.Color.red(r8)
            int r13 = android.graphics.Color.green(r8)
            int r8 = android.graphics.Color.blue(r8)
            int r8 = android.graphics.Color.argb(r4, r12, r13, r8)
            goto L134
        L132:
            int r8 = r4.f1901
        L134:
            android.graphics.drawable.GradientDrawable r4 = p000.lz1.m3681(r10)
            r10 = 12
            int r10 = r0.m1825(r10)
            float r10 = (float) r10
            r4.setCornerRadius(r10)
            r4.setStroke(r11, r8)
            r7.setBackground(r4)
            if (r2 != 0) goto L151
            if (r15 == 0) goto L14d
            goto L151
        L14d:
            r2 = 1060655596(0x3f3851ec, float:0.72)
            goto L153
        L151:
            r2 = 1065353216(0x3f800000, float:1.0)
        L153:
            r7.setAlpha(r2)
            java.lang.String r2 = r1.f13356
            if (r2 != 0) goto L167
            java.lang.String r2 = r1.f13357
            if (r2 != 0) goto L167
            az0 r2 = p000.az0.f1383
            if (r9 != r2) goto L165
            java.lang.String r1 = r1.f13358
            goto L168
        L165:
            r1 = 0
            goto L168
        L167:
            r1 = r2
        L168:
            if (r1 == 0) goto L170
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L174
        L170:
            r2 = r5
            r4 = r9
            r11 = 0
            goto L17d
        L174:
            r3 = 0
            r2 = r5
            r5 = 0
            r4 = r9
            r0.m1826(r1, r2, r3, r4, r5)
        L17b:
            r1 = 1
            goto L181
        L17d:
            r0.m1829(r2, r4, r11)
            goto L17b
        L181:
            r7.setClickable(r1)
            r7.setFocusable(r1)
            ty0 r0 = new ty0
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r15 = r33
            r16 = r34
            r2 = r35
            r1 = r38
            r18 = r7
            r19 = r14
            r7 = r25
            r14 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r0
            r0 = r18
            r0.setOnClickListener(r1)
            uy0 r0 = new uy0
            r2 = r21
            r14 = r22
            r3 = r23
            r4 = r24
            r15 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r9 = r29
            r7 = r30
            r10 = r31
            r5 = r32
            r6 = r33
            r8 = r34
            r1 = r35
            r20 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r0
            r0 = r20
            r0.setOnLongClickListener(r1)
            r14 = r19
            r1 = 1
            r14.setClickable(r1)
            r14.setFocusable(r1)
            vy0 r1 = new vy0
            r28 = r21
            r31 = r22
            r29 = r23
            r30 = r24
            r32 = r25
            r27 = r35
            r26 = r1
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r2 = r28
            r14.setOnClickListener(r1)
            java.util.ArrayList r1 = r2.f3347
            r1.add(r0)
            r6 = r37
            r6.addView(r0)
            return
        L20d:
            p000.ln0.m3650(r8)
            r17 = 0
            throw r17
        L213:
            r17 = 0
            p000.ln0.m3650(r8)
            throw r17
    }

    /* JADX INFO: renamed from: κ */
    public static final void m1822(int r9, p000.dz0 r10, android.widget.Button r11, android.widget.Button r12, android.widget.GridLayout r13, android.widget.HorizontalScrollView r14, android.widget.ImageView r15, android.widget.LinearLayout r16, android.widget.ProgressBar r17, android.widget.ScrollView r18, android.widget.TextView r19, android.widget.TextView r20, android.widget.TextView r21, android.widget.TextView r22, android.widget.TextView r23) {
            r0 = r21
            java.util.ArrayList r1 = r10.f3341
            if (r9 < 0) goto Lb9
            int r4 = r1.size()
            if (r9 >= r4) goto Lb9
            r10.f3350 = r9
            java.lang.Object r1 = r1.get(r9)
            zy0 r1 = (p000.zy0) r1
            java.lang.String r4 = r1.f13354
            az0 r7 = r1.f13351
            r5 = r19
            r5.setText(r4)
            java.lang.String r4 = r1.f13355
            r5 = r20
            r5.setText(r4)
            int r4 = r7.ordinal()
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 == r5) goto L3b
            r6 = 2
            if (r4 == r6) goto L38
            r6 = 3
            if (r4 != r6) goto L34
            goto L38
        L34:
            p000.C1080.m7272()
            return
        L38:
            java.lang.String r4 = "动图资源"
            goto L40
        L3b:
            java.lang.String r4 = "视频资源"
            goto L40
        L3e:
            java.lang.String r4 = ""
        L40:
            java.lang.String r6 = r1.f13356
            if (r6 != 0) goto L50
            java.lang.String r6 = r1.f13357
            if (r6 != 0) goto L50
            az0 r6 = p000.az0.f1383
            if (r7 != r6) goto L4f
            java.lang.String r6 = r1.f13358
            goto L50
        L4f:
            r6 = 0
        L50:
            r1 = 8
            if (r6 == 0) goto L6f
            boolean r8 = p000.q02.m4671(r6)
            if (r8 == 0) goto L5b
            goto L6f
        L5b:
            r0.setVisibility(r1)
            r15.getClass()
            r8 = 1
            r3 = r10
            r5 = r15
            r4 = r6
            r6 = r17
            r3.m1826(r4, r5, r6, r7, r8)
        L6a:
            r4 = r22
            r5 = r23
            goto L8a
        L6f:
            boolean r6 = p000.q02.m4671(r4)
            if (r6 == 0) goto L77
            java.lang.String r4 = "资源预览"
        L77:
            r0.setText(r4)
            r4 = 0
            r0.setVisibility(r4)
            r6 = r17
            r6.setVisibility(r1)
            r15.getClass()
            r10.m1829(r15, r7, r5)
            goto L6a
        L8a:
            m1824(r10, r4, r11, r12, r5)
            yy0 r0 = r10.f3342
            yy0 r1 = p000.yy0.f12875
            if (r0 != r1) goto La2
            vw r0 = new vw
            r5 = 1
            r2 = r9
            r4 = r10
            r1 = r13
            r3 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r3.post(r0)
            return
        La2:
            vw r0 = new vw
            r1 = 2
            r19 = r9
            r21 = r10
            r20 = r14
            r18 = r16
            r17 = r0
            r22 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            r1 = r17
            r14.post(r1)
        Lb9:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static final void m1823(int r2, p000.dz0 r3, android.widget.Button r4, android.widget.Button r5, android.widget.TextView r6, android.widget.TextView r7) {
            if (r2 < 0) goto L28
            java.util.ArrayList r0 = r3.f3341
            java.util.LinkedHashSet r1 = r3.f3346
            int r0 = r0.size()
            if (r2 >= r0) goto L28
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L1e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.remove(r2)
            goto L25
        L1e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
        L25:
            m1824(r3, r6, r4, r5, r7)
        L28:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static final void m1824(p000.dz0 r11, android.widget.TextView r12, android.widget.Button r13, android.widget.Button r14, android.widget.TextView r15) {
            java.util.LinkedHashSet r0 = r11.f3346
            int r1 = r0.size()
            java.util.ArrayList r2 = r11.f3341
            int r2 = r2.size()
            java.lang.String r3 = " 项"
            if (r1 != 0) goto L17
            java.lang.String r4 = "未选择内容 · 共 "
            java.lang.String r3 = p000.AbstractC0602nx.m4127(r4, r2, r3)
            goto L28
        L17:
            java.lang.String r4 = "/"
            if (r1 != r2) goto L22
            java.lang.String r5 = "已全选 "
            java.lang.String r3 = p000.AbstractC0602nx.m4128(r5, r1, r4, r2, r3)
            goto L28
        L22:
            java.lang.String r5 = "已选 "
            java.lang.String r3 = p000.AbstractC0602nx.m4128(r5, r1, r4, r2, r3)
        L28:
            r12.setText(r3)
            if (r1 != r2) goto L30
            java.lang.String r12 = "取消全选"
            goto L32
        L30:
            java.lang.String r12 = "全选"
        L32:
            r13.setText(r12)
            r12 = 1
            if (r1 <= 0) goto L46
            if (r1 != r12) goto L3d
            java.lang.String r13 = "下载 1 项"
            goto L48
        L3d:
            java.lang.String r13 = "下载已选("
            java.lang.String r2 = ")"
            java.lang.String r13 = p000.AbstractC0602nx.m4127(r13, r1, r2)
            goto L48
        L46:
            java.lang.String r13 = "请先勾选"
        L48:
            r14.setText(r13)
            bz0 r13 = r11.f3348
            java.lang.String r2 = "theme"
            r3 = 0
            if (r13 == 0) goto L114
            int r6 = r13.f1902
            r13 = 0
            if (r1 <= 0) goto L59
            r9 = r12
            goto L5a
        L59:
            r9 = r13
        L5a:
            r7 = -1
            r8 = 1
            r4 = r11
            r5 = r14
            r4.m1831(r5, r6, r7, r8, r9)
            r15.getClass()
            int r11 = r4.f3350
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r0.contains(r11)
            r4.m1828(r15, r11, r12)
            java.util.ArrayList r11 = r4.f3347
            java.util.Iterator r11 = r11.iterator()
            r14 = r13
        L78:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L113
            java.lang.Object r15 = r11.next()
            int r1 = r14 + 1
            if (r14 < 0) goto L10f
            android.view.View r15 = (android.view.View) r15
            int r5 = r4.f3350
            if (r14 != r5) goto L8e
            r5 = r12
            goto L8f
        L8e:
            r5 = r13
        L8f:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            boolean r14 = r0.contains(r14)
            android.graphics.drawable.Drawable r6 = r15.getBackground()
            boolean r7 = r6 instanceof android.graphics.drawable.GradientDrawable
            if (r7 == 0) goto La2
            android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
            goto La3
        La2:
            r6 = r3
        La3:
            if (r6 == 0) goto Lf0
            bz0 r7 = r4.f3348
            if (r5 == 0) goto Lb2
            if (r7 == 0) goto Lae
            int r7 = r7.f1902
            goto Ld9
        Lae:
            p000.ln0.m3650(r2)
            throw r3
        Lb2:
            if (r14 == 0) goto Ld5
            if (r7 == 0) goto Ld1
            int r7 = r7.f1902
            r8 = 180(0xb4, float:2.52E-43)
            r9 = 255(0xff, float:3.57E-43)
            int r8 = p000.j81.m2906(r8, r13, r9)
            int r9 = android.graphics.Color.red(r7)
            int r10 = android.graphics.Color.green(r7)
            int r7 = android.graphics.Color.blue(r7)
            int r7 = android.graphics.Color.argb(r8, r9, r10, r7)
            goto Ld9
        Ld1:
            p000.ln0.m3650(r2)
            throw r3
        Ld5:
            if (r7 == 0) goto Lec
            int r7 = r7.f1901
        Ld9:
            if (r5 != 0) goto Le3
            if (r14 == 0) goto Lde
            goto Le3
        Lde:
            int r8 = r4.m1825(r12)
            goto Le8
        Le3:
            r8 = 2
            int r8 = r4.m1825(r8)
        Le8:
            r6.setStroke(r8, r7)
            goto Lf0
        Lec:
            p000.ln0.m3650(r2)
            throw r3
        Lf0:
            if (r14 != 0) goto Lf9
            if (r5 == 0) goto Lf5
            goto Lf9
        Lf5:
            r5 = 1060655596(0x3f3851ec, float:0.72)
            goto Lfb
        Lf9:
            r5 = 1065353216(0x3f800000, float:1.0)
        Lfb:
            r15.setAlpha(r5)
            r5 = 2131297038(0x7f09030e, float:1.821201E38)
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            if (r15 == 0) goto L10c
            r4.m1828(r15, r14, r13)
        L10c:
            r14 = r1
            goto L78
        L10f:
            p000.AbstractC1021yh.m6917()
            throw r3
        L113:
            return
        L114:
            p000.ln0.m3650(r2)
            throw r3
    }

    /* JADX INFO: renamed from: β */
    public final int m1825(int r2) {
            r1 = this;
            float r2 = (float) r2
            android.app.Activity r1 = r1.f3340
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final void m1826(java.lang.String r9, android.widget.ImageView r10, android.widget.ProgressBar r11, p000.az0 r12, boolean r13) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto Lc
            java.lang.CharSequence r9 = p000.q02.m4660(r9)
            java.lang.String r9 = r9.toString()
            goto Ld
        Lc:
            r9 = r0
        Ld:
            if (r9 != 0) goto L11
            java.lang.String r9 = ""
        L11:
            boolean r1 = p000.q02.m4671(r9)
            r2 = 0
            if (r1 == 0) goto L19
            goto L39
        L19:
            java.lang.String r1 = "//"
            boolean r1 = p000.x02.m6485(r9, r1, r2)
            if (r1 == 0) goto L27
            java.lang.String r1 = "https:"
            java.lang.String r9 = r1.concat(r9)
        L27:
            java.lang.String r1 = "&amp;"
            java.lang.String r4 = "&"
            java.lang.String r9 = p000.x02.m6483(r9, r1, r4)
            java.lang.String r1 = "http"
            r4 = 1
            boolean r1 = p000.x02.m6485(r9, r1, r4)
            if (r1 == 0) goto L39
            r0 = r9
        L39:
            r9 = 8
            if (r0 == 0) goto L9f
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L44
            goto L9f
        L44:
            java.lang.String r1 = r12.name()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "|"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r1 = "|"
            r4.append(r1)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r10.setTag(r4)
            nq r1 = p000.dz0.f3339
            monitor-enter(r1)
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> L9b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r1)
            if (r5 == 0) goto L82
            boolean r1 = r5.isRecycled()
            if (r1 != 0) goto L82
            if (r11 == 0) goto L7e
            r11.setVisibility(r9)
        L7e:
            r8.m1827(r10, r5, r13)
            return
        L82:
            r8.m1829(r10, r12, r13)
            if (r11 == 0) goto L8a
            r11.setVisibility(r2)
        L8a:
            java.util.concurrent.ExecutorService r9 = p000.dz0.f3338
            r2 = r0
            wy0 r0 = new wy0
            r1 = r8
            r5 = r10
            r6 = r11
            r7 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.execute(r0)
            return
        L9b:
            r0 = move-exception
            r8 = r0
            monitor-exit(r1)
            throw r8
        L9f:
            if (r11 == 0) goto La4
            r11.setVisibility(r9)
        La4:
            r8.m1829(r10, r12, r13)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m1827(android.widget.ImageView r2, android.graphics.Bitmap r3, boolean r4) {
            r1 = this;
            r0 = 0
            r2.setBackgroundColor(r0)
            r2.setPadding(r0, r0, r0, r0)
            r0 = 0
            r2.setImageTintList(r0)
            if (r4 == 0) goto L10
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            goto L12
        L10:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
        L12:
            r2.setScaleType(r0)
            if (r4 != 0) goto L2b
            r4 = 1
            r2.setClipToOutline(r4)
            r4 = 12
            int r1 = r1.m1825(r4)
            float r1 = (float) r1
            cz0 r4 = new cz0
            r0 = 0
            r4.<init>(r0, r1)
            r2.setOutlineProvider(r4)
        L2b:
            r2.setImageBitmap(r3)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m1828(android.widget.TextView r5, boolean r6, boolean r7) {
            r4 = this;
            r0 = 17
            r5.setGravity(r0)
            r0 = 0
            r5.setIncludeFontPadding(r0)
            r0 = 0
            r1 = 1
            r5.setTypeface(r0, r1)
            if (r7 == 0) goto L13
            r2 = 1099956224(0x41900000, float:18.0)
            goto L15
        L13:
            r2 = 1094713344(0x41400000, float:12.0)
        L15:
            r5.setTextSize(r2)
            if (r6 == 0) goto L1d
            java.lang.String r2 = "✓"
            goto L1f
        L1d:
            java.lang.String r2 = ""
        L1f:
            r5.setText(r2)
            r2 = -1
            r5.setTextColor(r2)
            if (r6 == 0) goto L2b
            java.lang.String r2 = "已选中"
            goto L2d
        L2b:
            java.lang.String r2 = "未选中"
        L2d:
            r5.setContentDescription(r2)
            java.lang.String r2 = "theme"
            if (r6 == 0) goto L3f
            bz0 r3 = r4.f3348
            if (r3 == 0) goto L3b
            int r3 = r3.f1902
            goto L45
        L3b:
            p000.ln0.m3650(r2)
            throw r0
        L3f:
            java.lang.String r3 = "#66000000"
            int r3 = android.graphics.Color.parseColor(r3)
        L45:
            if (r6 == 0) goto L52
            bz0 r6 = r4.f3348
            if (r6 == 0) goto L4e
            int r6 = r6.f1902
            goto L58
        L4e:
            p000.ln0.m3650(r2)
            throw r0
        L52:
            java.lang.String r6 = "#E6FFFFFF"
            int r6 = android.graphics.Color.parseColor(r6)
        L58:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r0.setShape(r1)
            r0.setColor(r3)
            if (r7 == 0) goto L66
            r1 = 2
        L66:
            int r4 = r4.m1825(r1)
            r0.setStroke(r4, r6)
            r5.setBackground(r0)
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m1829(android.widget.ImageView r3, p000.az0 r4, boolean r5) {
            r2 = this;
            int r4 = r4.ordinal()
            r0 = 1
            if (r4 == 0) goto L1c
            if (r4 == r0) goto L18
            r1 = 2
            if (r4 == r1) goto L14
            r1 = 3
            if (r4 != r1) goto L10
            goto L14
        L10:
            p000.C1080.m7272()
            return
        L14:
            r4 = 17301587(0x1080053, float:2.4979488E-38)
            goto L1f
        L18:
            r4 = 17301540(0x1080024, float:2.4979356E-38)
            goto L1f
        L1c:
            r4 = 17301567(0x108003f, float:2.4979432E-38)
        L1f:
            r1 = 0
            r3.setBackgroundColor(r1)
            r3.setImageResource(r4)
            bz0 r4 = r2.f3348
            if (r4 == 0) goto L5d
            int r4 = r4.f1902
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            r3.setImageTintList(r4)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER
            r3.setScaleType(r4)
            if (r5 == 0) goto L41
            r4 = 112(0x70, float:1.57E-43)
        L3c:
            int r4 = r2.m1825(r4)
            goto L44
        L41:
            r4 = 18
            goto L3c
        L44:
            r3.setPadding(r4, r4, r4, r4)
            if (r5 != 0) goto L5c
            r3.setClipToOutline(r0)
            r4 = 12
            int r2 = r2.m1825(r4)
            float r2 = (float) r2
            cz0 r4 = new cz0
            r5 = 1
            r4.<init>(r5, r2)
            r3.setOutlineProvider(r4)
        L5c:
            return
        L5d:
            java.lang.String r2 = "theme"
            p000.ln0.m3650(r2)
            r2 = 0
            throw r2
    }

    /* JADX INFO: renamed from: θ */
    public final void m1830() {
            r41 = this;
            r0 = r41
            java.util.ArrayList r7 = r0.f3341
            boolean r1 = r7.isEmpty()
            r8 = 0
            android.app.Activity r9 = r0.f3340
            if (r1 == 0) goto L17
            java.lang.String r0 = "没有可选择下载的资源"
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r8)
            r0.show()
            return
        L17:
            r9.getClass()
            android.content.res.Resources r1 = r9.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r2 = 32
            if (r1 != r2) goto L72
            bz0 r10 = new bz0
            java.lang.String r1 = "#101214"
            int r11 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#1B1E22"
            int r12 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#090B0E"
            int r13 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#F5F7FA"
            int r14 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#B8C0CC"
            int r15 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#7F8A99"
            int r16 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#2E343B"
            int r17 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#4DA3FF"
            int r18 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#19314A"
            int r19 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#252A30"
            int r20 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#22FFFFFF"
            int r21 = android.graphics.Color.parseColor(r1)
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto Lba
        L72:
            bz0 r11 = new bz0
            java.lang.String r1 = "#F5F8FC"
            int r12 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#FFFFFF"
            int r13 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#0A0D10"
            int r14 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#16202A"
            int r15 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#5E6B7A"
            int r16 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#94A3B8"
            int r17 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#E4EAF2"
            int r18 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#1989FA"
            int r19 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#EAF4FF"
            int r20 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#F1F5F9"
            int r21 = android.graphics.Color.parseColor(r1)
            java.lang.String r1 = "#18000000"
            int r22 = android.graphics.Color.parseColor(r1)
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r10 = r11
        Lba:
            r0.f3348 = r10
            java.util.LinkedHashSet r1 = r0.f3346
            r1.clear()
            xm0 r2 = p000.AbstractC1021yh.m6857(r7)
            p000.AbstractC0984xh.m6660(r1, r2)
            x01 r1 = p000.x01.f11964
            android.view.LayoutInflater r1 = r1.m6477(r9)
            r2 = 2131492910(0x7f0c002e, float:1.8609285E38)
            r10 = 0
            android.view.View r11 = r1.inflate(r2, r10, r8)
            r1 = 2131296789(0x7f090215, float:1.8211505E38)
            android.view.View r1 = r11.findViewById(r1)
            r2 = 2131296788(0x7f090214, float:1.8211503E38)
            android.view.View r2 = r11.findViewById(r2)
            r3 = 2131297018(0x7f0902fa, float:1.821197E38)
            android.view.View r3 = r11.findViewById(r3)
            r6 = r3
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3 = 2131297037(0x7f09030d, float:1.8212008E38)
            android.view.View r3 = r11.findViewById(r3)
            r13 = r3
            android.widget.TextView r13 = (android.widget.TextView) r13
            r3 = 2131297036(0x7f09030c, float:1.8212006E38)
            android.view.View r3 = r11.findViewById(r3)
            r12 = r3
            android.widget.TextView r12 = (android.widget.TextView) r12
            r3 = 2131296857(0x7f090259, float:1.8211643E38)
            android.view.View r3 = r11.findViewById(r3)
            r14 = r3
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            r3 = 2131296770(0x7f090202, float:1.8211466E38)
            android.view.View r3 = r11.findViewById(r3)
            r15 = r3
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r3 = 2131296858(0x7f09025a, float:1.8211645E38)
            android.view.View r3 = r11.findViewById(r3)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r4 = 2131297026(0x7f090302, float:1.8211985E38)
            android.view.View r4 = r11.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131297024(0x7f090300, float:1.8211981E38)
            android.view.View r5 = r11.findViewById(r5)
            r16 = r5
            android.widget.TextView r16 = (android.widget.TextView) r16
            r5 = 2131297025(0x7f090301, float:1.8211983E38)
            android.view.View r5 = r11.findViewById(r5)
            r17 = r5
            android.widget.TextView r17 = (android.widget.TextView) r17
            r5 = 2131297023(0x7f0902ff, float:1.821198E38)
            android.view.View r5 = r11.findViewById(r5)
            r18 = r5
            android.widget.TextView r18 = (android.widget.TextView) r18
            r5 = 2131296647(0x7f090187, float:1.8211217E38)
            android.view.View r5 = r11.findViewById(r5)
            android.widget.HorizontalScrollView r5 = (android.widget.HorizontalScrollView) r5
            r8 = 2131296784(0x7f090210, float:1.8211494E38)
            android.view.View r8 = r11.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r10 = 2131296971(0x7f0902cb, float:1.8211874E38)
            android.view.View r10 = r11.findViewById(r10)
            android.widget.ScrollView r10 = (android.widget.ScrollView) r10
            r21 = r5
            r5 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r5 = r11.findViewById(r5)
            android.widget.GridLayout r5 = (android.widget.GridLayout) r5
            r22 = r5
            r5 = 2131296335(0x7f09004f, float:1.8210584E38)
            android.view.View r5 = r11.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r23 = r5
            r5 = 2131296333(0x7f09004d, float:1.821058E38)
            android.view.View r5 = r11.findViewById(r5)
            r24 = r5
            android.widget.Button r24 = (android.widget.Button) r24
            r5 = 2131296329(0x7f090049, float:1.8210572E38)
            android.view.View r5 = r11.findViewById(r5)
            r25 = r5
            android.widget.Button r25 = (android.widget.Button) r25
            r5 = 2131296332(0x7f09004c, float:1.8210578E38)
            android.view.View r5 = r11.findViewById(r5)
            r26 = r5
            android.widget.Button r26 = (android.widget.Button) r26
            r1.getClass()
            r2.getClass()
            r6.getClass()
            r13.getClass()
            r12.getClass()
            r14.getClass()
            r4.getClass()
            r3.getClass()
            r23.getClass()
            r24.getClass()
            r25.getClass()
            r26.getClass()
            bz0 r5 = r0.f3348
            java.lang.String r27 = "theme"
            if (r5 == 0) goto L512
            int r5 = r5.f1895
            r28 = r7
            r7 = 22
            android.graphics.drawable.GradientDrawable r5 = m1820(r0, r5, r7)
            r1.setBackground(r5)
            bz0 r1 = r0.f3348
            if (r1 == 0) goto L50c
            int r1 = r1.f1896
            r5 = 18
            android.graphics.drawable.GradientDrawable r1 = m1820(r0, r1, r5)
            r2.setBackground(r1)
            bz0 r1 = r0.f3348
            if (r1 == 0) goto L506
            int r1 = r1.f1898
            r6.setTextColor(r1)
            r7 = 1
            r1 = 0
            r6.setTypeface(r1, r7)
            bz0 r2 = r0.f3348
            if (r2 == 0) goto L500
            int r2 = r2.f1900
            r13.setTextColor(r2)
            bz0 r2 = r0.f3348
            if (r2 == 0) goto L4fa
            int r2 = r2.f1902
            r12.setTextColor(r2)
            r12.setTypeface(r1, r7)
            r2 = 17
            r12.setGravity(r2)
            bz0 r5 = r0.f3348
            if (r5 == 0) goto L4f4
            int r5 = r5.f1903
            r1 = 99
            android.graphics.drawable.GradientDrawable r1 = m1820(r0, r5, r1)
            r12.setBackground(r1)
            bz0 r1 = r0.f3348
            if (r1 == 0) goto L4ee
            int r1 = r1.f1897
            r5 = 16
            android.graphics.drawable.GradientDrawable r1 = m1820(r0, r1, r5)
            r14.setBackground(r1)
            r4.setGravity(r2)
            r1 = -1
            r4.setTextColor(r1)
            java.lang.String r1 = "#99000000"
            int r1 = android.graphics.Color.parseColor(r1)
            r2 = 14
            android.graphics.drawable.GradientDrawable r1 = m1820(r0, r1, r2)
            r4.setBackground(r1)
            bz0 r1 = r0.f3348
            if (r1 == 0) goto L4e8
            int r1 = r1.f1902
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r3.setIndeterminateTintList(r1)
            r1 = 360(0x168, float:5.04E-43)
            int r1 = r0.m1825(r1)
            android.content.res.Resources r2 = r9.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.heightPixels
            float r2 = (float) r2
            r5 = 1056293519(0x3ef5c28f, float:0.48)
            float r2 = r2 * r5
            int r2 = (int) r2
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 240(0xf0, float:3.36E-43)
            int r2 = r0.m1825(r2)
            if (r1 >= r2) goto L26f
            r1 = r2
        L26f:
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            r2.height = r1
            r14.setLayoutParams(r2)
            bz0 r1 = r0.f3348
            if (r1 == 0) goto L4e2
            int r2 = r1.f1903
            int r1 = r1.f1902
            r5 = r4
            r4 = 0
            r29 = r5
            r5 = 1
            r7 = r22
            r22 = r11
            r11 = r7
            r20 = r3
            r7 = r21
            r3 = r1
            r1 = r23
            r23 = 0
            r0.m1831(r1, r2, r3, r4, r5)
            r30 = r1
            bz0 r1 = r0.f3348
            if (r1 == 0) goto L4dc
            int r2 = r1.f1903
            int r3 = r1.f1902
            r4 = 0
            r5 = 1
            r1 = r24
            r0.m1831(r1, r2, r3, r4, r5)
            bz0 r2 = r0.f3348
            if (r2 == 0) goto L4d6
            int r3 = r2.f1904
            int r2 = r2.f1899
            r4 = 0
            r5 = 1
            r31 = r3
            r3 = r2
            r2 = r31
            r31 = r1
            r1 = r25
            r0.m1831(r1, r2, r3, r4, r5)
            bz0 r2 = r0.f3348
            if (r2 == 0) goto L4d0
            int r2 = r2.f1902
            r4 = 1
            r5 = 1
            r3 = -1
            r32 = r1
            r1 = r26
            r0.m1831(r1, r2, r3, r4, r5)
            r3 = r1
            java.lang.String r1 = r0.f3343
            r6.setText(r1)
            java.lang.String r1 = r0.f3344
            r12.setText(r1)
            ry0 r0 = new ry0
            r1 = 1
            r2 = r41
            r4 = r3
            r5 = r13
            r6 = r18
            r3 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r6.setOnClickListener(r1)
            r8.removeAllViews()
            r11.removeAllViews()
            java.util.ArrayList r1 = r0.f3347
            r1.clear()
            yy0 r1 = p000.yy0.f12875
            r4 = 8
            yy0 r12 = r0.f3342
            if (r12 != r1) goto L3ad
            r14.setVisibility(r4)
            r7.setVisibility(r4)
            r4 = 0
            r10.setVisibility(r4)
            r13 = 3
            r11.setColumnCount(r13)
            android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
            r14 = 520(0x208, float:7.29E-43)
            int r14 = r0.m1825(r14)
            android.content.res.Resources r18 = r9.getResources()
            android.util.DisplayMetrics r4 = r18.getDisplayMetrics()
            int r4 = r4.heightPixels
            float r4 = (float) r4
            r18 = 1058306785(0x3f147ae1, float:0.58)
            float r4 = r4 * r18
            int r4 = (int) r4
            int r4 = java.lang.Math.min(r14, r4)
            r14 = 300(0x12c, float:4.2E-43)
            int r14 = r0.m1825(r14)
            if (r4 >= r14) goto L336
            r4 = r14
        L336:
            r13.height = r4
            r10.setLayoutParams(r13)
            java.util.Iterator r18 = r28.iterator()
            r14 = 0
        L340:
            boolean r4 = r18.hasNext()
            if (r4 == 0) goto L394
            java.lang.Object r4 = r18.next()
            int r24 = r14 + 1
            if (r14 < 0) goto L38e
            zy0 r4 = (p000.zy0) r4
            r13 = r9
            r9 = r15
            r15 = r4
            r4 = r6
            r6 = r17
            r17 = 1
            r25 = r1
            r1 = r5
            r5 = r16
            r16 = r11
            r36 = r12
            r37 = r13
            r34 = r22
            r35 = r25
            r12 = r7
            r13 = r8
            r8 = r20
            r20 = r23
            r7 = r29
            m1821(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r40 = r5
            r5 = r1
            r1 = r10
            r10 = r40
            r0 = r41
            r17 = r6
            r15 = r9
            r16 = r10
            r7 = r12
            r14 = r24
            r12 = r36
            r9 = r37
            r10 = r1
            r6 = r4
            r20 = r8
            r8 = r13
            r1 = r35
            goto L340
        L38e:
            r20 = r23
            p000.AbstractC1021yh.m6917()
            throw r20
        L394:
            r35 = r1
            r0 = r6
            r13 = r8
            r37 = r9
            r1 = r10
            r36 = r12
            r9 = r15
            r10 = r16
            r6 = r17
            r8 = r20
            r34 = r22
            r20 = r23
            r12 = r7
            r7 = r29
            r4 = 0
            goto L3ce
        L3ad:
            r35 = r1
            r0 = r6
            r13 = r8
            r37 = r9
            r1 = r10
            r36 = r12
            r9 = r15
            r10 = r16
            r6 = r17
            r8 = r20
            r34 = r22
            r20 = r23
            r12 = r7
            r7 = r29
            r1.setVisibility(r4)
            r4 = 0
            r14.setVisibility(r4)
            r12.setVisibility(r4)
        L3ce:
            java.util.Iterator r18 = r28.iterator()
            r14 = r4
        L3d3:
            boolean r15 = r18.hasNext()
            if (r15 == 0) goto L425
            java.lang.Object r15 = r18.next()
            int r19 = r14 + 1
            if (r14 < 0) goto L421
            zy0 r15 = (p000.zy0) r15
            r16 = r0
            r17 = r1
            r0 = r35
            r1 = r36
            if (r1 == r0) goto L40c
            r36 = r1
            r1 = r5
            r5 = r10
            r10 = r17
            r17 = 0
            r33 = r4
            r4 = r16
            r16 = r13
            r38 = r0
            r39 = r36
            r0 = r41
            m1821(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r17 = r10
            r10 = r5
            r5 = r1
        L408:
            r22 = r11
            r11 = r6
            goto L413
        L40c:
            r38 = r0
            r39 = r1
            r4 = r16
            goto L408
        L413:
            r0 = r4
            r6 = r11
            r1 = r17
            r14 = r19
            r11 = r22
            r35 = r38
            r36 = r39
            r4 = 0
            goto L3d3
        L421:
            p000.AbstractC1021yh.m6917()
            throw r20
        L425:
            r4 = r0
            r17 = r1
            r22 = r11
            r38 = r35
            r39 = r36
            r11 = r6
            ry0 r0 = new ry0
            r1 = 2
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2 = r3
            r3 = r4
            r4 = r6
            r2.setOnClickListener(r0)
            ry0 r0 = new ry0
            r1 = 0
            r4 = r3
            r3 = r2
            r2 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r6
            r6 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r4 = r1
            r1 = r31
            r1.setOnClickListener(r6)
            sy0 r1 = new sy0
            r6 = 0
            r1.<init>(r0, r6)
            r6 = r32
            r6.setOnClickListener(r1)
            sy0 r1 = new sy0
            r15 = 1
            r1.<init>(r0, r15)
            r3.setOnClickListener(r1)
            r1 = r38
            r6 = r39
            if (r6 != r1) goto L473
            m1824(r0, r5, r2, r3, r4)
            goto L485
        L473:
            r0 = 0
            r1 = r13
            r13 = r5
            r5 = r12
            r12 = r7
            r7 = r1
            r1 = r41
            r14 = r4
            r6 = r9
            r9 = r17
            r4 = r22
            m1822(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r1
        L485:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r13 = r37
            r1.<init>(r13)
            r2 = r34
            android.app.AlertDialog$Builder r1 = r1.setView(r2)
            android.app.AlertDialog$Builder r1 = r1.setCancelable(r15)
            android.app.AlertDialog r1 = r1.create()
            r0.f3349 = r1
            if (r1 == 0) goto L4a1
            r1.show()
        L4a1:
            android.app.AlertDialog r0 = r0.f3349
            if (r0 == 0) goto L4cf
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L4cf
            r1 = 17170445(0x106000d, float:2.461195E-38)
            r0.setBackgroundDrawableResource(r1)
            r1 = 1055286886(0x3ee66666, float:0.45)
            r0.setDimAmount(r1)
            r1 = 2
            r0.addFlags(r1)
            android.content.res.Resources r1 = r13.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            float r1 = (float) r1
            r2 = 1064011039(0x3f6b851f, float:0.92)
            float r1 = r1 * r2
            int r1 = (int) r1
            r2 = -2
            r0.setLayout(r1, r2)
        L4cf:
            return
        L4d0:
            r20 = r23
            p000.ln0.m3650(r27)
            throw r20
        L4d6:
            r20 = r23
            p000.ln0.m3650(r27)
            throw r20
        L4dc:
            r20 = r23
            p000.ln0.m3650(r27)
            throw r20
        L4e2:
            r20 = 0
            p000.ln0.m3650(r27)
            throw r20
        L4e8:
            r20 = 0
            p000.ln0.m3650(r27)
            throw r20
        L4ee:
            r20 = 0
            p000.ln0.m3650(r27)
            throw r20
        L4f4:
            r20 = r1
            p000.ln0.m3650(r27)
            throw r20
        L4fa:
            r20 = r1
            p000.ln0.m3650(r27)
            throw r20
        L500:
            r20 = r1
            p000.ln0.m3650(r27)
            throw r20
        L506:
            r20 = 0
            p000.ln0.m3650(r27)
            throw r20
        L50c:
            r20 = 0
            p000.ln0.m3650(r27)
            throw r20
        L512:
            r20 = 0
            p000.ln0.m3650(r27)
            throw r20
    }

    /* JADX INFO: renamed from: ν */
    public final void m1831(android.widget.Button r3, int r4, int r5, boolean r6, boolean r7) {
            r2 = this;
            r3.setEnabled(r7)
            r0 = 0
            r3.setAllCaps(r0)
            r1 = 17
            r3.setGravity(r1)
            r1 = 4
            r3.setTextAlignment(r1)
            r3.setIncludeFontPadding(r0)
            r3.setPadding(r0, r0, r0, r0)
            r3.setMinWidth(r0)
            r3.setMinHeight(r0)
            r3.setMinimumWidth(r0)
            r3.setMinimumHeight(r0)
            r0 = 0
            r3.setStateListAnimator(r0)
            java.lang.String r1 = "theme"
            if (r7 == 0) goto L2b
            goto L31
        L2b:
            bz0 r4 = r2.f3348
            if (r4 == 0) goto L61
            int r4 = r4.f1904
        L31:
            if (r7 == 0) goto L34
            goto L3a
        L34:
            bz0 r5 = r2.f3348
            if (r5 == 0) goto L5d
            int r5 = r5.f1900
        L3a:
            r3.setTextColor(r5)
            r3.setTypeface(r0, r6)
            r5 = 14
            android.graphics.drawable.GradientDrawable r4 = m1820(r2, r4, r5)
            android.graphics.drawable.RippleDrawable r5 = new android.graphics.drawable.RippleDrawable
            bz0 r2 = r2.f3348
            if (r2 == 0) goto L59
            int r2 = r2.f1905
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r5.<init>(r2, r4, r0)
            r3.setBackground(r5)
            return
        L59:
            p000.ln0.m3650(r1)
            throw r0
        L5d:
            p000.ln0.m3650(r1)
            throw r0
        L61:
            p000.ln0.m3650(r1)
            throw r0
    }
}
