package p000a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ComponentCallbacksC1100b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.viewmodel.C1137R;
import androidx.savedstate.C1225b;
import p000a.AbstractC0553e7.j;
import p000a.AbstractC0762p7;

/* JADX INFO: renamed from: a.j5 */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0646j5 extends ComponentCallbacksC1100b implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: V */
    public Handler f2367V;

    /* JADX INFO: renamed from: e0 */
    public boolean f2376e0;

    /* JADX INFO: renamed from: g0 */
    public Dialog f2378g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f2379h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f2380i0;

    /* JADX INFO: renamed from: W */
    public final a f2368W = new a();

    /* JADX INFO: renamed from: X */
    public final b f2369X = new b();

    /* JADX INFO: renamed from: Y */
    public final c f2370Y = new c();

    /* JADX INFO: renamed from: Z */
    public int f2371Z = 0;

    /* JADX INFO: renamed from: a0 */
    public int f2372a0 = 0;

    /* JADX INFO: renamed from: b0 */
    public boolean f2373b0 = true;

    /* JADX INFO: renamed from: c0 */
    public boolean f2374c0 = true;

    /* JADX INFO: renamed from: d0 */
    public int f2375d0 = -1;

    /* JADX INFO: renamed from: f0 */
    public final d f2377f0 = new d();

    /* JADX INFO: renamed from: j0 */
    public boolean f2381j0 = false;

    /* JADX INFO: renamed from: a.j5$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DialogInterfaceOnCancelListenerC0646j5 dialogInterfaceOnCancelListenerC0646j5 = DialogInterfaceOnCancelListenerC0646j5.this;
            dialogInterfaceOnCancelListenerC0646j5.f2370Y.onDismiss(dialogInterfaceOnCancelListenerC0646j5.f2378g0);
        }
    }

    /* JADX INFO: renamed from: a.j5$b */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC0646j5 dialogInterfaceOnCancelListenerC0646j5 = DialogInterfaceOnCancelListenerC0646j5.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC0646j5.f2378g0;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC0646j5.onCancel(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: a.j5$c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            DialogInterfaceOnCancelListenerC0646j5 dialogInterfaceOnCancelListenerC0646j5 = DialogInterfaceOnCancelListenerC0646j5.this;
            Dialog dialog = dialogInterfaceOnCancelListenerC0646j5.f2378g0;
            if (dialog != null) {
                dialogInterfaceOnCancelListenerC0646j5.onDismiss(dialog);
            }
        }
    }

    /* JADX INFO: renamed from: a.j5$d */
    public class d {
        public d() {
        }
    }

    /* JADX INFO: renamed from: a.j5$e */
    public class e extends AbstractC0472a2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC1100b.c f2386a;

        public e(ComponentCallbacksC1100b.c cVar) {
            this.f2386a = cVar;
        }

        @Override // p000a.AbstractC0472a2
        /* JADX INFO: renamed from: c */
        public final View mo1067c(int i) {
            ComponentCallbacksC1100b.c cVar = this.f2386a;
            if (cVar.mo1068f()) {
                return cVar.mo1067c(i);
            }
            Dialog dialog = DialogInterfaceOnCancelListenerC0646j5.this.f2378g0;
            if (dialog != null) {
                return dialog.findViewById(i);
            }
            return null;
        }

        @Override // p000a.AbstractC0472a2
        /* JADX INFO: renamed from: f */
        public final boolean mo1068f() {
            return this.f2386a.mo1068f() || DialogInterfaceOnCancelListenerC0646j5.this.f2381j0;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m1506F(boolean z, boolean z2) {
        if (this.f2380i0) {
            return;
        }
        this.f2380i0 = true;
        Dialog dialog = this.f2378g0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2378g0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f2367V.getLooper()) {
                    onDismiss(this.f2378g0);
                } else {
                    this.f2367V.post(this.f2368W);
                }
            }
        }
        this.f2379h0 = true;
        if (this.f2375d0 >= 0) {
            AbstractC0553e7 abstractC0553e7M2533f = m2533f();
            int i = this.f2375d0;
            if (i < 0) {
                throw new IllegalArgumentException(C0944z.m2225e("Bad id: ", i));
            }
            abstractC0553e7M2533f.m1384x(abstractC0553e7M2533f.new j(i), z);
            this.f2375d0 = -1;
            return;
        }
        C0327S1 c0327s1 = new C0327S1(m2533f());
        c0327s1.f3014o = true;
        AbstractC0553e7 abstractC0553e7 = this.f4576t;
        if (abstractC0553e7 != null && abstractC0553e7 != c0327s1.f1161q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0327s1.m1801b(new AbstractC0762p7.a(3, this));
        if (z) {
            c0327s1.m904d(true);
        } else {
            c0327s1.m904d(false);
        }
    }

    /* JADX INFO: renamed from: G */
    public Dialog mo1507G() {
        if (AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0078E3(m2524A(), this.f2372a0);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: a */
    public final AbstractC0472a2 mo1508a() {
        return new e(new ComponentCallbacksC1100b.c());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    @Deprecated
    /* JADX INFO: renamed from: l */
    public final void mo1509l() {
        this.f4541E = true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: n */
    public final void mo1510n(ActivityC0422X6 activityC0422X6) {
        super.mo1510n(activityC0422X6);
        this.f4553Q.m2581d(this.f2377f0);
        this.f2380i0 = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: o */
    public void mo994o(Bundle bundle) {
        super.mo994o(bundle);
        this.f2367V = new Handler();
        this.f2374c0 = this.f4581y == 0;
        if (bundle != null) {
            this.f2371Z = bundle.getInt("android:style", 0);
            this.f2372a0 = bundle.getInt("android:theme", 0);
            this.f2373b0 = bundle.getBoolean("android:cancelable", true);
            this.f2374c0 = bundle.getBoolean("android:showsDialog", this.f2374c0);
            this.f2375d0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2379h0) {
            return;
        }
        if (AbstractC0553e7.m1330J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m1506F(true, true);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: q */
    public final void mo1070q() {
        this.f4541E = true;
        Dialog dialog = this.f2378g0;
        if (dialog != null) {
            this.f2379h0 = true;
            dialog.setOnDismissListener(null);
            this.f2378g0.dismiss();
            if (!this.f2380i0) {
                onDismiss(this.f2378g0);
            }
            this.f2378g0 = null;
            this.f2381j0 = false;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: r */
    public final void mo1511r() {
        this.f4541E = true;
        if (!this.f2380i0) {
            this.f2380i0 = true;
        }
        C0031Bb<InterfaceC0935y9> c0031Bb = this.f4553Q;
        d dVar = this.f2377f0;
        c0031Bb.getClass();
        LiveData.m2578a("removeObserver");
        LiveData<InterfaceC0935y9>.AbstractC1110b abstractC1110bMo325b = c0031Bb.f4646b.mo325b(dVar);
        if (abstractC1110bMo325b == null) {
            return;
        }
        abstractC1110bMo325b.mo2582d();
        abstractC1110bMo325b.m2584c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater mo1512s(Bundle bundle) {
        Context contextM2531d;
        LayoutInflater layoutInflaterMo1512s = super.mo1512s(bundle);
        boolean z = this.f2374c0;
        if (z && !this.f2376e0) {
            if (z && !this.f2381j0) {
                try {
                    this.f2376e0 = true;
                    Dialog dialogMo1507G = mo1507G();
                    this.f2378g0 = dialogMo1507G;
                    if (this.f2374c0) {
                        int i = this.f2371Z;
                        if (i == 1 || i == 2) {
                            dialogMo1507G.requestWindowFeature(1);
                            contextM2531d = m2531d();
                            if (contextM2531d != null) {
                                this.f2378g0.setOwnerActivity((Activity) contextM2531d);
                            }
                            this.f2378g0.setCancelable(this.f2373b0);
                            this.f2378g0.setOnCancelListener(this.f2369X);
                            this.f2378g0.setOnDismissListener(this.f2370Y);
                            this.f2381j0 = true;
                        } else if (i == 3) {
                            Window window = dialogMo1507G.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                            dialogMo1507G.requestWindowFeature(1);
                            contextM2531d = m2531d();
                            if (contextM2531d != null) {
                            }
                            this.f2378g0.setCancelable(this.f2373b0);
                            this.f2378g0.setOnCancelListener(this.f2369X);
                            this.f2378g0.setOnDismissListener(this.f2370Y);
                            this.f2381j0 = true;
                        } else {
                            contextM2531d = m2531d();
                            if (contextM2531d != null) {
                            }
                            this.f2378g0.setCancelable(this.f2373b0);
                            this.f2378g0.setOnCancelListener(this.f2369X);
                            this.f2378g0.setOnDismissListener(this.f2370Y);
                            this.f2381j0 = true;
                        }
                    } else {
                        this.f2378g0 = null;
                    }
                    this.f2376e0 = false;
                } catch (Throwable th) {
                    this.f2376e0 = false;
                    throw th;
                }
            }
            if (AbstractC0553e7.m1330J(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2378g0;
            if (dialog != null) {
                return layoutInflaterMo1512s.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC0553e7.m1330J(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f2374c0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterMo1512s;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterMo1512s;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: t */
    public void mo996t(Bundle bundle) {
        Dialog dialog = this.f2378g0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f2371Z;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f2372a0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f2373b0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f2374c0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f2375d0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: u */
    public void mo1513u() {
        this.f4541E = true;
        Dialog dialog = this.f2378g0;
        if (dialog != null) {
            this.f2379h0 = false;
            dialog.show();
            View decorView = this.f2378g0.getWindow().getDecorView();
            C0235Mg.m628a(decorView, this);
            decorView.setTag(C1137R.id.view_tree_view_model_store_owner, this);
            C1225b.m3011a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: v */
    public void mo1514v() {
        this.f4541E = true;
        Dialog dialog = this.f2378g0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: x */
    public final void mo1515x(Bundle bundle) {
        Bundle bundle2;
        this.f4541E = true;
        if (this.f2378g0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2378g0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1100b
    /* JADX INFO: renamed from: y */
    public final void mo1516y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1516y(layoutInflater, viewGroup, bundle);
        if (this.f4543G != null || this.f2378g0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2378g0.onRestoreInstanceState(bundle2);
    }
}
