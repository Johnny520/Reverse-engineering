package io.sentry.profilemeasurements;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.profilemeasurements.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1942a implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap f6832a;

    /* JADX INFO: renamed from: b */
    public String f6833b;

    /* JADX INFO: renamed from: c */
    public Collection f6834c;

    public C1942a(String str, AbstractCollection abstractCollection) {
        this.f6833b = str;
        this.f6834c = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1942a.class != obj.getClass()) {
            return false;
        }
        C1942a c1942a = (C1942a) obj;
        return AbstractC1856a.m4063i(this.f6832a, c1942a.f6832a) && this.f6833b.equals(c1942a.f6833b) && new ArrayList(this.f6834c).equals(new ArrayList(c1942a.f6834c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6832a, this.f6833b, this.f6834c});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("unit");
        c1901c.m4112w(iLogger, this.f6833b);
        c1901c.m4106p("values");
        c1901c.m4112w(iLogger, this.f6834c);
        ConcurrentHashMap concurrentHashMap = this.f6832a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6832a, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
