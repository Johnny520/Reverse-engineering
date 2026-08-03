package Yue;

import java.util.HashMap;
import java.util.Map;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۡۡ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6193 {

    /* JADX INFO: renamed from: ۥ */
    public static final char f1884 = '{';

    /* JADX INFO: renamed from: ۥ۟ */
    public static final char f1885 = '}';

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f15213 = "{}";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final char f15214 = '\\';

    /* JADX INFO: renamed from: ۥ */
    public static final C5064 m2684(String str, Object[] objArr) {
        Throwable thM19090 = m19090(objArr);
        if (thM19090 != null) {
            objArr = m19098(objArr);
        }
        return m2685(str, objArr, thM19090);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final C5064 m2685(String str, Object[] objArr, Throwable th) {
        int i;
        if (str == null) {
            return new C5064(null, objArr, th);
        }
        if (objArr == null) {
            return new C5064(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int iIndexOf = str.indexOf(f15213, i3);
            if (iIndexOf == -1) {
                if (i3 == 0) {
                    return new C5064(str, objArr, th);
                }
                sb.append((CharSequence) str, i3, str.length());
                return new C5064(sb.toString(), objArr, th);
            }
            if (!m19093(str, iIndexOf)) {
                sb.append((CharSequence) str, i3, iIndexOf);
                m19085(sb, objArr[i2], new HashMap());
            } else if (m19092(str, iIndexOf)) {
                sb.append((CharSequence) str, i3, iIndexOf - 1);
                m19085(sb, objArr[i2], new HashMap());
            } else {
                i2--;
                sb.append((CharSequence) str, i3, iIndexOf - 1);
                sb.append(f1884);
                i = iIndexOf + 1;
                i3 = i;
                i2++;
            }
            i = iIndexOf + 2;
            i3 = i;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        return new C5064(sb.toString(), objArr, th);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m19082(StringBuilder sb, boolean[] zArr) {
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(zArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m19083(StringBuilder sb, byte[] bArr) {
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) bArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m19084(StringBuilder sb, char[] cArr) {
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(cArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m19085(StringBuilder sb, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            m19096(sb, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            m19082(sb, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            m19083(sb, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            m19084(sb, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            m19097(sb, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            m19091(sb, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            m19094(sb, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            m19087(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            m19086(sb, (double[]) obj);
        } else {
            m19095(sb, (Object[]) obj, map);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m19086(StringBuilder sb, double[] dArr) {
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(dArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m19087(StringBuilder sb, float[] fArr) {
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(fArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C5064 m19088(String str, Object obj) {
        return m2684(str, new Object[]{obj});
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C5064 m19089(String str, Object obj, Object obj2) {
        return m2684(str, new Object[]{obj, obj2});
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Throwable m19090(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m19091(StringBuilder sb, int[] iArr) {
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(iArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m19092(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean m19093(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m19094(StringBuilder sb, long[] jArr) {
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(jArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m19095(StringBuilder sb, Object[] objArr, Map<Object[], Object> map) {
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        if (map.containsKey(objArr)) {
            sb.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                m19085(sb, objArr[i], map);
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        }
        sb.append(']');
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m19096(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            C8157.m26828("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th);
            sb.append("[FAILED toString()]");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m19097(StringBuilder sb, short[] sArr) {
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) sArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static Object[] m19098(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }
}
