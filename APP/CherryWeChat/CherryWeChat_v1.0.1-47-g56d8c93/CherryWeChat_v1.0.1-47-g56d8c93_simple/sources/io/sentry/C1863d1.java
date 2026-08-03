package io.sentry;

import io.sentry.protocol.C1970t;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1863d1 {

    /* JADX INFO: renamed from: a */
    public final C1970t f6682a;

    /* JADX INFO: renamed from: b */
    public final C1970t f6683b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f6684c;

    /* JADX INFO: renamed from: d */
    public final File f6685d;

    /* JADX INFO: renamed from: e */
    public final double f6686e;

    public C1863d1(C1970t r1, C1970t r2, Map r3, File r4, AbstractC1588H1 r5) {
        this.f6682a = r1;
        this.f6683b = r2;
        this.f6684c = new ConcurrentHashMap(r3);
        this.f6685d = r4;
        this.f6686e = r5.mo3672d() / 1.0E9d;
    }
}
