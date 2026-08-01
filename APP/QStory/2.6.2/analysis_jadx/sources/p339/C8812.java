package p339;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import top.suzhelan.qstory.hook.InjectHook;

/* JADX INFO: renamed from: 飘花落叶言苏世楪子哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8812 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InjectHook f24797;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24798;

    public /* synthetic */ C8812(InjectHook injectHook, int i) {
        this.f24798 = i;
        this.f24797 = injectHook;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f24798;
        InjectHook injectHook = this.f24797;
        AbstractC3056.m6668(-3937697365054719399L);
        methodHookParam.getClass();
        switch (i) {
            case 0:
                injectHook.injectOnce(methodHookParam);
                break;
            default:
                injectHook.injectOnce(methodHookParam);
                break;
        }
    }
}
