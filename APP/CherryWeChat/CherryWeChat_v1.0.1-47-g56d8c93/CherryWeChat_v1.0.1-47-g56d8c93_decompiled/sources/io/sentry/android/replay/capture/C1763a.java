package io.sentry.android.replay.capture;

import io.sentry.ThreadFactoryC1594J;
import java.util.concurrent.Executors;
import p000.AbstractC0073Bn;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1763a extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public static final C1763a f6416b = new C1763a(0);

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC1594J(3));
    }
}
