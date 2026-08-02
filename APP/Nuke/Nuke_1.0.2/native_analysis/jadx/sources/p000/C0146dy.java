package p000;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ListIterator;
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.p003ui.HomeActivity;

/* JADX INFO: renamed from: dy */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0146dy implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2257h;

    public /* synthetic */ C0146dy(int i) {
        this.f2257h = i;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Object next;
        Class cls2;
        Object objPrevious;
        Method method2;
        int i = 0;
        switch (this.f2257h) {
            case 0:
                tu2 tu2Var = AbstractC0183ey.f2674a;
                return null;
            case 1:
                AbstractC0752tx.m5444b("Unexpected call to default provider");
                throw new C0594pv();
            case 2:
                return C0274he.f3967f.m5640e().getDeclaringClass();
            case 3:
                return C0274he.f3967f.m5640e();
            case 4:
                return C0274he.f3966e.m5640e();
            case 5:
                a10.f22d.getClass();
                return ((Method) a10.f24f.getValue()).getDeclaringClass();
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return z00.f13694b.m5640e();
            case 7:
                return c10.f1104b.m5640e();
            case 8:
                Context context = up0.f11401i;
                if (context != null) {
                    return new op1(new ai0(context, "global_config").m172a());
                }
                t11.m5067S("hostContext");
                throw null;
            case 9:
                Context context2 = up0.f11401i;
                if (context2 != null) {
                    return new op1(new ai0(context2, "global_cache").m172a());
                }
                t11.m5067S("hostContext");
                throw null;
            case 10:
                float f = yb0.f13389a;
                return Boolean.TRUE;
            case 11:
                C0093cj c0093cj = jp0.f5138a;
                c0093cj.getClass();
                if (!ip0.class.isInterface()) {
                    C0676s.m4651j("API declarations must be interfaces.");
                    return null;
                }
                ArrayDeque arrayDeque = new ArrayDeque(1);
                arrayDeque.add(ip0.class);
                while (!arrayDeque.isEmpty()) {
                    Class cls3 = (Class) arrayDeque.removeFirst();
                    if (cls3.getTypeParameters().length != 0) {
                        StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                        sb.append(cls3.getName());
                        if (cls3 != ip0.class) {
                            sb.append(" which is an interface of ");
                            sb.append(ip0.class.getName());
                        }
                        throw new IllegalArgumentException(sb.toString());
                    }
                    Collections.addAll(arrayDeque, cls3.getInterfaces());
                }
                return (ip0) Proxy.newProxyInstance(ip0.class.getClassLoader(), new Class[]{ip0.class}, new aa2(c0093cj));
            case 12:
                return HomeActivity.onCreate$lambda$0$6$0();
            case 13:
                return op0.m3598u(Boolean.FALSE);
            case 14:
                return op0.m3598u("");
            case 15:
                return op0.m3598u(null);
            case 16:
                return op0.m3598u(null);
            case 17:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 18:
                return ox0.f7867b.m5640e().getParameterTypes()[1];
            case 19:
                Class<?>[] interfaces = mx0.f6913b.m5639d().getInterfaces();
                interfaces.getClass();
                int length = interfaces.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        cls = interfaces[i2];
                        px0 px0Var = px0.f8630d;
                        cls.getClass();
                        px0Var.getClass();
                        if (cls.getClassLoader() == null || wv2.m6012d0(cls.getName(), "java.", false) || wv2.m6012d0(cls.getName(), "javax.", false) || wv2.m6012d0(cls.getName(), "kotlin.", false) || wv2.m6012d0(cls.getName(), "android.", false) || wv2.m6012d0(cls.getName(), "androidx.", false)) {
                            i2++;
                        }
                    } else {
                        cls = null;
                    }
                }
                if (cls != null) {
                    return cls;
                }
                C0676s.m4653l("Image service API interface not found");
                return null;
            case AIChatConfig.MaxContextRounds /* 20 */:
                Method[] declaredMethods = mx0.f6913b.m5639d().getDeclaredMethods();
                declaredMethods.getClass();
                int length2 = declaredMethods.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        method = declaredMethods[i3];
                        if (method.getParameterCount() == 1) {
                            Class<?> cls4 = method.getParameterTypes()[0];
                            px0.f8630d.getClass();
                            Object value = px0.f8632f.getValue();
                            value.getClass();
                            if (!t11.m5086l(cls4, (Class) value) || !pv2.m3995h0(method.getReturnType().getName(), "flow", true)) {
                            }
                        }
                        i3++;
                    } else {
                        method = null;
                    }
                }
                if (method != null) {
                    ig1.m2344a(method);
                    return method;
                }
                C0676s.m4653l("Image service send method not found");
                return null;
            case 21:
                px0.f8630d.getClass();
                Object value2 = px0.f8632f.getValue();
                value2.getClass();
                Constructor<?>[] declaredConstructors = ((Class) value2).getDeclaredConstructors();
                declaredConstructors.getClass();
                int length3 = declaredConstructors.length;
                while (true) {
                    if (i < length3) {
                        constructor = declaredConstructors[i];
                        if (constructor.getParameterCount() != 5) {
                            i++;
                        }
                    } else {
                        constructor = null;
                    }
                }
                if (constructor != null) {
                    ig1.m2344a(constructor);
                    return constructor;
                }
                C0676s.m4653l("Image send task constructor not found");
                return null;
            case 22:
                px0.f8630d.getClass();
                return ((Constructor) px0.f8635i.getValue()).getParameterTypes()[4];
            case 23:
                px0.f8630d.getClass();
                Object value3 = px0.f8636j.getValue();
                value3.getClass();
                ListIterator listIterator = px0.m4015k((Class) value3).listIterator(0);
                while (true) {
                    vs0 vs0Var = (vs0) listIterator;
                    if (vs0Var.hasNext()) {
                        next = vs0Var.next();
                        Class<?> type = ((Field) next).getType();
                        cls2 = Integer.class;
                        Class<Integer> clsM3691A = p40.m3691A(d72.m967a(cls2));
                        if (t11.m5086l(type, clsM3691A != null ? clsM3691A : Integer.class)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Field field = (Field) next;
                if (field != null) {
                    ig1.m2344a(field);
                    return field;
                }
                C0676s.m4653l("Image cross params type field not found");
                return null;
            case 24:
                px0.f8630d.getClass();
                Object value4 = px0.f8632f.getValue();
                value4.getClass();
                pb1 pb1VarM4015k = px0.m4015k((Class) value4);
                ListIterator listIterator2 = pb1VarM4015k.listIterator(pb1VarM4015k.mo152a());
                while (true) {
                    vs0 vs0Var2 = (vs0) listIterator2;
                    if (vs0Var2.hasPrevious()) {
                        objPrevious = vs0Var2.previous();
                        Class<?> type2 = ((Field) objPrevious).getType();
                        Class clsM3691A2 = p40.m3691A(d72.m967a(String.class));
                        if (clsM3691A2 == null) {
                            clsM3691A2 = String.class;
                        }
                        if (t11.m5086l(type2, clsM3691A2)) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                Field field2 = (Field) objPrevious;
                if (field2 != null) {
                    ig1.m2344a(field2);
                    return field2;
                }
                C0676s.m4653l("Image send task media type field not found");
                return null;
            case 25:
                Method[] declaredMethods2 = lx0.f6370b.m5639d().getDeclaredMethods();
                declaredMethods2.getClass();
                int length4 = declaredMethods2.length;
                while (true) {
                    if (i < length4) {
                        method2 = declaredMethods2[i];
                        method2.getClass();
                        if (Modifier.isStatic(method2.getModifiers()) && method2.getName().length() <= 2 && method2.getParameterCount() == 0) {
                            Class<?> returnType = method2.getReturnType();
                            Class clsM3691A3 = p40.m3691A(d72.m967a(String.class));
                            if (clsM3691A3 == null) {
                                clsM3691A3 = String.class;
                            }
                            if (t11.m5086l(returnType, clsM3691A3)) {
                            }
                        }
                        i++;
                    } else {
                        method2 = null;
                    }
                }
                if (method2 != null) {
                    ig1.m2344a(method2);
                    return method2;
                }
                C0676s.m4653l("ConfigStorageLogic self alias method not found");
                return null;
            case 26:
                C0478my c0478my = ly0.f6399a;
                return j50.f4895a;
            case 27:
                tu2 tu2Var2 = k01.f5293a;
                return null;
            case 28:
                return k41.f5333b;
            default:
                return b41.f553b;
        }
    }
}
