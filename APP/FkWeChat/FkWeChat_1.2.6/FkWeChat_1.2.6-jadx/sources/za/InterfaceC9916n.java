package za;

import java.util.Collection;
import p010a9.InterfaceC0184l;
import p213oa.C5695f;
import p215oc.C5725t;
import p229p9.InterfaceC6004h;
import p342x9.InterfaceC9468b;

/* JADX INFO: renamed from: za.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9916n {

    /* JADX INFO: renamed from: za.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Collection m38461a(InterfaceC9916n interfaceC9916n, C9906d c9906d, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
                return null;
            }
            if ((i10 & 1) != 0) {
                c9906d = C9906d.f33407o;
            }
            if ((i10 & 2) != 0) {
                interfaceC0184l = InterfaceC9913k.f33433a.m38459c();
            }
            return interfaceC9916n.mo5519g(c9906d, interfaceC0184l);
        }
    }

    /* JADX INFO: renamed from: f */
    InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b);

    /* JADX INFO: renamed from: g */
    Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l);
}
