package p054df;

import bsh.C1259t2;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.C5792j;
import okhttp3.internal.url._UrlKt;
import org.luckypray.dexkit.util.NativeReflect;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p069ef.C2216a;
import p069ef.C2217b;
import p069ef.C2218c;
import p172l8.AbstractC4713t;
import p172l8.AbstractC4717x;
import p172l8.C4712s;
import p185m8.AbstractC5109u0;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: df.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1957c {

    /* JADX INFO: renamed from: a */
    public static final C1957c f5453a = new C1957c();

    /* JADX INFO: renamed from: b */
    public static final C1955a f5454b = new C1955a(true);

    /* JADX INFO: renamed from: c */
    public static final Map f5455c = AbstractC5109u0.m20771l(AbstractC4717x.m18815a("boolean", Boolean.TYPE), AbstractC4717x.m18815a("byte", Byte.TYPE), AbstractC4717x.m18815a("char", Character.TYPE), AbstractC4717x.m18815a("short", Short.TYPE), AbstractC4717x.m18815a("int", Integer.TYPE), AbstractC4717x.m18815a("long", Long.TYPE), AbstractC4717x.m18815a("float", Float.TYPE), AbstractC4717x.m18815a("double", Double.TYPE), AbstractC4717x.m18815a("void", Void.TYPE));

    /* JADX INFO: renamed from: df.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ String f5456r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ ClassLoader f5457s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ClassLoader classLoader) {
            super(0);
            this.f5456r = str;
            this.f5457s = classLoader;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class invoke() throws ClassNotFoundException {
            String strSubstring = this.f5456r;
            int i10 = 0;
            while (AbstractC8611a0.m33060E(strSubstring, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, false, 2, null)) {
                i10++;
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
            }
            Class<?> clsLoadClass = (Class) C1957c.f5455c.get(strSubstring);
            if (clsLoadClass == null) {
                clsLoadClass = this.f5457s.loadClass(strSubstring);
            }
            clsLoadClass.getClass();
            for (int i11 = 0; i11 < i10; i11++) {
                clsLoadClass = Array.newInstance(clsLoadClass, 0).getClass();
            }
            return clsLoadClass;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Class m7089b(ClassLoader classLoader, C2216a c2216a) {
        classLoader.getClass();
        c2216a.getClass();
        return m7090c(classLoader, c2216a.m7984b());
    }

    /* JADX INFO: renamed from: c */
    public final Class m7090c(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        return (Class) f5454b.m7077a(classLoader, str, new a(str, classLoader));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Constructor m7091d(java.lang.ClassLoader r9, p069ef.C2218c r10) throws java.lang.NoSuchMethodException {
        /*
            r8 = this;
            r9.getClass()
            r10.getClass()
            boolean r0 = r10.m8005l()
            if (r0 == 0) goto L9a
            java.lang.String r0 = r10.m7997b()
            java.lang.Class r0 = r8.m7090c(r9, r0)
            java.util.List r1 = r10.m8003i()
            java.lang.Object r9 = r8.m7097j(r9, r1)
            java.lang.Throwable r1 = p172l8.C4712s.m18801e(r9)
            java.lang.String r2 = "Constructor "
            if (r1 != 0) goto L80
            java.lang.Class[] r9 = (java.lang.Class[]) r9
            java.lang.reflect.Constructor r9 = r8.m7092e(r0, r9)
            if (r9 == 0) goto L2d
            return r9
        L2d:
            r9 = 1
            java.lang.reflect.Constructor[] r1 = r0.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L53
            r1.getClass()     // Catch: java.lang.Throwable -> L53
            int r3 = r1.length     // Catch: java.lang.Throwable -> L53
            r4 = 0
        L37:
            if (r4 >= r3) goto L53
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = r10.m8001g()     // Catch: java.lang.Throwable -> L53
            r5.getClass()     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = p054df.C1956b.m7079a(r5)     // Catch: java.lang.Throwable -> L53
            boolean r6 = p024b9.AbstractC1061t.m3842c(r6, r7)     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L50
            r5.setAccessible(r9)     // Catch: java.lang.Throwable -> L53
            return r5
        L50:
            int r4 = r4 + 1
            goto L37
        L53:
            java.lang.String r1 = r10.m8002h()
            java.lang.String r3 = r10.m8001g()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.reflect.Member r0 = org.luckypray.dexkit.util.NativeReflect.getReflectedMethod(r0, r1, r3, r4)
            if (r0 == 0) goto L69
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            r0.setAccessible(r9)
            return r0
        L69:
            java.lang.NoSuchMethodException r9 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r10 = " not found"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
        L80:
            java.lang.NoSuchMethodException r9 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r10 = " not available: parameter type(s) missing"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            r9.initCause(r1)
            throw r9
        L9a:
            java.lang.String r9 = " not a constructor"
            okhttp3.C5792j.m23284a(r10, r9)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p054df.C1957c.m7091d(java.lang.ClassLoader, ef.c):java.lang.reflect.Constructor");
    }

    /* JADX INFO: renamed from: e */
    public final Constructor m7092e(Class cls, Class[] clsArr) {
        Object objM18798b;
        try {
            C4712s.a aVar = C4712s.f13928r;
            Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredConstructor.setAccessible(true);
            objM18798b = C4712s.m18798b(declaredConstructor);
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        if (C4712s.m18803g(objM18798b)) {
            objM18798b = null;
        }
        return (Constructor) objM18798b;
    }

    /* JADX INFO: renamed from: f */
    public final Field m7093f(Class cls, String str) {
        Object objM18798b;
        try {
            C4712s.a aVar = C4712s.f13928r;
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            objM18798b = C4712s.m18798b(declaredField);
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        if (C4712s.m18803g(objM18798b)) {
            objM18798b = null;
        }
        return (Field) objM18798b;
    }

    /* JADX INFO: renamed from: g */
    public final Method m7094g(Class cls, String str, Class[] clsArr) {
        Object objM18798b;
        try {
            C4712s.a aVar = C4712s.f13928r;
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            objM18798b = C4712s.m18798b(declaredMethod);
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        if (C4712s.m18803g(objM18798b)) {
            objM18798b = null;
        }
        return (Method) objM18798b;
    }

    /* JADX INFO: renamed from: h */
    public final Field m7095h(ClassLoader classLoader, C2217b c2217b, Boolean bool) throws NoSuchFieldException {
        classLoader.getClass();
        c2217b.getClass();
        Class clsM7090c = m7090c(classLoader, c2217b.m7987b());
        Object objM7098k = m7098k(classLoader, c2217b.m7991g());
        Throwable thM18801e = C4712s.m18801e(objM7098k);
        if (thM18801e != null) {
            NoSuchFieldException noSuchFieldException = new NoSuchFieldException("Field " + c2217b + " not available: type missing");
            noSuchFieldException.initCause(thM18801e);
            throw noSuchFieldException;
        }
        Class cls = (Class) objM7098k;
        for (Class superclass = clsM7090c; superclass != null; superclass = superclass.getSuperclass()) {
            Field fieldM7093f = m7093f(superclass, c2217b.m7989e());
            if (fieldM7093f != null && AbstractC1061t.m3842c(fieldM7093f.getType(), cls)) {
                return fieldM7093f;
            }
        }
        for (Class superclass2 = clsM7090c; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            try {
                Field[] declaredFields = superclass2.getDeclaredFields();
                declaredFields.getClass();
                for (Field field : declaredFields) {
                    if (AbstractC1061t.m3842c(c2217b.m7989e(), field.getName())) {
                        String strM7992h = c2217b.m7992h();
                        Class<?> type = field.getType();
                        type.getClass();
                        if (AbstractC1061t.m3842c(strM7992h, C1956b.m7083e(type))) {
                            field.setAccessible(true);
                            return field;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Field reflectedField = NativeReflect.getReflectedField(clsM7090c, c2217b.m7989e(), c2217b.m7992h(), bool);
        if (reflectedField != null) {
            reflectedField.setAccessible(true);
            return reflectedField;
        }
        throw new NoSuchFieldException("Field " + c2217b + " not found");
    }

    /* JADX INFO: renamed from: i */
    public final Method m7096i(ClassLoader classLoader, C2218c c2218c, Boolean bool) throws NoSuchMethodException {
        classLoader.getClass();
        c2218c.getClass();
        if (!c2218c.m8006m()) {
            C5792j.m23284a(c2218c, " not a method");
            return null;
        }
        Class clsM7090c = m7090c(classLoader, c2218c.m7997b());
        Object objM7097j = m7097j(classLoader, c2218c.m8003i());
        Throwable thM18801e = C4712s.m18801e(objM7097j);
        if (thM18801e != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + c2218c + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM18801e);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM7097j;
        Object objM7098k = m7098k(classLoader, c2218c.m8004j());
        Throwable thM18801e2 = C4712s.m18801e(objM7098k);
        if (thM18801e2 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + c2218c + " not available: return type missing");
            noSuchMethodException2.initCause(thM18801e2);
            throw noSuchMethodException2;
        }
        Class cls = (Class) objM7098k;
        for (Class superclass = clsM7090c; superclass != null; superclass = superclass.getSuperclass()) {
            Method methodM7094g = m7094g(superclass, c2218c.m8002h(), clsArr);
            if (methodM7094g != null && AbstractC1061t.m3842c(methodM7094g.getReturnType(), cls)) {
                return methodM7094g;
            }
        }
        for (Class superclass2 = clsM7090c; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            try {
                Method[] declaredMethods = superclass2.getDeclaredMethods();
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    if (AbstractC1061t.m3842c(method.getName(), c2218c.m8002h()) && AbstractC1061t.m3842c(c2218c.m8001g(), C1956b.m7080b(method))) {
                        method.setAccessible(true);
                        return method;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(clsM7090c, c2218c.m8002h(), c2218c.m8001g(), bool);
        if (reflectedMethod != null) {
            Method method2 = (Method) reflectedMethod;
            method2.setAccessible(true);
            return method2;
        }
        throw new NoSuchMethodException("Method " + c2218c + " not found");
    }

    /* JADX INFO: renamed from: j */
    public final Object m7097j(ClassLoader classLoader, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object objM7098k = m7098k(classLoader, (String) it.next());
            Throwable thM18801e = C4712s.m18801e(objM7098k);
            if (thM18801e != null) {
                return C4712s.m18798b(AbstractC4713t.m18807a(thM18801e));
            }
            arrayList.add((Class) objM7098k);
        }
        C4712s.a aVar = C4712s.f13928r;
        Object[] array = arrayList.toArray(new Class[0]);
        if (array != null) {
            return C4712s.m18798b(array);
        }
        C1259t2.m5095a("null cannot be cast to non-null type kotlin.Array<T>");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final Object m7098k(ClassLoader classLoader, String str) {
        try {
            C4712s.a aVar = C4712s.f13928r;
            return C4712s.m18798b(m7090c(classLoader, str));
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            return C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
    }
}
