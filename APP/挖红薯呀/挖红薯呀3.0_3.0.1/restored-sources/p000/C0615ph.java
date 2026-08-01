package p000;

/* JADX INFO: renamed from: ph */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0615ph implements InterfaceC0904ww {

    /* JADX INFO: renamed from: e */
    public static final C0615ph f4852e = new C0615ph(0);

    /* JADX INFO: renamed from: f */
    public static final C0615ph f4853f = new C0615ph(1);

    /* JADX INFO: renamed from: g */
    public static final C0615ph f4854g = new C0615ph(2);

    /* JADX INFO: renamed from: h */
    public static final C0615ph f4855h = new C0615ph(3);

    /* JADX INFO: renamed from: i */
    public static final C0615ph f4856i = new C0615ph(4);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4857d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ph.<clinit>():void] */
    public /* synthetic */ C0615ph(int i) {
        this.f4857d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4857d;
        na1 na1Var = na1.f4229a;
        switch (i) {
            case 0:
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (!c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0616pi.m3085R();
                }
                return na1Var;
            case 1:
                InterfaceC0356ji interfaceC0356ji2 = (InterfaceC0356ji) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C0616pi c0616pi2 = (C0616pi) interfaceC0356ji2;
                if (!c0616pi2.m3082O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0616pi2.m3085R();
                }
                return na1Var;
            case 2:
                InterfaceC0356ji interfaceC0356ji3 = (InterfaceC0356ji) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C0616pi c0616pi3 = (C0616pi) interfaceC0356ji3;
                if (!c0616pi3.m3082O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c0616pi3.m3085R();
                }
                return na1Var;
            case 3:
                InterfaceC0356ji interfaceC0356ji4 = (InterfaceC0356ji) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                C0616pi c0616pi4 = (C0616pi) interfaceC0356ji4;
                if (!c0616pi4.m3082O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c0616pi4.m3085R();
                }
                return na1Var;
            default:
                long j = ((C0207ff) obj2).f1709a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(p30.m2987W(j));
        }
    }
}
