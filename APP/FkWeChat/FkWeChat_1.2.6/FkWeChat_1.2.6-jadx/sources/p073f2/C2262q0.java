package p073f2;

/* JADX INFO: renamed from: f2.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2262q0 {

    /* JADX INFO: renamed from: a */
    public final int f6218a;

    public /* synthetic */ C2262q0(int i10) {
        this.f6218a = i10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C2262q0 m8222a(int i10) {
        return new C2262q0(i10);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8224c(int i10, Object obj) {
        return (obj instanceof C2262q0) && i10 == ((C2262q0) obj).m8227f();
    }

    /* JADX INFO: renamed from: d */
    public static int m8225d(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: e */
    public static String m8226e(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m8224c(this.f6218a, obj);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int m8227f() {
        return this.f6218a;
    }

    public int hashCode() {
        return m8225d(this.f6218a);
    }

    public String toString() {
        return m8226e(this.f6218a);
    }

    /* JADX INFO: renamed from: b */
    public static int m8223b(int i10) {
        return i10;
    }
}
