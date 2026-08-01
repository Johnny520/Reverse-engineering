package top.suzhelan.qstory.hook.api;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6644 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6643 f16284;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16285;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6644(C6643 c6643, int i) {
        super(100);
        this.f16285 = i;
        switch (i) {
            case 1:
                this.f16284 = c6643;
                break;
            default:
                this.f16284 = c6643;
                break;
        }
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16285;
        C6643 c6643 = this.f16284;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                C6643.m11789(c6643, methodHookParam);
                break;
            default:
                C6643.m11789(c6643, methodHookParam);
                break;
        }
    }
}
