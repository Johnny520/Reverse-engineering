package io.sentry.cache.tape;

import p000.AbstractC0213Ey;

/* JADX INFO: renamed from: io.sentry.cache.tape.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1847f {

    /* JADX INFO: renamed from: c */
    public static final C1847f f6651c = null;

    /* JADX INFO: renamed from: a */
    public final long f6652a;

    /* JADX INFO: renamed from: b */
    public final int f6653b;

    static {
        f6651c = new C1847f(0, 0);
    }

    public C1847f(int r1, long r2) {
        this.f6652a = r2;
        this.f6653b = r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(C1847f.class.getSimpleName());
        r0.append("[position=");
        r0.append(this.f6652a);
        r0.append(", length=");
        return AbstractC0213Ey.m409g(r0, this.f6653b, "]");
    }
}
