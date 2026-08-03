package io.sentry;

import com.youth.banner.BuildConfig;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.C2029a;
import java.io.IOException;
import java.util.Date;
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
    public final C2029a f5710o = new C2029a();

    /* JADX INFO: renamed from: p */
    public ConcurrentHashMap f5711p;

    public C1581F2(EnumC1577E2 enumC1577E2, Date date, Date date2, int i, String str, String str2, Boolean bool, Long l, Double d, String str3, String str4, String str5, String str6, String str7) {
        this.f5702g = enumC1577E2;
        this.f5696a = date;
        this.f5697b = date2;
        this.f5698c = new AtomicInteger(i);
        this.f5699d = str;
        this.f5700e = str2;
        this.f5701f = bool;
        this.f5703h = l;
        this.f5704i = d;
        this.f5705j = str3;
        this.f5706k = str4;
        this.f5707l = str5;
        this.f5708m = str6;
        this.f5709n = str7;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1581F2 clone() {
        return new C1581F2(this.f5702g, this.f5696a, this.f5697b, this.f5698c.get(), this.f5699d, this.f5700e, this.f5701f, this.f5703h, this.f5704i, this.f5705j, this.f5706k, this.f5707l, this.f5708m, this.f5709n);
    }

    /* JADX INFO: renamed from: b */
    public final void m3663b(Date date) {
        C1981r c1981rM4173a = this.f5710o.m4173a();
        try {
            this.f5701f = null;
            if (this.f5702g == EnumC1577E2.Ok) {
                this.f5702g = EnumC1577E2.Exited;
            }
            if (date != null) {
                this.f5697b = date;
            } else {
                this.f5697b = AbstractC1856a.m4067m();
            }
            if (this.f5697b != null) {
                this.f5704i = Double.valueOf(Math.abs(r6.getTime() - this.f5696a.getTime()) / 1000.0d);
                long time = this.f5697b.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.f5703h = Long.valueOf(time);
            }
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3664c(EnumC1577E2 enumC1577E2, String str, boolean z, String str2) {
        boolean z2;
        C1981r c1981rM4173a = this.f5710o.m4173a();
        boolean z3 = true;
        if (enumC1577E2 != null) {
            try {
                this.f5702g = enumC1577E2;
                z2 = true;
            } catch (Throwable th) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            z2 = false;
        }
        if (str != null) {
            this.f5706k = str;
            z2 = true;
        }
        if (z) {
            this.f5698c.addAndGet(1);
            z2 = true;
        }
        if (str2 != null) {
            this.f5709n = str2;
        } else {
            z3 = z2;
        }
        if (z3) {
            this.f5701f = null;
            Date dateM4067m = AbstractC1856a.m4067m();
            this.f5697b = dateM4067m;
            if (dateM4067m != null) {
                long time = dateM4067m.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.f5703h = Long.valueOf(time);
            }
        }
        c1981rM4173a.close();
        return z3;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        String str = this.f5700e;
        if (str != null) {
            c1901c.m4106p("sid");
            c1901c.m4115z(str);
        }
        String str2 = this.f5699d;
        if (str2 != null) {
            c1901c.m4106p("did");
            c1901c.m4115z(str2);
        }
        if (this.f5701f != null) {
            c1901c.m4106p("init");
            c1901c.m4113x(this.f5701f);
        }
        c1901c.m4106p("started");
        c1901c.m4112w(iLogger, this.f5696a);
        c1901c.m4106p("status");
        c1901c.m4112w(iLogger, this.f5702g.name().toLowerCase(Locale.ROOT));
        if (this.f5703h != null) {
            c1901c.m4106p("seq");
            c1901c.m4114y(this.f5703h);
        }
        c1901c.m4106p("errors");
        c1901c.m4111v(this.f5698c.intValue());
        if (this.f5704i != null) {
            c1901c.m4106p("duration");
            c1901c.m4114y(this.f5704i);
        }
        if (this.f5697b != null) {
            c1901c.m4106p("timestamp");
            c1901c.m4112w(iLogger, this.f5697b);
        }
        if (this.f5709n != null) {
            c1901c.m4106p("abnormal_mechanism");
            c1901c.m4112w(iLogger, this.f5709n);
        }
        c1901c.m4106p("attrs");
        c1901c.m4101h();
        c1901c.m4106p(BuildConfig.BUILD_TYPE);
        c1901c.m4112w(iLogger, this.f5708m);
        String str3 = this.f5707l;
        if (str3 != null) {
            c1901c.m4106p("environment");
            c1901c.m4112w(iLogger, str3);
        }
        String str4 = this.f5705j;
        if (str4 != null) {
            c1901c.m4106p("ip_address");
            c1901c.m4112w(iLogger, str4);
        }
        if (this.f5706k != null) {
            c1901c.m4106p("user_agent");
            c1901c.m4112w(iLogger, this.f5706k);
        }
        c1901c.m4102k();
        ConcurrentHashMap concurrentHashMap = this.f5711p;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f5711p, str5, c1901c, str5, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
