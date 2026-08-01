package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import org.xmlpull.v1.XmlPullParser;
import p026.AbstractC6311;
import p034.AbstractC6347;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5890 extends AbstractC6311 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11287(Class cls) {
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (AbstractC4395.m8907(method.getReturnType(), ArrayList.class) && method.getParameterTypes().length == 1 && AbstractC4395.m8907(method.getParameterTypes()[0], XmlPullParser.class)) {
                    return method;
                }
            }
        } catch (Exception unused) {
        }
        try {
            return cls.getDeclaredMethod(AbstractC8405.m13972(1852), XmlPullParser.class);
        } catch (NoSuchMethodException unused2) {
            Iterator it = AbstractC6347.m11931(AbstractC8405.m13972(1853), AbstractC8405.m13972(1854), AbstractC8405.m13972(1855)).iterator();
            while (it.hasNext()) {
                try {
                    return cls.getDeclaredMethod((String) it.next(), XmlPullParser.class);
                } catch (NoSuchMethodException unused3) {
                }
            }
            return null;
        }
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            int i = AbstractC6358.f17508;
            Class<?> clsLoadClass = classLoader.loadClass(i >= 6458 ? AbstractC8405.m13972(1848) : i >= 5626 ? AbstractC8405.m13972(1849) : AbstractC3056.m6696() ? AbstractC8405.m13972(1850) : AbstractC8405.m13972(1851));
            clsLoadClass.getClass();
            Method methodM11287 = m11287(clsLoadClass);
            if (methodM11287 != null) {
                XposedBridge.hookMethod(methodM11287, new C5812(this, 3));
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1847);
    }
}
