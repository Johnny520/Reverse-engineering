package p189n;

import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.AbstractC0570q4;
import androidx.compose.runtime.InterfaceC0498g2;
import androidx.compose.runtime.InterfaceC0564p5;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p102h1.AbstractC2819a0;
import p102h1.InterfaceC2821b0;
import p102h1.InterfaceC2843x;
import p119i1.AbstractC3137l;
import p172l8.C4700i0;
import p219p.AbstractC5887s1;
import p219p.InterfaceC5881q1;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p248r.AbstractC6433i;
import p248r.InterfaceC6434j;

/* JADX INFO: renamed from: n.g3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5221g3 implements InterfaceC5881q1 {

    /* JADX INFO: renamed from: i */
    public static final a f16035i = new a(null);

    /* JADX INFO: renamed from: j */
    public static final InterfaceC2843x f16036j = AbstractC2819a0.m10035c(new InterfaceC0188p() { // from class: n.e3
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C5221g3.m21408h((InterfaceC2821b0) obj, (C5221g3) obj2);
        }
    }, new InterfaceC0184l() { // from class: n.f3
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C5221g3.m21409i(((Integer) obj).intValue());
        }
    });

    /* JADX INFO: renamed from: a */
    public final InterfaceC0498g2 f16037a;

    /* JADX INFO: renamed from: e */
    public float f16041e;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0498g2 f16038b = AbstractC0570q4.m2141a(0);

    /* JADX INFO: renamed from: c */
    public final InterfaceC6434j f16039c = AbstractC6433i.m25463a();

    /* JADX INFO: renamed from: d */
    public InterfaceC0498g2 f16040d = AbstractC0570q4.m2141a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f */
    public final InterfaceC5881q1 f16042f = AbstractC5887s1.m23707b(new InterfaceC0184l() { // from class: n.b3
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return Float.valueOf(C5221g3.m21407g(this.f15841q, ((Float) obj).floatValue()));
        }
    });

    /* JADX INFO: renamed from: g */
    public final InterfaceC0564p5 f16043g = AbstractC0473c5.m1565d(new InterfaceC0173a() { // from class: n.c3
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return Boolean.valueOf(C5221g3.m21411k(this.f15939q));
        }
    });

    /* JADX INFO: renamed from: h */
    public final InterfaceC0564p5 f16044h = AbstractC0473c5.m1565d(new InterfaceC0173a() { // from class: n.d3
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return Boolean.valueOf(C5221g3.m21410j(this.f16001q));
        }
    });

    public C5221g3(int i10) {
        this.f16037a = AbstractC0570q4.m2141a(i10);
    }

    /* JADX INFO: renamed from: g */
    public static float m21407g(C5221g3 c5221g3, float f10) {
        float fM21415o = c5221g3.m21415o() + f10 + c5221g3.f16041e;
        float fM8585l = AbstractC2368o.m8585l(fM21415o, 0.0f, c5221g3.m21414n());
        boolean z10 = fM21415o == fM8585l;
        float fM21415o2 = fM8585l - c5221g3.m21415o();
        int iRound = Math.round(fM21415o2);
        c5221g3.m21417q(c5221g3.m21415o() + iRound);
        c5221g3.f16041e = fM21415o2 - iRound;
        return !z10 ? fM21415o2 : f10;
    }

    /* JADX INFO: renamed from: h */
    public static Integer m21408h(InterfaceC2821b0 interfaceC2821b0, C5221g3 c5221g3) {
        return Integer.valueOf(c5221g3.m21415o());
    }

    /* JADX INFO: renamed from: i */
    public static C5221g3 m21409i(int i10) {
        return new C5221g3(i10);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m21410j(C5221g3 c5221g3) {
        return c5221g3.m21415o() > 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m21411k(C5221g3 c5221g3) {
        return c5221g3.m21415o() < c5221g3.m21414n();
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: a */
    public boolean mo2977a() {
        return this.f16042f.mo2977a();
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: b */
    public boolean mo2978b() {
        return ((Boolean) this.f16044h.getValue()).booleanValue();
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: c */
    public Object mo2979c(EnumC5190a2 enumC5190a2, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        Object objMo2979c = this.f16042f.mo2979c(enumC5190a2, interfaceC0188p, interfaceC5976f);
        return objMo2979c == AbstractC6325c.m24992g() ? objMo2979c : C4700i0.f13910a;
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: e */
    public boolean mo2980e() {
        return ((Boolean) this.f16043g.getValue()).booleanValue();
    }

    @Override // p219p.InterfaceC5881q1
    /* JADX INFO: renamed from: f */
    public float mo2981f(float f10) {
        return this.f16042f.mo2981f(f10);
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC6434j m21413m() {
        return this.f16039c;
    }

    /* JADX INFO: renamed from: n */
    public final int m21414n() {
        return this.f16040d.mo1686f();
    }

    /* JADX INFO: renamed from: o */
    public final int m21415o() {
        return this.f16037a.mo1686f();
    }

    /* JADX INFO: renamed from: p */
    public final void m21416p(int i10) {
        this.f16040d.mo1687j(i10);
        AbstractC3137l.a aVar = AbstractC3137l.f8345e;
        AbstractC3137l abstractC3137lM11765d = aVar.m11765d();
        InterfaceC0184l interfaceC0184lMo11676g = abstractC3137lM11765d != null ? abstractC3137lM11765d.mo11676g() : null;
        AbstractC3137l abstractC3137lM11767f = aVar.m11767f(abstractC3137lM11765d);
        try {
            if (m21415o() > i10) {
                m21417q(i10);
            }
            C4700i0 c4700i0 = C4700i0.f13910a;
            aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
        } catch (Throwable th) {
            aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m21417q(int i10) {
        this.f16037a.mo1687j(i10);
    }

    /* JADX INFO: renamed from: r */
    public final void m21418r(int i10) {
        this.f16038b.mo1687j(i10);
    }

    /* JADX INFO: renamed from: n.g3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2843x m21419a() {
            return C5221g3.f16036j;
        }

        public a() {
        }
    }
}
