package io.sentry.android.core;

import io.sentry.hints.InterfaceC1883a;
import io.sentry.hints.InterfaceC1893k;

/* JADX INFO: renamed from: io.sentry.android.core.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1746t implements InterfaceC1883a, InterfaceC1893k {

    /* JADX INFO: renamed from: a */
    public final boolean f6345a;

    public C1746t(boolean z) {
        this.f6345a = z;
    }

    @Override // io.sentry.hints.InterfaceC1883a
    /* JADX INFO: renamed from: b */
    public final Long mo3923b() {
        return null;
    }

    @Override // io.sentry.hints.InterfaceC1883a
    /* JADX INFO: renamed from: c */
    public final boolean mo3924c() {
        return true;
    }

    @Override // io.sentry.hints.InterfaceC1883a
    /* JADX INFO: renamed from: e */
    public final String mo3925e() {
        return this.f6345a ? "anr_background" : "anr_foreground";
    }
}
