package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class bc1 extends c50 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f493d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0190ez[] f494e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc1(C0190ez[] c0190ezArr, int i) {
        super(2);
        this.f493d = i;
        this.f494e = c0190ezArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f493d;
        C0190ez[] c0190ezArr = this.f494e;
        switch (i) {
            case 0:
                return Float.valueOf(g60.m1205d((wq0) obj, true, c0190ezArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(g60.m1205d((wq0) obj, false, c0190ezArr, ((Number) obj2).floatValue()));
        }
    }
}
