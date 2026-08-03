package p000;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: KB */
/* JADX INFO: loaded from: classes.dex */
public final class C0442KB extends AbstractC0399JB {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0521M4 f1444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0485LB f1445b;

    public C0442KB(ViewTreeObserverOnPreDrawListenerC0485LB r1, C0521M4 r2) {
        this.f1445b = r1;
        this.f1444a = r2;
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: d */
    public final void mo665d(AbstractC0356IB r3) {
        ViewGroup r0 = this.f1445b.f1593b;
        ((ArrayList) this.f1444a.get(r0)).remove(r3);
        r3.mo786x(this);
    }
}
