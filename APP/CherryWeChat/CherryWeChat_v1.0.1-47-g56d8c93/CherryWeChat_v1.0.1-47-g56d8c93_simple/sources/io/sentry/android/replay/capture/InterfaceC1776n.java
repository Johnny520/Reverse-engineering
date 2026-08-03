package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.EnumC2055w2;
import io.sentry.android.replay.C1793n;
import io.sentry.android.replay.C1821w;
import io.sentry.protocol.C1970t;
import p000.C1514ht;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.n */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1776n {
    /* JADX INFO: renamed from: a */
    void mo3952a(MotionEvent r1);

    /* JADX INFO: renamed from: b */
    void mo3959b(boolean r1, C1514ht r2);

    /* JADX INFO: renamed from: c */
    void mo3960c(C1821w r1);

    /* JADX INFO: renamed from: d */
    void mo3961d();

    /* JADX INFO: renamed from: e */
    InterfaceC1776n mo3962e();

    /* JADX INFO: renamed from: f */
    void mo3953f(int r1, C1970t r2, EnumC2055w2 r3);

    /* JADX INFO: renamed from: g */
    void mo3963g(C1793n r1);

    void stop();
}
