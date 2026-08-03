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

/* JADX INFO: renamed from: io.sentry.protocol.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1948E implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6849a;

    /* JADX INFO: renamed from: b */
    public String f6850b;

    /* JADX INFO: renamed from: c */
    public String f6851c;

    /* JADX INFO: renamed from: d */
    public String f6852d;

    /* JADX INFO: renamed from: e */
    public String f6853e;

    /* JADX INFO: renamed from: f */
    public C1958h f6854f;

    /* JADX INFO: renamed from: g */
    public ConcurrentHashMap f6855g;

    /* JADX INFO: renamed from: h */
    public ConcurrentHashMap f6856h;

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L19:
        return false;
    L8:
        if (C1948E.class != r5.getClass()) goto L19;
        C1948E r52 = (C1948E) r5;
        if (AbstractC1856a.m4063i(this.f6849a, r52.f6849a) == false) goto L19;
        if (AbstractC1856a.m4063i(this.f6850b, r52.f6850b) == false) goto L19;
        if (AbstractC1856a.m4063i(this.f6851c, r52.f6851c) == false) goto L19;
        if (AbstractC1856a.m4063i(this.f6852d, r52.f6852d) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6849a, this.f6850b, this.f6851c, this.f6852d});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6849a == null) goto L6;
        r42.m4106p("email");
        r42.m4115z(this.f6849a);
    L6:
        if (this.f6850b == null) goto L9;
        r42.m4106p("id");
        r42.m4115z(this.f6850b);
    L9:
        if (this.f6851c == null) goto L12;
        r42.m4106p("username");
        r42.m4115z(this.f6851c);
    L12:
        if (this.f6852d == null) goto L15;
        r42.m4106p("ip_address");
        r42.m4115z(this.f6852d);
    L15:
        if (this.f6853e == null) goto L18;
        r42.m4106p("name");
        r42.m4115z(this.f6853e);
    L18:
        if (this.f6854f == null) goto L21;
        r42.m4106p("geo");
        this.f6854f.serialize(r42, r5);
    L21:
        if (this.f6855g == null) goto L23;
        r42.m4106p("data");
        r42.m4112w(r5, this.f6855g);
    L23:
        ConcurrentHashMap r0 = this.f6856h;
        if (r0 == null) goto L29;
        Iterator r02 = r0.keySet().iterator();
    L27:
        if (r02.hasNext() == false) goto L29;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6856h, r1, r42, r1, r5);
    L29:
        r42.m4102k();
    }
}
