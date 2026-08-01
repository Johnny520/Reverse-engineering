package p351y2;

/* JADX INFO: renamed from: y2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9533b implements InterfaceC9537f {
    @Override // p351y2.InterfaceC9537f
    /* JADX INFO: renamed from: a */
    public int mo37319a(int i10) {
        int iMo37323e = mo37323e(i10);
        if (iMo37323e == -1 || mo37323e(iMo37323e) == -1) {
            return -1;
        }
        return iMo37323e;
    }

    @Override // p351y2.InterfaceC9537f
    /* JADX INFO: renamed from: b */
    public int mo37320b(int i10) {
        int iMo37324f = mo37324f(i10);
        if (iMo37324f == -1 || mo37324f(iMo37324f) == -1) {
            return -1;
        }
        return iMo37324f;
    }

    @Override // p351y2.InterfaceC9537f
    /* JADX INFO: renamed from: c */
    public int mo37321c(int i10) {
        return mo37324f(i10);
    }

    @Override // p351y2.InterfaceC9537f
    /* JADX INFO: renamed from: d */
    public int mo37322d(int i10) {
        return mo37323e(i10);
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo37323e(int i10);

    /* JADX INFO: renamed from: f */
    public abstract int mo37324f(int i10);
}
