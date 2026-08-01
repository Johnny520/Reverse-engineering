package p102z0;

import android.database.Cursor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.C0131s;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;

/* JADX INFO: renamed from: z0.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1143z {

    /* JADX INFO: renamed from: b */
    public static volatile Object f3877b;

    /* JADX INFO: renamed from: c */
    public static volatile Method f3878c;

    /* JADX INFO: renamed from: d */
    public static volatile long f3879d;

    /* JADX INFO: renamed from: a */
    public static final C1143z f3876a = new C1143z();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f3880e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap f3881f = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2527a(String str, C1142y c1142y) {
        String string;
        List<String> listM252Z = AbstractC0120h.m252Z(new String[]{str, c1142y.f3868a, c1142y.f3869b, c1142y.f3870c});
        ArrayList arrayList = new ArrayList();
        for (String str2 : listM252Z) {
            String str3 = null;
            if (str2 != null && (string = AbstractC0299i.m507C0(str2).toString()) != null && !AbstractC0307q.m534d0(string)) {
                str3 = string;
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f3880e.put((String) it.next(), c1142y);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1142y m2528b(String str) {
        AbstractC0223g.m418e(str, "identifier");
        String string = AbstractC0299i.m507C0(str).toString();
        if (AbstractC0307q.m534d0(string)) {
            return null;
        }
        C1142y c1142y = (C1142y) f3880e.get(string);
        if (c1142y != null) {
            return c1142y;
        }
        C1142y c1142yM2532f = m2532f("select r.username,r.alias,r.encryptUsername,r.conRemark,r.nickname,r.pyInitial,r.quanPin,i.reserved2 as avatarUrl\nfrom rcontact r\nleft join img_flag i on r.username=i.username\nwhere r.username=? or r.alias=? or r.encryptUsername=?\nlimit 1", new Object[]{string, string, string});
        if (c1142yM2532f != null) {
            m2527a(string, c1142yM2532f);
            return c1142yM2532f;
        }
        C1142y c1142yM2532f2 = m2532f("select username,alias,conRemark,nickname from rcontact where username=? or alias=? limit 1", new Object[]{string, string});
        if (c1142yM2532f2 == null) {
            return null;
        }
        m2527a(string, c1142yM2532f2);
        return c1142yM2532f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x004c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [E0.d] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.lang.reflect.Method[]] */
    /* JADX INFO: renamed from: c */
    public static Method m2529c(Class cls) {
        Object c0104d;
        ?? c0104d2;
        try {
            c0104d = cls.getMethod("rawQuery", String.class, Object[].class);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (AbstractC0105e.m246a(c0104d) != null) {
            try {
                ?? methods = cls.getMethods();
                AbstractC0223g.m417d(methods, "getMethods(...)");
                int length = methods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        c0104d2 = 0;
                        break;
                    }
                    c0104d2 = methods[i2];
                    if (AbstractC0223g.m414a(c0104d2.getName(), "rawQuery") && c0104d2.getParameterTypes().length == 2) {
                        break;
                    }
                    i2++;
                }
            } catch (Throwable th2) {
                c0104d2 = new C0104d(th2);
            }
            c0104d = (Method) (c0104d2 instanceof C0104d ? 0 : c0104d2);
        }
        return (Method) c0104d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2530d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0 || cursor.isNull(columnIndex)) {
            return null;
        }
        return cursor.getString(columnIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static List m2531e(String str, Object[] objArr) {
        AbstractC0223g.m418e(str, "sql");
        AbstractC0223g.m418e(objArr, "args");
        Cursor cursorM2533g = m2533g(str, objArr);
        if (cursorM2533g == null) {
            return C0131s.f426a;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorM2533g.moveToNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int columnCount = cursorM2533g.getColumnCount();
                for (int i2 = 0; i2 < columnCount; i2++) {
                    linkedHashMap.put(cursorM2533g.getColumnName(i2), cursorM2533g.isNull(i2) ? null : cursorM2533g.getString(i2));
                }
                arrayList.add(linkedHashMap);
            }
            try {
                cursorM2533g.close();
            } catch (Throwable unused) {
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                cursorM2533g.close();
            } catch (Throwable unused2) {
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: f */
    public static C1142y m2532f(String str, Object[] objArr) {
        Cursor cursorM2533g = m2533g(str, objArr);
        C1142y c1142y = null;
        if (cursorM2533g == null) {
            return null;
        }
        try {
            if (cursorM2533g.moveToFirst()) {
                c1142y = new C1142y(m2530d(cursorM2533g, "username"), m2530d(cursorM2533g, "alias"), m2530d(cursorM2533g, "encryptUsername"), m2530d(cursorM2533g, "conRemark"), m2530d(cursorM2533g, "nickname"), m2530d(cursorM2533g, "pyInitial"), m2530d(cursorM2533g, "quanPin"), m2530d(cursorM2533g, "avatarUrl"));
            }
            try {
                cursorM2533g.close();
            } catch (Throwable unused) {
            }
            return c1142y;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Cursor m2533g(String str, Object[] objArr) {
        Object c0104d;
        Object obj = f3877b;
        if (obj == null) {
            return null;
        }
        try {
            Method methodM2529c = f3878c;
            if (methodM2529c == null) {
                methodM2529c = m2529c(obj.getClass());
                if (methodM2529c != null) {
                    f3878c = methodM2529c;
                } else {
                    methodM2529c = null;
                }
            }
            Object objInvoke = methodM2529c != null ? methodM2529c.invoke(obj, str, objArr) : null;
            c0104d = objInvoke instanceof Cursor ? (Cursor) objInvoke : null;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        return (Cursor) (c0104d instanceof C0104d ? null : c0104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x0005, B:8:0x000a, B:11:0x0022, B:13:0x0026, B:15:0x002a, B:16:0x002e, B:18:0x0038), top: B:23:0x0005 }] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m2534h(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (f3877b != obj) {
                f3877b = obj;
                f3878c = null;
                f3879d++;
                f3880e.clear();
                f3881f.clear();
            }
            if (f3878c == null) {
                f3878c = m2529c(obj.getClass());
            } else {
                Method method = f3878c;
                if (!AbstractC0223g.m414a(method != null ? method.getDeclaringClass() : null, obj.getClass())) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
