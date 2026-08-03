package io.sentry;

import io.sentry.config.AbstractC1856a;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.O2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1617O2 {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f5819a;

    public C1617O2(C2046v2 r1) {
        this.f5819a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final C2648vx m3726a(C1918l r12) {
        Double r4 = (Double) r12.f6806c;
        C1621P2 r122 = (C1621P2) r12.f6805b;
        C2648vx r0 = r122.f5741d;
        if (r0 != null) goto L5;
        C2046v2 r02 = this.f5819a;
        r02.getProfilesSampler();
        Double r6 = r02.getProfilesSampleRate();
        if (r6 != null) goto L9;
    L11:
        boolean r3 = false;
    L12:
        Boolean r5 = Boolean.valueOf(r3);
        r02.getTracesSampler();
        C2648vx r123 = r122.f5828p;
        if (r123 != null) goto L15;
        Double r124 = r02.getTracesSampleRate();
        double r7 = Math.pow(2.0d, r02.getBackpressureMonitor().mo3993a());
        if (r124 != null) goto L20;
        Double r125 = null;
    L19:
        Double r32 = r125;
        if (r32 == null) goto L27;
        boolean r126 = false;
        if (r32.doubleValue() < r4.doubleValue()) goto L26;
        r126 = true;
    L26:
        return new C2648vx(Boolean.valueOf(r126), r32, r4, r5, r6);
    L27:
        Boolean r2 = Boolean.FALSE;
        return new C2648vx(r2, null, r4, r2, null);
    L20:
        r125 = Double.valueOf(r124.doubleValue() / r7);
        goto L19
    L15:
        return AbstractC1856a.m4056b(r123);
    L9:
        if (r6.doubleValue() < r4.doubleValue()) goto L11;
        r3 = true;
        goto L12
    L5:
        return AbstractC1856a.m4056b(r0);
    }
}
