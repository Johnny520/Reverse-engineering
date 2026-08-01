package top.suzhelan.qstory.hook.api;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.JSONObject;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC7014;
import p041.InterfaceC7139;
import p042.AbstractC7145;
import p045.C7149;
import p049.C7164;
import p052.AbstractC7187;
import p332.C9496;
import p405.AbstractC9919;
import p405.C9915;
import p405.C9921;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", "L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6643 extends AbstractC7145 implements InterfaceC7139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int f16281;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public XC_MethodHook.Unhook f16282;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7149 f16283 = new C7149("MsgViewIdAdapter");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m11789(C6643 c6643, XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            Object obj = methodHookParam.thisObject;
            int i = C9915.f25813;
            C9915 c9915M15221 = C9915.m15221(obj.getClass());
            c9915M15221.f25814 = View.class;
            View view = (View) c9915M15221.m15224(obj);
            Class clsM15228 = AbstractC9919.m15228("com.tencent.mobileqq.aio.msg.AIOMsgItem");
            C9915 c9915M152212 = C9915.m15221(obj.getClass());
            c9915M152212.f25814 = clsM15228;
            Object objM15224 = c9915M152212.m15224(obj);
            if (objM15224 != null && view != null) {
                C7164 c7164M12413 = C7164.m12413(objM15224.getClass());
                c7164M12413.f17803.f3963 = "getMsgRecord";
                Iterator it = ((ArrayList) C9915.m15222(ArrayList.class, "elements", c7164M12413.m12415(objM15224, new Object[0]))).iterator();
                "iterator(...)";
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    "next(...)";
                    next.getClass();
                    if (((Integer) C9915.m15222(Integer.TYPE, "elementType", next)).intValue() <= 2) {
                        c6643.m11790((ViewGroup) view);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            c6643.getExceptionCollectionToolInstance().m12391(e);
        }
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        String strM14532 = "ok";
        Boolean bool = Boolean.FALSE;
        C7149 c7149 = this.f16283;
        if (((Boolean) c7149.m12399(bool, strM14532)).booleanValue()) {
            Object objM12399 = c7149.m12399(0, "id");
            "get(...)";
            objM12399.getClass();
            f16281 = ((Number) objM12399).intValue();
            return;
        }
        int i = AbstractC7187.f17853;
        Class cls = Void.TYPE;
        if (i >= 12290) {
            C9921 c9921M15232 = C9921.m15232("com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB");
            c9921M15232.f25826 = "handleUIState";
            c9921M15232.m15234(AbstractC9919.m15228("com.tencent.mvi.base.mvi.MviUIState"));
            c9921M15232.f25828 = cls;
            XposedBridge.hookMethod((Method) c9921M15232.m15164(), new C6644(this, 1));
            return;
        }
        C9921 c9921M15231 = C9921.m15231(AbstractC9919.m15228("com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB"));
        c9921M15231.m15234(Integer.TYPE, C9496.class, List.class, Bundle.class);
        c9921M15231.f25828 = cls;
        Member memberM15164 = c9921M15231.m15164();
        "first(...)";
        memberM15164.getClass();
        this.f16282 = XposedBridge.hookMethod((Method) memberM15164, new C6644(this, 0));
    }

    @Override // p041.InterfaceC7139
    public final void run() {
        C7149 c7149 = this.f16283;
        c7149.getClass();
        c7149.f17776 = new JSONObject();
        c7149.mo12394();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11790(ViewGroup viewGroup) {
        "itemView";
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().equals("com.tencent.qqnt.aio.holder.template.BubbleLayoutCompatPress")) {
                int id = childAt.getId();
                String strM14532 = "ok";
                Boolean bool = Boolean.TRUE;
                C7149 c7149 = this.f16283;
                c7149.m12395(bool, strM14532);
                c7149.m12395(Integer.valueOf(id), "id");
                c7149.m12395(AbstractC7187.f17854, "ver");
                c7149.mo12394();
                if (this.f16282 != null) {
                    Object objM12399 = c7149.m12399(0, "id");
                    "get(...)";
                    objM12399.getClass();
                    int iIntValue = ((Number) objM12399).intValue();
                    f16281 = iIntValue;
                    if (iIntValue == 0) {
                        f16281 = childAt.getId();
                    }
                    XC_MethodHook.Unhook unhook = this.f16282;
                    unhook.getClass();
                    unhook.unhook();
                }
                AbstractC7014.m12151("[QStory]已对MsgView进行适配,建议重启一次QQ");
                return;
            }
        }
    }
}
