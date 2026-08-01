package p026N;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.p055lu.wxmask272.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p006D.AbstractC0079h;
import p009E0.C0102b;

/* JADX INFO: renamed from: N.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0215a {

    /* JADX INFO: renamed from: d */
    public static volatile C0215a f548d;

    /* JADX INFO: renamed from: e */
    public static final Object f549e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f552c;

    /* JADX INFO: renamed from: b */
    public final HashSet f551b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashMap f550a = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0215a(Context context) {
        this.f552c = context.getApplicationContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C0215a m406c(Context context) {
        if (f548d == null) {
            synchronized (f549e) {
                try {
                    if (f548d == null) {
                        f548d = new C0215a(context);
                    }
                } finally {
                }
            }
        }
        return f548d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m407a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f552c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f551b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0216b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m408b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C0102b(e2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m408b(Class cls, HashSet hashSet) {
        Object objMo410b;
        if (AbstractC0079h.m164A()) {
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
        HashMap map = this.f550a;
        if (map.containsKey(cls)) {
            objMo410b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0216b interfaceC0216b = (InterfaceC0216b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo409a = interfaceC0216b.mo409a();
                if (!listMo409a.isEmpty()) {
                    for (Class cls2 : listMo409a) {
                        if (!map.containsKey(cls2)) {
                            m408b(cls2, hashSet);
                        }
                    }
                }
                objMo410b = interfaceC0216b.mo410b(this.f552c);
                hashSet.remove(cls);
                map.put(cls, objMo410b);
            } catch (Throwable th2) {
                throw new C0102b(th2);
            }
        }
        Trace.endSection();
        return objMo410b;
    }
}
