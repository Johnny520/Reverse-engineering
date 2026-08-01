package p130ic;

import p099gc.EnumC2732a;
import p113hc.C2999w;
import p113hc.InterfaceC2979f0;

/* JADX INFO: renamed from: ic.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3406x extends C2999w implements InterfaceC2979f0 {
    public C3406x(int i10) {
        super(1, Integer.MAX_VALUE, EnumC2732a.f7139r);
        mo11006f(Integer.valueOf(i10));
    }

    @Override // p113hc.InterfaceC2979f0
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) m11073N()).intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m12755b0(int i10) {
        boolean zMo11006f;
        synchronized (this) {
            zMo11006f = mo11006f(Integer.valueOf(((Number) m11073N()).intValue() + i10));
        }
        return zMo11006f;
    }
}
