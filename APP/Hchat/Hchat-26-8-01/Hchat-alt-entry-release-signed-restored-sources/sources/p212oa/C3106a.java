package p212oa;

import android.content.ContentValues;
import android.text.TextUtils;
import java.lang.reflect.Method;
import na.C2914b;
import p024b9.C0219e;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p162l3.C2458l;
import p258r8.C3744i;

/* JADX INFO: renamed from: oa.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3106a {

    /* JADX INFO: renamed from: a */
    public final C2458l f10074a;

    /* JADX INFO: renamed from: b */
    public boolean f10075b;

    /* JADX INFO: renamed from: c */
    public final Object f10076c;

    /* JADX INFO: renamed from: d */
    public final Object f10077d;

    /* JADX INFO: renamed from: e */
    public final Object f10078e;

    /* JADX INFO: renamed from: f */
    public final Object f10079f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3106a(DexFinder dexFinder, C2458l c2458l, C2914b c2914b, C2914b c2914b2, C2914b c2914b3) {
        this.f10075b = false;
        this.f10076c = dexFinder;
        this.f10074a = c2458l;
        this.f10077d = c2914b;
        this.f10078e = c2914b2;
        this.f10079f = c2914b3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m6608a(ContentValues contentValues, String str) {
        try {
            Object obj = contentValues.get(str);
            if (obj == null) {
                return null;
            }
            String strValueOf = String.valueOf(obj);
            if (TextUtils.isEmpty(strValueOf)) {
                return null;
            }
            if ("null".equalsIgnoreCase(strValueOf)) {
                return null;
            }
            return strValueOf;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int m6609b(String str) {
        try {
            Class<?> clsLoadClass = KavaReflector.loadClass(str, (ClassLoader) this.f10076c);
            if (clsLoadClass != null) {
                int i9 = 0;
                for (Method method : KavaReflector.declaredMethods(clsLoadClass)) {
                    String name = method.getName();
                    if ("insert".equals(name) || "insertWithOnConflict".equals(name) || "replace".equals(name) || "replaceOrThrow".equals(name) || "update".equals(name) || "updateWithOnConflict".equals(name)) {
                        try {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes != null && parameterTypes.length >= 2) {
                                int length = parameterTypes.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    if (ContentValues.class.isAssignableFrom(parameterTypes[i10])) {
                                        C3744i.f12154b.m7763b(method, new C0219e(this, 20));
                                        i9++;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (i9 > 0) {
                    ((C2914b) this.f10079f).f9449h.m6327d("数据库兜底Hook: " + str + " count=" + i9);
                }
                return i9;
            }
        } catch (Throwable unused2) {
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m6610c(String str) {
        ((C2914b) this.f10079f).f9449h.m6327d(str);
    }

    public C3106a(ClassLoader classLoader, C2458l c2458l, C2914b c2914b, C2914b c2914b2, C2914b c2914b3) {
        this.f10076c = classLoader;
        this.f10074a = c2458l;
        this.f10077d = c2914b;
        this.f10078e = c2914b2;
        this.f10079f = c2914b3;
    }
}
