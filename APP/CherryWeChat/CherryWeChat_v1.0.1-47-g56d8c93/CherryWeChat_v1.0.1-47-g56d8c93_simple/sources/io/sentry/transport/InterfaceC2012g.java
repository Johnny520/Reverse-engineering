package io.sentry.transport;

import io.sentry.C1586H;
import io.sentry.internal.debugmeta.C1901c;
import java.io.Closeable;

/* JADX INFO: renamed from: io.sentry.transport.g */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2012g extends Closeable {
    /* JADX INFO: renamed from: a */
    void mo4159a(boolean r1);

    /* JADX INFO: renamed from: b */
    void mo4160b(long r1);

    /* JADX INFO: renamed from: c */
    C2021p mo4161c();

    /* JADX INFO: renamed from: e */
    default boolean mo4162e() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    void mo4163j(C1901c r1, C1586H r2);
}
