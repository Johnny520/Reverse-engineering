package top.suzhelan.qstory.hook.item;

import android.widget.TextView;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p035.AbstractC6340;
import p053.AbstractC6560;
import p253.AbstractC8189;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲苏世;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5913 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        try {
            int i = AbstractC6340.f17461;
            boolean zM12011 = AbstractC6560.m12011();
            if (i >= 5626) {
                try {
                    Class<?> clsLoadClass = classLoader.loadClass(AbstractC3056.m6668(-3937742917477860775L));
                    XposedBridge.hookAllConstructors(clsLoadClass, new C5912(this, 0, clsLoadClass));
                    return;
                } catch (ClassNotFoundException unused) {
                    m11238(classLoader);
                    return;
                }
            }
            if (!zM12011) {
                m11238(classLoader);
                return;
            }
            try {
                Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC3056.m6668(-3937742917477860775L));
                try {
                    XposedBridge.hookMethod(clsLoadClass2.getDeclaredMethod(AbstractC3056.m6668(-3937742758564070823L), null), new C5915(this, 2));
                } catch (NoSuchMethodException unused2) {
                }
                XposedBridge.hookMethod(clsLoadClass2.getDeclaredMethod(AbstractC3056.m6668(-3937742664074790311L), null), new C5915(this, 3));
            } catch (ClassNotFoundException unused3) {
                m11238(classLoader);
            }
        } catch (NoSuchMethodException | Exception unused4) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937568941237601703L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11238(ClassLoader classLoader) {
        try {
            XposedBridge.hookMethod(classLoader.loadClass(AbstractC3056.m6668(-3937742565290542503L)).getDeclaredMethod(AbstractC3056.m6668(-3937742316182439335L), TextView.class), new C5915(this, 0));
        } catch (Exception unused) {
        }
        try {
            Iterator it = AbstractC8189.m13659(AbstractC3056.m6668(-3937742243167995303L), AbstractC3056.m6668(-3937742067074336167L)).iterator();
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
                                AbstractC3056.m6668(-3937741817966232999L);
                                if (AbstractC5143.m10171(name, AbstractC3056.m6668(-3937741770721592743L), false)) {
                                    String name2 = cls2.getName();
                                    AbstractC3056.m6668(-3937741817966232999L);
                                    if (AbstractC5143.m10171(name2, AbstractC3056.m6668(-3937741783606494631L), false)) {
                                        XposedBridge.hookMethod(method, new C5915(this, 1));
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
