package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0037b;
import com.ljx.wechatmod.R;
import java.io.PrintWriter;

/* JADX INFO: renamed from: rg */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0670rg extends AbstractComponentCallbacksC0489ml implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: R */
    public final DialogInterfaceOnCancelListenerC0558og f4271R;

    /* JADX INFO: renamed from: S */
    public final DialogInterfaceOnDismissListenerC0596pg f4272S;

    /* JADX INFO: renamed from: T */
    public int f4273T;

    /* JADX INFO: renamed from: U */
    public int f4274U;

    /* JADX INFO: renamed from: V */
    public boolean f4275V;

    /* JADX INFO: renamed from: W */
    public boolean f4276W;

    /* JADX INFO: renamed from: X */
    public int f4277X;

    /* JADX INFO: renamed from: Y */
    public boolean f4278Y;

    /* JADX INFO: renamed from: Z */
    public final C0431l0 f4279Z;

    /* JADX INFO: renamed from: a0 */
    public Dialog f4280a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f4281b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f4282c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f4283d0;

    public DialogInterfaceOnCancelListenerC0670rg() {
        new RunnableC0919y6(4, this);
        this.f4271R = new DialogInterfaceOnCancelListenerC0558og(this);
        this.f4272S = new DialogInterfaceOnDismissListenerC0596pg(this);
        this.f4273T = 0;
        this.f4274U = 0;
        this.f4275V = true;
        this.f4276W = true;
        this.f4277X = -1;
        this.f4279Z = new C0431l0(11, this);
        this.f4283d0 = false;
    }

    /* JADX INFO: renamed from: D */
    public Dialog mo572D() {
        if (C0934yl.m2689A(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m1848z(), this.f4274U);
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: c */
    public final AbstractC0346ip mo1832c() {
        return new C0633qg(this, new C0415kl(this));
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: l */
    public final void mo1839l(Context context) {
        super.mo1839l(context);
        this.f3238N.m285d(this.f4279Z);
        this.f4282c0 = false;
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: m */
    public void mo574m(Bundle bundle) {
        super.mo574m(bundle);
        new Handler();
        this.f4276W = this.f3263w == 0;
        if (bundle != null) {
            this.f4273T = bundle.getInt("android:style", 0);
            this.f4274U = bundle.getInt("android:theme", 0);
            this.f4275V = bundle.getBoolean("android:cancelable", true);
            this.f4276W = bundle.getBoolean("android:showsDialog", this.f4276W);
            this.f4277X = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: o */
    public final void mo1840o() {
        this.f3227C = true;
        Dialog dialog = this.f4280a0;
        if (dialog != null) {
            this.f4281b0 = true;
            dialog.setOnDismissListener(null);
            this.f4280a0.dismiss();
            if (!this.f4282c0) {
                onDismiss(this.f4280a0);
            }
            this.f4280a0 = null;
            this.f4283d0 = false;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f4281b0) {
            return;
        }
        if (C0934yl.m2689A(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f4282c0) {
            return;
        }
        this.f4282c0 = true;
        Dialog dialog = this.f4280a0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4280a0.dismiss();
        }
        this.f4281b0 = true;
        if (this.f4277X >= 0) {
            C0934yl c0934ylM1837j = m1837j();
            int i = this.f4277X;
            if (i >= 0) {
                c0934ylM1837j.m2726r(new C0897xl(c0934ylM1837j, i), false);
                this.f4277X = -1;
                return;
            } else {
                throw new IllegalArgumentException("Bad id: " + i);
            }
        }
        C0058b7 c0058b7 = new C0058b7(m1837j());
        C0934yl c0934yl = this.f3258r;
        if (c0934yl != null && c0934yl != c0058b7.f771p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0058b7.m536b(new C0192em(3, this));
        if (c0058b7.f772q) {
            throw new IllegalStateException("commit already called");
        }
        if (C0934yl.m2689A(2)) {
            Log.v("FragmentManager", "Commit: " + c0058b7);
            PrintWriter printWriter = new PrintWriter(new C0042as());
            c0058b7.m538d("  ", printWriter, true);
            printWriter.close();
        }
        c0058b7.f772q = true;
        boolean z = c0058b7.f762g;
        C0934yl c0934yl2 = c0058b7.f771p;
        if (z) {
            c0058b7.f773r = c0934yl2.f5360i.getAndIncrement();
        } else {
            c0058b7.f773r = -1;
        }
        c0934yl2.m2726r(c0058b7, true);
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: p */
    public final void mo1841p() {
        this.f3227C = true;
        if (!this.f4282c0) {
            this.f4282c0 = true;
        }
        C0037b c0037b = this.f3238N;
        c0037b.getClass();
        C0037b.m282a("removeObserver");
        AbstractC0569or abstractC0569or = (AbstractC0569or) c0037b.f526b.mo1984b(this.f4279Z);
        if (abstractC0569or == null) {
            return;
        }
        abstractC0569or.mo272d();
        abstractC0569or.m2021c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater mo1842q(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DialogInterfaceOnCancelListenerC0670rg.mo1842q(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: r */
    public void mo576r(Bundle bundle) {
        Dialog dialog = this.f4280a0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f4273T;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f4274U;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f4275V;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f4276W;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f4277X;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: s */
    public void mo577s() {
        this.f3227C = true;
        Dialog dialog = this.f4280a0;
        if (dialog != null) {
            this.f4281b0 = false;
            dialog.show();
            View decorView = this.f4280a0.getWindow().getDecorView();
            AbstractC0346ip.m1503o("<this>", decorView);
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: t */
    public void mo578t() {
        this.f3227C = true;
        Dialog dialog = this.f4280a0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: u */
    public final void mo1843u(Bundle bundle) {
        Bundle bundle2;
        this.f3227C = true;
        if (this.f4280a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4280a0.onRestoreInstanceState(bundle2);
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: v */
    public final void mo1844v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1844v(layoutInflater, viewGroup, bundle);
        if (this.f3229E != null || this.f4280a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4280a0.onRestoreInstanceState(bundle2);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
