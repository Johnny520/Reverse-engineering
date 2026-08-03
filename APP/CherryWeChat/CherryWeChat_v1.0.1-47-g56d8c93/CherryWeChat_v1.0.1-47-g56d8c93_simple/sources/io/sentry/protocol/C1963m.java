package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.Iterator;
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

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if (C1963m.class != r5.getClass()) goto L23;
        C1963m r52 = (C1963m) r5;
        if (AbstractC1856a.m4063i(this.f6969a, r52.f6969a) == false) goto L23;
        if (AbstractC1856a.m4063i(this.f6970b, r52.f6970b) == false) goto L23;
        if (AbstractC1856a.m4063i(this.f6971c, r52.f6971c) == false) goto L23;
        if (AbstractC1856a.m4063i(this.f6972d, r52.f6972d) == false) goto L23;
        if (AbstractC1856a.m4063i(this.f6973e, r52.f6973e) == false) goto L23;
        if (AbstractC1856a.m4063i(this.f6974f, r52.f6974f) == false) goto L23;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6969a, this.f6970b, this.f6971c, this.f6972d, this.f6973e, this.f6974f});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6969a == null) goto L6;
        r42.m4106p("name");
        r42.m4115z(this.f6969a);
    L6:
        if (this.f6970b == null) goto L9;
        r42.m4106p("version");
        r42.m4115z(this.f6970b);
    L9:
        if (this.f6971c == null) goto L12;
        r42.m4106p("raw_description");
        r42.m4115z(this.f6971c);
    L12:
        if (this.f6972d == null) goto L15;
        r42.m4106p("build");
        r42.m4115z(this.f6972d);
    L15:
        if (this.f6973e == null) goto L18;
        r42.m4106p("kernel_version");
        r42.m4115z(this.f6973e);
    L18:
        if (this.f6974f == null) goto L20;
        r42.m4106p("rooted");
        r42.m4113x(this.f6974f);
    L20:
        ConcurrentHashMap r0 = this.f6975g;
        if (r0 == null) goto L26;
        Iterator r02 = r0.keySet().iterator();
    L24:
        if (r02.hasNext() == false) goto L26;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6975g, r1, r42, r1, r5);
    L26:
        r42.m4102k();
    }
}
