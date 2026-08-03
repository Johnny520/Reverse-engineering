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
    public float f6272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1734p f6273b;

    public C1732n(C1734p r1) {
        this.f6273b = r1;
        this.f6272a = 0.0f;
    }

    @Override // io.sentry.android.core.internal.util.InterfaceC1726n
    /* JADX INFO: renamed from: c */
    public final void mo3870c(long r3, long r5, long r7, long r9, boolean r11, boolean r12, float r13) {
        Date r32 = AbstractC1856a.m4067m();
        System.nanoTime();
        long r33 = r32.getTime() * 1000000;
        long r52 = r5 - System.nanoTime();
        long r92 = SystemClock.elapsedRealtimeNanos() + r52;
        C1734p r53 = this.f6273b;
        long r93 = r92 - r53.f6279a;
        if (r93 < 0) goto L14;
        if (r12 == false) goto L7;
        r53.f6288j.addLast(new C1943b(Long.valueOf(r93), Long.valueOf(r7), r33));
    L10:
        if (r13 == this.f6272a) goto L13;
        this.f6272a = r13;
        r53.f6286h.addLast(new C1943b(Long.valueOf(r93), Float.valueOf(r13), r33));
        return;
    L13:
        return;
    L7:
        if (r11 == false) goto L10;
        r53.f6287i.addLast(new C1943b(Long.valueOf(r93), Long.valueOf(r7), r33));
        goto L10
    }
}
