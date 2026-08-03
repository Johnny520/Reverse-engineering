package p117i0;

import af.C0081d;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import p020b5.C0190i;
import p069f.AbstractC0959s0;
import p069f.C0945l0;
import p069f.C0949n0;
import p085fg.InterfaceC1235p;
import p266s0.AbstractC3879i;
import p339x1.C5604f2;

/* JADX INFO: renamed from: i0.l1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1853l1 {

    /* JADX INFO: renamed from: a */
    public final C1871q f6157a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1863o f6158b;

    /* JADX INFO: renamed from: c */
    public final C1836h0 f6159c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1235p f6160d;

    /* JADX INFO: renamed from: e */
    public final boolean f6161e;

    /* JADX INFO: renamed from: f */
    public final C5604f2 f6162f;

    /* JADX INFO: renamed from: g */
    public final Object f6163g;

    /* JADX INFO: renamed from: h */
    public final AtomicReference f6164h = new AtomicReference(EnumC1857m1.f6178i);

    /* JADX INFO: renamed from: i */
    public long f6165i = AbstractC3879i.m8069c();

    /* JADX INFO: renamed from: j */
    public C0945l0 f6166j;

    /* JADX INFO: renamed from: k */
    public final C0190i f6167k;

    /* JADX INFO: renamed from: l */
    public final C1900z1 f6168l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1853l1(C1871q c1871q, AbstractC1863o abstractC1863o, C1836h0 c1836h0, C0949n0 c0949n0, InterfaceC1235p interfaceC1235p, boolean z9, C5604f2 c5604f2, Object obj) {
        this.f6157a = c1871q;
        this.f6158b = abstractC1863o;
        this.f6159c = c1836h0;
        this.f6160d = interfaceC1235p;
        this.f6161e = z9;
        this.f6162f = c5604f2;
        this.f6163g = obj;
        C0945l0 c0945l0 = AbstractC0959s0.f3019a;
        c0945l0.getClass();
        this.f6166j = c0945l0;
        C0190i c0190i = new C0190i();
        c0190i.m846i(c0949n0, c1836h0.m4501C());
        this.f6167k = c0190i;
        this.f6168l = new C1900z1(c5604f2.f22814i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4568a() throws Exception {
        AtomicReference atomicReference = this.f6164h;
        try {
            switch (((EnumC1857m1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    m4569b();
                    EnumC1857m1 enumC1857m1 = EnumC1857m1.f6181l;
                    EnumC1857m1 enumC1857m12 = EnumC1857m1.f6182m;
                    while (!atomicReference.compareAndSet(enumC1857m1, enumC1857m12)) {
                        if (atomicReference.get() != enumC1857m1) {
                            AbstractC1861n1.m4584b("Unexpected state change from: " + enumC1857m1 + " to: " + enumC1857m12 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new C0081d();
            }
        } catch (Exception e6) {
            atomicReference.set(EnumC1857m1.f6176g);
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4569b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f6163g) {
                try {
                    this.f6168l.m4672a(this.f6162f, this.f6167k);
                    this.f6167k.m841c();
                    this.f6167k.m842d();
                } finally {
                    this.f6167k.m840b();
                    this.f6157a.f6218w = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m4570c() {
        return ((EnumC1857m1) this.f6164h.get()).compareTo(EnumC1857m1.f6181l) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4571d() {
        EnumC1857m1 enumC1857m1;
        EnumC1857m1 enumC1857m12;
        boolean z9;
        while (true) {
            AtomicReference atomicReference = this.f6164h;
            enumC1857m1 = EnumC1857m1.f6179j;
            enumC1857m12 = EnumC1857m1.f6181l;
            if (atomicReference.compareAndSet(enumC1857m1, enumC1857m12)) {
                z9 = true;
                break;
            } else if (atomicReference.get() != enumC1857m1) {
                z9 = false;
                break;
            }
        }
        if (z9) {
            return;
        }
        AbstractC1861n1.m4584b("Unexpected state change from: " + enumC1857m1 + " to: " + enumC1857m12 + '.');
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public final boolean m4572e(InterfaceC1826e2 interfaceC1826e2) throws Exception {
        EnumC1857m1 enumC1857m1 = EnumC1857m1.f6180k;
        AtomicReference atomicReference = this.f6164h;
        try {
            int iOrdinal = ((EnumC1857m1) atomicReference.get()).ordinal();
            EnumC1857m1 enumC1857m12 = EnumC1857m1.f6179j;
            C1871q c1871q = this.f6157a;
            AbstractC1863o abstractC1863o = this.f6158b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    C1836h0 c1836h0 = this.f6159c;
                    boolean z9 = this.f6161e;
                    if (z9) {
                        c1836h0.f6122z = 0;
                        c1836h0.f6121y = true;
                    }
                    try {
                        this.f6166j = abstractC1863o.mo4462b(c1871q, interfaceC1826e2, this.f6160d);
                        EnumC1857m1 enumC1857m13 = EnumC1857m1.f6178i;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC1857m13, enumC1857m12)) {
                                if (atomicReference.get() != enumC1857m13) {
                                    AbstractC1861n1.m4584b("Unexpected state change from: " + enumC1857m13 + " to: " + enumC1857m12 + '.');
                                }
                            }
                        }
                        if (this.f6166j.m2334g()) {
                            m4571d();
                        }
                        return m4570c();
                    } finally {
                        if (z9) {
                            c1836h0.m4558u();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(enumC1857m12, enumC1857m1)) {
                            if (atomicReference.get() != enumC1857m12) {
                                AbstractC1861n1.m4584b("Unexpected state change from: " + enumC1857m12 + " to: " + enumC1857m1 + '.');
                            }
                        }
                    }
                    long j3 = this.f6165i;
                    try {
                        this.f6165i = AbstractC3879i.m8069c();
                        this.f6166j = abstractC1863o.mo4474n(c1871q, interfaceC1826e2, this.f6166j);
                        this.f6165i = j3;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC1857m1, enumC1857m12)) {
                                if (atomicReference.get() != enumC1857m1) {
                                    AbstractC1861n1.m4584b("Unexpected state change from: " + enumC1857m1 + " to: " + enumC1857m12 + '.');
                                }
                            }
                        }
                        if (this.f6166j.m2334g()) {
                            m4571d();
                        }
                        return m4570c();
                    } catch (Throwable th2) {
                        this.f6165i = j3;
                        while (true) {
                            if (!atomicReference.compareAndSet(enumC1857m1, enumC1857m12)) {
                                if (atomicReference.get() != enumC1857m1) {
                                    AbstractC1861n1.m4584b("Unexpected state change from: " + enumC1857m1 + " to: " + enumC1857m12 + '.');
                                }
                            }
                        }
                        throw th2;
                    }
                case 4:
                    AbstractC1855m.m4574b("Recursive call to resume()");
                    throw new C0081d();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new C0081d();
            }
        } catch (Exception e6) {
            atomicReference.set(EnumC1857m1.f6176g);
            throw e6;
        }
    }
}
