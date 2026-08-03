package p000;

/* JADX INFO: renamed from: xp */
/* JADX INFO: loaded from: classes.dex */
public final class C2726xp implements InterfaceC0938Vt {

    /* JADX INFO: renamed from: a */
    public final C2769yp f9311a;

    /* JADX INFO: renamed from: b */
    public int f9312b;

    /* JADX INFO: renamed from: c */
    public Class f9313c;

    public C2726xp(C2769yp c2769yp) {
        this.f9311a = c2769yp;
    }

    @Override // p000.InterfaceC0938Vt
    /* JADX INFO: renamed from: a */
    public final void mo1797a() {
        this.f9311a.m5128d(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2726xp) {
            C2726xp c2726xp = (C2726xp) obj;
            if (this.f9312b == c2726xp.f9312b && this.f9313c == c2726xp.f9313c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9312b * 31;
        Class cls = this.f9313c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f9312b + "array=" + this.f9313c + '}';
    }
}
