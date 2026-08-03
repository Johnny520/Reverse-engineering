package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: Xr */
/* JADX INFO: loaded from: classes.dex */
public final class C1022Xr extends C0118Cp {
    @Override // p000.C0118Cp
    /* JADX INFO: renamed from: c */
    public final void mo188c(Object r1, Object r2) {
        C1065Yr r12 = (C1065Yr) r1;
        r12.getClass();
        ArrayDeque r22 = C1065Yr.f3375b;
        monitor-enter(r22);
        r22.offer(r12);     // Catch: Throwable -> L7
        monitor-exit(r22);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
