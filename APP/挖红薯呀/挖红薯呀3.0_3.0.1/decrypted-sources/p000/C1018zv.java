package p000;

/* JADX INFO: renamed from: zv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1018zv implements Comparable {

    /* JADX INFO: renamed from: e */
    public static final C1018zv f8004e;

    /* JADX INFO: renamed from: f */
    public static final C1018zv f8005f;

    /* JADX INFO: renamed from: g */
    public static final C1018zv f8006g;

    /* JADX INFO: renamed from: h */
    public static final C1018zv f8007h;

    /* JADX INFO: renamed from: i */
    public static final C1018zv f8008i;

    /* JADX INFO: renamed from: d */
    public final int f8009d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1018zv c1018zv = new C1018zv(100);
        C1018zv c1018zv2 = new C1018zv(200);
        C1018zv c1018zv3 = new C1018zv(300);
        C1018zv c1018zv4 = new C1018zv(400);
        C1018zv c1018zv5 = new C1018zv(500);
        C1018zv c1018zv6 = new C1018zv(600);
        f8004e = c1018zv6;
        C1018zv c1018zv7 = new C1018zv(700);
        C1018zv c1018zv8 = new C1018zv(800);
        C1018zv c1018zv9 = new C1018zv(900);
        f8005f = c1018zv4;
        f8006g = c1018zv5;
        f8007h = c1018zv6;
        f8008i = c1018zv7;
        o30.m2783w(c1018zv, c1018zv2, c1018zv3, c1018zv4, c1018zv5, c1018zv6, c1018zv7, c1018zv8, c1018zv9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1018zv(int i) {
        this.f8009d = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        x10.m5082a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return p30.m3008r(this.f8009d, ((C1018zv) obj).f8009d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1018zv) {
            return this.f8009d == ((C1018zv) obj).f8009d;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8009d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FontWeight(weight=" + this.f8009d + ')';
    }
}
