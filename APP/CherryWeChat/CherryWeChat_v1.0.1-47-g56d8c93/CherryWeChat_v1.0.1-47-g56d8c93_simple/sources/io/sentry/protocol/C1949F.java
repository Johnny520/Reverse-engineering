package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.protocol.F */
/* JADX INFO: loaded from: classes.dex */
public final class C1949F implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final String f6857a;

    /* JADX INFO: renamed from: b */
    public final List f6858b;

    /* JADX INFO: renamed from: c */
    public HashMap f6859c;

    public C1949F(String r1, List r2) {
        this.f6857a = r1;
        this.f6858b = r2;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        String r0 = this.f6857a;
        if (r0 == null) goto L5;
        r42.m4106p("rendering_system");
        r42.m4115z(r0);
    L5:
        List r02 = this.f6858b;
        if (r02 == null) goto L8;
        r42.m4106p("windows");
        r42.m4112w(r5, r02);
    L8:
        HashMap r03 = this.f6859c;
        if (r03 == null) goto L14;
        Iterator r04 = r03.keySet().iterator();
    L12:
        if (r04.hasNext() == false) goto L14;
        String r1 = (String) r04.next();
        AbstractC1861d.m4086a(this.f6859c, r1, r42, r1, r5);
    L14:
        r42.m4102k();
    }
}
