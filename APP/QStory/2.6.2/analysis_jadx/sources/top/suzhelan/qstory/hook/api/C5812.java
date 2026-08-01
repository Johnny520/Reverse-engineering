package top.suzhelan.qstory.hook.api;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p010.AbstractC6154;
import p025.InterfaceC6292;
import p026.AbstractC6298;
import p028.C6301;
import p032.C6316;
import p035.AbstractC6340;
import p392.AbstractC9121;
import p392.AbstractC9124;
import p392.C9117;
import p392.C9125;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5812 extends AbstractC6298 implements InterfaceC6292 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static int f15936;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public XC_MethodHook.Unhook f15937;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6301 f15938 = new C6301(AbstractC3056.m6668(-3937715124744488359L));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m11173(C5812 c5812, XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            Object obj = methodHookParam.thisObject;
            int i = C9117.f25488;
            C9117 c9117M14648 = C9117.m14648(obj.getClass());
            c9117M14648.f25489 = View.class;
            View view = (View) c9117M14648.m14653(obj);
            Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937564551781025191L));
            C9117 c9117M146482 = C9117.m14648(obj.getClass());
            c9117M146482.f25489 = clsM14657;
            Object objM14653 = c9117M146482.m14653(obj);
            if (objM14653 != null && view != null) {
                C6316 c6316M11826 = C6316.m11826(objM14653.getClass());
                c6316M11826.f17409.f3617 = AbstractC3056.m6668(-3937563495219070375L);
                Iterator it = ((ArrayList) C9117.m14649(ArrayList.class, AbstractC3056.m6668(-3937563413614691751L), c6316M11826.m11828(objM14653, new Object[0]))).iterator();
                AbstractC3056.m6668(-3937693916195980711L);
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3056.m6668(-3937693873246307751L);
                    next.getClass();
                    if (((Integer) C9117.m14649(Integer.TYPE, AbstractC3056.m6668(-3937563452269397415L), next)).intValue() <= 2) {
                        c5812.m11174((ViewGroup) view);
                        return;
                    }
                }
            }
        } catch (Exception e) {
            c5812.getExceptionCollectionToolInstance().m11804(e);
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        String strM6668 = AbstractC3056.m6668(-3937592018096883111L);
        Boolean bool = Boolean.FALSE;
        C6301 c6301 = this.f15938;
        if (((Boolean) c6301.m11812(bool, strM6668)).booleanValue()) {
            Object objM11812 = c6301.m11812(0, AbstractC3056.m6668(-3937592030981784999L));
            AbstractC3056.m6668(-3937714957240763815L);
            objM11812.getClass();
            f15936 = ((Number) objM11812).intValue();
            return;
        }
        int i = AbstractC6340.f17461;
        Class cls = Void.TYPE;
        if (i >= 12290) {
            C9125 c9125M14681 = C9125.m14681(AbstractC3056.m6668(-3937594028141577639L));
            c9125M14681.f25504 = AbstractC3056.m6668(-3937714871341417895L);
            c9125M14681.m14683(AbstractC9121.m14657(AbstractC3056.m6668(-3937714828391744935L)));
            c9125M14681.f25506 = cls;
            XposedBridge.hookMethod((Method) c9125M14681.m14686(), new C5813(this, 1));
            return;
        }
        C9125 c9125M14680 = C9125.m14680(AbstractC9121.m14657(AbstractC3056.m6668(-3937594028141577639L)));
        c9125M14680.m14683(Integer.TYPE, AbstractC9124.class, List.class, Bundle.class);
        c9125M14680.f25506 = cls;
        Member memberM14686 = c9125M14680.m14686();
        AbstractC3056.m6668(-3937714995895469479L);
        memberM14686.getClass();
        this.f15937 = XposedBridge.hookMethod((Method) memberM14686, new C5813(this, 0));
    }

    @Override // p025.InterfaceC6292
    public final void run() {
        C6301 c6301 = this.f15938;
        c6301.getClass();
        c6301.f17382 = new JSONObject();
        c6301.mo11807();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11174(ViewGroup viewGroup) {
        AbstractC3056.m6668(-3937687778687714727L);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().equals(AbstractC3056.m6668(-3937592009506948519L))) {
                int id = childAt.getId();
                String strM6668 = AbstractC3056.m6668(-3937592018096883111L);
                Boolean bool = Boolean.TRUE;
                C6301 c6301 = this.f15938;
                c6301.m11808(bool, strM6668);
                c6301.m11808(Integer.valueOf(id), AbstractC3056.m6668(-3937592030981784999L));
                c6301.m11808(AbstractC6340.f17462, AbstractC3056.m6668(-3937591713154205095L));
                c6301.mo11807();
                if (this.f15937 != null) {
                    Object objM11812 = c6301.m11812(0, AbstractC3056.m6668(-3937592030981784999L));
                    AbstractC3056.m6668(-3937714957240763815L);
                    objM11812.getClass();
                    int iIntValue = ((Number) objM11812).intValue();
                    f15936 = iIntValue;
                    if (iIntValue == 0) {
                        f15936 = childAt.getId();
                    }
                    XC_MethodHook.Unhook unhook = this.f15937;
                    unhook.getClass();
                    unhook.unhook();
                }
                AbstractC6154.m11561(AbstractC3056.m6668(-3937714673772922279L));
                return;
            }
        }
    }
}
