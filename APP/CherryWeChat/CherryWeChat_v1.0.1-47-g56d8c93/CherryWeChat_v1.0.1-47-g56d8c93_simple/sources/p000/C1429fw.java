package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: fw */
/* JADX INFO: loaded from: classes.dex */
public final class C1429fw implements InterfaceC1091Za {

    /* JADX INFO: renamed from: a */
    public final C2692wy f5032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentCallbacks2C1473gw f5033b;

    public C1429fw(ComponentCallbacks2C1473gw r1, C2692wy r2) {
        this.f5033b = r1;
        this.f5032a = r2;
    }

    @Override // p000.InterfaceC1091Za
    /* JADX INFO: renamed from: a */
    public final void mo2019a(boolean r5) {
        if (r5 == false) goto L21;
        ComponentCallbacks2C1473gw r52 = this.f5033b;
        monitor-enter(r52);
        C2692wy r0 = this.f5032a;     // Catch: Throwable -> L18
        Iterator r1 = AbstractC2622vD.m5134e((Set) r0.f9265c).iterator();     // Catch: Throwable -> L18
    L7:
        if (r1.hasNext() == false) goto L16;
        InterfaceC1026Xv r2 = (InterfaceC1026Xv) r1.next();     // Catch: Throwable -> L18
        if (r2.mo1942k() == true) goto L7;
        if (r2.mo1940i() == true) goto L7;
        r2.clear();     // Catch: Throwable -> L18
        if (r0.f9264b == false) goto L14;
        ((HashSet) r0.f9266d).add(r2);     // Catch: Throwable -> L18
        goto L7
    L14:
        r2.mo1941j();     // Catch: Throwable -> L18
        goto L7
    L16:
        monitor-exit(r52);     // Catch: Throwable -> L18
        return;
    L18:
        th = move-exception;
        throw th;
    }
}
