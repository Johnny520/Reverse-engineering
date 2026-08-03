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

    public C1697g0(Integer num, Boolean bool) {
        this.f6143a = num;
        this.f6144b = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1697g0)) {
            return false;
        }
        C1697g0 c1697g0 = (C1697g0) obj;
        return AbstractC1856a.m4063i(this.f6143a, c1697g0.f6143a) && AbstractC1856a.m4063i(this.f6144b, c1697g0.f6144b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6143a, this.f6144b});
    }
}
