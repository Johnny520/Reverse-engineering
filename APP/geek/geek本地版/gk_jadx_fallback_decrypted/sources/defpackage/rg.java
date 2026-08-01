package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class rg extends defpackage.ml implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    public final defpackage.og R;
    public final defpackage.pg S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public int X;
    public boolean Y;
    public final defpackage.l0 Z;
    public android.app.Dialog a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;

    public rg() {
            r3 = this;
            r3.<init>()
            y6 r0 = new y6
            r1 = 4
            r0.<init>(r1, r3)
            og r0 = new og
            r0.<init>(r3)
            r3.R = r0
            pg r0 = new pg
            r0.<init>(r3)
            r3.S = r0
            r0 = 0
            r3.T = r0
            r3.U = r0
            r1 = 1
            r3.V = r1
            r3.W = r1
            r1 = -1
            r3.X = r1
            l0 r1 = new l0
            r2 = 11
            r1.<init>(r2, r3)
            r3.Z = r1
            r3.d0 = r0
            return
    }

    public android.app.Dialog D() {
            r3 = this;
            r0 = 3
            boolean r0 = defpackage.yl.A(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onCreateDialog called for DialogFragment "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1a:
            android.app.Dialog r0 = new android.app.Dialog
            android.content.Context r1 = r3.z()
            int r2 = r3.U
            r0.<init>(r1, r2)
            return r0
    }

    @Override // defpackage.ml
    public final defpackage.ip c() {
            r2 = this;
            kl r0 = new kl
            r0.<init>(r2)
            qg r1 = new qg
            r1.<init>(r2, r0)
            return r1
    }

    @Override // defpackage.ml
    public final void l(android.content.Context r2) {
            r1 = this;
            super.l(r2)
            androidx.lifecycle.b r2 = r1.N
            l0 r0 = r1.Z
            r2.d(r0)
            r2 = 0
            r1.c0 = r2
            return
    }

    @Override // defpackage.ml
    public void m(android.os.Bundle r4) {
            r3 = this;
            super.m(r4)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            int r0 = r3.w
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            r3.W = r0
            if (r4 == 0) goto L40
            java.lang.String r0 = "android:style"
            int r0 = r4.getInt(r0, r2)
            r3.T = r0
            java.lang.String r0 = "android:theme"
            int r0 = r4.getInt(r0, r2)
            r3.U = r0
            java.lang.String r0 = "android:cancelable"
            boolean r0 = r4.getBoolean(r0, r1)
            r3.V = r0
            java.lang.String r0 = "android:showsDialog"
            boolean r1 = r3.W
            boolean r0 = r4.getBoolean(r0, r1)
            r3.W = r0
            java.lang.String r0 = "android:backStackId"
            r1 = -1
            int r4 = r4.getInt(r0, r1)
            r3.X = r4
        L40:
            return
    }

    @Override // defpackage.ml
    public final void o() {
            r2 = this;
            r0 = 1
            r2.C = r0
            android.app.Dialog r1 = r2.a0
            if (r1 == 0) goto L20
            r2.b0 = r0
            r0 = 0
            r1.setOnDismissListener(r0)
            android.app.Dialog r1 = r2.a0
            r1.dismiss()
            boolean r1 = r2.c0
            if (r1 != 0) goto L1b
            android.app.Dialog r1 = r2.a0
            r2.onDismiss(r1)
        L1b:
            r2.a0 = r0
            r0 = 0
            r2.d0 = r0
        L20:
            return
    }

    public void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            return
    }

    public void onDismiss(android.content.DialogInterface r5) {
            r4 = this;
            boolean r5 = r4.b0
            if (r5 != 0) goto Leb
            r5 = 3
            boolean r0 = defpackage.yl.A(r5)
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onDismiss called for DialogFragment "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1e:
            boolean r0 = r4.c0
            if (r0 == 0) goto L24
            goto Leb
        L24:
            r0 = 1
            r4.c0 = r0
            android.app.Dialog r1 = r4.a0
            if (r1 == 0) goto L34
            r2 = 0
            r1.setOnDismissListener(r2)
            android.app.Dialog r1 = r4.a0
            r1.dismiss()
        L34:
            r4.b0 = r0
            int r1 = r4.X
            if (r1 < 0) goto L63
            yl r5 = r4.j()
            int r0 = r4.X
            if (r0 < 0) goto L4f
            xl r1 = new xl
            r1.<init>(r5, r0)
            r0 = 0
            r5.r(r1, r0)
            r5 = -1
            r4.X = r5
            return
        L4f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Bad id: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L63:
            yl r1 = r4.j()
            b7 r2 = new b7
            r2.<init>(r1)
            yl r1 = r4.r
            if (r1 == 0) goto L92
            yl r3 = r2.p
            if (r1 != r3) goto L75
            goto L92
        L75:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot remove Fragment attached to a different FragmentManager. Fragment "
            r0.<init>(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r1 = " is already attached to a FragmentManager."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L92:
            em r1 = new em
            r1.<init>(r5, r4)
            r2.b(r1)
            boolean r5 = r2.q
            if (r5 != 0) goto Le3
            r5 = 2
            boolean r5 = defpackage.yl.A(r5)
            r1 = 1
            if (r5 == 0) goto Lcb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r3 = "Commit: "
            r5.<init>(r3)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r5)
            as r5 = new as
            r5.<init>()
            java.io.PrintWriter r3 = new java.io.PrintWriter
            r3.<init>(r5)
            java.lang.String r5 = "  "
            r2.d(r5, r3, r1)
            r3.close()
        Lcb:
            r2.q = r1
            boolean r5 = r2.g
            yl r1 = r2.p
            if (r5 == 0) goto Ldc
            java.util.concurrent.atomic.AtomicInteger r5 = r1.i
            int r5 = r5.getAndIncrement()
            r2.r = r5
            goto Ldf
        Ldc:
            r5 = -1
            r2.r = r5
        Ldf:
            r1.r(r2, r0)
            return
        Le3:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "commit already called"
            r5.<init>(r0)
            throw r5
        Leb:
            return
    }

    @Override // defpackage.ml
    public final void p() {
            r2 = this;
            r0 = 1
            r2.C = r0
            boolean r1 = r2.c0
            if (r1 != 0) goto L9
            r2.c0 = r0
        L9:
            androidx.lifecycle.b r0 = r2.N
            r0.getClass()
            java.lang.String r1 = "removeObserver"
            androidx.lifecycle.b.a(r1)
            o10 r0 = r0.b
            l0 r1 = r2.Z
            java.lang.Object r0 = r0.b(r1)
            or r0 = (defpackage.or) r0
            if (r0 != 0) goto L20
            return
        L20:
            r0.d()
            r1 = 0
            r0.c(r1)
            return
    }

    @Override // defpackage.ml
    public final android.view.LayoutInflater q(android.os.Bundle r8) {
            r7 = this;
            android.view.LayoutInflater r8 = super.q(r8)
            boolean r0 = r7.W
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.Y
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.d0
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.Y = r3     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.D()     // Catch: java.lang.Throwable -> L4c
            r7.a0 = r4     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.W     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L66
            int r5 = r7.T     // Catch: java.lang.Throwable -> L4c
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
            android.content.Context r4 = r7.h()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            android.app.Dialog r5 = r7.a0     // Catch: java.lang.Throwable -> L4c
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4c
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r8 = move-exception
            goto L6c
        L4e:
            android.app.Dialog r4 = r7.a0     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.V     // Catch: java.lang.Throwable -> L4c
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.a0     // Catch: java.lang.Throwable -> L4c
            og r5 = r7.R     // Catch: java.lang.Throwable -> L4c
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.a0     // Catch: java.lang.Throwable -> L4c
            pg r5 = r7.S     // Catch: java.lang.Throwable -> L4c
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4c
            r7.d0 = r3     // Catch: java.lang.Throwable -> L4c
            goto L69
        L66:
            r3 = 0
            r7.a0 = r3     // Catch: java.lang.Throwable -> L4c
        L69:
            r7.Y = r0
            goto L6f
        L6c:
            r7.Y = r0
            throw r8
        L6f:
            boolean r0 = defpackage.yl.A(r2)
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
            android.app.Dialog r0 = r7.a0
            if (r0 == 0) goto Ld3
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L98:
            boolean r0 = defpackage.yl.A(r2)
            if (r0 == 0) goto Ld3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.W
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

    @Override // defpackage.ml
    public void r(android.os.Bundle r4) {
            r3 = this;
            android.app.Dialog r0 = r3.a0
            if (r0 == 0) goto L13
            android.os.Bundle r0 = r0.onSaveInstanceState()
            java.lang.String r1 = "android:dialogShowing"
            r2 = 0
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "android:savedDialogState"
            r4.putBundle(r1, r0)
        L13:
            int r0 = r3.T
            if (r0 == 0) goto L1c
            java.lang.String r1 = "android:style"
            r4.putInt(r1, r0)
        L1c:
            int r0 = r3.U
            if (r0 == 0) goto L25
            java.lang.String r1 = "android:theme"
            r4.putInt(r1, r0)
        L25:
            boolean r0 = r3.V
            if (r0 != 0) goto L2e
            java.lang.String r1 = "android:cancelable"
            r4.putBoolean(r1, r0)
        L2e:
            boolean r0 = r3.W
            if (r0 != 0) goto L37
            java.lang.String r1 = "android:showsDialog"
            r4.putBoolean(r1, r0)
        L37:
            int r0 = r3.X
            r1 = -1
            if (r0 == r1) goto L41
            java.lang.String r1 = "android:backStackId"
            r4.putInt(r1, r0)
        L41:
            return
    }

    @Override // defpackage.ml
    public void s() {
            r2 = this;
            r0 = 1
            r2.C = r0
            android.app.Dialog r0 = r2.a0
            if (r0 == 0) goto L2e
            r1 = 0
            r2.b0 = r1
            r0.show()
            android.app.Dialog r0 = r2.a0
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "<this>"
            defpackage.ip.o(r1, r0)
            r1 = 2131296695(0x7f0901b7, float:1.8211314E38)
            r0.setTag(r1, r2)
            r1 = 2131296698(0x7f0901ba, float:1.821132E38)
            r0.setTag(r1, r2)
            r1 = 2131296697(0x7f0901b9, float:1.8211318E38)
            r0.setTag(r1, r2)
        L2e:
            return
    }

    @Override // defpackage.ml
    public void t() {
            r1 = this;
            r0 = 1
            r1.C = r0
            android.app.Dialog r0 = r1.a0
            if (r0 == 0) goto La
            r0.hide()
        La:
            return
    }

    @Override // defpackage.ml
    public final void u(android.os.Bundle r2) {
            r1 = this;
            r0 = 1
            r1.C = r0
            android.app.Dialog r0 = r1.a0
            if (r0 == 0) goto L16
            if (r2 == 0) goto L16
            java.lang.String r0 = "android:savedDialogState"
            android.os.Bundle r2 = r2.getBundle(r0)
            if (r2 == 0) goto L16
            android.app.Dialog r0 = r1.a0
            r0.onRestoreInstanceState(r2)
        L16:
            return
    }

    @Override // defpackage.ml
    public final void v(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            super.v(r1, r2, r3)
            android.view.View r1 = r0.E
            if (r1 != 0) goto L1a
            android.app.Dialog r1 = r0.a0
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L1a
            java.lang.String r1 = "android:savedDialogState"
            android.os.Bundle r1 = r3.getBundle(r1)
            if (r1 == 0) goto L1a
            android.app.Dialog r2 = r0.a0
            r2.onRestoreInstanceState(r1)
        L1a:
            return
    }
}
