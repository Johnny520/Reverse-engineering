package p000;

/* JADX INFO: renamed from: Gl */
/* JADX INFO: loaded from: classes.dex */
public final class C0286Gl extends C0157Dl {

    /* JADX INFO: renamed from: d */
    public static final C0286Gl f930d = null;

    static {
        f930d = new C0286Gl(1, 0, 1);
    }

    @Override // p000.C0157Dl
    public final boolean equals(Object r3) {
        if ((r3 instanceof C0286Gl) == true) goto L5;
        return false;
    L5:
        if (isEmpty() == true) goto L7;
    L8:
        C0286Gl r32 = (C0286Gl) r3;
        int r0 = r32.f432a;
        if (this.f432a == r0) goto L11;
        return false;
    L11:
        if (this.f433b != r32.f433b) goto L18;
        return true;
    L18:
        return false;
    L7:
        if (((C0286Gl) r3).isEmpty() == false) goto L8;
        return true;
    }

    @Override // p000.C0157Dl
    public final int hashCode() {
        if (isEmpty() == false) goto L7;
        return -1;
    L7:
        return (this.f432a * 31) + this.f433b;
    }

    @Override // p000.C0157Dl
    public final boolean isEmpty() {
        if (this.f432a <= this.f433b) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.C0157Dl
    public final String toString() {
        return this.f432a + ".." + this.f433b;
    }
}
