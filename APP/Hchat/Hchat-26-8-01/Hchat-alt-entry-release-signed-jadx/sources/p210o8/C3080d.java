package p210o8;

import android.content.ContentValues;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import p010aa.C0036d;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1656p;
import p125i8.C2002f;
import p125i8.C2005i;
import p167l8.C2526a;
import p258r8.C3744i;

/* JADX INFO: renamed from: o8.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3080d {

    /* JADX INFO: renamed from: a */
    public final DexFinder f9951a;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f9952b;

    /* JADX INFO: renamed from: c */
    public final C2002f f9953c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f9954d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    public final ThreadLocal f9955e = ThreadLocal.withInitial(new C1656p(4));

    /* JADX INFO: renamed from: f */
    public volatile boolean f9956f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3080d(DexFinder dexFinder, ClassLoader classLoader, C2002f c2002f) {
        this.f9951a = dexFinder;
        this.f9952b = classLoader;
        this.f9953c = c2002f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static ContentValues m6542a(Object[] objArr) {
        for (Object obj : objArr) {
            if (obj instanceof ContentValues) {
                return (ContentValues) obj;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m6543c(String str) {
        String lowerCase;
        int iIndexOf;
        int iIndexOf2;
        return (!TextUtils.isEmpty(str) && (iIndexOf = (lowerCase = str.toLowerCase()).indexOf("<msgsource")) >= 0 && (iIndexOf2 = lowerCase.indexOf("</msgsource>", iIndexOf)) >= 0) ? str.substring(iIndexOf, Math.min(iIndexOf2 + 12, str.length())).trim() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m6544h(Object[] objArr) {
        if (objArr.length == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            return (String) obj;
        }
        for (Object obj2 : objArr) {
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if ("message".equalsIgnoreCase(str) || str.toLowerCase().contains("message")) {
                    return str;
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m6545b(C2526a c2526a) {
        Iterator it = this.f9954d.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC3079c) it.next()).mo2173a(c2526a);
            } catch (Throwable th2) {
                String str = "数据库变更监听回调失败: " + th2.getMessage();
                if (this.f9953c != null) {
                    C2005i.m4939f("[WeChatDatabaseListenerApi] ".concat(str));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m6546d(Class cls) {
        String str;
        if (cls == null) {
            return 0;
        }
        int i9 = 0;
        for (Method method : KavaReflector.declaredMethods(cls)) {
            String str2 = null;
            if (method != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                String name = method.getName();
                if (returnType != Long.TYPE || parameterTypes == null) {
                    Class<?> cls2 = Integer.TYPE;
                    if (returnType != cls2 || parameterTypes == null) {
                        str = "delete";
                        if ("delete".equals(method.getName()) && returnType == cls2 && parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2] == String[].class) {
                            str2 = str;
                        }
                    } else {
                        int length = parameterTypes.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            if (ContentValues.class.isAssignableFrom(parameterTypes[i10])) {
                                str = "update";
                                if ("update".equals(name) || "updateWithOnConflict".equals(name)) {
                                }
                            } else {
                                i10++;
                            }
                        }
                        str = "delete";
                        if ("delete".equals(method.getName())) {
                            str2 = str;
                        }
                    }
                } else {
                    int length2 = parameterTypes.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            break;
                        }
                        if (!ContentValues.class.isAssignableFrom(parameterTypes[i11])) {
                            i11++;
                        } else if ("insert".equals(name) || "insertWithOnConflict".equals(name) || "replace".equals(name) || "replaceOrThrow".equals(name)) {
                            str2 = "insert";
                        }
                    }
                }
            }
            if (str2 != null) {
                C3744i.f12154b.m7763b(method, new C0036d(this, str2, method));
                i9++;
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized void m6547e() {
        int iM6546d;
        int iM6546d2;
        Class<?> cls;
        try {
            if (!this.f9956f && m6548f()) {
                DexFinder dexFinder = this.f9951a;
                int iM6546d3 = 0;
                for (Class<?> superclass = dexFinder != null ? dexFinder.sqliteDbWrapperClass : null; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    iM6546d3 += m6546d(superclass);
                }
                ClassLoader classLoader = this.f9952b;
                if (classLoader == null) {
                    iM6546d = 0;
                } else {
                    try {
                        iM6546d = m6546d(KavaReflector.loadClass("com.tencent.wcdb.database.SQLiteDatabase", classLoader));
                    } catch (Throwable unused) {
                        iM6546d = 0;
                    }
                }
                int i9 = iM6546d3 + iM6546d;
                ClassLoader classLoader2 = this.f9952b;
                if (classLoader2 == null) {
                    iM6546d2 = 0;
                } else {
                    try {
                        iM6546d2 = m6546d(KavaReflector.loadClass("android.database.sqlite.SQLiteDatabase", classLoader2));
                    } catch (Throwable unused2) {
                        iM6546d2 = 0;
                    }
                }
                int i10 = i9 + iM6546d2;
                this.f9956f = i10 > 0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("数据库变更监听Hook: wrapper=");
                DexFinder dexFinder2 = this.f9951a;
                sb2.append((dexFinder2 == null || (cls = dexFinder2.sqliteDbWrapperClass) == null) ? "null" : cls.getName());
                sb2.append(" methods=");
                sb2.append(i10);
                String string = sb2.toString();
                if (this.f9953c != null) {
                    C2005i.m4939f("[WeChatDatabaseListenerApi] ".concat(string));
                }
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m6548f() {
        DexFinder dexFinder = this.f9951a;
        return ((dexFinder == null || dexFinder.sqliteDbWrapperClass == null) && this.f9952b == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m6549g(InterfaceC3079c interfaceC3079c) {
        this.f9954d.addIfAbsent(interfaceC3079c);
    }
}
