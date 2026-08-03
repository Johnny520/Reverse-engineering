package io.sentry.profilemeasurements;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.profilemeasurements.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1943b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap f6835a;

    /* JADX INFO: renamed from: b */
    public double f6836b;

    /* JADX INFO: renamed from: c */
    public String f6837c;

    /* JADX INFO: renamed from: d */
    public double f6838d;

    public C1943b(Long r1, Number r2, long r3) {
        this.f6837c = r1.toString();
        this.f6838d = r2.doubleValue();
        this.f6836b = r3 / 1.0E9d;
    }

    public final boolean equals(Object r5) {
        if (this == r5) goto L20;
        if (r5 != null) goto L6;
        return false;
    L6:
        if (C1943b.class != r5.getClass()) goto L25;
        C1943b r52 = (C1943b) r5;
        if (AbstractC1856a.m4063i(this.f6835a, r52.f6835a) == true) goto L11;
        return false;
    L11:
        if (this.f6837c.equals(r52.f6837c) == true) goto L13;
        return false;
    L13:
        if (this.f6838d == r52.f6838d) goto L15;
        return false;
    L15:
        if (this.f6836b != r52.f6836b) goto L24;
        return true;
    L24:
        return false;
    L25:
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6835a, this.f6837c, Double.valueOf(this.f6838d)});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("value");
        r42.m4112w(r5, Double.valueOf(this.f6838d));
        r42.m4106p("elapsed_since_start_ns");
        r42.m4112w(r5, this.f6837c);
        r42.m4106p("timestamp");
        r42.m4112w(r5, BigDecimal.valueOf(this.f6836b).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap r0 = this.f6835a;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6835a, r1, r42, r1, r5);
    L8:
        r42.m4102k();
    }
}
