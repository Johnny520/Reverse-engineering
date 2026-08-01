package top.suzhelan.qstory.hook.item;

import android.content.Intent;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏哲世兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5926 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists("cooperation.buscard.BuscardHelper", classLoader);
            if (clsFindClassIfExists != null) {
                Method[] declaredMethods = clsFindClassIfExists.getDeclaredMethods();
                "getDeclaredMethods(...)";
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    "getParameterTypes(...)";
                    parameterTypes.getClass();
                    int length = parameterTypes.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (AbstractC4394.m8917(parameterTypes[i], Intent.class)) {
                            XposedBridge.hookMethod(method, new C5811(this, 1));
                            break;
                        }
                        i++;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u7981\u6b62QQ\u5728\u540e\u53f0\u5e72\u6270NFC";
    }
}
