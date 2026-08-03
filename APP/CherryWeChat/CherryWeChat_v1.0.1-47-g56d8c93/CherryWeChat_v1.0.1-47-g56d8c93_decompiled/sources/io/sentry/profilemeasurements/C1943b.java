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

    public C1943b(Long l, Number number, long j) {
        this.f6837c = l.toString();
        this.f6838d = number.doubleValue();
        this.f6836b = j / 1.0E9d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1943b.class != obj.getClass()) {
            return false;
        }
        C1943b c1943b = (C1943b) obj;
        return AbstractC1856a.m4063i(this.f6835a, c1943b.f6835a) && this.f6837c.equals(c1943b.f6837c) && this.f6838d == c1943b.f6838d && this.f6836b == c1943b.f6836b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6835a, this.f6837c, Double.valueOf(this.f6838d)});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("value");
        c1901c.m4112w(iLogger, Double.valueOf(this.f6838d));
        c1901c.m4106p("elapsed_since_start_ns");
        c1901c.m4112w(iLogger, this.f6837c);
        c1901c.m4106p("timestamp");
        c1901c.m4112w(iLogger, BigDecimal.valueOf(this.f6836b).setScale(6, RoundingMode.DOWN));
        ConcurrentHashMap concurrentHashMap = this.f6835a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6835a, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
