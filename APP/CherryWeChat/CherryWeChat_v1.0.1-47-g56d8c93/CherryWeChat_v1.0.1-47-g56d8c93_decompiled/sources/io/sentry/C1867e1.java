package io.sentry;

import com.youth.banner.BuildConfig;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import io.sentry.vendor.gson.stream.C2051c;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1867e1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: b */
    public C1970t f6692b;

    /* JADX INFO: renamed from: c */
    public C1970t f6693c;

    /* JADX INFO: renamed from: d */
    public C1968r f6694d;

    /* JADX INFO: renamed from: e */
    public final Map f6695e;

    /* JADX INFO: renamed from: f */
    public String f6696f;

    /* JADX INFO: renamed from: g */
    public String f6697g;

    /* JADX INFO: renamed from: h */
    public String f6698h;

    /* JADX INFO: renamed from: i */
    public String f6699i;

    /* JADX INFO: renamed from: j */
    public double f6700j;

    /* JADX INFO: renamed from: k */
    public final File f6701k;

    /* JADX INFO: renamed from: m */
    public ConcurrentHashMap f6703m;

    /* JADX INFO: renamed from: l */
    public String f6702l = null;

    /* JADX INFO: renamed from: a */
    public C1954d f6691a = null;

    public C1867e1(C1970t c1970t, C1970t c1970t2, File file, Map map, Double d, C2046v2 c2046v2) {
        this.f6692b = c1970t;
        this.f6693c = c1970t2;
        this.f6701k = file;
        this.f6695e = map;
        this.f6694d = c2046v2.getSdkVersion();
        this.f6697g = c2046v2.getRelease() != null ? c2046v2.getRelease() : "";
        this.f6698h = c2046v2.getEnvironment();
        this.f6696f = "android";
        this.f6699i = "2";
        this.f6700j = d.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1867e1)) {
            return false;
        }
        C1867e1 c1867e1 = (C1867e1) obj;
        return Objects.equals(this.f6691a, c1867e1.f6691a) && Objects.equals(this.f6692b, c1867e1.f6692b) && Objects.equals(this.f6693c, c1867e1.f6693c) && Objects.equals(this.f6694d, c1867e1.f6694d) && Objects.equals(this.f6695e, c1867e1.f6695e) && Objects.equals(this.f6696f, c1867e1.f6696f) && Objects.equals(this.f6697g, c1867e1.f6697g) && Objects.equals(this.f6698h, c1867e1.f6698h) && Objects.equals(this.f6699i, c1867e1.f6699i) && Objects.equals(this.f6702l, c1867e1.f6702l) && Objects.equals(this.f6703m, c1867e1.f6703m);
    }

    public final int hashCode() {
        return Objects.hash(this.f6691a, this.f6692b, this.f6693c, this.f6694d, this.f6695e, this.f6696f, this.f6697g, this.f6698h, this.f6699i, this.f6702l, this.f6703m);
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        if (this.f6691a != null) {
            c1901c.m4106p("debug_meta");
            c1901c.m4112w(iLogger, this.f6691a);
        }
        c1901c.m4106p("profiler_id");
        c1901c.m4112w(iLogger, this.f6692b);
        c1901c.m4106p("chunk_id");
        c1901c.m4112w(iLogger, this.f6693c);
        if (this.f6694d != null) {
            c1901c.m4106p("client_sdk");
            c1901c.m4112w(iLogger, this.f6694d);
        }
        Map map = this.f6695e;
        if (!map.isEmpty()) {
            String str = ((C2051c) c1901c.f6781b).f7266d;
            c1901c.m4109t("");
            c1901c.m4106p("measurements");
            c1901c.m4112w(iLogger, map);
            c1901c.m4109t(str);
        }
        c1901c.m4106p("platform");
        c1901c.m4112w(iLogger, this.f6696f);
        c1901c.m4106p(BuildConfig.BUILD_TYPE);
        c1901c.m4112w(iLogger, this.f6697g);
        if (this.f6698h != null) {
            c1901c.m4106p("environment");
            c1901c.m4112w(iLogger, this.f6698h);
        }
        c1901c.m4106p("version");
        c1901c.m4112w(iLogger, this.f6699i);
        if (this.f6702l != null) {
            c1901c.m4106p("sampled_profile");
            c1901c.m4112w(iLogger, this.f6702l);
        }
        c1901c.m4106p("timestamp");
        c1901c.m4112w(iLogger, Double.valueOf(this.f6700j));
        ConcurrentHashMap concurrentHashMap = this.f6703m;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f6703m, str2, c1901c, str2, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
