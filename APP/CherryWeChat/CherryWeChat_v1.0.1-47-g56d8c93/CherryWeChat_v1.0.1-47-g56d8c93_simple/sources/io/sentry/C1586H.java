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
    public static final HashMap f5728h = null;

    /* JADX INFO: renamed from: a */
    public final HashMap f5729a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5730b;

    /* JADX INFO: renamed from: c */
    public final C2029a f5731c;

    /* JADX INFO: renamed from: d */
    public C1654a f5732d;

    /* JADX INFO: renamed from: e */
    public C1654a f5733e;

    /* JADX INFO: renamed from: f */
    public C1654a f5734f;

    /* JADX INFO: renamed from: g */
    public C1927m1 f5735g;

    static {
        HashMap r0 = new HashMap();
        f5728h = r0;
        r0.put("boolean", Boolean.class);
        r0.put("char", Character.class);
        r0.put("byte", Byte.class);
        r0.put("short", Short.class);
        r0.put("int", Integer.class);
        r0.put("long", Long.class);
        r0.put("float", Float.class);
        r0.put("double", Double.class);
    }

    public C1586H() {
        this.f5729a = new HashMap();
        this.f5730b = new ArrayList();
        this.f5731c = new C2029a();
        this.f5732d = null;
        this.f5733e = null;
        this.f5734f = null;
        this.f5735g = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3666a() {
        C1981r r0 = this.f5731c.m4173a();
        Iterator r1 = this.f5729a.entrySet().iterator();     // Catch: Throwable -> L11
    L4:
        if (r1.hasNext() == false) goto L15;
        Map.Entry r2 = (Map.Entry) r1.next();     // Catch: Throwable -> L11
        if (r2.getKey() == null) goto L13;
        if (((String) r2.getKey()).startsWith("sentry:") == true) goto L4;
    L13:
        r1.remove();     // Catch: Throwable -> L11
        goto L4
    L15:
        r0.close();
        return;
    L11:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L19
    L21:
        throw th;
    L19:
        th = move-exception;
        th.addSuppressed(th);
        goto L21
    }

    /* JADX INFO: renamed from: b */
    public final Object m3667b(Class r4, String r5) {
        C1981r r0 = this.f5731c.m4173a();
        Object r52 = this.f5729a.get(r5);     // Catch: Throwable -> L18
        if (r4.isInstance(r52) == false) goto L7;
        r0.close();
        return r52;
    L7:
        Class r1 = (Class) f5728h.get(r4.getCanonicalName());     // Catch: Throwable -> L18
        if (r52 != null) goto L10;
    L16:
        r0.close();
        return null;
    L10:
        if (r4.isPrimitive() == false) goto L16;
        if (r1 == null) goto L16;
        if (r1.isInstance(r52) == false) goto L16;
        r0.close();
        return r52;
    L18:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L21
    L23:
        throw th;
    L21:
        th = move-exception;
        th.addSuppressed(th);
        goto L23
    }

    /* JADX INFO: renamed from: c */
    public final void m3668c(String r3, Object r4) {
        C1981r r0 = this.f5731c.m4173a();
        this.f5729a.put(r3, r4);     // Catch: Throwable -> L6
        r0.close();
        return;
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }
}
