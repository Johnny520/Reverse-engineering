package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1966p implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6988a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f6989b;

    /* JADX INFO: renamed from: c */
    public Integer f6990c;

    /* JADX INFO: renamed from: d */
    public Long f6991d;

    /* JADX INFO: renamed from: e */
    public Object f6992e;

    /* JADX INFO: renamed from: f */
    public ConcurrentHashMap f6993f;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6988a != null) {
            c1901c.m4106p("cookies");
            c1901c.m4115z(this.f6988a);
        }
        if (this.f6989b != null) {
            c1901c.m4106p("headers");
            c1901c.m4112w(iLogger, this.f6989b);
        }
        if (this.f6990c != null) {
            c1901c.m4106p("status_code");
            c1901c.m4112w(iLogger, this.f6990c);
        }
        if (this.f6991d != null) {
            c1901c.m4106p("body_size");
            c1901c.m4112w(iLogger, this.f6991d);
        }
        if (this.f6992e != null) {
            c1901c.m4106p("data");
            c1901c.m4112w(iLogger, this.f6992e);
        }
        ConcurrentHashMap concurrentHashMap = this.f6993f;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6993f, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
