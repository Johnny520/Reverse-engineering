package bsh;

/* JADX INFO: renamed from: bsh.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1167e0 extends AbstractC1195i4 implements InterfaceC1230o3 {

    /* JADX INFO: renamed from: y */
    public int f3525y;

    /* JADX INFO: renamed from: z */
    public String f3526z;

    public C1167e0(int i10) {
        super(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        String str = this.f3526z;
        if (str != null) {
            return new C1171e4(this.f3525y, str, (InterfaceC1188h3) this);
        }
        return new C1171e4(this.f3525y, mo4050r() > 0 ? mo4051s(0).mo4048p(c1174f1, runnableC1205k2) : Primitive.VOID, this);
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + InterfaceC1230o3.f3729d[this.f3525y] + " " + this.f3526z + ":";
    }
}
