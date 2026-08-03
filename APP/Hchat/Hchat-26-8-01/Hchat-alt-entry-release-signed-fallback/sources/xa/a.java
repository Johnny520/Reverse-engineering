package xa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xa.a f21418a = null;

    static {
            xa.a r0 = new xa.a
            r0.<init>()
            xa.a.f21418a = r0
            return
    }

    public static boolean a(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            boolean r1 = b(r4)
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

    public static boolean b(java.lang.reflect.Method r1) {
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

    public static boolean c(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            boolean r1 = b(r4)
            r2 = 0
            if (r1 == 0) goto L47
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L47
            int r4 = r0.length
            r1 = 4
            if (r4 != r1) goto L47
            java.lang.Class<android.widget.AdapterView> r4 = android.widget.AdapterView.class
            r1 = r0[r2]
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L47
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r1 = 1
            r3 = r0[r1]
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 == 0) goto L47
            r4 = 2
            r4 = r0[r4]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r4 = gg.l.a(r4, r3)
            if (r4 == 0) goto L47
            r4 = 3
            r4 = r0[r4]
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L47
            return r1
        L47:
            return r2
    }

    public final java.lang.reflect.Method d(r8.g r12, fg.p r13) {
            r11 = this;
            r12.getClass()
            android.content.Context r0 = r12.f11620a
            java.lang.String r1 = "Hchat_conversation_menu_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r0, r1)
            java.lang.ClassLoader r2 = r12.f11622c
            java.lang.String r0 = e8.b.g(r0, r2)
            java.lang.String r3 = "context_menu_create_v2"
            java.lang.reflect.Method r2 = e8.b.c(r1, r0, r2, r3)
            r4 = 0
            if (r2 == 0) goto L25
            boolean r5 = a(r2)
            if (r5 == 0) goto L21
            goto L22
        L21:
            r2 = r4
        L22:
            if (r2 == 0) goto L25
            return r2
        L25:
            org.luckypray.dexkit.DexKitBridge r2 = r12.f11623d     // Catch: java.lang.Throwable -> L81
            ch.e r5 = new ch.e     // Catch: java.lang.Throwable -> L81
            r5.<init>()     // Catch: java.lang.Throwable -> L81
            fh.k r6 = new fh.k     // Catch: java.lang.Throwable -> L81
            r6.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = "com.tencent.mm.ui.conversation."
            r8 = 1
            r6.l0(r8, r7)     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = "boolean"
            fh.k.q0(r6, r7)     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = "android.widget.AdapterView"
            java.lang.String r8 = "android.view.View"
            java.lang.String r9 = "int"
            java.lang.String r10 = "long"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10}     // Catch: java.lang.Throwable -> L81
            r6.o0(r7)     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = "headercount:%d, postion:%d"
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L81
            r6.r0(r7)     // Catch: java.lang.Throwable -> L81
            r5.f1666h = r6     // Catch: java.lang.Throwable -> L81
            hh.p r2 = r2.findMethod(r5)     // Catch: java.lang.Throwable -> L81
            dg.n r2 = tf.m.m1(r2)     // Catch: java.lang.Throwable -> L81
            c9.o1 r5 = new c9.o1     // Catch: java.lang.Throwable -> L81
            r6 = 4
            r5.<init>(r11, r12, r6)     // Catch: java.lang.Throwable -> L81
            ng.i r12 = ng.m.X(r2, r5)     // Catch: java.lang.Throwable -> L81
            ng.h r2 = new ng.h     // Catch: java.lang.Throwable -> L81
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L81
        L6d:
            boolean r12 = r2.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r12 == 0) goto L83
            java.lang.Object r12 = r2.next()     // Catch: java.lang.Throwable -> L81
            r5 = r12
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L81
            boolean r5 = c(r5)     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L6d
            goto L84
        L81:
            r12 = move-exception
            goto La7
        L83:
            r12 = r4
        L84:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch: java.lang.Throwable -> L81
            if (r12 == 0) goto La5
            java.lang.Class r12 = r12.getDeclaringClass()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "onCreateContextMenu"
            java.lang.Class<android.view.ContextMenu> r5 = android.view.ContextMenu.class
            java.lang.Class<android.view.View> r6 = android.view.View.class
            java.lang.Class<android.view.ContextMenu$ContextMenuInfo> r7 = android.view.ContextMenu.ContextMenuInfo.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6, r7}     // Catch: java.lang.Throwable -> L81
            java.lang.reflect.Method r12 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r12, r2, r5)     // Catch: java.lang.Throwable -> L81
            if (r12 == 0) goto La5
            boolean r2 = a(r12)     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto La5
            goto Lad
        La5:
            r12 = r4
            goto Lad
        La7:
            sf.f r2 = new sf.f
            r2.<init>(r12)
            r12 = r2
        Lad:
            java.lang.Throwable r2 = sf.g.b(r12)
            if (r2 == 0) goto Lb8
            java.lang.String r5 = "定位会话长按菜单创建方法失败"
            r13.invoke(r5, r2)
        Lb8:
            boolean r13 = r12 instanceof sf.f
            if (r13 == 0) goto Lbd
            goto Lbe
        Lbd:
            r4 = r12
        Lbe:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto Lc6
            e8.b.h(r1, r0, r3, r4)
            goto Le6
        Lc6:
            java.lang.String r12 = "cache.key"
            android.content.SharedPreferences$Editor r13 = r1.edit()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r2 = ""
            java.lang.String r1 = r1.getString(r12, r2)     // Catch: java.lang.Throwable -> Le6
            boolean r1 = gg.l.a(r1, r0)     // Catch: java.lang.Throwable -> Le6
            if (r1 != 0) goto Ldf
            android.content.SharedPreferences$Editor r1 = r13.clear()     // Catch: java.lang.Throwable -> Le6
            r1.putString(r12, r0)     // Catch: java.lang.Throwable -> Le6
        Ldf:
            android.content.SharedPreferences$Editor r12 = r13.remove(r3)     // Catch: java.lang.Throwable -> Le6
            r12.apply()     // Catch: java.lang.Throwable -> Le6
        Le6:
            return r4
    }
}
