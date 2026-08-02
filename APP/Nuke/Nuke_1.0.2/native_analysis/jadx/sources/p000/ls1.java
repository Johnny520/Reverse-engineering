package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ls1 implements w41 {

    /* JADX INFO: renamed from: a */
    public final j71 f6292a = AbstractC0570p7.m3746B(i91.f4497h, new hn1(this));

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        yo2 yo2VarMo168e = mo168e();
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2VarMo168e);
        int iMo901j = interfaceC0826vxMo895b.mo901j(mo168e());
        if (iMo901j != -1) {
            throw new o01(vi0.m5688g("Unexpected index ", iMo901j));
        }
        interfaceC0826vxMo895b.mo894a(yo2VarMo168e);
        return a83.f116a;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        obj.getClass();
        ve0Var.mo1177b(mo168e()).mo1176a(mo168e());
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return (yo2) this.f6292a.getValue();
    }
}
