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

/* JADX INFO: renamed from: io.sentry.clientreport.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1851b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final Date f6670a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6671b;

    /* JADX INFO: renamed from: c */
    public HashMap f6672c;

    public C1851b(Date date, ArrayList arrayList) {
        this.f6670a = date;
        this.f6671b = arrayList;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("timestamp");
        c1901c.m4115z(AbstractC1856a.m4073t(this.f6670a));
        c1901c.m4106p("discarded_events");
        c1901c.m4112w(iLogger, this.f6671b);
        HashMap map = this.f6672c;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f6672c, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
