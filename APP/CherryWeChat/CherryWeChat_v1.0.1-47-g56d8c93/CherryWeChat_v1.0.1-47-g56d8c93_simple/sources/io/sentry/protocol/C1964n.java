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

/* JADX INFO: renamed from: io.sentry.protocol.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1964n implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6976a;

    /* JADX INFO: renamed from: b */
    public String f6977b;

    /* JADX INFO: renamed from: c */
    public String f6978c;

    /* JADX INFO: renamed from: d */
    public Object f6979d;

    /* JADX INFO: renamed from: e */
    public String f6980e;

    /* JADX INFO: renamed from: f */
    public ConcurrentHashMap f6981f;

    /* JADX INFO: renamed from: g */
    public ConcurrentHashMap f6982g;

    /* JADX INFO: renamed from: h */
    public Long f6983h;

    /* JADX INFO: renamed from: i */
    public ConcurrentHashMap f6984i;

    /* JADX INFO: renamed from: j */
    public String f6985j;

    /* JADX INFO: renamed from: k */
    public String f6986k;

    /* JADX INFO: renamed from: l */
    public ConcurrentHashMap f6987l;

    public final boolean equals(Object r3) {
        if (this == r3) goto L30;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C1964n.class != r3.getClass()) goto L40;
        C1964n r32 = (C1964n) r3;
        if (AbstractC1856a.m4063i(this.f6976a, r32.f6976a) == true) goto L11;
        return false;
    L11:
        if (AbstractC1856a.m4063i(this.f6977b, r32.f6977b) == true) goto L13;
        return false;
    L13:
        if (AbstractC1856a.m4063i(this.f6978c, r32.f6978c) == true) goto L15;
        return false;
    L15:
        if (AbstractC1856a.m4063i(this.f6980e, r32.f6980e) == true) goto L17;
        return false;
    L17:
        if (AbstractC1856a.m4063i(this.f6981f, r32.f6981f) == true) goto L19;
        return false;
    L19:
        if (AbstractC1856a.m4063i(this.f6982g, r32.f6982g) == true) goto L21;
        return false;
    L21:
        if (AbstractC1856a.m4063i(this.f6983h, r32.f6983h) == true) goto L23;
        return false;
    L23:
        if (AbstractC1856a.m4063i(this.f6985j, r32.f6985j) == true) goto L25;
        return false;
    L25:
        if (AbstractC1856a.m4063i(this.f6986k, r32.f6986k) == false) goto L39;
        return true;
    L39:
        return false;
    L40:
        return false;
    L30:
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6976a, this.f6977b, this.f6978c, this.f6980e, this.f6981f, this.f6982g, this.f6983h, this.f6985j, this.f6986k});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6976a == null) goto L6;
        r42.m4106p("url");
        r42.m4115z(this.f6976a);
    L6:
        if (this.f6977b == null) goto L9;
        r42.m4106p("method");
        r42.m4115z(this.f6977b);
    L9:
        if (this.f6978c == null) goto L12;
        r42.m4106p("query_string");
        r42.m4115z(this.f6978c);
    L12:
        if (this.f6979d == null) goto L15;
        r42.m4106p("data");
        r42.m4112w(r5, this.f6979d);
    L15:
        if (this.f6980e == null) goto L18;
        r42.m4106p("cookies");
        r42.m4115z(this.f6980e);
    L18:
        if (this.f6981f == null) goto L21;
        r42.m4106p("headers");
        r42.m4112w(r5, this.f6981f);
    L21:
        if (this.f6982g == null) goto L24;
        r42.m4106p("env");
        r42.m4112w(r5, this.f6982g);
    L24:
        if (this.f6984i == null) goto L27;
        r42.m4106p("other");
        r42.m4112w(r5, this.f6984i);
    L27:
        if (this.f6985j == null) goto L30;
        r42.m4106p("fragment");
        r42.m4112w(r5, this.f6985j);
    L30:
        if (this.f6983h == null) goto L33;
        r42.m4106p("body_size");
        r42.m4112w(r5, this.f6983h);
    L33:
        if (this.f6986k == null) goto L35;
        r42.m4106p("api_target");
        r42.m4112w(r5, this.f6986k);
    L35:
        ConcurrentHashMap r0 = this.f6987l;
        if (r0 == null) goto L41;
        Iterator r02 = r0.keySet().iterator();
    L39:
        if (r02.hasNext() == false) goto L41;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6987l, r1, r42, r1, r5);
    L41:
        r42.m4102k();
    }
}
