package p054df;

import ae.C0307f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p172l8.AbstractC4717x;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5109u0;
import p254r5.C6494d0;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: df.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1956b {

    /* JADX INFO: renamed from: a */
    public static final C1956b f5448a = new C1956b();

    /* JADX INFO: renamed from: b */
    public static final Map f5449b = AbstractC5109u0.m20772m(AbstractC4717x.m18815a("boolean", "Z"), AbstractC4717x.m18815a("byte", "B"), AbstractC4717x.m18815a("char", "C"), AbstractC4717x.m18815a("short", "S"), AbstractC4717x.m18815a("int", "I"), AbstractC4717x.m18815a("float", "F"), AbstractC4717x.m18815a("long", "J"), AbstractC4717x.m18815a("double", "D"), AbstractC4717x.m18815a("void", "V"));

    /* JADX INFO: renamed from: c */
    public static final Map f5450c = AbstractC5109u0.m20772m(AbstractC4717x.m18815a("Z", "boolean"), AbstractC4717x.m18815a("B", "byte"), AbstractC4717x.m18815a("C", "char"), AbstractC4717x.m18815a("S", "short"), AbstractC4717x.m18815a("I", "int"), AbstractC4717x.m18815a("F", "float"), AbstractC4717x.m18815a("J", "long"), AbstractC4717x.m18815a("D", "double"), AbstractC4717x.m18815a("V", "void"));

    /* JADX INFO: renamed from: df.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final a f5451r = new a();

        public a() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo27m(Class cls) {
            cls.getClass();
            return C1956b.m7083e(cls);
        }
    }

    /* JADX INFO: renamed from: df.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final b f5452r = new b();

        public b() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo27m(Class cls) {
            cls.getClass();
            return C1956b.m7083e(cls);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m7079a(Constructor constructor) {
        constructor.getClass();
        StringBuilder sb2 = new StringBuilder("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        sb2.append(AbstractC5106t.m20754u0(parameterTypes, _UrlKt.FRAGMENT_ENCODE_SET, null, null, 0, null, a.f5451r, 30, null));
        sb2.append(")V");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final String m7080b(Method method) {
        method.getClass();
        StringBuilder sb2 = new StringBuilder("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb2.append(AbstractC5106t.m20754u0(parameterTypes, _UrlKt.FRAGMENT_ENCODE_SET, null, null, 0, null, b.f5452r, 30, null));
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb2.append(m7083e(returnType));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final List m7081c(String str) {
        String str2;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int iM33150m0 = 0;
        while (iM33150m0 < str.length()) {
            char cCharAt = str.charAt(iM33150m0);
            if (cCharAt == '[') {
                iM33150m0++;
            } else {
                if (cCharAt == 'L') {
                    str2 = str;
                    iM33150m0 = AbstractC8621f0.m33150m0(str2, ';', iM33150m0, false, 4, null);
                } else {
                    str2 = str;
                }
                iM33150m0++;
                arrayList.add(m7082d(str2.substring(i10, iM33150m0)));
                str = str2;
                i10 = iM33150m0;
            }
        }
        String str3 = str;
        if (i10 == iM33150m0) {
            return arrayList;
        }
        C10010p0.m38820a("Unknown signString: ".concat(str3));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final String m7082d(String str) {
        str.getClass();
        if (str.charAt(0) == '[') {
            return m7082d(str.substring(1)) + _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        if (str.length() == 1) {
            return m7085g(str);
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            return AbstractC8611a0.m33068M(str.substring(1, str.length() - 1), '/', '.', false, 4, null);
        }
        C10010p0.m38820a("Unknown class sign: ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final String m7083e(Class cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                return "L" + AbstractC8611a0.m33068M(cls.getName(), '.', '/', false, 4, null) + ";";
            }
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            return "[" + m7083e(componentType);
        }
        if (AbstractC1061t.m3842c(cls, Boolean.TYPE)) {
            return "Z";
        }
        if (AbstractC1061t.m3842c(cls, Byte.TYPE)) {
            return "B";
        }
        if (AbstractC1061t.m3842c(cls, Character.TYPE)) {
            return "C";
        }
        if (AbstractC1061t.m3842c(cls, Short.TYPE)) {
            return "S";
        }
        if (AbstractC1061t.m3842c(cls, Integer.TYPE)) {
            return "I";
        }
        if (AbstractC1061t.m3842c(cls, Float.TYPE)) {
            return "F";
        }
        if (AbstractC1061t.m3842c(cls, Long.TYPE)) {
            return "J";
        }
        if (AbstractC1061t.m3842c(cls, Double.TYPE)) {
            return "D";
        }
        if (AbstractC1061t.m3842c(cls, Void.TYPE)) {
            return "V";
        }
        C6494d0.m25749a("Unknown primitive type: ", cls);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final String m7084f(String str) {
        str.getClass();
        if (AbstractC8611a0.m33060E(str, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, false, 2, null)) {
            return "[" + m7084f(str.substring(0, str.length() - 2));
        }
        String str2 = (String) f5449b.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + AbstractC8611a0.m33068M(str, '.', '/', false, 4, null) + ";";
    }

    /* JADX INFO: renamed from: g */
    public static final String m7085g(String str) {
        String str2 = (String) f5450c.get(str);
        if (str2 != null) {
            return str2;
        }
        C0307f.m923a("Unknown primitive typeSign: ", str);
        return null;
    }
}
