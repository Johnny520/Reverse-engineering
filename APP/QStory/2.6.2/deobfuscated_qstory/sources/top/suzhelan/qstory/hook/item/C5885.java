package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import org.xmlpull.v1.XmlPullParser;
import p026.AbstractC6293;
import p035.AbstractC6340;
import p053.AbstractC6560;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲兰苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5885 extends AbstractC6293 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11226(Class cls) {
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (AbstractC4394.m8917(method.getReturnType(), ArrayList.class) && method.getParameterTypes().length == 1 && AbstractC4394.m8917(method.getParameterTypes()[0], XmlPullParser.class)) {
                    return method;
                }
            }
        } catch (Exception unused) {
        }
        try {
            return cls.getDeclaredMethod("doParseRules", XmlPullParser.class);
        } catch (NoSuchMethodException unused2) {
            Iterator it = AbstractC8189.m13659("parseRules", "parseAnimationRules", "loadRules").iterator();
            while (it.hasNext()) {
                try {
                    return cls.getDeclaredMethod((String) it.next(), XmlPullParser.class);
                } catch (NoSuchMethodException unused3) {
                }
            }
            return null;
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        try {
            int i = AbstractC6340.f17461;
            Class<?> clsLoadClass = classLoader.loadClass(i >= 6458 ? "com.tencent.mobileqq.aio.animation.util.b" : i >= 5626 ? "com.tencent.mobileqq.aio.animation.util.d" : AbstractC6560.m12011() ? "com.tencent.mobileqq.aio.animation.util.AioAnimationConfigHelper" : "com.tencent.mobileqq.activity.aio.anim.AioAnimationConfigHelper");
            clsLoadClass.getClass();
            Method methodM11226 = m11226(clsLoadClass);
            if (methodM11226 != null) {
                XposedBridge.hookMethod(methodM11226, new C5811(this, 3));
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u5c4f\u853d\u4e00\u4e9b\u5173\u952e\u8bcd\u89e6\u53d1\u7684\u6389\u843d\u5c0f\u8868\u60c5 \u91cd\u542f\u751f\u6548";
    }
}
