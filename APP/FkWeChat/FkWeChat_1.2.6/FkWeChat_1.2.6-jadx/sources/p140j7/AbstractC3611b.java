package p140j7;

import ec.AbstractC2149k0;
import ec.C2122d1;
import p010a9.InterfaceC0184l;
import p034c7.AbstractC1377m;
import p034c7.C1398z;
import p108h7.InterfaceC2890a;
import p108h7.InterfaceC2891b;
import p125i7.C3223l0;
import p125i7.C3235r0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: j7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3611b {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m13525a(String str, C3235r0.e eVar) {
        eVar.getClass();
        eVar.m12302e(str);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final int m13526b() {
        return Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: renamed from: c */
    public static final void m13527c(InterfaceC2890a interfaceC2890a, C3223l0 c3223l0) throws C1398z {
        final String string;
        interfaceC2890a.getClass();
        c3223l0.getClass();
        InterfaceC2891b interfaceC2891bMo10537a = interfaceC2890a.mo10537a("ktor.deployment.shutdown.url");
        if (interfaceC2891bMo10537a == null || (string = interfaceC2891bMo10537a.getString()) == null) {
            return;
        }
        AbstractC1377m.m5437f(c3223l0, C3235r0.f.f8704a, new InterfaceC0184l() { // from class: j7.a
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC3611b.m13525a(string, (C3235r0.e) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2149k0 m13528d(C2122d1 c2122d1) {
        c2122d1.getClass();
        return C2122d1.m7727b();
    }

    /* JADX INFO: renamed from: e */
    public static final void m13529e(Object obj) {
        System.err.print(obj);
    }
}
