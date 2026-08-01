package androidx.fragment.app;

import android.os.Bundle;
import p004C.C0066j;
import p024M.C0190d;
import p048a.InterfaceC0366b;
import p061e.AbstractActivityC0533i;
import p061e.AbstractC0535k;

/* JADX INFO: renamed from: androidx.fragment.app.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0436n implements InterfaceC0366b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1392a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractActivityC0533i f1393b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0436n(AbstractActivityC0533i abstractActivityC0533i, int i2) {
        this.f1392a = i2;
        this.f1393b = abstractActivityC0533i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p048a.InterfaceC0366b
    /* JADX INFO: renamed from: a */
    public final void mo629a() {
        switch (this.f1392a) {
            case 0:
                AbstractActivityC0533i abstractActivityC0533i = this.f1393b;
                C0066j c0066j = abstractActivityC0533i.f1749p;
                C0437o c0437o = (C0437o) c0066j.f312c;
                c0437o.f1397g.m879b(c0437o, c0437o, null);
                Bundle bundleM395c = ((C0190d) abstractActivityC0533i.f895f.f547d).m395c("android:support:fragments");
                if (bundleM395c != null) {
                    ((C0437o) c0066j.f312c).f1397g.m870N(bundleM395c.getParcelable("android:support:fragments"));
                }
                break;
            default:
                AbstractActivityC0533i abstractActivityC0533i2 = this.f1393b;
                AbstractC0535k abstractC0535kM1072i = abstractActivityC0533i2.m1072i();
                abstractC0535kM1072i.mo1083a();
                ((C0190d) abstractActivityC0533i2.f895f.f547d).m395c("androidx:appcompat");
                abstractC0535kM1072i.mo1085c();
                break;
        }
    }
}
