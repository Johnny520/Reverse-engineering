package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.protocol.EnumC1946C;
import io.sentry.util.C2029a;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C0174E1;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1832c {

    /* JADX INFO: renamed from: f */
    public static final C0174E1 f6617f = new C0174E1(7);

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f6618a;

    /* JADX INFO: renamed from: b */
    public final C2029a f6619b;

    /* JADX INFO: renamed from: c */
    public Double f6620c;

    /* JADX INFO: renamed from: d */
    public Double f6621d;

    /* JADX INFO: renamed from: e */
    public boolean f6622e;

    public C1832c() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f6619b = new C2029a();
        this.f6618a = concurrentHashMap;
        this.f6620c = null;
        this.f6621d = null;
        this.f6622e = true;
    }

    /* JADX INFO: renamed from: a */
    public final String m3995a(String str) {
        return (String) this.f6618a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m3996b(String str, String str2) {
        if (this.f6622e) {
            ConcurrentHashMap concurrentHashMap = this.f6618a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3997c(C1970t c1970t, C1970t c1970t2, C2046v2 c2046v2, C2648vx c2648vx, String str, EnumC1946C enumC1946C) {
        m3996b("sentry-trace_id", c1970t.toString());
        m3996b("sentry-public_key", c2046v2.retrieveParsedDsn().f7295b);
        m3996b("sentry-release", c2046v2.getRelease());
        m3996b("sentry-environment", c2046v2.getEnvironment());
        if (enumC1946C == null || EnumC1946C.URL.equals(enumC1946C)) {
            str = null;
        }
        m3996b("sentry-transaction", str);
        if (c1970t2 != null && !C1970t.f7011b.equals(c1970t2)) {
            m3996b("sentry-replay_id", c1970t2.toString());
        }
        Double d = c2648vx == null ? null : (Double) c2648vx.f9163b;
        if (this.f6622e) {
            this.f6620c = d;
        }
        Boolean bool = c2648vx == null ? null : (Boolean) c2648vx.f9162a;
        m3996b("sentry-sampled", bool == null ? null : bool.toString());
        Double d2 = c2648vx != null ? (Double) c2648vx.f9164c : null;
        if (this.f6622e) {
            this.f6621d = d2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C1613N2 m3998d() {
        String strM3995a = m3995a("sentry-trace_id");
        String strM3995a2 = m3995a("sentry-replay_id");
        String strM3995a3 = m3995a("sentry-public_key");
        if (strM3995a == null || strM3995a3 == null) {
            return null;
        }
        C1970t c1970t = new C1970t(strM3995a);
        String strM3995a4 = m3995a("sentry-release");
        String strM3995a5 = m3995a("sentry-environment");
        String strM3995a6 = m3995a("sentry-user_id");
        String strM3995a7 = m3995a("sentry-transaction");
        Double d = this.f6620c;
        boolean zM4077y = AbstractC1856a.m4077y(d, false);
        C0174E1 c0174e1 = f6617f;
        String str = !zM4077y ? null : ((DecimalFormat) c0174e1.get()).format(d);
        String strM3995a8 = m3995a("sentry-sampled");
        C1970t c1970t2 = strM3995a2 == null ? null : new C1970t(strM3995a2);
        Double d2 = this.f6621d;
        C1613N2 c1613n2 = new C1613N2(c1970t, strM3995a3, strM3995a4, strM3995a5, strM3995a6, strM3995a7, str, strM3995a8, c1970t2, AbstractC1856a.m4077y(d2, false) ? ((DecimalFormat) c0174e1.get()).format(d2) : null);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C1981r c1981rM4173a = this.f6619b.m4173a();
        try {
            for (Map.Entry entry : this.f6618a.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!AbstractC1825b.f6600a.contains(str2) && str3 != null) {
                    concurrentHashMap.put(str2.replaceFirst("sentry-", ""), str3);
                }
            }
            c1981rM4173a.close();
            c1613n2.f5811k = concurrentHashMap;
            return c1613n2;
        } finally {
        }
    }
}
