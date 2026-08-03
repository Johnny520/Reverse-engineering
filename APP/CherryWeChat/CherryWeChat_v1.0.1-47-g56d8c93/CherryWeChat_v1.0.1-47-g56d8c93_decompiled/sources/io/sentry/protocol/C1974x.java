package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.C1828b2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1974x implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public List f7033a;

    /* JADX INFO: renamed from: b */
    public List f7034b;

    /* JADX INFO: renamed from: c */
    public Map f7035c;

    /* JADX INFO: renamed from: d */
    public String f7036d;

    /* JADX INFO: renamed from: e */
    public String f7037e;

    /* JADX INFO: renamed from: f */
    public String f7038f;

    /* JADX INFO: renamed from: g */
    public Integer f7039g;

    /* JADX INFO: renamed from: h */
    public Integer f7040h;

    /* JADX INFO: renamed from: i */
    public String f7041i;

    /* JADX INFO: renamed from: j */
    public String f7042j;

    /* JADX INFO: renamed from: k */
    public Boolean f7043k;

    /* JADX INFO: renamed from: l */
    public String f7044l;

    /* JADX INFO: renamed from: m */
    public Boolean f7045m;

    /* JADX INFO: renamed from: n */
    public String f7046n;

    /* JADX INFO: renamed from: o */
    public String f7047o;

    /* JADX INFO: renamed from: p */
    public String f7048p;

    /* JADX INFO: renamed from: q */
    public String f7049q;

    /* JADX INFO: renamed from: r */
    public String f7050r;

    /* JADX INFO: renamed from: s */
    public String f7051s;

    /* JADX INFO: renamed from: t */
    public ConcurrentHashMap f7052t;

    /* JADX INFO: renamed from: u */
    public String f7053u;

    /* JADX INFO: renamed from: v */
    public C1828b2 f7054v;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f7036d != null) {
            c1901c.m4106p("filename");
            c1901c.m4115z(this.f7036d);
        }
        if (this.f7037e != null) {
            c1901c.m4106p("function");
            c1901c.m4115z(this.f7037e);
        }
        if (this.f7038f != null) {
            c1901c.m4106p("module");
            c1901c.m4115z(this.f7038f);
        }
        if (this.f7039g != null) {
            c1901c.m4106p("lineno");
            c1901c.m4114y(this.f7039g);
        }
        if (this.f7040h != null) {
            c1901c.m4106p("colno");
            c1901c.m4114y(this.f7040h);
        }
        if (this.f7041i != null) {
            c1901c.m4106p("abs_path");
            c1901c.m4115z(this.f7041i);
        }
        if (this.f7042j != null) {
            c1901c.m4106p("context_line");
            c1901c.m4115z(this.f7042j);
        }
        if (this.f7043k != null) {
            c1901c.m4106p("in_app");
            c1901c.m4113x(this.f7043k);
        }
        if (this.f7044l != null) {
            c1901c.m4106p("package");
            c1901c.m4115z(this.f7044l);
        }
        if (this.f7045m != null) {
            c1901c.m4106p("native");
            c1901c.m4113x(this.f7045m);
        }
        if (this.f7046n != null) {
            c1901c.m4106p("platform");
            c1901c.m4115z(this.f7046n);
        }
        if (this.f7047o != null) {
            c1901c.m4106p("image_addr");
            c1901c.m4115z(this.f7047o);
        }
        if (this.f7048p != null) {
            c1901c.m4106p("symbol_addr");
            c1901c.m4115z(this.f7048p);
        }
        if (this.f7049q != null) {
            c1901c.m4106p("instruction_addr");
            c1901c.m4115z(this.f7049q);
        }
        if (this.f7050r != null) {
            c1901c.m4106p("addr_mode");
            c1901c.m4115z(this.f7050r);
        }
        if (this.f7053u != null) {
            c1901c.m4106p("raw_function");
            c1901c.m4115z(this.f7053u);
        }
        if (this.f7051s != null) {
            c1901c.m4106p("symbol");
            c1901c.m4115z(this.f7051s);
        }
        if (this.f7054v != null) {
            c1901c.m4106p("lock");
            c1901c.m4112w(iLogger, this.f7054v);
        }
        List list = this.f7033a;
        if (list != null && !list.isEmpty()) {
            c1901c.m4106p("pre_context");
            c1901c.m4112w(iLogger, this.f7033a);
        }
        List list2 = this.f7034b;
        if (list2 != null && !list2.isEmpty()) {
            c1901c.m4106p("post_context");
            c1901c.m4112w(iLogger, this.f7034b);
        }
        Map map = this.f7035c;
        if (map != null && !map.isEmpty()) {
            c1901c.m4106p("vars");
            c1901c.m4112w(iLogger, this.f7035c);
        }
        ConcurrentHashMap concurrentHashMap = this.f7052t;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f7052t, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
