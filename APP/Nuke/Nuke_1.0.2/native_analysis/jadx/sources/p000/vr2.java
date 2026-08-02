package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vr2 {

    /* JADX INFO: renamed from: a */
    public bs2 f12146a;

    /* JADX INFO: renamed from: b */
    public long f12147b;

    /* JADX INFO: renamed from: c */
    public boolean f12148c;

    /* JADX INFO: renamed from: d */
    public int f12149d;

    public vr2(long j, bs2 bs2Var) {
        int iM6502a;
        int iNumberOfTrailingZeros;
        this.f12146a = bs2Var;
        this.f12147b = j;
        ml2 ml2Var = ds2.f2179a;
        if (j != 0) {
            bs2 bs2VarMo76d = mo76d();
            long j2 = bs2VarMo76d.f1006j;
            long[] jArr = bs2VarMo76d.f1007k;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = bs2VarMo76d.f1005i;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = bs2VarMo76d.f1004h;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (ds2.f2181c) {
                iM6502a = ds2.f2184f.m6502a(j);
            }
        } else {
            iM6502a = -1;
        }
        this.f12149d = iM6502a;
    }

    /* JADX INFO: renamed from: q */
    public static void m5784q(vr2 vr2Var) {
        ds2.f2180b.m410A(vr2Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m5785a() {
        synchronized (ds2.f2181c) {
            mo5786b();
            mo5789p();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo5786b() {
        ds2.f2182d = ds2.f2182d.m585b(mo79g());
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo75c();

    /* JADX INFO: renamed from: d */
    public bs2 mo76d() {
        return this.f12146a;
    }

    /* JADX INFO: renamed from: e */
    public abstract in0 mo77e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo78f();

    /* JADX INFO: renamed from: g */
    public long mo79g() {
        return this.f12147b;
    }

    /* JADX INFO: renamed from: h */
    public int mo80h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract in0 mo81i();

    /* JADX INFO: renamed from: j */
    public final vr2 m5787j() {
        C0043b5 c0043b5 = ds2.f2180b;
        vr2 vr2Var = (vr2) c0043b5.m429p();
        c0043b5.m410A(this);
        return vr2Var;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo82k();

    /* JADX INFO: renamed from: l */
    public abstract void mo83l();

    /* JADX INFO: renamed from: m */
    public abstract void mo84m();

    /* JADX INFO: renamed from: n */
    public abstract void mo85n(pu2 pu2Var);

    /* JADX INFO: renamed from: o */
    public final void m5788o() {
        int i = this.f12149d;
        if (i >= 0) {
            ds2.m1137u(i);
            this.f12149d = -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo5789p() {
        m5788o();
    }

    /* JADX INFO: renamed from: r */
    public void mo86r(bs2 bs2Var) {
        this.f12146a = bs2Var;
    }

    /* JADX INFO: renamed from: s */
    public void mo87s(long j) {
        this.f12147b = j;
    }

    /* JADX INFO: renamed from: t */
    public void mo88t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: u */
    public abstract vr2 mo89u(in0 in0Var);
}
