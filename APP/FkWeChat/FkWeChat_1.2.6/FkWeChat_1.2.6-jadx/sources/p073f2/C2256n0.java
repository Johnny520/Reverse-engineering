package p073f2;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p135j2.InterfaceC3578w;
import p172l8.C4700i0;
import p250r1.C6455e;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p376zd.C10010p0;

/* JADX INFO: renamed from: f2.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2256n0 implements InterfaceC2250k0 {

    /* JADX INFO: renamed from: b */
    public InterfaceC0184l f6195b;

    /* JADX INFO: renamed from: c */
    public C2270u0 f6196c;

    /* JADX INFO: renamed from: d */
    public boolean f6197d;

    /* JADX INFO: renamed from: e */
    public final AbstractC2248j0 f6198e = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: f2.n0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f6199q = new a("Unknown", 0);

        /* JADX INFO: renamed from: r */
        public static final a f6200r = new a("Dispatching", 1);

        /* JADX INFO: renamed from: s */
        public static final a f6201s = new a("NotDispatching", 2);

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ a[] f6202t;

        /* JADX INFO: renamed from: u */
        public static final /* synthetic */ InterfaceC7197a f6203u;

        static {
            a[] aVarArrM8198a = m8198a();
            f6202t = aVarArrM8198a;
            f6203u = AbstractC7198b.m28437a(aVarArrM8198a);
        }

        public a(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m8198a() {
            return new a[]{f6199q, f6200r, f6201s};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6202t.clone();
        }
    }

    /* JADX INFO: renamed from: f2.n0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC2248j0 {

        /* JADX INFO: renamed from: b */
        public a f6204b = a.f6199q;

        /* JADX INFO: renamed from: c */
        public C2261q f6205c;

        /* JADX INFO: renamed from: f2.n0$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C2256n0 f6208s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2256n0 c2256n0) {
                super(1);
                this.f6208s = c2256n0;
            }

            /* JADX INFO: renamed from: a */
            public final void m8203a(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f6208s.m8194k().mo27m(motionEvent);
                } else {
                    b.this.f6204b = ((Boolean) this.f6208s.m8194k().mo27m(motionEvent)).booleanValue() ? a.f6200r : a.f6201s;
                }
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                m8203a((MotionEvent) obj);
                return C4700i0.f13910a;
            }
        }

        /* JADX INFO: renamed from: f2.n0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10081b extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C2256n0 f6209r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10081b(C2256n0 c2256n0) {
                super(1);
                this.f6209r = c2256n0;
            }

            /* JADX INFO: renamed from: a */
            public final void m8204a(MotionEvent motionEvent) {
                this.f6209r.m8194k().mo27m(motionEvent);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                m8204a((MotionEvent) obj);
                return C4700i0.f13910a;
            }
        }

        /* JADX INFO: renamed from: f2.n0$b$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ C2256n0 f6210r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C2256n0 c2256n0) {
                super(1);
                this.f6210r = c2256n0;
            }

            /* JADX INFO: renamed from: a */
            public final void m8205a(MotionEvent motionEvent) {
                this.f6210r.m8194k().mo27m(motionEvent);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                m8205a((MotionEvent) obj);
                return C4700i0.f13910a;
            }
        }

        public b() {
        }

        @Override // p073f2.AbstractC2248j0
        /* JADX INFO: renamed from: c */
        public boolean mo8172c() {
            return true;
        }

        @Override // p073f2.AbstractC2248j0
        /* JADX INFO: renamed from: d */
        public void mo8173d() {
            if (this.f6204b == a.f6200r) {
                AbstractC2260p0.m8210a(SystemClock.uptimeMillis(), new C10081b(C2256n0.this));
                m8201i();
            }
        }

        @Override // p073f2.AbstractC2248j0
        /* JADX INFO: renamed from: e */
        public void mo8174e(C2261q c2261q, EnumC2265s enumC2265s, long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            List listM8216c = c2261q.m8216c();
            int size = listM8216c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2236d0 c2236d0 = (C2236d0) listM8216c.get(i10);
                if (AbstractC2263r.m8229b(c2236d0) || AbstractC2263r.m8231d(c2236d0)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (!z10) {
                z11 = false;
                break;
            }
            int size2 = listM8216c.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (((C2236d0) listM8216c.get(i11)).m8085p()) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (C2256n0.this.m8193j()) {
                z12 = true;
            } else {
                int size3 = listM8216c.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size3) {
                        C2236d0 c2236d02 = (C2236d0) listM8216c.get(i12);
                        if (AbstractC2263r.m8229b(c2236d02) || AbstractC2263r.m8231d(c2236d02)) {
                            break;
                        } else {
                            i12++;
                        }
                    } else if (z11) {
                        break;
                    } else {
                        z12 = false;
                    }
                }
                z12 = true;
            }
            if (this.f6204b != a.f6201s) {
                if (enumC2265s == EnumC2265s.f6225q && z12) {
                    this.f6205c = c2261q;
                    m8200h(c2261q, !z10 || C2256n0.this.m8193j());
                }
                if (enumC2265s == EnumC2265s.f6226r && z10 && AbstractC1061t.m3842c(c2261q, this.f6205c) && C2256n0.this.m8193j()) {
                    int size4 = listM8216c.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        ((C2236d0) listM8216c.get(i13)).m8071a();
                    }
                }
                if (enumC2265s == EnumC2265s.f6227s && !z12 && !AbstractC1061t.m3842c(c2261q, this.f6205c)) {
                    m8200h(c2261q, true);
                }
            }
            if (enumC2265s == EnumC2265s.f6227s) {
                int size5 = listM8216c.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size5) {
                        m8201i();
                        break;
                    } else if (!AbstractC2263r.m8231d((C2236d0) listM8216c.get(i14))) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (AbstractC1061t.m3842c(c2261q, this.f6205c) && z10) {
                    int size6 = listM8216c.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size6) {
                            break;
                        }
                        if (!((C2236d0) listM8216c.get(i15)).m8085p()) {
                            i15++;
                        } else if (!C2256n0.this.m8193j()) {
                            m8202j(c2261q);
                            return;
                        }
                    }
                    int size7 = listM8216c.size();
                    for (int i16 = 0; i16 < size7; i16++) {
                        ((C2236d0) listM8216c.get(i16)).m8071a();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m8200h(C2261q c2261q, boolean z10) {
            List listM8216c = c2261q.m8216c();
            int size = listM8216c.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((C2236d0) listM8216c.get(i10)).m8085p()) {
                    m8202j(c2261q);
                    return;
                }
            }
            InterfaceC3578w interfaceC3578wM8171b = m8171b();
            if (interfaceC3578wM8171b == null) {
                C10010p0.m38820a("layoutCoordinates not set");
                return;
            }
            AbstractC2260p0.m8212c(c2261q, interfaceC3578wM8171b.mo13252u0(C6455e.f20314b.m25569c()), new a(C2256n0.this));
            if (this.f6204b == a.f6200r) {
                if (z10) {
                    int size2 = listM8216c.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((C2236d0) listM8216c.get(i11)).m8071a();
                    }
                }
                C2241g c2241gM8218e = c2261q.m8218e();
                if (c2241gM8218e != null) {
                    c2241gM8218e.m8127e(!C2256n0.this.m8193j());
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m8201i() {
            this.f6204b = a.f6199q;
            C2256n0.this.m8195m(false);
            this.f6205c = null;
        }

        /* JADX INFO: renamed from: j */
        public final void m8202j(C2261q c2261q) {
            if (this.f6204b == a.f6200r) {
                InterfaceC3578w interfaceC3578wM8171b = m8171b();
                if (interfaceC3578wM8171b == null) {
                    C10010p0.m38820a("layoutCoordinates not set");
                    return;
                }
                AbstractC2260p0.m8211b(c2261q, interfaceC3578wM8171b.mo13252u0(C6455e.f20314b.m25569c()), new c(C2256n0.this));
            }
            this.f6204b = a.f6201s;
        }
    }

    @Override // p073f2.InterfaceC2250k0
    /* JADX INFO: renamed from: h */
    public AbstractC2248j0 mo8177h() {
        return this.f6198e;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8193j() {
        return this.f6197d;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC0184l m8194k() {
        InterfaceC0184l interfaceC0184l = this.f6195b;
        if (interfaceC0184l != null) {
            return interfaceC0184l;
        }
        AbstractC1061t.m3851l("onTouchEvent");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m8195m(boolean z10) {
        this.f6197d = z10;
    }

    /* JADX INFO: renamed from: n */
    public final void m8196n(InterfaceC0184l interfaceC0184l) {
        this.f6195b = interfaceC0184l;
    }

    /* JADX INFO: renamed from: p */
    public final void m8197p(C2270u0 c2270u0) {
        C2270u0 c2270u02 = this.f6196c;
        if (c2270u02 != null) {
            c2270u02.m8273c(null);
        }
        this.f6196c = c2270u0;
        if (c2270u0 != null) {
            c2270u0.m8273c(this);
        }
    }
}
