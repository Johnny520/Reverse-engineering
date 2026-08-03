package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: hA */
/* JADX INFO: loaded from: classes.dex */
public final class C1488hA implements InterfaceC0975Wn {

    /* JADX INFO: renamed from: a */
    public final Set f5258a;

    public C1488hA() {
        this.f5258a = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: b */
    public final void mo392b() {
        Iterator r0 = AbstractC2622vD.m5134e(this.f5258a).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((InterfaceC1444gA) r0.next()).mo392b();
        goto L4
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: d */
    public final void mo394d() {
        Iterator r0 = AbstractC2622vD.m5134e(this.f5258a).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((InterfaceC1444gA) r0.next()).mo394d();
        goto L4
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: k */
    public final void mo401k() {
        Iterator r0 = AbstractC2622vD.m5134e(this.f5258a).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((InterfaceC1444gA) r0.next()).mo401k();
        goto L4
    }
}
