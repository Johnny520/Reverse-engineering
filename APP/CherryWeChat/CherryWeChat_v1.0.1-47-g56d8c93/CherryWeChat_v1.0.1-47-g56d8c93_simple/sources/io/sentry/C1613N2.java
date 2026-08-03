package io.sentry;

import com.youth.banner.BuildConfig;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.N2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1613N2 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final C1970t f5801a;

    /* JADX INFO: renamed from: b */
    public final String f5802b;

    /* JADX INFO: renamed from: c */
    public final String f5803c;

    /* JADX INFO: renamed from: d */
    public final String f5804d;

    /* JADX INFO: renamed from: e */
    public final String f5805e;

    /* JADX INFO: renamed from: f */
    public final String f5806f;

    /* JADX INFO: renamed from: g */
    public final String f5807g;

    /* JADX INFO: renamed from: h */
    public final String f5808h;

    /* JADX INFO: renamed from: i */
    public final String f5809i;

    /* JADX INFO: renamed from: j */
    public final C1970t f5810j;

    /* JADX INFO: renamed from: k */
    public ConcurrentHashMap f5811k;

    public C1613N2(C1970t r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, C1970t r9, String r10) {
        this.f5801a = r1;
        this.f5802b = r2;
        this.f5803c = r3;
        this.f5804d = r4;
        this.f5805e = r5;
        this.f5806f = r6;
        this.f5807g = r7;
        this.f5809i = r8;
        this.f5810j = r9;
        this.f5808h = r10;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("trace_id");
        r42.m4112w(r5, this.f5801a);
        r42.m4106p("public_key");
        r42.m4115z(this.f5802b);
        String r0 = this.f5803c;
        if (r0 == null) goto L5;
        r42.m4106p(BuildConfig.BUILD_TYPE);
        r42.m4115z(r0);
    L5:
        String r02 = this.f5804d;
        if (r02 == null) goto L8;
        r42.m4106p("environment");
        r42.m4115z(r02);
    L8:
        String r03 = this.f5805e;
        if (r03 == null) goto L11;
        r42.m4106p("user_id");
        r42.m4115z(r03);
    L11:
        String r04 = this.f5806f;
        if (r04 == null) goto L14;
        r42.m4106p("transaction");
        r42.m4115z(r04);
    L14:
        String r05 = this.f5807g;
        if (r05 == null) goto L17;
        r42.m4106p("sample_rate");
        r42.m4115z(r05);
    L17:
        String r06 = this.f5808h;
        if (r06 == null) goto L20;
        r42.m4106p("sample_rand");
        r42.m4115z(r06);
    L20:
        String r07 = this.f5809i;
        if (r07 == null) goto L23;
        r42.m4106p("sampled");
        r42.m4115z(r07);
    L23:
        C1970t r08 = this.f5810j;
        if (r08 == null) goto L26;
        r42.m4106p("replay_id");
        r42.m4112w(r5, r08);
    L26:
        ConcurrentHashMap r09 = this.f5811k;
        if (r09 == null) goto L32;
        Iterator r010 = r09.keySet().iterator();
    L30:
        if (r010.hasNext() == false) goto L32;
        String r1 = (String) r010.next();
        AbstractC1861d.m4087b(this.f5811k, r1, r42, r1, r5);
    L32:
        r42.m4102k();
    }
}
