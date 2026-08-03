package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: Yr */
/* JADX INFO: loaded from: classes.dex */
public final class C1065Yr {

    /* JADX INFO: renamed from: b */
    public static final ArrayDeque f3375b = null;

    /* JADX INFO: renamed from: a */
    public Object f3376a;

    static {
        char[] r0 = AbstractC2622vD.f9104a;
        f3375b = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: a */
    public static C1065Yr m2002a(Object r2) {
        ArrayDeque r0 = f3375b;
        monitor-enter(r0);
        C1065Yr r1 = (C1065Yr) r0.poll();     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        if (r1 != null) goto L8;
        r1 = new C1065Yr();
    L8:
        r1.f3376a = r2;
        return r1;
    L10:
        th = move-exception;
        throw th;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C1065Yr) == true) goto L5;
        return false;
    L5:
        if (this.f3376a.equals(((C1065Yr) r2).f3376a) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.f3376a.hashCode();
    }
}
