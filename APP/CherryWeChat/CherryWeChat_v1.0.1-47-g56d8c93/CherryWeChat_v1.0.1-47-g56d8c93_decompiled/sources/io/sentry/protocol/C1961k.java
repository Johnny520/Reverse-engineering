package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.HashMap;
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
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6954a != null) {
            c1901c.m4106p("type");
            c1901c.m4115z(this.f6954a);
        }
        if (this.f6955b != null) {
            c1901c.m4106p("description");
            c1901c.m4115z(this.f6955b);
        }
        if (this.f6956c != null) {
            c1901c.m4106p("help_link");
            c1901c.m4115z(this.f6956c);
        }
        if (this.f6957d != null) {
            c1901c.m4106p("handled");
            c1901c.m4113x(this.f6957d);
        }
        if (this.f6958e != null) {
            c1901c.m4106p("meta");
            c1901c.m4112w(iLogger, this.f6958e);
        }
        if (this.f6959f != null) {
            c1901c.m4106p("data");
            c1901c.m4112w(iLogger, this.f6959f);
        }
        if (this.f6960g != null) {
            c1901c.m4106p("synthetic");
            c1901c.m4113x(this.f6960g);
        }
        if (this.f6961h != null) {
            c1901c.m4106p("exception_id");
            c1901c.m4112w(iLogger, this.f6961h);
        }
        if (this.f6962i != null) {
            c1901c.m4106p("parent_id");
            c1901c.m4112w(iLogger, this.f6962i);
        }
        if (this.f6963j != null) {
            c1901c.m4106p("is_exception_group");
            c1901c.m4113x(this.f6963j);
        }
        HashMap map = this.f6964k;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f6964k, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
