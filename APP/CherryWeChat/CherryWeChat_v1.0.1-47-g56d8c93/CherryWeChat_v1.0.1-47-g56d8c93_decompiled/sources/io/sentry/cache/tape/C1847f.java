package io.sentry.cache.tape;

import p000.AbstractC0213Ey;

/* JADX INFO: renamed from: io.sentry.cache.tape.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1847f {

    /* JADX INFO: renamed from: c */
    public static final C1847f f6651c = new C1847f(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f6652a;

    /* JADX INFO: renamed from: b */
    public final int f6653b;

    public C1847f(int i, long j) {
        this.f6652a = j;
        this.f6653b = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1847f.class.getSimpleName());
        sb.append("[position=");
        sb.append(this.f6652a);
        sb.append(", length=");
        return AbstractC0213Ey.m409g(sb, this.f6653b, "]");
    }
}
