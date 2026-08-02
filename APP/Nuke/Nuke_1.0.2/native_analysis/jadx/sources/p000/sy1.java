package p000;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sy1 {

    /* JADX INFO: renamed from: a */
    public final C0220fy f10421a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0941yx f10422b;

    /* JADX INFO: renamed from: c */
    public final go0 f10423c;

    /* JADX INFO: renamed from: d */
    public final mn0 f10424d;

    /* JADX INFO: renamed from: e */
    public final boolean f10425e;

    /* JADX INFO: renamed from: f */
    public final s73 f10426f;

    /* JADX INFO: renamed from: g */
    public final Object f10427g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f10428h = new AtomicReference(uy1.f11557j);

    /* JADX INFO: renamed from: i */
    public long f10429i = v93.m5656b();

    /* JADX INFO: renamed from: j */
    public sk1 f10430j;

    /* JADX INFO: renamed from: k */
    public final z72 f10431k;

    /* JADX INFO: renamed from: l */
    public final j62 f10432l;

    public sy1(C0220fy c0220fy, AbstractC0941yx abstractC0941yx, go0 go0Var, uk1 uk1Var, mn0 mn0Var, boolean z, s73 s73Var, Object obj) {
        this.f10421a = c0220fy;
        this.f10422b = abstractC0941yx;
        this.f10423c = go0Var;
        this.f10424d = mn0Var;
        this.f10425e = z;
        this.f10426f = s73Var;
        this.f10427g = obj;
        sk1 sk1Var = fd2.f2911a;
        sk1Var.getClass();
        this.f10430j = sk1Var;
        z72 z72Var = new z72();
        z72Var.m6395g(uk1Var, go0Var.m2004z());
        this.f10431k = z72Var;
        this.f10432l = new j62(s73Var.f9961j);
    }

    /* JADX INFO: renamed from: a */
    public final void m5019a() throws Exception {
        AtomicReference atomicReference = this.f10428h;
        try {
            switch (((uy1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    m5020b();
                    uy1 uy1Var = uy1.f11560m;
                    uy1 uy1Var2 = uy1.f11561n;
                    while (!atomicReference.compareAndSet(uy1Var, uy1Var2)) {
                        if (atomicReference.get() != uy1Var) {
                            j22.m2430b("Unexpected state change from: " + uy1Var + " to: " + uy1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new C0594pv();
            }
        } catch (Exception e) {
            atomicReference.set(uy1.f11555h);
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5020b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f10427g) {
                try {
                    this.f10432l.m2458c(this.f10426f, this.f10431k);
                    this.f10431k.m6392c();
                    this.f10431k.m6393d();
                } finally {
                    this.f10431k.m6391b();
                    this.f10421a.f3192x = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5021c() {
        return ((uy1) this.f10428h.get()).compareTo(uy1.f11560m) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m5022d() {
        uy1 uy1Var;
        uy1 uy1Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.f10428h;
            uy1Var = uy1.f11558k;
            uy1Var2 = uy1.f11560m;
            if (atomicReference.compareAndSet(uy1Var, uy1Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != uy1Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        j22.m2430b("Unexpected state change from: " + uy1Var + " to: " + uy1Var2 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public final boolean m5023e(sq2 sq2Var) throws Exception {
        uy1 uy1Var = uy1.f11559l;
        AtomicReference atomicReference = this.f10428h;
        try {
            int iOrdinal = ((uy1) atomicReference.get()).ordinal();
            uy1 uy1Var2 = uy1.f11558k;
            C0220fy c0220fy = this.f10421a;
            AbstractC0941yx abstractC0941yx = this.f10422b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    go0 go0Var = this.f10423c;
                    boolean z = this.f10425e;
                    if (z) {
                        go0Var.f3641z = 0;
                        go0Var.f3640y = true;
                    }
                    try {
                        this.f10430j = abstractC0941yx.mo1376b(c0220fy, sq2Var, this.f10424d);
                        uy1 uy1Var3 = uy1.f11557j;
                        while (true) {
                            if (!atomicReference.compareAndSet(uy1Var3, uy1Var2)) {
                                if (atomicReference.get() != uy1Var3) {
                                    j22.m2430b("Unexpected state change from: " + uy1Var3 + " to: " + uy1Var2 + '.');
                                }
                            }
                        }
                        if (this.f10430j.m4888g()) {
                            m5022d();
                        }
                        return m5021c();
                    } finally {
                        if (z) {
                            go0Var.m1997s();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(uy1Var2, uy1Var)) {
                            if (atomicReference.get() != uy1Var2) {
                                j22.m2430b("Unexpected state change from: " + uy1Var2 + " to: " + uy1Var + '.');
                            }
                        }
                    }
                    long j = this.f10429i;
                    try {
                        this.f10429i = v93.m5656b();
                        this.f10430j = abstractC0941yx.mo1388n(c0220fy, sq2Var, this.f10430j);
                        this.f10429i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(uy1Var, uy1Var2)) {
                                if (atomicReference.get() != uy1Var) {
                                    j22.m2430b("Unexpected state change from: " + uy1Var + " to: " + uy1Var2 + '.');
                                }
                            }
                        }
                        if (this.f10430j.m4888g()) {
                            m5022d();
                        }
                        return m5021c();
                    } catch (Throwable th) {
                        this.f10429i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(uy1Var, uy1Var2)) {
                                if (atomicReference.get() != uy1Var) {
                                    j22.m2430b("Unexpected state change from: " + uy1Var + " to: " + uy1Var2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    AbstractC0752tx.m5444b("Recursive call to resume()");
                    throw new C0594pv();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new C0594pv();
            }
        } catch (Exception e) {
            atomicReference.set(uy1.f11555h);
            throw e;
        }
    }
}
