package p014b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p010a9.InterfaceC0173a;
import p172l8.C4700i0;

/* JADX INFO: renamed from: b.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0712n {

    /* JADX INFO: renamed from: a */
    public final Executor f2097a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0173a f2098b;

    /* JADX INFO: renamed from: c */
    public final Object f2099c;

    /* JADX INFO: renamed from: d */
    public int f2100d;

    /* JADX INFO: renamed from: e */
    public boolean f2101e;

    /* JADX INFO: renamed from: f */
    public boolean f2102f;

    /* JADX INFO: renamed from: g */
    public final List f2103g;

    /* JADX INFO: renamed from: h */
    public final Runnable f2104h;

    public C0712n(Executor executor, InterfaceC0173a interfaceC0173a) {
        executor.getClass();
        interfaceC0173a.getClass();
        this.f2097a = executor;
        this.f2098b = interfaceC0173a;
        this.f2099c = new Object();
        this.f2103g = new ArrayList();
        this.f2104h = new Runnable() { // from class: b.m
            @Override // java.lang.Runnable
            public final void run() {
                C0712n.m2790a(this.f2096q);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m2790a(C0712n c0712n) {
        c0712n.getClass();
        synchronized (c0712n.f2099c) {
            try {
                c0712n.f2101e = false;
                if (c0712n.f2100d == 0 && !c0712n.f2102f) {
                    c0712n.f2098b.invoke();
                    c0712n.m2791b();
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2791b() {
        synchronized (this.f2099c) {
            try {
                this.f2102f = true;
                Iterator it = this.f2103g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0173a) it.next()).invoke();
                }
                this.f2103g.clear();
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2792c() {
        boolean z10;
        synchronized (this.f2099c) {
            z10 = this.f2102f;
        }
        return z10;
    }
}
