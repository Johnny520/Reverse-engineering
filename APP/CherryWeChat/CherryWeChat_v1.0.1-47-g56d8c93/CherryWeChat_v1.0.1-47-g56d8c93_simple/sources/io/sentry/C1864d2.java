package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1864d2 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6687a;

    /* JADX INFO: renamed from: b */
    public final Object f6688b;

    /* JADX INFO: renamed from: c */
    public AbstractMap f6689c;

    public /* synthetic */ C1864d2(int r1, Object r2) {
        this.f6687a = r1;
        this.f6688b = r2;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        switch(this.f6687a) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        String r0 = (String) this.f6688b;
        if (r0 == null) goto L7;
        r42.m4106p("source");
        r42.m4112w(r5, r0);
    L7:
        ConcurrentHashMap r02 = (ConcurrentHashMap) this.f6689c;
        if (r02 == null) goto L13;
        Iterator r03 = r02.keySet().iterator();
    L11:
        if (r03.hasNext() == false) goto L13;
        String r1 = (String) r03.next();
        AbstractC1861d.m4087b((ConcurrentHashMap) this.f6689c, r1, r42, r1, r5);
    L13:
        r42.m4102k();
        return;
    L15:
        C1901c r43 = (C1901c) r4;
        r43.m4101h();
        r43.m4106p("items");
        r43.m4112w(r5, (List) this.f6688b);
        HashMap r04 = (HashMap) this.f6689c;
        if (r04 == null) goto L21;
        Iterator r05 = r04.keySet().iterator();
    L19:
        if (r05.hasNext() == false) goto L21;
        String r12 = (String) r05.next();
        AbstractC1861d.m4086a((HashMap) this.f6689c, r12, r43, r12, r5);
    L21:
        r43.m4102k();
    }
}
