package p000;

import java.util.List;

/* JADX INFO: renamed from: ar */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0028ar implements qo0 {

    /* JADX INFO: renamed from: a */
    public static final C0028ar f340a;
    private static final yo2 descriptor;

    static {
        C0028ar c0028ar = new C0028ar();
        f340a = c0028ar;
        b12 b12Var = new b12("nuke.module.wechat.item.chat.ChatAutoReply.ChatAutoReplyConf", c0028ar, 1);
        b12Var.m359l("tasks", true);
        descriptor = b12Var;
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        yo2 yo2Var = descriptor;
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(yo2Var);
        j71[] j71VarArr = C0103cr.f1691b;
        List list = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(yo2Var);
            if (iMo901j == -1) {
                z = false;
            } else {
                if (iMo901j != 0) {
                    throw new e83(iMo901j);
                }
                list = (List) interfaceC0826vxMo895b.mo907t(yo2Var, 0, (w41) j71VarArr[0].getValue(), list);
                i = 1;
            }
        }
        interfaceC0826vxMo895b.mo894a(yo2Var);
        return new C0103cr(i, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.qo0
    /* JADX INFO: renamed from: b */
    public final w41[] mo166b() {
        return new w41[]{C0103cr.f1691b[0].getValue()};
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        C0103cr c0103cr = (C0103cr) obj;
        c0103cr.getClass();
        List list = c0103cr.f1692a;
        yo2 yo2Var = descriptor;
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(yo2Var);
        j71[] j71VarArr = C0103cr.f1691b;
        if (interfaceC0863wxMo1177b.mo1179d(yo2Var) || !t11.m5086l(list, be0.f819h)) {
            ((dv2) interfaceC0863wxMo1177b).m1198w(yo2Var, 0, (w41) j71VarArr[0].getValue(), list);
        }
        interfaceC0863wxMo1177b.mo1176a(yo2Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return descriptor;
    }
}
