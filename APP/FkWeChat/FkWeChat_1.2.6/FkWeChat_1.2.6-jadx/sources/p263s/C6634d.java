package p263s;

import android.os.Parcel;
import android.util.Base64;
import p004a3.C0052p;
import p004a3.C0053q;
import p004a3.C0054r;
import p104h3.C2848a;
import p104h3.C2858k;
import p104h3.C2864q;
import p121i3.C3193w;
import p121i3.C3195y;
import p265s1.C7080g3;
import p265s1.C7128q1;
import p319w2.C9067f3;

/* JADX INFO: renamed from: s.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6634d {

    /* JADX INFO: renamed from: a */
    public Parcel f20768a = Parcel.obtain();

    /* JADX INFO: renamed from: a */
    public final void m26301a(byte b10) {
        this.f20768a.writeByte(b10);
    }

    /* JADX INFO: renamed from: b */
    public final void m26302b(float f10) {
        this.f20768a.writeFloat(f10);
    }

    /* JADX INFO: renamed from: c */
    public final void m26303c(int i10) {
        this.f20768a.writeInt(i10);
    }

    /* JADX INFO: renamed from: d */
    public final void m26304d(C0054r c0054r) {
        m26303c(c0054r.m202m());
    }

    /* JADX INFO: renamed from: e */
    public final void m26305e(C2858k c2858k) {
        m26303c(c2858k.m10236e());
    }

    /* JADX INFO: renamed from: f */
    public final void m26306f(C2864q c2864q) {
        m26302b(c2864q.m10271b());
        m26302b(c2864q.m10272c());
    }

    /* JADX INFO: renamed from: g */
    public final void m26307g(String str) {
        this.f20768a.writeString(str);
    }

    /* JADX INFO: renamed from: h */
    public final void m26308h(C7080g3 c7080g3) {
        m26313m(c7080g3.m27890c());
        m26302b(Float.intBitsToFloat((int) (c7080g3.m27891d() >> 32)));
        m26302b(Float.intBitsToFloat((int) (c7080g3.m27891d() & 4294967295L)));
        m26302b(c7080g3.m27889b());
    }

    /* JADX INFO: renamed from: i */
    public final void m26309i(C9067f3 c9067f3) {
        long jM35239g = c9067f3.m35239g();
        C7128q1.a aVar = C7128q1.f23644b;
        if (!C7128q1.m28131q(jM35239g, aVar.m28147h())) {
            m26301a((byte) 1);
            m26313m(c9067f3.m35239g());
        }
        long jM35243k = c9067f3.m35243k();
        C3193w.a aVar2 = C3193w.f8489b;
        if (!C3193w.m12100e(jM35243k, aVar2.m12108a())) {
            m26301a((byte) 2);
            m26310j(c9067f3.m35243k());
        }
        C0054r c0054rM35246n = c9067f3.m35246n();
        if (c0054rM35246n != null) {
            m26301a((byte) 3);
            m26304d(c0054rM35246n);
        }
        C0052p c0052pM35244l = c9067f3.m35244l();
        if (c0052pM35244l != null) {
            int iM176i = c0052pM35244l.m176i();
            m26301a((byte) 4);
            m26315o(iM176i);
        }
        C0053q c0053qM35245m = c9067f3.m35245m();
        if (c0053qM35245m != null) {
            int iM189k = c0053qM35245m.m189k();
            m26301a((byte) 5);
            m26312l(iM189k);
        }
        String strM35242j = c9067f3.m35242j();
        if (strM35242j != null) {
            m26301a((byte) 6);
            m26307g(strM35242j);
        }
        if (!C3193w.m12100e(c9067f3.m35247o(), aVar2.m12108a())) {
            m26301a((byte) 7);
            m26310j(c9067f3.m35247o());
        }
        C2848a c2848aM35237e = c9067f3.m35237e();
        if (c2848aM35237e != null) {
            float fM10099h = c2848aM35237e.m10099h();
            m26301a((byte) 8);
            m26311k(fM10099h);
        }
        C2864q c2864qM35253u = c9067f3.m35253u();
        if (c2864qM35253u != null) {
            m26301a((byte) 9);
            m26306f(c2864qM35253u);
        }
        if (!C7128q1.m28131q(c9067f3.m35236d(), aVar.m28147h())) {
            m26301a((byte) 10);
            m26313m(c9067f3.m35236d());
        }
        C2858k c2858kM35251s = c9067f3.m35251s();
        if (c2858kM35251s != null) {
            m26301a((byte) 11);
            m26305e(c2858kM35251s);
        }
        C7080g3 c7080g3M35250r = c9067f3.m35250r();
        if (c7080g3M35250r != null) {
            m26301a((byte) 12);
            m26308h(c7080g3M35250r);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m26310j(long j10) {
        long jM12102g = C3193w.m12102g(j10);
        C3195y.a aVar = C3195y.f8493b;
        byte b10 = 0;
        if (!C3195y.m12123g(jM12102g, aVar.m12129c())) {
            if (C3195y.m12123g(jM12102g, aVar.m12128b())) {
                b10 = 1;
            } else if (C3195y.m12123g(jM12102g, aVar.m12127a())) {
                b10 = 2;
            }
        }
        m26301a(b10);
        if (C3195y.m12123g(C3193w.m12102g(j10), aVar.m12129c())) {
            return;
        }
        m26302b(C3193w.m12103h(j10));
    }

    /* JADX INFO: renamed from: k */
    public final void m26311k(float f10) {
        m26302b(f10);
    }

    /* JADX INFO: renamed from: l */
    public final void m26312l(int i10) {
        C0053q.a aVar = C0053q.f103b;
        byte b10 = 0;
        if (!C0053q.m186h(i10, aVar.m191b())) {
            if (C0053q.m186h(i10, aVar.m190a())) {
                b10 = 1;
            } else if (C0053q.m186h(i10, aVar.m193d())) {
                b10 = 2;
            } else if (C0053q.m186h(i10, aVar.m192c())) {
                b10 = 3;
            }
        }
        m26301a(b10);
    }

    /* JADX INFO: renamed from: m */
    public final void m26313m(long j10) {
        m26314n(j10);
    }

    /* JADX INFO: renamed from: n */
    public final void m26314n(long j10) {
        this.f20768a.writeLong(j10);
    }

    /* JADX INFO: renamed from: o */
    public final void m26315o(int i10) {
        C0052p.a aVar = C0052p.f99b;
        byte b10 = 0;
        if (!C0052p.m173f(i10, aVar.m178b()) && C0052p.m173f(i10, aVar.m177a())) {
            b10 = 1;
        }
        m26301a(b10);
    }

    /* JADX INFO: renamed from: p */
    public final String m26316p() {
        return Base64.encodeToString(this.f20768a.marshall(), 0);
    }

    /* JADX INFO: renamed from: q */
    public final void m26317q() {
        this.f20768a.recycle();
        this.f20768a = Parcel.obtain();
    }
}
