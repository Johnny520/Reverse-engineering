package p058e2;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p024b9.C1050n0;
import p166l2.AbstractC4560k2;
import p166l2.InterfaceC4553j;
import p166l2.InterfaceC4556j2;

/* JADX INFO: renamed from: e2.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2004f {

    /* JADX INFO: renamed from: e2.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C1050n0 f5573r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1050n0 c1050n0) {
            super(1);
            this.f5573r = c1050n0;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(InterfaceC4556j2 interfaceC4556j2) {
            boolean z10;
            if (interfaceC4556j2.mo17471z().m17461m2()) {
                this.f5573r.f3208q = interfaceC4556j2;
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4556j2 m7241b(InterfaceC4556j2 interfaceC4556j2) {
        C1050n0 c1050n0 = new C1050n0();
        AbstractC4560k2.m18022d(interfaceC4556j2, new a(c1050n0));
        return (InterfaceC4556j2) c1050n0.f3208q;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4553j m7242c(InterfaceC1999a interfaceC1999a, C2000b c2000b) {
        return new C2003e(interfaceC1999a, c2000b);
    }
}
