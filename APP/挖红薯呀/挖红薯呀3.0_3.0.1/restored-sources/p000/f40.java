package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f40 extends hb0 implements InterfaceC0622po, y00 {

    /* JADX INFO: renamed from: j */
    public j40 f1576j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0622po
    /* JADX INFO: renamed from: a */
    public final void mo623a() {
        m1029q().m1633b0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.y00
    /* JADX INFO: renamed from: b */
    public final boolean mo599b() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.y00
    /* JADX INFO: renamed from: d */
    public final sj0 mo600d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c40 getParent() {
        return m1029q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final j40 m1029q() {
        j40 j40Var = this.f1576j;
        if (j40Var != null) {
            return j40Var;
        }
        p30.m2986V("job");
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo18r();

    /* JADX INFO: renamed from: s */
    public abstract void mo19s(Throwable th);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.hb0
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0398kl.m1927m(this) + "[job@" + AbstractC0398kl.m1927m(m1029q()) + ']';
    }
}
