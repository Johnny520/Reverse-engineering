package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5915 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5913 f16101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16102;

    public /* synthetic */ C5915(C5913 c5913, int i) {
        this.f16102 = i;
        this.f16101 = c5913;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16102;
        C5913 c5913 = this.f16101;
        AbstractC3056.m6668(-3937697365054719399L);
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c5913.f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 1:
                if (c5913.f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 2:
                if (c5913.f17376.booleanValue()) {
                    methodHookParam.setResult(0);
                }
                break;
            default:
                if (c5913.f17376.booleanValue()) {
                    methodHookParam.setResult(0);
                }
                break;
        }
    }
}
