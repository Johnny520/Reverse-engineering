package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2059x2 extends AbstractC1568C1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: p */
    public File f7280p;

    /* JADX INFO: renamed from: t */
    public int f7284t;

    /* JADX INFO: renamed from: v */
    public Date f7286v;

    /* JADX INFO: renamed from: z */
    public HashMap f7290z;

    /* JADX INFO: renamed from: s */
    public C1970t f7283s = new C1970t();

    /* JADX INFO: renamed from: q */
    public String f7281q = "replay_event";

    /* JADX INFO: renamed from: r */
    public EnumC2055w2 f7282r = EnumC2055w2.SESSION;

    /* JADX INFO: renamed from: x */
    public List f7288x = new ArrayList();

    /* JADX INFO: renamed from: y */
    public List f7289y = new ArrayList();

    /* JADX INFO: renamed from: w */
    public List f7287w = new ArrayList();

    /* JADX INFO: renamed from: u */
    public Date f7285u = AbstractC1856a.m4067m();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2059x2.class == obj.getClass()) {
            C2059x2 c2059x2 = (C2059x2) obj;
            if (this.f7284t == c2059x2.f7284t && AbstractC1856a.m4063i(this.f7281q, c2059x2.f7281q) && this.f7282r == c2059x2.f7282r && AbstractC1856a.m4063i(this.f7283s, c2059x2.f7283s) && AbstractC1856a.m4063i(this.f7287w, c2059x2.f7287w) && AbstractC1856a.m4063i(this.f7288x, c2059x2.f7288x) && AbstractC1856a.m4063i(this.f7289y, c2059x2.f7289y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7281q, this.f7282r, this.f7283s, Integer.valueOf(this.f7284t), this.f7287w, this.f7288x, this.f7289y});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("type");
        c1901c.m4115z(this.f7281q);
        c1901c.m4106p("replay_type");
        c1901c.m4112w(iLogger, this.f7282r);
        c1901c.m4106p("segment_id");
        c1901c.m4111v(this.f7284t);
        c1901c.m4106p("timestamp");
        c1901c.m4112w(iLogger, this.f7285u);
        if (this.f7283s != null) {
            c1901c.m4106p("replay_id");
            c1901c.m4112w(iLogger, this.f7283s);
        }
        if (this.f7286v != null) {
            c1901c.m4106p("replay_start_timestamp");
            c1901c.m4112w(iLogger, this.f7286v);
        }
        if (this.f7287w != null) {
            c1901c.m4106p("urls");
            c1901c.m4112w(iLogger, this.f7287w);
        }
        if (this.f7288x != null) {
            c1901c.m4106p("error_ids");
            c1901c.m4112w(iLogger, this.f7288x);
        }
        if (this.f7289y != null) {
            c1901c.m4106p("trace_ids");
            c1901c.m4112w(iLogger, this.f7289y);
        }
        AbstractC1856a.m4049E(this, c1901c, iLogger);
        HashMap map = this.f7290z;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC1861d.m4086a(this.f7290z, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
