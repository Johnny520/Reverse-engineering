package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p303.AbstractC9234;
import p405.AbstractC9919;
import p405.C9921;
import p408.C9927;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲世兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6786 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Class clsM15228;
        Object next;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        try {
            Class clsM152282 = AbstractC9919.m15228(AbstractC9234.m14531(1944));
            if (clsM152282 == null) {
                clsM152282 = AbstractC9919.m15228(AbstractC9234.m14531(1945));
            }
            if (clsM152282 != null) {
                XposedBridge.hookAllConstructors(clsM152282, new C6782(this, 0));
                C9927 c9927 = new C9927();
                c9927.f25840 = clsM152282;
                c9927.m15246(AbstractC9234.m14531(1946), AbstractC9234.m14531(1947), AbstractC9234.m14531(1948));
                ArrayList arrayListM15249 = c9927.m15249();
                AbstractC9234.m14531(1824);
                Iterator it = arrayListM15249.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((Method) next).getParameterTypes().length == 3) {
                            break;
                        }
                    }
                }
                Method method = (Method) next;
                if (method != null) {
                    XposedBridge.hookMethod(method, new C6782(this, 1));
                }
            }
            Class clsM152283 = AbstractC9919.m15228(AbstractC9234.m14531(171));
            if (clsM152283 != null) {
                C9927 c99272 = new C9927();
                c99272.f25840 = clsM152283;
                c99272.m15246(AbstractC9234.m14531(1949), AbstractC9234.m14531(1950), AbstractC9234.m14531(1951));
                Method methodM15245 = c99272.m15245();
                if (methodM15245 == null && (clsM15228 = AbstractC9919.m15228(AbstractC9234.m14531(1952))) != null) {
                    C9921 c9921M15231 = C9921.m15231(clsM15228);
                    c9921M15231.f25826 = AbstractC9234.m14531(1953);
                    Method method2 = (Method) c9921M15231.m15164();
                    if (method2 != null) {
                        C9927 c99273 = new C9927();
                        c99273.f25840 = clsM152283;
                        c99273.f25845.addAll(Arrays.asList(method2));
                        methodM15245 = c99273.m15245();
                    }
                }
                if (methodM15245 != null) {
                    XposedBridge.hookMethod(methodM15245, new C6782(this, 2));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1943);
    }
}
