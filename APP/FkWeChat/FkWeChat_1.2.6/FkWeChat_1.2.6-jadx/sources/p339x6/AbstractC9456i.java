package p339x6;

import ec.InterfaceC2156m;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p172l8.AbstractC4713t;
import p172l8.C4712s;

/* JADX INFO: renamed from: x6.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9456i implements InterfaceC9455h {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32144s = AtomicIntegerFieldUpdater.newUpdater(AbstractC9456i.class, "_interestedOps");

    /* JADX INFO: renamed from: q */
    public final AtomicBoolean f32145q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r */
    public final C9451d f32146r = new C9451d();
    private volatile /* synthetic */ int _interestedOps = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32145q.compareAndSet(false, true)) {
            this._interestedOps = 0;
            C9451d c9451dMo36858y = mo36858y();
            for (EnumC9454g enumC9454g : EnumC9454g.f32134r.m36854a()) {
                InterfaceC2156m interfaceC2156mM36824h = c9451dMo36858y.m36824h(enumC9454g);
                if (interfaceC2156mM36824h != null) {
                    C4712s.a aVar = C4712s.f13928r;
                    interfaceC2156mM36824h.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(new C9449b())));
                }
            }
        }
    }

    @Override // p339x6.InterfaceC9455h
    /* JADX INFO: renamed from: g0 */
    public int mo36856g0() {
        return this._interestedOps;
    }

    @Override // p339x6.InterfaceC9455h
    public boolean isClosed() {
        return this.f32145q.get();
    }

    @Override // p339x6.InterfaceC9455h
    /* JADX INFO: renamed from: m0 */
    public void mo36857m0(EnumC9454g enumC9454g, boolean z10) {
        int i10;
        enumC9454g.getClass();
        int iM36853i = enumC9454g.m36853i();
        do {
            i10 = this._interestedOps;
        } while (!f32144s.compareAndSet(this, i10, z10 ? i10 | iM36853i : (~iM36853i) & i10));
    }

    @Override // p339x6.InterfaceC9455h
    /* JADX INFO: renamed from: y */
    public C9451d mo36858y() {
        return this.f32146r;
    }
}
