package p221p1;

import p135j2.InterfaceC3527h;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p265s1.AbstractC7133r1;
import p334x1.AbstractC9307c;

/* JADX INFO: renamed from: p1.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5934q {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m23853a(InterfaceC4507m interfaceC4507m, AbstractC9307c abstractC9307c, boolean z10, InterfaceC4499e interfaceC4499e, InterfaceC3527h interfaceC3527h, float f10, AbstractC7133r1 abstractC7133r1) {
        return interfaceC4507m.mo17445i(new C5933p(abstractC9307c, z10, interfaceC4499e, interfaceC3527h, f10, abstractC7133r1));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC4507m m23854b(InterfaceC4507m interfaceC4507m, AbstractC9307c abstractC9307c, boolean z10, InterfaceC4499e interfaceC4499e, InterfaceC3527h interfaceC3527h, float f10, AbstractC7133r1 abstractC7133r1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            interfaceC4499e = InterfaceC4499e.f13028a.m17416e();
        }
        InterfaceC4499e interfaceC4499e2 = interfaceC4499e;
        if ((i10 & 8) != 0) {
            interfaceC3527h = InterfaceC3527h.f9763a.m13129c();
        }
        InterfaceC3527h interfaceC3527h2 = interfaceC3527h;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            abstractC7133r1 = null;
        }
        return m23853a(interfaceC4507m, abstractC9307c, z11, interfaceC4499e2, interfaceC3527h2, f11, abstractC7133r1);
    }
}
