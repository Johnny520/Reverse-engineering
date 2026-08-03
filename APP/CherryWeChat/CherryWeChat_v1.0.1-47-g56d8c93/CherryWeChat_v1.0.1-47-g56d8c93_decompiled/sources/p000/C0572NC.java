package p000;

import android.widget.Toast;

/* JADX INFO: renamed from: NC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0572NC implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0701QC f1866b;

    public /* synthetic */ C0572NC(C0701QC c0701qc, int i) {
        this.f1865a = i;
        this.f1866b = c0701qc;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        int i = this.f1865a;
        InterfaceC0190Eb interfaceC0190Eb = null;
        C0829TC c0829tc = C0829TC.f2620a;
        C0701QC c0701qc = this.f1866b;
        String str = (String) obj;
        switch (i) {
            case 0:
                C0183EA.f539a.getClass();
                C0183EA.m382j(str);
                C1498hd c1498hd = AbstractC1499he.f5282a;
                AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0615OC(c0701qc, interfaceC0190Eb, 0), 3);
                break;
            case 1:
                C1498hd c1498hd2 = AbstractC1499he.f5282a;
                AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1417fk(c0701qc, str, interfaceC0190Eb, 5), 3);
                break;
            case 2:
                C0183EA.f539a.getClass();
                C0183EA.m382j(str);
                c0701qc.m1433g(c0701qc.m1432f());
                break;
            default:
                Toast.makeText(c0701qc.m1432f(), AbstractC0295Gu.m625r(-485670606862389L) + str, 1).show();
                break;
        }
        return c0829tc;
    }
}
