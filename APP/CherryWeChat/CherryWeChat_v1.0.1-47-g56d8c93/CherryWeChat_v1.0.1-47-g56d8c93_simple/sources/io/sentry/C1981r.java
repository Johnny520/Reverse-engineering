package io.sentry;

import io.sentry.util.C2029a;

/* JADX INFO: renamed from: io.sentry.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1981r implements InterfaceC1862d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7100a;

    /* JADX INFO: renamed from: b */
    public final Object f7101b;

    public /* synthetic */ C1981r(int r1, Object r2) {
        this.f7100a = r1;
        this.f7101b = r2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch(this.f7100a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C2029a) this.f7101b).unlock();
        return;
    L6:
        C1998s.f7166a.set((InterfaceC1651Z) this.f7101b);
    }
}
