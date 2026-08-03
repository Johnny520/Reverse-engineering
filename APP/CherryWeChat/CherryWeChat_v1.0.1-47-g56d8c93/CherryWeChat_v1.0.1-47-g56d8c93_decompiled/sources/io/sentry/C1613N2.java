package io.sentry;

import com.youth.banner.BuildConfig;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
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

    public C1613N2(C1970t c1970t, String str, String str2, String str3, String str4, String str5, String str6, String str7, C1970t c1970t2, String str8) {
        this.f5801a = c1970t;
        this.f5802b = str;
        this.f5803c = str2;
        this.f5804d = str3;
        this.f5805e = str4;
        this.f5806f = str5;
        this.f5807g = str6;
        this.f5809i = str7;
        this.f5810j = c1970t2;
        this.f5808h = str8;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("trace_id");
        c1901c.m4112w(iLogger, this.f5801a);
        c1901c.m4106p("public_key");
        c1901c.m4115z(this.f5802b);
        String str = this.f5803c;
        if (str != null) {
            c1901c.m4106p(BuildConfig.BUILD_TYPE);
            c1901c.m4115z(str);
        }
        String str2 = this.f5804d;
        if (str2 != null) {
            c1901c.m4106p("environment");
            c1901c.m4115z(str2);
        }
        String str3 = this.f5805e;
        if (str3 != null) {
            c1901c.m4106p("user_id");
            c1901c.m4115z(str3);
        }
        String str4 = this.f5806f;
        if (str4 != null) {
            c1901c.m4106p("transaction");
            c1901c.m4115z(str4);
        }
        String str5 = this.f5807g;
        if (str5 != null) {
            c1901c.m4106p("sample_rate");
            c1901c.m4115z(str5);
        }
        String str6 = this.f5808h;
        if (str6 != null) {
            c1901c.m4106p("sample_rand");
            c1901c.m4115z(str6);
        }
        String str7 = this.f5809i;
        if (str7 != null) {
            c1901c.m4106p("sampled");
            c1901c.m4115z(str7);
        }
        C1970t c1970t = this.f5810j;
        if (c1970t != null) {
            c1901c.m4106p("replay_id");
            c1901c.m4112w(iLogger, c1970t);
        }
        ConcurrentHashMap concurrentHashMap = this.f5811k;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f5811k, str8, c1901c, str8, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
