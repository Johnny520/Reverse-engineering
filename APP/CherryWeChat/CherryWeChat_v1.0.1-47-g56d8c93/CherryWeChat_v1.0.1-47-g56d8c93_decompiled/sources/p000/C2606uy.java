package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: uy */
/* JADX INFO: loaded from: classes.dex */
public final class C2606uy implements InterfaceC1091Za {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2692wy f8993a;

    public C2606uy(C2692wy c2692wy) {
        this.f8993a = c2692wy;
    }

    @Override // p000.InterfaceC1091Za
    /* JADX INFO: renamed from: a */
    public final void mo2019a(boolean z) {
        ArrayList arrayList;
        AbstractC2622vD.m5130a();
        synchronized (this.f8993a) {
            arrayList = new ArrayList((HashSet) this.f8993a.f9266d);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC1091Za) it.next()).mo2019a(z);
        }
    }
}
