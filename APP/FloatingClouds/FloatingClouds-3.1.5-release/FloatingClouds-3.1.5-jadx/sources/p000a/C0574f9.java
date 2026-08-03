package p000a;

/* JADX INFO: renamed from: a.f9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0574f9 extends C0536d9 {

    /* JADX INFO: renamed from: d */
    public static final C0574f9 f2136d = new C0574f9(1, 0, 1);

    @Override // p000a.C0536d9
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0574f9)) {
            return false;
        }
        if (isEmpty() && ((C0574f9) obj).isEmpty()) {
            return true;
        }
        C0574f9 c0574f9 = (C0574f9) obj;
        if (this.f1929a == c0574f9.f1929a) {
            return this.f1930b == c0574f9.f1930b;
        }
        return false;
    }

    @Override // p000a.C0536d9
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1929a * 31) + this.f1930b;
    }

    @Override // p000a.C0536d9
    public final boolean isEmpty() {
        return this.f1929a > this.f1930b;
    }

    @Override // p000a.C0536d9
    public final String toString() {
        return this.f1929a + ".." + this.f1930b;
    }
}
