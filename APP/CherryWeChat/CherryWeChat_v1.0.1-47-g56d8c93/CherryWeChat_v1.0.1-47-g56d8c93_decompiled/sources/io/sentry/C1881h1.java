package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.vendor.gson.stream.C2051c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1881h1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: A */
    public final Map f6732A;

    /* JADX INFO: renamed from: C */
    public ConcurrentHashMap f6734C;

    /* JADX INFO: renamed from: a */
    public final File f6735a;

    /* JADX INFO: renamed from: b */
    public final Callable f6736b;

    /* JADX INFO: renamed from: c */
    public int f6737c;

    /* JADX INFO: renamed from: e */
    public String f6739e;

    /* JADX INFO: renamed from: f */
    public String f6740f;

    /* JADX INFO: renamed from: g */
    public String f6741g;

    /* JADX INFO: renamed from: h */
    public String f6742h;

    /* JADX INFO: renamed from: i */
    public String f6743i;

    /* JADX INFO: renamed from: j */
    public boolean f6744j;

    /* JADX INFO: renamed from: k */
    public String f6745k;

    /* JADX INFO: renamed from: m */
    public String f6747m;

    /* JADX INFO: renamed from: n */
    public String f6748n;

    /* JADX INFO: renamed from: o */
    public String f6749o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f6750p;

    /* JADX INFO: renamed from: q */
    public String f6751q;

    /* JADX INFO: renamed from: r */
    public String f6752r;

    /* JADX INFO: renamed from: s */
    public String f6753s;

    /* JADX INFO: renamed from: t */
    public String f6754t;

    /* JADX INFO: renamed from: u */
    public String f6755u;

    /* JADX INFO: renamed from: v */
    public String f6756v;

    /* JADX INFO: renamed from: w */
    public String f6757w;

    /* JADX INFO: renamed from: x */
    public String f6758x;

    /* JADX INFO: renamed from: y */
    public String f6759y;

    /* JADX INFO: renamed from: z */
    public Date f6760z;

    /* JADX INFO: renamed from: l */
    public List f6746l = new ArrayList();

    /* JADX INFO: renamed from: B */
    public String f6733B = null;

    /* JADX INFO: renamed from: d */
    public String f6738d = Locale.getDefault().toString();

    public C1881h1(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.f6735a = file;
        this.f6760z = date;
        this.f6745k = str5;
        this.f6736b = callable;
        this.f6737c = i;
        this.f6739e = str6 == null ? "" : str6;
        this.f6740f = str7 == null ? "" : str7;
        this.f6743i = str8 != null ? str8 : "";
        this.f6744j = bool != null ? bool.booleanValue() : false;
        this.f6747m = str9 != null ? str9 : "0";
        this.f6741g = "";
        this.f6742h = "android";
        this.f6748n = "android";
        this.f6749o = str10 != null ? str10 : "";
        this.f6750p = arrayList;
        this.f6751q = str.isEmpty() ? "unknown" : str;
        this.f6752r = str4;
        this.f6753s = "";
        this.f6754t = str11 != null ? str11 : "";
        this.f6755u = str2;
        this.f6756v = str3;
        this.f6757w = AbstractC1856a.m4065k();
        this.f6758x = str12 != null ? str12 : "production";
        this.f6759y = str13;
        if (!str13.equals("normal") && !this.f6759y.equals("timeout") && !this.f6759y.equals("backgrounded")) {
            this.f6759y = "normal";
        }
        this.f6732A = map;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("android_api_level");
        c1901c.m4112w(iLogger, Integer.valueOf(this.f6737c));
        c1901c.m4106p("device_locale");
        c1901c.m4112w(iLogger, this.f6738d);
        c1901c.m4106p("device_manufacturer");
        c1901c.m4115z(this.f6739e);
        c1901c.m4106p("device_model");
        c1901c.m4115z(this.f6740f);
        c1901c.m4106p("device_os_build_number");
        c1901c.m4115z(this.f6741g);
        c1901c.m4106p("device_os_name");
        c1901c.m4115z(this.f6742h);
        c1901c.m4106p("device_os_version");
        c1901c.m4115z(this.f6743i);
        c1901c.m4106p("device_is_emulator");
        c1901c.m4100A(this.f6744j);
        c1901c.m4106p("architecture");
        c1901c.m4112w(iLogger, this.f6745k);
        c1901c.m4106p("device_cpu_frequencies");
        c1901c.m4112w(iLogger, this.f6746l);
        c1901c.m4106p("device_physical_memory_bytes");
        c1901c.m4115z(this.f6747m);
        c1901c.m4106p("platform");
        c1901c.m4115z(this.f6748n);
        c1901c.m4106p("build_id");
        c1901c.m4115z(this.f6749o);
        c1901c.m4106p("transaction_name");
        c1901c.m4115z(this.f6751q);
        c1901c.m4106p("duration_ns");
        c1901c.m4115z(this.f6752r);
        c1901c.m4106p("version_name");
        c1901c.m4115z(this.f6754t);
        c1901c.m4106p("version_code");
        c1901c.m4115z(this.f6753s);
        ArrayList arrayList = this.f6750p;
        if (!arrayList.isEmpty()) {
            c1901c.m4106p("transactions");
            c1901c.m4112w(iLogger, arrayList);
        }
        c1901c.m4106p("transaction_id");
        c1901c.m4115z(this.f6755u);
        c1901c.m4106p("trace_id");
        c1901c.m4115z(this.f6756v);
        c1901c.m4106p("profile_id");
        c1901c.m4115z(this.f6757w);
        c1901c.m4106p("environment");
        c1901c.m4115z(this.f6758x);
        c1901c.m4106p("truncation_reason");
        c1901c.m4115z(this.f6759y);
        if (this.f6733B != null) {
            c1901c.m4106p("sampled_profile");
            c1901c.m4115z(this.f6733B);
        }
        String str = ((C2051c) c1901c.f6781b).f7266d;
        c1901c.m4109t("");
        c1901c.m4106p("measurements");
        c1901c.m4112w(iLogger, this.f6732A);
        c1901c.m4109t(str);
        c1901c.m4106p("timestamp");
        c1901c.m4112w(iLogger, this.f6760z);
        ConcurrentHashMap concurrentHashMap = this.f6734C;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6734C, str2, c1901c, str2, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
