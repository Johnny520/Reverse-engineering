package io.sentry;

import io.sentry.config.AbstractC1856a;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.O2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1617O2 {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f5819a;

    public C1617O2(C2046v2 c2046v2) {
        this.f5819a = c2046v2;
    }

    /* JADX INFO: renamed from: a */
    public final C2648vx m3726a(C1918l c1918l) {
        Double d = (Double) c1918l.f6806c;
        C1621P2 c1621p2 = (C1621P2) c1918l.f6805b;
        C2648vx c2648vx = c1621p2.f5741d;
        if (c2648vx != null) {
            return AbstractC1856a.m4056b(c2648vx);
        }
        C2046v2 c2046v2 = this.f5819a;
        c2046v2.getProfilesSampler();
        Double profilesSampleRate = c2046v2.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d.doubleValue());
        c2046v2.getTracesSampler();
        C2648vx c2648vx2 = c1621p2.f5828p;
        if (c2648vx2 != null) {
            return AbstractC1856a.m4056b(c2648vx2);
        }
        Double tracesSampleRate = c2046v2.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, c2046v2.getBackpressureMonitor().mo3993a()));
        if (dValueOf == null) {
            Boolean bool = Boolean.FALSE;
            return new C2648vx(bool, (Double) null, d, bool, (Double) null);
        }
        boolean z = false;
        if (dValueOf.doubleValue() >= d.doubleValue()) {
            z = true;
        }
        return new C2648vx(Boolean.valueOf(z), dValueOf, d, boolValueOf, profilesSampleRate);
    }
}
