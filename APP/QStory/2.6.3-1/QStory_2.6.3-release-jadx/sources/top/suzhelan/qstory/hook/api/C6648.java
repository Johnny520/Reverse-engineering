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
import p042.AbstractC7140;
import p042.AbstractC7145;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import p303.AbstractC9234;
import p332.C9496;
import p405.C9921;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m151d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰", "top/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6648 extends AbstractC7145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final HashMap f16294 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m11791(C6648 c6648, XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            Object obj = methodHookParam.thisObject;
            C7164 c7164M12413 = C7164.m12413(obj.getClass());
            c7164M12413.f17803.f3963 = AbstractC9234.m14531(329);
            View view = (View) c7164M12413.m12415(obj, new Object[0]);
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(160));
            HashMap map = AbstractC7165.f17804;
            Object obj2 = AbstractC7165.m12420(obj.getClass(), clsM12425).get(obj);
            if (obj2 != null && view != null) {
                C7164 c7164M124132 = C7164.m12413(obj2.getClass());
                c7164M124132.f17803.f3963 = AbstractC9234.m14531(164);
                Object objM12415 = c7164M124132.m12415(obj2, new Object[0]);
                for (Object obj3 : f16294.entrySet()) {
                    AbstractC9234.m14531(1254);
                    obj3.getClass();
                    Map.Entry entry = (Map.Entry) obj3;
                    Object key = entry.getKey();
                    AbstractC9234.m14531(1564);
                    key.getClass();
                    AbstractC7140 abstractC7140 = (AbstractC7140) key;
                    if (abstractC7140.f17770.booleanValue()) {
                        try {
                            Object value = entry.getValue();
                            AbstractC9234.m14531(1565);
                            value.getClass();
                            objM12415.getClass();
                            ((InterfaceC6639) value).mo11788(objM12415, view);
                        } catch (Throwable th) {
                            abstractC7140.getExceptionCollectionToolInstance().m12391(th);
                        }
                    }
                }
            }
        } catch (Exception e) {
            c6648.getExceptionCollectionToolInstance().m12391(e);
        }
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        int i = AbstractC7187.f17853;
        Class cls = Void.TYPE;
        if (i >= 12290) {
            C9921 c9921M15232 = C9921.m15232(AbstractC9234.m14531(326));
            c9921M15232.f25826 = AbstractC9234.m14531(1550);
            c9921M15232.m15234(AbstractC7166.m12425(AbstractC9234.m14531(1551)));
            c9921M15232.f25828 = cls;
            XposedBridge.hookMethod((Method) c9921M15232.m15164(), new C6649(this, 1));
            return;
        }
        C9921 c9921M15231 = C9921.m15231(AbstractC7166.m12425(AbstractC9234.m14531(326)));
        c9921M15231.m15234(Integer.TYPE, C9496.class, List.class, Bundle.class);
        c9921M15231.f25828 = cls;
        Member memberM15164 = c9921M15231.m15164();
        AbstractC9234.m14531(1549);
        memberM15164.getClass();
        XposedBridge.hookMethod((Method) memberM15164, new C6649(this, 0));
    }
}
