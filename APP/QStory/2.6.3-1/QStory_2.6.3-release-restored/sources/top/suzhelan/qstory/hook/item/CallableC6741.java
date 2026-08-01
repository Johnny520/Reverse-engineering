package top.suzhelan.qstory.hook.item;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.C2080;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3887;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p332.C9496;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC6741 implements Callable {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16431;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16432;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16433;

    public /* synthetic */ CallableC6741(Object obj, XC_MethodHook.MethodHookParam methodHookParam, C6766 c6766) {
        this.f16433 = 1;
        this.f16432 = obj;
        this.f16431 = methodHookParam;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ClassNotFoundException {
        int iIntValue;
        int i = this.f16433;
        Object obj = this.f16432;
        Object obj2 = this.f16431;
        switch (i) {
            case 0:
                C6758 c6758 = (C6758) obj2;
                for (Object obj3 : (ArrayList) AbstractC7165.m12418(ArrayList.class, "elements", obj)) {
                    if (((Integer) AbstractC7165.m12418(Integer.TYPE, "elementType", obj3)).intValue() == 9 && (iIntValue = ((Integer) XposedHelpers.callMethod(obj, "getChatType", new Object[0])).intValue()) != 1 && iIntValue != 100) {
                        c6758.m11875(obj, XposedHelpers.callMethod(obj3, "getWalletElement", new Object[0]));
                    }
                }
                break;
            case 1:
                XC_MethodHook.MethodHookParam methodHookParam = (XC_MethodHook.MethodHookParam) obj2;
                C6766.f16473 = obj;
                Object objectField = XposedHelpers.getObjectField(obj, "filePath");
                String str = objectField instanceof String ? (String) objectField : null;
                if (str == null) {
                    str = "";
                }
                Object objCallMethod = XposedHelpers.callMethod(methodHookParam.thisObject, "getMContext", new Object[0]);
                "null cannot be cast to non-null type android.content.Context";
                objCallMethod.getClass();
                Context context = (Context) objCallMethod;
                try {
                    Intent intent = new Intent(context, (Class<?>) AbstractC7166.m12425("com.tencent.mobileqq.activity.ForwardRecentActivity"));
                    intent.putExtra("selection_mode", 2);
                    intent.putExtra("direct_send_if_dataline_forward", false);
                    intent.putExtra("forward_text", str);
                    intent.putExtra("forward_type", -1);
                    intent.putExtra("forward_from_jump", true);
                    intent.putExtra("ptt_forward", "114514");
                    intent.putExtra("caller_name", "ChatActivity");
                    intent.putExtra("k_smartdevice", false);
                    intent.putExtra("k_dataline", false);
                    intent.putExtra("is_need_show_toast", true);
                    intent.putExtra("k_forward_title", "语音转发");
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context.startActivity(intent);
                    XposedBridge.log("PttForward: 启动转发界面成功");
                } catch (Exception e) {
                    XposedBridge.log("PttForward: 启动转发界面失败: " + e.getMessage());
                }
                break;
            default:
                Class<?> clsLoadClass = ((ClassLoader) obj2).loadClass("com.tencent.qqnt.kernel.nativeinterface.PttElement");
                C7164 c7164M12413 = C7164.m12413(obj.getClass());
                c7164M12413.f17803.f3962 = clsLoadClass;
                Object objM12415 = c7164M12413.m12415(obj, new Object[0]);
                C7164 c7164M124132 = C7164.m12413(objM12415.getClass());
                String strM14531 = "getFilePath";
                C2080 c2080 = c7164M124132.f17803;
                c2080.f3963 = strM14531;
                c2080.f3962 = String.class;
                C9496.m14943(AbstractC3887.m7213(), (String) c7164M124132.m12415(objM12415, new Object[0]));
                break;
        }
        return null;
        return null;
    }

    public /* synthetic */ CallableC6741(Object obj, int i, Object obj2) {
        this.f16433 = i;
        this.f16431 = obj;
        this.f16432 = obj2;
    }
}
