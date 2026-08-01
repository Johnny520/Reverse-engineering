package p037G2;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: G2.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0501m implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1572d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f1573e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2207p f1574f;

    public /* synthetic */ C0501m(String str, InterfaceC2207p interfaceC2207p, int i5, int i6) {
        this.f1572d = i6;
        this.f1573e = str;
        this.f1574f = interfaceC2207p;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f1572d;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        ((Integer) obj2).getClass();
        switch (i5) {
            case 0:
                AbstractC0489a.m755e(this.f1573e, this.f1574f, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1543P.m2816a(this.f1573e, this.f1574f, interfaceC1373m, AbstractC1385s.m2609A(49));
                break;
            default:
                AbstractC1784a.m3218d(this.f1573e, this.f1574f, interfaceC1373m, AbstractC1385s.m2609A(1));
                break;
        }
        return C0891q.f2780a;
    }
}
