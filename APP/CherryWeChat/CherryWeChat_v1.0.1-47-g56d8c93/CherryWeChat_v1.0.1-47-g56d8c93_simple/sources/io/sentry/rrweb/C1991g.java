package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.rrweb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1991g extends AbstractC1989e implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: d */
    public EnumC1990f f7118d;

    /* JADX INFO: renamed from: e */
    public int f7119e;

    /* JADX INFO: renamed from: f */
    public float f7120f;

    /* JADX INFO: renamed from: g */
    public float f7121g;

    /* JADX INFO: renamed from: h */
    public int f7122h;

    /* JADX INFO: renamed from: i */
    public int f7123i;

    /* JADX INFO: renamed from: j */
    public HashMap f7124j;

    /* JADX INFO: renamed from: k */
    public HashMap f7125k;

    public C1991g() {
        super(EnumC1988d.MouseInteraction);
        this.f7122h = 2;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("type");
        r42.m4112w(r5, this.f7115a);
        r42.m4106p("timestamp");
        r42.m4111v(this.f7116b);
        r42.m4106p("data");
        r42.m4101h();
        r42.m4106p("source");
        r42.m4112w(r5, this.f7117c);
        r42.m4106p("type");
        r42.m4112w(r5, this.f7118d);
        r42.m4106p("id");
        r42.m4111v(this.f7119e);
        r42.m4106p("x");
        r42.m4110u(this.f7120f);
        r42.m4106p("y");
        r42.m4110u(this.f7121g);
        r42.m4106p("pointerType");
        r42.m4111v(this.f7122h);
        r42.m4106p("pointerId");
        r42.m4111v(this.f7123i);
        HashMap r0 = this.f7125k;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f7125k, r1, r42, r1, r5);
    L8:
        r42.m4102k();
        HashMap r03 = this.f7124j;
        if (r03 == null) goto L14;
        Iterator r04 = r03.keySet().iterator();
    L12:
        if (r04.hasNext() == false) goto L14;
        String r12 = (String) r04.next();
        AbstractC1861d.m4086a(this.f7124j, r12, r42, r12, r5);
    L14:
        r42.m4102k();
    }
}
