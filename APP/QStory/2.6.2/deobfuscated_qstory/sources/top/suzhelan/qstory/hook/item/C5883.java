package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5883 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5894 f16057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16058;

    public /* synthetic */ C5883(C5894 c5894, int i) {
        this.f16058 = i;
        this.f16057 = c5894;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16058;
        C5894 c5894 = this.f16057;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c5894.f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            default:
                if (c5894.f17376.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
        }
    }
}
