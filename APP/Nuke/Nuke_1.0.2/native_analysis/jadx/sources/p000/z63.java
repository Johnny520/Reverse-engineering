package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z63 implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final z63 f13746a;
    private static final yo2 descriptor;

    static {
        z63 z63Var = new z63();
        f13746a = z63Var;
        b12 b12Var = new b12("nuke.ui.model.UIConfig.ThemeConfig", z63Var, 2);
        b12Var.m359l("accentColorHex", true);
        b12Var.m359l("recentAccentColorHexes", true);
        descriptor = b12Var;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
        j71[] j71VarArr = b73.f723c;
        String str = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
            if (iMo901j == -1) {
                z = false;
            } else if (iMo901j == 0) {
                nv2 nv2Var = nv2.f7346a;
                str = (String) interfaceC0826vxMo895b.mo4567x(yo2Var, 0, str);
                i |= 1;
            } else {
                if (iMo901j != 1) {
                    throw new e83(iMo901j);
                }
                list = (List) interfaceC0826vxMo895b.mo907t(yo2Var, 1, (w41) j71VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new b73(i, str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        return new w41[]{AbstractC0691se.m4815D(nv2.f7346a), b73.f723c[1].getValue()};
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        b73 b73Var = (b73) obj;
        b73Var.getClass();
        List list = b73Var.f725b;
        String str = b73Var.f724a;
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        j71[] j71VarArr = b73.f723c;
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || str != null) {
            nv2 nv2Var = nv2.f7346a;
            interfaceC0863wxMo1177b.mo1183h(yo2Var, 0, str);
        }
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(list, be0.f819h)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 1, (w41) j71VarArr[1].getValue(), list);
        }
        interfaceC0863wxMo1177b.mo1176a(yo2Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return descriptor;
    }
}
