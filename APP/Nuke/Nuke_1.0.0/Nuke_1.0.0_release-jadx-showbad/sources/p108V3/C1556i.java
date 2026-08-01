package p108V3;

import p037G2.AbstractC0489a;
import p037G2.C0480H;
import p056K2.C0891q;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p136b0.AbstractC1848j;
import p136b0.C1843e;

/* JADX INFO: renamed from: V3.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1556i implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5411d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1601c f5412e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f5413f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1556i(InterfaceC1601c interfaceC1601c, boolean z5) {
        this.f5412e = interfaceC1601c;
        this.f5413f = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f5411d;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i5) {
            case 0:
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0489a.m767q(this.f5413f, this.f5412e, null, false, 0, c1383r, 0, 60);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                C1383r c1383r2 = (C1383r) interfaceC1373m;
                if (c1383r2.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z5 = this.f5413f;
                    InterfaceC1601c interfaceC1601c = this.f5412e;
                    C1843e c1843eM3314c = AbstractC1848j.m3314c(-1132215453, new C1556i(z5, interfaceC1601c), c1383r2);
                    boolean zM2582f = c1383r2.m2582f(interfaceC1601c) | c1383r2.m2584g(z5);
                    Object objM2558L = c1383r2.m2558L();
                    if (zM2582f || objM2558L == C1371l.f4833a) {
                        objM2558L = new C0480H(interfaceC1601c, z5);
                        c1383r2.m2585g0(objM2558L);
                    }
                    AbstractC0489a.m766p("安全模式", null, "在不稳定环境中保守加载模块能力。", AbstractC1550c.f5395b, c1843eM3314c, false, (InterfaceC1599a) objM2558L, c1383r2, 28038, 34);
                } else {
                    c1383r2.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1556i(boolean z5, InterfaceC1601c interfaceC1601c) {
        this.f5413f = z5;
        this.f5412e = interfaceC1601c;
    }
}
