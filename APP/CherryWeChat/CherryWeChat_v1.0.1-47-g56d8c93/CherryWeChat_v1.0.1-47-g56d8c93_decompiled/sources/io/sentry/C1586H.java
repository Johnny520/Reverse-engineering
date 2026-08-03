package io.sentry;

import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.H */
/* JADX INFO: loaded from: classes.dex */
public final class C1586H {

    /* JADX INFO: renamed from: h */
    public static final HashMap f5728h;

    /* JADX INFO: renamed from: a */
    public final HashMap f5729a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ArrayList f5730b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C2029a f5731c = new C2029a();

    /* JADX INFO: renamed from: d */
    public C1654a f5732d = null;

    /* JADX INFO: renamed from: e */
    public C1654a f5733e = null;

    /* JADX INFO: renamed from: f */
    public C1654a f5734f = null;

    /* JADX INFO: renamed from: g */
    public C1927m1 f5735g = null;

    static {
        HashMap map = new HashMap();
        f5728h = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    /* JADX INFO: renamed from: a */
    public final void m3666a() {
        C1981r c1981rM4173a = this.f5731c.m4173a();
        try {
            Iterator it = this.f5729a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m3667b(Class cls, String str) {
        C1981r c1981rM4173a = this.f5731c.m4173a();
        try {
            Object obj = this.f5729a.get(str);
            if (cls.isInstance(obj)) {
                c1981rM4173a.close();
                return obj;
            }
            Class cls2 = (Class) f5728h.get(cls.getCanonicalName());
            if (obj != null && cls.isPrimitive() && cls2 != null) {
                if (cls2.isInstance(obj)) {
                    c1981rM4173a.close();
                    return obj;
                }
            }
            c1981rM4173a.close();
            return null;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3668c(String str, Object obj) {
        C1981r c1981rM4173a = this.f5731c.m4173a();
        try {
            this.f5729a.put(str, obj);
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
