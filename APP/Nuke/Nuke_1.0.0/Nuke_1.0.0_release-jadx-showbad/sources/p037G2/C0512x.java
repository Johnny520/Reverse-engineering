package p037G2;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p095T.InterfaceC1339T0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.C2010f;
import p211o0.C2735J;

/* JADX INFO: renamed from: G2.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0512x implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1636d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1339T0 f1637e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1339T0 f1638f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0512x(InterfaceC1339T0 interfaceC1339T0, InterfaceC1339T0 interfaceC1339T02, int i5) {
        this.f1636d = i5;
        this.f1637e = interfaceC1339T0;
        this.f1638f = interfaceC1339T02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        C2735J c2735j = (C2735J) obj;
        switch (this.f1636d) {
            case 0:
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4799n(((Number) this.f1637e.getValue()).floatValue());
                InterfaceC1339T0 interfaceC1339T0 = this.f1638f;
                c2735j.m4800s(((Number) interfaceC1339T0.getValue()).floatValue());
                c2735j.m4801v(((Number) interfaceC1339T0.getValue()).floatValue());
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4800s(((Number) this.f1637e.getValue()).floatValue());
                c2735j.m4801v(((Number) this.f1638f.getValue()).floatValue());
                break;
            default:
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4790D(c2735j.f8696t.mo272b() * ((C2010f) this.f1637e.getValue()).f6732d);
                InterfaceC1339T0 interfaceC1339T02 = this.f1638f;
                c2735j.m4800s(((Number) interfaceC1339T02.getValue()).floatValue());
                c2735j.m4801v(((Number) interfaceC1339T02.getValue()).floatValue());
                break;
        }
        return C0891q.f2780a;
    }
}
