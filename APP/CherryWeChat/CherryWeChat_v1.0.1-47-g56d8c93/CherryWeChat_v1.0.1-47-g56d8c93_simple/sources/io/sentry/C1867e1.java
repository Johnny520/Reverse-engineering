package io.sentry;

import com.youth.banner.BuildConfig;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import io.sentry.vendor.gson.stream.C2051c;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1867e1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public C1954d f6691a;

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

    /* JADX INFO: renamed from: l */
    public String f6702l;

    /* JADX INFO: renamed from: m */
    public ConcurrentHashMap f6703m;

    public C1867e1(C1970t r2, C1970t r3, File r4, Map r5, Double r6, C2046v2 r7) {
        this.f6702l = null;
        this.f6692b = r2;
        this.f6693c = r3;
        this.f6701k = r4;
        this.f6695e = r5;
        this.f6691a = null;
        this.f6694d = r7.getSdkVersion();
        if (r7.getRelease() == null) goto L5;
        String r22 = r7.getRelease();
    L6:
        this.f6697g = r22;
        this.f6698h = r7.getEnvironment();
        this.f6696f = "android";
        this.f6699i = "2";
        this.f6700j = r6.doubleValue();
        return;
    L5:
        r22 = "";
        goto L6
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof C1867e1) == false) goto L44;
        C1867e1 r32 = (C1867e1) r3;
        if (Objects.equals(this.f6691a, r32.f6691a) == true) goto L10;
        return false;
    L10:
        if (Objects.equals(this.f6692b, r32.f6692b) == true) goto L12;
        return false;
    L12:
        if (Objects.equals(this.f6693c, r32.f6693c) == true) goto L14;
        return false;
    L14:
        if (Objects.equals(this.f6694d, r32.f6694d) == true) goto L16;
        return false;
    L16:
        if (Objects.equals(this.f6695e, r32.f6695e) == true) goto L18;
        return false;
    L18:
        if (Objects.equals(this.f6696f, r32.f6696f) == true) goto L20;
        return false;
    L20:
        if (Objects.equals(this.f6697g, r32.f6697g) == true) goto L22;
        return false;
    L22:
        if (Objects.equals(this.f6698h, r32.f6698h) == true) goto L24;
        return false;
    L24:
        if (Objects.equals(this.f6699i, r32.f6699i) == true) goto L26;
        return false;
    L26:
        if (Objects.equals(this.f6702l, r32.f6702l) == true) goto L28;
        return false;
    L28:
        if (Objects.equals(this.f6703m, r32.f6703m) == false) goto L43;
        return true;
    L43:
        return false;
    L44:
        return false;
    }

    public final int hashCode() {
        C1954d r0 = this.f6691a;
        C1970t r1 = this.f6692b;
        C1970t r2 = this.f6693c;
        C1968r r3 = this.f6694d;
        String r5 = this.f6696f;
        String r6 = this.f6697g;
        String r7 = this.f6698h;
        String r8 = this.f6699i;
        String r9 = this.f6702l;
        ConcurrentHashMap r10 = this.f6703m;
        return Objects.hash(new Object[]{r0, r1, r2, r3, this.f6695e, r5, r6, r7, r8, r9, r10});
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        if (this.f6691a == null) goto L5;
        r42.m4106p("debug_meta");
        r42.m4112w(r5, this.f6691a);
    L5:
        r42.m4106p("profiler_id");
        r42.m4112w(r5, this.f6692b);
        r42.m4106p("chunk_id");
        r42.m4112w(r5, this.f6693c);
        if (this.f6694d == null) goto L8;
        r42.m4106p("client_sdk");
        r42.m4112w(r5, this.f6694d);
    L8:
        Map r0 = this.f6695e;
        if (r0.isEmpty() == true) goto L11;
        String r1 = ((C2051c) r42.f6781b).f7266d;
        r42.m4109t("");
        r42.m4106p("measurements");
        r42.m4112w(r5, r0);
        r42.m4109t(r1);
    L11:
        r42.m4106p("platform");
        r42.m4112w(r5, this.f6696f);
        r42.m4106p(BuildConfig.BUILD_TYPE);
        r42.m4112w(r5, this.f6697g);
        if (this.f6698h == null) goto L14;
        r42.m4106p("environment");
        r42.m4112w(r5, this.f6698h);
    L14:
        r42.m4106p("version");
        r42.m4112w(r5, this.f6699i);
        if (this.f6702l == null) goto L17;
        r42.m4106p("sampled_profile");
        r42.m4112w(r5, this.f6702l);
    L17:
        r42.m4106p("timestamp");
        r42.m4112w(r5, Double.valueOf(this.f6700j));
        ConcurrentHashMap r02 = this.f6703m;
        if (r02 == null) goto L23;
        Iterator r03 = r02.keySet().iterator();
    L21:
        if (r03.hasNext() == false) goto L23;
        String r12 = (String) r03.next();
        AbstractC1861d.m4087b(this.f6703m, r12, r42, r12, r5);
    L23:
        r42.m4102k();
    }
}
