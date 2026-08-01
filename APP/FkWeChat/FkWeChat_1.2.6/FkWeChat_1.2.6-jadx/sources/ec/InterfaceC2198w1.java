package ec;

import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: ec.w1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2198w1 extends InterfaceC5980j.b {

    /* JADX INFO: renamed from: g */
    public static final b f6022g = b.f6023q;

    /* JADX INFO: renamed from: ec.w1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m7920a(InterfaceC2198w1 interfaceC2198w1, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: cancel");
                return;
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC2198w1.mo7696n(cancellationException);
        }

        /* JADX INFO: renamed from: b */
        public static Object m7921b(InterfaceC2198w1 interfaceC2198w1, Object obj, InterfaceC0188p interfaceC0188p) {
            return InterfaceC5980j.b.a.m23985a(interfaceC2198w1, obj, interfaceC0188p);
        }

        /* JADX INFO: renamed from: c */
        public static InterfaceC5980j.b m7922c(InterfaceC2198w1 interfaceC2198w1, InterfaceC5980j.c cVar) {
            return InterfaceC5980j.b.a.m23986b(interfaceC2198w1, cVar);
        }

        /* JADX INFO: renamed from: d */
        public static InterfaceC5980j m7923d(InterfaceC2198w1 interfaceC2198w1, InterfaceC5980j.c cVar) {
            return InterfaceC5980j.b.a.m23987c(interfaceC2198w1, cVar);
        }

        /* JADX INFO: renamed from: e */
        public static InterfaceC5980j m7924e(InterfaceC2198w1 interfaceC2198w1, InterfaceC5980j interfaceC5980j) {
            return InterfaceC5980j.b.a.m23988d(interfaceC2198w1, interfaceC5980j);
        }
    }

    /* JADX INFO: renamed from: ec.w1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC5980j.c {

        /* JADX INFO: renamed from: q */
        public static final /* synthetic */ b f6023q = new b();
    }

    /* JADX INFO: renamed from: D0 */
    InterfaceC2126e1 mo7650D0(InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: J0 */
    Object mo7657J0(InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: R */
    InterfaceC2184t mo7666R(InterfaceC2192v interfaceC2192v);

    /* JADX INFO: renamed from: T */
    CancellationException mo7669T();

    /* JADX INFO: renamed from: c */
    boolean mo7586c();

    /* JADX INFO: renamed from: f */
    InterfaceC7282h mo7686f();

    boolean isCancelled();

    /* JADX INFO: renamed from: l */
    boolean mo7693l();

    /* JADX INFO: renamed from: n */
    void mo7696n(CancellationException cancellationException);

    /* JADX INFO: renamed from: n0 */
    InterfaceC2126e1 mo7697n0(boolean z10, boolean z11, InterfaceC0184l interfaceC0184l);

    boolean start();
}
