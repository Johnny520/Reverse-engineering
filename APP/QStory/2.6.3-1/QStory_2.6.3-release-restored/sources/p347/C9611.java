package p347;

import de.robv.android.xposed.XC_MethodHook;
import top.suzhelan.qstory.hook.InjectHook;

/* JADX INFO: renamed from: 飘花落叶言苏世子兰哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9611 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InjectHook f25080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25081;

    public /* synthetic */ C9611(InjectHook injectHook, int i) {
        this.f25081 = i;
        this.f25080 = injectHook;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f25081;
        InjectHook injectHook = this.f25080;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                injectHook.injectOnce(methodHookParam);
                break;
            default:
                injectHook.injectOnce(methodHookParam);
                break;
        }
    }
}
