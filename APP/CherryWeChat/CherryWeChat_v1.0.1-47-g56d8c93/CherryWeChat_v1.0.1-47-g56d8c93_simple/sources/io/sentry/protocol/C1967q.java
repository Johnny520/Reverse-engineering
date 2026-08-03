package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.protocol.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1967q implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6994a;

    /* JADX INFO: renamed from: b */
    public Integer f6995b;

    /* JADX INFO: renamed from: c */
    public Integer f6996c;

    /* JADX INFO: renamed from: d */
    public Integer f6997d;

    /* JADX INFO: renamed from: e */
    public HashMap f6998e;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6994a == null) goto L6;
        r42.m4106p("sdk_name");
        r42.m4115z(this.f6994a);
    L6:
        if (this.f6995b == null) goto L9;
        r42.m4106p("version_major");
        r42.m4114y(this.f6995b);
    L9:
        if (this.f6996c == null) goto L12;
        r42.m4106p("version_minor");
        r42.m4114y(this.f6996c);
    L12:
        if (this.f6997d == null) goto L14;
        r42.m4106p("version_patchlevel");
        r42.m4114y(this.f6997d);
    L14:
        HashMap r0 = this.f6998e;
        if (r0 == null) goto L20;
        Iterator r02 = r0.keySet().iterator();
    L18:
        if (r02.hasNext() == false) goto L20;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f6998e, r1, r42, r1, r5);
    L20:
        r42.m4102k();
    }
}
