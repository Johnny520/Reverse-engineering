package top.suzhelan.qstory.hook.item.chat;

import android.app.Activity;
import android.content.Intent;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5845 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5844 f16003;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16004;

    public /* synthetic */ C5845(C5844 c5844, int i) {
        this.f16004 = i;
        this.f16003 = c5844;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Intent intent;
        int i = this.f16004;
        C5844 c5844 = this.f16003;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c5844.f17376.booleanValue()) {
                    methodHookParam.setResult(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (c5844.f17376.booleanValue()) {
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
