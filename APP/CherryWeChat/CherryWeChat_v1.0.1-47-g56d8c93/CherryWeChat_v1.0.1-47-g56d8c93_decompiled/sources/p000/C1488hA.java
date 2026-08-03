package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: hA */
/* JADX INFO: loaded from: classes.dex */
public final class C1488hA implements InterfaceC0975Wn {

    /* JADX INFO: renamed from: a */
    public final Set f5258a = Collections.newSetFromMap(new WeakHashMap());

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: b */
    public final void mo392b() {
        Iterator it = AbstractC2622vD.m5134e(this.f5258a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1444gA) it.next()).mo392b();
        }
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: d */
    public final void mo394d() {
        Iterator it = AbstractC2622vD.m5134e(this.f5258a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1444gA) it.next()).mo394d();
        }
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: k */
    public final void mo401k() {
        Iterator it = AbstractC2622vD.m5134e(this.f5258a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1444gA) it.next()).mo401k();
        }
    }
}
