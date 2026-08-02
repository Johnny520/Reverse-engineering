package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hq1 implements uk2, sq2 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4109h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f4110i;

    public /* synthetic */ hq1(Object obj, Object obj2) {
        this.f4109h = obj;
        this.f4110i = obj2;
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: a */
    public boolean mo683a() {
        p22 p22Var = (p22) this.f4109h;
        C0774ui c0774ui = (C0774ui) this.f4110i;
        if (!p22Var.f7952x) {
            p22Var.m3687h();
            c0774ui.f11317a = C0774ui.m5506a(p22Var.f7950v, c0774ui.f11317a);
            p22Var.f7952x = !p22Var.m3686g(p22Var.f7949u, r1 + c0774ui.f11318b);
        }
        return p22Var.f7952x;
    }

    @Override // p000.uk2
    /* JADX INFO: renamed from: d */
    public vk2 mo686d(th2 th2Var) {
        C0330iz c0330iz = (C0330iz) this.f4109h;
        File file = (File) this.f4110i;
        vk2 vk2VarMo686d = c0330iz.mo686d(th2Var);
        return new vk2(vk2VarMo686d.f12003a, vk2VarMo686d.f12004b, file != null ? wi0.m5901g0(file, th2Var.f10774c) : null);
    }
}
