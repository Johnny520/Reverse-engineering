package uf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements wf.f, r1.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13778g;

    public /* synthetic */ d(int r1) {
            r0 = this;
            r0.f13778g = r1
            r0.<init>()
            return
    }

    public static boolean B(java.lang.Object r6, int r7, java.lang.Object r8) {
            java.lang.Class r0 = r6.getClass()
            java.util.ArrayList r0 = G(r0)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L10
            goto L59
        L10:
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r3 = r1.getParameterTypes()
            int r3 = r3.length
            r4 = 2
            r5 = 1
            if (r3 != r4) goto L55
            java.lang.Class[] r3 = r1.getParameterTypes()
            r3 = r3[r2]
            java.lang.Class r4 = r8.getClass()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L55
            java.lang.Class[] r3 = r1.getParameterTypes()
            r3 = r3[r5]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L48
            goto L55
        L48:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r3}
            boolean r1 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r1, r6, r3)
            goto L56
        L55:
            r1 = r2
        L56:
            if (r1 == 0) goto L14
            return r5
        L59:
            return r2
    }

    public static boolean C(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "Hchat_disable_hot_update_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r1)
            java.lang.String r1 = "disable_hot_update_enable"
            boolean r2 = r2.getBoolean(r1, r0)
            return r2
    }

    public static boolean D(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r0 = r0.length
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L37
            java.lang.Class[] r0 = r4.getParameterTypes()
            r0 = r0[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L37
            java.lang.Class[] r0 = r4.getParameterTypes()
            r1 = 1
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r3 = "com.tencent.mm.plugin.hp.util.TinkerSyncResponse"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L37
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L37
            return r1
        L37:
            return r2
    }

    public static boolean E(java.lang.Class r6, java.lang.reflect.Method r7) {
            java.lang.Class[] r7 = r7.getParameterTypes()
            r7.getClass()
            int r0 = r7.length
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L2b
            r3 = r7[r2]
            boolean r4 = gg.l.a(r3, r6)
            r5 = 1
            if (r4 != 0) goto L24
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.tencent.mm.plugin.hp.util.TinkerSyncResponse"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L22
            goto L24
        L22:
            r3 = r1
            goto L25
        L24:
            r3 = r5
        L25:
            if (r3 == 0) goto L28
            return r5
        L28:
            int r2 = r2 + 1
            goto La
        L2b:
            return r1
    }

    public static boolean F(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r0 = r0.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L17
            java.lang.Class[] r0 = r4.getParameterTypes()
            r0 = r0[r1]
            java.lang.Class<java.io.File> r3 = java.io.File.class
            boolean r0 = gg.l.a(r0, r3)
            if (r0 != 0) goto L2b
        L17:
            java.lang.String r0 = r4.getName()
            java.lang.String r3 = "onGYNetEnd"
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L2c
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r4 = r4.length
            r0 = 5
            if (r4 < r0) goto L2c
        L2b:
            return r2
        L2c:
            return r1
    }

    public static java.util.ArrayList G(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L1b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1b
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            tf.r.h1(r0, r1)
            java.lang.Class r2 = r2.getSuperclass()
            goto L5
        L1b:
            return r0
    }

    public static void H(java.lang.Object r6) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "notifyDataSetChanged"
            h.Hchat.utils.KavaReflector.invokeMethod(r6, r2, r1)
            java.lang.Class r1 = r6.getClass()
            java.util.ArrayList r1 = G(r1)
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r5 = r4.getName()
            boolean r5 = gg.l.a(r5, r2)
            if (r5 == 0) goto L37
            java.lang.Class[] r4 = r4.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L37
            r4 = 1
            goto L38
        L37:
            r4 = r0
        L38:
            if (r4 == 0) goto L14
            goto L3c
        L3b:
            r3 = 0
        L3c:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L45
            java.lang.Object[] r0 = new java.lang.Object[r0]
            h.Hchat.utils.KavaReflector.invoke(r3, r6, r0)
        L45:
            return
    }

    public static java.lang.Integer I(java.lang.Object r5, java.lang.String r6) {
            java.lang.Class r0 = r5.getClass()
            java.util.ArrayList r0 = G(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r3 = r1.getParameterTypes()
            int r3 = r3.length
            r4 = 1
            if (r3 != r4) goto Lc
            java.lang.Class[] r3 = r1.getParameterTypes()
            r4 = 0
            r3 = r3[r4]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto Lc
            java.lang.Class r3 = r1.getReturnType()
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto Lc
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r5, r3)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L4b
            r2 = r1
            java.lang.Integer r2 = (java.lang.Integer) r2
        L4b:
            if (r2 == 0) goto Lc
            int r1 = r2.intValue()
            if (r1 < 0) goto Lc
        L53:
            return r2
    }

    public static java.lang.String J(java.lang.Object r5) {
            java.lang.String r0 = "q"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r5, r0)
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto Le
            java.lang.String r0 = (java.lang.String) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L12
            return r0
        L12:
            java.lang.Class r0 = r5.getClass()
            java.util.ArrayList r0 = G(r0)
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r3 = r1.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L4e
            java.lang.Class r3 = r1.getReturnType()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L4e
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r5, r3)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4e
            java.lang.String r1 = (java.lang.String) r1
            goto L4f
        L4e:
            r1 = r2
        L4f:
            if (r1 == 0) goto L1e
            return r1
        L52:
            return r2
    }

    public static java.lang.String K(android.app.Activity r6, va.b r7) {
            android.content.Intent r6 = r6.getIntent()
            int r0 = r7.ordinal()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1b
            r3 = 1
            if (r0 != r3) goto L16
            java.lang.String r0 = "RoomInfo_Id"
            java.lang.String r0 = r6.getStringExtra(r0)
            goto L49
        L16:
            okio.a.k()
            r6 = 0
            return r6
        L1b:
            java.lang.String r0 = "Contact_User"
            java.lang.String r0 = r6.getStringExtra(r0)
            java.lang.String r3 = "Contact_Username"
            java.lang.String r3 = r6.getStringExtra(r3)
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            r3 = r1
        L2c:
            r4 = 2
            if (r3 >= r4) goto L3c
            r4 = r0[r3]
            if (r4 == 0) goto L39
            boolean r5 = og.m.t0(r4)
            if (r5 == 0) goto L3d
        L39:
            int r3 = r3 + 1
            goto L2c
        L3c:
            r4 = r2
        L3d:
            if (r4 == 0) goto L48
            java.lang.CharSequence r0 = og.m.R0(r4)
            java.lang.String r0 = r0.toString()
            goto L49
        L48:
            r0 = r2
        L49:
            if (r0 == 0) goto L5b
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto L52
            goto L5b
        L52:
            java.lang.CharSequence r6 = og.m.R0(r0)
            java.lang.String r6 = r6.toString()
            return r6
        L5b:
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto Lc9
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L69:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lc9
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Throwable -> L80
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L82
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L80
            goto L8a
        L80:
            r3 = move-exception
            goto L84
        L82:
            r3 = r2
            goto L8a
        L84:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L8a:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L90
            r3 = r2
        L90:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L9d
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            goto L9e
        L9d:
            r3 = r2
        L9e:
            if (r3 != 0) goto La2
            java.lang.String r3 = ""
        La2:
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto La9
            goto L69
        La9:
            va.b r4 = va.b.f14296h
            if (r7 != r4) goto Lbe
            java.lang.String r4 = "@chatroom"
            boolean r4 = og.t.W(r3, r4, r1)
            if (r4 != 0) goto Lc8
            java.lang.String r4 = "@im.chatroom"
            boolean r4 = og.t.W(r3, r4, r1)
            if (r4 == 0) goto Lbe
            goto Lc8
        Lbe:
            va.b r4 = va.b.f14295g
            if (r7 != r4) goto L69
            boolean r4 = zb.c.b(r3)
            if (r4 == 0) goto L69
        Lc8:
            return r3
        Lc9:
            return r2
    }

    public static int L(android.view.ViewGroup r7) {
            gg.s r0 = new gg.s
            r0.<init>()
            gg.s r1 = new gg.s
            r1.<init>()
            int r2 = r7.getChildCount()
            r3 = 0
            r4 = r3
        L10:
            if (r4 < r2) goto L13
            goto L39
        L13:
            android.view.View r5 = r7.getChildAt(r4)
            boolean r6 = r5 instanceof android.widget.AbsListView
            if (r6 != 0) goto L33
            boolean r6 = r5 instanceof android.widget.ScrollView
            if (r6 != 0) goto L33
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "RecyclerView"
            boolean r5 = og.m.h0(r5, r6, r3)
            if (r5 == 0) goto L30
            goto L33
        L30:
            int r4 = r4 + 1
            goto L10
        L33:
            int r2 = r0.f4562g
            int r2 = r2 + 30
            r0.f4562g = r2
        L39:
            f0.l r2 = new f0.l
            r4 = 1
            r2.<init>(r1, r0, r4)
            l(r7, r3, r2)
            int r2 = r0.f4562g
            int r3 = r7.getChildCount()
            r4 = 12
            if (r3 <= r4) goto L4d
            r3 = r4
        L4d:
            int r2 = r2 + r3
            r0.f4562g = r2
            int r1 = r1.f4562g
            if (r1 != 0) goto L58
            int r2 = r2 + (-20)
            r0.f4562g = r2
        L58:
            android.view.ViewParent r7 = r7.getParent()
            boolean r7 = r7 instanceof android.widget.ScrollView
            if (r7 == 0) goto L66
            int r7 = r0.f4562g
            int r7 = r7 + 10
            r0.f4562g = r7
        L66:
            int r7 = r0.f4562g
            return r7
    }

    public static final java.lang.Object a(uf.d r0, java.lang.reflect.Method r1) {
            java.lang.Class r0 = r1.getReturnType()
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L43
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L15
            goto L43
        L15:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L40
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r1 = gg.l.a(r0, r1)
            if (r1 == 0) goto L26
            goto L40
        L26:
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = gg.l.a(r0, r1)
            if (r1 != 0) goto L39
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L37
            goto L39
        L37:
            r0 = 0
            return r0
        L39:
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L43:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public static final int b(android.view.View r1, float r2) {
            og.k r0 = ya.g.f22385e
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    public static final float c(float r7, float[] r8, float[] r9) {
            float r0 = java.lang.Math.abs(r7)
            float r1 = java.lang.Math.signum(r7)
            int r2 = java.util.Arrays.binarySearch(r8, r0)
            if (r2 < 0) goto L12
            r7 = r9[r2]
            float r1 = r1 * r7
            return r1
        L12:
            int r2 = r2 + 1
            int r2 = -r2
            int r3 = r2 + (-1)
            int r4 = r8.length
            int r4 = r4 + (-1)
            r5 = 0
            if (r3 < r4) goto L2f
            int r0 = r8.length
            int r0 = r0 + (-1)
            r0 = r8[r0]
            int r8 = r8.length
            int r8 = r8 + (-1)
            r8 = r9[r8]
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 != 0) goto L2c
            return r5
        L2c:
            float r8 = r8 / r0
            float r8 = r8 * r7
            return r8
        L2f:
            r7 = -1
            if (r3 != r7) goto L3b
            r7 = 0
            r8 = r8[r7]
            r7 = r9[r7]
            r9 = r8
            r8 = r5
            r3 = r8
            goto L47
        L3b:
            r7 = r8[r3]
            r8 = r8[r2]
            r3 = r9[r3]
            r9 = r9[r2]
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L47:
            int r2 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r2 != 0) goto L4d
            r0 = r5
            goto L50
        L4d:
            float r0 = r0 - r8
            float r9 = r9 - r8
            float r0 = r0 / r9
        L50:
            r8 = 1065353216(0x3f800000, float:1.0)
            float r8 = java.lang.Math.min(r8, r0)
            float r8 = java.lang.Math.max(r5, r8)
            float r7 = r7 - r3
            float r7 = r7 * r8
            float r7 = r7 + r3
            float r7 = r7 * r1
            return r7
    }

    public static final int d(android.view.View r2) {
            og.k r0 = ya.g.f22385e
            int r0 = r2.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 == 0) goto L15
            int r2 = r1.intValue()
            return r2
        L15:
            int r2 = r2.getMeasuredHeight()
            return r2
    }

    public static final int e(android.view.View r2) {
            og.k r0 = ya.g.f22385e
            int r0 = r2.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 == 0) goto L15
            int r2 = r1.intValue()
            return r2
        L15:
            int r2 = r2.getMeasuredWidth()
            return r2
    }

    public static void f(java.lang.Object r13, java.lang.String r14, java.lang.reflect.Method r15) {
            java.lang.String r0 = "ID: "
            java.lang.String r14 = r0.concat(r14)
            java.lang.String r0 = "h"
            h.Hchat.utils.KavaReflector.writeField(r13, r0, r14)
            java.lang.String r0 = "m"
            java.lang.String r1 = ""
            h.Hchat.utils.KavaReflector.writeField(r13, r0, r1)
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            tf.t r3 = tf.t.f13167g
            r4 = 0
            if (r15 == 0) goto Laf
            java.lang.Class r5 = r13.getClass()
            java.util.ArrayList r5 = G(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r7 = r5.hasNext()
            r8 = 0
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r5.next()
            r9 = r7
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            r11 = 1
            if (r10 != r11) goto L2a
            java.lang.Class[] r10 = r9.getParameterTypes()
            r8 = r10[r8]
            boolean r8 = r2.isAssignableFrom(r8)
            if (r8 == 0) goto L2a
            java.lang.Class r8 = r9.getReturnType()
            java.lang.Class r9 = java.lang.Void.TYPE
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L2a
            r6.add(r7)
            goto L2a
        L5c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
            r7 = r8
        L66:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto Lab
            java.lang.Object r9 = r6.next()
            int r10 = r7 + 1
            if (r7 < 0) goto La7
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "HchatTitleProbe"
            r11.<init>(r12)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            j(r13, r3)
            java.lang.Object[] r11 = new java.lang.Object[]{r7}
            h.Hchat.utils.KavaReflector.invoke(r9, r13, r11)
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.invoke(r15, r13, r11)
            if (r11 == 0) goto L9b
            java.lang.String r11 = r11.toString()
            goto L9c
        L9b:
            r11 = r4
        L9c:
            boolean r7 = gg.l.a(r11, r7)
            if (r7 == 0) goto La5
            r5.add(r9)
        La5:
            r7 = r10
            goto L66
        La7:
            a.a.Q0()
            throw r4
        Lab:
            j(r13, r3)
            r4 = r5
        Laf:
            if (r4 != 0) goto Lb2
            goto Lb3
        Lb2:
            r3 = r4
        Lb3:
            boolean r15 = r3.isEmpty()
            if (r15 != 0) goto Ld4
            j(r13, r3)
            java.util.Iterator r15 = r3.iterator()
        Lc0:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto Leb
            java.lang.Object r2 = r15.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Object[] r3 = new java.lang.Object[]{r14}
            h.Hchat.utils.KavaReflector.invoke(r2, r13, r3)
            goto Lc0
        Ld4:
            java.lang.Class r15 = r13.getClass()
            java.lang.String r3 = "L"
            java.lang.Class[] r2 = new java.lang.Class[]{r2}
            java.lang.reflect.Method r15 = h.Hchat.utils.KavaReflector.findMethod(r15, r3, r2)
            if (r15 == 0) goto Leb
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            h.Hchat.utils.KavaReflector.invoke(r15, r13, r14)
        Leb:
            h.Hchat.utils.KavaReflector.writeField(r13, r0, r1)
            return
    }

    public static void g(java.lang.Object r4, android.app.Activity r5, java.lang.String r6) {
            java.lang.Class r0 = r4.getClass()
            java.util.ArrayList r0 = G(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r2 = r2.length
            r3 = 1
            if (r2 != r3) goto Lc
            java.lang.Class[] r2 = r1.getParameterTypes()
            r3 = 0
            r2 = r2[r3]
            java.lang.Class<android.view.View$OnClickListener> r3 = android.view.View.OnClickListener.class
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto Lc
            java.lang.Class r2 = r1.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto Lc
            va.a r2 = new va.a
            r3 = 2
            r2.<init>(r5, r6, r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            h.Hchat.utils.KavaReflector.invoke(r1, r4, r2)
            goto Lc
        L49:
            return
    }

    public static void h(android.app.Activity r3, java.lang.String r4, int r5) {
            android.view.Window r0 = r3.getWindow()
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r0 = r0.getDecorView()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L14
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L14:
            if (r1 == 0) goto L25
            qb.d r0 = new qb.d
            r0.<init>(r4, r1, r3, r5)
            if (r5 != 0) goto L20
            r3 = 0
            goto L22
        L20:
            r3 = 120(0x78, double:5.93E-322)
        L22:
            r1.postDelayed(r0, r3)
        L25:
            return
    }

    public static void i(android.view.View r6, android.app.Activity r7, java.lang.String r8) {
            java.lang.String r0 = "Hchat:ProfileId:Value:"
            java.lang.String r0 = r0.concat(r8)
            r6.setTag(r0)
            android.content.res.Resources r0 = r7.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L20
            r0 = 25
            int r0 = android.graphics.Color.rgb(r0, r0, r0)
            goto L21
        L20:
            r0 = -1
        L21:
            android.content.res.Resources$Theme r1 = r7.getTheme()
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            int[] r2 = new int[]{r2}
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2)
            r1.getClass()
            r2 = 0
            int r0 = r1.getColor(r2, r0)     // Catch: java.lang.Throwable -> L38
        L38:
            r1.recycle()
            r6.setBackgroundColor(r0)
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L54
            gg.s r1 = new gg.s
            r1.<init>()
            r3 = r6
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            m.b r4 = new m.b
            r5 = 20
            r4.<init>(r1, r5, r7)
            q(r3, r4)
        L54:
            r1 = 0
            if (r0 == 0) goto L70
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r0.getChildCount()
        L5e:
            if (r2 < r3) goto L61
            goto L70
        L61:
            android.view.View r4 = r0.getChildAt(r2)
            boolean r5 = r4 instanceof android.widget.TextView
            if (r5 == 0) goto L6d
            r1 = r4
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L70
        L6d:
            int r2 = r2 + 1
            goto L5e
        L70:
            if (r1 == 0) goto L7b
            java.lang.String r0 = "ID: "
            java.lang.String r0 = r0.concat(r8)
            r1.setText(r0)
        L7b:
            va.a r0 = new va.a
            r1 = 1
            r0.<init>(r7, r8, r1)
            r6.setOnClickListener(r0)
            return
    }

    public static void j(java.lang.Object r5, java.util.List r6) {
            java.lang.Class r0 = r5.getClass()
            java.util.ArrayList r0 = G(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = ""
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r3 = r6.contains(r1)
            if (r3 == 0) goto L21
            goto Lc
        L21:
            java.lang.Class[] r3 = r1.getParameterTypes()
            int r3 = r3.length
            r4 = 1
            if (r3 != r4) goto Lc
            java.lang.Class[] r3 = r1.getParameterTypes()
            r4 = 0
            r3 = r3[r4]
            java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto Lc
            java.lang.Class r3 = r1.getReturnType()
            java.lang.Class r4 = java.lang.Void.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto Lc
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            h.Hchat.utils.KavaReflector.invoke(r1, r5, r2)
            goto Lc
        L4c:
            java.lang.String r6 = "h"
            h.Hchat.utils.KavaReflector.writeField(r5, r6, r2)
            java.lang.String r6 = "m"
            h.Hchat.utils.KavaReflector.writeField(r5, r6, r2)
            return
    }

    public static void k(android.view.ViewGroup r4, java.util.ArrayList r5) {
            boolean r0 = r4 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L2f
            r0 = r4
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            int r0 = r0.getOrientation()
            r1 = 1
            if (r0 != r1) goto L2f
            boolean r0 = r4 instanceof android.widget.FrameLayout
            if (r0 != 0) goto L2f
            boolean r0 = r4 instanceof android.widget.ScrollView
            if (r0 == 0) goto L17
            goto L2f
        L17:
            int r0 = r4.getWidth()
            if (r0 == 0) goto L2c
            android.content.Context r1 = r4.getContext()
            r1.getClass()
            r2 = 1130102784(0x435c0000, float:220.0)
            int r1 = m(r1, r2)
            if (r0 <= r1) goto L2f
        L2c:
            r5.add(r4)
        L2f:
            int r0 = r4.getChildCount()
            r1 = 0
        L34:
            if (r1 < r0) goto L37
            return
        L37:
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L47
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            k(r2, r5)
        L47:
            int r1 = r1 + 1
            goto L34
    }

    public static void l(android.view.View r4, int r5, fg.l r6) {
            r0 = 4
            if (r5 <= r0) goto L4
            goto L41
        L4:
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L24
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.toString()
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != 0) goto L1b
            java.lang.String r0 = ""
        L1b:
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L24
            r6.invoke(r0)
        L24:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L41
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L2f:
            if (r1 < r0) goto L32
            goto L41
        L32:
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            int r3 = r5 + 1
            l(r2, r3, r6)
            int r1 = r1 + 1
            goto L2f
        L41:
            return
    }

    public static int m(android.content.Context r0, float r1) {
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static android.view.View n(android.view.ViewGroup r10) {
            java.lang.Object r0 = r10.getTag()
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto Lc
            java.lang.String r0 = (java.lang.String) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            java.lang.String r1 = "Hchat:ProfileId:Value:"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L1a
            boolean r0 = og.t.d0(r0, r1, r4)
            if (r0 != r3) goto L1a
            goto L26
        L1a:
            java.lang.Object r0 = r10.getTag()
            java.lang.String r5 = "Hchat:ProfileId:Row"
            boolean r0 = gg.l.a(r0, r5)
            if (r0 == 0) goto L27
        L26:
            return r10
        L27:
            int r0 = r10.getChildCount()
            r6 = r4
        L2c:
            if (r6 < r0) goto L2f
            return r2
        L2f:
            android.view.View r7 = r10.getChildAt(r6)
            java.lang.Object r8 = r7.getTag()
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L3e
            java.lang.String r8 = (java.lang.String) r8
            goto L3f
        L3e:
            r8 = r2
        L3f:
            if (r8 == 0) goto L48
            boolean r8 = og.t.d0(r8, r1, r4)
            if (r8 != r3) goto L48
            goto L52
        L48:
            java.lang.Object r8 = r7.getTag()
            boolean r8 = gg.l.a(r8, r5)
            if (r8 == 0) goto L53
        L52:
            return r7
        L53:
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L60
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r7 = n(r7)
            if (r7 == 0) goto L60
            return r7
        L60:
            int r6 = r6 + 1
            goto L2c
    }

    public static java.lang.Object o(java.lang.Object r6, java.lang.String r7) {
            java.lang.Class r0 = r6.getClass()
            java.util.ArrayList r0 = G(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r3 = r1.getParameterTypes()
            int r3 = r3.length
            r4 = 1
            if (r3 != r4) goto L56
            java.lang.Class[] r3 = r1.getParameterTypes()
            r4 = 0
            r3 = r3[r4]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L56
            java.lang.Class r3 = r1.getReturnType()
            java.lang.String r3 = r3.getName()
            java.lang.String r5 = "Preference"
            boolean r3 = og.m.h0(r3, r5, r4)
            if (r3 != 0) goto L41
            goto L56
        L41:
            java.lang.Object[] r3 = new java.lang.Object[]{r7}
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r6, r3)
            if (r1 == 0) goto L56
            java.lang.String r3 = J(r1)
            boolean r3 = gg.l.a(r3, r7)
            if (r3 == 0) goto L56
            r2 = r1
        L56:
            if (r2 == 0) goto Lc
        L58:
            return r2
    }

    public static android.widget.TextView p(android.view.ViewGroup r6, fg.l r7) {
            int r0 = r6.getChildCount()
            r1 = 0
        L5:
            r2 = 0
            if (r1 < r0) goto L9
            return r2
        L9:
            android.view.View r3 = r6.getChildAt(r1)
            boolean r4 = r3 instanceof android.widget.TextView
            if (r4 == 0) goto L2f
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.CharSequence r5 = r4.getText()
            if (r5 == 0) goto L1e
            java.lang.String r2 = r5.toString()
        L1e:
            if (r2 != 0) goto L22
            java.lang.String r2 = ""
        L22:
            java.lang.Object r2 = r7.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2f
            return r4
        L2f:
            boolean r2 = r3 instanceof android.view.ViewGroup
            if (r2 == 0) goto L3c
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.widget.TextView r2 = p(r3, r7)
            if (r2 == 0) goto L3c
            return r2
        L3c:
            int r1 = r1 + 1
            goto L5
    }

    public static void q(android.view.ViewGroup r4, m.b r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 < r0) goto L8
            return
        L8:
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof android.widget.TextView
            if (r3 == 0) goto L14
            r5.invoke(r2)
            goto L1d
        L14:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1d
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            q(r2, r5)
        L1d:
            int r1 = r1 + 1
            goto L5
    }

    public static void r(java.lang.Class r2, java.lang.Class[] r3, fg.l r4) {
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            java.lang.String r0 = "initView"
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findMethodRecursive(r2, r0, r3)
            if (r3 != 0) goto L2a
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[Hchat:ProfileId] 未找到 "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = "#initView"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            fb.v0.m(r2)
            return
        L2a:
            r8.i r2 = r8.i.f11631b
            l9.c r0 = new l9.c
            r1 = 1
            r0.<init>(r4, r1)
            r2.b(r3, r0)
            return
    }

    public static void s(android.content.Context r3, java.lang.ClassLoader r4) {
            java.lang.String r0 = "com.tencent.mm.chatroom.ui.ChatroomInfoUI"
            java.lang.Class r4 = h.Hchat.utils.KavaReflector.loadClass(r0, r4)
            if (r4 != 0) goto Le
            java.lang.String r3 = "[Hchat:ProfileId] 未找到群聊资料页类"
            fb.v0.m(r3)
            return
        Le:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            fb.f1 r1 = new fb.f1
            r2 = 2
            r1.<init>(r3, r2)
            r(r4, r0, r1)
            java.util.ArrayList r3 = G(r4)
            java.util.Iterator r3 = r3.iterator()
        L22:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r3.next()
            r0 = r4
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "onPreferenceTreeClick"
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L22
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r1 = 2
            if (r0 < r1) goto L22
            goto L45
        L44:
            r4 = 0
        L45:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L56
            r8.i r3 = r8.i.f11631b
            ba.f r0 = new ba.f
            r1 = 26
            r0.<init>(r1)
            r3.b(r4, r0)
            return
        L56:
            java.lang.String r3 = "[Hchat:ProfileId] 未找到群聊资料页 Preference 点击方法"
            fb.v0.m(r3)
            return
    }

    public static boolean w(java.lang.ClassLoader r7) {
            java.lang.String r0 = "com.tencent.tinker.loader.app.TinkerApplication"
            java.lang.Class r7 = r7.loadClass(r0)     // Catch: java.lang.Throwable -> L67
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch: java.lang.Throwable -> L67
            r7.getClass()     // Catch: java.lang.Throwable -> L67
            int r0 = r7.length     // Catch: java.lang.Throwable -> L67
            r1 = 0
            r2 = r1
        L10:
            r3 = 1
            if (r2 >= r0) goto L4c
            r4 = r7[r2]     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = "getTinkerFlags"
            boolean r5 = gg.l.a(r5, r6)     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L45
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L67
            r5.getClass()     // Catch: java.lang.Throwable -> L67
            int r5 = r5.length     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L45
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.Throwable -> L67
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L67
            boolean r5 = gg.l.a(r5, r6)     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L43
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.Throwable -> L67
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            boolean r5 = gg.l.a(r5, r6)     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L45
        L43:
            r5 = r3
            goto L46
        L45:
            r5 = r1
        L46:
            if (r5 == 0) goto L49
            goto L4d
        L49:
            int r2 = r2 + 1
            goto L10
        L4c:
            r4 = 0
        L4d:
            if (r4 != 0) goto L55
            java.lang.String r7 = "[Hchat:HotUpdate] 未找到 TinkerApplication.getTinkerFlags"
            fb.v0.m(r7)     // Catch: java.lang.Throwable -> L67
            goto L62
        L55:
            r8.i r7 = r8.i.f11631b     // Catch: java.lang.Throwable -> L67
            ba.f r0 = new ba.f     // Catch: java.lang.Throwable -> L67
            r1 = 25
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L67
            r7.b(r4, r0)     // Catch: java.lang.Throwable -> L67
            r1 = r3
        L62:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L67
            goto L6e
        L67:
            r7 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r7)
            r7 = r0
        L6e:
            java.lang.Throwable r0 = sf.g.b(r7)
            if (r0 == 0) goto L7d
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "[Hchat:HotUpdate] Hook getTinkerFlags 失败: "
            eh.a.x(r2, r1, r0)
        L7d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r7 instanceof sf.f
            if (r1 == 0) goto L84
            r7 = r0
        L84:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
    }

    public void A(android.content.Context r4, java.lang.ClassLoader r5) {
            r3 = this;
            if (r4 == 0) goto L45
            if (r5 != 0) goto L5
            goto L45
        L5:
            boolean r4 = C(r4)
            if (r4 != 0) goto Lc
            goto L45
        Lc:
            int r4 = java.lang.System.identityHashCode(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = ":"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            monitor-enter(r3)
            java.util.HashSet r0 = v9.b.f14290h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r0.contains(r4)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L2f
            monitor-exit(r3)
            return
        L2f:
            uf.d r1 = v9.b.f14287e     // Catch: java.lang.Throwable -> L42
            boolean r2 = w(r5)     // Catch: java.lang.Throwable -> L42
            boolean r5 = r1.x(r5)     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L3d
            if (r5 == 0) goto L40
        L3d:
            r0.add(r4)     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r3)
            return
        L42:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L45:
            return
    }

    public void t(java.lang.ClassLoader r9) {
            r8 = this;
            java.lang.String r0 = "com.tencent.mm.hotpatch.LegacyTinkerCore$PatchService"
            java.lang.Class r9 = r9.loadClass(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method[] r9 = r9.getDeclaredMethods()     // Catch: java.lang.Throwable -> L40
            r9.getClass()     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L40
            r0.<init>()     // Catch: java.lang.Throwable -> L40
            int r1 = r9.length     // Catch: java.lang.Throwable -> L40
            r2 = 0
            r3 = r2
        L15:
            if (r3 >= r1) goto L4b
            r4 = r9[r3]     // Catch: java.lang.Throwable -> L40
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L40
            int r5 = r5.length     // Catch: java.lang.Throwable -> L40
            r6 = 1
            if (r5 != r6) goto L42
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L40
            r5 = r5[r2]     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = "com.tencent.tinker.lib.service.PatchResult"
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L42
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.Throwable -> L40
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L40
            boolean r5 = gg.l.a(r5, r7)     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L42
            goto L43
        L40:
            r9 = move-exception
            goto L6d
        L42:
            r6 = r2
        L43:
            if (r6 == 0) goto L48
            r0.add(r4)     // Catch: java.lang.Throwable -> L40
        L48:
            int r3 = r3 + 1
            goto L15
        L4b:
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> L40
        L4f:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L40
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L40
            r0.getClass()     // Catch: java.lang.Throwable -> L40
            v9.a r2 = new v9.a     // Catch: java.lang.Throwable -> L40
            r3 = 0
            r2.<init>(r8, r0, r3)     // Catch: java.lang.Throwable -> L40
            r1.b(r0, r2)     // Catch: java.lang.Throwable -> L40
            goto L4f
        L6a:
            sf.n r9 = sf.n.f12433a     // Catch: java.lang.Throwable -> L40
            goto L73
        L6d:
            sf.f r0 = new sf.f
            r0.<init>(r9)
            r9 = r0
        L73:
            java.lang.Throwable r9 = sf.g.b(r9)
            if (r9 == 0) goto L87
            boolean r0 = r9 instanceof java.lang.ClassNotFoundException
            if (r0 == 0) goto L7e
            goto L87
        L7e:
            java.lang.String r0 = r9.getMessage()
            java.lang.String r1 = "[Hchat:HotUpdate] Hook LegacyTinkerCore 失败: "
            eh.a.x(r1, r0, r9)
        L87:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f13778g
            switch(r0) {
                case 5: goto Ld;
                case 6: goto L5;
                case 7: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = "default"
            return r0
        Ld:
            java.lang.String r0 = "CompositionErrorContext"
            return r0
    }

    public void u(java.lang.ClassLoader r8, org.luckypray.dexkit.DexKitBridge r9, android.content.SharedPreferences r10, java.lang.String r11) {
            r7 = this;
            java.lang.String r0 = "manual_updater"
            java.lang.reflect.Method r1 = e8.b.c(r10, r11, r8, r0)
            r2 = 0
            if (r1 == 0) goto L17
            uf.d r3 = v9.b.f14287e
            boolean r3 = D(r1)
            if (r3 == 0) goto L12
            goto L13
        L12:
            r1 = r2
        L13:
            if (r1 == 0) goto L17
            goto La8
        L17:
            ch.e r1 = new ch.e     // Catch: java.lang.Throwable -> L6c
            r1.<init>()     // Catch: java.lang.Throwable -> L6c
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L6c
            r3.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r4 = "start to run patch"
            java.lang.String r5 = "hot patch verfiy signature error"
            java.lang.String r6 = "patch applying is blocked by TinkerEnsuranceOnFault"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch: java.lang.Throwable -> L6c
            java.util.List r4 = a.a.y0(r4)     // Catch: java.lang.Throwable -> L6c
            fh.k.u0(r3, r4)     // Catch: java.lang.Throwable -> L6c
            r1.f1666h = r3     // Catch: java.lang.Throwable -> L6c
            hh.p r9 = r9.findMethod(r1)     // Catch: java.lang.Throwable -> L6c
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L6c
        L3c:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L72
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L6c
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L6c
            r1.getClass()     // Catch: java.lang.Throwable -> L54
            lh.d r1 = r1.p()     // Catch: java.lang.Throwable -> L54
            java.lang.reflect.Method r1 = r1.b(r8)     // Catch: java.lang.Throwable -> L54
            goto L5b
        L54:
            r1 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            r1 = r3
        L5b:
            boolean r3 = r1 instanceof sf.f     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L61
            r1 = r2
        L61:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L6e
            boolean r3 = D(r1)     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L6e
            goto L6f
        L6c:
            r8 = move-exception
            goto L9a
        L6e:
            r1 = r2
        L6f:
            if (r1 == 0) goto L3c
            goto L73
        L72:
            r1 = r2
        L73:
            if (r1 == 0) goto L79
            e8.b.h(r10, r11, r0, r1)     // Catch: java.lang.Throwable -> L6c
            goto L9f
        L79:
            java.lang.String r8 = "cache.key"
            android.content.SharedPreferences$Editor r9 = r10.edit()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = ""
            java.lang.String r10 = r10.getString(r8, r3)     // Catch: java.lang.Throwable -> L9f
            boolean r10 = gg.l.a(r10, r11)     // Catch: java.lang.Throwable -> L9f
            if (r10 != 0) goto L92
            android.content.SharedPreferences$Editor r10 = r9.clear()     // Catch: java.lang.Throwable -> L9f
            r10.putString(r8, r11)     // Catch: java.lang.Throwable -> L9f
        L92:
            android.content.SharedPreferences$Editor r8 = r9.remove(r0)     // Catch: java.lang.Throwable -> L9f
            r8.apply()     // Catch: java.lang.Throwable -> L9f
            goto L9f
        L9a:
            sf.f r1 = new sf.f
            r1.<init>(r8)
        L9f:
            boolean r8 = r1 instanceof sf.f
            if (r8 == 0) goto La4
            goto La5
        La4:
            r2 = r1
        La5:
            r1 = r2
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
        La8:
            if (r1 != 0) goto Lb0
            java.lang.String r8 = "[Hchat:HotUpdate] 未找到热更新补丁应用入口"
            fb.v0.m(r8)
            return
        Lb0:
            r8.i r8 = r8.i.f11631b     // Catch: java.lang.Throwable -> Lbd
            v9.a r9 = new v9.a     // Catch: java.lang.Throwable -> Lbd
            r10 = 1
            r9.<init>(r7, r1, r10)     // Catch: java.lang.Throwable -> Lbd
            de.robv.android.xposed.XC_MethodHook$Unhook r8 = r8.b(r1, r9)     // Catch: java.lang.Throwable -> Lbd
            goto Lc4
        Lbd:
            r8 = move-exception
            sf.f r9 = new sf.f
            r9.<init>(r8)
            r8 = r9
        Lc4:
            java.lang.Throwable r8 = sf.g.b(r8)
            if (r8 == 0) goto Ld3
            java.lang.String r9 = r8.getMessage()
            java.lang.String r10 = "[Hchat:HotUpdate] Hook 补丁应用入口失败: "
            eh.a.x(r10, r9, r8)
        Ld3:
            return
    }

    public void v(java.lang.ClassLoader r9, org.luckypray.dexkit.DexKitBridge r10, android.content.SharedPreferences r11, java.lang.String r12) {
            r8 = this;
            e8.b r0 = e8.b.f2358a
            java.lang.String r1 = "sync_response_consumer"
            java.lang.String r2 = "com.tencent.mm.plugin.hp.util.TinkerSyncResponse"
            java.lang.Class r2 = r9.loadClass(r2)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r2 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L24
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L24
            r2 = r3
        L12:
            boolean r3 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L24
            r4 = 0
            if (r3 == 0) goto L19
            r2 = r4
        L19:
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L24
            if (r2 != 0) goto L27
            java.lang.String r9 = "[Hchat:HotUpdate] 未找到 TinkerSyncResponse 类"
            fb.v0.m(r9)     // Catch: java.lang.Throwable -> L24
            goto L10e
        L24:
            r9 = move-exception
            goto Lf9
        L27:
            java.util.List r3 = e8.b.f(r11, r12, r9, r1)     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L24
            r5.<init>()     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L24
        L34:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L24
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L24
            boolean r7 = E(r2, r7)     // Catch: java.lang.Throwable -> L24
            if (r7 == 0) goto L34
            r5.add(r6)     // Catch: java.lang.Throwable -> L24
            goto L34
        L4b:
            boolean r3 = r5.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto La6
            ch.e r3 = new ch.e     // Catch: java.lang.Throwable -> L24
            r3.<init>()     // Catch: java.lang.Throwable -> L24
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> L24
            r5.<init>()     // Catch: java.lang.Throwable -> L24
            java.util.List r6 = v9.b.f14289g     // Catch: java.lang.Throwable -> L24
            fh.k.u0(r5, r6)     // Catch: java.lang.Throwable -> L24
            r3.f1666h = r5     // Catch: java.lang.Throwable -> L24
            hh.p r10 = r10.findMethod(r3)     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L24
            r5.<init>()     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L24
        L6f:
            boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto La6
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> L24
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L24
            r3.getClass()     // Catch: java.lang.Throwable -> L87
            lh.d r3 = r3.p()     // Catch: java.lang.Throwable -> L87
            java.lang.reflect.Method r3 = r3.b(r9)     // Catch: java.lang.Throwable -> L87
            goto L8e
        L87:
            r3 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L24
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L24
            r3 = r6
        L8e:
            boolean r6 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L94
            r3 = r4
        L94:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L9f
            boolean r6 = E(r2, r3)     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L9f
            goto La0
        L9f:
            r3 = r4
        La0:
            if (r3 == 0) goto L6f
            r5.add(r3)     // Catch: java.lang.Throwable -> L24
            goto L6f
        La6:
            boolean r9 = r5.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r9 != 0) goto Lb0
            r0.j(r11, r12, r1, r5)     // Catch: java.lang.Throwable -> L24
            goto Ld0
        Lb0:
            java.lang.String r9 = "cache.key"
            android.content.SharedPreferences$Editor r10 = r11.edit()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r0 = ""
            java.lang.String r11 = r11.getString(r9, r0)     // Catch: java.lang.Throwable -> Ld0
            boolean r11 = gg.l.a(r11, r12)     // Catch: java.lang.Throwable -> Ld0
            if (r11 != 0) goto Lc9
            android.content.SharedPreferences$Editor r11 = r10.clear()     // Catch: java.lang.Throwable -> Ld0
            r11.putString(r9, r12)     // Catch: java.lang.Throwable -> Ld0
        Lc9:
            android.content.SharedPreferences$Editor r9 = r10.remove(r1)     // Catch: java.lang.Throwable -> Ld0
            r9.apply()     // Catch: java.lang.Throwable -> Ld0
        Ld0:
            java.util.Iterator r9 = r5.iterator()     // Catch: java.lang.Throwable -> L24
            r10 = 0
        Ld5:
            boolean r11 = r9.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r11 == 0) goto Lef
            java.lang.Object r11 = r9.next()     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch: java.lang.Throwable -> L24
            r8.i r12 = r8.i.f11631b     // Catch: java.lang.Throwable -> L24
            v9.a r0 = new v9.a     // Catch: java.lang.Throwable -> L24
            r1 = 2
            r0.<init>(r8, r11, r1)     // Catch: java.lang.Throwable -> L24
            r12.b(r11, r0)     // Catch: java.lang.Throwable -> L24
            int r10 = r10 + 1
            goto Ld5
        Lef:
            if (r10 != 0) goto Lf6
            java.lang.String r9 = "[Hchat:HotUpdate] 未找到热更新下发响应消费入口"
            fb.v0.m(r9)     // Catch: java.lang.Throwable -> L24
        Lf6:
            sf.n r9 = sf.n.f12433a     // Catch: java.lang.Throwable -> L24
            goto Lff
        Lf9:
            sf.f r10 = new sf.f
            r10.<init>(r9)
            r9 = r10
        Lff:
            java.lang.Throwable r9 = sf.g.b(r9)
            if (r9 == 0) goto L10e
            java.lang.String r10 = r9.getMessage()
            java.lang.String r11 = "[Hchat:HotUpdate] Hook 热更新下发响应消费失败: "
            eh.a.x(r11, r10, r9)
        L10e:
            return
    }

    public boolean x(java.lang.ClassLoader r10) {
            r9 = this;
            java.lang.String r0 = "com.tencent.tinker.loader.TinkerLoader"
            java.lang.Class r0 = r10.loadClass(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L4f
            r0.getClass()     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            r1.<init>()     // Catch: java.lang.Throwable -> L4f
            int r2 = r0.length     // Catch: java.lang.Throwable -> L4f
            r3 = 0
            r4 = r3
        L15:
            r5 = 1
            if (r4 >= r2) goto L5a
            r6 = r0[r4]     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = "tryLoadPatchFilesInternal"
            boolean r7 = gg.l.a(r7, r8)     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L51
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L4f
            int r7 = r7.length     // Catch: java.lang.Throwable -> L4f
            r8 = 2
            if (r7 < r8) goto L51
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L4f
            r7 = r7[r3]     // Catch: java.lang.Throwable -> L4f
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = "com.tencent.tinker.loader.app.TinkerApplication"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L51
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L4f
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L4f
            java.lang.Class<android.content.Intent> r8 = android.content.Intent.class
            boolean r7 = gg.l.a(r7, r8)     // Catch: java.lang.Throwable -> L4f
            if (r7 == 0) goto L51
            goto L52
        L4f:
            r10 = move-exception
            goto L8b
        L51:
            r5 = r3
        L52:
            if (r5 == 0) goto L57
            r1.add(r6)     // Catch: java.lang.Throwable -> L4f
        L57:
            int r4 = r4 + 1
            goto L15
        L5a:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L66
            java.lang.String r10 = "[Hchat:HotUpdate] 未找到 TinkerLoader.tryLoadPatchFilesInternal"
            fb.v0.m(r10)     // Catch: java.lang.Throwable -> L4f
            goto L86
        L66:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L4f
        L6a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4f
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L4f
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L4f
            r1.getClass()     // Catch: java.lang.Throwable -> L4f
            aa.d r3 = new aa.d     // Catch: java.lang.Throwable -> L4f
            r4 = 4
            r3.<init>(r9, r1, r10, r4)     // Catch: java.lang.Throwable -> L4f
            r2.b(r1, r3)     // Catch: java.lang.Throwable -> L4f
            goto L6a
        L85:
            r3 = r5
        L86:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L4f
            goto L91
        L8b:
            sf.f r0 = new sf.f
            r0.<init>(r10)
            r10 = r0
        L91:
            java.lang.Throwable r0 = sf.g.b(r10)
            if (r0 == 0) goto La0
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "[Hchat:HotUpdate] Hook TinkerLoader 失败: "
            eh.a.x(r2, r1, r0)
        La0:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r10 instanceof sf.f
            if (r1 == 0) goto La7
            r10 = r0
        La7:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
    }

    public void y(java.lang.ClassLoader r7, org.luckypray.dexkit.DexKitBridge r8, android.content.SharedPreferences r9, java.lang.String r10) {
            r6 = this;
            e8.b r0 = e8.b.f2358a
            java.lang.String r1 = "upgrade_response"
            java.util.List r2 = e8.b.f(r9, r10, r7, r1)     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L28
        L11:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L28
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L28
            boolean r5 = F(r5)     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L11
            r3.add(r4)     // Catch: java.lang.Throwable -> L28
            goto L11
        L28:
            r7 = move-exception
            goto Lcf
        L2b:
            boolean r2 = r3.isEmpty()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L86
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            java.util.List r4 = v9.b.f14288f     // Catch: java.lang.Throwable -> L28
            fh.k.u0(r3, r4)     // Catch: java.lang.Throwable -> L28
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L28
            hh.p r8 = r8.findMethod(r2)     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L28
        L4f:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L86
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L28
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L28
            r2.getClass()     // Catch: java.lang.Throwable -> L67
            lh.d r2 = r2.p()     // Catch: java.lang.Throwable -> L67
            java.lang.reflect.Method r2 = r2.b(r7)     // Catch: java.lang.Throwable -> L67
            goto L6e
        L67:
            r2 = move-exception
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L28
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L28
            r2 = r4
        L6e:
            boolean r4 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L28
            r5 = 0
            if (r4 == 0) goto L75
            r2 = r5
        L75:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L80
            boolean r4 = F(r2)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L80
            r5 = r2
        L80:
            if (r5 == 0) goto L4f
            r3.add(r5)     // Catch: java.lang.Throwable -> L28
            goto L4f
        L86:
            boolean r7 = r3.isEmpty()     // Catch: java.lang.Throwable -> L28
            if (r7 != 0) goto L90
            r0.j(r9, r10, r1, r3)     // Catch: java.lang.Throwable -> L28
            goto Lb0
        L90:
            java.lang.String r7 = "cache.key"
            android.content.SharedPreferences$Editor r8 = r9.edit()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = ""
            java.lang.String r9 = r9.getString(r7, r0)     // Catch: java.lang.Throwable -> Lb0
            boolean r9 = gg.l.a(r9, r10)     // Catch: java.lang.Throwable -> Lb0
            if (r9 != 0) goto La9
            android.content.SharedPreferences$Editor r9 = r8.clear()     // Catch: java.lang.Throwable -> Lb0
            r9.putString(r7, r10)     // Catch: java.lang.Throwable -> Lb0
        La9:
            android.content.SharedPreferences$Editor r7 = r8.remove(r1)     // Catch: java.lang.Throwable -> Lb0
            r7.apply()     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            java.util.Iterator r7 = r3.iterator()     // Catch: java.lang.Throwable -> L28
        Lb4:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L28
            if (r8 == 0) goto Lcc
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L28
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L28
            r8.i r9 = r8.i.f11631b     // Catch: java.lang.Throwable -> L28
            v9.a r10 = new v9.a     // Catch: java.lang.Throwable -> L28
            r0 = 3
            r10.<init>(r6, r8, r0)     // Catch: java.lang.Throwable -> L28
            r9.b(r8, r10)     // Catch: java.lang.Throwable -> L28
            goto Lb4
        Lcc:
            sf.n r7 = sf.n.f12433a     // Catch: java.lang.Throwable -> L28
            goto Ld5
        Lcf:
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        Ld5:
            java.lang.Throwable r7 = sf.g.b(r7)
            if (r7 == 0) goto Le4
            java.lang.String r8 = r7.getMessage()
            java.lang.String r9 = "[Hchat:HotUpdate] Hook 热更新响应处理失败: "
            eh.a.x(r9, r8, r7)
        Le4:
            return
    }

    public void z(org.luckypray.dexkit.DexKitBridge r5, java.lang.ClassLoader r6, android.content.Context r7) {
            r4 = this;
            if (r7 == 0) goto L56
            if (r6 == 0) goto L56
            if (r5 != 0) goto L7
            goto L56
        L7:
            boolean r0 = C(r7)
            if (r0 != 0) goto Le
            goto L56
        Le:
            r4.A(r7, r6)
            int r0 = java.lang.System.identityHashCode(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            monitor-enter(r4)
            java.util.HashSet r1 = v9.b.f14291i     // Catch: java.lang.Throwable -> L53
            boolean r2 = r1.contains(r0)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L34
            monitor-exit(r4)
            return
        L34:
            java.lang.String r2 = "Hchat_hot_update_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r7, r2)     // Catch: java.lang.Throwable -> L53
            l8.i r7 = o8.k.a(r7, r6)     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r7.f7933h     // Catch: java.lang.Throwable -> L53
            uf.d r3 = v9.b.f14287e     // Catch: java.lang.Throwable -> L53
            r3.v(r6, r5, r2, r7)     // Catch: java.lang.Throwable -> L53
            r3.y(r6, r5, r2, r7)     // Catch: java.lang.Throwable -> L53
            r3.u(r6, r5, r2, r7)     // Catch: java.lang.Throwable -> L53
            r3.t(r6)     // Catch: java.lang.Throwable -> L53
            r1.add(r0)     // Catch: java.lang.Throwable -> L53
            monitor-exit(r4)
            return
        L53:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L56:
            return
    }
}
