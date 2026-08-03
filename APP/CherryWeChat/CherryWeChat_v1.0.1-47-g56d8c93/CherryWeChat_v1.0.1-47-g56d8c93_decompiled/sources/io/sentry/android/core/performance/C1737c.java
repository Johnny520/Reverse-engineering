package io.sentry.android.core.performance;

/* JADX INFO: renamed from: io.sentry.android.core.performance.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1737c implements Comparable {

    /* JADX INFO: renamed from: a */
    public final C1741g f6299a = new C1741g();

    /* JADX INFO: renamed from: b */
    public final C1741g f6300b = new C1741g();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1737c c1737c = (C1737c) obj;
        int iCompare = Long.compare(this.f6299a.f6322c, c1737c.f6299a.f6322c);
        return iCompare == 0 ? Long.compare(this.f6300b.f6322c, c1737c.f6300b.f6322c) : iCompare;
    }
}
