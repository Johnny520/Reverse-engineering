package io.sentry.rrweb;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.rrweb.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1994j extends AbstractC1986b implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: c */
    public String f7135c;

    /* JADX INFO: renamed from: d */
    public int f7136d;

    /* JADX INFO: renamed from: e */
    public int f7137e;

    /* JADX INFO: renamed from: f */
    public HashMap f7138f;

    public C1994j() {
        super(EnumC1987c.Meta);
        this.f7135c = "";
    }

    @Override // io.sentry.rrweb.AbstractC1986b
    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L20:
        return false;
    L8:
        if (C1994j.class != r5.getClass()) goto L20;
        if (super.equals(r5) == true) goto L13;
        return false;
    L13:
        C1994j r52 = (C1994j) r5;
        if (this.f7136d != r52.f7136d) goto L20;
        if (this.f7137e != r52.f7137e) goto L20;
        if (AbstractC1856a.m4063i(this.f7135c, r52.f7135c) == false) goto L20;
        return true;
    }

    @Override // io.sentry.rrweb.AbstractC1986b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f7135c, Integer.valueOf(this.f7136d), Integer.valueOf(this.f7137e)});
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
        r42.m4106p("href");
        r42.m4115z(this.f7135c);
        r42.m4106p("height");
        r42.m4111v(this.f7136d);
        r42.m4106p("width");
        r42.m4111v(this.f7137e);
        HashMap r0 = this.f7138f;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f7138f, r1, r42, r1, r5);
    L8:
        r42.m4102k();
        r42.m4102k();
    }
}
