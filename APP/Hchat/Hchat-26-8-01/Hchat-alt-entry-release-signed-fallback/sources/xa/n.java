package xa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xa.n f21454a = null;

    static {
            xa.n r0 = new xa.n
            r0.<init>()
            xa.n.f21454a = r0
            return
    }

    public static java.util.List a(r8.g r3, fh.k r4, fg.l r5, ia.t r6) {
            org.luckypray.dexkit.DexKitBridge r0 = r3.f11623d     // Catch: java.lang.Throwable -> L3e
            ch.e r1 = new ch.e     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            r1.f1666h = r4     // Catch: java.lang.Throwable -> L3e
            hh.p r4 = r0.findMethod(r1)     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r0.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3e
        L16:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L40
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L3e
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.ClassLoader r2 = r3.f11622c     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r1 = r1.r(r2)     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r1 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            r1 = r2
        L30:
            boolean r2 = r1 instanceof sf.f     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L36
            r1 = 0
        L36:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L16
            r0.add(r1)     // Catch: java.lang.Throwable -> L3e
            goto L16
        L3e:
            r3 = move-exception
            goto L8c
        L40:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r3.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        L49:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L63
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L49
            r3.add(r0)     // Catch: java.lang.Throwable -> L3e
            goto L49
        L63:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3e
        L71:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L91
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L3e
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r1.toGenericString()     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r4.add(r1)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L71
            r5.add(r0)     // Catch: java.lang.Throwable -> L3e
            goto L71
        L8c:
            sf.f r5 = new sf.f
            r5.<init>(r3)
        L91:
            java.lang.Throwable r3 = sf.g.b(r5)
            if (r3 == 0) goto L9c
            java.lang.String r4 = "定位朋友圈头像长按菜单方法失败"
            r6.invoke(r4, r3)
        L9c:
            boolean r3 = r5 instanceof sf.f
            if (r3 == 0) goto La2
            tf.t r5 = tf.t.f13167g
        La2:
            java.util.List r5 = (java.util.List) r5
            return r5
    }

    public static boolean b(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            boolean r1 = d(r4)
            r2 = 0
            if (r1 == 0) goto L3d
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L23
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L3d
        L23:
            int r4 = r0.length
            r1 = 2
            if (r4 != r1) goto L3d
            java.lang.Class<android.view.MenuItem> r4 = android.view.MenuItem.class
            r1 = r0[r2]
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L3d
            r4 = 1
            r0 = r0[r4]
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L3d
            return r4
        L3d:
            return r2
    }

    public static boolean c(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            boolean r1 = d(r4)
            r2 = 0
            if (r1 == 0) goto L40
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L40
            int r4 = r0.length
            r1 = 3
            if (r4 != r1) goto L40
            java.lang.Class<android.view.ContextMenu> r4 = android.view.ContextMenu.class
            r1 = r0[r2]
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L40
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r1 = 1
            r3 = r0[r1]
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 == 0) goto L40
            r4 = 2
            r4 = r0[r4]
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "android.view.ContextMenu$ContextMenuInfo"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L40
            return r1
        L40:
            return r2
    }

    public static boolean d(java.lang.reflect.Method r1) {
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L20
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L20
            java.lang.Class r1 = r1.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L20
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    public final xa.o e(r8.g r28, ia.t r29) {
            r27 = this;
            r0 = r28
            r1 = r29
            r0.getClass()
            android.content.Context r2 = r0.f11620a
            java.lang.String r3 = "Hchat_sns_avatar_menu_method_cache"
            android.content.SharedPreferences r3 = ub.b.c(r2, r3)
            java.lang.ClassLoader r4 = r0.f11622c
            java.lang.String r2 = e8.b.g(r2, r4)
            java.lang.String r5 = "avatar_menu_create_v2"
            java.util.List r6 = e8.b.f(r3, r2, r4, r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L24:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r6.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            boolean r9 = c(r9)
            if (r9 == 0) goto L24
            r7.add(r8)
            goto L24
        L3b:
            java.lang.String r6 = "avatar_menu_click_v2"
            java.util.List r4 = e8.b.f(r3, r2, r4, r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r4 = r4.iterator()
        L4a:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L61
            java.lang.Object r9 = r4.next()
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            boolean r10 = b(r10)
            if (r10 == 0) goto L4a
            r8.add(r9)
            goto L4a
        L61:
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L73
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L73
            xa.o r0 = new xa.o
            r0.<init>(r8, r7)
            return r0
        L73:
            fh.k r4 = new fh.k
            r4.<init>()
            java.lang.String r7 = "void"
            fh.k.q0(r4, r7)
            java.lang.String r8 = "android.view.View"
            java.lang.String r9 = "android.view.ContextMenu$ContextMenuInfo"
            java.lang.String r10 = "android.view.ContextMenu"
            java.lang.String[] r8 = new java.lang.String[]{r10, r8, r9}
            r4.o0(r8)
            java.lang.String r8 = "MMSocialBlackListFlag"
            java.lang.String r9 = "3552365301"
            java.lang.String[] r8 = new java.lang.String[]{r8, r9}
            r4.r0(r8)
            p8.p r9 = new p8.p
            java.lang.Class<xa.n> r8 = xa.n.class
            java.lang.Class r12 = eh.a.i(r8)
            r16 = 0
            r17 = 15
            r10 = 1
            java.lang.String r13 = "isCreateMethod"
            java.lang.String r14 = "isCreateMethod(Ljava/lang/reflect/Method;)Z"
            r15 = 0
            r11 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.List r4 = a(r0, r4, r9, r1)
            fh.k r9 = new fh.k
            r9.<init>()
            fh.k.q0(r9, r7)
            java.lang.String r10 = "android.view.MenuItem"
            java.lang.String r11 = "int"
            java.lang.String[] r12 = new java.lang.String[]{r10, r11}
            r9.o0(r12)
            java.lang.String r12 = "sns_permission_userName"
            java.lang.String r13 = "clicfg_sns_expose_config_switch_android"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13}
            r9.r0(r12)
            p8.p r18 = new p8.p
            java.lang.Class r21 = eh.a.i(r8)
            r25 = 0
            r26 = 17
            r19 = 1
            java.lang.String r22 = "isClickMethod"
            java.lang.String r23 = "isClickMethod(Ljava/lang/reflect/Method;)Z"
            r24 = 0
            r20 = r27
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r12 = r18
            java.util.List r9 = a(r0, r9, r12, r1)
            fh.k r12 = new fh.k
            r12.<init>()
            java.lang.String r13 = "boolean"
            fh.k.q0(r12, r13)
            java.lang.String[] r13 = new java.lang.String[]{r10, r11}
            r12.o0(r13)
            java.lang.String r13 = "click AVATER_MENU_ID_PERMISSION"
            java.lang.String r14 = "click AVATER_MENU_ID_EXPOSE"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14}
            r12.r0(r13)
            p8.p r18 = new p8.p
            java.lang.Class r21 = eh.a.i(r8)
            r26 = 16
            java.lang.String r22 = "isClickMethod"
            java.lang.String r23 = "isClickMethod(Ljava/lang/reflect/Method;)Z"
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r13 = r18
            java.util.List r12 = a(r0, r12, r13, r1)
            fh.k r13 = new fh.k
            r13.<init>()
            fh.k.q0(r13, r7)
            java.lang.String[] r7 = new java.lang.String[]{r10, r11}
            r13.o0(r7)
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$popPermissionMenuWindow$2"
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r13.r0(r7)
            p8.p r18 = new p8.p
            java.lang.Class r21 = eh.a.i(r8)
            r26 = 18
            java.lang.String r22 = "isClickMethod"
            java.lang.String r23 = "isClickMethod(Ljava/lang/reflect/Method;)Z"
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r7 = r18
            java.util.List r0 = a(r0, r13, r7, r1)
            java.util.ArrayList r1 = tf.m.F1(r9, r12)
            java.util.ArrayList r0 = tf.m.F1(r1, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L15f:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L17a
            java.lang.Object r8 = r0.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r9 = r9.toGenericString()
            boolean r9 = r1.add(r9)
            if (r9 == 0) goto L15f
            r7.add(r8)
            goto L15f
        L17a:
            boolean r0 = r4.isEmpty()
            java.lang.String r1 = ""
            java.lang.String r8 = "cache.key"
            e8.b r9 = e8.b.f2358a
            if (r0 != 0) goto L18a
            r9.j(r3, r2, r5, r4)
            goto L1a6
        L18a:
            android.content.SharedPreferences$Editor r0 = r3.edit()     // Catch: java.lang.Throwable -> L1a6
            java.lang.String r10 = r3.getString(r8, r1)     // Catch: java.lang.Throwable -> L1a6
            boolean r10 = gg.l.a(r10, r2)     // Catch: java.lang.Throwable -> L1a6
            if (r10 != 0) goto L19f
            android.content.SharedPreferences$Editor r10 = r0.clear()     // Catch: java.lang.Throwable -> L1a6
            r10.putString(r8, r2)     // Catch: java.lang.Throwable -> L1a6
        L19f:
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)     // Catch: java.lang.Throwable -> L1a6
            r0.apply()     // Catch: java.lang.Throwable -> L1a6
        L1a6:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L1b0
            r9.j(r3, r2, r6, r7)
            goto L1cc
        L1b0:
            android.content.SharedPreferences$Editor r0 = r3.edit()     // Catch: java.lang.Throwable -> L1cc
            java.lang.String r1 = r3.getString(r8, r1)     // Catch: java.lang.Throwable -> L1cc
            boolean r1 = gg.l.a(r1, r2)     // Catch: java.lang.Throwable -> L1cc
            if (r1 != 0) goto L1c5
            android.content.SharedPreferences$Editor r1 = r0.clear()     // Catch: java.lang.Throwable -> L1cc
            r1.putString(r8, r2)     // Catch: java.lang.Throwable -> L1cc
        L1c5:
            android.content.SharedPreferences$Editor r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> L1cc
            r0.apply()     // Catch: java.lang.Throwable -> L1cc
        L1cc:
            xa.o r0 = new xa.o
            r0.<init>(r7, r4)
            return r0
    }
}
