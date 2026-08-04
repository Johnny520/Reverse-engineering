package yyds;

/* JADX INFO: renamed from: yyds.ᛷᛸᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1612 extends AbstractC0191 implements InterfaceC1431 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final InterfaceC0274 f8219;

    public C1612(InterfaceC2213 interfaceC2213, InterfaceC0274 interfaceC0274) {
        super(interfaceC2213, true);
        this.f8219 = interfaceC0274;
    }

    @Override // yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛱᛸᲁᲇ */
    public final boolean mo2144() {
        return true;
    }

    @Override // yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public void mo2147(Object obj) {
        this.f8219.mo812(AbstractC0476.m1328(obj));
    }

    @Override // yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public void mo1619(Object obj) {
        AbstractC0427.m1189(AbstractC0476.m1328(obj), AbstractC1367.m2783(this.f8219));
    }

    @Override // yyds.InterfaceC1431
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final InterfaceC1431 mo1008() {
        InterfaceC0274 interfaceC0274 = this.f8219;
        if (interfaceC0274 instanceof InterfaceC1431) {
            return (InterfaceC1431) interfaceC0274;
        }
        return null;
    }
}
