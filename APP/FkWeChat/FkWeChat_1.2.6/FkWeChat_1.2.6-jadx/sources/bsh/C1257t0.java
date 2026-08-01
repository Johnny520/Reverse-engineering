package bsh;

import bsh.C1257t0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import p368z4.C9849a;

/* JADX INFO: renamed from: bsh.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1257t0 extends C1182g3 {

    /* JADX INFO: renamed from: O */
    public static final AtomicInteger f3810O = new AtomicInteger();

    /* JADX INFO: renamed from: P */
    public static C9849a f3811P = new C9849a(new Function() { // from class: bsh.s0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return C1257t0.m5091z0((C1257t0.a) obj);
        }
    }, C9849a.a.Weak);

    /* JADX INFO: renamed from: N */
    public final AtomicInteger f3812N;

    /* JADX INFO: renamed from: bsh.t0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public C1182g3 f3813a;

        /* JADX INFO: renamed from: b */
        public int f3814b;

        public a(C1182g3 c1182g3, int i10) {
            this.f3813a = c1182g3;
            this.f3814b = i10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f3813a == aVar.f3813a && this.f3814b == aVar.f3814b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f3813a.hashCode() * 31) + Integer.hashCode(this.f3814b);
        }
    }

    public C1257t0(C1182g3 c1182g3, int i10) {
        super(c1182g3, c1182g3.getName() + "/BlockNameSpace" + i10);
        this.f3812N = new AtomicInteger(1);
        this.f3569F = c1182g3.f3569F;
    }

    /* JADX INFO: renamed from: A0 */
    public static C1182g3 m5090A0(C1182g3 c1182g3, int i10) {
        C1257t0 c1257t0 = (C1257t0) f3811P.m38264c(new a(c1182g3, i10));
        c1257t0.m4378k();
        return c1257t0;
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ C1257t0 m5091z0(a aVar) {
        return new C1257t0(aVar.f3813a, aVar.f3814b);
    }

    /* JADX INFO: renamed from: B0 */
    public final C1182g3 m5092B0() {
        C1182g3 c1182g3M4348J = super.m4348J();
        return c1182g3M4348J instanceof C1257t0 ? ((C1257t0) c1182g3M4348J).m5092B0() : c1182g3M4348J;
    }

    /* JADX INFO: renamed from: C0 */
    public void m5093C0(String str, Object obj) throws C1279w4 {
        super.mo4395s0(str, obj, false, false);
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m5094D0(String str) {
        return super.m4354P(str, false) != null;
    }

    @Override // bsh.C1182g3
    /* JADX INFO: renamed from: L */
    public This mo4350L(RunnableC1205k2 runnableC1205k2) {
        return m5092B0().mo4350L(runnableC1205k2);
    }

    @Override // bsh.C1182g3
    /* JADX INFO: renamed from: M */
    public This mo4351M(RunnableC1205k2 runnableC1205k2) {
        return m5092B0().mo4351M(runnableC1205k2);
    }

    @Override // bsh.C1182g3
    /* JADX INFO: renamed from: T */
    public void mo4358T(String str) {
        m4348J().mo4358T(str);
    }

    @Override // bsh.C1182g3
    /* JADX INFO: renamed from: W */
    public void mo4361W(String str) {
        m4348J().mo4361W(str);
    }

    @Override // bsh.C1182g3
    /* JADX INFO: renamed from: m0 */
    public void mo4383m0(C1168e1 c1168e1) {
        m4348J().mo4383m0(c1168e1);
    }

    @Override // bsh.C1182g3
    /* JADX INFO: renamed from: s0 */
    public C1291y4 mo4395s0(String str, Object obj, boolean z10, boolean z11) {
        return m5094D0(str) ? super.mo4395s0(str, obj, z10, false) : m4348J().mo4395s0(str, obj, z10, z11);
    }
}
