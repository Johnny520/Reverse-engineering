package p095T;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import me.dartcv.nuke.BuildConfig;
import p027E4.C0330q;
import p029F0.C0363A;
import p041H0.C0560F0;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p136b0.C1849k;
import p186k.AbstractC2416M;
import p186k.C2409F;
import p186k.C2411H;

/* JADX INFO: renamed from: T.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1370k0 {

    /* JADX INFO: renamed from: a */
    public final C1397y f4821a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1391v f4822b;

    /* JADX INFO: renamed from: c */
    public final C1383r f4823c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1603e f4824d;

    /* JADX INFO: renamed from: e */
    public final boolean f4825e;

    /* JADX INFO: renamed from: f */
    public final C0560F0 f4826f;

    /* JADX INFO: renamed from: g */
    public final Object f4827g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f4828h = new AtomicReference(EnumC1372l0.f4836f);

    /* JADX INFO: renamed from: i */
    public long f4829i = AbstractC1848j.m3313b();

    /* JADX INFO: renamed from: j */
    public C2409F f4830j;

    /* JADX INFO: renamed from: k */
    public final C1849k f4831k;

    /* JADX INFO: renamed from: l */
    public final C1302A0 f4832l;

    public C1370k0(C1397y c1397y, AbstractC1391v abstractC1391v, C1383r c1383r, C2411H c2411h, InterfaceC1603e interfaceC1603e, boolean z5, C0560F0 c0560f0, Object obj) {
        this.f4821a = c1397y;
        this.f4822b = abstractC1391v;
        this.f4823c = c1383r;
        this.f4824d = interfaceC1603e;
        this.f4825e = z5;
        this.f4826f = c0560f0;
        this.f4827g = obj;
        C2409F c2409f = AbstractC2416M.f7817a;
        AbstractC1665j.m2983c(c2409f, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.f4830j = c2409f;
        C1849k c1849k = new C1849k();
        c1849k.m3322g(c2411h, c1383r.m2607z());
        this.f4831k = c1849k;
        this.f4832l = new C1302A0(c0560f0.f1681f);
    }

    /* JADX INFO: renamed from: a */
    public final void m2513a() throws Exception {
        AtomicReference atomicReference = this.f4828h;
        try {
            switch (((EnumC1372l0) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case BuildConfig.VERSION_CODE /* 1 */:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    m2514b();
                    EnumC1372l0 enumC1372l0 = EnumC1372l0.f4839i;
                    EnumC1372l0 enumC1372l02 = EnumC1372l0.f4840j;
                    while (!atomicReference.compareAndSet(enumC1372l0, enumC1372l02)) {
                        if (atomicReference.get() != enumC1372l0) {
                            AbstractC1380p0.m2543b("Unexpected state change from: " + enumC1372l0 + " to: " + enumC1372l02 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new C0330q();
            }
        } catch (Exception e5) {
            atomicReference.set(EnumC1372l0.f4834d);
            throw e5;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2514b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f4827g) {
                try {
                    this.f4832l.m2397a(this.f4826f, this.f4831k);
                    this.f4831k.m3319c();
                    this.f4831k.m3320d();
                } finally {
                    this.f4831k.m3318b();
                    this.f4821a.f4971t = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2515c() {
        return ((EnumC1372l0) this.f4828h.get()).compareTo(EnumC1372l0.f4839i) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m2516d() {
        EnumC1372l0 enumC1372l0;
        EnumC1372l0 enumC1372l02;
        boolean z5;
        while (true) {
            AtomicReference atomicReference = this.f4828h;
            enumC1372l0 = EnumC1372l0.f4837g;
            enumC1372l02 = EnumC1372l0.f4839i;
            if (atomicReference.compareAndSet(enumC1372l0, enumC1372l02)) {
                z5 = true;
                break;
            } else if (atomicReference.get() != enumC1372l0) {
                z5 = false;
                break;
            }
        }
        if (z5) {
            return;
        }
        AbstractC1380p0.m2543b("Unexpected state change from: " + enumC1372l0 + " to: " + enumC1372l02 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public final boolean m2517e(C0363A c0363a) throws Exception {
        EnumC1372l0 enumC1372l0 = EnumC1372l0.f4838h;
        AtomicReference atomicReference = this.f4828h;
        try {
            int iOrdinal = ((EnumC1372l0) atomicReference.get()).ordinal();
            EnumC1372l0 enumC1372l02 = EnumC1372l0.f4837g;
            C1397y c1397y = this.f4821a;
            AbstractC1391v abstractC1391v = this.f4822b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case BuildConfig.VERSION_CODE /* 1 */:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    C1383r c1383r = this.f4823c;
                    boolean z5 = this.f4825e;
                    if (z5) {
                        c1383r.f4909z = 0;
                        c1383r.f4908y = true;
                    }
                    try {
                        this.f4830j = abstractC1391v.mo2520b(c1397y, c0363a, this.f4824d);
                        EnumC1372l0 enumC1372l03 = EnumC1372l0.f4836f;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC1372l03, enumC1372l02)) {
                                if (atomicReference.get() != enumC1372l03) {
                                    AbstractC1380p0.m2543b("Unexpected state change from: " + enumC1372l03 + " to: " + enumC1372l02 + '.');
                                }
                            }
                        }
                        if (this.f4830j.m4285g()) {
                            m2516d();
                        }
                        return m2515c();
                    } finally {
                        if (z5) {
                            c1383r.m2600s();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(enumC1372l02, enumC1372l0)) {
                            if (atomicReference.get() != enumC1372l02) {
                                AbstractC1380p0.m2543b("Unexpected state change from: " + enumC1372l02 + " to: " + enumC1372l0 + '.');
                            }
                        }
                    }
                    long j5 = this.f4829i;
                    try {
                        this.f4829i = AbstractC1848j.m3313b();
                        this.f4830j = abstractC1391v.mo2532n(c1397y, c0363a, this.f4830j);
                        this.f4829i = j5;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC1372l0, enumC1372l02)) {
                                if (atomicReference.get() != enumC1372l0) {
                                    AbstractC1380p0.m2543b("Unexpected state change from: " + enumC1372l0 + " to: " + enumC1372l02 + '.');
                                }
                            }
                        }
                        if (this.f4830j.m4285g()) {
                            m2516d();
                        }
                        return m2515c();
                    } catch (Throwable th) {
                        this.f4829i = j5;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC1372l0, enumC1372l02)) {
                                if (atomicReference.get() != enumC1372l0) {
                                    AbstractC1380p0.m2543b("Unexpected state change from: " + enumC1372l0 + " to: " + enumC1372l02 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    AbstractC1387t.m2639b("Recursive call to resume()");
                    throw new C0330q();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new C0330q();
            }
        } catch (Exception e5) {
            atomicReference.set(EnumC1372l0.f4834d);
            throw e5;
        }
    }
}
