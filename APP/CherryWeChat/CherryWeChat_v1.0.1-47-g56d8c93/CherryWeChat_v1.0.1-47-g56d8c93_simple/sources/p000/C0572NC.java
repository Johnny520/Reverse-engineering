package p000;

import android.widget.Toast;

/* JADX INFO: renamed from: NC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0572NC implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0701QC f1866b;

    public /* synthetic */ C0572NC(C0701QC r1, int r2) {
        this.f1865a = r2;
        this.f1866b = r1;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r8) {
        int r0 = this.f1865a;
        InterfaceC0190Eb r2 = null;
        C0829TC r3 = C0829TC.f2620a;
        C0701QC r4 = this.f1866b;
        String r82 = (String) r8;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        Toast.makeText(r4.m1432f(), AbstractC0295Gu.m625r(-485670606862389L) + r82, 1).show();
        return r3;
    L6:
        C0183EA.f539a.getClass();
        C0183EA.m382j(r82);
        r4.m1433g(r4.m1432f());
        return r3;
    L8:
        C1498hd r02 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1417fk(r4, r82, r2, 5), 3);
        return r3;
    L10:
        C0183EA.f539a.getClass();
        C0183EA.m382j(r82);
        C1498hd r83 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0615OC(r4, r2, 0), 3);
        return r3;
    }
}
