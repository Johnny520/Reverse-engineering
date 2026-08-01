package p094v0;

import p009E0.C0109i;
import p022L.AbstractC0174d;
import p025M0.InterfaceC0204l;
import p025M0.InterfaceC0208p;
import p027N0.AbstractC0223g;
import p070i0.AbstractC0731a;
import p102z0.C1133p;

/* JADX INFO: renamed from: v0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1026a implements InterfaceC0208p, InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f3638a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0208p
    /* JADX INFO: renamed from: a */
    public Object mo248a(Object obj, Object obj2) {
        AbstractC0731a.m1386c(AbstractC0174d.m351g(((Integer) obj).intValue(), "onFetch retry:"), this.f3638a);
        return C0109i.f404a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) {
        C1133p c1133p = (C1133p) obj;
        AbstractC0223g.m418e(c1133p, "it");
        return Boolean.valueOf(AbstractC0223g.m414a(c1133p.f3820b, this.f3638a));
    }
}
