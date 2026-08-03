package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.protocol.EnumC1946C;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.P2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1621P2 extends C1589H2 {

    /* JADX INFO: renamed from: q */
    public static final EnumC1946C f5825q = EnumC1946C.CUSTOM;

    /* JADX INFO: renamed from: n */
    public String f5826n;

    /* JADX INFO: renamed from: o */
    public EnumC1946C f5827o;

    /* JADX INFO: renamed from: p */
    public C2648vx f5828p;

    public C1621P2(String str, EnumC1946C enumC1946C, String str2, C2648vx c2648vx) {
        super(new C1970t(), new C1601K2(), str2, null);
        AbstractC1856a.m4048D("name is required", str);
        this.f5826n = str;
        this.f5827o = enumC1946C;
        m3673a(c2648vx);
        this.f5750m = AbstractC1856a.m4062h(null, c2648vx == null ? null : (Boolean) c2648vx.f9162a, c2648vx == null ? null : (Double) c2648vx.f9163b, c2648vx == null ? null : (Double) c2648vx.f9164c);
    }

    /* JADX INFO: renamed from: b */
    public static C1621P2 m3735b(C1918l c1918l) {
        c1918l.getClass();
        C1832c c1832c = (C1832c) c1918l.f6807d;
        Double d = c1832c.f6620c;
        C1621P2 c1621p2 = new C1621P2((C1970t) c1918l.f6805b, (C1601K2) c1918l.f6806c, "default", (C1601K2) null);
        c1621p2.f5826n = "<unlabeled transaction>";
        c1621p2.f5828p = null;
        c1621p2.f5827o = f5825q;
        c1621p2.f5750m = AbstractC1856a.m4062h(c1832c, null, null, null);
        return c1621p2;
    }
}
