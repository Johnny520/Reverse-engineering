package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2059x2 extends AbstractC1568C1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: p */
    public File f7280p;

    /* JADX INFO: renamed from: q */
    public String f7281q;

    /* JADX INFO: renamed from: r */
    public EnumC2055w2 f7282r;

    /* JADX INFO: renamed from: s */
    public C1970t f7283s;

    /* JADX INFO: renamed from: t */
    public int f7284t;

    /* JADX INFO: renamed from: u */
    public Date f7285u;

    /* JADX INFO: renamed from: v */
    public Date f7286v;

    /* JADX INFO: renamed from: w */
    public List f7287w;

    /* JADX INFO: renamed from: x */
    public List f7288x;

    /* JADX INFO: renamed from: y */
    public List f7289y;

    /* JADX INFO: renamed from: z */
    public HashMap f7290z;

    public C2059x2() {
        this.f7283s = new C1970t();
        this.f7281q = "replay_event";
        this.f7282r = EnumC2055w2.SESSION;
        this.f7288x = new ArrayList();
        this.f7289y = new ArrayList();
        this.f7287w = new ArrayList();
        this.f7285u = AbstractC1856a.m4067m();
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L25:
        return false;
    L8:
        if (C2059x2.class != r5.getClass()) goto L25;
        C2059x2 r52 = (C2059x2) r5;
        if (this.f7284t != r52.f7284t) goto L25;
        if (AbstractC1856a.m4063i(this.f7281q, r52.f7281q) == false) goto L25;
        if (this.f7282r != r52.f7282r) goto L25;
        if (AbstractC1856a.m4063i(this.f7283s, r52.f7283s) == false) goto L25;
        if (AbstractC1856a.m4063i(this.f7287w, r52.f7287w) == false) goto L25;
        if (AbstractC1856a.m4063i(this.f7288x, r52.f7288x) == false) goto L25;
        if (AbstractC1856a.m4063i(this.f7289y, r52.f7289y) == false) goto L25;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7281q, this.f7282r, this.f7283s, Integer.valueOf(this.f7284t), this.f7287w, this.f7288x, this.f7289y});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("type");
        r42.m4115z(this.f7281q);
        r42.m4106p("replay_type");
        r42.m4112w(r5, this.f7282r);
        r42.m4106p("segment_id");
        r42.m4111v(this.f7284t);
        r42.m4106p("timestamp");
        r42.m4112w(r5, this.f7285u);
        if (this.f7283s == null) goto L6;
        r42.m4106p("replay_id");
        r42.m4112w(r5, this.f7283s);
    L6:
        if (this.f7286v == null) goto L9;
        r42.m4106p("replay_start_timestamp");
        r42.m4112w(r5, this.f7286v);
    L9:
        if (this.f7287w == null) goto L12;
        r42.m4106p("urls");
        r42.m4112w(r5, this.f7287w);
    L12:
        if (this.f7288x == null) goto L15;
        r42.m4106p("error_ids");
        r42.m4112w(r5, this.f7288x);
    L15:
        if (this.f7289y == null) goto L17;
        r42.m4106p("trace_ids");
        r42.m4112w(r5, this.f7289y);
    L17:
        AbstractC1856a.m4049E(this, r42, r5);
        HashMap r0 = this.f7290z;
        if (r0 == null) goto L23;
        Iterator r02 = r0.keySet().iterator();
    L21:
        if (r02.hasNext() == false) goto L23;
        String r1 = (String) r02.next();
        AbstractC1861d.m4086a(this.f7290z, r1, r42, r1, r5);
    L23:
        r42.m4102k();
    }
}
