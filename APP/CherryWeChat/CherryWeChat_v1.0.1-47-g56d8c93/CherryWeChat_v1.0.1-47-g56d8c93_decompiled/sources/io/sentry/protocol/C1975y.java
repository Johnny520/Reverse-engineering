package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1975y implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public List f7055a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f7056b;

    /* JADX INFO: renamed from: c */
    public Boolean f7057c;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap f7058d;

    public C1975y(List list) {
        this.f7055a = list;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f7055a != null) {
            c1901c.m4106p("frames");
            c1901c.m4112w(iLogger, this.f7055a);
        }
        if (this.f7056b != null) {
            c1901c.m4106p("registers");
            c1901c.m4112w(iLogger, this.f7056b);
        }
        if (this.f7057c != null) {
            c1901c.m4106p("snapshot");
            c1901c.m4113x(this.f7057c);
        }
        ConcurrentHashMap concurrentHashMap = this.f7058d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f7058d, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
