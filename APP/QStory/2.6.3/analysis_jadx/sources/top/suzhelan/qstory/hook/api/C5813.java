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
import p010.AbstractC6185;
import p025.InterfaceC6310;
import p026.AbstractC6316;
import p029.C6320;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p316.C8667;
import p389.AbstractC9090;
import p389.C9086;
import p389.C9092;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", "L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5813 extends AbstractC6316 implements InterfaceC6310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int f15936;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public XC_MethodHook.Unhook f15937;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6320 f15938 = new C6320(AbstractC8405.m13972(1547));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m11230(C5813 c5813, XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            Object obj = methodHookParam.thisObject;
            int i = C9086.f25468;
            C9086 c9086M14662 = C9086.m14662(obj.getClass());
            c9086M14662.f25469 = View.class;
            View view = (View) c9086M14662.m14665(obj);
            Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(160));
            C9086 c9086M146622 = C9086.m14662(obj.getClass());
            c9086M146622.f25469 = clsM14669;
            Object objM14665 = c9086M146622.m14665(obj);
            if (objM14665 != null && view != null) {
                C6335 c6335M11854 = C6335.m11854(objM14665.getClass());
                c6335M11854.f17458.f3618 = AbstractC8405.m13972(164);
                Iterator it = ((ArrayList) C9086.m14663(ArrayList.class, AbstractC8405.m13972(152), c6335M11854.m11856(objM14665, new Object[0]))).iterator();
                AbstractC8405.m13972(1253);
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC8405.m13972(1254);
                    next.getClass();
                    if (((Integer) C9086.m14663(Integer.TYPE, AbstractC8405.m13972(338), next)).intValue() <= 2) {
                        c5813.m11231((ViewGroup) view);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            c5813.getExceptionCollectionToolInstance().m11832(e);
        }
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        String strM13973 = AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵");
        Boolean bool = Boolean.FALSE;
        C6320 c6320 = this.f15938;
        if (((Boolean) c6320.m11840(bool, strM13973)).booleanValue()) {
            Object objM11840 = c6320.m11840(0, AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"));
            AbstractC8405.m13972(1548);
            objM11840.getClass();
            f15936 = ((Number) objM11840).intValue();
            return;
        }
        int i = AbstractC6358.f17508;
        Class cls = Void.TYPE;
        if (i >= 12290) {
            C9092 c9092M14673 = C9092.m14673(AbstractC8405.m13972(326));
            c9092M14673.f25481 = AbstractC8405.m13972(1550);
            c9092M14673.m14675(AbstractC9090.m14669(AbstractC8405.m13972(1551)));
            c9092M14673.f25483 = cls;
            XposedBridge.hookMethod((Method) c9092M14673.m14605(), new C5814(this, 1));
            return;
        }
        C9092 c9092M14672 = C9092.m14672(AbstractC9090.m14669(AbstractC8405.m13972(326)));
        c9092M14672.m14675(Integer.TYPE, C8667.class, List.class, Bundle.class);
        c9092M14672.f25483 = cls;
        Member memberM14605 = c9092M14672.m14605();
        AbstractC8405.m13972(1549);
        memberM14605.getClass();
        this.f15937 = XposedBridge.hookMethod((Method) memberM14605, new C5814(this, 0));
    }

    @Override // p025.InterfaceC6310
    public final void run() {
        C6320 c6320 = this.f15938;
        c6320.getClass();
        c6320.f17431 = new JSONObject();
        c6320.mo11835();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11231(ViewGroup viewGroup) {
        AbstractC8405.m13972(1330);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().equals(AbstractC8405.m13972(341))) {
                int id = childAt.getId();
                String strM13973 = AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵");
                Boolean bool = Boolean.TRUE;
                C6320 c6320 = this.f15938;
                c6320.m11836(bool, strM13973);
                c6320.m11836(Integer.valueOf(id), AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"));
                c6320.m11836(AbstractC6358.f17509, AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵喵"));
                c6320.mo11835();
                if (this.f15937 != null) {
                    Object objM11840 = c6320.m11840(0, AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"));
                    AbstractC8405.m13972(1548);
                    objM11840.getClass();
                    int iIntValue = ((Number) objM11840).intValue();
                    f15936 = iIntValue;
                    if (iIntValue == 0) {
                        f15936 = childAt.getId();
                    }
                    XC_MethodHook.Unhook unhook = this.f15937;
                    unhook.getClass();
                    unhook.unhook();
                }
                AbstractC6185.m11592(AbstractC8405.m13972(1552));
                return;
            }
        }
    }
}
