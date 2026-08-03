package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1961k implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6954a;

    /* JADX INFO: renamed from: b */
    public String f6955b;

    /* JADX INFO: renamed from: c */
    public String f6956c;

    /* JADX INFO: renamed from: d */
    public Boolean f6957d;

    /* JADX INFO: renamed from: e */
    public ConcurrentHashMap f6958e;

    /* JADX INFO: renamed from: f */
    public ConcurrentHashMap f6959f;

    /* JADX INFO: renamed from: g */
    public Boolean f6960g;

    /* JADX INFO: renamed from: h */
    public Integer f6961h;

    /* JADX INFO: renamed from: i */
    public Integer f6962i;

    /* JADX INFO: renamed from: j */
    public Boolean f6963j;

    /* JADX INFO: renamed from: k */
    public HashMap f6964k;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6954a == null) goto L6;
        r42.m4106p("type");
        r42.m4115z(this.f6954a);
    L6:
        if (this.f6955b == null) goto L9;
        r42.m4106p("description");
        r42.m4115z(this.f6955b);
    L9:
        if (this.f6956c == null) goto L12;
        r42.m4106p("help_link");
        r42.m4115z(this.f6956c);
    L12:
        if (this.f6957d == null) goto L15;
        r42.m4106p("handled");
        r42.m4113x(this.f6957d);
    L15:
        if (this.f6958e == null) goto L18;
        r42.m4106p("meta");
        r42.m4112w(r5, this.f6958e);
    L18:
        if (this.f6959f == null) goto L21;
        r42.m4106p("data");
        r42.m4112w(r5, this.f6959f);
    L21:
        if (this.f6960g == null) goto L24;
        r42.m4106p("synthetic");
        r42.m4113x(this.f6960g);
    L24:
        if (this.f6961h == null) goto L27;
        r42.m4106p("exception_id");
        r42.m4112w(r5, this.f6961h);
    L27:
        if (this.f6962i == null) goto L30;
        r42.m4106p("parent_id");
        r42.m4112w(r5, this.f6962i);
    L30:
        if (this.f6963j == null) goto L32;
        r42.m4106p("is_exception_group");
        r42.m4113x(this.f6963j);
    L32:
        HashMap r0 = this.f6964k;
        if (r0 == null) goto L38;
        Iterator r02 = r0.keySet().iterator();
    L36:
        if (r02.hasNext() == false) goto L38;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f6964k, r1, r42, r1, r5);
    L38:
        r42.m4102k();
    }
}
