package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6779 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6778 f16487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16488;

    public /* synthetic */ C6779(C6778 c6778, int i) {
        this.f16488 = i;
        this.f16487 = c6778;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object result;
        int i = this.f16488;
        int i2 = 0;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (this.f16487.f17770.booleanValue() && (result = methodHookParam.getResult()) != null) {
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
                if (this.f16487.f17770.booleanValue()) {
                    Object obj = methodHookParam.args[1];
                    String str = obj instanceof String ? (String) obj : null;
                    Object result2 = methodHookParam.getResult();
                    ClassLoader classLoader = result2 instanceof ClassLoader ? (ClassLoader) result2 : null;
                    if (AbstractC5227.m9466(str, "qqfav.apk") && classLoader != null && !this.f16487.f16486) {
                        this.f16487.f16486 = true;
                        C6778 c6778 = this.f16487;
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
                                        if (AbstractC5227.m9466(cls, cls2) || AbstractC5227.m9466(parameterTypes[0], cls2)) {
                                            Class<?> cls3 = parameterTypes[1];
                                            Class cls4 = Boolean.TYPE;
                                            if (AbstractC5227.m9466(cls3, cls4) || AbstractC5227.m9466(parameterTypes[1], cls4)) {
                                                XposedBridge.hookMethod(method, new C6779(c6778, i2));
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
