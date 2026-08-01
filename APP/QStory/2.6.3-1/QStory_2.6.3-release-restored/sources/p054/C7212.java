package p054;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.JSONObject;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.util.List;
import p026.AbstractC7014;
import p041.InterfaceC7139;
import p042.AbstractC7145;
import p045.C7149;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C7212 extends AbstractC7145 implements InterfaceC7139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public XC_MethodHook.Unhook f17890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7149 f17891 = new C7149(getClass().getSimpleName());

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        String strM14532 = "ok";
        Boolean bool = Boolean.FALSE;
        C7149 c7149 = this.f17891;
        if (((Boolean) c7149.m12399(bool, strM14532)).booleanValue()) {
            ((Integer) c7149.m12399(0, "id")).getClass();
            return;
        }
        C7164 c7164M12413 = C7164.m12413(AbstractC7166.m12425("com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB"));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        this.f17890 = XposedBridge.hookMethod(c7164M12413.m12414(), new C6642(this, 21));
    }

    @Override // p041.InterfaceC7139
    public final void run() {
        C7149 c7149 = this.f17891;
        c7149.getClass();
        c7149.f17776 = new JSONObject();
        c7149.mo12394();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m12521(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().equals("com.tencent.qqnt.aio.holder.template.BubbleLayoutCompatPress")) {
                int id = childAt.getId();
                String strM14532 = "ok";
                Boolean bool = Boolean.TRUE;
                C7149 c7149 = this.f17891;
                c7149.m12395(bool, strM14532);
                c7149.m12395(Integer.valueOf(id), "id");
                c7149.m12395(AbstractC7187.f17854, "ver");
                c7149.mo12394();
                if (this.f17890 != null) {
                    ((Integer) c7149.m12399(0, "id")).getClass();
                    this.f17890.unhook();
                }
                AbstractC7014.m12151("[QStory]已对MsgView进行适配");
                return;
            }
        }
    }
}
