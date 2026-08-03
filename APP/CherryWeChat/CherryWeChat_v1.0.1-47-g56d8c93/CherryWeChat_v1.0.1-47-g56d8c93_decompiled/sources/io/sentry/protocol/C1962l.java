package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1962l implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6965a;

    /* JADX INFO: renamed from: b */
    public String f6966b;

    /* JADX INFO: renamed from: c */
    public List f6967c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap f6968d;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6965a != null) {
            c1901c.m4106p("formatted");
            c1901c.m4115z(this.f6965a);
        }
        if (this.f6966b != null) {
            c1901c.m4106p("message");
            c1901c.m4115z(this.f6966b);
        }
        List list = this.f6967c;
        if (list != null && !list.isEmpty()) {
            c1901c.m4106p("params");
            c1901c.m4112w(iLogger, this.f6967c);
        }
        ConcurrentHashMap concurrentHashMap = this.f6968d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6968d, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
