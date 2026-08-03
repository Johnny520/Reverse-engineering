package io.sentry.android.core;

import io.sentry.config.AbstractC1856a;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.android.core.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1697g0 {

    /* JADX INFO: renamed from: a */
    public final Integer f6143a;

    /* JADX INFO: renamed from: b */
    public final Boolean f6144b;

    public C1697g0(Integer r1, Boolean r2) {
        this.f6143a = r1;
        this.f6144b = r2;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C1697g0) == true) goto L5;
        return false;
    L5:
        C1697g0 r42 = (C1697g0) r4;
        if (AbstractC1856a.m4063i(this.f6143a, r42.f6143a) == true) goto L8;
    L11:
        return false;
    L8:
        if (AbstractC1856a.m4063i(this.f6144b, r42.f6144b) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6143a, this.f6144b});
    }
}
