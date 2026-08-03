package a;

/* JADX INFO: renamed from: a.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0174h8 implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static volatile a.A3 k;
    public static volatile a.C0174h8 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f495a;
    public volatile a.C0043a5.c b;
    public volatile boolean c;
    public volatile java.lang.Object d;
    public volatile java.lang.Object e;
    public volatile java.util.ArrayList f;
    public final a.C0203j2 g;
    public volatile java.lang.reflect.Method h;
    public a.J8 i;
    public volatile java.lang.reflect.Field j;

    public C0174h8() {
            r2 = this;
            r2.<init>()
            a.j2 r0 = new a.j2
            r1 = 3
            r0.<init>(r1, r2)
            r2.g = r0
            return
    }

    public static java.lang.String a(java.lang.Object r9) {
            java.lang.String r0 = "d1"
            java.lang.String r1 = "d"
            java.lang.String r2 = "getUsername"
            java.lang.String r3 = "getWxid"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "toLowerCase(...)"
            r3 = 1
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r5 = 0
            if (r1 == 0) goto L65
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r6 = r9.getClass()
        L2a:
            if (r6 == 0) goto L14
            boolean r7 = r6.equals(r4)
            if (r7 != 0) goto L14
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r1, r5)     // Catch: java.lang.Throwable -> L44
            r7.setAccessible(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r7 = r7.invoke(r9, r5)     // Catch: java.lang.Throwable -> L44
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L44
            if (r8 == 0) goto L46
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L44
            goto L47
        L44:
            r7 = move-exception
            goto L5d
        L46:
            r7 = r5
        L47:
            if (r7 == 0) goto L5a
            boolean r8 = a.Be.P(r7)     // Catch: java.lang.Throwable -> L44
            if (r8 == 0) goto L50
            goto L5a
        L50:
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = r7.toLowerCase(r8)     // Catch: java.lang.Throwable -> L44
            a.C0193i9.d(r7, r2)     // Catch: java.lang.Throwable -> L44
            return r7
        L5a:
            a.Wf r7 = a.Wf.f330a     // Catch: java.lang.Throwable -> L44
            goto L60
        L5d:
            a.C0465xd.a(r7)
        L60:
            java.lang.Class r6 = r6.getSuperclass()
            goto L2a
        L65:
            java.lang.String r0 = "username"
            java.lang.String r1 = "wxid"
            java.lang.String r6 = "field_username"
            java.lang.String r7 = "field_wxid"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r6, r7}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r0 = r0.iterator()
        L79:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc4
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r6 = r9.getClass()
        L89:
            if (r6 == 0) goto L79
            boolean r7 = r6.equals(r4)
            if (r7 != 0) goto L79
            java.lang.reflect.Field r7 = r6.getDeclaredField(r1)     // Catch: java.lang.Throwable -> La3
            r7.setAccessible(r3)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.Throwable -> La3
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto La5
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> La3
            goto La6
        La3:
            r7 = move-exception
            goto Lbc
        La5:
            r7 = r5
        La6:
            if (r7 == 0) goto Lb9
            boolean r8 = a.Be.P(r7)     // Catch: java.lang.Throwable -> La3
            if (r8 == 0) goto Laf
            goto Lb9
        Laf:
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> La3
            java.lang.String r7 = r7.toLowerCase(r8)     // Catch: java.lang.Throwable -> La3
            a.C0193i9.d(r7, r2)     // Catch: java.lang.Throwable -> La3
            return r7
        Lb9:
            a.Wf r7 = a.Wf.f330a     // Catch: java.lang.Throwable -> La3
            goto Lbf
        Lbc:
            a.C0465xd.a(r7)
        Lbf:
            java.lang.Class r6 = r6.getSuperclass()
            goto L89
        Lc4:
            return r5
    }

    public static java.lang.Object d(java.lang.Object r4, java.lang.String r5) {
            java.lang.Class r0 = r4.getClass()
        L4:
            if (r0 == 0) goto L32
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            a.G1 r1 = a.C0435w1.I(r1)
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.String r3 = r2.getName()
            boolean r3 = a.C0193i9.a(r3, r5)
            if (r3 == 0) goto Le
            r5 = 1
            r2.setAccessible(r5)
            java.lang.Object r4 = r2.get(r4)
            return r4
        L2d:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L32:
            r4 = 0
            return r4
    }

    public static final boolean f(a.C0174h8 r4, android.view.View r5, a.AbstractC0119e7 r6) {
            a.A2 r6 = r6.c
            java.util.List r6 = r6.g()
            java.util.Iterator r6 = r6.iterator()
        La:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r6.next()
            androidx.fragment.app.b r0 = (androidx.fragment.app.b) r0
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5f
            int r1 = r0.f905a
            r2 = 7
            if (r1 < r2) goto La
            boolean r1 = r0.i()
            if (r1 == 0) goto La
            boolean r1 = r0.j()
            if (r1 != 0) goto La
            android.view.View r1 = r0.G
            if (r1 == 0) goto La
            android.os.IBinder r1 = r1.getWindowToken()
            if (r1 == 0) goto La
            android.view.View r1 = r0.G
            int r1 = r1.getVisibility()
            if (r1 != 0) goto La
            android.view.View r1 = r0.G
            if (r1 == 0) goto L5f
            android.view.ViewParent r2 = r5.getParent()
        L51:
            if (r2 == 0) goto L5f
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L5a
            goto L6e
        L5a:
            android.view.ViewParent r2 = r2.getParent()
            goto L51
        L5f:
            a.e7 r0 = r0.c()
            java.lang.String r1 = "getChildFragmentManager(...)"
            a.C0193i9.d(r0, r1)
            boolean r0 = f(r4, r5, r0)
            if (r0 == 0) goto La
        L6e:
            r4 = 1
            return r4
        L70:
            r4 = 0
            return r4
    }

    public static boolean g(java.lang.Object r2) {
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "Label"
            r1 = 0
            boolean r0 = a.Be.I(r2, r0, r1)
            if (r0 != 0) goto L34
            java.lang.String r0 = "Sns"
            boolean r0 = a.Be.I(r2, r0, r1)
            if (r0 != 0) goto L34
            java.lang.String r0 = "com.tencent.mm.plugin.sns"
            boolean r0 = a.Ae.H(r2, r0, r1)
            if (r0 != 0) goto L34
            java.lang.String r0 = "com.tencent.mm.plugin.fts"
            boolean r0 = a.Ae.H(r2, r0, r1)
            if (r0 != 0) goto L34
            java.lang.String r0 = "com.tencent.mm.ui.contact"
            boolean r2 = a.Ae.H(r2, r0, r1)
            if (r2 == 0) goto L32
            goto L34
        L32:
            r2 = 1
            return r2
        L34:
            return r1
    }

    public static boolean h(java.lang.Object r7) {
            java.lang.Class r7 = r7.getClass()
        L4:
            r0 = 0
            if (r7 == 0) goto L55
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L55
            java.lang.String r1 = r7.getName()
            java.lang.String r2 = "androidx.recyclerview.widget.RecyclerView$Adapter"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L53
            java.lang.String r1 = r7.getName()
            java.lang.String r3 = "android.support.v7.widget.RecyclerView$Adapter"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L28
            goto L53
        L28:
            java.lang.Class[] r1 = r7.getInterfaces()
            java.lang.String r4 = "getInterfaces(...)"
            a.C0193i9.d(r1, r4)
            int r4 = r1.length
        L32:
            if (r0 >= r4) goto L4e
            r5 = r1[r0]
            java.lang.String r6 = r5.getName()
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L53
            java.lang.String r5 = r5.getName()
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L4b
            goto L53
        L4b:
            int r0 = r0 + 1
            goto L32
        L4e:
            java.lang.Class r7 = r7.getSuperclass()
            goto L4
        L53:
            r7 = 1
            return r7
        L55:
            return r0
    }

    public static java.util.ArrayList i(java.lang.Object r5) {
            java.lang.Class r0 = r5.getClass()
        L4:
            if (r0 == 0) goto L3a
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            a.G1 r1 = a.C0435w1.I(r1)
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "data"
            boolean r3 = a.C0193i9.a(r3, r4)
            if (r3 == 0) goto Le
            r0 = 1
            r2.setAccessible(r0)
            java.lang.Object r5 = r2.get(r5)
            boolean r0 = r5 instanceof java.util.ArrayList
            if (r0 == 0) goto L3a
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            return r5
        L35:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L3a:
            r5 = 0
            return r5
    }

    public static void l(java.lang.Object r9, java.util.ArrayList r10) {
            java.lang.Class r0 = r9.getClass()
        L4:
            r1 = 1
            if (r0 == 0) goto L61
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            a.G1 r2 = a.C0435w1.I(r2)
        Lf:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "data"
            boolean r4 = a.C0193i9.a(r4, r5)
            if (r4 == 0) goto Lf
            r3.setAccessible(r1)
            r3.set(r9, r10)
            int r9 = r10.size()
            java.lang.String r10 = r0.getSimpleName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "HideContactList: setAdapterData -> "
            r0.<init>(r2)
            r0.append(r9)
            java.lang.String r9 = " items (field in "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = ")"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)
            a.C0453x1.b(r9)
            return
        L5c:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L61:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Class r0 = r9.getClass()
        L6a:
            if (r0 == 0) goto Lab
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            java.lang.String r3 = "getDeclaredFields(...)"
            a.C0193i9.d(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
            r5 = 0
        L7d:
            if (r5 >= r4) goto La3
            r6 = r2[r5]
            java.lang.String r7 = r0.getSimpleName()
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "."
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r3.add(r6)
            int r5 = r5 + 1
            goto L7d
        La3:
            r10.addAll(r3)
            java.lang.Class r0 = r0.getSuperclass()
            goto L6a
        Lab:
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r0 = ", "
            r2 = 0
            r3 = 62
            java.lang.String r10 = a.C0383t3.p0(r10, r0, r2, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "HideContactList: setAdapterData: no 'data' field in adapter hierarchy ("
            r0.<init>(r2)
            r0.append(r9)
            java.lang.String r9 = "). Fields: "
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = r0.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)
            a.C0453x1.e(r9)
            return
    }

    public final java.lang.String b(java.lang.Object r10) {
            r9 = this;
            java.lang.reflect.Field r0 = r9.j
            r1 = 0
            if (r0 == 0) goto L20
            java.lang.Object r10 = r0.get(r10)     // Catch: java.lang.Throwable -> L12
            if (r10 != 0) goto Ld
            r10 = r1
            goto L17
        Ld:
            java.lang.String r10 = a(r10)     // Catch: java.lang.Throwable -> L12
            goto L17
        L12:
            r10 = move-exception
            a.wd$a r10 = a.C0465xd.a(r10)
        L17:
            boolean r0 = r10 instanceof a.C0447wd.a
            if (r0 == 0) goto L1c
            goto L1d
        L1c:
            r1 = r10
        L1d:
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L20:
            java.lang.Class r0 = r10.getClass()
        L24:
            if (r0 == 0) goto Lcd
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto Lcd
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            a.G1 r2 = a.C0435w1.I(r2)
        L36:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc7
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r4 = r3.getType()
            boolean r4 = r4.isPrimitive()
            if (r4 != 0) goto L36
            java.lang.Class r4 = r3.getType()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "java."
            r6 = 0
            boolean r4 = a.Ae.H(r4, r5, r6)
            if (r4 != 0) goto L36
            java.lang.Class r4 = r3.getType()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "android."
            boolean r4 = a.Ae.H(r4, r5, r6)
            if (r4 != 0) goto L36
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto L78
            goto L36
        L78:
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r5 = r3.get(r10)     // Catch: java.lang.Throwable -> Lbc
            if (r5 != 0) goto L83
            goto Lbe
        L83:
            java.lang.String r5 = a(r5)     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto Lbe
            r9.j = r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r6 = r3.getName()     // Catch: java.lang.Throwable -> Lbc
            java.lang.Class r3 = r3.getType()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> Lbc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            r7.<init>()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r8 = "HideContactList: extractWxidFromG cached field="
            r7.append(r8)     // Catch: java.lang.Throwable -> Lbc
            r7.append(r6)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r6 = " type="
            r7.append(r6)     // Catch: java.lang.Throwable -> Lbc
            r7.append(r3)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: java.lang.Throwable -> Lbc
            a.C0453x1.b(r3)     // Catch: java.lang.Throwable -> Lbc
            return r5
        Lbc:
            r3 = move-exception
            goto Lc2
        Lbe:
            a.Wf r3 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lbc
            goto L36
        Lc2:
            a.C0465xd.a(r3)
            goto L36
        Lc7:
            java.lang.Class r0 = r0.getSuperclass()
            goto L24
        Lcd:
            return r1
    }

    public final java.util.ArrayList c(java.util.List r6) {
            r5 = this;
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.ArrayList r0 = a.K3.a.f()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a.C0312p3.g0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
            java.lang.String r2 = r2.getMaskId()
            r1.add(r2)
            goto L18
        L2c:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L3a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r6.next()
            if (r2 == 0) goto L3a
            java.lang.String r3 = r5.b(r2)
            if (r3 == 0) goto L65
            boolean r4 = r0.contains(r3)
            if (r4 == 0) goto L65
            java.lang.String r2 = "HideContactList: hide contact wxid="
            java.lang.String r2 = r2.concat(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            a.C0453x1.b(r2)
            goto L3a
        L65:
            r1.add(r2)
            goto L3a
        L69:
            return r1
    }

    public final boolean e(java.lang.Object r9) {
            r8 = this;
            java.util.ArrayList r0 = i(r9)
            r1 = 1
            if (r0 != 0) goto L8
            goto Le
        L8:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Lf
        Le:
            return r1
        Lf:
            java.lang.Object r2 = r8.f495a
            r3 = 0
            if (r2 == 0) goto L98
            a.a5$c r4 = r8.b
            if (r4 == 0) goto L1b
            java.lang.String r4 = r4.f387a
            goto L1d
        L1b:
            java.lang.String r4 = ""
        L1d:
            java.lang.Object r2 = d(r2, r4)
            boolean r4 = r2 instanceof java.util.List
            r5 = 0
            if (r4 == 0) goto L29
            java.util.List r2 = (java.util.List) r2
            goto L2a
        L29:
            r2 = r5
        L2a:
            if (r2 == 0) goto L98
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L98
            java.util.Iterator r2 = r2.iterator()
        L36:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r2.next()
            if (r4 == 0) goto L36
            boolean r6 = r4 instanceof java.lang.String
            if (r6 != 0) goto L36
            goto L48
        L47:
            r4 = r5
        L48:
            if (r4 == 0) goto L4f
            java.lang.Class r2 = r4.getClass()
            goto L50
        L4f:
            r2 = r5
        L50:
            java.util.Iterator r4 = r0.iterator()
        L54:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L65
            java.lang.Object r6 = r4.next()
            if (r6 == 0) goto L54
            boolean r7 = r6 instanceof java.lang.String
            if (r7 != 0) goto L54
            goto L66
        L65:
            r6 = r5
        L66:
            if (r6 == 0) goto L6c
            java.lang.Class r5 = r6.getClass()
        L6c:
            if (r2 == 0) goto L98
            if (r5 == 0) goto L98
            boolean r4 = r2.equals(r5)
            if (r4 != 0) goto L98
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "HideContactList: isAdapterDataContactCompatible CLASS MISMATCH: ll="
            r9.<init>(r0)
            r9.append(r2)
            java.lang.String r0 = " adapter="
            r9.append(r0)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)
            a.C0453x1.e(r9)
            return r3
        L98:
            java.lang.reflect.Field r2 = r8.j
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = "iterator(...)"
            a.C0193i9.d(r0, r4)     // Catch: java.lang.Throwable -> Lc3
            r4 = r3
            r5 = r4
        La5:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc3
            if (r6 == 0) goto Lc5
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> Lc3
            if (r6 == 0) goto La5
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lc3
            if (r7 != 0) goto La5
            int r4 = r4 + 1
            r7 = 5
            if (r4 > r7) goto Lc5
            java.lang.String r6 = r8.b(r6)     // Catch: java.lang.Throwable -> Lc3
            if (r6 == 0) goto La5
            int r5 = r5 + 1
            goto La5
        Lc3:
            r9 = move-exception
            goto Lfe
        Lc5:
            if (r4 != 0) goto Lca
            r8.j = r2
            return r1
        Lca:
            if (r5 < r1) goto Lcd
            r3 = r1
        Lcd:
            if (r3 != 0) goto Lfb
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> Lc3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r0.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = "HideContactList: isAdapterDataContactCompatible FAILED: checked="
            r0.append(r5)     // Catch: java.lang.Throwable -> Lc3
            r0.append(r4)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r4 = " wxidFound=0 adapter="
            r0.append(r4)     // Catch: java.lang.Throwable -> Lc3
            r0.append(r9)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)     // Catch: java.lang.Throwable -> Lc3
            a.C0453x1.e(r9)     // Catch: java.lang.Throwable -> Lc3
        Lfb:
            r8.j = r2
            return r3
        Lfe:
            r8.j = r2
            throw r9
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r14) {
            r13 = this;
            r0 = 1
            r1 = 2
            java.lang.String r2 = "session"
            a.C0193i9.e(r14, r2)
            java.lang.String r2 = "=== HideContactList handleHook START ==="
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            a.C0453x1.b(r2)
            r13.i = r14
            a.C0174h8.l = r13
            a.A3 r2 = new a.A3
            r2.<init>(r1, r13)
            a.C0174h8.k = r2
            java.util.concurrent.CopyOnWriteArrayList<a.ca$d> r2 = a.C0086ca.f421a
            a.j2 r2 = r13.g
            java.util.concurrent.CopyOnWriteArrayList<a.ca$d> r3 = a.C0086ca.f421a
            r3.remove(r2)
            a.j2 r2 = r13.g
            a.C0086ca.b(r2)
            r13.k()
            java.lang.ClassLoader r2 = r14.f136a
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.lang.String r4 = "com.tencent.mm.ui.contact.address.AddressLiveList"
            r3.add(r4)
            a.a5$b r4 = a.C0043a5.a()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r4.f386a
            r3.addAll(r4)
        L47:
            java.util.Iterator r4 = r3.iterator()
            java.lang.String r5 = "iterator(...)"
            a.C0193i9.d(r4, r5)
        L50:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto Ldd
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class r7 = a.A1.b(r2, r5)
            if (r7 != 0) goto L64
            goto L50
        L64:
            a.g2 r8 = new a.g2
            r9 = 19
            r8.<init>(r9)
            java.lang.reflect.Method[] r8 = a.A1.f(r7, r8)
            int r9 = r8.length
            r10 = 0
        L71:
            if (r10 >= r9) goto L87
            r11 = r8[r10]
            java.lang.Class r12 = r11.getDeclaringClass()
            java.lang.String r12 = r12.getName()
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L85
            r6 = r11
            goto L87
        L85:
            int r10 = r10 + r0
            goto L71
        L87:
            if (r6 != 0) goto L9a
            a.g2 r6 = new a.g2
            r8 = 20
            r6.<init>(r8)
            java.lang.reflect.Method[] r6 = a.A1.f(r7, r6)
            java.lang.Object r6 = a.N1.d0(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
        L9a:
            if (r6 != 0) goto Lb0
            java.lang.String r6 = "HideContactList: "
            java.lang.String r7 = " has no e(List):List"
            java.lang.String r5 = a.C0487z.g(r6, r5, r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            a.C0453x1.e(r5)
            goto L50
        Lb0:
            r13.h = r6
            io.github.libxposed.api.XposedInterface$HookBuilder r2 = r14.f(r6)
            a.m2 r3 = new a.m2
            r3.<init>(r1, r13)
            r2.intercept(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "HideContactList: hooked "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = ".e(List) (method cached for refresh)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            a.C0453x1.b(r2)
            goto Lf6
        Ldd:
            r2 = 63
            java.lang.String r2 = a.C0383t3.p0(r3, r6, r6, r2)
            java.lang.String r3 = "HideContactList: AddressLiveList.e NOT hooked (candidates="
            java.lang.String r4 = ")"
            java.lang.String r2 = a.C0487z.g(r3, r2, r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            a.C0453x1.e(r2)
        Lf6:
            java.lang.ClassLoader r2 = r14.f136a
            if (r2 != 0) goto L108
            java.lang.String r14 = "HideContactList: hookRecyclerViewSetAdapter: classLoader null"
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r0)
            a.C0453x1.e(r14)
            goto L167
        L108:
            java.lang.String r3 = "com.tencent.mm.view.recyclerview.WxRecyclerView"
            java.lang.Class r3 = a.A1.b(r2, r3)
            if (r3 != 0) goto L11e
            java.lang.String r14 = "HideContactList: com.tencent.mm.view.recyclerview.WxRecyclerView not found"
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r0)
            a.C0453x1.e(r14)
            goto L167
        L11e:
            a.g2 r4 = new a.g2
            r5 = 18
            r4.<init>(r5)
            java.lang.reflect.Method[] r3 = a.A1.f(r3, r4)
            java.lang.Object r3 = a.N1.d0(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto L13f
            java.lang.String r14 = "HideContactList: com.tencent.mm.view.recyclerview.WxRecyclerView.setAdapter not found"
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r0)
            a.C0453x1.e(r14)
            goto L167
        L13f:
            io.github.libxposed.api.XposedInterface$HookBuilder r14 = r14.f(r3)     // Catch: java.lang.Throwable -> L159
            a.o4 r3 = new a.o4     // Catch: java.lang.Throwable -> L159
            r3.<init>(r2, r1, r13)     // Catch: java.lang.Throwable -> L159
            r14.intercept(r3)     // Catch: java.lang.Throwable -> L159
            java.lang.String r14 = "HideContactList: hooked com.tencent.mm.view.recyclerview.WxRecyclerView.setAdapter (capture contact adapter)"
            java.lang.Object[] r14 = new java.lang.Object[]{r14}     // Catch: java.lang.Throwable -> L159
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r0)     // Catch: java.lang.Throwable -> L159
            a.C0453x1.b(r14)     // Catch: java.lang.Throwable -> L159
            goto L167
        L159:
            r14 = move-exception
            java.lang.String r2 = "HideContactList: hook setAdapter failed"
            java.lang.Object[] r14 = new java.lang.Object[]{r2, r14}
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r1)
            a.C0453x1.e(r14)
        L167:
            java.lang.String r14 = "=== HideContactList handleHook DONE ==="
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r0)
            a.C0453x1.b(r14)
            return
    }

    public final void j() {
            r13 = this;
            java.lang.Object r0 = r13.f495a
            r1 = 1
            if (r0 != 0) goto L13
            java.lang.String r0 = "HideContactList: refreshContactList skipped, no liveList instance yet"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.e(r0)
            return
        L13:
            a.a5$c r2 = r13.b
            if (r2 != 0) goto L1a
            r13.k()
        L1a:
            java.lang.Object r2 = r13.d
            r3 = 0
            if (r2 != 0) goto L1b9
            java.lang.Object r2 = r13.e
            r4 = 2
            r5 = 0
            if (r2 == 0) goto La6
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.reflect.Method[] r6 = r6.getMethods()     // Catch: java.lang.Throwable -> L51
            java.lang.String r7 = "getMethods(...)"
            a.C0193i9.d(r6, r7)     // Catch: java.lang.Throwable -> L51
            int r7 = r6.length     // Catch: java.lang.Throwable -> L51
            r8 = r5
        L34:
            if (r8 >= r7) goto L56
            r9 = r6[r8]     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = r9.getName()     // Catch: java.lang.Throwable -> L51
            java.lang.String r11 = "getAdapter"
            boolean r10 = a.C0193i9.a(r10, r11)     // Catch: java.lang.Throwable -> L51
            if (r10 == 0) goto L53
            java.lang.Class[] r10 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L51
            java.lang.String r11 = "getParameterTypes(...)"
            a.C0193i9.d(r10, r11)     // Catch: java.lang.Throwable -> L51
            int r10 = r10.length     // Catch: java.lang.Throwable -> L51
            if (r10 != 0) goto L53
            goto L57
        L51:
            r2 = move-exception
            goto L8f
        L53:
            int r8 = r8 + 1
            goto L34
        L56:
            r9 = r3
        L57:
            if (r9 == 0) goto L5c
            r9.setAccessible(r1)     // Catch: java.lang.Throwable -> L51
        L5c:
            if (r9 == 0) goto L63
            java.lang.Object r2 = r9.invoke(r2, r3)     // Catch: java.lang.Throwable -> L51
            goto L64
        L63:
            r2 = r3
        L64:
            if (r2 == 0) goto L8c
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r7.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = "HideContactList: findContactAdapter via WxRecyclerView.getAdapter -> "
            r7.append(r8)     // Catch: java.lang.Throwable -> L51
            r7.append(r6)     // Catch: java.lang.Throwable -> L51
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)     // Catch: java.lang.Throwable -> L51
            a.C0453x1.b(r6)     // Catch: java.lang.Throwable -> L51
            goto L1a9
        L8c:
            a.Wf r2 = a.Wf.f330a     // Catch: java.lang.Throwable -> L51
            goto L93
        L8f:
            a.wd$a r2 = a.C0465xd.a(r2)
        L93:
            java.lang.Throwable r2 = a.C0447wd.a(r2)
            if (r2 == 0) goto La6
            java.lang.String r6 = "HideContactList: findContactAdapter via getAdapter failed"
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            a.C0453x1.e(r2)
        La6:
            java.lang.Object r2 = r13.d
            if (r2 == 0) goto Lc5
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "HideContactList: findContactAdapter via currentContactAdapter -> "
            java.lang.String r4 = r5.concat(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            a.C0453x1.b(r4)
            goto L1a9
        Lc5:
            java.lang.Object r2 = r13.f495a
            if (r2 == 0) goto L167
            java.lang.Class r6 = r2.getClass()
        Lcd:
            if (r6 == 0) goto L167
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L167
            java.lang.reflect.Field[] r7 = r6.getDeclaredFields()
            a.G1 r7 = a.C0435w1.I(r7)
        Ldf:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L161
            java.lang.Object r8 = r7.next()
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            java.lang.String r9 = r8.getName()
            a.a5$c r10 = r13.b
            if (r10 == 0) goto Lf6
            java.lang.String r10 = r10.c
            goto Lf7
        Lf6:
            r10 = r3
        Lf7:
            boolean r9 = a.C0193i9.a(r9, r10)
            if (r9 == 0) goto Ldf
            r8.setAccessible(r1)     // Catch: java.lang.Throwable -> L143
            java.lang.Object r8 = r8.get(r2)     // Catch: java.lang.Throwable -> L143
            if (r8 == 0) goto L145
            boolean r9 = h(r8)     // Catch: java.lang.Throwable -> L143
            if (r9 == 0) goto L145
            a.a5$c r9 = r13.b     // Catch: java.lang.Throwable -> L143
            if (r9 == 0) goto L113
            java.lang.String r9 = r9.c     // Catch: java.lang.Throwable -> L143
            goto L114
        L113:
            r9 = r3
        L114:
            java.lang.Class r10 = r8.getClass()     // Catch: java.lang.Throwable -> L143
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> L143
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L143
            r11.<init>()     // Catch: java.lang.Throwable -> L143
            java.lang.String r12 = "HideContactList: findContactAdapter via MvvmList.adapterField("
            r11.append(r12)     // Catch: java.lang.Throwable -> L143
            r11.append(r9)     // Catch: java.lang.Throwable -> L143
            java.lang.String r9 = ") -> "
            r11.append(r9)     // Catch: java.lang.Throwable -> L143
            r11.append(r10)     // Catch: java.lang.Throwable -> L143
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L143
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L143
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)     // Catch: java.lang.Throwable -> L143
            a.C0453x1.b(r9)     // Catch: java.lang.Throwable -> L143
            r2 = r8
            goto L1a9
        L143:
            r8 = move-exception
            goto L148
        L145:
            a.Wf r8 = a.Wf.f330a     // Catch: java.lang.Throwable -> L143
            goto L14c
        L148:
            a.wd$a r8 = a.C0465xd.a(r8)
        L14c:
            java.lang.Throwable r8 = a.C0447wd.a(r8)
            if (r8 == 0) goto Ldf
            java.lang.String r9 = "HideContactList: findContactAdapter via adapterField failed"
            java.lang.Object[] r8 = new java.lang.Object[]{r9, r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r4)
            a.C0453x1.e(r8)
            goto Ldf
        L161:
            java.lang.Class r6 = r6.getSuperclass()
            goto Lcd
        L167:
            java.lang.Object r2 = r13.e
            if (r2 == 0) goto L16d
            r2 = r1
            goto L16e
        L16d:
            r2 = r5
        L16e:
            java.lang.Object r4 = r13.d
            if (r4 == 0) goto L174
            r4 = r1
            goto L175
        L174:
            r4 = r5
        L175:
            java.lang.Object r6 = r13.f495a
            if (r6 == 0) goto L17a
            r5 = r1
        L17a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "HideContactList: findContactAdapter: no adapter (rv="
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = ", cur="
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = ", ll="
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            a.C0453x1.e(r2)
            r2 = r3
        L1a9:
            if (r2 != 0) goto L1b9
            java.lang.String r0 = "HideContactList: refreshContactList skipped, no visible adapter yet"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.e(r0)
            return
        L1b9:
            boolean r4 = g(r2)
            java.lang.String r5 = "HideContactList: refreshContactList BLOCKED, adapter="
            if (r4 != 0) goto L1df
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = " is not contact adapter"
            java.lang.String r0 = a.C0487z.g(r5, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.e(r0)
            r13.d = r3
            r13.e = r3
            return
        L1df:
            boolean r4 = r13.e(r2)
            if (r4 != 0) goto L203
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = " data not contact-compatible"
            java.lang.String r0 = a.C0487z.g(r5, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.e(r0)
            r13.d = r3
            r13.e = r3
            return
        L203:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r1.<init>(r3)
            a.h0 r3 = new a.h0
            r4 = 3
            r3.<init>(r13, r2, r0, r4)
            r1.post(r3)
            return
    }

    public final void k() {
            r9 = this;
            java.lang.String r0 = "HideContactList: F004_contact_list_fields resolve INCOMPLETE: path="
            java.lang.String r1 = "HideContactList: F004_contact_list_fields resolved via="
            a.a5$c r2 = r9.b
            if (r2 == 0) goto La
            goto Lfd
        La:
            a.J8 r2 = r9.i
            r3 = 1
            if (r2 == 0) goto Lfe
            java.lang.ClassLoader r2 = r2.f136a
            if (r2 != 0) goto L15
            goto Lfe
        L15:
            a.fd r4 = new a.fd     // Catch: java.lang.Throwable -> Lb9
            int r5 = a.B1.f21a     // Catch: java.lang.Throwable -> Lb9
            r6 = -1
            if (r5 != r6) goto L3d
            android.content.Context r5 = a.C0435w1.p     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> Lb9
            a.C0193i9.b(r5)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> Lb9
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> Lb9
            java.lang.String r7 = "com.tencent.mm"
            r8 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r8)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> Lb9
            int r6 = r5.versionCode     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> Lb9
            goto L3b
        L2f:
            r5 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r3)     // Catch: java.lang.Throwable -> Lb9
            a.C0453x1.a(r5)     // Catch: java.lang.Throwable -> Lb9
        L3b:
            a.B1.f21a = r6     // Catch: java.lang.Throwable -> Lb9
        L3d:
            int r5 = a.B1.f21a     // Catch: java.lang.Throwable -> Lb9
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> Lb9
            a.hd r2 = a.C0179hd.f499a     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = "F004_contact_list_fields"
            r2.getClass()     // Catch: java.lang.Throwable -> Lb9
            a.gd r2 = a.C0179hd.a(r5, r4)     // Catch: java.lang.Throwable -> Lb9
            a.a5$c r4 = new a.a5$c     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r5 = "displayListField"
            java.lang.String r5 = r2.b(r5)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r6 = ""
            if (r5 != 0) goto L5a
            r5 = r6
        L5a:
            java.lang.String r7 = "snapshotField"
            java.lang.String r7 = r2.b(r7)     // Catch: java.lang.Throwable -> Lb9
            if (r7 != 0) goto L63
            r7 = r6
        L63:
            java.lang.String r8 = "adapterField"
            java.lang.String r8 = r2.b(r8)     // Catch: java.lang.Throwable -> Lb9
            if (r8 != 0) goto L6c
            goto L6d
        L6c:
            r6 = r8
        L6d:
            r4.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> Lb9
            boolean r8 = a.Be.P(r5)     // Catch: java.lang.Throwable -> Lb9
            if (r8 != 0) goto Lbb
            boolean r8 = a.Be.P(r7)     // Catch: java.lang.Throwable -> Lb9
            if (r8 != 0) goto Lbb
            boolean r8 = a.Be.P(r6)     // Catch: java.lang.Throwable -> Lb9
            if (r8 == 0) goto L83
            goto Lbb
        L83:
            r9.b = r4     // Catch: java.lang.Throwable -> Lb9
            a.cd r0 = r2.d     // Catch: java.lang.Throwable -> Lb9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lb9
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = " display="
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb9
            r2.append(r5)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = " snapshot="
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb9
            r2.append(r7)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = " adapter="
            r2.append(r0)     // Catch: java.lang.Throwable -> Lb9
            r2.append(r6)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> Lb9
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> Lb9
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lb9
            goto Le9
        Lb9:
            r0 = move-exception
            goto Le5
        Lbb:
            a.cd r1 = r2.d     // Catch: java.lang.Throwable -> Lb9
            a.j6 r2 = r2.c     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto Lc4
            java.lang.String r2 = r2.c     // Catch: java.lang.Throwable -> Lb9
            goto Lc5
        Lc4:
            r2 = 0
        Lc5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lb9
            r4.append(r1)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = " reason="
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb9
            r4.append(r2)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> Lb9
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> Lb9
            goto Lfd
        Le5:
            a.wd$a r0 = a.C0465xd.a(r0)
        Le9:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto Lfd
            java.lang.String r1 = "HideContactList: F004_contact_list_fields resolve failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.e(r0)
        Lfd:
            return
        Lfe:
            java.lang.String r0 = "HideContactList: resolveContactListFields skipped, no classLoader"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.e(r0)
            return
    }
}
