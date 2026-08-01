package p026;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: 飘花落叶言世哲兰苏楪子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6295 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6293 f17377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6294 f17378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17379;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6295(AbstractC6293 abstractC6293, InterfaceC6294 interfaceC6294) {
        super(10);
        this.f17379 = 3;
        this.f17377 = abstractC6293;
        this.f17378 = interfaceC6294;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f17379;
        InterfaceC6294 interfaceC6294 = this.f17378;
        AbstractC6293 abstractC6293 = this.f17377;
        switch (i) {
            case 0:
                if (abstractC6293.f17376.booleanValue()) {
                    try {
                        interfaceC6294.mo1469(methodHookParam);
                    } catch (Throwable th) {
                        abstractC6293.getExceptionCollectionToolInstance().m11804(th);
                        return;
                    }
                }
                break;
            case 3:
                if (abstractC6293.f17376.booleanValue()) {
                    try {
                        interfaceC6294.mo1469(methodHookParam);
                    } catch (Throwable th2) {
                        abstractC6293.getExceptionCollectionToolInstance().m11804(th2);
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
        int i = this.f17379;
        InterfaceC6294 interfaceC6294 = this.f17378;
        AbstractC6293 abstractC6293 = this.f17377;
        switch (i) {
            case 1:
                if (abstractC6293.f17376.booleanValue()) {
                    try {
                        interfaceC6294.mo1469(methodHookParam);
                    } catch (Throwable th) {
                        abstractC6293.getExceptionCollectionToolInstance().m11804(th);
                        return;
                    }
                }
                break;
            case 2:
                if (abstractC6293.f17376.booleanValue()) {
                    try {
                        interfaceC6294.mo1469(methodHookParam);
                    } catch (Throwable th2) {
                        abstractC6293.getExceptionCollectionToolInstance().m11804(th2);
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
    public C6295(AbstractC6293 abstractC6293, int i, InterfaceC6294 interfaceC6294) {
        super(i);
        this.f17379 = 2;
        this.f17377 = abstractC6293;
        this.f17378 = interfaceC6294;
    }

    public /* synthetic */ C6295(AbstractC6293 abstractC6293, InterfaceC6294 interfaceC6294, int i) {
        this.f17379 = i;
        this.f17377 = abstractC6293;
        this.f17378 = interfaceC6294;
    }
}
