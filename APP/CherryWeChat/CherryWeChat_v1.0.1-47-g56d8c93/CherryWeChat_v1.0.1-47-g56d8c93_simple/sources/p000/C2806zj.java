package p000;

/* JADX INFO: renamed from: zj */
/* JADX INFO: loaded from: classes.dex */
public final class C2806zj implements Cloneable {

    /* JADX INFO: renamed from: a */
    public C0668Pg f9518a;

    /* JADX INFO: renamed from: a */
    public final C2806zj m5429a() {
        return (C2806zj) super.clone();
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5430b(Object r2) {
        if ((r2 instanceof C2806zj) == true) goto L5;
        return false;
    L5:
        return AbstractC2622vD.m5131b(this.f9518a, ((C2806zj) r2).f9518a);
    }

    /* JADX INFO: renamed from: c */
    public final int m5431c() {
        C0668Pg r0 = this.f9518a;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m5429a();
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2806zj) == true) goto L5;
        return false;
    L5:
        if (m5430b(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return m5431c();
    }
}
