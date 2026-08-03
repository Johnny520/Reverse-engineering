package p000;

/* JADX INFO: renamed from: J */
/* JADX INFO: loaded from: classes.dex */
public final class C0387J extends AbstractC0628Oj {
    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: O */
    public final void mo730O(C0430K r1, C0430K r2) {
        r1.f1417b = r2;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: P */
    public final void mo731P(C0430K r1, Thread r2) {
        r1.f1416a = r2;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: f */
    public final boolean mo732f(AbstractFutureC0473L r3, C0301H r4) {
        C0301H r0 = C0301H.f1014b;
        monitor-enter(r3);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (r3.f1568b != r4) goto L12;
        r3.f1568b = r0;     // Catch: Throwable -> L9
        monitor-exit(r3);     // Catch: Throwable -> L9
        return true;
    L12:
        monitor-exit(r3);     // Catch: Throwable -> L9
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: g */
    public final boolean mo733g(AbstractFutureC0473L r2, Object r3, Object r4) {
        monitor-enter(r2);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (r2.f1567a != r3) goto L11;
        r2.f1567a = r4;     // Catch: Throwable -> L8
        monitor-exit(r2);     // Catch: Throwable -> L8
        return true;
    L11:
        monitor-exit(r2);     // Catch: Throwable -> L8
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: h */
    public final boolean mo734h(AbstractFutureC0473L r2, C0430K r3, C0430K r4) {
        monitor-enter(r2);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (r2.f1569c != r3) goto L11;
        r2.f1569c = r4;     // Catch: Throwable -> L8
        monitor-exit(r2);     // Catch: Throwable -> L8
        return true;
    L11:
        monitor-exit(r2);     // Catch: Throwable -> L8
        return false;
    }
}
