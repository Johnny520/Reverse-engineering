package io.sentry;

import java.time.Instant;

/* JADX INFO: renamed from: io.sentry.W1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1644W1 extends AbstractC1588H1 {

    /* JADX INFO: renamed from: a */
    public final Instant f5889a;

    public C1644W1() {
        this.f5889a = Instant.now();
    }

    @Override // io.sentry.AbstractC1588H1
    /* JADX INFO: renamed from: d */
    public final long mo3672d() {
        Instant r0 = this.f5889a;
        return (r0.getEpochSecond() * 1000000000) + ((long) r0.getNano());
    }
}
