package io.sentry;

/* JADX INFO: renamed from: io.sentry.H1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1588H1 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC1588H1 abstractC1588H1) {
        return Long.valueOf(mo3672d()).compareTo(Long.valueOf(abstractC1588H1.mo3672d()));
    }

    /* JADX INFO: renamed from: b */
    public long mo3670b(AbstractC1588H1 abstractC1588H1) {
        return mo3672d() - abstractC1588H1.mo3672d();
    }

    /* JADX INFO: renamed from: c */
    public long mo3671c(AbstractC1588H1 abstractC1588H1) {
        return (abstractC1588H1 == null || compareTo(abstractC1588H1) >= 0) ? mo3672d() : abstractC1588H1.mo3672d();
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo3672d();
}
