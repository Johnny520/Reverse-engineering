package top.suzhelan.qstory.hook.item;

import android.widget.TextView;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p034.AbstractC6347;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲苏世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5919 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            int i = AbstractC6358.f17508;
            boolean zM6696 = AbstractC3056.m6696();
            if (i >= 5626) {
                try {
                    Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(1813));
                    XposedBridge.hookAllConstructors(clsLoadClass, new C5918(this, 0, clsLoadClass));
                    return;
                } catch (ClassNotFoundException unused) {
                    m11299(classLoader);
                    return;
                }
            }
            if (!zM6696) {
                m11299(classLoader);
                return;
            }
            try {
                Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC8405.m13972(1813));
                try {
                    XposedBridge.hookMethod(clsLoadClass2.getDeclaredMethod(AbstractC8405.m13972(1814), null), new C5921(this, 2));
                } catch (NoSuchMethodException unused2) {
                }
                XposedBridge.hookMethod(clsLoadClass2.getDeclaredMethod(AbstractC8405.m13972(1815), null), new C5921(this, 3));
            } catch (ClassNotFoundException unused3) {
                m11299(classLoader);
            }
        } catch (NoSuchMethodException | Exception unused4) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(105);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11299(ClassLoader classLoader) {
        try {
            XposedBridge.hookMethod(classLoader.loadClass(AbstractC8405.m13972(1816)).getDeclaredMethod(AbstractC8405.m13972(1817), TextView.class), new C5921(this, 0));
        } catch (Exception unused) {
        }
        try {
            Iterator it = AbstractC6347.m11931(AbstractC8405.m13972(1818), AbstractC8405.m13972(1819)).iterator();
            while (it.hasNext()) {
                try {
                    Method[] declaredMethods = classLoader.loadClass((String) it.next()).getDeclaredMethods();
                    declaredMethods.getClass();
                    int length = declaredMethods.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            Method method = declaredMethods[i];
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length == 2) {
                                Class<?> cls = parameterTypes[0];
                                Class<?> cls2 = parameterTypes[1];
                                String name = cls.getName();
                                AbstractC8405.m13972(1820);
                                if (AbstractC5144.m10176(name, AbstractC8405.m13972(1821), false)) {
                                    String name2 = cls2.getName();
                                    AbstractC8405.m13972(1820);
                                    if (AbstractC5144.m10176(name2, AbstractC8405.m13972(1822), false)) {
                                        XposedBridge.hookMethod(method, new C5921(this, 1));
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i++;
                        }
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        } catch (Exception unused3) {
        }
    }
}
