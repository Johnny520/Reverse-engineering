package p000;

/* JADX INFO: renamed from: ns */
/* JADX INFO: loaded from: classes.dex */
public final class C2291ns {

    /* JADX INFO: renamed from: a */
    public Class f8041a;

    /* JADX INFO: renamed from: b */
    public Class f8042b;

    /* JADX INFO: renamed from: c */
    public Class f8043c;

    public C2291ns(Class r1, Class r2, Class r3) {
        this.f8041a = r1;
        this.f8042b = r2;
        this.f8043c = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L20:
        return false;
    L8:
        if (C2291ns.class != r5.getClass()) goto L20;
        C2291ns r52 = (C2291ns) r5;
        if (this.f8041a.equals(r52.f8041a) == true) goto L14;
        return false;
    L14:
        if (this.f8042b.equals(r52.f8042b) == true) goto L17;
        return false;
    L17:
        if (AbstractC2622vD.m5131b(this.f8043c, r52.f8043c) == true) goto L19;
        return false;
    L19:
        return true;
    }

    public final int hashCode() {
        int r0 = this.f8041a.hashCode() * 31;
        int r1 = (this.f8042b.hashCode() + r0) * 31;
        Class r02 = this.f8043c;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L7:
        return r1 + r03;
    L5:
        r03 = 0;
        goto L7
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f8041a + ", second=" + this.f8042b + '}';
    }
}
