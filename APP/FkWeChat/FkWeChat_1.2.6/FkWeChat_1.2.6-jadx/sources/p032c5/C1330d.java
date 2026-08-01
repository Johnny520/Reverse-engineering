package p032c5;

import bsh.C1259t2;
import p254r5.AbstractC6500g0;
import p254r5.C6492c0;
import p254r5.C6506k;
import p254r5.C6509n;
import p254r5.C6510o;
import p254r5.C6517v;
import p376zd.C9987e;

/* JADX INFO: renamed from: c5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1330d extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final AbstractC6500g0 f3976b;

    public C1330d(AbstractC6500g0 abstractC6500g0) {
        super("ConstantValue");
        if ((abstractC6500g0 instanceof C6492c0) || (abstractC6500g0 instanceof C6510o) || (abstractC6500g0 instanceof C6517v) || (abstractC6500g0 instanceof C6509n) || (abstractC6500g0 instanceof C6506k)) {
            this.f3976b = abstractC6500g0;
        } else {
            if (abstractC6500g0 == null) {
                C1259t2.m5095a("constantValue == null");
                throw null;
            }
            C9987e.m38645a("bad type for constantValue");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return 8;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC6500g0 m5344b() {
        return this.f3976b;
    }
}
