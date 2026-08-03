package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: uy */
/* JADX INFO: loaded from: classes.dex */
public final class C2606uy implements InterfaceC1091Za {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2692wy f8993a;

    public C2606uy(C2692wy r1) {
        this.f8993a = r1;
    }

    @Override // p000.InterfaceC1091Za
    /* JADX INFO: renamed from: a */
    public final void mo2019a(boolean r4) {
        AbstractC2622vD.m5130a();
        C2692wy r0 = this.f8993a;
        monitor-enter(r0);
        ArrayList r1 = new ArrayList((HashSet) this.f8993a.f9266d);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        Iterator r02 = r1.iterator();
    L8:
        if (r02.hasNext() == false) goto L10;
        ((InterfaceC1091Za) r02.next()).mo2019a(r4);
        goto L8
    L10:
        return;
    L11:
        th = move-exception;
        throw th;
    }
}
