package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.w2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2055w2 implements InterfaceC1567C0 {
    SESSION,
    BUFFER;

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        ((C1901c) interfaceC1652Z0).m4115z(name().toLowerCase(Locale.ROOT));
    }
}
