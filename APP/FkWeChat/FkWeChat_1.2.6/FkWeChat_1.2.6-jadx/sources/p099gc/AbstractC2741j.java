package p099gc;

import p010a9.InterfaceC0184l;
import p376zd.C9987e;

/* JADX INFO: renamed from: gc.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2741j {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2738g m9833a(int i10, EnumC2732a enumC2732a, InterfaceC0184l interfaceC0184l) {
        if (i10 == -2) {
            return enumC2732a == EnumC2732a.f7138q ? new C2736e(InterfaceC2738g.f7193h.m9831a(), interfaceC0184l) : new C2748q(1, enumC2732a, interfaceC0184l);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? enumC2732a == EnumC2732a.f7138q ? new C2736e(i10, interfaceC0184l) : new C2748q(i10, enumC2732a, interfaceC0184l) : new C2736e(Integer.MAX_VALUE, interfaceC0184l) : enumC2732a == EnumC2732a.f7138q ? new C2736e(0, interfaceC0184l) : new C2748q(1, enumC2732a, interfaceC0184l);
        }
        if (enumC2732a == EnumC2732a.f7138q) {
            return new C2748q(1, EnumC2732a.f7139r, interfaceC0184l);
        }
        C9987e.m38645a("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2738g m9834b(int i10, EnumC2732a enumC2732a, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            enumC2732a = EnumC2732a.f7138q;
        }
        if ((i11 & 4) != 0) {
            interfaceC0184l = null;
        }
        return m9833a(i10, enumC2732a, interfaceC0184l);
    }
}
