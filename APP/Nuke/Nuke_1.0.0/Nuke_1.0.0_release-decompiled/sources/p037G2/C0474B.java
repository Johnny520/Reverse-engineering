package p037G2;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p095T.InterfaceC1339T0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p211o0.C2735J;

/* JADX INFO: renamed from: G2.B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0474B implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1402d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1339T0 f1403e;

    public /* synthetic */ C0474B(InterfaceC1339T0 interfaceC1339T0, int i5) {
        this.f1402d = i5;
        this.f1403e = interfaceC1339T0;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        C2735J c2735j = (C2735J) obj;
        switch (this.f1402d) {
            case 0:
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                InterfaceC1339T0 interfaceC1339T0 = this.f1403e;
                c2735j.m4800s(((Number) interfaceC1339T0.getValue()).floatValue());
                c2735j.m4801v(((Number) interfaceC1339T0.getValue()).floatValue());
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4792d(((Number) this.f1403e.getValue()).floatValue());
                break;
            case 2:
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4792d(((Number) this.f1403e.getValue()).floatValue());
                break;
            case 3:
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4792d(((Number) this.f1403e.getValue()).floatValue());
                break;
            case 4:
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4792d(((Number) this.f1403e.getValue()).floatValue());
                break;
            case 5:
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4792d(((Number) this.f1403e.getValue()).floatValue());
                break;
            default:
                AbstractC1665j.m2985e(c2735j, "$this$graphicsLayer");
                c2735j.m4792d(((Number) this.f1403e.getValue()).floatValue());
                break;
        }
        return C0891q.f2780a;
    }
}
