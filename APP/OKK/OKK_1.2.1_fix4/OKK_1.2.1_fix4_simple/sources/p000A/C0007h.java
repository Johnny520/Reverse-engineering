package p000A;

import java.util.ArrayList;
import p004C.InterfaceC0060a;
import p063j.C0966k;

/* JADX INFO: renamed from: A.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0007h implements InterfaceC0060a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f21b;

    public /* synthetic */ C0007h(int r1, Object r2) {
        this.f20a = r1;
        this.f21b = r2;
    }

    @Override // p004C.InterfaceC0060a
    /* JADX INFO: renamed from: a */
    public final void mo16a(Object r5) {
        switch(this.f20a) {
            case 0: goto L21;
            default: goto L4;
        };
    L4:
        C0008i r52 = (C0008i) r5;
        Object r02 = AbstractC0009j.f26c;
        monitor-enter(r02);
        C0966k r1 = AbstractC0009j.f27d;     // Catch: Throwable -> L10
        ArrayList r2 = (ArrayList) r1.getOrDefault((String) this.f21b, null);     // Catch: Throwable -> L10
        if (r2 != null) goto L12;
        monitor-exit(r02);     // Catch: Throwable -> L10
        return;
    L12:
        r1.remove((String) this.f21b);     // Catch: Throwable -> L10
        monitor-exit(r02);     // Catch: Throwable -> L10
        int r03 = 0;
    L16:
        if (r03 >= r2.size()) goto L28;
        ((InterfaceC0060a) r2.get(r03)).mo16a(r52);
        r03 = r03 + 1;
        goto L16
    L28:
        return;
    L10:
        th = move-exception;
        throw th;
    L21:
        C0008i r53 = (C0008i) r5;
        if (r53 != null) goto L24;
        r53 = new C0008i(-3);
    L24:
        ((C0002c) this.f21b).m9j(r53);
    }
}
