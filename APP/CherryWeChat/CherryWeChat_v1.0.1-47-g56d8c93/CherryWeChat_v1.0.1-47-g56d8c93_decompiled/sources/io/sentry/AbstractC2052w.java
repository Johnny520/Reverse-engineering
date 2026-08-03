package io.sentry;

import java.io.File;

/* JADX INFO: renamed from: io.sentry.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2052w {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1651Z f7271a;

    /* JADX INFO: renamed from: b */
    public final ILogger f7272b;

    /* JADX INFO: renamed from: c */
    public final long f7273c;

    /* JADX INFO: renamed from: d */
    public final C1609M2 f7274d;

    public AbstractC2052w(InterfaceC1651Z interfaceC1651Z, ILogger iLogger, long j, int i) {
        this.f7271a = interfaceC1651Z;
        this.f7272b = iLogger;
        this.f7273c = j;
        this.f7274d = new C1609M2(new C1879h(i));
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3587a(String str);

    /* JADX INFO: renamed from: b */
    public abstract void mo3588b(File file, C1586H c1586h);
}
