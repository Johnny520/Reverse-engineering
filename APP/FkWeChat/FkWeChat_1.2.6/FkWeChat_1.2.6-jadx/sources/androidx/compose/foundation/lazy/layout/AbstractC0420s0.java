package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.compose.runtime.C0476d1;
import androidx.compose.runtime.C0513i3;
import androidx.compose.runtime.InterfaceC0469c1;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p135j2.AbstractC3541k1;
import p135j2.InterfaceC3537j1;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0420s0 {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.s0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0469c1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0411p0 f1223a;

        public a(C0411p0 c0411p0) {
            this.f1223a = c0411p0;
        }

        @Override // androidx.compose.runtime.InterfaceC0469c1
        /* JADX INFO: renamed from: a */
        public void mo1209a() {
            this.f1223a.m1314e();
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC0469c1 m1391a(C0411p0 c0411p0, C0476d1 c0476d1) {
        return new a(c0411p0);
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m1392b(Object obj, int i10, C0423t0 c0423t0, InterfaceC0188p interfaceC0188p, int i11, InterfaceC0572r interfaceC0572r, int i12) {
        m1393c(obj, i10, c0423t0, interfaceC0188p, interfaceC0572r, AbstractC0541m3.m1929a(i11 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final void m1393c(final Object obj, final int i10, final C0423t0 c0423t0, final InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, final int i11) {
        int i12;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(872548579);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC0572rMo2181q.mo2175k(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2172h(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2175k(c0423t0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC0572rMo2181q.mo2175k(interfaceC0188p) ? 2048 : 1024;
        }
        if (interfaceC0572rMo2181q.mo2144C((i12 & 1171) != 1170, i12 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(872548579, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean zMo2162U = interfaceC0572rMo2181q.mo2162U(obj) | interfaceC0572rMo2181q.mo2162U(c0423t0);
            Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
            if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new C0411p0(obj, c0423t0);
                interfaceC0572rMo2181q.mo2153L(objMo2170f);
            }
            final C0411p0 c0411p0 = (C0411p0) objMo2170f;
            c0411p0.m1315f(i10);
            c0411p0.m1316g((InterfaceC3537j1) interfaceC0572rMo2181q.mo2142A(AbstractC3541k1.m13235a()));
            boolean zMo2162U2 = interfaceC0572rMo2181q.mo2162U(c0411p0);
            Object objMo2170f2 = interfaceC0572rMo2181q.mo2170f();
            if (zMo2162U2 || objMo2170f2 == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f2 = new InterfaceC0184l() { // from class: androidx.compose.foundation.lazy.layout.q0
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj2) {
                        return AbstractC0420s0.m1391a(c0411p0, (C0476d1) obj2);
                    }
                };
                interfaceC0572rMo2181q.mo2153L(objMo2170f2);
            }
            AbstractC0497g1.m1677a(c0411p0, (InterfaceC0184l) objMo2170f2, interfaceC0572rMo2181q, 0);
            AbstractC0552o0.m1975c(AbstractC3541k1.m13235a().m1696d(c0411p0), interfaceC0188p, interfaceC0572rMo2181q, ((i12 >> 6) & Opcodes.IREM) | C0513i3.f1416i);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: androidx.compose.foundation.lazy.layout.r0
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj2, Object obj3) {
                    return AbstractC0420s0.m1392b(obj, i10, c0423t0, interfaceC0188p, i11, (InterfaceC0572r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }
}
