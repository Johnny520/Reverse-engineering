package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class gy0 extends AbstractC0708s implements InterfaceC0022al {

    /* JADX INFO: renamed from: i */
    public final InterfaceC0322ik f2092i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gy0(InterfaceC0322ik interfaceC0322ik, InterfaceC0618pk interfaceC0618pk) {
        super(interfaceC0618pk, true);
        this.f2092i = interfaceC0322ik;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: S */
    public final boolean mo1266S() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0022al
    /* JADX INFO: renamed from: d */
    public final InterfaceC0022al mo180d() {
        InterfaceC0322ik interfaceC0322ik = this.f2092i;
        if (interfaceC0322ik instanceof InterfaceC0022al) {
            return (InterfaceC0022al) interfaceC0322ik;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: y */
    public void mo1172y(Object obj) {
        pf1.m3041S(rd0.m3497z(this.f2092i), AbstractC0307i4.m1517C(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: z */
    public void mo1173z(Object obj) {
        this.f2092i.mo541i(AbstractC0307i4.m1517C(obj));
    }
}
