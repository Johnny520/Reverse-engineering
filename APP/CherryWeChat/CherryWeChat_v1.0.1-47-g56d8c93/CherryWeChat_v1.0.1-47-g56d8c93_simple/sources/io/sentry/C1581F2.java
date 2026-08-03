package io.sentry;

import com.youth.banner.BuildConfig;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.C2029a;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.sentry.F2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1581F2 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final Date f5696a;

    /* JADX INFO: renamed from: b */
    public Date f5697b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f5698c;

    /* JADX INFO: renamed from: d */
    public final String f5699d;

    /* JADX INFO: renamed from: e */
    public final String f5700e;

    /* JADX INFO: renamed from: f */
    public Boolean f5701f;

    /* JADX INFO: renamed from: g */
    public EnumC1577E2 f5702g;

    /* JADX INFO: renamed from: h */
    public Long f5703h;

    /* JADX INFO: renamed from: i */
    public Double f5704i;

    /* JADX INFO: renamed from: j */
    public final String f5705j;

    /* JADX INFO: renamed from: k */
    public String f5706k;

    /* JADX INFO: renamed from: l */
    public final String f5707l;

    /* JADX INFO: renamed from: m */
    public final String f5708m;

    /* JADX INFO: renamed from: n */
    public String f5709n;

    /* JADX INFO: renamed from: o */
    public final C2029a f5710o;

    /* JADX INFO: renamed from: p */
    public ConcurrentHashMap f5711p;

    public C1581F2(EnumC1577E2 r2, Date r3, Date r4, int r5, String r6, String r7, Boolean r8, Long r9, Double r10, String r11, String r12, String r13, String r14, String r15) {
        this.f5710o = new C2029a();
        this.f5702g = r2;
        this.f5696a = r3;
        this.f5697b = r4;
        this.f5698c = new AtomicInteger(r5);
        this.f5699d = r6;
        this.f5700e = r7;
        this.f5701f = r8;
        this.f5703h = r9;
        this.f5704i = r10;
        this.f5705j = r11;
        this.f5706k = r12;
        this.f5707l = r13;
        this.f5708m = r14;
        this.f5709n = r15;
    }

    /* JADX INFO: renamed from: a */
    public final C1581F2 m3662a() {
        EnumC1577E2 r1 = this.f5702g;
        Date r3 = this.f5697b;
        int r4 = this.f5698c.get();
        Boolean r7 = this.f5701f;
        Long r8 = this.f5703h;
        Double r9 = this.f5704i;
        String r11 = this.f5706k;
        String r13 = this.f5708m;
        String r14 = this.f5709n;
        return new C1581F2(r1, this.f5696a, r3, r4, this.f5699d, this.f5700e, r7, r8, r9, this.f5705j, r11, this.f5707l, r13, r14);
    }

    /* JADX INFO: renamed from: b */
    public final void m3663b(Date r6) {
        C1981r r0 = this.f5710o.m4173a();
        this.f5701f = null;     // Catch: Throwable -> L6
        if (this.f5702g != EnumC1577E2.f5688Ok) goto L8;
        this.f5702g = EnumC1577E2.Exited;     // Catch: Throwable -> L6
    L8:
        if (r6 == null) goto L10;
        this.f5697b = r6;     // Catch: Throwable -> L6
    L12:
        if (this.f5697b == null) goto L17;
        this.f5704i = Double.valueOf(Math.abs(r6.getTime() - this.f5696a.getTime()) / 1000.0d);     // Catch: Throwable -> L6
        long r1 = this.f5697b.getTime();     // Catch: Throwable -> L6
        if (r1 >= 0) goto L16;
        r1 = Math.abs(r1);     // Catch: Throwable -> L6
    L16:
        this.f5703h = Long.valueOf(r1);     // Catch: Throwable -> L6
    L17:
        r0.close();
        return;
    L10:
        this.f5697b = AbstractC1856a.m4067m();     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L21
    L23:
        throw th;
    L21:
        th = move-exception;
        th.addSuppressed(th);
        goto L23
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3664c(EnumC1577E2 r3, String r4, boolean r5, String r6) {
        C1981r r0 = this.f5710o.m4173a();
        boolean r1 = true;
        if (r3 != null) goto L32;
        boolean r32 = false;
    L8:
        if (r4 == null) goto L10;
        this.f5706k = r4;     // Catch: Throwable -> L5
        r32 = true;
    L10:
        if (r5 == false) goto L12;
        this.f5698c.addAndGet(1);     // Catch: Throwable -> L5
        r32 = true;
    L12:
        if (r6 == null) goto L14;
        this.f5709n = r6;     // Catch: Throwable -> L5
    L15:
        if (r1 == false) goto L28;
        this.f5701f = null;     // Catch: Throwable -> L5
        Date r33 = AbstractC1856a.m4067m();     // Catch: Throwable -> L5
        this.f5697b = r33;     // Catch: Throwable -> L5
        if (r33 == null) goto L28;
        long r34 = r33.getTime();     // Catch: Throwable -> L5
        if (r34 >= 0) goto L21;
        r34 = Math.abs(r34);     // Catch: Throwable -> L5
    L21:
        this.f5703h = Long.valueOf(r34);     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L25
    L27:
        throw th;
    L25:
        th = move-exception;
        th.addSuppressed(th);
    L28:
        r0.close();
        return r1;
    L14:
        r1 = r32;
        goto L15
    L32:
        this.f5702g = r3;     // Catch: Throwable -> L5
        r32 = true;
        goto L8
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m3662a();
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        String r0 = this.f5700e;
        if (r0 == null) goto L5;
        r42.m4106p("sid");
        r42.m4115z(r0);
    L5:
        String r02 = this.f5699d;
        if (r02 == null) goto L9;
        r42.m4106p("did");
        r42.m4115z(r02);
    L9:
        if (this.f5701f == null) goto L11;
        r42.m4106p("init");
        r42.m4113x(this.f5701f);
    L11:
        r42.m4106p("started");
        r42.m4112w(r5, this.f5696a);
        r42.m4106p("status");
        r42.m4112w(r5, this.f5702g.name().toLowerCase(Locale.ROOT));
        if (this.f5703h == null) goto L14;
        r42.m4106p("seq");
        r42.m4114y(this.f5703h);
    L14:
        r42.m4106p("errors");
        r42.m4111v(this.f5698c.intValue());
        if (this.f5704i == null) goto L18;
        r42.m4106p("duration");
        r42.m4114y(this.f5704i);
    L18:
        if (this.f5697b == null) goto L21;
        r42.m4106p("timestamp");
        r42.m4112w(r5, this.f5697b);
    L21:
        if (this.f5709n == null) goto L23;
        r42.m4106p("abnormal_mechanism");
        r42.m4112w(r5, this.f5709n);
    L23:
        r42.m4106p("attrs");
        r42.m4101h();
        r42.m4106p(BuildConfig.BUILD_TYPE);
        r42.m4112w(r5, this.f5708m);
        String r03 = this.f5707l;
        if (r03 == null) goto L26;
        r42.m4106p("environment");
        r42.m4112w(r5, r03);
    L26:
        String r04 = this.f5705j;
        if (r04 == null) goto L30;
        r42.m4106p("ip_address");
        r42.m4112w(r5, r04);
    L30:
        if (this.f5706k == null) goto L32;
        r42.m4106p("user_agent");
        r42.m4112w(r5, this.f5706k);
    L32:
        r42.m4102k();
        ConcurrentHashMap r05 = this.f5711p;
        if (r05 == null) goto L38;
        Iterator r06 = r05.keySet().iterator();
    L36:
        if (r06.hasNext() == false) goto L38;
        String r1 = (String) r06.next();
        AbstractC1861d.m4087b(this.f5711p, r1, r42, r1, r5);
    L38:
        r42.m4102k();
    }
}
