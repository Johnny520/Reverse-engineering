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

    public C1790k(File file, long j, String str) {
        this.f6508a = file;
        this.f6509b = j;
        this.f6510c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1790k)) {
            return false;
        }
        C1790k c1790k = (C1790k) obj;
        return AbstractC0585Nj.m1134a(this.f6508a, c1790k.f6508a) && this.f6509b == c1790k.f6509b && AbstractC0585Nj.m1134a(this.f6510c, c1790k.f6510c);
    }

    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.f6509b) + (this.f6508a.hashCode() * 31)) * 31;
        String str = this.f6510c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplayFrame(screenshot=");
        sb.append(this.f6508a);
        sb.append(", timestamp=");
        sb.append(this.f6509b);
        sb.append(", screen=");
        return AbstractC2374ph.m4815l(sb, this.f6510c, ')');
    }
}
