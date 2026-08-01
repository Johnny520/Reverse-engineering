package p113hc;

import p099gc.EnumC2732a;
import p130ic.AbstractC3398p;
import p145jc.C3801d0;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: hc.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2983h0 {

    /* JADX INFO: renamed from: a */
    public static final C3801d0 f7874a = new C3801d0("NONE");

    /* JADX INFO: renamed from: b */
    public static final C3801d0 f7875b = new C3801d0("PENDING");

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2995s m11014a(Object obj) {
        if (obj == null) {
            obj = AbstractC3398p.f9379a;
        }
        return new C2981g0(obj);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2972c m11017d(InterfaceC2979f0 interfaceC2979f0, InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || enumC2732a != EnumC2732a.f7139r) ? AbstractC3000x.m11091e(interfaceC2979f0, interfaceC5980j, i10, enumC2732a) : interfaceC2979f0;
    }
}
