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

    public AbstractC2052w(InterfaceC1651Z r1, ILogger r2, long r3, int r5) {
        this.f7271a = r1;
        this.f7272b = r2;
        this.f7273c = r3;
        this.f7274d = new C1609M2(new C1879h(r5));
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo3587a(String r1);

    /* JADX INFO: renamed from: b */
    public abstract void mo3588b(File r1, C1586H r2);
}
