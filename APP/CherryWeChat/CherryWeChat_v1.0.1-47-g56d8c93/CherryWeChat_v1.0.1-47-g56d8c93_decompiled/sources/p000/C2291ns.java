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

    public C2291ns(Class cls, Class cls2, Class cls3) {
        this.f8041a = cls;
        this.f8042b = cls2;
        this.f8043c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2291ns.class != obj.getClass()) {
            return false;
        }
        C2291ns c2291ns = (C2291ns) obj;
        return this.f8041a.equals(c2291ns.f8041a) && this.f8042b.equals(c2291ns.f8042b) && AbstractC2622vD.m5131b(this.f8043c, c2291ns.f8043c);
    }

    public final int hashCode() {
        int iHashCode = (this.f8042b.hashCode() + (this.f8041a.hashCode() * 31)) * 31;
        Class cls = this.f8043c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f8041a + ", second=" + this.f8042b + '}';
    }
}
