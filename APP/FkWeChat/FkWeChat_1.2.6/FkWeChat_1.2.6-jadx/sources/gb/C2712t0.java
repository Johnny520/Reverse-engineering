package gb;

import java.util.List;
import p010a9.InterfaceC0184l;
import p112hb.AbstractC2949h;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: gb.t0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2712t0 implements InterfaceC0184l {

    /* JADX INFO: renamed from: q */
    public final InterfaceC2716u1 f7079q;

    /* JADX INFO: renamed from: r */
    public final List f7080r;

    /* JADX INFO: renamed from: s */
    public final C2704q1 f7081s;

    /* JADX INFO: renamed from: t */
    public final boolean f7082t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC9913k f7083u;

    public C2712t0(InterfaceC2716u1 interfaceC2716u1, List list, C2704q1 c2704q1, boolean z10, InterfaceC9913k interfaceC9913k) {
        this.f7079q = interfaceC2716u1;
        this.f7080r = list;
        this.f7081s = c2704q1;
        this.f7082t = z10;
        this.f7083u = interfaceC9913k;
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public Object mo27m(Object obj) {
        return C2715u0.m9635q(this.f7079q, this.f7080r, this.f7081s, this.f7082t, this.f7083u, (AbstractC2949h) obj);
    }
}
