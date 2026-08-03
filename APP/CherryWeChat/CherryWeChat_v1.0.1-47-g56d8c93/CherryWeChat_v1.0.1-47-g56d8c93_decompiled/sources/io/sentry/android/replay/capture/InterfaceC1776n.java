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
    void mo3952a(MotionEvent motionEvent);

    /* JADX INFO: renamed from: b */
    void mo3959b(boolean z, C1514ht c1514ht);

    /* JADX INFO: renamed from: c */
    void mo3960c(C1821w c1821w);

    /* JADX INFO: renamed from: d */
    void mo3961d();

    /* JADX INFO: renamed from: e */
    InterfaceC1776n mo3962e();

    /* JADX INFO: renamed from: f */
    void mo3953f(int i, C1970t c1970t, EnumC2055w2 enumC2055w2);

    /* JADX INFO: renamed from: g */
    void mo3963g(C1793n c1793n);

    void stop();
}
