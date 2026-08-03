package com.tendcloud.tenddata;

/* JADX INFO: renamed from: com.tendcloud.tenddata.h */
/* JADX INFO: loaded from: classes.dex */
public class C0115h {

    /* JADX INFO: renamed from: a */
    public static boolean f499a = true;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    private static synchronized String m527a() {
        try {
            new Exception().getStackTrace()[4].getClassName().lastIndexOf(".");
        } catch (Throwable unused) {
            return C0020ab.f145t;
        }
        return C0020ab.f145t;
    }

    /* JADX INFO: renamed from: a */
    private static void m528a(String str, int i) {
        if (str == null) {
            return;
        }
        try {
            int length = str.length();
            int i2 = 2000;
            int i3 = 0;
            int i4 = 0;
            while (i3 < 100) {
                if (length <= i2) {
                    m530b(str.substring(i4, length), i);
                    return;
                }
                m530b(str.substring(i4, i2), i);
                i3++;
                i4 = i2;
                i2 += 2000;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m529a(String str, Throwable th) {
        if (f499a) {
            m528a(str, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m530b(String str, int i) {
        m527a();
    }

    public static void dForDeveloper(String str) {
        if (f499a) {
            m528a(str, 3);
        }
    }

    public static void dForInternal(String... strArr) {
    }

    public static void eForDeveloper(String str) {
        if (f499a) {
            m528a(str, 6);
        }
    }

    public static void eForInternal(Throwable th) {
    }

    public static void eForInternal(String... strArr) {
    }

    public static void iForDeveloper(String str) {
        if (f499a) {
            m528a(str, 4);
        }
    }

    public static void iForInternal(String... strArr) {
    }

    public static void json(String str) {
    }
}
