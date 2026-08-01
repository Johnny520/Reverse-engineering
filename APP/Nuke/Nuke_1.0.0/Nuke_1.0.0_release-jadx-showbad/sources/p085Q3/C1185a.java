package p085Q3;

import me.dartcv.nuke.BuildConfig;
import nuke.p209ui.HomeActivity;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p099T3.C1427f;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: Q3.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1185a implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3872d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f3873e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3874f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f3875g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3876h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1185a(C1427f c1427f, boolean z5, InterfaceC1601c interfaceC1601c, InterfaceC1599a interfaceC1599a, int i5) {
        this.f3872d = 2;
        this.f3874f = c1427f;
        this.f3873e = z5;
        this.f3875g = interfaceC1601c;
        this.f3876h = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f3872d) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return HomeActivity.m4779k(this.f3873e, (HomeActivity) this.f3874f, (InterfaceC1347Y) this.f3875g, (InterfaceC1347Y) this.f3876h, (InterfaceC1373m) obj, iIntValue);
            case BuildConfig.VERSION_CODE /* 1 */:
                int iIntValue2 = ((Integer) obj2).intValue();
                return HomeActivity.m4775g(this.f3873e, (HomeActivity) this.f3874f, (InterfaceC1347Y) this.f3875g, (InterfaceC1347Y) this.f3876h, (InterfaceC1373m) obj, iIntValue2);
            default:
                ((Integer) obj2).getClass();
                int iM2609A = AbstractC1385s.m2609A(1);
                AbstractC1543P.m2819d((C1427f) this.f3874f, this.f3873e, (InterfaceC1601c) this.f3875g, (InterfaceC1599a) this.f3876h, (InterfaceC1373m) obj, iM2609A);
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1185a(boolean z5, HomeActivity homeActivity, InterfaceC1347Y interfaceC1347Y, InterfaceC1347Y interfaceC1347Y2, int i5) {
        this.f3872d = i5;
        this.f3873e = z5;
        this.f3874f = homeActivity;
        this.f3875g = interfaceC1347Y;
        this.f3876h = interfaceC1347Y2;
    }
}
