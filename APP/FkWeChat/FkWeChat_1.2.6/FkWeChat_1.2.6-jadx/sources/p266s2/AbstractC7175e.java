package p266s2;

import android.os.CancellationSignal;
import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1067w;
import p172l8.C4700i0;

/* JADX INFO: renamed from: s2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7175e {

    /* JADX INFO: renamed from: s2.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ CancellationSignal f23760r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CancellationSignal cancellationSignal) {
            super(1);
            this.f23760r = cancellationSignal;
        }

        /* JADX INFO: renamed from: a */
        public final void m28349a(Throwable th) {
            if (th != null) {
                this.f23760r.cancel();
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m28349a((Throwable) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m28346a(InterfaceC2198w1 interfaceC2198w1) {
        InterfaceC2198w1.a.m7920a(interfaceC2198w1, null, 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2198w1 m28348c(InterfaceC2165o0 interfaceC2165o0, CancellationSignal cancellationSignal, InterfaceC0188p interfaceC0188p) {
        final InterfaceC2198w1 interfaceC2198w1M7817d = AbstractC2148k.m7817d(interfaceC2165o0, null, null, interfaceC0188p, 3, null);
        interfaceC2198w1M7817d.mo7650D0(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: s2.d
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                AbstractC7175e.m28346a(interfaceC2198w1M7817d);
            }
        });
        return interfaceC2198w1M7817d;
    }
}
