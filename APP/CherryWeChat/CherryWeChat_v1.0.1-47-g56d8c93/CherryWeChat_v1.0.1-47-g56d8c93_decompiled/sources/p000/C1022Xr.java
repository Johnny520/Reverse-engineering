package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: Xr */
/* JADX INFO: loaded from: classes.dex */
public final class C1022Xr extends C0118Cp {
    @Override // p000.C0118Cp
    /* JADX INFO: renamed from: c */
    public final void mo188c(Object obj, Object obj2) {
        C1065Yr c1065Yr = (C1065Yr) obj;
        c1065Yr.getClass();
        ArrayDeque arrayDeque = C1065Yr.f3375b;
        synchronized (arrayDeque) {
            arrayDeque.offer(c1065Yr);
        }
    }
}
