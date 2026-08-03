package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6600<F, S> {

    /* JADX INFO: renamed from: ۥ */
    public final F f2165;

    /* JADX INFO: renamed from: ۥ۟ */
    public final S f2166;

    public C6600(F f, S s) {
        this.f2165 = f;
        this.f2166 = s;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static <A, B> C6600<A, B> m3064(A a, B b) {
        return new C6600<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6600)) {
            return false;
        }
        C6600 c6600 = (C6600) obj;
        return C6499.m2995(c6600.f2165, this.f2165) && C6499.m2995(c6600.f2166, this.f2166);
    }

    public int hashCode() {
        F f = this.f2165;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f2166;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    @InterfaceC6391
    public String toString() {
        return "Pair{" + this.f2165 + " " + this.f2166 + "}";
    }
}
