package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.b;
import com.ljx.wechatmod.R;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class rg extends ml implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final og R;
    public final pg S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public int X;
    public boolean Y;
    public final l0 Z;
    public Dialog a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;

    public rg() {
        new y6(4, this);
        this.R = new og(this);
        this.S = new pg(this);
        this.T = 0;
        this.U = 0;
        this.V = true;
        this.W = true;
        this.X = -1;
        this.Z = new l0(11, this);
        this.d0 = false;
    }

    public Dialog D() {
        if (yl.A(3) == false) goto L6;
        Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
    L6:
        return new Dialog(z(), this.U);
    }

    @Override // defpackage.ml
    public final ip c() {
        return new qg(this, new kl(this));
    }

    @Override // defpackage.ml
    public final void l(Context r2) {
        super.l(r2);
        this.N.d(this.Z);
        this.c0 = false;
    }

    @Override // defpackage.ml
    public void m(Bundle r4) {
        super.m(r4);
        new Handler();
        if (this.w != 0) goto L5;
        boolean r0 = true;
    L6:
        this.W = r0;
        if (r4 == null) goto L10;
        this.T = r4.getInt("android:style", 0);
        this.U = r4.getInt("android:theme", 0);
        this.V = r4.getBoolean("android:cancelable", true);
        this.W = r4.getBoolean("android:showsDialog", this.W);
        this.X = r4.getInt("android:backStackId", -1);
        return;
    L10:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.ml
    public final void o() {
        this.C = true;
        Dialog r1 = this.a0;
        if (r1 == null) goto L9;
        this.b0 = true;
        r1.setOnDismissListener(null);
        this.a0.dismiss();
        if (this.c0 == true) goto L7;
        onDismiss(this.a0);
    L7:
        this.a0 = null;
        this.d0 = false;
        return;
    }

    public void onDismiss(DialogInterface r5) {
        if (this.b0 == false) goto L5;
        return;
    L5:
        if (yl.A(3) == false) goto L8;
        Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
    L8:
        if (this.c0 == true) goto L42;
        this.c0 = true;
        Dialog r1 = this.a0;
        if (r1 == null) goto L13;
        r1.setOnDismissListener(null);
        this.a0.dismiss();
    L13:
        this.b0 = true;
        if (this.X < 0) goto L21;
        yl r52 = j();
        int r0 = this.X;
        if (r0 < 0) goto L20;
        r52.r(new xl(r52, r0), false);
        this.X = -1;
        return;
    L20:
        throw new IllegalArgumentException("Bad id: " + r0);
    L21:
        b7 r2 = new b7(j());
        yl r12 = this.r;
        if (r12 != null) goto L24;
    L28:
        r2.b(new em(3, this));
        if (r2.q == true) goto L40;
        if (yl.A(2) == false) goto L33;
        Log.v("FragmentManager", "Commit: " + r2);
        PrintWriter r3 = new PrintWriter(new as());
        r2.d("  ", r3, true);
        r3.close();
    L33:
        r2.q = true;
        boolean r53 = r2.g;
        yl r13 = r2.p;
        if (r53 == false) goto L36;
        r2.r = r13.i.getAndIncrement();
    L37:
        r13.r(r2, true);
        return;
    L36:
        r2.r = -1;
        goto L37
    L40:
        throw new IllegalStateException("commit already called");
    L24:
        if (r12 == r2.p) goto L28;
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.ml
    public final void p() {
        this.C = true;
        if (this.c0 == true) goto L5;
        this.c0 = true;
    L5:
        b r0 = this.N;
        r0.getClass();
        b.a("removeObserver");
        or r02 = (or) r0.b.b(this.Z);
        if (r02 != null) goto L8;
        return;
    L8:
        r02.d();
        r02.c(false);
    }

    @Override // defpackage.ml
    public final LayoutInflater q(Bundle r8) {
        LayoutInflater r82 = super.q(r8);
        boolean r0 = this.W;
        if (r0 == false) goto L42;
        if (this.Y == true) goto L42;
        if (r0 == false) goto L35;
        if (this.d0 == true) goto L35;
        this.Y = true;     // Catch: Throwable -> L27
        Dialog r4 = D();     // Catch: Throwable -> L27
        this.a0 = r4;     // Catch: Throwable -> L27
        if (this.W == false) goto L30;
        int r5 = this.T;     // Catch: Throwable -> L27
        if (r5 == 1) goto L23;
        if (r5 == 2) goto L23;
        if (r5 != 3) goto L24;
        Window r52 = r4.getWindow();     // Catch: Throwable -> L27
        if (r52 == null) goto L23;
        r52.addFlags(24);     // Catch: Throwable -> L27
    L24:
        Context r42 = h();     // Catch: Throwable -> L27
        if (r42 == null) goto L29;
        this.a0.setOwnerActivity((Activity) r42);     // Catch: Throwable -> L27
    L29:
        this.a0.setCancelable(this.V);     // Catch: Throwable -> L27
        this.a0.setOnCancelListener(this.R);     // Catch: Throwable -> L27
        this.a0.setOnDismissListener(this.S);     // Catch: Throwable -> L27
        this.d0 = true;     // Catch: Throwable -> L27
    L31:
        this.Y = false;
    L23:
        r4.requestWindowFeature(1);     // Catch: Throwable -> L27
        goto L24
    L30:
        this.a0 = null;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        this.Y = false;
        throw th;
    L35:
        if (yl.A(2) == false) goto L37;
        Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
    L37:
        Dialog r02 = this.a0;
        if (r02 != null) goto L40;
    L48:
        return r82;
    L40:
        return r82.cloneInContext(r02.getContext());
    L42:
        if (yl.A(2) == false) goto L48;
        String r03 = "getting layout inflater for DialogFragment " + this;
        if (this.W == true) goto L47;
        Log.d("FragmentManager", "mShowsDialog = false: " + r03);
        return r82;
    L47:
        Log.d("FragmentManager", "mCreatingDialog = true: " + r03);
        goto L48
    }

    @Override // defpackage.ml
    public void r(Bundle r4) {
        Dialog r0 = this.a0;
        if (r0 == null) goto L5;
        Bundle r02 = r0.onSaveInstanceState();
        r02.putBoolean("android:dialogShowing", false);
        r4.putBundle("android:savedDialogState", r02);
    L5:
        int r03 = this.T;
        if (r03 == 0) goto L8;
        r4.putInt("android:style", r03);
    L8:
        int r04 = this.U;
        if (r04 == 0) goto L11;
        r4.putInt("android:theme", r04);
    L11:
        boolean r05 = this.V;
        if (r05 == true) goto L14;
        r4.putBoolean("android:cancelable", r05);
    L14:
        boolean r06 = this.W;
        if (r06 == true) goto L17;
        r4.putBoolean("android:showsDialog", r06);
    L17:
        int r07 = this.X;
        if (r07 == (-1)) goto L21;
        r4.putInt("android:backStackId", r07);
        return;
    }

    @Override // defpackage.ml
    public void s() {
        this.C = true;
        Dialog r0 = this.a0;
        if (r0 == null) goto L6;
        this.b0 = false;
        r0.show();
        View r02 = this.a0.getWindow().getDecorView();
        ip.o("<this>", r02);
        r02.setTag(R.id.view_tree_lifecycle_owner, this);
        r02.setTag(R.id.view_tree_view_model_store_owner, this);
        r02.setTag(R.id.view_tree_saved_state_registry_owner, this);
        return;
    }

    @Override // defpackage.ml
    public void t() {
        this.C = true;
        Dialog r0 = this.a0;
        if (r0 == null) goto L6;
        r0.hide();
        return;
    }

    @Override // defpackage.ml
    public final void u(Bundle r2) {
        this.C = true;
        if (this.a0 == null) goto L9;
        if (r2 == null) goto L10;
        Bundle r22 = r2.getBundle("android:savedDialogState");
        if (r22 == null) goto L11;
        this.a0.onRestoreInstanceState(r22);
        return;
    L11:
        return;
    L10:
        return;
    }

    @Override // defpackage.ml
    public final void v(LayoutInflater r1, ViewGroup r2, Bundle r3) {
        super.v(r1, r2, r3);
        if (this.E == null) goto L5;
        return;
    L5:
        if (this.a0 == null) goto L12;
        if (r3 == null) goto L13;
        Bundle r12 = r3.getBundle("android:savedDialogState");
        if (r12 == null) goto L14;
        this.a0.onRestoreInstanceState(r12);
        return;
    L14:
        return;
    L13:
        return;
    }

    public void onCancel(DialogInterface r1) {
    }
}
