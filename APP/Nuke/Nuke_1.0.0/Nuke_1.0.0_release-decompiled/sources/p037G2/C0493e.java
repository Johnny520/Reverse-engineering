package p037G2;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p095T.InterfaceC1339T0;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p211o0.C2735J;

/* JADX INFO: renamed from: G2.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0493e implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1527d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f1528e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1529f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1339T0 f1530g;

    public /* synthetic */ C0493e(boolean z5, Object obj, InterfaceC1339T0 interfaceC1339T0, int i5) {
        this.f1527d = i5;
        this.f1528e = z5;
        this.f1529f = obj;
        this.f1530g = interfaceC1339T0;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f1527d) {
            case 0:
                InterfaceC1339T0 interfaceC1339T0 = (InterfaceC1339T0) this.f1529f;
                C2735J c2735j = (C2735J) obj;
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4800s(((Number) interfaceC1339T0.getValue()).floatValue());
                c2735j.m4801v(((Number) this.f1530g.getValue()).floatValue());
                c2735j.m4792d(this.f1528e ? 1.0f : 0.62f);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1339T0 interfaceC1339T02 = (InterfaceC1339T0) this.f1529f;
                C2735J c2735j2 = (C2735J) obj;
                AbstractC1665j.m2985e(c2735j2, "$this$graphicsLayer");
                c2735j2.m4792d(this.f1528e ? 1.0f : 0.62f);
                c2735j2.m4800s(((Number) interfaceC1339T02.getValue()).floatValue());
                c2735j2.m4801v(((Number) this.f1530g.getValue()).floatValue());
                break;
            default:
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f1529f;
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f1530g;
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue() || this.f1528e) {
                    interfaceC1601c.mo1h(bool);
                } else {
                    interfaceC1347Y.setValue(Boolean.TRUE);
                }
                return C0891q.f2780a;
        }
        return C0891q.f2780a;
    }
}
