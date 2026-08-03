package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
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
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f7059a != null) {
            c1901c.m4106p("id");
            c1901c.m4114y(this.f7059a);
        }
        if (this.f7060b != null) {
            c1901c.m4106p("priority");
            c1901c.m4114y(this.f7060b);
        }
        if (this.f7061c != null) {
            c1901c.m4106p("name");
            c1901c.m4115z(this.f7061c);
        }
        if (this.f7062d != null) {
            c1901c.m4106p("state");
            c1901c.m4115z(this.f7062d);
        }
        if (this.f7063e != null) {
            c1901c.m4106p("crashed");
            c1901c.m4113x(this.f7063e);
        }
        if (this.f7064f != null) {
            c1901c.m4106p("current");
            c1901c.m4113x(this.f7064f);
        }
        if (this.f7065g != null) {
            c1901c.m4106p("daemon");
            c1901c.m4113x(this.f7065g);
        }
        if (this.f7066h != null) {
            c1901c.m4106p("main");
            c1901c.m4113x(this.f7066h);
        }
        if (this.f7067i != null) {
            c1901c.m4106p("stacktrace");
            c1901c.m4112w(iLogger, this.f7067i);
        }
        if (this.f7068j != null) {
            c1901c.m4106p("held_locks");
            c1901c.m4112w(iLogger, this.f7068j);
        }
        ConcurrentHashMap concurrentHashMap = this.f7069k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f7069k, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
