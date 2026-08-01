package p088g;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: g.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C2444c extends AbstractC2446e {

    /* JADX INFO: renamed from: c */
    public static volatile C2444c f6615c;

    /* JADX INFO: renamed from: d */
    public static final Executor f6616d = new Executor() { // from class: g.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C2444c.m8858f().mo8861c(runnable);
        }
    };

    /* JADX INFO: renamed from: e */
    public static final Executor f6617e = new Executor() { // from class: g.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C2444c.m8858f().mo8859a(runnable);
        }
    };

    /* JADX INFO: renamed from: a */
    public AbstractC2446e f6618a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2446e f6619b;

    public C2444c() {
        C2445d c2445d = new C2445d();
        this.f6619b = c2445d;
        this.f6618a = c2445d;
    }

    /* JADX INFO: renamed from: f */
    public static C2444c m8858f() {
        if (f6615c != null) {
            return f6615c;
        }
        synchronized (C2444c.class) {
            try {
                if (f6615c == null) {
                    f6615c = new C2444c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6615c;
    }

    @Override // p088g.AbstractC2446e
    /* JADX INFO: renamed from: a */
    public void mo8859a(Runnable runnable) {
        this.f6618a.mo8859a(runnable);
    }

    @Override // p088g.AbstractC2446e
    /* JADX INFO: renamed from: b */
    public boolean mo8860b() {
        return this.f6618a.mo8860b();
    }

    @Override // p088g.AbstractC2446e
    /* JADX INFO: renamed from: c */
    public void mo8861c(Runnable runnable) {
        this.f6618a.mo8861c(runnable);
    }
}
