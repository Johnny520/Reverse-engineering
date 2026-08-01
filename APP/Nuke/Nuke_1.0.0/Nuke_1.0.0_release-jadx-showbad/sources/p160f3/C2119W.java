package p160f3;

import p074O2.InterfaceC1046d;

/* JADX INFO: renamed from: f3.W */
/* JADX INFO: loaded from: classes.dex */
public final class C2119W extends C2135g {

    /* JADX INFO: renamed from: l */
    public final C2145l f7053l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2119W(InterfaceC1046d interfaceC1046d, C2145l c2145l) {
        super(1, interfaceC1046d);
        this.f7053l = c2145l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.C2135g
    /* JADX INFO: renamed from: A */
    public final String mo3914A() {
        return "AwaitContinuation";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.C2135g
    /* JADX INFO: renamed from: q */
    public final Throwable mo3915q(C2122Z c2122z) {
        Throwable thM3917c;
        C2145l c2145l = this.f7053l;
        c2145l.getClass();
        Object obj = C2122Z.f7062d.get(c2145l);
        return (!(obj instanceof C2121Y) || (thM3917c = ((C2121Y) obj).m3917c()) == null) ? obj instanceof C2149n ? ((C2149n) obj).f7092a : c2122z.mo3907n() : thM3917c;
    }
}
