package Yue;

import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥۡۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6499 {
    /* JADX INFO: renamed from: ۥ */
    public static boolean m2995(@InterfaceC6490 Object obj, @InterfaceC6490 Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m2996(@InterfaceC6490 Object... objArr) {
        return Objects.hash(objArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m20591(@InterfaceC6490 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T> T m20592(@InterfaceC6490 T t) {
        t.getClass();
        return t;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T> T m20593(@InterfaceC6490 T t, @InterfaceC6391 String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static String m20594(@InterfaceC6490 Object obj, @InterfaceC6490 String str) {
        return obj != null ? obj.toString() : str;
    }
}
