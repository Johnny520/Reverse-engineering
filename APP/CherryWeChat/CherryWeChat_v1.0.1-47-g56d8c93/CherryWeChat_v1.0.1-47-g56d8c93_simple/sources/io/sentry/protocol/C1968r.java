package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.C1650Y1;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.protocol.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1968r implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6999a;

    /* JADX INFO: renamed from: b */
    public String f7000b;

    /* JADX INFO: renamed from: c */
    public CopyOnWriteArraySet f7001c;

    /* JADX INFO: renamed from: d */
    public CopyOnWriteArraySet f7002d;

    /* JADX INFO: renamed from: e */
    public HashMap f7003e;

    public C1968r(String r1, String r2) {
        this.f6999a = r1;
        this.f7000b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (C1968r.class != r5.getClass()) goto L15;
        C1968r r52 = (C1968r) r5;
        if (this.f6999a.equals(r52.f6999a) == false) goto L15;
        if (this.f7000b.equals(r52.f7000b) == false) goto L15;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6999a, this.f7000b});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("name");
        r42.m4115z(this.f6999a);
        r42.m4106p("version");
        r42.m4115z(this.f7000b);
        CopyOnWriteArraySet r0 = this.f7001c;
        if (r0 != null) goto L6;
        r0 = C1650Y1.m3790d().f5898b;
    L6:
        CopyOnWriteArraySet r1 = this.f7002d;
        if (r1 != null) goto L11;
        r1 = C1650Y1.m3790d().f5897a;
    L11:
        if (r0.isEmpty() == true) goto L14;
        r42.m4106p("packages");
        r42.m4112w(r5, r0);
    L14:
        if (r1.isEmpty() == true) goto L16;
        r42.m4106p("integrations");
        r42.m4112w(r5, r1);
    L16:
        HashMap r02 = this.f7003e;
        if (r02 == null) goto L22;
        Iterator r03 = r02.keySet().iterator();
    L20:
        if (r03.hasNext() == false) goto L22;
        String r12 = (String) r03.next();
        AbstractC1861d.m4086a(this.f7003e, r12, r42, r12, r5);
    L22:
        r42.m4102k();
    }
}
