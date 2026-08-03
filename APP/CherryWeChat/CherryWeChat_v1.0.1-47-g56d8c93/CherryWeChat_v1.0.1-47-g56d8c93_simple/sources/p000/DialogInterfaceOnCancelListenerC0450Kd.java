package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Kd */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0450Kd extends AbstractComponentCallbacksC1503hi implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: T */
    public final DialogInterfaceOnCancelListenerC0321Hd f1470T;

    /* JADX INFO: renamed from: U */
    public final DialogInterfaceOnDismissListenerC0364Id f1471U;

    /* JADX INFO: renamed from: V */
    public int f1472V;

    /* JADX INFO: renamed from: W */
    public int f1473W;

    /* JADX INFO: renamed from: X */
    public boolean f1474X;

    /* JADX INFO: renamed from: Y */
    public boolean f1475Y;

    /* JADX INFO: renamed from: Z */
    public int f1476Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f1477a0;

    /* JADX INFO: renamed from: b0 */
    public final C0132D2 f1478b0;

    /* JADX INFO: renamed from: c0 */
    public Dialog f1479c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f1480d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f1481e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f1482f0;

    public DialogInterfaceOnCancelListenerC0450Kd() {
        new RunnableC0431K0(4, this);
        this.f1470T = new DialogInterfaceOnCancelListenerC0321Hd(this);
        this.f1471U = new DialogInterfaceOnDismissListenerC0364Id(this);
        this.f1472V = 0;
        this.f1473W = 0;
        this.f1474X = true;
        this.f1475Y = true;
        this.f1476Z = -1;
        this.f1478b0 = new C0132D2(17, this);
        this.f1482f0 = false;
    }

    /* JADX INFO: renamed from: C */
    public Dialog mo896C() {
        if (AbstractC2805zi.m5374G(3) == false) goto L6;
        toString();
    L6:
        return new DialogC0876Ua(m2878y(), this.f1473W);
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: a */
    public final AbstractC0828TB mo897a() {
        return new C0407Jd(this, new C1371ei(this));
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: l */
    public final void mo898l() {
        this.f5294C = true;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: m */
    public final void mo899m(Context r5) {
        super.mo899m(r5);
        C2600us r52 = this.f5306O;
        r52.getClass();
        C2600us.m5112a("observeForever");
        C0132D2 r1 = this.f1478b0;
        C0547Mo r0 = new C0547Mo(r52, r1);
        C1027Xw r53 = r52.f8978b;
        C0898Uw r2 = r53.mo1943a(r1);
        if (r2 == null) goto L5;
        Object r54 = r2.f2792b;
    L11:
        if (((C0547Mo) r54) != null) goto L14;
        r0.m1039a(true);
    L14:
        this.f1481e0 = false;
        return;
    L5:
        C0898Uw r22 = new C0898Uw(r1, r0);
        r53.f3272d++;
        C0898Uw r12 = r53.f3270b;
        if (r12 != null) goto L8;
        r53.f3269a = r22;
        r53.f3270b = r22;
    L9:
        r54 = null;
        goto L11
    L8:
        r12.f2793c = r22;
        r22.f2794d = r12;
        r53.f3270b = r22;
        goto L9
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: n */
    public void mo900n(Bundle r4) {
        super.mo900n(r4);
        new Handler();
        if (this.f5332w != 0) goto L5;
        boolean r0 = true;
    L6:
        this.f1475Y = r0;
        if (r4 == null) goto L10;
        this.f1472V = r4.getInt("android:style", 0);
        this.f1473W = r4.getInt("android:theme", 0);
        this.f1474X = r4.getBoolean("android:cancelable", true);
        this.f1475Y = r4.getBoolean("android:showsDialog", this.f1475Y);
        this.f1476Z = r4.getInt("android:backStackId", -1);
        return;
    L10:
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface r1) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface r4) {
        if (this.f1480d0 == false) goto L5;
        return;
    L5:
        if (AbstractC2805zi.m5374G(3) == false) goto L8;
        toString();
    L8:
        if (this.f1481e0 == true) goto L24;
        this.f1481e0 = true;
        Dialog r0 = this.f1479c0;
        if (r0 == null) goto L13;
        r0.setOnDismissListener(null);
        this.f1479c0.dismiss();
    L13:
        this.f1480d0 = true;
        if (this.f1476Z < 0) goto L21;
        AbstractC2805zi r02 = m2872f();
        int r1 = this.f1476Z;
        if (r1 < 0) goto L20;
        r02.m5425w(new C2762yi(r02, r1), true);
        this.f1476Z = -1;
        return;
    L20:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r1, "Bad id: "));
    L21:
        C1483h5 r12 = new C1483h5(m2872f());
        r12.f5250o = true;
        r12.m2844g(this);
        r12.m2841d(true);
        return;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: p */
    public final void mo901p() {
        this.f5294C = true;
        Dialog r1 = this.f1479c0;
        if (r1 == null) goto L9;
        this.f1480d0 = true;
        r1.setOnDismissListener(null);
        this.f1479c0.dismiss();
        if (this.f1481e0 == true) goto L7;
        onDismiss(this.f1479c0);
    L7:
        this.f1479c0 = null;
        this.f1482f0 = false;
        return;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: q */
    public final void mo902q() {
        this.f5294C = true;
        if (this.f1481e0 == true) goto L5;
        this.f1481e0 = true;
    L5:
        C2600us r0 = this.f5306O;
        r0.getClass();
        C2600us.m5112a("removeObserver");
        C0547Mo r02 = (C0547Mo) r0.f8978b.mo1944b(this.f1478b0);
        if (r02 != null) goto L8;
        return;
    L8:
        r02.m1039a(false);
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: r */
    public final LayoutInflater mo903r(Bundle r7) {
        LayoutInflater r72 = super.mo903r(r7);
        boolean r0 = this.f1475Y;
        if (r0 == false) goto L42;
        if (this.f1477a0 == true) goto L42;
        if (r0 == false) goto L35;
        if (this.f1482f0 == true) goto L35;
        this.f1477a0 = true;     // Catch: Throwable -> L27
        Dialog r3 = mo896C();     // Catch: Throwable -> L27
        this.f1479c0 = r3;     // Catch: Throwable -> L27
        if (this.f1475Y == false) goto L30;
        int r4 = this.f1472V;     // Catch: Throwable -> L27
        if (r4 == 1) goto L23;
        if (r4 == 2) goto L23;
        if (r4 != 3) goto L24;
        Window r42 = r3.getWindow();     // Catch: Throwable -> L27
        if (r42 == null) goto L23;
        r42.addFlags(24);     // Catch: Throwable -> L27
    L24:
        Context r32 = m2870d();     // Catch: Throwable -> L27
        if (r32 == null) goto L29;
        this.f1479c0.setOwnerActivity((Activity) r32);     // Catch: Throwable -> L27
    L29:
        this.f1479c0.setCancelable(this.f1474X);     // Catch: Throwable -> L27
        this.f1479c0.setOnCancelListener(this.f1470T);     // Catch: Throwable -> L27
        this.f1479c0.setOnDismissListener(this.f1471U);     // Catch: Throwable -> L27
        this.f1482f0 = true;     // Catch: Throwable -> L27
    L31:
        this.f1477a0 = false;
    L23:
        r3.requestWindowFeature(1);     // Catch: Throwable -> L27
        goto L24
    L30:
        this.f1479c0 = null;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        this.f1477a0 = false;
        throw th;
    L35:
        if (AbstractC2805zi.m5374G(2) == false) goto L37;
        toString();
    L37:
        Dialog r02 = this.f1479c0;
        if (r02 != null) goto L40;
    L44:
        return r72;
    L40:
        return r72.cloneInContext(r02.getContext());
    L42:
        if (AbstractC2805zi.m5374G(2) == false) goto L44;
        toString();
        goto L44
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: t */
    public void mo904t(Bundle r4) {
        Dialog r0 = this.f1479c0;
        if (r0 == null) goto L5;
        Bundle r02 = r0.onSaveInstanceState();
        r02.putBoolean("android:dialogShowing", false);
        r4.putBundle("android:savedDialogState", r02);
    L5:
        int r03 = this.f1472V;
        if (r03 == 0) goto L8;
        r4.putInt("android:style", r03);
    L8:
        int r04 = this.f1473W;
        if (r04 == 0) goto L11;
        r4.putInt("android:theme", r04);
    L11:
        boolean r05 = this.f1474X;
        if (r05 == true) goto L14;
        r4.putBoolean("android:cancelable", r05);
    L14:
        boolean r06 = this.f1475Y;
        if (r06 == true) goto L17;
        r4.putBoolean("android:showsDialog", r06);
    L17:
        int r07 = this.f1476Z;
        if (r07 == (-1)) goto L21;
        r4.putInt("android:backStackId", r07);
        return;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: u */
    public void mo905u() {
        this.f5294C = true;
        Dialog r0 = this.f1479c0;
        if (r0 == null) goto L6;
        this.f1480d0 = false;
        r0.show();
        View r02 = this.f1479c0.getWindow().getDecorView();
        r02.setTag(R.id.view_tree_lifecycle_owner, this);
        r02.setTag(R.id.view_tree_view_model_store_owner, this);
        r02.setTag(R.id.view_tree_saved_state_registry_owner, this);
        return;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: v */
    public void mo906v() {
        this.f5294C = true;
        Dialog r0 = this.f1479c0;
        if (r0 == null) goto L6;
        r0.hide();
        return;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: w */
    public final void mo907w(Bundle r2) {
        this.f5294C = true;
        if (this.f1479c0 == null) goto L9;
        if (r2 == null) goto L10;
        Bundle r22 = r2.getBundle("android:savedDialogState");
        if (r22 == null) goto L11;
        this.f1479c0.onRestoreInstanceState(r22);
        return;
    L11:
        return;
    L10:
        return;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: x */
    public final void mo908x(LayoutInflater r1, ViewGroup r2, Bundle r3) {
        super.mo908x(r1, r2, r3);
        if (this.f5296E == null) goto L5;
        return;
    L5:
        if (this.f1479c0 == null) goto L12;
        if (r3 == null) goto L13;
        Bundle r12 = r3.getBundle("android:savedDialogState");
        if (r12 == null) goto L14;
        this.f1479c0.onRestoreInstanceState(r12);
        return;
    L14:
        return;
    L13:
        return;
    }
}
