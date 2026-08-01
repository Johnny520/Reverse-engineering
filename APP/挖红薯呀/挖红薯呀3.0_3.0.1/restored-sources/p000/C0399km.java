package p000;

/* JADX INFO: renamed from: km */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0399km extends lo0 {

    /* JADX INFO: renamed from: J */
    public static final C0111d f3217J;

    /* JADX INFO: renamed from: I */
    public final gp0 f3218I;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0717s8 c0717s8 = new C0717s8(13);
        C0881w9 c0881w9 = new C0881w9(9);
        C0956ya c0956ya = new C0956ya(2, c0717s8);
        s91.m4048m(1, c0881w9);
        f3217J = new C0111d(19, c0956ya, c0881w9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0399km(int i, float f, InterfaceC0298hw interfaceC0298hw) {
        super(f, i);
        this.f3218I = r60.m3419u(interfaceC0298hw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.lo0
    /* JADX INFO: renamed from: n */
    public final int mo1941n() {
        return ((Number) ((InterfaceC0298hw) this.f3218I.getValue()).invoke()).intValue();
    }
}
