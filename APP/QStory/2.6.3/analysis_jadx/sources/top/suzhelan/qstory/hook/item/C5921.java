package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5921 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5919 f16110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16111;

    public /* synthetic */ C5921(C5919 c5919, int i) {
        this.f16111 = i;
        this.f16110 = c5919;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16111;
        C5919 c5919 = this.f16110;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c5919.f17425.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 1:
                if (c5919.f17425.booleanValue()) {
                    methodHookParam.setResult((Object) null);
                }
                break;
            case 2:
                if (c5919.f17425.booleanValue()) {
                    methodHookParam.setResult(0);
                }
                break;
            default:
                if (c5919.f17425.booleanValue()) {
                    methodHookParam.setResult(0);
                }
                break;
        }
    }
}
