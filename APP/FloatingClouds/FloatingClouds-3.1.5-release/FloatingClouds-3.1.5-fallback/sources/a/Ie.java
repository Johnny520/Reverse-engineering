package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ie extends android.view.MenuInflater {
    public static final java.lang.Class<?>[] e = null;
    public static final java.lang.Class<?>[] f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f125a;
    public final java.lang.Object[] b;
    public final android.content.Context c;
    public java.lang.Object d;

    public static class a implements android.view.MenuItem.OnMenuItemClickListener {
        public static final java.lang.Class<?>[] c = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.Object f126a;
        public java.lang.reflect.Method b;

        static {
                java.lang.Class<android.view.MenuItem> r0 = android.view.MenuItem.class
                java.lang.Class[] r0 = new java.lang.Class[]{r0}
                a.Ie.a.c = r0
                return
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(android.view.MenuItem r5) {
                r4 = this;
                java.lang.reflect.Method r0 = r4.b
                java.lang.Class r1 = r0.getReturnType()     // Catch: java.lang.Exception -> L1b
                java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L1b
                java.lang.Object r3 = r4.f126a
                if (r1 != r2) goto L1d
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L1b
                java.lang.Object r5 = r0.invoke(r3, r5)     // Catch: java.lang.Exception -> L1b
                java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L1b
                boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L1b
                return r5
            L1b:
                r5 = move-exception
                goto L26
            L1d:
                java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L1b
                r0.invoke(r3, r5)     // Catch: java.lang.Exception -> L1b
                r5 = 1
                return r5
            L26:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r5)
                throw r0
        }
    }

    public class b {
        public java.lang.CharSequence A;
        public java.lang.CharSequence B;
        public android.content.res.ColorStateList C;
        public android.graphics.PorterDuff.Mode D;
        public final /* synthetic */ a.Ie E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.Menu f127a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public java.lang.CharSequence k;
        public java.lang.CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public java.lang.String x;
        public java.lang.String y;
        public a.Q z;

        public b(a.Ie r1, android.view.Menu r2) {
                r0 = this;
                r0.<init>()
                r0.E = r1
                r1 = 0
                r0.C = r1
                r0.D = r1
                r0.f127a = r2
                r1 = 0
                r0.b = r1
                r0.c = r1
                r0.d = r1
                r0.e = r1
                r1 = 1
                r0.f = r1
                r0.g = r1
                return
        }

        public final <T> T a(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object[] r5) {
                r2 = this;
                a.Ie r0 = r2.E     // Catch: java.lang.Exception -> L1a
                android.content.Context r0 = r0.c     // Catch: java.lang.Exception -> L1a
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L1a
                r1 = 0
                java.lang.Class r0 = java.lang.Class.forName(r3, r1, r0)     // Catch: java.lang.Exception -> L1a
                java.lang.reflect.Constructor r4 = r0.getConstructor(r4)     // Catch: java.lang.Exception -> L1a
                r0 = 1
                r4.setAccessible(r0)     // Catch: java.lang.Exception -> L1a
                java.lang.Object r3 = r4.newInstance(r5)     // Catch: java.lang.Exception -> L1a
                return r3
            L1a:
                r4 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r0 = "Cannot instantiate class: "
                r5.<init>(r0)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                java.lang.String r5 = "SupportMenuInflater"
                android.util.Log.w(r5, r3, r4)
                r3 = 0
                return r3
        }

        public final void b(android.view.MenuItem r9) {
                r8 = this;
                boolean r0 = r8.s
                android.view.MenuItem r0 = r9.setChecked(r0)
                boolean r1 = r8.t
                android.view.MenuItem r0 = r0.setVisible(r1)
                boolean r1 = r8.u
                android.view.MenuItem r0 = r0.setEnabled(r1)
                int r1 = r8.r
                r2 = 0
                r3 = 1
                if (r1 < r3) goto L1a
                r1 = r3
                goto L1b
            L1a:
                r1 = r2
            L1b:
                android.view.MenuItem r0 = r0.setCheckable(r1)
                java.lang.CharSequence r1 = r8.l
                android.view.MenuItem r0 = r0.setTitleCondensed(r1)
                int r1 = r8.m
                r0.setIcon(r1)
                int r0 = r8.v
                if (r0 < 0) goto L31
                r9.setShowAsAction(r0)
            L31:
                java.lang.String r0 = r8.y
                a.Ie r1 = r8.E
                if (r0 == 0) goto L92
                android.content.Context r0 = r1.c
                boolean r0 = r0.isRestricted()
                if (r0 != 0) goto L8a
                a.Ie$a r0 = new a.Ie$a
                java.lang.Object r4 = r1.d
                if (r4 != 0) goto L4d
                android.content.Context r4 = r1.c
                java.lang.Object r4 = a.Ie.a(r4)
                r1.d = r4
            L4d:
                java.lang.Object r4 = r1.d
                java.lang.String r5 = r8.y
                r0.<init>()
                r0.f126a = r4
                java.lang.Class r4 = r4.getClass()
                java.lang.Class<?>[] r6 = a.Ie.a.c     // Catch: java.lang.Exception -> L66
                java.lang.reflect.Method r6 = r4.getMethod(r5, r6)     // Catch: java.lang.Exception -> L66
                r0.b = r6     // Catch: java.lang.Exception -> L66
                r9.setOnMenuItemClickListener(r0)
                goto L92
            L66:
                r9 = move-exception
                android.view.InflateException r0 = new android.view.InflateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Couldn't resolve menu item onClick handler "
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = " in class "
                r1.append(r2)
                java.lang.String r2 = r4.getName()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                r0.initCause(r9)
                throw r0
            L8a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "The android:onClick attribute cannot be used within a restricted context"
                r9.<init>(r0)
                throw r9
            L92:
                int r0 = r8.r
                r4 = 2
                if (r0 < r4) goto Ldc
                boolean r0 = r9 instanceof androidx.appcompat.view.menu.h
                if (r0 == 0) goto La7
                r0 = r9
                androidx.appcompat.view.menu.h r0 = (androidx.appcompat.view.menu.h) r0
                int r4 = r0.x
                r4 = r4 & (-5)
                r4 = r4 | 4
                r0.x = r4
                goto Ldc
            La7:
                boolean r0 = r9 instanceof a.MenuItemC0105db
                if (r0 == 0) goto Ldc
                r0 = r9
                a.db r0 = (a.MenuItemC0105db) r0
                java.lang.reflect.Method r4 = r0.e     // Catch: java.lang.Exception -> Lc7
                a.Je r5 = r0.d
                if (r4 != 0) goto Lc9
                java.lang.Class r4 = r5.getClass()     // Catch: java.lang.Exception -> Lc7
                java.lang.String r6 = "setExclusiveCheckable"
                java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> Lc7
                java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Exception -> Lc7
                java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r7)     // Catch: java.lang.Exception -> Lc7
                r0.e = r4     // Catch: java.lang.Exception -> Lc7
                goto Lc9
            Lc7:
                r0 = move-exception
                goto Ld5
            Lc9:
                java.lang.reflect.Method r0 = r0.e     // Catch: java.lang.Exception -> Lc7
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lc7
                java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> Lc7
                r0.invoke(r5, r4)     // Catch: java.lang.Exception -> Lc7
                goto Ldc
            Ld5:
                java.lang.String r4 = "MenuItemWrapper"
                java.lang.String r5 = "Error while calling setExclusiveCheckable"
                android.util.Log.w(r4, r5, r0)
            Ldc:
                java.lang.String r0 = r8.x
                if (r0 == 0) goto Lee
                java.lang.Class<?>[] r2 = a.Ie.e
                java.lang.Object[] r1 = r1.f125a
                java.lang.Object r0 = r8.a(r0, r2, r1)
                android.view.View r0 = (android.view.View) r0
                r9.setActionView(r0)
                r2 = r3
            Lee:
                int r0 = r8.w
                if (r0 <= 0) goto Lff
                if (r2 != 0) goto Lf8
                r9.setActionView(r0)
                goto Lff
            Lf8:
                java.lang.String r0 = "SupportMenuInflater"
                java.lang.String r1 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
                android.util.Log.w(r0, r1)
            Lff:
                a.Q r0 = r8.z
                if (r0 == 0) goto L115
                boolean r1 = r9 instanceof a.Je
                if (r1 == 0) goto L10e
                r1 = r9
                a.Je r1 = (a.Je) r1
                r1.b(r0)
                goto L115
            L10e:
                java.lang.String r0 = "MenuItemCompat"
                java.lang.String r1 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
                android.util.Log.w(r0, r1)
            L115:
                java.lang.CharSequence r0 = r8.A
                boolean r1 = r9 instanceof a.Je
                if (r1 == 0) goto L122
                r2 = r9
                a.Je r2 = (a.Je) r2
                r2.setContentDescription(r0)
                goto L125
            L122:
                a.C0068bb.h(r9, r0)
            L125:
                java.lang.CharSequence r0 = r8.B
                if (r1 == 0) goto L130
                r2 = r9
                a.Je r2 = (a.Je) r2
                r2.setTooltipText(r0)
                goto L133
            L130:
                a.C0068bb.m(r9, r0)
            L133:
                char r0 = r8.n
                int r2 = r8.o
                if (r1 == 0) goto L140
                r3 = r9
                a.Je r3 = (a.Je) r3
                r3.setAlphabeticShortcut(r0, r2)
                goto L143
            L140:
                a.C0068bb.g(r9, r0, r2)
            L143:
                char r0 = r8.p
                int r2 = r8.q
                if (r1 == 0) goto L150
                r3 = r9
                a.Je r3 = (a.Je) r3
                r3.setNumericShortcut(r0, r2)
                goto L153
            L150:
                a.C0068bb.k(r9, r0, r2)
            L153:
                android.graphics.PorterDuff$Mode r0 = r8.D
                if (r0 == 0) goto L163
                if (r1 == 0) goto L160
                r2 = r9
                a.Je r2 = (a.Je) r2
                r2.setIconTintMode(r0)
                goto L163
            L160:
                a.C0068bb.j(r9, r0)
            L163:
                android.content.res.ColorStateList r0 = r8.C
                if (r0 == 0) goto L172
                if (r1 == 0) goto L16f
                a.Je r9 = (a.Je) r9
                r9.setIconTintList(r0)
                goto L172
            L16f:
                a.C0068bb.i(r9, r0)
            L172:
                return
        }
    }

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            a.Ie.e = r0
            a.Ie.f = r0
            return
    }

    public Ie(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.c = r1
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.f125a = r1
            r0.b = r1
            return
    }

    public static java.lang.Object a(java.lang.Object r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L5
            return r1
        L5:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L13
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            java.lang.Object r1 = a(r1)
        L13:
            return r1
    }

    public final void b(android.content.res.XmlResourceParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
            r16 = this;
            r0 = r16
            r1 = r18
            a.Ie$b r2 = new a.Ie$b
            r3 = r19
            r2.<init>(r0, r3)
            int r3 = r17.getEventType()
        Lf:
            r4 = 1
            r5 = 2
            java.lang.String r6 = "menu"
            if (r3 != r5) goto L30
            java.lang.String r3 = r17.getName()
            boolean r7 = r3.equals(r6)
            if (r7 == 0) goto L24
            int r3 = r17.next()
            goto L36
        L24:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Expecting menu, got "
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L30:
            int r3 = r17.next()
            if (r3 != r4) goto L292
        L36:
            r7 = 0
            r8 = 0
            r9 = r7
            r10 = r9
            r11 = r8
        L3b:
            if (r9 != 0) goto L291
            if (r3 == r4) goto L289
            java.lang.String r12 = "item"
            java.lang.String r13 = "group"
            if (r3 == r5) goto Lbc
            r14 = 3
            if (r3 == r14) goto L4c
        L48:
            r5 = r17
            goto L282
        L4c:
            java.lang.String r3 = r17.getName()
            if (r10 == 0) goto L5e
            boolean r14 = r3.equals(r11)
            if (r14 == 0) goto L5e
            r5 = r17
            r10 = r7
            r11 = r8
            goto L282
        L5e:
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L71
            r2.b = r7
            r2.c = r7
            r2.d = r7
            r2.e = r7
            r2.f = r4
            r2.g = r4
            goto L48
        L71:
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto Lb1
            boolean r3 = r2.h
            if (r3 != 0) goto L48
            a.Q r3 = r2.z
            if (r3 == 0) goto L9d
            boolean r3 = r3.a()
            if (r3 == 0) goto L9d
            r2.h = r4
            int r3 = r2.b
            int r12 = r2.i
            int r13 = r2.j
            java.lang.CharSequence r14 = r2.k
            android.view.Menu r15 = r2.f127a
            android.view.SubMenu r3 = r15.addSubMenu(r3, r12, r13, r14)
            android.view.MenuItem r3 = r3.getItem()
            r2.b(r3)
            goto L48
        L9d:
            r2.h = r4
            int r3 = r2.b
            int r12 = r2.i
            int r13 = r2.j
            java.lang.CharSequence r14 = r2.k
            android.view.Menu r15 = r2.f127a
            android.view.MenuItem r3 = r15.add(r3, r12, r13, r14)
            r2.b(r3)
            goto L48
        Lb1:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L48
            r5 = r17
            r9 = r4
            goto L282
        Lbc:
            if (r10 == 0) goto Lbf
            goto L48
        Lbf:
            java.lang.String r3 = r17.getName()
            boolean r13 = r3.equals(r13)
            a.Ie r14 = r2.E
            if (r13 == 0) goto L108
            android.content.Context r3 = r14.c
            int[] r12 = androidx.appcompat.R.styleable.MenuGroup
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r1, r12)
            int r12 = androidx.appcompat.R.styleable.MenuGroup_android_id
            int r12 = r3.getResourceId(r12, r7)
            r2.b = r12
            int r12 = androidx.appcompat.R.styleable.MenuGroup_android_menuCategory
            int r12 = r3.getInt(r12, r7)
            r2.c = r12
            int r12 = androidx.appcompat.R.styleable.MenuGroup_android_orderInCategory
            int r12 = r3.getInt(r12, r7)
            r2.d = r12
            int r12 = androidx.appcompat.R.styleable.MenuGroup_android_checkableBehavior
            int r12 = r3.getInt(r12, r7)
            r2.e = r12
            int r12 = androidx.appcompat.R.styleable.MenuGroup_android_visible
            boolean r12 = r3.getBoolean(r12, r4)
            r2.f = r12
            int r12 = androidx.appcompat.R.styleable.MenuGroup_android_enabled
            boolean r12 = r3.getBoolean(r12, r4)
            r2.g = r12
            r3.recycle()
            goto L48
        L108:
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L259
            android.content.Context r3 = r14.c
            int[] r12 = androidx.appcompat.R.styleable.MenuItem
            android.content.res.TypedArray r12 = r3.obtainStyledAttributes(r1, r12)
            int r13 = androidx.appcompat.R.styleable.MenuItem_android_id
            int r13 = r12.getResourceId(r13, r7)
            r2.i = r13
            int r13 = androidx.appcompat.R.styleable.MenuItem_android_menuCategory
            int r15 = r2.c
            int r13 = r12.getInt(r13, r15)
            int r15 = androidx.appcompat.R.styleable.MenuItem_android_orderInCategory
            int r5 = r2.d
            int r5 = r12.getInt(r15, r5)
            r15 = -65536(0xffffffffffff0000, float:NaN)
            r13 = r13 & r15
            r15 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r15
            r5 = r5 | r13
            r2.j = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_title
            java.lang.CharSequence r5 = r12.getText(r5)
            r2.k = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_titleCondensed
            java.lang.CharSequence r5 = r12.getText(r5)
            r2.l = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_icon
            int r5 = r12.getResourceId(r5, r7)
            r2.m = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_alphabeticShortcut
            java.lang.String r5 = r12.getString(r5)
            if (r5 != 0) goto L15a
            r5 = r7
            goto L15e
        L15a:
            char r5 = r5.charAt(r7)
        L15e:
            r2.n = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_alphabeticModifiers
            r13 = 4096(0x1000, float:5.74E-42)
            int r5 = r12.getInt(r5, r13)
            r2.o = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_numericShortcut
            java.lang.String r5 = r12.getString(r5)
            if (r5 != 0) goto L174
            r5 = r7
            goto L178
        L174:
            char r5 = r5.charAt(r7)
        L178:
            r2.p = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_numericModifiers
            int r5 = r12.getInt(r5, r13)
            r2.q = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_checkable
            boolean r5 = r12.hasValue(r5)
            if (r5 == 0) goto L193
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_checkable
            boolean r5 = r12.getBoolean(r5, r7)
            r2.r = r5
            goto L197
        L193:
            int r5 = r2.e
            r2.r = r5
        L197:
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_checked
            boolean r5 = r12.getBoolean(r5, r7)
            r2.s = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_visible
            boolean r13 = r2.f
            boolean r5 = r12.getBoolean(r5, r13)
            r2.t = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_enabled
            boolean r13 = r2.g
            boolean r5 = r12.getBoolean(r5, r13)
            r2.u = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_showAsAction
            r13 = -1
            int r5 = r12.getInt(r5, r13)
            r2.v = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_android_onClick
            java.lang.String r5 = r12.getString(r5)
            r2.y = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_actionLayout
            int r5 = r12.getResourceId(r5, r7)
            r2.w = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_actionViewClass
            java.lang.String r5 = r12.getString(r5)
            r2.x = r5
            int r5 = androidx.appcompat.R.styleable.MenuItem_actionProviderClass
            java.lang.String r5 = r12.getString(r5)
            if (r5 == 0) goto L1de
            r15 = r4
            goto L1df
        L1de:
            r15 = r7
        L1df:
            if (r15 == 0) goto L1f6
            int r4 = r2.w
            if (r4 != 0) goto L1f6
            java.lang.String r4 = r2.x
            if (r4 != 0) goto L1f6
            java.lang.Class<?>[] r4 = a.Ie.f
            java.lang.Object[] r14 = r14.b
            java.lang.Object r4 = r2.a(r5, r4, r14)
            a.Q r4 = (a.Q) r4
            r2.z = r4
            goto L201
        L1f6:
            if (r15 == 0) goto L1ff
            java.lang.String r4 = "SupportMenuInflater"
            java.lang.String r5 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r4, r5)
        L1ff:
            r2.z = r8
        L201:
            int r4 = androidx.appcompat.R.styleable.MenuItem_contentDescription
            java.lang.CharSequence r4 = r12.getText(r4)
            r2.A = r4
            int r4 = androidx.appcompat.R.styleable.MenuItem_tooltipText
            java.lang.CharSequence r4 = r12.getText(r4)
            r2.B = r4
            int r4 = androidx.appcompat.R.styleable.MenuItem_iconTintMode
            boolean r4 = r12.hasValue(r4)
            if (r4 == 0) goto L228
            int r4 = androidx.appcompat.R.styleable.MenuItem_iconTintMode
            int r4 = r12.getInt(r4, r13)
            android.graphics.PorterDuff$Mode r5 = r2.D
            android.graphics.PorterDuff$Mode r4 = a.C0457x5.c(r4, r5)
            r2.D = r4
            goto L22a
        L228:
            r2.D = r8
        L22a:
            int r4 = androidx.appcompat.R.styleable.MenuItem_iconTint
            boolean r4 = r12.hasValue(r4)
            if (r4 == 0) goto L24e
            int r4 = androidx.appcompat.R.styleable.MenuItem_iconTint
            boolean r5 = r12.hasValue(r4)
            if (r5 == 0) goto L247
            int r5 = r12.getResourceId(r4, r7)
            if (r5 == 0) goto L247
            android.content.res.ColorStateList r3 = a.Y3.a(r3, r5)
            if (r3 == 0) goto L247
            goto L24b
        L247:
            android.content.res.ColorStateList r3 = r12.getColorStateList(r4)
        L24b:
            r2.C = r3
            goto L250
        L24e:
            r2.C = r8
        L250:
            r12.recycle()
            r2.h = r7
            r5 = r17
            r4 = 1
            goto L282
        L259:
            boolean r4 = r3.equals(r6)
            if (r4 == 0) goto L27d
            r4 = 1
            r2.h = r4
            int r3 = r2.b
            int r5 = r2.i
            int r12 = r2.j
            java.lang.CharSequence r13 = r2.k
            android.view.Menu r14 = r2.f127a
            android.view.SubMenu r3 = r14.addSubMenu(r3, r5, r12, r13)
            android.view.MenuItem r5 = r3.getItem()
            r2.b(r5)
            r5 = r17
            r0.b(r5, r1, r3)
            goto L282
        L27d:
            r5 = r17
            r4 = 1
            r11 = r3
            r10 = r4
        L282:
            int r3 = r5.next()
            r5 = 2
            goto L3b
        L289:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected end of document"
            r1.<init>(r2)
            throw r1
        L291:
            return
        L292:
            r5 = r17
            goto Lf
    }

    @Override // android.view.MenuInflater
    public final void inflate(int r6, android.view.Menu r7) {
            r5 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r7 instanceof a.He
            if (r1 != 0) goto La
            super.inflate(r6, r7)
            return
        La:
            r1 = 0
            r2 = 0
            android.content.Context r3 = r5.c     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            android.content.res.XmlResourceParser r1 = r3.getLayout(r6)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            boolean r3 = r7 instanceof androidx.appcompat.view.menu.f     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            if (r3 == 0) goto L30
            r3 = r7
            androidx.appcompat.view.menu.f r3 = (androidx.appcompat.view.menu.f) r3     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            boolean r4 = r3.p     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            if (r4 != 0) goto L30
            r3.w()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            r2 = 1
            goto L30
        L2a:
            r6 = move-exception
            goto L4a
        L2c:
            r6 = move-exception
            goto L3e
        L2e:
            r6 = move-exception
            goto L44
        L30:
            r5.b(r1, r6, r7)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c org.xmlpull.v1.XmlPullParserException -> L2e
            if (r2 == 0) goto L3a
            androidx.appcompat.view.menu.f r7 = (androidx.appcompat.view.menu.f) r7
            r7.v()
        L3a:
            r1.close()
            return
        L3e:
            android.view.InflateException r3 = new android.view.InflateException     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r0, r6)     // Catch: java.lang.Throwable -> L2a
            throw r3     // Catch: java.lang.Throwable -> L2a
        L44:
            android.view.InflateException r3 = new android.view.InflateException     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r0, r6)     // Catch: java.lang.Throwable -> L2a
            throw r3     // Catch: java.lang.Throwable -> L2a
        L4a:
            if (r2 == 0) goto L51
            androidx.appcompat.view.menu.f r7 = (androidx.appcompat.view.menu.f) r7
            r7.v()
        L51:
            if (r1 == 0) goto L56
            r1.close()
        L56:
            throw r6
    }
}
