package bsh;

/* JADX INFO: renamed from: bsh.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1268v extends AbstractC1195i4 {

    /* JADX INFO: renamed from: A */
    public C1283x2[] f3835A;

    /* JADX INFO: renamed from: B */
    public Class[] f3836B;

    /* JADX INFO: renamed from: C */
    public String[] f3837C;

    /* JADX INFO: renamed from: D */
    public InterfaceC1188h3 f3838D;

    /* JADX INFO: renamed from: y */
    public String f3839y;

    /* JADX INFO: renamed from: z */
    public boolean f3840z;

    public C1268v(int i10) {
        super(i10);
        this.f3840z = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m5108k(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        if (this.f3840z) {
            return;
        }
        if (mo4050r() == 2) {
            C1244r c1244r = (C1244r) mo4051s(0);
            this.f3836B = c1244r.mo4048p(c1174f1, runnableC1205k2);
            this.f3835A = c1244r.m5065l();
            this.f3837C = c1244r.m5066o();
            this.f3838D = mo4051s(1);
        } else {
            this.f3836B = new Class[]{null};
            this.f3835A = new C1283x2[]{null};
            this.f3837C = new String[]{this.f3839y};
            this.f3838D = mo4051s(0);
        }
        this.f3840z = true;
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        m5108k(c1174f1, runnableC1205k2);
        return AbstractC1128a1.m4056d(this, c1174f1.m4319h(), this.f3835A, this.f3836B, this.f3837C, this.f3838D, runnableC1205k2);
    }
}
