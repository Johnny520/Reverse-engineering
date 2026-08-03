package a;

/* JADX INFO: renamed from: a.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0206j5 extends androidx.fragment.app.b implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    public android.os.Handler V;
    public final a.DialogInterfaceOnCancelListenerC0206j5.a W;
    public final a.DialogInterfaceOnCancelListenerC0206j5.b X;
    public final a.DialogInterfaceOnCancelListenerC0206j5.c Y;
    public int Z;
    public int a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public boolean e0;
    public final a.DialogInterfaceOnCancelListenerC0206j5.d f0;
    public android.app.Dialog g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;

    /* JADX INFO: renamed from: a.j5$a */
    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.DialogInterfaceOnCancelListenerC0206j5 f523a;

        public a(a.DialogInterfaceOnCancelListenerC0206j5 r1) {
                r0 = this;
                r0.<init>()
                r0.f523a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                a.j5 r0 = r2.f523a
                a.j5$c r1 = r0.Y
                android.app.Dialog r0 = r0.g0
                r1.onDismiss(r0)
                return
        }
    }

    /* JADX INFO: renamed from: a.j5$b */
    public class b implements android.content.DialogInterface.OnCancelListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.DialogInterfaceOnCancelListenerC0206j5 f524a;

        public b(a.DialogInterfaceOnCancelListenerC0206j5 r1) {
                r0 = this;
                r0.<init>()
                r0.f524a = r1
                return
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(android.content.DialogInterface r2) {
                r1 = this;
                a.j5 r2 = r1.f524a
                android.app.Dialog r0 = r2.g0
                if (r0 == 0) goto L9
                r2.onCancel(r0)
            L9:
                return
        }
    }

    /* JADX INFO: renamed from: a.j5$c */
    public class c implements android.content.DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.DialogInterfaceOnCancelListenerC0206j5 f525a;

        public c(a.DialogInterfaceOnCancelListenerC0206j5 r1) {
                r0 = this;
                r0.<init>()
                r0.f525a = r1
                return
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(android.content.DialogInterface r2) {
                r1 = this;
                a.j5 r2 = r1.f525a
                android.app.Dialog r0 = r2.g0
                if (r0 == 0) goto L9
                r2.onDismiss(r0)
            L9:
                return
        }
    }

    /* JADX INFO: renamed from: a.j5$d */
    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.DialogInterfaceOnCancelListenerC0206j5 f526a;

        public d(a.DialogInterfaceOnCancelListenerC0206j5 r1) {
                r0 = this;
                r0.<init>()
                r0.f526a = r1
                return
        }
    }

    /* JADX INFO: renamed from: a.j5$e */
    public class e extends a.AbstractC0040a2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.b.c f527a;
        public final /* synthetic */ a.DialogInterfaceOnCancelListenerC0206j5 b;

        public e(a.DialogInterfaceOnCancelListenerC0206j5 r1, androidx.fragment.app.b.c r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.f527a = r2
                return
        }

        @Override // a.AbstractC0040a2
        public final android.view.View c(int r3) {
                r2 = this;
                androidx.fragment.app.b$c r0 = r2.f527a
                boolean r1 = r0.f()
                if (r1 == 0) goto Ld
                android.view.View r3 = r0.c(r3)
                return r3
            Ld:
                a.j5 r0 = r2.b
                android.app.Dialog r0 = r0.g0
                if (r0 == 0) goto L18
                android.view.View r3 = r0.findViewById(r3)
                return r3
            L18:
                r3 = 0
                return r3
        }

        @Override // a.AbstractC0040a2
        public final boolean f() {
                r1 = this;
                androidx.fragment.app.b$c r0 = r1.f527a
                boolean r0 = r0.f()
                if (r0 != 0) goto L11
                a.j5 r0 = r1.b
                boolean r0 = r0.j0
                if (r0 == 0) goto Lf
                goto L11
            Lf:
                r0 = 0
                return r0
            L11:
                r0 = 1
                return r0
        }
    }

    public DialogInterfaceOnCancelListenerC0206j5() {
            r2 = this;
            r2.<init>()
            a.j5$a r0 = new a.j5$a
            r0.<init>(r2)
            r2.W = r0
            a.j5$b r0 = new a.j5$b
            r0.<init>(r2)
            r2.X = r0
            a.j5$c r0 = new a.j5$c
            r0.<init>(r2)
            r2.Y = r0
            r0 = 0
            r2.Z = r0
            r2.a0 = r0
            r1 = 1
            r2.b0 = r1
            r2.c0 = r1
            r1 = -1
            r2.d0 = r1
            a.j5$d r1 = new a.j5$d
            r1.<init>(r2)
            r2.f0 = r1
            r2.j0 = r0
            return
    }

    public final void F(boolean r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.i0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.i0 = r0
            android.app.Dialog r1 = r3.g0
            if (r1 == 0) goto L30
            r2 = 0
            r1.setOnDismissListener(r2)
            android.app.Dialog r1 = r3.g0
            r1.dismiss()
            if (r5 != 0) goto L30
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Handler r1 = r3.V
            android.os.Looper r1 = r1.getLooper()
            if (r5 != r1) goto L29
            android.app.Dialog r5 = r3.g0
            r3.onDismiss(r5)
            goto L30
        L29:
            android.os.Handler r5 = r3.V
            a.j5$a r1 = r3.W
            r5.post(r1)
        L30:
            r3.h0 = r0
            int r5 = r3.d0
            if (r5 < 0) goto L56
            a.e7 r5 = r3.f()
            int r0 = r3.d0
            if (r0 < 0) goto L4a
            a.e7$j r1 = new a.e7$j
            r1.<init>(r5, r0)
            r5.x(r1, r4)
            r4 = -1
            r3.d0 = r4
            return
        L4a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Bad id: "
            java.lang.String r5 = a.C0487z.e(r5, r0)
            r4.<init>(r5)
            throw r4
        L56:
            a.e7 r5 = r3.f()
            a.S1 r1 = new a.S1
            r1.<init>(r5)
            r1.o = r0
            a.e7 r5 = r3.t
            if (r5 == 0) goto L87
            a.e7 r2 = r1.q
            if (r5 != r2) goto L6a
            goto L87
        L6a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot remove Fragment attached to a different FragmentManager. Fragment "
            r5.<init>(r0)
            java.lang.String r0 = r3.toString()
            r5.append(r0)
            java.lang.String r0 = " is already attached to a FragmentManager."
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L87:
            a.p7$a r5 = new a.p7$a
            r2 = 3
            r5.<init>(r2, r3)
            r1.b(r5)
            if (r4 == 0) goto L96
            r1.d(r0)
            return
        L96:
            r4 = 0
            r1.d(r4)
            return
    }

    public android.app.Dialog G() {
            r3 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onCreateDialog called for DialogFragment "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1a:
            a.E3 r0 = new a.E3
            android.content.Context r1 = r3.A()
            int r2 = r3.a0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.fragment.app.b
    public final a.AbstractC0040a2 a() {
            r2 = this;
            androidx.fragment.app.b$c r0 = new androidx.fragment.app.b$c
            r0.<init>(r2)
            a.j5$e r1 = new a.j5$e
            r1.<init>(r2, r0)
            return r1
    }

    @Override // androidx.fragment.app.b
    @java.lang.Deprecated
    public final void l() {
            r1 = this;
            r0 = 1
            r1.E = r0
            return
    }

    @Override // androidx.fragment.app.b
    public final void n(a.X6 r2) {
            r1 = this;
            super.n(r2)
            a.Bb<a.y9> r2 = r1.Q
            a.j5$d r0 = r1.f0
            r2.d(r0)
            r2 = 0
            r1.i0 = r2
            return
    }

    @Override // androidx.fragment.app.b
    public void o(android.os.Bundle r4) {
            r3 = this;
            super.o(r4)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r3.V = r0
            int r0 = r3.y
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            r3.c0 = r0
            if (r4 == 0) goto L42
            java.lang.String r0 = "android:style"
            int r0 = r4.getInt(r0, r2)
            r3.Z = r0
            java.lang.String r0 = "android:theme"
            int r0 = r4.getInt(r0, r2)
            r3.a0 = r0
            java.lang.String r0 = "android:cancelable"
            boolean r0 = r4.getBoolean(r0, r1)
            r3.b0 = r0
            java.lang.String r0 = "android:showsDialog"
            boolean r1 = r3.c0
            boolean r0 = r4.getBoolean(r0, r1)
            r3.c0 = r0
            java.lang.String r0 = "android:backStackId"
            r1 = -1
            int r4 = r4.getInt(r0, r1)
            r3.d0 = r4
        L42:
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            boolean r2 = r1.h0
            if (r2 != 0) goto L22
            r2 = 3
            boolean r2 = a.AbstractC0119e7.J(r2)
            if (r2 == 0) goto L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "onDismiss called for DialogFragment "
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r2)
        L1e:
            r2 = 1
            r1.F(r2, r2)
        L22:
            return
    }

    @Override // androidx.fragment.app.b
    public final void q() {
            r2 = this;
            r0 = 1
            r2.E = r0
            android.app.Dialog r1 = r2.g0
            if (r1 == 0) goto L20
            r2.h0 = r0
            r0 = 0
            r1.setOnDismissListener(r0)
            android.app.Dialog r1 = r2.g0
            r1.dismiss()
            boolean r1 = r2.i0
            if (r1 != 0) goto L1b
            android.app.Dialog r1 = r2.g0
            r2.onDismiss(r1)
        L1b:
            r2.g0 = r0
            r0 = 0
            r2.j0 = r0
        L20:
            return
    }

    @Override // androidx.fragment.app.b
    public final void r() {
            r3 = this;
            r0 = 1
            r3.E = r0
            boolean r1 = r3.i0
            if (r1 != 0) goto L9
            r3.i0 = r0
        L9:
            a.Bb<a.y9> r0 = r3.Q
            a.j5$d r1 = r3.f0
            r0.getClass()
            java.lang.String r2 = "removeObserver"
            androidx.lifecycle.LiveData.a(r2)
            a.Gd<java.lang.Object, androidx.lifecycle.LiveData<T>$b> r0 = r0.b
            java.lang.Object r0 = r0.b(r1)
            androidx.lifecycle.LiveData$b r0 = (androidx.lifecycle.LiveData.b) r0
            if (r0 != 0) goto L20
            goto L27
        L20:
            r0.d()
            r1 = 0
            r0.c(r1)
        L27:
            return
    }

    @Override // androidx.fragment.app.b
    public final android.view.LayoutInflater s(android.os.Bundle r8) {
            r7 = this;
            android.view.LayoutInflater r8 = super.s(r8)
            boolean r0 = r7.c0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.e0
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.j0
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.e0 = r3     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.G()     // Catch: java.lang.Throwable -> L4c
            r7.g0 = r4     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.c0     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L66
            int r5 = r7.Z     // Catch: java.lang.Throwable -> L4c
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4c
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4c
        L3e:
            android.content.Context r4 = r7.d()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            android.app.Dialog r5 = r7.g0     // Catch: java.lang.Throwable -> L4c
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4c
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r8 = move-exception
            goto L6c
        L4e:
            android.app.Dialog r4 = r7.g0     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.b0     // Catch: java.lang.Throwable -> L4c
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.g0     // Catch: java.lang.Throwable -> L4c
            a.j5$b r5 = r7.X     // Catch: java.lang.Throwable -> L4c
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.g0     // Catch: java.lang.Throwable -> L4c
            a.j5$c r5 = r7.Y     // Catch: java.lang.Throwable -> L4c
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4c
            r7.j0 = r3     // Catch: java.lang.Throwable -> L4c
            goto L69
        L66:
            r3 = 0
            r7.g0 = r3     // Catch: java.lang.Throwable -> L4c
        L69:
            r7.e0 = r0
            goto L6f
        L6c:
            r7.e0 = r0
            throw r8
        L6f:
            boolean r0 = a.AbstractC0119e7.J(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r0 = r7.g0
            if (r0 == 0) goto Ld3
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L98:
            boolean r0 = a.AbstractC0119e7.J(r2)
            if (r0 == 0) goto Ld3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.c0
            if (r2 != 0) goto Lc2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            return r8
        Lc2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld3:
            return r8
    }

    @Override // androidx.fragment.app.b
    public void t(android.os.Bundle r4) {
            r3 = this;
            android.app.Dialog r0 = r3.g0
            if (r0 == 0) goto L13
            android.os.Bundle r0 = r0.onSaveInstanceState()
            java.lang.String r1 = "android:dialogShowing"
            r2 = 0
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "android:savedDialogState"
            r4.putBundle(r1, r0)
        L13:
            int r0 = r3.Z
            if (r0 == 0) goto L1c
            java.lang.String r1 = "android:style"
            r4.putInt(r1, r0)
        L1c:
            int r0 = r3.a0
            if (r0 == 0) goto L25
            java.lang.String r1 = "android:theme"
            r4.putInt(r1, r0)
        L25:
            boolean r0 = r3.b0
            if (r0 != 0) goto L2e
            java.lang.String r1 = "android:cancelable"
            r4.putBoolean(r1, r0)
        L2e:
            boolean r0 = r3.c0
            if (r0 != 0) goto L37
            java.lang.String r1 = "android:showsDialog"
            r4.putBoolean(r1, r0)
        L37:
            int r0 = r3.d0
            r1 = -1
            if (r0 == r1) goto L41
            java.lang.String r1 = "android:backStackId"
            r4.putInt(r1, r0)
        L41:
            return
    }

    @Override // androidx.fragment.app.b
    public void u() {
            r2 = this;
            r0 = 1
            r2.E = r0
            android.app.Dialog r0 = r2.g0
            if (r0 == 0) goto L22
            r1 = 0
            r2.h0 = r1
            r0.show()
            android.app.Dialog r0 = r2.g0
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            a.Mg.a(r0, r2)
            int r1 = androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner
            r0.setTag(r1, r2)
            androidx.savedstate.b.a(r0, r2)
        L22:
            return
    }

    @Override // androidx.fragment.app.b
    public void v() {
            r1 = this;
            r0 = 1
            r1.E = r0
            android.app.Dialog r0 = r1.g0
            if (r0 == 0) goto La
            r0.hide()
        La:
            return
    }

    @Override // androidx.fragment.app.b
    public final void x(android.os.Bundle r2) {
            r1 = this;
            r0 = 1
            r1.E = r0
            android.app.Dialog r0 = r1.g0
            if (r0 == 0) goto L16
            if (r2 == 0) goto L16
            java.lang.String r0 = "android:savedDialogState"
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 == 0) goto L16
            android.app.Dialog r0 = r1.g0
            r0.onRestoreInstanceState(r2)
        L16:
            return
    }

    @Override // androidx.fragment.app.b
    public final void y(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            super.y(r1, r2, r3)
            android.view.View r1 = r0.G
            if (r1 != 0) goto L1a
            android.app.Dialog r1 = r0.g0
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L1a
            java.lang.String r1 = "android:savedDialogState"
            android.os.Bundle r1 = r3.getBundle(r1)
            if (r1 == 0) goto L1a
            android.app.Dialog r2 = r0.g0
            r2.onRestoreInstanceState(r1)
        L1a:
            return
    }
}
