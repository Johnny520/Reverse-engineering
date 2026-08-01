package p000;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0036a;

/* JADX INFO: renamed from: pl */
/* JADX INFO: loaded from: classes.dex */
public final class C0600pl extends AbstractC0259gf implements xa0, InterfaceC0716sq, InterfaceC0156dm {

    /* JADX INFO: renamed from: A */
    public final Handler f3724A;

    /* JADX INFO: renamed from: B */
    public final C0023am f3725B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ FragmentActivity f3726C;

    /* JADX INFO: renamed from: y */
    public final FragmentActivity f3727y;

    /* JADX INFO: renamed from: z */
    public final FragmentActivity f3728z;

    public C0600pl(FragmentActivity fragmentActivity) {
        this.f3726C = fragmentActivity;
        Handler handler = new Handler();
        this.f3725B = new C0023am();
        this.f3727y = fragmentActivity;
        this.f3728z = fragmentActivity;
        this.f3724A = handler;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: K */
    public final View mo1264K(int i) {
        return this.f3726C.findViewById(i);
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: L */
    public final boolean mo1265L() {
        Window window = this.f3726C.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p000.xa0
    /* JADX INFO: renamed from: d */
    public final wa0 mo104d() {
        return this.f3726C.mo104d();
    }

    @Override // p000.InterfaceC0716sq
    /* JADX INFO: renamed from: e */
    public final C0036a mo105e() {
        return this.f3726C.f459t;
    }

    @Override // p000.InterfaceC0156dm
    /* JADX INFO: renamed from: a */
    public final void mo928a() {
    }
}
