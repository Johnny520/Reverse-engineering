package p037G2;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;
import p169h0.InterfaceC2207p;
import p260x.AbstractC3429l;
import p260x.C3396B;

/* JADX INFO: renamed from: G2.E */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0477E implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1409d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1410e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1411f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1412g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1413h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1414i;

    public /* synthetic */ C0477E(InterfaceC2207p interfaceC2207p, String str, Object obj, int i5, int i6, int i7) {
        this.f1409d = i7;
        this.f1410e = interfaceC2207p;
        this.f1411f = str;
        this.f1414i = obj;
        this.f1412g = i5;
        this.f1413h = i6;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1409d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0489a.m765o((InterfaceC2207p) this.f1410e, (String) this.f1411f, (C1843e) this.f1414i, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f1412g | 1), this.f1413h);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((Integer) obj2).getClass();
                AbstractC1543P.m2834s((InterfaceC2207p) this.f1410e, (String) this.f1411f, (String) this.f1414i, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f1412g | 1), this.f1413h);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC3429l.m5689b(this.f1410e, this.f1412g, (C3396B) this.f1411f, (C1843e) this.f1414i, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f1413h | 1));
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0477E(Object obj, int i5, C3396B c3396b, C1843e c1843e, int i6) {
        this.f1409d = 2;
        this.f1410e = obj;
        this.f1412g = i5;
        this.f1411f = c3396b;
        this.f1414i = c1843e;
        this.f1413h = i6;
    }
}
