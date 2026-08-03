package a;

/* JADX INFO: loaded from: classes.dex */
public final class A8 implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static java.lang.reflect.Field a(java.lang.Class r3, java.lang.String r4) {
        L0:
            r0 = 0
            if (r3 == 0) goto L21
            java.lang.reflect.Field r1 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Lc
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> Lc
            goto L11
        Lc:
            r1 = move-exception
            a.wd$a r1 = a.C0465xd.a(r1)
        L11:
            boolean r2 = r1 instanceof a.C0447wd.a
            if (r2 == 0) goto L16
            goto L17
        L16:
            r0 = r1
        L17:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 == 0) goto L1c
            return r0
        L1c:
            java.lang.Class r3 = r3.getSuperclass()
            goto L0
        L21:
            return r0
    }

    public static android.widget.TextView b(android.view.View r5) {
            boolean r0 = r5 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L25
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r2 = r0.getText()
            if (r2 == 0) goto L14
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            java.lang.String r3 = "聊天记录"
            boolean r4 = r2.equals(r3)
            if (r4 != 0) goto L24
            boolean r2 = a.Ae.H(r2, r3, r1)
            if (r2 == 0) goto L25
        L24:
            return r0
        L25:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L44
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
        L2f:
            if (r1 >= r0) goto L44
            android.view.View r2 = r5.getChildAt(r1)
            java.lang.String r3 = "getChildAt(...)"
            a.C0193i9.d(r2, r3)
            android.widget.TextView r2 = b(r2)
            if (r2 == 0) goto L41
            return r2
        L41:
            int r1 = r1 + 1
            goto L2f
        L44:
            r5 = 0
            return r5
    }

    public static boolean c(android.app.Activity r9, java.util.List r10) {
            r0 = 1
            android.view.Window r1 = r9.getWindow()
            r2 = 0
            if (r1 == 0) goto Ld
            android.view.View r1 = r1.getDecorView()
            goto Le
        Ld:
            r1 = r2
        Le:
            r3 = 8
            r4 = 0
            if (r1 == 0) goto L9f
            android.widget.TextView r1 = b(r1)
            if (r1 == 0) goto L9f
            android.view.ViewParent r5 = r1.getParent()
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L24
            android.view.View r5 = (android.view.View) r5
            goto L25
        L24:
            r5 = r2
        L25:
            if (r5 != 0) goto L29
        L27:
            r5 = r2
            goto L7c
        L29:
            r6 = r4
        L2a:
            android.view.ViewParent r7 = r5.getParent()
            if (r7 == 0) goto L53
            r7 = 3
            if (r6 >= r7) goto L53
            android.graphics.drawable.Drawable r7 = r5.getBackground()
            if (r7 == 0) goto L42
            int r7 = r5.getHeight()
            r8 = 600(0x258, float:8.41E-43)
            if (r7 >= r8) goto L42
            goto L7c
        L42:
            android.view.ViewParent r5 = r5.getParent()
            boolean r7 = r5 instanceof android.view.View
            if (r7 == 0) goto L4d
            android.view.View r5 = (android.view.View) r5
            goto L4e
        L4d:
            r5 = r2
        L4e:
            if (r5 != 0) goto L51
            goto L53
        L51:
            int r6 = r6 + r0
            goto L2a
        L53:
            android.view.ViewParent r5 = r1.getParent()
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L5e
            android.view.View r5 = (android.view.View) r5
            goto L5f
        L5e:
            r5 = r2
        L5f:
            if (r5 == 0) goto L66
            android.view.ViewParent r5 = r5.getParent()
            goto L67
        L66:
            r5 = r2
        L67:
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L6e
            android.view.View r5 = (android.view.View) r5
            goto L6f
        L6e:
            r5 = r2
        L6f:
            if (r5 != 0) goto L7c
            android.view.ViewParent r1 = r1.getParent()
            boolean r5 = r1 instanceof android.view.View
            if (r5 == 0) goto L27
            r5 = r1
            android.view.View r5 = (android.view.View) r5
        L7c:
            if (r5 == 0) goto L9f
            int r1 = r5.getVisibility()
            if (r1 == r3) goto L9f
            r5.setVisibility(r3)
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r4 = "HideStorageChatRecord: chat record row hidden (card="
            java.lang.String r5 = ")"
            java.lang.String r1 = a.C0487z.g(r4, r1, r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0282n9.m(r1)
            r4 = r0
        L9f:
            java.util.Iterator r10 = r10.iterator()
        La3:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto Led
            java.lang.Object r1 = r10.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Object r5 = r1.get(r9)     // Catch: java.lang.Throwable -> Lba
            boolean r6 = r5 instanceof android.view.View     // Catch: java.lang.Throwable -> Lba
            if (r6 == 0) goto Lbc
            android.view.View r5 = (android.view.View) r5     // Catch: java.lang.Throwable -> Lba
            goto Lbd
        Lba:
            r1 = move-exception
            goto Le9
        Lbc:
            r5 = r2
        Lbd:
            if (r5 != 0) goto Lc0
            goto Le6
        Lc0:
            int r6 = r5.getVisibility()     // Catch: java.lang.Throwable -> Lba
            if (r6 == r3) goto Le6
            r5.setVisibility(r3)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Lba
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lba
            r5.<init>()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = "HideStorageChatRecord: chat record card hidden via field "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lba
            r5.append(r1)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> Lba
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> Lba
            a.C0282n9.m(r1)     // Catch: java.lang.Throwable -> Lba
            r4 = r0
        Le6:
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lba
            goto La3
        Le9:
            a.C0465xd.a(r1)
            goto La3
        Led:
            if (r4 != 0) goto Lfc
            java.lang.String r9 = "HideStorageChatRecord: nothing to hide this pass"
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)
            a.C0453x1.b(r9)
        Lfc:
            return r4
    }

    public final void d(android.app.Activity r7, int r8) {
            r6 = this;
            r0 = 3
            if (r8 < r0) goto L5
            goto L86
        L5:
            java.lang.String r0 = "clean_msg_root_view_fields_v2"
            org.json.JSONObject r0 = a.C0043a5.d(r0)
            if (r0 == 0) goto L14
            java.lang.String r1 = "fields"
            java.util.List r0 = a.C0043a5.g(r1, r0)
            goto L16
        L14:
            a.Y5 r0 = a.Y5.f351a
        L16:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r3 = r7.getClass()
            java.lang.reflect.Field r2 = a(r3, r2)
            if (r2 == 0) goto L1f
            r1.add(r2)
            goto L1f
        L39:
            boolean r0 = c(r7, r1)
            if (r0 == 0) goto L40
            goto L86
        L40:
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 800(0x320, double:3.953E-321)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1500(0x5dc, double:7.41E-321)
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.Long[] r0 = new java.lang.Long[]{r0, r1, r4}
            java.util.List r0 = a.C0294o3.d0(r0)
            android.view.Window r1 = r7.getWindow()
            if (r1 == 0) goto L86
            android.view.View r1 = r1.getDecorView()
            if (r1 == 0) goto L86
            a.k0 r4 = new a.k0
            r5 = 4
            r4.<init>(r6, r7, r8, r5)
            if (r8 < 0) goto L79
            int r7 = r0.size()
            if (r8 >= r7) goto L79
            java.lang.Object r7 = r0.get(r8)
            goto L7d
        L79:
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
        L7d:
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            r1.postDelayed(r4, r7)
        L86:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r28) {
            r27 = this;
            r1 = r27
            r2 = r28
            r8 = 1
            java.lang.String r0 = "session"
            a.C0193i9.e(r2, r0)
            a.ld r0 = a.C0250ld.f560a
            r0.a()
            a.fd r9 = new a.fd
            int r0 = a.B1.f21a
            r10 = 0
            r3 = -1
            if (r0 != r3) goto L37
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L29
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L29
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = "com.tencent.mm"
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r10)     // Catch: java.lang.Exception -> L29
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> L29
            goto L35
        L29:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            a.C0453x1.a(r0)
        L35:
            a.B1.f21a = r3
        L37:
            int r0 = a.B1.f21a
            java.lang.ClassLoader r3 = r2.f136a
            r9.<init>(r0, r3)
            a.hd r0 = a.C0179hd.f499a
            r0.getClass()
            java.lang.String r0 = "F019_clean_new_ui"
            a.gd r0 = a.C0179hd.a(r0, r9)
            boolean r3 = r0.f485a
            java.lang.String r11 = "F019"
            java.lang.String r12 = "HideStorageChatRecord"
            if (r3 == 0) goto L3ec
            java.lang.Class<?> r13 = r0.b
            if (r13 != 0) goto L57
            goto L3ec
        L57:
            java.lang.String r0 = r13.getName()
            java.lang.String r3 = "Resolver: CleanNewUI → "
            java.lang.String r0 = r3.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}
            a.C0453x1.b(r0)
            java.lang.String r3 = "clean_msg_root_view_fields_v2"
            org.json.JSONObject r0 = a.C0043a5.d(r3)
            a.Y5 r4 = a.Y5.f351a
            java.lang.String r5 = "fields"
            if (r0 == 0) goto L79
            java.util.List r0 = a.C0043a5.g(r5, r0)
            goto L7a
        L79:
            r0 = r4
        L7a:
            boolean r6 = r0.isEmpty()
            r15 = 0
            if (r6 != 0) goto La9
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L8a:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto La0
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = a(r13, r7)
            if (r7 == 0) goto L8a
            r6.add(r7)
            goto L8a
        La0:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto La9
            r8 = r6
            goto L234
        La9:
            boolean r0 = a.C0435w1.H()
            if (r0 != 0) goto Lbb
            java.lang.String r0 = "DexKit fields locate SKIP: DkBridge not ready"
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}
            a.C0453x1.e(r0)
            r8 = r4
            goto L234
        Lbb:
            java.lang.String r0 = r13.getName()     // Catch: java.lang.Exception -> Lc4
            java.util.List r4 = a.C0435w1.t(r0, r15, r15, r15)     // Catch: java.lang.Exception -> Lc4
            goto Lce
        Lc4:
            r0 = move-exception
            java.lang.String r6 = "DexKit fields locate search failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r6, r0}
            a.C0453x1.e(r0)
        Lce:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r4.iterator()
        Ld7:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L109
            java.lang.Object r7 = r6.next()
            a.r6 r7 = (a.C0350r6) r7
            int r8 = r7.c
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto Lf7
            a.Y4 r7 = r7.b()
            java.lang.String r7 = r7.b
            java.lang.reflect.Field r7 = a(r13, r7)
            if (r7 != 0) goto Lf9
        Lf7:
            r8 = 1
            goto Ld7
        Lf9:
            java.lang.Class<android.view.View> r8 = android.view.View.class
            java.lang.Class r14 = r7.getType()
            boolean r8 = r8.isAssignableFrom(r14)
            if (r8 == 0) goto Lf7
            r0.add(r7)
            goto Lf7
        L109:
            boolean r6 = r0.isEmpty()
            r7 = 10
            if (r6 != 0) goto L1c9
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = a.C0312p3.g0(r0, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r0.iterator()
        L11e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L132
            java.lang.Object r8 = r7.next()
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            java.lang.String r8 = r8.getName()
            r6.add(r8)
            goto L11e
        L132:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L18c
            r7.<init>()     // Catch: java.lang.Exception -> L18c
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch: java.lang.Exception -> L18c
            r8.<init>()     // Catch: java.lang.Exception -> L18c
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L18c
        L140:
            boolean r14 = r6.hasNext()     // Catch: java.lang.Exception -> L18c
            if (r14 == 0) goto L150
            java.lang.Object r14 = r6.next()     // Catch: java.lang.Exception -> L18c
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Exception -> L18c
            r8.put(r14)     // Catch: java.lang.Exception -> L18c
            goto L140
        L150:
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Exception -> L18c
            org.json.JSONObject r5 = r7.put(r5, r8)     // Catch: java.lang.Exception -> L18c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L18c
            java.lang.String r6 = "toString(...)"
            a.C0193i9.d(r5, r6)     // Catch: java.lang.Exception -> L18c
            android.content.Context r6 = a.C0435w1.p     // Catch: java.lang.Exception -> L18c
            if (r6 == 0) goto L16a
            java.lang.String r7 = "dexkit_scan_cache"
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r7, r10)     // Catch: java.lang.Exception -> L18c
            goto L16b
        L16a:
            r6 = r15
        L16b:
            if (r6 == 0) goto L17c
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Exception -> L18c
            if (r6 == 0) goto L17c
            android.content.SharedPreferences$Editor r6 = r6.putString(r3, r5)     // Catch: java.lang.Exception -> L18c
            if (r6 == 0) goto L17c
            r6.apply()     // Catch: java.lang.Exception -> L18c
        L17c:
            java.lang.Object r6 = a.C0043a5.f384a     // Catch: java.lang.Exception -> L18c
            if (r6 == 0) goto L188
            java.util.LinkedHashMap r6 = a.C0067ba.I(r6)     // Catch: java.lang.Exception -> L18c
            r6.put(r3, r5)     // Catch: java.lang.Exception -> L18c
            goto L189
        L188:
            r6 = r15
        L189:
            a.C0043a5.f384a = r6     // Catch: java.lang.Exception -> L18c
            goto L195
        L18c:
            java.lang.String r3 = "DexKitCache: putCleanMsgRootViewFields failed"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            a.C0453x1.e(r3)
        L195:
            a.l8 r3 = new a.l8
            r5 = 16
            r3.<init>(r5)
            r5 = 31
            java.lang.String r3 = a.C0383t3.p0(r0, r15, r3, r5)
            int r4 = r4.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DexKit fields located: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " (fields="
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r12, r3}
            a.C0453x1.b(r3)
            goto L233
        L1c9:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = a.C0312p3.g0(r4, r7)
            r3.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L1d6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L212
            java.lang.Object r5 = r4.next()
            a.r6 r5 = (a.C0350r6) r5
            a.Y4 r6 = r5.b()
            java.lang.String r6 = r6.f350a
            a.Y4 r7 = r5.b()
            java.lang.String r7 = r7.b
            a.b3 r5 = r5.c()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = "."
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = " type="
            r8.append(r6)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r3.add(r5)
            goto L1d6
        L212:
            java.lang.String r4 = r13.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DexKit fields locate FAILED (no View field in "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = "), fields="
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r12, r3}
            a.C0453x1.e(r3)
        L233:
            r8 = r0
        L234:
            java.lang.String r4 = r13.getName()
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.Class[] r6 = new java.lang.Class[]{r0}
            a.l4 r7 = new a.l4
            r0 = 3
            r7.<init>(r1, r0, r8)
            java.lang.String r3 = "F019"
            java.lang.String r5 = "onCreate"
            a.J8.d(r2, r3, r4, r5, r6, r7)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r0 = a.E8.f71a
            java.lang.String r0 = r13.getName()
            java.lang.String r3 = "onCreate"
            a.E8.b(r11, r3, r0)
            java.lang.Class r3 = java.lang.Long.TYPE
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.lang.reflect.Method[] r0 = r13.getDeclaredMethods()     // Catch: java.lang.Throwable -> L2a1
            java.lang.String r5 = "getDeclaredMethods(...)"
            a.C0193i9.d(r0, r5)     // Catch: java.lang.Throwable -> L2a1
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a1
            r5.<init>()     // Catch: java.lang.Throwable -> L2a1
            int r6 = r0.length     // Catch: java.lang.Throwable -> L2a1
            r7 = r10
        L26d:
            if (r7 >= r6) goto L2a5
            r14 = r0[r7]     // Catch: java.lang.Throwable -> L2a1
            r17 = r10
            java.lang.Class r10 = r14.getReturnType()     // Catch: java.lang.Throwable -> L299
            java.lang.Class r15 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L299
            boolean r10 = a.C0193i9.a(r10, r15)     // Catch: java.lang.Throwable -> L299
            if (r10 == 0) goto L296
            java.lang.Class[] r10 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L299
            int r10 = r10.length     // Catch: java.lang.Throwable -> L299
            r15 = 1
            if (r10 != r15) goto L296
            java.lang.Class[] r10 = r14.getParameterTypes()     // Catch: java.lang.Throwable -> L299
            r10 = r10[r17]     // Catch: java.lang.Throwable -> L299
            boolean r10 = a.C0193i9.a(r10, r3)     // Catch: java.lang.Throwable -> L299
            if (r10 == 0) goto L296
            r5.add(r14)     // Catch: java.lang.Throwable -> L299
        L296:
            r16 = 1
            goto L29b
        L299:
            r0 = move-exception
            goto L2be
        L29b:
            int r7 = r7 + 1
            r10 = r17
            r15 = 0
            goto L26d
        L2a1:
            r0 = move-exception
            r17 = r10
            goto L2be
        L2a5:
            r17 = r10
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L299
        L2ab:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L299
            if (r5 == 0) goto L2bb
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L299
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L299
            r4.add(r5)     // Catch: java.lang.Throwable -> L299
            goto L2ab
        L2bb:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L299
            goto L2c1
        L2be:
            a.C0465xd.a(r0)
        L2c1:
            a.Cd r0 = a.Cd.f49a     // Catch: java.lang.Throwable -> L2eb
            a.qb r18 = new a.qb     // Catch: java.lang.Throwable -> L2eb
            java.lang.String r19 = "F019_update_msg_root"
            java.lang.String r20 = "void"
            java.lang.String r5 = "J"
            java.util.List r21 = a.C0435w1.K(r5)     // Catch: java.lang.Throwable -> L2eb
            java.lang.String r22 = ""
            java.lang.String r23 = "F019_clean_new_ui"
            r24 = 0
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L2eb
            r5 = r18
            a.gd r0 = r0.b(r5, r9)     // Catch: java.lang.Throwable -> L2eb
            java.lang.reflect.Method r0 = r0.f     // Catch: java.lang.Throwable -> L2eb
            if (r0 == 0) goto L2ed
            boolean r0 = r4.add(r0)     // Catch: java.lang.Throwable -> L2eb
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L2eb
            goto L2f3
        L2eb:
            r0 = move-exception
            goto L2ef
        L2ed:
            r0 = 0
            goto L2f3
        L2ef:
            a.wd$a r0 = a.C0465xd.a(r0)
        L2f3:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L302
            java.lang.String r5 = "rule-based updateMsgRoot locate failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r5, r0}
            a.C0453x1.e(r0)
        L302:
            java.lang.String r25 = "V6"
            java.lang.String r26 = "updateCacheRoot"
            java.lang.String r18 = "updateMsgRoot"
            java.lang.String r19 = "W6"
            java.lang.String r20 = "x7"
            java.lang.String r21 = "U6"
            java.lang.String r22 = "Z6"
            java.lang.String r23 = "Y6"
            java.lang.String r24 = "X6"
            java.lang.String[] r0 = new java.lang.String[]{r18, r19, r20, r21, r22, r23, r24, r25, r26}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r5 = r0.iterator()
        L320:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L354
            java.lang.Object r0 = r5.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r7 = r13
        L32e:
            if (r7 == 0) goto L34d
            java.lang.Class[] r0 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L339
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r6, r0)     // Catch: java.lang.Throwable -> L339
            goto L33e
        L339:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L33e:
            boolean r9 = r0 instanceof a.C0447wd.a
            if (r9 == 0) goto L343
            r0 = 0
        L343:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L348
            goto L34e
        L348:
            java.lang.Class r7 = r7.getSuperclass()
            goto L32e
        L34d:
            r0 = 0
        L34e:
            if (r0 == 0) goto L320
            r4.add(r0)
            goto L320
        L354:
            java.util.List r3 = a.C0383t3.w0(r4)
            java.util.Iterator r4 = r3.iterator()
            r10 = r17
        L35e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c0
            java.lang.Object r0 = r4.next()
            r5 = r0
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            a.t r0 = new a.t     // Catch: java.lang.Throwable -> L39f
            r6 = 5
            r0.<init>(r1, r8, r6)     // Catch: java.lang.Throwable -> L39f
            a.J8.h(r2, r11, r5, r0)     // Catch: java.lang.Throwable -> L39f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r0 = a.E8.f71a     // Catch: java.lang.Throwable -> L39f
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L39f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39f
            r6.<init>()     // Catch: java.lang.Throwable -> L39f
            java.lang.String r7 = "refresh_"
            r6.append(r7)     // Catch: java.lang.Throwable -> L39f
            r6.append(r0)     // Catch: java.lang.Throwable -> L39f
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L39f
            java.lang.String r6 = r13.getName()     // Catch: java.lang.Throwable -> L39f
            a.E8.b(r11, r0, r6)     // Catch: java.lang.Throwable -> L39f
            r16 = 1
            int r6 = r10 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L39c
            r10 = r6
            goto L3a6
        L39c:
            r0 = move-exception
            r10 = r6
            goto L3a2
        L39f:
            r0 = move-exception
            r16 = 1
        L3a2:
            a.wd$a r0 = a.C0465xd.a(r0)
        L3a6:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L35e
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "hook refresh method "
            java.lang.String r7 = " failed"
            java.lang.String r5 = a.C0487z.g(r6, r5, r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r5, r0}
            a.C0453x1.e(r0)
            goto L35e
        L3c0:
            a.l8 r0 = new a.l8
            r2 = 15
            r0.<init>(r2)
            r2 = 0
            r5 = 31
            java.lang.String r0 = a.C0383t3.p0(r3, r2, r0, r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "hooked refresh methods="
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r12, r0}
            a.C0453x1.b(r0)
            return
        L3ec:
            java.lang.String r2 = "Resolver: CleanNewUI not resolved"
            java.lang.Object[] r2 = new java.lang.Object[]{r12, r2}
            a.C0453x1.e(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r2 = a.E8.f71a
            a.j6 r0 = r0.c
            if (r0 == 0) goto L3ff
            java.lang.String r0 = r0.c
            if (r0 != 0) goto L401
        L3ff:
            java.lang.String r0 = "unknown"
        L401:
            java.lang.String r2 = "cleanNewUI"
            java.lang.String r3 = "CleanNewUI"
            a.E8.a(r11, r2, r3, r0)
            return
    }
}
