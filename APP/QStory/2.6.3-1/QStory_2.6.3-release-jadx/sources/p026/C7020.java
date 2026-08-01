package p026;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7020 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7019 f17363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f17364;

    public /* synthetic */ C7020(InterfaceC7019 interfaceC7019, int i) {
        this.f17364 = i;
        this.f17363 = interfaceC7019;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f17364) {
            case 1:
                this.f17363.mo9180(methodHookParam);
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f17364) {
            case 0:
                this.f17363.mo9180(methodHookParam);
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
