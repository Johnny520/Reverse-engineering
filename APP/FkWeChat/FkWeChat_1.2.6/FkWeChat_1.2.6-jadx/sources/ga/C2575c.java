package ga;

import ga.AbstractC2578d;
import p010a9.InterfaceC0184l;
import p160kb.InterfaceC4238r;

/* JADX INFO: renamed from: ga.c */
/* JADX INFO: loaded from: classes2.dex */
public class C2575c implements InterfaceC0184l {

    /* JADX INFO: renamed from: q */
    public final AbstractC2578d f6847q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC4238r f6848r;

    public C2575c(AbstractC2578d abstractC2578d, InterfaceC4238r interfaceC4238r) {
        this.f6847q = abstractC2578d;
        this.f6848r = interfaceC4238r;
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public Object mo27m(Object obj) {
        return AbstractC2578d.m9104I(this.f6847q, this.f6848r, (AbstractC2578d.a) obj);
    }
}
