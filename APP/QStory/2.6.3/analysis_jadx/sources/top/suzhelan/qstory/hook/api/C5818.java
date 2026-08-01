package top.suzhelan.qstory.hook.api;

import android.os.Bundle;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p026.AbstractC6316;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p316.C8667;
import p389.C9092;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰", "top/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5818 extends AbstractC6316 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final HashMap f15949 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m11232(C5818 c5818, XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            Object obj = methodHookParam.thisObject;
            C6335 c6335M11854 = C6335.m11854(obj.getClass());
            c6335M11854.f17458.f3618 = AbstractC8405.m13972(329);
            View view = (View) c6335M11854.m11856(obj, new Object[0]);
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
            HashMap map = AbstractC6336.f17459;
            Object obj2 = AbstractC6336.m11861(obj.getClass(), clsM11866).get(obj);
            if (obj2 != null && view != null) {
                C6335 c6335M118542 = C6335.m11854(obj2.getClass());
                c6335M118542.f17458.f3618 = AbstractC8405.m13972(164);
                Object objM11856 = c6335M118542.m11856(obj2, new Object[0]);
                for (Object obj3 : f15949.entrySet()) {
                    AbstractC8405.m13972(1254);
                    obj3.getClass();
                    Map.Entry entry = (Map.Entry) obj3;
                    Object key = entry.getKey();
                    AbstractC8405.m13972(1564);
                    key.getClass();
                    AbstractC6311 abstractC6311 = (AbstractC6311) key;
                    if (abstractC6311.f17425.booleanValue()) {
                        try {
                            Object value = entry.getValue();
                            AbstractC8405.m13972(1565);
                            value.getClass();
                            objM11856.getClass();
                            ((InterfaceC5809) value).mo11229(objM11856, view);
                        } catch (Throwable th) {
                            abstractC6311.getExceptionCollectionToolInstance().m11832(th);
                        }
                    }
                }
            }
        } catch (Exception e) {
            c5818.getExceptionCollectionToolInstance().m11832(e);
        }
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        int i = AbstractC6358.f17508;
        Class cls = Void.TYPE;
        if (i >= 12290) {
            C9092 c9092M14673 = C9092.m14673(AbstractC8405.m13972(326));
            c9092M14673.f25481 = AbstractC8405.m13972(1550);
            c9092M14673.m14675(AbstractC6337.m11866(AbstractC8405.m13972(1551)));
            c9092M14673.f25483 = cls;
            XposedBridge.hookMethod((Method) c9092M14673.m14605(), new C5819(this, 1));
            return;
        }
        C9092 c9092M14672 = C9092.m14672(AbstractC6337.m11866(AbstractC8405.m13972(326)));
        c9092M14672.m14675(Integer.TYPE, C8667.class, List.class, Bundle.class);
        c9092M14672.f25483 = cls;
        Member memberM14605 = c9092M14672.m14605();
        AbstractC8405.m13972(1549);
        memberM14605.getClass();
        XposedBridge.hookMethod((Method) memberM14605, new C5819(this, 0));
    }
}
