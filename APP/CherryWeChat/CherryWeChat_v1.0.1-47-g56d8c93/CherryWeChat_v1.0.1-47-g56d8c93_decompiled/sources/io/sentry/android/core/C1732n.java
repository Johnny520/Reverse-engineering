package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.android.core.internal.util.InterfaceC1726n;
import io.sentry.config.AbstractC1856a;
import io.sentry.profilemeasurements.C1943b;
import java.util.Date;

/* JADX INFO: renamed from: io.sentry.android.core.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1732n implements InterfaceC1726n {

    /* JADX INFO: renamed from: a */
    public float f6272a = 0.0f;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1734p f6273b;

    public C1732n(C1734p c1734p) {
        this.f6273b = c1734p;
    }

    @Override // io.sentry.android.core.internal.util.InterfaceC1726n
    /* JADX INFO: renamed from: c */
    public final void mo3870c(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
        Date dateM4067m = AbstractC1856a.m4067m();
        System.nanoTime();
        long time = dateM4067m.getTime() * 1000000;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j2 - System.nanoTime());
        C1734p c1734p = this.f6273b;
        long j5 = jElapsedRealtimeNanos - c1734p.f6279a;
        if (j5 < 0) {
            return;
        }
        if (z2) {
            c1734p.f6288j.addLast(new C1943b(Long.valueOf(j5), Long.valueOf(j3), time));
        } else if (z) {
            c1734p.f6287i.addLast(new C1943b(Long.valueOf(j5), Long.valueOf(j3), time));
        }
        if (f != this.f6272a) {
            this.f6272a = f;
            c1734p.f6286h.addLast(new C1943b(Long.valueOf(j5), Float.valueOf(f), time));
        }
    }
}
