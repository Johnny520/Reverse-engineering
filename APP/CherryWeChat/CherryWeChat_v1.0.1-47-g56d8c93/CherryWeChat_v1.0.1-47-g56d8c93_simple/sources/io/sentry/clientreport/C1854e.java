package io.sentry.clientreport;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.clientreport.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1854e implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final String f6675a;

    /* JADX INFO: renamed from: b */
    public final String f6676b;

    /* JADX INFO: renamed from: c */
    public final Long f6677c;

    /* JADX INFO: renamed from: d */
    public HashMap f6678d;

    public C1854e(String r1, String r2, Long r3) {
        this.f6675a = r1;
        this.f6676b = r2;
        this.f6677c = r3;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("reason");
        r42.m4115z(this.f6675a);
        r42.m4106p("category");
        r42.m4115z(this.f6676b);
        r42.m4106p("quantity");
        r42.m4114y(this.f6677c);
        HashMap r0 = this.f6678d;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f6678d, r1, r42, r1, r5);
    L8:
        r42.m4102k();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f6675a + "', category='" + this.f6676b + "', quantity=" + this.f6677c + '}';
    }
}
