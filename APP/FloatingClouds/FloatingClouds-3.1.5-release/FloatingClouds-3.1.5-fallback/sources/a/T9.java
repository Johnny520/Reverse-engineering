package a;

/* JADX INFO: loaded from: classes.dex */
public final class T9 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile android.widget.ListView f277a;
    public boolean b;
    public boolean c;
    public float d;
    public float e;
    public final android.os.Handler f;
    public final a.Q9 g;
    public final int h;
    public boolean i;
    public final a.Q9 j;
    public final long k;
    public long l;
    public final long m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public float r;
    public float s;
    public final android.os.Handler t;
    public final a.Q9 u;
    public final a.Q9 v;

    public T9() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f = r0
            a.Q9 r0 = new a.Q9
            r1 = 0
            r0.<init>(r2, r1)
            r2.g = r0
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            r2.h = r0
            a.Q9 r0 = new a.Q9
            r1 = 1
            r0.<init>(r2, r1)
            r2.j = r0
            r0 = 180(0xb4, double:8.9E-322)
            r2.k = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r2.m = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.t = r0
            a.Q9 r0 = new a.Q9
            r1 = 2
            r0.<init>(r2, r1)
            r2.u = r0
            a.Q9 r0 = new a.Q9
            r1 = 3
            r0.<init>(r2, r1)
            r2.v = r0
            return
    }

    public static java.lang.reflect.Field d(java.lang.Class r1, java.lang.String r2) {
        L0:
            if (r1 == 0) goto L14
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L14
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Lf
            return r1
        Lf:
            java.lang.Class r1 = r1.getSuperclass()
            goto L0
        L14:
            r1 = 0
            return r1
    }

    public static boolean f(android.widget.AdapterView r16, android.view.View r17, int r18) {
            r1 = r18
            r2 = 1
            r3 = 0
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L366
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.j
            if (r0 == 0) goto L366
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.k
            if (r0 != 0) goto L21
            goto L366
        L21:
            if (r1 >= 0) goto L25
            goto L366
        L25:
            android.widget.Adapter r4 = r16.getAdapter()
            if (r4 != 0) goto L2d
            goto L366
        L2d:
            boolean r0 = r4 instanceof android.widget.HeaderViewListAdapter
            r5 = 0
            if (r0 == 0) goto L4d
            r0 = r4
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0     // Catch: java.lang.Throwable -> L3a
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()     // Catch: java.lang.Throwable -> L3a
            goto L3f
        L3a:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L3f:
            boolean r6 = r0 instanceof a.C0447wd.a
            if (r6 == 0) goto L44
            r0 = r5
        L44:
            android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
            if (r0 != 0) goto L4b
            r0 = r4
            android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
        L4b:
            r6 = r0
            goto L4e
        L4d:
            r6 = r4
        L4e:
            java.lang.Class r0 = r6.getClass()
            java.lang.String r7 = "d"
            java.lang.reflect.Field r0 = d(r0, r7)
            if (r0 != 0) goto L5c
        L5a:
            r0 = r5
            goto L6e
        L5c:
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L64
            goto L69
        L64:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L69:
            boolean r7 = r0 instanceof a.C0447wd.a
            if (r7 == 0) goto L6e
            goto L5a
        L6e:
            boolean r7 = r0 instanceof android.app.Activity
            if (r7 == 0) goto L75
            android.app.Activity r0 = (android.app.Activity) r0
            goto L76
        L75:
            r0 = r5
        L76:
            java.lang.String r7 = "LC_TRACE"
            if (r0 == 0) goto L91
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.SnsUserUI"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L91
            java.lang.String r0 = ">>> [ALBUM_HIT] SnsUserUI activity detected"
            android.util.Log.d(r7, r0)
            goto L109
        L91:
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<android.widget.BaseAdapter> r8 = android.widget.BaseAdapter.class
            boolean r8 = r8.isAssignableFrom(r0)
            if (r8 == 0) goto L338
            java.lang.String r8 = r0.getName()
            java.lang.String r9 = "com.tencent.mm.plugin.sns."
            boolean r8 = a.Ae.H(r8, r9, r3)
            if (r8 == 0) goto L338
            java.lang.reflect.Method[] r8 = r0.getDeclaredMethods()
            java.lang.String r9 = "getDeclaredMethods(...)"
            a.C0193i9.d(r8, r9)
            int r9 = r8.length
            r10 = r3
            r11 = r10
            r12 = r11
        Lb6:
            if (r10 >= r9) goto Lf8
            r13 = r8[r10]
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "getView"
            boolean r14 = a.C0193i9.a(r14, r15)
            if (r14 == 0) goto Ldd
            java.lang.Class[] r14 = r13.getParameterTypes()
            int r14 = r14.length
            r15 = 3
            if (r14 != r15) goto Ldd
            java.lang.Class[] r14 = r13.getParameterTypes()
            r14 = r14[r3]
            java.lang.Class r15 = java.lang.Integer.TYPE
            boolean r14 = a.C0193i9.a(r14, r15)
            if (r14 == 0) goto Ldd
            r11 = r2
        Ldd:
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "getCount"
            boolean r14 = a.C0193i9.a(r14, r15)
            if (r14 == 0) goto Lf6
            java.lang.Class[] r13 = r13.getParameterTypes()
            java.lang.String r14 = "getParameterTypes(...)"
            a.C0193i9.d(r13, r14)
            int r13 = r13.length
            if (r13 != 0) goto Lf6
            r12 = r2
        Lf6:
            int r10 = r10 + r2
            goto Lb6
        Lf8:
            if (r11 == 0) goto L338
            if (r12 == 0) goto L338
            java.lang.String r0 = r0.getName()
            java.lang.String r6 = ">>> [ALBUM_HIT] dynamic sns BaseAdapter: "
            java.lang.String r0 = r6.concat(r0)
            android.util.Log.d(r7, r0)
        L109:
            java.lang.Object r0 = r4.getItem(r1)     // Catch: java.lang.Throwable -> L10e
            goto L113
        L10e:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L113:
            boolean r4 = r0 instanceof a.C0447wd.a
            if (r4 == 0) goto L118
            r0 = r5
        L118:
            if (r0 != 0) goto L11c
            goto L366
        L11c:
            java.lang.String r4 = "local_"
            java.lang.String r6 = ">>> [FALLBACK] localId: local_"
            java.lang.String r8 = ">>> [BACKUP] field_snsId: "
            java.lang.String r9 = ">>> [SUCCESS] field_stringSeq: "
            java.lang.Class r10 = r0.getClass()
            java.lang.String r11 = "field_stringSeq"
            java.lang.reflect.Field r11 = d(r10, r11)
            if (r11 == 0) goto L159
            r11.setAccessible(r2)     // Catch: java.lang.Exception -> L159
            java.lang.Object r11 = r11.get(r0)     // Catch: java.lang.Exception -> L159
            if (r11 == 0) goto L13e
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L159
            goto L13f
        L13e:
            r11 = r5
        L13f:
            if (r11 == 0) goto L159
            int r12 = r11.length()     // Catch: java.lang.Exception -> L159
            if (r12 != 0) goto L148
            goto L159
        L148:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L159
            r12.<init>(r9)     // Catch: java.lang.Exception -> L159
            r12.append(r11)     // Catch: java.lang.Exception -> L159
            java.lang.String r9 = r12.toString()     // Catch: java.lang.Exception -> L159
            android.util.Log.d(r7, r9)     // Catch: java.lang.Exception -> L159
            goto L1f8
        L159:
            java.lang.String r9 = "field_snsId"
            java.lang.reflect.Field r9 = d(r10, r9)
            if (r9 == 0) goto L18b
            r9.setAccessible(r2)     // Catch: java.lang.Exception -> L18b
            java.lang.Object r9 = r9.get(r0)     // Catch: java.lang.Exception -> L18b
            if (r9 == 0) goto L170
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L18b
            r11 = r9
            goto L171
        L170:
            r11 = r5
        L171:
            if (r11 == 0) goto L18b
            int r9 = r11.length()     // Catch: java.lang.Exception -> L18b
            if (r9 != 0) goto L17a
            goto L18b
        L17a:
            java.lang.String r9 = "sns_table_"
            boolean r9 = a.Ae.H(r11, r9, r3)     // Catch: java.lang.Exception -> L18b
            if (r9 != 0) goto L18b
            java.lang.String r8 = r8.concat(r11)     // Catch: java.lang.Exception -> L18b
            android.util.Log.d(r7, r8)     // Catch: java.lang.Exception -> L18b
            goto L1f8
        L18b:
            java.lang.String r8 = "localid"
            java.lang.reflect.Field r9 = d(r10, r8)
            if (r9 == 0) goto L194
            goto L19e
        L194:
            java.lang.String r8 = "field_localId"
            java.lang.reflect.Field r9 = d(r10, r8)
            if (r9 == 0) goto L19d
            goto L19e
        L19d:
            r8 = r5
        L19e:
            if (r8 == 0) goto L1ea
            java.lang.reflect.Field r8 = d(r10, r8)
            if (r8 == 0) goto L1ea
            r8.setAccessible(r2)     // Catch: java.lang.Exception -> L1ea
            java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Exception -> L1ea
            if (r0 == 0) goto L1b4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1ea
            goto L1b5
        L1b4:
            r0 = r5
        L1b5:
            if (r0 == 0) goto L1ea
            int r8 = r0.length()     // Catch: java.lang.Exception -> L1ea
            if (r8 != 0) goto L1be
            goto L1ea
        L1be:
            java.lang.String r8 = "-1"
            boolean r8 = r0.equals(r8)     // Catch: java.lang.Exception -> L1ea
            if (r8 != 0) goto L1ea
            java.lang.String r8 = "0"
            boolean r8 = r0.equals(r8)     // Catch: java.lang.Exception -> L1ea
            if (r8 != 0) goto L1ea
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1ea
            r8.<init>(r6)     // Catch: java.lang.Exception -> L1ea
            r8.append(r0)     // Catch: java.lang.Exception -> L1ea
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Exception -> L1ea
            android.util.Log.w(r7, r6)     // Catch: java.lang.Exception -> L1ea
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1ea
            r6.<init>(r4)     // Catch: java.lang.Exception -> L1ea
            r6.append(r0)     // Catch: java.lang.Exception -> L1ea
            java.lang.String r11 = r6.toString()     // Catch: java.lang.Exception -> L1ea
            goto L1f8
        L1ea:
            java.lang.String r0 = r10.getName()
            java.lang.String r4 = ">>> [CRITICAL] All snsId strategies failed for "
            java.lang.String r0 = r4.concat(r0)
            android.util.Log.e(r7, r0)
            r11 = r5
        L1f8:
            if (r11 != 0) goto L1fc
            goto L366
        L1fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = ">>> [ALBUM_LONG_CLICK] position="
            r0.<init>(r4)
            r0.append(r1)
            java.lang.String r1 = " snsId="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r7, r0)
            android.content.Context r0 = r16.getContext()
            if (r0 != 0) goto L21f
            android.content.Context r0 = r17.getContext()
        L21f:
            if (r0 != 0) goto L223
            goto L337
        L223:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = ">>> [DIALOG_SHOW] building hide dialog, snsId="
            r4.<init>(r6)
            r4.append(r11)
            java.lang.String r6 = " context="
            r4.append(r6)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.d(r7, r1)
            java.lang.String r1 = "已识别朋友圈，弹出隐藏菜单"
            android.widget.Toast r1 = android.widget.Toast.makeText(r0, r1, r3)
            r1.show()
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r4 = 32
            if (r1 != r4) goto L25f
            r1 = r2
            goto L260
        L25f:
            r1 = r3
        L260:
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            r4.<init>(r0)
            java.lang.String r6 = "朋友圈隐藏"
            android.app.AlertDialog$Builder r4 = r4.setTitle(r6)
            java.lang.String r6 = "SnsId: "
            java.lang.String r6 = r6.concat(r11)
            android.app.AlertDialog$Builder r4 = r4.setMessage(r6)
            a.N9 r6 = new a.N9
            r6.<init>(r11, r0, r3)
            java.lang.String r8 = "复制"
            android.app.AlertDialog$Builder r4 = r4.setNeutralButton(r8, r6)
            a.O9 r6 = new a.O9
            r6.<init>(r3, r11)
            java.lang.String r8 = "加入隐藏"
            android.app.AlertDialog$Builder r4 = r4.setPositiveButton(r8, r6)
            java.lang.String r6 = "取消"
            android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r6, r5)
            android.app.AlertDialog r4 = r4.create()
            r4.setCanceledOnTouchOutside(r3)
            r4.show()
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L2c6
            r3.<init>()     // Catch: java.lang.Throwable -> L2c6
            r5 = -1
            if (r1 == 0) goto L2a7
            r6 = -13816531(0xffffffffff2d2d2d, float:-2.30191E38)
            goto L2a8
        L2a7:
            r6 = r5
        L2a8:
            r3.setColor(r6)     // Catch: java.lang.Throwable -> L2c6
            r6 = 16
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L2c6
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L2c6
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.Throwable -> L2c6
            float r0 = r0.density     // Catch: java.lang.Throwable -> L2c6
            float r6 = r6 * r0
            r3.setCornerRadius(r6)     // Catch: java.lang.Throwable -> L2c6
            android.view.Window r0 = r4.getWindow()     // Catch: java.lang.Throwable -> L2c6
            if (r0 == 0) goto L2c8
            r0.setBackgroundDrawable(r3)     // Catch: java.lang.Throwable -> L2c6
            goto L2c8
        L2c6:
            r0 = move-exception
            goto L31f
        L2c8:
            if (r1 == 0) goto L2ce
            r0 = -7288071(0xffffffffff90caf9, float:NaN)
            goto L2d1
        L2ce:
            r0 = -15108398(0xffffffffff1976d2, float:-2.0398883E38)
        L2d1:
            android.widget.Button r3 = r4.getButton(r5)     // Catch: java.lang.Throwable -> L2c6
            if (r3 == 0) goto L2da
            r3.setTextColor(r0)     // Catch: java.lang.Throwable -> L2c6
        L2da:
            r3 = -2
            android.widget.Button r3 = r4.getButton(r3)     // Catch: java.lang.Throwable -> L2c6
            if (r3 == 0) goto L2e4
            r3.setTextColor(r0)     // Catch: java.lang.Throwable -> L2c6
        L2e4:
            r3 = -3
            android.widget.Button r3 = r4.getButton(r3)     // Catch: java.lang.Throwable -> L2c6
            if (r3 == 0) goto L2ee
            r3.setTextColor(r0)     // Catch: java.lang.Throwable -> L2c6
        L2ee:
            if (r1 == 0) goto L2f4
            r0 = -2039584(0xffffffffffe0e0e0, float:NaN)
            goto L2f7
        L2f4:
            r0 = -14606047(0xffffffffff212121, float:-2.1417772E38)
        L2f7:
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r4.findViewById(r3)     // Catch: java.lang.Throwable -> L2c6
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> L2c6
            if (r3 == 0) goto L305
            r3.setTextColor(r0)     // Catch: java.lang.Throwable -> L2c6
        L305:
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r4.findViewById(r0)     // Catch: java.lang.Throwable -> L2c6
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch: java.lang.Throwable -> L2c6
            if (r0 == 0) goto L322
            if (r1 == 0) goto L316
            r1 = -6250336(0xffffffffffa0a0a0, float:NaN)
            goto L319
        L316:
            r1 = -7829368(0xffffffffff888888, float:NaN)
        L319:
            r0.setTextColor(r1)     // Catch: java.lang.Throwable -> L2c6
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L2c6
            goto L322
        L31f:
            a.C0465xd.a(r0)
        L322:
            boolean r0 = r4.isShowing()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = ">>> [DIALOG_SHOWN] dialog.show() returned, isShowing="
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r7, r0)
        L337:
            return r2
        L338:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = ">>> [ADAPTER_SKIP] "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = " -> "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " (not album)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r7, r0)
        L366:
            return r3
    }

    public final void a() {
            r2 = this;
            r0 = 0
            r2.b = r0
            r2.i = r0
            android.os.Handler r0 = r2.f
            a.Q9 r1 = r2.g
            r0.removeCallbacks(r1)
            a.Q9 r1 = r2.j
            r0.removeCallbacks(r1)
            return
    }

    public final boolean b() {
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r8.l
            long r4 = r0 - r2
            long r6 = r8.m
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L29
            long r0 = r0 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ">>> [DEDUP] long-press suppressed (within "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "ms)"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "LC_TRACE"
            android.util.Log.d(r1, r0)
            r0 = 0
            return r0
        L29:
            r8.l = r0
            r0 = 1
            return r0
    }

    public final boolean c(android.view.View r7) {
            r6 = this;
            r0 = 1
            r1 = 532676609(0x1fc00001, float:8.131517E-20)
            java.lang.Object r2 = r7.getTag(r1)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = a.C0193i9.a(r2, r3)
            r4 = 0
            if (r2 == 0) goto L12
            goto L78
        L12:
            boolean r2 = r7 instanceof android.widget.AdapterView
            if (r2 == 0) goto L4b
            boolean r1 = r7 instanceof android.widget.ListView
            if (r1 == 0) goto L1e
            r1 = r7
            android.widget.ListView r1 = (android.widget.ListView) r1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            r6.f277a = r1
            java.lang.Class r1 = r7.getClass()
            java.lang.String r1 = r1.getName()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r7 = r7.getChildCount()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ">>> [PATH2_LV_CAPTURED] "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " childCount="
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.String r1 = "LC_TRACE"
            android.util.Log.d(r1, r7)
            return r0
        L4b:
            boolean r2 = r7 instanceof android.view.ViewGroup
            if (r2 == 0) goto L78
            r7.setTag(r1, r3)
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r1 = r1.getChildCount()
            r2 = r4
        L5a:
            if (r2 >= r1) goto L78
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch: java.lang.Throwable -> L72
            android.view.View r3 = r3.getChildAt(r2)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "getChildAt(...)"
            a.C0193i9.d(r3, r5)     // Catch: java.lang.Throwable -> L72
            boolean r3 = r6.c(r3)     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L6f
            return r0
        L6f:
            a.Wf r3 = a.Wf.f330a     // Catch: java.lang.Throwable -> L72
            goto L76
        L72:
            r3 = move-exception
            a.C0465xd.a(r3)
        L76:
            int r2 = r2 + r0
            goto L5a
        L78:
            return r4
    }

    public final void e(android.app.Activity r3, android.view.View r4) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsUserUI"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L11
            goto L39
        L11:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = ">>> [PATH2_INJECT] start find ListView, root="
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "LC_TRACE"
            android.util.Log.d(r1, r0)
            r2.c(r4)
            boolean r4 = r2.n
            if (r4 == 0) goto L2c
            goto L39
        L2c:
            android.view.Window r3 = r3.getWindow()
            if (r3 != 0) goto L33
            goto L39
        L33:
            android.view.Window$Callback r4 = r3.getCallback()
            if (r4 != 0) goto L3a
        L39:
            return
        L3a:
            r0 = 1
            r2.n = r0
            a.S9 r0 = new a.S9
            r0.<init>(r4, r2)
            r3.setCallback(r0)
            java.lang.String r3 = ">>> [PATH3_WINDOW_CALLBACK] Window.Callback wrapped for SnsUserUI"
            android.util.Log.d(r1, r3)
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r8) {
            r7 = this;
            java.lang.String r0 = "LongClickInject: AdapterView.setOnItemLongClickListener hooked ("
            java.lang.String r1 = "session"
            a.C0193i9.e(r8, r1)
            java.lang.String r1 = "=== LongClickInject handleHook START (setOnItemLongClickListener inject) ==="
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a.C0453x1.b(r1)
            r1 = 2
            java.lang.String r3 = "android.widget.AdapterView"
            a.O8 r4 = new a.O8     // Catch: java.lang.Throwable -> L50
            r5 = 13
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L50
            a.P9 r5 = new a.P9     // Catch: java.lang.Throwable -> L50
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r3 = a.J8.b(r8, r3, r4, r5)     // Catch: java.lang.Throwable -> L50
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r4 != 0) goto L52
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L50
            r4.append(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L50
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L50
            goto L6d
        L50:
            r0 = move-exception
            goto L60
        L52:
            java.lang.String r0 = "LongClickInject: AdapterView.setOnItemLongClickListener hook FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L50
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L50
            goto L6d
        L60:
            java.lang.String r3 = "LongClickInject: hook setOnItemLongClickListener FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.a(r0)
        L6d:
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsUserUI"
            java.lang.String r3 = "onResume"
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L8b
            a.P9 r5 = new a.P9     // Catch: java.lang.Throwable -> L8b
            r6 = 1
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L8b
            a.J8.a(r8, r0, r3, r4, r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = "LongClickInject: SnsUserUI.onResume hooked (View long-click inject path2)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L8b
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L8b
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L8b
            goto L99
        L8b:
            r0 = move-exception
            java.lang.String r3 = "LongClickInject: hook SnsUserUI.onResume FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.a(r0)
        L99:
            java.lang.String r0 = "android.widget.AbsListView"
            java.lang.String r3 = "dispatchTouchEvent"
            java.lang.Class<android.view.MotionEvent> r4 = android.view.MotionEvent.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> Lba
            a.P9 r5 = new a.P9     // Catch: java.lang.Throwable -> Lba
            r6 = 2
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> Lba
            a.J8.a(r8, r0, r3, r4, r5)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r8 = "LongClickInject: AbsListView.dispatchTouchEvent hooked (self-timing long press)"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> Lba
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)     // Catch: java.lang.Throwable -> Lba
            a.C0453x1.b(r8)     // Catch: java.lang.Throwable -> Lba
            goto Lc8
        Lba:
            r8 = move-exception
            java.lang.String r0 = "LongClickInject: hook AbsListView.dispatchTouchEvent FAILED"
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r1)
            a.C0453x1.a(r8)
        Lc8:
            java.lang.String r8 = "=== LongClickInject handleHook DONE ==="
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r2)
            a.C0453x1.b(r8)
            return
    }
}
