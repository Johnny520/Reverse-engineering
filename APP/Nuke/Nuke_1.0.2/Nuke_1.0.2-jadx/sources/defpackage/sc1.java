package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sc1 implements d92, th0 {
    public static final b5 l = s11.o0(20, new j51(2));
    public final su2 h = new su2();
    public d92 i;
    public boolean j;
    public boolean k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void a() {
        this.h.a();
        if (!this.j) {
            throw new IllegalStateException("Already unlocked");
        }
        this.j = false;
        if (this.k) {
            e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final int b() {
        return this.i.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th0
    public final su2 c() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final Class d() {
        return this.i.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final synchronized void e() {
        this.h.a();
        this.k = true;
        if (!this.j) {
            this.i.e();
            this.i = null;
            l.a(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d92
    public final Object get() {
        return this.i.get();
    }
}
