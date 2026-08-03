package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.vendor.gson.stream.C2051c;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

    /* JADX INFO: renamed from: B */
    public String f6733B;

    /* JADX INFO: renamed from: C */
    public ConcurrentHashMap f6734C;

    /* JADX INFO: renamed from: a */
    public final File f6735a;

    /* JADX INFO: renamed from: b */
    public final Callable f6736b;

    /* JADX INFO: renamed from: c */
    public int f6737c;

    /* JADX INFO: renamed from: d */
    public String f6738d;

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

    /* JADX INFO: renamed from: l */
    public List f6746l;

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

    public C1881h1(File r3, Date r4, ArrayList r5, String r6, String r7, String r8, String r9, int r10, String r11, Callable r12, String r13, String r14, String r15, Boolean r16, String r17, String r18, String r19, String r20, String r21, Map r22) {
        this.f6746l = new ArrayList();
        this.f6733B = null;
        this.f6735a = r3;
        this.f6760z = r4;
        this.f6745k = r11;
        this.f6736b = r12;
        this.f6737c = r10;
        this.f6738d = Locale.getDefault().toString();
        String r32 = "";
        if (r13 != null) goto L6;
        r13 = "";
    L6:
        this.f6739e = r13;
        if (r14 != null) goto L10;
        r14 = "";
    L10:
        this.f6740f = r14;
        if (r15 == null) goto L13;
        String r42 = r15;
    L14:
        this.f6743i = r42;
        if (r16 == null) goto L17;
        boolean r43 = r16.booleanValue();
    L18:
        this.f6744j = r43;
        if (r17 == null) goto L21;
        String r44 = r17;
    L22:
        this.f6747m = r44;
        this.f6741g = "";
        this.f6742h = "android";
        this.f6748n = "android";
        if (r18 == null) goto L25;
        String r45 = r18;
    L26:
        this.f6749o = r45;
        this.f6750p = r5;
        if (r6.isEmpty() == false) goto L29;
        r6 = "unknown";
    L29:
        this.f6751q = r6;
        this.f6752r = r9;
        this.f6753s = "";
        if (r19 == null) goto L32;
        r32 = r19;
    L32:
        this.f6754t = r32;
        this.f6755u = r7;
        this.f6756v = r8;
        this.f6757w = AbstractC1856a.m4065k();
        if (r20 == null) goto L35;
        String r33 = r20;
    L36:
        this.f6758x = r33;
        this.f6759y = r21;
        if (r21.equals("normal") == false) goto L39;
    L44:
        this.f6732A = r22;
        return;
    L39:
        if (this.f6759y.equals("timeout") == true) goto L44;
        if (this.f6759y.equals("backgrounded") == true) goto L44;
        this.f6759y = "normal";
        goto L44
    L35:
        r33 = "production";
        goto L36
    L25:
        r45 = "";
        goto L26
    L21:
        r44 = "0";
        goto L22
    L17:
        r43 = false;
        goto L18
    L13:
        r42 = "";
        goto L14
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("android_api_level");
        r42.m4112w(r5, Integer.valueOf(this.f6737c));
        r42.m4106p("device_locale");
        r42.m4112w(r5, this.f6738d);
        r42.m4106p("device_manufacturer");
        r42.m4115z(this.f6739e);
        r42.m4106p("device_model");
        r42.m4115z(this.f6740f);
        r42.m4106p("device_os_build_number");
        r42.m4115z(this.f6741g);
        r42.m4106p("device_os_name");
        r42.m4115z(this.f6742h);
        r42.m4106p("device_os_version");
        r42.m4115z(this.f6743i);
        r42.m4106p("device_is_emulator");
        r42.m4100A(this.f6744j);
        r42.m4106p("architecture");
        r42.m4112w(r5, this.f6745k);
        r42.m4106p("device_cpu_frequencies");
        r42.m4112w(r5, this.f6746l);
        r42.m4106p("device_physical_memory_bytes");
        r42.m4115z(this.f6747m);
        r42.m4106p("platform");
        r42.m4115z(this.f6748n);
        r42.m4106p("build_id");
        r42.m4115z(this.f6749o);
        r42.m4106p("transaction_name");
        r42.m4115z(this.f6751q);
        r42.m4106p("duration_ns");
        r42.m4115z(this.f6752r);
        r42.m4106p("version_name");
        r42.m4115z(this.f6754t);
        r42.m4106p("version_code");
        r42.m4115z(this.f6753s);
        ArrayList r0 = this.f6750p;
        if (r0.isEmpty() == true) goto L5;
        r42.m4106p("transactions");
        r42.m4112w(r5, r0);
    L5:
        r42.m4106p("transaction_id");
        r42.m4115z(this.f6755u);
        r42.m4106p("trace_id");
        r42.m4115z(this.f6756v);
        r42.m4106p("profile_id");
        r42.m4115z(this.f6757w);
        r42.m4106p("environment");
        r42.m4115z(this.f6758x);
        r42.m4106p("truncation_reason");
        r42.m4115z(this.f6759y);
        if (this.f6733B == null) goto L8;
        r42.m4106p("sampled_profile");
        r42.m4115z(this.f6733B);
    L8:
        String r02 = ((C2051c) r42.f6781b).f7266d;
        r42.m4109t("");
        r42.m4106p("measurements");
        r42.m4112w(r5, this.f6732A);
        r42.m4109t(r02);
        r42.m4106p("timestamp");
        r42.m4112w(r5, this.f6760z);
        ConcurrentHashMap r03 = this.f6734C;
        if (r03 == null) goto L14;
        Iterator r04 = r03.keySet().iterator();
    L12:
        if (r04.hasNext() == false) goto L14;
        String r1 = (String) r04.next();
        AbstractC1861d.m4087b(this.f6734C, r1, r42, r1, r5);
    L14:
        r42.m4102k();
    }
}
