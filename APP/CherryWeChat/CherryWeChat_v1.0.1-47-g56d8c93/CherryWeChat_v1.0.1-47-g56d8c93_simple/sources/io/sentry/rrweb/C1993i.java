package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.rrweb.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1993i extends AbstractC1989e implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: d */
    public int f7131d;

    /* JADX INFO: renamed from: e */
    public List f7132e;

    /* JADX INFO: renamed from: f */
    public HashMap f7133f;

    /* JADX INFO: renamed from: g */
    public HashMap f7134g;

    public C1993i() {
        super(EnumC1988d.TouchMove);
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("type");
        r42.m4112w(r5, this.f7115a);
        r42.m4106p("timestamp");
        r42.m4111v(this.f7116b);
        r42.m4106p("data");
        r42.m4101h();
        r42.m4106p("source");
        r42.m4112w(r5, this.f7117c);
        List r0 = this.f7132e;
        if (r0 != null) goto L5;
    L7:
        r42.m4106p("pointerId");
        r42.m4111v(this.f7131d);
        HashMap r02 = this.f7134g;
        if (r02 == null) goto L13;
        Iterator r03 = r02.keySet().iterator();
    L11:
        if (r03.hasNext() == false) goto L13;
        String r1 = (String) r03.next();
        AbstractC1861d.m4086a(this.f7134g, r1, r42, r1, r5);
    L13:
        r42.m4102k();
        HashMap r04 = this.f7133f;
        if (r04 == null) goto L19;
        Iterator r05 = r04.keySet().iterator();
    L17:
        if (r05.hasNext() == false) goto L19;
        String r12 = (String) r05.next();
        AbstractC1861d.m4086a(this.f7133f, r12, r42, r12, r5);
    L19:
        r42.m4102k();
        return;
    L5:
        if (r0.isEmpty() == true) goto L7;
        r42.m4106p("positions");
        r42.m4112w(r5, this.f7132e);
        goto L7
    }
}
