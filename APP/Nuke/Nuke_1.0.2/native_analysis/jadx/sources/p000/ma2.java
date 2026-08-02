package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ma2 extends AbstractC0679s2 {

    /* JADX INFO: renamed from: j */
    public int f6530j;

    /* JADX INFO: renamed from: k */
    public int f6531k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ na2 f6532l;

    public ma2(na2 na2Var) {
        this.f6532l = na2Var;
        this.f6530j = na2Var.f7089k;
        this.f6531k = na2Var.f7088j;
    }

    @Override // p000.AbstractC0679s2
    /* JADX INFO: renamed from: a */
    public final void mo2473a() {
        int i = this.f6530j;
        if (i == 0) {
            this.f9875h = 2;
            return;
        }
        na2 na2Var = this.f6532l;
        Object[] objArr = na2Var.f7086h;
        int i2 = this.f6531k;
        this.f9876i = objArr[i2];
        this.f9875h = 1;
        this.f6531k = (i2 + 1) % na2Var.f7087i;
        this.f6530j = i - 1;
    }
}
