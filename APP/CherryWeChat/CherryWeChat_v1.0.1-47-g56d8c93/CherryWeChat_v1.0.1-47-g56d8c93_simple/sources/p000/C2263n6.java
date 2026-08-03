package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: n6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2263n6 {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f7981a;

    public C2263n6(int r2) {
        switch(r2) {
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        char[] r22 = AbstractC2622vD.f9104a;
        this.f7981a = new ArrayDeque(0);
        return;
    L5:
        this.f7981a = new ArrayDeque();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m4602a(C0413Jj r2) {
        monitor-enter(this);
        r2.f1383b = null;     // Catch: Throwable -> L7
        r2.f1384c = null;     // Catch: Throwable -> L7
        this.f7981a.offer(r2);     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
