package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6718 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6729 f16411;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16412;

    public /* synthetic */ C6718(C6729 c6729, int i) {
        this.f16412 = i;
        this.f16411 = c6729;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16412;
        C6729 c6729 = this.f16411;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c6729.f17770.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            default:
                if (c6729.f17770.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
        }
    }
}
