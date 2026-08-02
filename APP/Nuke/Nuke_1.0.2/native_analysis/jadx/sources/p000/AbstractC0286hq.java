package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: hq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0286hq implements zj0 {

    /* JADX INFO: renamed from: h */
    public final a20 f4106h;

    /* JADX INFO: renamed from: i */
    public final int f4107i;

    /* JADX INFO: renamed from: j */
    public final EnumC0283hn f4108j;

    public AbstractC0286hq(a20 a20Var, int i, EnumC0283hn enumC0283hn) {
        this.f4106h = a20Var;
        this.f4107i = i;
        this.f4108j = enumC0283hn;
    }

    @Override // p000.zj0
    /* JADX INFO: renamed from: a */
    public Object mo1660a(ak0 ak0Var, t00 t00Var) {
        Object objM5238u = AbstractC0731te.m5238u(new C0040b2(ak0Var, this, (t00) null, 4), t00Var);
        return objM5238u == k20.f5323h ? objM5238u : a83.f116a;
    }

    /* JADX INFO: renamed from: b */
    public String mo2014b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo2015c(o32 o32Var, t00 t00Var);

    /* JADX INFO: renamed from: d */
    public abstract AbstractC0286hq mo2016d(a20 a20Var, int i, EnumC0283hn enumC0283hn);

    /* JADX INFO: renamed from: e */
    public zj0 mo2017e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0212fq mo2018f(j20 j20Var) {
        int i = this.f4107i;
        if (i == -3) {
            i = -2;
        }
        mn0 c0003a2 = new C0003a2(this, null, 8);
        o32 o32Var = new o32(rg3.m4454H(j20Var, this.f4106h), fg1.m1630a(i, 4, this.f4108j));
        o32Var.m3680i0(m20.f6442j, o32Var, c0003a2);
        return o32Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo2014b = mo2014b();
        if (strMo2014b != null) {
            arrayList.add(strMo2014b);
        }
        zd0 zd0Var = zd0.f13837h;
        a20 a20Var = this.f4106h;
        if (a20Var != zd0Var) {
            arrayList.add("context=" + a20Var);
        }
        int i = this.f4107i;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        EnumC0283hn enumC0283hn = EnumC0283hn.f4084h;
        EnumC0283hn enumC0283hn2 = this.f4108j;
        if (enumC0283hn2 != enumC0283hn) {
            arrayList.add("onBufferOverflow=" + enumC0283hn2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return hk1.m2210i(sb, AbstractC0142du.m1165u0(arrayList, ", ", null, null, null, 62), ']');
    }
}
