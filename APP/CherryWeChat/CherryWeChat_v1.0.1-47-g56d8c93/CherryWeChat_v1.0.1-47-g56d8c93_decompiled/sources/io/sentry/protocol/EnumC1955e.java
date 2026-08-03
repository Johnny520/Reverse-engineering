package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Locale;

/* JADX INFO: renamed from: io.sentry.protocol.e */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1955e implements InterfaceC1567C0 {
    PORTRAIT,
    LANDSCAPE;

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        ((C1901c) interfaceC1652Z0).m4115z(toString().toLowerCase(Locale.ROOT));
    }
}
