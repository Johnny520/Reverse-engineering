package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
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
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("timestamp");
        r42.m4112w(r5, BigDecimal.valueOf(this.f6626b.doubleValue()).setScale(6, RoundingMode.DOWN));
        r42.m4106p("trace_id");
        r42.m4112w(r5, this.f6625a);
        r42.m4106p("body");
        r42.m4115z(this.f6627c);
        r42.m4106p("level");
        r42.m4112w(r5, this.f6628d);
        if (this.f6629e == null) goto L6;
        r42.m4106p("severity_number");
        r42.m4112w(r5, this.f6629e);
    L6:
        if (this.f6630f == null) goto L8;
        r42.m4106p("attributes");
        r42.m4112w(r5, this.f6630f);
    L8:
        HashMap r0 = this.f6631g;
        if (r0 == null) goto L14;
        Iterator r02 = r0.keySet().iterator();
    L12:
        if (r02.hasNext() == false) goto L14;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f6631g, r1, r42, r1, r5);
    L14:
        r42.m4102k();
    }
}
