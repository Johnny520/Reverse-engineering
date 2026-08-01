package top.suzhelan.qstory.hook.api;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6649 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6648 f16295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16296;

    public /* synthetic */ C6649(C6648 c6648, int i) {
        this.f16296 = i;
        this.f16295 = c6648;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16296;
        C6648 c6648 = this.f16295;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                C6648.m11791(c6648, methodHookParam);
                break;
            default:
                C6648.m11791(c6648, methodHookParam);
                break;
        }
    }
}
