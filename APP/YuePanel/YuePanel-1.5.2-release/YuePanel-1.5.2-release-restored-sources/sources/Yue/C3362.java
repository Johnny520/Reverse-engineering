package Yue;

import Yue.C6932;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3362 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f5327 = "Startup";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile C3362 f5328;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Object f5329 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final Context f5330;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final Set<Class<? extends InterfaceC5435<?>>> f247 = new HashSet();

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final Map<Class<?>, Object> f246 = new HashMap();

    public C3362(@InterfaceC6391 Context context) {
        this.f5330 = context.getApplicationContext();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C3362 m6886(@InterfaceC6391 Context context) {
        if (f5328 == null) {
            synchronized (f5329) {
                try {
                    if (f5328 == null) {
                        f5328 = new C3362(context);
                    }
                } finally {
                }
            }
        }
        return f5328;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m6887(@InterfaceC6391 C3362 c3362) {
        synchronized (f5329) {
            f5328 = c3362;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m439() {
        try {
            try {
                C7947.m25075(f5327);
                m440(this.f5330.getPackageManager().getProviderInfo(new ComponentName(this.f5330.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new C7581(e);
            }
        } finally {
            C7947.m25078();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m440(@InterfaceC6490 Bundle bundle) {
        String string = this.f5330.getString(C6932.C1116.f2499);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC5435.class.isAssignableFrom(cls)) {
                            this.f247.add((Class<? extends InterfaceC5435<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends InterfaceC5435<?>>> it = this.f247.iterator();
                while (it.hasNext()) {
                    m6889(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new C7581(e);
            }
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public <T> T m6888(@InterfaceC6391 Class<? extends InterfaceC5435<?>> cls) {
        T t;
        synchronized (f5329) {
            try {
                t = (T) this.f246.get(cls);
                if (t == null) {
                    t = (T) m6889(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final <T> T m6889(@InterfaceC6391 Class<? extends InterfaceC5435<?>> cls, @InterfaceC6391 Set<Class<?>> set) {
        T t;
        if (C7947.m25080()) {
            try {
                C7947.m25075(cls.getSimpleName());
            } catch (Throwable th) {
                C7947.m25078();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f246.containsKey(cls)) {
            t = (T) this.f246.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC5435<?> interfaceC5435NewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends InterfaceC5435<?>>> listDependencies = interfaceC5435NewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends InterfaceC5435<?>> cls2 : listDependencies) {
                        if (!this.f246.containsKey(cls2)) {
                            m6889(cls2, set);
                        }
                    }
                }
                t = (T) interfaceC5435NewInstance.create(this.f5330);
                set.remove(cls);
                this.f246.put(cls, t);
            } catch (Throwable th2) {
                throw new C7581(th2);
            }
        }
        C7947.m25078();
        return t;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public <T> T m6890(@InterfaceC6391 Class<? extends InterfaceC5435<T>> cls) {
        return (T) m6888(cls);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m6891(@InterfaceC6391 Class<? extends InterfaceC5435<?>> cls) {
        return this.f247.contains(cls);
    }
}
