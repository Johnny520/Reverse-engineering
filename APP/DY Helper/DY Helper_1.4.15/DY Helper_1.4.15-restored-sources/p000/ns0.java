package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ns0 {

    /* JADX INFO: renamed from: α */
    public final p000.dt0 f7717;

    /* JADX INFO: renamed from: β */
    public final android.os.Handler f7718;

    /* JADX INFO: renamed from: γ */
    public final android.graphics.Paint f7719;

    /* JADX INFO: renamed from: δ */
    public final android.graphics.Bitmap[] f7720;

    /* JADX INFO: renamed from: ε */
    public android.graphics.Bitmap f7721;

    /* JADX INFO: renamed from: ζ */
    public int f7722;

    /* JADX INFO: renamed from: η */
    public int f7723;

    /* JADX INFO: renamed from: θ */
    public long f7724;

    /* JADX INFO: renamed from: ι */
    public boolean f7725;

    /* JADX INFO: renamed from: κ */
    public long f7726;

    public ns0(p000.dt0 r2) {
            r1 = this;
            r1.<init>()
            r1.f7717 = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0)
            r1.f7718 = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            android.graphics.BlendMode r0 = android.graphics.BlendMode.DST_OVER
            r2.setBlendMode(r0)
            r1.f7719 = r2
            r2 = 2
            android.graphics.Bitmap[] r2 = new android.graphics.Bitmap[r2]
            r1.f7720 = r2
            return
    }

    /* JADX INFO: renamed from: β */
    public static p000.ms0 m4090(android.view.View r17, android.view.View r18, android.graphics.Rect r19, float r20, int r21, p000.ms0 r22) {
            r0 = r17
            r2 = r19
            r6 = r21
            r1 = r18
            r3 = r22
            if (r0 == r1) goto Led
            r4 = 24
            if (r6 > r4) goto Led
            int r4 = r0.getVisibility()
            if (r4 != 0) goto Led
            boolean r4 = r0.isShown()
            if (r4 != 0) goto L1e
            goto Led
        L1e:
            float r4 = r0.getAlpha()
            float r4 = r4 * r20
            r5 = 1017370378(0x3ca3d70a, float:0.02)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L2d
            goto Led
        L2d:
            boolean r5 = r0 instanceof android.view.SurfaceView
            r8 = 0
            r9 = 1
            if (r5 == 0) goto Lc1
            r5 = r0
            android.view.SurfaceView r5 = (android.view.SurfaceView) r5
            int r10 = r5.getWidth()
            if (r10 <= 0) goto Lc1
            int r10 = r5.getHeight()
            if (r10 <= 0) goto Lc1
            r10 = 2
            int[] r10 = new int[r10]
            r5.getLocationInWindow(r10)
            android.graphics.Rect r11 = new android.graphics.Rect
            r12 = r10[r8]
            r13 = r10[r9]
            int r14 = r5.getWidth()
            int r14 = r14 + r12
            r10 = r10[r9]
            int r15 = r5.getHeight()
            int r15 = r15 + r10
            r11.<init>(r12, r13, r14, r15)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r2)
            boolean r12 = r10.intersect(r11)
            if (r12 == 0) goto L6e
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L71
        L6e:
            r16 = r9
            goto Lb4
        L71:
            android.graphics.Rect r12 = new android.graphics.Rect
            int r13 = r10.left
            int r14 = r11.left
            int r13 = r13 - r14
            int r15 = r10.top
            int r11 = r11.top
            int r15 = r15 - r11
            int r7 = r10.right
            int r7 = r7 - r14
            int r14 = r10.bottom
            int r14 = r14 - r11
            r12.<init>(r13, r15, r7, r14)
            android.graphics.Rect r7 = new android.graphics.Rect
            int r11 = r10.left
            int r13 = r2.left
            int r11 = r11 - r13
            int r14 = r10.top
            int r15 = r2.top
            int r14 = r14 - r15
            r16 = r9
            int r9 = r10.right
            int r9 = r9 - r13
            int r13 = r10.bottom
            int r13 = r13 - r15
            r7.<init>(r11, r14, r9, r13)
            ms0 r9 = new ms0
            int r11 = r10.width()
            int r11 = java.lang.Math.max(r8, r11)
            int r10 = r10.height()
            int r10 = java.lang.Math.max(r8, r10)
            int r10 = r10 * r11
            r9.<init>(r5, r12, r7, r10)
            goto Lb5
        Lb4:
            r9 = 0
        Lb5:
            if (r9 == 0) goto Lc3
            if (r3 == 0) goto Lbf
            int r5 = r9.f7265
            int r7 = r3.f7265
            if (r5 <= r7) goto Lc3
        Lbf:
            r3 = r9
            goto Lc3
        Lc1:
            r16 = r9
        Lc3:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto Lcb
            r7 = r0
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto Lcc
        Lcb:
            r7 = 0
        Lcc:
            if (r7 != 0) goto Lcf
            return r3
        Lcf:
            int r9 = r7.getChildCount()
            r5 = r3
        Ld4:
            if (r8 >= r9) goto Lec
            android.view.View r0 = r7.getChildAt(r8)
            r0.getClass()
            r3 = r4
            int r4 = r6 + 1
            ms0 r5 = m4090(r0, r1, r2, r3, r4, r5)
            int r8 = r8 + 1
            r1 = r18
            r2 = r19
            r4 = r3
            goto Ld4
        Lec:
            return r5
        Led:
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final void m4091(android.view.View r17, android.view.View r18, boolean r19, float r20, p000.C0940wa r21) {
            r16 = this;
            r18.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto Lb
            goto L1c7
        Lb:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2e
            js0 r0 = new js0
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r3.post(r0)
            return
        L2e:
            r7 = r16
            r3 = r18
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L1c7
            int r0 = r3.getWidth()
            if (r0 <= 0) goto L1c7
            int r0 = r3.getHeight()
            if (r0 > 0) goto L46
            goto L1c7
        L46:
            long r1 = android.os.SystemClock.uptimeMillis()
            boolean r0 = r7.f7725
            if (r0 != 0) goto L1c7
            if (r19 != 0) goto L5c
            long r4 = r7.f7724
            long r4 = r1 - r4
            r8 = 96
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto L5c
            goto L1c7
        L5c:
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            r6 = r20
            tt0 r8 = p000.AbstractC0978xb.m6574(r0, r6, r4, r5)
            if (r8 != 0) goto L78
            goto L1c7
        L78:
            int r4 = r8.f10448
            int r5 = r8.f10450
            int r6 = r8.f10447
            int r9 = r8.f10449
            int r0 = r9 - r6
            int r10 = r5 - r4
            android.graphics.Bitmap[] r11 = r7.f7720
            dt0 r12 = r7.f7717
            if (r0 <= 0) goto Lca
            if (r10 > 0) goto L8d
            goto Lca
        L8d:
            int r14 = r7.f7722     // Catch: java.lang.Throwable -> La0
            r15 = r11[r14]     // Catch: java.lang.Throwable -> La0
            if (r15 == 0) goto La2
            int r13 = r15.getWidth()     // Catch: java.lang.Throwable -> La0
            if (r13 != r0) goto La2
            int r13 = r15.getHeight()     // Catch: java.lang.Throwable -> La0
            if (r13 == r10) goto Laa
            goto La2
        La0:
            r0 = move-exception
            goto Lb0
        La2:
            android.graphics.Bitmap$Config r13 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> La0
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r0, r10, r13)     // Catch: java.lang.Throwable -> La0
            r11[r14] = r15     // Catch: java.lang.Throwable -> La0
        Laa:
            ls0 r0 = new ls0     // Catch: java.lang.Throwable -> La0
            r0.<init>(r14, r15)     // Catch: java.lang.Throwable -> La0
            goto Lb6
        Lb0:
            eo1 r10 = new eo1
            r10.<init>(r0)
            r0 = r10
        Lb6:
            java.lang.Throwable r10 = p000.fo1.m2190(r0)
            if (r10 == 0) goto Lc1
            java.lang.String r11 = "allocate_backdrop"
            r12.invoke(r11, r10)
        Lc1:
            boolean r10 = r0 instanceof p000.eo1
            if (r10 == 0) goto Lc6
            r0 = 0
        Lc6:
            ls0 r0 = (p000.ls0) r0
            r10 = r0
            goto Lcb
        Lca:
            r10 = 0
        Lcb:
            if (r10 != 0) goto Lcf
            goto L1c7
        Lcf:
            r7.f7724 = r1
            r0 = 2
            int[] r0 = new int[r0]
            r3.getLocationInWindow(r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r11 = 0
            r1 = r0[r11]
            int r6 = r6 + r1
            r13 = 1
            r0 = r0[r13]
            int r4 = r4 + r0
            int r1 = r1 + r9
            int r0 = r0 + r5
            r3.<init>(r6, r4, r1, r0)
            r5 = 0
            r6 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r1 = r17
            r2 = r18
            ms0 r9 = m4090(r1, r2, r3, r4, r5, r6)
            if (r9 == 0) goto L106
            android.graphics.Rect r0 = r9.f7264
            android.view.SurfaceView r14 = r9.f7262
            android.view.SurfaceHolder r1 = r14.getHolder()
            android.view.Surface r1 = r1.getSurface()
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L10a
        L106:
            r4 = r8
            r5 = r10
            goto L1ba
        L10a:
            int r1 = r0.width()
            int r0 = r0.height()
            if (r1 <= 0) goto L152
            if (r0 > 0) goto L117
            goto L152
        L117:
            android.graphics.Bitmap r2 = r7.f7721     // Catch: java.lang.Throwable -> L128
            if (r2 == 0) goto L12d
            int r3 = r2.getWidth()     // Catch: java.lang.Throwable -> L128
            if (r3 != r1) goto L12a
            int r3 = r2.getHeight()     // Catch: java.lang.Throwable -> L128
            if (r3 != r0) goto L12a
            goto L12b
        L128:
            r0 = move-exception
            goto L139
        L12a:
            r2 = 0
        L12b:
            if (r2 != 0) goto L13e
        L12d:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L128
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r1, r0, r2)     // Catch: java.lang.Throwable -> L128
            r7.f7721 = r2     // Catch: java.lang.Throwable -> L128
            r2.getClass()     // Catch: java.lang.Throwable -> L128
            goto L13e
        L139:
            eo1 r2 = new eo1
            r2.<init>(r0)
        L13e:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            if (r0 == 0) goto L149
            java.lang.String r1 = "allocate_surface"
            r12.invoke(r1, r0)
        L149:
            boolean r0 = r2 instanceof p000.eo1
            if (r0 == 0) goto L14e
            r2 = 0
        L14e:
            r0 = r2
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            goto L153
        L152:
            r0 = 0
        L153:
            if (r0 != 0) goto L166
            r7 = 0
            r6 = 0
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r8
            r5 = r10
            r8 = r21
            r1.m4092(r2, r3, r4, r5, r6, r7, r8)
            goto L1c7
        L166:
            r1 = r7
            r4 = r8
            r5 = r10
            long r2 = r1.f7726
            r1.f7725 = r13
            android.graphics.Rect r13 = r9.f7263     // Catch: java.lang.Throwable -> L18d
            r8 = r0
            ks0 r0 = new ks0     // Catch: java.lang.Throwable -> L18d
            r6 = r2
            r3 = r1
            r1 = r6
            r10 = r21
            r6 = r4
            r7 = r5
            r5 = r17
            r4 = r18
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L18f
            r4 = r1
            r1 = r3
            r2 = r4
            r4 = r6
            r5 = r7
            android.os.Handler r6 = r1.f7718     // Catch: java.lang.Throwable -> L18d
            android.view.PixelCopy.request(r14, r13, r8, r0, r6)     // Catch: java.lang.Throwable -> L18d
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L18d
            goto L19b
        L18d:
            r0 = move-exception
            goto L195
        L18f:
            r0 = move-exception
            r4 = r1
            r1 = r3
            r2 = r4
            r4 = r6
            r5 = r7
        L195:
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L19b:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L1c7
            long r6 = r1.f7726
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L1c7
            r1.f7725 = r11
            java.lang.String r2 = "pixel_copy_request"
            r12.invoke(r2, r0)
            r7 = 0
            r6 = 0
            r2 = r17
            r3 = r18
            r8 = r21
            r1.m4092(r2, r3, r4, r5, r6, r7, r8)
            goto L1c7
        L1ba:
            r7 = 0
            r6 = 0
            r1 = r16
            r2 = r17
            r3 = r18
            r8 = r21
            r1.m4092(r2, r3, r4, r5, r6, r7, r8)
        L1c7:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m4092(android.view.View r9, android.view.View r10, p000.tt0 r11, p000.ls0 r12, android.graphics.Bitmap r13, android.graphics.Rect r14, p000.C0940wa r15) {
            r8 = this;
            android.graphics.Bitmap r5 = r12.f6765     // Catch: java.lang.Throwable -> L4c
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r7 = r14
            r1.m4093(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L49
            int r8 = r12.f6764     // Catch: java.lang.Throwable -> L49
            int r8 = r8 + 1
            android.graphics.Bitmap[] r9 = r1.f7720     // Catch: java.lang.Throwable -> L49
            int r9 = r9.length     // Catch: java.lang.Throwable -> L49
            int r8 = r8 % r9
            r1.f7722 = r8     // Catch: java.lang.Throwable -> L49
            int r8 = r1.f7723     // Catch: java.lang.Throwable -> L49
            int r8 = r8 + 1
            r1.f7723 = r8     // Catch: java.lang.Throwable -> L49
            android.graphics.Bitmap r11 = r12.f6765     // Catch: java.lang.Throwable -> L49
            r11.getClass()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r9 = r15.f11619     // Catch: java.lang.Throwable -> L49
            gt0 r9 = (p000.gt0) r9     // Catch: java.lang.Throwable -> L49
            java.lang.Object r10 = r15.f11618     // Catch: java.lang.Throwable -> L49
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r10 = (com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout) r10     // Catch: java.lang.Throwable -> L49
            boolean r12 = r9.f4457     // Catch: java.lang.Throwable -> L49
            if (r12 == 0) goto L46
            com.example.dyhelper.hook.bottombar.LiquidGlassTouchRoutingLayout r12 = r9.f4458     // Catch: java.lang.Throwable -> L49
            if (r12 == r10) goto L31
            goto L46
        L31:
            x91 r0 = r9.f4453     // Catch: java.lang.Throwable -> L49
            java.lang.Object r9 = r0.getValue()     // Catch: java.lang.Throwable -> L49
            ps0 r9 = (p000.ps0) r9     // Catch: java.lang.Throwable -> L49
            r14 = 0
            r15 = 25
            r10 = 0
            r13 = 0
            r12 = r8
            ps0 r8 = p000.ps0.m4587(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L49
            r0.setValue(r8)     // Catch: java.lang.Throwable -> L49
        L46:
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L49
            goto L55
        L49:
            r0 = move-exception
        L4a:
            r8 = r0
            goto L4f
        L4c:
            r0 = move-exception
            r1 = r8
            goto L4a
        L4f:
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        L55:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto L62
            dt0 r9 = r1.f7717
            java.lang.String r10 = "canvas_capture"
            r9.invoke(r10, r8)
        L62:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m4093(android.view.View r8, android.view.View r9, p000.tt0 r10, android.graphics.Bitmap r11, android.graphics.Bitmap r12, android.graphics.Rect r13) {
            r7 = this;
            r0 = 0
            r11.eraseColor(r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r11)
            r11 = 2
            int[] r2 = new int[r11]
            int[] r11 = new int[r11]
            r8.getLocationInWindow(r2)
            r9.getLocationInWindow(r11)
            r3 = r11[r0]
            int r4 = r10.f10447
            int r3 = r3 + r4
            r4 = 1
            r11 = r11[r4]
            int r10 = r10.f10448
            int r11 = r11 + r10
            int r10 = r1.save()
            int r5 = r9.getVisibility()
            r6 = 4
            r9.setVisibility(r6)
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L4a
            int r0 = r0 - r3
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L4a
            r2 = r2[r4]     // Catch: java.lang.Throwable -> L4a
            int r2 = r2 - r11
            float r11 = (float) r2     // Catch: java.lang.Throwable -> L4a
            r1.translate(r0, r11)     // Catch: java.lang.Throwable -> L4a
            r8.draw(r1)     // Catch: java.lang.Throwable -> L4a
            r1.restoreToCount(r10)
            r9.setVisibility(r5)
            if (r12 == 0) goto L49
            if (r13 == 0) goto L49
            r8 = 0
            android.graphics.Paint r7 = r7.f7719
            r1.drawBitmap(r12, r8, r13, r7)
        L49:
            return
        L4a:
            r7 = move-exception
            r1.restoreToCount(r10)
            r9.setVisibility(r5)
            throw r7
    }
}
