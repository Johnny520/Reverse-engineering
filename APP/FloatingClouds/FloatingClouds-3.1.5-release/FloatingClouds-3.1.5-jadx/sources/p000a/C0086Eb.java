package p000a;

import android.database.Cursor;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.Eb */
/* JADX INFO: loaded from: classes.dex */
public final class C0086Eb {

    /* JADX INFO: renamed from: a */
    public static final C0086Eb f268a = new C0086Eb();

    /* JADX INFO: renamed from: a */
    public static boolean m210a(String str, boolean z) {
        Object next;
        C0115G4 c0115g4;
        Object obj;
        try {
            Set<Map.Entry<String, C0115G4>> setEntrySet = C0924xh.f3533a.entrySet();
            C0631i9.m1481d(setEntrySet, "<get-entries>(...)");
            Iterator<T> it = setEntrySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Object key = ((Map.Entry) next).getKey();
                C0631i9.m1481d(key, "<get-key>(...)");
                if (C0034Be.m94I((CharSequence) key, "EnMicroMsg", false)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (c0115g4 = (C0115G4) entry.getValue()) != null && (obj = c0115g4.f382a) != null) {
                String str2 = z ? "UPDATE rcontact SET type = type | 512 WHERE username = ?" : "UPDATE rcontact SET type = type & ~512 WHERE username = ?";
                obj.getClass().getMethod("execSQL", String.class, Object[].class).invoke(obj, str2, new String[]{str});
                boolean zM212c = m212c(obj, str, z);
                C0908x1.m2194b("MuteService", "setMuteViaDb execSQL verify=" + zM212c + ": " + str2 + " [wxid=" + str + "]");
                return zM212c;
            }
            C0908x1.m2197e("MuteService", "setMuteViaDb: no EnMicroMsg DB instance");
            return false;
        } catch (Throwable th) {
            C0908x1.m2193a("MuteService", "setMuteViaDb FAILED", th);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m211b(String str, boolean z, ClassLoader classLoader) {
        try {
            Method declaredMethod = Class.forName("e01.e2", false, classLoader).getDeclaredMethod("Q", String.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, str);
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (zBooleanValue == z) {
                C0908x1.m2194b("MuteService", "setMuteViaJavaLayer: already " + z + ", skip");
                return;
            }
            C0908x1.m2197e("MuteService", "setMuteViaJavaLayer: e01.e2.Q=" + zBooleanValue + ", DB write should have handled it");
        } catch (Throwable th) {
            C0908x1.m2193a("MuteService", "setMuteViaJavaLayer FAILED", th);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m212c(Object obj, String str, boolean z) {
        Object objM2206a;
        boolean z2;
        Cursor cursor;
        try {
            z2 = false;
            Object objInvoke = obj.getClass().getMethod("rawQuery", String.class, Array.newInstance((Class<?>) Object.class, 0).getClass()).invoke(obj, "SELECT type FROM rcontact WHERE username=?", new Object[]{str});
            cursor = objInvoke instanceof Cursor ? (Cursor) objInvoke : null;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        if (cursor == null) {
            return false;
        }
        try {
            if (cursor.moveToFirst()) {
                if (((cursor.getLong(0) & 512) != 0) == z) {
                    z2 = true;
                }
            }
            cursor.close();
            objM2206a = Boolean.valueOf(z2);
            Object obj2 = Boolean.FALSE;
            if (objM2206a instanceof C0901wd.a) {
                objM2206a = obj2;
            }
            return ((Boolean) objM2206a).booleanValue();
        } finally {
        }
    }
}
