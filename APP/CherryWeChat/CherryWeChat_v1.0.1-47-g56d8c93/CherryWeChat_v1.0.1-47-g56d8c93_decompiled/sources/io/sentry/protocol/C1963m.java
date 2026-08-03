package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1963m implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6969a;

    /* JADX INFO: renamed from: b */
    public String f6970b;

    /* JADX INFO: renamed from: c */
    public String f6971c;

    /* JADX INFO: renamed from: d */
    public String f6972d;

    /* JADX INFO: renamed from: e */
    public String f6973e;

    /* JADX INFO: renamed from: f */
    public Boolean f6974f;

    /* JADX INFO: renamed from: g */
    public ConcurrentHashMap f6975g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1963m.class == obj.getClass()) {
            C1963m c1963m = (C1963m) obj;
            if (AbstractC1856a.m4063i(this.f6969a, c1963m.f6969a) && AbstractC1856a.m4063i(this.f6970b, c1963m.f6970b) && AbstractC1856a.m4063i(this.f6971c, c1963m.f6971c) && AbstractC1856a.m4063i(this.f6972d, c1963m.f6972d) && AbstractC1856a.m4063i(this.f6973e, c1963m.f6973e) && AbstractC1856a.m4063i(this.f6974f, c1963m.f6974f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6969a, this.f6970b, this.f6971c, this.f6972d, this.f6973e, this.f6974f});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6969a != null) {
            c1901c.m4106p("name");
            c1901c.m4115z(this.f6969a);
        }
        if (this.f6970b != null) {
            c1901c.m4106p("version");
            c1901c.m4115z(this.f6970b);
        }
        if (this.f6971c != null) {
            c1901c.m4106p("raw_description");
            c1901c.m4115z(this.f6971c);
        }
        if (this.f6972d != null) {
            c1901c.m4106p("build");
            c1901c.m4115z(this.f6972d);
        }
        if (this.f6973e != null) {
            c1901c.m4106p("kernel_version");
            c1901c.m4115z(this.f6973e);
        }
        if (this.f6974f != null) {
            c1901c.m4106p("rooted");
            c1901c.m4113x(this.f6974f);
        }
        ConcurrentHashMap concurrentHashMap = this.f6975g;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6975g, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
