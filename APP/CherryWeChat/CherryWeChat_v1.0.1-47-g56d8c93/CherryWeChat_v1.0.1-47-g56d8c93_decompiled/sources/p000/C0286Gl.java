package p000;

/* JADX INFO: renamed from: Gl */
/* JADX INFO: loaded from: classes.dex */
public final class C0286Gl extends C0157Dl {

    /* JADX INFO: renamed from: d */
    public static final C0286Gl f930d = new C0286Gl(1, 0, 1);

    @Override // p000.C0157Dl
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0286Gl)) {
            return false;
        }
        if (isEmpty() && ((C0286Gl) obj).isEmpty()) {
            return true;
        }
        C0286Gl c0286Gl = (C0286Gl) obj;
        return this.f432a == c0286Gl.f432a && this.f433b == c0286Gl.f433b;
    }

    @Override // p000.C0157Dl
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f432a * 31) + this.f433b;
    }

    @Override // p000.C0157Dl
    public final boolean isEmpty() {
        return this.f432a > this.f433b;
    }

    @Override // p000.C0157Dl
    public final String toString() {
        return this.f432a + ".." + this.f433b;
    }
}
