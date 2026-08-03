package io.sentry;

import io.sentry.android.core.internal.util.C1717e;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.I */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1590I implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5751a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5751a) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return null;
            case 2:
                return new ArrayList();
            default:
                return C1717e.f6225c.m3903a();
        }
    }
}
