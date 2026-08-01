package p000;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j70 implements InterfaceC0469m1, InterfaceC0572ou {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Toolbar f2675a;

    public /* synthetic */ j70(Toolbar toolbar) {
        this.f2675a = toolbar;
    }

    @Override // p000.InterfaceC0572ou
    /* JADX INFO: renamed from: k */
    public void mo623k(MenuC0646qu menuC0646qu) {
        Toolbar toolbar = this.f2675a;
        C0358j1 c0358j1 = toolbar.f329a.f248t;
        if (c0358j1 == null || !c0358j1.m1561j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f318G.f1298c).iterator();
            if (it.hasNext()) {
                throw g40.m1145h(it);
            }
        }
    }

    @Override // p000.InterfaceC0572ou
    /* JADX INFO: renamed from: n */
    public boolean mo626n(MenuC0646qu menuC0646qu, MenuItem menuItem) {
        this.f2675a.getClass();
        return false;
    }
}
