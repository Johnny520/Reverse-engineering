package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1873f1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public C1970t f6718a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f6719b;

    public C1873f1(C1970t c1970t) {
        this.f6718a = c1970t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1873f1) {
            return this.f6718a.equals(((C1873f1) obj).f6718a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6718a});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("profiler_id");
        c1901c.m4112w(iLogger, this.f6718a);
        ConcurrentHashMap concurrentHashMap = this.f6719b;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6719b, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
