package p350y1;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p121i3.C3189s;
import p172l8.C4700i0;
import p250r1.C6455e;
import p250r1.C6461k;
import p265s1.AbstractC7133r1;
import p265s1.C7094j2;
import p265s1.InterfaceC7089i2;
import p290u1.InterfaceC8485d;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: y1.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9525m extends AbstractC9524l {

    /* JADX INFO: renamed from: b */
    public final C9515c f32469b;

    /* JADX INFO: renamed from: c */
    public String f32470c;

    /* JADX INFO: renamed from: d */
    public boolean f32471d;

    /* JADX INFO: renamed from: e */
    public final C9513a f32472e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0173a f32473f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0512i2 f32474g;

    /* JADX INFO: renamed from: h */
    public AbstractC7133r1 f32475h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0512i2 f32476i;

    /* JADX INFO: renamed from: j */
    public long f32477j;

    /* JADX INFO: renamed from: k */
    public float f32478k;

    /* JADX INFO: renamed from: l */
    public float f32479l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC0184l f32480m;

    /* JADX INFO: renamed from: y1.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {
        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m37263a(AbstractC9524l abstractC9524l) {
            C9525m.this.m37253h();
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m37263a((AbstractC9524l) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: y1.m$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {
        public b() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m37264a(InterfaceC8487f interfaceC8487f) {
            C9515c c9515cM37257l = C9525m.this.m37257l();
            C9525m c9525m = C9525m.this;
            float f10 = c9525m.f32478k;
            float f11 = c9525m.f32479l;
            long jM25569c = C6455e.f20314b.m25569c();
            InterfaceC8485d interfaceC8485dMo18044n1 = interfaceC8487f.mo18044n1();
            long jMo32628b = interfaceC8485dMo18044n1.mo32628b();
            interfaceC8485dMo18044n1.mo32635i().mo27841n();
            try {
                interfaceC8485dMo18044n1.mo32632f().mo32642g(f10, f11, jM25569c);
                c9515cM37257l.mo37082a(interfaceC8487f);
            } finally {
                interfaceC8485dMo18044n1.mo32635i().mo27847w();
                interfaceC8485dMo18044n1.mo32633g(jMo32628b);
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m37264a((InterfaceC8487f) obj);
            return C4700i0.f13910a;
        }
    }

    public C9525m(C9515c c9515c) {
        super(null);
        this.f32469b = c9515c;
        c9515c.mo37084d(new a());
        this.f32470c = _UrlKt.FRAGMENT_ENCODE_SET;
        this.f32471d = true;
        this.f32472e = new C9513a();
        this.f32473f = c.f32483r;
        this.f32474g = AbstractC0522j5.m1773e(null, null, 2, null);
        C6461k.a aVar = C6461k.f20335b;
        this.f32476i = AbstractC0522j5.m1773e(C6461k.m25615c(aVar.m25627b()), null, 2, null);
        this.f32477j = aVar.m25626a();
        this.f32478k = 1.0f;
        this.f32479l = 1.0f;
        this.f32480m = new b();
    }

    @Override // p350y1.AbstractC9524l
    /* JADX INFO: renamed from: a */
    public void mo37082a(InterfaceC8487f interfaceC8487f) {
        m37254i(interfaceC8487f, 1.0f, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m37253h() {
        this.f32471d = true;
        this.f32473f.invoke();
    }

    /* JADX INFO: renamed from: i */
    public final void m37254i(InterfaceC8487f interfaceC8487f, float f10, AbstractC7133r1 abstractC7133r1) {
        InterfaceC8487f interfaceC8487f2;
        int iM27932a = (this.f32469b.m37089j() && this.f32469b.m37086g() != 16 && AbstractC9527o.m37284f(m37256k()) && AbstractC9527o.m37284f(abstractC7133r1)) ? C7094j2.f23571b.m27932a() : C7094j2.f23571b.m27933b();
        if (!this.f32471d && C6461k.m25618f(this.f32477j, interfaceC8487f.mo18037b()) && C7094j2.m27928i(iM27932a, m37255j())) {
            interfaceC8487f2 = interfaceC8487f;
        } else {
            this.f32475h = C7094j2.m27928i(iM27932a, C7094j2.f23571b.m27932a()) ? AbstractC7133r1.a.m28191b(AbstractC7133r1.f23666b, AbstractC9527o.m37285g(this.f32469b.m37086g()), 0, 2, null) : null;
            this.f32478k = Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() >> 32)) / Float.intBitsToFloat((int) (m37258m() >> 32));
            this.f32479l = Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() & 4294967295L)) / Float.intBitsToFloat((int) (m37258m() & 4294967295L));
            interfaceC8487f2 = interfaceC8487f;
            this.f32472e.m37077b(iM27932a, C3189s.m12082c((((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() & 4294967295L))))) & 4294967295L) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC8487f.mo18037b() >> 32))))) << 32)), interfaceC8487f2, interfaceC8487f.getLayoutDirection(), this.f32480m);
            this.f32471d = false;
            this.f32477j = interfaceC8487f2.mo18037b();
        }
        if (abstractC7133r1 == null) {
            abstractC7133r1 = m37256k() != null ? m37256k() : this.f32475h;
        }
        this.f32472e.m37078c(interfaceC8487f2, f10, abstractC7133r1);
    }

    /* JADX INFO: renamed from: j */
    public final int m37255j() {
        InterfaceC7089i2 interfaceC7089i2M37079d = this.f32472e.m37079d();
        return interfaceC7089i2M37079d != null ? interfaceC7089i2M37079d.mo27907c() : C7094j2.f23571b.m27933b();
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC7133r1 m37256k() {
        return (AbstractC7133r1) this.f32474g.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final C9515c m37257l() {
        return this.f32469b;
    }

    /* JADX INFO: renamed from: m */
    public final long m37258m() {
        return ((C6461k) this.f32476i.getValue()).m25625m();
    }

    /* JADX INFO: renamed from: n */
    public final void m37259n(AbstractC7133r1 abstractC7133r1) {
        this.f32474g.setValue(abstractC7133r1);
    }

    /* JADX INFO: renamed from: o */
    public final void m37260o(InterfaceC0173a interfaceC0173a) {
        this.f32473f = interfaceC0173a;
    }

    /* JADX INFO: renamed from: p */
    public final void m37261p(String str) {
        this.f32470c = str;
    }

    /* JADX INFO: renamed from: q */
    public final void m37262q(long j10) {
        this.f32476i.setValue(C6461k.m25615c(j10));
    }

    public String toString() {
        return "Params: \tname: " + this.f32470c + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (m37258m() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (m37258m() & 4294967295L)) + "\n";
    }

    /* JADX INFO: renamed from: y1.m$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: r */
        public static final c f32483r = new c();

        public c() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m37265a();
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m37265a() {
        }
    }
}
