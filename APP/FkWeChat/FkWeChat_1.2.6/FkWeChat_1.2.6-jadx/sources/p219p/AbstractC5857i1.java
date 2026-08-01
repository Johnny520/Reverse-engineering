package p219p;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.C1044k0;
import p058e2.AbstractC2005g;
import p073f2.AbstractC2264r0;
import p073f2.C2236d0;
import p121i3.InterfaceC3175e;
import p163l.AbstractC4394z1;
import p165l1.InterfaceC4507m;
import p165l1.InterfaceC4509o;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p189n.InterfaceC5225h2;
import p219p.AbstractC5857i1;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p248r.InterfaceC6434j;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: p.i1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5857i1 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0184l f18410a = new InterfaceC0184l() { // from class: p.h1
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return Boolean.valueOf(AbstractC5857i1.m23606a((C2236d0) obj));
        }
    };

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5836c1 f18411b = new b();

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4509o f18412c = new a();

    /* JADX INFO: renamed from: d */
    public static final InterfaceC3175e f18413d = new c();

    /* JADX INFO: renamed from: p.i1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC4509o {
        @Override // p228p8.InterfaceC5980j
        /* JADX INFO: renamed from: L */
        public InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
            return InterfaceC4509o.a.m17476c(this, cVar);
        }

        @Override // p165l1.InterfaceC4509o
        /* JADX INFO: renamed from: X */
        public float mo17473X() {
            return 1.0f;
        }

        @Override // p228p8.InterfaceC5980j
        /* JADX INFO: renamed from: c0 */
        public InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
            return InterfaceC4509o.a.m17477d(this, interfaceC5980j);
        }

        @Override // p228p8.InterfaceC5980j.b, p228p8.InterfaceC5980j
        /* JADX INFO: renamed from: h */
        public InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
            return InterfaceC4509o.a.m17475b(this, cVar);
        }

        @Override // p228p8.InterfaceC5980j
        /* JADX INFO: renamed from: q */
        public Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
            return InterfaceC4509o.a.m17474a(this, obj, interfaceC0188p);
        }
    }

    /* JADX INFO: renamed from: p.i1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC3175e {
        @Override // p121i3.InterfaceC3183m
        /* JADX INFO: renamed from: c1 */
        public float mo1231c1() {
            return 1.0f;
        }

        @Override // p121i3.InterfaceC3175e
        public float getDensity() {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: p.i1$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f18414q;

        /* JADX INFO: renamed from: r */
        public Object f18415r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f18416s;

        /* JADX INFO: renamed from: t */
        public int f18417t;

        public d(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f18416s = obj;
            this.f18417t |= Integer.MIN_VALUE;
            return AbstractC5857i1.m23618m(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: p.i1$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f18418q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f18419r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C5893u1 f18420s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ long f18421t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C1044k0 f18422u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C5893u1 c5893u1, long j10, C1044k0 c1044k0, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18420s = c5893u1;
            this.f18421t = j10;
            this.f18422u = c1044k0;
        }

        /* JADX INFO: renamed from: r */
        public static C4700i0 m23619r(C1044k0 c1044k0, C5893u1 c5893u1, InterfaceC5892u0 interfaceC5892u0, float f10, float f11) {
            c1044k0.f3203q += c5893u1.m23766z(c5893u1.m23755H(interfaceC5892u0.mo23731b(c5893u1.m23756I(c5893u1.m23766z(f10 - c1044k0.f3203q)), AbstractC2005g.f5574a.m7249b())));
            return C4700i0.f13910a;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            e eVar = new e(this.f18420s, this.f18421t, this.f18422u, interfaceC5976f);
            eVar.f18419r = obj;
            return eVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18418q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                final InterfaceC5892u0 interfaceC5892u0 = (InterfaceC5892u0) this.f18419r;
                float fM23755H = this.f18420s.m23755H(this.f18421t);
                final C1044k0 c1044k0 = this.f18422u;
                final C5893u1 c5893u1 = this.f18420s;
                InterfaceC0188p interfaceC0188p = new InterfaceC0188p() { // from class: p.j1
                    @Override // p010a9.InterfaceC0188p
                    public final Object invoke(Object obj2, Object obj3) {
                        return AbstractC5857i1.e.m23619r(c1044k0, c5893u1, interfaceC5892u0, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.f18418q = 1;
                if (AbstractC4394z1.m17183m(0.0f, fM23755H, 0.0f, null, interfaceC0188p, this, 12, null) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5892u0 interfaceC5892u0, InterfaceC5976f interfaceC5976f) {
            return ((e) create(interfaceC5892u0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23606a(C2236d0 c2236d0) {
        return !AbstractC2264r0.m8244g(c2236d0.m8083n(), AbstractC2264r0.f6219a.m8248b());
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC0184l m23610e() {
        return f18410a;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC4509o m23611f() {
        return f18412c;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m23612g(InterfaceC5859j0 interfaceC5859j0) {
        return !(interfaceC5859j0 instanceof InterfaceC5844e1);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC3175e m23613h() {
        return f18413d;
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC4507m m23614i(InterfaceC4507m interfaceC4507m, InterfaceC5881q1 interfaceC5881q1, EnumC5898w0 enumC5898w0, InterfaceC5225h2 interfaceC5225h2, boolean z10, boolean z11, InterfaceC5859j0 interfaceC5859j0, InterfaceC6434j interfaceC6434j, InterfaceC5842e interfaceC5842e) {
        return interfaceC4507m.mo17445i(new C5851g1(interfaceC5881q1, enumC5898w0, interfaceC5225h2, z10, z11, interfaceC5859j0, interfaceC6434j, interfaceC5842e));
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC4507m m23615j(InterfaceC4507m interfaceC4507m, InterfaceC5881q1 interfaceC5881q1, EnumC5898w0 enumC5898w0, boolean z10, boolean z11, InterfaceC5859j0 interfaceC5859j0, InterfaceC6434j interfaceC6434j) {
        return m23616k(interfaceC4507m, interfaceC5881q1, enumC5898w0, null, z10, z11, interfaceC5859j0, interfaceC6434j, null, 128, null);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ InterfaceC4507m m23616k(InterfaceC4507m interfaceC4507m, InterfaceC5881q1 interfaceC5881q1, EnumC5898w0 enumC5898w0, InterfaceC5225h2 interfaceC5225h2, boolean z10, boolean z11, InterfaceC5859j0 interfaceC5859j0, InterfaceC6434j interfaceC6434j, InterfaceC5842e interfaceC5842e, int i10, Object obj) {
        InterfaceC5842e interfaceC5842e2;
        InterfaceC4507m interfaceC4507m2;
        InterfaceC5881q1 interfaceC5881q12;
        EnumC5898w0 enumC5898w02;
        InterfaceC5225h2 interfaceC5225h22;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        boolean z13 = (i10 & 16) != 0 ? false : z11;
        InterfaceC5859j0 interfaceC5859j02 = (i10 & 32) != 0 ? null : interfaceC5859j0;
        InterfaceC6434j interfaceC6434j2 = (i10 & 64) != 0 ? null : interfaceC6434j;
        if ((i10 & 128) != 0) {
            interfaceC5842e2 = null;
            interfaceC4507m2 = interfaceC4507m;
            enumC5898w02 = enumC5898w0;
            interfaceC5225h22 = interfaceC5225h2;
            interfaceC5881q12 = interfaceC5881q1;
        } else {
            interfaceC5842e2 = interfaceC5842e;
            interfaceC4507m2 = interfaceC4507m;
            interfaceC5881q12 = interfaceC5881q1;
            enumC5898w02 = enumC5898w0;
            interfaceC5225h22 = interfaceC5225h2;
        }
        return m23614i(interfaceC4507m2, interfaceC5881q12, enumC5898w02, interfaceC5225h22, z12, z13, interfaceC5859j02, interfaceC6434j2, interfaceC5842e2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ InterfaceC4507m m23617l(InterfaceC4507m interfaceC4507m, InterfaceC5881q1 interfaceC5881q1, EnumC5898w0 enumC5898w0, boolean z10, boolean z11, InterfaceC5859j0 interfaceC5859j0, InterfaceC6434j interfaceC6434j, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return m23615j(interfaceC4507m, interfaceC5881q1, enumC5898w0, z12, z11, (i10 & 16) != 0 ? null : interfaceC5859j0, (i10 & 32) != 0 ? null : interfaceC6434j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m23618m(p219p.C5893u1 r10, long r11, p228p8.InterfaceC5976f r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof p219p.AbstractC5857i1.d
            if (r0 == 0) goto L13
            r0 = r13
            p.i1$d r0 = (p219p.AbstractC5857i1.d) r0
            int r1 = r0.f18417t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18417t = r1
            goto L18
        L13:
            p.i1$d r0 = new p.i1$d
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f18416s
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f18417t
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            java.lang.Object r10 = r0.f18415r
            b9.k0 r10 = (p024b9.C1044k0) r10
            java.lang.Object r11 = r0.f18414q
            p.u1 r11 = (p219p.C5893u1) r11
            p172l8.AbstractC4713t.m18808b(r13)
            r8 = r10
            r10 = r11
            goto L5a
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r10)
            r10 = 0
            return r10
        L3a:
            p172l8.AbstractC4713t.m18808b(r13)
            b9.k0 r8 = new b9.k0
            r8.<init>()
            n.a2 r13 = p189n.EnumC5190a2.f15823q
            p.i1$e r4 = new p.i1$e
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.f18414q = r5
            r0.f18415r = r8
            r0.f18417t = r3
            java.lang.Object r10 = r5.m23749B(r13, r4, r0)
            if (r10 != r1) goto L59
            return r1
        L59:
            r10 = r5
        L5a:
            float r11 = r8.f3203q
            long r10 = r10.m23756I(r11)
            r1.e r10 = p250r1.C6455e.m25550d(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p219p.AbstractC5857i1.m23618m(p.u1, long, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: p.i1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC5836c1 {
        @Override // p219p.InterfaceC5836c1
        /* JADX INFO: renamed from: g */
        public float mo23523g(float f10) {
            return f10;
        }
    }
}
