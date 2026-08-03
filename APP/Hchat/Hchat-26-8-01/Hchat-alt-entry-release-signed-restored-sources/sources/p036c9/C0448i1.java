package p036c9;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: c9.i1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0448i1 implements InterfaceC0428d1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0475p0 f1313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicBoolean f1314b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0448i1(C0475p0 c0475p0, AtomicBoolean atomicBoolean) {
        this.f1313a = c0475p0;
        this.f1314b = atomicBoolean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p036c9.InterfaceC0428d1
    /* JADX INFO: renamed from: a */
    public final boolean mo1413a() {
        return !this.f1314b.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p036c9.InterfaceC0428d1
    public final void close() {
        this.f1313a.invoke();
    }
}
