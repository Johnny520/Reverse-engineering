package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5942 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5905 f16138;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16139;

    public /* synthetic */ C5942(C5905 c5905, int i) {
        this.f16139 = i;
        this.f16138 = c5905;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16139;
        C5905 c5905 = this.f16138;
        switch (i) {
            case 0:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c5905.f17425.booleanValue()) {
                    Object[] objArr = methodHookParam.args;
                    if (objArr.length > 2) {
                        objArr[1] = 0L;
                        objArr[2] = 0L;
                    }
                }
                break;
            default:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c5905.f17425.booleanValue()) {
                    Object[] objArr2 = methodHookParam.args;
                    if (objArr2.length > 6) {
                        objArr2[6] = 0;
                    }
                }
                break;
        }
    }
}
