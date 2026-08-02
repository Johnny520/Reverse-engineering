package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class br2 implements InterfaceC0827vy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ er2 f999a;

    public br2(er2 er2Var) {
        this.f999a = er2Var;
    }

    @Override // p000.InterfaceC0827vy
    /* JADX INFO: renamed from: a */
    public final void mo583a(boolean z) {
        ArrayList arrayList;
        b93.m494a();
        synchronized (this.f999a) {
            arrayList = new ArrayList((HashSet) this.f999a.f2578k);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0827vy) it.next()).mo583a(z);
        }
    }
}
