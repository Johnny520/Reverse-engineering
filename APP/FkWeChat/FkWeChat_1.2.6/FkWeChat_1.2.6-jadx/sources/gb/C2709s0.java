package gb;

import java.util.List;
import p010a9.InterfaceC0184l;
import p112hb.AbstractC2949h;

/* JADX INFO: renamed from: gb.s0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2709s0 implements InterfaceC0184l {

    /* JADX INFO: renamed from: q */
    public final InterfaceC2716u1 f7073q;

    /* JADX INFO: renamed from: r */
    public final List f7074r;

    /* JADX INFO: renamed from: s */
    public final C2704q1 f7075s;

    /* JADX INFO: renamed from: t */
    public final boolean f7076t;

    public C2709s0(InterfaceC2716u1 interfaceC2716u1, List list, C2704q1 c2704q1, boolean z10) {
        this.f7073q = interfaceC2716u1;
        this.f7074r = list;
        this.f7075s = c2704q1;
        this.f7076t = z10;
    }

    @Override // p010a9.InterfaceC0184l
    /* JADX INFO: renamed from: m */
    public Object mo27m(Object obj) {
        return C2715u0.m9632n(this.f7073q, this.f7074r, this.f7075s, this.f7076t, (AbstractC2949h) obj);
    }
}
