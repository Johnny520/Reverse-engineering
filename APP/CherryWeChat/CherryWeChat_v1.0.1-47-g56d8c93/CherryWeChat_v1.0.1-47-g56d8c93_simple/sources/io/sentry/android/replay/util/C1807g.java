package io.sentry.android.replay.util;

import android.os.Build;
import io.sentry.android.core.AbstractC1668K;
import p000.C0232Fa;

/* JADX INFO: renamed from: io.sentry.android.replay.util.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1807g {
    static {
    }

    /* JADX INFO: renamed from: a */
    public static String m3978a(EnumC1805e r2) {
        if (Build.VERSION.SDK_INT < 31) goto L14;
        int r22 = AbstractC1806f.f6538a[r2.ordinal()];
        if (r22 == 1) goto L13;
        if (r22 != 2) goto L11;
        return AbstractC1668K.m3839a();
    L11:
        throw new C0232Fa();
    L13:
        return AbstractC1668K.m3840b();
    L14:
        return "";
    }
}
