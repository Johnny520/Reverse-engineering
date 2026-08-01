package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yh extends ip {
    public final /* synthetic */ zh C;

    public yh(zh r1) {
        this.C = r1;
    }

    @Override // defpackage.ip
    public final void F(Throwable r2) {
        this.C.a.d(r2);
    }

    @Override // defpackage.ip
    public final void I(a8 r5) {
        zh r0 = this.C;
        r0.c = r5;
        r0.b = new d4(r0.c, new vh(17), r0.a.h);
        ei r52 = r0.a;
        r52.getClass();
        ArrayList r02 = new ArrayList();
        r52.a.writeLock().lock();
        r52.c = 1;     // Catch: Throwable -> L6
        r02.addAll(r52.b);     // Catch: Throwable -> L6
        r52.b.clear();     // Catch: Throwable -> L6
        r52.a.writeLock().unlock();
        r52.d.post(new e8(r02, r52.c, null));
        return;
    L6:
        th = move-exception;
        r52.a.writeLock().unlock();
        throw th;
    }
}
