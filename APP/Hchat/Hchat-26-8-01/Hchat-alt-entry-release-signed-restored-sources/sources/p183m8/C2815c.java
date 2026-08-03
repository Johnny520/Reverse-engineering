package p183m8;

import android.app.Activity;
import android.content.Context;
import bsh.C0353j;
import bsh.org.objectweb.asm.Opcodes;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p036c9.C0425c2;
import p069f.AbstractC0959s0;
import p069f.C0945l0;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p258r8.C3744i;
import p308v1.C4405l;
import p376z4.C6092f;

/* JADX INFO: renamed from: m8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2815c {

    /* JADX INFO: renamed from: a */
    public int f9080a;

    /* JADX INFO: renamed from: b */
    public Object f9081b;

    /* JADX INFO: renamed from: c */
    public Object f9082c;

    /* JADX INFO: renamed from: d */
    public Object f9083d;

    /* JADX INFO: renamed from: e */
    public Object f9084e;

    /* JADX INFO: renamed from: f */
    public final Object f9085f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2815c(BigInteger bigInteger) {
        BigInteger[] bigIntegerArr;
        BigInteger[] bigIntegerArr2;
        this.f9081b = new BigInteger("ffffffffffffffff", 16);
        BigInteger[] bigIntegerArr3 = new BigInteger[8];
        for (int i9 = 0; i9 < 8; i9++) {
            bigIntegerArr3[i9] = new BigInteger("9e3779b97f4a7c13", 16);
        }
        this.f9082c = bigIntegerArr3;
        BigInteger[] bigIntegerArr4 = new BigInteger[Opcodes.ACC_NATIVE];
        for (int i10 = 0; i10 < 256; i10++) {
            BigInteger bigInteger2 = BigInteger.ZERO;
            bigInteger2.getClass();
            bigIntegerArr4[i10] = bigInteger2;
        }
        this.f9083d = bigIntegerArr4;
        BigInteger[] bigIntegerArr5 = new BigInteger[Opcodes.ACC_NATIVE];
        for (int i11 = 0; i11 < 256; i11++) {
            BigInteger bigInteger3 = BigInteger.ZERO;
            bigInteger3.getClass();
            bigIntegerArr5[i11] = bigInteger3;
        }
        this.f9084e = bigIntegerArr5;
        BigInteger[] bigIntegerArr6 = new BigInteger[Opcodes.ACC_NATIVE];
        for (int i12 = 0; i12 < 256; i12++) {
            BigInteger bigInteger4 = BigInteger.ZERO;
            bigInteger4.getClass();
            bigIntegerArr6[i12] = bigInteger4;
        }
        this.f9085f = bigIntegerArr6;
        this.f9080a = 255;
        ((BigInteger[]) this.f9083d)[0] = bigInteger;
        for (int i13 = 0; i13 < 4; i13++) {
            m6214g((BigInteger[]) this.f9082c);
        }
        for (int i14 = 0; i14 < 256; i14 += 8) {
            int i15 = 0;
            while (true) {
                bigIntegerArr2 = (BigInteger[]) this.f9082c;
                if (i15 >= 8) {
                    break;
                }
                BigInteger bigIntegerAnd = bigIntegerArr2[i15].add(((BigInteger[]) this.f9083d)[i14 + i15]).and((BigInteger) this.f9081b);
                bigIntegerAnd.getClass();
                bigIntegerArr2[i15] = bigIntegerAnd;
                i15++;
            }
            m6214g(bigIntegerArr2);
            for (int i16 = 0; i16 < 8; i16++) {
                ((BigInteger[]) this.f9084e)[i14 + i16] = ((BigInteger[]) this.f9082c)[i16];
            }
        }
        for (int i17 = 0; i17 < 256; i17 += 8) {
            int i18 = 0;
            while (true) {
                bigIntegerArr = (BigInteger[]) this.f9082c;
                if (i18 >= 8) {
                    break;
                }
                BigInteger bigIntegerAnd2 = bigIntegerArr[i18].add(((BigInteger[]) this.f9084e)[i17 + i18]).and((BigInteger) this.f9081b);
                bigIntegerAnd2.getClass();
                bigIntegerArr[i18] = bigIntegerAnd2;
                i18++;
            }
            m6214g(bigIntegerArr);
            for (int i19 = 0; i19 < 8; i19++) {
                ((BigInteger[]) this.f9084e)[i17 + i19] = ((BigInteger[]) this.f9082c)[i19];
            }
        }
        m6219n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m6206a(StringBuffer stringBuffer, Writer writer) throws IOException {
        int length = stringBuffer.length();
        if (length == 0 || stringBuffer.charAt(length - 1) == '\n') {
            return;
        }
        writer.write(10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m6207d(Class cls, Method method) {
        Class<?>[] parameterTypes;
        Class<?> cls2;
        Method methodFindMethodRecursive;
        Class<?> cls3;
        if (method != null) {
            try {
                String name = method.getName();
                if (!"equals".equals(name) && !"hashCode".equals(name) && !"toString".equals(name) && !"wait".equals(name) && !"notify".equals(name) && !"notifyAll".equals(name) && (parameterTypes = method.getParameterTypes()) != null && (parameterTypes.length == 1 || parameterTypes.length == 2)) {
                    int length = parameterTypes.length;
                    Class<?> cls4 = Integer.TYPE;
                    if ((length != 2 || (cls3 = parameterTypes[1]) == cls4 || cls3 == Integer.class) && (cls2 = parameterTypes[0]) != null && !cls2.isPrimitive() && cls2 != String.class && cls2 != Object.class && ((cls == null || cls2.isAssignableFrom(cls)) && (cls != null || (!cls2.isPrimitive() && !cls2.isInterface() && (methodFindMethodRecursive = KavaReflector.findMethodRecursive(cls2, "getType", new Class[0])) != null && methodFindMethodRecursive.getParameterTypes().length == 0 && methodFindMethodRecursive.getReturnType() == cls4)))) {
                        Class<?> returnType = method.getReturnType();
                        if (returnType != Boolean.TYPE && returnType != Boolean.class && returnType != cls4) {
                            if (returnType == Void.TYPE) {
                            }
                        }
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m6208f(Method method) {
        if (method == null) {
            return 0;
        }
        String name = method.getName();
        int i9 = ("g".equals(name) || "f".equals(name)) ? 80 : 0;
        if ("h".equals(name)) {
            i9 += 70;
        }
        if ("doScene".equals(name) || "doSceneImp".equals(name)) {
            i9 += 80;
        }
        if ("d".equals(name) || "cancel".equals(name)) {
            i9 -= 100;
        }
        Class<?> returnType = method.getReturnType();
        if (returnType == Boolean.TYPE || returnType == Boolean.class) {
            i9 += 100;
        }
        if (returnType == Integer.TYPE || returnType == Integer.class) {
            i9 += 20;
        }
        if (returnType == Void.TYPE) {
            i9 -= 50;
        }
        return method.getParameterTypes().length == 2 ? i9 + 10 : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m6209h(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : !(obj instanceof Number) || ((Number) obj).intValue() >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m6210k(Object obj) {
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                if (cls.isPrimitive() || cls.isEnum() || cls.isArray() || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Context) || (obj instanceof Activity) || (obj instanceof Class) || (obj instanceof Method) || (obj instanceof Field)) {
                    return true;
                }
                String name = cls.getName();
                if (!name.startsWith("java.") && !name.startsWith("android.view.") && !name.startsWith("android.widget.")) {
                    if (!name.startsWith("android.graphics.")) {
                        return false;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m6211b(Object obj, String str, Method method) {
        if (obj == null || method == null) {
            return;
        }
        this.f9082c = obj;
        this.f9083d = method;
        this.f9080a = method.getParameterTypes().length;
        StringBuilder sbM1025n = AbstractC0255e.m1025n(str, ": ");
        sbM1025n.append(obj.getClass().getName());
        sbM1025n.append("#");
        sbM1025n.append(method.getName());
        m6213e(sbM1025n.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public synchronized void m6212c(Class cls, List list) {
        try {
            LinkedHashSet<Class> linkedHashSet = new LinkedHashSet();
            if (cls != null) {
                linkedHashSet.add(cls);
            }
            if (list != null) {
                linkedHashSet.addAll(list);
            }
            this.f9084e = new ArrayList(linkedHashSet);
            if (linkedHashSet.isEmpty()) {
                m6213e("网络队列类为null，且没有候选类");
                return;
            }
            int i9 = 0;
            for (Class cls2 : linkedHashSet) {
                if (cls2 != null) {
                    try {
                        for (Method method : KavaReflector.declaredMethods(cls2)) {
                            if (m6207d(null, method) && ((Set) this.f9085f).add(method)) {
                                try {
                                    C3744i.f12154b.m7763b(method, new C0425c2(8, this, method, false));
                                    i9++;
                                } catch (Throwable th2) {
                                    ((Set) this.f9085f).remove(method);
                                    m6213e("网络队列方法Hook失败: " + method.toGenericString() + " " + th2.getMessage());
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        m6213e("网络队列类扫描失败: " + cls2.getName() + " " + th3.getMessage());
                    }
                }
            }
            if (i9 == 0 && ((Set) this.f9085f).isEmpty()) {
                m6213e("网络队列候选类无合适方法可Hook: " + linkedHashSet.size());
            } else if (i9 > 0) {
                m6213e("网络队列补装Hook: classes=" + linkedHashSet.size() + " methods=" + i9);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m6213e(String str) {
        InterfaceC2814b interfaceC2814b = (InterfaceC2814b) this.f9081b;
        if (interfaceC2814b != null) {
            interfaceC2814b.mo3415a(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m6214g(BigInteger[] bigIntegerArr) {
        BigInteger bigIntegerSubtract = bigIntegerArr[0].subtract(bigIntegerArr[4]);
        BigInteger bigInteger = (BigInteger) this.f9081b;
        BigInteger bigIntegerAnd = bigIntegerSubtract.and(bigInteger);
        bigIntegerAnd.getClass();
        bigIntegerArr[0] = bigIntegerAnd;
        BigInteger bigIntegerAnd2 = bigIntegerArr[5].xor(bigIntegerArr[7].shiftRight(9)).and(bigInteger);
        bigIntegerAnd2.getClass();
        bigIntegerArr[5] = bigIntegerAnd2;
        BigInteger bigIntegerAnd3 = bigIntegerArr[7].add(bigIntegerArr[0]).and(bigInteger);
        bigIntegerAnd3.getClass();
        bigIntegerArr[7] = bigIntegerAnd3;
        BigInteger bigIntegerAnd4 = bigIntegerArr[1].subtract(bigIntegerArr[5]).and(bigInteger);
        bigIntegerAnd4.getClass();
        bigIntegerArr[1] = bigIntegerAnd4;
        BigInteger bigIntegerAnd5 = bigIntegerArr[6].xor(bigIntegerArr[0].shiftLeft(9)).and(bigInteger);
        bigIntegerAnd5.getClass();
        bigIntegerArr[6] = bigIntegerAnd5;
        BigInteger bigIntegerAnd6 = bigIntegerArr[0].add(bigIntegerArr[1]).and(bigInteger);
        bigIntegerAnd6.getClass();
        bigIntegerArr[0] = bigIntegerAnd6;
        BigInteger bigIntegerAnd7 = bigIntegerArr[2].subtract(bigIntegerArr[6]).and(bigInteger);
        bigIntegerAnd7.getClass();
        bigIntegerArr[2] = bigIntegerAnd7;
        BigInteger bigIntegerAnd8 = bigIntegerArr[7].xor(bigIntegerArr[1].shiftRight(23)).and(bigInteger);
        bigIntegerAnd8.getClass();
        bigIntegerArr[7] = bigIntegerAnd8;
        BigInteger bigIntegerAnd9 = bigIntegerArr[1].add(bigIntegerArr[2]).and(bigInteger);
        bigIntegerAnd9.getClass();
        bigIntegerArr[1] = bigIntegerAnd9;
        BigInteger bigIntegerAnd10 = bigIntegerArr[3].subtract(bigIntegerArr[7]).and(bigInteger);
        bigIntegerAnd10.getClass();
        bigIntegerArr[3] = bigIntegerAnd10;
        BigInteger bigIntegerAnd11 = bigIntegerArr[0].xor(bigIntegerArr[2].shiftLeft(15)).and(bigInteger);
        bigIntegerAnd11.getClass();
        bigIntegerArr[0] = bigIntegerAnd11;
        BigInteger bigIntegerAnd12 = bigIntegerArr[2].add(bigIntegerArr[3]).and(bigInteger);
        bigIntegerAnd12.getClass();
        bigIntegerArr[2] = bigIntegerAnd12;
        BigInteger bigIntegerAnd13 = bigIntegerArr[4].subtract(bigIntegerArr[0]).and(bigInteger);
        bigIntegerAnd13.getClass();
        bigIntegerArr[4] = bigIntegerAnd13;
        BigInteger bigIntegerAnd14 = bigIntegerArr[1].xor(bigIntegerArr[3].shiftRight(14)).and(bigInteger);
        bigIntegerAnd14.getClass();
        bigIntegerArr[1] = bigIntegerAnd14;
        BigInteger bigIntegerAnd15 = bigIntegerArr[3].add(bigIntegerArr[4]).and(bigInteger);
        bigIntegerAnd15.getClass();
        bigIntegerArr[3] = bigIntegerAnd15;
        BigInteger bigIntegerAnd16 = bigIntegerArr[5].subtract(bigIntegerArr[1]).and(bigInteger);
        bigIntegerAnd16.getClass();
        bigIntegerArr[5] = bigIntegerAnd16;
        BigInteger bigIntegerAnd17 = bigIntegerArr[2].xor(bigIntegerArr[4].shiftLeft(20)).and(bigInteger);
        bigIntegerAnd17.getClass();
        bigIntegerArr[2] = bigIntegerAnd17;
        BigInteger bigIntegerAnd18 = bigIntegerArr[4].add(bigIntegerArr[5]).and(bigInteger);
        bigIntegerAnd18.getClass();
        bigIntegerArr[4] = bigIntegerAnd18;
        BigInteger bigIntegerAnd19 = bigIntegerArr[6].subtract(bigIntegerArr[2]).and(bigInteger);
        bigIntegerAnd19.getClass();
        bigIntegerArr[6] = bigIntegerAnd19;
        BigInteger bigIntegerAnd20 = bigIntegerArr[3].xor(bigIntegerArr[5].shiftRight(17)).and(bigInteger);
        bigIntegerAnd20.getClass();
        bigIntegerArr[3] = bigIntegerAnd20;
        BigInteger bigIntegerAnd21 = bigIntegerArr[5].add(bigIntegerArr[6]).and(bigInteger);
        bigIntegerAnd21.getClass();
        bigIntegerArr[5] = bigIntegerAnd21;
        BigInteger bigIntegerAnd22 = bigIntegerArr[7].subtract(bigIntegerArr[3]).and(bigInteger);
        bigIntegerAnd22.getClass();
        bigIntegerArr[7] = bigIntegerAnd22;
        BigInteger bigIntegerAnd23 = bigIntegerArr[4].xor(bigIntegerArr[6].shiftLeft(14)).and(bigInteger);
        bigIntegerAnd23.getClass();
        bigIntegerArr[4] = bigIntegerAnd23;
        BigInteger bigIntegerAnd24 = bigIntegerArr[6].add(bigIntegerArr[7]).and(bigInteger);
        bigIntegerAnd24.getClass();
        bigIntegerArr[6] = bigIntegerAnd24;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m6215i() throws IOException {
        int iIndexOf;
        StringBuffer stringBuffer = (StringBuffer) this.f9083d;
        StringBuffer stringBuffer2 = (StringBuffer) this.f9082c;
        Writer writer = (Writer) this.f9081b;
        while (true) {
            int iIndexOf2 = stringBuffer2.indexOf("\n");
            if (iIndexOf2 < 0 || (iIndexOf = stringBuffer.indexOf("\n")) < 0) {
                return;
            }
            if (iIndexOf2 != 0) {
                writer.write(stringBuffer2.substring(0, iIndexOf2));
            }
            if (iIndexOf != 0) {
                for (int i9 = this.f9080a - iIndexOf2; i9 > 0; i9--) {
                    writer.write(32);
                }
                writer.write(stringBuffer.substring(0, iIndexOf));
            }
            writer.write(10);
            stringBuffer2.delete(0, iIndexOf2 + 1);
            stringBuffer.delete(0, iIndexOf + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:53:0x00bd, B:54:0x00c5, B:56:0x00cb), top: B:113:0x00bd }] */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m6216j(Object obj) {
        List<Class> list;
        Class<?> returnType;
        Method method;
        Method method2;
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 1) {
                    obj = objArr[0];
                }
            }
            if (obj != null) {
                if (this.f9082c == null || (method2 = (Method) this.f9083d) == null) {
                    Class<?> cls = obj.getClass();
                    if ((this.f9082c == null || ((Method) this.f9083d) == null) && (list = (List) this.f9084e) != null) {
                        loop0: for (Class cls2 : list) {
                            if (cls2 != null) {
                                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                                Class superclass = cls2;
                                while (true) {
                                    if (superclass == null || superclass == Object.class) {
                                        try {
                                            for (Method method3 : KavaReflector.declaredMethods(cls2)) {
                                                try {
                                                    if (KavaReflector.isStatic(method3) && method3.getParameterTypes().length == 0 && (returnType = method3.getReturnType()) != null && returnType != Void.TYPE && !returnType.isPrimitive() && returnType != String.class) {
                                                        Object objInvoke = KavaReflector.invoke(method3, null, new Object[0]);
                                                        if (!m6210k(objInvoke) && m6218m(objInvoke, cls, 3, setNewSetFromMap)) {
                                                            m6213e("网络发包器主动缓存成功: " + cls2.getName() + "#" + method3.getName());
                                                            break loop0;
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        } catch (Throwable unused2) {
                                            continue;
                                        }
                                    } else {
                                        try {
                                            for (Field field : KavaReflector.declaredFields(superclass)) {
                                                try {
                                                    if (KavaReflector.isStatic(field)) {
                                                        Object field2 = KavaReflector.readField(field, (Object) null);
                                                        if (!m6210k(field2) && m6218m(field2, cls, 3, setNewSetFromMap)) {
                                                            m6213e("网络发包器主动缓存成功: " + cls2.getName());
                                                            break loop0;
                                                        }
                                                    }
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            superclass = superclass.getSuperclass();
                                        } catch (Throwable unused4) {
                                            while (r7.hasNext()) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (m6208f(method2) < 100) {
                    m6217l(this.f9082c, obj.getClass());
                }
                Object obj2 = this.f9082c;
                if (obj2 == null || (method = (Method) this.f9083d) == null) {
                    StringBuilder sb2 = new StringBuilder("sendNetworkRequest 失败: dispatcher=");
                    sb2.append(this.f9082c != null);
                    sb2.append(" method=");
                    sb2.append(((Method) this.f9083d) != null);
                    m6213e(sb2.toString());
                } else {
                    try {
                        try {
                            return m6209h(this.f9080a == 2 ? KavaReflector.invoke(method, obj2, obj, 0) : KavaReflector.invoke(method, obj2, obj));
                        } catch (Throwable th2) {
                            m6213e("sendNetworkRequest 异常: " + th2.getMessage());
                        }
                    } catch (Throwable unused5) {
                        int i9 = this.f9080a;
                        Object obj3 = this.f9082c;
                        Method method4 = (Method) this.f9083d;
                        return i9 == 2 ? m6209h(KavaReflector.invokeMethod(obj3, method4.getName(), obj, 0)) : m6209h(KavaReflector.invokeMethod(obj3, method4.getName(), obj));
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public boolean m6217l(Object obj, Class cls) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = null;
            for (Method method2 : KavaReflector.declaredMethods(obj.getClass())) {
                if (m6207d(cls, method2) && (method == null || m6208f(method2) > m6208f(method))) {
                    method = method2;
                }
            }
            if (method != null) {
                m6211b(obj, "网络发包器方法匹配", method);
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            Iterator<Field> it = KavaReflector.declaredFields(obj.getClass()).iterator();
            while (it.hasNext()) {
                Object field = KavaReflector.readField(it.next(), obj);
                if (field != null && field != obj) {
                    try {
                        Method method3 = null;
                        for (Method method4 : KavaReflector.declaredMethods(field.getClass())) {
                            if (m6207d(cls, method4) && (method3 == null || m6208f(method4) > m6208f(method3))) {
                                method3 = method4;
                            }
                        }
                        if (method3 != null) {
                            m6211b(field, "网络发包器方法匹配", method3);
                            return true;
                        }
                        continue;
                    } catch (Throwable unused2) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public boolean m6218m(Object obj, Class cls, int i9, Set set) {
        if (obj == null) {
            return false;
        }
        if (set != null) {
            try {
                if (set.contains(obj)) {
                    return false;
                }
                set.add(obj);
            } catch (Throwable unused) {
            }
        }
        if (!m6217l(obj, cls)) {
            if (i9 <= 0) {
                return false;
            }
            try {
                for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    Iterator<Field> it = KavaReflector.declaredFields(superclass).iterator();
                    while (it.hasNext()) {
                        try {
                            Object field = KavaReflector.readField(it.next(), obj);
                            if (!m6210k(field) && m6218m(field, cls, i9 - 1, set)) {
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return false;
            } catch (Throwable unused3) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void m6219n() {
        BigInteger[] bigIntegerArr = (BigInteger[]) this.f9084e;
        BigInteger[] bigIntegerArr2 = (BigInteger[]) this.f9085f;
        BigInteger bigIntegerAdd = bigIntegerArr2[2].add(BigInteger.ONE);
        BigInteger bigInteger = (BigInteger) this.f9081b;
        BigInteger bigIntegerAnd = bigIntegerAdd.and(bigInteger);
        bigIntegerAnd.getClass();
        bigIntegerArr2[2] = bigIntegerAnd;
        BigInteger bigIntegerAnd2 = bigIntegerArr2[1].add(bigIntegerArr2[2]).and(bigInteger);
        bigIntegerAnd2.getClass();
        bigIntegerArr2[1] = bigIntegerAnd2;
        for (int i9 = 0; i9 < 256; i9++) {
            int i10 = i9 % 4;
            if (i10 == 0) {
                BigInteger bigInteger2 = bigIntegerArr2[0];
                BigInteger bigIntegerAnd3 = bigInteger2.xor(bigInteger2.shiftLeft(21)).not().and(bigInteger);
                bigIntegerAnd3.getClass();
                bigIntegerArr2[0] = bigIntegerAnd3;
            } else if (i10 == 1) {
                BigInteger bigInteger3 = bigIntegerArr2[0];
                BigInteger bigIntegerXor = bigInteger3.xor(bigInteger3.shiftRight(5));
                bigIntegerXor.getClass();
                bigIntegerArr2[0] = bigIntegerXor;
            } else if (i10 == 2) {
                BigInteger bigInteger4 = bigIntegerArr2[0];
                BigInteger bigIntegerXor2 = bigInteger4.xor(bigInteger4.shiftLeft(12));
                bigIntegerXor2.getClass();
                bigIntegerArr2[0] = bigIntegerXor2;
            } else if (i10 == 3) {
                BigInteger bigInteger5 = bigIntegerArr2[0];
                BigInteger bigIntegerXor3 = bigInteger5.xor(bigInteger5.shiftRight(33));
                bigIntegerXor3.getClass();
                bigIntegerArr2[0] = bigIntegerXor3;
            }
            BigInteger bigIntegerAnd4 = bigIntegerArr2[0].add(bigIntegerArr[(i9 + 128) % Opcodes.ACC_NATIVE]).and(bigInteger);
            bigIntegerAnd4.getClass();
            bigIntegerArr2[0] = bigIntegerAnd4;
            BigInteger bigInteger6 = bigIntegerArr[i9];
            BigInteger bigIntegerAnd5 = bigIntegerArr[bigInteger6.shiftRight(3).mod(BigInteger.valueOf(256L)).intValue()].add(bigIntegerArr2[0]).add(bigIntegerArr2[1]).and(bigInteger);
            bigIntegerAnd5.getClass();
            bigIntegerArr[i9] = bigIntegerAnd5;
            BigInteger bigIntegerAnd6 = bigIntegerArr[bigIntegerAnd5.shiftRight(11).mod(BigInteger.valueOf(256L)).intValue()].add(bigInteger6).and(bigInteger);
            bigIntegerAnd6.getClass();
            bigIntegerArr2[1] = bigIntegerAnd6;
            ((BigInteger[]) this.f9083d)[i9] = bigIntegerArr2[1];
        }
    }

    public C2815c(StringWriter stringWriter, int i9, int i10, String str) {
        if (stringWriter == null) {
            C0353j.m1305c("out == null");
            throw null;
        }
        if (i9 < 1) {
            C2104o.m5294t("leftWidth < 1");
            throw null;
        }
        if (i10 >= 1) {
            StringWriter stringWriter2 = new StringWriter(1000);
            StringWriter stringWriter3 = new StringWriter(1000);
            this.f9081b = stringWriter;
            this.f9080a = i9;
            this.f9082c = stringWriter2.getBuffer();
            this.f9083d = stringWriter3.getBuffer();
            this.f9084e = new C6092f(stringWriter2, i9, HttpUrl.FRAGMENT_ENCODE_SET);
            this.f9085f = new C6092f(stringWriter3, i10, str);
            return;
        }
        C2104o.m5294t("rightWidth < 1");
        throw null;
    }

    public C2815c(InterfaceC2814b interfaceC2814b) {
        this.f9080a = 1;
        this.f9084e = Collections.EMPTY_LIST;
        this.f9085f = AbstractC2091b.m5168o();
        this.f9081b = interfaceC2814b;
    }

    public C2815c() {
        this.f9081b = new C4405l[32];
        this.f9082c = new float[32];
        this.f9083d = new byte[32];
        C0945l0 c0945l0 = AbstractC0959s0.f3019a;
        this.f9084e = new C0945l0();
        this.f9085f = new C0945l0();
    }
}
