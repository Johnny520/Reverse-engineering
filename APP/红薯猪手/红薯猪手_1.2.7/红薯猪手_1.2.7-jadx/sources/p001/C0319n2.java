package p001;

/* JADX INFO: renamed from: ۟.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0319n2 extends AbstractC0335o4 implements InterfaceC0208f3<Boolean> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0345p1 f988;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ InterfaceC0208f3<C0433vb> f989;

    public C0319n2(C0345p1 c0345p1, C0249i2 c0249i2) {
        this.f988 = c0345p1;
        this.f989 = c0249i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0208f3
    /* JADX INFO: renamed from: ۥ */
    public final Boolean mo7() {
        String str = this.f988.f1747;
        if (str != null && (C0406ta.m1245(str) ^ true)) {
            int i = C0330o.f1000;
            String str2 = this.f988.f1747;
            C0237h4.m865(str2);
            C0330o.m910(str2);
        }
        Boolean bool = this.f988.f1744;
        Boolean bool2 = Boolean.TRUE;
        if (C0237h4.m864(bool, bool2)) {
            int i2 = C0330o.f1000;
            C0330o.m1168();
        } else {
            this.f989.mo7();
        }
        return bool2;
    }
}
