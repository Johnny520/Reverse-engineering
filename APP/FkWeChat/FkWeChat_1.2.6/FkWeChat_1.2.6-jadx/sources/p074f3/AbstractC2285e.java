package p074f3;

import android.graphics.Typeface;
import okhttp3.internal.url._UrlKt;
import p004a3.AbstractC0042h;
import p004a3.C0052p;
import p004a3.C0053q;
import p004a3.C0054r;
import p010a9.InterfaceC0190r;
import p024b9.AbstractC1061t;
import p043d3.C1869e;
import p059e3.C2014i;
import p104h3.C2848a;
import p104h3.C2864q;
import p104h3.C2868u;
import p121i3.C3193w;
import p121i3.C3195y;
import p121i3.InterfaceC3175e;
import p250r1.C6461k;
import p265s1.C7128q1;
import p319w2.C9067f3;

/* JADX INFO: renamed from: f3.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2285e {
    /* JADX INFO: renamed from: a */
    public static final C9067f3 m8330a(C2014i c2014i, C9067f3 c9067f3, InterfaceC0190r interfaceC0190r, InterfaceC3175e interfaceC3175e, boolean z10) {
        long jM12102g = C3193w.m12102g(c9067f3.m35243k());
        C3195y.a aVar = C3195y.f8493b;
        if (C3195y.m12123g(jM12102g, aVar.m12128b())) {
            c2014i.setTextSize(interfaceC3175e.mo1226O1(c9067f3.m35243k()));
        } else if (C3195y.m12123g(jM12102g, aVar.m12127a())) {
            c2014i.setTextSize(c2014i.getTextSize() * C3193w.m12103h(c9067f3.m35243k()));
        }
        if (m8333d(c9067f3)) {
            AbstractC0042h abstractC0042hM35241i = c9067f3.m35241i();
            C0054r c0054rM35246n = c9067f3.m35246n();
            if (c0054rM35246n == null) {
                c0054rM35246n = C0054r.f120r.m207e();
            }
            C0052p c0052pM35244l = c9067f3.m35244l();
            C0052p c0052pM170c = C0052p.m170c(c0052pM35244l != null ? c0052pM35244l.m176i() : C0052p.f99b.m178b());
            C0053q c0053qM35245m = c9067f3.m35245m();
            c2014i.setTypeface((Typeface) interfaceC0190r.mo284p(abstractC0042hM35241i, c0054rM35246n, c0052pM170c, C0053q.m183e(c0053qM35245m != null ? c0053qM35245m.m189k() : C0053q.f103b.m190a())));
        }
        if (c9067f3.m35248p() != null && !AbstractC1061t.m3842c(c9067f3.m35248p(), C1869e.f5201s.m6633a())) {
            C2281a.f6258a.m8298b(c2014i, c9067f3.m35248p());
        }
        if (c9067f3.m35242j() != null && !AbstractC1061t.m3842c(c9067f3.m35242j(), _UrlKt.FRAGMENT_ENCODE_SET)) {
            c2014i.setFontFeatureSettings(c9067f3.m35242j());
        }
        if (c9067f3.m35253u() != null && !AbstractC1061t.m3842c(c9067f3.m35253u(), C2864q.f7498c.m10273a())) {
            c2014i.setTextScaleX(c2014i.getTextScaleX() * c9067f3.m35253u().m10271b());
            c2014i.setTextSkewX(c2014i.getTextSkewX() + c9067f3.m35253u().m10272c());
        }
        c2014i.m7278g(c9067f3.m35239g());
        c2014i.m7277f(c9067f3.m35238f(), C6461k.f20335b.m25626a(), c9067f3.m35235c());
        c2014i.m7280i(c9067f3.m35250r());
        c2014i.m7281j(c9067f3.m35251s());
        c2014i.m7279h(c9067f3.m35240h());
        if (C3195y.m12123g(C3193w.m12102g(c9067f3.m35247o()), aVar.m12128b()) && C3193w.m12103h(c9067f3.m35247o()) != 0.0f) {
            float textSize = c2014i.getTextSize() * c2014i.getTextScaleX();
            float fMo1226O1 = interfaceC3175e.mo1226O1(c9067f3.m35247o());
            if (textSize != 0.0f) {
                c2014i.setLetterSpacing(fMo1226O1 / textSize);
            }
        } else if (C3195y.m12123g(C3193w.m12102g(c9067f3.m35247o()), aVar.m12127a())) {
            c2014i.setLetterSpacing(C3193w.m12103h(c9067f3.m35247o()));
        }
        return m8332c(c9067f3.m35247o(), z10, c9067f3.m35236d(), c9067f3.m35237e());
    }

    /* JADX INFO: renamed from: b */
    public static final float m8331b(float f10) {
        if (f10 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f10;
    }

    /* JADX INFO: renamed from: c */
    public static final C9067f3 m8332c(long j10, boolean z10, long j11, C2848a c2848a) {
        long jM28147h = j11;
        boolean z11 = false;
        boolean z12 = z10 && C3195y.m12123g(C3193w.m12102g(j10), C3195y.f8493b.m12128b()) && C3193w.m12103h(j10) != 0.0f;
        C7128q1.a aVar = C7128q1.f23644b;
        boolean z13 = (C7128q1.m28131q(jM28147h, aVar.m28147h()) || C7128q1.m28131q(jM28147h, aVar.m28146g())) ? false : true;
        if (c2848a != null) {
            if (!C2848a.m10096e(c2848a.m10099h(), C2848a.f7410b.m10100a())) {
                z11 = true;
            }
        }
        if (!z12 && !z13 && !z11) {
            return null;
        }
        long jM12108a = z12 ? j10 : C3193w.f8489b.m12108a();
        if (!z13) {
            jM28147h = aVar.m28147h();
        }
        return new C9067f3(0L, 0L, null, null, null, null, null, jM12108a, z11 ? c2848a : null, null, null, jM28147h, null, null, null, null, 63103, null);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m8333d(C9067f3 c9067f3) {
        return (c9067f3.m35241i() == null && c9067f3.m35244l() == null && c9067f3.m35246n() == null) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static final void m8334e(C2014i c2014i, C2868u c2868u) {
        if (c2868u == null) {
            c2868u = C2868u.f7506c.m10283a();
        }
        c2014i.setFlags(c2868u.m10282c() ? c2014i.getFlags() | 128 : c2014i.getFlags() & (-129));
        int iM10281b = c2868u.m10281b();
        C2868u.b.a aVar = C2868u.b.f7511b;
        if (C2868u.b.m10290g(iM10281b, aVar.m10295b())) {
            c2014i.setFlags(c2014i.getFlags() | 64);
            c2014i.setHinting(0);
        } else if (C2868u.b.m10290g(iM10281b, aVar.m10294a())) {
            c2014i.getFlags();
            c2014i.setHinting(1);
        } else if (!C2868u.b.m10290g(iM10281b, aVar.m10296c())) {
            c2014i.getFlags();
        } else {
            c2014i.getFlags();
            c2014i.setHinting(0);
        }
    }
}
