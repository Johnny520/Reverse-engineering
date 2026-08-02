package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.UUID;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y63 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13325h;

    public /* synthetic */ y63(int i) {
        this.f13325h = i;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws IllegalAccessException, InvocationTargetException {
        Method method;
        Method method2;
        int parameterCount;
        Class cls;
        Class cls2;
        Method method3;
        int i = 0;
        switch (this.f13325h) {
            case 0:
                return new C0090cg(nv2.f7346a);
            case 1:
                Method[] declaredMethods = zb3.f13823b.m5639d().getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                while (true) {
                    if (i < length) {
                        method = declaredMethods[i];
                        method.getClass();
                        if (Modifier.isStatic(method.getModifiers())) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            Class clsM3691A = p40.m3691A(d72.m967a(String.class));
                            if (clsM3691A == null) {
                                clsM3691A = String.class;
                            }
                            Class clsM3691A2 = p40.m3691A(d72.m967a(String.class));
                            if (clsM3691A2 == null) {
                                clsM3691A2 = String.class;
                            }
                            if (Arrays.equals(parameterTypes, new Class[]{clsM3691A, clsM3691A2})) {
                                Class<?> returnType = method.getReturnType();
                                Class clsM3691A3 = p40.m3691A(d72.m967a(String.class));
                                if (clsM3691A3 == null) {
                                    clsM3691A3 = String.class;
                                }
                                if (t11.m5086l(returnType, clsM3691A3)) {
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
                    ig1.m2344a(method);
                    return method;
                }
                C0676s.m4653l("VoiceLogic voice name method not found");
                return null;
            case 2:
                Method[] declaredMethods2 = zb3.f13823b.m5639d().getDeclaredMethods();
                declaredMethods2.getClass();
                int length2 = declaredMethods2.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        method2 = declaredMethods2[i2];
                        method2.getClass();
                        if (Modifier.isStatic(method2.getModifiers()) && 3 <= (parameterCount = method2.getParameterCount()) && parameterCount < 5) {
                            Class<?> cls3 = method2.getParameterTypes()[0];
                            Class clsM3691A4 = p40.m3691A(d72.m967a(String.class));
                            if (clsM3691A4 == null) {
                                clsM3691A4 = String.class;
                            }
                            if (t11.m5086l(cls3, clsM3691A4)) {
                                Class<?> cls4 = method2.getParameterTypes()[1];
                                cls = Integer.class;
                                Class<Integer> clsM3691A5 = p40.m3691A(d72.m967a(cls));
                                if (clsM3691A5 == null) {
                                    clsM3691A5 = cls;
                                }
                                if (t11.m5086l(cls4, clsM3691A5)) {
                                    Class<?> cls5 = method2.getParameterTypes()[2];
                                    Class<Integer> clsM3691A6 = p40.m3691A(d72.m967a(cls));
                                    if (t11.m5086l(cls5, clsM3691A6 != null ? clsM3691A6 : Integer.class)) {
                                        Class<?> returnType2 = method2.getReturnType();
                                        cls2 = Boolean.class;
                                        Class<Boolean> clsM3691A7 = p40.m3691A(d72.m967a(cls2));
                                        if (t11.m5086l(returnType2, clsM3691A7 != null ? clsM3691A7 : Boolean.class)) {
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
                    ig1.m2344a(method2);
                    return method2;
                }
                C0676s.m4653l("VoiceLogic set voice method not found");
                return null;
            case 3:
                Method methodM5640e = ac3.f148b.m5640e();
                ig1.m2344a(methodM5640e);
                return methodM5640e;
            case 4:
                Method methodM5640e2 = cc3.f1479b.m5640e();
                ig1.m2344a(methodM5640e2);
                return methodM5640e2;
            case 5:
                Method methodM5640e3 = bc3.f785b.m5640e();
                ig1.m2344a(methodM5640e3);
                return methodM5640e3;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                dc3.f1989d.getClass();
                Class<?> declaringClass = ((Method) dc3.f1994i.getValue()).getDeclaringClass();
                Method[] declaredMethods3 = xb3.f12957b.m5639d().getDeclaredMethods();
                declaredMethods3.getClass();
                int length3 = declaredMethods3.length;
                while (true) {
                    if (i < length3) {
                        method3 = declaredMethods3[i];
                        method3.getClass();
                        if (!Modifier.isStatic(method3.getModifiers()) || method3.getParameterCount() != 0 || !t11.m5086l(method3.getReturnType(), declaringClass)) {
                            i++;
                        }
                    } else {
                        method3 = null;
                    }
                }
                if (method3 != null) {
                    ig1.m2344a(method3);
                    return method3;
                }
                C0676s.m4653l("SceneVoiceService getter not found");
                return null;
            case 7:
                String strM1340a = ed3.m1340a();
                String string = ed3.f2402a.getString("last_login_nick_name", "");
                string.getClass();
                return new id2(strM1340a, pv2.m4006s0(string) ? null : string);
            case 8:
                String string2 = UUID.randomUUID().toString();
                string2.getClass();
                return string2;
            case 9:
                a10.f22d.getClass();
                Method method4 = (Method) a10.f24f.getValue();
                ig1.m2344a(method4);
                Object objInvoke = method4.invoke(null, null);
                objInvoke.getClass();
                return (Integer) objInvoke;
            case 10:
                return String.valueOf(((long) ((Number) ed3.f2405d.getValue()).intValue()) & 4294967295L);
            default:
                return mg3.f6643b.m5640e();
        }
    }
}
