package p195l2;

/* JADX INFO: renamed from: l2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2509m {

    /* JADX INFO: renamed from: a */
    public Class f8025a;

    /* JADX INFO: renamed from: b */
    public Class f8026b;

    /* JADX INFO: renamed from: c */
    public Class f8027c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2509m(Class cls, Class cls2, Class cls3) {
        this.f8025a = cls;
        this.f8026b = cls2;
        this.f8027c = cls3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2509m.class != obj.getClass()) {
            return false;
        }
        C2509m c2509m = (C2509m) obj;
        return this.f8025a.equals(c2509m.f8025a) && this.f8026b.equals(c2509m.f8026b) && AbstractC2511o.m4453b(this.f8027c, c2509m.f8027c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f8026b.hashCode() + (this.f8025a.hashCode() * 31)) * 31;
        Class cls = this.f8027c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MultiClassKey{first=" + this.f8025a + ", second=" + this.f8026b + '}';
    }
}
