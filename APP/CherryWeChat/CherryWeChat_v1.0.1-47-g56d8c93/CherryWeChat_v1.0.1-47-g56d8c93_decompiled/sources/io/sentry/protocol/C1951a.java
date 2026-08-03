package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1951a implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6872a;

    /* JADX INFO: renamed from: b */
    public Date f6873b;

    /* JADX INFO: renamed from: c */
    public String f6874c;

    /* JADX INFO: renamed from: d */
    public String f6875d;

    /* JADX INFO: renamed from: e */
    public String f6876e;

    /* JADX INFO: renamed from: f */
    public String f6877f;

    /* JADX INFO: renamed from: g */
    public String f6878g;

    /* JADX INFO: renamed from: h */
    public AbstractMap f6879h;

    /* JADX INFO: renamed from: i */
    public List f6880i;

    /* JADX INFO: renamed from: j */
    public String f6881j;

    /* JADX INFO: renamed from: k */
    public Boolean f6882k;

    /* JADX INFO: renamed from: l */
    public Boolean f6883l;

    /* JADX INFO: renamed from: m */
    public List f6884m;

    /* JADX INFO: renamed from: n */
    public ConcurrentHashMap f6885n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1951a.class != obj.getClass()) {
            return false;
        }
        C1951a c1951a = (C1951a) obj;
        return AbstractC1856a.m4063i(this.f6872a, c1951a.f6872a) && AbstractC1856a.m4063i(this.f6873b, c1951a.f6873b) && AbstractC1856a.m4063i(this.f6874c, c1951a.f6874c) && AbstractC1856a.m4063i(this.f6875d, c1951a.f6875d) && AbstractC1856a.m4063i(this.f6876e, c1951a.f6876e) && AbstractC1856a.m4063i(this.f6877f, c1951a.f6877f) && AbstractC1856a.m4063i(this.f6878g, c1951a.f6878g) && AbstractC1856a.m4063i(this.f6879h, c1951a.f6879h) && AbstractC1856a.m4063i(this.f6882k, c1951a.f6882k) && AbstractC1856a.m4063i(this.f6880i, c1951a.f6880i) && AbstractC1856a.m4063i(this.f6881j, c1951a.f6881j) && AbstractC1856a.m4063i(this.f6883l, c1951a.f6883l) && AbstractC1856a.m4063i(this.f6884m, c1951a.f6884m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6872a, this.f6873b, this.f6874c, this.f6875d, this.f6876e, this.f6877f, this.f6878g, this.f6879h, this.f6882k, this.f6880i, this.f6881j, this.f6883l, this.f6884m});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6872a != null) {
            c1901c.m4106p("app_identifier");
            c1901c.m4115z(this.f6872a);
        }
        if (this.f6873b != null) {
            c1901c.m4106p("app_start_time");
            c1901c.m4112w(iLogger, this.f6873b);
        }
        if (this.f6874c != null) {
            c1901c.m4106p("device_app_hash");
            c1901c.m4115z(this.f6874c);
        }
        if (this.f6875d != null) {
            c1901c.m4106p("build_type");
            c1901c.m4115z(this.f6875d);
        }
        if (this.f6876e != null) {
            c1901c.m4106p("app_name");
            c1901c.m4115z(this.f6876e);
        }
        if (this.f6877f != null) {
            c1901c.m4106p("app_version");
            c1901c.m4115z(this.f6877f);
        }
        if (this.f6878g != null) {
            c1901c.m4106p("app_build");
            c1901c.m4115z(this.f6878g);
        }
        AbstractMap abstractMap = this.f6879h;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            c1901c.m4106p("permissions");
            c1901c.m4112w(iLogger, this.f6879h);
        }
        if (this.f6882k != null) {
            c1901c.m4106p("in_foreground");
            c1901c.m4113x(this.f6882k);
        }
        if (this.f6880i != null) {
            c1901c.m4106p("view_names");
            c1901c.m4112w(iLogger, this.f6880i);
        }
        if (this.f6881j != null) {
            c1901c.m4106p("start_type");
            c1901c.m4115z(this.f6881j);
        }
        if (this.f6883l != null) {
            c1901c.m4106p("is_split_apks");
            c1901c.m4113x(this.f6883l);
        }
        List list = this.f6884m;
        if (list != null && !list.isEmpty()) {
            c1901c.m4106p("split_names");
            c1901c.m4112w(iLogger, this.f6884m);
        }
        ConcurrentHashMap concurrentHashMap = this.f6885n;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6885n, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
