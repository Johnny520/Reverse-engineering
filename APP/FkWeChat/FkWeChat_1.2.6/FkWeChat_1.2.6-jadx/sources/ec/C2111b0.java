package ec;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: ec.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2111b0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5912b = AtomicIntegerFieldUpdater.newUpdater(C2111b0.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f5913a;

    public /* synthetic */ C2111b0(Throwable th, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7620a() {
        return f5912b.get(this) == 1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7621c() {
        return f5912b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return AbstractC2181s0.m7898a(this) + '[' + this.f5913a + ']';
    }

    public C2111b0(Throwable th, boolean z10) {
        this.f5913a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }
}
