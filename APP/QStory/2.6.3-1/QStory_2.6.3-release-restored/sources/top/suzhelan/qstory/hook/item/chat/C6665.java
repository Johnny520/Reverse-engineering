package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6665 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6676 f16322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16323;

    public /* synthetic */ C6665(C6676 c6676, int i) {
        this.f16323 = i;
        this.f16322 = c6676;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16323;
        C6676 c6676 = this.f16322;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c6676.f17770.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            default:
                if (c6676.f17770.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
        }
    }
}
