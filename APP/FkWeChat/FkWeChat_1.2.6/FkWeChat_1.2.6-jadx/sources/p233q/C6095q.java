package p233q;

import p010a9.InterfaceC0184l;
import p163l.AbstractC4332n;
import p163l.InterfaceC4317k;
import p219p.InterfaceC5836c1;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;

/* JADX INFO: renamed from: q.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6095q implements InterfaceC6080b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4317k f19138a;

    public C6095q(InterfaceC4317k interfaceC4317k) {
        this.f19138a = interfaceC4317k;
    }

    @Override // p233q.InterfaceC6080b
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo24192a(InterfaceC5836c1 interfaceC5836c1, Object obj, Object obj2, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        return m24248b(interfaceC5836c1, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), interfaceC0184l, interfaceC5976f);
    }

    /* JADX INFO: renamed from: b */
    public Object m24248b(InterfaceC5836c1 interfaceC5836c1, float f10, float f11, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) throws Throwable {
        Object objM24239h = AbstractC6091m.m24239h(interfaceC5836c1, Math.abs(f10) * Math.signum(f11), f10, AbstractC4332n.m16994c(0.0f, f11, 0L, 0L, false, 28, null), this.f19138a, interfaceC0184l, interfaceC5976f);
        return objM24239h == AbstractC6325c.m24992g() ? objM24239h : (C6079a) objM24239h;
    }
}
