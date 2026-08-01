package p000;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class yp0 {

    /* JADX INFO: renamed from: a */
    public final C0964yi f7674a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0727si f7675b;

    /* JADX INFO: renamed from: c */
    public final C0616pi f7676c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0904ww f7677d;

    /* JADX INFO: renamed from: e */
    public final boolean f7678e;

    /* JADX INFO: renamed from: f */
    public final ja1 f7679f;

    /* JADX INFO: renamed from: g */
    public final Object f7680g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f7681h = new AtomicReference(aq0.f237f);

    /* JADX INFO: renamed from: i */
    public long f7682i = u50.m4266g();

    /* JADX INFO: renamed from: j */
    public kh0 f7683j;

    /* JADX INFO: renamed from: k */
    public final iu0 f7684k;

    /* JADX INFO: renamed from: l */
    public final pt0 f7685l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yp0(C0964yi c0964yi, AbstractC0727si abstractC0727si, C0616pi c0616pi, mh0 mh0Var, InterfaceC0904ww interfaceC0904ww, boolean z, ja1 ja1Var, Object obj) {
        this.f7674a = c0964yi;
        this.f7675b = abstractC0727si;
        this.f7676c = c0616pi;
        this.f7677d = interfaceC0904ww;
        this.f7678e = z;
        this.f7679f = ja1Var;
        this.f7680g = obj;
        kh0 kh0Var = ey0.f1546a;
        kh0Var.getClass();
        this.f7683j = kh0Var;
        iu0 iu0Var = new iu0();
        iu0Var.m1603g(mh0Var, c0616pi.m3129z());
        this.f7684k = iu0Var;
        this.f7685l = new pt0(ja1Var.f2781c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5287a() throws Exception {
        AtomicReference atomicReference = this.f7681h;
        try {
            switch (((aq0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    m5288b();
                    aq0 aq0Var = aq0.f240i;
                    aq0 aq0Var2 = aq0.f241j;
                    while (!atomicReference.compareAndSet(aq0Var, aq0Var2)) {
                        if (atomicReference.get() != aq0Var) {
                            wr0.m5025b("Unexpected state change from: " + aq0Var + " to: " + aq0Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new C0725sg();
            }
        } catch (Exception e) {
            atomicReference.set(aq0.f235d);
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5288b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f7680g) {
                try {
                    this.f7685l.m3159k(this.f7679f, this.f7684k);
                    this.f7684k.m1600c();
                    this.f7684k.m1601d();
                } finally {
                    this.f7684k.m1599b();
                    this.f7674a.f7641t = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m5289c() {
        return ((aq0) this.f7681h.get()).compareTo(aq0.f240i) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5290d() {
        aq0 aq0Var;
        aq0 aq0Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.f7681h;
            aq0Var = aq0.f238g;
            aq0Var2 = aq0.f240i;
            if (atomicReference.compareAndSet(aq0Var, aq0Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != aq0Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        wr0.m5025b("Unexpected state change from: " + aq0Var + " to: " + aq0Var2 + '.');
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public final boolean m5291e(j11 j11Var) throws Exception {
        aq0 aq0Var = aq0.f239h;
        AtomicReference atomicReference = this.f7681h;
        try {
            int iOrdinal = ((aq0) atomicReference.get()).ordinal();
            aq0 aq0Var2 = aq0.f238g;
            C0964yi c0964yi = this.f7674a;
            AbstractC0727si abstractC0727si = this.f7675b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    C0616pi c0616pi = this.f7676c;
                    boolean z = this.f7678e;
                    if (z) {
                        c0616pi.f4905z = 100;
                        c0616pi.f4904y = true;
                    }
                    try {
                        this.f7683j = abstractC0727si.mo2709b(c0964yi, j11Var, this.f7677d);
                        aq0 aq0Var3 = aq0.f237f;
                        while (true) {
                            if (!atomicReference.compareAndSet(aq0Var3, aq0Var2)) {
                                if (atomicReference.get() != aq0Var3) {
                                    wr0.m5025b("Unexpected state change from: " + aq0Var3 + " to: " + aq0Var2 + '.');
                                }
                            }
                        }
                        if (this.f7683j.m1896g()) {
                            m5290d();
                        }
                        return m5289c();
                    } finally {
                        if (z) {
                            c0616pi.m3122s();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(aq0Var2, aq0Var)) {
                            if (atomicReference.get() != aq0Var2) {
                                wr0.m5025b("Unexpected state change from: " + aq0Var2 + " to: " + aq0Var + '.');
                            }
                        }
                    }
                    long j = this.f7682i;
                    try {
                        this.f7682i = u50.m4266g();
                        this.f7683j = abstractC0727si.mo2721n(c0964yi, j11Var, this.f7683j);
                        this.f7682i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(aq0Var, aq0Var2)) {
                                if (atomicReference.get() != aq0Var) {
                                    wr0.m5025b("Unexpected state change from: " + aq0Var + " to: " + aq0Var2 + '.');
                                }
                            }
                        }
                        if (this.f7683j.m1896g()) {
                            m5290d();
                        }
                        return m5289c();
                    } catch (Throwable th) {
                        this.f7682i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(aq0Var, aq0Var2)) {
                                if (atomicReference.get() != aq0Var) {
                                    wr0.m5025b("Unexpected state change from: " + aq0Var + " to: " + aq0Var2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    AbstractC0653qi.m3253b("Recursive call to resume()");
                    throw new C0725sg();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new C0725sg();
            }
        } catch (Exception e) {
            atomicReference.set(aq0.f235d);
            throw e;
        }
    }
}
