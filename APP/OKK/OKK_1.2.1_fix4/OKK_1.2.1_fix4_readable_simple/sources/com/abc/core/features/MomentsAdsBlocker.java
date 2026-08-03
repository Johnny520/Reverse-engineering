package com.abc.core.features;

import de.robv.android.xposed.AbstractC0762d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p007D0.C0140f;

/* JADX INFO: renamed from: c0.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class MomentsAdsBlocker {

    /* JADX INFO: renamed from: a */
    public static final MomentsAdsBlocker f2016a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2017b = null;

    /* JADX INFO: renamed from: c */
    public static final AtomicInteger f2018c = null;

    static {
        f2016a = new MomentsAdsBlocker();
        f2017b = new AtomicBoolean(false);
        f2018c = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1630a() {
        ConfigStore r02 = ConfigStore.f2048a;     // Catch: Throwable -> L4
        Object r03 = Boolean.valueOf(ConfigStore.m1661c("remove_moments_ads", false));     // Catch: Throwable -> L4
    L6:
        Object r1 = Boolean.FALSE;
        if ((r03 instanceof C0140f) == false) goto L10;
        r03 = r1;
    L10:
        return ((Boolean) r03).booleanValue();
    L4:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public static void m1631b(String r2) {
        AbstractC0762d.m1954d("[OKK-MomentsAd] " + r2);     // Catch: Throwable -> L5
        return;
    }
}
