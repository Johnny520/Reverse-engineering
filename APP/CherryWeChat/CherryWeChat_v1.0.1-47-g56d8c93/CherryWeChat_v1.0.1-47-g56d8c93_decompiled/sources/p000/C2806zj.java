package p000;

/* JADX INFO: renamed from: zj */
/* JADX INFO: loaded from: classes.dex */
public final class C2806zj implements Cloneable {

    /* JADX INFO: renamed from: a */
    public C0668Pg f9518a;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2806zj clone() {
        try {
            return (C2806zj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5430b(Object obj) {
        if (obj instanceof C2806zj) {
            return AbstractC2622vD.m5131b(this.f9518a, ((C2806zj) obj).f9518a);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final int m5431c() {
        C0668Pg c0668Pg = this.f9518a;
        if (c0668Pg != null) {
            return c0668Pg.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2806zj) && m5430b(obj);
    }

    public final int hashCode() {
        return m5431c();
    }
}
