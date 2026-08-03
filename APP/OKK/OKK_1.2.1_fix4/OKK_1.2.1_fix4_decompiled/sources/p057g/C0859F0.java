package p057g;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0507g;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p055f.InterfaceC0777h;
import p055f.MenuC0779j;

/* JADX INFO: renamed from: g.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0859F0 implements InterfaceC0912l, InterfaceC0777h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Toolbar f3090a;

    public /* synthetic */ C0859F0(Toolbar toolbar) {
        this.f3090a = toolbar;
    }

    @Override // p055f.InterfaceC0777h
    /* JADX INFO: renamed from: l */
    public void mo346l(MenuC0779j menuC0779j) {
        C0900f c0900f;
        Toolbar toolbar = this.f3090a;
        C0906i c0906i = toolbar.f1227a.f1144s;
        if (c0906i == null || (c0900f = c0906i.f3220r) == null || !c0900f.m2027b()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f1217G.f251b).iterator();
            if (it.hasNext()) {
                ((AbstractC0507g) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // p055f.InterfaceC0777h
    /* JADX INFO: renamed from: u */
    public boolean mo355u(MenuItem menuItem) {
        this.f3090a.getClass();
        return false;
    }
}
