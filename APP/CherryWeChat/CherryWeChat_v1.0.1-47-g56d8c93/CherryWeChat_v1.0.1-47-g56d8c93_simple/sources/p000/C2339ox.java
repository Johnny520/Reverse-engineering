package p000;

/* JADX INFO: renamed from: ox */
/* JADX INFO: loaded from: classes.dex */
public class C2339ox extends AbstractC2565u implements InterfaceC1497hc {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0190Eb f8210d;

    public C2339ox(InterfaceC0190Eb r2, InterfaceC1137ac r3) {
        super(r3, true);
        this.f8210d = r2;
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: D */
    public final boolean mo4346D() {
        return true;
    }

    /* JADX INFO: renamed from: O */
    public void mo4745O() {
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: b */
    public void mo2728b(Object r2) {
        AbstractC1406fG.m2711k0(AbstractC0628Oj.m1225E(this.f8210d), AbstractC0714Qj.m1472C(r2));
    }

    @Override // p000.InterfaceC1497hc
    /* JADX INFO: renamed from: c */
    public final InterfaceC1497hc mo1012c() {
        InterfaceC0190Eb r0 = this.f8210d;
        if ((r0 instanceof InterfaceC1497hc) == true) goto L5;
        return null;
    L5:
        return (InterfaceC1497hc) r0;
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: g */
    public void mo2729g(Object r2) {
        this.f8210d.mo264f(AbstractC0714Qj.m1472C(r2));
    }
}
