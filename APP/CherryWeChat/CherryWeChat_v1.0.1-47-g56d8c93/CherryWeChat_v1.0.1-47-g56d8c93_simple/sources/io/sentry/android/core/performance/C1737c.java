package io.sentry.android.core.performance;

/* JADX INFO: renamed from: io.sentry.android.core.performance.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1737c implements Comparable {

    /* JADX INFO: renamed from: a */
    public final C1741g f6299a;

    /* JADX INFO: renamed from: b */
    public final C1741g f6300b;

    public C1737c() {
        this.f6299a = new C1741g();
        this.f6300b = new C1741g();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r5) {
        C1737c r52 = (C1737c) r5;
        int r0 = Long.compare(this.f6299a.f6322c, r52.f6299a.f6322c);
        if (r0 == 0) goto L5;
        return r0;
    L5:
        return Long.compare(this.f6300b.f6322c, r52.f6300b.f6322c);
    }
}
