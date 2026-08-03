package io.sentry.clientreport;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.clientreport.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1851b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final Date f6670a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6671b;

    /* JADX INFO: renamed from: c */
    public HashMap f6672c;

    public C1851b(Date r1, ArrayList r2) {
        this.f6670a = r1;
        this.f6671b = r2;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("timestamp");
        r42.m4115z(AbstractC1856a.m4073t(this.f6670a));
        r42.m4106p("discarded_events");
        r42.m4112w(r5, this.f6671b);
        HashMap r0 = this.f6672c;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f6672c, r1, r42, r1, r5);
    L8:
        r42.m4102k();
    }
}
