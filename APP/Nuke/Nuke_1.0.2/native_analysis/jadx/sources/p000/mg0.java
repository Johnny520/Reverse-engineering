package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mg0 extends og0 {

    /* JADX INFO: renamed from: j */
    public final C0469mp f6636j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ qg0 f6637k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg0(qg0 qg0Var, long j, C0469mp c0469mp) {
        super(j);
        this.f6637k = qg0Var;
        this.f6636j = c0469mp;
    }

    @Override // java.lang.Runnable
    public final void run() throws j90 {
        this.f6636j.m3142F(this.f6637k);
    }

    @Override // p000.og0
    public final String toString() {
        return super.toString() + this.f6636j;
    }
}
