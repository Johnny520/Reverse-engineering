package p108V3;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: V3.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1563p implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5437d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1547U f5438e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1601c f5439f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1563p(C1547U c1547u, InterfaceC1601c interfaceC1601c, int i5, int i6) {
        this.f5437d = i6;
        this.f5438e = c1547u;
        this.f5439f = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f5437d;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        ((Integer) obj2).getClass();
        switch (i5) {
            case 0:
                AbstractC1543P.m2805L(this.f5438e, this.f5439f, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1543P.m2804K(this.f5438e, this.f5439f, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            default:
                AbstractC1543P.m2800G(this.f5438e, this.f5439f, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
        }
        return C0891q.f2780a;
    }
}
