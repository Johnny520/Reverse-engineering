package top.suzhelan.qstory.hook.item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p175.AbstractC7738;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5905 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16077;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16078;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16079;

    public /* synthetic */ CallableC5905(Object obj, XC_MethodHook.MethodHookParam methodHookParam, C5931 c5931) {
        this.f16079 = 1;
        this.f16078 = obj;
        this.f16077 = methodHookParam;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ClassNotFoundException {
        int iIntValue;
        int i = this.f16079;
        Object obj = this.f16078;
        Object obj2 = this.f16077;
        switch (i) {
            case 0:
                C5922 c5922 = (C5922) obj2;
                for (Object obj3 : (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj)) {
                    if (((Integer) AbstractC6317.m11831(Integer.TYPE, "elementType", obj3)).intValue() == 9 && (iIntValue = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue()) != 1 && iIntValue != 100) {
                        c5922.m11256(obj, XposedHelpers.callMethod(obj3, "getWalletElement", new Object[0]));
                    }
                }
                break;
            case 1:
                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj2;
                C5931.f16124 = obj;
                Object objectField = XposedHelpers.getObjectField(obj, "filePath");
                String strM6668 = objectField instanceof String ? (String) objectField : null;
                if (strM6668 == null) {
                    strM6668 = "";
                }
                Object objCallMethod = XposedHelpers.callMethod(methodHookParam.thisObject, "getMContext", new Object[0]);
                "null cannot be cast to non-null type android.content.Context";
                objCallMethod.getClass();
                Context context = (Context) objCallMethod;
                try {
                    Intent intent = new Intent(context, (Class<?>) AbstractC6318.m11838("com.tencent.mobileqq.activity.ForwardRecentActivity"));
                    intent.putExtra("selection_mode", 2);
                    intent.putExtra("direct_send_if_dataline_forward", false);
                    intent.putExtra("forward_text", strM6668);
                    intent.putExtra("forward_type", -1);
                    intent.putExtra("forward_from_jump", true);
                    intent.putExtra("ptt_forward", "114514");
                    intent.putExtra("caller_name", "ChatActivity");
                    intent.putExtra("k_smartdevice", false);
                    intent.putExtra("k_dataline", false);
                    intent.putExtra("is_need_show_toast", true);
                    intent.putExtra("k_forward_title", "\u8bed\u97f3\u8f6c\u53d1");
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                    XposedBridge.log("PttForward: \u542f\u52a8\u8f6c\u53d1\u754c\u9762\u6210\u529f");
                } catch (Exception e) {
                    XposedBridge.log("PttForward: \u542f\u52a8\u8f6c\u53d1\u754c\u9762\u5931\u8d25: " + e.getMessage());
                }
                break;
            default:
                Class<?> clsLoadClass = ((ClassLoader) obj2).loadClass("com.tencent.qqnt.kernel.nativeinterface.PttElement");
                C6316 c6316M11826 = C6316.m11826(obj.getClass());
                c6316M11826.f17409.f3616 = clsLoadClass;
                Object objM11828 = c6316M11826.m11828(obj, new Object[0]);
                C6316 c6316M118262 = C6316.m11826(objM11828.getClass());
                String strM66682 = "getFilePath";
                C1245 c1245 = c6316M118262.f17409;
                c1245.f3617 = strM66682;
                c1245.f3616 = String.class;
                AbstractC3065.m6835(AbstractC7738.m13031(), (String) c6316M118262.m11828(objM11828, new Object[0]));
                break;
        }
        return null;
        return null;
    }

    public /* synthetic */ CallableC5905(Object obj, int i, Object obj2) {
        this.f16079 = i;
        this.f16077 = obj;
        this.f16078 = obj2;
    }
}
