package com.abc.core.features;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p042W0.AbstractC0431p;

/* JADX INFO: renamed from: c0.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class RoundAvatarHook {

    /* JADX INFO: renamed from: a */
    public static volatile long f2211a;

    /* JADX INFO: renamed from: b */
    public static volatile C0709x1 f2212b;

    static {
        f2212b = new C0709x1(false, 0.36f, "default", 0);
        Executors.newSingleThreadExecutor(new ThreadFactoryC0658g1(1));
        new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public static C0709x1 m1792a() {
        long r4 = System.currentTimeMillis();
        if ((r4 - f2211a) < 1500) goto L11;
        f2211a = r4;
        ConfigStore r02 = ConfigStore.f2048a;
        boolean r1 = ConfigStore.m1661c("round_avatar_enabled", false);
        Float r03 = AbstractC0431p.m1025z0(ConfigStore.m1662d("round_avatar_radius", "0.36"));
        if (r03 == null) goto L8;
        float r04 = r03.floatValue();
    L9:
        f2212b = new C0709x1(r1, AbstractC0040p.m110o(r04, 0.05f, 0.5f), "public", r4);
        return f2212b;
    L8:
        r04 = 0.36f;
        goto L9
    L11:
        return f2212b;
    }
}
