package top.suzhelan.qstory.hook.api;

import de.robv.android.xposed.XC_MethodHook;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5819 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5818 f15950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15951;

    public /* synthetic */ C5819(C5818 c5818, int i) {
        this.f15951 = i;
        this.f15950 = c5818;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f15951;
        C5818 c5818 = this.f15950;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        methodHookParam.getClass();
        switch (i) {
            case 0:
                C5818.m11232(c5818, methodHookParam);
                break;
            default:
                C5818.m11232(c5818, methodHookParam);
                break;
        }
    }
}
