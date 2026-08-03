package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1945B implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String[] f6846a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f6847b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1945B.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6846a, ((C1945B) obj).f6846a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6846a);
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6846a != null) {
            c1901c.m4106p("active_profiles");
            c1901c.m4112w(iLogger, this.f6846a);
        }
        ConcurrentHashMap concurrentHashMap = this.f6847b;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6847b, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
