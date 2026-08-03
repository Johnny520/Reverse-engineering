package p001;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: renamed from: ۟.o7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0338o7 {

    /* JADX INFO: renamed from: ۥ */
    public static final C0338o7 f1010 = new C0338o7();

    /* JADX INFO: renamed from: ۥ۟ */
    public static final C0286kb f1011 = new C0286kb(a.f1012);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final SharedPreferences.Editor f1732;

    /* JADX INFO: renamed from: ۟.o7$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<SharedPreferences> {

        /* JADX INFO: renamed from: ۥ */
        public static final a f1012 = new a();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final SharedPreferences mo7() {
            Context context = C0292l3.f937;
            if (context != null) {
                return context.getSharedPreferences("com.skyhand.record", 0);
            }
            C0237h4.m1092("context");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SharedPreferences.Editor editorEdit = m1178().edit();
        C0237h4.m1089("edit(...)", editorEdit);
        f1732 = editorEdit;
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m913(String str, boolean z) {
        C0237h4.m1090("key", str);
        return m1178().getBoolean(str, z);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m914(String str) {
        C0237h4.m1090("key", str);
        return m1178().getInt(str, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static SharedPreferences m1178() {
        Object objM886 = f1011.m886();
        C0237h4.m1089("getValue(...)", objM886);
        return (SharedPreferences) objM886;
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static String m1179(String str) {
        C0237h4.m1090("key", str);
        "def";
        String string = m1178().getString(str, "");
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static void m1180(String str) {
        C0237h4.m1090("key", str);
        f1732.remove(str).apply();
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static void m1181(String str, Object obj) {
        C0237h4.m1090("key", str);
        C0237h4.m1090("any", obj);
        if (obj instanceof Integer) {
            f1732.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Float) {
            f1732.putFloat(str, ((Number) obj).floatValue());
        } else if (obj instanceof String) {
            f1732.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            f1732.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            f1732.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof Set) {
            f1732.putStringSet(str, (Set) obj);
        }
        f1732.apply();
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final void m1182(String str) {
        C0237h4.m1090("key", str);
        f1732.remove(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final void m1183(String str, String str2) {
        C0237h4.m1090("key", str);
        "any";
        if (str2 instanceof Integer) {
            f1732.putInt(str, ((Number) str2).intValue());
        } else if (str2 instanceof Float) {
            f1732.putFloat(str, ((Number) str2).floatValue());
        } else {
            f1732.putString(str, str2);
        }
    }
}
