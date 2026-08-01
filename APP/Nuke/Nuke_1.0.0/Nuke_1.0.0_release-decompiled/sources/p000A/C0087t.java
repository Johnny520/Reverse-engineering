package p000A;

import p056K2.C0891q;
import p058L.C0920W;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;

/* JADX INFO: renamed from: A.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0087t implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f394d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0920W f395e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1843e f396f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f397g;

    public /* synthetic */ C0087t(C0920W c0920w, C1843e c1843e, int i5, int i6) {
        this.f394d = i6;
        this.f395e = c0920w;
        this.f396f = c1843e;
        this.f397g = i5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f394d;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        ((Integer) obj2).getClass();
        switch (i5) {
            case 0:
                AbstractC0070k0.m75b(this.f395e, this.f396f, interfaceC1373m, AbstractC1385s.m2609A(this.f397g | 1));
                break;
            default:
                AbstractC0070k0.m76c(this.f395e, this.f396f, interfaceC1373m, AbstractC1385s.m2609A(this.f397g | 1));
                break;
        }
        return C0891q.f2780a;
    }
}
