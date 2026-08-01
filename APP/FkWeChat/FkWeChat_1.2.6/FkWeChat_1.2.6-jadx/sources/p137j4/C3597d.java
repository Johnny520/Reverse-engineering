package p137j4;

import androidx.lifecycle.AbstractC0671l0;
import androidx.lifecycle.C0673m0;
import androidx.lifecycle.C0675n0;
import p098g9.InterfaceC2549c;
import p153k4.C3954d;
import p153k4.C3959i;

/* JADX INFO: renamed from: j4.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3597d {

    /* JADX INFO: renamed from: a */
    public final C0675n0 f9993a;

    /* JADX INFO: renamed from: b */
    public final C0673m0.c f9994b;

    /* JADX INFO: renamed from: c */
    public final AbstractC3594a f9995c;

    /* JADX INFO: renamed from: d */
    public final C3954d f9996d;

    public C3597d(C0675n0 c0675n0, C0673m0.c cVar, AbstractC3594a abstractC3594a) {
        c0675n0.getClass();
        cVar.getClass();
        abstractC3594a.getClass();
        this.f9993a = c0675n0;
        this.f9994b = cVar;
        this.f9995c = abstractC3594a;
        this.f9996d = new C3954d();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AbstractC0671l0 m13454e(C3597d c3597d, InterfaceC2549c interfaceC2549c, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = C3959i.f11426a.m15676c(interfaceC2549c);
        }
        return c3597d.m13455d(interfaceC2549c, str);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0671l0 m13455d(InterfaceC2549c interfaceC2549c, String str) {
        AbstractC0671l0 abstractC0671l0M2656b;
        interfaceC2549c.getClass();
        str.getClass();
        synchronized (this.f9996d) {
            try {
                abstractC0671l0M2656b = this.f9993a.m2656b(str);
                if (interfaceC2549c.mo3796y(abstractC0671l0M2656b)) {
                    if (this.f9994b instanceof C0673m0.e) {
                        C0673m0.e eVar = (C0673m0.e) this.f9994b;
                        abstractC0671l0M2656b.getClass();
                        eVar.mo2618d(abstractC0671l0M2656b);
                    }
                    abstractC0671l0M2656b.getClass();
                } else {
                    C3595b c3595b = new C3595b(this.f9995c);
                    c3595b.m13450c(C0673m0.f1979c, str);
                    abstractC0671l0M2656b = AbstractC3598e.m13456a(this.f9994b, interfaceC2549c, c3595b);
                    this.f9993a.m2658d(str, abstractC0671l0M2656b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC0671l0M2656b;
    }
}
