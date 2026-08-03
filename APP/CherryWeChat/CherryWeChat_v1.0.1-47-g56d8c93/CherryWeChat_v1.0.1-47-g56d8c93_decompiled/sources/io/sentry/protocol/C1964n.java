package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1964n.class != obj.getClass()) {
            return false;
        }
        C1964n c1964n = (C1964n) obj;
        return AbstractC1856a.m4063i(this.f6976a, c1964n.f6976a) && AbstractC1856a.m4063i(this.f6977b, c1964n.f6977b) && AbstractC1856a.m4063i(this.f6978c, c1964n.f6978c) && AbstractC1856a.m4063i(this.f6980e, c1964n.f6980e) && AbstractC1856a.m4063i(this.f6981f, c1964n.f6981f) && AbstractC1856a.m4063i(this.f6982g, c1964n.f6982g) && AbstractC1856a.m4063i(this.f6983h, c1964n.f6983h) && AbstractC1856a.m4063i(this.f6985j, c1964n.f6985j) && AbstractC1856a.m4063i(this.f6986k, c1964n.f6986k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6976a, this.f6977b, this.f6978c, this.f6980e, this.f6981f, this.f6982g, this.f6983h, this.f6985j, this.f6986k});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6976a != null) {
            c1901c.m4106p("url");
            c1901c.m4115z(this.f6976a);
        }
        if (this.f6977b != null) {
            c1901c.m4106p("method");
            c1901c.m4115z(this.f6977b);
        }
        if (this.f6978c != null) {
            c1901c.m4106p("query_string");
            c1901c.m4115z(this.f6978c);
        }
        if (this.f6979d != null) {
            c1901c.m4106p("data");
            c1901c.m4112w(iLogger, this.f6979d);
        }
        if (this.f6980e != null) {
            c1901c.m4106p("cookies");
            c1901c.m4115z(this.f6980e);
        }
        if (this.f6981f != null) {
            c1901c.m4106p("headers");
            c1901c.m4112w(iLogger, this.f6981f);
        }
        if (this.f6982g != null) {
            c1901c.m4106p("env");
            c1901c.m4112w(iLogger, this.f6982g);
        }
        if (this.f6984i != null) {
            c1901c.m4106p("other");
            c1901c.m4112w(iLogger, this.f6984i);
        }
        if (this.f6985j != null) {
            c1901c.m4106p("fragment");
            c1901c.m4112w(iLogger, this.f6985j);
        }
        if (this.f6983h != null) {
            c1901c.m4106p("body_size");
            c1901c.m4112w(iLogger, this.f6983h);
        }
        if (this.f6986k != null) {
            c1901c.m4106p("api_target");
            c1901c.m4112w(iLogger, this.f6986k);
        }
        ConcurrentHashMap concurrentHashMap = this.f6987l;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6987l, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
