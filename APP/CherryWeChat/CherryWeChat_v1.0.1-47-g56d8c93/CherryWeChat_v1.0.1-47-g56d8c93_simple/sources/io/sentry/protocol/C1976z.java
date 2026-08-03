package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1976z implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public Long f7059a;

    /* JADX INFO: renamed from: b */
    public Integer f7060b;

    /* JADX INFO: renamed from: c */
    public String f7061c;

    /* JADX INFO: renamed from: d */
    public String f7062d;

    /* JADX INFO: renamed from: e */
    public Boolean f7063e;

    /* JADX INFO: renamed from: f */
    public Boolean f7064f;

    /* JADX INFO: renamed from: g */
    public Boolean f7065g;

    /* JADX INFO: renamed from: h */
    public Boolean f7066h;

    /* JADX INFO: renamed from: i */
    public C1975y f7067i;

    /* JADX INFO: renamed from: j */
    public Map f7068j;

    /* JADX INFO: renamed from: k */
    public ConcurrentHashMap f7069k;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f7059a == null) goto L6;
        r42.m4106p("id");
        r42.m4114y(this.f7059a);
    L6:
        if (this.f7060b == null) goto L9;
        r42.m4106p("priority");
        r42.m4114y(this.f7060b);
    L9:
        if (this.f7061c == null) goto L12;
        r42.m4106p("name");
        r42.m4115z(this.f7061c);
    L12:
        if (this.f7062d == null) goto L15;
        r42.m4106p("state");
        r42.m4115z(this.f7062d);
    L15:
        if (this.f7063e == null) goto L18;
        r42.m4106p("crashed");
        r42.m4113x(this.f7063e);
    L18:
        if (this.f7064f == null) goto L21;
        r42.m4106p("current");
        r42.m4113x(this.f7064f);
    L21:
        if (this.f7065g == null) goto L24;
        r42.m4106p("daemon");
        r42.m4113x(this.f7065g);
    L24:
        if (this.f7066h == null) goto L27;
        r42.m4106p("main");
        r42.m4113x(this.f7066h);
    L27:
        if (this.f7067i == null) goto L30;
        r42.m4106p("stacktrace");
        r42.m4112w(r5, this.f7067i);
    L30:
        if (this.f7068j == null) goto L32;
        r42.m4106p("held_locks");
        r42.m4112w(r5, this.f7068j);
    L32:
        ConcurrentHashMap r0 = this.f7069k;
        if (r0 == null) goto L38;
        Iterator r02 = r0.keySet().iterator();
    L36:
        if (r02.hasNext() == false) goto L38;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f7069k, r1, r42, r1, r5);
    L38:
        r42.m4102k();
    }
}
