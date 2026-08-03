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

    public /* synthetic */ CallableC1590I(int r1) {
        this.f5751a = r1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch(this.f5751a) {
            case 0: goto L11;
            case 1: goto L8;
            case 2: goto L7;
            default: goto L5;
        };
    L8:
        return null;
    L5:
        return C1717e.f6225c.m3903a();
    L7:
        return new ArrayList();
    L11:
        return InetAddress.getLocalHost();
    }
}
