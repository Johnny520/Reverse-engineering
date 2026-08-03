package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
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

    public final boolean equals(Object r3) {
        if (this == r3) goto L38;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C1951a.class != r3.getClass()) goto L52;
        C1951a r32 = (C1951a) r3;
        if (AbstractC1856a.m4063i(this.f6872a, r32.f6872a) == true) goto L11;
        return false;
    L11:
        if (AbstractC1856a.m4063i(this.f6873b, r32.f6873b) == true) goto L13;
        return false;
    L13:
        if (AbstractC1856a.m4063i(this.f6874c, r32.f6874c) == true) goto L15;
        return false;
    L15:
        if (AbstractC1856a.m4063i(this.f6875d, r32.f6875d) == true) goto L17;
        return false;
    L17:
        if (AbstractC1856a.m4063i(this.f6876e, r32.f6876e) == true) goto L19;
        return false;
    L19:
        if (AbstractC1856a.m4063i(this.f6877f, r32.f6877f) == true) goto L21;
        return false;
    L21:
        if (AbstractC1856a.m4063i(this.f6878g, r32.f6878g) == true) goto L23;
        return false;
    L23:
        if (AbstractC1856a.m4063i(this.f6879h, r32.f6879h) == true) goto L25;
        return false;
    L25:
        if (AbstractC1856a.m4063i(this.f6882k, r32.f6882k) == true) goto L27;
        return false;
    L27:
        if (AbstractC1856a.m4063i(this.f6880i, r32.f6880i) == true) goto L29;
        return false;
    L29:
        if (AbstractC1856a.m4063i(this.f6881j, r32.f6881j) == true) goto L31;
        return false;
    L31:
        if (AbstractC1856a.m4063i(this.f6883l, r32.f6883l) == true) goto L33;
        return false;
    L33:
        if (AbstractC1856a.m4063i(this.f6884m, r32.f6884m) == false) goto L51;
        return true;
    L51:
        return false;
    L52:
        return false;
    L38:
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6872a, this.f6873b, this.f6874c, this.f6875d, this.f6876e, this.f6877f, this.f6878g, this.f6879h, this.f6882k, this.f6880i, this.f6881j, this.f6883l, this.f6884m});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6872a == null) goto L6;
        r42.m4106p("app_identifier");
        r42.m4115z(this.f6872a);
    L6:
        if (this.f6873b == null) goto L9;
        r42.m4106p("app_start_time");
        r42.m4112w(r5, this.f6873b);
    L9:
        if (this.f6874c == null) goto L12;
        r42.m4106p("device_app_hash");
        r42.m4115z(this.f6874c);
    L12:
        if (this.f6875d == null) goto L15;
        r42.m4106p("build_type");
        r42.m4115z(this.f6875d);
    L15:
        if (this.f6876e == null) goto L18;
        r42.m4106p("app_name");
        r42.m4115z(this.f6876e);
    L18:
        if (this.f6877f == null) goto L21;
        r42.m4106p("app_version");
        r42.m4115z(this.f6877f);
    L21:
        if (this.f6878g == null) goto L23;
        r42.m4106p("app_build");
        r42.m4115z(this.f6878g);
    L23:
        AbstractMap r0 = this.f6879h;
        if (r0 == null) goto L29;
        if (r0.isEmpty() == true) goto L29;
        r42.m4106p("permissions");
        r42.m4112w(r5, this.f6879h);
    L29:
        if (this.f6882k == null) goto L32;
        r42.m4106p("in_foreground");
        r42.m4113x(this.f6882k);
    L32:
        if (this.f6880i == null) goto L35;
        r42.m4106p("view_names");
        r42.m4112w(r5, this.f6880i);
    L35:
        if (this.f6881j == null) goto L38;
        r42.m4106p("start_type");
        r42.m4115z(this.f6881j);
    L38:
        if (this.f6883l == null) goto L40;
        r42.m4106p("is_split_apks");
        r42.m4113x(this.f6883l);
    L40:
        List r02 = this.f6884m;
        if (r02 != null) goto L43;
    L45:
        ConcurrentHashMap r03 = this.f6885n;
        if (r03 == null) goto L51;
        Iterator r04 = r03.keySet().iterator();
    L49:
        if (r04.hasNext() == false) goto L51;
        String r1 = (String) r04.next();
        AbstractC1861d.m4087b(this.f6885n, r1, r42, r1, r5);
    L51:
        r42.m4102k();
        return;
    L43:
        if (r02.isEmpty() == true) goto L45;
        r42.m4106p("split_names");
        r42.m4112w(r5, this.f6884m);
        goto L45
    }
}
