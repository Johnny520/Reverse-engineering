package io.sentry;

/* JADX INFO: renamed from: io.sentry.H1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1588H1 implements Comparable {
    /* JADX INFO: renamed from: a */
    public int mo3669a(AbstractC1588H1 r4) {
        return Long.valueOf(mo3672d()).compareTo(Long.valueOf(r4.mo3672d()));
    }

    /* JADX INFO: renamed from: b */
    public long mo3670b(AbstractC1588H1 r5) {
        return mo3672d() - r5.mo3672d();
    }

    /* JADX INFO: renamed from: c */
    public long mo3671c(AbstractC1588H1 r3) {
        if (r3 == null) goto L8;
        if (mo3669a(r3) >= 0) goto L8;
        return r3.mo3672d();
    L8:
        return mo3672d();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return mo3669a((AbstractC1588H1) r1);
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo3672d();
}
