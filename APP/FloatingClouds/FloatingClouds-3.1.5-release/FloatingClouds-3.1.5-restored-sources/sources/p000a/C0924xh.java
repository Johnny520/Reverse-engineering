package p000a;

import android.database.Cursor;
import java.lang.reflect.Array;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: a.xh */
/* JADX INFO: loaded from: classes.dex */
public final class C0924xh {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap<String, C0115G4> f3533a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public static final ConcurrentHashMap<String, String> f3534b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a.xh$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static Cursor m2211a(Object obj, String str, Object[] objArr) {
            C0631i9.m1482e(str, "sql");
            try {
                try {
                    Object objInvoke = obj.getClass().getMethod("rawQuery", String.class, Array.newInstance((Class<?>) Object.class, 0).getClass()).invoke(obj, str, objArr);
                    if (objInvoke instanceof Cursor) {
                        return (Cursor) objInvoke;
                    }
                    return null;
                } catch (NoSuchMethodException unused) {
                    Object objInvoke2 = obj.getClass().getMethod("rawQuery", String.class, Array.newInstance((Class<?>) String.class, 0).getClass()).invoke(obj, str, objArr != null ? (String[]) objArr : null);
                    if (objInvoke2 instanceof Cursor) {
                        return (Cursor) objInvoke2;
                    }
                    return null;
                }
            } catch (Throwable unused2) {
                return null;
            }
            return null;
        }
    }
}
