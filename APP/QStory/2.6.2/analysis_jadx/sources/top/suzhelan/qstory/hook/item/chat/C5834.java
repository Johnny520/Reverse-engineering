package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5834 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5833 f15973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15974;

    public /* synthetic */ C5834(C5833 c5833, int i) {
        this.f15974 = i;
        this.f15973 = c5833;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f15974;
        C5833 c5833 = this.f15973;
        AbstractC3056.m6668(-3937697365054719399L);
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c5833.f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            default:
                if (c5833.f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
        }
    }
}
