package p153k4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import okhttp3.C5750e;
import p172l8.C4700i0;

/* JADX INFO: renamed from: k4.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3958h {

    /* JADX INFO: renamed from: a */
    public final C3954d f11422a = new C3954d();

    /* JADX INFO: renamed from: b */
    public final Map f11423b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final Set f11424c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public volatile boolean f11425d;

    /* JADX INFO: renamed from: d */
    public final void m15670d(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        str.getClass();
        autoCloseable.getClass();
        if (this.f11425d) {
            m15672f(autoCloseable);
            return;
        }
        synchronized (this.f11422a) {
            autoCloseable2 = (AutoCloseable) this.f11423b.put(str, autoCloseable);
        }
        m15672f(autoCloseable2);
    }

    /* JADX INFO: renamed from: e */
    public final void m15671e() {
        if (this.f11425d) {
            return;
        }
        this.f11425d = true;
        synchronized (this.f11422a) {
            try {
                Iterator it = this.f11423b.values().iterator();
                while (it.hasNext()) {
                    m15672f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f11424c.iterator();
                while (it2.hasNext()) {
                    m15672f((AutoCloseable) it2.next());
                }
                this.f11424c.clear();
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15672f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC3955e.m15664a(autoCloseable);
            } catch (Exception e10) {
                C5750e.m23251a(e10);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final AutoCloseable m15673g(String str) {
        AutoCloseable autoCloseable;
        str.getClass();
        synchronized (this.f11422a) {
            autoCloseable = (AutoCloseable) this.f11423b.get(str);
        }
        return autoCloseable;
    }
}
