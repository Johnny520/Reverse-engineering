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

    public C1852c(String r1, String r2) {
        this.f6673a = r1;
        this.f6674b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1852c) == true) goto L8;
        return false;
    L8:
        C1852c r52 = (C1852c) r5;
        if (AbstractC1856a.m4063i(this.f6673a, r52.f6673a) == true) goto L11;
    L13:
        return false;
    L11:
        if (AbstractC1856a.m4063i(this.f6674b, r52.f6674b) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6673a, this.f6674b});
    }
}
