package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class kj0 {

    /* JADX INFO: renamed from: a */
    public oe0 f3176a;

    /* JADX INFO: renamed from: b */
    public int f3177b;

    /* JADX INFO: renamed from: c */
    public sh0 f3178c;

    /* JADX INFO: renamed from: d */
    public sh0 f3179d;

    /* JADX INFO: renamed from: e */
    public boolean f3180e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mj0 f3181f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kj0(mj0 mj0Var, oe0 oe0Var, int i, sh0 sh0Var, sh0 sh0Var2, boolean z) {
        this.f3181f = mj0Var;
        this.f3176a = oe0Var;
        this.f3177b = i;
        this.f3178c = sh0Var;
        this.f3179d = sh0Var2;
        this.f3180e = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m1909a(int i, int i2) {
        sh0 sh0Var = this.f3178c;
        int i3 = this.f3177b;
        ne0 ne0Var = (ne0) sh0Var.f5768d[i + i3];
        ne0 ne0Var2 = (ne0) this.f3179d.f5768d[i3 + i2];
        return p30.m3002l(ne0Var, ne0Var2) || ne0Var.getClass() == ne0Var2.getClass();
    }
}
