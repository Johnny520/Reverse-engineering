package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import java.util.HashMap;
import java.util.Iterator;
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

    public C1632S2(C1970t r1, String r2, String r3, String r4) {
        this.f5859a = r1;
        this.f5860b = r2;
        this.f5861c = r3;
        this.f5862d = r4;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("event_id");
        this.f5859a.serialize(r42, r5);
        String r0 = this.f5860b;
        if (r0 == null) goto L5;
        r42.m4106p("name");
        r42.m4115z(r0);
    L5:
        String r02 = this.f5861c;
        if (r02 == null) goto L8;
        r42.m4106p("email");
        r42.m4115z(r02);
    L8:
        String r03 = this.f5862d;
        if (r03 == null) goto L11;
        r42.m4106p("comments");
        r42.m4115z(r03);
    L11:
        HashMap r04 = this.f5863e;
        if (r04 == null) goto L17;
        Iterator r05 = r04.keySet().iterator();
    L15:
        if (r05.hasNext() == false) goto L17;
        String r1 = (String) r05.next();
        AbstractC1861d.m4086a(this.f5863e, r1, r42, r1, r5);
    L17:
        r42.m4102k();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("UserFeedback{eventId=");
        r0.append(this.f5859a);
        r0.append(", name='");
        r0.append(this.f5860b);
        r0.append("', email='");
        r0.append(this.f5861c);
        r0.append("', comments='");
        return AbstractC0213Ey.m410h(r0, this.f5862d, "'}");
    }
}
