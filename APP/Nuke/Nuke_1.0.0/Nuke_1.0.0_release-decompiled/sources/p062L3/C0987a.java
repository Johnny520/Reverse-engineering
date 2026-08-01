package p062L3;

import android.view.ViewGroup;
import me.dartcv.nuke.BuildConfig;
import p000A.C0010F;
import p000A.C0073m;
import p004A3.AbstractC0159d;
import p045H4.AbstractC0653e;
import p056K2.C0891q;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p136b0.AbstractC1848j;

/* JADX INFO: renamed from: L3.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0987a implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3055d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f3056e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1675t f3057f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ViewGroup f3058g;

    public /* synthetic */ C0987a(String str, C1675t c1675t, ViewGroup viewGroup, int i5) {
        this.f3055d = i5;
        this.f3056e = str;
        this.f3057f = c1675t;
        this.f3058g = viewGroup;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        int i5 = this.f3055d;
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i5) {
            case 0:
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C1675t c1675t = this.f3057f;
                    ViewGroup viewGroup = this.f3058g;
                    AbstractC1784a.m3215b(this.f3056e, new C0073m(10, c1675t, viewGroup), new C0010F(3, c1675t, viewGroup), c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C1383r c1383r2 = (C1383r) interfaceC1373m;
                if (c1383r2.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0159d.m228a(false, false, AbstractC1848j.m3314c(-1670108417, new C0987a(this.f3056e, this.f3057f, this.f3058g, 2), c1383r2), c1383r2, 384, 3);
                } else {
                    c1383r2.m2563R();
                }
                break;
            default:
                C1383r c1383r3 = (C1383r) interfaceC1373m;
                if (c1383r3.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0653e.m1126b(false, 0L, AbstractC1848j.m3314c(964348900, new C0987a(this.f3056e, this.f3057f, this.f3058g, 0), c1383r3), c1383r3, 384);
                } else {
                    c1383r3.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
