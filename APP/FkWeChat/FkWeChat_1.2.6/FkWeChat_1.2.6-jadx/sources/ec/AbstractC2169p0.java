package ec;

import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0188p;
import p145jc.C3800d;
import p145jc.C3835z;
import p161kc.AbstractC4244b;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;
import p314vb.C8897d;

/* JADX INFO: renamed from: ec.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2169p0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2165o0 m7878a(InterfaceC5980j interfaceC5980j) {
        if (interfaceC5980j.mo1654h(InterfaceC2198w1.f6022g) == null) {
            interfaceC5980j = interfaceC5980j.mo1651c0(AbstractC2108a2.m7602b(null, 1, null));
        }
        return new C3800d(interfaceC5980j);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2165o0 m7879b() {
        return new C3800d(AbstractC2179r2.m7896b(null, 1, null).mo1651c0(C2122d1.m7728c()));
    }

    /* JADX INFO: renamed from: c */
    public static final void m7880c(InterfaceC2165o0 interfaceC2165o0, CancellationException cancellationException) {
        InterfaceC2198w1 interfaceC2198w1 = (InterfaceC2198w1) interfaceC2165o0.getCoroutineContext().mo1654h(InterfaceC2198w1.f6022g);
        if (interfaceC2198w1 != null) {
            interfaceC2198w1.mo7696n(cancellationException);
        } else {
            C8897d.m34134a("Scope cannot be cancelled because it does not have a job: ", interfaceC2165o0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m7881d(InterfaceC2165o0 interfaceC2165o0, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        m7880c(interfaceC2165o0, cancellationException);
    }

    /* JADX INFO: renamed from: e */
    public static final Object m7882e(InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        C3835z c3835z = new C3835z(interfaceC5976f.getContext(), interfaceC5976f);
        Object objM16727d = AbstractC4244b.m16727d(c3835z, c3835z, interfaceC0188p);
        if (objM16727d == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM16727d;
    }

    /* JADX INFO: renamed from: f */
    public static final void m7883f(InterfaceC2165o0 interfaceC2165o0) {
        AbstractC2210z1.m7959l(interfaceC2165o0.getCoroutineContext());
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m7884g(InterfaceC2165o0 interfaceC2165o0) {
        InterfaceC2198w1 interfaceC2198w1 = (InterfaceC2198w1) interfaceC2165o0.getCoroutineContext().mo1654h(InterfaceC2198w1.f6022g);
        if (interfaceC2198w1 != null) {
            return interfaceC2198w1.mo7586c();
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC2165o0 m7885h(InterfaceC2165o0 interfaceC2165o0, InterfaceC5980j interfaceC5980j) {
        return new C3800d(interfaceC2165o0.getCoroutineContext().mo1651c0(interfaceC5980j));
    }
}
