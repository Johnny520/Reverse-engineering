package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: Yr */
/* JADX INFO: loaded from: classes.dex */
public final class C1065Yr {

    /* JADX INFO: renamed from: b */
    public static final ArrayDeque f3375b;

    /* JADX INFO: renamed from: a */
    public Object f3376a;

    static {
        char[] cArr = AbstractC2622vD.f9104a;
        f3375b = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: a */
    public static C1065Yr m2002a(Object obj) {
        C1065Yr c1065Yr;
        ArrayDeque arrayDeque = f3375b;
        synchronized (arrayDeque) {
            c1065Yr = (C1065Yr) arrayDeque.poll();
        }
        if (c1065Yr == null) {
            c1065Yr = new C1065Yr();
        }
        c1065Yr.f3376a = obj;
        return c1065Yr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1065Yr) && this.f3376a.equals(((C1065Yr) obj).f3376a);
    }

    public final int hashCode() {
        return this.f3376a.hashCode();
    }
}
