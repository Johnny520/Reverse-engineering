package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: au */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0031au extends AbstractC0409l2 {

    /* JADX INFO: renamed from: a */
    public final w41 f387a;

    public AbstractC0031au(w41 w41Var) {
        this.f387a = w41Var;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public void mo167d(ve0 ve0Var, Object obj) {
        int iMo572i = mo572i(obj);
        yo2 yo2VarMo168e = mo168e();
        yo2VarMo168e.getClass();
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2VarMo168e);
        Iterator itMo773h = mo773h(obj);
        for (int i = 0; i < iMo572i; i++) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(mo168e(), i, this.f387a, itMo773h.next());
        }
        interfaceC0863wxMo1177b.mo1176a(yo2VarMo168e);
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: k */
    public void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj) {
        mo279n(i, obj, interfaceC0826vx.mo907t(mo168e(), i, this.f387a, null));
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo279n(int i, Object obj, Object obj2);
}
