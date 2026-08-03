package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: I9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0354I9 {

    /* JADX INFO: renamed from: a */
    public final int f1188a;

    /* JADX INFO: renamed from: b */
    public final Method f1189b;

    public C0354I9(int r1, Method r2) {
        this.f1188a = r1;
        this.f1189b = r2;
        r2.setAccessible(true);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0354I9) == true) goto L8;
        return false;
    L8:
        C0354I9 r52 = (C0354I9) r5;
        if (this.f1188a == r52.f1188a) goto L11;
    L13:
        return false;
    L11:
        if (this.f1189b.getName().equals(r52.f1189b.getName()) == false) goto L13;
        return true;
    }

    public final int hashCode() {
        int r0 = this.f1188a * 31;
        return this.f1189b.getName().hashCode() + r0;
    }
}
