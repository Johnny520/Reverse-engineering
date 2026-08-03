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

    public C1878g2(Date r1, long r2) {
        this.f6725a = r1;
        this.f6726b = r2;
    }

    @Override // io.sentry.AbstractC1588H1
    /* JADX INFO: renamed from: a */
    public final int mo3669a(AbstractC1588H1 r6) {
        if ((r6 instanceof C1878g2) == false) goto L11;
        C1878g2 r62 = (C1878g2) r6;
        long r0 = this.f6725a.getTime();
        long r2 = r62.f6725a.getTime();
        if (r0 != r2) goto L9;
        return Long.valueOf(this.f6726b).compareTo(Long.valueOf(r62.f6726b));
    L9:
        return Long.valueOf(r0).compareTo(Long.valueOf(r2));
    L11:
        return super.mo3669a(r6);
    }

    @Override // io.sentry.AbstractC1588H1
    /* JADX INFO: renamed from: b */
    public final long mo3670b(AbstractC1588H1 r5) {
        if ((r5 instanceof C1878g2) == false) goto L7;
        return this.f6726b - ((C1878g2) r5).f6726b;
    L7:
        return super.mo3670b(r5);
    }

    @Override // io.sentry.AbstractC1588H1
    /* JADX INFO: renamed from: c */
    public final long mo3671c(AbstractC1588H1 r6) {
        if (r6 == null) goto L12;
        if ((r6 instanceof C1878g2) == false) goto L12;
        C1878g2 r0 = (C1878g2) r6;
        long r1 = r0.f6726b;
        int r62 = mo3669a(r6);
        long r3 = this.f6726b;
        if (r62 >= 0) goto L9;
        long r12 = r1 - r3;
        return mo3672d() + r12;
    L9:
        long r02 = r0.mo3672d();
        return r02 + (r3 - r1);
    L12:
        return super.mo3671c(r6);
    }

    @Override // io.sentry.AbstractC1588H1, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return mo3669a((AbstractC1588H1) r1);
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
