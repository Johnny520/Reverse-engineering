package p000a;

import p000a.C0384V4;

/* JADX INFO: renamed from: a.l5 */
/* JADX INFO: loaded from: classes.dex */
public class C0684l5 extends C0384V4 {

    /* JADX INFO: renamed from: m */
    public int f2547m;

    public C0684l5(AbstractC0639ih abstractC0639ih) {
        super(abstractC0639ih);
        if (abstractC0639ih instanceof C0191K8) {
            this.f1447e = C0384V4.a.f1456b;
        } else {
            this.f1447e = C0384V4.a.f1457c;
        }
    }

    @Override // p000a.C0384V4
    /* JADX INFO: renamed from: d */
    public final void mo1014d(int i) {
        if (this.f1452j) {
            return;
        }
        this.f1452j = true;
        this.f1449g = i;
        for (InterfaceC0348T4 interfaceC0348T4 : this.f1453k) {
            interfaceC0348T4.mo521a(interfaceC0348T4);
        }
    }
}
