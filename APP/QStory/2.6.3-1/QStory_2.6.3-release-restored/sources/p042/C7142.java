package p042;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏子楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7142 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7140 f17771;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7141 f17772;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17773;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7142(AbstractC7140 abstractC7140, InterfaceC7141 interfaceC7141) {
        super(10);
        this.f17773 = 3;
        this.f17771 = abstractC7140;
        this.f17772 = interfaceC7141;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f17773;
        InterfaceC7141 interfaceC7141 = this.f17772;
        AbstractC7140 abstractC7140 = this.f17771;
        switch (i) {
            case 0:
                if (abstractC7140.f17770.booleanValue()) {
                    try {
                        interfaceC7141.mo2039(methodHookParam);
                    } catch (Throwable th) {
                        abstractC7140.getExceptionCollectionToolInstance().m12391(th);
                        return;
                    }
                }
                break;
            case 3:
                if (abstractC7140.f17770.booleanValue()) {
                    try {
                        interfaceC7141.mo2039(methodHookParam);
                    } catch (Throwable th2) {
                        abstractC7140.getExceptionCollectionToolInstance().m12391(th2);
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
        int i = this.f17773;
        InterfaceC7141 interfaceC7141 = this.f17772;
        AbstractC7140 abstractC7140 = this.f17771;
        switch (i) {
            case 1:
                if (abstractC7140.f17770.booleanValue()) {
                    try {
                        interfaceC7141.mo2039(methodHookParam);
                    } catch (Throwable th) {
                        abstractC7140.getExceptionCollectionToolInstance().m12391(th);
                        return;
                    }
                }
                break;
            case 2:
                if (abstractC7140.f17770.booleanValue()) {
                    try {
                        interfaceC7141.mo2039(methodHookParam);
                    } catch (Throwable th2) {
                        abstractC7140.getExceptionCollectionToolInstance().m12391(th2);
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
    public C7142(AbstractC7140 abstractC7140, int i, InterfaceC7141 interfaceC7141) {
        super(i);
        this.f17773 = 2;
        this.f17771 = abstractC7140;
        this.f17772 = interfaceC7141;
    }

    public /* synthetic */ C7142(AbstractC7140 abstractC7140, InterfaceC7141 interfaceC7141, int i) {
        this.f17773 = i;
        this.f17771 = abstractC7140;
        this.f17772 = interfaceC7141;
    }
}
