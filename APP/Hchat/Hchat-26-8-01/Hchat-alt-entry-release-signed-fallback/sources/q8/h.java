package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f10698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.ClassLoader f10699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e8.c f10700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ib.b f10701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.io.File f10702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f10703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public de.robv.android.xposed.XC_MethodHook.Unhook f10704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.Class f10705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile java.lang.Class f10706i;

    public h(android.content.Context r2, java.lang.ClassLoader r3, e8.c r4, ib.b r5) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f10703f = r0
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 == 0) goto L15
            android.content.Context r0 = r2.getApplicationContext()
            goto L16
        L15:
            r0 = r2
        L16:
            r1.f10698a = r0
            r1.f10699b = r3
            r1.f10700c = r4
            r1.f10701d = r5
            java.io.File r3 = new java.io.File
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r4 = "Hchat_proxy_classes"
            r3.<init>(r2, r4)
            r1.f10702e = r3
            r3.mkdirs()
            return
    }

    public static void a(q8.h r1, java.lang.Object r2) {
            android.widget.BaseAdapter r0 = m(r2)     // Catch: java.lang.Throwable -> L8
            r1.h(r2, r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "[Hchat:SettingsInjector] [PlusMenu] 显示时添加入口失败: "
            r2.<init>(r0)
            bc.e.s(r1, r2, r1)
            return
    }

    public static void b(android.view.View r4, int r5) {
            r0 = -1212373072(0xffffffffb7bca7b0, float:-2.2489432E-5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = -1
            if (r5 != r0) goto L3e
            android.widget.ImageView r5 = n(r4)
            if (r5 != 0) goto L10
            goto L44
        L10:
            android.content.Context r4 = r4.getContext()
            r0 = 17301552(0x1080030, float:2.497939E-38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r0)
            if (r4 != 0) goto L1e
            goto L44
        L1e:
            android.graphics.drawable.Drawable r4 = r4.mutate()
            r4.setTint(r3)
            r5.setVisibility(r2)
            r5.setAlpha(r1)
            r5.setImageDrawable(r4)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r5.setImageTintMode(r4)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r3)
            r5.setImageTintList(r0)
            r5.setColorFilter(r3, r4)
            return
        L3e:
            android.widget.ImageView r4 = n(r4)
            if (r4 != 0) goto L45
        L44:
            return
        L45:
            r4.setVisibility(r2)
            r5 = 0
            r4.setImageTintList(r5)
            r4.setColorFilter(r5)
            r4.setAlpha(r1)
            q8.a r5 = new q8.a
            r0 = 1
            r5.<init>(r3, r0)
            r4.setImageDrawable(r5)
            return
    }

    public static android.content.Context c(q8.h r4, java.lang.Object r5) {
            if (r5 != 0) goto L3
            goto L43
        L3:
            java.lang.Class r4 = r5.getClass()
        L7:
            if (r4 == 0) goto L43
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r4 == r0) goto L43
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r4)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r1)
            if (r2 != 0) goto L15
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class r3 = r1.getType()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L15
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r5)
            boolean r2 = r1 instanceof android.content.Context
            if (r2 == 0) goto L15
            android.content.Context r1 = (android.content.Context) r1
            return r1
        L3e:
            java.lang.Class r4 = r4.getSuperclass()
            goto L7
        L43:
            r4 = 0
            return r4
    }

    public static java.lang.Object d(q8.h r5, java.lang.Object r6) {
            e8.c r5 = r5.f10700c
            if (r6 == 0) goto L45
            java.lang.Class r0 = r5.f2381w
            if (r0 != 0) goto L9
            goto L45
        L9:
            java.lang.Class r0 = r6.getClass()
        Ld:
            if (r0 == 0) goto L45
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L45
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r3 != 0) goto L1b
            java.lang.Class r3 = r5.f2381w
            java.lang.Class r4 = r2.getType()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L1b
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r6)
            if (r2 == 0) goto L1b
            return r2
        L40:
            java.lang.Class r0 = r0.getSuperclass()
            goto Ld
        L45:
            r5 = 0
            return r5
    }

    public static java.lang.Object e(q8.h r5, java.util.Map r6, java.lang.Class r7, java.lang.Class[] r8) {
            if (r7 != 0) goto L4
            goto L97
        L4:
            boolean r5 = r6.containsKey(r7)
            if (r5 == 0) goto Lb
            return r7
        Lb:
            java.lang.String r5 = r7.getName()
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            if (r1 != r7) goto L24
            return r1
        L24:
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 == 0) goto L36
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L36
            return r1
        L36:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L17
            boolean r2 = r5.equals(r1)
            if (r2 == 0) goto L17
            return r1
        L41:
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L97
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            boolean r0 = r7 instanceof java.lang.Iterable
            if (r0 == 0) goto L49
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L63:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r7.next()
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L72
            goto L63
        L72:
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            int r2 = r8.length
            r3 = 0
        L7b:
            if (r3 >= r2) goto L63
            r4 = r8[r3]
            if (r4 != 0) goto L82
            goto L8f
        L82:
            if (r0 == r4) goto L92
            java.lang.String r4 = r4.getName()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L8f
            goto L92
        L8f:
            int r3 = r3 + 1
            goto L7b
        L92:
            java.lang.Object r5 = r6.getKey()
            return r5
        L97:
            r5 = 0
            return r5
    }

    public static int f(q8.h r1, java.lang.Object r2, int r3) {
            android.util.SparseArray r1 = p(r2)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L9
            return r2
        L9:
            if (r3 < 0) goto L1c
            int r0 = r1.size()
            if (r3 >= r0) goto L1c
            java.lang.Object r0 = r1.valueAt(r3)
            int r0 = v(r0)
            if (r0 == r2) goto L1c
            return r0
        L1c:
            java.lang.Object r1 = r1.get(r3)
            int r1 = v(r1)
            return r1
    }

    public static java.lang.Class g(q8.h r4, java.lang.Object r5, int r6, java.lang.Class r7) {
            if (r5 != 0) goto L3
            goto L36
        L3:
            java.lang.Class r4 = r5.getClass()
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r4)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L10:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class r2 = r1.getType()     // Catch: java.lang.Throwable -> L10
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            if (r2 == r3) goto L25
            goto L10
        L25:
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r5)     // Catch: java.lang.Throwable -> L10
            if (r0 != r6) goto L33
            boolean r2 = r1 instanceof java.lang.Class     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L33
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L10
            r7 = r1
            goto L36
        L33:
            int r0 = r0 + 1
            goto L10
        L36:
            return r7
    }

    public static boolean i(android.util.SparseArray r4, java.lang.Class r5, java.lang.Object r6, int r7, java.lang.String r8) {
            java.lang.Class r6 = r6.getClass()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r8, r3, r2, r2}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r6, r0)
            if (r0 == 0) goto L1a
            goto L26
        L1a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8, r3, r2}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r6, r7)
        L26:
            if (r0 != 0) goto L29
            goto L33
        L29:
            java.lang.Object[] r6 = new java.lang.Object[]{r0}
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r5, r6)
            if (r5 != 0) goto L34
        L33:
            return r1
        L34:
            int r6 = r4.size()
            int r6 = java.lang.Math.max(r1, r6)
        L3c:
            java.lang.Object r7 = r4.get(r6)
            if (r7 == 0) goto L45
            int r6 = r6 + 1
            goto L3c
        L45:
            r4.put(r6, r5)
            r4 = 1
            return r4
    }

    public static boolean j(android.util.SparseArray r3, int r4, java.lang.String r5) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.size()
            if (r1 >= r2) goto L17
            java.lang.Object r2 = r3.valueAt(r1)
            boolean r2 = u(r2, r5, r4)
            if (r2 == 0) goto L14
            r3 = 1
            return r3
        L14:
            int r1 = r1 + 1
            goto L2
        L17:
            return r0
    }

    public static java.lang.reflect.Method l(java.lang.Class r5) {
        L0:
            if (r5 == 0) goto L61
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r5 == r0) goto L61
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            java.lang.String r3 = "getView"
            java.lang.String r4 = r1.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Le
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r1)
            if (r3 != 0) goto Le
            int r3 = r2.length
            r4 = 3
            if (r3 != r4) goto Le
            r3 = 0
            r3 = r2[r3]
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r3 != r4) goto Le
            r3 = 1
            r3 = r2[r3]
            java.lang.Class<android.view.View> r4 = android.view.View.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto Le
            r3 = 2
            r2 = r2[r3]
            java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto Le
            java.lang.Class r2 = r1.getReturnType()
            boolean r2 = r4.isAssignableFrom(r2)
            if (r2 == 0) goto Le
            return r1
        L5c:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L61:
            r5 = 0
            return r5
    }

    public static android.widget.BaseAdapter m(java.lang.Object r5) {
            if (r5 != 0) goto L3
            goto L43
        L3:
            java.lang.Class r0 = r5.getClass()
        L7:
            if (r0 == 0) goto L43
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L43
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r3 != 0) goto L15
            java.lang.Class<android.widget.BaseAdapter> r3 = android.widget.BaseAdapter.class
            java.lang.Class r4 = r2.getType()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L15
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r5)
            boolean r3 = r2 instanceof android.widget.BaseAdapter
            if (r3 == 0) goto L15
            android.widget.BaseAdapter r2 = (android.widget.BaseAdapter) r2
            return r2
        L3e:
            java.lang.Class r0 = r0.getSuperclass()
            goto L7
        L43:
            r5 = 0
            return r5
    }

    public static android.widget.ImageView n(android.view.View r2) {
            boolean r0 = r2 instanceof android.widget.ImageView
            if (r0 == 0) goto L7
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            return r2
        L7:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto Lc
            goto L23
        Lc:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        Lf:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L23
            android.view.View r1 = r2.getChildAt(r0)
            android.widget.ImageView r1 = n(r1)
            if (r1 == 0) goto L20
            return r1
        L20:
            int r0 = r0 + 1
            goto Lf
        L23:
            r2 = 0
            return r2
    }

    public static java.lang.Object o(java.lang.Object r5) {
            if (r5 != 0) goto L3
            goto L50
        L3:
            java.lang.Class r0 = r5.getClass()
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r1)
            if (r2 == 0) goto L22
            goto Lf
        L22:
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r5)
            if (r1 != 0) goto L29
            goto Lf
        L29:
            java.lang.Class r2 = r1.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r4 != 0) goto L35
            java.lang.Class r3 = r3.getType()
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r3 != r4) goto L35
            return r1
        L50:
            r5 = 0
            return r5
    }

    public static android.util.SparseArray p(java.lang.Object r5) {
            if (r5 != 0) goto L3
            goto L43
        L3:
            java.lang.Class r0 = r5.getClass()
        L7:
            if (r0 == 0) goto L43
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L43
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r3 != 0) goto L15
            java.lang.Class<android.util.SparseArray> r3 = android.util.SparseArray.class
            java.lang.Class r4 = r2.getType()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L15
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r5)
            boolean r3 = r2 instanceof android.util.SparseArray
            if (r3 == 0) goto L15
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            return r2
        L3e:
            java.lang.Class r0 = r0.getSuperclass()
            goto L7
        L43:
            r5 = 0
            return r5
    }

    public static boolean u(java.lang.Object r9, java.lang.String r10, int r11) {
            java.lang.Object r0 = o(r9)
            r1 = 0
            if (r0 != 0) goto L9
            goto L10f
        L9:
            r2 = -1212373075(0xffffffffb7bca7ad, float:-2.2489427E-5)
            r3 = 1
            if (r11 != r2) goto L11
            r2 = r3
            goto L12
        L11:
            r2 = r1
        L12:
            java.lang.Class r4 = r0.getClass()
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r4)
            java.util.Iterator r4 = r4.iterator()
            r5 = r1
            r6 = r5
        L20:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L60
            java.lang.Object r7 = r4.next()
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            boolean r8 = h.Hchat.utils.KavaReflector.isStatic(r7)
            if (r8 == 0) goto L33
            goto L20
        L33:
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r7, r0)
            boolean r8 = r7 instanceof java.lang.Integer
            if (r8 == 0) goto L46
            r8 = r7
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r11) goto L46
            r5 = r3
            goto L20
        L46:
            boolean r8 = r7 instanceof java.lang.CharSequence
            if (r8 == 0) goto L55
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = r10.contentEquals(r8)
            if (r8 == 0) goto L55
        L53:
            r6 = r3
            goto L20
        L55:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L20
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L20
            goto L53
        L60:
            if (r5 != 0) goto L110
            if (r2 == 0) goto L68
            if (r6 == 0) goto L68
            goto L110
        L68:
            java.lang.Class r4 = r9.getClass()
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r4)
            java.util.Iterator r4 = r4.iterator()
        L74:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L10f
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            boolean r6 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r6 == 0) goto L87
            goto L74
        L87:
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r9)
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L9a
            r6 = r5
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != r11) goto L9a
            goto L110
        L9a:
            if (r2 == 0) goto Laa
            boolean r6 = r5 instanceof java.lang.CharSequence
            if (r6 == 0) goto Laa
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = r10.contentEquals(r6)
            if (r6 == 0) goto Laa
            goto L110
        Laa:
            if (r2 == 0) goto Lb7
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto Lb7
            boolean r6 = r10.equals(r5)
            if (r6 == 0) goto Lb7
            goto L110
        Lb7:
            if (r5 == 0) goto L74
            if (r5 == r0) goto L74
            java.lang.Class r6 = r5.getClass()
            boolean r7 = r6.isPrimitive()
            if (r7 != 0) goto L74
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "java."
            boolean r6 = r6.startsWith(r7)
            if (r6 != 0) goto L74
            if (r2 == 0) goto L74
            java.lang.Class r6 = r5.getClass()
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredFields(r6)
            java.util.Iterator r6 = r6.iterator()
        Ldf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L74
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            boolean r8 = h.Hchat.utils.KavaReflector.isStatic(r7)
            if (r8 == 0) goto Lf2
            goto Ldf
        Lf2:
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r7, r5)
            boolean r8 = r7 instanceof java.lang.CharSequence
            if (r8 == 0) goto L104
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = r10.contentEquals(r8)
            if (r8 == 0) goto L104
            goto L110
        L104:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto Ldf
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto Ldf
            goto L110
        L10f:
            return r1
        L110:
            return r3
    }

    public static int v(java.lang.Object r2) {
            java.lang.String r0 = "Hchat"
            r1 = -1212373075(0xffffffffb7bca7ad, float:-2.2489427E-5)
            boolean r0 = u(r2, r0, r1)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.String r0 = "全部已读"
            r1 = -1212373073(0xffffffffb7bca7af, float:-2.248943E-5)
            boolean r0 = u(r2, r0, r1)
            if (r0 == 0) goto L18
            return r1
        L18:
            java.lang.String r0 = "快捷终止"
            r1 = -1212373072(0xffffffffb7bca7b0, float:-2.2489432E-5)
            boolean r0 = u(r2, r0, r1)
            if (r0 == 0) goto L24
            return r1
        L24:
            java.lang.String r0 = "插件 Agent"
            r1 = -1212373071(0xffffffffb7bca7b1, float:-2.2489434E-5)
            boolean r2 = u(r2, r0, r1)
            if (r2 == 0) goto L30
            return r1
        L30:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            return r2
    }

    public static boolean w(android.util.SparseArray r4, int r5, java.lang.String r6) {
            int r0 = r4.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L7:
            if (r0 < 0) goto L1a
            java.lang.Object r3 = r4.valueAt(r0)
            boolean r3 = u(r3, r6, r5)
            if (r3 == 0) goto L17
            r4.removeAt(r0)
            r2 = r1
        L17:
            int r0 = r0 + (-1)
            goto L7
        L1a:
            return r2
    }

    public final void h(java.lang.Object r18, android.widget.BaseAdapter r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            android.util.SparseArray r2 = p(r18)
            if (r2 != 0) goto Lc
            goto L11e
        Lc:
            java.lang.String r3 = "plus_menu_enable"
            ib.b r4 = r0.f10701d
            r5 = 0
            java.lang.String r6 = "Hchat"
            r7 = -1212373075(0xffffffffb7bca7ad, float:-2.2489427E-5)
            if (r4 == 0) goto L22
            android.content.SharedPreferences r8 = r4.f6650a
            boolean r8 = r8.getBoolean(r3, r5)
            if (r8 == 0) goto L22
            r8 = r5
            goto L26
        L22:
            boolean r8 = w(r2, r7, r6)
        L26:
            android.content.Context r9 = r0.f10698a
            boolean r10 = ya.i.c(r9)
            java.lang.String r11 = "全部已读"
            r12 = -1212373073(0xffffffffb7bca7af, float:-2.248943E-5)
            if (r10 != 0) goto L38
            boolean r10 = w(r2, r12, r11)
            r8 = r8 | r10
        L38:
            boolean r10 = f8.i.T(r9)
            java.lang.String r13 = "快捷终止"
            r14 = -1212373072(0xffffffffb7bca7b0, float:-2.2489432E-5)
            if (r10 != 0) goto L48
            boolean r10 = w(r2, r14, r13)
            r8 = r8 | r10
        L48:
            java.lang.String r10 = "plugin_agent_plus_menu_enable"
            java.lang.String r15 = "插件 Agent"
            r14 = -1212373071(0xffffffffb7bca7b1, float:-2.2489434E-5)
            if (r4 == 0) goto L5a
            android.content.SharedPreferences r12 = r4.f6650a
            boolean r12 = r12.getBoolean(r10, r5)
            if (r12 == 0) goto L5a
            goto L5f
        L5a:
            boolean r12 = w(r2, r14, r15)
            r8 = r8 | r12
        L5f:
            boolean r12 = r0.t()
            if (r12 != 0) goto L6d
            if (r8 == 0) goto L11e
            if (r1 == 0) goto L11e
            r1.notifyDataSetChanged()
            return
        L6d:
            boolean r12 = j(r2, r7, r6)
            if (r12 == 0) goto L94
            r12 = -1212373073(0xffffffffb7bca7af, float:-2.248943E-5)
            boolean r16 = j(r2, r12, r11)
            if (r16 == 0) goto L94
            boolean r12 = j(r2, r14, r15)
            if (r12 == 0) goto L94
            r12 = -1212373072(0xffffffffb7bca7b0, float:-2.2489432E-5)
            boolean r16 = j(r2, r12, r13)
            if (r16 == 0) goto L94
            r0.k(r1)
            if (r1 == 0) goto L11e
            r1.notifyDataSetChanged()
            return
        L94:
            int r12 = r2.size()
            if (r12 <= 0) goto L9f
            java.lang.Object r12 = r2.valueAt(r5)
            goto La0
        L9f:
            r12 = 0
        La0:
            if (r12 != 0) goto La4
            goto L11e
        La4:
            java.lang.Object r14 = o(r12)
            if (r14 != 0) goto Lac
            goto L11e
        Lac:
            r0.k(r1)
            if (r4 == 0) goto Lcb
            android.content.SharedPreferences r7 = r4.f6650a
            boolean r3 = r7.getBoolean(r3, r5)
            if (r3 == 0) goto Lcb
            r3 = -1212373075(0xffffffffb7bca7ad, float:-2.2489427E-5)
            boolean r7 = j(r2, r3, r6)
            if (r7 != 0) goto Lcb
            java.lang.Class r7 = r12.getClass()
            boolean r3 = i(r2, r7, r14, r3, r6)
            r8 = r8 | r3
        Lcb:
            if (r4 == 0) goto Le7
            android.content.SharedPreferences r3 = r4.f6650a
            boolean r3 = r3.getBoolean(r10, r5)
            if (r3 == 0) goto Le7
            r3 = -1212373071(0xffffffffb7bca7b1, float:-2.2489434E-5)
            boolean r4 = j(r2, r3, r15)
            if (r4 != 0) goto Le7
            java.lang.Class r4 = r12.getClass()
            boolean r3 = i(r2, r4, r14, r3, r15)
            r8 = r8 | r3
        Le7:
            boolean r3 = ya.i.c(r9)
            if (r3 == 0) goto Lff
            r3 = -1212373073(0xffffffffb7bca7af, float:-2.248943E-5)
            boolean r4 = j(r2, r3, r11)
            if (r4 != 0) goto Lff
            java.lang.Class r4 = r12.getClass()
            boolean r3 = i(r2, r4, r14, r3, r11)
            r8 = r8 | r3
        Lff:
            boolean r3 = f8.i.T(r9)
            if (r3 == 0) goto L117
            r3 = -1212373072(0xffffffffb7bca7b0, float:-2.2489432E-5)
            boolean r4 = j(r2, r3, r13)
            if (r4 != 0) goto L117
            java.lang.Class r4 = r12.getClass()
            boolean r2 = i(r2, r4, r14, r3, r13)
            r8 = r8 | r2
        L117:
            if (r8 == 0) goto L11e
            if (r1 == 0) goto L11e
            r1.notifyDataSetChanged()
        L11e:
            return
    }

    public final void k(android.widget.BaseAdapter r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.Class r6 = r6.getClass()
            java.util.HashSet r0 = r5.f10703f
            monitor-enter(r0)
            java.util.HashSet r1 = r5.f10703f     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.contains(r6)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r6 = move-exception
            goto L30
        L16:
            java.lang.reflect.Method r1 = l(r6)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L1e:
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L14
            q8.d r3 = new q8.d     // Catch: java.lang.Throwable -> L14
            r4 = 3
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L14
            r2.b(r1, r3)     // Catch: java.lang.Throwable -> L14
            java.util.HashSet r1 = r5.f10703f     // Catch: java.lang.Throwable -> L14
            r1.add(r6)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r6
    }

    public final void q(java.lang.Class r9) {
            r8 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r9 != 0) goto Lf
            goto L39
        Lf:
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredMethods(r9)
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L39
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            boolean r5 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r5 != 0) goto L17
            java.lang.Class r5 = r4.getReturnType()
            if (r5 != r2) goto L17
            int r5 = r4.getParameterCount()
            if (r5 != 0) goto L17
            r1.add(r4)
            goto L17
        L39:
            java.util.Iterator r1 = r1.iterator()
        L3d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r4 = r0.add(r3)
            if (r4 != 0) goto L50
            goto L3d
        L50:
            r8.i r4 = r8.i.f11631b
            q8.d r5 = new q8.d
            r6 = 4
            r5.<init>(r8, r6)
            r4.b(r3, r5)
            goto L3d
        L5c:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            if (r9 != 0) goto L65
            r9 = 0
            goto L69
        L65:
            java.lang.Class r9 = r9.getSuperclass()
        L69:
            if (r9 == 0) goto Laa
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r9 == r3) goto Laa
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredMethods(r9)
            java.util.Iterator r3 = r3.iterator()
        L77:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La5
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            boolean r6 = h.Hchat.utils.KavaReflector.isStatic(r4)
            if (r6 != 0) goto L77
            java.lang.Class r6 = r4.getReturnType()
            if (r6 != r2) goto L77
            int r6 = r5.length
            if (r6 == 0) goto La1
            int r6 = r5.length
            r7 = 1
            if (r6 != r7) goto L77
            r6 = 0
            r5 = r5[r6]
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r5 != r6) goto L77
        La1:
            r1.add(r4)
            goto L77
        La5:
            java.lang.Class r9 = r9.getSuperclass()
            goto L69
        Laa:
            java.util.Iterator r9 = r1.iterator()
        Lae:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lcd
            java.lang.Object r1 = r9.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r2 = r0.add(r1)
            if (r2 != 0) goto Lc1
            goto Lae
        Lc1:
            r8.i r2 = r8.i.f11631b
            q8.d r3 = new q8.d
            r4 = 5
            r3.<init>(r8, r4)
            r2.b(r1, r3)
            goto Lae
        Lcd:
            return
    }

    public final void r() {
            r17 = this;
            r1 = r17
            e8.c r0 = r1.f10700c
            java.lang.Class r2 = r0.f2384z
            if (r2 != 0) goto La
            goto L76
        La:
            java.lang.Class r3 = r0.f2364f
            if (r3 != 0) goto Lf
            goto L76
        Lf:
            java.lang.reflect.Method r3 = r0.f2365g
            if (r3 == 0) goto L76
            java.lang.reflect.Method r3 = r0.f2366h
            if (r3 == 0) goto L76
            java.lang.reflect.Method r3 = r0.f2367i
            if (r3 == 0) goto L76
            java.lang.reflect.Method r3 = r0.f2368j
            if (r3 != 0) goto L20
            goto L76
        L20:
            r8.i r3 = r8.i.f11631b     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "initView"
            q8.d r5 = new q8.d     // Catch: java.lang.Throwable -> L58
            r6 = 6
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L58
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L58
            de.robv.android.xposed.XC_MethodHook$Unhook r2 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r2, r4, r5)     // Catch: java.lang.Throwable -> L58
            r3.a(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.Class r0 = r0.f2384z     // Catch: java.lang.Throwable -> L58
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L58
        L3f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L5a
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L58
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "onPreferenceTreeClick"
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> L58
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L3f
            goto L5b
        L58:
            r0 = move-exception
            goto L6c
        L5a:
            r2 = 0
        L5b:
            if (r2 == 0) goto L76
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L58
            q8.d r3 = new q8.d     // Catch: java.lang.Throwable -> L58
            r4 = 7
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L58
            r0.b(r2, r3)     // Catch: java.lang.Throwable -> L58
            r2.toString()     // Catch: java.lang.Throwable -> L58
            goto L76
        L6c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:SettingsInjector] [Legacy] Hook 失败: "
            r2.<init>(r3)
            bc.e.s(r0, r2, r0)
        L76:
            e8.c r0 = r1.f10700c
            java.lang.Class r3 = r0.f2372n
            r11 = 0
            if (r3 != 0) goto L7f
            goto L2c9
        L7f:
            java.lang.Class r2 = r0.f2370l
            if (r2 != 0) goto L85
            goto L2c9
        L85:
            java.lang.Class r2 = r0.f2371m
            if (r2 != 0) goto L8b
            goto L2c9
        L8b:
            java.lang.Class r2 = r0.f2369k
            if (r2 != 0) goto L91
            goto L2c9
        L91:
            java.lang.Class r5 = r0.f2375q     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r12 = r0.f2374p     // Catch: java.lang.Throwable -> Lc6
            if (r5 == 0) goto L2c9
            if (r12 != 0) goto L9b
            goto L2c9
        L9b:
            java.lang.Class r2 = r0.f2373o     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r4 = java.lang.Integer.TYPE
            if (r2 == 0) goto L1b9
            java.lang.reflect.Method r0 = r0.f2379u     // Catch: java.lang.Throwable -> Lc6
            if (r0 == 0) goto L1b9
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r2)     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lc6
        Lad:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r2 == 0) goto Lc9
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Lc6
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r6 = r2.getReturnType()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            if (r6 != r7) goto Lad
            java.lang.String r0 = r2.getName()     // Catch: java.lang.Throwable -> Lc6
            goto Lca
        Lc6:
            r0 = move-exception
            goto L2bf
        Lc9:
            r0 = 0
        Lca:
            e8.c r2 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.reflect.Method r2 = r2.f2379u     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> Lc6
            e8.c r6 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r6 = r6.f2373o     // Catch: java.lang.Throwable -> Lc6
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredMethods(r6)     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Lc6
        Lde:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r7 == 0) goto Lf6
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Lc6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> Lc6
            int r8 = r7.getParameterCount()     // Catch: java.lang.Throwable -> Lc6
            r9 = 3
            if (r8 != r9) goto Lde
            java.lang.String r6 = r7.getName()     // Catch: java.lang.Throwable -> Lc6
            goto Lf7
        Lf6:
            r6 = 0
        Lf7:
            e8.c r7 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.reflect.Method r8 = r7.f2380v     // Catch: java.lang.Throwable -> Lc6
            if (r8 == 0) goto L102
            java.lang.String r7 = r8.getName()     // Catch: java.lang.Throwable -> Lc6
            goto L15d
        L102:
            java.lang.Class r7 = r7.f2373o     // Catch: java.lang.Throwable -> Lc6
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredMethods(r7)     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> Lc6
        L10c:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r8 == 0) goto L15c
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> Lc6
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r9 = r8.getReturnType()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            if (r9 != r13) goto L10c
            int r9 = r8.getParameterCount()     // Catch: java.lang.Throwable -> Lc6
            if (r9 != 0) goto L10c
            e8.c r9 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r9 = r9.f2370l     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto L150
        L12c:
            if (r9 == 0) goto L150
            java.lang.String r13 = r8.getName()     // Catch: java.lang.Throwable -> L14b
            java.lang.Class[] r14 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L14b
            java.lang.reflect.Method r13 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r9, r13, r14)     // Catch: java.lang.Throwable -> L14b
            if (r13 == 0) goto L141
            int r9 = h.Hchat.utils.KavaReflector.modifiers(r13)     // Catch: java.lang.Throwable -> L14b
            goto L151
        L141:
            java.lang.NoSuchMethodException r13 = new java.lang.NoSuchMethodException     // Catch: java.lang.Throwable -> L14b
            java.lang.String r14 = r8.getName()     // Catch: java.lang.Throwable -> L14b
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L14b
            throw r13     // Catch: java.lang.Throwable -> L14b
        L14b:
            java.lang.Class r9 = r9.getSuperclass()     // Catch: java.lang.Throwable -> Lc6
            goto L12c
        L150:
            r9 = r11
        L151:
            boolean r9 = h.Hchat.utils.KavaReflector.isAbstract(r9)     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto L10c
            java.lang.String r7 = r8.getName()     // Catch: java.lang.Throwable -> Lc6
            goto L15d
        L15c:
            r7 = 0
        L15d:
            e8.c r8 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r8 = r8.f2373o     // Catch: java.lang.Throwable -> Lc6
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredMethods(r8)     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lc6
            r9 = 0
        L16a:
            boolean r13 = r8.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r13 == 0) goto L185
            java.lang.Object r13 = r8.next()     // Catch: java.lang.Throwable -> Lc6
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r14 = r13.getReturnType()     // Catch: java.lang.Throwable -> Lc6
            e8.c r15 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r15 = r15.f2371m     // Catch: java.lang.Throwable -> Lc6
            if (r14 != r15) goto L16a
            java.lang.String r9 = r13.getName()     // Catch: java.lang.Throwable -> Lc6
            goto L16a
        L185:
            e8.c r8 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r8 = r8.f2373o     // Catch: java.lang.Throwable -> Lc6
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredMethods(r8)     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lc6
            r13 = 0
        L192:
            boolean r14 = r8.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r14 == 0) goto L1b3
            java.lang.Object r14 = r8.next()     // Catch: java.lang.Throwable -> Lc6
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r15 = r14.getReturnType()     // Catch: java.lang.Throwable -> Lc6
            if (r15 != r4) goto L192
            java.lang.String r15 = r14.getName()     // Catch: java.lang.Throwable -> Lc6
            boolean r15 = r15.equals(r2)     // Catch: java.lang.Throwable -> Lc6
            if (r15 != 0) goto L192
            java.lang.String r13 = r14.getName()     // Catch: java.lang.Throwable -> Lc6
            goto L192
        L1b3:
            r16 = r2
            r2 = r0
            r0 = r16
            goto L1bf
        L1b9:
            r0 = 0
            r2 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r13 = 0
        L1bf:
            if (r2 == 0) goto L2c9
            if (r6 == 0) goto L2c9
            if (r7 == 0) goto L2c9
            if (r9 == 0) goto L2c9
            if (r13 != 0) goto L1cb
            goto L2c9
        L1cb:
            de.robv.android.xposed.XC_MethodHook$Unhook r8 = r1.f10704g     // Catch: java.lang.Throwable -> Lc6
            if (r8 == 0) goto L1d0
            goto L1ea
        L1d0:
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            java.lang.String r14 = "getString"
            ba.f r15 = new ba.f     // Catch: java.lang.Throwable -> Lc6
            r10 = 22
            r15.<init>(r10)     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r15}     // Catch: java.lang.Throwable -> Lc6
            de.robv.android.xposed.XC_MethodHook$Unhook r4 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r8, r14, r4)     // Catch: java.lang.Throwable -> Lc6
            r1.f10704g = r4     // Catch: java.lang.Throwable -> Lc6
            r8.i r8 = r8.i.f11631b     // Catch: java.lang.Throwable -> Lc6
            r8.a(r4)     // Catch: java.lang.Throwable -> Lc6
        L1ea:
            java.lang.String r4 = "androidx.appcompat.app.AppCompatActivity"
            java.lang.ClassLoader r8 = r1.f10699b     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r10 = h.Hchat.utils.KavaReflector.loadClass(r4, r8)     // Catch: java.lang.Throwable -> Lc6
            r4 = r0
            q8.b r0 = new q8.b     // Catch: java.lang.Throwable -> Lc6
            r8 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lc6
            r5 = r8
            e8.c r2 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r2 = r2.f2370l     // Catch: java.lang.Throwable -> Lc6
            y4.c r4 = new y4.c     // Catch: java.lang.Throwable -> Lc6
            r4.<init>(r2)     // Catch: java.lang.Throwable -> Lc6
            java.io.File r2 = r1.f10702e     // Catch: java.lang.Throwable -> Lc6
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> Lc6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r8 = "v"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lc6
            r8 = 1
            java.lang.String r9 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> Lc6
            r7.append(r9)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lc6
            r6.<init>(r2, r7)     // Catch: java.lang.Throwable -> Lc6
            r4.f22298c = r6     // Catch: java.lang.Throwable -> Lc6
            r6.mkdir()     // Catch: java.lang.Throwable -> Lc6
            java.lang.ClassLoader r2 = r1.f10699b     // Catch: java.lang.Throwable -> Lc6
            r4.f22297b = r2     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r7 = r4.a()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class[] r2 = new java.lang.Class[]{r10}     // Catch: java.lang.Throwable -> Lc6
            java.lang.reflect.Constructor r2 = h.Hchat.utils.KavaReflector.findConstructor(r7, r2)     // Catch: java.lang.Throwable -> Lc6
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> Lc6
            b9.e r6 = new b9.e     // Catch: java.lang.Throwable -> Lc6
            r9 = 23
            r6.<init>(r0, r9)     // Catch: java.lang.Throwable -> Lc6
            r4.b(r2, r6)     // Catch: java.lang.Throwable -> Lc6
            r1.f10705h = r3     // Catch: java.lang.Throwable -> Lc6
            r1.f10706i = r5     // Catch: java.lang.Throwable -> Lc6
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r12)     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lc6
        L24e:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r6 == 0) goto L271
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> Lc6
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r9 = r6.getReturnType()     // Catch: java.lang.Throwable -> Lc6
            e8.c r10 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r10 = r10.f2371m     // Catch: java.lang.Throwable -> Lc6
            if (r9 != r10) goto L24e
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> Lc6
            q8.e r9 = new q8.e     // Catch: java.lang.Throwable -> Lc6
            r9.<init>(r1, r3, r5, r7)     // Catch: java.lang.Throwable -> Lc6
            r4.b(r6, r9)     // Catch: java.lang.Throwable -> Lc6
            r6.getName()     // Catch: java.lang.Throwable -> Lc6
        L271:
            e8.c r4 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r4 = r4.f2369k     // Catch: java.lang.Throwable -> Lc6
            if (r4 != 0) goto L279
        L277:
            r10 = 0
            goto L2a0
        L279:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lc6
        L281:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r6 == 0) goto L277
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> Lc6
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> Lc6
            int r9 = r6.getParameterCount()     // Catch: java.lang.Throwable -> Lc6
            if (r9 != 0) goto L281
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            java.lang.Class r10 = r6.getReturnType()     // Catch: java.lang.Throwable -> Lc6
            boolean r9 = r9.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto L281
            r10 = r6
        L2a0:
            if (r10 != 0) goto L2a3
            goto L2b0
        L2a3:
            r8.i r9 = r8.i.f11631b     // Catch: java.lang.Throwable -> Lc6
            r4 = r3
            r3 = r0
            q8.f r0 = new q8.f     // Catch: java.lang.Throwable -> Lc6
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lc6
            r9.b(r10, r0)     // Catch: java.lang.Throwable -> Lc6
        L2b0:
            e8.c r0 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r0 = r0.f2376r     // Catch: java.lang.Throwable -> Lc6
            r1.s(r0, r7, r8)     // Catch: java.lang.Throwable -> Lc6
            e8.c r0 = r1.f10700c     // Catch: java.lang.Throwable -> Lc6
            java.lang.Class r0 = r0.f2378t     // Catch: java.lang.Throwable -> Lc6
            r1.s(r0, r7, r11)     // Catch: java.lang.Throwable -> Lc6
            goto L2c9
        L2bf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:SettingsInjector] [Modern] 安装失败: "
            r2.<init>(r3)
            bc.e.s(r0, r2, r0)
        L2c9:
            java.lang.String r0 = "com.tencent.mm.ui.LauncherUI"
            java.lang.ClassLoader r2 = r1.f10699b     // Catch: java.lang.Throwable -> L303
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r2)     // Catch: java.lang.Throwable -> L303
            if (r0 != 0) goto L2d4
            goto L30e
        L2d4:
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L303
            java.lang.String r3 = "onCreate"
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            ba.f r5 = new ba.f     // Catch: java.lang.Throwable -> L303
            r6 = 23
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L303
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Throwable -> L303
            de.robv.android.xposed.XC_MethodHook$Unhook r3 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r0, r3, r4)     // Catch: java.lang.Throwable -> L303
            r2.a(r3)     // Catch: java.lang.Throwable -> L303
            java.lang.String r3 = "onNewIntent"
            java.lang.Class<android.content.Intent> r4 = android.content.Intent.class
            ba.f r5 = new ba.f     // Catch: java.lang.Throwable -> L303
            r6 = 24
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L303
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Throwable -> L303
            de.robv.android.xposed.XC_MethodHook$Unhook r0 = de.robv.android.xposed.XposedHelpers.findAndHookMethod(r0, r3, r4)     // Catch: java.lang.Throwable -> L303
            r2.a(r0)     // Catch: java.lang.Throwable -> L303
            goto L30e
        L303:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:SettingsInjector] [LauncherUI] Hook 失败: "
            r2.<init>(r3)
            bc.e.s(r0, r2, r0)
        L30e:
            boolean r0 = r1.t()
            if (r0 == 0) goto L34f
            e8.c r0 = r1.f10700c
            java.lang.Class r2 = r0.f2381w
            if (r2 == 0) goto L34f
            java.lang.reflect.Method r2 = r0.f2382x
            if (r2 == 0) goto L34f
            java.lang.reflect.Method r3 = r0.f2383y
            if (r3 != 0) goto L323
            goto L34f
        L323:
            r8.i r3 = r8.i.f11631b     // Catch: java.lang.Throwable -> L344
            q8.d r4 = new q8.d     // Catch: java.lang.Throwable -> L344
            r5 = 1
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L344
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L344
            java.lang.reflect.Method r2 = r0.f2383y     // Catch: java.lang.Throwable -> L344
            q8.d r4 = new q8.d     // Catch: java.lang.Throwable -> L344
            r5 = 2
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L344
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L344
            java.lang.Class r2 = r0.f2381w     // Catch: java.lang.Throwable -> L344
            r1.q(r2)     // Catch: java.lang.Throwable -> L344
            java.lang.Class r0 = r0.f2381w     // Catch: java.lang.Throwable -> L344
            r0.getClass()     // Catch: java.lang.Throwable -> L344
            goto L34f
        L344:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:SettingsInjector] [PlusMenu] Hook 失败: "
            r2.<init>(r3)
            bc.e.s(r0, r2, r0)
        L34f:
            ib.b r0 = r1.f10701d
            if (r0 == 0) goto L398
            android.content.SharedPreferences r0 = r0.f6650a
            java.lang.String r2 = "plus_long_press_enable"
            boolean r0 = r0.getBoolean(r2, r11)
            if (r0 == 0) goto L398
            java.lang.String r0 = "com.tencent.mm.ui.HomeUI$PlusActionView"
            java.lang.ClassLoader r2 = r1.f10699b     // Catch: java.lang.Throwable -> L388
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r2)     // Catch: java.lang.Throwable -> L388
            if (r0 != 0) goto L368
            goto L398
        L368:
            q8.d r2 = new q8.d     // Catch: java.lang.Throwable -> L388
            r3 = 0
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L388
            java.util.Set r0 = de.robv.android.xposed.XposedBridge.hookAllConstructors(r0, r2)     // Catch: java.lang.Throwable -> L388
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L388
        L376:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L388
            if (r2 == 0) goto L398
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L388
            de.robv.android.xposed.XC_MethodHook$Unhook r2 = (de.robv.android.xposed.XC_MethodHook.Unhook) r2     // Catch: java.lang.Throwable -> L388
            r8.i r3 = r8.i.f11631b     // Catch: java.lang.Throwable -> L388
            r3.a(r2)     // Catch: java.lang.Throwable -> L388
            goto L376
        L388:
            r0 = move-exception
            r0.getMessage()     // Catch: java.lang.Throwable -> L38d
            goto L398
        L38d:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:SettingsInjector] [PlusLongPress] Hook 失败: "
            r2.<init>(r3)
            bc.e.s(r0, r2, r0)
        L398:
            return
    }

    public final void s(java.lang.Class r5, java.lang.Class r6, boolean r7) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L3d
        L3:
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r2 = "superImportUIComponents"
            java.lang.String r3 = r1.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lb
            int r2 = r1.getParameterCount()
            r3 = 1
            if (r2 != r3) goto Lb
            java.lang.Class[] r2 = r1.getParameterTypes()
            r3 = 0
            r2 = r2[r3]
            java.lang.Class<java.util.HashSet> r3 = java.util.HashSet.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto Lb
            goto L3b
        L3a:
            r1 = 0
        L3b:
            if (r1 != 0) goto L3e
        L3d:
            return
        L3e:
            r8.i r0 = r8.i.f11631b
            q8.g r2 = new q8.g
            r2.<init>(r4, r7, r6, r5)
            r0.b(r1, r2)
            return
    }

    public final boolean t() {
            r4 = this;
            r0 = 0
            ib.b r1 = r4.f10701d
            if (r1 == 0) goto L10
            android.content.SharedPreferences r2 = r1.f6650a
            java.lang.String r3 = "plus_menu_enable"
            boolean r2 = r2.getBoolean(r3, r0)
            if (r2 == 0) goto L10
            goto L2d
        L10:
            if (r1 == 0) goto L1d
            android.content.SharedPreferences r1 = r1.f6650a
            java.lang.String r2 = "plugin_agent_plus_menu_enable"
            boolean r1 = r1.getBoolean(r2, r0)
            if (r1 == 0) goto L1d
            goto L2d
        L1d:
            android.content.Context r1 = r4.f10698a
            boolean r2 = ya.i.c(r1)
            if (r2 != 0) goto L2d
            boolean r1 = f8.i.T(r1)
            if (r1 == 0) goto L2c
            goto L2d
        L2c:
            return r0
        L2d:
            r0 = 1
            return r0
    }
}
