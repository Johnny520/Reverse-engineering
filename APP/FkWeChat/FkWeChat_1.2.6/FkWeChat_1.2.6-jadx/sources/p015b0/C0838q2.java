package p015b0;

import androidx.compose.runtime.AbstractC0570q4;
import androidx.compose.runtime.InterfaceC0498g2;
import p113hc.InterfaceC2974d;
import p117i.C3076o0;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.C6426b;
import p248r.C6427c;
import p248r.C6429e;
import p248r.C6430f;
import p248r.InterfaceC6431g;
import p248r.InterfaceC6432h;
import p248r.InterfaceC6436l;

/* JADX INFO: renamed from: b0.q2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0838q2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6432h f2642a;

    /* JADX INFO: renamed from: b */
    public final int f2643b = 1;

    /* JADX INFO: renamed from: c */
    public final int f2644c = 2;

    /* JADX INFO: renamed from: d */
    public final int f2645d = 4;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0498g2 f2646e = AbstractC0570q4.m2141a(0);

    /* JADX INFO: renamed from: b0.q2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2974d {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ C3076o0 f2647q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C0838q2 f2648r;

        public a(C3076o0 c3076o0, C0838q2 c0838q2) {
            this.f2647q = c3076o0;
            this.f2648r = c0838q2;
        }

        @Override // p113hc.InterfaceC2974d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object mo400a(InterfaceC6431g interfaceC6431g, InterfaceC5976f interfaceC5976f) {
            int i10;
            if ((interfaceC6431g instanceof C6429e) || (interfaceC6431g instanceof C6426b) || (interfaceC6431g instanceof InterfaceC6436l.b)) {
                this.f2647q.m11461n(interfaceC6431g);
            } else if (interfaceC6431g instanceof C6430f) {
                this.f2647q.m11473z(((C6430f) interfaceC6431g).m25461a());
            } else if (interfaceC6431g instanceof C6427c) {
                this.f2647q.m11473z(((C6427c) interfaceC6431g).m25458a());
            } else if (interfaceC6431g instanceof InterfaceC6436l.c) {
                this.f2647q.m11473z(((InterfaceC6436l.c) interfaceC6431g).m25469a());
            } else if (interfaceC6431g instanceof InterfaceC6436l.a) {
                this.f2647q.m11473z(((InterfaceC6436l.a) interfaceC6431g).m25467a());
            }
            C3076o0 c3076o0 = this.f2647q;
            C0838q2 c0838q2 = this.f2648r;
            Object[] objArr = c3076o0.f8235a;
            int i11 = c3076o0.f8236b;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                InterfaceC6431g interfaceC6431g2 = (InterfaceC6431g) objArr[i13];
                if (interfaceC6431g2 instanceof C6429e) {
                    i10 = c0838q2.f2644c;
                } else if (interfaceC6431g2 instanceof C6426b) {
                    i10 = c0838q2.f2643b;
                } else if (interfaceC6431g2 instanceof InterfaceC6436l.b) {
                    i10 = c0838q2.f2645d;
                }
                i12 |= i10;
            }
            this.f2648r.f2646e.mo1687j(i12);
            return C4700i0.f13910a;
        }
    }

    public C0838q2(InterfaceC6432h interfaceC6432h) {
        this.f2642a = interfaceC6432h;
    }

    /* JADX INFO: renamed from: e */
    public final Object m3152e(InterfaceC5976f interfaceC5976f) {
        Object objMo399b = this.f2642a.mo25462a().mo399b(new a(new C3076o0(0, 1, null), this), interfaceC5976f);
        return objMo399b == AbstractC6325c.m24992g() ? objMo399b : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3153f() {
        return (this.f2646e.mo1686f() & this.f2643b) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3154g() {
        return (this.f2646e.mo1686f() & this.f2644c) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3155h() {
        return (this.f2646e.mo1686f() & this.f2645d) != 0;
    }
}
