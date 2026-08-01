package p099gc;

import okhttp3.C5754i;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1052o0;
import p099gc.C2742k;
import p145jc.AbstractC3832w;
import p145jc.C3825p0;
import p172l8.AbstractC4693f;
import p172l8.C4700i0;
import p215oc.C5704b;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: gc.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2748q extends C2736e {

    /* JADX INFO: renamed from: C */
    public final int f7203C;

    /* JADX INFO: renamed from: D */
    public final EnumC2732a f7204D;

    public C2748q(int i10, EnumC2732a enumC2732a, InterfaceC0184l interfaceC0184l) {
        super(i10, interfaceC0184l);
        this.f7203C = i10;
        this.f7204D = enumC2732a;
        if (enumC2732a == EnumC2732a.f7138q) {
            C5754i.m23255a("This implementation does not support suspension for senders, use ", AbstractC1052o0.m3807b(C2736e.class).mo3794w(), " instead");
            throw null;
        }
        if (i10 >= 1) {
            return;
        }
        C5704b.m23087a("Buffered channel capacity must be at least 1, but ", i10, " was specified");
        throw null;
    }

    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ Object m9865j1(C2748q c2748q, Object obj, InterfaceC5976f interfaceC5976f) throws Throwable {
        C3825p0 c3825p0M15265c;
        Object objM9867l1 = c2748q.m9867l1(obj, true);
        if (!(objM9867l1 instanceof C2742k.a)) {
            return C4700i0.f13910a;
        }
        C2742k.m9839e(objM9867l1);
        InterfaceC0184l interfaceC0184l = c2748q.f7158r;
        if (interfaceC0184l == null || (c3825p0M15265c = AbstractC3832w.m15265c(interfaceC0184l, obj, null, 2, null)) == null) {
            throw c2748q.m9764f0();
        }
        AbstractC4693f.m18753a(c3825p0M15265c, c2748q.m9764f0());
        throw c3825p0M15265c;
    }

    @Override // p099gc.C2736e, p099gc.InterfaceC2754w
    /* JADX INFO: renamed from: i */
    public Object mo9768i(Object obj, InterfaceC5976f interfaceC5976f) {
        return m9865j1(this, obj, interfaceC5976f);
    }

    /* JADX INFO: renamed from: k1 */
    public final Object m9866k1(Object obj, boolean z10) {
        InterfaceC0184l interfaceC0184l;
        C3825p0 c3825p0M15265c;
        Object objMo9781s = super.mo9781s(obj);
        if (C2742k.m9843i(objMo9781s) || C2742k.m9842h(objMo9781s)) {
            return objMo9781s;
        }
        if (!z10 || (interfaceC0184l = this.f7158r) == null || (c3825p0M15265c = AbstractC3832w.m15265c(interfaceC0184l, obj, null, 2, null)) == null) {
            return C2742k.f7197b.m9848c(C4700i0.f13910a);
        }
        throw c3825p0M15265c;
    }

    /* JADX INFO: renamed from: l1 */
    public final Object m9867l1(Object obj, boolean z10) {
        return this.f7204D == EnumC2732a.f7140s ? m9866k1(obj, z10) : m9754Z0(obj);
    }

    @Override // p099gc.C2736e, p099gc.InterfaceC2754w
    /* JADX INFO: renamed from: s */
    public Object mo9781s(Object obj) {
        return m9867l1(obj, false);
    }

    @Override // p099gc.C2736e
    /* JADX INFO: renamed from: u0 */
    public boolean mo9784u0() {
        return this.f7204D == EnumC2732a.f7139r;
    }
}
