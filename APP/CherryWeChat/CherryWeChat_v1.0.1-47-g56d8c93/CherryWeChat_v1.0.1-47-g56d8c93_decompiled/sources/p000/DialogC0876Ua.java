package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Ua */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0876Ua extends Dialog implements InterfaceC1061Yn, InterfaceC2075ix {

    /* JADX INFO: renamed from: a */
    public C1185ao f2760a;

    /* JADX INFO: renamed from: b */
    public final C2692wy f2761b;

    /* JADX INFO: renamed from: c */
    public final C2335ot f2762c;

    public DialogC0876Ua(Context context, int i) {
        super(context, i);
        this.f2761b = new C2692wy(this);
        this.f2762c = new C2335ot(new RunnableC0562N2(7, this));
    }

    /* JADX INFO: renamed from: a */
    public static void m1717a(DialogC0876Ua dialogC0876Ua) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1718b();
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m1718b() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // p000.InterfaceC1061Yn
    public final AbstractC0760Rn getLifecycle() {
        C1185ao c1185ao = this.f2760a;
        if (c1185ao != null) {
            return c1185ao;
        }
        C1185ao c1185ao2 = new C1185ao(this);
        this.f2760a = c1185ao2;
        return c1185ao2;
    }

    @Override // p000.InterfaceC2075ix
    public final C1518hx getSavedStateRegistry() {
        return (C1518hx) this.f2761b.f9266d;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f2762c.m4742b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C2335ot c2335ot = this.f2762c;
            c2335ot.f8207e = onBackInvokedDispatcher;
            c2335ot.m4743c(c2335ot.f8209g);
        }
        this.f2761b.m5269d(bundle);
        C1185ao c1185ao = this.f2760a;
        if (c1185ao == null) {
            c1185ao = new C1185ao(this);
            this.f2760a = c1185ao;
        }
        c1185ao.m2276e(EnumC0632On.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.f2761b.m5270e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C1185ao c1185ao = this.f2760a;
        if (c1185ao == null) {
            c1185ao = new C1185ao(this);
            this.f2760a = c1185ao;
        }
        c1185ao.m2276e(EnumC0632On.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C1185ao c1185ao = this.f2760a;
        if (c1185ao == null) {
            c1185ao = new C1185ao(this);
            this.f2760a = c1185ao;
        }
        c1185ao.m2276e(EnumC0632On.ON_DESTROY);
        this.f2760a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m1718b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m1718b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1718b();
        super.setContentView(view, layoutParams);
    }
}
