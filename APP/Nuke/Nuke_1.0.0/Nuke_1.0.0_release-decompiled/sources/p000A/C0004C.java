package p000A;

import p004A3.AbstractC0156a;
import p056K2.C0891q;
import p058L.C0920W;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;

/* JADX INFO: renamed from: A.C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0004C implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f14d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f15e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f16f;

    public /* synthetic */ C0004C(C0920W c0920w, boolean z5, int i5) {
        this.f16f = c0920w;
        this.f15e = z5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f14d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0070k0.m79f((C0920W) this.f16f, this.f15e, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            default:
                C1843e c1843e = (C1843e) this.f16f;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1385s.m2611a(AbstractC0156a.f563i.mo2399a(this.f15e ? AbstractC0156a.f562h : AbstractC0156a.f561g), c1843e, c1383r, 8);
                } else {
                    c1383r.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0004C(boolean z5, C1843e c1843e) {
        this.f15e = z5;
        this.f16f = c1843e;
    }
}
