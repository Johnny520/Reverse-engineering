package p264s0;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p010a9.InterfaceC0184l;
import p117i.AbstractC3071m;
import p119i1.AbstractC3137l;
import p121i3.C3179i;
import p163l.AbstractC4277c;
import p163l.C4271b;
import p163l.InterfaceC4317k;
import p166l2.C4604y1;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p189n.C5200c2;
import p189n.EnumC5190a2;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6544m;
import p264s0.C6813kd;
import p376zd.C10010p0;

/* JADX INFO: renamed from: s0.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6767i implements InterfaceC6829ld {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6829ld f21536a;

    /* JADX INFO: renamed from: b */
    public final C4604y1 f21537b;

    /* JADX INFO: renamed from: d */
    public float f21539d;

    /* JADX INFO: renamed from: e */
    public float f21540e;

    /* JADX INFO: renamed from: f */
    public C4271b f21541f;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0512i2 f21538c = AbstractC0522j5.m1773e(C3179i.m12001h(C3179i.m12003k(0)), null, 2, null);

    /* JADX INFO: renamed from: g */
    public final C5200c2 f21542g = new C5200c2();

    /* JADX INFO: renamed from: s0.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public int f21543q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ float f21545s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC4317k f21546t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, InterfaceC4317k interfaceC4317k, InterfaceC5976f interfaceC5976f) {
            super(1, interfaceC5976f);
            this.f21545s = f10;
            this.f21546t = interfaceC4317k;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(InterfaceC5976f interfaceC5976f) {
            return C6767i.this.new a(this.f21545s, this.f21546t, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f21543q;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC4713t.m18808b(obj);
                    return obj;
                }
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            C4271b c4271b = C6767i.this.f21541f;
            Float fM25847c = AbstractC6533b.m25847c(this.f21545s);
            InterfaceC4317k interfaceC4317k = this.f21546t;
            this.f21543q = 1;
            Object objM16787f = C4271b.m16787f(c4271b, fM25847c, interfaceC4317k, null, null, this, 12, null);
            return objM16787f == objM24992g ? objM24992g : objM16787f;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo27m(InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: s0.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public int f21547q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ float f21549s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC4317k f21550t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, InterfaceC4317k interfaceC4317k, InterfaceC5976f interfaceC5976f) {
            super(1, interfaceC5976f);
            this.f21549s = f10;
            this.f21550t = interfaceC4317k;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(InterfaceC5976f interfaceC5976f) {
            return C6767i.this.new b(this.f21549s, this.f21550t, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f21547q;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC4713t.m18808b(obj);
                    return obj;
                }
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            C4271b c4271b = C6767i.this.f21541f;
            Float fM25847c = AbstractC6533b.m25847c(this.f21549s);
            InterfaceC4317k interfaceC4317k = this.f21550t;
            this.f21547q = 1;
            Object objM16787f = C4271b.m16787f(c4271b, fM25847c, interfaceC4317k, null, null, this, 12, null);
            return objM16787f == objM24992g ? objM24992g : objM16787f;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo27m(InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: s0.i$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6544m implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public int f21551q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ float f21553s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ boolean f21554t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC4317k f21555u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10, boolean z10, InterfaceC4317k interfaceC4317k, InterfaceC5976f interfaceC5976f) {
            super(1, interfaceC5976f);
            this.f21553s = f10;
            this.f21554t = z10;
            this.f21555u = interfaceC4317k;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(InterfaceC5976f interfaceC5976f) {
            return C6767i.this.new c(this.f21553s, this.f21554t, this.f21555u, interfaceC5976f);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
        
            if (r12.m16802t(r1, r11) == r0) goto L28;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p264s0.C6767i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo27m(InterfaceC5976f interfaceC5976f) {
            return ((c) create(interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C6767i(InterfaceC6829ld interfaceC6829ld, C4604y1 c4604y1) {
        this.f21536a = interfaceC6829ld;
        this.f21537b = c4604y1;
        this.f21539d = ((interfaceC6829ld.mo26855g() % 12) * 0.5235988f) - 1.5707964f;
        this.f21540e = (interfaceC6829ld.mo26851c() * 0.10471976f) - 1.5707964f;
        this.f21541f = AbstractC4277c.m16816b(this.f21539d, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Object m26834B(C6767i c6767i, float f10, InterfaceC4317k interfaceC4317k, boolean z10, InterfaceC5976f interfaceC5976f, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c6767i.m26844A(f10, interfaceC4317k, z10, interfaceC5976f);
    }

    /* JADX INFO: renamed from: A */
    public final Object m26844A(float f10, InterfaceC4317k interfaceC4317k, boolean z10, InterfaceC5976f interfaceC5976f) {
        this.f21537b.m18450b(AbstractC6533b.m25845a(false));
        Object objM21332d = this.f21542g.m21332d(EnumC5190a2.f15824r, new c(f10, z10, interfaceC4317k, null), interfaceC5976f);
        return objM21332d == AbstractC6325c.m24992g() ? objM21332d : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: C */
    public final void m26845C(float f10) {
        this.f21538c.setValue(C3179i.m12001h(f10));
    }

    /* JADX INFO: renamed from: D */
    public final int m26846D(float f10) {
        return ((int) ((((double) f10) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12;
    }

    /* JADX INFO: renamed from: E */
    public final int m26847E(float f10) {
        return ((int) ((((double) f10) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }

    /* JADX INFO: renamed from: F */
    public final void m26848F() {
        AbstractC3137l.a aVar = AbstractC3137l.f8345e;
        AbstractC3137l abstractC3137lM11765d = aVar.m11765d();
        InterfaceC0184l interfaceC0184lMo11676g = abstractC3137lM11765d != null ? abstractC3137lM11765d.mo11676g() : null;
        AbstractC3137l abstractC3137lM11767f = aVar.m11767f(abstractC3137lM11765d);
        try {
            this.f21536a.mo26850b(mo26851c());
            C4700i0 c4700i0 = C4700i0.f13910a;
        } finally {
            aVar.m11772k(abstractC3137lM11765d, abstractC3137lM11767f, interfaceC0184lMo11676g);
        }
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: a */
    public void mo26849a(int i10) {
        this.f21539d = ((i10 % 12) * 0.5235988f) - 1.5707964f;
        this.f21536a.mo26849a(i10);
        if (C6813kd.m27007f(mo26853e(), C6813kd.f21851b.m27011a())) {
            this.f21541f = AbstractC4277c.m16816b(this.f21539d, 0.0f, 2, null);
        }
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: b */
    public void mo26850b(int i10) {
        this.f21540e = (i10 * 0.10471976f) - 1.5707964f;
        this.f21536a.mo26850b(i10);
        if (C6813kd.m27007f(mo26853e(), C6813kd.f21851b.m27012b())) {
            this.f21541f = AbstractC4277c.m16816b(this.f21540e, 0.0f, 2, null);
        }
        m26848F();
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: c */
    public int mo26851c() {
        return this.f21536a.mo26851c();
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: d */
    public void mo26852d(int i10) {
        this.f21536a.mo26852d(i10);
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: e */
    public int mo26853e() {
        return this.f21536a.mo26853e();
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: f */
    public boolean mo26854f() {
        return this.f21536a.mo26854f();
    }

    @Override // p264s0.InterfaceC6829ld
    /* JADX INFO: renamed from: g */
    public int mo26855g() {
        return this.f21536a.mo26855g();
    }

    /* JADX INFO: renamed from: q */
    public final Object m26856q(InterfaceC4317k interfaceC4317k, InterfaceC5976f interfaceC5976f) {
        if (!m26862w()) {
            return C4700i0.f13910a;
        }
        Object objM21332d = this.f21542g.m21332d(EnumC5190a2.f15825s, new a(C6813kd.m27007f(mo26853e(), C6813kd.f21851b.m27011a()) ? m26857r(this.f21539d) : m26857r(this.f21540e), interfaceC4317k, null), interfaceC5976f);
        return objM21332d == AbstractC6325c.m24992g() ? objM21332d : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: r */
    public final float m26857r(float f10) {
        float fFloatValue = ((Number) this.f21541f.m16795m()).floatValue() - f10;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return ((Number) this.f21541f.m16795m()).floatValue() - fFloatValue;
    }

    /* JADX INFO: renamed from: s */
    public final AbstractC3071m m26858s() {
        return C6813kd.m27007f(mo26853e(), C6813kd.f21851b.m27012b()) ? AbstractC6685cd.f21046j : AbstractC6685cd.f21047k;
    }

    /* JADX INFO: renamed from: t */
    public final float m26859t() {
        return ((Number) this.f21541f.m16795m()).floatValue();
    }

    /* JADX INFO: renamed from: u */
    public final float m26860u() {
        return ((C3179i) this.f21538c.getValue()).m12009r();
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC6829ld m26861v() {
        return this.f21536a;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m26862w() {
        int iMo26853e = mo26853e();
        C6813kd.a aVar = C6813kd.f21851b;
        if (C6813kd.m27007f(iMo26853e, aVar.m27011a()) && m26863x(((Number) this.f21541f.m16793k()).floatValue()) == m26863x(this.f21539d)) {
            return false;
        }
        return (C6813kd.m27007f(mo26853e(), aVar.m27012b()) && m26863x(((Number) this.f21541f.m16793k()).floatValue()) == m26863x(this.f21540e)) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public final float m26863x(float f10) {
        double d10 = ((double) f10) % 6.283185307179586d;
        if (d10 < 0.0d) {
            d10 += 6.283185307179586d;
        }
        return (float) d10;
    }

    /* JADX INFO: renamed from: y */
    public final float m26864y(float f10) {
        float f11 = f10 + 1.5707964f;
        return f11 < 0.0f ? f11 + 6.2831855f : f11;
    }

    /* JADX INFO: renamed from: z */
    public final Object m26865z(InterfaceC4317k interfaceC4317k, InterfaceC5976f interfaceC5976f) {
        Object objM21332d = this.f21542g.m21332d(EnumC5190a2.f15825s, new b(m26857r(C6813kd.m27007f(mo26853e(), C6813kd.f21851b.m27011a()) ? this.f21539d : this.f21540e), interfaceC4317k, null), interfaceC5976f);
        return objM21332d == AbstractC6325c.m24992g() ? objM21332d : C4700i0.f13910a;
    }
}
