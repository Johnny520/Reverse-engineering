package p248r;

import p099gc.EnumC2732a;
import p113hc.AbstractC3000x;
import p113hc.InterfaceC2994r;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;

/* JADX INFO: renamed from: r.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6435k implements InterfaceC6434j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2994r f20239a = AbstractC3000x.m11088b(0, 16, EnumC2732a.f7139r, 1, null);

    @Override // p248r.InterfaceC6434j
    /* JADX INFO: renamed from: b */
    public Object mo25464b(InterfaceC6431g interfaceC6431g, InterfaceC5976f interfaceC5976f) {
        Object objMo400a = mo25462a().mo400a(interfaceC6431g, interfaceC5976f);
        return objMo400a == AbstractC6325c.m24992g() ? objMo400a : C4700i0.f13910a;
    }

    @Override // p248r.InterfaceC6434j
    /* JADX INFO: renamed from: c */
    public boolean mo25465c(InterfaceC6431g interfaceC6431g) {
        return mo25462a().mo11006f(interfaceC6431g);
    }

    @Override // p248r.InterfaceC6432h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC2994r mo25462a() {
        return this.f20239a;
    }
}
