package p023b8;

import java.util.List;
import p010a9.InterfaceC0189q;
import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;
import p257r8.InterfaceC6536e;
import p376zd.C10010p0;

/* JADX INFO: renamed from: b8.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1022o extends AbstractC1012e {

    /* JADX INFO: renamed from: r */
    public final List f3167r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC5976f f3168s;

    /* JADX INFO: renamed from: t */
    public Object f3169t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC5976f[] f3170u;

    /* JADX INFO: renamed from: v */
    public int f3171v;

    /* JADX INFO: renamed from: w */
    public int f3172w;

    /* JADX INFO: renamed from: b8.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC5976f, InterfaceC6536e {

        /* JADX INFO: renamed from: q */
        public int f3173q = Integer.MIN_VALUE;

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC5976f m3770a() {
            if (this.f3173q == Integer.MIN_VALUE) {
                this.f3173q = C1022o.this.f3171v;
            }
            if (this.f3173q < 0) {
                this.f3173q = Integer.MIN_VALUE;
                return null;
            }
            try {
                InterfaceC5976f[] interfaceC5976fArr = C1022o.this.f3170u;
                int i10 = this.f3173q;
                InterfaceC5976f interfaceC5976f = interfaceC5976fArr[i10];
                if (interfaceC5976f == null) {
                    return C1021n.f3166q;
                }
                this.f3173q = i10 - 1;
                return interfaceC5976f;
            } catch (Throwable unused) {
                return C1021n.f3166q;
            }
        }

        @Override // p257r8.InterfaceC6536e
        public InterfaceC6536e getCallerFrame() {
            InterfaceC5976f interfaceC5976fM3770a = m3770a();
            if (interfaceC5976fM3770a instanceof InterfaceC6536e) {
                return (InterfaceC6536e) interfaceC5976fM3770a;
            }
            return null;
        }

        @Override // p228p8.InterfaceC5976f
        public InterfaceC5980j getContext() {
            InterfaceC5976f interfaceC5976f = C1022o.this.f3170u[C1022o.this.f3171v];
            if (interfaceC5976f != this && interfaceC5976f != null) {
                return interfaceC5976f.getContext();
            }
            int i10 = C1022o.this.f3171v - 1;
            while (i10 >= 0) {
                int i11 = i10 - 1;
                InterfaceC5976f interfaceC5976f2 = C1022o.this.f3170u[i10];
                if (interfaceC5976f2 != this && interfaceC5976f2 != null) {
                    return interfaceC5976f2.getContext();
                }
                i10 = i11;
            }
            C10010p0.m38820a("Not started");
            return null;
        }

        @Override // p228p8.InterfaceC5976f
        public void resumeWith(Object obj) {
            boolean zM18803g = C4712s.m18803g(obj);
            C1022o c1022o = C1022o.this;
            if (!zM18803g) {
                c1022o.m3768r(false);
                return;
            }
            Throwable thM18801e = C4712s.m18801e(obj);
            thM18801e.getClass();
            c1022o.m3769s(C4712s.m18798b(AbstractC4713t.m18807a(thM18801e)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022o(Object obj, Object obj2, List list) {
        super(obj2);
        obj.getClass();
        obj2.getClass();
        list.getClass();
        this.f3167r = list;
        this.f3168s = new a();
        this.f3169t = obj;
        this.f3170u = new InterfaceC5976f[list.size()];
        this.f3171v = -1;
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: a */
    public Object mo3706a(Object obj, InterfaceC5976f interfaceC5976f) {
        this.f3172w = 0;
        if (this.f3167r.size() == 0) {
            return obj;
        }
        mo3711i(obj);
        if (this.f3171v < 0) {
            return mo3709g(interfaceC5976f);
        }
        C10010p0.m38820a("Already started");
        return null;
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: b */
    public void mo3707b() {
        this.f3172w = this.f3167r.size();
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: f */
    public Object mo3708f() {
        return this.f3169t;
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: g */
    public Object mo3709g(InterfaceC5976f interfaceC5976f) {
        Object objM24992g;
        if (this.f3172w == this.f3167r.size()) {
            objM24992g = mo3708f();
        } else {
            m3766p(AbstractC6324b.m24989d(interfaceC5976f));
            if (m3768r(true)) {
                m3767q();
                objM24992g = mo3708f();
            } else {
                objM24992g = AbstractC6325c.m24992g();
            }
        }
        if (objM24992g == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM24992g;
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f3168s.getContext();
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: h */
    public Object mo3710h(Object obj, InterfaceC5976f interfaceC5976f) {
        mo3711i(obj);
        return mo3709g(interfaceC5976f);
    }

    @Override // p023b8.AbstractC1012e
    /* JADX INFO: renamed from: i */
    public void mo3711i(Object obj) {
        obj.getClass();
        this.f3169t = obj;
    }

    /* JADX INFO: renamed from: p */
    public final void m3766p(InterfaceC5976f interfaceC5976f) {
        interfaceC5976f.getClass();
        InterfaceC5976f[] interfaceC5976fArr = this.f3170u;
        int i10 = this.f3171v + 1;
        this.f3171v = i10;
        interfaceC5976fArr[i10] = interfaceC5976f;
    }

    /* JADX INFO: renamed from: q */
    public final void m3767q() {
        int i10 = this.f3171v;
        if (i10 < 0) {
            C10010p0.m38820a("No more continuations to resume");
            return;
        }
        InterfaceC5976f[] interfaceC5976fArr = this.f3170u;
        this.f3171v = i10 - 1;
        interfaceC5976fArr[i10] = null;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3768r(boolean z10) {
        int i10;
        do {
            i10 = this.f3172w;
            if (i10 == this.f3167r.size()) {
                if (z10) {
                    return true;
                }
                C4712s.a aVar = C4712s.f13928r;
                m3769s(C4712s.m18798b(mo3708f()));
                return false;
            }
            this.f3172w = i10 + 1;
            try {
            } catch (Throwable th) {
                C4712s.a aVar2 = C4712s.f13928r;
                m3769s(C4712s.m18798b(AbstractC4713t.m18807a(th)));
                return false;
            }
        } while (AbstractC1015h.m3755a((InterfaceC0189q) this.f3167r.get(i10), this, mo3708f(), this.f3168s) != AbstractC6325c.m24992g());
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m3769s(Object obj) {
        int i10 = this.f3171v;
        if (i10 < 0) {
            C10010p0.m38820a("No more continuations to resume");
            return;
        }
        InterfaceC5976f interfaceC5976f = this.f3170u[i10];
        interfaceC5976f.getClass();
        InterfaceC5976f[] interfaceC5976fArr = this.f3170u;
        int i11 = this.f3171v;
        this.f3171v = i11 - 1;
        interfaceC5976fArr[i11] = null;
        if (!C4712s.m18803g(obj)) {
            interfaceC5976f.resumeWith(obj);
            return;
        }
        Throwable thM18801e = C4712s.m18801e(obj);
        thM18801e.getClass();
        interfaceC5976f.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(AbstractC1019l.m3760a(thM18801e, interfaceC5976f))));
    }
}
