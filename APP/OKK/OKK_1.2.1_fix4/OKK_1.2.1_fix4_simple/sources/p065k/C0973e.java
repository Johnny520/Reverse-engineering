package p065k;

import p056f0.AbstractC0805P;

/* JADX INFO: renamed from: k.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0973e extends AbstractC0805P {
    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: O */
    public final void mo2061O(C0974f r1, C0974f r2) {
        r1.f3452b = r2;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: P */
    public final void mo2062P(C0974f r1, Thread r2) {
        r1.f3451a = r2;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: c */
    public final boolean mo2067c(AbstractFutureC0975g r3, C0971c r4) {
        C0971c r02 = C0971c.f3443b;
        monitor-enter(r3);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (r3.f3458b != r4) goto L12;
        r3.f3458b = r02;     // Catch: Throwable -> L10
        monitor-exit(r3);     // Catch: Throwable -> L10
        return true;
    L12:
        monitor-exit(r3);     // Catch: Throwable -> L10
        return false;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: d */
    public final boolean mo2068d(AbstractFutureC0975g r2, Object r3, Object r4) {
        monitor-enter(r2);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (r2.f3457a != r3) goto L11;
        r2.f3457a = r4;     // Catch: Throwable -> L9
        monitor-exit(r2);     // Catch: Throwable -> L9
        return true;
    L11:
        monitor-exit(r2);     // Catch: Throwable -> L9
        return false;
    }

    @Override // p056f0.AbstractC0805P
    /* JADX INFO: renamed from: e */
    public final boolean mo2069e(AbstractFutureC0975g r2, C0974f r3, C0974f r4) {
        monitor-enter(r2);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (r2.f3459c != r3) goto L11;
        r2.f3459c = r4;     // Catch: Throwable -> L9
        monitor-exit(r2);     // Catch: Throwable -> L9
        return true;
    L11:
        monitor-exit(r2);     // Catch: Throwable -> L9
        return false;
    }
}
