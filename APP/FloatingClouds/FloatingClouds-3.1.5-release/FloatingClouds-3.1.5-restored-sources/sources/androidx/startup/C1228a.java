package androidx.startup;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000a.C0266Ob;
import p000a.C0960zf;
import p000a.InterfaceC0388V8;

/* JADX INFO: renamed from: androidx.startup.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1228a {

    /* JADX INFO: renamed from: d */
    public static volatile C1228a f5212d;

    /* JADX INFO: renamed from: e */
    public static final Object f5213e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f5216c;

    /* JADX INFO: renamed from: b */
    public final HashSet f5215b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashMap f5214a = new HashMap();

    public C1228a(Context context) {
        this.f5216c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static C1228a m3012c(Context context) {
        if (f5212d == null) {
            synchronized (f5213e) {
                try {
                    if (f5212d == null) {
                        f5212d = new C1228a(context);
                    }
                } finally {
                }
            }
        }
        return f5212d;
    }

    /* JADX INFO: renamed from: a */
    public final void m3013a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f5216c.getString(C1227R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f5215b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0388V8.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m3014b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0266Ob(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m3014b(Class cls, HashSet hashSet) {
        Object objMo1020b;
        if (C0960zf.m2249a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f5214a;
        if (map.containsKey(cls)) {
            objMo1020b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0388V8 interfaceC0388V8 = (InterfaceC0388V8) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends InterfaceC0388V8<?>>> listMo1019a = interfaceC0388V8.mo1019a();
                if (!listMo1019a.isEmpty()) {
                    for (Class<? extends InterfaceC0388V8<?>> cls2 : listMo1019a) {
                        if (!map.containsKey(cls2)) {
                            m3014b(cls2, hashSet);
                        }
                    }
                }
                objMo1020b = interfaceC0388V8.mo1020b(this.f5216c);
                hashSet.remove(cls);
                map.put(cls, objMo1020b);
            } catch (Throwable th2) {
                throw new C0266Ob(th2);
            }
        }
        Trace.endSection();
        return objMo1020b;
    }
}
