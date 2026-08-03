package p000;

/* JADX INFO: renamed from: ox */
/* JADX INFO: loaded from: classes.dex */
public class C2339ox extends AbstractC2565u implements InterfaceC1497hc {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0190Eb f8210d;

    public C2339ox(InterfaceC0190Eb interfaceC0190Eb, InterfaceC1137ac interfaceC1137ac) {
        super(interfaceC1137ac, true);
        this.f8210d = interfaceC0190Eb;
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
    public void mo2728b(Object obj) {
        AbstractC1406fG.m2711k0(AbstractC0628Oj.m1225E(this.f8210d), AbstractC0714Qj.m1472C(obj));
    }

    @Override // p000.InterfaceC1497hc
    /* JADX INFO: renamed from: c */
    public final InterfaceC1497hc mo1012c() {
        InterfaceC0190Eb interfaceC0190Eb = this.f8210d;
        if (interfaceC0190Eb instanceof InterfaceC1497hc) {
            return (InterfaceC1497hc) interfaceC0190Eb;
        }
        return null;
    }

    @Override // p000.C2152km
    /* JADX INFO: renamed from: g */
    public void mo2729g(Object obj) {
        this.f8210d.mo264f(AbstractC0714Qj.m1472C(obj));
    }
}
