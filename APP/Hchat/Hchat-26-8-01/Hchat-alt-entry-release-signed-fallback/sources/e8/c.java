package e8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.luckypray.dexkit.DexKitBridge f2359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.ClassLoader f2360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f2361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f2362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Class f2363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Class f2364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.reflect.Method f2365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.reflect.Method f2366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.reflect.Method f2367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.reflect.Method f2368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Class f2369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Class f2370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.Class f2371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.Class f2372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.Class f2373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.lang.Class f2374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.lang.Class f2375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.lang.Class f2376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.lang.Class f2377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public java.lang.Class f2378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.lang.reflect.Method f2379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public java.lang.reflect.Method f2380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public java.lang.Class f2381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public java.lang.reflect.Method f2382x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public java.lang.reflect.Method f2383y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public java.lang.Class f2384z;

    public c(org.luckypray.dexkit.DexKitBridge r1, java.lang.ClassLoader r2, android.content.Context r3) {
            r0 = this;
            r0.<init>()
            r0.f2359a = r1
            r0.f2360b = r2
            java.lang.String r1 = "Hchat_settings_dex_cache"
            android.content.SharedPreferences r1 = ub.b.c(r3, r1)
            r0.f2361c = r1
            l8.i r1 = o8.k.a(r3, r2)
            java.lang.String r1 = r1.f7933h
            r0.f2362d = r1
            return
    }

    public static int a(java.lang.Class r4, java.lang.Class r5) {
            r0 = 0
        L1:
            if (r4 == 0) goto L2f
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r4 == r1) goto L2f
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            int r3 = r2.getParameterCount()
            if (r3 != 0) goto Lf
            java.lang.Class r2 = r2.getReturnType()
            if (r2 != r5) goto Lf
            int r0 = r0 + 1
            goto Lf
        L2a:
            java.lang.Class r4 = r4.getSuperclass()
            goto L1
        L2f:
            return r0
    }

    public static java.lang.reflect.Method b(java.lang.Class r4) {
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r4.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class[] r1 = r0.getParameterTypes()
            java.lang.String r2 = "onItemClick"
            java.lang.String r3 = r0.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8
            java.lang.Class r2 = r0.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            if (r2 != r3) goto L8
            int r2 = r1.length
            r3 = 4
            if (r2 != r3) goto L8
            r2 = 0
            r2 = r1[r2]
            java.lang.Class<android.widget.AdapterView> r3 = android.widget.AdapterView.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L8
            r2 = 1
            r2 = r1[r2]
            java.lang.Class<android.view.View> r3 = android.view.View.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L8
            r2 = 2
            r2 = r1[r2]
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r2 != r3) goto L8
            r2 = 3
            r1 = r1[r2]
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r1 != r2) goto L8
            return r0
        L55:
            r4 = 0
            return r4
    }

    public static boolean d(java.lang.Class r2, java.lang.Class r3) {
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r2.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r0)
            if (r1 != 0) goto L8
            java.lang.Class r0 = r0.getType()
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    public static void i(android.content.SharedPreferences.Editor r0, java.lang.String r1, java.lang.Class r2) {
            if (r2 == 0) goto L7
            java.lang.String r2 = r2.getName()
            goto L9
        L7:
            java.lang.String r2 = ""
        L9:
            r0.putString(r1, r2)
            return
    }

    public static void j(android.content.SharedPreferences.Editor r4, java.lang.String r5, java.lang.reflect.Method r6) {
            if (r6 == 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "("
            r1.<init>(r2)
            java.lang.Class[] r6 = r6.getParameterTypes()
            r2 = 0
        L2a:
            int r3 = r6.length
            if (r2 >= r3) goto L40
            if (r2 <= 0) goto L34
            r3 = 44
            r1.append(r3)
        L34:
            r3 = r6[r2]
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            int r2 = r2 + 1
            goto L2a
        L40:
            r6 = 41
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            goto L53
        L51:
            java.lang.String r6 = ""
        L53:
            r4.putString(r5, r6)
            return
    }

    public final java.lang.Class c(java.lang.String r2) {
            r1 = this;
            java.lang.ClassLoader r0 = r1.f2360b     // Catch: java.lang.Throwable -> L7
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r0)     // Catch: java.lang.Throwable -> L7
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final boolean e() {
            r1 = this;
            java.lang.Class r0 = r1.f2363e
            if (r0 != 0) goto L4f
            java.lang.reflect.Method r0 = r1.f2365g
            if (r0 != 0) goto L4f
            java.lang.reflect.Method r0 = r1.f2366h
            if (r0 != 0) goto L4f
            java.lang.reflect.Method r0 = r1.f2367i
            if (r0 != 0) goto L4f
            java.lang.reflect.Method r0 = r1.f2368j
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2369k
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2370l
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2371m
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2372n
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2373o
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2374p
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2375q
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2376r
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2377s
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2378t
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2381w
            if (r0 != 0) goto L4f
            java.lang.reflect.Method r0 = r1.f2382x
            if (r0 != 0) goto L4f
            java.lang.reflect.Method r0 = r1.f2383y
            if (r0 != 0) goto L4f
            java.lang.Class r0 = r1.f2384z
            if (r0 == 0) goto L4d
            goto L4f
        L4d:
            r0 = 0
            return r0
        L4f:
            r0 = 1
            return r0
    }

    public final java.lang.Class f(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f2361c     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = ""
            if (r0 == 0) goto La
            java.lang.String r1 = r0.getString(r3, r1)     // Catch: java.lang.Throwable -> L1a
        La:
            if (r1 == 0) goto L1a
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L13
            goto L1a
        L13:
            java.lang.ClassLoader r3 = r2.f2360b     // Catch: java.lang.Throwable -> L1a
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r1, r3)     // Catch: java.lang.Throwable -> L1a
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final java.lang.reflect.Method g(java.lang.String r7) {
            r6 = this;
            android.content.SharedPreferences r0 = r6.f2361c     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = ""
            if (r0 == 0) goto La
            java.lang.String r1 = r0.getString(r7, r1)     // Catch: java.lang.Throwable -> L4c
        La:
            if (r1 == 0) goto L4c
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L4c
            if (r7 != 0) goto L13
            goto L4c
        L13:
            r7 = 35
            int r7 = r1.indexOf(r7)     // Catch: java.lang.Throwable -> L4c
            int r0 = r7 + 1
            r2 = 40
            int r2 = r1.indexOf(r2, r0)     // Catch: java.lang.Throwable -> L4c
            int r3 = r2 + 1
            r4 = 41
            int r4 = r1.indexOf(r4, r3)     // Catch: java.lang.Throwable -> L4c
            if (r7 <= 0) goto L4c
            if (r2 <= r7) goto L4c
            if (r4 >= r2) goto L30
            goto L4c
        L30:
            r5 = 0
            java.lang.String r7 = r1.substring(r5, r7)     // Catch: java.lang.Throwable -> L4c
            java.lang.ClassLoader r5 = r6.f2360b     // Catch: java.lang.Throwable -> L4c
            java.lang.Class r7 = h.Hchat.utils.KavaReflector.loadClass(r7, r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r1.substring(r0, r2)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r1.substring(r3, r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.Class[] r1 = r6.h(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.reflect.Method r7 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r7, r0, r1)     // Catch: java.lang.Throwable -> L4c
            return r7
        L4c:
            r7 = 0
            return r7
    }

    public final java.lang.Class[] h(java.lang.String r5) {
            r4 = this;
            int r0 = r5.length()
            r1 = 0
            if (r0 != 0) goto La
            java.lang.Class[] r5 = new java.lang.Class[r1]
            return r5
        La:
            java.lang.String r0 = ","
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
        L13:
            int r2 = r5.length
            if (r1 >= r2) goto L8a
            r2 = r5[r1]
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = "boolean"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L27
            java.lang.Class r2 = java.lang.Boolean.TYPE
            goto L85
        L27:
            java.lang.String r3 = "byte"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L32
            java.lang.Class r2 = java.lang.Byte.TYPE
            goto L85
        L32:
            java.lang.String r3 = "char"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L3d
            java.lang.Class r2 = java.lang.Character.TYPE
            goto L85
        L3d:
            java.lang.String r3 = "short"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L48
            java.lang.Class r2 = java.lang.Short.TYPE
            goto L85
        L48:
            java.lang.String r3 = "int"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L53
            java.lang.Class r2 = java.lang.Integer.TYPE
            goto L85
        L53:
            java.lang.String r3 = "long"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L5e
            java.lang.Class r2 = java.lang.Long.TYPE
            goto L85
        L5e:
            java.lang.String r3 = "float"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L69
            java.lang.Class r2 = java.lang.Float.TYPE
            goto L85
        L69:
            java.lang.String r3 = "double"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L74
            java.lang.Class r2 = java.lang.Double.TYPE
            goto L85
        L74:
            java.lang.String r3 = "void"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L7f
            java.lang.Class r2 = java.lang.Void.TYPE
            goto L85
        L7f:
            java.lang.ClassLoader r3 = r4.f2360b
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)
        L85:
            r0[r1] = r2
            int r1 = r1 + 1
            goto L13
        L8a:
            return r0
    }

    public final void k(boolean r6) {
            r5 = this;
            java.lang.String r0 = "cache.key"
            java.lang.String r1 = r5.f2362d
            r2 = 0
            android.content.SharedPreferences r3 = r5.f2361c
            if (r3 == 0) goto L1a
            if (r1 == 0) goto L1a
            int r4 = r1.length()
            if (r4 != 0) goto L12
            goto L1a
        L12:
            java.lang.String r4 = "cache.complete"
            boolean r4 = r3.getBoolean(r4, r2)     // Catch: java.lang.Throwable -> Lee
            if (r4 != 0) goto L1d
        L1a:
            r0 = r2
            goto Lf4
        L1d:
            java.lang.String r4 = ""
            java.lang.String r4 = r3.getString(r0, r4)     // Catch: java.lang.Throwable -> Lee
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> Lee
            if (r4 != 0) goto L39
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences$Editor r3 = r3.clear()     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences$Editor r0 = r3.putString(r0, r1)     // Catch: java.lang.Throwable -> L1a
            r0.commit()     // Catch: java.lang.Throwable -> L1a
            goto L1a
        L39:
            java.lang.String r0 = "preferenceClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2363e = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "iconPreferenceClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2364f = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "methodSetKey"
            java.lang.reflect.Method r0 = r5.g(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2365g = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "methodSetTitle"
            java.lang.reflect.Method r0 = r5.g(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2366h = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "methodGetKey"
            java.lang.reflect.Method r0 = r5.g(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2367i = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "methodAddPref"
            java.lang.reflect.Method r0 = r5.g(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2368j = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "settingItemClassesProviderClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2369k = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "baseSettingItemClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2370l = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "settingLocationClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2371m = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "settingGroupMainClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2372n = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "settingGroupAccountInfoClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2373o = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "settingGroupPersonalInfoClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2374p = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "settingAdditionHeaderSearchClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2375q = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "baseSettingPrefUIClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2376r = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "baseSettingUIClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2377s = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "mainSettingsUIClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2378t = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "methodAccountInfoReturns1"
            java.lang.reflect.Method r0 = r5.g(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2379u = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "methodAccountInfoSettingKey"
            java.lang.reflect.Method r0 = r5.g(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2380v = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "plusSubMenuHelperClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2381w = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "plusSubMenuAdapterMethod"
            java.lang.reflect.Method r0 = r5.g(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2382x = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "plusSubMenuOnItemClickMethod"
            java.lang.reflect.Method r0 = r5.g(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2383y = r0     // Catch: java.lang.Throwable -> Lee
            java.lang.String r0 = "settingsUIClass"
            java.lang.Class r0 = r5.f(r0)     // Catch: java.lang.Throwable -> Lee
            r5.f2384z = r0     // Catch: java.lang.Throwable -> Lee
            boolean r0 = r5.e()     // Catch: java.lang.Throwable -> Lee
            goto Lf4
        Lee:
            r0 = move-exception
            r0.getMessage()
            goto L1a
        Lf4:
            if (r0 == 0) goto L112
            r5.m(r6)
            r5.n()
            if (r1 != 0) goto Lff
            goto L111
        Lff:
            int r6 = r1.length()
            r0 = 80
            if (r6 > r0) goto L108
            goto L111
        L108:
            java.lang.String r6 = r1.substring(r2, r0)
            java.lang.String r0 = "..."
            r6.concat(r0)
        L111:
            return
        L112:
            r5.m(r6)
            r5.n()
            return
    }

    public final java.lang.Class l() {
            r6 = this;
            java.lang.Class r0 = r6.f2373o
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Class r0 = r0.getSuperclass()
        La:
            if (r0 == 0) goto L5c
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r0 == r2) goto L5c
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredConstructors(r0)     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L57
        L18:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L57
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3     // Catch: java.lang.Throwable -> L57
            java.lang.Class[] r3 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L57
            int r4 = r3.length     // Catch: java.lang.Throwable -> L57
            r5 = 1
            if (r4 != r5) goto L18
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "AppCompatActivity"
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L18
            if (r1 != 0) goto L3e
            r1 = r0
        L3e:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            int r2 = a(r0, r2)
            if (r2 <= 0) goto L57
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            int r2 = a(r0, r2)
            if (r2 <= 0) goto L57
            java.lang.Class r2 = java.lang.Integer.TYPE
            int r2 = a(r0, r2)
            if (r2 <= 0) goto L57
            return r0
        L57:
            java.lang.Class r0 = r0.getSuperclass()
            goto La
        L5c:
            return r1
    }

    public final void m(boolean r18) {
            r17 = this;
            r1 = r17
            java.lang.Class r0 = r1.f2363e
            java.lang.String r2 = "com.tencent.mm.ui.base.preference.Preference"
            java.lang.ClassLoader r3 = r1.f2360b
            if (r0 == 0) goto Lb
            goto L16
        Lb:
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L12
            r1.f2363e = r0     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            r0.getMessage()
        L16:
            java.lang.Class r0 = r1.f2364f
            if (r0 == 0) goto L1b
            goto L28
        L1b:
            java.lang.String r0 = "com.tencent.mm.ui.base.preference.IconPreference"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r3)     // Catch: java.lang.Throwable -> L24
            r1.f2364f = r0     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r0 = move-exception
            r0.getMessage()
        L28:
            java.lang.reflect.Method r0 = r1.f2365g
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "void"
            r6 = 5
            org.luckypray.dexkit.DexKitBridge r7 = r1.f2359a
            if (r0 == 0) goto L34
            goto La1
        L34:
            java.lang.Class r0 = r1.f2363e
            if (r0 != 0) goto L39
            goto La1
        L39:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L96
            r0.<init>()     // Catch: java.lang.Throwable -> L96
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> L96
            r8.<init>()     // Catch: java.lang.Throwable -> L96
            r8.l0(r6, r2)     // Catch: java.lang.Throwable -> L96
            fh.k.q0(r8, r5)     // Catch: java.lang.Throwable -> L96
            java.lang.String[] r9 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L96
            r8.o0(r9)     // Catch: java.lang.Throwable -> L96
            java.lang.String r9 = "Preference"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L96
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch: java.lang.Throwable -> L96
            r8.t0(r9)     // Catch: java.lang.Throwable -> L96
            r0.f1666h = r8     // Catch: java.lang.Throwable -> L96
            hh.p r0 = r7.findMethod(r0)     // Catch: java.lang.Throwable -> L96
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L96
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L96
            if (r8 == 0) goto La1
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L96
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L96
            lh.d r8 = r0.p()     // Catch: java.lang.Throwable -> L96
            java.lang.String r8 = r8.f8063g     // Catch: java.lang.Throwable -> L96
            java.lang.Class r8 = h.Hchat.utils.KavaReflector.loadClass(r8, r3)     // Catch: java.lang.Throwable -> L96
            lh.d r9 = r0.p()     // Catch: java.lang.Throwable -> L96
            java.lang.String r9 = r9.f8064h     // Catch: java.lang.Throwable -> L96
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Class[] r10 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> L96
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findMethod(r8, r9, r10)     // Catch: java.lang.Throwable -> L96
            r1.f2365g = r8     // Catch: java.lang.Throwable -> L96
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r0.f8064h     // Catch: java.lang.Throwable -> L96
            goto La1
        L96:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "[Hchat:SettingsDex] setKey 失败: "
            r8.<init>(r9)
            bc.e.s(r0, r8, r0)
        La1:
            java.lang.reflect.Method r0 = r1.f2366h
            r8 = 1
            if (r0 == 0) goto La8
            goto L153
        La8:
            java.lang.Class r0 = r1.f2363e
            if (r0 != 0) goto Lae
            goto L153
        Lae:
            ch.c r0 = new ch.c     // Catch: java.lang.Throwable -> L112
            r0.<init>()     // Catch: java.lang.Throwable -> L112
            fh.a r9 = new fh.a     // Catch: java.lang.Throwable -> L112
            r9.<init>()     // Catch: java.lang.Throwable -> L112
            r9.m0(r6, r2)     // Catch: java.lang.Throwable -> L112
            r0.f1664h = r9     // Catch: java.lang.Throwable -> L112
            hh.j r0 = r7.findClass(r0)     // Catch: java.lang.Throwable -> L112
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L112
        Lc5:
            boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> L112
            if (r9 == 0) goto L153
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L112
            hh.i r9 = (hh.i) r9     // Catch: java.lang.Throwable -> L112
            ch.e r9 = new ch.e     // Catch: java.lang.Throwable -> L112
            r9.<init>()     // Catch: java.lang.Throwable -> L112
            fh.k r10 = new fh.k     // Catch: java.lang.Throwable -> L112
            r10.<init>()     // Catch: java.lang.Throwable -> L112
            fh.k.q0(r10, r5)     // Catch: java.lang.Throwable -> L112
            java.lang.String r11 = "java.lang.CharSequence"
            java.lang.String[] r11 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L112
            r10.o0(r11)     // Catch: java.lang.Throwable -> L112
            r9.f1666h = r10     // Catch: java.lang.Throwable -> L112
            hh.p r9 = r7.findMethod(r9)     // Catch: java.lang.Throwable -> L112
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L112
            r10.<init>()     // Catch: java.lang.Throwable -> L112
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L112
        Lf6:
            boolean r11 = r9.hasNext()     // Catch: java.lang.Throwable -> L112
            if (r11 == 0) goto L114
            java.lang.Object r11 = r9.next()     // Catch: java.lang.Throwable -> L112
            hh.o r11 = (hh.o) r11     // Catch: java.lang.Throwable -> L112
            lh.d r12 = r11.p()     // Catch: java.lang.Throwable -> L112
            java.lang.String r12 = r12.f8063g     // Catch: java.lang.Throwable -> L112
            boolean r12 = r2.equals(r12)     // Catch: java.lang.Throwable -> L112
            if (r12 == 0) goto Lf6
            r10.add(r11)     // Catch: java.lang.Throwable -> L112
            goto Lf6
        L112:
            r0 = move-exception
            goto L149
        L114:
            boolean r9 = r10.isEmpty()     // Catch: java.lang.Throwable -> L112
            if (r9 != 0) goto Lc5
            int r9 = r10.size()     // Catch: java.lang.Throwable -> L112
            int r9 = r9 - r8
            java.lang.Object r9 = r10.get(r9)     // Catch: java.lang.Throwable -> L112
            hh.o r9 = (hh.o) r9     // Catch: java.lang.Throwable -> L112
            lh.d r10 = r9.p()     // Catch: java.lang.Throwable -> L112
            java.lang.String r10 = r10.f8063g     // Catch: java.lang.Throwable -> L112
            java.lang.Class r10 = h.Hchat.utils.KavaReflector.loadClass(r10, r3)     // Catch: java.lang.Throwable -> L112
            lh.d r11 = r9.p()     // Catch: java.lang.Throwable -> L112
            java.lang.String r11 = r11.f8064h     // Catch: java.lang.Throwable -> L112
            java.lang.Class<java.lang.CharSequence> r12 = java.lang.CharSequence.class
            java.lang.Class[] r12 = new java.lang.Class[]{r12}     // Catch: java.lang.Throwable -> L112
            java.lang.reflect.Method r10 = h.Hchat.utils.KavaReflector.findMethod(r10, r11, r12)     // Catch: java.lang.Throwable -> L112
            r1.f2366h = r10     // Catch: java.lang.Throwable -> L112
            lh.d r9 = r9.p()     // Catch: java.lang.Throwable -> L112
            java.lang.String r9 = r9.f8064h     // Catch: java.lang.Throwable -> L112
            goto Lc5
        L149:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[Hchat:SettingsDex] setTitle 失败: "
            r9.<init>(r10)
            bc.e.s(r0, r9, r0)
        L153:
            java.lang.reflect.Method r0 = r1.f2367i
            r9 = 0
            if (r0 == 0) goto L159
            goto L1bf
        L159:
            java.lang.Class r0 = r1.f2363e
            if (r0 != 0) goto L15e
            goto L1bf
        L15e:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L1b4
            r0.<init>()     // Catch: java.lang.Throwable -> L1b4
            fh.k r10 = new fh.k     // Catch: java.lang.Throwable -> L1b4
            r10.<init>()     // Catch: java.lang.Throwable -> L1b4
            r10.l0(r6, r2)     // Catch: java.lang.Throwable -> L1b4
            r10.m0(r9)     // Catch: java.lang.Throwable -> L1b4
            fh.k.q0(r10, r4)     // Catch: java.lang.Throwable -> L1b4
            r0.f1666h = r10     // Catch: java.lang.Throwable -> L1b4
            hh.p r0 = r7.findMethod(r0)     // Catch: java.lang.Throwable -> L1b4
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1b4
        L17b:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b4
            if (r2 == 0) goto L1bf
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L1b4
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r10 = "toString"
            lh.d r11 = r2.p()     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r11 = r11.f8064h     // Catch: java.lang.Throwable -> L1b4
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L1b4
            if (r10 != 0) goto L17b
            lh.d r0 = r2.p()     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r0 = r0.f8063g     // Catch: java.lang.Throwable -> L1b4
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r3)     // Catch: java.lang.Throwable -> L1b4
            lh.d r10 = r2.p()     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r10 = r10.f8064h     // Catch: java.lang.Throwable -> L1b4
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch: java.lang.Throwable -> L1b4
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r10, r11)     // Catch: java.lang.Throwable -> L1b4
            r1.f2367i = r0     // Catch: java.lang.Throwable -> L1b4
            lh.d r0 = r2.p()     // Catch: java.lang.Throwable -> L1b4
            java.lang.String r0 = r0.f8064h     // Catch: java.lang.Throwable -> L1b4
            goto L1bf
        L1b4:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r10 = "[Hchat:SettingsDex] getKey 失败: "
            r2.<init>(r10)
            bc.e.s(r0, r2, r0)
        L1bf:
            java.lang.String r0 = "com.tencent.mm.ui.base.preference"
            java.lang.reflect.Method r2 = r1.f2368j
            if (r2 == 0) goto L1c9
        L1c5:
            r16 = r9
            goto L321
        L1c9:
            java.lang.Class r2 = r1.f2363e
            if (r2 != 0) goto L1ce
            goto L1c5
        L1ce:
            ch.c r2 = new ch.c     // Catch: java.lang.Throwable -> L26d
            r2.<init>()     // Catch: java.lang.Throwable -> L26d
            fh.a r11 = new fh.a     // Catch: java.lang.Throwable -> L26d
            r11.<init>()     // Catch: java.lang.Throwable -> L26d
            java.lang.String r12 = "android.widget.BaseAdapter"
            r11.o0(r12)     // Catch: java.lang.Throwable -> L26d
            java.lang.String[] r12 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L26d
            java.util.List r12 = tf.l.L0(r12)     // Catch: java.lang.Throwable -> L26d
            r2.f1663g = r12     // Catch: java.lang.Throwable -> L26d
            r2.f1664h = r11     // Catch: java.lang.Throwable -> L26d
            hh.j r2 = r7.findClass(r2)     // Catch: java.lang.Throwable -> L26d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L26d
        L1f1:
            boolean r11 = r2.hasNext()     // Catch: java.lang.Throwable -> L26d
            if (r11 == 0) goto L272
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L26d
            hh.i r11 = (hh.i) r11     // Catch: java.lang.Throwable -> L26d
            lh.a r12 = r11.p()     // Catch: java.lang.Throwable -> L267
            java.lang.String r12 = r12.f8057g     // Catch: java.lang.Throwable -> L267
            java.lang.Class r12 = h.Hchat.utils.KavaReflector.loadClass(r12, r3)     // Catch: java.lang.Throwable -> L267
            java.util.List r13 = h.Hchat.utils.KavaReflector.declaredMethods(r12)     // Catch: java.lang.Throwable -> L267
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L267
            r14 = r9
        L210:
            boolean r15 = r13.hasNext()     // Catch: java.lang.Throwable -> L267
            r10 = 3
            if (r15 == 0) goto L23c
            java.lang.Object r15 = r13.next()     // Catch: java.lang.Throwable -> L267
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15     // Catch: java.lang.Throwable -> L267
            r16 = r9
            java.lang.String r9 = "getView"
            java.lang.String r8 = r15.getName()     // Catch: java.lang.Throwable -> L269
            boolean r8 = r9.equals(r8)     // Catch: java.lang.Throwable -> L269
            if (r8 == 0) goto L238
            boolean r8 = h.Hchat.utils.KavaReflector.isPublic(r15)     // Catch: java.lang.Throwable -> L269
            if (r8 == 0) goto L238
            int r8 = r15.getParameterCount()     // Catch: java.lang.Throwable -> L269
            if (r8 != r10) goto L238
            r14 = 1
        L238:
            r9 = r16
            r8 = 1
            goto L210
        L23c:
            r16 = r9
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredConstructors(r12)     // Catch: java.lang.Throwable -> L269
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L269
            r9 = r16
        L248:
            boolean r12 = r8.hasNext()     // Catch: java.lang.Throwable -> L269
            if (r12 == 0) goto L25c
            java.lang.Object r12 = r8.next()     // Catch: java.lang.Throwable -> L269
            java.lang.reflect.Constructor r12 = (java.lang.reflect.Constructor) r12     // Catch: java.lang.Throwable -> L269
            int r12 = r12.getParameterCount()     // Catch: java.lang.Throwable -> L269
            if (r12 != r10) goto L248
            r9 = 1
            goto L248
        L25c:
            if (r14 == 0) goto L269
            if (r9 == 0) goto L269
            lh.a r8 = r11.p()     // Catch: java.lang.Throwable -> L269
            java.lang.String r2 = r8.f8057g     // Catch: java.lang.Throwable -> L269
            goto L275
        L267:
            r16 = r9
        L269:
            r9 = r16
            r8 = 1
            goto L1f1
        L26d:
            r0 = move-exception
            r16 = r9
            goto L317
        L272:
            r16 = r9
            r2 = 0
        L275:
            if (r2 != 0) goto L279
            goto L321
        L279:
            ch.e r8 = new ch.e     // Catch: java.lang.Throwable -> L316
            r8.<init>()     // Catch: java.lang.Throwable -> L316
            fh.k r9 = new fh.k     // Catch: java.lang.Throwable -> L316
            r9.<init>()     // Catch: java.lang.Throwable -> L316
            r9.l0(r6, r2)     // Catch: java.lang.Throwable -> L316
            r2 = 2
            r9.m0(r2)     // Catch: java.lang.Throwable -> L316
            fh.k.q0(r9, r5)     // Catch: java.lang.Throwable -> L316
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L316
            java.util.List r0 = tf.l.L0(r0)     // Catch: java.lang.Throwable -> L316
            r8.f1665g = r0     // Catch: java.lang.Throwable -> L316
            r8.f1666h = r9     // Catch: java.lang.Throwable -> L316
            hh.p r0 = r7.findMethod(r8)     // Catch: java.lang.Throwable -> L316
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L316
        L2a1:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L316
            if (r5 == 0) goto L321
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L316
            hh.o r5 = (hh.o) r5     // Catch: java.lang.Throwable -> L316
            lh.d r8 = r5.p()     // Catch: java.lang.Throwable -> L2a1
            java.lang.String r8 = r8.f8063g     // Catch: java.lang.Throwable -> L2a1
            java.lang.Class r8 = h.Hchat.utils.KavaReflector.loadClass(r8, r3)     // Catch: java.lang.Throwable -> L2a1
            lh.d r9 = r5.p()     // Catch: java.lang.Throwable -> L2a1
            java.lang.String r9 = r9.f8064h     // Catch: java.lang.Throwable -> L2a1
            java.lang.Class r10 = r1.f2363e     // Catch: java.lang.Throwable -> L2a1
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L2a1
            java.lang.Class[] r10 = new java.lang.Class[]{r10, r11}     // Catch: java.lang.Throwable -> L2a1
            java.lang.reflect.Method r9 = h.Hchat.utils.KavaReflector.findMethod(r8, r9, r10)     // Catch: java.lang.Throwable -> L2a1
            r1.f2368j = r9     // Catch: java.lang.Throwable -> L2a1
            if (r9 != 0) goto L301
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredMethods(r8)     // Catch: java.lang.Throwable -> L2a1
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2a1
        L2d5:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L2a1
            if (r9 == 0) goto L301
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L2a1
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L2a1
            lh.d r10 = r5.p()     // Catch: java.lang.Throwable -> L2a1
            java.lang.String r10 = r10.f8064h     // Catch: java.lang.Throwable -> L2a1
            java.lang.String r11 = r9.getName()     // Catch: java.lang.Throwable -> L2a1
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Throwable -> L2a1
            if (r10 == 0) goto L2d5
            int r10 = r9.getParameterCount()     // Catch: java.lang.Throwable -> L2a1
            if (r10 != r2) goto L2d5
            java.lang.Class r10 = r9.getReturnType()     // Catch: java.lang.Throwable -> L2a1
            java.lang.Class r11 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L2a1
            if (r10 != r11) goto L2d5
            r1.f2368j = r9     // Catch: java.lang.Throwable -> L2a1
        L301:
            java.lang.reflect.Method r8 = r1.f2368j     // Catch: java.lang.Throwable -> L2a1
            if (r8 == 0) goto L311
            lh.d r8 = r5.p()     // Catch: java.lang.Throwable -> L2a1
            java.lang.String r8 = r8.f8063g     // Catch: java.lang.Throwable -> L2a1
            lh.d r5 = r5.p()     // Catch: java.lang.Throwable -> L2a1
            java.lang.String r5 = r5.f8064h     // Catch: java.lang.Throwable -> L2a1
        L311:
            java.lang.reflect.Method r5 = r1.f2368j     // Catch: java.lang.Throwable -> L2a1
            if (r5 == 0) goto L2a1
            goto L321
        L316:
            r0 = move-exception
        L317:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "[Hchat:SettingsDex] addPreference 失败: "
            r2.<init>(r5)
            bc.e.s(r0, r2, r0)
        L321:
            java.lang.Class r0 = r1.f2384z
            if (r0 == 0) goto L32a
            java.lang.Class r0 = r1.f2378t
            if (r0 == 0) goto L32a
            goto L33a
        L32a:
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SettingsUI"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r3)     // Catch: java.lang.Throwable -> L332
            r1.f2384z = r0     // Catch: java.lang.Throwable -> L332
        L332:
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r3)     // Catch: java.lang.Throwable -> L33a
            r1.f2378t = r0     // Catch: java.lang.Throwable -> L33a
        L33a:
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain"
            java.lang.Class r0 = r1.c(r0)
            r1.f2372n = r0
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo"
            java.lang.Class r0 = r1.c(r0)
            r1.f2373o = r0
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo"
            java.lang.Class r0 = r1.c(r0)
            r1.f2374p = r0
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionHeaderSearch"
            java.lang.Class r0 = r1.c(r0)
            r1.f2375q = r0
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI"
            java.lang.Class r0 = r1.c(r0)
            r1.f2376r = r0
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI"
            java.lang.Class r0 = r1.c(r0)
            r1.f2377s = r0
            java.lang.Class r0 = r1.f2369k
            if (r0 == 0) goto L370
            goto L3e3
        L370:
            ch.c r0 = new ch.c     // Catch: java.lang.Throwable -> L3d0
            r0.<init>()     // Catch: java.lang.Throwable -> L3d0
            fh.a r2 = new fh.a     // Catch: java.lang.Throwable -> L3d0
            r2.<init>()     // Catch: java.lang.Throwable -> L3d0
            java.lang.String r5 = "Repairer_Setting"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L3d0
            r2.p0(r5)     // Catch: java.lang.Throwable -> L3d0
            r0.f1664h = r2     // Catch: java.lang.Throwable -> L3d0
            hh.j r0 = r7.findClass(r0)     // Catch: java.lang.Throwable -> L3d0
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3d0
            r2 = 0
        L38e:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L3d0
            if (r5 == 0) goto L3d2
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L3d0
            hh.i r5 = (hh.i) r5     // Catch: java.lang.Throwable -> L3d0
            lh.a r5 = r5.p()     // Catch: java.lang.Throwable -> L3d0
            java.lang.String r5 = r5.f8057g     // Catch: java.lang.Throwable -> L3d0
            java.lang.Class r5 = h.Hchat.utils.KavaReflector.loadClass(r5, r3)     // Catch: java.lang.Throwable -> L3d0
            if (r2 != 0) goto L3a7
            r2 = r5
        L3a7:
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredMethods(r5)     // Catch: java.lang.Throwable -> L3d0
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L3d0
        L3af:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L3d0
            if (r9 == 0) goto L38e
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L3d0
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L3d0
            int r10 = r9.getParameterCount()     // Catch: java.lang.Throwable -> L3d0
            if (r10 != 0) goto L3af
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            java.lang.Class r9 = r9.getReturnType()     // Catch: java.lang.Throwable -> L3d0
            boolean r9 = r10.isAssignableFrom(r9)     // Catch: java.lang.Throwable -> L3d0
            if (r9 == 0) goto L3af
            r1.f2369k = r5     // Catch: java.lang.Throwable -> L3d0
            goto L3d2
        L3d0:
            r0 = move-exception
            goto L3d9
        L3d2:
            java.lang.Class r0 = r1.f2369k     // Catch: java.lang.Throwable -> L3d0
            if (r0 != 0) goto L3e3
            r1.f2369k = r2     // Catch: java.lang.Throwable -> L3d0
            goto L3e3
        L3d9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "[Hchat:SettingsDex] SettingItemClassesProvider 失败: "
            r2.<init>(r5)
            bc.e.s(r0, r2, r0)
        L3e3:
            java.lang.Class r0 = r1.f2370l
            if (r0 == 0) goto L3e9
            goto L48a
        L3e9:
            java.lang.Class r0 = r1.l()     // Catch: java.lang.Throwable -> L477
            r1.f2370l = r0     // Catch: java.lang.Throwable -> L477
            if (r0 == 0) goto L3f3
            goto L48a
        L3f3:
            ch.c r0 = new ch.c     // Catch: java.lang.Throwable -> L477
            r0.<init>()     // Catch: java.lang.Throwable -> L477
            fh.a r2 = new fh.a     // Catch: java.lang.Throwable -> L477
            r2.<init>()     // Catch: java.lang.Throwable -> L477
            java.lang.String r5 = ""
            java.lang.String r8 = "activity"
            java.lang.String r9 = "context"
            java.lang.String r10 = "intent"
            java.lang.String[] r5 = new java.lang.String[]{r5, r8, r9, r10}     // Catch: java.lang.Throwable -> L477
            r2.p0(r5)     // Catch: java.lang.Throwable -> L477
            r0.f1664h = r2     // Catch: java.lang.Throwable -> L477
            hh.j r0 = r7.findClass(r0)     // Catch: java.lang.Throwable -> L477
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L477
            r2 = 0
        L417:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L477
            if (r5 == 0) goto L479
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L477
            hh.i r5 = (hh.i) r5     // Catch: java.lang.Throwable -> L477
            lh.a r5 = r5.p()     // Catch: java.lang.Throwable -> L417
            java.lang.String r5 = r5.f8057g     // Catch: java.lang.Throwable -> L417
            java.lang.Class r5 = h.Hchat.utils.KavaReflector.loadClass(r5, r3)     // Catch: java.lang.Throwable -> L417
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredConstructors(r5)     // Catch: java.lang.Throwable -> L417
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L417
        L435:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L417
            if (r9 == 0) goto L417
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L417
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9     // Catch: java.lang.Throwable -> L417
            java.lang.Class[] r9 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L417
            int r10 = r9.length     // Catch: java.lang.Throwable -> L417
            r11 = 1
            if (r10 != r11) goto L435
            r9 = r9[r16]     // Catch: java.lang.Throwable -> L417
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L417
            java.lang.String r10 = "AppCompatActivity"
            boolean r9 = r9.contains(r10)     // Catch: java.lang.Throwable -> L417
            if (r9 == 0) goto L435
            if (r2 != 0) goto L45a
            r2 = r5
        L45a:
            java.lang.Class[] r8 = r5.getInterfaces()     // Catch: java.lang.Throwable -> L417
            int r9 = r8.length     // Catch: java.lang.Throwable -> L417
            r10 = r16
        L461:
            if (r10 >= r9) goto L417
            r11 = r8[r10]     // Catch: java.lang.Throwable -> L417
            java.lang.String r11 = r11.getName()     // Catch: java.lang.Throwable -> L417
            java.lang.String r12 = "com.tencent.mm.plugin.newtips.model"
            boolean r11 = r11.startsWith(r12)     // Catch: java.lang.Throwable -> L417
            if (r11 == 0) goto L474
            r1.f2370l = r5     // Catch: java.lang.Throwable -> L417
            goto L479
        L474:
            int r10 = r10 + 1
            goto L461
        L477:
            r0 = move-exception
            goto L480
        L479:
            java.lang.Class r0 = r1.f2370l     // Catch: java.lang.Throwable -> L477
            if (r0 != 0) goto L48a
            r1.f2370l = r2     // Catch: java.lang.Throwable -> L477
            goto L48a
        L480:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "[Hchat:SettingsDex] BaseSettingItem 失败: "
            r2.<init>(r5)
            bc.e.s(r0, r2, r0)
        L48a:
            java.lang.Class r0 = r1.f2371m
            if (r0 == 0) goto L48f
            goto L4d8
        L48f:
            ch.c r0 = new ch.c     // Catch: java.lang.Throwable -> L4cd
            r0.<init>()     // Catch: java.lang.Throwable -> L4cd
            fh.a r2 = new fh.a     // Catch: java.lang.Throwable -> L4cd
            r2.<init>()     // Catch: java.lang.Throwable -> L4cd
            java.lang.String r5 = "SettingLocation(parentGroup="
            java.lang.String r8 = ", frontItem="
            java.lang.String[] r5 = new java.lang.String[]{r5, r8}     // Catch: java.lang.Throwable -> L4cd
            r2.p0(r5)     // Catch: java.lang.Throwable -> L4cd
            r0.f1664h = r2     // Catch: java.lang.Throwable -> L4cd
            hh.j r0 = r7.findClass(r0)     // Catch: java.lang.Throwable -> L4cd
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4cd
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L4cd
            if (r2 == 0) goto L4d8
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L4cd
            hh.i r0 = (hh.i) r0     // Catch: java.lang.Throwable -> L4cd
            lh.a r2 = r0.p()     // Catch: java.lang.Throwable -> L4cd
            java.lang.String r2 = r2.f8057g     // Catch: java.lang.Throwable -> L4cd
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L4cd
            r1.f2371m = r2     // Catch: java.lang.Throwable -> L4cd
            lh.a r0 = r0.p()     // Catch: java.lang.Throwable -> L4cd
            java.lang.String r0 = r0.f8057g     // Catch: java.lang.Throwable -> L4cd
            goto L4d8
        L4cd:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "[Hchat:SettingsDex] SettingLocation 失败: "
            r2.<init>(r5)
            bc.e.s(r0, r2, r0)
        L4d8:
            java.lang.reflect.Method r0 = r1.f2379u
            if (r0 == 0) goto L4dd
            goto L546
        L4dd:
            java.lang.Class r0 = r1.f2373o
            if (r0 != 0) goto L4e2
            goto L546
        L4e2:
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L53b
            r2.<init>()     // Catch: java.lang.Throwable -> L53b
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> L53b
            r5.<init>()     // Catch: java.lang.Throwable -> L53b
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L53b
            r5.l0(r6, r0)     // Catch: java.lang.Throwable -> L53b
            r11 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L53b
            java.lang.Number[] r8 = new java.lang.Number[r11]     // Catch: java.lang.Throwable -> L53b
            r8[r16] = r0     // Catch: java.lang.Throwable -> L53b
            r5.s0(r8)     // Catch: java.lang.Throwable -> L53b
            java.lang.String r0 = "int"
            fh.k.q0(r5, r0)     // Catch: java.lang.Throwable -> L53b
            r2.f1666h = r5     // Catch: java.lang.Throwable -> L53b
            hh.p r0 = r7.findMethod(r2)     // Catch: java.lang.Throwable -> L53b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L53b
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L53b
            if (r2 == 0) goto L546
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L53b
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L53b
            lh.d r2 = r0.p()     // Catch: java.lang.Throwable -> L53b
            java.lang.String r2 = r2.f8063g     // Catch: java.lang.Throwable -> L53b
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L53b
            lh.d r5 = r0.p()     // Catch: java.lang.Throwable -> L53b
            java.lang.String r5 = r5.f8064h     // Catch: java.lang.Throwable -> L53b
            r8 = r16
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L53b
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethod(r2, r5, r9)     // Catch: java.lang.Throwable -> L53b
            r1.f2379u = r2     // Catch: java.lang.Throwable -> L53b
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L53b
            java.lang.String r0 = r0.f8064h     // Catch: java.lang.Throwable -> L53b
            goto L546
        L53b:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "[Hchat:SettingsDex] AccountInfo.returns1 失败: "
            r2.<init>(r5)
            bc.e.s(r0, r2, r0)
        L546:
            java.lang.reflect.Method r0 = r1.f2380v
            if (r0 == 0) goto L54b
            goto L5b6
        L54b:
            java.lang.Class r0 = r1.f2373o
            if (r0 != 0) goto L550
            goto L5b6
        L550:
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L5ab
            r2.<init>()     // Catch: java.lang.Throwable -> L5ab
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> L5ab
            r5.<init>()     // Catch: java.lang.Throwable -> L5ab
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L5ab
            r5.l0(r6, r0)     // Catch: java.lang.Throwable -> L5ab
            r8 = 0
            r5.m0(r8)     // Catch: java.lang.Throwable -> L5ab
            fh.k.q0(r5, r4)     // Catch: java.lang.Throwable -> L5ab
            java.lang.String r0 = "SettingGroup_Main_AccountInfo"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L5ab
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L5ab
            r5.t0(r0)     // Catch: java.lang.Throwable -> L5ab
            r2.f1666h = r5     // Catch: java.lang.Throwable -> L5ab
            hh.p r0 = r7.findMethod(r2)     // Catch: java.lang.Throwable -> L5ab
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5ab
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L5ab
            if (r2 == 0) goto L5b6
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L5ab
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L5ab
            lh.d r2 = r0.p()     // Catch: java.lang.Throwable -> L5ab
            java.lang.String r2 = r2.f8063g     // Catch: java.lang.Throwable -> L5ab
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L5ab
            lh.d r4 = r0.p()     // Catch: java.lang.Throwable -> L5ab
            java.lang.String r4 = r4.f8064h     // Catch: java.lang.Throwable -> L5ab
            r8 = 0
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> L5ab
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethod(r2, r4, r5)     // Catch: java.lang.Throwable -> L5ab
            r1.f2380v = r2     // Catch: java.lang.Throwable -> L5ab
            lh.d r0 = r0.p()     // Catch: java.lang.Throwable -> L5ab
            java.lang.String r0 = r0.f8064h     // Catch: java.lang.Throwable -> L5ab
            goto L5b6
        L5ab:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "[Hchat:SettingsDex] AccountInfo.settingKey 失败: "
            r2.<init>(r4)
            bc.e.s(r0, r2, r0)
        L5b6:
            if (r18 == 0) goto L65b
            java.lang.Class r0 = r1.f2381w
            if (r0 == 0) goto L5c6
            java.lang.reflect.Method r0 = r1.f2382x
            if (r0 == 0) goto L5c6
            java.lang.reflect.Method r0 = r1.f2383y
            if (r0 == 0) goto L5c6
            goto L65b
        L5c6:
            ch.c r0 = new ch.c     // Catch: java.lang.Throwable -> L650
            r0.<init>()     // Catch: java.lang.Throwable -> L650
            fh.a r2 = new fh.a     // Catch: java.lang.Throwable -> L650
            r2.<init>()     // Catch: java.lang.Throwable -> L650
            java.lang.String r4 = "MicroMsg.PlusSubMenuHelper"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L650
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> L650
            r4.getClass()     // Catch: java.lang.Throwable -> L650
            fh.a.r0(r2, r4)     // Catch: java.lang.Throwable -> L650
            r0.f1664h = r2     // Catch: java.lang.Throwable -> L650
            hh.j r0 = r7.findClass(r0)     // Catch: java.lang.Throwable -> L650
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L650
        L5ea:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L650
            if (r2 == 0) goto L65b
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L650
            hh.i r2 = (hh.i) r2     // Catch: java.lang.Throwable -> L650
            lh.a r2 = r2.p()     // Catch: java.lang.Throwable -> L5ea
            java.lang.String r2 = r2.f8057g     // Catch: java.lang.Throwable -> L5ea
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)     // Catch: java.lang.Throwable -> L5ea
            java.lang.reflect.Method r4 = b(r2)     // Catch: java.lang.Throwable -> L5ea
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r2)     // Catch: java.lang.Throwable -> L5ea
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5ea
        L60c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L5ea
            if (r6 == 0) goto L62b
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L5ea
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L5ea
            int r7 = r6.getParameterCount()     // Catch: java.lang.Throwable -> L5ea
            if (r7 != 0) goto L60c
            java.lang.Class<android.widget.BaseAdapter> r7 = android.widget.BaseAdapter.class
            java.lang.Class r8 = r6.getReturnType()     // Catch: java.lang.Throwable -> L5ea
            boolean r7 = r7.isAssignableFrom(r8)     // Catch: java.lang.Throwable -> L5ea
            if (r7 == 0) goto L60c
            goto L62c
        L62b:
            r6 = 0
        L62c:
            if (r4 == 0) goto L5ea
            if (r6 != 0) goto L631
            goto L5ea
        L631:
            java.lang.Class<android.util.SparseArray> r5 = android.util.SparseArray.class
            boolean r5 = d(r2, r5)     // Catch: java.lang.Throwable -> L5ea
            if (r5 != 0) goto L63a
            goto L5ea
        L63a:
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            boolean r5 = d(r2, r5)     // Catch: java.lang.Throwable -> L5ea
            if (r5 != 0) goto L643
            goto L5ea
        L643:
            r1.f2381w = r2     // Catch: java.lang.Throwable -> L5ea
            r1.f2383y = r4     // Catch: java.lang.Throwable -> L5ea
            r1.f2382x = r6     // Catch: java.lang.Throwable -> L5ea
            r2.getClass()     // Catch: java.lang.Throwable -> L5ea
            r6.getName()     // Catch: java.lang.Throwable -> L5ea
            goto L65b
        L650:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:SettingsDex] PlusSubMenuHelper 失败: "
            r2.<init>(r3)
            bc.e.s(r0, r2, r0)
        L65b:
            return
    }

    public final void n() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f2361c
            if (r0 == 0) goto Lc5
            java.lang.String r1 = r3.f2362d
            if (r1 == 0) goto Lc5
            int r2 = r1.length()
            if (r2 != 0) goto L10
            goto Lc5
        L10:
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> Lc1
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r2 = "cache.key"
            r0.putString(r2, r1)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "preferenceClass"
            java.lang.Class r2 = r3.f2363e     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "iconPreferenceClass"
            java.lang.Class r2 = r3.f2364f     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "methodSetKey"
            java.lang.reflect.Method r2 = r3.f2365g     // Catch: java.lang.Throwable -> Lc1
            j(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "methodSetTitle"
            java.lang.reflect.Method r2 = r3.f2366h     // Catch: java.lang.Throwable -> Lc1
            j(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "methodGetKey"
            java.lang.reflect.Method r2 = r3.f2367i     // Catch: java.lang.Throwable -> Lc1
            j(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "methodAddPref"
            java.lang.reflect.Method r2 = r3.f2368j     // Catch: java.lang.Throwable -> Lc1
            j(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "settingItemClassesProviderClass"
            java.lang.Class r2 = r3.f2369k     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "baseSettingItemClass"
            java.lang.Class r2 = r3.f2370l     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "settingLocationClass"
            java.lang.Class r2 = r3.f2371m     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "settingGroupMainClass"
            java.lang.Class r2 = r3.f2372n     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "settingGroupAccountInfoClass"
            java.lang.Class r2 = r3.f2373o     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "settingGroupPersonalInfoClass"
            java.lang.Class r2 = r3.f2374p     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "settingAdditionHeaderSearchClass"
            java.lang.Class r2 = r3.f2375q     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "baseSettingPrefUIClass"
            java.lang.Class r2 = r3.f2376r     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "baseSettingUIClass"
            java.lang.Class r2 = r3.f2377s     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "mainSettingsUIClass"
            java.lang.Class r2 = r3.f2378t     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "methodAccountInfoReturns1"
            java.lang.reflect.Method r2 = r3.f2379u     // Catch: java.lang.Throwable -> Lc1
            j(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "methodAccountInfoSettingKey"
            java.lang.reflect.Method r2 = r3.f2380v     // Catch: java.lang.Throwable -> Lc1
            j(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "plusSubMenuHelperClass"
            java.lang.Class r2 = r3.f2381w     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "plusSubMenuAdapterMethod"
            java.lang.reflect.Method r2 = r3.f2382x     // Catch: java.lang.Throwable -> Lc1
            j(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "plusSubMenuOnItemClickMethod"
            java.lang.reflect.Method r2 = r3.f2383y     // Catch: java.lang.Throwable -> Lc1
            j(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "settingsUIClass"
            java.lang.Class r2 = r3.f2384z     // Catch: java.lang.Throwable -> Lc1
            i(r0, r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "cache.complete"
            r2 = 1
            r0.putBoolean(r1, r2)     // Catch: java.lang.Throwable -> Lc1
            r0.apply()     // Catch: java.lang.Throwable -> Lc1
            return
        Lc1:
            r0 = move-exception
            r0.getMessage()
        Lc5:
            return
    }
}
