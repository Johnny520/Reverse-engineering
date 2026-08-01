package top.suzhelan.qstory.hook.api;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5813 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5812 f15939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15940;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5813(C5812 c5812, int i) {
        super(100);
        this.f15940 = i;
        switch (i) {
            case 1:
                this.f15939 = c5812;
                break;
            default:
                this.f15939 = c5812;
                break;
        }
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f15940;
        C5812 c5812 = this.f15939;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                C5812.m11173(c5812, methodHookParam);
                break;
            default:
                C5812.m11173(c5812, methodHookParam);
                break;
        }
    }
}
