package io.sentry;

import io.sentry.config.AbstractC1856a;
import java.util.Date;

/* JADX INFO: renamed from: io.sentry.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1878g2 extends AbstractC1588H1 {

    /* JADX INFO: renamed from: a */
    public final Date f6725a;

    /* JADX INFO: renamed from: b */
    public final long f6726b;

    public C1878g2(Date date, long j) {
        this.f6725a = date;
        this.f6726b = j;
    }

    @Override // io.sentry.AbstractC1588H1, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(AbstractC1588H1 abstractC1588H1) {
        if (!(abstractC1588H1 instanceof C1878g2)) {
            return super.compareTo(abstractC1588H1);
        }
        C1878g2 c1878g2 = (C1878g2) abstractC1588H1;
        long time = this.f6725a.getTime();
        long time2 = c1878g2.f6725a.getTime();
        return time == time2 ? Long.valueOf(this.f6726b).compareTo(Long.valueOf(c1878g2.f6726b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.AbstractC1588H1
    /* JADX INFO: renamed from: b */
    public final long mo3670b(AbstractC1588H1 abstractC1588H1) {
        return abstractC1588H1 instanceof C1878g2 ? this.f6726b - ((C1878g2) abstractC1588H1).f6726b : super.mo3670b(abstractC1588H1);
    }

    @Override // io.sentry.AbstractC1588H1
    /* JADX INFO: renamed from: c */
    public final long mo3671c(AbstractC1588H1 abstractC1588H1) {
        if (abstractC1588H1 == null || !(abstractC1588H1 instanceof C1878g2)) {
            return super.mo3671c(abstractC1588H1);
        }
        C1878g2 c1878g2 = (C1878g2) abstractC1588H1;
        long j = c1878g2.f6726b;
        int iCompareTo = compareTo(abstractC1588H1);
        long j2 = this.f6726b;
        if (iCompareTo < 0) {
            return mo3672d() + (j - j2);
        }
        return c1878g2.mo3672d() + (j2 - j);
    }

    @Override // io.sentry.AbstractC1588H1
    /* JADX INFO: renamed from: d */
    public final long mo3672d() {
        return this.f6725a.getTime() * 1000000;
    }

    public C1878g2() {
        this(AbstractC1856a.m4067m(), System.nanoTime());
    }
}
