package p264s0;

import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p121i3.C3179i;
import p189n.InterfaceC5279s1;
import p265s1.C7128q1;

/* JADX INFO: renamed from: s0.f8 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6728f8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0506h3 f21293a = AbstractC0552o0.m1978f(null, new InterfaceC0173a() { // from class: s0.e8
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC6728f8.m26671a();
        }
    }, 1, null);

    /* JADX INFO: renamed from: b */
    public static final C6744g8 f21294b;

    /* JADX INFO: renamed from: c */
    public static final C6744g8 f21295c;

    static {
        C3179i.a aVar = C3179i.f8458r;
        float fM12012c = aVar.m12012c();
        C7128q1.a aVar2 = C7128q1.f23644b;
        f21294b = new C6744g8(true, fM12012c, aVar2.m28147h(), (AbstractC1043k) null);
        f21295c = new C6744g8(false, aVar.m12012c(), aVar2.m28147h(), (AbstractC1043k) null);
    }

    /* JADX INFO: renamed from: a */
    public static C6680c8 m26671a() {
        return new C6680c8(0L, null, 3, null);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC0506h3 m26672b() {
        return f21293a;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5279s1 m26673c(boolean z10, float f10, long j10) {
        return (C3179i.m12005m(f10, C3179i.f8458r.m12012c()) && C7128q1.m28131q(j10, C7128q1.f23644b.m28147h())) ? z10 ? f21294b : f21295c : new C6744g8(z10, f10, j10, (AbstractC1043k) null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC5279s1 m26674d(boolean z10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = C3179i.f8458r.m12012c();
        }
        if ((i10 & 4) != 0) {
            j10 = C7128q1.f23644b.m28147h();
        }
        return m26673c(z10, f10, j10);
    }
}
