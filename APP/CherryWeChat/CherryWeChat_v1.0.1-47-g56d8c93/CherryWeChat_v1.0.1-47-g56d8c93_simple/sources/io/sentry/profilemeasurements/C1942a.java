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
import java.util.Iterator;
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

    public C1942a(String r1, AbstractCollection r2) {
        this.f6833b = r1;
        this.f6834c = r2;
    }

    public final boolean equals(Object r3) {
        if (this == r3) goto L18;
        if (r3 != null) goto L6;
        return false;
    L6:
        if (C1942a.class != r3.getClass()) goto L22;
        C1942a r32 = (C1942a) r3;
        if (AbstractC1856a.m4063i(this.f6832a, r32.f6832a) == true) goto L11;
        return false;
    L11:
        if (this.f6833b.equals(r32.f6833b) == true) goto L13;
        return false;
    L13:
        if (new ArrayList(this.f6834c).equals(new ArrayList(r32.f6834c)) == false) goto L21;
        return true;
    L21:
        return false;
    L22:
        return false;
    L18:
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6832a, this.f6833b, this.f6834c});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("unit");
        r42.m4112w(r5, this.f6833b);
        r42.m4106p("values");
        r42.m4112w(r5, this.f6834c);
        ConcurrentHashMap r0 = this.f6832a;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6832a, r1, r42, r1, r5);
    L8:
        r42.m4102k();
    }
}
