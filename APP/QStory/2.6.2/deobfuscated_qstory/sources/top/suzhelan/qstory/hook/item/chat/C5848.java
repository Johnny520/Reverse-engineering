package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p394.C9131;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰世哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5848 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        int i;
        Object next;
        "classLoader";
        classLoader.getClass();
        try {
            C9131 c9131 = new C9131();
            c9131.f25544.addAll(Arrays.asList("chat_summary.compose"));
            c9131.m14699("\u672a\u8bfb\u6d88\u606f\u8f83\u591a\u65f6\uff0c\u53ef\u4ee5\u8fdb\u884c\u7fa4\u804a\u603b\u7ed3", "\u7acb\u5373\u603b\u7ed3");
            ArrayList arrayListM14700 = c9131.m14700();
            "find(...)";
            Iterator it = arrayListM14700.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String name = ((Class) next).getName();
                "getName(...)";
                if (AbstractC5143.m10171(name, "SummaryGenGuideViewKt", false)) {
                    break;
                }
            }
            Class cls = (Class) next;
            if (cls == null) {
                return;
            }
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 5) {
                    Class<?> cls2 = parameterTypes[1];
                    Class cls3 = Boolean.TYPE;
                    if (AbstractC4394.m8917(cls2, cls3) || AbstractC4394.m8917(parameterTypes[1], cls3)) {
                        XposedBridge.hookMethod(constructor, new C5811(this, 14));
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u5f3a\u5236\u542f\u7528'\u7acb\u5373\u603b\u7ed3'\u6309\u94ae\uff0c\u652f\u6301QQ 9.2.35+";
    }
}
