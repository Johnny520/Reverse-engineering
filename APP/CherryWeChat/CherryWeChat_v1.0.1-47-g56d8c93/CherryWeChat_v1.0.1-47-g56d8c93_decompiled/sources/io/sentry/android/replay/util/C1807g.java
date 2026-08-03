package io.sentry.android.replay.util;

import android.os.Build;
import p000.C0232Fa;

/* JADX INFO: renamed from: io.sentry.android.replay.util.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1807g {
    /* JADX INFO: renamed from: a */
    public static String m3978a(EnumC1805e enumC1805e) {
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i = AbstractC1806f.f6538a[enumC1805e.ordinal()];
        if (i == 1) {
            return Build.SOC_MODEL;
        }
        if (i == 2) {
            return Build.SOC_MANUFACTURER;
        }
        throw new C0232Fa();
    }
}
