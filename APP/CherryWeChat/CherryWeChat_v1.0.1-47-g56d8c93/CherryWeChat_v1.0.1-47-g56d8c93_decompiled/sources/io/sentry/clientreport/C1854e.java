package io.sentry.clientreport;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.HashMap;

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

    public C1854e(String str, String str2, Long l) {
        this.f6675a = str;
        this.f6676b = str2;
        this.f6677c = l;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("reason");
        c1901c.m4115z(this.f6675a);
        c1901c.m4106p("category");
        c1901c.m4115z(this.f6676b);
        c1901c.m4106p("quantity");
        c1901c.m4114y(this.f6677c);
        HashMap map = this.f6678d;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f6678d, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f6675a + "', category='" + this.f6676b + "', quantity=" + this.f6677c + '}';
    }
}
