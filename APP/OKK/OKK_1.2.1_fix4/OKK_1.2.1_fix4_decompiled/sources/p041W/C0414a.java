package p041W;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p007D0.C0137c;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: W.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0414a {

    /* JADX INFO: renamed from: d */
    public static volatile C0414a f916d;

    /* JADX INFO: renamed from: e */
    public static final Object f917e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f920c;

    /* JADX INFO: renamed from: b */
    public final HashSet f919b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashMap f918a = new HashMap();

    public C0414a(Context context) {
        this.f920c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static C0414a m996c(Context context) {
        if (f916d == null) {
            synchronized (f917e) {
                try {
                    if (f916d == null) {
                        f916d = new C0414a(context);
                    }
                } finally {
                }
            }
        }
        return f916d;
    }

    /* JADX INFO: renamed from: a */
    public final void m997a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f920c.getString(C1031R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f919b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0415b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m998b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C0137c(e2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m998b(Class cls, HashSet hashSet) {
        boolean zBooleanValue;
        Object objMo1000b;
        if (AbstractC0358S.f722b == null) {
            zBooleanValue = Trace.isEnabled();
        } else {
            try {
                if (AbstractC0358S.f722b == null) {
                    AbstractC0358S.f721a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0358S.f722b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                zBooleanValue = ((Boolean) AbstractC0358S.f722b.invoke(null, Long.valueOf(AbstractC0358S.f721a))).booleanValue();
            } catch (Exception e2) {
                if (e2 instanceof InvocationTargetException) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(cause);
                }
                zBooleanValue = false;
            }
        }
        if (zBooleanValue) {
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
        HashMap map = this.f918a;
        if (map.containsKey(cls)) {
            objMo1000b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0415b interfaceC0415b = (InterfaceC0415b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo999a = interfaceC0415b.mo999a();
                if (!listMo999a.isEmpty()) {
                    for (Class cls2 : listMo999a) {
                        if (!map.containsKey(cls2)) {
                            m998b(cls2, hashSet);
                        }
                    }
                }
                objMo1000b = interfaceC0415b.mo1000b(this.f920c);
                hashSet.remove(cls);
                map.put(cls, objMo1000b);
            } catch (Throwable th2) {
                throw new C0137c(th2);
            }
        }
        Trace.endSection();
        return objMo1000b;
    }
}
