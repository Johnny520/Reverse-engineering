package p000;

/* JADX INFO: renamed from: lh */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0431lh extends AbstractC0947y1 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f3484k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0431lh(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f3484k = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3484k;
        na1 na1Var = na1.f4229a;
        Object obj3 = this.f7484d;
        switch (i) {
            case 0:
                ((C0474mh) obj3).m2592c((InterfaceC0356ji) obj, ((Number) obj2).intValue());
                return na1Var;
            default:
                long j = ((rb1) obj).f5348a;
                dz0 dz0Var = (dz0) obj3;
                InterfaceC0966yk interfaceC0966yk = (InterfaceC0966yk) ((InterfaceC0298hw) dz0Var.f1228N.f7493f).invoke();
                if (interfaceC0966yk == null) {
                    C0921xc.m5134o("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
                    return null;
                }
                AbstractC0307i4.m1547w(interfaceC0966yk, null, new bz0(dz0Var, j, null, 1), 3);
                return na1Var;
        }
    }
}
