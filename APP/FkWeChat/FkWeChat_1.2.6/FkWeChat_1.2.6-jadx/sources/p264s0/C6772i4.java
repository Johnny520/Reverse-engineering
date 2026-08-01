package p264s0;

import okhttp3.internal.url._UrlKt;
import p018b3.C0942c1;
import p018b3.InterfaceC0948e1;
import p018b3.InterfaceC0956i0;
import p080f9.AbstractC2368o;
import p275t0.C7991p0;
import p299ub.AbstractC8621f0;
import p319w2.C9058e;

/* JADX INFO: renamed from: s0.i4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6772i4 implements InterfaceC0948e1 {

    /* JADX INFO: renamed from: b */
    public final C7991p0 f21575b;

    /* JADX INFO: renamed from: c */
    public final int f21576c;

    /* JADX INFO: renamed from: d */
    public final int f21577d;

    /* JADX INFO: renamed from: e */
    public final int f21578e;

    /* JADX INFO: renamed from: f */
    public final a f21579f = new a();

    /* JADX INFO: renamed from: s0.i4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0956i0 {
        public a() {
        }

        @Override // p018b3.InterfaceC0956i0
        /* JADX INFO: renamed from: a */
        public int mo3267a(int i10) {
            return i10 <= C6772i4.this.f21576c + (-1) ? i10 : i10 <= C6772i4.this.f21577d + (-1) ? i10 - 1 : i10 <= C6772i4.this.f21578e + 1 ? i10 - 2 : C6772i4.this.f21578e;
        }

        @Override // p018b3.InterfaceC0956i0
        /* JADX INFO: renamed from: b */
        public int mo3268b(int i10) {
            return i10 < C6772i4.this.f21576c ? i10 : i10 < C6772i4.this.f21577d ? i10 + 1 : i10 <= C6772i4.this.f21578e ? i10 + 2 : C6772i4.this.f21578e + 2;
        }
    }

    public C6772i4(C7991p0 c7991p0) {
        this.f21575b = c7991p0;
        this.f21576c = AbstractC8621f0.m33150m0(c7991p0.m30767b(), c7991p0.m30766a(), 0, false, 6, null);
        this.f21577d = AbstractC8621f0.m33164t0(c7991p0.m30767b(), c7991p0.m30766a(), 0, false, 6, null);
        this.f21578e = c7991p0.m30768c().length();
    }

    @Override // p018b3.InterfaceC0948e1
    /* JADX INFO: renamed from: a */
    public C0942c1 mo3471a(C9058e c9058e) {
        int i10 = 0;
        String strM33131c1 = c9058e.m35156k().length() > this.f21578e ? AbstractC8621f0.m33131c1(c9058e.m35156k(), AbstractC2368o.m8592s(0, this.f21578e)) : c9058e.m35156k();
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        int i11 = 0;
        while (i10 < strM33131c1.length()) {
            int i12 = i11 + 1;
            str = str + strM33131c1.charAt(i10);
            if (i12 == this.f21576c || i11 + 2 == this.f21577d) {
                str = str + this.f21575b.m30766a();
            }
            i10++;
            i11 = i12;
        }
        return new C0942c1(new C9058e(str, null, 2, null), this.f21579f);
    }
}
