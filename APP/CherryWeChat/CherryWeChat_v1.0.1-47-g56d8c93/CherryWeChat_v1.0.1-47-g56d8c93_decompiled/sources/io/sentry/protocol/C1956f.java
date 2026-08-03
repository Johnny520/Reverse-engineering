package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1956f implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: A */
    public String f6894A;

    /* JADX INFO: renamed from: B */
    public String f6895B;

    /* JADX INFO: renamed from: C */
    public String f6896C;

    /* JADX INFO: renamed from: D */
    public Float f6897D;

    /* JADX INFO: renamed from: E */
    public Integer f6898E;

    /* JADX INFO: renamed from: F */
    public Double f6899F;

    /* JADX INFO: renamed from: G */
    public String f6900G;

    /* JADX INFO: renamed from: H */
    public String f6901H;

    /* JADX INFO: renamed from: I */
    public ConcurrentHashMap f6902I;

    /* JADX INFO: renamed from: a */
    public String f6903a;

    /* JADX INFO: renamed from: b */
    public String f6904b;

    /* JADX INFO: renamed from: c */
    public String f6905c;

    /* JADX INFO: renamed from: d */
    public String f6906d;

    /* JADX INFO: renamed from: e */
    public String f6907e;

    /* JADX INFO: renamed from: f */
    public String f6908f;

    /* JADX INFO: renamed from: g */
    public String[] f6909g;

    /* JADX INFO: renamed from: h */
    public Float f6910h;

    /* JADX INFO: renamed from: i */
    public Boolean f6911i;

    /* JADX INFO: renamed from: j */
    public Boolean f6912j;

    /* JADX INFO: renamed from: k */
    public EnumC1955e f6913k;

    /* JADX INFO: renamed from: l */
    public Boolean f6914l;

    /* JADX INFO: renamed from: m */
    public Long f6915m;

    /* JADX INFO: renamed from: n */
    public Long f6916n;

    /* JADX INFO: renamed from: o */
    public Long f6917o;

    /* JADX INFO: renamed from: p */
    public Boolean f6918p;

    /* JADX INFO: renamed from: q */
    public Long f6919q;

    /* JADX INFO: renamed from: r */
    public Long f6920r;

    /* JADX INFO: renamed from: s */
    public Long f6921s;

    /* JADX INFO: renamed from: t */
    public Long f6922t;

    /* JADX INFO: renamed from: u */
    public Integer f6923u;

    /* JADX INFO: renamed from: v */
    public Integer f6924v;

    /* JADX INFO: renamed from: w */
    public Float f6925w;

    /* JADX INFO: renamed from: x */
    public Integer f6926x;

    /* JADX INFO: renamed from: y */
    public Date f6927y;

    /* JADX INFO: renamed from: z */
    public TimeZone f6928z;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1956f.class == obj.getClass()) {
            C1956f c1956f = (C1956f) obj;
            if (AbstractC1856a.m4063i(this.f6903a, c1956f.f6903a) && AbstractC1856a.m4063i(this.f6904b, c1956f.f6904b) && AbstractC1856a.m4063i(this.f6905c, c1956f.f6905c) && AbstractC1856a.m4063i(this.f6906d, c1956f.f6906d) && AbstractC1856a.m4063i(this.f6907e, c1956f.f6907e) && AbstractC1856a.m4063i(this.f6908f, c1956f.f6908f) && Arrays.equals(this.f6909g, c1956f.f6909g) && AbstractC1856a.m4063i(this.f6910h, c1956f.f6910h) && AbstractC1856a.m4063i(this.f6911i, c1956f.f6911i) && AbstractC1856a.m4063i(this.f6912j, c1956f.f6912j) && this.f6913k == c1956f.f6913k && AbstractC1856a.m4063i(this.f6914l, c1956f.f6914l) && AbstractC1856a.m4063i(this.f6915m, c1956f.f6915m) && AbstractC1856a.m4063i(this.f6916n, c1956f.f6916n) && AbstractC1856a.m4063i(this.f6917o, c1956f.f6917o) && AbstractC1856a.m4063i(this.f6918p, c1956f.f6918p) && AbstractC1856a.m4063i(this.f6919q, c1956f.f6919q) && AbstractC1856a.m4063i(this.f6920r, c1956f.f6920r) && AbstractC1856a.m4063i(this.f6921s, c1956f.f6921s) && AbstractC1856a.m4063i(this.f6922t, c1956f.f6922t) && AbstractC1856a.m4063i(this.f6923u, c1956f.f6923u) && AbstractC1856a.m4063i(this.f6924v, c1956f.f6924v) && AbstractC1856a.m4063i(this.f6925w, c1956f.f6925w) && AbstractC1856a.m4063i(this.f6926x, c1956f.f6926x) && AbstractC1856a.m4063i(this.f6927y, c1956f.f6927y) && AbstractC1856a.m4063i(this.f6894A, c1956f.f6894A) && AbstractC1856a.m4063i(this.f6895B, c1956f.f6895B) && AbstractC1856a.m4063i(this.f6896C, c1956f.f6896C) && AbstractC1856a.m4063i(this.f6897D, c1956f.f6897D) && AbstractC1856a.m4063i(this.f6898E, c1956f.f6898E) && AbstractC1856a.m4063i(this.f6899F, c1956f.f6899F) && AbstractC1856a.m4063i(this.f6900G, c1956f.f6900G) && AbstractC1856a.m4063i(this.f6901H, c1956f.f6901H)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.f6903a, this.f6904b, this.f6905c, this.f6906d, this.f6907e, this.f6908f, this.f6910h, this.f6911i, this.f6912j, this.f6913k, this.f6914l, this.f6915m, this.f6916n, this.f6917o, this.f6918p, this.f6919q, this.f6920r, this.f6921s, this.f6922t, this.f6923u, this.f6924v, this.f6925w, this.f6926x, this.f6927y, this.f6928z, this.f6894A, this.f6895B, this.f6896C, this.f6897D, this.f6898E, this.f6899F, this.f6900G, this.f6901H}) * 31) + Arrays.hashCode(this.f6909g);
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6903a != null) {
            c1901c.m4106p("name");
            c1901c.m4115z(this.f6903a);
        }
        if (this.f6904b != null) {
            c1901c.m4106p("manufacturer");
            c1901c.m4115z(this.f6904b);
        }
        if (this.f6905c != null) {
            c1901c.m4106p("brand");
            c1901c.m4115z(this.f6905c);
        }
        if (this.f6906d != null) {
            c1901c.m4106p("family");
            c1901c.m4115z(this.f6906d);
        }
        if (this.f6907e != null) {
            c1901c.m4106p("model");
            c1901c.m4115z(this.f6907e);
        }
        if (this.f6908f != null) {
            c1901c.m4106p("model_id");
            c1901c.m4115z(this.f6908f);
        }
        if (this.f6909g != null) {
            c1901c.m4106p("archs");
            c1901c.m4112w(iLogger, this.f6909g);
        }
        if (this.f6910h != null) {
            c1901c.m4106p("battery_level");
            c1901c.m4114y(this.f6910h);
        }
        if (this.f6911i != null) {
            c1901c.m4106p("charging");
            c1901c.m4113x(this.f6911i);
        }
        if (this.f6912j != null) {
            c1901c.m4106p("online");
            c1901c.m4113x(this.f6912j);
        }
        if (this.f6913k != null) {
            c1901c.m4106p("orientation");
            c1901c.m4112w(iLogger, this.f6913k);
        }
        if (this.f6914l != null) {
            c1901c.m4106p("simulator");
            c1901c.m4113x(this.f6914l);
        }
        if (this.f6915m != null) {
            c1901c.m4106p("memory_size");
            c1901c.m4114y(this.f6915m);
        }
        if (this.f6916n != null) {
            c1901c.m4106p("free_memory");
            c1901c.m4114y(this.f6916n);
        }
        if (this.f6917o != null) {
            c1901c.m4106p("usable_memory");
            c1901c.m4114y(this.f6917o);
        }
        if (this.f6918p != null) {
            c1901c.m4106p("low_memory");
            c1901c.m4113x(this.f6918p);
        }
        if (this.f6919q != null) {
            c1901c.m4106p("storage_size");
            c1901c.m4114y(this.f6919q);
        }
        if (this.f6920r != null) {
            c1901c.m4106p("free_storage");
            c1901c.m4114y(this.f6920r);
        }
        if (this.f6921s != null) {
            c1901c.m4106p("external_storage_size");
            c1901c.m4114y(this.f6921s);
        }
        if (this.f6922t != null) {
            c1901c.m4106p("external_free_storage");
            c1901c.m4114y(this.f6922t);
        }
        if (this.f6923u != null) {
            c1901c.m4106p("screen_width_pixels");
            c1901c.m4114y(this.f6923u);
        }
        if (this.f6924v != null) {
            c1901c.m4106p("screen_height_pixels");
            c1901c.m4114y(this.f6924v);
        }
        if (this.f6925w != null) {
            c1901c.m4106p("screen_density");
            c1901c.m4114y(this.f6925w);
        }
        if (this.f6926x != null) {
            c1901c.m4106p("screen_dpi");
            c1901c.m4114y(this.f6926x);
        }
        if (this.f6927y != null) {
            c1901c.m4106p("boot_time");
            c1901c.m4112w(iLogger, this.f6927y);
        }
        if (this.f6928z != null) {
            c1901c.m4106p("timezone");
            c1901c.m4112w(iLogger, this.f6928z);
        }
        if (this.f6894A != null) {
            c1901c.m4106p("id");
            c1901c.m4115z(this.f6894A);
        }
        if (this.f6896C != null) {
            c1901c.m4106p("connection_type");
            c1901c.m4115z(this.f6896C);
        }
        if (this.f6897D != null) {
            c1901c.m4106p("battery_temperature");
            c1901c.m4114y(this.f6897D);
        }
        if (this.f6895B != null) {
            c1901c.m4106p("locale");
            c1901c.m4115z(this.f6895B);
        }
        if (this.f6898E != null) {
            c1901c.m4106p("processor_count");
            c1901c.m4114y(this.f6898E);
        }
        if (this.f6899F != null) {
            c1901c.m4106p("processor_frequency");
            c1901c.m4114y(this.f6899F);
        }
        if (this.f6900G != null) {
            c1901c.m4106p("cpu_description");
            c1901c.m4115z(this.f6900G);
        }
        if (this.f6901H != null) {
            c1901c.m4106p("chipset");
            c1901c.m4115z(this.f6901H);
        }
        ConcurrentHashMap concurrentHashMap = this.f6902I;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6902I, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
