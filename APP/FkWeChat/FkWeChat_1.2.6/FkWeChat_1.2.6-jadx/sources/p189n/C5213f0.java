package p189n;

import android.view.KeyEvent;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p073f2.AbstractC2263r;
import p073f2.AbstractC2278y0;
import p073f2.C2236d0;
import p073f2.C2261q;
import p073f2.EnumC2265s;
import p073f2.InterfaceC2229a1;
import p073f2.InterfaceC2254m0;
import p166l2.AbstractC4549i;
import p166l2.AbstractC4557k;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p179m2.AbstractC4870l1;
import p179m2.InterfaceC4862j3;
import p189n.C5213f0;
import p219p.AbstractC5896v1;
import p219p.InterfaceC5901x0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.InterfaceC6434j;
import p250r1.C6455e;
import p250r1.C6461k;
import p257r8.AbstractC6544m;
import p277t2.C8079k;
import p376zd.C10010p0;

/* JADX INFO: renamed from: n.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5213f0 extends AbstractC5197c {

    /* JADX INFO: renamed from: d0 */
    public final boolean f16012d0;

    /* JADX INFO: renamed from: e0 */
    public C2236d0 f16013e0;

    /* JADX INFO: renamed from: n.f0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: n.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10159a extends AbstractC6544m implements InterfaceC0189q {

            /* JADX INFO: renamed from: q */
            public int f16015q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ Object f16016r;

            /* JADX INFO: renamed from: s */
            public /* synthetic */ long f16017s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ C5213f0 f16018t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10159a(C5213f0 c5213f0, InterfaceC5976f interfaceC5976f) {
                super(3, interfaceC5976f);
                this.f16018t = c5213f0;
            }

            @Override // p010a9.InterfaceC0189q
            /* JADX INFO: renamed from: e */
            public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
                return m21390r((InterfaceC5901x0) obj, ((C6455e) obj2).m25566t(), (InterfaceC5976f) obj3);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f16015q;
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    InterfaceC5901x0 interfaceC5901x0 = (InterfaceC5901x0) this.f16016r;
                    long j10 = this.f16017s;
                    if (this.f16018t.m21307c3()) {
                        C5213f0 c5213f0 = this.f16018t;
                        this.f16015q = 1;
                        if (c5213f0.m21309e3(interfaceC5901x0, j10, this) == objM24992g) {
                            return objM24992g;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC4713t.m18808b(obj);
                }
                return C4700i0.f13910a;
            }

            /* JADX INFO: renamed from: r */
            public final Object m21390r(InterfaceC5901x0 interfaceC5901x0, long j10, InterfaceC5976f interfaceC5976f) {
                C10159a c10159a = new C10159a(this.f16018t, interfaceC5976f);
                c10159a.f16016r = interfaceC5901x0;
                c10159a.f16017s = j10;
                return c10159a.invokeSuspend(C4700i0.f13910a);
            }
        }

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public static C4700i0 m21389a(C5213f0 c5213f0, C6455e c6455e) {
            if (c5213f0.m21307c3()) {
                c5213f0.m21308d3().invoke();
            }
            return C4700i0.f13910a;
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC2254m0 interfaceC2254m0, InterfaceC5976f interfaceC5976f) {
            C10159a c10159a = new C10159a(C5213f0.this, null);
            final C5213f0 c5213f0 = C5213f0.this;
            Object objM23780k = AbstractC5896v1.m23780k(interfaceC2254m0, c10159a, new InterfaceC0184l() { // from class: n.e0
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C5213f0.a.m21389a(c5213f0, (C6455e) obj);
                }
            }, interfaceC5976f);
            return objM23780k == AbstractC6325c.m24992g() ? objM23780k : C4700i0.f13910a;
        }
    }

    public C5213f0(InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, String str, C8079k c8079k, InterfaceC0173a interfaceC0173a) {
        super(interfaceC6434j, interfaceC5279s1, z10, z11, str, c8079k, interfaceC0173a, null);
        this.f16012d0 = (C5258o0.f16159c && C5258o0.f16168l) ? false : true;
    }

    @Override // p189n.AbstractC5197c, p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: A0 */
    public void mo8047A0(C2261q c2261q, EnumC2265s enumC2265s, long j10) {
        super.mo8047A0(c2261q, enumC2265s, j10);
        if (this.f16012d0) {
            return;
        }
        int i10 = 0;
        if (enumC2265s != EnumC2265s.f6226r) {
            if (enumC2265s != EnumC2265s.f6227s || this.f16013e0 == null) {
                return;
            }
            List listM8216c = c2261q.m8216c();
            int size = listM8216c.size();
            while (i10 < size) {
                C2236d0 c2236d0 = (C2236d0) listM8216c.get(i10);
                if (c2236d0.m8085p() && !AbstractC1061t.m3842c(c2236d0, this.f16013e0)) {
                    this.f16013e0 = null;
                    m21310f3();
                    return;
                }
                i10++;
            }
            return;
        }
        C2236d0 c2236d02 = this.f16013e0;
        if (c2236d02 == null) {
            if (AbstractC5896v1.m23785p(c2261q, true, false, 2, null)) {
                C2236d0 c2236d03 = (C2236d0) c2261q.m8216c().get(0);
                c2236d03.m8071a();
                this.f16013e0 = c2236d03;
                if (m21307c3()) {
                    m21312h3(c2236d03.m8077h());
                    return;
                }
                return;
            }
            return;
        }
        List listM8216c2 = c2261q.m8216c();
        int size2 = listM8216c2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (!AbstractC2263r.m8230c((C2236d0) listM8216c2.get(i11))) {
                long jM21387r3 = m21387r3(j10);
                List listM8216c3 = c2261q.m8216c();
                int size3 = listM8216c3.size();
                while (i10 < size3) {
                    C2236d0 c2236d04 = (C2236d0) listM8216c3.get(i10);
                    if (c2236d04.m8085p() || AbstractC2263r.m8233f(c2236d04, j10, jM21387r3)) {
                        this.f16013e0 = null;
                        m21310f3();
                        return;
                    }
                    i10++;
                }
                return;
            }
        }
        ((C2236d0) c2261q.m8216c().get(0)).m8071a();
        if (m21307c3()) {
            m21311g3(c2236d02.m8077h());
            m21308d3().invoke();
        }
        this.f16013e0 = null;
    }

    @Override // p189n.AbstractC5197c, p166l2.InterfaceC4598w1
    /* JADX INFO: renamed from: G0 */
    public void mo8048G0() {
        super.mo8048G0();
        if (this.f16013e0 != null) {
            this.f16013e0 = null;
            m21310f3();
        }
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: X2 */
    public InterfaceC2229a1 mo21302X2() {
        if (this.f16012d0) {
            return AbstractC2278y0.m8288a(new a());
        }
        return null;
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: k3 */
    public final boolean mo21315k3(KeyEvent keyEvent) {
        return false;
    }

    @Override // p189n.AbstractC5197c
    /* JADX INFO: renamed from: l3 */
    public final boolean mo21316l3(KeyEvent keyEvent) {
        m21308d3().invoke();
        return true;
    }

    /* JADX INFO: renamed from: r3 */
    public final long m21387r3(long j10) {
        long jMo1224J1 = AbstractC4557k.m18011m(this).mo1224J1(((InterfaceC4862j3) AbstractC4549i.m17816a(this, AbstractC4870l1.m19454s())).mo17980e());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo1224J1 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        return C6461k.m25616d((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1224J1 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    /* JADX INFO: renamed from: s3 */
    public final void m21388s3(InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, String str, C8079k c8079k, InterfaceC0173a interfaceC0173a) {
        m21321q3(interfaceC6434j, interfaceC5279s1, z10, z11, str, c8079k, interfaceC0173a);
    }

    public /* synthetic */ C5213f0(InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, String str, C8079k c8079k, InterfaceC0173a interfaceC0173a, AbstractC1043k abstractC1043k) {
        this(interfaceC6434j, interfaceC5279s1, z10, z11, str, c8079k, interfaceC0173a);
    }
}
