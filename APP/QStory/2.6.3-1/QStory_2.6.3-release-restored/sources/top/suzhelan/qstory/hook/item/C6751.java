package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6751 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6749 f16455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16456;

    public /* synthetic */ C6751(C6749 c6749, int i) {
        this.f16456 = i;
        this.f16455 = c6749;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16456;
        C6749 c6749 = this.f16455;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c6749.f17770.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 1:
                if (c6749.f17770.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 2:
                if (c6749.f17770.booleanValue()) {
                    methodHookParam.setResult(0);
                }
                break;
            default:
                if (c6749.f17770.booleanValue()) {
                    methodHookParam.setResult(0);
                }
                break;
        }
    }
}
