package p093S1;

/* JADX INFO: renamed from: S1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1292d implements InterfaceC1296h {

    /* JADX INFO: renamed from: a */
    public final C1293e f4627a;

    /* JADX INFO: renamed from: b */
    public int f4628b;

    /* JADX INFO: renamed from: c */
    public Class f4629c;

    public C1292d(C1293e c1293e) {
        this.f4627a = c1293e;
    }

    @Override // p093S1.InterfaceC1296h
    /* JADX INFO: renamed from: a */
    public final void mo2380a() {
        this.f4627a.m741d(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1292d) {
            C1292d c1292d = (C1292d) obj;
            if (this.f4628b == c1292d.f4628b && this.f4629c == c1292d.f4629c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f4628b * 31;
        Class cls = this.f4629c;
        return i5 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f4628b + "array=" + this.f4629c + '}';
    }
}
