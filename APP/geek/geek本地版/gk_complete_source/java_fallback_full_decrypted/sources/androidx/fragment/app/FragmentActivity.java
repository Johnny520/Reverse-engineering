package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends androidx.activity.ComponentActivity {
    public final defpackage.l0 s;
    public final androidx.lifecycle.a t;
    public boolean u;
    public boolean v;
    public boolean w;

    public FragmentActivity() {
            r3 = this;
            r3.<init>()
            nl r0 = new nl
            r0.<init>(r3)
            l0 r1 = new l0
            r2 = 15
            r1.<init>(r2, r0)
            r3.s = r1
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>(r3)
            r3.t = r0
            r0 = 1
            r3.w = r0
            gm r0 = r3.e
            java.lang.Object r0 = r0.c
            a3 r0 = (defpackage.a3) r0
            s2 r1 = new s2
            r2 = 1
            r1.<init>(r3, r2)
            java.lang.String r2 = "android:support:fragments"
            r0.e(r2, r1)
            t2 r0 = new t2
            r1 = 1
            r0.<init>(r3, r1)
            r3.h(r0)
            return
    }

    public static boolean k(defpackage.yl r5) {
            r5 r5 = r5.c
            java.util.List r5 = r5.p()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        Lb:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r5.next()
            ml r1 = (defpackage.ml) r1
            if (r1 != 0) goto L1a
            goto Lb
        L1a:
            nl r2 = r1.s
            if (r2 != 0) goto L20
            r2 = 0
            goto L22
        L20:
            androidx.fragment.app.FragmentActivity r2 = r2.G
        L22:
            if (r2 == 0) goto L2d
            yl r2 = r1.g()
            boolean r2 = k(r2)
            r0 = r0 | r2
        L2d:
            fm r2 = r1.M
            r3 = 1
            jq r4 = defpackage.jq.d
            if (r2 == 0) goto L49
            r2.f()
            androidx.lifecycle.a r2 = r2.b
            jq r2 = r2.c
            int r2 = r2.compareTo(r4)
            if (r2 < 0) goto L49
            fm r0 = r1.M
            androidx.lifecycle.a r0 = r0.b
            r0.g()
            r0 = r3
        L49:
            androidx.lifecycle.a r2 = r1.L
            jq r2 = r2.c
            int r2 = r2.compareTo(r4)
            if (r2 < 0) goto Lb
            androidx.lifecycle.a r0 = r1.L
            r0.g()
            r0 = r3
            goto Lb
        L5a:
            return r0
    }

    @Override // android.app.Activity
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
            r6 = this;
            super.dump(r7, r8, r9, r10)
            r9.print(r7)
            java.lang.String r0 = "Local FragmentActivity "
            r9.print(r0)
            int r0 = java.lang.System.identityHashCode(r6)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r9.print(r0)
            java.lang.String r0 = " State:"
            r9.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.print(r0)
            java.lang.String r1 = "mCreated="
            r9.print(r1)
            boolean r1 = r6.u
            r9.print(r1)
            java.lang.String r1 = " mResumed="
            r9.print(r1)
            boolean r1 = r6.v
            r9.print(r1)
            java.lang.String r1 = " mStopped="
            r9.print(r1)
            boolean r1 = r6.w
            r9.print(r1)
            android.app.Application r1 = r6.getApplication()
            if (r1 == 0) goto Lf1
            ra0 r1 = r6.d()
            java.lang.String r2 = "store"
            defpackage.ip.o(r2, r1)
            se r2 = defpackage.se.b
            java.lang.String r3 = "defaultCreationExtras"
            defpackage.ip.o(r3, r2)
            java.lang.Class<pr> r3 = defpackage.pr.class
            java.lang.String r4 = r3.getCanonicalName()
            if (r4 == 0) goto Le9
            java.lang.String r5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r4 = r5.concat(r4)
            java.lang.String r5 = "key"
            defpackage.ip.o(r5, r4)
            java.util.LinkedHashMap r1 = r1.a
            java.lang.Object r5 = r1.get(r4)
            pa0 r5 = (defpackage.pa0) r5
            boolean r3 = r3.isInstance(r5)
            if (r3 == 0) goto L8a
            java.lang.String r1 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            defpackage.ip.m(r1, r5)
            goto Lb1
        L8a:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.LinkedHashMap r2 = r2.a
            r3.putAll(r2)
            vh r2 = defpackage.vh.p
            r3.put(r2, r4)
            pr r2 = new pr     // Catch: java.lang.AbstractMethodError -> La0
            r2.<init>()     // Catch: java.lang.AbstractMethodError -> La0
        L9e:
            r5 = r2
            goto La6
        La0:
            pr r2 = new pr
            r2.<init>()
            goto L9e
        La6:
            java.lang.Object r1 = r1.put(r4, r5)
            pa0 r1 = (defpackage.pa0) r1
            if (r1 == 0) goto Lb1
            r1.a()
        Lb1:
            pr r5 = (defpackage.pr) r5
            e40 r1 = r5.c
            int r2 = r1.c
            if (r2 <= 0) goto Lf1
            r9.print(r0)
            java.lang.String r2 = "Loaders:"
            r9.println(r2)
            int r2 = r1.c
            if (r2 > 0) goto Lc6
            goto Lf1
        Lc6:
            java.lang.Object[] r7 = r1.b
            r8 = 0
            r7 = r7[r8]
            if (r7 != 0) goto Le3
            r9.print(r0)
            java.lang.String r7 = "  #"
            r9.print(r7)
            int[] r7 = r1.a
            r7 = r7[r8]
            r9.print(r7)
            java.lang.String r7 = ": "
            r9.print(r7)
            r7 = 0
            throw r7
        Le3:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            r7.<init>()
            throw r7
        Le9:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Local and anonymous classes can not be ViewModels"
            r7.<init>(r8)
            throw r7
        Lf1:
            l0 r0 = r6.s
            java.lang.Object r0 = r0.b
            nl r0 = (defpackage.nl) r0
            yl r0 = r0.F
            r0.q(r7, r8, r9, r10)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            l0 r0 = r1.s
            r0.v()
            super.onActivityResult(r2, r3, r4)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            l0 r0 = r1.s
            r0.v()
            super.onConfigurationChanged(r2)
            java.lang.Object r2 = r0.b
            nl r2 = (defpackage.nl) r2
            yl r2 = r2.F
            r2.h()
            return
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            androidx.lifecycle.a r3 = r2.t
            iq r0 = defpackage.iq.ON_CREATE
            r3.d(r0)
            l0 r3 = r2.s
            java.lang.Object r3 = r3.b
            nl r3 = (defpackage.nl) r3
            yl r3 = r3.F
            r0 = 0
            r3.y = r0
            r3.z = r0
            am r1 = r3.F
            r1.h = r0
            r0 = 1
            r3.p(r0)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            r0 = 1
            if (r2 != 0) goto L15
            super.onCreatePanelMenu(r2, r3)
            r1.getMenuInflater()
            l0 r2 = r1.s
            java.lang.Object r2 = r2.b
            nl r2 = (defpackage.nl) r2
            yl r2 = r2.F
            r2.j()
            return r0
        L15:
            super.onCreatePanelMenu(r2, r3)
            return r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            l0 r0 = r1.s
            java.lang.Object r0 = r0.b
            nl r0 = (defpackage.nl) r0
            yl r0 = r0.F
            ql r0 = r0.f
            android.view.View r0 = r0.onCreateView(r2, r3, r4, r5)
            if (r0 != 0) goto L15
            android.view.View r2 = super.onCreateView(r2, r3, r4, r5)
            return r2
        L15:
            return r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r2 = this;
            l0 r0 = r2.s
            java.lang.Object r0 = r0.b
            nl r0 = (defpackage.nl) r0
            yl r0 = r0.F
            ql r0 = r0.f
            r1 = 0
            android.view.View r0 = r0.onCreateView(r1, r3, r4, r5)
            if (r0 != 0) goto L16
            android.view.View r3 = super.onCreateView(r3, r4, r5)
            return r3
        L16:
            return r0
    }

    @Override // android.app.Activity
    public void onDestroy() {
            r2 = this;
            super.onDestroy()
            l0 r0 = r2.s
            java.lang.Object r0 = r0.b
            nl r0 = (defpackage.nl) r0
            yl r0 = r0.F
            r0.k()
            androidx.lifecycle.a r0 = r2.t
            iq r1 = defpackage.iq.ON_DESTROY
            r0.d(r1)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
            r2 = this;
            super.onLowMemory()
            l0 r0 = r2.s
            java.lang.Object r0 = r0.b
            nl r0 = (defpackage.nl) r0
            yl r0 = r0.F
            r5 r0 = r0.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            ml r1 = (defpackage.ml) r1
            if (r1 == 0) goto L15
            r1.w()
            goto L15
        L27:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r3 = super.onMenuItemSelected(r2, r3)
            if (r3 == 0) goto L8
            r2 = 1
            return r2
        L8:
            l0 r3 = r1.s
            if (r2 == 0) goto L1c
            r0 = 6
            if (r2 == r0) goto L11
            r2 = 0
            return r2
        L11:
            java.lang.Object r2 = r3.b
            nl r2 = (defpackage.nl) r2
            yl r2 = r2.F
            boolean r2 = r2.i()
            return r2
        L1c:
            java.lang.Object r2 = r3.b
            nl r2 = (defpackage.nl) r2
            yl r2 = r2.F
            boolean r2 = r2.l()
            return r2
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onMultiWindowModeChanged(boolean r2) {
            r1 = this;
            l0 r2 = r1.s
            java.lang.Object r2 = r2.b
            nl r2 = (defpackage.nl) r2
            yl r2 = r2.F
            r5 r2 = r2.c
            java.util.List r2 = r2.p()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r2.next()
            ml r0 = (defpackage.ml) r0
            if (r0 == 0) goto L12
            r0.x()
            goto L12
        L24:
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(android.content.Intent r2) {
            r1 = this;
            l0 r0 = r1.s
            r0.v()
            super.onNewIntent(r2)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            if (r2 != 0) goto Ld
            l0 r0 = r1.s
            java.lang.Object r0 = r0.b
            nl r0 = (defpackage.nl) r0
            yl r0 = r0.F
            r0.m()
        Ld:
            super.onPanelClosed(r2, r3)
            return
    }

    @Override // android.app.Activity
    public final void onPause() {
            r2 = this;
            super.onPause()
            r0 = 0
            r2.v = r0
            l0 r0 = r2.s
            java.lang.Object r0 = r0.b
            nl r0 = (defpackage.nl) r0
            yl r0 = r0.F
            r1 = 5
            r0.p(r1)
            androidx.lifecycle.a r0 = r2.t
            iq r1 = defpackage.iq.ON_PAUSE
            r0.d(r1)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r2) {
            r1 = this;
            l0 r2 = r1.s
            java.lang.Object r2 = r2.b
            nl r2 = (defpackage.nl) r2
            yl r2 = r2.F
            r5 r2 = r2.c
            java.util.List r2 = r2.p()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r2.next()
            ml r0 = (defpackage.ml) r0
            if (r0 == 0) goto L12
            r0.y()
            goto L12
        L24:
            return
    }

    @Override // android.app.Activity
    public void onPostResume() {
            r3 = this;
            super.onPostResume()
            androidx.lifecycle.a r0 = r3.t
            iq r1 = defpackage.iq.ON_RESUME
            r0.d(r1)
            l0 r0 = r3.s
            java.lang.Object r0 = r0.b
            nl r0 = (defpackage.nl) r0
            yl r0 = r0.F
            r1 = 0
            r0.y = r1
            r0.z = r1
            am r2 = r0.F
            r2.h = r1
            r1 = 7
            r0.p(r1)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            r0 = 1
            if (r2 != 0) goto L13
            r2 = 0
            super.onPreparePanel(r2, r3, r4)
            l0 r2 = r1.s
            java.lang.Object r2 = r2.b
            nl r2 = (defpackage.nl) r2
            yl r2 = r2.F
            r2.o()
            return r0
        L13:
            super.onPreparePanel(r2, r3, r4)
            return r0
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            l0 r0 = r1.s
            r0.v()
            super.onRequestPermissionsResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    public final void onResume() {
            r2 = this;
            l0 r0 = r2.s
            r0.v()
            super.onResume()
            r1 = 1
            r2.v = r1
            java.lang.Object r0 = r0.b
            nl r0 = (defpackage.nl) r0
            yl r0 = r0.F
            r0.t(r1)
            return
    }

    @Override // android.app.Activity
    public void onStart() {
            r5 = this;
            l0 r0 = r5.s
            r0.v()
            java.lang.Object r0 = r0.b
            nl r0 = (defpackage.nl) r0
            super.onStart()
            r1 = 0
            r5.w = r1
            boolean r2 = r5.u
            r3 = 1
            if (r2 != 0) goto L24
            r5.u = r3
            yl r2 = r0.F
            r2.y = r1
            r2.z = r1
            am r4 = r2.F
            r4.h = r1
            r4 = 4
            r2.p(r4)
        L24:
            yl r2 = r0.F
            r2.t(r3)
            androidx.lifecycle.a r2 = r5.t
            iq r3 = defpackage.iq.ON_START
            r2.d(r3)
            yl r0 = r0.F
            r0.y = r1
            r0.z = r1
            am r2 = r0.F
            r2.h = r1
            r1 = 5
            r0.p(r1)
            return
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
            r1 = this;
            l0 r0 = r1.s
            r0.v()
            return
    }

    @Override // android.app.Activity
    public void onStop() {
            r3 = this;
            super.onStop()
            r0 = 1
            r3.w = r0
        L6:
            l0 r1 = r3.s
            java.lang.Object r2 = r1.b
            nl r2 = (defpackage.nl) r2
            yl r2 = r2.F
            boolean r2 = k(r2)
            if (r2 != 0) goto L6
            java.lang.Object r1 = r1.b
            nl r1 = (defpackage.nl) r1
            yl r1 = r1.F
            r1.z = r0
            am r2 = r1.F
            r2.h = r0
            r0 = 4
            r1.p(r0)
            androidx.lifecycle.a r0 = r3.t
            iq r1 = defpackage.iq.ON_STOP
            r0.d(r1)
            return
    }
}
