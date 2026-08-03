package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1972v implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f7016a;

    /* JADX INFO: renamed from: b */
    public String f7017b;

    /* JADX INFO: renamed from: c */
    public String f7018c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap f7019d;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f7016a != null) {
            c1901c.m4106p("name");
            c1901c.m4115z(this.f7016a);
        }
        if (this.f7017b != null) {
            c1901c.m4106p("version");
            c1901c.m4115z(this.f7017b);
        }
        if (this.f7018c != null) {
            c1901c.m4106p("raw_description");
            c1901c.m4115z(this.f7018c);
        }
        ConcurrentHashMap concurrentHashMap = this.f7019d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f7019d, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
