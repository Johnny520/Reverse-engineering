package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.protocol.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1950G implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public String f6860a;

    /* JADX INFO: renamed from: b */
    public String f6861b;

    /* JADX INFO: renamed from: c */
    public String f6862c;

    /* JADX INFO: renamed from: d */
    public String f6863d;

    /* JADX INFO: renamed from: e */
    public Double f6864e;

    /* JADX INFO: renamed from: f */
    public Double f6865f;

    /* JADX INFO: renamed from: g */
    public Double f6866g;

    /* JADX INFO: renamed from: h */
    public Double f6867h;

    /* JADX INFO: renamed from: i */
    public String f6868i;

    /* JADX INFO: renamed from: j */
    public Double f6869j;

    /* JADX INFO: renamed from: k */
    public List f6870k;

    /* JADX INFO: renamed from: l */
    public HashMap f6871l;

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6860a == null) goto L6;
        r42.m4106p("rendering_system");
        r42.m4115z(this.f6860a);
    L6:
        if (this.f6861b == null) goto L9;
        r42.m4106p("type");
        r42.m4115z(this.f6861b);
    L9:
        if (this.f6862c == null) goto L12;
        r42.m4106p("identifier");
        r42.m4115z(this.f6862c);
    L12:
        if (this.f6863d == null) goto L15;
        r42.m4106p("tag");
        r42.m4115z(this.f6863d);
    L15:
        if (this.f6864e == null) goto L18;
        r42.m4106p("width");
        r42.m4114y(this.f6864e);
    L18:
        if (this.f6865f == null) goto L21;
        r42.m4106p("height");
        r42.m4114y(this.f6865f);
    L21:
        if (this.f6866g == null) goto L24;
        r42.m4106p("x");
        r42.m4114y(this.f6866g);
    L24:
        if (this.f6867h == null) goto L27;
        r42.m4106p("y");
        r42.m4114y(this.f6867h);
    L27:
        if (this.f6868i == null) goto L30;
        r42.m4106p("visibility");
        r42.m4115z(this.f6868i);
    L30:
        if (this.f6869j == null) goto L32;
        r42.m4106p("alpha");
        r42.m4114y(this.f6869j);
    L32:
        List r0 = this.f6870k;
        if (r0 != null) goto L35;
    L37:
        HashMap r02 = this.f6871l;
        if (r02 == null) goto L43;
        Iterator r03 = r02.keySet().iterator();
    L41:
        if (r03.hasNext() == false) goto L43;
        String r1 = (String) r03.next();
        AbstractC1861d.m4086a(this.f6871l, r1, r42, r1, r5);
    L43:
        r42.m4102k();
        return;
    L35:
        if (r0.isEmpty() == true) goto L37;
        r42.m4106p("children");
        r42.m4112w(r5, this.f6870k);
        goto L37
    }
}
