package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p389.C9092;
import p392.C9098;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲世兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5956 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Class clsM14669;
        Object next;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        try {
            Class clsM146692 = AbstractC9090.m14669(AbstractC8405.m13972(1944));
            if (clsM146692 == null) {
                clsM146692 = AbstractC9090.m14669(AbstractC8405.m13972(1945));
            }
            if (clsM146692 != null) {
                XposedBridge.hookAllConstructors(clsM146692, new C5952(this, 0));
                C9098 c9098 = new C9098();
                c9098.f25495 = clsM146692;
                c9098.m14687(AbstractC8405.m13972(1946), AbstractC8405.m13972(1947), AbstractC8405.m13972(1948));
                ArrayList arrayListM14690 = c9098.m14690();
                AbstractC8405.m13972(1824);
                Iterator it = arrayListM14690.iterator();
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
                    XposedBridge.hookMethod(method, new C5952(this, 1));
                }
            }
            Class clsM146693 = AbstractC9090.m14669(AbstractC8405.m13972(171));
            if (clsM146693 != null) {
                C9098 c90982 = new C9098();
                c90982.f25495 = clsM146693;
                c90982.m14687(AbstractC8405.m13972(1949), AbstractC8405.m13972(1950), AbstractC8405.m13972(1951));
                Method methodM14686 = c90982.m14686();
                if (methodM14686 == null && (clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(1952))) != null) {
                    C9092 c9092M14672 = C9092.m14672(clsM14669);
                    c9092M14672.f25481 = AbstractC8405.m13972(1953);
                    Method method2 = (Method) c9092M14672.m14605();
                    if (method2 != null) {
                        C9098 c90983 = new C9098();
                        c90983.f25495 = clsM146693;
                        c90983.f25500.addAll(Arrays.asList(method2));
                        methodM14686 = c90983.m14686();
                    }
                }
                if (methodM14686 != null) {
                    XposedBridge.hookMethod(methodM14686, new C5952(this, 2));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1943);
    }
}
