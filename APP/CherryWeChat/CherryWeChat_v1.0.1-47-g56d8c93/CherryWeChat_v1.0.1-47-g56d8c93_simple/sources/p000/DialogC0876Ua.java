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

    public DialogC0876Ua(Context r2, int r3) {
        super(r2, r3);
        this.f2761b = new C2692wy(this);
        this.f2762c = new C2335ot(new RunnableC0562N2(7, this));
    }

    /* JADX INFO: renamed from: a */
    public static void m1717a(DialogC0876Ua r0) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View r1, ViewGroup.LayoutParams r2) {
        m1718b();
        super.addContentView(r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public final void m1718b() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // p000.InterfaceC1061Yn
    public final AbstractC0760Rn getLifecycle() {
        C1185ao r0 = this.f2760a;
        if (r0 != null) goto L6;
        C1185ao r02 = new C1185ao(this);
        this.f2760a = r02;
        return r02;
    L6:
        return r0;
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
    public void onCreate(Bundle r3) {
        super.onCreate(r3);
        if (Build.VERSION.SDK_INT < 33) goto L5;
        OnBackInvokedDispatcher r0 = AbstractC0859U.m1694d(this);
        C2335ot r1 = this.f2762c;
        r1.f8207e = r0;
        r1.m4743c(r1.f8209g);
    L5:
        this.f2761b.m5269d(r3);
        C1185ao r32 = this.f2760a;
        if (r32 != null) goto L8;
        r32 = new C1185ao(this);
        this.f2760a = r32;
    L8:
        r32.m2276e(EnumC0632On.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle r0 = super.onSaveInstanceState();
        this.f2761b.m5270e(r0);
        return r0;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C1185ao r0 = this.f2760a;
        if (r0 != null) goto L5;
        r0 = new C1185ao(this);
        this.f2760a = r0;
    L5:
        r0.m2276e(EnumC0632On.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C1185ao r0 = this.f2760a;
        if (r0 != null) goto L5;
        r0 = new C1185ao(this);
        this.f2760a = r0;
    L5:
        r0.m2276e(EnumC0632On.ON_DESTROY);
        this.f2760a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
        m1718b();
        super.setContentView(r1);
    }

    @Override // android.app.Dialog
    public void setContentView(View r1) {
        m1718b();
        super.setContentView(r1);
    }

    @Override // android.app.Dialog
    public void setContentView(View r1, ViewGroup.LayoutParams r2) {
        m1718b();
        super.setContentView(r1, r2);
    }
}
