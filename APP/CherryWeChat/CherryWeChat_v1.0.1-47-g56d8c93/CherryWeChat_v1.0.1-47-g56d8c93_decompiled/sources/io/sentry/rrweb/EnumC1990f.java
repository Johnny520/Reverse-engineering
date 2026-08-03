package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;

/* JADX INFO: renamed from: io.sentry.rrweb.f */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1990f implements InterfaceC1567C0 {
    MouseUp,
    MouseDown,
    Click,
    ContextMenu,
    DblClick,
    Focus,
    Blur,
    TouchStart,
    TouchMove_Departed,
    TouchEnd,
    TouchCancel;

    @Override // io.sentry.InterfaceC1567C0
    public void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        ((C1901c) interfaceC1652Z0).m4111v(ordinal());
    }
}
