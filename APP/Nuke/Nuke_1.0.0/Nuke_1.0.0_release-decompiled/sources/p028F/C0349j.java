package p028F;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;
import p169h0.InterfaceC2207p;

/* JADX INFO: renamed from: F.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0349j implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1102d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2207p f1103e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1843e f1104f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1105g;

    public /* synthetic */ C0349j(InterfaceC2207p interfaceC2207p, C1843e c1843e, int i5, int i6) {
        this.f1102d = i6;
        this.f1103e = interfaceC2207p;
        this.f1104f = c1843e;
        this.f1105g = i5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f1102d;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        ((Integer) obj2).getClass();
        switch (i5) {
            case 0:
                AbstractC0350k.m559c(this.f1103e, this.f1104f, interfaceC1373m, AbstractC1385s.m2609A(this.f1105g | 1));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC0350k.m560d(this.f1103e, this.f1104f, interfaceC1373m, AbstractC1385s.m2609A(this.f1105g | 1));
                break;
            case 2:
                AbstractC0355p.m566d(this.f1103e, this.f1104f, interfaceC1373m, AbstractC1385s.m2609A(this.f1105g | 1));
                break;
            case 3:
                AbstractC0350k.m558b(this.f1103e, this.f1104f, interfaceC1373m, AbstractC1385s.m2609A(this.f1105g | 1));
                break;
            default:
                AbstractC0350k.m557a(this.f1103e, this.f1104f, interfaceC1373m, AbstractC1385s.m2609A(this.f1105g | 1));
                break;
        }
        return C0891q.f2780a;
    }
}
