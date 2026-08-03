package io.sentry;

import io.sentry.util.C2029a;

/* JADX INFO: renamed from: io.sentry.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1981r implements InterfaceC1862d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7100a;

    /* JADX INFO: renamed from: b */
    public final Object f7101b;

    public /* synthetic */ C1981r(int i, Object obj) {
        this.f7100a = i;
        this.f7101b = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f7100a) {
            case 0:
                C1998s.f7166a.set((InterfaceC1651Z) this.f7101b);
                break;
            default:
                ((C2029a) this.f7101b).unlock();
                break;
        }
    }
}
