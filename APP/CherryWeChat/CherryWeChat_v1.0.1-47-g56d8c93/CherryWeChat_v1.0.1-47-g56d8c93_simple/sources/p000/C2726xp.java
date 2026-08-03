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

    public C2726xp(C2769yp r1) {
        this.f9311a = r1;
    }

    @Override // p000.InterfaceC0938Vt
    /* JADX INFO: renamed from: a */
    public final void mo1797a() {
        this.f9311a.m5128d(this);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof C2726xp) == false) goto L10;
        C2726xp r42 = (C2726xp) r4;
        if (this.f9312b != r42.f9312b) goto L10;
        if (this.f9313c != r42.f9313c) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f9312b * 31;
        Class r1 = this.f9313c;
        if (r1 == null) goto L5;
        int r12 = r1.hashCode();
    L7:
        return r0 + r12;
    L5:
        r12 = 0;
        goto L7
    }

    public final String toString() {
        return "Key{size=" + this.f9312b + "array=" + this.f9313c + '}';
    }
}
