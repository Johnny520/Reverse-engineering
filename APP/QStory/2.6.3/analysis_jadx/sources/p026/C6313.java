package p026;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏子楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6313 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6311 f17426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6312 f17427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17428;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6313(AbstractC6311 abstractC6311, InterfaceC6312 interfaceC6312) {
        super(10);
        this.f17428 = 3;
        this.f17426 = abstractC6311;
        this.f17427 = interfaceC6312;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f17428;
        InterfaceC6312 interfaceC6312 = this.f17427;
        AbstractC6311 abstractC6311 = this.f17426;
        switch (i) {
            case 0:
                if (abstractC6311.f17425.booleanValue()) {
                    try {
                        interfaceC6312.mo1479(methodHookParam);
                    } catch (Throwable th) {
                        abstractC6311.getExceptionCollectionToolInstance().m11832(th);
                        return;
                    }
                }
                break;
            case 3:
                if (abstractC6311.f17425.booleanValue()) {
                    try {
                        interfaceC6312.mo1479(methodHookParam);
                    } catch (Throwable th2) {
                        abstractC6311.getExceptionCollectionToolInstance().m11832(th2);
                        return;
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f17428;
        InterfaceC6312 interfaceC6312 = this.f17427;
        AbstractC6311 abstractC6311 = this.f17426;
        switch (i) {
            case 1:
                if (abstractC6311.f17425.booleanValue()) {
                    try {
                        interfaceC6312.mo1479(methodHookParam);
                    } catch (Throwable th) {
                        abstractC6311.getExceptionCollectionToolInstance().m11832(th);
                        return;
                    }
                }
                break;
            case 2:
                if (abstractC6311.f17425.booleanValue()) {
                    try {
                        interfaceC6312.mo1479(methodHookParam);
                    } catch (Throwable th2) {
                        abstractC6311.getExceptionCollectionToolInstance().m11832(th2);
                        return;
                    }
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6313(AbstractC6311 abstractC6311, int i, InterfaceC6312 interfaceC6312) {
        super(i);
        this.f17428 = 2;
        this.f17426 = abstractC6311;
        this.f17427 = interfaceC6312;
    }

    public /* synthetic */ C6313(AbstractC6311 abstractC6311, InterfaceC6312 interfaceC6312, int i) {
        this.f17428 = i;
        this.f17426 = abstractC6311;
        this.f17427 = interfaceC6312;
    }
}
