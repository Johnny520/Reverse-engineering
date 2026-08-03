package p050c0;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p042W0.AbstractC0431p;

/* JADX INFO: renamed from: c0.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0703v1 {

    /* JADX INFO: renamed from: a */
    public static volatile long f2211a;

    /* JADX INFO: renamed from: b */
    public static volatile C0709x1 f2212b = new C0709x1(false, 0.36f, "default", 0);

    static {
        Executors.newSingleThreadExecutor(new ThreadFactoryC0658g1(1));
        new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public static C0709x1 m1792a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f2211a < 1500) {
            return f2212b;
        }
        f2211a = jCurrentTimeMillis;
        C0661h1 c0661h1 = C0661h1.f2048a;
        boolean zM1661c = C0661h1.m1661c("round_avatar_enabled", false);
        Float fM1025z0 = AbstractC0431p.m1025z0(C0661h1.m1662d("round_avatar_radius", "0.36"));
        f2212b = new C0709x1(zM1661c, AbstractC0040p.m110o(fM1025z0 != null ? fM1025z0.floatValue() : 0.36f, 0.05f, 0.5f), "public", jCurrentTimeMillis);
        return f2212b;
    }
}
