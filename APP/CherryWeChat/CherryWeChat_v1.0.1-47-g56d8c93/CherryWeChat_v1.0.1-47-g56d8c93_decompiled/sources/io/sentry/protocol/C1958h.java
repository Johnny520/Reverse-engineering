package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1958h implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6936a;

    /* JADX INFO: renamed from: b */
    public String f6937b;

    /* JADX INFO: renamed from: c */
    public String f6938c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap f6939d;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6936a != null) {
            c1901c.m4106p("city");
            c1901c.m4115z(this.f6936a);
        }
        if (this.f6937b != null) {
            c1901c.m4106p("country_code");
            c1901c.m4115z(this.f6937b);
        }
        if (this.f6938c != null) {
            c1901c.m4106p("region");
            c1901c.m4115z(this.f6938c);
        }
        ConcurrentHashMap concurrentHashMap = this.f6939d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6939d, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
