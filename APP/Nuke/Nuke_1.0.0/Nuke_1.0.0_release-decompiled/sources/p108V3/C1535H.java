package p108V3;

import java.util.List;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p037G2.AbstractC0489a;
import p056K2.C0891q;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p179i4.AbstractC2352g;
import p255w.C3372c;

/* JADX INFO: renamed from: V3.H */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1535H implements InterfaceC1604f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5335d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f5336e;

    public /* synthetic */ C1535H(int i5, List list) {
        this.f5335d = i5;
        this.f5336e = list;
    }

    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        int i5 = this.f5335d;
        C3372c c3372c = (C3372c) obj;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i5) {
            case 0:
                AbstractC1665j.m2985e(c3372c, "$this$item");
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC0489a.m765o(null, AbstractC2352g.m4185H(R.string.about_module_project_section, c1383r), AbstractC1848j.m3314c(1577143180, new C1554g(2, this.f5336e), c1383r), c1383r, 384, 1);
                } else {
                    c1383r.m2563R();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1665j.m2985e(c3372c, "$this$item");
                C1383r c1383r2 = (C1383r) interfaceC1373m;
                if (c1383r2.m2560O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC0489a.m765o(null, AbstractC2352g.m4185H(R.string.about_module_thanks_section, c1383r2), AbstractC1848j.m3314c(-1944782165, new C1554g(3, this.f5336e), c1383r2), c1383r2, 384, 1);
                } else {
                    c1383r2.m2563R();
                }
                break;
            default:
                AbstractC1665j.m2985e(c3372c, "$this$item");
                C1383r c1383r3 = (C1383r) interfaceC1373m;
                if (c1383r3.m2560O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC1543P.m2830o(this.f5336e, c1383r3, 0);
                } else {
                    c1383r3.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
