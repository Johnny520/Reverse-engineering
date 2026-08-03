package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: io.sentry.protocol.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1971u implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final String f7013a;

    /* JADX INFO: renamed from: b */
    public final String f7014b;

    /* JADX INFO: renamed from: c */
    public HashMap f7015c;

    public C1971u(String str, String str2) {
        this.f7013a = str;
        this.f7014b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1971u.class == obj.getClass()) {
            C1971u c1971u = (C1971u) obj;
            if (Objects.equals(this.f7013a, c1971u.f7013a) && Objects.equals(this.f7014b, c1971u.f7014b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7013a, this.f7014b);
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("name");
        c1901c.m4115z(this.f7013a);
        c1901c.m4106p("version");
        c1901c.m4115z(this.f7014b);
        HashMap map = this.f7015c;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f7015c, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
