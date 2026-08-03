package p000;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: nB */
/* JADX INFO: loaded from: classes.dex */
public final class C2268nB implements InterfaceC0259G0, InterfaceC2113jr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Toolbar f7988a;

    public /* synthetic */ C2268nB(Toolbar toolbar) {
        this.f7988a = toolbar;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public boolean mo233d(MenuC2204lr menuC2204lr, MenuItem menuItem) {
        return false;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public void mo241n(MenuC2204lr menuC2204lr) {
        Toolbar toolbar = this.f7988a;
        C0130D0 c0130d0 = toolbar.f3823a.f3781t;
        if (c0130d0 == null || !c0130d0.m219h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f3809G.f9198d).iterator();
            while (it.hasNext()) {
                ((C2504si) ((InterfaceC0206Er) it.next())).f8791a.m5421s();
            }
        }
        C2534tB c2534tB = toolbar.f3817O;
        if (c2534tB != null) {
            c2534tB.mo241n(menuC2204lr);
        }
    }
}
