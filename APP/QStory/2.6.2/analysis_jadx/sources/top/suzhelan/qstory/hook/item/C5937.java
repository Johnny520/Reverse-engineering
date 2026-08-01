package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5937 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5936 f16129;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16130;

    public /* synthetic */ C5937(C5936 c5936, int i) {
        this.f16130 = i;
        this.f16129 = c5936;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16130;
        C5936 c5936 = this.f16129;
        switch (i) {
            case 0:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                if (c5936.f17376.booleanValue()) {
                    Object[] objArr = methodHookParam.args;
                    if (objArr.length > 2) {
                        objArr[1] = 0L;
                        objArr[2] = 0L;
                    }
                }
                break;
            default:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                if (c5936.f17376.booleanValue()) {
                    Object[] objArr2 = methodHookParam.args;
                    if (objArr2.length > 6) {
                        objArr2[6] = 0;
                    }
                }
                break;
        }
    }
}
