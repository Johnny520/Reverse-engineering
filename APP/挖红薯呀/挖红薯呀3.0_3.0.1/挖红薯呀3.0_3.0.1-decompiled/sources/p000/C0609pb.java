package p000;

/* JADX INFO: renamed from: pb */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0609pb implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4798d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f4799e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0609pb(int i, Object obj) {
        this.f4798d = i;
        this.f4799e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        long j;
        switch (this.f4798d) {
            case 0:
                ((InterfaceC0958yc) this.f4799e).cancel();
                return na1.f4229a;
            default:
                q21 q21Var = (q21) obj;
                synchronized (t21.f5893c) {
                    j = t21.f5895e;
                    t21.f5895e = 1 + j;
                }
                return new ft0(j, q21Var, (InterfaceC0742sw) this.f4799e);
        }
    }
}
