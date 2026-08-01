package p014b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.AbstractC0679p0;
import androidx.lifecycle.C0680q;
import androidx.lifecycle.InterfaceC0676o;
import p024b9.AbstractC1043k;
import p181m4.AbstractC4977n;
import p181m4.C4970g;
import p181m4.C4972i;
import p181m4.InterfaceC4973j;

/* JADX INFO: renamed from: b.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC0710l extends Dialog implements InterfaceC0676o, InterfaceC0718t, InterfaceC4973j {

    /* JADX INFO: renamed from: q */
    public C0680q f2093q;

    /* JADX INFO: renamed from: r */
    public final C4972i f2094r;

    /* JADX INFO: renamed from: s */
    public final C0715q f2095s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogC0710l(Context context, int i10) {
        super(context, i10);
        context.getClass();
        this.f2094r = C4972i.f15109c.m20078b(this);
        this.f2095s = new C0715q(new Runnable() { // from class: b.k
            @Override // java.lang.Runnable
            public final void run() {
                AbstractDialogC0710l.m2786a(this.f2092q);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m2786a(AbstractDialogC0710l abstractDialogC0710l) {
        abstractDialogC0710l.getClass();
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m2789d();
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final C0680q m2787b() {
        C0680q c0680q = this.f2093q;
        if (c0680q != null) {
            return c0680q;
        }
        C0680q c0680q2 = new C0680q(this);
        this.f2093q = c0680q2;
        return c0680q2;
    }

    /* JADX INFO: renamed from: c */
    public final C0715q m2788c() {
        return this.f2095s;
    }

    /* JADX INFO: renamed from: d */
    public void m2789d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        AbstractC0679p0.m2662b(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        AbstractC0721w.m2834a(decorView2, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        AbstractC4977n.m20087b(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC0676o
    public AbstractC0668k getLifecycle() {
        return m2787b();
    }

    @Override // p181m4.InterfaceC4973j
    public C4970g getSavedStateRegistry() {
        return this.f2094r.m20073b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f2095s.m2813l();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C0715q c0715q = this.f2095s;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            c0715q.m2816o(onBackInvokedDispatcher);
        }
        this.f2094r.m20075d(bundle);
        m2787b().m2667h(AbstractC0668k.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f2094r.m20076e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m2787b().m2667h(AbstractC0668k.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m2787b().m2667h(AbstractC0668k.a.ON_DESTROY);
        this.f2093q = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        m2789d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        m2789d();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m2789d();
        super.setContentView(view, layoutParams);
    }

    public /* synthetic */ AbstractDialogC0710l(Context context, int i10, int i11, AbstractC1043k abstractC1043k) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }
}
