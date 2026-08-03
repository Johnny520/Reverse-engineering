package vg;

import bsh.org.objectweb.asm.Opcodes;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p249qg.InterfaceC3557d1;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: vg.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4568q extends AbstractC4553b implements InterfaceC3557d1 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15052d = AtomicIntegerFieldUpdater.newUpdater(AbstractC4568q.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    public final long f15053c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4568q(long j3, AbstractC4568q abstractC4568q, int i9) {
        super(abstractC4568q);
        this.f15053c = j3;
        this.cleanedAndPointers$volatile = i9 << 16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // vg.AbstractC4553b
    /* JADX INFO: renamed from: c */
    public final boolean mo8996c() {
        return f15052d.get(this) == mo8219f() && m8995b() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m9014e() {
        return f15052d.addAndGet(this, Opcodes.V_PREVIEW_EXPERIMENTAL) == mo8219f() && m8995b() != null;
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo8219f();

    /* JADX INFO: renamed from: g */
    public abstract void mo8220g(int i9, InterfaceC5561g interfaceC5561g);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m9015h() {
        if (f15052d.incrementAndGet(this) == mo8219f()) {
            m8997d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m9016i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = f15052d;
            i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 == mo8219f() && m8995b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 65536 + i9));
        return true;
    }
}
