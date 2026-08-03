package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;
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

    public C1971u(String r1, String r2) {
        this.f7013a = r1;
        this.f7014b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (C1971u.class != r5.getClass()) goto L15;
        C1971u r52 = (C1971u) r5;
        if (Objects.equals(this.f7013a, r52.f7013a) == false) goto L15;
        if (Objects.equals(this.f7014b, r52.f7014b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f7013a, this.f7014b});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("name");
        r42.m4115z(this.f7013a);
        r42.m4106p("version");
        r42.m4115z(this.f7014b);
        HashMap r0 = this.f7015c;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f7015c, r1, r42, r1, r5);
    L8:
        r42.m4102k();
    }
}
