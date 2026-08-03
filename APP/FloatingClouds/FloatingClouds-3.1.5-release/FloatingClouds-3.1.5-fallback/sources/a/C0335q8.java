package a;

/* JADX INFO: renamed from: a.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0335q8 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile java.lang.String f654a;
    public volatile java.lang.String b;
    public final android.os.Handler c;
    public volatile java.lang.String d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public final java.lang.ThreadLocal<java.lang.Boolean> h;
    public volatile a.J8 i;
    public final java.util.Set<java.lang.Object> j;

    public C0335q8() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "yj5.j"
            r2.f654a = r0
            java.lang.String r0 = "ri5.j"
            r2.b = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.c = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.h = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r2.j = r0
            return
    }

    public static java.lang.String a(android.content.Context r3) {
            r0 = 0
        L1:
            r1 = 8
            r2 = 0
            if (r0 >= r1) goto L29
            if (r3 != 0) goto L9
            goto L29
        L9:
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto L16
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            return r3
        L16:
            boolean r1 = r3 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1d
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            goto L1e
        L1d:
            r3 = r2
        L1e:
            if (r3 == 0) goto L25
            android.content.Context r3 = r3.getBaseContext()
            goto L26
        L25:
            r3 = r2
        L26:
            int r0 = r0 + 1
            goto L1
        L29:
            return r2
    }

    public static java.lang.String d(java.lang.Object r6) {
            r0 = 0
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L48
        L5:
            if (r1 == 0) goto L5a
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L5a
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L48
            a.G1 r2 = a.C0435w1.I(r2)     // Catch: java.lang.Throwable -> L48
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L55
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L48
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L48
            int r4 = r3.getModifiers()     // Catch: java.lang.Throwable -> L48
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L17
            java.lang.Class r4 = r3.getType()     // Catch: java.lang.Throwable -> L48
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = a.C0193i9.a(r4, r5)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L17
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> L48
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L4a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L48
            goto L4b
        L48:
            r6 = move-exception
            goto L5c
        L4a:
            r3 = r0
        L4b:
            if (r3 != 0) goto L4e
            goto L17
        L4e:
            boolean r4 = a.yh.a(r3)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L17
            return r3
        L55:
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Throwable -> L48
            goto L5
        L5a:
            r6 = r0
            goto L60
        L5c:
            a.wd$a r6 = a.C0465xd.a(r6)
        L60:
            if (r6 == 0) goto L63
            goto L64
        L63:
            r0 = r6
        L64:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static java.lang.reflect.Field i(java.lang.Class r3, java.lang.String r4) {
        L0:
            if (r3 == 0) goto L26
            java.lang.reflect.Field[] r0 = r3.getDeclaredFields()
            a.G1 r0 = a.C0435w1.I(r0)
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.String r2 = r1.getName()
            boolean r2 = a.C0193i9.a(r2, r4)
            if (r2 == 0) goto La
            return r1
        L21:
            java.lang.Class r3 = r3.getSuperclass()
            goto L0
        L26:
            r3 = 0
            return r3
    }

    public static boolean j() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L15
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.i
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public static void k(java.lang.Object r7) {
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Exception -> L3a
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Exception -> L3a
            java.lang.String r1 = "getMethods(...)"
            a.C0193i9.d(r0, r1)     // Catch: java.lang.Exception -> L3a
            int r1 = r0.length     // Catch: java.lang.Exception -> L3a
            r2 = 0
        Lf:
            r3 = 0
            if (r2 >= r1) goto L30
            r4 = r0[r2]     // Catch: java.lang.Exception -> L3a
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Exception -> L3a
            java.lang.String r6 = "notifyDataSetChanged"
            boolean r5 = a.C0193i9.a(r5, r6)     // Catch: java.lang.Exception -> L3a
            if (r5 == 0) goto L2d
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Exception -> L3a
            java.lang.String r6 = "getParameterTypes(...)"
            a.C0193i9.d(r5, r6)     // Catch: java.lang.Exception -> L3a
            int r5 = r5.length     // Catch: java.lang.Exception -> L3a
            if (r5 != 0) goto L2d
            goto L31
        L2d:
            int r2 = r2 + 1
            goto Lf
        L30:
            r4 = r3
        L31:
            if (r4 == 0) goto L3a
            r0 = 1
            r4.setAccessible(r0)     // Catch: java.lang.Exception -> L3a
            r4.invoke(r7, r3)     // Catch: java.lang.Exception -> L3a
        L3a:
            return
    }

    public static java.lang.Class l(java.lang.ClassLoader r6) {
            a.fd r0 = new a.fd
            int r1 = a.B1.f21a
            r2 = 1
            r3 = -1
            if (r1 != r3) goto L29
            android.content.Context r1 = a.C0435w1.p     // Catch: java.lang.Exception -> L1b
            a.C0193i9.b(r1)     // Catch: java.lang.Exception -> L1b
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L1b
            java.lang.String r4 = "com.tencent.mm"
            r5 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r4, r5)     // Catch: java.lang.Exception -> L1b
            int r3 = r1.versionCode     // Catch: java.lang.Exception -> L1b
            goto L27
        L1b:
            r1 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a.C0453x1.a(r1)
        L27:
            a.B1.f21a = r3
        L29:
            int r1 = a.B1.f21a
            r0.<init>(r1, r6)
            a.hd r6 = a.C0179hd.f499a
            r6.getClass()
            java.lang.String r6 = "F021_select_contact_mvvm_list"
            a.gd r6 = a.C0179hd.a(r6, r0)
            boolean r0 = r6.f485a
            if (r0 == 0) goto L6b
            java.lang.Class<?> r0 = r6.b
            if (r0 == 0) goto L6b
            a.cd r1 = r6.d
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "MyPlugin-DexKit: SelectContactMvvmList resolved via "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ": "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
            java.lang.Class<?> r6 = r6.b
            return r6
        L6b:
            a.j6 r6 = r6.c
            r0 = 0
            if (r6 == 0) goto L73
            java.lang.String r6 = r6.c
            goto L74
        L73:
            r6 = r0
        L74:
            java.lang.String r1 = "MyPlugin-DexKit: SelectContactMvvmList resolve FAILED (reason="
            java.lang.String r3 = ")"
            java.lang.String r6 = a.C0487z.g(r1, r6, r3)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            a.C0453x1.e(r6)
            return r0
    }

    public final java.lang.String b(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = r3.f654a     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L2d
            java.lang.String r1 = "f472211d"
            java.lang.Object r1 = a.A1.h(r4, r1)     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L1e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc4
            goto L1f
        L1e:
            r1 = r0
        L1f:
            if (r1 != 0) goto L2c
            java.lang.String r1 = r3.c(r4)     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto L2c
            java.lang.String r4 = d(r4)     // Catch: java.lang.Throwable -> Lc4
            return r4
        L2c:
            return r1
        L2d:
            java.lang.String r2 = r3.b     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L41
            java.lang.String r1 = r3.c(r4)     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto L40
            java.lang.String r4 = d(r4)     // Catch: java.lang.Throwable -> Lc4
            return r4
        L40:
            return r1
        L41:
            java.lang.String r2 = "com.tencent.mm.ui.transmit.recent.ForwardConversationInfo"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L6f
            java.lang.String r1 = "f211020d"
            java.lang.Object r1 = a.A1.h(r4, r1)     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L56
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc4
            goto L57
        L56:
            r1 = r0
        L57:
            if (r1 != 0) goto L6e
            java.lang.String r1 = "f189977d"
            java.lang.Object r1 = a.A1.h(r4, r1)     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L66
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc4
            goto L67
        L66:
            r1 = r0
        L67:
            if (r1 != 0) goto L6e
            java.lang.String r4 = d(r4)     // Catch: java.lang.Throwable -> Lc4
            return r4
        L6e:
            return r1
        L6f:
            java.lang.String r2 = "com.tencent.mm.ui.contact.v8"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L91
            java.lang.String r1 = "f207195d"
            java.lang.Object r1 = a.A1.h(r4, r1)     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto L85
            java.lang.String r1 = "d"
            java.lang.Object r1 = a.A1.h(r4, r1)     // Catch: java.lang.Throwable -> Lc4
        L85:
            if (r1 == 0) goto L8c
            java.lang.String r4 = r3.b(r1)     // Catch: java.lang.Throwable -> Lc4
            return r4
        L8c:
            java.lang.String r4 = d(r4)     // Catch: java.lang.Throwable -> Lc4
            return r4
        L91:
            java.lang.String r2 = "com.tencent.mm.ui.contact.w8"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Lc4
            if (r1 == 0) goto Lbf
            java.lang.String r1 = "f207206a"
            java.lang.Object r1 = a.A1.h(r4, r1)     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto La6
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc4
            goto La7
        La6:
            r1 = r0
        La7:
            if (r1 != 0) goto Lbe
            java.lang.String r1 = "a"
            java.lang.Object r1 = a.A1.h(r4, r1)     // Catch: java.lang.Throwable -> Lc4
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto Lb6
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc4
            goto Lb7
        Lb6:
            r1 = r0
        Lb7:
            if (r1 != 0) goto Lbe
            java.lang.String r4 = d(r4)     // Catch: java.lang.Throwable -> Lc4
            return r4
        Lbe:
            return r1
        Lbf:
            java.lang.String r4 = d(r4)     // Catch: java.lang.Throwable -> Lc4
            return r4
        Lc4:
            return r0
    }

    public final java.lang.String c(java.lang.Object r10) {
            r9 = this;
            java.lang.String r0 = "MyPlugin-DexKit"
            r1 = 0
            boolean r2 = r9.e     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1e
            java.lang.String r2 = r9.d     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1e
            java.lang.String r2 = r9.d     // Catch: java.lang.Throwable -> L1b
            a.C0193i9.b(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r10 = a.A1.h(r10, r2)     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r10 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L87
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L1b
            return r10
        L1b:
            r10 = move-exception
            goto L13a
        L1e:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L1b
            r2.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.Class r3 = r10.getClass()     // Catch: java.lang.Throwable -> L1b
        L27:
            r4 = 1
            if (r3 == 0) goto L81
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r3.equals(r5)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L81
            java.lang.reflect.Field[] r5 = r3.getDeclaredFields()     // Catch: java.lang.Throwable -> L1b
            a.G1 r5 = a.C0435w1.I(r5)     // Catch: java.lang.Throwable -> L1b
        L3a:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r6 == 0) goto L7c
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6     // Catch: java.lang.Throwable -> L1b
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L1b
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L3a
            java.lang.Class r7 = r6.getType()     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = a.C0193i9.a(r7, r8)     // Catch: java.lang.Throwable -> L1b
            if (r7 == 0) goto L3a
            r6.setAccessible(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r7 = r6.get(r10)     // Catch: java.lang.Throwable -> L1b
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1b
            if (r8 == 0) goto L6a
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L1b
            goto L6b
        L6a:
            r7 = r1
        L6b:
            if (r7 != 0) goto L6e
            goto L3a
        L6e:
            boolean r8 = a.yh.a(r7)     // Catch: java.lang.Throwable -> L1b
            if (r8 == 0) goto L3a
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L1b
            r2.put(r6, r7)     // Catch: java.lang.Throwable -> L1b
            goto L3a
        L7c:
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L1b
            goto L27
        L81:
            boolean r10 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r10 == 0) goto L88
        L87:
            return r1
        L88:
            java.util.Set r10 = r2.entrySet()     // Catch: java.lang.Throwable -> L1b
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L1b
        L90:
            boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto Lcc
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> L1b
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1b
            boolean r6 = a.yh.a(r3)     // Catch: java.lang.Throwable -> L1b
            if (r6 != 0) goto Lb0
            r6 = 0
            goto Lc9
        Lb0:
            java.lang.String r6 = ".*-\\d+-\\d+$"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r7 = "compile(...)"
            a.C0193i9.d(r6, r7)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r7 = "input"
            a.C0193i9.e(r3, r7)     // Catch: java.lang.Throwable -> L1b
            java.util.regex.Matcher r6 = r6.matcher(r3)     // Catch: java.lang.Throwable -> L1b
            boolean r6 = r6.matches()     // Catch: java.lang.Throwable -> L1b
            r6 = r6 ^ r4
        Lc9:
            if (r6 == 0) goto L90
            goto Lce
        Lcc:
            r3 = r1
            r5 = r3
        Lce:
            if (r5 != 0) goto Lf2
            java.util.Set r10 = r2.entrySet()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "<get-entries>(...)"
            a.C0193i9.d(r10, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r10 = a.C0383t3.l0(r10)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "first(...)"
            a.C0193i9.d(r10, r3)     // Catch: java.lang.Throwable -> L1b
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = r10.getKey()     // Catch: java.lang.Throwable -> L1b
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L1b
            r3 = r10
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1b
        Lf2:
            r9.d = r5     // Catch: java.lang.Throwable -> L1b
            r9.e = r4     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto Lff
            r10 = 30
            java.lang.String r10 = a.Ce.X(r3, r10)     // Catch: java.lang.Throwable -> L1b
            goto L100
        Lff:
            r10 = r1
        L100:
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L1b
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L1b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r6.<init>()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r7 = "[RecentForward] DexKit-auto: ri5.j wxid field='"
            r6.append(r7)     // Catch: java.lang.Throwable -> L1b
            r6.append(r5)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r5 = "' value='"
            r6.append(r5)     // Catch: java.lang.Throwable -> L1b
            r6.append(r10)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r10 = "' ("
            r6.append(r10)     // Catch: java.lang.Throwable -> L1b
            r6.append(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r10 = " candidates: "
            r6.append(r10)     // Catch: java.lang.Throwable -> L1b
            r6.append(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r10 = ")"
            r6.append(r10)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r10 = r6.toString()     // Catch: java.lang.Throwable -> L1b
            android.util.Log.i(r0, r10)     // Catch: java.lang.Throwable -> L1b
            return r3
        L13a:
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[RecentForward] extractWxidAutoDiscover err: "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            android.util.Log.w(r0, r10)
            return r1
    }

    public final void e(java.lang.Object r5) {
            r4 = this;
            java.lang.String r0 = "C"
            java.lang.String r1 = "B"
            java.lang.String r2 = "data"
            java.lang.String r3 = "d"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}     // Catch: java.lang.Exception -> L35
            java.util.List r0 = a.C0294o3.d0(r0)     // Catch: java.lang.Exception -> L35
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L35
        L14:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L35
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L35
            java.lang.Object r1 = a.A1.h(r5, r1)     // Catch: java.lang.Exception -> L35
            boolean r2 = a.Kf.b(r1)     // Catch: java.lang.Exception -> L35
            if (r2 == 0) goto L2d
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L35
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 != 0) goto L31
            goto L14
        L31:
            r4.g(r1)     // Catch: java.lang.Exception -> L35
            goto L14
        L35:
            return
    }

    public final java.util.ArrayList f(java.util.List r14) {
            r13 = this;
            boolean r0 = r13.f
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto Lee
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto Lee
            r13.f = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r4 = r14.size()
            java.lang.String r5 = "[DIAG-ri5j] list.size="
            java.lang.String r4 = a.C0487z.e(r5, r4)
            r0.<init>(r4)
            r4 = 5
            int r5 = r14.size()
            int r4 = java.lang.Math.min(r4, r5)
            r5 = r1
        L28:
            if (r5 >= r4) goto Ldb
            java.lang.Object r6 = r14.get(r5)
            if (r6 != 0) goto L32
            goto Ld8
        L32:
            java.lang.Class r7 = r6.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = " | ["
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r9 = "]cls="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r0.append(r7)
            java.lang.Class r7 = r6.getClass()     // Catch: java.lang.Exception -> Lc8
        L57:
            if (r7 == 0) goto Lc8
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            boolean r8 = r7.equals(r8)     // Catch: java.lang.Exception -> Lc8
            if (r8 != 0) goto Lc8
            java.lang.reflect.Field[] r8 = r7.getDeclaredFields()     // Catch: java.lang.Exception -> Lc8
            a.G1 r8 = a.C0435w1.I(r8)     // Catch: java.lang.Exception -> Lc8
        L69:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Exception -> Lc8
            if (r9 == 0) goto Lc3
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Exception -> Lc8
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9     // Catch: java.lang.Exception -> Lc8
            int r10 = r9.getModifiers()     // Catch: java.lang.Exception -> Lc8
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)     // Catch: java.lang.Exception -> Lc8
            if (r10 != 0) goto L69
            java.lang.Class r10 = r9.getType()     // Catch: java.lang.Exception -> Lc8
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            boolean r10 = a.C0193i9.a(r10, r11)     // Catch: java.lang.Exception -> Lc8
            if (r10 == 0) goto L69
            r9.setAccessible(r3)     // Catch: java.lang.Exception -> Lc8
            java.lang.Object r10 = r9.get(r6)     // Catch: java.lang.Exception -> Lc8
            boolean r11 = r10 instanceof java.lang.String     // Catch: java.lang.Exception -> Lc8
            if (r11 == 0) goto L99
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> Lc8
            goto L9a
        L99:
            r10 = r2
        L9a:
            if (r10 == 0) goto L69
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Exception -> Lc8
            r11 = 40
            java.lang.String r10 = a.Ce.X(r10, r11)     // Catch: java.lang.Exception -> Lc8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc8
            r11.<init>()     // Catch: java.lang.Exception -> Lc8
            java.lang.String r12 = " "
            r11.append(r12)     // Catch: java.lang.Exception -> Lc8
            r11.append(r9)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r9 = "="
            r11.append(r9)     // Catch: java.lang.Exception -> Lc8
            r11.append(r10)     // Catch: java.lang.Exception -> Lc8
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Exception -> Lc8
            r0.append(r9)     // Catch: java.lang.Exception -> Lc8
            goto L69
        Lc3:
            java.lang.Class r7 = r7.getSuperclass()     // Catch: java.lang.Exception -> Lc8
            goto L57
        Lc8:
            java.lang.String r7 = " wxid="
            r0.append(r7)
            java.lang.String r6 = r13.b(r6)
            if (r6 != 0) goto Ld5
            java.lang.String r6 = "NULL"
        Ld5:
            r0.append(r6)
        Ld8:
            int r5 = r5 + r3
            goto L28
        Ldb:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[RecentForward] "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "MyPlugin-DexKit"
            android.util.Log.i(r4, r0)
        Lee:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = r14.size()
            r0.<init>(r4)
            java.util.Iterator r14 = r14.iterator()
            r4 = r1
        Lfc:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L122
            java.lang.Object r5 = r14.next()
            if (r5 != 0) goto L10c
            r0.add(r2)
            goto Lfc
        L10c:
            java.lang.String r6 = r13.b(r5)
            if (r6 != 0) goto L114
            r6 = r1
            goto L11a
        L114:
            java.util.concurrent.ExecutorService r7 = a.fh.G
            boolean r6 = a.fh.a.a(r6)
        L11a:
            if (r6 == 0) goto L11e
            r4 = r3
            goto Lfc
        L11e:
            r0.add(r5)
            goto Lfc
        L122:
            if (r4 == 0) goto L125
            r2 = r0
        L125:
            return r2
    }

    public final int g(java.util.List<?> r5) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Iterator r5 = r5.iterator()
            r0 = r1
        Ld:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r5.next()
            if (r2 != 0) goto L1a
            goto Ld
        L1a:
            java.lang.String r2 = r4.b(r2)
            if (r2 != 0) goto L22
            r2 = r1
            goto L28
        L22:
            java.util.concurrent.ExecutorService r3 = a.fh.G
            boolean r2 = a.fh.a.a(r2)
        L28:
            if (r2 == 0) goto Ld
            r5.remove()
            int r0 = r0 + 1
            goto Ld
        L30:
            return r0
    }

    public final void h(java.lang.Object r8) {
            r7 = this;
            java.lang.String r0 = "o"
            java.lang.String r1 = "p"
            java.lang.String r2 = "h"
            java.lang.String r3 = "C"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.Exception -> L14
            java.lang.reflect.Field r2 = i(r2, r1)     // Catch: java.lang.Exception -> L14
            if (r2 != 0) goto L2b
            goto L14
        L2b:
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Exception -> L14
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Exception -> L14
            boolean r3 = a.Kf.b(r2)     // Catch: java.lang.Exception -> L14
            if (r3 == 0) goto L3c
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L14
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 != 0) goto L40
            goto L14
        L40:
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Exception -> L14
            if (r3 != 0) goto L14
            int r3 = r7.g(r2)     // Catch: java.lang.Exception -> L14
            if (r3 <= 0) goto L14
            java.lang.String r4 = "MyPlugin-DexKit"
            int r2 = r2.size()     // Catch: java.lang.Exception -> L14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L14
            r5.<init>()     // Catch: java.lang.Exception -> L14
            java.lang.String r6 = "[RecentForward] SelectContactMvvmList."
            r5.append(r6)     // Catch: java.lang.Exception -> L14
            r5.append(r1)     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = " filtered "
            r5.append(r1)     // Catch: java.lang.Exception -> L14
            r5.append(r3)     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = ", now "
            r5.append(r1)     // Catch: java.lang.Exception -> L14
            r5.append(r2)     // Catch: java.lang.Exception -> L14
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L14
            android.util.Log.i(r4, r1)     // Catch: java.lang.Exception -> L14
            goto L14
        L77:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r22) {
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "com.tencent.mm.ui.transmit.recent.i"
            java.lang.String r4 = "com.tencent.mm.pluginsdk.forward.m"
            java.lang.String r5 = "a"
            java.lang.String r6 = "com.tencent.mm.ui.contact.item.q1"
            java.lang.String r7 = "getParameterTypes(...)"
            java.lang.String r8 = "MyPlugin-DexKit"
            java.lang.String r0 = "session"
            a.C0193i9.e(r2, r0)
            java.lang.ClassLoader r9 = r2.f136a
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.i
            r10 = 1
            if (r0 != 0) goto L33
            java.lang.String r0 = "MyPlugin-DexKit: [RecentForward] switch off, skip"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)
            a.C0453x1.b(r0)
            return
        L33:
            a.fd r11 = new a.fd
            int r0 = a.B1.f21a
            java.lang.String r12 = "com.tencent.mm"
            r13 = -1
            r14 = 0
            if (r0 != r13) goto L5c
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L4d
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L4d
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L4d
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r14)     // Catch: java.lang.Exception -> L4d
            int r0 = r0.versionCode     // Catch: java.lang.Exception -> L4d
            goto L5a
        L4d:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)
            a.C0453x1.a(r0)
            r0 = r13
        L5a:
            a.B1.f21a = r0
        L5c:
            int r0 = a.B1.f21a
            r11.<init>(r0, r9)
            a.hd r0 = a.C0179hd.f499a
            r0.getClass()
            java.lang.String r0 = "F021_recent_forward_adapter"
            a.gd r0 = a.C0179hd.a(r0, r11)
            boolean r11 = r0.f485a
            java.lang.String r15 = ")"
            r16 = 0
            if (r11 == 0) goto La8
            java.lang.Class<?> r11 = r0.b
            if (r11 == 0) goto La8
            a.cd r14 = r0.d
            java.lang.String r11 = r11.getName()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r10 = "MyPlugin-DexKit: adapter resolved via "
            r13.<init>(r10)
            r13.append(r14)
            java.lang.String r10 = ": "
            r13.append(r10)
            r13.append(r11)
            java.lang.String r10 = r13.toString()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            r11 = 1
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
            a.C0453x1.b(r10)
            java.lang.Class<?> r0 = r0.b
            java.lang.String r0 = r0.getName()
            r10 = r0
            goto Lc5
        La8:
            a.j6 r0 = r0.c
            if (r0 == 0) goto Laf
            java.lang.String r0 = r0.c
            goto Lb1
        Laf:
            r0 = r16
        Lb1:
            java.lang.String r10 = "MyPlugin-DexKit: adapter resolve FAILED (reason="
            java.lang.String r0 = a.C0487z.g(r10, r0, r15)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r11 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r11)
            a.C0453x1.e(r0)
            r10 = r16
        Lc5:
            a.fd r11 = new a.fd
            int r0 = a.B1.f21a
            r13 = -1
            if (r0 != r13) goto Led
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> Ldd
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> Ldd
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> Ldd
            r14 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r14)     // Catch: java.lang.Exception -> Ldd
            int r0 = r0.versionCode     // Catch: java.lang.Exception -> Ldd
            goto Leb
        Ldd:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r12 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r12)
            a.C0453x1.a(r0)
            r0 = r13
        Leb:
            a.B1.f21a = r0
        Led:
            int r0 = a.B1.f21a
            r11.<init>(r0, r9)
            java.lang.String r0 = "forward_data_item"
            a.gd r0 = a.C0179hd.a(r0, r11)
            java.lang.Class<?> r11 = r0.b
            if (r11 == 0) goto L101
            java.lang.String r11 = r11.getName()
            goto L103
        L101:
            java.lang.String r11 = "yj5.j"
        L103:
            r1.f654a = r11
            java.lang.String r11 = "legacyDataItem"
            java.lang.Class r11 = r0.a(r11)
            if (r11 == 0) goto L112
            java.lang.String r11 = r11.getName()
            goto L114
        L112:
            java.lang.String r11 = "ri5.j"
        L114:
            r1.b = r11
            r1.i = r2
            java.lang.String r11 = r1.f654a
            a.cd r0 = r0.d
            java.lang.String r12 = "MyPlugin-DexKit: [RecentForward] handleHook START (adapter="
            java.lang.String r14 = " dataItem="
            java.lang.String r13 = " via="
            java.lang.StringBuilder r11 = a.C0487z.i(r12, r10, r14, r11, r13)
            r11.append(r0)
            r11.append(r15)
            java.lang.String r0 = r11.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r11 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r11)
            a.C0453x1.b(r0)
            java.lang.String r11 = "getDeclaredMethods(...)"
            if (r10 == 0) goto L22b
            java.lang.String r0 = "com.tencent.mm.view.recyclerview.WxRecyclerView"
            java.lang.ClassLoader r12 = r2.f136a     // Catch: java.lang.Throwable -> L172
            java.lang.Class r0 = a.A1.b(r12, r0)     // Catch: java.lang.Throwable -> L172
            java.lang.String r12 = "setAdapter"
            if (r0 == 0) goto L1b3
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L172
            a.C0193i9.d(r0, r11)     // Catch: java.lang.Throwable -> L172
            int r13 = r0.length     // Catch: java.lang.Throwable -> L172
            r14 = 0
        L155:
            if (r14 >= r13) goto L180
            r18 = r0[r14]     // Catch: java.lang.Throwable -> L172
            r19 = r0
            java.lang.String r0 = r18.getName()     // Catch: java.lang.Throwable -> L172
            boolean r0 = a.C0193i9.a(r0, r12)     // Catch: java.lang.Throwable -> L172
            if (r0 == 0) goto L177
            java.lang.Class[] r0 = r18.getParameterTypes()     // Catch: java.lang.Throwable -> L172
            int r0 = r0.length     // Catch: java.lang.Throwable -> L172
            r20 = r9
            r9 = 1
            if (r0 != r9) goto L179
            r0 = r18
            goto L184
        L172:
            r0 = move-exception
            r20 = r9
            goto L20a
        L177:
            r20 = r9
        L179:
            int r14 = r14 + 1
            r0 = r19
            r9 = r20
            goto L155
        L180:
            r20 = r9
            r0 = r16
        L184:
            if (r0 == 0) goto L1b5
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r2.f(r0)     // Catch: java.lang.Throwable -> L1b1
            a.o4 r9 = new a.o4     // Catch: java.lang.Throwable -> L1b1
            r13 = 3
            r9.<init>(r1, r13, r10)     // Catch: java.lang.Throwable -> L1b1
            r0.intercept(r9)     // Catch: java.lang.Throwable -> L1b1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b1
            r0.<init>()     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r9 = "MyPlugin-DexKit: [RecentForward] hooked WxRecyclerView.setAdapter for "
            r0.append(r9)     // Catch: java.lang.Throwable -> L1b1
            r0.append(r10)     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1b1
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1b1
            r9 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r9)     // Catch: java.lang.Throwable -> L1b1
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L1b1
            goto L1b5
        L1b1:
            r0 = move-exception
            goto L20a
        L1b3:
            r20 = r9
        L1b5:
            java.lang.String r0 = "androidx.recyclerview.widget.RecyclerView"
            java.lang.ClassLoader r9 = r2.f136a     // Catch: java.lang.Throwable -> L1b1
            java.lang.Class r0 = a.A1.b(r9, r0)     // Catch: java.lang.Throwable -> L1b1
            if (r0 == 0) goto L207
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L1b1
            a.C0193i9.d(r0, r11)     // Catch: java.lang.Throwable -> L1b1
            int r9 = r0.length     // Catch: java.lang.Throwable -> L1b1
            r10 = 0
        L1c8:
            if (r10 >= r9) goto L1e8
            r13 = r0[r10]     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r14 = r13.getName()     // Catch: java.lang.Throwable -> L1b1
            boolean r14 = a.C0193i9.a(r14, r12)     // Catch: java.lang.Throwable -> L1b1
            if (r14 == 0) goto L1e1
            java.lang.Class[] r14 = r13.getParameterTypes()     // Catch: java.lang.Throwable -> L1b1
            int r14 = r14.length     // Catch: java.lang.Throwable -> L1b1
            r18 = r9
            r9 = 1
            if (r14 != r9) goto L1e3
            goto L1ea
        L1e1:
            r18 = r9
        L1e3:
            int r10 = r10 + 1
            r9 = r18
            goto L1c8
        L1e8:
            r13 = r16
        L1ea:
            if (r13 == 0) goto L207
            io.github.libxposed.api.XposedInterface$HookBuilder r0 = r2.f(r13)     // Catch: java.lang.Throwable -> L1b1
            a.n8 r9 = new a.n8     // Catch: java.lang.Throwable -> L1b1
            r10 = 2
            r9.<init>(r1, r10)     // Catch: java.lang.Throwable -> L1b1
            r0.intercept(r9)     // Catch: java.lang.Throwable -> L1b1
            java.lang.String r0 = "MyPlugin-DexKit: [RecentForward] hooked RecyclerView.setAdapter for WxRecyclerAdapter"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1b1
            r9 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r9)     // Catch: java.lang.Throwable -> L1b1
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L1b1
        L207:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1b1
            goto L20e
        L20a:
            a.wd$a r0 = a.C0465xd.a(r0)
        L20e:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L22d
            java.lang.String r0 = r0.getMessage()
            java.lang.String r9 = "MyPlugin-DexKit: [RecentForward] hookXm3T0AdapterCapture FAIL: "
            java.lang.String r0 = a.C0487z.k(r9, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r9 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r9)
            a.C0453x1.e(r0)
            goto L22d
        L22b:
            r20 = r9
        L22d:
            java.lang.Class r0 = l(r20)     // Catch: java.lang.Throwable -> L243
            if (r0 != 0) goto L246
            java.lang.String r0 = "MyPlugin-DexKit: [RecentForward] SelectContactMvvmList not found"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L243
            r9 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r9)     // Catch: java.lang.Throwable -> L243
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L243
            goto L321
        L243:
            r0 = move-exception
            goto L302
        L246:
            java.lang.reflect.Method[] r9 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L243
            a.C0193i9.d(r9, r11)     // Catch: java.lang.Throwable -> L243
            int r10 = r9.length     // Catch: java.lang.Throwable -> L243
            r11 = 0
        L24f:
            java.lang.String r12 = "e"
            if (r11 >= r10) goto L281
            r13 = r9[r11]     // Catch: java.lang.Throwable -> L243
            java.lang.String r14 = r13.getName()     // Catch: java.lang.Throwable -> L243
            boolean r14 = a.C0193i9.a(r14, r12)     // Catch: java.lang.Throwable -> L243
            if (r14 == 0) goto L27a
            java.lang.Class[] r14 = r13.getParameterTypes()     // Catch: java.lang.Throwable -> L243
            int r14 = r14.length     // Catch: java.lang.Throwable -> L243
            r18 = r9
            r9 = 1
            if (r14 != r9) goto L27c
            java.lang.Class<java.util.List> r9 = java.util.List.class
            java.lang.Class[] r14 = r13.getParameterTypes()     // Catch: java.lang.Throwable -> L243
            r17 = 0
            r14 = r14[r17]     // Catch: java.lang.Throwable -> L243
            boolean r9 = r9.isAssignableFrom(r14)     // Catch: java.lang.Throwable -> L243
            if (r9 == 0) goto L27c
            goto L283
        L27a:
            r18 = r9
        L27c:
            int r11 = r11 + 1
            r9 = r18
            goto L24f
        L281:
            r13 = r16
        L283:
            if (r13 == 0) goto L29b
            r9 = 1
            r13.setAccessible(r9)     // Catch: java.lang.Throwable -> L243
            io.github.libxposed.api.XposedInterface$HookBuilder r9 = r2.f(r13)     // Catch: java.lang.Throwable -> L243
            a.n8 r10 = new a.n8     // Catch: java.lang.Throwable -> L243
            r11 = 3
            r10.<init>(r1, r11)     // Catch: java.lang.Throwable -> L243
            r9.intercept(r10)     // Catch: java.lang.Throwable -> L243
            java.lang.String r9 = "[RecentForward] hooked SelectContactMvvmList.e(List)"
            android.util.Log.i(r8, r9)     // Catch: java.lang.Throwable -> L243
        L29b:
            java.lang.reflect.Method[] r9 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L243
            a.G1 r9 = a.C0435w1.I(r9)     // Catch: java.lang.Throwable -> L243
        L2a3:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L243
            if (r10 == 0) goto L2e0
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L243
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L243
            int r11 = r10.getModifiers()     // Catch: java.lang.Throwable -> L243
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)     // Catch: java.lang.Throwable -> L243
            if (r11 != 0) goto L2a3
            java.lang.String r11 = r10.getName()     // Catch: java.lang.Throwable -> L243
            boolean r11 = a.C0193i9.a(r11, r12)     // Catch: java.lang.Throwable -> L243
            if (r11 != 0) goto L2a3
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L243
            a.C0193i9.d(r11, r7)     // Catch: java.lang.Throwable -> L243
            int r11 = r11.length     // Catch: java.lang.Throwable -> L243
            if (r11 != 0) goto L2ce
            goto L2a3
        L2ce:
            r11 = 1
            r10.setAccessible(r11)     // Catch: java.lang.Throwable -> L243
            io.github.libxposed.api.XposedInterface$HookBuilder r10 = r2.f(r10)     // Catch: java.lang.Throwable -> L243
            a.n8 r11 = new a.n8     // Catch: java.lang.Throwable -> L243
            r13 = 4
            r11.<init>(r1, r13)     // Catch: java.lang.Throwable -> L243
            r10.intercept(r11)     // Catch: java.lang.Throwable -> L243
            goto L2a3
        L2e0:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L243
            int r0 = r0.length     // Catch: java.lang.Throwable -> L243
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L243
            r9.<init>()     // Catch: java.lang.Throwable -> L243
            java.lang.String r10 = "[RecentForward] hooked SelectContactMvvmList all methods ("
            r9.append(r10)     // Catch: java.lang.Throwable -> L243
            r9.append(r0)     // Catch: java.lang.Throwable -> L243
            r9.append(r15)     // Catch: java.lang.Throwable -> L243
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L243
            int r0 = android.util.Log.i(r8, r0)     // Catch: java.lang.Throwable -> L243
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L243
            goto L306
        L302:
            a.wd$a r0 = a.C0465xd.a(r0)
        L306:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L321
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[RecentForward] hookSelectContactMvvmLiveData FAIL: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            android.util.Log.w(r8, r0)
        L321:
            java.lang.String r0 = "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"
            java.lang.ClassLoader r9 = r2.f136a     // Catch: java.lang.Throwable -> L35a
            java.lang.Class r0 = a.A1.b(r9, r0)     // Catch: java.lang.Throwable -> L35a
            if (r0 != 0) goto L32d
            goto L3a9
        L32d:
            java.lang.reflect.Constructor[] r0 = r0.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L35a
            a.G1 r0 = a.C0435w1.I(r0)     // Catch: java.lang.Throwable -> L35a
        L335:
            boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> L35a
            if (r9 == 0) goto L387
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L35a
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9     // Catch: java.lang.Throwable -> L35a
            java.lang.Class[] r10 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L35a
            a.C0193i9.d(r10, r7)     // Catch: java.lang.Throwable -> L35a
            int r11 = r10.length     // Catch: java.lang.Throwable -> L35a
            r12 = 0
        L34a:
            if (r12 >= r11) goto L35c
            r13 = r10[r12]     // Catch: java.lang.Throwable -> L35a
            java.lang.Class<java.util.ArrayList> r14 = java.util.ArrayList.class
            boolean r13 = a.C0193i9.a(r13, r14)     // Catch: java.lang.Throwable -> L35a
            if (r13 == 0) goto L357
            goto L35d
        L357:
            int r12 = r12 + 1
            goto L34a
        L35a:
            r0 = move-exception
            goto L38a
        L35c:
            r12 = -1
        L35d:
            if (r12 < 0) goto L335
            r11 = 1
            r9.setAccessible(r11)     // Catch: java.lang.Throwable -> L35a
            io.github.libxposed.api.XposedInterface$HookBuilder r9 = r2.f(r9)     // Catch: java.lang.Throwable -> L35a
            a.o8 r10 = new a.o8     // Catch: java.lang.Throwable -> L35a
            r10.<init>(r1, r12)     // Catch: java.lang.Throwable -> L35a
            r9.intercept(r10)     // Catch: java.lang.Throwable -> L35a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35a
            r9.<init>()     // Catch: java.lang.Throwable -> L35a
            java.lang.String r10 = "[RecentForward] hooked WxRecyclerAdapter ctor (ArrayList@"
            r9.append(r10)     // Catch: java.lang.Throwable -> L35a
            r9.append(r12)     // Catch: java.lang.Throwable -> L35a
            r9.append(r15)     // Catch: java.lang.Throwable -> L35a
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L35a
            android.util.Log.i(r8, r9)     // Catch: java.lang.Throwable -> L35a
            goto L335
        L387:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L35a
            goto L38e
        L38a:
            a.wd$a r0 = a.C0465xd.a(r0)
        L38e:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L3a9
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[RecentForward] hookWxRecyclerAdapterCtor FAIL: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            android.util.Log.w(r8, r0)
        L3a9:
            java.lang.String r0 = "com.tencent.mm.ui.contact.p6"
            java.lang.ClassLoader r9 = r2.f136a     // Catch: java.lang.Throwable -> L3fc
            java.lang.Class r0 = a.A1.b(r9, r0)     // Catch: java.lang.Throwable -> L3fc
            if (r0 != 0) goto L3b5
            goto L441
        L3b5:
            java.lang.reflect.Method[] r9 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L3fc
            a.G1 r9 = a.C0435w1.I(r9)     // Catch: java.lang.Throwable -> L3fc
        L3bd:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L3fc
            if (r10 == 0) goto L3fe
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L3fc
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L3fc
            int r11 = r10.getModifiers()     // Catch: java.lang.Throwable -> L3fc
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)     // Catch: java.lang.Throwable -> L3fc
            if (r11 != 0) goto L3bd
            java.lang.Class r11 = r10.getReturnType()     // Catch: java.lang.Throwable -> L3fc
            java.lang.Class r12 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L3fc
            boolean r11 = a.C0193i9.a(r11, r12)     // Catch: java.lang.Throwable -> L3fc
            if (r11 != 0) goto L3bd
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L3fc
            a.C0193i9.d(r11, r7)     // Catch: java.lang.Throwable -> L3fc
            int r11 = r11.length     // Catch: java.lang.Throwable -> L3fc
            if (r11 != 0) goto L3ea
            goto L3bd
        L3ea:
            r11 = 1
            r10.setAccessible(r11)     // Catch: java.lang.Throwable -> L3fc
            io.github.libxposed.api.XposedInterface$HookBuilder r10 = r2.f(r10)     // Catch: java.lang.Throwable -> L3fc
            a.n8 r11 = new a.n8     // Catch: java.lang.Throwable -> L3fc
            r12 = 1
            r11.<init>(r1, r12)     // Catch: java.lang.Throwable -> L3fc
            r10.intercept(r11)     // Catch: java.lang.Throwable -> L3fc
            goto L3bd
        L3fc:
            r0 = move-exception
            goto L422
        L3fe:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L3fc
            int r0 = r0.length     // Catch: java.lang.Throwable -> L3fc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3fc
            r7.<init>()     // Catch: java.lang.Throwable -> L3fc
            java.lang.String r9 = "[RecentForward] hooked old p6 ("
            r7.append(r9)     // Catch: java.lang.Throwable -> L3fc
            r7.append(r0)     // Catch: java.lang.Throwable -> L3fc
            java.lang.String r0 = " methods)"
            r7.append(r0)     // Catch: java.lang.Throwable -> L3fc
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L3fc
            int r0 = android.util.Log.i(r8, r0)     // Catch: java.lang.Throwable -> L3fc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3fc
            goto L426
        L422:
            a.wd$a r0 = a.C0465xd.a(r0)
        L426:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L441
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "[RecentForward] hookOldP6Path FAIL: "
            r7.<init>(r9)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.w(r8, r0)
        L441:
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> L455
            java.lang.Class r0 = a.A1.b(r0, r6)     // Catch: java.lang.Throwable -> L455
            if (r0 != 0) goto L44a
            goto L48f
        L44a:
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Exception -> L452 java.lang.Throwable -> L455
            java.lang.String r7 = "com.tencent.mm.ui.contact.item.b"
            java.lang.Class r16 = r0.loadClass(r7)     // Catch: java.lang.Exception -> L452 java.lang.Throwable -> L455
        L452:
            r0 = r16
            goto L457
        L455:
            r0 = move-exception
            goto L470
        L457:
            if (r0 == 0) goto L46d
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r7, r0}     // Catch: java.lang.Throwable -> L455
            a.p8 r7 = new a.p8     // Catch: java.lang.Throwable -> L455
            r9 = 0
            r7.<init>(r1, r9)     // Catch: java.lang.Throwable -> L455
            a.J8.a(r2, r6, r5, r0, r7)     // Catch: java.lang.Throwable -> L455
            java.lang.String r0 = "[RecentForward] hooked old q1.a(Context, item.b)"
            android.util.Log.i(r8, r0)     // Catch: java.lang.Throwable -> L455
        L46d:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L455
            goto L474
        L470:
            a.wd$a r0 = a.C0465xd.a(r0)
        L474:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L48f
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[RecentForward] hookOldQ1Path FAIL: "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r8, r0)
        L48f:
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> L4b1
            java.lang.Class r0 = a.A1.b(r0, r4)     // Catch: java.lang.Throwable -> L4b1
            if (r0 != 0) goto L498
            goto L4d1
        L498:
            java.lang.String r0 = "qh"
            r14 = 0
            java.lang.Class[] r6 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L4b1
            a.p8 r7 = new a.p8     // Catch: java.lang.Throwable -> L4b1
            r9 = 1
            r7.<init>(r1, r9)     // Catch: java.lang.Throwable -> L4b1
            a.J8.a(r2, r4, r0, r6, r7)     // Catch: java.lang.Throwable -> L4b1
            java.lang.String r0 = "[RecentForward] hooked bottom forward.m.qh"
            int r0 = android.util.Log.i(r8, r0)     // Catch: java.lang.Throwable -> L4b1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L4b1
            goto L4b6
        L4b1:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L4b6:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L4d1
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "[RecentForward] hookBottomForwardMenu FAIL: "
            r4.<init>(r6)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.w(r8, r0)
        L4d1:
            java.lang.ClassLoader r0 = r2.f136a     // Catch: java.lang.Throwable -> L501
            java.lang.Class r0 = a.A1.b(r0, r3)     // Catch: java.lang.Throwable -> L501
            if (r0 != 0) goto L4da
            goto L52d
        L4da:
            java.lang.String r0 = "b"
            java.lang.String[] r0 = new java.lang.String[]{r5, r0}     // Catch: java.lang.Throwable -> L501
            java.util.List r0 = a.C0294o3.d0(r0)     // Catch: java.lang.Throwable -> L501
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L501
        L4e8:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L501
            if (r4 == 0) goto L503
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L501
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L501
            r14 = 0
            java.lang.Class[] r5 = new java.lang.Class[r14]     // Catch: java.lang.Throwable -> L501
            a.l4 r6 = new a.l4     // Catch: java.lang.Throwable -> L501
            r7 = 1
            r6.<init>(r1, r7, r4)     // Catch: java.lang.Throwable -> L501
            a.J8.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L501
            goto L4e8
        L501:
            r0 = move-exception
            goto L50e
        L503:
            java.lang.String r0 = "[RecentForward] hooked forward provider a/b"
            int r0 = android.util.Log.i(r8, r0)     // Catch: java.lang.Throwable -> L501
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L501
            goto L512
        L50e:
            a.wd$a r0 = a.C0465xd.a(r0)
        L512:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L52d
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[RecentForward] hookForwardDataProvider FAIL: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r8, r0)
        L52d:
            java.lang.String r0 = "MyPlugin-DexKit: [RecentForward] handleHook DONE, all hooks registered"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r9 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r9)
            a.C0453x1.b(r0)
            return
    }

    public final void m(java.lang.Object r11) {
            r10 = this;
            r0 = 1
            r10.n(r11)
            r1 = 3
            long[] r2 = new long[r1]
            r2 = {x009c: FILL_ARRAY_DATA , data: [100, 300, 800} // fill-array
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r1) goto L1d
            r5 = r2[r4]
            android.os.Handler r7 = r10.c
            a.P0 r8 = new a.P0
            r9 = 7
            r8.<init>(r10, r9, r11)
            r7.postDelayed(r8, r5)
            int r4 = r4 + r0
            goto Lc
        L1d:
            java.util.Set<java.lang.Object> r1 = r10.j
            boolean r1 = r1.contains(r11)
            if (r1 == 0) goto L27
            goto L9b
        L27:
            java.util.Set<java.lang.Object> r1 = r10.j
            r1.add(r11)
            a.J8 r1 = r10.i
            if (r1 != 0) goto L31
            goto L9b
        L31:
            java.lang.Class r2 = r11.getClass()     // Catch: java.lang.Throwable -> L5d
            java.lang.reflect.Method[] r2 = r2.getMethods()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "getMethods(...)"
            a.C0193i9.d(r2, r4)     // Catch: java.lang.Throwable -> L5d
            int r4 = r2.length     // Catch: java.lang.Throwable -> L5d
            r5 = r3
        L40:
            if (r5 >= r4) goto L61
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = "notifyDataSetChanged"
            boolean r7 = a.C0193i9.a(r7, r8)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L5f
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = "getParameterTypes(...)"
            a.C0193i9.d(r7, r8)     // Catch: java.lang.Throwable -> L5d
            int r7 = r7.length     // Catch: java.lang.Throwable -> L5d
            if (r7 != 0) goto L5f
            goto L62
        L5d:
            r11 = move-exception
            goto L98
        L5f:
            int r5 = r5 + r0
            goto L40
        L61:
            r6 = 0
        L62:
            if (r6 != 0) goto L65
            goto L9b
        L65:
            io.github.libxposed.api.XposedInterface$HookBuilder r1 = r1.f(r6)     // Catch: java.lang.Throwable -> L5d
            a.n8 r2 = new a.n8     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r10, r3)     // Catch: java.lang.Throwable -> L5d
            r1.intercept(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.Class r11 = r11.getClass()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r11 = r11.getSimpleName()     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r1.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "MyPlugin-DexKit: [RecentForward] Phase6-2: notifyDataSetChanged hook installed on "
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            r1.append(r11)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r11 = r1.toString()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)     // Catch: java.lang.Throwable -> L5d
            a.C0453x1.b(r11)     // Catch: java.lang.Throwable -> L5d
            a.Wf r11 = a.Wf.f330a     // Catch: java.lang.Throwable -> L5d
            return
        L98:
            a.C0465xd.a(r11)
        L9b:
            return
    }

    public final void n(java.lang.Object r13) {
            r12 = this;
            java.lang.String r1 = "MyPlugin-DexKit"
            boolean r0 = j()     // Catch: java.lang.Throwable -> L132
            if (r0 != 0) goto La
            goto L152
        La:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r12.h     // Catch: java.lang.Throwable -> L132
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L132
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L132
            boolean r0 = a.C0193i9.a(r0, r2)     // Catch: java.lang.Throwable -> L132
            if (r0 == 0) goto L1a
            goto L152
        L1a:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r12.h     // Catch: java.lang.Throwable -> L132
            r0.set(r2)     // Catch: java.lang.Throwable -> L132
            java.lang.String r3 = "data"
            java.lang.String r4 = "o"
            java.lang.String r5 = "p"
            java.lang.String r6 = "f152040o"
            java.lang.String r7 = "h"
            java.lang.String r8 = "C"
            java.lang.String r9 = "d"
            java.lang.String[] r0 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9}     // Catch: java.lang.Throwable -> L62
            java.util.List r0 = a.C0294o3.d0(r0)     // Catch: java.lang.Throwable -> L62
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L62
        L39:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L12a
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L62
            java.lang.Class r3 = r13.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.reflect.Field r3 = i(r3, r2)     // Catch: java.lang.Throwable -> L62
            if (r3 != 0) goto L50
            goto L39
        L50:
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = r3.get(r13)     // Catch: java.lang.Throwable -> L62
            boolean r5 = a.Kf.b(r3)     // Catch: java.lang.Throwable -> L62
            r6 = 0
            if (r5 == 0) goto L66
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L62
            goto L67
        L62:
            r0 = move-exception
            r13 = r0
            goto L135
        L66:
            r3 = r6
        L67:
            if (r3 != 0) goto L6a
            goto L39
        L6a:
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L39
            boolean r5 = r12.g     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto Lf9
            r12.g = r4     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r7.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = "[DBG] adapter."
            r7.append(r8)     // Catch: java.lang.Throwable -> L62
            r7.append(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = " size="
            r7.append(r8)     // Catch: java.lang.Throwable -> L62
            r7.append(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L62
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L62
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L62
            r7 = 3
            int r5 = java.lang.Math.min(r7, r5)     // Catch: java.lang.Throwable -> L62
            r7 = 0
        La2:
            if (r7 >= r5) goto Le5
            java.lang.Object r8 = r3.get(r7)     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto Lb3
            java.lang.Class r9 = r8.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L62
            goto Lb4
        Lb3:
            r9 = r6
        Lb4:
            if (r8 == 0) goto Lbc
            java.lang.String r8 = r12.b(r8)     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto Lbe
        Lbc:
            java.lang.String r8 = "?"
        Lbe:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r10.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = " | ["
            r10.append(r11)     // Catch: java.lang.Throwable -> L62
            r10.append(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.String r11 = "]"
            r10.append(r11)     // Catch: java.lang.Throwable -> L62
            r10.append(r9)     // Catch: java.lang.Throwable -> L62
            java.lang.String r9 = "=wxid:"
            r10.append(r9)     // Catch: java.lang.Throwable -> L62
            r10.append(r8)     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L62
            r4.append(r8)     // Catch: java.lang.Throwable -> L62
            int r7 = r7 + 1
            goto La2
        Le5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "[RecentForward] "
            r5.append(r6)     // Catch: java.lang.Throwable -> L62
            r5.append(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L62
            android.util.Log.i(r1, r4)     // Catch: java.lang.Throwable -> L62
        Lf9:
            int r4 = r12.g(r3)     // Catch: java.lang.Throwable -> L62
            if (r4 <= 0) goto L39
            k(r13)     // Catch: java.lang.Throwable -> L62
            int r13 = r3.size()     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r0.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = "[RecentForward] adapter."
            r0.append(r3)     // Catch: java.lang.Throwable -> L62
            r0.append(r2)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = " filtered "
            r0.append(r2)     // Catch: java.lang.Throwable -> L62
            r0.append(r4)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = ", now "
            r0.append(r2)     // Catch: java.lang.Throwable -> L62
            r0.append(r13)     // Catch: java.lang.Throwable -> L62
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L62
            android.util.Log.i(r1, r13)     // Catch: java.lang.Throwable -> L62
        L12a:
            java.lang.ThreadLocal<java.lang.Boolean> r13 = r12.h     // Catch: java.lang.Throwable -> L132
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L132
            r13.set(r0)     // Catch: java.lang.Throwable -> L132
            return
        L132:
            r0 = move-exception
            r13 = r0
            goto L13d
        L135:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r12.h     // Catch: java.lang.Throwable -> L132
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L132
            r0.set(r2)     // Catch: java.lang.Throwable -> L132
            throw r13     // Catch: java.lang.Throwable -> L132
        L13d:
            java.lang.String r13 = r13.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[RecentForward] tryFilterAdapterData err: "
            r0.<init>(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            android.util.Log.w(r1, r13)
        L152:
            return
    }
}
