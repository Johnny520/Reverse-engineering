package p000;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ji */
/* JADX INFO: loaded from: classes.dex */
public final class C2104ji extends AbstractC0828TB implements InterfaceC2752yE, InterfaceC1061Yn, InterfaceC2075ix, InterfaceC0197Ei {

    /* JADX INFO: renamed from: l */
    public final AbstractActivityC1244c3 f7400l;

    /* JADX INFO: renamed from: m */
    public final AbstractActivityC1244c3 f7401m;

    /* JADX INFO: renamed from: n */
    public final Handler f7402n;

    /* JADX INFO: renamed from: o */
    public final C0025Ai f7403o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ AbstractActivityC1244c3 f7404p;

    public C2104ji(AbstractActivityC1244c3 abstractActivityC1244c3) {
        this.f7404p = abstractActivityC1244c3;
        Handler handler = new Handler();
        this.f7403o = new C0025Ai();
        this.f7400l = abstractActivityC1244c3;
        this.f7401m = abstractActivityC1244c3;
        this.f7402n = handler;
    }

    @Override // p000.InterfaceC0197Ei
    /* JADX INFO: renamed from: a */
    public final void mo390a(AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi) {
        this.f7404p.onAttachFragment(abstractComponentCallbacksC1503hi);
    }

    @Override // p000.InterfaceC1061Yn
    public final AbstractC0760Rn getLifecycle() {
        return this.f7404p.f7514v;
    }

    @Override // p000.InterfaceC2075ix
    public final C1518hx getSavedStateRegistry() {
        return this.f7404p.getSavedStateRegistry();
    }

    @Override // p000.InterfaceC2752yE
    public final C2709xE getViewModelStore() {
        return this.f7404p.getViewModelStore();
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: y */
    public final View mo852y(int i) {
        return this.f7404p.findViewById(i);
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: z */
    public final boolean mo853z() {
        Window window = this.f7404p.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
