package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c31 implements w41 {

    /* JADX INFO: renamed from: a */
    public static final c31 f1122a = new c31();

    /* JADX INFO: renamed from: b */
    public static final b31 f1123b = b31.f545b;

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        rg3.m4479o(y40Var);
        return new z21((List) new C0090cg(o31.f7461a).m2784j(y40Var));
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        z21 z21Var = (z21) obj;
        z21Var.getClass();
        rg3.m4477m(ve0Var);
        o31 o31Var = o31.f7461a;
        yo2 yo2VarMo168e = o31Var.mo168e();
        yo2VarMo168e.getClass();
        C0054bg c0054bg = new C0054bg(yo2VarMo168e, 0);
        int size = z21Var.size();
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(c0054bg);
        Iterator<j31> it = z21Var.iterator();
        for (int i = 0; i < size; i++) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(c0054bg, i, o31Var, it.next());
        }
        interfaceC0863wxMo1177b.mo1176a(c0054bg);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return f1123b;
    }
}
