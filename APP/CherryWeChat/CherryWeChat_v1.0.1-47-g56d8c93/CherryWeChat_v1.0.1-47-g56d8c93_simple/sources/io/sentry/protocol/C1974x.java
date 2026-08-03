package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.C1828b2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Iterator;
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
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f7036d == null) goto L6;
        r42.m4106p("filename");
        r42.m4115z(this.f7036d);
    L6:
        if (this.f7037e == null) goto L9;
        r42.m4106p("function");
        r42.m4115z(this.f7037e);
    L9:
        if (this.f7038f == null) goto L12;
        r42.m4106p("module");
        r42.m4115z(this.f7038f);
    L12:
        if (this.f7039g == null) goto L15;
        r42.m4106p("lineno");
        r42.m4114y(this.f7039g);
    L15:
        if (this.f7040h == null) goto L18;
        r42.m4106p("colno");
        r42.m4114y(this.f7040h);
    L18:
        if (this.f7041i == null) goto L21;
        r42.m4106p("abs_path");
        r42.m4115z(this.f7041i);
    L21:
        if (this.f7042j == null) goto L24;
        r42.m4106p("context_line");
        r42.m4115z(this.f7042j);
    L24:
        if (this.f7043k == null) goto L27;
        r42.m4106p("in_app");
        r42.m4113x(this.f7043k);
    L27:
        if (this.f7044l == null) goto L30;
        r42.m4106p("package");
        r42.m4115z(this.f7044l);
    L30:
        if (this.f7045m == null) goto L33;
        r42.m4106p("native");
        r42.m4113x(this.f7045m);
    L33:
        if (this.f7046n == null) goto L36;
        r42.m4106p("platform");
        r42.m4115z(this.f7046n);
    L36:
        if (this.f7047o == null) goto L39;
        r42.m4106p("image_addr");
        r42.m4115z(this.f7047o);
    L39:
        if (this.f7048p == null) goto L42;
        r42.m4106p("symbol_addr");
        r42.m4115z(this.f7048p);
    L42:
        if (this.f7049q == null) goto L45;
        r42.m4106p("instruction_addr");
        r42.m4115z(this.f7049q);
    L45:
        if (this.f7050r == null) goto L48;
        r42.m4106p("addr_mode");
        r42.m4115z(this.f7050r);
    L48:
        if (this.f7053u == null) goto L51;
        r42.m4106p("raw_function");
        r42.m4115z(this.f7053u);
    L51:
        if (this.f7051s == null) goto L54;
        r42.m4106p("symbol");
        r42.m4115z(this.f7051s);
    L54:
        if (this.f7054v == null) goto L56;
        r42.m4106p("lock");
        r42.m4112w(r5, this.f7054v);
    L56:
        List r0 = this.f7033a;
        if (r0 != null) goto L59;
    L61:
        List r02 = this.f7034b;
        if (r02 != null) goto L64;
    L66:
        Map r03 = this.f7035c;
        if (r03 != null) goto L69;
    L71:
        ConcurrentHashMap r04 = this.f7052t;
        if (r04 == null) goto L77;
        Iterator r05 = r04.keySet().iterator();
    L75:
        if (r05.hasNext() == false) goto L77;
        String r1 = (String) r05.next();
        AbstractC1861d.m4087b(this.f7052t, r1, r42, r1, r5);
    L77:
        r42.m4102k();
        return;
    L69:
        if (r03.isEmpty() == true) goto L71;
        r42.m4106p("vars");
        r42.m4112w(r5, this.f7035c);
        goto L71
    L64:
        if (r02.isEmpty() == true) goto L66;
        r42.m4106p("post_context");
        r42.m4112w(r5, this.f7034b);
        goto L66
    L59:
        if (r0.isEmpty() == true) goto L61;
        r42.m4106p("pre_context");
        r42.m4112w(r5, this.f7033a);
        goto L61
    }
}
