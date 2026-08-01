package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: px */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0631px implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4979d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f4980e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f4981f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0631px(int i, Object obj, Object obj2) {
        this.f4979d = i;
        this.f4980e = obj;
        this.f4981f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        long j;
        switch (this.f4979d) {
            case 0:
                q21 q21Var = (q21) obj;
                synchronized (t21.f5893c) {
                    j = t21.f5895e;
                    t21.f5895e = 1 + j;
                }
                return new nh0(j, q21Var, (InterfaceC0742sw) this.f4980e, (InterfaceC0742sw) this.f4981f);
            default:
                d50 d50Var = (d50) this.f4980e;
                Object obj2 = d50Var.f970b;
                C0884wc c0884wc = (C0884wc) this.f4981f;
                synchronized (obj2) {
                    ((ArrayList) d50Var.f971c).remove(c0884wc);
                }
                return na1.f4229a;
        }
    }
}
