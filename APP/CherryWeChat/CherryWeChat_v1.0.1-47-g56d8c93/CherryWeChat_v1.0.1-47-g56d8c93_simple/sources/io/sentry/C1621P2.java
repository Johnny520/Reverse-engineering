package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.protocol.EnumC1946C;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.P2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1621P2 extends C1589H2 {

    /* JADX INFO: renamed from: q */
    public static final EnumC1946C f5825q = null;

    /* JADX INFO: renamed from: n */
    public String f5826n;

    /* JADX INFO: renamed from: o */
    public EnumC1946C f5827o;

    /* JADX INFO: renamed from: p */
    public C2648vx f5828p;

    static {
        f5825q = EnumC1946C.CUSTOM;
    }

    public C1621P2(String r4, EnumC1946C r5, String r6, C2648vx r7) {
        super(new C1970t(), new C1601K2(), r6, null);
        AbstractC1856a.m4048D("name is required", r4);
        this.f5826n = r4;
        this.f5827o = r5;
        m3673a(r7);
        if (r7 != null) goto L5;
        Boolean r42 = null;
    L6:
        if (r7 != null) goto L8;
        Double r52 = null;
    L9:
        if (r7 != null) goto L11;
        Double r62 = null;
    L12:
        this.f5750m = AbstractC1856a.m4062h(null, r42, r52, r62);
        return;
    L11:
        r62 = (Double) r7.f9164c;
        goto L12
    L8:
        r52 = (Double) r7.f9163b;
        goto L9
    L5:
        r42 = (Boolean) r7.f9162a;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public static C1621P2 m3735b(C1918l r5) {
        r5.getClass();
        C1832c r0 = (C1832c) r5.f6807d;
        Double r1 = r0.f6620c;
        C1621P2 r12 = new C1621P2((C1970t) r5.f6805b, (C1601K2) r5.f6806c, "default", null);
        r12.f5826n = "<unlabeled transaction>";
        r12.f5828p = null;
        r12.f5827o = f5825q;
        r12.f5750m = AbstractC1856a.m4062h(r0, null, null, null);
        return r12;
    }
}
