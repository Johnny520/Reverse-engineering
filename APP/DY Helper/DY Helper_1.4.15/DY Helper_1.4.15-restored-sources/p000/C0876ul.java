package p000;

/* JADX INFO: renamed from: ul */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0876ul implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10906;

    public /* synthetic */ C0876ul(int r1) {
            r0 = this;
            r0.f10906 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0876ul(p000.C1025yl r1) {
            r0 = this;
            r1 = 4
            r0.f10906 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r8 = r8.f10906
            r0 = 0
            r1 = 1
            switch(r8) {
                case 0: goto L3b2;
                case 1: goto L397;
                case 2: goto L37c;
                case 3: goto L345;
                case 4: goto L324;
                case 5: goto L2ec;
                case 6: goto L2df;
                case 7: goto L2c0;
                case 8: goto L2b9;
                case 9: goto L2a9;
                case 10: goto L298;
                case 11: goto L27b;
                case 12: goto L268;
                case 13: goto L254;
                case 14: goto L241;
                case 15: goto L22d;
                case 16: goto L21d;
                case 17: goto L15f;
                case 18: goto L12c;
                case 19: goto L124;
                case 20: goto Le7;
                case 21: goto Ldf;
                case 22: goto Lb7;
                case 23: goto Laf;
                case 24: goto L7d;
                case 25: goto L75;
                case 26: goto L3c;
                case 27: goto L34;
                case 28: goto L14;
                default: goto L7;
            }
        L7:
            java.lang.ClassLoader r9 = (java.lang.ClassLoader) r9
            r9.getClass()
            jm r8 = p000.C0436jm.f5518
            r8.m2970(r9)
            s62 r8 = p000.s62.f9751
            return r8
        L14:
            java.lang.ClassLoader r9 = (java.lang.ClassLoader) r9
            r9.getClass()
            qx r8 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6246
            java.lang.String r0 = p000.C0666ox.m4320(r0, r9)
            java.lang.String r1 = "定位评论区搜索入口视图初始化"
            cb r2 = new cb
            r3 = 22
            r2.<init>(r9, r3)
            r8.<init>(r0, r1, r2)
            java.util.List r8 = p000.AbstractC1021yh.m6896(r8)
            return r8
        L34:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            r9.setAccessible(r1)
            s62 r8 = p000.s62.f9751
            return r8
        L3c:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.util.Set r8 = p000.AbstractC0253em.f3591
            java.lang.String r2 = r9.getName()
            boolean r8 = r8.contains(r2)
            if (r8 == 0) goto L70
            java.lang.Class r8 = r9.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r8 = p000.ln0.m3626(r8, r2)
            if (r8 == 0) goto L70
            java.lang.Class[] r8 = r9.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L61
            goto L70
        L61:
            java.lang.Class<android.view.ViewGroup> r8 = android.view.ViewGroup.class
            java.lang.Class[] r9 = r9.getParameterTypes()
            r9 = r9[r0]
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L70
            r0 = r1
        L70:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        L75:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            r9.setAccessible(r1)
            s62 r8 = p000.s62.f9751
            return r8
        L7d:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r8 = r9.getName()
            java.lang.String r2 = "getIntValue"
            boolean r8 = p000.ln0.m3626(r8, r2)
            if (r8 == 0) goto Laa
            java.lang.Class r8 = r9.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r8 = p000.ln0.m3626(r8, r2)
            if (r8 == 0) goto Laa
            java.lang.Class[] r8 = r9.getParameterTypes()
            java.lang.Class r9 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r9 = new java.lang.Class[]{r9, r3, r2, r2}
            boolean r8 = java.util.Arrays.equals(r8, r9)
            if (r8 == 0) goto Laa
            r0 = r1
        Laa:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        Laf:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            r9.setAccessible(r1)
            s62 r8 = p000.s62.f9751
            return r8
        Lb7:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            int r8 = r9.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 == 0) goto Lda
            java.lang.Class[] r8 = r9.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto Lda
            java.lang.Class r8 = r9.getReturnType()
            java.lang.Class r9 = java.lang.Boolean.TYPE
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto Lda
            r0 = r1
        Lda:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        Ldf:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            r9.setAccessible(r1)
            s62 r8 = p000.s62.f9751
            return r8
        Le7:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r8 = r9.getName()
            java.lang.String r2 = "isAllowShowCommentRelatedSearchView"
            boolean r8 = p000.ln0.m3626(r8, r2)
            if (r8 == 0) goto L11f
            java.lang.Class r8 = r9.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r8 = p000.ln0.m3626(r8, r2)
            if (r8 == 0) goto L11f
            java.lang.Class[] r8 = r9.getParameterTypes()
            int r8 = r8.length
            if (r8 != r1) goto L11f
            java.lang.Class[] r8 = r9.getParameterTypes()
            r8 = r8[r0]
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r9 = p000.jf0.m2957(r9)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L11f
            r0 = r1
        L11f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        L124:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            r9.setAccessible(r1)
            s62 r8 = p000.s62.f9751
            return r8
        L12c:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            int r8 = r9.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L15a
            java.lang.Class r8 = r9.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r8 = p000.ln0.m3626(r8, r2)
            if (r8 == 0) goto L15a
            java.lang.Class[] r8 = r9.getParameterTypes()
            int r8 = r8.length
            if (r8 != r1) goto L15a
            java.lang.Class<android.view.View> r8 = android.view.View.class
            java.lang.Class[] r9 = r9.getParameterTypes()
            r9 = r9[r0]
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L15a
            r0 = r1
        L15a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        L15f:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r8 = "*"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L174
            java.lang.String r8 = "hide_comment_input_bar_enabled"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L21a
        L174:
            dm r8 = p000.C0217dm.f3216
            java.lang.String r8 = "hide_comment_input_bar_enabled"
            boolean r8 = p000.C0217dm.m1777(r8)
            if (r8 != 0) goto L21a
            java.util.Map r8 = p000.AbstractC0327gm.f4416
            monitor-enter(r8)
            java.util.Set r9 = r8.entrySet()     // Catch: java.lang.Throwable -> L1b3
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L1b3
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b3
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r9, r1)     // Catch: java.lang.Throwable -> L1b3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1b3
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L1b3
        L196:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L1b3
            if (r1 == 0) goto L1b6
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L1b3
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1b3
            l91 r3 = new l91     // Catch: java.lang.Throwable -> L1b3
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L1b3
            r0.add(r3)     // Catch: java.lang.Throwable -> L1b3
            goto L196
        L1b3:
            r0 = move-exception
            r9 = r0
            goto L218
        L1b6:
            monitor-exit(r8)
            java.lang.ThreadLocal r8 = p000.AbstractC0327gm.f4417
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.set(r9)
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> L210
        L1c2:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L210
            if (r9 == 0) goto L1ff
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L210
            l91 r9 = (p000.l91) r9     // Catch: java.lang.Throwable -> L210
            java.lang.Object r0 = r9.f6502     // Catch: java.lang.Throwable -> L210
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L210
            java.lang.Object r9 = r9.f6503     // Catch: java.lang.Throwable -> L210
            fm r9 = (p000.C0290fm) r9     // Catch: java.lang.Throwable -> L210
            int r1 = r9.f4012     // Catch: java.lang.Throwable -> L210
            r0.setVisibility(r1)     // Catch: java.lang.Throwable -> L210
            float r1 = r9.f4013     // Catch: java.lang.Throwable -> L210
            r0.setAlpha(r1)     // Catch: java.lang.Throwable -> L210
            boolean r1 = r9.f4014     // Catch: java.lang.Throwable -> L210
            r0.setEnabled(r1)     // Catch: java.lang.Throwable -> L210
            boolean r1 = r9.f4015     // Catch: java.lang.Throwable -> L210
            r0.setClickable(r1)     // Catch: java.lang.Throwable -> L210
            boolean r1 = r9.f4016     // Catch: java.lang.Throwable -> L210
            r0.setLongClickable(r1)     // Catch: java.lang.Throwable -> L210
            boolean r1 = r9.f4017     // Catch: java.lang.Throwable -> L210
            r0.setFocusable(r1)     // Catch: java.lang.Throwable -> L210
            boolean r1 = r9.f4018     // Catch: java.lang.Throwable -> L210
            r0.setFocusableInTouchMode(r1)     // Catch: java.lang.Throwable -> L210
            int r9 = r9.f4019     // Catch: java.lang.Throwable -> L210
            r0.setImportantForAccessibility(r9)     // Catch: java.lang.Throwable -> L210
            goto L1c2
        L1ff:
            java.lang.ThreadLocal r8 = p000.AbstractC0327gm.f4417
            r8.remove()
            java.util.Map r8 = p000.AbstractC0327gm.f4416
            monitor-enter(r8)
            r8.clear()     // Catch: java.lang.Throwable -> L20c
            monitor-exit(r8)
            goto L21a
        L20c:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)
            throw r9
        L210:
            r0 = move-exception
            r8 = r0
            java.lang.ThreadLocal r9 = p000.AbstractC0327gm.f4417
            r9.remove()
            throw r8
        L218:
            monitor-exit(r8)
            throw r9
        L21a:
            s62 r8 = p000.s62.f9751
            return r8
        L21d:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            int r8 = r9.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            r8 = r8 ^ r1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L22d:
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            r9.getClass()
            java.lang.Class<android.util.SparseArray> r8 = android.util.SparseArray.class
            java.lang.Class r9 = r9.getType()
            boolean r8 = r8.isAssignableFrom(r9)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L241:
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            r9.getClass()
            int r8 = r9.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            r8 = r8 ^ r1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L254:
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            r9.getClass()
            java.lang.Class<android.util.SparseArray> r8 = android.util.SparseArray.class
            java.lang.Class r9 = r9.getType()
            boolean r8 = r8.isAssignableFrom(r9)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L268:
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            r9.getClass()
            int r8 = r9.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            r8 = r8 ^ r1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L27b:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.Class[] r8 = r9.getParameterTypes()
            int r8 = r8.length
            if (r8 != r1) goto L293
            java.lang.Class[] r8 = r9.getParameterTypes()
            r8 = r8[r0]
            java.lang.Class r9 = java.lang.Integer.TYPE
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto L293
            r0 = r1
        L293:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        L298:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.Class r8 = r9.getReturnType()
            java.lang.Class r9 = java.lang.Void.TYPE
            boolean r8 = p000.ln0.m3626(r8, r9)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L2a9:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            int r8 = r9.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isAbstract(r8)
            r8 = r8 ^ r1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L2b9:
            java.lang.Class r9 = (java.lang.Class) r9
            java.lang.String r8 = r9.getName()
            return r8
        L2c0:
            android.view.View r9 = (android.view.View) r9
            r9.getClass()
            java.util.Map r8 = p000.C1025yl.f12676
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto L2dc
            int r8 = r9.getVisibility()
            r0 = 8
            if (r8 == r0) goto L2dc
            yl r8 = p000.C1025yl.f12669
            java.lang.String r8 = "panel.onViewCreated"
            p000.C1025yl.m6926(r9, r8)
        L2dc:
            s62 r8 = p000.s62.f9751
            return r8
        L2df:
            java.lang.ClassLoader r9 = (java.lang.ClassLoader) r9
            r9.getClass()
            yl r8 = p000.C1025yl.f12669
            r8.m6937(r9)
            s62 r8 = p000.s62.f9751
            return r8
        L2ec:
            java.lang.ClassLoader r9 = (java.lang.ClassLoader) r9
            r9.getClass()
            qx r8 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6245
            java.lang.String r0 = p000.C0666ox.m4320(r0, r9)
            java.lang.String r1 = "定位评论键盘面板视图初始化入口"
            cb r2 = new cb
            r3 = 20
            r2.<init>(r9, r3)
            r8.<init>(r0, r1, r2)
            qx r0 = new qx
            kx r1 = p000.EnumC0491kx.f6244
            java.lang.String r1 = p000.C0666ox.m4320(r1, r9)
            java.lang.String r2 = "定位评论输入框发布作品预览控件初始化"
            cb r3 = new cb
            r4 = 21
            r3.<init>(r9, r4)
            r0.<init>(r1, r2, r3)
            qx[] r8 = new p000.C0740qx[]{r8, r0}
            java.util.List r8 = p000.AbstractC1021yh.m6897(r8)
            return r8
        L324:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r8 = "*"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L339
            java.lang.String r8 = "hide_comment_keyboard_entrance_enabled"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L342
        L339:
            boolean r8 = p000.C1025yl.m6927()
            if (r8 != 0) goto L342
            p000.C1025yl.m6935()
        L342:
            s62 r8 = p000.s62.f9751
            return r8
        L345:
            android.view.View r9 = (android.view.View) r9
            s62 r8 = p000.s62.f9751
            r9.getClass()
            boolean r1 = r9 instanceof android.widget.Checkable
            if (r1 == 0) goto L37b
            yl r1 = p000.C1025yl.f12669
            boolean r1 = p000.C1025yl.m6929(r9)
            if (r1 == 0) goto L37b
            r1 = r9
            android.widget.Checkable r1 = (android.widget.Checkable) r1     // Catch: java.lang.Throwable -> L363
            r1.setChecked(r0)     // Catch: java.lang.Throwable -> L363
            r9.setSelected(r0)     // Catch: java.lang.Throwable -> L363
            r0 = r8
            goto L36a
        L363:
            r0 = move-exception
            r9 = r0
            eo1 r0 = new eo1
            r0.<init>(r9)
        L36a:
            java.lang.Throwable r9 = p000.fo1.m2190(r0)
            if (r9 == 0) goto L37b
            java.lang.String r0 = "r931d7e30ef229d29"
            java.lang.String r9 = r9.getMessage()
            java.lang.String r1 = "uncheck publish checkbox failed: "
            p000.AbstractC0602nx.m4143(r1, r9, r0)
        L37b:
            return r8
        L37c:
            r2 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r2
            r2.getClass()
            java.lang.String r3 = "void"
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r2, r3, r4, r5, r6, r7)
            java.lang.String r8 = "android.view.View"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            r2.paramTypes(r8)
            s62 r8 = p000.s62.f9751
            return r8
        L397:
            r0 = r9
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.String r1 = "void"
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r8 = "PublishToAwemeUtils#toPublishPreviewTextEdit"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            r0.usingStrings(r8)
            s62 r8 = p000.s62.f9751
            return r8
        L3b2:
            org.luckypray.dexkit.query.FindMethod r9 = (org.luckypray.dexkit.query.FindMethod) r9
            r9.getClass()
            ul r8 = new ul
            r0 = 2
            r8.<init>(r0)
            r9.matcher(r8)
            s62 r8 = p000.s62.f9751
            return r8
    }
}
