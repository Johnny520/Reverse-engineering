package p086r0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.p055lu.wxmask.MainHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import p001A0.AbstractC0039l;
import p001A0.C0026a;
import p001A0.C0028b;
import p001A0.C0030c;
import p001A0.C0031d;
import p001A0.C0035h;
import p001A0.C0048u;
import p001A0.C0052y;
import p005C0.C0070d;
import p005C0.C0071e;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0124l;
import p011F0.AbstractC0135w;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p031P0.AbstractC0235a;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p081o0.C0781b;
import p084q0.C0804d;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1135r;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0908i implements InterfaceC0551a {

    /* JADX INFO: renamed from: e */
    public static final List f3203e = AbstractC0124l.m286Z("你撤回了一条消息", "you recalled a message");

    /* JADX INFO: renamed from: f */
    public static final List f3204f = AbstractC0124l.m286Z("撤回了一条消息", "recalled a message");

    /* JADX INFO: renamed from: g */
    public static final String[] f3205g = {"com.tencent.mm.chatroom.plugin.listener.n0", "com.tencent.mm.chatroom.plugin.listener.k0", "ak5.y", "eg5.j", "f81.o", "lc5.y", "mw3.w", "q12.b0"};

    /* JADX INFO: renamed from: h */
    public static final Set f3206h = AbstractC0135w.m302a0("insert", "insertOrThrow", "insertWithOnConflict", "update", "updateWithOnConflict", "replace", "replaceOrThrow");

    /* JADX INFO: renamed from: a */
    public volatile Object f3207a;

    /* JADX INFO: renamed from: b */
    public volatile Object f3208b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f3209c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public final C0890c f3210d = new C0890c(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x033c, code lost:
    
        if (r16 == null) goto L238;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:425:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:427:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:428:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098 A[PHI: r0
  0x0098: PHI (r0v4 java.lang.Object) = (r0v3 java.lang.Object), (r0v95 java.lang.Object) binds: [B:37:0x007f, B:41:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0152  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1950a(C0908i c0908i, Context context, Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object c0104d;
        Method method;
        String str;
        String str2;
        Object c0104d2;
        Method method2;
        Number number;
        Number number2;
        Number number3;
        long jLongValue;
        Object c0104d3;
        Method method3;
        Method method4;
        Number number4;
        Object c0104d4;
        Object obj5;
        Method method5;
        Method method6;
        int iIntValue;
        Object obj6 = obj;
        c0908i.getClass();
        Object c0104d5 = null;
        if (AbstractC0223g.m414a(obj6 != null ? obj6.getClass().getName() : null, "com.tencent.mm.autogen.events.RevokeMsgEvent")) {
            String str3 = "f71953g";
            if (obj6 != null) {
                Class<?> superclass = obj6.getClass();
                while (true) {
                    if (superclass == null) {
                        break;
                    }
                    try {
                        Field declaredField = superclass.getDeclaredField(str3);
                        declaredField.setAccessible(true);
                        obj2 = declaredField.get(obj6);
                        if (obj2 == null) {
                            break;
                        }
                    } catch (NoSuchFieldException unused) {
                        superclass = superclass.getSuperclass();
                    } catch (Throwable unused2) {
                    }
                }
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                if (obj6 == null) {
                    obj2 = null;
                    if (obj2 == null) {
                        return;
                    }
                } else {
                    Class<?> superclass2 = obj6.getClass();
                    while (true) {
                        if (superclass2 == null) {
                            break;
                        }
                        try {
                            Field declaredField2 = superclass2.getDeclaredField("g");
                            declaredField2.setAccessible(true);
                            Object obj7 = declaredField2.get(obj6);
                            if (obj7 == null) {
                                break;
                            } else {
                                obj2 = obj7;
                            }
                        } catch (NoSuchFieldException unused3) {
                            superclass2 = superclass2.getSuperclass();
                        } catch (Throwable unused4) {
                        }
                    }
                    if (obj2 == null) {
                    }
                }
            }
            String str4 = "f6371c";
            Class<?> superclass3 = obj2.getClass();
            while (true) {
                if (superclass3 == null) {
                    break;
                }
                try {
                    Field declaredField3 = superclass3.getDeclaredField(str4);
                    declaredField3.setAccessible(true);
                    obj3 = declaredField3.get(obj2);
                    if (obj3 == null) {
                        break;
                    }
                } catch (NoSuchFieldException unused5) {
                    superclass3 = superclass3.getSuperclass();
                } catch (Throwable unused6) {
                }
            }
            if (obj3 != null) {
                String str5 = "c";
                Class<?> superclass4 = obj2.getClass();
                while (true) {
                    if (superclass4 == null) {
                        break;
                    }
                    try {
                        Field declaredField4 = superclass4.getDeclaredField(str5);
                        declaredField4.setAccessible(true);
                        obj3 = declaredField4.get(obj2);
                        if (obj3 == null) {
                            break;
                        }
                    } catch (NoSuchFieldException unused7) {
                        superclass4 = superclass4.getSuperclass();
                    } catch (Throwable unused8) {
                    }
                }
                obj4 = obj3;
            } else {
                obj4 = obj3;
            }
            if (obj4 == null) {
                c0104d = null;
            } else {
                try {
                    Method[] methods = obj4.getClass().getMethods();
                    AbstractC0223g.m417d(methods, "getMethods(...)");
                    int length = methods.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            method = null;
                            break;
                        }
                        method = methods[i2];
                        if (AbstractC0223g.m414a(method.getName(), "Q0")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                break;
                            }
                        }
                        i2++;
                    }
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                if (method == null) {
                    Method[] declaredMethods = obj4.getClass().getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                    int length2 = declaredMethods.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            method = null;
                            break;
                        }
                        method = declaredMethods[i3];
                        if (AbstractC0223g.m414a(method.getName(), "Q0")) {
                            Class<?>[] parameterTypes2 = method.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                            if (parameterTypes2.length == 0) {
                                break;
                            }
                        }
                        i3++;
                    }
                    if (method == null) {
                        c0104d = null;
                    }
                }
                method.setAccessible(true);
                Object objInvoke = method.invoke(obj4, null);
                if (!(objInvoke instanceof String)) {
                    objInvoke = null;
                }
                c0104d = (String) objInvoke;
                if (c0104d instanceof C0104d) {
                }
            }
            str = (String) c0104d;
            if (str == null) {
                if (obj4 == null) {
                    str = null;
                    if (str == null) {
                        return;
                    }
                } else {
                    for (Class<?> superclass5 = obj4.getClass(); superclass5 != null; superclass5 = superclass5.getSuperclass()) {
                        try {
                            Field declaredField5 = superclass5.getDeclaredField("field_talker");
                            declaredField5.setAccessible(true);
                            Object obj8 = declaredField5.get(obj4);
                            if (!(obj8 instanceof String)) {
                                obj8 = null;
                            }
                            str = (String) obj8;
                            break;
                        } catch (NoSuchFieldException unused9) {
                        } catch (Throwable unused10) {
                            str = null;
                        }
                    }
                    str = null;
                    if (str == null) {
                    }
                }
            }
            str2 = str;
            if (obj4 == null) {
                c0104d2 = null;
            } else {
                try {
                    Method[] methods2 = obj4.getClass().getMethods();
                    AbstractC0223g.m417d(methods2, "getMethods(...)");
                    int length3 = methods2.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length3) {
                            method2 = null;
                            break;
                        }
                        method2 = methods2[i4];
                        if (AbstractC0223g.m414a(method2.getName(), "I0")) {
                            Class<?>[] parameterTypes3 = method2.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes3, "getParameterTypes(...)");
                            if (parameterTypes3.length == 0) {
                                break;
                            }
                        }
                        i4++;
                    }
                } catch (Throwable th2) {
                    c0104d2 = new C0104d(th2);
                }
                if (method2 == null) {
                    Method[] declaredMethods2 = obj4.getClass().getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods2, "getDeclaredMethods(...)");
                    int length4 = declaredMethods2.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length4) {
                            method2 = null;
                            break;
                        }
                        method2 = declaredMethods2[i5];
                        if (AbstractC0223g.m414a(method2.getName(), "I0")) {
                            Class<?>[] parameterTypes4 = method2.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes4, "getParameterTypes(...)");
                            if (parameterTypes4.length == 0) {
                                break;
                            }
                        }
                        i5++;
                    }
                    if (method2 == null) {
                        c0104d2 = null;
                    }
                }
                method2.setAccessible(true);
                Object objInvoke2 = method2.invoke(obj4, null);
                if (!(objInvoke2 instanceof Number)) {
                    objInvoke2 = null;
                }
                c0104d2 = (Number) objInvoke2;
                if (c0104d2 instanceof C0104d) {
                }
            }
            number = (Number) c0104d2;
            if (number != null) {
                long jLongValue2 = number.longValue();
                Long lValueOf = Long.valueOf(jLongValue2);
                if (jLongValue2 <= 0) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    for (Class<?> superclass6 = obj2.getClass(); superclass6 != null; superclass6 = superclass6.getSuperclass()) {
                        try {
                            Field declaredField6 = superclass6.getDeclaredField("f6373e");
                            declaredField6.setAccessible(true);
                            Object obj9 = declaredField6.get(obj2);
                            if (!(obj9 instanceof Number)) {
                                obj9 = null;
                            }
                            number2 = (Number) obj9;
                            break;
                        } catch (NoSuchFieldException unused11) {
                        } catch (Throwable unused12) {
                            number2 = null;
                        }
                    }
                    number2 = null;
                    if (number2 != null) {
                        jLongValue = number2.longValue();
                    } else {
                        for (Class<?> superclass7 = obj2.getClass(); superclass7 != null; superclass7 = superclass7.getSuperclass()) {
                            try {
                                Field declaredField7 = superclass7.getDeclaredField("e");
                                declaredField7.setAccessible(true);
                                Object obj10 = declaredField7.get(obj2);
                                if (!(obj10 instanceof Number)) {
                                    obj10 = null;
                                }
                                number3 = (Number) obj10;
                                break;
                            } catch (NoSuchFieldException unused13) {
                            } catch (Throwable unused14) {
                                number3 = null;
                            }
                        }
                        number3 = null;
                        lValueOf = number3 != null ? Long.valueOf(number3.longValue()) : null;
                        if (lValueOf == null) {
                            return;
                        }
                        jLongValue = lValueOf.longValue();
                    }
                }
            }
            if (AbstractC0307q.m534d0(str2) || jLongValue <= 0) {
                return;
            }
            if (obj4 == null) {
                c0104d3 = null;
            } else {
                try {
                    Method[] methods3 = obj4.getClass().getMethods();
                    AbstractC0223g.m417d(methods3, "getMethods(...)");
                    int length5 = methods3.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length5) {
                            method3 = null;
                            break;
                        }
                        method3 = methods3[i6];
                        if (AbstractC0223g.m414a(method3.getName(), "getCreateTime")) {
                            Class<?>[] parameterTypes5 = method3.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes5, "getParameterTypes(...)");
                            if (parameterTypes5.length == 0) {
                                break;
                            }
                        }
                        i6++;
                    }
                } catch (Throwable th3) {
                    c0104d3 = new C0104d(th3);
                }
                if (method3 == null) {
                    Method[] declaredMethods3 = obj4.getClass().getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods3, "getDeclaredMethods(...)");
                    int length6 = declaredMethods3.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length6) {
                            method3 = null;
                            break;
                        }
                        method3 = declaredMethods3[i7];
                        if (AbstractC0223g.m414a(method3.getName(), "getCreateTime")) {
                            Class<?>[] parameterTypes6 = method3.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes6, "getParameterTypes(...)");
                            if (parameterTypes6.length == 0) {
                                break;
                            }
                        }
                        i7++;
                    }
                    if (method3 == null) {
                        c0104d3 = null;
                    }
                }
                method3.setAccessible(true);
                Object objInvoke3 = method3.invoke(obj4, null);
                if (!(objInvoke3 instanceof Number)) {
                    objInvoke3 = null;
                }
                c0104d3 = (Number) objInvoke3;
                if (c0104d3 instanceof C0104d) {
                }
            }
            Number number5 = (Number) c0104d3;
            long jLongValue3 = number5 != null ? number5.longValue() : System.currentTimeMillis();
            if (obj4 != null) {
                try {
                    Method[] methods4 = obj4.getClass().getMethods();
                    AbstractC0223g.m417d(methods4, "getMethods(...)");
                    int length7 = methods4.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length7) {
                            method4 = null;
                            break;
                        }
                        method4 = methods4[i8];
                        if (AbstractC0223g.m414a(method4.getName(), "j")) {
                            Class<?>[] parameterTypes7 = method4.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes7, "getParameterTypes(...)");
                            if (parameterTypes7.length == 0) {
                                break;
                            }
                        }
                        i8++;
                    }
                    if (method4 == null) {
                        Method[] declaredMethods4 = obj4.getClass().getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods4, "getDeclaredMethods(...)");
                        int length8 = declaredMethods4.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length8) {
                                method4 = null;
                                break;
                            }
                            Method method7 = declaredMethods4[i9];
                            if (AbstractC0223g.m414a(method7.getName(), "j")) {
                                Class<?>[] parameterTypes8 = method7.getParameterTypes();
                                AbstractC0223g.m417d(parameterTypes8, "getParameterTypes(...)");
                                if (parameterTypes8.length == 0) {
                                    method4 = method7;
                                    break;
                                }
                            }
                            i9++;
                        }
                    }
                    Method method8 = method4;
                    method8.setAccessible(true);
                    Object objInvoke4 = method8.invoke(obj4, null);
                    c0104d5 = (String) (!(objInvoke4 instanceof String) ? null : objInvoke4);
                } catch (Throwable th4) {
                    c0104d5 = new C0104d(th4);
                }
                if (c0104d5 instanceof C0104d) {
                    c0104d5 = null;
                }
            }
            String str6 = (String) c0104d5;
            if (str6 == null) {
                if (obj4 == null) {
                    str6 = null;
                    if (str6 == null) {
                        str6 = "";
                    }
                } else {
                    for (Class<?> superclass8 = obj4.getClass(); superclass8 != null; superclass8 = superclass8.getSuperclass()) {
                        try {
                            Field declaredField8 = superclass8.getDeclaredField("field_content");
                            declaredField8.setAccessible(true);
                            Object obj11 = declaredField8.get(obj4);
                            if (!(obj11 instanceof String)) {
                                obj11 = null;
                            }
                            str6 = (String) obj11;
                            break;
                        } catch (NoSuchFieldException unused15) {
                        } catch (Throwable unused16) {
                            str6 = null;
                        }
                    }
                    str6 = null;
                    if (str6 == null) {
                    }
                }
            }
            if (obj4 == null) {
                number4 = null;
                obj5 = null;
            } else {
                try {
                    Method[] methods5 = obj4.getClass().getMethods();
                    AbstractC0223g.m417d(methods5, "getMethods(...)");
                    int length9 = methods5.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length9) {
                            method5 = null;
                            break;
                        }
                        method5 = methods5[i10];
                        if (AbstractC0223g.m414a(method5.getName(), "A0")) {
                            Class<?>[] parameterTypes9 = method5.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes9, "getParameterTypes(...)");
                            if (parameterTypes9.length == 0) {
                                break;
                            }
                        }
                        i10++;
                    }
                    if (method5 == null) {
                        Method[] declaredMethods5 = obj4.getClass().getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods5, "getDeclaredMethods(...)");
                        int length10 = declaredMethods5.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length10) {
                                method6 = null;
                                break;
                            }
                            method6 = declaredMethods5[i11];
                            if (AbstractC0223g.m414a(method6.getName(), "A0")) {
                                Class<?>[] parameterTypes10 = method6.getParameterTypes();
                                AbstractC0223g.m417d(parameterTypes10, "getParameterTypes(...)");
                                if (parameterTypes10.length == 0) {
                                    break;
                                }
                            }
                            i11++;
                        }
                        if (method6 == null) {
                            number4 = null;
                            obj5 = null;
                        } else {
                            method5 = method6;
                        }
                    }
                    method5.setAccessible(true);
                    number4 = null;
                    try {
                        Object objInvoke5 = method5.invoke(obj4, null);
                        if (!(objInvoke5 instanceof Number)) {
                            objInvoke5 = null;
                        }
                        c0104d4 = (Number) objInvoke5;
                    } catch (Throwable th5) {
                        th = th5;
                        c0104d4 = new C0104d(th);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    number4 = null;
                }
                if (c0104d4 instanceof C0104d) {
                    c0104d4 = number4;
                }
                obj5 = c0104d4;
            }
            Number number6 = (Number) obj5;
            if (number6 != null) {
                iIntValue = number6.intValue();
            } else {
                if (obj4 != null) {
                    Class<?> superclass9 = obj4.getClass();
                    while (true) {
                        if (superclass9 == null) {
                            break;
                        }
                        try {
                            Field declaredField9 = superclass9.getDeclaredField("field_isSend");
                            declaredField9.setAccessible(true);
                            Object obj12 = declaredField9.get(obj4);
                            if (!(obj12 instanceof Number)) {
                                obj12 = number4;
                            }
                            number4 = (Number) obj12;
                            break;
                        } catch (NoSuchFieldException unused17) {
                            superclass9 = superclass9.getSuperclass();
                        } catch (Throwable unused18) {
                        }
                    }
                }
                iIntValue = number4 != null ? number4.intValue() : 0;
            }
            c0908i.m1958d(context, str2, jLongValue, new C0896e(jLongValue3, str6, iIntValue == 1), "event");
            return;
        }
        return;
        obj3 = null;
        if (obj3 != null) {
        }
        if (obj4 == null) {
        }
        str = (String) c0104d;
        if (str == null) {
        }
        str2 = str;
        if (obj4 == null) {
        }
        number = (Number) c0104d2;
        if (number != null) {
        }
        if (AbstractC0307q.m534d0(str2)) {
            return;
        } else {
            return;
        }
        obj4 = null;
        if (obj4 == null) {
        }
        str = (String) c0104d;
        if (str == null) {
        }
        str2 = str;
        if (obj4 == null) {
        }
        number = (Number) c0104d2;
        if (number != null) {
        }
        if (AbstractC0307q.m534d0(str2)) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1951b(String str) {
        String str2 = null;
        if (str != null) {
            if (!AbstractC0299i.m511i0(str, ":\n", false)) {
                str = null;
            }
            if (str != null) {
                String strM527y0 = AbstractC0299i.m527y0(str, ":\n");
                if (!AbstractC0307q.m534d0(strM527y0) && strM527y0.length() <= 80) {
                    str2 = strM527y0;
                }
            }
        }
        return (str2 == null || AbstractC0307q.m534d0(str2)) ? "对方尝试撤回上一条消息[已阻止]" : AbstractC0174d.m353i("\"", str2, "\"尝试撤回上一条消息[已阻止]");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m1952c(Object obj, Object obj2, String str) {
        Method method;
        Object c0104d;
        Method[] methods = obj.getClass().getMethods();
        AbstractC0223g.m417d(methods, "getMethods(...)");
        int length = methods.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                method = null;
                break;
            }
            method = methods[i2];
            if (AbstractC0223g.m414a(method.getName(), str) && method.getParameterTypes().length == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (method == null) {
            return;
        }
        try {
            c0104d = method.invoke(obj, obj2);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("anti revoke set msg field fail", str, obj2, thM246a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m1953f(String str) {
        List list = f3203e;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC0299i.m511i0(str, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C0893d m1954g() {
        return (C0893d) AbstractC1135r.m2476D(new C0893d("com.tencent.mm.storage.a9", "com.tencent.mm.storage.y8", "sc3.x3", "yj0.j1", "xh", "L9"), new C0893d("com.tencent.mm.storage.h9", "com.tencent.mm.storage.f9", "ge3.x3", "tk0.j1", "Ah", "z9"), new C0893d("com.tencent.mm.storage.h9", "com.tencent.mm.storage.f9", "ef3.x3", "dl0.k1", "Wh", "z9"), new C0893d("com.tencent.mm.storage.g9", "com.tencent.mm.storage.f9", "com.tencent.mm.plugin.messenger.foundation.h2", "gm0.j1", "cj", "M9"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m1955h(Method method) {
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        return name + "#" + name2 + "(" + AbstractC0120h.m260h0(parameterTypes, ",", new C0804d(1), 30) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Cursor m1956i(Object obj, String str, Object[] objArr) {
        Object c0104d;
        Object c0104d2;
        Method method;
        try {
            Object objInvoke = obj.getClass().getMethod("rawQuery", String.class, Object[].class).invoke(obj, str, objArr);
            c0104d = objInvoke instanceof Cursor ? (Cursor) objInvoke : null;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (AbstractC0105e.m246a(c0104d) != null) {
            try {
                Method[] methods = obj.getClass().getMethods();
                AbstractC0223g.m417d(methods, "getMethods(...)");
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method = null;
                        break;
                    }
                    method = methods[i2];
                    if (AbstractC0223g.m414a(method.getName(), "rawQuery") && method.getParameterTypes().length == 2) {
                        break;
                    }
                    i2++;
                }
                Object objInvoke2 = method != null ? method.invoke(obj, str, objArr) : null;
                c0104d2 = objInvoke2 instanceof Cursor ? (Cursor) objInvoke2 : null;
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            c0104d = (Cursor) (c0104d2 instanceof C0104d ? null : c0104d2);
        }
        return (Cursor) c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Class m1957j(Method method) {
        if (AbstractC0223g.m414a(method.getReturnType(), Long.TYPE)) {
            return Long.class;
        }
        Class<?> returnType = method.getReturnType();
        AbstractC0223g.m417d(returnType, "getReturnType(...)");
        return returnType;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1958d(Context context, String str, long j2, C0896e c0896e, String str2) {
        Object c0104d;
        Cursor cursorM1956i;
        C0896e c0896e2;
        Cursor cursorM1956i2;
        boolean z2;
        String str3 = str + ":" + j2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentHashMap concurrentHashMap = this.f3209c;
        if (concurrentHashMap.size() >= 128) {
            Set setEntrySet = concurrentHashMap.entrySet();
            final C0884a c0884a = new C0884a(jCurrentTimeMillis);
            setEntrySet.removeIf(new Predicate() { // from class: r0.b
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) c0884a.mo8c(obj)).booleanValue();
                }
            });
        }
        if (this.f3209c.putIfAbsent(str3, Long.valueOf(jCurrentTimeMillis)) != null) {
            return;
        }
        try {
            Object obj = this.f3207a;
            if (obj == null || (cursorM1956i = m1956i(obj, "select createTime,content,isSend from message where talker=? and msgSvrId=? order by createTime desc limit 1", new Object[]{str, Long.valueOf(j2)})) == null) {
                c0896e2 = null;
            } else {
                try {
                    if (cursorM1956i.moveToFirst()) {
                        long j3 = cursorM1956i.getLong(0);
                        String string = cursorM1956i.getString(1);
                        if (string == null) {
                            string = "";
                        }
                        c0896e2 = new C0896e(j3, string, cursorM1956i.getInt(2) == 1);
                    } else {
                        c0896e2 = null;
                    }
                    try {
                        cursorM1956i.close();
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        cursorM1956i.close();
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (c0896e2 == null) {
                c0896e2 = c0896e;
            }
            if (c0896e2 == null || !c0896e2.f3154c) {
                if (obj == null || (cursorM1956i2 = m1956i(obj, "select isSend from message where msgSvrId=? order by createTime desc limit 5", new Object[]{Long.valueOf(j2)})) == null) {
                    z2 = false;
                } else {
                    while (true) {
                        try {
                            if (!cursorM1956i2.moveToNext()) {
                                z2 = false;
                                break;
                            } else if (cursorM1956i2.getInt(0) == 1) {
                                z2 = true;
                                break;
                            }
                        } finally {
                            try {
                                cursorM1956i2.close();
                            } catch (Throwable unused3) {
                            }
                        }
                    }
                }
                if (!z2) {
                    if (c0896e2 != null) {
                        jCurrentTimeMillis = c0896e2.f3152a + 1;
                    }
                    Long lM1959e = m1959e(context, str, jCurrentTimeMillis, m1951b(c0896e2 != null ? c0896e2.f3153b : null));
                    Long l2 = (lM1959e == null || lM1959e.longValue() < 0) ? null : lM1959e;
                    String str4 = "source=" + str2;
                    String str5 = "talker=" + str;
                    String str6 = "revokeSrvId=" + j2;
                    String str7 = "createTime=" + jCurrentTimeMillis;
                    AbstractC0731a.m1384a("anti revoke tip insert", str4, str5, str6, str7, "native=" + (lM1959e != null), "rowId=" + l2);
                    if (l2 == null) {
                        this.f3209c.remove(str3);
                        AbstractC0731a.m1387d("anti revoke native insert unavailable", str2, str, Long.valueOf(j2));
                    }
                }
            }
            c0104d = C0109i.f404a;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            this.f3209c.remove(str3);
            AbstractC0731a.m1387d("anti revoke local tip insert fail", str, Long.valueOf(j2), thM246a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0450 A[Catch: all -> 0x0439, TryCatch #0 {all -> 0x0439, blocks: (B:202:0x0427, B:204:0x0435, B:209:0x043f, B:214:0x0450, B:216:0x045e, B:219:0x0466), top: B:232:0x0427 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Long m1959e(Context context, String str, long j2, String str2) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        String str3;
        long j3;
        String str4;
        Method method;
        Object c0104d;
        Method method2;
        Object c0104d2;
        Method method3;
        Class cls;
        Method method4;
        Object objInvoke;
        Method method5;
        Class cls2;
        Method method6;
        Method method7;
        Method method8;
        Object c0104d3;
        Long l2;
        String str5;
        Method method9;
        C0030c c0030cM66d = AbstractC0039l.m66d(context);
        Class cls3 = Boolean.TYPE;
        if (c0030cM66d != null) {
            Object obj = this.f3208b;
            if (obj == null) {
                str3 = "getMethods(...)";
                l2 = null;
                j3 = 0;
            } else {
                j3 = 0;
                String str6 = c0030cM66d.f218a;
                ClassLoader classLoader = context.getClassLoader();
                AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
                AbstractC0223g.m418e(str6, "clazz");
                Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str6);
                if (clsMo1021l != null && clsMo1021l.isInstance(obj)) {
                    Method[] declaredMethods = clsMo1021l.getDeclaredMethods();
                    String str7 = "getDeclaredMethods(...)";
                    AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                    int length = declaredMethods.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            cls2 = clsMo1021l;
                            method6 = null;
                            break;
                        }
                        method6 = declaredMethods[i2];
                        cls2 = clsMo1021l;
                        Method[] methodArr = declaredMethods;
                        if (AbstractC0223g.m414a(method6.getName(), c0030cM66d.f219b) && method6.getParameterTypes().length == 1) {
                            break;
                        }
                        i2++;
                        clsMo1021l = cls2;
                        declaredMethods = methodArr;
                    }
                    if (method6 == null) {
                        Method[] methods = cls2.getMethods();
                        AbstractC0223g.m417d(methods, "getMethods(...)");
                        int length2 = methods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                method7 = null;
                                break;
                            }
                            method7 = methods[i3];
                            Method[] methodArr2 = methods;
                            int i4 = length2;
                            if (AbstractC0223g.m414a(method7.getName(), c0030cM66d.f219b) && method7.getParameterTypes().length == 1) {
                                break;
                            }
                            i3++;
                            methods = methodArr2;
                            length2 = i4;
                        }
                        str3 = method7 == null ? "getMethods(...)" : "getMethods(...)";
                        l2 = null;
                    } else {
                        method7 = method6;
                    }
                    Class<?> superclass = method7.getParameterTypes()[0];
                    Constructor<?> declaredConstructor = superclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("msgid", (Integer) 0);
                    str3 = "getMethods(...)";
                    contentValues.put("msgSvrId", Long.valueOf(j2 + ((long) AbstractC0235a.f570a.m447b())));
                    contentValues.put("type", (Integer) 10000);
                    contentValues.put("status", (Integer) 3);
                    contentValues.put("isSend", (Integer) 0);
                    contentValues.put("createTime", Long.valueOf(j2));
                    contentValues.put("talker", str);
                    contentValues.put("content", str2);
                    while (superclass != null && !superclass.equals(Object.class)) {
                        Method[] declaredMethods2 = superclass.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods2, str7);
                        int length3 = declaredMethods2.length;
                        Class<?> cls4 = superclass;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length3) {
                                str5 = str7;
                                method9 = null;
                                break;
                            }
                            int i6 = i5;
                            Method method10 = declaredMethods2[i6];
                            str5 = str7;
                            AbstractC0223g.m418e(method10, "method");
                            method9 = method10;
                            if (AbstractC0223g.m414a(method10.getName(), "convertFrom") && method9.getParameterTypes().length == 2 && ContentValues.class.isAssignableFrom(method9.getParameterTypes()[0]) && AbstractC0223g.m414a(method9.getParameterTypes()[1], cls3)) {
                                break;
                            }
                            i5 = i6 + 1;
                            str7 = str5;
                        }
                        if (method9 != null) {
                            method8 = method9;
                            break;
                        }
                        superclass = cls4.getSuperclass();
                        str7 = str5;
                    }
                    method8 = null;
                    if (method8 == null) {
                        l2 = null;
                    } else {
                        method8.setAccessible(true);
                        method8.invoke(objNewInstance, contentValues, Boolean.TRUE);
                        method7.setAccessible(true);
                        try {
                            Object objInvoke2 = method7.invoke(obj, objNewInstance);
                            Number number = objInvoke2 instanceof Number ? (Number) objInvoke2 : null;
                            c0104d3 = Long.valueOf(number != null ? number.longValue() : 0L);
                        } catch (Throwable th) {
                            c0104d3 = new C0104d(th);
                        }
                        Throwable thM246a = AbstractC0105e.m246a(c0104d3);
                        if (thM246a != null) {
                            AbstractC0731a.m1387d("anti revoke dynamic native insert fail", m1955h(method7), thM246a);
                        }
                        if (c0104d3 instanceof C0104d) {
                            c0104d3 = null;
                        }
                        l2 = (Long) c0104d3;
                    }
                }
            }
            if (l2 != null) {
                return Long.valueOf(l2.longValue());
            }
        } else {
            str3 = "getMethods(...)";
            j3 = 0;
        }
        C0893d c0893dM1954g = m1954g();
        if (c0893dM1954g == null) {
            return null;
        }
        Object objInvoke3 = this.f3208b;
        if (objInvoke3 == null) {
            String str8 = c0893dM1954g.f3081c;
            ClassLoader classLoader2 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
            Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader2, str8);
            if (clsMo1021l2 == null) {
                str4 = str3;
                if (objInvoke3 != null) {
                    this.f3208b = objInvoke3;
                } else {
                    objInvoke3 = null;
                }
                if (objInvoke3 == null) {
                    return null;
                }
            } else {
                ClassLoader classLoader3 = context.getClassLoader();
                AbstractC0223g.m417d(classLoader3, "getClassLoader(...)");
                Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader3, c0893dM1954g.f3082d);
                if (clsMo1021l3 != null) {
                    Method[] methods2 = clsMo1021l3.getMethods();
                    str4 = str3;
                    AbstractC0223g.m417d(methods2, str4);
                    int length4 = methods2.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length4) {
                            cls = clsMo1021l2;
                            method4 = null;
                            break;
                        }
                        method4 = methods2[i7];
                        if (Modifier.isStatic(method4.getModifiers())) {
                            cls = clsMo1021l2;
                            if (AbstractC0223g.m414a(method4.getName(), "s") && method4.getParameterTypes().length == 1 && AbstractC0223g.m414a(method4.getParameterTypes()[0], Class.class)) {
                                break;
                            }
                        } else {
                            cls = clsMo1021l2;
                        }
                        i7++;
                        clsMo1021l2 = cls;
                    }
                    if (method4 != null && (objInvoke = method4.invoke(null, cls)) != null) {
                        Method[] methods3 = objInvoke.getClass().getMethods();
                        AbstractC0223g.m417d(methods3, str4);
                        int length5 = methods3.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length5) {
                                method5 = null;
                                break;
                            }
                            method5 = methods3[i8];
                            Method[] methodArr3 = methods3;
                            if (AbstractC0223g.m414a(method5.getName(), c0893dM1954g.f3083e)) {
                                Class<?>[] parameterTypes = method5.getParameterTypes();
                                AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                                if (parameterTypes.length == 0) {
                                    break;
                                }
                            }
                            i8++;
                            methods3 = methodArr3;
                        }
                        objInvoke3 = method5 != null ? method5.invoke(objInvoke, null) : null;
                        if (objInvoke3 != null) {
                        }
                        if (objInvoke3 == null) {
                        }
                    }
                }
                if (objInvoke3 != null) {
                }
                if (objInvoke3 == null) {
                }
            }
        } else {
            str4 = str3;
        }
        String str9 = c0893dM1954g.f3080b;
        ClassLoader classLoader4 = context.getClassLoader();
        AbstractC0223g.m417d(classLoader4, "getClassLoader(...)");
        Class<?> clsMo1021l4 = AbstractC0514f.f1622b.mo1021l(classLoader4, str9);
        if (clsMo1021l4 == null) {
            return null;
        }
        Object objNewInstance2 = clsMo1021l4.getDeclaredConstructor(null).newInstance(null);
        AbstractC0223g.m415b(objNewInstance2);
        m1952c(objNewInstance2, str, "u1");
        m1952c(objNewInstance2, Long.valueOf(j2 + ((long) AbstractC0235a.f570a.m447b())), "o1");
        m1952c(objNewInstance2, 10000, "setType");
        m1952c(objNewInstance2, 3, "r1");
        m1952c(objNewInstance2, 0, "j1");
        m1952c(objNewInstance2, Long.valueOf(j2), "e1");
        m1952c(objNewInstance2, str2, "d1");
        Method[] methods4 = objInvoke3.getClass().getMethods();
        AbstractC0223g.m417d(methods4, str4);
        int length6 = methods4.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length6) {
                method = null;
                break;
            }
            method = methods4[i9];
            if (AbstractC0223g.m414a(method.getName(), "na") && method.getParameterTypes().length == 1 && method.getParameterTypes()[0].isAssignableFrom(clsMo1021l4) && Number.class.isAssignableFrom(m1957j(method))) {
                break;
            }
            i9++;
        }
        if (method != null) {
            try {
                Object objInvoke4 = method.invoke(objInvoke3, objNewInstance2);
                Number number2 = objInvoke4 instanceof Number ? (Number) objInvoke4 : null;
                c0104d = number2 != null ? Long.valueOf(number2.longValue()) : null;
            } catch (Throwable th2) {
                c0104d = new C0104d(th2);
            }
            Throwable thM246a2 = AbstractC0105e.m246a(c0104d);
            if (thM246a2 != null) {
                AbstractC0731a.m1387d("anti revoke native na insert fail", thM246a2);
            }
            return (Long) (c0104d instanceof C0104d ? null : c0104d);
        }
        Method[] methods5 = objInvoke3.getClass().getMethods();
        AbstractC0223g.m417d(methods5, str4);
        int length7 = methods5.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length7) {
                method2 = null;
                break;
            }
            method2 = methods5[i10];
            if (AbstractC0223g.m414a(method2.getName(), c0893dM1954g.f3084f) && method2.getParameterTypes().length == 2 && method2.getParameterTypes()[0].isAssignableFrom(clsMo1021l4) && AbstractC0223g.m414a(method2.getParameterTypes()[1], cls3) && Number.class.isAssignableFrom(m1957j(method2))) {
                break;
            }
            i10++;
        }
        if (method2 == null) {
            Method[] methods6 = objInvoke3.getClass().getMethods();
            AbstractC0223g.m417d(methods6, str4);
            int length8 = methods6.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length8) {
                    method3 = null;
                    break;
                }
                Method method11 = methods6[i11];
                if (method11.getParameterTypes().length == 2 && method11.getParameterTypes()[0].isAssignableFrom(clsMo1021l4)) {
                    if (AbstractC0223g.m414a(method11.getParameterTypes()[1], cls3) && Number.class.isAssignableFrom(m1957j(method11))) {
                        method3 = method11;
                        break;
                    }
                }
                i11++;
            }
            if (method3 == null) {
                return null;
            }
            method2 = method3;
        }
        try {
            Object objInvoke5 = method2.invoke(objInvoke3, objNewInstance2, Boolean.FALSE);
            Number number3 = objInvoke5 instanceof Number ? (Number) objInvoke5 : null;
            if (number3 != null) {
                long jLongValue = number3.longValue();
                c0104d2 = Long.valueOf(jLongValue);
                if (jLongValue < j3) {
                    c0104d2 = null;
                }
                if (c0104d2 == null) {
                    Object objInvoke6 = method2.invoke(objInvoke3, objNewInstance2, Boolean.TRUE);
                    Number number4 = objInvoke6 instanceof Number ? (Number) objInvoke6 : null;
                    c0104d2 = number4 != null ? Long.valueOf(number4.longValue()) : null;
                }
            }
        } catch (Throwable th3) {
            c0104d2 = new C0104d(th3);
        }
        Throwable thM246a3 = AbstractC0105e.m246a(c0104d2);
        if (thM246a3 != null) {
            AbstractC0731a.m1387d("anti revoke native insert fail", method2.getName(), thM246a3);
        }
        return (Long) (c0104d2 instanceof C0104d ? null : c0104d2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    @Override // p062e0.InterfaceC0551a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        List<Method> listM262j0;
        List<Method> listM262j02;
        boolean z2;
        Object c0104d;
        int i2;
        Object c0104d2;
        String str;
        Method method;
        int i3 = 0;
        if (AbstractC0223g.m414a(loadPackageParam.packageName, loadPackageParam.processName)) {
            boolean z3 = AbstractC1126i.f3786a;
            AbstractC0731a.m1384a("anti revoke handle hook", AbstractC0174d.m355k("enabled=", C1124g.m2442r()), AbstractC0174d.m352h("wechat=", AbstractC1135r.m2493o()));
            CopyOnWriteArrayList copyOnWriteArrayList = C0052y.f291a;
            C0052y.m98c(context, new C0048u("anti_revoke", "防撤回", new C0804d(3), new C0035h(context, 11), new C0804d(4), new C0804d(5)));
            C0030c c0030cM66d = AbstractC0039l.m66d(context);
            C0899f c0899f = null;
            if (c0030cM66d != null) {
                ClassLoader classLoader = context.getClassLoader();
                AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
                String str2 = c0030cM66d.f218a;
                AbstractC0223g.m418e(str2, "clazz");
                Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, str2);
                if (clsMo1021l == null) {
                    C0893d c0893dM1954g = m1954g();
                    if (c0893dM1954g != null) {
                        ClassLoader classLoader2 = context.getClassLoader();
                        AbstractC0223g.m417d(classLoader2, "getClassLoader(...)");
                        Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader2, c0893dM1954g.f3079a);
                        if (clsMo1021l2 != null) {
                            ClassLoader classLoader3 = context.getClassLoader();
                            AbstractC0223g.m417d(classLoader3, "getClassLoader(...)");
                            Method[] methodArrMo1013d = AbstractC0514f.f1622b.mo1013d(clsMo1021l2, new C0781b(c0893dM1954g, AbstractC0514f.f1622b.mo1021l(classLoader3, c0893dM1954g.f3080b), 1));
                            AbstractC0223g.m417d(methodArrMo1013d, "findMethodsByExactPredicate(...)");
                            if (6 >= methodArrMo1013d.length) {
                                listM262j0 = AbstractC0120h.m262j0(methodArrMo1013d);
                            } else {
                                ArrayList arrayList = new ArrayList(6);
                                int i4 = 0;
                                for (Method method2 : methodArrMo1013d) {
                                    arrayList.add(method2);
                                    i4++;
                                    if (i4 == 6) {
                                        break;
                                    }
                                }
                                listM262j0 = arrayList;
                            }
                            for (Method method3 : listM262j0) {
                                AbstractC0223g.m415b(method3);
                                String strM352h = AbstractC0174d.m352h("anti-revoke-wechat-storage-", m1955h(method3));
                                if (!MainHook.uniqueMetaStore.contains(strM352h)) {
                                    AbstractC0514f.m1027d(method3, new C0902g(this, 2));
                                    MainHook.uniqueMetaStore.add(strM352h);
                                }
                            }
                        }
                    }
                } else {
                    Method[] declaredMethods = clsMo1021l.getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                    int length = declaredMethods.length;
                    int i5 = 0;
                    while (true) {
                        str = c0030cM66d.f219b;
                        if (i5 >= length) {
                            method = null;
                            break;
                        }
                        method = declaredMethods[i5];
                        if (AbstractC0223g.m414a(method.getName(), str) && method.getParameterTypes().length == 1) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (method == null) {
                        Method[] methods = clsMo1021l.getMethods();
                        AbstractC0223g.m417d(methods, "getMethods(...)");
                        int length2 = methods.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length2) {
                                method = null;
                                break;
                            }
                            Method method4 = methods[i6];
                            if (AbstractC0223g.m414a(method4.getName(), str) && method4.getParameterTypes().length == 1) {
                                method = method4;
                                break;
                            }
                            i6++;
                        }
                        if (method == null) {
                        }
                    }
                    String strM352h2 = AbstractC0174d.m352h("anti-revoke-dynamic-storage-", m1955h(method));
                    if (!MainHook.uniqueMetaStore.contains(strM352h2)) {
                        method.setAccessible(true);
                        AbstractC0514f.m1027d(method, new C0902g(this, 0));
                        MainHook.uniqueMetaStore.add(strM352h2);
                        AbstractC0731a.m1384a("anti revoke dynamic storage hooked", m1955h(method));
                    }
                }
            }
            ClassLoader classLoader4 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader4, "getClassLoader(...)");
            Class clsMo1021l3 = AbstractC0514f.f1622b.mo1021l(classLoader4, "com.tencent.wcdb.database.SQLiteDatabase");
            if (clsMo1021l3 != null) {
                Method[] methodArrMo1013d2 = AbstractC0514f.f1622b.mo1013d(clsMo1021l3, new C0804d(6));
                AbstractC0223g.m417d(methodArrMo1013d2, "findMethodsByExactPredicate(...)");
                for (Method method5 : methodArrMo1013d2) {
                    AbstractC0223g.m415b(method5);
                    String strM352h3 = AbstractC0174d.m352h("anti-revoke-message-db-", m1955h(method5));
                    if (!MainHook.uniqueMetaStore.contains(strM352h3)) {
                        AbstractC0514f.m1027d(method5, new C0902g(this, 1));
                        MainHook.uniqueMetaStore.add(strM352h3);
                    }
                }
            }
            C0071e c0071e = C0071e.f323a;
            C0890c c0890c = this.f3210d;
            AbstractC0223g.m418e(c0890c, "listener");
            C0071e.f324b.addIfAbsent(c0890c);
            if (C0071e.f325c) {
                z2 = true;
            } else {
                synchronized (c0071e) {
                    try {
                        if (C0071e.f325c) {
                            z2 = true;
                        } else {
                            Context applicationContext = context.getApplicationContext();
                            Context context2 = applicationContext == null ? context : applicationContext;
                            C0031d c0031dM79q = AbstractC0039l.m79q(context);
                            if (c0031dM79q != null) {
                                String str3 = c0031dM79q.f221a;
                                ClassLoader classLoader5 = context.getClassLoader();
                                AbstractC0223g.m417d(classLoader5, "getClassLoader(...)");
                                AbstractC0223g.m418e(str3, "clazz");
                                Class clsMo1021l4 = AbstractC0514f.f1622b.mo1021l(classLoader5, str3);
                                if (clsMo1021l4 == null) {
                                    listM262j02 = C0131s.f426a;
                                } else {
                                    Method[] declaredMethods2 = clsMo1021l4.getDeclaredMethods();
                                    AbstractC0223g.m417d(declaredMethods2, "getDeclaredMethods(...)");
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Method method6 : declaredMethods2) {
                                        if (AbstractC0223g.m414a(method6.getName(), c0031dM79q.f222b)) {
                                            C0071e c0071e2 = C0071e.f323a;
                                            if (C0071e.m153a(method6)) {
                                                arrayList2.add(method6);
                                            }
                                        }
                                    }
                                    listM262j02 = arrayList2;
                                }
                            } else {
                                listM262j02 = null;
                            }
                            if (listM262j02 == null) {
                                listM262j02 = C0131s.f426a;
                            }
                            if (listM262j02.isEmpty()) {
                                ClassLoader classLoader6 = context.getClassLoader();
                                AbstractC0223g.m417d(classLoader6, "getClassLoader(...)");
                                Class clsMo1021l5 = AbstractC0514f.f1622b.mo1021l(classLoader6, "com.tencent.mm.sdk.platformtools.aa");
                                if (clsMo1021l5 == null) {
                                    z2 = false;
                                } else {
                                    C0071e c0071e3 = C0071e.f323a;
                                    Method[] methodArrMo1013d3 = AbstractC0514f.f1622b.mo1013d(clsMo1021l5, new C0026a(20));
                                    AbstractC0223g.m417d(methodArrMo1013d3, "findMethodsByExactPredicate(...)");
                                    listM262j02 = AbstractC0120h.m262j0(methodArrMo1013d3);
                                }
                            }
                            int i7 = 0;
                            for (Method method7 : listM262j02) {
                                String str4 = "wechat-xml-hook-hub:" + method7.getDeclaringClass().getName() + "#" + method7.getName();
                                if (MainHook.uniqueMetaStore.add(str4)) {
                                    try {
                                        AbstractC0514f.m1027d(method7, new C0070d(i3, context2));
                                        i2 = i7 + 1;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                    try {
                                        c0104d = Integer.valueOf(i7);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i7 = i2;
                                        c0104d = new C0104d(th);
                                        i2 = i7;
                                    }
                                    Throwable thM246a = AbstractC0105e.m246a(c0104d);
                                    if (thM246a != null) {
                                        MainHook.uniqueMetaStore.remove(str4);
                                        AbstractC0731a.m1387d("wechat xml hook hub install fail", method7, thM246a);
                                    }
                                    i7 = i2;
                                } else {
                                    i7++;
                                }
                            }
                            C0071e.f325c = i7 > 0;
                            if (C0071e.f325c) {
                                AbstractC0731a.m1384a("wechat xml hook hub installed", "methods=" + i7);
                            }
                            z2 = C0071e.f325c;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            if (z2) {
                AbstractC0731a.m1384a("anti revoke using xml-only intercept", AbstractC1135r.m2493o());
                return;
            }
            if (AbstractC1135r.m2500v()) {
                ClassLoader classLoader7 = context.getClassLoader();
                AbstractC0223g.m417d(classLoader7, "getClassLoader(...)");
                Class clsMo1021l6 = AbstractC0514f.f1622b.mo1021l(classLoader7, "com.tencent.mm.sdk.event.IEvent");
                if (clsMo1021l6 != null) {
                    Method[] methodArrMo1013d4 = AbstractC0514f.f1622b.mo1013d(clsMo1021l6, new C0804d(2));
                    AbstractC0223g.m417d(methodArrMo1013d4, "findMethodsByExactPredicate(...)");
                    for (Method method8 : methodArrMo1013d4) {
                        AbstractC0223g.m415b(method8);
                        String strM352h4 = AbstractC0174d.m352h("anti-revoke-event-publish-", m1955h(method8));
                        if (!MainHook.uniqueMetaStore.contains(strM352h4)) {
                            AbstractC0514f.m1027d(method8, new C0905h(this, context, 0));
                            MainHook.uniqueMetaStore.add(strM352h4);
                        }
                    }
                }
            }
            if (AbstractC1135r.m2500v()) {
                for (String str5 : f3205g) {
                    ClassLoader classLoader8 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader8, "getClassLoader(...)");
                    AbstractC0223g.m418e(str5, "clazz");
                    Class clsMo1021l7 = AbstractC0514f.f1622b.mo1021l(classLoader8, str5);
                    if (clsMo1021l7 != null) {
                        Method[] methodArrMo1013d5 = AbstractC0514f.f1622b.mo1013d(clsMo1021l7, new C0804d(7));
                        AbstractC0223g.m417d(methodArrMo1013d5, "findMethodsByExactPredicate(...)");
                        for (Method method9 : methodArrMo1013d5) {
                            AbstractC0223g.m415b(method9);
                            String strM352h5 = AbstractC0174d.m352h("anti-revoke-listener-", m1955h(method9));
                            if (!MainHook.uniqueMetaStore.contains(strM352h5)) {
                                AbstractC0514f.m1027d(method9, new C0905h(this, context, 1));
                                MainHook.uniqueMetaStore.add(strM352h5);
                            }
                        }
                    }
                }
            }
            C0028b c0028bM65c = AbstractC0039l.m65c(context);
            if (c0028bM65c != null) {
                String str6 = c0028bM65c.f207a;
                AbstractC0223g.m418e(str6, "className");
                String str7 = c0028bM65c.f208b;
                AbstractC0223g.m418e(str7, "methodName");
                ClassLoader classLoader9 = context.getClassLoader();
                AbstractC0223g.m417d(classLoader9, "getClassLoader(...)");
                Class clsMo1021l8 = AbstractC0514f.f1622b.mo1021l(classLoader9, "com.tencent.mm.modelbase.p0");
                if (clsMo1021l8 == null) {
                    C0899f c0899f2 = (C0899f) AbstractC1135r.m2476D(new C0899f("ox0.t", "e"), new C0899f("jy0.t", "f"), new C0899f("az0.u", "f"), new C0899f("c01.u", "f"));
                    if (c0899f2 != null) {
                        AbstractC0731a.m1384a("anti revoke hook point from hardcoded", AbstractC1135r.m2493o());
                        c0899f = c0899f2;
                    } else {
                        AbstractC0731a.m1387d("anti revoke hook point cache missing for unknown wechat", AbstractC1135r.m2493o());
                    }
                } else {
                    ClassLoader classLoader10 = context.getClassLoader();
                    AbstractC0223g.m417d(classLoader10, "getClassLoader(...)");
                    Class clsMo1021l9 = AbstractC0514f.f1622b.mo1021l(classLoader10, str6);
                    if (clsMo1021l9 != null) {
                        if (AbstractC0514f.f1622b.mo1011b(clsMo1021l9, str7, String.class, Long.TYPE, clsMo1021l8, String.class, String.class, String.class) != null) {
                            AbstractC0731a.m1384a("anti revoke hook point from cache", str6, str7);
                            c0899f = new C0899f(str6, str7);
                        }
                    }
                }
            }
            if (c0899f == null) {
                AbstractC0731a.m1387d("anti revoke unsupported wechat", AbstractC1135r.m2493o());
                return;
            }
            AbstractC0731a.m1384a("anti revoke selected hook point", c0899f.f3163a, c0899f.f3164b);
            StringBuilder sbM357m = AbstractC0174d.m357m("anti-revoke-", c0899f.f3163a, "#");
            String str8 = c0899f.f3164b;
            sbM357m.append(str8);
            String string = sbM357m.toString();
            if (MainHook.uniqueMetaStore.contains(string)) {
                return;
            }
            ClassLoader classLoader11 = context.getClassLoader();
            AbstractC0223g.m417d(classLoader11, "getClassLoader(...)");
            Class clsMo1021l10 = AbstractC0514f.f1622b.mo1021l(classLoader11, "com.tencent.mm.modelbase.p0");
            if (clsMo1021l10 == null) {
                AbstractC0731a.m1387d("anti revoke modelbase class missing", AbstractC1135r.m2493o());
                return;
            }
            try {
                AbstractC0514f.m1026c(c0899f.f3163a, context.getClassLoader(), str8, String.class, Long.TYPE, clsMo1021l10, String.class, String.class, String.class, new C0905h(this, context, 2));
                c0104d2 = Boolean.valueOf(MainHook.uniqueMetaStore.add(string));
            } catch (Throwable th4) {
                c0104d2 = new C0104d(th4);
            }
            Throwable thM246a2 = AbstractC0105e.m246a(c0104d2);
            if (thM246a2 != null) {
                AbstractC0731a.m1387d("anti revoke hook fail", AbstractC1135r.m2493o(), string, thM246a2);
            }
        }
    }
}
