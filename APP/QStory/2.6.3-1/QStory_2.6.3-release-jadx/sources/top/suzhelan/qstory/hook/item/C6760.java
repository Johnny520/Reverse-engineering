package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6760 extends XC_MethodReplacement {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16465 = 0;

    public /* synthetic */ C6760() {
    }

    public final Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i = this.f16465;
        AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        methodHookParam.getClass();
        switch (i) {
            case 0:
                return null;
            default:
                return Boolean.FALSE;
        }
    }

    public C6760(C6715 c6715) {
    }
}
