package p190k3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p074O2.InterfaceC1051i;
import p160f3.InterfaceC2132e0;

/* JADX INFO: renamed from: k3.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2470r extends AbstractC2454b implements InterfaceC2132e0 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7957d = AtomicIntegerFieldUpdater.newUpdater(AbstractC2470r.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    public final long f7958c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC2470r(long j5, AbstractC2470r abstractC2470r, int i5) {
        super(abstractC2470r);
        this.f7958c = j5;
        this.cleanedAndPointers$volatile = i5 << 16;
    }

    @Override // p190k3.AbstractC2454b
    /* JADX INFO: renamed from: c */
    public final boolean mo4387c() {
        return f7957d.get(this) == mo4102f() && m4386b() != null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4405e() {
        return f7957d.addAndGet(this, -65536) == mo4102f() && m4386b() != null;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo4102f();

    /* JADX INFO: renamed from: g */
    public abstract void mo4103g(int i5, InterfaceC1051i interfaceC1051i);

    /* JADX INFO: renamed from: h */
    public final void m4406h() {
        if (f7957d.incrementAndGet(this) == mo4102f()) {
            m4388d();
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4407i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f7957d;
            i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 == mo4102f() && m4386b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 65536 + i5));
        return true;
    }
}
