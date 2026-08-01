package p014b;

import androidx.lifecycle.InterfaceC0676o;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: b.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0717s {

    /* JADX INFO: renamed from: b.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC0714p {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC0184l f2134d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, InterfaceC0184l interfaceC0184l) {
            super(z10);
            this.f2134d = interfaceC0184l;
        }

        @Override // p014b.AbstractC0714p
        /* JADX INFO: renamed from: d */
        public void mo2796d() {
            this.f2134d.mo27m(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC0714p m2831a(C0715q c0715q, InterfaceC0676o interfaceC0676o, boolean z10, InterfaceC0184l interfaceC0184l) {
        c0715q.getClass();
        interfaceC0184l.getClass();
        a aVar = new a(z10, interfaceC0184l);
        if (interfaceC0676o != null) {
            c0715q.m2809h(interfaceC0676o, aVar);
            return aVar;
        }
        c0715q.m2810i(aVar);
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AbstractC0714p m2832b(C0715q c0715q, InterfaceC0676o interfaceC0676o, boolean z10, InterfaceC0184l interfaceC0184l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0676o = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return m2831a(c0715q, interfaceC0676o, z10, interfaceC0184l);
    }
}
