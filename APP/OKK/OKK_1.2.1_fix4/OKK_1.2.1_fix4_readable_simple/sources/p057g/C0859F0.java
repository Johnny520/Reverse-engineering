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

    public /* synthetic */ C0859F0(Toolbar r1) {
        this.f3090a = r1;
    }

    @Override // p055f.InterfaceC0777h
    /* JADX INFO: renamed from: l */
    public void mo346l(MenuC0779j r2) {
        Toolbar r22 = this.f3090a;
        C0906i r02 = r22.f1227a.f1144s;
        if (r02 == null) goto L9;
        C0900f r03 = r02.f3220r;
        if (r03 == null) goto L9;
        if (r03.m2027b() == false) goto L9;
        return;
    L9:
        Iterator r23 = ((CopyOnWriteArrayList) r22.f1217G.f251b).iterator();
        if (r23.hasNext() == true) goto L12;
        return;
    L12:
        ((AbstractC0507g) r23.next()).getClass();
        throw null;
    }

    @Override // p055f.InterfaceC0777h
    /* JADX INFO: renamed from: u */
    public boolean mo355u(MenuItem r1) {
        this.f3090a.getClass();
        return false;
    }
}
