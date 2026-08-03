package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.protocol.EnumC1946C;
import io.sentry.util.C2029a;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C0174E1;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1832c {

    /* JADX INFO: renamed from: f */
    public static final C0174E1 f6617f = null;

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

    static {
        f6617f = new C0174E1(7);
    }

    public C1832c() {
        ConcurrentHashMap r0 = new ConcurrentHashMap();
        this.f6619b = new C2029a();
        this.f6618a = r0;
        this.f6620c = null;
        this.f6621d = null;
        this.f6622e = true;
    }

    /* JADX INFO: renamed from: a */
    public final String m3995a(String r2) {
        return (String) this.f6618a.get(r2);
    }

    /* JADX INFO: renamed from: b */
    public final void m3996b(String r2, String r3) {
        if (this.f6622e == false) goto L10;
        ConcurrentHashMap r0 = this.f6618a;
        if (r3 != null) goto L8;
        r0.remove(r2);
        return;
    L8:
        r0.put(r2, r3);
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m3997c(C1970t r2, C1970t r3, C2046v2 r4, C2648vx r5, String r6, EnumC1946C r7) {
        m3996b("sentry-trace_id", r2.toString());
        m3996b("sentry-public_key", r4.retrieveParsedDsn().f7295b);
        m3996b("sentry-release", r4.getRelease());
        m3996b("sentry-environment", r4.getEnvironment());
        Double r22 = null;
        if (r7 != null) goto L5;
    L7:
        r6 = null;
    L8:
        m3996b("sentry-transaction", r6);
        if (r3 != null) goto L11;
    L13:
        if (r5 != null) goto L15;
        Double r32 = null;
    L17:
        if (this.f6622e == false) goto L19;
        this.f6620c = r32;
    L19:
        if (r5 != null) goto L21;
        Boolean r33 = null;
    L22:
        if (r33 != null) goto L24;
        String r34 = null;
    L25:
        m3996b("sentry-sampled", r34);
        if (r5 == null) goto L30;
        r22 = (Double) r5.f9164c;
    L30:
        if (this.f6622e == false) goto L33;
        this.f6621d = r22;
        return;
    L33:
        return;
    L24:
        r34 = r33.toString();
        goto L25
    L21:
        r33 = (Boolean) r5.f9162a;
        goto L22
    L15:
        r32 = (Double) r5.f9163b;
        goto L17
    L11:
        if (C1970t.f7011b.equals(r3) == true) goto L13;
        m3996b("sentry-replay_id", r3.toString());
        goto L13
    L5:
        if (EnumC1946C.URL.equals(r7) == true) goto L7;
        goto L7
    }

    /* JADX INFO: renamed from: d */
    public final C1613N2 m3998d() {
        String r0 = m3995a("sentry-trace_id");
        String r1 = m3995a("sentry-replay_id");
        String r5 = m3995a("sentry-public_key");
        String r2 = null;
        if (r0 == null) goto L35;
        if (r5 == null) goto L35;
        C1970t r4 = new C1970t(r0);
        String r6 = m3995a("sentry-release");
        String r7 = m3995a("sentry-environment");
        String r8 = m3995a("sentry-user_id");
        String r9 = m3995a("sentry-transaction");
        Double r02 = this.f6620c;
        boolean r11 = AbstractC1856a.m4077y(r02, false);
        C0174E1 r12 = f6617f;
        if (r11 == true) goto L8;
        String r03 = null;
    L9:
        String r112 = m3995a("sentry-sampled");
        if (r1 != null) goto L12;
        C1970t r13 = null;
    L13:
        Double r14 = this.f6621d;
        if (AbstractC1856a.m4077y(r14, false) == false) goto L17;
        r2 = ((DecimalFormat) r12.get()).format(r14);
    L17:
        C1613N2 r3 = new C1613N2(r4, r5, r6, r7, r8, r9, r03, r112, r13, r2);
        ConcurrentHashMap r04 = new ConcurrentHashMap();
        C1981r r15 = this.f6619b.m4173a();
        Iterator r22 = this.f6618a.entrySet().iterator();     // Catch: Throwable -> L26
    L19:
        if (r22.hasNext() == false) goto L28;
        Map.Entry r42 = (Map.Entry) r22.next();     // Catch: Throwable -> L26
        String r52 = (String) r42.getKey();     // Catch: Throwable -> L26
        String r43 = (String) r42.getValue();     // Catch: Throwable -> L26
        if (AbstractC1825b.f6600a.contains(r52) == true) goto L19;
        if (r43 == null) goto L19;
        r04.put(r52.replaceFirst("sentry-", ""), r43);     // Catch: Throwable -> L26
        goto L19
    L28:
        r15.close();
        r3.f5811k = r04;
        return r3;
    L26:
        th = move-exception;
        r15.close();     // Catch: Throwable -> L32
        throw th;
    L32:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L12:
        r13 = new C1970t(r1);
        goto L13
    L8:
        r03 = ((DecimalFormat) r12.get()).format(r02);
    L35:
        return null;
    }
}
