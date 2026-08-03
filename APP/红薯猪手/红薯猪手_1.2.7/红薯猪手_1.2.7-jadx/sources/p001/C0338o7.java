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
                return context.getSharedPreferences(C0341oa.m915(new byte[]{-79, -120, 52, -56, 104, -81, -85, -113, 56, -120, 127, -22, -96, -126, 58, -119, 105, -96}, new byte[]{-46, -25, 89, -26, 27, -60}), 0);
            }
            C0237h4.m1092(C0341oa.m915(new byte[]{-121, -105, 15, -3, -9, 78, -112}, new byte[]{-28, -8, 97, -119, -110, 54}));
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        SharedPreferences.Editor editorEdit = m1178().edit();
        C0237h4.m1089(C0341oa.m915(new byte[]{-15, 66, 20, 48, -14, -111, -70, 8, 84}, new byte[]{-108, 38, 125, 68, -38, -65}), editorEdit);
        f1732 = editorEdit;
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m913(String str, boolean z) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-66, 26, 51}, new byte[]{-43, 127, 74, -13, -9, 83}), str);
        return m1178().getBoolean(str, z);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m914(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-111, 23, 55}, new byte[]{-6, 114, 78, 59, -67, -127}), str);
        return m1178().getInt(str, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static SharedPreferences m1178() {
        Object objM886 = f1011.m886();
        C0237h4.m1089(C0341oa.m915(new byte[]{-53, 23, -54, -39, 11, 50, -39, 23, -106, -95, 68, 112, -123}, new byte[]{-84, 114, -66, -113, 106, 94}), objM886);
        return (SharedPreferences) objM886;
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static String m1179(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{40, -124, 105}, new byte[]{67, -31, 16, -58, 121, 43}), str);
        C0341oa.m915(new byte[]{3, 57, 39}, new byte[]{103, 92, 65, -27, -15, 91});
        String string = m1178().getString(str, "");
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static void m1180(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{26, -23, -95}, new byte[]{113, -116, -40, -127, -72, -81}), str);
        f1732.remove(str).apply();
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static void m1181(String str, Object obj) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-17, -5, -81}, new byte[]{-124, -98, -42, 74, -78, 125}), str);
        C0237h4.m1090(C0341oa.m915(new byte[]{123, 96, -71}, new byte[]{26, 14, -64, -4, -49, -40}), obj);
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
        C0237h4.m1090(C0341oa.m915(new byte[]{-115, 89, -13}, new byte[]{-26, 60, -118, -78, -19, -41}), str);
        f1732.remove(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final void m1183(String str, String str2) {
        C0237h4.m1090(C0341oa.m915(new byte[]{120, -56, 8}, new byte[]{19, -83, 113, -3, -66, 26}), str);
        C0341oa.m915(new byte[]{-11, 85, 62}, new byte[]{-108, 59, 71, 117, -43, 119});
        if (str2 instanceof Integer) {
            f1732.putInt(str, ((Number) str2).intValue());
        } else if (str2 instanceof Float) {
            f1732.putFloat(str, ((Number) str2).floatValue());
        } else {
            f1732.putString(str, str2);
        }
    }
}
