package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ri0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f9382 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.ri0.f9382 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m5089(android.view.View r13) {
            boolean r0 = p000.ui1.m5867()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
        L8:
            r0 = r2
            goto L17
        La:
            boolean r0 = p000.AbstractC0976x9.m6524()
            if (r0 != 0) goto L11
            goto L8
        L11:
            java.lang.String r0 = "im_conversation_delete_entry_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
        L17:
            if (r0 != 0) goto L1b
            goto L2a9
        L1b:
            android.content.Context r0 = r13.getContext()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
        L24:
            r4 = 0
            if (r0 == 0) goto L45
            boolean r5 = r3.add(r0)
            if (r5 == 0) goto L45
            boolean r5 = r0 instanceof android.app.Activity
            if (r5 == 0) goto L34
            android.app.Activity r0 = (android.app.Activity) r0
            goto L46
        L34:
            boolean r5 = r0 instanceof android.content.ContextWrapper
            if (r5 == 0) goto L3b
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            goto L3c
        L3b:
            r0 = r4
        L3c:
            if (r0 == 0) goto L43
            android.content.Context r0 = r0.getBaseContext()
            goto L24
        L43:
            r0 = r4
            goto L24
        L45:
            r0 = r4
        L46:
            if (r0 != 0) goto L4a
            goto L2a9
        L4a:
            boolean r3 = r0.isFinishing()
            if (r3 != 0) goto L2a9
            boolean r3 = r0.isDestroyed()
            if (r3 == 0) goto L58
            goto L2a9
        L58:
            android.view.ViewParent r3 = r13.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L63
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L64
        L63:
            r3 = r4
        L64:
            java.lang.String r5 = m5094(r13)
            java.lang.String r3 = m5094(r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "标题栏结构 root="
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = ", parent="
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = "rbb4637c919e2110c"
            p000.C0888ux.m5975(r5, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r6 = 2
            r3.<init>(r6)
            boolean r7 = r13 instanceof android.view.ViewGroup
            if (r7 == 0) goto L95
            r7 = r13
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L96
        L95:
            r7 = r4
        L96:
            if (r7 == 0) goto L9b
            r3.add(r7)
        L9b:
            android.view.ViewParent r7 = r13.getParent()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto La6
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto La7
        La6:
            r7 = r4
        La7:
            if (r7 == 0) goto Lae
            if (r7 == r13) goto Lae
            r3.add(r7)
        Lae:
            java.util.Iterator r3 = r3.iterator()
        Lb2:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L112
            java.lang.Object r7 = r3.next()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            boolean r8 = r7 instanceof android.widget.FrameLayout
            if (r8 == 0) goto Lc5
            pi0 r8 = p000.pi0.f8574
            goto L10b
        Lc5:
            boolean r8 = r7 instanceof android.widget.RelativeLayout
            if (r8 == 0) goto Lcc
            pi0 r8 = p000.pi0.f8575
            goto L10b
        Lcc:
            java.lang.Class r8 = r7.getClass()
            sh0 r9 = new sh0
            r10 = 19
            r9.<init>(r10)
            ss1 r8 = p000.us1.m5954(r8, r9)
            java.util.Iterator r8 = r8.iterator()
        Ldf:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lfa
            java.lang.Object r9 = r8.next()
            java.lang.Class r9 = (java.lang.Class) r9
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "androidx.constraintlayout.widget.ConstraintLayout"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Ldf
            pi0 r8 = p000.pi0.f8576
            goto L10b
        Lfa:
            boolean r8 = r7 instanceof android.widget.LinearLayout
            if (r8 == 0) goto L10a
            r8 = r7
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            int r8 = r8.getOrientation()
            if (r8 != 0) goto L10a
            pi0 r8 = p000.pi0.f8577
            goto L10b
        L10a:
            r8 = r4
        L10b:
            if (r8 == 0) goto Lb2
            l91 r4 = new l91
            r4.<init>(r7, r8)
        L112:
            if (r4 != 0) goto L122
            java.lang.String r13 = m5093(r13)
            java.lang.String r0 = "标题栏没有受支持的容器，跳过入口注入；children="
            java.lang.String r13 = r0.concat(r13)
            p000.C0888ux.m5975(r5, r13)
            return
        L122:
            java.lang.Object r3 = r4.f6502
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r4.f6503
            pi0 r4 = (p000.pi0) r4
            java.lang.String r7 = "dyhelper_im_conversation_delete_entry"
            android.view.View r8 = r3.findViewWithTag(r7)
            if (r8 == 0) goto L134
            goto L2a9
        L134:
            java.lang.Integer r8 = m5090(r13, r3)
            if (r8 == 0) goto L28c
            int r8 = r8.intValue()
            xx r9 = p000.jx0.m3049(r0)
            x01 r10 = p000.x01.f11964
            w01 r10 = r10.m6474(r0)
            androidx.appcompat.widget.AppCompatImageButton r11 = new androidx.appcompat.widget.AppCompatImageButton
            r11.<init>(r0)
            int r12 = android.view.View.generateViewId()
            r11.setId(r12)
            r11.setTag(r7)
            java.lang.String r7 = "批量删除会话"
            r11.setContentDescription(r7)
            r11.setTooltipText(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r11.setScaleType(r7)
            r7 = 10
            int r7 = p000.jx0.m3056(r0, r7)
            r11.setPadding(r7, r7, r7, r7)
            android.content.res.Resources r7 = r10.f11505
            android.content.res.Resources$Theme r10 = r10.getTheme()
            java.lang.ThreadLocal r12 = p000.wn1.f11768
            r12 = 2131230859(0x7f08008b, float:1.8077783E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r12, r10)
            r11.setImageDrawable(r7)
            boolean r7 = r9.f12350
            r10 = -1
            if (r7 == 0) goto L186
            r7 = r10
            goto L188
        L186:
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L188:
            android.content.res.ColorStateList r7 = android.content.res.ColorStateList.valueOf(r7)
            r11.setImageTintList(r7)
            java.lang.String r7 = r9.f12348
            android.graphics.drawable.RippleDrawable r7 = p000.jx0.m3034(r7)
            r11.setBackground(r7)
            oi0 r7 = new oi0
            r7.<init>(r2)
            r11.setOnTouchListener(r7)
            ma0 r7 = new ma0
            r7.<init>(r0, r1)
            r11.setOnClickListener(r7)
            r7 = 44
            int r0 = p000.jx0.m3056(r0, r7)
            int r7 = r4.ordinal()     // Catch: java.lang.Throwable -> L1cf
            if (r7 == 0) goto L1f9
            if (r7 == r1) goto L1e3
            if (r7 == r6) goto L1d7
            r1 = 3
            if (r7 != r1) goto L1d1
            r1 = r3
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch: java.lang.Throwable -> L1cf
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Throwable -> L1cf
            r6.<init>(r0, r0)     // Catch: java.lang.Throwable -> L1cf
            r0 = 16
            r6.gravity = r0     // Catch: java.lang.Throwable -> L1cf
            int r0 = m5095(r1, r13)     // Catch: java.lang.Throwable -> L1cf
            r1.addView(r11, r0, r6)     // Catch: java.lang.Throwable -> L1cf
            goto L207
        L1cf:
            r0 = move-exception
            goto L20a
        L1d1:
            pm r0 = new pm     // Catch: java.lang.Throwable -> L1cf
            r0.<init>()     // Catch: java.lang.Throwable -> L1cf
            throw r0     // Catch: java.lang.Throwable -> L1cf
        L1d7:
            android.view.ViewGroup$LayoutParams r0 = m5092(r3, r0, r8)     // Catch: java.lang.Throwable -> L1cf
            if (r0 != 0) goto L1df
            r0 = r2
            goto L234
        L1df:
            r3.addView(r11, r0)     // Catch: java.lang.Throwable -> L1cf
            goto L207
        L1e3:
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams     // Catch: java.lang.Throwable -> L1cf
            r1.<init>(r0, r0)     // Catch: java.lang.Throwable -> L1cf
            r0 = 21
            r1.addRule(r0, r10)     // Catch: java.lang.Throwable -> L1cf
            r0 = 15
            r1.addRule(r0, r10)     // Catch: java.lang.Throwable -> L1cf
            r1.setMarginEnd(r8)     // Catch: java.lang.Throwable -> L1cf
            r3.addView(r11, r1)     // Catch: java.lang.Throwable -> L1cf
            goto L207
        L1f9:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L1cf
            r6 = 8388629(0x800015, float:1.1754973E-38)
            r1.<init>(r0, r0, r6)     // Catch: java.lang.Throwable -> L1cf
            r1.setMarginEnd(r8)     // Catch: java.lang.Throwable -> L1cf
            r3.addView(r11, r1)     // Catch: java.lang.Throwable -> L1cf
        L207:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1cf
            goto L210
        L20a:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L210:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 == 0) goto L227
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "向标题栏容器加入删除按钮失败 strategy="
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            p000.C0888ux.m5977(r5, r6, r1)
        L227:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L22e
            r0 = r1
        L22e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L234:
            java.lang.String r1 = ", strategy="
            if (r0 != 0) goto L254
            java.lang.String r13 = m5094(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "标题栏按钮布局参数创建失败，跳过入口注入；parent="
            r0.<init>(r2)
            r0.append(r13)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r13 = r0.toString()
            p000.C0888ux.m5975(r5, r13)
            goto L2a9
        L254:
            ni0 r0 = new ni0
            r0.<init>(r13, r3, r11, r4)
            r13.addOnLayoutChangeListener(r0)
            qi0 r0 = new qi0
            r0.<init>(r2, r3, r11)
            r13.addOnAttachStateChangeListener(r0)
            java.lang.Class r13 = r3.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "消息页会话删除入口已注入 parent="
            r0.<init>(r2)
            r0.append(r13)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r13 = ", endMargin="
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            p000.C0888ux.m5975(r5, r13)
            goto L2a9
        L28c:
            java.lang.String r13 = m5093(r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "标题栏右侧没有安全空位，跳过入口注入；strategy="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", children="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            p000.C0888ux.m5975(r5, r13)
        L2a9:
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.Integer m5090(android.view.View r10, android.view.ViewGroup r11) {
            int r0 = r10.getWidth()
            r1 = 0
            if (r0 <= 0) goto Lbc
            int r0 = r11.getWidth()
            if (r0 > 0) goto Lf
            goto Lbc
        Lf:
            android.content.Context r0 = r10.getContext()
            r0.getClass()
            r2 = 44
            int r0 = p000.jx0.m3056(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            m5091(r10, r10, r2)
            r3 = 2
            int[] r4 = new int[r3]
            int[] r5 = new int[r3]
            r10.getLocationOnScreen(r4)
            r11.getLocationOnScreen(r5)
            r6 = 0
            r7 = r4[r6]
            r5 = r5[r6]
            int r7 = r7 - r5
            int r5 = r11.getWidth()
            int r5 = r5 - r7
            int r7 = r10.getWidth()
            int r5 = r5 - r7
            java.util.Iterator r2 = r2.iterator()
            boolean r7 = r2.hasNext()
            if (r7 != 0) goto L4b
            r7 = r1
            goto L81
        L4b:
            java.lang.Object r7 = r2.next()
            android.view.View r7 = (android.view.View) r7
            int[] r8 = new int[r3]
            r7.getLocationOnScreen(r8)
            r7 = r8[r6]
            r8 = r4[r6]
            int r7 = r7 - r8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L5f:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L81
            java.lang.Object r8 = r2.next()
            android.view.View r8 = (android.view.View) r8
            int[] r9 = new int[r3]
            r8.getLocationOnScreen(r9)
            r8 = r9[r6]
            r9 = r4[r6]
            int r8 = r8 - r9
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = r7.compareTo(r8)
            if (r9 <= 0) goto L5f
            r7 = r8
            goto L5f
        L81:
            if (r7 == 0) goto L89
            int r2 = r7.intValue()
            int r2 = r2 - r0
            goto L9c
        L89:
            int r2 = r10.getWidth()
            int r2 = r2 - r0
            android.content.Context r4 = r10.getContext()
            r4.getClass()
            r7 = 12
            int r4 = p000.jx0.m3056(r4, r7)
            int r2 = r2 - r4
        L9c:
            int r4 = r10.getWidth()
            int r4 = r4 / r3
            if (r2 >= r4) goto La4
            goto Lbc
        La4:
            int r10 = r10.getWidth()
            int r10 = r10 + r5
            int r10 = r10 - r2
            int r10 = r10 - r0
            int r11 = r11.getWidth()
            int r11 = r11 - r0
            if (r11 >= 0) goto Lb3
            r11 = r6
        Lb3:
            int r10 = p000.j81.m2906(r10, r6, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        Lbc:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static void m5091(android.view.View r5, android.view.View r6, java.util.ArrayList r7) {
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L85
            java.lang.Object r0 = r5.getTag()
            java.lang.String r1 = "dyhelper_im_conversation_delete_entry"
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L14
            goto L85
        L14:
            boolean r0 = r5 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L30
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            r3 = r1
        L21:
            if (r3 >= r2) goto L30
            android.view.View r4 = r0.getChildAt(r3)
            r4.getClass()
            m5091(r4, r6, r7)
            int r3 = r3 + 1
            goto L21
        L30:
            android.content.Context r0 = r5.getContext()
            r0.getClass()
            r2 = 24
            int r0 = p000.jx0.m3056(r0, r2)
            android.content.Context r2 = r5.getContext()
            r2.getClass()
            r3 = 64
            int r2 = p000.jx0.m3056(r2, r3)
            boolean r3 = r5 instanceof android.widget.ImageView
            if (r3 != 0) goto L55
            boolean r3 = r5.isClickable()
            if (r3 != 0) goto L55
            goto L85
        L55:
            int r3 = r5.getWidth()
            if (r0 > r3) goto L85
            if (r3 > r2) goto L85
            int r3 = r5.getHeight()
            if (r0 > r3) goto L85
            if (r3 > r2) goto L85
            r0 = 2
            int[] r2 = new int[r0]
            int[] r3 = new int[r0]
            r6.getLocationOnScreen(r2)
            r5.getLocationOnScreen(r3)
            r3 = r3[r1]
            r1 = r2[r1]
            int r3 = r3 - r1
            int r1 = r5.getWidth()
            int r1 = r1 / r0
            int r1 = r1 + r3
            int r6 = r6.getWidth()
            int r6 = r6 / r0
            if (r1 <= r6) goto L85
            r7.add(r5)
        L85:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static android.view.ViewGroup.LayoutParams m5092(android.view.ViewGroup r6, int r7, int r8) {
            r0 = 0
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L2e
            sh0 r1 = new sh0     // Catch: java.lang.Throwable -> L2e
            r2 = 20
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2e
            ss1 r6 = p000.us1.m5954(r6, r1)     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L2e
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L31
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L2e
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "androidx.constraintlayout.widget.ConstraintLayout"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L14
            goto L32
        L2e:
            r6 = move-exception
            goto L9d
        L31:
            r1 = r0
        L32:
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L37
            goto L8e
        L37:
            java.lang.Class[] r6 = r1.getDeclaredClasses()     // Catch: java.lang.Throwable -> L2e
            r6.getClass()     // Catch: java.lang.Throwable -> L2e
            int r1 = r6.length     // Catch: java.lang.Throwable -> L2e
            r2 = 0
        L40:
            if (r2 >= r1) goto L54
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r3.getSimpleName()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = "LayoutParams"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L51
            goto L55
        L51:
            int r2 = r2 + 1
            goto L40
        L54:
            r3 = r0
        L55:
            if (r3 != 0) goto L58
            goto L8e
        L58:
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L2e
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r6}     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Constructor r6 = r3.getConstructor(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r7 = new java.lang.Object[]{r1, r7}     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.newInstance(r7)     // Catch: java.lang.Throwable -> L2e
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto L79
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6     // Catch: java.lang.Throwable -> L2e
            goto L7a
        L79:
            r6 = r0
        L7a:
            if (r6 != 0) goto L7d
            goto L8e
        L7d:
            java.lang.String r7 = "endToEnd"
            boolean r7 = m5097(r6, r7)     // Catch: java.lang.Throwable -> L2e
            if (r7 != 0) goto L8f
            java.lang.String r7 = "rightToRight"
            boolean r7 = m5097(r6, r7)     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto L8e
            goto L8f
        L8e:
            return r0
        L8f:
            java.lang.String r7 = "topToTop"
            m5097(r6, r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = "bottomToBottom"
            m5097(r6, r7)     // Catch: java.lang.Throwable -> L2e
            r6.setMarginEnd(r8)     // Catch: java.lang.Throwable -> L2e
            goto La3
        L9d:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        La3:
            java.lang.Throwable r7 = p000.fo1.m2190(r6)
            if (r7 == 0) goto Lb0
            java.lang.String r8 = "rbb4637c919e2110c"
            java.lang.String r1 = "创建宿主 ConstraintLayout.LayoutParams 失败"
            p000.C0888ux.m5977(r8, r1, r7)
        Lb0:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto Lb5
            goto Lb6
        Lb5:
            r0 = r6
        Lb6:
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m5093(android.view.View r9) {
            boolean r0 = r9 instanceof android.view.ViewGroup
            if (r0 == 0) goto L7
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            goto L8
        L7:
            r9 = 0
        L8:
            if (r9 != 0) goto Ld
            java.lang.String r9 = "none"
            return r9
        Ld:
            int r0 = r9.getChildCount()
            r1 = 12
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            xm0 r2 = p000.j81.m2893(r1, r0)
            θ r7 = new θ
            r1 = 21
            r7.<init>(r1, r9)
            r8 = 30
            java.lang.String r3 = ";"
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r1 = p000.AbstractC0984xh.m6644(r2, r3, r4, r5, r6, r7, r8)
            int r2 = r9.getChildCount()
            if (r2 <= r0) goto L3f
            int r9 = r9.getChildCount()
            java.lang.String r0 = ";...total="
            java.lang.String r9 = p000.AbstractC0602nx.m4130(r1, r0, r9)
            return r9
        L3f:
            int r9 = r1.length()
            if (r9 != 0) goto L48
            java.lang.String r9 = "empty"
            return r9
        L48:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m5094(android.view.View r6) {
            if (r6 != 0) goto L5
            java.lang.String r6 = "null"
            return r6
        L5:
            boolean r0 = r6 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto Le
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L16
            int r0 = r0.getChildCount()
            goto L17
        L16:
            r0 = 0
        L17:
            java.lang.Class r2 = r6.getClass()
            java.lang.String r2 = r2.getName()
            int r3 = r6.getId()
            int r4 = r6.getWidth()
            int r5 = r6.getHeight()
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            if (r6 == 0) goto L39
            java.lang.Class r6 = r6.getClass()
            java.lang.String r1 = r6.getName()
        L39:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = "{id="
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ",size="
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = "x"
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = ",lp="
            r6.append(r2)
            r6.append(r1)
            java.lang.String r1 = ",children="
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = "}"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    /* JADX INFO: renamed from: η */
    public static int m5095(android.widget.LinearLayout r7, android.view.View r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m5091(r8, r8, r0)
            java.util.Iterator r8 = r0.iterator()
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 != 0) goto L15
            r8 = 0
            goto L45
        L15:
            java.lang.Object r0 = r8.next()
            boolean r2 = r8.hasNext()
            if (r2 != 0) goto L21
        L1f:
            r8 = r0
            goto L45
        L21:
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            r3 = 2
            int[] r4 = new int[r3]
            r2.getLocationOnScreen(r4)
            r2 = r4[r1]
        L2c:
            java.lang.Object r4 = r8.next()
            r5 = r4
            android.view.View r5 = (android.view.View) r5
            int[] r6 = new int[r3]
            r5.getLocationOnScreen(r6)
            r5 = r6[r1]
            if (r2 <= r5) goto L3e
            r0 = r4
            r2 = r5
        L3e:
            boolean r4 = r8.hasNext()
            if (r4 != 0) goto L2c
            goto L1f
        L45:
            android.view.View r8 = (android.view.View) r8
            if (r8 != 0) goto L4e
            int r7 = r7.getChildCount()
            return r7
        L4e:
            android.view.ViewParent r0 = r8.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L66
            android.view.ViewParent r0 = r8.getParent()
            if (r0 == r7) goto L66
            android.view.ViewParent r8 = r8.getParent()
            r8.getClass()
            android.view.View r8 = (android.view.View) r8
            goto L4e
        L66:
            android.view.ViewParent r0 = r8.getParent()
            if (r0 == r7) goto L71
            int r7 = r7.getChildCount()
            return r7
        L71:
            int r7 = r7.indexOfChild(r8)
            if (r7 >= 0) goto L78
            return r1
        L78:
            return r7
    }

    /* JADX INFO: renamed from: θ */
    public static void m5096(java.lang.ClassLoader r2) {
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE655A148DE001A79FAC0ED051157FAA8B5C21A4618C1376FF67C513D2B9EA171EDDC206E1AAC617F550EF8436AABAFC"
            java.lang.String r1 = p000.jf0.m2957(r0)
            java.lang.Class r2 = p000.qe0.m4877(r2, r1)
            if (r2 == 0) goto L28
            f10 r0 = new f10
            r1 = 28
            r0.<init>(r1)
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "onViewCreated"
            p000.qe0.m4873(r2, r1, r0)
            java.lang.String r2 = "rbb4637c919e2110c"
            java.lang.String r0 = "已安装 TitleBarUI 会话删除入口"
            p000.C0888ux.m5975(r2, r0)
            return
        L28:
            java.lang.ClassNotFoundException r2 = new java.lang.ClassNotFoundException
            java.lang.String r0 = p000.jf0.m2957(r0)
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m5097(android.view.ViewGroup.MarginLayoutParams r1, java.lang.String r2) {
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> Lf
            java.lang.reflect.Field r2 = r0.getField(r2)     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            r2.setInt(r1, r0)     // Catch: java.lang.Throwable -> Lf
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L16:
            boolean r1 = r1 instanceof p000.eo1
            r1 = r1 ^ 1
            return r1
    }
}
