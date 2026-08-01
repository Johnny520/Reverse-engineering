package p004a3;

import androidx.compose.runtime.InterfaceC0564p5;
import p010a9.InterfaceC0184l;
import p059e3.C2024s;
import p117i.C3043c0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: a3.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0043h0 {

    /* JADX INFO: renamed from: a */
    public final C2024s f78a = new C2024s();

    /* JADX INFO: renamed from: b */
    public final C3043c0 f79b = new C3043c0(16);

    /* JADX INFO: renamed from: a */
    public static C4700i0 m157a(C0043h0 c0043h0, C0039f0 c0039f0, InterfaceC0045i0 interfaceC0045i0) {
        synchronized (c0043h0.f78a) {
            try {
                boolean zMo159g = interfaceC0045i0.mo159g();
                C3043c0 c3043c0 = c0043h0.f79b;
                if (zMo159g) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0564p5 m158b(final C0039f0 c0039f0, InterfaceC0184l interfaceC0184l) {
        synchronized (this.f78a) {
            InterfaceC0045i0 interfaceC0045i0 = (InterfaceC0045i0) this.f79b.m11255c(c0039f0);
            if (interfaceC0045i0 != null) {
                if (interfaceC0045i0.mo159g()) {
                    return interfaceC0045i0;
                }
            }
            try {
                InterfaceC0045i0 interfaceC0045i02 = (InterfaceC0045i0) interfaceC0184l.mo27m(new InterfaceC0184l() { // from class: a3.g0
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj) {
                        return C0043h0.m157a(this.f69q, c0039f0, (InterfaceC0045i0) obj);
                    }
                });
                synchronized (this.f78a) {
                    try {
                        if (this.f79b.m11255c(c0039f0) == null && interfaceC0045i02.mo159g()) {
                            this.f79b.m11256d(c0039f0, interfaceC0045i02);
                        }
                        C4700i0 c4700i0 = C4700i0.f13910a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC0045i02;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }
}
