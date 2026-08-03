package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7595 extends androidx.fragment.app.AbstractC7632 implements androidx.fragment.app.FragmentManager.InterfaceC7583, androidx.fragment.app.FragmentManager.InterfaceC7591 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final java.lang.String f29249 = "FragmentManager";

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final androidx.fragment.app.FragmentManager f29250;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public boolean f29251;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f29252;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public boolean f29253;

    public C7595(@Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r3) {
            r2 = this;
            androidx.fragment.app.ۥ۟۟۟ۡ r0 = r3.m29160()
            Yue.ۥ۠ۢۨ r1 = r3.m29163()
            if (r1 == 0) goto L17
            Yue.ۥ۠ۢۨ r1 = r3.m29163()
            android.content.Context r1 = r1.m12114()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L18
        L17:
            r1 = 0
        L18:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f29252 = r0
            r0 = 0
            r2.f29253 = r0
            r2.f29250 = r3
            return
    }

    public C7595(@Yue.InterfaceC4410 androidx.fragment.app.C7595 r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r3.f29250
            androidx.fragment.app.ۥ۟۟۟ۡ r0 = r0.m29160()
            androidx.fragment.app.FragmentManager r1 = r3.f29250
            Yue.ۥ۠ۢۨ r1 = r1.m29163()
            if (r1 == 0) goto L1d
            androidx.fragment.app.FragmentManager r1 = r3.f29250
            Yue.ۥ۠ۢۨ r1 = r1.m29163()
            android.content.Context r1 = r1.m12114()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r2.<init>(r0, r1, r3)
            r0 = -1
            r2.f29252 = r0
            r0 = 0
            r2.f29253 = r0
            androidx.fragment.app.FragmentManager r0 = r3.f29250
            r2.f29250 = r0
            boolean r0 = r3.f29251
            r2.f29251 = r0
            int r0 = r3.f29252
            r2.f29252 = r0
            boolean r3 = r3.f29253
            r2.f29253 = r3
            return
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC7583
    public int getId() {
            r1 = this;
            int r0 = r1.f29252
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC7583
    @Yue.InterfaceC4544
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f29404
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.f29252
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.f29252
            r0.append(r1)
        L25:
            java.lang.String r1 = r2.f29404
            if (r1 == 0) goto L33
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.f29404
            r0.append(r1)
        L33:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC7583
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ */
    public java.lang.CharSequence mo29240() {
            r2 = this;
            int r0 = r2.f29405
            if (r0 == 0) goto L15
            androidx.fragment.app.FragmentManager r0 = r2.f29250
            Yue.ۥ۠ۢۨ r0 = r0.m29163()
            android.content.Context r0 = r0.m12114()
            int r1 = r2.f29405
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
        L15:
            java.lang.CharSequence r0 = r2.f29406
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC7591
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo29244(@Yue.InterfaceC4410 java.util.ArrayList<androidx.fragment.app.C7595> r3, @Yue.InterfaceC4410 java.util.ArrayList<java.lang.Boolean> r4) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Run: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1d:
            r3.add(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.add(r3)
            boolean r3 = r2.f29402
            if (r3 == 0) goto L2e
            androidx.fragment.app.FragmentManager r3 = r2.f29250
            r3.m29092(r2)
        L2e:
            r3 = 1
            return r3
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC7583
    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo29241() {
            r1 = this;
            int r0 = r1.f29407
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC7583
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public int mo29242() {
            r1 = this;
            int r0 = r1.f29405
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC7583
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public java.lang.CharSequence mo29243() {
            r2 = this;
            int r0 = r2.f29407
            if (r0 == 0) goto L15
            androidx.fragment.app.FragmentManager r0 = r2.f29250
            Yue.ۥ۠ۢۨ r0 = r0.m29163()
            android.content.Context r0 = r0.m12114()
            int r1 = r2.f29407
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
        L15:
            java.lang.CharSequence r0 = r2.f29408
            return r0
    }

    @Override // androidx.fragment.app.AbstractC7632
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int mo29268() {
            r1 = this;
            r0 = 0
            int r0 = r1.m29282(r0)
            return r0
    }

    @Override // androidx.fragment.app.AbstractC7632
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int mo29269() {
            r1 = this;
            r0 = 1
            int r0 = r1.m29282(r0)
            return r0
    }

    @Override // androidx.fragment.app.AbstractC7632
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void mo29270() {
            r2 = this;
            r2.m29444()
            androidx.fragment.app.FragmentManager r0 = r2.f29250
            r1 = 0
            r0.m29141(r2, r1)
            return
    }

    @Override // androidx.fragment.app.AbstractC7632
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo29271() {
            r2 = this;
            r2.m29444()
            androidx.fragment.app.FragmentManager r0 = r2.f29250
            r1 = 1
            r0.m29141(r2, r1)
            return
    }

    @Override // androidx.fragment.app.AbstractC7632
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public androidx.fragment.app.AbstractC7632 mo29272(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L29
            androidx.fragment.app.FragmentManager r1 = r3.f29250
            if (r0 != r1) goto L9
            goto L29
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot detach Fragment attached to a different FragmentManager. Fragment "
            r1.append(r2)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = " is already attached to a FragmentManager."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L29:
            androidx.fragment.app.ۥ۟۟۠۟ r4 = super.mo29272(r4)
            return r4
    }

    @Override // androidx.fragment.app.AbstractC7632
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void mo29273(int r1, androidx.fragment.app.Fragment r2, @Yue.InterfaceC4544 java.lang.String r3, int r4) {
            r0 = this;
            super.mo29273(r1, r2, r3, r4)
            androidx.fragment.app.FragmentManager r1 = r0.f29250
            r2.mFragmentManager = r1
            return
    }

    @Override // androidx.fragment.app.AbstractC7632
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public androidx.fragment.app.AbstractC7632 mo29274(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L29
            androidx.fragment.app.FragmentManager r1 = r3.f29250
            if (r0 != r1) goto L9
            goto L29
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot hide Fragment attached to a different FragmentManager. Fragment "
            r1.append(r2)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = " is already attached to a FragmentManager."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L29:
            androidx.fragment.app.ۥ۟۟۠۟ r4 = super.mo29274(r4)
            return r4
    }

    @Override // androidx.fragment.app.AbstractC7632
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean mo29275() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r0 = r1.f29396
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // androidx.fragment.app.AbstractC7632
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public androidx.fragment.app.AbstractC7632 mo29276(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L29
            androidx.fragment.app.FragmentManager r1 = r3.f29250
            if (r0 != r1) goto L9
            goto L29
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot remove Fragment attached to a different FragmentManager. Fragment "
            r1.append(r2)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = " is already attached to a FragmentManager."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L29:
            androidx.fragment.app.ۥ۟۟۠۟ r4 = super.mo29276(r4)
            return r4
    }

    @Override // androidx.fragment.app.AbstractC7632
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public androidx.fragment.app.AbstractC7632 mo29277(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4, @Yue.InterfaceC4410 androidx.lifecycle.Lifecycle.State r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.f29250
            if (r0 != r1) goto L4f
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            java.lang.String r1 = "Cannot set maximum Lifecycle to "
            if (r5 != r0) goto L2c
            int r0 = r4.mState
            r2 = -1
            if (r0 > r2) goto L12
            goto L2c
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " after the Fragment has been created"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L2c:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r5 == r0) goto L35
            androidx.fragment.app.ۥ۟۟۠۟ r4 = super.mo29277(r4, r5)
            return r4
        L35:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L4f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Cannot setMaxLifecycle for Fragment not attached to FragmentManager "
            r5.append(r0)
            androidx.fragment.app.FragmentManager r0 = r3.f29250
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // androidx.fragment.app.AbstractC7632
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public androidx.fragment.app.AbstractC7632 mo29278(@Yue.InterfaceC4544 androidx.fragment.app.Fragment r4) {
            r3 = this;
            if (r4 == 0) goto L2b
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L2b
            androidx.fragment.app.FragmentManager r1 = r3.f29250
            if (r0 != r1) goto Lb
            goto L2b
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment "
            r1.append(r2)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = " is already attached to a FragmentManager."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2b:
            androidx.fragment.app.ۥ۟۟۠۟ r4 = super.mo29278(r4)
            return r4
    }

    @Override // androidx.fragment.app.AbstractC7632
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public androidx.fragment.app.AbstractC7632 mo29279(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L29
            androidx.fragment.app.FragmentManager r1 = r3.f29250
            if (r0 != r1) goto L9
            goto L29
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot show Fragment attached to a different FragmentManager. Fragment "
            r1.append(r2)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = " is already attached to a FragmentManager."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L29:
            androidx.fragment.app.ۥ۟۟۠۟ r4 = super.mo29279(r4)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m29280(int r8) {
            r7 = this;
            boolean r0 = r7.f29402
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.m29090(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Bump nesting in "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = " by "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L2a:
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r1 = r7.f29396
            int r1 = r1.size()
            r3 = 0
        L31:
            if (r3 >= r1) goto L6f
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r4 = r7.f29396
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r4 = (androidx.fragment.app.AbstractC7632.C7633) r4
            androidx.fragment.app.Fragment r5 = r4.f29414
            if (r5 == 0) goto L6c
            int r6 = r5.mBackStackNesting
            int r6 = r6 + r8
            r5.mBackStackNesting = r6
            boolean r5 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r5 == 0) goto L6c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Bump nesting of "
            r5.append(r6)
            androidx.fragment.app.Fragment r6 = r4.f29414
            r5.append(r6)
            java.lang.String r6 = " to "
            r5.append(r6)
            androidx.fragment.app.Fragment r4 = r4.f29414
            int r4 = r4.mBackStackNesting
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.v(r2, r4)
        L6c:
            int r3 = r3 + 1
            goto L31
        L6f:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m29281() {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r0 = r5.f29396
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L56
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r1 = r5.f29396
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r1 = (androidx.fragment.app.AbstractC7632.C7633) r1
            boolean r2 = r1.f29415
            if (r2 != 0) goto L17
            goto L53
        L17:
            int r2 = r1.f29413
            r3 = 8
            r4 = 0
            if (r2 != r3) goto L2a
            r1.f29415 = r4
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r1 = r5.f29396
            int r2 = r0 + (-1)
            r1.remove(r2)
            int r0 = r0 + (-1)
            goto L53
        L2a:
            androidx.fragment.app.Fragment r2 = r1.f29414
            int r2 = r2.mContainerId
            r3 = 2
            r1.f29413 = r3
            r1.f29415 = r4
            int r1 = r0 + (-1)
        L35:
            if (r1 < 0) goto L53
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r3 = r5.f29396
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r3 = (androidx.fragment.app.AbstractC7632.C7633) r3
            boolean r4 = r3.f29415
            if (r4 == 0) goto L50
            androidx.fragment.app.Fragment r3 = r3.f29414
            int r3 = r3.mContainerId
            if (r3 != r2) goto L50
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r3 = r5.f29396
            r3.remove(r1)
            int r0 = r0 + (-1)
        L50:
            int r1 = r1 + (-1)
            goto L35
        L53:
            int r0 = r0 + (-1)
            goto L8
        L56:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m29282(boolean r3) {
            r2 = this;
            boolean r0 = r2.f29251
            if (r0 != 0) goto L4e
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m29090(r0)
            if (r0 == 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Commit: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
            Yue.ۥۣ۠ۨۡ r0 = new Yue.ۥۣ۠ۨۡ
            r0.<init>(r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            java.lang.String r0 = "  "
            r2.m29283(r0, r1)
            r1.close()
        L33:
            r0 = 1
            r2.f29251 = r0
            boolean r0 = r2.f29402
            if (r0 == 0) goto L43
            androidx.fragment.app.FragmentManager r0 = r2.f29250
            int r0 = r0.m29097()
            r2.f29252 = r0
            goto L46
        L43:
            r0 = -1
            r2.f29252 = r0
        L46:
            androidx.fragment.app.FragmentManager r0 = r2.f29250
            r0.m29138(r2, r3)
            int r3 = r2.f29252
            return r3
        L4e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "commit already called"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29283(java.lang.String r2, java.io.PrintWriter r3) {
            r1 = this;
            r0 = 1
            r1.m29284(r2, r3, r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m29284(java.lang.String r6, java.io.PrintWriter r7, boolean r8) {
            r5 = this;
            if (r8 == 0) goto Lcc
            r7.print(r6)
            java.lang.String r0 = "mName="
            r7.print(r0)
            java.lang.String r0 = r5.f29404
            r7.print(r0)
            java.lang.String r0 = " mIndex="
            r7.print(r0)
            int r0 = r5.f29252
            r7.print(r0)
            java.lang.String r0 = " mCommitted="
            r7.print(r0)
            boolean r0 = r5.f29251
            r7.println(r0)
            int r0 = r5.f29401
            if (r0 == 0) goto L38
            r7.print(r6)
            java.lang.String r0 = "mTransition=#"
            r7.print(r0)
            int r0 = r5.f29401
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
        L38:
            int r0 = r5.f29397
            if (r0 != 0) goto L40
            int r0 = r5.f29398
            if (r0 == 0) goto L5f
        L40:
            r7.print(r6)
            java.lang.String r0 = "mEnterAnim=#"
            r7.print(r0)
            int r0 = r5.f29397
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r7.print(r0)
            int r0 = r5.f29398
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L5f:
            int r0 = r5.f29399
            if (r0 != 0) goto L67
            int r0 = r5.f29400
            if (r0 == 0) goto L86
        L67:
            r7.print(r6)
            java.lang.String r0 = "mPopEnterAnim=#"
            r7.print(r0)
            int r0 = r5.f29399
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r7.print(r0)
            int r0 = r5.f29400
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L86:
            int r0 = r5.f29405
            if (r0 != 0) goto L8e
            java.lang.CharSequence r0 = r5.f29406
            if (r0 == 0) goto La9
        L8e:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r7.print(r0)
            int r0 = r5.f29405
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.f29406
            r7.println(r0)
        La9:
            int r0 = r5.f29407
            if (r0 != 0) goto Lb1
            java.lang.CharSequence r0 = r5.f29408
            if (r0 == 0) goto Lcc
        Lb1:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r7.print(r0)
            int r0 = r5.f29407
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.f29408
            r7.println(r0)
        Lcc:
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r0 = r5.f29396
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L197
            r7.print(r6)
            java.lang.String r0 = "Operations:"
            r7.println(r0)
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r0 = r5.f29396
            int r0 = r0.size()
            r1 = 0
        Le3:
            if (r1 >= r0) goto L197
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r2 = r5.f29396
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r2 = (androidx.fragment.app.AbstractC7632.C7633) r2
            int r3 = r2.f29413
            switch(r3) {
                case 0: goto L124;
                case 1: goto L121;
                case 2: goto L11e;
                case 3: goto L11b;
                case 4: goto L118;
                case 5: goto L115;
                case 6: goto L112;
                case 7: goto L10f;
                case 8: goto L10c;
                case 9: goto L109;
                case 10: goto L106;
                default: goto Lf2;
            }
        Lf2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "cmd="
            r3.append(r4)
            int r4 = r2.f29413
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L126
        L106:
            java.lang.String r3 = "OP_SET_MAX_LIFECYCLE"
            goto L126
        L109:
            java.lang.String r3 = "UNSET_PRIMARY_NAV"
            goto L126
        L10c:
            java.lang.String r3 = "SET_PRIMARY_NAV"
            goto L126
        L10f:
            java.lang.String r3 = "ATTACH"
            goto L126
        L112:
            java.lang.String r3 = "DETACH"
            goto L126
        L115:
            java.lang.String r3 = "SHOW"
            goto L126
        L118:
            java.lang.String r3 = "HIDE"
            goto L126
        L11b:
            java.lang.String r3 = "REMOVE"
            goto L126
        L11e:
            java.lang.String r3 = "REPLACE"
            goto L126
        L121:
            java.lang.String r3 = "ADD"
            goto L126
        L124:
            java.lang.String r3 = "NULL"
        L126:
            r7.print(r6)
            java.lang.String r4 = "  Op #"
            r7.print(r4)
            r7.print(r1)
            java.lang.String r4 = ": "
            r7.print(r4)
            r7.print(r3)
            java.lang.String r3 = " "
            r7.print(r3)
            androidx.fragment.app.Fragment r3 = r2.f29414
            r7.println(r3)
            if (r8 == 0) goto L193
            int r3 = r2.f29416
            if (r3 != 0) goto L14d
            int r3 = r2.f29417
            if (r3 == 0) goto L16c
        L14d:
            r7.print(r6)
            java.lang.String r3 = "enterAnim=#"
            r7.print(r3)
            int r3 = r2.f29416
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " exitAnim=#"
            r7.print(r3)
            int r3 = r2.f29417
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.println(r3)
        L16c:
            int r3 = r2.f29418
            if (r3 != 0) goto L174
            int r3 = r2.f29419
            if (r3 == 0) goto L193
        L174:
            r7.print(r6)
            java.lang.String r3 = "popEnterAnim=#"
            r7.print(r3)
            int r3 = r2.f29418
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r7.print(r3)
            java.lang.String r3 = " popExitAnim=#"
            r7.print(r3)
            int r2 = r2.f29419
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r7.println(r2)
        L193:
            int r1 = r1 + 1
            goto Le3
        L197:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m29285() {
            r8 = this;
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r0 = r8.f29396
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto Ld7
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r3 = r8.f29396
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r3 = (androidx.fragment.app.AbstractC7632.C7633) r3
            androidx.fragment.app.Fragment r4 = r3.f29414
            if (r4 == 0) goto L29
            boolean r5 = r8.f29253
            r4.mBeingSaved = r5
            r4.setPopDirection(r1)
            int r5 = r8.f29401
            r4.setNextTransition(r5)
            java.util.ArrayList<java.lang.String> r5 = r8.f29409
            java.util.ArrayList<java.lang.String> r6 = r8.f29410
            r4.setSharedElementNames(r5, r6)
        L29:
            int r5 = r3.f29413
            switch(r5) {
                case 1: goto Lbe;
                case 2: goto L2e;
                case 3: goto Lad;
                case 4: goto L9c;
                case 5: goto L86;
                case 6: goto L75;
                case 7: goto L5f;
                case 8: goto L58;
                case 9: goto L50;
                case 10: goto L47;
                default: goto L2e;
            }
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown cmd: "
            r1.append(r2)
            int r2 = r3.f29413
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L47:
            androidx.fragment.app.FragmentManager r5 = r8.f29250
            androidx.lifecycle.Lifecycle$State r3 = r3.f29421
            r5.m29226(r4, r3)
            goto Ld3
        L50:
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r4 = 0
            r3.m29227(r4)
            goto Ld3
        L58:
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r3.m29227(r4)
            goto Ld3
        L5f:
            int r5 = r3.f29416
            int r6 = r3.f29417
            int r7 = r3.f29418
            int r3 = r3.f29419
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r3.m29224(r4, r1)
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r3.m29099(r4)
            goto Ld3
        L75:
            int r5 = r3.f29416
            int r6 = r3.f29417
            int r7 = r3.f29418
            int r3 = r3.f29419
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r3.m29110(r4)
            goto Ld3
        L86:
            int r5 = r3.f29416
            int r6 = r3.f29417
            int r7 = r3.f29418
            int r3 = r3.f29419
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r3.m29224(r4, r1)
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r3.m29231(r4)
            goto Ld3
        L9c:
            int r5 = r3.f29416
            int r6 = r3.f29417
            int r7 = r3.f29418
            int r3 = r3.f29419
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r3.m29172(r4)
            goto Ld3
        Lad:
            int r5 = r3.f29416
            int r6 = r3.f29417
            int r7 = r3.f29418
            int r3 = r3.f29419
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r3.m29206(r4)
            goto Ld3
        Lbe:
            int r5 = r3.f29416
            int r6 = r3.f29417
            int r7 = r3.f29418
            int r3 = r3.f29419
            r4.setAnimations(r5, r6, r7, r3)
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r3.m29224(r4, r1)
            androidx.fragment.app.FragmentManager r3 = r8.f29250
            r3.m29093(r4)
        Ld3:
            int r2 = r2 + 1
            goto L8
        Ld7:
            return
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m29286() {
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r0 = r7.f29396
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto Ldb
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r2 = r7.f29396
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r2 = (androidx.fragment.app.AbstractC7632.C7633) r2
            androidx.fragment.app.Fragment r3 = r2.f29414
            if (r3 == 0) goto L2d
            boolean r4 = r7.f29253
            r3.mBeingSaved = r4
            r3.setPopDirection(r1)
            int r4 = r7.f29401
            int r4 = androidx.fragment.app.FragmentManager.m29091(r4)
            r3.setNextTransition(r4)
            java.util.ArrayList<java.lang.String> r4 = r7.f29410
            java.util.ArrayList<java.lang.String> r5 = r7.f29409
            r3.setSharedElementNames(r4, r5)
        L2d:
            int r4 = r2.f29413
            switch(r4) {
                case 1: goto Lc2;
                case 2: goto L32;
                case 3: goto Lb1;
                case 4: goto La0;
                case 5: goto L8a;
                case 6: goto L79;
                case 7: goto L63;
                case 8: goto L5b;
                case 9: goto L54;
                case 10: goto L4b;
                default: goto L32;
            }
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Unknown cmd: "
            r1.append(r3)
            int r2 = r2.f29413
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4b:
            androidx.fragment.app.FragmentManager r4 = r7.f29250
            androidx.lifecycle.Lifecycle$State r2 = r2.f29420
            r4.m29226(r3, r2)
            goto Ld7
        L54:
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r2.m29227(r3)
            goto Ld7
        L5b:
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r3 = 0
            r2.m29227(r3)
            goto Ld7
        L63:
            int r4 = r2.f29416
            int r5 = r2.f29417
            int r6 = r2.f29418
            int r2 = r2.f29419
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r2.m29224(r3, r1)
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r2.m29110(r3)
            goto Ld7
        L79:
            int r4 = r2.f29416
            int r5 = r2.f29417
            int r6 = r2.f29418
            int r2 = r2.f29419
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r2.m29099(r3)
            goto Ld7
        L8a:
            int r4 = r2.f29416
            int r5 = r2.f29417
            int r6 = r2.f29418
            int r2 = r2.f29419
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r2.m29224(r3, r1)
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r2.m29172(r3)
            goto Ld7
        La0:
            int r4 = r2.f29416
            int r5 = r2.f29417
            int r6 = r2.f29418
            int r2 = r2.f29419
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r2.m29231(r3)
            goto Ld7
        Lb1:
            int r4 = r2.f29416
            int r5 = r2.f29417
            int r6 = r2.f29418
            int r2 = r2.f29419
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r2.m29093(r3)
            goto Ld7
        Lc2:
            int r4 = r2.f29416
            int r5 = r2.f29417
            int r6 = r2.f29418
            int r2 = r2.f29419
            r3.setAnimations(r4, r5, r6, r2)
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r2.m29224(r3, r1)
            androidx.fragment.app.FragmentManager r2 = r7.f29250
            r2.m29206(r3)
        Ld7:
            int r0 = r0 + (-1)
            goto L8
        Ldb:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29287(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r5 = r0.f29396
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r5 = r0.f29396
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r5 = (androidx.fragment.app.AbstractC7632.C7633) r5
            int r6 = r5.f29413
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r6 = r0.f29396
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r8 = new androidx.fragment.app.ۥ۟۟۠۟$ۥ
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f29415 = r7
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f29414
            goto Lbb
        L43:
            androidx.fragment.app.Fragment r6 = r5.f29414
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f29414
            if (r5 != r3) goto Lbb
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r3 = r0.f29396
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r6 = new androidx.fragment.app.ۥ۟۟۠۟$ۥ
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.Fragment r6 = r5.f29414
            int r8 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r3 = r0.f29396
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r15 = new androidx.fragment.app.ۥ۟۟۠۟$ۥ
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r15 = new androidx.fragment.app.ۥ۟۟۠۟$ۥ
            r15.<init>(r10, r14, r7)
            int r2 = r5.f29416
            r15.f29416 = r2
            int r2 = r5.f29418
            r15.f29418 = r2
            int r2 = r5.f29417
            r15.f29417 = r2
            int r2 = r5.f29419
            r15.f29419 = r2
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r2 = r0.f29396
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r2 = r0.f29396
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f29413 = r7
            r5.f29415 = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.Fragment r2 = r5.f29414
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m29288() {
            r2 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r2.f29412
            if (r0 == 0) goto L1e
            r0 = 0
        L5:
            java.util.ArrayList<java.lang.Runnable> r1 = r2.f29412
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<java.lang.Runnable> r1 = r2.f29412
            java.lang.Object r1 = r1.get(r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            int r0 = r0 + 1
            goto L5
        L1b:
            r0 = 0
            r2.f29412 = r0
        L1e:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public androidx.fragment.app.Fragment m29289(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r0 = r5.f29396
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟۠۟$ۥ> r2 = r5.f29396
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.ۥ۟۟۠۟$ۥ r2 = (androidx.fragment.app.AbstractC7632.C7633) r2
            int r3 = r2.f29413
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.Lifecycle$State r3 = r2.f29420
            r2.f29421 = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f29414
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f29414
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f29414
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
    }
}
