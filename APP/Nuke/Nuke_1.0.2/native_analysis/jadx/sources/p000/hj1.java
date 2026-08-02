package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hj1 {

    /* JADX INFO: renamed from: a */
    public Class f4035a;

    /* JADX INFO: renamed from: b */
    public Class f4036b;

    /* JADX INFO: renamed from: c */
    public Class f4037c;

    public hj1(Class cls, Class cls2, Class cls3) {
        this.f4035a = cls;
        this.f4036b = cls2;
        this.f4037c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hj1.class != obj.getClass()) {
            return false;
        }
        hj1 hj1Var = (hj1) obj;
        return this.f4035a.equals(hj1Var.f4035a) && this.f4036b.equals(hj1Var.f4036b) && b93.m495b(this.f4037c, hj1Var.f4037c);
    }

    public final int hashCode() {
        int iHashCode = (this.f4036b.hashCode() + (this.f4035a.hashCode() * 31)) * 31;
        Class cls = this.f4037c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f4035a + ", second=" + this.f4036b + '}';
    }
}
