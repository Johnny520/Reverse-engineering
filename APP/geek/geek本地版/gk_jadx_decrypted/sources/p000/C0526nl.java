package p000;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0036a;

/* JADX INFO: renamed from: nl */
/* JADX INFO: loaded from: classes.dex */
public final class C0526nl extends AbstractC0346ip implements sa0, InterfaceC0568oq, InterfaceC0073bm {

    /* JADX INFO: renamed from: C */
    public final FragmentActivity f3427C;

    /* JADX INFO: renamed from: D */
    public final FragmentActivity f3428D;

    /* JADX INFO: renamed from: E */
    public final Handler f3429E;

    /* JADX INFO: renamed from: F */
    public final C0934yl f3430F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ FragmentActivity f3431G;

    public C0526nl(FragmentActivity fragmentActivity) {
        this.f3431G = fragmentActivity;
        Handler handler = new Handler();
        this.f3430F = new C0934yl();
        this.f3427C = fragmentActivity;
        this.f3428D = fragmentActivity;
        this.f3429E = handler;
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: G */
    public final View mo1513G(int i) {
        return this.f3431G.findViewById(i);
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: H */
    public final boolean mo1514H() {
        Window window = this.f3431G.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p000.sa0
    /* JADX INFO: renamed from: d */
    public final ra0 mo119d() {
        return this.f3431G.mo119d();
    }

    @Override // p000.InterfaceC0568oq
    /* JADX INFO: renamed from: e */
    public final C0036a mo120e() {
        return this.f3431G.f496t;
    }

    @Override // p000.InterfaceC0073bm
    /* JADX INFO: renamed from: a */
    public final void mo561a() {
    }
}
