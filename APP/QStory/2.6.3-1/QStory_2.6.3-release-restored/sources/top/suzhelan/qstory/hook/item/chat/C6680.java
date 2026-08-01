package top.suzhelan.qstory.hook.item.chat;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6680 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6679 f16355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16356;

    public /* synthetic */ C6680(C6679 c6679, int i) {
        this.f16356 = i;
        this.f16355 = c6679;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Intent intent;
        int i = this.f16356;
        C6679 c6679 = this.f16355;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c6679.f17770.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (c6679.f17770.booleanValue()) {
                    Object obj = methodHookParam.thisObject;
                    Activity activity = obj instanceof Activity ? (Activity) obj : null;
                    if (activity != null && (intent = activity.getIntent()) != null) {
                        intent.putExtra("key_is_quality_raw", true);
                        break;
                    }
                }
                break;
        }
    }
}
