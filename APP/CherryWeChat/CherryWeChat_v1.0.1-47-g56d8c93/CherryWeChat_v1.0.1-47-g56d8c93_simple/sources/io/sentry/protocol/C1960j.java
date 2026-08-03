package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1960j implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6950a;

    /* JADX INFO: renamed from: b */
    public String f6951b;

    /* JADX INFO: renamed from: c */
    public Object f6952c;

    /* JADX INFO: renamed from: d */
    public AbstractMap f6953d;

    public /* synthetic */ C1960j() {
        this.f6950a = 1;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        switch(this.f6950a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("type");
        r42.m4112w(r5, this.f6951b);
        r42.m4106p("value");
        r42.m4112w(r5, this.f6952c);
        HashMap r0 = (HashMap) this.f6953d;
        if (r0 == null) goto L10;
        Iterator r02 = r0.keySet().iterator();
    L8:
        if (r02.hasNext() == false) goto L10;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a((HashMap) this.f6953d, r1, r42, r1, r5);
    L10:
        r42.m4102k();
        return;
    L12:
        C1901c r43 = (C1901c) r4;
        r43.m4101h();
        r43.m4106p("value");
        r43.m4114y((Number) this.f6952c);
        String r03 = this.f6951b;
        if (r03 == null) goto L15;
        r43.m4106p("unit");
        r43.m4115z(r03);
    L15:
        ConcurrentHashMap r04 = (ConcurrentHashMap) this.f6953d;
        if (r04 == null) goto L21;
        Iterator r05 = r04.keySet().iterator();
    L19:
        if (r05.hasNext() == false) goto L21;
        String r12 = (String) r05.next();
        AbstractC1861d.m4087b((ConcurrentHashMap) this.f6953d, r12, r43, r12, r5);
    L21:
        r43.m4102k();
    }

    public C1960j(Number r2, String r3) {
        this.f6950a = 0;
        this.f6952c = r2;
        this.f6951b = r3;
    }
}
