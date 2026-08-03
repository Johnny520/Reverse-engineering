package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
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

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L77:
        return false;
    L8:
        if (C1956f.class != r5.getClass()) goto L77;
        C1956f r52 = (C1956f) r5;
        if (AbstractC1856a.m4063i(this.f6903a, r52.f6903a) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6904b, r52.f6904b) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6905c, r52.f6905c) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6906d, r52.f6906d) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6907e, r52.f6907e) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6908f, r52.f6908f) == false) goto L77;
        if (Arrays.equals(this.f6909g, r52.f6909g) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6910h, r52.f6910h) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6911i, r52.f6911i) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6912j, r52.f6912j) == false) goto L77;
        if (this.f6913k != r52.f6913k) goto L77;
        if (AbstractC1856a.m4063i(this.f6914l, r52.f6914l) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6915m, r52.f6915m) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6916n, r52.f6916n) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6917o, r52.f6917o) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6918p, r52.f6918p) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6919q, r52.f6919q) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6920r, r52.f6920r) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6921s, r52.f6921s) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6922t, r52.f6922t) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6923u, r52.f6923u) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6924v, r52.f6924v) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6925w, r52.f6925w) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6926x, r52.f6926x) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6927y, r52.f6927y) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6894A, r52.f6894A) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6895B, r52.f6895B) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6896C, r52.f6896C) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6897D, r52.f6897D) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6898E, r52.f6898E) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6899F, r52.f6899F) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6900G, r52.f6900G) == false) goto L77;
        if (AbstractC1856a.m4063i(this.f6901H, r52.f6901H) == false) goto L77;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.f6903a, this.f6904b, this.f6905c, this.f6906d, this.f6907e, this.f6908f, this.f6910h, this.f6911i, this.f6912j, this.f6913k, this.f6914l, this.f6915m, this.f6916n, this.f6917o, this.f6918p, this.f6919q, this.f6920r, this.f6921s, this.f6922t, this.f6923u, this.f6924v, this.f6925w, this.f6926x, this.f6927y, this.f6928z, this.f6894A, this.f6895B, this.f6896C, this.f6897D, this.f6898E, this.f6899F, this.f6900G, this.f6901H}) * 31) + Arrays.hashCode(this.f6909g);
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6903a == null) goto L6;
        r42.m4106p("name");
        r42.m4115z(this.f6903a);
    L6:
        if (this.f6904b == null) goto L9;
        r42.m4106p("manufacturer");
        r42.m4115z(this.f6904b);
    L9:
        if (this.f6905c == null) goto L12;
        r42.m4106p("brand");
        r42.m4115z(this.f6905c);
    L12:
        if (this.f6906d == null) goto L15;
        r42.m4106p("family");
        r42.m4115z(this.f6906d);
    L15:
        if (this.f6907e == null) goto L18;
        r42.m4106p("model");
        r42.m4115z(this.f6907e);
    L18:
        if (this.f6908f == null) goto L21;
        r42.m4106p("model_id");
        r42.m4115z(this.f6908f);
    L21:
        if (this.f6909g == null) goto L24;
        r42.m4106p("archs");
        r42.m4112w(r5, this.f6909g);
    L24:
        if (this.f6910h == null) goto L27;
        r42.m4106p("battery_level");
        r42.m4114y(this.f6910h);
    L27:
        if (this.f6911i == null) goto L30;
        r42.m4106p("charging");
        r42.m4113x(this.f6911i);
    L30:
        if (this.f6912j == null) goto L33;
        r42.m4106p("online");
        r42.m4113x(this.f6912j);
    L33:
        if (this.f6913k == null) goto L36;
        r42.m4106p("orientation");
        r42.m4112w(r5, this.f6913k);
    L36:
        if (this.f6914l == null) goto L39;
        r42.m4106p("simulator");
        r42.m4113x(this.f6914l);
    L39:
        if (this.f6915m == null) goto L42;
        r42.m4106p("memory_size");
        r42.m4114y(this.f6915m);
    L42:
        if (this.f6916n == null) goto L45;
        r42.m4106p("free_memory");
        r42.m4114y(this.f6916n);
    L45:
        if (this.f6917o == null) goto L48;
        r42.m4106p("usable_memory");
        r42.m4114y(this.f6917o);
    L48:
        if (this.f6918p == null) goto L51;
        r42.m4106p("low_memory");
        r42.m4113x(this.f6918p);
    L51:
        if (this.f6919q == null) goto L54;
        r42.m4106p("storage_size");
        r42.m4114y(this.f6919q);
    L54:
        if (this.f6920r == null) goto L57;
        r42.m4106p("free_storage");
        r42.m4114y(this.f6920r);
    L57:
        if (this.f6921s == null) goto L60;
        r42.m4106p("external_storage_size");
        r42.m4114y(this.f6921s);
    L60:
        if (this.f6922t == null) goto L63;
        r42.m4106p("external_free_storage");
        r42.m4114y(this.f6922t);
    L63:
        if (this.f6923u == null) goto L66;
        r42.m4106p("screen_width_pixels");
        r42.m4114y(this.f6923u);
    L66:
        if (this.f6924v == null) goto L69;
        r42.m4106p("screen_height_pixels");
        r42.m4114y(this.f6924v);
    L69:
        if (this.f6925w == null) goto L72;
        r42.m4106p("screen_density");
        r42.m4114y(this.f6925w);
    L72:
        if (this.f6926x == null) goto L75;
        r42.m4106p("screen_dpi");
        r42.m4114y(this.f6926x);
    L75:
        if (this.f6927y == null) goto L78;
        r42.m4106p("boot_time");
        r42.m4112w(r5, this.f6927y);
    L78:
        if (this.f6928z == null) goto L81;
        r42.m4106p("timezone");
        r42.m4112w(r5, this.f6928z);
    L81:
        if (this.f6894A == null) goto L84;
        r42.m4106p("id");
        r42.m4115z(this.f6894A);
    L84:
        if (this.f6896C == null) goto L87;
        r42.m4106p("connection_type");
        r42.m4115z(this.f6896C);
    L87:
        if (this.f6897D == null) goto L90;
        r42.m4106p("battery_temperature");
        r42.m4114y(this.f6897D);
    L90:
        if (this.f6895B == null) goto L93;
        r42.m4106p("locale");
        r42.m4115z(this.f6895B);
    L93:
        if (this.f6898E == null) goto L96;
        r42.m4106p("processor_count");
        r42.m4114y(this.f6898E);
    L96:
        if (this.f6899F == null) goto L99;
        r42.m4106p("processor_frequency");
        r42.m4114y(this.f6899F);
    L99:
        if (this.f6900G == null) goto L102;
        r42.m4106p("cpu_description");
        r42.m4115z(this.f6900G);
    L102:
        if (this.f6901H == null) goto L104;
        r42.m4106p("chipset");
        r42.m4115z(this.f6901H);
    L104:
        ConcurrentHashMap r0 = this.f6902I;
        if (r0 == null) goto L110;
        Iterator r02 = r0.keySet().iterator();
    L108:
        if (r02.hasNext() == false) goto L110;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f6902I, r1, r42, r1, r5);
    L110:
        r42.m4102k();
    }
}
