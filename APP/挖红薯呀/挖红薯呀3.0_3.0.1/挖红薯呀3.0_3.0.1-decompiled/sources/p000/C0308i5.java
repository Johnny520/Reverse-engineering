package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: i5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0308i5 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2448a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2449b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0308i5(int i, Object obj) {
        this.f2448a = i;
        this.f2449b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(rr0 rr0Var, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f2448a;
        InterfaceC0322ik interfaceC0322ik2 = null;
        na1 na1Var = na1.f4229a;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        Object obj = this.f2449b;
        switch (i) {
            case 0:
                Object objM3005o = p30.m3005o(rr0Var, new C0271h5((C0343j5) obj, null), interfaceC0322ik);
                return objM3005o == enumC1007zk ? objM3005o : na1Var;
            case 1:
                C0128dg c0128dg = (C0128dg) obj;
                Object obj2 = null;
                C0017ag c0017ag = (!c0128dg.f4108x || c0128dg.f1093O == null) ? null : new C0017ag(c0128dg, 0);
                C0054bg c0054bg = new C0054bg(c0128dg, null);
                C0017ag c0017ag2 = new C0017ag(c0128dg, 1);
                C0521nq c0521nq = m61.f3821a;
                Object objM3013w = p30.m3013w(new C0162e7(rr0Var, c0054bg, c0017ag, obj2, c0017ag2, null, 2), interfaceC0322ik);
                if (objM3013w != enumC1007zk) {
                    objM3013w = na1Var;
                }
                return objM3013w == enumC1007zk ? objM3013w : na1Var;
            default:
                Object objM3013w2 = p30.m3013w(new C0154e(rr0Var, (C0399km) obj, interfaceC0322ik2, 5), interfaceC0322ik);
                return objM3013w2 == enumC1007zk ? objM3013w2 : na1Var;
        }
    }
}
