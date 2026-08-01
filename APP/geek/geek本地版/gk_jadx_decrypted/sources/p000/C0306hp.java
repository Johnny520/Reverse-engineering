package p000;

/* JADX INFO: renamed from: hp */
/* JADX INFO: loaded from: classes.dex */
public final class C0306hp extends C0232fp {

    /* JADX INFO: renamed from: d */
    public static final C0306hp f2295d = new C0306hp(1, 0, 1);

    @Override // p000.C0232fp
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0306hp)) {
            return false;
        }
        if (isEmpty() && ((C0306hp) obj).isEmpty()) {
            return true;
        }
        C0306hp c0306hp = (C0306hp) obj;
        return this.f1988a == c0306hp.f1988a && this.f1989b == c0306hp.f1989b;
    }

    @Override // p000.C0232fp
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1988a * 31) + this.f1989b;
    }

    @Override // p000.C0232fp
    public final boolean isEmpty() {
        return this.f1988a > this.f1989b;
    }

    @Override // p000.C0232fp
    public final String toString() {
        return this.f1988a + ".." + this.f1989b;
    }
}
