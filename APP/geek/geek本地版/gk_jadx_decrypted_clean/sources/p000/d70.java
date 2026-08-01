package p000;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d70 implements InterfaceC0469m1, InterfaceC0350iu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Toolbar f1398a;

    public /* synthetic */ d70(Toolbar toolbar) {
        this.f1398a = toolbar;
    }

    @Override // p000.InterfaceC0350iu
    /* JADX INFO: renamed from: k */
    public void mo925k(MenuC0424ku menuC0424ku) {
        Toolbar toolbar = this.f1398a;
        C0358j1 c0358j1 = toolbar.f366a.f285t;
        if (c0358j1 == null || !c0358j1.m1541j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f355G.f1364c).iterator();
            if (it.hasNext()) {
                throw z30.m2763h(it);
            }
        }
    }

    @Override // p000.InterfaceC0350iu
    /* JADX INFO: renamed from: n */
    public boolean mo926n(MenuC0424ku menuC0424ku, MenuItem menuItem) {
        this.f1398a.getClass();
        return false;
    }
}
