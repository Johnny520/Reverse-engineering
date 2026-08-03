package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.a2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1657a2 implements InterfaceC1567C0 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        ((C1901c) interfaceC1652Z0).m4115z(name().toLowerCase(Locale.ROOT));
    }
}
