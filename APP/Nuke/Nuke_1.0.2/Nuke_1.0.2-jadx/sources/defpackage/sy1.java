package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sy1 {
    public final fy a;
    public final yx b;
    public final go0 c;
    public final mn0 d;
    public final boolean e;
    public final s73 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(uy1.j);
    public long i = v93.b();
    public sk1 j;
    public final z72 k;
    public final j62 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sy1(fy fyVar, yx yxVar, go0 go0Var, uk1 uk1Var, mn0 mn0Var, boolean z, s73 s73Var, Object obj) {
        this.a = fyVar;
        this.b = yxVar;
        this.c = go0Var;
        this.d = mn0Var;
        this.e = z;
        this.f = s73Var;
        this.g = obj;
        sk1 sk1Var = fd2.a;
        sk1Var.getClass();
        this.j = sk1Var;
        z72 z72Var = new z72();
        z72Var.g(uk1Var, go0Var.z());
        this.k = z72Var;
        this.l = new j62(s73Var.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
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
                    b();
                    uy1 uy1Var = uy1.m;
                    uy1 uy1Var2 = uy1.n;
                    while (!atomicReference.compareAndSet(uy1Var, uy1Var2)) {
                        if (atomicReference.get() != uy1Var) {
                            j22.b("Unexpected state change from: " + uy1Var + " to: " + uy1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new pv();
            }
        } catch (Exception e) {
            atomicReference.set(uy1.h);
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.c(this.f, this.k);
                    this.k.c();
                    this.k.d();
                } finally {
                    this.k.b();
                    this.a.x = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        return ((uy1) this.h.get()).compareTo(uy1.m) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        uy1 uy1Var;
        uy1 uy1Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.h;
            uy1Var = uy1.k;
            uy1Var2 = uy1.m;
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
        j22.b("Unexpected state change from: " + uy1Var + " to: " + uy1Var2 + '.');
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean e(sq2 sq2Var) throws Exception {
        uy1 uy1Var = uy1.l;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((uy1) atomicReference.get()).ordinal();
            uy1 uy1Var2 = uy1.k;
            fy fyVar = this.a;
            yx yxVar = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    go0 go0Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        go0Var.z = 0;
                        go0Var.y = true;
                    }
                    try {
                        this.j = yxVar.b(fyVar, sq2Var, this.d);
                        uy1 uy1Var3 = uy1.j;
                        while (true) {
                            if (!atomicReference.compareAndSet(uy1Var3, uy1Var2)) {
                                if (atomicReference.get() != uy1Var3) {
                                    j22.b("Unexpected state change from: " + uy1Var3 + " to: " + uy1Var2 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z) {
                            go0Var.s();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(uy1Var2, uy1Var)) {
                            if (atomicReference.get() != uy1Var2) {
                                j22.b("Unexpected state change from: " + uy1Var2 + " to: " + uy1Var + '.');
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = v93.b();
                        this.j = yxVar.n(fyVar, sq2Var, this.j);
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(uy1Var, uy1Var2)) {
                                if (atomicReference.get() != uy1Var) {
                                    j22.b("Unexpected state change from: " + uy1Var + " to: " + uy1Var2 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(uy1Var, uy1Var2)) {
                                if (atomicReference.get() != uy1Var) {
                                    j22.b("Unexpected state change from: " + uy1Var + " to: " + uy1Var2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    tx.b("Recursive call to resume()");
                    throw new pv();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case AIChatConfig.DefaultContextRounds /* 6 */:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new pv();
            }
        } catch (Exception e) {
            atomicReference.set(uy1.h);
            throw e;
        }
    }
}
