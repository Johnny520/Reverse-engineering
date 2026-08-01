package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC4395;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5949 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5948 f16142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16143;

    public /* synthetic */ C5949(C5948 c5948, int i) {
        this.f16143 = i;
        this.f16142 = c5948;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object result;
        int i = this.f16143;
        int i2 = 0;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (this.f16142.f17425.booleanValue() && (result = methodHookParam.getResult()) != null) {
                    try {
                        try {
                            XposedHelpers.setIntField(result, AbstractC8405.m13972(2049), 0);
                        } catch (NoSuchFieldError unused) {
                            XposedHelpers.setLongField(result, AbstractC8405.m13972(2049), 0L);
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            default:
                if (this.f16142.f17425.booleanValue()) {
                    Object obj = methodHookParam.args[1];
                    String str = obj instanceof String ? (String) obj : null;
                    Object result2 = methodHookParam.getResult();
                    ClassLoader classLoader = result2 instanceof ClassLoader ? (ClassLoader) result2 : null;
                    if (AbstractC4395.m8907(str, AbstractC8405.m13972(1888)) && classLoader != null && !this.f16142.f16141) {
                        this.f16142.f16141 = true;
                        C5948 c5948 = this.f16142;
                        try {
                            Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC8405.m13972(2052), classLoader);
                            if (clsFindClassIfExists != null) {
                                Method[] declaredMethods = clsFindClassIfExists.getDeclaredMethods();
                                AbstractC8405.m13972(1555);
                                declaredMethods.getClass();
                                for (Method method : declaredMethods) {
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    if (method.getReturnType().getName().equals(AbstractC8405.m13972(2053)) && parameterTypes.length == 2) {
                                        Class<?> cls = parameterTypes[0];
                                        Class cls2 = Long.TYPE;
                                        if (AbstractC4395.m8907(cls, cls2) || AbstractC4395.m8907(parameterTypes[0], cls2)) {
                                            Class<?> cls3 = parameterTypes[1];
                                            Class cls4 = Boolean.TYPE;
                                            if (AbstractC4395.m8907(cls3, cls4) || AbstractC4395.m8907(parameterTypes[1], cls4)) {
                                                XposedBridge.hookMethod(method, new C5949(c5948, i2));
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
