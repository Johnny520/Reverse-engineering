package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0525b {

    /* JADX INFO: renamed from: a */
    public final int f1475a;

    /* JADX INFO: renamed from: b */
    public final Method f1476b;

    public C0525b(int r1, Method r2) {
        this.f1475a = r1;
        this.f1476b = r2;
        r2.setAccessible(true);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0525b) == true) goto L8;
        return false;
    L8:
        C0525b r52 = (C0525b) r5;
        int r1 = r52.f1475a;
        if (this.f1475a != r1) goto L14;
        if (this.f1476b.getName().equals(r52.f1476b.getName()) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        int r02 = this.f1475a * 31;
        return this.f1476b.getName().hashCode() + r02;
    }
}
