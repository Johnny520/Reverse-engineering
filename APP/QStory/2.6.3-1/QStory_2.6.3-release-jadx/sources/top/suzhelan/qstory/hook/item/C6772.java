package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6772 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6735 f16483;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16484;

    public /* synthetic */ C6772(C6735 c6735, int i) {
        this.f16484 = i;
        this.f16483 = c6735;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16484;
        C6735 c6735 = this.f16483;
        switch (i) {
            case 0:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c6735.f17770.booleanValue()) {
                    Object[] objArr = methodHookParam.args;
                    if (objArr.length > 2) {
                        objArr[1] = 0L;
                        objArr[2] = 0L;
                    }
                }
                break;
            default:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                if (c6735.f17770.booleanValue()) {
                    Object[] objArr2 = methodHookParam.args;
                    if (objArr2.length > 6) {
                        objArr2[6] = 0;
                    }
                }
                break;
        }
    }
}
