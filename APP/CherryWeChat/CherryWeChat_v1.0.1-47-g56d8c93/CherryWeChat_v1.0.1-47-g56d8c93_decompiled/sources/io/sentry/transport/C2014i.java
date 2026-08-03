package io.sentry.transport;

import io.sentry.C1586H;
import io.sentry.cache.InterfaceC1839d;
import io.sentry.internal.debugmeta.C1901c;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.transport.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2014i implements InterfaceC1839d {

    /* JADX INFO: renamed from: a */
    public static final C2014i f7194a = new C2014i();

    @Override // io.sentry.cache.InterfaceC1839d
    /* JADX INFO: renamed from: i */
    public final boolean mo3868i(C1901c c1901c, C1586H c1586h) {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyIterator();
    }

    @Override // io.sentry.cache.InterfaceC1839d
    /* JADX INFO: renamed from: p */
    public final void mo4011p(C1901c c1901c) {
    }
}
