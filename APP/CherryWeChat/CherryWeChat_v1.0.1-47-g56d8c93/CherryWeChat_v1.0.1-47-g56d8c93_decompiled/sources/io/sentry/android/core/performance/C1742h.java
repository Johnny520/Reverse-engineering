package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.AbstractWindowCallbackC1710i;
import p000.RunnableC0586Nk;

/* JADX INFO: renamed from: io.sentry.android.core.performance.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1742h extends AbstractWindowCallbackC1710i {

    /* JADX INFO: renamed from: b */
    public final RunnableC0586Nk f6324b;

    public C1742h(Window.Callback callback, RunnableC0586Nk runnableC0586Nk) {
        super(callback);
        this.f6324b = runnableC0586Nk;
    }

    @Override // io.sentry.android.core.internal.gestures.AbstractWindowCallbackC1710i, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.f6324b.run();
    }
}
