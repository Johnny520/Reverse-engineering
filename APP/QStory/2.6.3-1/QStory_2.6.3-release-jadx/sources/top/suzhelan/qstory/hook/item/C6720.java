package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3888;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import org.xmlpull.v1.XmlPullParser;
import p042.AbstractC7140;
import p050.AbstractC7176;
import p052.AbstractC7187;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6720 extends AbstractC7140 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11846(Class cls) {
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC9234.m14531(1555);
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (AbstractC5227.m9466(method.getReturnType(), ArrayList.class) && method.getParameterTypes().length == 1 && AbstractC5227.m9466(method.getParameterTypes()[0], XmlPullParser.class)) {
                    return method;
                }
            }
        } catch (Exception unused) {
        }
        try {
            return cls.getDeclaredMethod(AbstractC9234.m14531(1852), XmlPullParser.class);
        } catch (NoSuchMethodException unused2) {
            Iterator it = AbstractC7176.m12490(AbstractC9234.m14531(1853), AbstractC9234.m14531(1854), AbstractC9234.m14531(1855)).iterator();
            while (it.hasNext()) {
                try {
                    return cls.getDeclaredMethod((String) it.next(), XmlPullParser.class);
                } catch (NoSuchMethodException unused3) {
                }
            }
            return null;
        }
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            int i = AbstractC7187.f17853;
            Class<?> clsLoadClass = classLoader.loadClass(i >= 6458 ? AbstractC9234.m14531(1848) : i >= 5626 ? AbstractC9234.m14531(1849) : AbstractC3888.m7256() ? AbstractC9234.m14531(1850) : AbstractC9234.m14531(1851));
            clsLoadClass.getClass();
            Method methodM11846 = m11846(clsLoadClass);
            if (methodM11846 != null) {
                XposedBridge.hookMethod(methodM11846, new C6642(this, 3));
            }
        } catch (Exception unused) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1847);
    }
}
