package io.sentry.clientreport;

import io.sentry.config.AbstractC1856a;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.clientreport.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1852c {

    /* JADX INFO: renamed from: a */
    public final String f6673a;

    /* JADX INFO: renamed from: b */
    public final String f6674b;

    public C1852c(String str, String str2) {
        this.f6673a = str;
        this.f6674b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1852c)) {
            return false;
        }
        C1852c c1852c = (C1852c) obj;
        return AbstractC1856a.m4063i(this.f6673a, c1852c.f6673a) && AbstractC1856a.m4063i(this.f6674b, c1852c.f6674b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6673a, this.f6674b});
    }
}
