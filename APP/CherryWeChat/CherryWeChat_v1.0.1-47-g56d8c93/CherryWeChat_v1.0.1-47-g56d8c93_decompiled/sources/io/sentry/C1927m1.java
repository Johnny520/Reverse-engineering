package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.vendor.gson.stream.C2051c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1927m1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public Integer f6817a;

    /* JADX INFO: renamed from: b */
    public List f6818b;

    /* JADX INFO: renamed from: c */
    public HashMap f6819c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1927m1.class == obj.getClass()) {
            C1927m1 c1927m1 = (C1927m1) obj;
            if (AbstractC1856a.m4063i(this.f6817a, c1927m1.f6817a) && AbstractC1856a.m4063i(this.f6818b, c1927m1.f6818b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6817a, this.f6818b});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        C2051c c2051c = (C2051c) c1901c.f6781b;
        if (this.f6817a != null) {
            c1901c.m4106p("segment_id");
            c1901c.m4114y(this.f6817a);
        }
        HashMap map = this.f6819c;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f6819c, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
        c2051c.f7268f = true;
        if (this.f6817a != null) {
            c2051c.m4223p();
            c2051c.m4217d();
            c2051c.f7263a.append((CharSequence) "\n");
        }
        List list = this.f6818b;
        if (list != null) {
            c1901c.m4112w(iLogger, list);
        }
        c2051c.f7268f = false;
    }
}
