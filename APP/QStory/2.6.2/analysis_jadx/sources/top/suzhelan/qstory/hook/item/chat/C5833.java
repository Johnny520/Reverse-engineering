package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p035.AbstractC6340;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲苏兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5833 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937784793408996775L), classLoader);
        Method method2 = null;
        if (clsFindClassIfExists != null) {
            String strM6668 = AbstractC6340.f17461 >= 9898 ? AbstractC3056.m6668(-3937784505646187943L) : AbstractC3056.m6668(-3937784454106580391L);
            Method[] declaredMethods = clsFindClassIfExists.getDeclaredMethods();
            AbstractC3056.m6668(-3937714304405734823L);
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (AbstractC4394.m8917(method.getName(), strM6668)) {
                    break;
                } else {
                    i++;
                }
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C5834(this, 0));
            }
        }
        Class clsFindClassIfExists2 = XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937784299487757735L), classLoader);
        if (clsFindClassIfExists2 == null) {
            return;
        }
        Method[] declaredMethods2 = clsFindClassIfExists2.getDeclaredMethods();
        AbstractC3056.m6668(-3937714304405734823L);
        declaredMethods2.getClass();
        int length2 = declaredMethods2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            Method method3 = declaredMethods2[i2];
            if (Modifier.isPublic(method3.getModifiers()) && AbstractC4394.m8917(method3.getReturnType(), Void.TYPE) && method3.getParameterTypes().length == 3 && AbstractC4394.m8917(method3.getParameterTypes()[0], Integer.TYPE) && AbstractC4394.m8917(method3.getParameterTypes()[2], List.class)) {
                method2 = method3;
                break;
            }
            i2++;
        }
        if (method2 != null) {
            XposedBridge.hookMethod(method2, new C5834(this, 1));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937784960912721319L);
    }
}
