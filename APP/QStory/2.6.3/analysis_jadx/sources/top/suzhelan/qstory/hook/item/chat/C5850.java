package top.suzhelan.qstory.hook.item.chat;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XC_MethodHook;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5850 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5849 f16010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16011;

    public /* synthetic */ C5850(C5849 c5849, int i) {
        this.f16011 = i;
        this.f16010 = c5849;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Intent intent;
        int i = this.f16011;
        C5849 c5849 = this.f16010;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c5849.f17425.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (c5849.f17425.booleanValue()) {
                    Object obj = methodHookParam.thisObject;
                    Activity activity = obj instanceof Activity ? (Activity) obj : null;
                    if (activity != null && (intent = activity.getIntent()) != null) {
                        intent.putExtra(AbstractC8405.m13972(2136), true);
                        break;
                    }
                }
                break;
        }
    }
}
