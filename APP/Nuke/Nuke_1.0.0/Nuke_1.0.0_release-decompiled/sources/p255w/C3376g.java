package p255w;

import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: w.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3376g implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10491d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3377h f10492e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f10493f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f10494g;

    public /* synthetic */ C3376g(int i5, Object obj, C3377h c3377h) {
        this.f10492e = c3377h;
        this.f10493f = i5;
        this.f10494g = obj;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        Integer num = (Integer) obj2;
        switch (this.f10491d) {
            case 0:
                num.getClass();
                this.f10492e.m5609a(this.f10493f, this.f10494g, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            default:
                int iIntValue = num.intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f10492e.m5609a(this.f10493f, this.f10494g, c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C3376g(C3377h c3377h, int i5, Object obj, int i6) {
        this.f10492e = c3377h;
        this.f10493f = i5;
        this.f10494g = obj;
    }
}
