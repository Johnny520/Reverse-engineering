package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: Rh */
/* JADX INFO: loaded from: classes.dex */
public final class C0754Rh implements InterfaceC2583ub {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2391b;

    public /* synthetic */ C0754Rh(int r1, Object r2) {
        this.f2390a = r1;
        this.f2391b = r2;
    }

    @Override // p000.InterfaceC2583ub
    public final void accept(Object r5) {
        switch(this.f2390a) {
            case 0: goto L21;
            default: goto L4;
        };
    L4:
        C0797Sh r52 = (C0797Sh) r5;
        Object r0 = AbstractC0840Th.f2671c;
        monitor-enter(r0);
        C2520sy r1 = AbstractC0840Th.f2672d;     // Catch: Throwable -> L10
        ArrayList r2 = (ArrayList) r1.get((String) this.f2391b);     // Catch: Throwable -> L10
        if (r2 != null) goto L12;
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L12:
        r1.remove((String) this.f2391b);     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        int r02 = 0;
    L16:
        if (r02 >= r2.size()) goto L28;
        ((InterfaceC2583ub) r2.get(r02)).accept(r52);
        r02 = r02 + 1;
        goto L16
    L28:
        return;
    L10:
        th = move-exception;
        throw th;
    L21:
        C0797Sh r53 = (C0797Sh) r5;
        if (r53 != null) goto L24;
        r53 = new C0797Sh(-3);
    L24:
        ((C0649P3) this.f2391b).m1281L(r53);
    }
}
