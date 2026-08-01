package p040d0;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p056e0.AbstractC1963b;
import p056e0.C1964c;
import p056e0.C1967f;
import p117i.C3076o0;

/* JADX INFO: renamed from: d0.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1848a {

    /* JADX INFO: renamed from: a */
    public final C3076o0 f4893a;

    /* JADX INFO: renamed from: b */
    public final C3076o0 f4894b;

    public C1848a() {
        int i10 = 0;
        int i11 = 1;
        AbstractC1043k abstractC1043k = null;
        this.f4893a = new C3076o0(i10, i11, abstractC1043k);
        this.f4894b = new C3076o0(i10, i11, abstractC1043k);
    }

    /* JADX INFO: renamed from: a */
    public final void m6540a(AbstractC1963b abstractC1963b) {
        this.f4893a.m11461n(abstractC1963b);
    }

    /* JADX INFO: renamed from: b */
    public final void m6541b(InterfaceC0184l interfaceC0184l) {
        this.f4894b.m11461n(interfaceC0184l);
    }

    /* JADX INFO: renamed from: c */
    public final C1964c m6542c() {
        C3076o0 c3076o0 = new C3076o0(0, 1, false ? 1 : 0);
        C3076o0 c3076o02 = this.f4893a;
        Object[] objArr = c3076o02.f8235a;
        int i10 = c3076o02.f8236b;
        int i11 = 0;
        boolean z10 = true;
        AbstractC1963b abstractC1963b = null;
        while (i11 < i10) {
            AbstractC1963b abstractC1963b2 = (AbstractC1963b) objArr[i11];
            if (!z10 || abstractC1963b2 != C1967f.f5481b) {
                if (AbstractC1849b.m6544a(abstractC1963b2) && AbstractC1849b.m6544a(abstractC1963b)) {
                    z10 = false;
                    break;
                    break;
                }
                if (!AbstractC1849b.m6544a(abstractC1963b2)) {
                    C3076o0 c3076o03 = this.f4894b;
                    Object[] objArr2 = c3076o03.f8235a;
                    int i12 = c3076o03.f8236b;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (!((Boolean) ((InterfaceC0184l) objArr2[i13]).mo27m(abstractC1963b2)).booleanValue()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                c3076o0.m11461n(abstractC1963b2);
                z10 = false;
                abstractC1963b = abstractC1963b2;
            }
            i11++;
            z10 = z10;
        }
        if (AbstractC1849b.m6544a((AbstractC1963b) (c3076o0.m11589g() ? null : c3076o0.f8235a[c3076o0.f8236b - 1]))) {
            c3076o0.m11454B(c3076o0.f8236b - 1);
        }
        return new C1964c(c3076o0.m11466s());
    }

    /* JADX INFO: renamed from: d */
    public final void m6543d() {
        this.f4893a.m11461n(C1967f.f5481b);
    }
}
