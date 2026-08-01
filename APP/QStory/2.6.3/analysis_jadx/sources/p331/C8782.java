package p331;

import de.robv.android.xposed.XC_MethodHook;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.InjectHook;

/* JADX INFO: renamed from: 飘花落叶言苏世子兰哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8782 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InjectHook f24735;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24736;

    public /* synthetic */ C8782(InjectHook injectHook, int i) {
        this.f24736 = i;
        this.f24735 = injectHook;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f24736;
        InjectHook injectHook = this.f24735;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
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
