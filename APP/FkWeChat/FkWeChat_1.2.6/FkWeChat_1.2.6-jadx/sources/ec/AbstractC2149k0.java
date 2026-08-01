package ec;

import ec.AbstractC2149k0;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p145jc.AbstractC3810i;
import p145jc.AbstractC3816l;
import p145jc.C3808h;
import p145jc.C3814k;
import p215oc.C5725t;
import p228p8.AbstractC5971a;
import p228p8.AbstractC5972b;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5977g;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2149k0 extends AbstractC5971a implements InterfaceC5977g {

    /* JADX INFO: renamed from: r */
    public static final a f5980r = new a(null);

    public AbstractC2149k0() {
        super(InterfaceC5977g.f18915n);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ AbstractC2149k0 m7819d0(AbstractC2149k0 abstractC2149k0, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: limitedParallelism");
            return null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return abstractC2149k0.mo7753b0(i10, str);
    }

    /* JADX INFO: renamed from: F */
    public void mo7820F(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        AbstractC3810i.m15180c(this, interfaceC5980j, runnable);
    }

    @Override // p228p8.InterfaceC5977g
    /* JADX INFO: renamed from: F0 */
    public final void mo5456F0(InterfaceC5976f interfaceC5976f) {
        interfaceC5976f.getClass();
        ((C3808h) interfaceC5976f).m15176r();
    }

    @Override // p228p8.InterfaceC5977g
    /* JADX INFO: renamed from: G */
    public final InterfaceC5976f mo5457G(InterfaceC5976f interfaceC5976f) {
        return new C3808h(this, interfaceC5976f);
    }

    @Override // p228p8.AbstractC5971a, p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        return InterfaceC5977g.a.m23978c(this, cVar);
    }

    /* JADX INFO: renamed from: V */
    public boolean mo7821V(InterfaceC5980j interfaceC5980j) {
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public AbstractC2149k0 mo7753b0(int i10, String str) {
        AbstractC3816l.m15199a(i10);
        return new C3814k(this, i10, str);
    }

    @Override // p228p8.AbstractC5971a, p228p8.InterfaceC5980j.b, p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        return InterfaceC5977g.a.m23977b(this, cVar);
    }

    public String toString() {
        return AbstractC2181s0.m7898a(this) + '@' + AbstractC2181s0.m7899b(this);
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo7807x(InterfaceC5980j interfaceC5980j, Runnable runnable);

    /* JADX INFO: renamed from: ec.k0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5972b {
        public a() {
            super(InterfaceC5977g.f18915n, new InterfaceC0184l() { // from class: ec.j0
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return AbstractC2149k0.a.m7822c((InterfaceC5980j.b) obj);
                }
            });
        }

        /* JADX INFO: renamed from: c */
        public static AbstractC2149k0 m7822c(InterfaceC5980j.b bVar) {
            if (bVar instanceof AbstractC2149k0) {
                return (AbstractC2149k0) bVar;
            }
            return null;
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }
    }
}
