package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8159 {
    /* JADX INFO: renamed from: ۥ */
    public static boolean m4186(String str) {
        m26899(str);
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Object m4187(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new C8160("Object must not be null");
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Object m26898(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw new C8160(String.format(str, objArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m26899(String str) {
        throw new C8160(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m26900(String str, Object... objArr) {
        throw new C8160(String.format(str, objArr));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m26901(boolean z) {
        if (z) {
            throw new C8160("Must be false");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m26902(boolean z, String str) {
        if (z) {
            throw new C8160(str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m26903(boolean z) {
        if (!z) {
            throw new C8160("Must be true");
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m26904(boolean z, String str) {
        if (!z) {
            throw new C8160(str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m26905(Object[] objArr) {
        m26906(objArr, "Array must not contain any null objects");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m26906(Object[] objArr, String str) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw new C8160(str);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m26907(String str) {
        if (str == null || str.length() == 0) {
            throw new C8160("String must not be empty");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static void m26908(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C8160(str2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m26909(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C8160(String.format("The '%s' parameter must not be empty.", str2));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m26910(Object obj) {
        if (obj == null) {
            throw new C8160("Object must not be null");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m26911(Object obj, String str) {
        if (obj == null) {
            throw new C8160(str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static void m26912(Object obj, String str) {
        if (obj == null) {
            throw new C8160(String.format("The parameter '%s' must not be null.", str));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m26913(String str) {
        throw new IllegalStateException(str);
    }
}
