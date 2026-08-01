package p363z;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0189q;
import p165l1.AbstractC4505k;
import p165l1.InterfaceC4507m;
import p189n.AbstractC5259o1;
import p189n.InterfaceC5244l1;
import p189n.InterfaceC5279s1;
import p248r.AbstractC6433i;
import p248r.InterfaceC6434j;
import p277t2.C8079k;

/* JADX INFO: renamed from: z.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9814d {

    /* JADX INFO: renamed from: z.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC5244l1 f33144q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ boolean f33145r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ boolean f33146s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C8079k f33147t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC0173a f33148u;

        public a(InterfaceC5244l1 interfaceC5244l1, boolean z10, boolean z11, C8079k c8079k, InterfaceC0173a interfaceC0173a) {
            this.f33144q = interfaceC5244l1;
            this.f33145r = z10;
            this.f33146s = z11;
            this.f33147t = c8079k;
            this.f33148u = interfaceC0173a;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC4507m m38158a(InterfaceC4507m interfaceC4507m, InterfaceC0572r interfaceC0572r, int i10) {
            interfaceC0572r.mo2163V(-1525724089);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = AbstractC6433i.m25463a();
                interfaceC0572r.mo2153L(objMo2170f);
            }
            InterfaceC6434j interfaceC6434j = (InterfaceC6434j) objMo2170f;
            InterfaceC4507m interfaceC4507mMo17445i = AbstractC5259o1.m21508c(InterfaceC4507m.f13080a, interfaceC6434j, this.f33144q).mo17445i(new C9811a(this.f33145r, interfaceC6434j, null, false, this.f33146s, this.f33147t, this.f33148u, null));
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
            interfaceC0572r.mo2152K();
            return interfaceC4507mMo17445i;
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
            return m38158a((InterfaceC4507m) obj, (InterfaceC0572r) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m38156a(InterfaceC4507m interfaceC4507m, boolean z10, InterfaceC6434j interfaceC6434j, InterfaceC5244l1 interfaceC5244l1, boolean z11, C8079k c8079k, InterfaceC0173a interfaceC0173a) {
        return interfaceC4507m.mo17445i(interfaceC5244l1 instanceof InterfaceC5279s1 ? new C9811a(z10, interfaceC6434j, (InterfaceC5279s1) interfaceC5244l1, false, z11, c8079k, interfaceC0173a, null) : interfaceC5244l1 == null ? new C9811a(z10, interfaceC6434j, null, false, z11, c8079k, interfaceC0173a, null) : interfaceC6434j != null ? AbstractC5259o1.m21508c(InterfaceC4507m.f13080a, interfaceC6434j, interfaceC5244l1).mo17445i(new C9811a(z10, interfaceC6434j, null, false, z11, c8079k, interfaceC0173a, null)) : AbstractC4505k.m17437c(InterfaceC4507m.f13080a, null, new a(interfaceC5244l1, z10, z11, c8079k, interfaceC0173a), 1, null));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC4507m m38157b(InterfaceC4507m interfaceC4507m, boolean z10, InterfaceC6434j interfaceC6434j, InterfaceC5244l1 interfaceC5244l1, boolean z11, C8079k c8079k, InterfaceC0173a interfaceC0173a, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            c8079k = null;
        }
        return m38156a(interfaceC4507m, z10, interfaceC6434j, interfaceC5244l1, z12, c8079k, interfaceC0173a);
    }
}
