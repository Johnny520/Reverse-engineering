package p189n;

import p010a9.InterfaceC0184l;
import p080f9.AbstractC2368o;
import p080f9.InterfaceC2359f;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p277t2.AbstractC8070f0;
import p277t2.AbstractC8093v;
import p277t2.C8077j;
import p277t2.InterfaceC8074h0;

/* JADX INFO: renamed from: n.r2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5275r2 {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m21530a(float f10, InterfaceC2359f interfaceC2359f, int i10, InterfaceC8074h0 interfaceC8074h0) {
        AbstractC8070f0.m31115h0(interfaceC8074h0, new C8077j(((Number) AbstractC2368o.m8588o(Float.valueOf(f10), interfaceC2359f)).floatValue(), interfaceC2359f, i10));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m21531b(InterfaceC8074h0 interfaceC8074h0) {
        AbstractC8070f0.m31115h0(interfaceC8074h0, C8077j.f26960d.m31177a());
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4507m m21532c(InterfaceC4507m interfaceC4507m) {
        return AbstractC8093v.m31266c(interfaceC4507m, true, new InterfaceC0184l() { // from class: n.q2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC5275r2.m21531b((InterfaceC8074h0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4507m m21533d(InterfaceC4507m interfaceC4507m, final float f10, final InterfaceC2359f interfaceC2359f, final int i10) {
        return AbstractC8093v.m31266c(interfaceC4507m, true, new InterfaceC0184l() { // from class: n.p2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC5275r2.m21530a(f10, interfaceC2359f, i10, (InterfaceC8074h0) obj);
            }
        });
    }
}
