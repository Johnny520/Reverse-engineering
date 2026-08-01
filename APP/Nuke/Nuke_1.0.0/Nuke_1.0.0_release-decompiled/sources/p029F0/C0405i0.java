package p029F0;

import me.dartcv.nuke.BuildConfig;
import p041H0.InterfaceC0614q0;
import p047I0.AbstractC0757q0;
import p047I0.C0714b0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.C0891q;
import p056K2.InterfaceC0877c;
import p095T.AbstractC1385s;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p169h0.InterfaceC2207p;
import p170h1.AbstractC2219j;

/* JADX INFO: renamed from: F0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0405i0 extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1229e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0877c f1230f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f1231g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1232h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0405i0(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, C0714b0 c0714b0, InterfaceC1603e interfaceC1603e) {
        super(2);
        this.f1229e = 1;
        this.f1231g = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f1232h = c0714b0;
        this.f1230f = interfaceC1603e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1229e) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0435z.m688a((C0413m0) this.f1231g, (InterfaceC2207p) this.f1232h, (InterfaceC1603e) this.f1230f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(9));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0757q0.m1271a((ViewTreeObserverOnGlobalLayoutListenerC0772y) this.f1231g, (C0714b0) this.f1232h, (InterfaceC1603e) this.f1230f, c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC0757q0.m1271a((InterfaceC0614q0) this.f1231g, (C0714b0) this.f1232h, (InterfaceC1603e) this.f1230f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC2219j.m4029a((InterfaceC1601c) this.f1231g, (InterfaceC2207p) this.f1232h, (InterfaceC1601c) this.f1230f, (InterfaceC1373m) obj, AbstractC1385s.m2609A(7));
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0405i0(Object obj, Object obj2, InterfaceC0877c interfaceC0877c, int i5, int i6) {
        super(2);
        this.f1229e = i6;
        this.f1231g = obj;
        this.f1232h = obj2;
        this.f1230f = interfaceC0877c;
    }
}
