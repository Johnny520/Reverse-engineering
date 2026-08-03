package Yue;

import Yue.AbstractC7276;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥۡۧۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7276<S extends AbstractC7276<S>> extends AbstractC4078<S> {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21955 = AtomicIntegerFieldUpdater.newUpdater(AbstractC7276.class, "cleanedAndPointers");

    @InterfaceC6399
    private volatile /* synthetic */ int cleanedAndPointers;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long f21956;

    public AbstractC7276(long j, @InterfaceC6489 S s, int i) {
        super(s);
        this.f21956 = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // Yue.AbstractC4078
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo11519() {
        return this.cleanedAndPointers == mo22733() && !m11521();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m22731() {
        return f21955.addAndGet(this, -65536) == mo22733() && !m11521();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final long m22732() {
        return this.f21956;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract int mo22733();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m22734() {
        if (f21955.incrementAndGet(this) != mo22733() || m11521()) {
            return;
        }
        m11524();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m22735() {
        int i;
        do {
            i = this.cleanedAndPointers;
            if (i == mo22733() && !m11521()) {
                return false;
            }
        } while (!f21955.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
