package gb;

import p215oc.C5725t;
import p229p9.InterfaceC6019m;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: gb.p1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2701p1 {

    /* JADX INFO: renamed from: gb.p1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ C2704q1 m9560a(InterfaceC2701p1 interfaceC2701p1, InterfaceC6333h interfaceC6333h, InterfaceC2716u1 interfaceC2716u1, InterfaceC6019m interfaceC6019m, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: toAttributes");
                return null;
            }
            if ((i10 & 2) != 0) {
                interfaceC2716u1 = null;
            }
            if ((i10 & 4) != 0) {
                interfaceC6019m = null;
            }
            return interfaceC2701p1.mo9559a(interfaceC6333h, interfaceC2716u1, interfaceC6019m);
        }
    }

    /* JADX INFO: renamed from: a */
    C2704q1 mo9559a(InterfaceC6333h interfaceC6333h, InterfaceC2716u1 interfaceC2716u1, InterfaceC6019m interfaceC6019m);
}
