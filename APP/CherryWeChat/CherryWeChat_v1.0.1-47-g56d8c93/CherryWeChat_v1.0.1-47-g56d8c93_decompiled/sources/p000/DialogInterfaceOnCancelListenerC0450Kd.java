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
        if (AbstractC2805zi.m5374G(3)) {
            toString();
        }
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
    public final void mo899m(Context context) {
        Object obj;
        super.mo899m(context);
        C2600us c2600us = this.f5306O;
        c2600us.getClass();
        C2600us.m5112a("observeForever");
        C0132D2 c0132d2 = this.f1478b0;
        C0547Mo c0547Mo = new C0547Mo(c2600us, c0132d2);
        C1027Xw c1027Xw = c2600us.f8978b;
        C0898Uw c0898UwMo1943a = c1027Xw.mo1943a(c0132d2);
        if (c0898UwMo1943a != null) {
            obj = c0898UwMo1943a.f2792b;
        } else {
            C0898Uw c0898Uw = new C0898Uw(c0132d2, c0547Mo);
            c1027Xw.f3272d++;
            C0898Uw c0898Uw2 = c1027Xw.f3270b;
            if (c0898Uw2 == null) {
                c1027Xw.f3269a = c0898Uw;
                c1027Xw.f3270b = c0898Uw;
            } else {
                c0898Uw2.f2793c = c0898Uw;
                c0898Uw.f2794d = c0898Uw2;
                c1027Xw.f3270b = c0898Uw;
            }
            obj = null;
        }
        if (((C0547Mo) obj) == null) {
            c0547Mo.m1039a(true);
        }
        this.f1481e0 = false;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: n */
    public void mo900n(Bundle bundle) {
        super.mo900n(bundle);
        new Handler();
        this.f1475Y = this.f5332w == 0;
        if (bundle != null) {
            this.f1472V = bundle.getInt("android:style", 0);
            this.f1473W = bundle.getInt("android:theme", 0);
            this.f1474X = bundle.getBoolean("android:cancelable", true);
            this.f1475Y = bundle.getBoolean("android:showsDialog", this.f1475Y);
            this.f1476Z = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1480d0) {
            return;
        }
        if (AbstractC2805zi.m5374G(3)) {
            toString();
        }
        if (this.f1481e0) {
            return;
        }
        this.f1481e0 = true;
        Dialog dialog = this.f1479c0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1479c0.dismiss();
        }
        this.f1480d0 = true;
        if (this.f1476Z < 0) {
            C1483h5 c1483h5 = new C1483h5(m2872f());
            c1483h5.f5250o = true;
            c1483h5.m2844g(this);
            c1483h5.m2841d(true);
            return;
        }
        AbstractC2805zi abstractC2805ziM2872f = m2872f();
        int i = this.f1476Z;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Bad id: "));
        }
        abstractC2805ziM2872f.m5425w(new C2762yi(abstractC2805ziM2872f, i), true);
        this.f1476Z = -1;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: p */
    public final void mo901p() {
        this.f5294C = true;
        Dialog dialog = this.f1479c0;
        if (dialog != null) {
            this.f1480d0 = true;
            dialog.setOnDismissListener(null);
            this.f1479c0.dismiss();
            if (!this.f1481e0) {
                onDismiss(this.f1479c0);
            }
            this.f1479c0 = null;
            this.f1482f0 = false;
        }
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: q */
    public final void mo902q() {
        this.f5294C = true;
        if (!this.f1481e0) {
            this.f1481e0 = true;
        }
        C2600us c2600us = this.f5306O;
        c2600us.getClass();
        C2600us.m5112a("removeObserver");
        C0547Mo c0547Mo = (C0547Mo) c2600us.f8978b.mo1944b(this.f1478b0);
        if (c0547Mo == null) {
            return;
        }
        c0547Mo.m1039a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:12:0x0018, B:14:0x0024, B:24:0x003c, B:26:0x0042, B:29:0x004c, B:20:0x002e, B:22:0x0034, B:23:0x0039, B:30:0x0064), top: B:45:0x0018 }] */
    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater mo903r(Bundle bundle) {
        Context contextM2870d;
        LayoutInflater layoutInflaterMo903r = super.mo903r(bundle);
        boolean z = this.f1475Y;
        if (z && !this.f1477a0) {
            if (z && !this.f1482f0) {
                try {
                    this.f1477a0 = true;
                    Dialog dialogMo896C = mo896C();
                    this.f1479c0 = dialogMo896C;
                    if (this.f1475Y) {
                        int i = this.f1472V;
                        if (i == 1 || i == 2) {
                            dialogMo896C.requestWindowFeature(1);
                            contextM2870d = m2870d();
                            if (contextM2870d != null) {
                                this.f1479c0.setOwnerActivity((Activity) contextM2870d);
                            }
                            this.f1479c0.setCancelable(this.f1474X);
                            this.f1479c0.setOnCancelListener(this.f1470T);
                            this.f1479c0.setOnDismissListener(this.f1471U);
                            this.f1482f0 = true;
                        } else if (i == 3) {
                            Window window = dialogMo896C.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogMo896C.requestWindowFeature(1);
                            contextM2870d = m2870d();
                            if (contextM2870d != null) {
                            }
                            this.f1479c0.setCancelable(this.f1474X);
                            this.f1479c0.setOnCancelListener(this.f1470T);
                            this.f1479c0.setOnDismissListener(this.f1471U);
                            this.f1482f0 = true;
                        } else {
                            contextM2870d = m2870d();
                            if (contextM2870d != null) {
                            }
                            this.f1479c0.setCancelable(this.f1474X);
                            this.f1479c0.setOnCancelListener(this.f1470T);
                            this.f1479c0.setOnDismissListener(this.f1471U);
                            this.f1482f0 = true;
                        }
                    } else {
                        this.f1479c0 = null;
                    }
                    this.f1477a0 = false;
                } catch (Throwable th) {
                    this.f1477a0 = false;
                    throw th;
                }
            }
            if (AbstractC2805zi.m5374G(2)) {
                toString();
            }
            Dialog dialog = this.f1479c0;
            if (dialog != null) {
                return layoutInflaterMo903r.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC2805zi.m5374G(2)) {
            toString();
        }
        return layoutInflaterMo903r;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: t */
    public void mo904t(Bundle bundle) {
        Dialog dialog = this.f1479c0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f1472V;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1473W;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f1474X;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f1475Y;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f1476Z;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: u */
    public void mo905u() {
        this.f5294C = true;
        Dialog dialog = this.f1479c0;
        if (dialog != null) {
            this.f1480d0 = false;
            dialog.show();
            View decorView = this.f1479c0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: v */
    public void mo906v() {
        this.f5294C = true;
        Dialog dialog = this.f1479c0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: w */
    public final void mo907w(Bundle bundle) {
        Bundle bundle2;
        this.f5294C = true;
        if (this.f1479c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1479c0.onRestoreInstanceState(bundle2);
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: x */
    public final void mo908x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo908x(layoutInflater, viewGroup, bundle);
        if (this.f5296E != null || this.f1479c0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1479c0.onRestoreInstanceState(bundle2);
    }
}
