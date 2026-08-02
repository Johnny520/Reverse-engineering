package defpackage;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ListIterator;
import nuke.module.wechat.ai.AIChatConfig;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy implements xm0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a10.<clinit>():void, e10.<clinit>():void, eu.e(java.util.List, java.util.List, java.lang.String, in0, boolean, in0, rs2, mn0, mn0, mn0, px, int):void, ly.<clinit>():void, my.<init>(in0):void, nuke.ui.HomeActivity.onCreate$lambda$0(nuke.ui.HomeActivity, px, int):a83, nx0.j(java.lang.Object):java.lang.Object] */
    public /* synthetic */ dy(int i) {
        this.h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Object next;
        Class cls2;
        Object objPrevious;
        Method method2;
        int i = 0;
        switch (this.h) {
            case 0:
                tu2 tu2Var = ey.a;
                return null;
            case 1:
                tx.b("Unexpected call to default provider");
                throw new pv();
            case 2:
                return he.f.e().getDeclaringClass();
            case 3:
                return he.f.e();
            case 4:
                return he.e.e();
            case 5:
                a10.d.getClass();
                return ((Method) a10.f.getValue()).getDeclaringClass();
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return z00.b.e();
            case 7:
                return c10.b.e();
            case 8:
                Context context = up0.i;
                if (context != null) {
                    return new op1(new ai0(context, "global_config").a());
                }
                t11.S("hostContext");
                throw null;
            case 9:
                Context context2 = up0.i;
                if (context2 != null) {
                    return new op1(new ai0(context2, "global_cache").a());
                }
                t11.S("hostContext");
                throw null;
            case 10:
                float f = yb0.a;
                return Boolean.TRUE;
            case 11:
                cj cjVar = jp0.a;
                cjVar.getClass();
                if (!ip0.class.isInterface()) {
                    s.j("API declarations must be interfaces.");
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
                return (ip0) Proxy.newProxyInstance(ip0.class.getClassLoader(), new Class[]{ip0.class}, new aa2(cjVar));
            case 12:
                return HomeActivity.onCreate$lambda$0$6$0();
            case 13:
                return op0.u(Boolean.FALSE);
            case 14:
                return op0.u("");
            case 15:
                return op0.u(null);
            case 16:
                return op0.u(null);
            case 17:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 18:
                return ox0.b.e().getParameterTypes()[1];
            case 19:
                Class<?>[] interfaces = mx0.b.d().getInterfaces();
                interfaces.getClass();
                int length = interfaces.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        cls = interfaces[i2];
                        px0 px0Var = px0.d;
                        cls.getClass();
                        px0Var.getClass();
                        if (cls.getClassLoader() == null || wv2.d0(cls.getName(), "java.", false) || wv2.d0(cls.getName(), "javax.", false) || wv2.d0(cls.getName(), "kotlin.", false) || wv2.d0(cls.getName(), "android.", false) || wv2.d0(cls.getName(), "androidx.", false)) {
                            i2++;
                        }
                    } else {
                        cls = null;
                    }
                }
                if (cls != null) {
                    return cls;
                }
                s.l("Image service API interface not found");
                return null;
            case AIChatConfig.MaxContextRounds /* 20 */:
                Method[] declaredMethods = mx0.b.d().getDeclaredMethods();
                declaredMethods.getClass();
                int length2 = declaredMethods.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        method = declaredMethods[i3];
                        if (method.getParameterCount() == 1) {
                            Class<?> cls4 = method.getParameterTypes()[0];
                            px0.d.getClass();
                            Object value = px0.f.getValue();
                            value.getClass();
                            if (!t11.l(cls4, (Class) value) || !pv2.h0(method.getReturnType().getName(), "flow", true)) {
                            }
                        }
                        i3++;
                    } else {
                        method = null;
                    }
                }
                if (method != null) {
                    ig1.a(method);
                    return method;
                }
                s.l("Image service send method not found");
                return null;
            case 21:
                px0.d.getClass();
                Object value2 = px0.f.getValue();
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
                    ig1.a(constructor);
                    return constructor;
                }
                s.l("Image send task constructor not found");
                return null;
            case 22:
                px0.d.getClass();
                return ((Constructor) px0.i.getValue()).getParameterTypes()[4];
            case 23:
                px0.d.getClass();
                Object value3 = px0.j.getValue();
                value3.getClass();
                ListIterator listIterator = px0.k((Class) value3).listIterator(0);
                while (true) {
                    vs0 vs0Var = (vs0) listIterator;
                    if (vs0Var.hasNext()) {
                        next = vs0Var.next();
                        Class<?> type = ((Field) next).getType();
                        cls2 = Integer.class;
                        Class<Integer> clsA = p40.A(d72.a(cls2));
                        if (t11.l(type, clsA != null ? clsA : Integer.class)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Field field = (Field) next;
                if (field != null) {
                    ig1.a(field);
                    return field;
                }
                s.l("Image cross params type field not found");
                return null;
            case 24:
                px0.d.getClass();
                Object value4 = px0.f.getValue();
                value4.getClass();
                pb1 pb1VarK = px0.k((Class) value4);
                ListIterator listIterator2 = pb1VarK.listIterator(pb1VarK.a());
                while (true) {
                    vs0 vs0Var2 = (vs0) listIterator2;
                    if (vs0Var2.hasPrevious()) {
                        objPrevious = vs0Var2.previous();
                        Class<?> type2 = ((Field) objPrevious).getType();
                        Class clsA2 = p40.A(d72.a(String.class));
                        if (clsA2 == null) {
                            clsA2 = String.class;
                        }
                        if (t11.l(type2, clsA2)) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                Field field2 = (Field) objPrevious;
                if (field2 != null) {
                    ig1.a(field2);
                    return field2;
                }
                s.l("Image send task media type field not found");
                return null;
            case 25:
                Method[] declaredMethods2 = lx0.b.d().getDeclaredMethods();
                declaredMethods2.getClass();
                int length4 = declaredMethods2.length;
                while (true) {
                    if (i < length4) {
                        method2 = declaredMethods2[i];
                        method2.getClass();
                        if (Modifier.isStatic(method2.getModifiers()) && method2.getName().length() <= 2 && method2.getParameterCount() == 0) {
                            Class<?> returnType = method2.getReturnType();
                            Class clsA3 = p40.A(d72.a(String.class));
                            if (clsA3 == null) {
                                clsA3 = String.class;
                            }
                            if (t11.l(returnType, clsA3)) {
                            }
                        }
                        i++;
                    } else {
                        method2 = null;
                    }
                }
                if (method2 != null) {
                    ig1.a(method2);
                    return method2;
                }
                s.l("ConfigStorageLogic self alias method not found");
                return null;
            case 26:
                my myVar = ly0.a;
                return j50.a;
            case 27:
                tu2 tu2Var2 = k01.a;
                return null;
            case 28:
                return k41.b;
            default:
                return b41.b;
        }
    }
}
