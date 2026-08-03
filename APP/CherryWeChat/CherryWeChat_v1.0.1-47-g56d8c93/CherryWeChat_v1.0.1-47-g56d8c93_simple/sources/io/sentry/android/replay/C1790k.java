package io.sentry.android.replay;

import java.io.File;
import p000.AbstractC0585Nj;
import p000.AbstractC2374ph;

/* JADX INFO: renamed from: io.sentry.android.replay.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1790k {

    /* JADX INFO: renamed from: a */
    public final File f6508a;

    /* JADX INFO: renamed from: b */
    public final long f6509b;

    /* JADX INFO: renamed from: c */
    public final String f6510c;

    public C1790k(File r1, long r2, String r4) {
        this.f6508a = r1;
        this.f6509b = r2;
        this.f6510c = r4;
    }

    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C1790k) == true) goto L8;
        return false;
    L8:
        C1790k r82 = (C1790k) r8;
        if (AbstractC0585Nj.m1134a(this.f6508a, r82.f6508a) == true) goto L12;
        return false;
    L12:
        if (this.f6509b == r82.f6509b) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.f6510c, r82.f6510c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f6508a.hashCode() * 31;
        int r1 = (Long.hashCode(this.f6509b) + r0) * 31;
        String r02 = this.f6510c;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return r1 + r03;
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ReplayFrame(screenshot=");
        r0.append(this.f6508a);
        r0.append(", timestamp=");
        r0.append(this.f6509b);
        r0.append(", screen=");
        return AbstractC2374ph.m4815l(r0, this.f6510c, ')');
    }
}
