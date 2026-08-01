package top.suzhelan.qstory.hook.api;

import de.robv.android.xposed.XC_MethodHook;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5814 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5813 f15939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15940;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5814(C5813 c5813, int i) {
        super(100);
        this.f15940 = i;
        switch (i) {
            case 1:
                this.f15939 = c5813;
                break;
            default:
                this.f15939 = c5813;
                break;
        }
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f15940;
        C5813 c5813 = this.f15939;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        methodHookParam.getClass();
        switch (i) {
            case 0:
                C5813.m11230(c5813, methodHookParam);
                break;
            default:
                C5813.m11230(c5813, methodHookParam);
                break;
        }
    }
}
