package y8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y8.d f22310b;

    public /* synthetic */ b(y8.d r1, int r2) {
            r0 = this;
            r0.f22309a = r2
            r0.f22310b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r10) {
            r9 = this;
            int r0 = r9.f22309a
            switch(r0) {
                case 0: goto Ldb;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r10)
            return
        L9:
            y8.d r0 = r9.f22310b
            ia.t r1 = r0.f22317a
            r10.getClass()
            java.lang.Object r10 = r10.thisObject
            boolean r2 = r10 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L1a
            android.app.Activity r10 = (android.app.Activity) r10
            goto L1b
        L1a:
            r10 = r3
        L1b:
            if (r10 == 0) goto Lda
            java.util.LinkedHashSet r2 = r0.f22323g
            java.lang.String r4 = "androidx.viewpager.widget.ViewPager$OnPageChangeListener"
            java.lang.Object r4 = y8.d.b(r10, r4)
            r5 = 1
            if (r4 == 0) goto L82
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r6 = java.lang.Integer.TYPE
            r6.getClass()
            java.lang.Class[] r6 = new java.lang.Class[]{r6}
            java.lang.String r7 = "onPageSelected"
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethodRecursive(r4, r7, r6)
            boolean r6 = y8.d.a(r4)
            if (r6 != 0) goto L4e
            boolean r2 = r0.f22324h
            if (r2 == 0) goto L46
            goto L8e
        L46:
            r0.f22324h = r5
            java.lang.String r2 = "未找到聊天媒体翻页回调"
            r1.invoke(r2, r3)
            goto L8e
        L4e:
            r4.getClass()
            boolean r6 = r2.add(r4)
            if (r6 != 0) goto L58
            goto L8e
        L58:
            r8.i r6 = r8.i.f11631b     // Catch: java.lang.Throwable -> L65
            y8.b r7 = new y8.b     // Catch: java.lang.Throwable -> L65
            r8 = 0
            r7.<init>(r0, r8)     // Catch: java.lang.Throwable -> L65
            de.robv.android.xposed.XC_MethodHook$Unhook r6 = r6.b(r4, r7)     // Catch: java.lang.Throwable -> L65
            goto L6c
        L65:
            r6 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r6)
            r6 = r7
        L6c:
            java.lang.Throwable r6 = sf.g.b(r6)
            if (r6 == 0) goto L8e
            r2.remove(r4)
            boolean r2 = r0.f22324h
            if (r2 == 0) goto L7a
            goto L8e
        L7a:
            r0.f22324h = r5
            java.lang.String r2 = "安装聊天媒体翻页 Hook 失败"
            r1.invoke(r2, r6)
            goto L8e
        L82:
            boolean r2 = r0.f22324h
            if (r2 == 0) goto L87
            goto L8e
        L87:
            r0.f22324h = r5
            java.lang.String r2 = "未找到聊天媒体翻页监听器"
            r1.invoke(r2, r3)
        L8e:
            java.lang.String r1 = "com.tencent.mm.ui.base.MMViewPager"
            java.lang.Object r1 = y8.d.b(r10, r1)
            if (r1 == 0) goto Lbd
            java.lang.Class r2 = r1.getClass()
            java.lang.String r4 = "getCurrentItem"
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[r5]
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethodRecursive(r2, r4, r6)
            if (r2 == 0) goto Lbd
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r2, r1, r4)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto Lb2
            java.lang.Number r1 = (java.lang.Number) r1
            goto Lb3
        Lb2:
            r1 = r3
        Lb3:
            if (r1 == 0) goto Lbd
            int r1 = r1.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        Lbd:
            if (r3 == 0) goto Lc4
            int r1 = r3.intValue()
            goto Ld5
        Lc4:
            java.util.WeakHashMap r1 = r0.f22321e
            java.lang.Object r1 = r1.get(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Ld3
            int r1 = r1.intValue()
            goto Ld5
        Ld3:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        Ld5:
            r2 = 0
            r0.c(r10, r1, r2)
        Lda:
            return
        Ldb:
            r10.getClass()
            java.lang.Object r0 = r10.thisObject
            r0.getClass()
            java.lang.String r1 = "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI"
            java.lang.Object r0 = y8.d.b(r0, r1)
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto Lf1
            android.app.Activity r0 = (android.app.Activity) r0
            goto Lf2
        Lf1:
            r0 = r2
        Lf2:
            if (r0 == 0) goto L111
            java.lang.Object[] r10 = r10.args
            r10.getClass()
            java.lang.Object r10 = tf.l.z0(r10)
            boolean r1 = r10 instanceof java.lang.Number
            if (r1 == 0) goto L104
            r2 = r10
            java.lang.Number r2 = (java.lang.Number) r2
        L104:
            if (r2 == 0) goto L111
            int r10 = r2.intValue()
            r1 = 80
            y8.d r3 = r9.f22310b
            r3.c(r0, r10, r1)
        L111:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
            r3 = this;
            int r0 = r3.f22309a
            switch(r0) {
                case 2: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r4)
            return
        L9:
            r4.getClass()
            java.lang.Object r4 = r4.thisObject
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L15
            android.app.Activity r4 = (android.app.Activity) r4
            goto L16
        L15:
            r4 = 0
        L16:
            if (r4 == 0) goto L33
            y8.d r0 = r3.f22310b
            java.util.WeakHashMap r1 = r0.f22320d
            java.lang.Object r1 = r1.remove(r4)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L29
            android.os.Handler r2 = r0.f22319c
            r2.removeCallbacks(r1)
        L29:
            java.util.WeakHashMap r1 = r0.f22321e
            r1.remove(r4)
            java.util.WeakHashMap r0 = r0.f22322f
            r0.remove(r4)
        L33:
            return
    }
}
