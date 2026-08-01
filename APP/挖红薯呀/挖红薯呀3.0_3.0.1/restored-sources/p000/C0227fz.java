package p000;

/* JADX INFO: renamed from: fz */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0227fz implements x01 {

    /* JADX INFO: renamed from: b */
    public static final C0227fz f1822b = new C0227fz(0);

    /* JADX INFO: renamed from: c */
    public static final C0227fz f1823c = new C0227fz(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1824a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [fz.<clinit>():void, pf1.<clinit>():void] */
    public /* synthetic */ C0227fz(int i) {
        this.f1824a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x01
    /* JADX INFO: renamed from: a */
    public final v50 mo737a(long j, k50 k50Var, InterfaceC0968ym interfaceC0968ym) {
        switch (this.f1824a) {
            case 0:
                float fMo641F = interfaceC0968ym.mo641F(30.0f);
                return new xm0(new st0(0.0f, -fMo641F, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fMo641F));
            case 1:
                float fMo641F2 = interfaceC0968ym.mo641F(30.0f);
                return new xm0(new st0(-fMo641F2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fMo641F2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new xm0(v50.m4398b(0L, j));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f1824a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
