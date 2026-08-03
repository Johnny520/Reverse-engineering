package a;

/* JADX INFO: loaded from: classes.dex */
public final class S3 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile java.lang.String f252a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile java.lang.Class<?> d;
    public volatile java.lang.Object e;

    public static final class a extends android.widget.BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.widget.BaseAdapter f253a;
        public final java.lang.String b;
        public final android.content.Context c;
        public final java.lang.String d;

        public a(android.widget.BaseAdapter r2, java.lang.String r3, android.content.Context r4, java.lang.String r5) {
                r1 = this;
                java.lang.String r0 = "wxid"
                a.C0193i9.e(r3, r0)
                r1.<init>()
                r1.f253a = r2
                r1.b = r3
                r1.c = r4
                r1.d = r5
                return
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.widget.Adapter
        public final int getCount() {
                r1 = this;
                android.widget.BaseAdapter r0 = r1.f253a
                int r0 = r0.getCount()
                int r0 = r0 + 1
                return r0
        }

        @Override // android.widget.Adapter
        public final java.lang.Object getItem(int r3) {
                r2 = this;
                android.widget.BaseAdapter r0 = r2.f253a
                int r1 = r0.getCount()
                if (r3 >= r1) goto Ld
                java.lang.Object r3 = r0.getItem(r3)
                return r3
            Ld:
                return r2
        }

        @Override // android.widget.Adapter
        public final long getItemId(int r3) {
                r2 = this;
                android.widget.BaseAdapter r0 = r2.f253a
                int r1 = r0.getCount()
                if (r3 >= r1) goto Ld
                long r0 = r0.getItemId(r3)
                return r0
            Ld:
                r0 = -1
                return r0
        }

        @Override // android.widget.Adapter
        public final android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
                r2 = this;
                android.widget.BaseAdapter r0 = r2.f253a
                int r1 = r0.getCount()
                if (r3 >= r1) goto L12
                android.view.View r3 = r0.getView(r3, r4, r5)
                java.lang.String r4 = "getView(...)"
                a.C0193i9.d(r3, r4)
                return r3
            L12:
                android.content.Context r3 = r2.c
                android.content.res.Resources r5 = r3.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                float r5 = r5.density
                boolean r0 = r4 instanceof android.widget.TextView
                if (r0 == 0) goto L25
                android.widget.TextView r4 = (android.widget.TextView) r4
                goto L26
            L25:
                r4 = 0
            L26:
                if (r4 != 0) goto L2d
                android.widget.TextView r4 = new android.widget.TextView
                r4.<init>(r3)
            L2d:
                java.lang.String r3 = r2.d
                r4.setText(r3)
                r3 = 16
                r4.setGravity(r3)
                r0 = 24
                float r0 = (float) r0
                float r0 = r0 * r5
                int r1 = a.C0282n9.w(r0)
                float r3 = (float) r3
                float r3 = r3 * r5
                int r5 = a.C0282n9.w(r3)
                int r0 = a.C0282n9.w(r0)
                int r3 = a.C0282n9.w(r3)
                r4.setPadding(r1, r5, r0, r3)
                r3 = 1099431936(0x41880000, float:17.0)
                r4.setTextSize(r3)
                r3 = -15658735(0xffffffffff111111, float:-1.9282667E38)
                r4.setTextColor(r3)
                return r4
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    public static java.lang.String b(java.lang.Object r9) {
            java.lang.String r0 = "d"
            r1 = 0
            if (r9 != 0) goto L6
            goto L23
        L6:
            r2 = 1
            java.lang.Class r3 = r9.getClass()     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L17
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = r3.get(r9)     // Catch: java.lang.Throwable -> L17
            goto L1c
        L17:
            r9 = move-exception
            a.wd$a r9 = a.C0465xd.a(r9)
        L1c:
            boolean r3 = r9 instanceof a.C0447wd.a
            if (r3 == 0) goto L21
            r9 = r1
        L21:
            if (r9 != 0) goto L24
        L23:
            return r1
        L24:
            java.lang.String r3 = "d1"
            java.lang.String r4 = "getUsername"
            java.lang.String r5 = "getWxid"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0, r4, r5}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r3 = r0.hasNext()
            java.lang.String r4 = "toLowerCase(...)"
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            if (r3 == 0) goto L87
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class r6 = r9.getClass()
        L4a:
            if (r6 == 0) goto L36
            boolean r7 = r6.equals(r5)
            if (r7 != 0) goto L36
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r3, r1)     // Catch: java.lang.Throwable -> L64
            r7.setAccessible(r2)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r7 = r7.invoke(r9, r1)     // Catch: java.lang.Throwable -> L64
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L66
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L64
            goto L67
        L64:
            r7 = move-exception
            goto L7f
        L66:
            r7 = r1
        L67:
            if (r7 == 0) goto L7c
            boolean r8 = a.Be.P(r7)     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L70
            goto L7c
        L70:
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = r7.toLowerCase(r8)     // Catch: java.lang.Throwable -> L64
            a.C0193i9.d(r7, r4)     // Catch: java.lang.Throwable -> L64
        L79:
            r1 = r7
            goto Le6
        L7c:
            a.Wf r7 = a.Wf.f330a     // Catch: java.lang.Throwable -> L64
            goto L82
        L7f:
            a.C0465xd.a(r7)
        L82:
            java.lang.Class r6 = r6.getSuperclass()
            goto L4a
        L87:
            java.lang.String r0 = "field_username"
            java.lang.String r3 = "field_wxid"
            java.lang.String r6 = "username"
            java.lang.String r7 = "wxid"
            java.lang.String[] r0 = new java.lang.String[]{r6, r7, r0, r3}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r0 = r0.iterator()
        L9b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Le6
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class r6 = r9.getClass()
        Lab:
            if (r6 == 0) goto L9b
            boolean r7 = r6.equals(r5)
            if (r7 != 0) goto L9b
            java.lang.reflect.Field r7 = r6.getDeclaredField(r3)     // Catch: java.lang.Throwable -> Lc5
            r7.setAccessible(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.Throwable -> Lc5
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lc5
            if (r8 == 0) goto Lc7
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> Lc5
            goto Lc8
        Lc5:
            r7 = move-exception
            goto Lde
        Lc7:
            r7 = r1
        Lc8:
            if (r7 == 0) goto Ldb
            boolean r8 = a.Be.P(r7)     // Catch: java.lang.Throwable -> Lc5
            if (r8 == 0) goto Ld1
            goto Ldb
        Ld1:
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r7 = r7.toLowerCase(r8)     // Catch: java.lang.Throwable -> Lc5
            a.C0193i9.d(r7, r4)     // Catch: java.lang.Throwable -> Lc5
            goto L79
        Ldb:
            a.Wf r7 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lc5
            goto Le1
        Lde:
            a.C0465xd.a(r7)
        Le1:
            java.lang.Class r6 = r6.getSuperclass()
            goto Lab
        Le6:
            return r1
    }

    public final void a(java.lang.Object r10) {
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.Class r3 = r10.getClass()     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method[] r3 = r3.getMethods()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "getMethods(...)"
            a.C0193i9.d(r3, r4)     // Catch: java.lang.Throwable -> L2f
            int r4 = r3.length     // Catch: java.lang.Throwable -> L2f
            r5 = r2
        L12:
            if (r5 >= r4) goto L33
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = "getListView"
            boolean r7 = a.C0193i9.a(r7, r8)     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L31
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = "getParameterTypes(...)"
            a.C0193i9.d(r7, r8)     // Catch: java.lang.Throwable -> L2f
            int r7 = r7.length     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L31
            goto L34
        L2f:
            r3 = move-exception
            goto L43
        L31:
            int r5 = r5 + r0
            goto L12
        L33:
            r6 = r1
        L34:
            if (r6 == 0) goto L46
            java.lang.Object r3 = r6.invoke(r10, r1)     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r3 instanceof android.widget.ListView     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L41
            android.widget.ListView r3 = (android.widget.ListView) r3     // Catch: java.lang.Throwable -> L2f
            goto L7e
        L41:
            r3 = r1
            goto L7e
        L43:
            a.C0465xd.a(r3)
        L46:
            java.lang.Class r3 = r10.getClass()
            java.lang.reflect.Field[] r3 = r3.getDeclaredFields()
            java.lang.String r4 = "getDeclaredFields(...)"
            a.C0193i9.d(r3, r4)
            int r4 = r3.length
            r5 = r2
        L55:
            if (r5 >= r4) goto L41
            r6 = r3[r5]
            java.lang.Class<android.widget.ListView> r7 = android.widget.ListView.class
            java.lang.Class r8 = r6.getType()     // Catch: java.lang.Throwable -> L74
            boolean r7 = r7.isAssignableFrom(r8)     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L76
            r6.setAccessible(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.Object r6 = r6.get(r10)     // Catch: java.lang.Throwable -> L74
            boolean r7 = r6 instanceof android.widget.ListView     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L41
            android.widget.ListView r6 = (android.widget.ListView) r6     // Catch: java.lang.Throwable -> L74
            r3 = r6
            goto L7e
        L74:
            r6 = move-exception
            goto L79
        L76:
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L74
            goto L7c
        L79:
            a.C0465xd.a(r6)
        L7c:
            int r5 = r5 + r0
            goto L55
        L7e:
            if (r3 != 0) goto L81
            goto L87
        L81:
            android.widget.ListAdapter r0 = r3.getAdapter()
            if (r0 != 0) goto L88
        L87:
            return
        L88:
            boolean r3 = r0 instanceof android.widget.HeaderViewListAdapter
            if (r3 == 0) goto L92
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
        L92:
            boolean r0 = r0 instanceof a.S3.a
            if (r0 == 0) goto L9f
            r9.e = r10
            java.lang.String r10 = "ContactAddMask"
            java.lang.String r0 = "popup captured for our menu"
            android.util.Log.e(r10, r0)
        L9f:
            r9.b = r2
            r9.f252a = r1
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r18) {
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = 0
            r4 = 1
            java.lang.String r0 = "session"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = r2.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "handleHook START process="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "ContactAddMask"
            android.util.Log.e(r5, r0)
            java.lang.String r0 = r2.b
            java.lang.String r6 = "com.tencent.mm"
            boolean r0 = a.C0193i9.a(r0, r6)
            if (r0 != 0) goto L43
            java.lang.String r0 = r2.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "非主进程 "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "，跳过"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r5, r0)
            return
        L43:
            java.lang.String r7 = "getDeclaredMethods(...)"
            java.lang.String r8 = "tryHookYm5: F004_contact_add_mask resolve FAILED: "
            java.lang.String r9 = "adapter class not found: "
            java.lang.String r10 = "entry class not found: "
            java.lang.String r11 = "builder class not found: "
            java.lang.String r12 = "tryHookYm5: via=ENGINE path="
            boolean r0 = r1.c
            if (r0 == 0) goto L55
            goto L2a6
        L55:
            java.lang.ClassLoader r13 = r2.f136a
            if (r13 != 0) goto L5b
            goto L2a6
        L5b:
            a.fd r14 = new a.fd     // Catch: java.lang.Throwable -> L111
            int r0 = a.B1.f21a     // Catch: java.lang.Throwable -> L111
            r15 = -1
            if (r0 != r15) goto L80
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L111
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L111
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L111
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r3)     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L111
            int r15 = r0.versionCode     // Catch: java.lang.Exception -> L72 java.lang.Throwable -> L111
            goto L7e
        L72:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L111
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.lang.Throwable -> L111
            a.C0453x1.a(r0)     // Catch: java.lang.Throwable -> L111
        L7e:
            a.B1.f21a = r15     // Catch: java.lang.Throwable -> L111
        L80:
            int r0 = a.B1.f21a     // Catch: java.lang.Throwable -> L111
            r14.<init>(r0, r13)     // Catch: java.lang.Throwable -> L111
            a.hd r0 = a.C0179hd.f499a     // Catch: java.lang.Throwable -> L111
            java.lang.String r6 = "F004_contact_add_mask"
            r0.getClass()     // Catch: java.lang.Throwable -> L111
            a.gd r0 = a.C0179hd.a(r6, r14)     // Catch: java.lang.Throwable -> L111
            boolean r6 = r0.f485a     // Catch: java.lang.Throwable -> L111
            if (r6 == 0) goto L27f
            java.lang.Class<?> r6 = r0.b     // Catch: java.lang.Throwable -> L111
            if (r6 != 0) goto L9a
            goto L27f
        L9a:
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L111
            java.lang.String r8 = "builderClass"
            java.lang.Class r8 = r0.a(r8)     // Catch: java.lang.Throwable -> L111
            if (r8 == 0) goto L2a6
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L111
            java.lang.String r15 = "adapterClass"
            java.lang.Class r15 = r0.a(r15)     // Catch: java.lang.Throwable -> L111
            if (r15 == 0) goto L2a6
            java.lang.String r15 = r15.getName()     // Catch: java.lang.Throwable -> L111
            java.lang.String r14 = "clickListenerClass"
            java.lang.Class r14 = r0.a(r14)     // Catch: java.lang.Throwable -> L111
            if (r14 == 0) goto L2a6
            java.lang.String r14 = r14.getName()     // Catch: java.lang.Throwable -> L111
            a.cd r0 = r0.d     // Catch: java.lang.Throwable -> L111
            r16 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L111
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L111
            r4.append(r0)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = " builder="
            r4.append(r0)     // Catch: java.lang.Throwable -> L111
            r4.append(r8)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = " adapter="
            r4.append(r0)     // Catch: java.lang.Throwable -> L111
            r4.append(r15)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = " click="
            r4.append(r0)     // Catch: java.lang.Throwable -> L111
            r4.append(r14)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = " entry="
            r4.append(r0)     // Catch: java.lang.Throwable -> L111
            r4.append(r6)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L111
            android.util.Log.i(r5, r0)     // Catch: java.lang.Throwable -> L111
            java.lang.Class r0 = r13.loadClass(r8)     // Catch: java.lang.Throwable -> Lfa
            goto Lff
        Lfa:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L111
        Lff:
            boolean r4 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L111
            if (r4 == 0) goto L104
            r0 = 0
        L104:
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L111
            if (r0 != 0) goto L114
            java.lang.String r0 = r11.concat(r8)     // Catch: java.lang.Throwable -> L111
            android.util.Log.w(r5, r0)     // Catch: java.lang.Throwable -> L111
            goto L2a6
        L111:
            r0 = move-exception
            goto L297
        L114:
            java.lang.Class r0 = r13.loadClass(r6)     // Catch: java.lang.Throwable -> L119
            goto L11e
        L119:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L111
        L11e:
            boolean r4 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L111
            if (r4 == 0) goto L123
            r0 = 0
        L123:
            r4 = r0
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L111
            if (r4 != 0) goto L131
            java.lang.String r0 = r10.concat(r6)     // Catch: java.lang.Throwable -> L111
            android.util.Log.w(r5, r0)     // Catch: java.lang.Throwable -> L111
            goto L2a6
        L131:
            java.lang.Class r0 = r13.loadClass(r14)     // Catch: java.lang.Throwable -> L136
            goto L13b
        L136:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L111
        L13b:
            boolean r6 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L111
            if (r6 == 0) goto L140
            r0 = 0
        L140:
            r6 = r0
            java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Throwable -> L111
            java.lang.Class r0 = r13.loadClass(r15)     // Catch: java.lang.Throwable -> L148
            goto L14d
        L148:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L111
        L14d:
            boolean r8 = r0 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L111
            if (r8 == 0) goto L153
            r14 = 0
            goto L154
        L153:
            r14 = r0
        L154:
            java.lang.Class r14 = (java.lang.Class) r14     // Catch: java.lang.Throwable -> L111
            if (r14 != 0) goto L161
            java.lang.String r0 = r9.concat(r15)     // Catch: java.lang.Throwable -> L111
            android.util.Log.w(r5, r0)     // Catch: java.lang.Throwable -> L111
            goto L2a6
        L161:
            r1.d = r14     // Catch: java.lang.Throwable -> L111
            java.lang.reflect.Method[] r0 = r4.getDeclaredMethods()     // Catch: java.lang.Throwable -> L111
            a.C0193i9.d(r0, r7)     // Catch: java.lang.Throwable -> L111
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L111
            r4.<init>()     // Catch: java.lang.Throwable -> L111
            int r8 = r0.length     // Catch: java.lang.Throwable -> L111
            r9 = r3
        L171:
            if (r9 >= r8) goto L187
            r10 = r0[r9]     // Catch: java.lang.Throwable -> L111
            java.lang.String r11 = r10.getName()     // Catch: java.lang.Throwable -> L111
            java.lang.String r12 = "r"
            boolean r11 = a.C0193i9.a(r11, r12)     // Catch: java.lang.Throwable -> L111
            if (r11 == 0) goto L184
            r4.add(r10)     // Catch: java.lang.Throwable -> L111
        L184:
            int r9 = r9 + 1
            goto L171
        L187:
            java.util.Iterator r0 = r4.iterator()     // Catch: java.lang.Throwable -> L111
        L18b:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L111
            java.lang.String r8 = "F004"
            if (r4 == 0) goto L1a5
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L111
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L111
            a.C0193i9.b(r4)     // Catch: java.lang.Throwable -> L111
            a.R3 r9 = new a.R3     // Catch: java.lang.Throwable -> L111
            r9.<init>(r1, r3)     // Catch: java.lang.Throwable -> L111
            a.J8.h(r2, r8, r4, r9)     // Catch: java.lang.Throwable -> L111
            goto L18b
        L1a5:
            java.lang.Class<android.widget.ListView> r0 = android.widget.ListView.class
            java.lang.String r4 = "setAdapter"
            java.lang.Class<android.widget.ListAdapter> r9 = android.widget.ListAdapter.class
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L111
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r9)     // Catch: java.lang.Throwable -> L111
            a.C0193i9.b(r0)     // Catch: java.lang.Throwable -> L111
            a.R3 r4 = new a.R3     // Catch: java.lang.Throwable -> L111
            r9 = r16
            r4.<init>(r1, r9)     // Catch: java.lang.Throwable -> L111
            a.J8.h(r2, r8, r0, r4)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = "com.tencent.mm.ui.base.MMListPopupWindow"
            java.lang.Class r0 = r13.loadClass(r0)     // Catch: java.lang.Throwable -> L1ea
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L1ea
            a.C0193i9.d(r0, r7)     // Catch: java.lang.Throwable -> L1ea
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1ea
            r4.<init>()     // Catch: java.lang.Throwable -> L1ea
            int r7 = r0.length     // Catch: java.lang.Throwable -> L1ea
            r9 = r3
        L1d4:
            if (r9 >= r7) goto L1ef
            r10 = r0[r9]     // Catch: java.lang.Throwable -> L1ea
            java.lang.Class r11 = r10.getReturnType()     // Catch: java.lang.Throwable -> L1ea
            java.lang.Class r12 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L1ea
            boolean r11 = a.C0193i9.a(r11, r12)     // Catch: java.lang.Throwable -> L1ea
            if (r11 == 0) goto L1e7
            r4.add(r10)     // Catch: java.lang.Throwable -> L1ea
        L1e7:
            r16 = 1
            goto L1ec
        L1ea:
            r0 = move-exception
            goto L217
        L1ec:
            int r9 = r9 + 1
            goto L1d4
        L1ef:
            java.util.Iterator r0 = r4.iterator()     // Catch: java.lang.Throwable -> L1ea
        L1f3:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L1ea
            if (r4 == 0) goto L20c
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L1ea
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L1ea
            a.C0193i9.b(r4)     // Catch: java.lang.Throwable -> L1ea
            a.R3 r7 = new a.R3     // Catch: java.lang.Throwable -> L1ea
            r9 = 2
            r7.<init>(r1, r9)     // Catch: java.lang.Throwable -> L1ea
            a.J8.h(r2, r8, r4, r7)     // Catch: java.lang.Throwable -> L1ea
            goto L1f3
        L20c:
            java.lang.String r0 = "MMListPopupWindow capture hooks registered"
            int r0 = android.util.Log.e(r5, r0)     // Catch: java.lang.Throwable -> L1ea
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1ea
            goto L21b
        L217:
            a.wd$a r0 = a.C0465xd.a(r0)     // Catch: java.lang.Throwable -> L111
        L21b:
            java.lang.Throwable r0 = a.C0447wd.a(r0)     // Catch: java.lang.Throwable -> L111
            if (r0 == 0) goto L226
            java.lang.String r4 = "MMListPopupWindow hook fail"
            android.util.Log.e(r5, r4, r0)     // Catch: java.lang.Throwable -> L111
        L226:
            if (r6 == 0) goto L271
            java.lang.reflect.Method[] r0 = r6.getDeclaredMethods()     // Catch: java.lang.Throwable -> L111
            if (r0 == 0) goto L271
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L111
            r4.<init>()     // Catch: java.lang.Throwable -> L111
            int r6 = r0.length     // Catch: java.lang.Throwable -> L111
        L234:
            if (r3 >= r6) goto L254
            r7 = r0[r3]     // Catch: java.lang.Throwable -> L111
            java.lang.String r9 = r7.getName()     // Catch: java.lang.Throwable -> L111
            java.lang.String r10 = "onItemClick"
            boolean r9 = a.C0193i9.a(r9, r10)     // Catch: java.lang.Throwable -> L111
            if (r9 == 0) goto L24f
            java.lang.Class[] r9 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L111
            int r9 = r9.length     // Catch: java.lang.Throwable -> L111
            r10 = 4
            if (r9 != r10) goto L24f
            r4.add(r7)     // Catch: java.lang.Throwable -> L111
        L24f:
            r16 = 1
            int r3 = r3 + 1
            goto L234
        L254:
            java.util.Iterator r0 = r4.iterator()     // Catch: java.lang.Throwable -> L111
        L258:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L111
            if (r3 == 0) goto L271
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L111
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L111
            a.C0193i9.b(r3)     // Catch: java.lang.Throwable -> L111
            a.R3 r4 = new a.R3     // Catch: java.lang.Throwable -> L111
            r6 = 3
            r4.<init>(r1, r6)     // Catch: java.lang.Throwable -> L111
            a.J8.h(r2, r8, r3, r4)     // Catch: java.lang.Throwable -> L111
            goto L258
        L271:
            r9 = 1
            r1.c = r9     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = "ym5 hook OK (ah5.b0.r / ListView.setAdapter / MMListPopupWindow / ym5.i&r.onItemClick)"
            int r0 = android.util.Log.e(r5, r0)     // Catch: java.lang.Throwable -> L111
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L111
            goto L29b
        L27f:
            a.j6 r0 = r0.c     // Catch: java.lang.Throwable -> L111
            if (r0 == 0) goto L286
            java.lang.String r14 = r0.c     // Catch: java.lang.Throwable -> L111
            goto L287
        L286:
            r14 = 0
        L287:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L111
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L111
            r0.append(r14)     // Catch: java.lang.Throwable -> L111
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L111
            android.util.Log.w(r5, r0)     // Catch: java.lang.Throwable -> L111
            goto L2a6
        L297:
            a.wd$a r0 = a.C0465xd.a(r0)
        L29b:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L2a6
            java.lang.String r2 = "ym5 hook fail"
            android.util.Log.e(r5, r2, r0)
        L2a6:
            return
    }
}
