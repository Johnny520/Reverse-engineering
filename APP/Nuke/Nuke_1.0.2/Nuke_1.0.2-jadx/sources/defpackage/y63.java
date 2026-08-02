package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.UUID;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y63 implements xm0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b73.<clinit>():void, ng3.<clinit>():void] */
    public /* synthetic */ y63(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() throws IllegalAccessException, InvocationTargetException {
        Method method;
        Method method2;
        int parameterCount;
        Class cls;
        Class cls2;
        Method method3;
        int i = 0;
        switch (this.h) {
            case 0:
                return new cg(nv2.a);
            case 1:
                Method[] declaredMethods = zb3.b.d().getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                while (true) {
                    if (i < length) {
                        method = declaredMethods[i];
                        method.getClass();
                        if (Modifier.isStatic(method.getModifiers())) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            Class clsA = p40.A(d72.a(String.class));
                            if (clsA == null) {
                                clsA = String.class;
                            }
                            Class clsA2 = p40.A(d72.a(String.class));
                            if (clsA2 == null) {
                                clsA2 = String.class;
                            }
                            if (Arrays.equals(parameterTypes, new Class[]{clsA, clsA2})) {
                                Class<?> returnType = method.getReturnType();
                                Class clsA3 = p40.A(d72.a(String.class));
                                if (clsA3 == null) {
                                    clsA3 = String.class;
                                }
                                if (t11.l(returnType, clsA3)) {
                                }
                            } else {
                                continue;
                            }
                        }
                        i++;
                    } else {
                        method = null;
                    }
                }
                if (method != null) {
                    ig1.a(method);
                    return method;
                }
                s.l("VoiceLogic voice name method not found");
                return null;
            case 2:
                Method[] declaredMethods2 = zb3.b.d().getDeclaredMethods();
                declaredMethods2.getClass();
                int length2 = declaredMethods2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        method2 = declaredMethods2[i2];
                        method2.getClass();
                        if (Modifier.isStatic(method2.getModifiers()) && 3 <= (parameterCount = method2.getParameterCount()) && parameterCount < 5) {
                            Class<?> cls3 = method2.getParameterTypes()[0];
                            Class clsA4 = p40.A(d72.a(String.class));
                            if (clsA4 == null) {
                                clsA4 = String.class;
                            }
                            if (t11.l(cls3, clsA4)) {
                                Class<?> cls4 = method2.getParameterTypes()[1];
                                cls = Integer.class;
                                Class<Integer> clsA5 = p40.A(d72.a(cls));
                                if (clsA5 == null) {
                                    clsA5 = cls;
                                }
                                if (t11.l(cls4, clsA5)) {
                                    Class<?> cls5 = method2.getParameterTypes()[2];
                                    Class<Integer> clsA6 = p40.A(d72.a(cls));
                                    if (t11.l(cls5, clsA6 != null ? clsA6 : Integer.class)) {
                                        Class<?> returnType2 = method2.getReturnType();
                                        cls2 = Boolean.class;
                                        Class<Boolean> clsA7 = p40.A(d72.a(cls2));
                                        if (t11.l(returnType2, clsA7 != null ? clsA7 : Boolean.class)) {
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2++;
                    } else {
                        method2 = null;
                    }
                }
                if (method2 != null) {
                    ig1.a(method2);
                    return method2;
                }
                s.l("VoiceLogic set voice method not found");
                return null;
            case 3:
                Method methodE = ac3.b.e();
                ig1.a(methodE);
                return methodE;
            case 4:
                Method methodE2 = cc3.b.e();
                ig1.a(methodE2);
                return methodE2;
            case 5:
                Method methodE3 = bc3.b.e();
                ig1.a(methodE3);
                return methodE3;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                dc3.d.getClass();
                Class<?> declaringClass = ((Method) dc3.i.getValue()).getDeclaringClass();
                Method[] declaredMethods3 = xb3.b.d().getDeclaredMethods();
                declaredMethods3.getClass();
                int length3 = declaredMethods3.length;
                while (true) {
                    if (i < length3) {
                        method3 = declaredMethods3[i];
                        method3.getClass();
                        if (!Modifier.isStatic(method3.getModifiers()) || method3.getParameterCount() != 0 || !t11.l(method3.getReturnType(), declaringClass)) {
                            i++;
                        }
                    } else {
                        method3 = null;
                    }
                }
                if (method3 != null) {
                    ig1.a(method3);
                    return method3;
                }
                s.l("SceneVoiceService getter not found");
                return null;
            case 7:
                String strA = ed3.a();
                String string = ed3.a.getString("last_login_nick_name", "");
                string.getClass();
                return new id2(strA, pv2.s0(string) ? null : string);
            case 8:
                String string2 = UUID.randomUUID().toString();
                string2.getClass();
                return string2;
            case 9:
                a10.d.getClass();
                Method method4 = (Method) a10.f.getValue();
                ig1.a(method4);
                Object objInvoke = method4.invoke(null, null);
                objInvoke.getClass();
                return (Integer) objInvoke;
            case 10:
                return String.valueOf(((long) ((Number) ed3.d.getValue()).intValue()) & 4294967295L);
            default:
                return mg3.b.e();
        }
    }
}
