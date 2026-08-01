package p158k9;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p098g9.InterfaceC2549c;
import p142j9.C3767z2;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5116y;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: k9.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4208f {
    /* JADX INFO: renamed from: g */
    public static final Object m16652g(Class cls, Map map, List list) {
        cls.getClass();
        map.getClass();
        list.getClass();
        InterfaceC4705l interfaceC4705lM18787a = AbstractC4706m.m18787a(new C4204b(map));
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C4206d(cls, map, AbstractC4706m.m18787a(new C4205c(cls, map)), interfaceC4705lM18787a, list));
        objNewProxyInstance.getClass();
        return objNewProxyInstance;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m16653h(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return m16652g(cls, map, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[RETURN] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m16654i(java.lang.Class r5, java.util.List r6, java.util.Map r7, java.lang.Object r8) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158k9.AbstractC4208f.m16654i(java.lang.Class, java.util.List, java.util.Map, java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: j */
    public static final int m16655j(Map map) {
        int iHashCode = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: k */
    public static final int m16656k(InterfaceC4705l interfaceC4705l) {
        return ((Number) interfaceC4705l.getValue()).intValue();
    }

    /* JADX INFO: renamed from: l */
    public static final String m16657l(Class cls, Map map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(cls.getCanonicalName());
        AbstractC5081g0.m20583q0(map.entrySet(), sb2, ", ", "(", ")", 0, null, C4207e.f12359q, 48, null);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: m */
    public static final CharSequence m16658m(Map.Entry entry) {
        String string;
        entry.getClass();
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            string.getClass();
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            string.getClass();
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            string.getClass();
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            string.getClass();
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            string.getClass();
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            string.getClass();
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            string.getClass();
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            string.getClass();
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            string.getClass();
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    /* JADX INFO: renamed from: n */
    public static final String m16659n(InterfaceC4705l interfaceC4705l) {
        return (String) interfaceC4705l.getValue();
    }

    /* JADX INFO: renamed from: o */
    public static final Object m16660o(Class cls, Map map, InterfaceC4705l interfaceC4705l, InterfaceC4705l interfaceC4705l2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(m16656k(interfaceC4705l2));
                }
            } else if (name.equals("toString")) {
                return m16659n(interfaceC4705l);
            }
        }
        if (AbstractC1061t.m3842c(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(m16654i(cls, list, map, AbstractC5106t.m20686G0(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb2 = new StringBuilder("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(AbstractC5106t.m20713V0(objArr));
        sb2.append(')');
        throw new C3767z2(sb2.toString());
    }

    /* JADX INFO: renamed from: p */
    public static final Void m16661p(int i10, String str, Class cls) {
        String strMo3792u;
        InterfaceC2549c interfaceC2549cM3807b = AbstractC1061t.m3842c(cls, Class.class) ? AbstractC1052o0.m3807b(InterfaceC2549c.class) : (cls.isArray() && AbstractC1061t.m3842c(cls.getComponentType(), Class.class)) ? AbstractC1052o0.m3807b(InterfaceC2549c[].class) : AbstractC9886a.m38370e(cls);
        if (AbstractC1061t.m3842c(interfaceC2549cM3807b.mo3792u(), AbstractC1052o0.m3807b(Object[].class).mo3792u())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(interfaceC2549cM3807b.mo3792u());
            sb2.append('<');
            Class<?> componentType = AbstractC9886a.m38367b(interfaceC2549cM3807b).getComponentType();
            componentType.getClass();
            sb2.append(AbstractC9886a.m38370e(componentType).mo3792u());
            sb2.append('>');
            strMo3792u = sb2.toString();
        } else {
            strMo3792u = interfaceC2549cM3807b.mo3792u();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + strMo3792u);
    }

    /* JADX INFO: renamed from: q */
    public static final Object m16662q(Object obj, Class cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof InterfaceC2549c) {
            obj = AbstractC9886a.m38367b((InterfaceC2549c) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof InterfaceC2549c[]) {
                InterfaceC2549c[] interfaceC2549cArr = (InterfaceC2549c[]) obj;
                ArrayList arrayList = new ArrayList(interfaceC2549cArr.length);
                for (InterfaceC2549c interfaceC2549c : interfaceC2549cArr) {
                    arrayList.add(AbstractC9886a.m38367b(interfaceC2549c));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
