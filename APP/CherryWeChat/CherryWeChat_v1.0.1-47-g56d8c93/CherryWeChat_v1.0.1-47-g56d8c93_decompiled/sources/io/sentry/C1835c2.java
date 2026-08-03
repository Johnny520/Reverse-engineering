package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1835c2 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public C1970t f6625a;

    /* JADX INFO: renamed from: b */
    public Double f6626b;

    /* JADX INFO: renamed from: c */
    public String f6627c;

    /* JADX INFO: renamed from: d */
    public EnumC1868e2 f6628d;

    /* JADX INFO: renamed from: e */
    public Integer f6629e;

    /* JADX INFO: renamed from: f */
    public Map f6630f;

    /* JADX INFO: renamed from: g */
    public HashMap f6631g;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("timestamp");
        c1901c.m4112w(iLogger, BigDecimal.valueOf(this.f6626b.doubleValue()).setScale(6, RoundingMode.DOWN));
        c1901c.m4106p("trace_id");
        c1901c.m4112w(iLogger, this.f6625a);
        c1901c.m4106p("body");
        c1901c.m4115z(this.f6627c);
        c1901c.m4106p("level");
        c1901c.m4112w(iLogger, this.f6628d);
        if (this.f6629e != null) {
            c1901c.m4106p("severity_number");
            c1901c.m4112w(iLogger, this.f6629e);
        }
        if (this.f6630f != null) {
            c1901c.m4106p("attributes");
            c1901c.m4112w(iLogger, this.f6630f);
        }
        HashMap map = this.f6631g;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f6631g, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
