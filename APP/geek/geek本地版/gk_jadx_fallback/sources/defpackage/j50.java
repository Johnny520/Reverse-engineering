package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j50 {
    public java.lang.CharSequence A;
    public java.lang.CharSequence B;
    public android.content.res.ColorStateList C;
    public android.graphics.PorterDuff.Mode D;
    public final /* synthetic */ defpackage.k50 E;
    public final android.view.Menu a;
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
    public defpackage.pu z;

    public j50(defpackage.k50 r1, android.view.Menu r2) {
            r0 = this;
            r0.<init>()
            r0.E = r1
            r1 = 0
            r0.C = r1
            r0.D = r1
            r0.a = r2
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

    public final java.lang.Object a(java.lang.String r3, java.lang.Class[] r4, java.lang.Object[] r5) {
            r2 = this;
            k50 r0 = r2.E     // Catch: java.lang.Exception -> L1a
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
            k50 r0 = r8.E
            android.content.Context r1 = r0.c
            boolean r2 = r8.s
            android.view.MenuItem r2 = r9.setChecked(r2)
            boolean r3 = r8.t
            android.view.MenuItem r2 = r2.setVisible(r3)
            boolean r3 = r8.u
            android.view.MenuItem r2 = r2.setEnabled(r3)
            int r3 = r8.r
            r4 = 0
            r5 = 1
            if (r3 < r5) goto L1e
            r3 = r5
            goto L1f
        L1e:
            r3 = r4
        L1f:
            android.view.MenuItem r2 = r2.setCheckable(r3)
            java.lang.CharSequence r3 = r8.l
            android.view.MenuItem r2 = r2.setTitleCondensed(r3)
            int r3 = r8.m
            r2.setIcon(r3)
            int r2 = r8.v
            if (r2 < 0) goto L35
            r9.setShowAsAction(r2)
        L35:
            java.lang.String r2 = r8.y
            if (r2 == 0) goto L90
            boolean r2 = r1.isRestricted()
            if (r2 != 0) goto L88
            i50 r2 = new i50
            java.lang.Object r3 = r0.d
            if (r3 != 0) goto L4b
            java.lang.Object r1 = defpackage.k50.a(r1)
            r0.d = r1
        L4b:
            java.lang.Object r1 = r0.d
            java.lang.String r3 = r8.y
            r2.<init>()
            r2.b = r1
            java.lang.Class r1 = r1.getClass()
            java.lang.Class[] r6 = defpackage.i50.d     // Catch: java.lang.Exception -> L64
            java.lang.reflect.Method r6 = r1.getMethod(r3, r6)     // Catch: java.lang.Exception -> L64
            r2.c = r6     // Catch: java.lang.Exception -> L64
            r9.setOnMenuItemClickListener(r2)
            goto L90
        L64:
            r9 = move-exception
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Couldn't resolve menu item onClick handler "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = " in class "
            r2.append(r3)
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r0.initCause(r9)
            throw r0
        L88:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "The android:onClick attribute cannot be used within a restricted context"
            r9.<init>(r0)
            throw r9
        L90:
            int r1 = r8.r
            r2 = 2
            if (r1 < r2) goto Lda
            boolean r1 = r9 instanceof defpackage.ou
            if (r1 == 0) goto La5
            r1 = r9
            ou r1 = (defpackage.ou) r1
            int r2 = r1.x
            r2 = r2 & (-5)
            r2 = r2 | 4
            r1.x = r2
            goto Lda
        La5:
            boolean r1 = r9 instanceof defpackage.su
            if (r1 == 0) goto Lda
            r1 = r9
            su r1 = (defpackage.su) r1
            l50 r2 = r1.c
            java.lang.reflect.Method r3 = r1.d     // Catch: java.lang.Exception -> Lc5
            if (r3 != 0) goto Lc7
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> Lc5
            java.lang.String r6 = "setExclusiveCheckable"
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> Lc5
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Exception -> Lc5
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r6, r7)     // Catch: java.lang.Exception -> Lc5
            r1.d = r3     // Catch: java.lang.Exception -> Lc5
            goto Lc7
        Lc5:
            r1 = move-exception
            goto Ld3
        Lc7:
            java.lang.reflect.Method r1 = r1.d     // Catch: java.lang.Exception -> Lc5
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lc5
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> Lc5
            r1.invoke(r2, r3)     // Catch: java.lang.Exception -> Lc5
            goto Lda
        Ld3:
            java.lang.String r2 = "MenuItemWrapper"
            java.lang.String r3 = "Error while calling setExclusiveCheckable"
            android.util.Log.w(r2, r3, r1)
        Lda:
            java.lang.String r1 = r8.x
            if (r1 == 0) goto Lec
            java.lang.Class[] r2 = defpackage.k50.e
            java.lang.Object[] r0 = r0.a
            java.lang.Object r0 = r8.a(r1, r2, r0)
            android.view.View r0 = (android.view.View) r0
            r9.setActionView(r0)
            r4 = r5
        Lec:
            int r0 = r8.w
            if (r0 <= 0) goto Lfd
            if (r4 != 0) goto Lf6
            r9.setActionView(r0)
            goto Lfd
        Lf6:
            java.lang.String r0 = "SupportMenuInflater"
            java.lang.String r1 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r0, r1)
        Lfd:
            pu r0 = r8.z
            if (r0 == 0) goto L113
            boolean r1 = r9 instanceof defpackage.l50
            if (r1 == 0) goto L10c
            r1 = r9
            l50 r1 = (defpackage.l50) r1
            r1.a(r0)
            goto L113
        L10c:
            java.lang.String r0 = "MenuItemCompat"
            java.lang.String r1 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            android.util.Log.w(r0, r1)
        L113:
            java.lang.CharSequence r0 = r8.A
            boolean r1 = r9 instanceof defpackage.l50
            if (r1 == 0) goto L120
            r2 = r9
            l50 r2 = (defpackage.l50) r2
            r2.setContentDescription(r0)
            goto L123
        L120:
            defpackage.mu.h(r9, r0)
        L123:
            java.lang.CharSequence r0 = r8.B
            if (r1 == 0) goto L12e
            r2 = r9
            l50 r2 = (defpackage.l50) r2
            r2.setTooltipText(r0)
            goto L131
        L12e:
            defpackage.mu.m(r9, r0)
        L131:
            char r0 = r8.n
            int r2 = r8.o
            if (r1 == 0) goto L13e
            r3 = r9
            l50 r3 = (defpackage.l50) r3
            r3.setAlphabeticShortcut(r0, r2)
            goto L141
        L13e:
            defpackage.mu.g(r9, r0, r2)
        L141:
            char r0 = r8.p
            int r2 = r8.q
            if (r1 == 0) goto L14e
            r3 = r9
            l50 r3 = (defpackage.l50) r3
            r3.setNumericShortcut(r0, r2)
            goto L151
        L14e:
            defpackage.mu.k(r9, r0, r2)
        L151:
            android.graphics.PorterDuff$Mode r0 = r8.D
            if (r0 == 0) goto L161
            if (r1 == 0) goto L15e
            r2 = r9
            l50 r2 = (defpackage.l50) r2
            r2.setIconTintMode(r0)
            goto L161
        L15e:
            defpackage.mu.j(r9, r0)
        L161:
            android.content.res.ColorStateList r0 = r8.C
            if (r0 == 0) goto L170
            if (r1 == 0) goto L16d
            l50 r9 = (defpackage.l50) r9
            r9.setIconTintList(r0)
            goto L170
        L16d:
            defpackage.mu.i(r9, r0)
        L170:
            return
    }
}
