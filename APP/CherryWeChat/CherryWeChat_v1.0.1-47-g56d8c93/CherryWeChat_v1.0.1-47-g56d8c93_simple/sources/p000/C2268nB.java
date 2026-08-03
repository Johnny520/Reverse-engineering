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

    public /* synthetic */ C2268nB(Toolbar r1) {
        this.f7988a = r1;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public boolean mo233d(MenuC2204lr r1, MenuItem r2) {
        return false;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public void mo241n(MenuC2204lr r4) {
        Toolbar r0 = this.f7988a;
        C0130D0 r1 = r0.f3823a.f3781t;
        if (r1 != null) goto L5;
    L7:
        Iterator r12 = ((CopyOnWriteArrayList) r0.f3809G.f9198d).iterator();
    L9:
        if (r12.hasNext() == false) goto L11;
        ((C2504si) ((InterfaceC0206Er) r12.next())).f8791a.m5421s();
    L11:
        C2534tB r02 = r0.f3817O;
        if (r02 == null) goto L16;
        r02.mo241n(r4);
        return;
    L16:
        return;
    L5:
        if (r1.m219h() == false) goto L7;
        goto L7
    }
}
