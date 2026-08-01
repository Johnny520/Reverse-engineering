package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5940 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5943 f16131;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16132;

    public /* synthetic */ C5940(C5943 c5943, int i) {
        this.f16132 = i;
        this.f16131 = c5943;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object result;
        int i = this.f16132;
        int i2 = 0;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (this.f16131.f17376.booleanValue() && (result = methodHookParam.getResult()) != null) {
                    try {
                        try {
                            XposedHelpers.setIntField(result, "mSecurityBeat", 0);
                        } catch (NoSuchFieldError unused) {
                            XposedHelpers.setLongField(result, "mSecurityBeat", 0L);
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            default:
                if (this.f16131.f17376.booleanValue()) {
                    Object obj = methodHookParam.args[1];
                    String str = obj instanceof String ? (String) obj : null;
                    Object result2 = methodHookParam.getResult();
                    ClassLoader classLoader = result2 instanceof ClassLoader ? (ClassLoader) result2 : null;
                    if (AbstractC4394.m8917(str, "qqfav.apk") && classLoader != null && !this.f16131.f16133) {
                        this.f16131.f16133 = true;
                        C5943 c5943 = this.f16131;
                        try {
                            Class clsFindClassIfExists = XposedHelpers.findClassIfExists("com.qqfav.FavoriteService", classLoader);
                            if (clsFindClassIfExists != null) {
                                Method[] declaredMethods = clsFindClassIfExists.getDeclaredMethods();
                                "getDeclaredMethods(...)";
                                declaredMethods.getClass();
                                for (Method method : declaredMethods) {
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    if (method.getReturnType().getName().equals("com.qqfav.data.FavoriteData") && parameterTypes.length == 2) {
                                        Class<?> cls = parameterTypes[0];
                                        Class cls2 = Long.TYPE;
                                        if (AbstractC4394.m8917(cls, cls2) || AbstractC4394.m8917(parameterTypes[0], cls2)) {
                                            Class<?> cls3 = parameterTypes[1];
                                            Class cls4 = Boolean.TYPE;
                                            if (AbstractC4394.m8917(cls3, cls4) || AbstractC4394.m8917(parameterTypes[1], cls4)) {
                                                XposedBridge.hookMethod(method, new C5940(c5943, i2));
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused3) {
                            return;
                        }
                        break;
                    }
                }
                break;
        }
    }
}
