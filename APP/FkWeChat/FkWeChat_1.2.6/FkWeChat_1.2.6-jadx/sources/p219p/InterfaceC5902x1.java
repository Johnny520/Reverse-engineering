package p219p;

import p010a9.InterfaceC0184l;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: p.x1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5902x1 extends InterfaceC5859j0 {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m23801b(InterfaceC5902x1 interfaceC5902x1, InterfaceC5836c1 interfaceC5836c1, float f10, InterfaceC5976f interfaceC5976f) {
        return interfaceC5902x1.mo23802c(interfaceC5836c1, f10, AbstractC5908z1.f18805a, interfaceC5976f);
    }

    @Override // p219p.InterfaceC5859j0
    /* JADX INFO: renamed from: a */
    default Object mo23621a(InterfaceC5836c1 interfaceC5836c1, float f10, InterfaceC5976f interfaceC5976f) {
        return m23801b(this, interfaceC5836c1, f10, interfaceC5976f);
    }

    /* JADX INFO: renamed from: c */
    Object mo23802c(InterfaceC5836c1 interfaceC5836c1, float f10, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f);
}
