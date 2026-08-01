package p037;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.util.List;
import p010.AbstractC6154;
import p025.InterfaceC6292;
import p026.AbstractC6298;
import p028.C6301;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C6366 extends AbstractC6298 implements InterfaceC6292 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public XC_MethodHook.Unhook f17499;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6301 f17500 = new C6301(getClass().getSimpleName());

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        String strM6668 = "ok";
        Boolean bool = Boolean.FALSE;
        C6301 c6301 = this.f17500;
        if (((Boolean) c6301.m11812(bool, strM6668)).booleanValue()) {
            ((Integer) c6301.m11812(0, "id")).getClass();
            return;
        }
        C6316 c6316M11826 = C6316.m11826(AbstractC6318.m11838("com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB"));
        Class[] clsArr = {Integer.TYPE, Object.class, List.class, Bundle.class};
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        this.f17499 = XposedBridge.hookMethod(c6316M11826.m11827(), new C5811(this, 21));
    }

    @Override // p025.InterfaceC6292
    public final void run() {
        C6301 c6301 = this.f17500;
        c6301.getClass();
        c6301.f17382 = new JSONObject();
        c6301.mo11807();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m11914(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().equals("com.tencent.qqnt.aio.holder.template.BubbleLayoutCompatPress")) {
                int id = childAt.getId();
                String strM6668 = "ok";
                Boolean bool = Boolean.TRUE;
                C6301 c6301 = this.f17500;
                c6301.m11808(bool, strM6668);
                c6301.m11808(Integer.valueOf(id), "id");
                c6301.m11808(AbstractC6340.f17462, "ver");
                c6301.mo11807();
                if (this.f17499 != null) {
                    ((Integer) c6301.m11812(0, "id")).getClass();
                    this.f17499.unhook();
                }
                AbstractC6154.m11561("[QStory]\u5df2\u5bf9MsgView\u8fdb\u884c\u9002\u914d");
                return;
            }
        }
    }
}
