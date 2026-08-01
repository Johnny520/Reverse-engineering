package p000;

/* JADX INFO: renamed from: l7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0421l7 extends c50 implements InterfaceC0941xw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0742sw f3369d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ b91 f3370e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0421l7(InterfaceC0742sw interfaceC0742sw, b91 b91Var) {
        super(3);
        this.f3369d = interfaceC0742sw;
        this.f3370e = b91Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // p000.InterfaceC0941xw
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo353a(Object obj, Object obj2, Object obj3) {
        long j;
        zd0 zd0Var = (zd0) obj;
        xq0 xq0VarMo184e = ((sd0) obj2).mo184e(((C0617pj) obj3).f4912a);
        if (zd0Var.mo53m()) {
            if (((Boolean) this.f3369d.invoke(this.f3370e.f462d.getValue())).booleanValue()) {
                j = (((long) xq0VarMo184e.f7400d) << 32) | (((long) xq0VarMo184e.f7401e) & 4294967295L);
            } else {
                j = 0;
            }
        }
        return zd0Var.mo1279Q((int) (j >> 32), (int) (4294967295L & j), C0330is.f2614d, new C0306i3(xq0VarMo184e, 1));
    }
}
