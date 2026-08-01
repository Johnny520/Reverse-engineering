package p018b3;

import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p102h1.AbstractC2819a0;
import p102h1.InterfaceC2821b0;
import p102h1.InterfaceC2843x;
import p185m8.AbstractC5114x;
import p319w2.AbstractC9136t2;
import p319w2.AbstractC9142u3;
import p319w2.C9058e;
import p319w2.C9137t3;
import p319w2.InterfaceC9138u;

/* JADX INFO: renamed from: b3.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0978t0 {

    /* JADX INFO: renamed from: d */
    public static final a f2995d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2843x f2996e = AbstractC2819a0.m10035c(new InterfaceC0188p() { // from class: b3.r0
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C0978t0.m3576a((InterfaceC2821b0) obj, (C0978t0) obj2);
        }
    }, new InterfaceC0184l() { // from class: b3.s0
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C0978t0.m3577b(obj);
        }
    });

    /* JADX INFO: renamed from: a */
    public final C9058e f2997a;

    /* JADX INFO: renamed from: b */
    public final long f2998b;

    /* JADX INFO: renamed from: c */
    public final C9137t3 f2999c;

    public C0978t0(C9058e c9058e, long j10, C9137t3 c9137t3) {
        this.f2997a = c9058e;
        this.f2998b = AbstractC9142u3.m35531c(j10, 0, m3586k().length());
        this.f2999c = c9137t3 != null ? C9137t3.m35511b(AbstractC9142u3.m35531c(c9137t3.m35527r(), 0, m3586k().length())) : null;
    }

    /* JADX INFO: renamed from: a */
    public static Object m3576a(InterfaceC2821b0 interfaceC2821b0, C0978t0 c0978t0) {
        return AbstractC5114x.m20793h(AbstractC9136t2.m35439J0(c0978t0.f2997a, AbstractC9136t2.m35479l0(), interfaceC2821b0), AbstractC9136t2.m35439J0(C9137t3.m35511b(c0978t0.f2998b), AbstractC9136t2.m35435H0(C9137t3.f31232b), interfaceC2821b0));
    }

    /* JADX INFO: renamed from: b */
    public static C0978t0 m3577b(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        InterfaceC2843x interfaceC2843xM35479l0 = AbstractC9136t2.m35479l0();
        Boolean bool = Boolean.FALSE;
        C9137t3 c9137t3 = null;
        C9058e c9058e = ((!AbstractC1061t.m3842c(obj2, bool) || (interfaceC2843xM35479l0 instanceof InterfaceC9138u)) && obj2 != null) ? (C9058e) interfaceC2843xM35479l0.mo10037a(obj2) : null;
        c9058e.getClass();
        Object obj3 = list.get(1);
        InterfaceC2843x interfaceC2843xM35435H0 = AbstractC9136t2.m35435H0(C9137t3.f31232b);
        if ((!AbstractC1061t.m3842c(obj3, bool) || (interfaceC2843xM35435H0 instanceof InterfaceC9138u)) && obj3 != null) {
            c9137t3 = (C9137t3) interfaceC2843xM35435H0.mo10037a(obj3);
        }
        c9137t3.getClass();
        return new C0978t0(c9058e, c9137t3.m35527r(), (C9137t3) null, 4, (AbstractC1043k) null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C0978t0 m3579f(C0978t0 c0978t0, String str, long j10, C9137t3 c9137t3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = c0978t0.f2998b;
        }
        if ((i10 & 4) != 0) {
            c9137t3 = c0978t0.f2999c;
        }
        return c0978t0.m3581d(str, j10, c9137t3);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C0978t0 m3580g(C0978t0 c0978t0, C9058e c9058e, long j10, C9137t3 c9137t3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c9058e = c0978t0.f2997a;
        }
        if ((i10 & 2) != 0) {
            j10 = c0978t0.f2998b;
        }
        if ((i10 & 4) != 0) {
            c9137t3 = c0978t0.f2999c;
        }
        return c0978t0.m3582e(c9058e, j10, c9137t3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final C0978t0 m3581d(String str, long j10, C9137t3 c9137t3) {
        return new C0978t0(new C9058e(str, null, 2, 0 == true ? 1 : 0), j10, c9137t3, (AbstractC1043k) null);
    }

    /* JADX INFO: renamed from: e */
    public final C0978t0 m3582e(C9058e c9058e, long j10, C9137t3 c9137t3) {
        return new C0978t0(c9058e, j10, c9137t3, (AbstractC1043k) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0978t0)) {
            return false;
        }
        C0978t0 c0978t0 = (C0978t0) obj;
        return C9137t3.m35516g(this.f2998b, c0978t0.f2998b) && AbstractC1061t.m3842c(this.f2999c, c0978t0.f2999c) && AbstractC1061t.m3842c(this.f2997a, c0978t0.f2997a);
    }

    /* JADX INFO: renamed from: h */
    public final C9058e m3583h() {
        return this.f2997a;
    }

    public int hashCode() {
        int iHashCode = ((this.f2997a.hashCode() * 31) + C9137t3.m35524o(this.f2998b)) * 31;
        C9137t3 c9137t3 = this.f2999c;
        return iHashCode + (c9137t3 != null ? C9137t3.m35524o(c9137t3.m35527r()) : 0);
    }

    /* JADX INFO: renamed from: i */
    public final C9137t3 m3584i() {
        return this.f2999c;
    }

    /* JADX INFO: renamed from: j */
    public final long m3585j() {
        return this.f2998b;
    }

    /* JADX INFO: renamed from: k */
    public final String m3586k() {
        return this.f2997a.m35156k();
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f2997a) + "', selection=" + ((Object) C9137t3.m35526q(this.f2998b)) + ", composition=" + this.f2999c + ')';
    }

    /* JADX INFO: renamed from: b3.t0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2843x m3587a() {
            return C0978t0.f2996e;
        }

        public a() {
        }
    }

    public /* synthetic */ C0978t0(C9058e c9058e, long j10, C9137t3 c9137t3, AbstractC1043k abstractC1043k) {
        this(c9058e, j10, c9137t3);
    }

    public /* synthetic */ C0978t0(String str, long j10, C9137t3 c9137t3, AbstractC1043k abstractC1043k) {
        this(str, j10, c9137t3);
    }

    public /* synthetic */ C0978t0(C9058e c9058e, long j10, C9137t3 c9137t3, int i10, AbstractC1043k abstractC1043k) {
        this(c9058e, (i10 & 2) != 0 ? C9137t3.f31232b.m35528a() : j10, (i10 & 4) != 0 ? null : c9137t3, (AbstractC1043k) null);
    }

    public /* synthetic */ C0978t0(String str, long j10, C9137t3 c9137t3, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : str, (i10 & 2) != 0 ? C9137t3.f31232b.m35528a() : j10, (i10 & 4) != 0 ? null : c9137t3, (AbstractC1043k) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0978t0(String str, long j10, C9137t3 c9137t3) {
        this(new C9058e(str, null, 2, 0 == true ? 1 : 0), j10, c9137t3, (AbstractC1043k) null);
    }
}
