package top.suzhelan.qstory.hook.api;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5818 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5817 f15950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15951;

    public /* synthetic */ C5818(C5817 c5817, int i) {
        this.f15951 = i;
        this.f15950 = c5817;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f15951;
        C5817 c5817 = this.f15950;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                C5817.m11175(c5817, methodHookParam);
                break;
            default:
                C5817.m11175(c5817, methodHookParam);
                break;
        }
    }
}
