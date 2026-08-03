package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.HashMap;

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
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f7004a != null) {
            c1901c.m4106p("type");
            c1901c.m4115z(this.f7004a);
        }
        if (this.f7005b != null) {
            c1901c.m4106p("value");
            c1901c.m4115z(this.f7005b);
        }
        if (this.f7006c != null) {
            c1901c.m4106p("module");
            c1901c.m4115z(this.f7006c);
        }
        if (this.f7007d != null) {
            c1901c.m4106p("thread_id");
            c1901c.m4114y(this.f7007d);
        }
        if (this.f7008e != null) {
            c1901c.m4106p("stacktrace");
            c1901c.m4112w(iLogger, this.f7008e);
        }
        if (this.f7009f != null) {
            c1901c.m4106p("mechanism");
            c1901c.m4112w(iLogger, this.f7009f);
        }
        HashMap map = this.f7010g;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f7010g, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
