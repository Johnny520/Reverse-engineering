package p125i7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p211o8.AbstractC5661b;

/* JADX INFO: renamed from: i7.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3232q {

    /* JADX INFO: renamed from: i7.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String str = (String) obj;
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                if (str.charAt(i11) == '/') {
                    i10++;
                }
            }
            Integer numValueOf = Integer.valueOf(i10);
            String str2 = (String) obj2;
            int i12 = 0;
            for (int i13 = 0; i13 < str2.length(); i13++) {
                if (str2.charAt(i13) == '/') {
                    i12++;
                }
            }
            return AbstractC5661b.m22869d(numValueOf, Integer.valueOf(i12));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Set m12281a(ClassLoader classLoader) {
        Set setM20483e;
        classLoader.getClass();
        ClassLoader parent = classLoader.getParent();
        if (parent == null || (setM20483e = m12281a(parent)) == null) {
            setM20483e = AbstractC5068b1.m20483e();
        }
        if (!(classLoader instanceof URLClassLoader)) {
            List listM12283c = m12283c(classLoader);
            return listM12283c == null ? setM20483e : AbstractC5071c1.m20503l(setM20483e, listM12283c);
        }
        URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
        uRLs.getClass();
        return AbstractC5071c1.m20503l(AbstractC5081g0.m20564c1(AbstractC5106t.m20710U(uRLs)), setM20483e);
    }

    /* JADX INFO: renamed from: b */
    public static final Field m12282b(Class cls) {
        Field field;
        Field fieldM12282b;
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        int length = declaredFields.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i10];
            if (AbstractC1061t.m3842c(field.getName(), "ucp") && AbstractC1061t.m3842c(field.getType().getSimpleName(), "URLClassPath")) {
                break;
            }
            i10++;
        }
        if (field != null) {
            return field;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || (fieldM12282b = m12282b(superclass)) == null) {
            return null;
        }
        return fieldM12282b;
    }

    /* JADX INFO: renamed from: c */
    public static final List m12283c(ClassLoader classLoader) {
        Method method;
        try {
            try {
                Field fieldM12282b = m12282b(classLoader.getClass());
                if (fieldM12282b == null) {
                    return null;
                }
                fieldM12282b.setAccessible(true);
                Object obj = fieldM12282b.get(classLoader);
                if (obj == null || (method = obj.getClass().getMethod("getURLs", null)) == null) {
                    return null;
                }
                method.setAccessible(true);
                URL[] urlArr = (URL[]) method.invoke(obj, null);
                if (urlArr != null) {
                    return AbstractC5106t.m20713V0(urlArr);
                }
                return null;
            } catch (Throwable unused) {
                return m12284d(classLoader);
            }
        } catch (Throwable unused2) {
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m12284d(java.lang.ClassLoader r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p125i7.AbstractC3232q.m12284d(java.lang.ClassLoader):java.util.List");
    }
}
