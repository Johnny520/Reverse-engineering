package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Zy */
/* JADX INFO: loaded from: classes.dex */
public final class C1115Zy extends AbstractC0671Pj implements InterfaceC0035As {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3516h = null;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: g */
    public int f3517g;

    static {
        f3516h = AtomicReferenceFieldUpdater.newUpdater(C1115Zy.class, Object.class, "_state$volatile");
    }

    public C1115Zy(Object r1) {
        this._state$volatile = r1;
    }

    /* JADX INFO: renamed from: D */
    public final void m2031D(Object r3) {
        if (r3 != null) goto L4;
        r3 = AbstractC0671Pj.f2141d;
    L4:
        monitor-enter(this);
        AtomicReferenceFieldUpdater r0 = f3516h;     // Catch: Throwable -> L25
        if (AbstractC0585Nj.m1134a(r0.get(this), r3) == false) goto L9;
        monitor-exit(this);
        return;
    L9:
        r0.set(this, r3);     // Catch: Throwable -> L25
        int r32 = this.f3517g;     // Catch: Throwable -> L25
        if ((r32 & 1) != 0) goto L28;
        int r33 = r32 + 1;     // Catch: Throwable -> L25
        this.f3517g = r33;     // Catch: Throwable -> L25
        monitor-exit(this);
    L13:
        monitor-enter(this);
        int r02 = this.f3517g;     // Catch: Throwable -> L19
        if (r02 == r33) goto L16;
        monitor-exit(this);
        r33 = r02;
        goto L13
    L16:
        this.f3517g = r33 + 1;     // Catch: Throwable -> L19
        monitor-exit(this);
        return;
    L19:
        th = move-exception;
        throw th;
    L28:
        this.f3517g = r32 + 2;     // Catch: Throwable -> L25
        monitor-exit(this);
        return;
    L25:
        th = move-exception;
        throw th;
    }
}
