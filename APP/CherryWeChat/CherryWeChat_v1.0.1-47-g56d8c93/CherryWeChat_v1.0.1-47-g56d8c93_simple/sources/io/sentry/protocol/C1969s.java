package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.protocol.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1969s implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f7004a;

    /* JADX INFO: renamed from: b */
    public String f7005b;

    /* JADX INFO: renamed from: c */
    public String f7006c;

    /* JADX INFO: renamed from: d */
    public Long f7007d;

    /* JADX INFO: renamed from: e */
    public C1975y f7008e;

    /* JADX INFO: renamed from: f */
    public C1961k f7009f;

    /* JADX INFO: renamed from: g */
    public HashMap f7010g;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f7004a == null) goto L6;
        r42.m4106p("type");
        r42.m4115z(this.f7004a);
    L6:
        if (this.f7005b == null) goto L9;
        r42.m4106p("value");
        r42.m4115z(this.f7005b);
    L9:
        if (this.f7006c == null) goto L12;
        r42.m4106p("module");
        r42.m4115z(this.f7006c);
    L12:
        if (this.f7007d == null) goto L15;
        r42.m4106p("thread_id");
        r42.m4114y(this.f7007d);
    L15:
        if (this.f7008e == null) goto L18;
        r42.m4106p("stacktrace");
        r42.m4112w(r5, this.f7008e);
    L18:
        if (this.f7009f == null) goto L20;
        r42.m4106p("mechanism");
        r42.m4112w(r5, this.f7009f);
    L20:
        HashMap r0 = this.f7010g;
        if (r0 == null) goto L26;
        Iterator r02 = r0.keySet().iterator();
    L24:
        if (r02.hasNext() == false) goto L26;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f7010g, r1, r42, r1, r5);
    L26:
        r42.m4102k();
    }
}
