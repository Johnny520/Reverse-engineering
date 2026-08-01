package p074f3;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import java.util.ArrayList;
import java.util.List;
import p004a3.AbstractC0042h;
import p004a3.C0052p;
import p004a3.C0053q;
import p004a3.C0054r;
import p010a9.InterfaceC0189q;
import p010a9.InterfaceC0190r;
import p043d3.C1869e;
import p049d9.AbstractC1927c;
import p092g3.C2512a;
import p092g3.C2515d;
import p104h3.C2848a;
import p104h3.C2855h;
import p104h3.C2858k;
import p104h3.C2864q;
import p104h3.C2866s;
import p121i3.AbstractC3194x;
import p121i3.C3193w;
import p121i3.C3195y;
import p121i3.InterfaceC3175e;
import p172l8.C4700i0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;
import p215oc.C5729x;
import p265s1.AbstractC7070e3;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7138s1;
import p265s1.C7080g3;
import p265s1.C7100k3;
import p290u1.AbstractC8488g;
import p299ub.AbstractC8625h0;
import p319w2.AbstractC9068g;
import p319w2.C9058e;
import p319w2.C9067f3;
import p319w2.C9147v3;
import p366z2.C9833a;
import p366z2.C9834b;
import p366z2.C9837e;
import p366z2.C9838f;
import p366z2.C9839g;
import p366z2.C9840h;
import p366z2.C9844l;
import p366z2.C9845m;
import p366z2.C9846n;
import p366z2.C9847o;

/* JADX INFO: renamed from: f3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2284d {
    /* JADX INFO: renamed from: A */
    public static final void m8303A(Spannable spannable, C2866s c2866s, float f10, InterfaceC3175e interfaceC3175e) {
        if (c2866s != null) {
            if ((C3193w.m12100e(c2866s.m10276b(), AbstractC3194x.m12114f(0)) && C3193w.m12100e(c2866s.m10277c(), AbstractC3194x.m12114f(0))) || C3193w.m12101f(c2866s.m10276b()) == 0 || C3193w.m12101f(c2866s.m10277c()) == 0) {
                return;
            }
            long jM12102g = C3193w.m12102g(c2866s.m10276b());
            C3195y.a aVar = C3195y.f8493b;
            float fM12103h = 0.0f;
            float fMo1226O1 = C3195y.m12123g(jM12102g, aVar.m12128b()) ? interfaceC3175e.mo1226O1(c2866s.m10276b()) : C3195y.m12123g(jM12102g, aVar.m12127a()) ? C3193w.m12103h(c2866s.m10276b()) * f10 : 0.0f;
            long jM12102g2 = C3193w.m12102g(c2866s.m10277c());
            if (C3195y.m12123g(jM12102g2, aVar.m12128b())) {
                fM12103h = interfaceC3175e.mo1226O1(c2866s.m10277c());
            } else if (C3195y.m12123g(jM12102g2, aVar.m12127a())) {
                fM12103h = C3193w.m12103h(c2866s.m10277c()) * f10;
            }
            m8326w(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo1226O1), (int) Math.ceil(fM12103h)), 0, spannable.length());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m8304a(Spannable spannable, InterfaceC0190r interfaceC0190r, C9067f3 c9067f3, int i10, int i11) {
        AbstractC0042h abstractC0042hM35241i = c9067f3.m35241i();
        C0054r c0054rM35246n = c9067f3.m35246n();
        if (c0054rM35246n == null) {
            c0054rM35246n = C0054r.f120r.m207e();
        }
        C0052p c0052pM35244l = c9067f3.m35244l();
        C0052p c0052pM170c = C0052p.m170c(c0052pM35244l != null ? c0052pM35244l.m176i() : C0052p.f99b.m178b());
        C0053q c0053qM35245m = c9067f3.m35245m();
        spannable.setSpan(new C9847o((Typeface) interfaceC0190r.mo284p(abstractC0042hM35241i, c0054rM35246n, c0052pM170c, C0053q.m183e(c0053qM35245m != null ? c0053qM35245m.m189k() : C0053q.f103b.m190a()))), i10, i11, 33);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final MetricAffectingSpan m8305b(long j10, InterfaceC3175e interfaceC3175e) {
        long jM12102g = C3193w.m12102g(j10);
        C3195y.a aVar = C3195y.f8493b;
        if (C3195y.m12123g(jM12102g, aVar.m12128b())) {
            return new C9838f(interfaceC3175e.mo1226O1(j10));
        }
        if (C3195y.m12123g(jM12102g, aVar.m12127a())) {
            return new C9837e(C3193w.m12103h(j10));
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m8306c(C9067f3 c9067f3, List list, InterfaceC0189q interfaceC0189q) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            interfaceC0189q.mo236e(m8310g(c9067f3, (C9067f3) ((C9058e.d) list.get(0)).m35192g()), Integer.valueOf(((C9058e.d) list.get(0)).m35193h()), Integer.valueOf(((C9058e.d) list.get(0)).m35191f()));
            return;
        }
        int size = list.size();
        int i10 = size * 2;
        int[] iArr = new int[i10];
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C9058e.d dVar = (C9058e.d) list.get(i11);
            iArr[i11] = dVar.m35193h();
            iArr[i11 + size] = dVar.m35191f();
        }
        AbstractC5102r.m20646F(iArr);
        int iM20714W = AbstractC5106t.m20714W(iArr);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            if (i13 != iM20714W) {
                int size3 = list.size();
                C9067f3 c9067f3M8310g = c9067f3;
                for (int i14 = 0; i14 < size3; i14++) {
                    C9058e.d dVar2 = (C9058e.d) list.get(i14);
                    if (dVar2.m35193h() != dVar2.m35191f() && AbstractC9068g.m35266j(iM20714W, i13, dVar2.m35193h(), dVar2.m35191f())) {
                        c9067f3M8310g = m8310g(c9067f3M8310g, (C9067f3) dVar2.m35192g());
                    }
                }
                if (c9067f3M8310g != null) {
                    interfaceC0189q.mo236e(c9067f3M8310g, Integer.valueOf(iM20714W), Integer.valueOf(i13));
                }
                iM20714W = i13;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m8307d(C9067f3 c9067f3) {
        long jM12102g = C3193w.m12102g(c9067f3.m35247o());
        C3195y.a aVar = C3195y.f8493b;
        return C3195y.m12123g(jM12102g, aVar.m12128b()) || C3195y.m12123g(C3193w.m12102g(c9067f3.m35247o()), aVar.m12127a());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m8308e(C9147v3 c9147v3) {
        return AbstractC2285e.m8333d(c9147v3.m35552O()) || c9147v3.m35564n() != null;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m8309f(InterfaceC3175e interfaceC3175e) {
        return ((double) interfaceC3175e.mo1231c1()) > 1.05d;
    }

    /* JADX INFO: renamed from: g */
    public static final C9067f3 m8310g(C9067f3 c9067f3, C9067f3 c9067f32) {
        return c9067f3 == null ? c9067f32 : c9067f3.m35256x(c9067f32);
    }

    /* JADX INFO: renamed from: h */
    public static final float m8311h(long j10, float f10, InterfaceC3175e interfaceC3175e) {
        float fM12103h;
        long jM12102g = C3193w.m12102g(j10);
        C3195y.a aVar = C3195y.f8493b;
        if (C3195y.m12123g(jM12102g, aVar.m12128b())) {
            if (!m8309f(interfaceC3175e)) {
                return interfaceC3175e.mo1226O1(j10);
            }
            fM12103h = C3193w.m12103h(j10) / C3193w.m12103h(interfaceC3175e.mo1223J0(f10));
        } else {
            if (!C3195y.m12123g(jM12102g, aVar.m12127a())) {
                return Float.NaN;
            }
            fM12103h = C3193w.m12103h(j10);
        }
        return fM12103h * f10;
    }

    /* JADX INFO: renamed from: i */
    public static final void m8312i(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            m8326w(spannable, new BackgroundColorSpan(AbstractC7138s1.m28205i(j10)), i10, i11);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8313j(Spannable spannable, C2848a c2848a, int i10, int i11) {
        if (c2848a != null) {
            m8326w(spannable, new C9833a(c2848a.m10099h()), i10, i11);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m8314k(Spannable spannable, AbstractC7078g1 abstractC7078g1, float f10, int i10, int i11) {
        if (abstractC7078g1 != null) {
            if (abstractC7078g1 instanceof C7100k3) {
                m8316m(spannable, ((C7100k3) abstractC7078g1).m27984b(), i10, i11);
            } else if (abstractC7078g1 instanceof AbstractC7070e3) {
                m8326w(spannable, new C2515d((AbstractC7070e3) abstractC7078g1, f10), i10, i11);
            } else {
                C5729x.m23182a();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m8315l(Spannable spannable, List list, float f10, InterfaceC3175e interfaceC3175e, C2866s c2866s) {
        if (c2866s != null) {
            long jM12102g = C3193w.m12102g(c2866s.m10276b());
            C3195y.a aVar = C3195y.f8493b;
            if (C3195y.m12123g(jM12102g, aVar.m12128b())) {
                interfaceC3175e.mo1226O1(c2866s.m10276b());
            } else if (C3195y.m12123g(jM12102g, aVar.m12127a())) {
                C3193w.m12103h(c2866s.m10276b());
            }
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C9058e.d) list.get(i10)).m35192g();
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m8316m(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            m8326w(spannable, new ForegroundColorSpan(AbstractC7138s1.m28205i(j10)), i10, i11);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m8317n(Spannable spannable, AbstractC8488g abstractC8488g, int i10, int i11) {
        if (abstractC8488g != null) {
            m8326w(spannable, new C2512a(abstractC8488g), i10, i11);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m8318o(final Spannable spannable, C9147v3 c9147v3, List list, final InterfaceC0190r interfaceC0190r) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9058e.d dVar = (C9058e.d) list.get(i10);
            if ((dVar.m35192g() instanceof C9067f3) && (AbstractC2285e.m8333d((C9067f3) dVar.m35192g()) || ((C9067f3) dVar.m35192g()).m35245m() != null)) {
                dVar.getClass();
                arrayList.add(dVar);
            }
        }
        m8306c(m8308e(c9147v3) ? new C9067f3(0L, 0L, c9147v3.m35565o(), c9147v3.m35563m(), c9147v3.m35564n(), c9147v3.m35560j(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList, new InterfaceC0189q() { // from class: f3.c
            @Override // p010a9.InterfaceC0189q
            /* JADX INFO: renamed from: e */
            public final Object mo236e(Object obj, Object obj2, Object obj3) {
                return AbstractC2284d.m8304a(spannable, interfaceC0190r, (C9067f3) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static final void m8319p(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            m8326w(spannable, new C9834b(str), i10, i11);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m8320q(Spannable spannable, long j10, InterfaceC3175e interfaceC3175e, int i10, int i11) {
        long jM12102g = C3193w.m12102g(j10);
        C3195y.a aVar = C3195y.f8493b;
        if (C3195y.m12123g(jM12102g, aVar.m12128b())) {
            m8326w(spannable, new AbsoluteSizeSpan(AbstractC1927c.m6980d(interfaceC3175e.mo1226O1(j10)), false), i10, i11);
        } else if (C3195y.m12123g(jM12102g, aVar.m12127a())) {
            m8326w(spannable, new RelativeSizeSpan(C3193w.m12103h(j10)), i10, i11);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m8321r(Spannable spannable, C2864q c2864q, int i10, int i11) {
        if (c2864q != null) {
            m8326w(spannable, new ScaleXSpan(c2864q.m10271b()), i10, i11);
            m8326w(spannable, new C9845m(c2864q.m10272c()), i10, i11);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m8322s(Spannable spannable, long j10, float f10, InterfaceC3175e interfaceC3175e, C2855h c2855h) {
        float fM8311h = m8311h(j10, f10, interfaceC3175e);
        if (Float.isNaN(fM8311h)) {
            return;
        }
        m8326w(spannable, new C9840h(fM8311h, 0, (spannable.length() == 0 || AbstractC8625h0.m33180z1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), C2855h.d.m10204h(c2855h.m10171d()), C2855h.d.m10205i(c2855h.m10171d()), c2855h.m10169b(), c2855h.m10170c(), null), 0, spannable.length());
    }

    /* JADX INFO: renamed from: t */
    public static final void m8323t(Spannable spannable, long j10, float f10, InterfaceC3175e interfaceC3175e) {
        float fM8311h = m8311h(j10, f10, interfaceC3175e);
        if (Float.isNaN(fM8311h)) {
            return;
        }
        m8326w(spannable, new C9839g(fM8311h), 0, spannable.length());
    }

    /* JADX INFO: renamed from: u */
    public static final void m8324u(Spannable spannable, C1869e c1869e, int i10, int i11) {
        if (c1869e != null) {
            m8326w(spannable, C2281a.f6258a.m8297a(c1869e), i10, i11);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m8325v(Spannable spannable, C7080g3 c7080g3, int i10, int i11) {
        if (c7080g3 != null) {
            m8326w(spannable, new C9844l(AbstractC7138s1.m28205i(c7080g3.m27890c()), Float.intBitsToFloat((int) (c7080g3.m27891d() >> 32)), Float.intBitsToFloat((int) (c7080g3.m27891d() & 4294967295L)), AbstractC2285e.m8331b(c7080g3.m27889b())), i10, i11);
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m8326w(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    /* JADX INFO: renamed from: x */
    public static final void m8327x(Spannable spannable, C9067f3 c9067f3, int i10, int i11, InterfaceC3175e interfaceC3175e) {
        m8313j(spannable, c9067f3.m35237e(), i10, i11);
        m8316m(spannable, c9067f3.m35239g(), i10, i11);
        m8314k(spannable, c9067f3.m35238f(), c9067f3.m35235c(), i10, i11);
        m8329z(spannable, c9067f3.m35251s(), i10, i11);
        m8320q(spannable, c9067f3.m35243k(), interfaceC3175e, i10, i11);
        m8319p(spannable, c9067f3.m35242j(), i10, i11);
        m8321r(spannable, c9067f3.m35253u(), i10, i11);
        m8324u(spannable, c9067f3.m35248p(), i10, i11);
        m8312i(spannable, c9067f3.m35236d(), i10, i11);
        m8325v(spannable, c9067f3.m35250r(), i10, i11);
        m8317n(spannable, c9067f3.m35240h(), i10, i11);
    }

    /* JADX INFO: renamed from: y */
    public static final void m8328y(Spannable spannable, C9147v3 c9147v3, List list, InterfaceC3175e interfaceC3175e, InterfaceC0190r interfaceC0190r) {
        MetricAffectingSpan metricAffectingSpanM8305b;
        m8318o(spannable, c9147v3, list, interfaceC0190r);
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C9058e.d dVar = (C9058e.d) list.get(i10);
            if (dVar.m35192g() instanceof C9067f3) {
                int iM35193h = dVar.m35193h();
                int iM35191f = dVar.m35191f();
                if (iM35193h >= 0 && iM35193h < spannable.length() && iM35191f > iM35193h && iM35191f <= spannable.length()) {
                    m8327x(spannable, (C9067f3) dVar.m35192g(), iM35193h, iM35191f, interfaceC3175e);
                    if (m8307d((C9067f3) dVar.m35192g())) {
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C9058e.d dVar2 = (C9058e.d) list.get(i11);
                C9058e.a aVar = (C9058e.a) dVar2.m35192g();
                if (aVar instanceof C9067f3) {
                    int iM35193h2 = dVar2.m35193h();
                    int iM35191f2 = dVar2.m35191f();
                    if (iM35193h2 >= 0 && iM35193h2 < spannable.length() && iM35191f2 > iM35193h2 && iM35191f2 <= spannable.length() && (metricAffectingSpanM8305b = m8305b(((C9067f3) aVar).m35247o(), interfaceC3175e)) != null) {
                        m8326w(spannable, metricAffectingSpanM8305b, iM35193h2, iM35191f2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m8329z(Spannable spannable, C2858k c2858k, int i10, int i11) {
        if (c2858k != null) {
            C2858k.a aVar = C2858k.f7480b;
            m8326w(spannable, new C9846n(c2858k.m10235d(aVar.m10240d()), c2858k.m10235d(aVar.m10238b())), i10, i11);
        }
    }
}
