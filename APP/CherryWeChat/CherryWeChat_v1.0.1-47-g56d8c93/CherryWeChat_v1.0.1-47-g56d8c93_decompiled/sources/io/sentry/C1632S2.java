package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import java.util.HashMap;
import p000.AbstractC0213Ey;

/* JADX INFO: renamed from: io.sentry.S2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1632S2 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final C1970t f5859a;

    /* JADX INFO: renamed from: b */
    public final String f5860b;

    /* JADX INFO: renamed from: c */
    public final String f5861c;

    /* JADX INFO: renamed from: d */
    public final String f5862d;

    /* JADX INFO: renamed from: e */
    public HashMap f5863e;

    public C1632S2(C1970t c1970t, String str, String str2, String str3) {
        this.f5859a = c1970t;
        this.f5860b = str;
        this.f5861c = str2;
        this.f5862d = str3;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("event_id");
        this.f5859a.serialize(c1901c, iLogger);
        String str = this.f5860b;
        if (str != null) {
            c1901c.m4106p("name");
            c1901c.m4115z(str);
        }
        String str2 = this.f5861c;
        if (str2 != null) {
            c1901c.m4106p("email");
            c1901c.m4115z(str2);
        }
        String str3 = this.f5862d;
        if (str3 != null) {
            c1901c.m4106p("comments");
            c1901c.m4115z(str3);
        }
        HashMap map = this.f5863e;
        if (map != null) {
            for (String str4 : map.keySet()) {
                AbstractC1861d.m4086a(this.f5863e, str4, c1901c, str4, iLogger);
            }
        }
        c1901c.m4102k();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.f5859a);
        sb.append(", name='");
        sb.append(this.f5860b);
        sb.append("', email='");
        sb.append(this.f5861c);
        sb.append("', comments='");
        return AbstractC0213Ey.m410h(sb, this.f5862d, "'}");
    }
}
