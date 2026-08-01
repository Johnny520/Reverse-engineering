package p000;

/* JADX INFO: renamed from: jj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0357jj extends C0834vb {

    /* JADX INFO: renamed from: s */
    public final EnumC0758tb f2899s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0357jj(int i, EnumC0758tb enumC0758tb) {
        super(i);
        this.f2899s = enumC0758tb;
        if (enumC0758tb == EnumC0758tb.f5968d) {
            C0921xc.m5127h("This implementation does not support suspension for senders, use ", au0.m211a(C0834vb.class).m1694b(), " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        C0921xc.m5126g("Buffered channel capacity must be at least 1, but ", i, " was specified");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public final Object m1708M(Object obj, boolean z) {
        if (this.f2899s != EnumC0758tb.f5970f) {
            return m4451I(obj);
        }
        Object objMo1710s = super.mo1710s(obj);
        return (!(objMo1710s instanceof C0836vd) || (objMo1710s instanceof C0799ud)) ? objMo1710s : na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.C0834vb, p000.n01
    /* JADX INFO: renamed from: c */
    public final Object mo1709c(InterfaceC0322ik interfaceC0322ik, Object obj) throws Throwable {
        if (m1708M(obj, true) instanceof C0799ud) {
            throw m4467t();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.C0834vb, p000.n01
    /* JADX INFO: renamed from: s */
    public final Object mo1710s(Object obj) {
        return m1708M(obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.C0834vb
    /* JADX INFO: renamed from: z */
    public final boolean mo1711z() {
        return this.f2899s == EnumC0758tb.f5969e;
    }
}
