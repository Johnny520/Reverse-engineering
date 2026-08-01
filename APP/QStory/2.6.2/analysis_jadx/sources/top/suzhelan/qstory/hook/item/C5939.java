package top.suzhelan.qstory.hook.item;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p035.AbstractC6340;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪哲世;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5939 extends AbstractC6293 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11265(Class cls) {
        ArrayList arrayList = new ArrayList();
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC3056.m6668(-3937714304405734823L);
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                AbstractC3056.m6668(-3937730724065707431L);
                parameterTypes.getClass();
                if (parameterTypes.length == 0 && AbstractC4394.m8917(method.getReturnType(), Boolean.TYPE)) {
                    arrayList.add(method);
                }
            }
        }
        if (arrayList.size() > 1) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String name = ((Method) obj).getName();
                AbstractC3056.m6668(-3937741817966232999L);
                name.getClass();
                String strM4563 = AbstractC2442.m4563(name, Locale.ROOT, -3937688152349869479L);
                if (AbstractC5143.m10171(strM4563, AbstractC3056.m6668(-3937691841726776743L), false) || AbstractC5143.m10171(strM4563, AbstractC3056.m6668(-3937765891257927079L), false) || AbstractC5143.m10171(strM4563, AbstractC3056.m6668(-3937765874078057895L), false)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                return (Method) AbstractC4343.m8827(arrayList2);
            }
        }
        return (Method) AbstractC4343.m8830(arrayList);
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        try {
            if (AbstractC6340.f17461 < 4852) {
                return;
            }
            Class<?> clsLoadClass = classLoader.loadClass(AbstractC3056.m6668(-3937766252035179943L));
            clsLoadClass.getClass();
            Method methodM11265 = m11265(clsLoadClass);
            if (methodM11265 != null) {
                XposedBridge.hookMethod(methodM11265, new C5811(this, 9));
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937766325049623975L);
    }
}
