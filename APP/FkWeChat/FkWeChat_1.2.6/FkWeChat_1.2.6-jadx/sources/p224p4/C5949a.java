package p224p4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p238q4.AbstractC6244a;

/* JADX INFO: renamed from: p4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5949a {

    /* JADX INFO: renamed from: d */
    public static volatile C5949a f18868d;

    /* JADX INFO: renamed from: e */
    public static final Object f18869e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f18872c;

    /* JADX INFO: renamed from: b */
    public final Set f18871b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final Map f18870a = new HashMap();

    public C5949a(Context context) {
        this.f18872c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: e */
    public static C5949a m23921e(Context context) {
        if (f18868d == null) {
            synchronized (f18869e) {
                try {
                    if (f18868d == null) {
                        f18868d = new C5949a(context);
                    }
                } finally {
                }
            }
        }
        return f18868d;
    }

    /* JADX INFO: renamed from: a */
    public void m23922a(Bundle bundle) {
        String string = this.f18872c.getString(AbstractC5951c.f18873a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC5950b.class.isAssignableFrom(cls)) {
                            this.f18871b.add(cls);
                        }
                    }
                }
                Iterator it = this.f18871b.iterator();
                while (it.hasNext()) {
                    m23925d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new C5952d(e10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m23923b(Class cls) {
        try {
            try {
                AbstractC6244a.m24638a("Startup");
                m23922a(this.f18872c.getPackageManager().getProviderInfo(new ComponentName(this.f18872c, (Class<?>) cls), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new C5952d(e10);
            }
        } finally {
            AbstractC6244a.m24639b();
        }
    }

    /* JADX INFO: renamed from: c */
    public Object m23924c(Class cls) {
        Object objM23925d;
        synchronized (f18869e) {
            try {
                objM23925d = this.f18870a.get(cls);
                if (objM23925d == null) {
                    objM23925d = m23925d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objM23925d;
    }

    /* JADX INFO: renamed from: d */
    public final Object m23925d(Class cls, Set set) {
        Object objCreate;
        if (AbstractC6244a.m24641d()) {
            try {
                AbstractC6244a.m24638a(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC6244a.m24639b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f18870a.containsKey(cls)) {
            objCreate = this.f18870a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC5950b interfaceC5950b = (InterfaceC5950b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = interfaceC5950b.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!this.f18870a.containsKey(cls2)) {
                            m23925d(cls2, set);
                        }
                    }
                }
                objCreate = interfaceC5950b.create(this.f18872c);
                set.remove(cls);
                this.f18870a.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new C5952d(th2);
            }
        }
        AbstractC6244a.m24639b();
        return objCreate;
    }

    /* JADX INFO: renamed from: f */
    public Object m23926f(Class cls) {
        return m23924c(cls);
    }

    /* JADX INFO: renamed from: g */
    public boolean m23927g(Class cls) {
        return this.f18871b.contains(cls);
    }
}
