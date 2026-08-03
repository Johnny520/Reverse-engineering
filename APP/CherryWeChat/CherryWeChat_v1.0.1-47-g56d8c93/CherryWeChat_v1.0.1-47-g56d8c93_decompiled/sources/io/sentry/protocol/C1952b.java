package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1952b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6886a;

    /* JADX INFO: renamed from: b */
    public String f6887b;

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap f6888c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1952b.class == obj.getClass()) {
            C1952b c1952b = (C1952b) obj;
            if (AbstractC1856a.m4063i(this.f6886a, c1952b.f6886a) && AbstractC1856a.m4063i(this.f6887b, c1952b.f6887b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6886a, this.f6887b});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6886a != null) {
            c1901c.m4106p("name");
            c1901c.m4115z(this.f6886a);
        }
        if (this.f6887b != null) {
            c1901c.m4106p("version");
            c1901c.m4115z(this.f6887b);
        }
        ConcurrentHashMap concurrentHashMap = this.f6888c;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6888c, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
