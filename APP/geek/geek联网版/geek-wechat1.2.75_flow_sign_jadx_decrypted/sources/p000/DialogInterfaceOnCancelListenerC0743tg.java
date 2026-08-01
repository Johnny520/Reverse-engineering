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

/* JADX INFO: renamed from: tg */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0743tg extends AbstractComponentCallbacksC0563ol implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: R */
    public final DialogInterfaceOnCancelListenerC0632qg f4510R;

    /* JADX INFO: renamed from: S */
    public final DialogInterfaceOnDismissListenerC0669rg f4511S;

    /* JADX INFO: renamed from: T */
    public int f4512T;

    /* JADX INFO: renamed from: U */
    public int f4513U;

    /* JADX INFO: renamed from: V */
    public boolean f4514V;

    /* JADX INFO: renamed from: W */
    public boolean f4515W;

    /* JADX INFO: renamed from: X */
    public int f4516X;

    /* JADX INFO: renamed from: Y */
    public boolean f4517Y;

    /* JADX INFO: renamed from: Z */
    public final C0431l0 f4518Z;

    /* JADX INFO: renamed from: a0 */
    public Dialog f4519a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f4520b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f4521c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f4522d0;

    public DialogInterfaceOnCancelListenerC0743tg() {
        new RunnableC0325i7(4, this);
        this.f4510R = new DialogInterfaceOnCancelListenerC0632qg(this);
        this.f4511S = new DialogInterfaceOnDismissListenerC0669rg(this);
        this.f4512T = 0;
        this.f4513U = 0;
        this.f4514V = true;
        this.f4515W = true;
        this.f4516X = -1;
        this.f4518Z = new C0431l0(11, this);
        this.f4522d0 = false;
    }

    /* JADX INFO: renamed from: D */
    public Dialog mo1021D() {
        if (C0023am.m55A(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m2050z(), this.f4513U);
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: c */
    public final AbstractC0259gf mo2034c() {
        return new C0706sg(this, new C0489ml(this));
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: l */
    public final void mo2041l(Context context) {
        super.mo2041l(context);
        this.f3483N.m270d(this.f4518Z);
        this.f4521c0 = false;
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: m */
    public void mo1023m(Bundle bundle) {
        super.mo1023m(bundle);
        new Handler();
        this.f4515W = this.f3508w == 0;
        if (bundle != null) {
            this.f4512T = bundle.getInt("android:style", 0);
            this.f4513U = bundle.getInt("android:theme", 0);
            this.f4514V = bundle.getBoolean("android:cancelable", true);
            this.f4515W = bundle.getBoolean("android:showsDialog", this.f4515W);
            this.f4516X = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: o */
    public final void mo2042o() {
        this.f3472C = true;
        Dialog dialog = this.f4519a0;
        if (dialog != null) {
            this.f4520b0 = true;
            dialog.setOnDismissListener(null);
            this.f4519a0.dismiss();
            if (!this.f4521c0) {
                onDismiss(this.f4519a0);
            }
            this.f4519a0 = null;
            this.f4522d0 = false;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f4520b0) {
            return;
        }
        if (C0023am.m55A(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f4521c0) {
            return;
        }
        this.f4521c0 = true;
        Dialog dialog = this.f4519a0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4519a0.dismiss();
        }
        this.f4520b0 = true;
        if (this.f4516X >= 0) {
            C0023am c0023amM2039j = m2039j();
            int i = this.f4516X;
            if (i >= 0) {
                c0023amM2039j.m92r(new C0971zl(c0023amM2039j, i), false);
                this.f4516X = -1;
                return;
            } else {
                throw new IllegalArgumentException("Bad id: " + i);
            }
        }
        C0438l7 c0438l7 = new C0438l7(m2039j());
        C0023am c0023am = this.f3503r;
        if (c0023am != null && c0023am != c0438l7.f2962p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0438l7.m1746b(new C0266gm(3, this));
        if (c0438l7.f2963q) {
            throw new IllegalStateException("commit already called");
        }
        if (C0023am.m55A(2)) {
            Log.v("FragmentManager", "Commit: " + c0438l7);
            PrintWriter printWriter = new PrintWriter(new C0198es());
            c0438l7.m1748d("  ", printWriter, true);
            printWriter.close();
        }
        c0438l7.f2963q = true;
        boolean z = c0438l7.f2953g;
        C0023am c0023am2 = c0438l7.f2962p;
        if (z) {
            c0438l7.f2964r = c0023am2.f102i.getAndIncrement();
        } else {
            c0438l7.f2964r = -1;
        }
        c0023am2.m92r(c0438l7, true);
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: p */
    public final void mo2043p() {
        this.f3472C = true;
        if (!this.f4521c0) {
            this.f4521c0 = true;
        }
        C0037b c0037b = this.f3483N;
        c0037b.getClass();
        C0037b.m267a("removeObserver");
        AbstractC0717sr abstractC0717sr = (AbstractC0717sr) c0037b.f489b.mo2532b(this.f4518Z);
        if (abstractC0717sr == null) {
            return;
        }
        abstractC0717sr.mo257d();
        abstractC0717sr.m2383c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater mo2044q(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.DialogInterfaceOnCancelListenerC0743tg.mo2044q(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: r */
    public void mo1025r(Bundle bundle) {
        Dialog dialog = this.f4519a0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f4512T;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f4513U;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f4514V;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f4515W;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f4516X;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: s */
    public void mo1026s() {
        this.f3472C = true;
        Dialog dialog = this.f4519a0;
        if (dialog != null) {
            this.f4520b0 = false;
            dialog.show();
            View decorView = this.f4519a0.getWindow().getDecorView();
            AbstractC0493mp.m1857g("<this>", decorView);
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: t */
    public void mo1027t() {
        this.f3472C = true;
        Dialog dialog = this.f4519a0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: u */
    public final void mo2045u(Bundle bundle) {
        Bundle bundle2;
        this.f3472C = true;
        if (this.f4519a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4519a0.onRestoreInstanceState(bundle2);
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: v */
    public final void mo2046v(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo2046v(layoutInflater, viewGroup, bundle);
        if (this.f3474E != null || this.f4519a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4519a0.onRestoreInstanceState(bundle2);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
