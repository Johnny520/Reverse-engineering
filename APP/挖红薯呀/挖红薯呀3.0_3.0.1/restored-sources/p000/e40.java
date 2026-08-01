package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class e40 extends j40 {

    /* JADX INFO: renamed from: h */
    public final boolean f1295h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(c40 c40Var) {
        super(true);
        boolean z = true;
        m1625Q(c40Var);
        InterfaceC0126de interfaceC0126deM1621M = m1621M();
        C0169ee c0169ee = interfaceC0126deM1621M instanceof C0169ee ? (C0169ee) interfaceC0126deM1621M : null;
        if (c0169ee == null) {
            z = false;
            break;
        }
        j40 j40VarM1029q = c0169ee.m1029q();
        while (!j40VarM1029q.mo780J()) {
            InterfaceC0126de interfaceC0126deM1621M2 = j40VarM1029q.m1621M();
            C0169ee c0169ee2 = interfaceC0126deM1621M2 instanceof C0169ee ? (C0169ee) interfaceC0126deM1621M2 : null;
            if (c0169ee2 == null) {
                z = false;
                break;
            }
            j40VarM1029q = c0169ee2.m1029q();
        }
        this.f1295h = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: J */
    public final boolean mo780J() {
        return this.f1295h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: K */
    public final boolean mo781K() {
        return true;
    }
}
