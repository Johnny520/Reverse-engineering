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
    public AbstractC1588H1 f6295b = null;

    /* JADX INFO: renamed from: c */
    public AbstractC1588H1 f6296c = null;

    /* JADX INFO: renamed from: d */
    public InterfaceC1876g0 f6297d = null;

    /* JADX INFO: renamed from: e */
    public InterfaceC1876g0 f6298e = null;

    public C1736b(String str) {
        this.f6294a = str;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC1876g0 m3913a(InterfaceC1876g0 interfaceC1876g0, String str, AbstractC1588H1 abstractC1588H1) {
        InterfaceC1876g0 interfaceC1876g0Mo3619e = interfaceC1876g0.mo3619e(str, abstractC1588H1, EnumC1930n0.SENTRY);
        interfaceC1876g0Mo3619e.mo3618d("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        interfaceC1876g0Mo3619e.mo3618d("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        interfaceC1876g0Mo3619e.mo3618d("ui.contributes_to_ttid", bool);
        interfaceC1876g0Mo3619e.mo3618d("ui.contributes_to_ttfd", bool);
        return interfaceC1876g0Mo3619e;
    }
}
