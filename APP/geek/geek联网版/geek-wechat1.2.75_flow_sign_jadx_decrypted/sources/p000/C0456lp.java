package p000;

/* JADX INFO: renamed from: lp */
/* JADX INFO: loaded from: classes.dex */
public final class C0456lp extends C0382jp {

    /* JADX INFO: renamed from: d */
    public static final C0456lp f3038d = new C0456lp(1, 0, 1);

    @Override // p000.C0382jp
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0456lp)) {
            return false;
        }
        if (isEmpty() && ((C0456lp) obj).isEmpty()) {
            return true;
        }
        C0456lp c0456lp = (C0456lp) obj;
        return this.f2737a == c0456lp.f2737a && this.f2738b == c0456lp.f2738b;
    }

    @Override // p000.C0382jp
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2737a * 31) + this.f2738b;
    }

    @Override // p000.C0382jp
    public final boolean isEmpty() {
        return this.f2737a > this.f2738b;
    }

    @Override // p000.C0382jp
    public final String toString() {
        return this.f2737a + ".." + this.f2738b;
    }
}
