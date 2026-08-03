package io.sentry.android.core.performance;

import android.os.Looper;
import io.sentry.AbstractC1588H1;
import io.sentry.EnumC1930n0;
import io.sentry.InterfaceC1876g0;

/* JADX INFO: renamed from: io.sentry.android.core.performance.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1736b {

    /* JADX INFO: renamed from: a */
    public final String f6294a;

    /* JADX INFO: renamed from: b */
    public AbstractC1588H1 f6295b;

    /* JADX INFO: renamed from: c */
    public AbstractC1588H1 f6296c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1876g0 f6297d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1876g0 f6298e;

    public C1736b(String r2) {
        this.f6295b = null;
        this.f6296c = null;
        this.f6297d = null;
        this.f6298e = null;
        this.f6294a = r2;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1876g0 m3913a(InterfaceC1876g0 r1, String r2, AbstractC1588H1 r3) {
        InterfaceC1876g0 r12 = r1.mo3619e(r2, r3, EnumC1930n0.SENTRY);
        r12.mo3618d("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        r12.mo3618d("thread.name", "main");
        Boolean r22 = Boolean.TRUE;
        r12.mo3618d("ui.contributes_to_ttid", r22);
        r12.mo3618d("ui.contributes_to_ttfd", r22);
        return r12;
    }
}
