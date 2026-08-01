package p000;

/* JADX INFO: renamed from: vj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0912vj implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11305;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.KeyEvent.Callback f11306;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f11307;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f11308;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f11309;

    public /* synthetic */ ViewOnClickListenerC0912vj(int r1, android.view.KeyEvent.Callback r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r0 = this;
            r0.f11305 = r1
            r0.f11308 = r3
            r0.f11309 = r4
            r0.f11307 = r5
            r0.f11306 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ ViewOnClickListenerC0912vj(android.app.Activity r2, android.app.AlertDialog r3, android.view.View r4, p000.EnumC0619od r5) {
            r1 = this;
            r0 = 2
            r1.f11305 = r0
            r1.<init>()
            r1.f11306 = r2
            r1.f11307 = r3
            r1.f11308 = r4
            r1.f11309 = r5
            return
    }

    public /* synthetic */ ViewOnClickListenerC0912vj(android.app.AlertDialog r2, android.app.Activity r3, java.lang.String r4, p000.a80 r5) {
            r1 = this;
            r0 = 5
            r1.f11305 = r0
            r1.<init>()
            r1.f11307 = r2
            r1.f11306 = r3
            r1.f11308 = r4
            r1.f11309 = r5
            return
    }

    public /* synthetic */ ViewOnClickListenerC0912vj(p000.fk0 r2, android.app.Activity r3, p000.C0372hu r4, android.app.AlertDialog r5) {
            r1 = this;
            r0 = 1
            r1.f11305 = r0
            r1.<init>()
            r1.f11308 = r2
            r1.f11306 = r3
            r1.f11309 = r4
            r1.f11307 = r5
            return
    }

    public /* synthetic */ ViewOnClickListenerC0912vj(java.lang.String r2, p000.C0286fi r3, android.app.Activity r4, java.lang.String r5) {
            r1 = this;
            r0 = 4
            r1.f11305 = r0
            r1.<init>()
            r1.f11308 = r2
            r1.f11309 = r3
            r1.f11306 = r4
            r1.f11307 = r5
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r29) {
            r28 = this;
            r0 = r28
            int r1 = r0.f11305
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            switch(r1) {
                case 0: goto L39d;
                case 1: goto L333;
                case 2: goto L21d;
                case 3: goto L71;
                case 4: goto L34;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r1 = r0.f11307
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            android.view.KeyEvent$Callback r2 = r0.f11306
            r3 = r2
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r0.f11308
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.f11309
            a80 r0 = (p000.a80) r0
            r1.dismiss()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r4 = "手动编辑信息条格式"
            java.lang.String r5 = "{time:yyyy-MM-dd HH:mm} · {location}"
            hu r8 = new hu
            r1 = 27
            r8.<init>(r0, r3, r1)
            r7 = 131073(0x20001, float:1.83672E-40)
            p000.bv1.m1053(r3, r4, r5, r6, r7, r8)
            return
        L34:
            java.lang.Object r1 = r0.f11308
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.f11309
            fi r2 = (p000.C0286fi) r2
            android.view.KeyEvent$Callback r3 = r0.f11306
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r0 = r0.f11307
            java.lang.String r0 = (java.lang.String) r0
            bv1 r4 = p000.bv1.f1853
            java.lang.String r4 = "info_bar_text_color"
            p000.ui1.m5875(r4, r1)
            r2.invoke(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "已应用 "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = " ("
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r5)
            r0.show()
            return
        L71:
            java.lang.Object r1 = r0.f11308
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.Object r6 = r0.f11309
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            java.lang.Object r7 = r0.f11307
            java.lang.String r7 = (java.lang.String) r7
            android.view.KeyEvent$Callback r0 = r0.f11306
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8 = 3
            r1.performHapticFeedback(r8)
            int r1 = r6.getVisibility()
            if (r1 == 0) goto L8d
            r1 = r4
            goto L8e
        L8d:
            r1 = r5
        L8e:
            bv1 r9 = p000.bv1.f1853
            java.lang.String r9 = "settings_section_expanded_"
            java.lang.String r7 = r9.concat(r7)
            p000.ui1.m5871(r7, r1)
            r7 = 0
            if (r1 == 0) goto L17c
            android.view.ViewPropertyAnimator r1 = r6.animate()
            r1.cancel()
            r6.setVisibility(r5)
            android.view.ViewParent r1 = r6.getParent()
            boolean r9 = r1 instanceof android.view.View
            if (r9 == 0) goto Lb1
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        Lb1:
            if (r2 == 0) goto Lb8
            int r1 = r2.getWidth()
            goto Lb9
        Lb8:
            r1 = r5
        Lb9:
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r6.measure(r1, r2)
            int r1 = r6.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            r2.height = r5
            r6.requestLayout()
            r6.setAlpha(r7)
            android.content.Context r2 = r6.getContext()
            r2.getClass()
            r9 = 6
            int r2 = p000.bv1.m1076(r2, r9)
            int r2 = -r2
            float r2 = (float) r2
            r6.setTranslationY(r2)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            int[] r1 = new int[]{r5, r1}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            r10 = 320(0x140, double:1.58E-321)
            r1.setDuration(r10)
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            r1.setInterpolator(r12)
            fg r12 = new fg
            r12.<init>(r6, r4)
            r1.addUpdateListener(r12)
            android.util.Property r12 = android.view.View.ALPHA
            float[] r13 = new float[r3]
            r13 = {x03c2: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r12 = android.animation.ObjectAnimator.ofFloat(r6, r12, r13)
            r13 = 260(0x104, double:1.285E-321)
            r12.setDuration(r13)
            android.view.animation.DecelerateInterpolator r15 = new android.view.animation.DecelerateInterpolator
            r15.<init>()
            r12.setInterpolator(r15)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r28 = r7
            android.content.Context r7 = r6.getContext()
            r7.getClass()
            int r7 = p000.bv1.m1076(r7, r9)
            int r7 = -r7
            float r7 = (float) r7
            float[] r9 = new float[r3]
            r9[r5] = r7
            r9[r4] = r28
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r6, r15, r9)
            r7.setDuration(r10)
            android.view.animation.DecelerateInterpolator r9 = new android.view.animation.DecelerateInterpolator
            r9.<init>()
            r7.setInterpolator(r9)
            android.animation.Animator[] r8 = new android.animation.Animator[r8]
            r8[r5] = r1
            r8[r4] = r12
            r8[r3] = r7
            r2.playTogether(r8)
            su1 r1 = new su1
            r1.<init>(r6, r4)
            r2.addListener(r1)
            r2.start()
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1119092736(0x42b40000, float:90.0)
            android.view.ViewPropertyAnimator r0 = r0.rotation(r1)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r13)
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r2 = 1067030938(0x3f99999a, float:1.2)
            r1.<init>(r2)
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            r0.start()
            goto L21c
        L17c:
            r28 = r7
            android.view.ViewPropertyAnimator r1 = r6.animate()
            r1.cancel()
            int r1 = r6.getMeasuredHeight()
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            int[] r1 = new int[]{r1, r5}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            r9 = 240(0xf0, double:1.186E-321)
            r1.setDuration(r9)
            android.view.animation.AccelerateDecelerateInterpolator r7 = new android.view.animation.AccelerateDecelerateInterpolator
            r7.<init>()
            r1.setInterpolator(r7)
            fg r7 = new fg
            r7.<init>(r6, r3)
            r1.addUpdateListener(r7)
            android.util.Property r7 = android.view.View.ALPHA
            float[] r9 = new float[r3]
            r9 = {x03ca: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r6, r7, r9)
            r9 = 170(0xaa, double:8.4E-322)
            r7.setDuration(r9)
            android.view.animation.AccelerateDecelerateInterpolator r9 = new android.view.animation.AccelerateDecelerateInterpolator
            r9.<init>()
            r7.setInterpolator(r9)
            android.util.Property r9 = android.view.View.TRANSLATION_Y
            android.content.Context r10 = r6.getContext()
            r10.getClass()
            r11 = 5
            int r10 = p000.bv1.m1076(r10, r11)
            int r10 = -r10
            float r10 = (float) r10
            float[] r11 = new float[r3]
            r11[r5] = r28
            r11[r4] = r10
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r6, r9, r11)
            r10 = 200(0xc8, double:9.9E-322)
            r9.setDuration(r10)
            android.view.animation.AccelerateDecelerateInterpolator r10 = new android.view.animation.AccelerateDecelerateInterpolator
            r10.<init>()
            r9.setInterpolator(r10)
            android.animation.Animator[] r8 = new android.animation.Animator[r8]
            r8[r5] = r1
            r8[r4] = r7
            r8[r3] = r9
            r2.playTogether(r8)
            su1 r1 = new su1
            r1.<init>(r6, r5)
            r2.addListener(r1)
            r2.start()
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = r28
            android.view.ViewPropertyAnimator r0 = r0.rotation(r1)
            r1 = 220(0xdc, double:1.087E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            r0.start()
        L21c:
            return
        L21d:
            android.view.KeyEvent$Callback r1 = r0.f11306
            r9 = r1
            android.app.Activity r9 = (android.app.Activity) r9
            java.lang.Object r1 = r0.f11307
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            java.lang.Object r6 = r0.f11308
            r13 = r6
            android.view.View r13 = (android.view.View) r13
            java.lang.Object r0 = r0.f11309
            r10 = r0
            od r10 = (p000.EnumC0619od) r10
            boolean r0 = p000.AbstractC0976x9.m6528()
            if (r0 != 0) goto L244
            java.lang.String r0 = "内测资格已失效"
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r5)
            r0.show()
            r1.dismiss()
            goto L332
        L244:
            r1.dismiss()
            int r0 = r10.ordinal()
            if (r0 == 0) goto L25c
            if (r0 == r4) goto L259
            if (r0 != r3) goto L254
            java.lang.String r0 = "正在批量浇水"
            goto L25e
        L254:
            p000.C1080.m7272()
            goto L332
        L259:
            java.lang.String r0 = "正在批量种地"
            goto L25e
        L25c:
            java.lang.String r0 = "正在一键收菜"
        L25e:
            java.lang.String r1 = "正在等待营地任务开始"
            p000.xn0.m6709(r9, r13, r0, r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5424
            mb1 r11 = new mb1
            r0 = 4
            r11.<init>(r9, r13, r0)
            mb1 r12 = new mb1
            r12.<init>(r9, r13, r5)
            boolean r0 = p000.AbstractC0976x9.m6528()
            if (r0 == 0) goto L314
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L27e
            goto L314
        L27e:
            a r1 = p000.jc1.f5426
            monitor-enter(r1)
            java.lang.Object r0 = r1.f1     // Catch: java.lang.Throwable -> L311
            ｚ r0 = (p000.C1156) r0     // Catch: java.lang.Throwable -> L311
            boolean r0 = r0.f13525     // Catch: java.lang.Throwable -> L311
            if (r0 == 0) goto L28b
            monitor-exit(r1)
            goto L2a5
        L28b:
            java.lang.Object r0 = r1.f0     // Catch: java.lang.Throwable -> L311
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0     // Catch: java.lang.Throwable -> L311
            long r15 = r0.incrementAndGet()     // Catch: java.lang.Throwable -> L311
            ｚ r14 = new ｚ     // Catch: java.lang.Throwable -> L311
            r18 = 0
            r19 = 0
            r17 = 1
            r14.<init>(r15, r17, r18, r19)     // Catch: java.lang.Throwable -> L311
            r1.f1 = r14     // Catch: java.lang.Throwable -> L311
            java.lang.Long r2 = java.lang.Long.valueOf(r15)     // Catch: java.lang.Throwable -> L311
            monitor-exit(r1)
        L2a5:
            if (r2 == 0) goto L32d
            long r15 = r2.longValue()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5425
            r0.set(r5)
            java.lang.Thread r0 = new java.lang.Thread
            yb1 r6 = new yb1
            r7 = r15
            r6.<init>(r7, r9, r10, r11, r12)
            r17 = r12
            java.lang.String r1 = "r4d363e284cf7777d"
            r0.<init>(r6, r1)
            r0.setDaemon(r4)
            r0.start()     // Catch: java.lang.Throwable -> L2c8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2c8
            goto L2cf
        L2c8:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L2cf:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L2d6
            goto L30a
        L2d6:
            dc1 r18 = new dc1
            r26 = 0
            r27 = 444(0x1bc, float:6.22E-43)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = r18
            a r2 = p000.jc1.f5426
            r2.m0(r7, r0)
            java.lang.String r2 = "r7ce9b41b1577bc7d"
            java.lang.String r3 = "创建营地后台任务失败"
            p000.C0888ux.m5977(r2, r3, r1)
            zb1 r14 = new zb1     // Catch: java.lang.Throwable -> L308
            r19 = 0
            r18 = r0
            r15 = r7
            r14.<init>(r15, r17, r18, r19)     // Catch: java.lang.Throwable -> L308
            r9.runOnUiThread(r14)     // Catch: java.lang.Throwable -> L308
        L308:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L30a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            goto L32d
        L311:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L311
            throw r0
        L314:
            dc1 r14 = new dc1
            r22 = 0
            r23 = 444(0x1bc, float:6.22E-43)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r12.invoke(r14)
        L32d:
            if (r5 != 0) goto L332
            p000.xn0.m6727(r9, r13, r4)
        L332:
            return
        L333:
            java.lang.Object r1 = r0.f11308
            fk0 r1 = (p000.fk0) r1
            android.view.KeyEvent$Callback r3 = r0.f11306
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r0.f11309
            hu r4 = (p000.C0372hu) r4
            java.lang.Object r0 = r0.f11307
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            java.lang.String r6 = ""
            android.widget.EditText r7 = r1.f3989
            android.text.Editable r7 = r7.getText()
            if (r7 == 0) goto L352
            java.lang.String r7 = r7.toString()
            goto L353
        L352:
            r7 = r2
        L353:
            if (r7 != 0) goto L356
            r7 = r6
        L356:
            android.widget.EditText r8 = r1.f3984
            android.text.Editable r8 = r8.getText()
            if (r8 == 0) goto L362
            java.lang.String r2 = r8.toString()
        L362:
            if (r2 != 0) goto L365
            goto L366
        L365:
            r6 = r2
        L366:
            ym1 r2 = p000.hk0.f4753
            java.util.Locale r2 = java.util.Locale.getDefault()
            r2.getClass()
            boolean r2 = p000.hk0.m2513(r7, r2)
            if (r2 == 0) goto L390
            boolean r2 = p000.hk0.m2514(r6)
            if (r2 != 0) goto L37c
            goto L390
        L37c:
            gk0 r1 = new gk0
            java.lang.String r2 = p000.hk0.m2516(r7)
            java.lang.String r3 = p000.hk0.m2517(r6)
            r1.<init>(r2, r3)
            r4.invoke(r1)
            r0.dismiss()
            goto L39c
        L390:
            p000.AbstractC0978xb.m6573(r3, r1)
            java.lang.String r0 = "请先修正标红的输入内容"
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r5)
            r0.show()
        L39c:
            return
        L39d:
            java.lang.Object r1 = r0.f11308
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r1
            java.lang.Object r2 = r0.f11309
            p70 r2 = (p000.p70) r2
            java.lang.Object r3 = r0.f11307
            android.app.AlertDialog r3 = (android.app.AlertDialog) r3
            android.view.KeyEvent$Callback r0 = r0.f11306
            android.app.Activity r0 = (android.app.Activity) r0
            r4 = r29
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.m1414(r1, r2, r3, r0, r4)
            return
    }
}
