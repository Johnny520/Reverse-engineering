package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r12 {

    /* JADX INFO: renamed from: Α */
    public java.lang.String f9202;

    /* JADX INFO: renamed from: Β */
    public p000.AbstractC1154 f9203;

    /* JADX INFO: renamed from: Γ */
    public java.lang.CharSequence f9204;

    /* JADX INFO: renamed from: Δ */
    public java.lang.CharSequence f9205;

    /* JADX INFO: renamed from: Ε */
    public android.content.res.ColorStateList f9206;

    /* JADX INFO: renamed from: Ζ */
    public android.graphics.PorterDuff.Mode f9207;

    /* JADX INFO: renamed from: Η */
    public final /* synthetic */ p000.s12 f9208;

    /* JADX INFO: renamed from: α */
    public final android.view.Menu f9209;

    /* JADX INFO: renamed from: β */
    public int f9210;

    /* JADX INFO: renamed from: γ */
    public int f9211;

    /* JADX INFO: renamed from: δ */
    public int f9212;

    /* JADX INFO: renamed from: ε */
    public int f9213;

    /* JADX INFO: renamed from: ζ */
    public boolean f9214;

    /* JADX INFO: renamed from: η */
    public boolean f9215;

    /* JADX INFO: renamed from: θ */
    public boolean f9216;

    /* JADX INFO: renamed from: ι */
    public int f9217;

    /* JADX INFO: renamed from: κ */
    public int f9218;

    /* JADX INFO: renamed from: λ */
    public java.lang.CharSequence f9219;

    /* JADX INFO: renamed from: μ */
    public java.lang.CharSequence f9220;

    /* JADX INFO: renamed from: ν */
    public int f9221;

    /* JADX INFO: renamed from: ξ */
    public char f9222;

    /* JADX INFO: renamed from: ο */
    public int f9223;

    /* JADX INFO: renamed from: π */
    public char f9224;

    /* JADX INFO: renamed from: ρ */
    public int f9225;

    /* JADX INFO: renamed from: σ */
    public int f9226;

    /* JADX INFO: renamed from: τ */
    public boolean f9227;

    /* JADX INFO: renamed from: υ */
    public boolean f9228;

    /* JADX INFO: renamed from: φ */
    public boolean f9229;

    /* JADX INFO: renamed from: χ */
    public int f9230;

    /* JADX INFO: renamed from: ψ */
    public int f9231;

    /* JADX INFO: renamed from: ω */
    public java.lang.String f9232;

    public r12(p000.s12 r1, android.view.Menu r2) {
            r0 = this;
            r0.<init>()
            r0.f9208 = r1
            r1 = 0
            r0.f9206 = r1
            r0.f9207 = r1
            r0.f9209 = r2
            r1 = 0
            r0.f9210 = r1
            r0.f9211 = r1
            r0.f9212 = r1
            r0.f9213 = r1
            r1 = 1
            r0.f9214 = r1
            r0.f9215 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Object m5049(java.lang.String r2, java.lang.Class[] r3, java.lang.Object[] r4) {
            r1 = this;
            s12 r1 = r1.f9208     // Catch: java.lang.Exception -> L1a
            android.content.Context r1 = r1.f9679     // Catch: java.lang.Exception -> L1a
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L1a
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.Exception -> L1a
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = r1.newInstance(r4)     // Catch: java.lang.Exception -> L1a
            return r1
        L1a:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot instantiate class: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "SupportMenuInflater"
            android.util.Log.w(r3, r2, r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final void m5050(android.view.MenuItem r9) {
            r8 = this;
            s12 r0 = r8.f9208
            android.content.Context r1 = r0.f9679
            boolean r2 = r8.f9227
            android.view.MenuItem r2 = r9.setChecked(r2)
            boolean r3 = r8.f9228
            android.view.MenuItem r2 = r2.setVisible(r3)
            boolean r3 = r8.f9229
            android.view.MenuItem r2 = r2.setEnabled(r3)
            int r3 = r8.f9226
            r4 = 0
            r5 = 1
            if (r3 < r5) goto L1e
            r3 = r5
            goto L1f
        L1e:
            r3 = r4
        L1f:
            android.view.MenuItem r2 = r2.setCheckable(r3)
            java.lang.CharSequence r3 = r8.f9220
            android.view.MenuItem r2 = r2.setTitleCondensed(r3)
            int r3 = r8.f9221
            r2.setIcon(r3)
            int r2 = r8.f9230
            if (r2 < 0) goto L35
            r9.setShowAsAction(r2)
        L35:
            java.lang.String r2 = r8.f9202
            if (r2 == 0) goto L8e
            boolean r2 = r1.isRestricted()
            if (r2 != 0) goto L88
            q12 r2 = new q12
            java.lang.Object r3 = r0.f9680
            if (r3 != 0) goto L4b
            java.lang.Object r1 = p000.s12.m5350(r1)
            r0.f9680 = r1
        L4b:
            java.lang.Object r1 = r0.f9680
            java.lang.String r3 = r8.f9202
            r2.<init>()
            r2.f8797 = r1
            java.lang.Class r1 = r1.getClass()
            java.lang.Class[] r6 = p000.q12.f8795     // Catch: java.lang.Exception -> L64
            java.lang.reflect.Method r6 = r1.getMethod(r3, r6)     // Catch: java.lang.Exception -> L64
            r2.f8798 = r6     // Catch: java.lang.Exception -> L64
            r9.setOnMenuItemClickListener(r2)
            goto L8e
        L64:
            r8 = move-exception
            android.view.InflateException r9 = new android.view.InflateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Couldn't resolve menu item onClick handler "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r2 = " in class "
            r0.append(r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            r9.initCause(r8)
            throw r9
        L88:
            java.lang.String r8 = "The android:onClick attribute cannot be used within a restricted context"
            p000.C1080.m7279(r8)
            return
        L8e:
            int r1 = r8.f9226
            r2 = 2
            if (r1 < r2) goto Ld8
            boolean r1 = r9 instanceof p000.lz0
            if (r1 == 0) goto La3
            r1 = r9
            lz0 r1 = (p000.lz0) r1
            int r2 = r1.f6876
            r2 = r2 & (-5)
            r2 = r2 | 4
            r1.f6876 = r2
            goto Ld8
        La3:
            boolean r1 = r9 instanceof androidx.appcompat.view.menu.MenuItemC0027
            if (r1 == 0) goto Ld8
            r1 = r9
            androidx.appcompat.view.menu.α r1 = (androidx.appcompat.view.menu.MenuItemC0027) r1
            t12 r2 = r1.f454
            java.lang.reflect.Method r3 = r1.f455     // Catch: java.lang.Exception -> Lc3
            if (r3 != 0) goto Lc5
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> Lc3
            java.lang.String r6 = "setExclusiveCheckable"
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> Lc3
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Exception -> Lc3
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r6, r7)     // Catch: java.lang.Exception -> Lc3
            r1.f455 = r3     // Catch: java.lang.Exception -> Lc3
            goto Lc5
        Lc3:
            r1 = move-exception
            goto Ld1
        Lc5:
            java.lang.reflect.Method r1 = r1.f455     // Catch: java.lang.Exception -> Lc3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lc3
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> Lc3
            r1.invoke(r2, r3)     // Catch: java.lang.Exception -> Lc3
            goto Ld8
        Ld1:
            java.lang.String r2 = "MenuItemWrapper"
            java.lang.String r3 = "Error while calling setExclusiveCheckable"
            android.util.Log.w(r2, r3, r1)
        Ld8:
            java.lang.String r1 = r8.f9232
            if (r1 == 0) goto Lea
            java.lang.Class[] r2 = p000.s12.f9675
            java.lang.Object[] r0 = r0.f9677
            java.lang.Object r0 = r8.m5049(r1, r2, r0)
            android.view.View r0 = (android.view.View) r0
            r9.setActionView(r0)
            r4 = r5
        Lea:
            int r0 = r8.f9231
            if (r0 <= 0) goto Lfb
            if (r4 != 0) goto Lf4
            r9.setActionView(r0)
            goto Lfb
        Lf4:
            java.lang.String r0 = "SupportMenuInflater"
            java.lang.String r1 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r0, r1)
        Lfb:
            ｘ r0 = r8.f9203
            if (r0 == 0) goto L111
            boolean r1 = r9 instanceof p000.t12
            if (r1 == 0) goto L10a
            r1 = r9
            t12 r1 = (p000.t12) r1
            r1.mo3667(r0)
            goto L111
        L10a:
            java.lang.String r0 = "MenuItemCompat"
            java.lang.String r1 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            android.util.Log.w(r0, r1)
        L111:
            java.lang.CharSequence r0 = r8.f9204
            boolean r1 = r9 instanceof p000.t12
            if (r1 == 0) goto L11e
            r2 = r9
            t12 r2 = (p000.t12) r2
            r2.setContentDescription(r0)
            goto L121
        L11e:
            r9.setContentDescription(r0)
        L121:
            java.lang.CharSequence r0 = r8.f9205
            if (r1 == 0) goto L12c
            r2 = r9
            t12 r2 = (p000.t12) r2
            r2.setTooltipText(r0)
            goto L12f
        L12c:
            r9.setTooltipText(r0)
        L12f:
            char r0 = r8.f9222
            int r2 = r8.f9223
            if (r1 == 0) goto L13c
            r3 = r9
            t12 r3 = (p000.t12) r3
            r3.setAlphabeticShortcut(r0, r2)
            goto L13f
        L13c:
            r9.setAlphabeticShortcut(r0, r2)
        L13f:
            char r0 = r8.f9224
            int r2 = r8.f9225
            if (r1 == 0) goto L14c
            r3 = r9
            t12 r3 = (p000.t12) r3
            r3.setNumericShortcut(r0, r2)
            goto L14f
        L14c:
            r9.setNumericShortcut(r0, r2)
        L14f:
            android.graphics.PorterDuff$Mode r0 = r8.f9207
            if (r0 == 0) goto L15f
            if (r1 == 0) goto L15c
            r2 = r9
            t12 r2 = (p000.t12) r2
            r2.setIconTintMode(r0)
            goto L15f
        L15c:
            r9.setIconTintMode(r0)
        L15f:
            android.content.res.ColorStateList r8 = r8.f9206
            if (r8 == 0) goto L16e
            if (r1 == 0) goto L16b
            t12 r9 = (p000.t12) r9
            r9.setIconTintList(r8)
            goto L16e
        L16b:
            r9.setIconTintList(r8)
        L16e:
            return
    }
}
