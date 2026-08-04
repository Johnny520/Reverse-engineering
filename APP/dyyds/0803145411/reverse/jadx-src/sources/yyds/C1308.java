package yyds;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛶᛳᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1308 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f5986;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f5987;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f5988;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f5989;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C1308 f5980 = new C1308(0, 0, 1, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1308 f5985 = new C1308(1, 1, 2, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C1308 f5981 = new C1308(2, 2, 3, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C1308 f5977 = new C1308(3, 3, 4, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final C1308 f5979 = new C1308(4, 4, 5, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C1308 f5984 = new C1308(5, 5, 6, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final C1308 f5982 = new C1308(6, 6, 7, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final C1308 f5983 = new C1308(7, 7, 8, "VZCBSIFJD");

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final C1308 f5978 = new C1308(8, 8, 9, "VZCBSIFJD");

    public C1308(int i, int i2, int i3, String str) {
        this.f5986 = i;
        this.f5987 = str;
        this.f5988 = i2;
        this.f5989 = i3;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static C1308 m2590(String str, int i, int i2) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C1308(11, i, i2, str);
        }
        if (cCharAt == 'F') {
            return f5982;
        }
        if (cCharAt == 'L') {
            return new C1308(10, i + 1, i2 - 1, str);
        }
        if (cCharAt == 'S') {
            return f5979;
        }
        if (cCharAt == 'V') {
            return f5980;
        }
        if (cCharAt == 'I') {
            return f5984;
        }
        if (cCharAt == 'J') {
            return f5983;
        }
        if (cCharAt == 'Z') {
            return f5985;
        }
        if (cCharAt == '[') {
            return new C1308(9, i, i2, str);
        }
        switch (cCharAt) {
            case 'B':
                return f5977;
            case 'C':
                return f5981;
            case 'D':
                return f5978;
            default:
                C0188.m798("Invalid descriptor: ".concat(str));
                return null;
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static String m2591(Class cls) {
        return cls.getName().replace('.', '/');
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2592(Class cls, StringBuilder sb) {
        char c;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb.append('L');
            sb.append(m2591(cls));
            sb.append(';');
            return;
        }
        if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Void.TYPE) {
            c = 'V';
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else {
            if (cls != Long.TYPE) {
                throw new AssertionError();
            }
            c = 'J';
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static int m2593(String str) {
        int i = 0;
        int iMax = 1;
        while (str.charAt(iMax) != ')') {
            while (str.charAt(iMax) == '[') {
                iMax++;
            }
            int i2 = iMax + 1;
            iMax = str.charAt(iMax) == 'L' ? Math.max(i2, str.indexOf(59, i2) + 1) : i2;
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static C1308 m2594(Class cls) {
        if (!cls.isPrimitive()) {
            StringBuilder sb = new StringBuilder();
            m2592(cls, sb);
            String string = sb.toString();
            return m2590(string, 0, string.length());
        }
        if (cls == Integer.TYPE) {
            return f5984;
        }
        if (cls == Void.TYPE) {
            return f5980;
        }
        if (cls == Boolean.TYPE) {
            return f5985;
        }
        if (cls == Byte.TYPE) {
            return f5977;
        }
        if (cls == Character.TYPE) {
            return f5981;
        }
        if (cls == Short.TYPE) {
            return f5979;
        }
        if (cls == Double.TYPE) {
            return f5978;
        }
        if (cls == Float.TYPE) {
            return f5982;
        }
        if (cls == Long.TYPE) {
            return f5983;
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m2595(String str) {
        char cCharAt = str.charAt(1);
        int i = 1;
        int i2 = 1;
        while (cCharAt != ')') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                i++;
                i2 += 2;
            } else {
                while (str.charAt(i) == '[') {
                    i++;
                }
                int iMax = i + 1;
                if (str.charAt(i) == 'L') {
                    iMax = Math.max(iMax, str.indexOf(59, iMax) + 1);
                }
                i2++;
                i = iMax;
            }
            cCharAt = str.charAt(i);
        }
        char cCharAt2 = str.charAt(i + 1);
        if (cCharAt2 == 'V') {
            return i2 << 2;
        }
        return (i2 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static String m2596(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            m2592(cls, sb);
        }
        sb.append(')');
        m2592(method.getReturnType(), sb);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1308)) {
            return false;
        }
        C1308 c1308 = (C1308) obj;
        int i = this.f5986;
        if (i == 12) {
            i = 10;
        }
        int i2 = c1308.f5986;
        if (i != (i2 != 12 ? i2 : 10)) {
            return false;
        }
        int i3 = c1308.f5988;
        int i4 = c1308.f5989;
        int i5 = this.f5989;
        int i6 = this.f5988;
        if (i5 - i6 != i4 - i3) {
            return false;
        }
        while (i6 < i5) {
            if (this.f5987.charAt(i6) != c1308.f5987.charAt(i3)) {
                return false;
            }
            i6++;
            i3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f5986;
        int iCharAt = (i == 12 ? 10 : i) * 13;
        if (i >= 9) {
            for (int i2 = this.f5988; i2 < this.f5989; i2++) {
                iCharAt = (this.f5987.charAt(i2) + iCharAt) * 17;
            }
        }
        return iCharAt;
    }

    public final String toString() {
        return m2597();
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String m2597() {
        String str = this.f5987;
        int i = this.f5989;
        int i2 = this.f5988;
        int i3 = this.f5986;
        return i3 == 10 ? str.substring(i2 - 1, i + 1) : i3 == 12 ? AbstractC2104.m4014("L", str.substring(i2, i), ";") : str.substring(i2, i);
    }
}
