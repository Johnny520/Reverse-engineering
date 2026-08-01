package p018b3;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p030c3.AbstractC1314a;
import p185m8.C5072d;
import p299ub.C8630l;
import p319w2.AbstractC9142u3;
import p319w2.C9058e;
import p319w2.C9137t3;

/* JADX INFO: renamed from: b3.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0963m {

    /* JADX INFO: renamed from: f */
    public static final a f2951f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final int f2952g = 8;

    /* JADX INFO: renamed from: a */
    public final C0958j0 f2953a;

    /* JADX INFO: renamed from: b */
    public int f2954b;

    /* JADX INFO: renamed from: c */
    public int f2955c;

    /* JADX INFO: renamed from: d */
    public int f2956d;

    /* JADX INFO: renamed from: e */
    public int f2957e;

    public C0963m(C9058e c9058e, long j10) {
        this.f2953a = new C0958j0(c9058e.m35156k());
        this.f2954b = C9137t3.m35521l(j10);
        this.f2955c = C9137t3.m35520k(j10);
        this.f2956d = -1;
        this.f2957e = -1;
        int iM35521l = C9137t3.m35521l(j10);
        int iM35520k = C9137t3.m35520k(j10);
        if (iM35521l < 0 || iM35521l > c9058e.length()) {
            C8630l.m33208a("start (", iM35521l, ") offset is outside of text region ", c9058e.length());
            throw null;
        }
        if (iM35520k < 0 || iM35520k > c9058e.length()) {
            C8630l.m33208a("end (", iM35520k, ") offset is outside of text region ", c9058e.length());
            throw null;
        }
        if (iM35521l <= iM35520k) {
            return;
        }
        C5072d.m20505a("Do not set reversed range: ", iM35521l, " > ", iM35520k);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3496a() {
        this.f2956d = -1;
        this.f2957e = -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m3497b(int i10, int i11) {
        long jM35530b = AbstractC9142u3.m35530b(i10, i11);
        this.f2953a.m3488c(i10, i11, _UrlKt.FRAGMENT_ENCODE_SET);
        long jM3523a = AbstractC0965n.m3523a(AbstractC9142u3.m35530b(this.f2954b, this.f2955c), jM35530b);
        m3513r(C9137t3.m35521l(jM3523a));
        m3512q(C9137t3.m35520k(jM3523a));
        if (m3507l()) {
            long jM3523a2 = AbstractC0965n.m3523a(AbstractC9142u3.m35530b(this.f2956d, this.f2957e), jM35530b);
            if (C9137t3.m35517h(jM3523a2)) {
                m3496a();
            } else {
                this.f2956d = C9137t3.m35521l(jM3523a2);
                this.f2957e = C9137t3.m35520k(jM3523a2);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final char m3498c(int i10) {
        return this.f2953a.m3486a(i10);
    }

    /* JADX INFO: renamed from: d */
    public final C9137t3 m3499d() {
        if (m3507l()) {
            return C9137t3.m35511b(AbstractC9142u3.m35530b(this.f2956d, this.f2957e));
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final int m3500e() {
        return this.f2957e;
    }

    /* JADX INFO: renamed from: f */
    public final int m3501f() {
        return this.f2956d;
    }

    /* JADX INFO: renamed from: g */
    public final int m3502g() {
        int i10 = this.f2954b;
        int i11 = this.f2955c;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final int m3503h() {
        return this.f2953a.m3487b();
    }

    /* JADX INFO: renamed from: i */
    public final long m3504i() {
        return AbstractC9142u3.m35530b(this.f2954b, this.f2955c);
    }

    /* JADX INFO: renamed from: j */
    public final int m3505j() {
        return this.f2955c;
    }

    /* JADX INFO: renamed from: k */
    public final int m3506k() {
        return this.f2954b;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3507l() {
        return this.f2956d != -1;
    }

    /* JADX INFO: renamed from: m */
    public final void m3508m(int i10, int i11, String str) {
        if (i10 < 0 || i10 > this.f2953a.m3487b()) {
            C8630l.m33208a("start (", i10, ") offset is outside of text region ", this.f2953a.m3487b());
            return;
        }
        if (i11 < 0 || i11 > this.f2953a.m3487b()) {
            C8630l.m33208a("end (", i11, ") offset is outside of text region ", this.f2953a.m3487b());
            return;
        }
        if (i10 > i11) {
            C5072d.m20505a("Do not set reversed range: ", i10, " > ", i11);
            return;
        }
        this.f2953a.m3488c(i10, i11, str);
        m3513r(str.length() + i10);
        m3512q(i10 + str.length());
        this.f2956d = -1;
        this.f2957e = -1;
    }

    /* JADX INFO: renamed from: n */
    public final void m3509n(int i10, int i11) {
        if (i10 < 0 || i10 > this.f2953a.m3487b()) {
            C8630l.m33208a("start (", i10, ") offset is outside of text region ", this.f2953a.m3487b());
            return;
        }
        if (i11 < 0 || i11 > this.f2953a.m3487b()) {
            C8630l.m33208a("end (", i11, ") offset is outside of text region ", this.f2953a.m3487b());
        } else if (i10 >= i11) {
            C5072d.m20505a("Do not set reversed or empty range: ", i10, " > ", i11);
        } else {
            this.f2956d = i10;
            this.f2957e = i11;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3510o(int i10) {
        m3511p(i10, i10);
    }

    /* JADX INFO: renamed from: p */
    public final void m3511p(int i10, int i11) {
        if (i10 < 0 || i10 > this.f2953a.m3487b()) {
            C8630l.m33208a("start (", i10, ") offset is outside of text region ", this.f2953a.m3487b());
            return;
        }
        if (i11 < 0 || i11 > this.f2953a.m3487b()) {
            C8630l.m33208a("end (", i11, ") offset is outside of text region ", this.f2953a.m3487b());
        } else if (i10 > i11) {
            C5072d.m20505a("Do not set reversed range: ", i10, " > ", i11);
        } else {
            m3513r(i10);
            m3512q(i11);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3512q(int i10) {
        if (!(i10 >= 0)) {
            AbstractC1314a.m5291a("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.f2955c = i10;
    }

    /* JADX INFO: renamed from: r */
    public final void m3513r(int i10) {
        if (!(i10 >= 0)) {
            AbstractC1314a.m5291a("Cannot set selectionStart to a negative value: " + i10);
        }
        this.f2954b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final C9058e m3514s() {
        return new C9058e(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return this.f2953a.toString();
    }

    /* JADX INFO: renamed from: b3.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C0963m(C9058e c9058e, long j10, AbstractC1043k abstractC1043k) {
        this(c9058e, j10);
    }
}
