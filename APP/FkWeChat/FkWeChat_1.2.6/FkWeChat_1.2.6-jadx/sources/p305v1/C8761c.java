package p305v1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p121i3.AbstractC3190t;
import p121i3.C3185o;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p172l8.C4700i0;
import p215oc.C5725t;
import p215oc.C5729x;
import p250r1.AbstractC6451a;
import p250r1.AbstractC6460j;
import p250r1.C6455e;
import p250r1.C6457g;
import p250r1.C6461k;
import p265s1.AbstractC7060c3;
import p265s1.AbstractC7072f0;
import p265s1.AbstractC7123p1;
import p265s1.AbstractC7124p2;
import p265s1.AbstractC7127q0;
import p265s1.AbstractC7133r1;
import p265s1.AbstractC7147u0;
import p265s1.AbstractC7168z0;
import p265s1.C7128q1;
import p265s1.C7132r0;
import p265s1.InterfaceC7088i1;
import p265s1.InterfaceC7134r2;
import p265s1.InterfaceC7144t2;
import p290u1.AbstractC8486e;
import p290u1.C8482a;
import p290u1.InterfaceC8485d;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: v1.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8761c {

    /* JADX INFO: renamed from: A */
    public static final boolean f29154A;

    /* JADX INFO: renamed from: B */
    public static final InterfaceC8768f0 f29155B;

    /* JADX INFO: renamed from: y */
    public static final a f29156y = new a(null);

    /* JADX INFO: renamed from: z */
    public static final int f29157z = 8;

    /* JADX INFO: renamed from: a */
    public final InterfaceC8763d f29158a;

    /* JADX INFO: renamed from: f */
    public Outline f29163f;

    /* JADX INFO: renamed from: h */
    public long f29165h;

    /* JADX INFO: renamed from: i */
    public long f29166i;

    /* JADX INFO: renamed from: j */
    public float f29167j;

    /* JADX INFO: renamed from: k */
    public AbstractC7124p2 f29168k;

    /* JADX INFO: renamed from: l */
    public InterfaceC7144t2 f29169l;

    /* JADX INFO: renamed from: m */
    public InterfaceC7144t2 f29170m;

    /* JADX INFO: renamed from: n */
    public boolean f29171n;

    /* JADX INFO: renamed from: o */
    public C8482a f29172o;

    /* JADX INFO: renamed from: p */
    public InterfaceC7134r2 f29173p;

    /* JADX INFO: renamed from: q */
    public int f29174q;

    /* JADX INFO: renamed from: r */
    public final C8757a f29175r;

    /* JADX INFO: renamed from: s */
    public boolean f29176s;

    /* JADX INFO: renamed from: t */
    public long f29177t;

    /* JADX INFO: renamed from: u */
    public long f29178u;

    /* JADX INFO: renamed from: v */
    public long f29179v;

    /* JADX INFO: renamed from: w */
    public boolean f29180w;

    /* JADX INFO: renamed from: x */
    public RectF f29181x;

    /* JADX INFO: renamed from: b */
    public InterfaceC3175e f29159b = AbstractC8486e.m32646a();

    /* JADX INFO: renamed from: c */
    public EnumC3191u f29160c = EnumC3191u.f8484q;

    /* JADX INFO: renamed from: d */
    public InterfaceC0184l f29161d = c.f29183r;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0184l f29162e = new b();

    /* JADX INFO: renamed from: g */
    public boolean f29164g = true;

    /* JADX INFO: renamed from: v1.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {
        public b() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m33672a(InterfaceC8487f interfaceC8487f) {
            InterfaceC7144t2 interfaceC7144t2 = C8761c.this.f29169l;
            if (!C8761c.this.f29171n || !C8761c.this.m33657l() || interfaceC7144t2 == null) {
                C8761c.this.m33652i(interfaceC8487f);
                return;
            }
            C8761c c8761c = C8761c.this;
            int iM28085b = AbstractC7123p1.f23633a.m28085b();
            InterfaceC8485d interfaceC8485dMo18044n1 = interfaceC8487f.mo18044n1();
            long jMo32628b = interfaceC8485dMo18044n1.mo32628b();
            interfaceC8485dMo18044n1.mo32635i().mo27841n();
            try {
                interfaceC8485dMo18044n1.mo32632f().mo32639b(interfaceC7144t2, iM28085b);
                c8761c.m33652i(interfaceC8487f);
            } finally {
                interfaceC8485dMo18044n1.mo32635i().mo27847w();
                interfaceC8485dMo18044n1.mo32633g(jMo32628b);
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m33672a((InterfaceC8487f) obj);
            return C4700i0.f13910a;
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        boolean zM3842c = AbstractC1061t.m3842c(lowerCase, "robolectric");
        f29154A = zM3842c;
        f29155B = zM3842c ? C8770g0.f29289a : Build.VERSION.SDK_INT >= 28 ? C8774i0.f29291a : C8790q0.f29297a.m33766a() ? C8772h0.f29290a : C8770g0.f29289a;
    }

    public C8761c(InterfaceC8763d interfaceC8763d) {
        this.f29158a = interfaceC8763d;
        C6455e.a aVar = C6455e.f20314b;
        this.f29165h = aVar.m25569c();
        this.f29166i = C6461k.f20335b.m25626a();
        this.f29175r = new C8757a();
        interfaceC8763d.mo33679E(false);
        this.f29177t = C3185o.f8471b.m12058b();
        this.f29178u = C3189s.f8481b.m12088a();
        this.f29179v = aVar.m25568b();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m33613A() {
        return this.f29176s;
    }

    /* JADX INFO: renamed from: B */
    public final Outline m33614B() {
        Outline outline = this.f29163f;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f29163f = outline2;
        return outline2;
    }

    /* JADX INFO: renamed from: C */
    public final RectF m33615C() {
        RectF rectF = this.f29181x;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.f29181x = rectF2;
        return rectF2;
    }

    /* JADX INFO: renamed from: D */
    public final void m33616D() {
        this.f29174q++;
    }

    /* JADX INFO: renamed from: E */
    public final void m33617E() {
        this.f29174q--;
        m33646f();
    }

    /* JADX INFO: renamed from: F */
    public final void m33618F(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u, long j10, InterfaceC0184l interfaceC0184l) {
        m33643d0(j10);
        this.f29159b = interfaceC3175e;
        this.f29160c = enumC3191u;
        this.f29161d = interfaceC0184l;
        this.f29158a.mo33693b(true);
        m33619G();
    }

    /* JADX INFO: renamed from: G */
    public final void m33619G() {
        this.f29158a.mo33713v(this.f29159b, this.f29160c, this, this.f29162e);
    }

    /* JADX INFO: renamed from: H */
    public final void m33620H() {
        if (this.f29158a.mo33712u()) {
            return;
        }
        try {
            m33619G();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m33621I() {
        if (this.f29176s) {
            return;
        }
        this.f29176s = true;
        m33646f();
    }

    /* JADX INFO: renamed from: J */
    public final void m33622J() {
        this.f29168k = null;
        this.f29169l = null;
        this.f29166i = C6461k.f20335b.m25626a();
        this.f29165h = C6455e.f20314b.m25569c();
        this.f29167j = 0.0f;
        this.f29164g = true;
        this.f29171n = false;
    }

    /* JADX INFO: renamed from: K */
    public final void m33623K(float f10) {
        if (this.f29158a.mo33692a() == f10) {
            return;
        }
        this.f29158a.mo33696e(f10);
    }

    /* JADX INFO: renamed from: L */
    public final void m33624L(long j10) {
        if (C7128q1.m28131q(j10, this.f29158a.mo33717z())) {
            return;
        }
        this.f29158a.mo33716y(j10);
    }

    /* JADX INFO: renamed from: M */
    public final void m33625M(int i10) {
        if (AbstractC7168z0.m28276E(this.f29158a.mo33698g(), i10)) {
            return;
        }
        this.f29158a.mo33694c(i10);
    }

    /* JADX INFO: renamed from: N */
    public final void m33626N(float f10) {
        if (this.f29158a.mo33677C() == f10) {
            return;
        }
        this.f29158a.mo33685K(f10);
    }

    /* JADX INFO: renamed from: O */
    public final void m33627O(boolean z10) {
        if (this.f29180w != z10) {
            this.f29180w = z10;
            this.f29164g = true;
            m33644e();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m33628P(AbstractC7133r1 abstractC7133r1) {
        if (AbstractC1061t.m3842c(this.f29158a.mo33695d(), abstractC7133r1)) {
            return;
        }
        this.f29158a.mo33697f(abstractC7133r1);
    }

    /* JADX INFO: renamed from: Q */
    public final void m33629Q(int i10) {
        if (AbstractC8759b.m33605e(this.f29158a.mo33708q(), i10)) {
            return;
        }
        this.f29158a.mo33688N(i10);
    }

    /* JADX INFO: renamed from: R */
    public final void m33630R(InterfaceC7144t2 interfaceC7144t2) {
        m33622J();
        this.f29169l = interfaceC7144t2;
        m33644e();
    }

    /* JADX INFO: renamed from: S */
    public final void m33631S(long j10) {
        if (C6455e.m25556j(this.f29179v, j10)) {
            return;
        }
        this.f29179v = j10;
        this.f29158a.mo33715x(j10);
    }

    /* JADX INFO: renamed from: T */
    public final void m33632T(long j10, long j11) {
        this.f29158a.mo33711t(C3185o.m12049i(j10), C3185o.m12050j(j10), j11);
    }

    /* JADX INFO: renamed from: U */
    public final void m33633U(long j10, long j11) {
        m33638Z(j10, j11, 0.0f);
    }

    /* JADX INFO: renamed from: V */
    public final void m33634V(AbstractC7060c3 abstractC7060c3) {
        this.f29158a.mo33703l();
        if (AbstractC1061t.m3842c(null, abstractC7060c3)) {
            return;
        }
        this.f29158a.mo33684J(abstractC7060c3);
    }

    /* JADX INFO: renamed from: W */
    public final void m33635W(float f10) {
        if (this.f29158a.mo33680F() == f10) {
            return;
        }
        this.f29158a.mo33687M(f10);
    }

    /* JADX INFO: renamed from: X */
    public final void m33636X(float f10) {
        if (this.f29158a.mo33709r() == f10) {
            return;
        }
        this.f29158a.mo33699h(f10);
    }

    /* JADX INFO: renamed from: Y */
    public final void m33637Y(float f10) {
        if (this.f29158a.mo33710s() == f10) {
            return;
        }
        this.f29158a.mo33702k(f10);
    }

    /* JADX INFO: renamed from: Z */
    public final void m33638Z(long j10, long j11, float f10) {
        if (C6455e.m25556j(this.f29165h, j10) && C6461k.m25618f(this.f29166i, j11) && this.f29167j == f10 && this.f29169l == null) {
            return;
        }
        m33622J();
        this.f29165h = j10;
        this.f29166i = j11;
        this.f29167j = f10;
        m33644e();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m33639a0(float f10) {
        if (this.f29158a.mo33700i() == f10) {
            return;
        }
        this.f29158a.mo33675A(f10);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m33640b0(float f10) {
        if (this.f29158a.mo33686L() == f10) {
            return;
        }
        this.f29158a.mo33707p(f10);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m33641c0(float f10) {
        if (this.f29158a.mo33691Q() == f10) {
            return;
        }
        this.f29158a.mo33701j(f10);
        this.f29164g = true;
        m33644e();
    }

    /* JADX INFO: renamed from: d */
    public final void m33642d(C8761c c8761c) {
        if (this.f29175r.m33599i(c8761c)) {
            c8761c.m33616D();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m33643d0(long j10) {
        if (C3189s.m12084e(this.f29178u, j10)) {
            return;
        }
        this.f29178u = j10;
        m33632T(this.f29177t, j10);
        if (this.f29166i == 9205357640488583168L) {
            this.f29164g = true;
            m33644e();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m33644e() {
        if (this.f29164g) {
            Outline outline = null;
            if (this.f29180w || m33667v() > 0.0f) {
                InterfaceC7144t2 interfaceC7144t2 = this.f29169l;
                if (interfaceC7144t2 != null) {
                    RectF rectFM33615C = m33615C();
                    if (!(interfaceC7144t2 instanceof C7132r0)) {
                        C5725t.m23179a("Unable to obtain android.graphics.Path");
                        return;
                    }
                    ((C7132r0) interfaceC7144t2).m28188v().computeBounds(rectFM33615C, false);
                    Outline outlineM33655j0 = m33655j0(interfaceC7144t2);
                    if (outlineM33655j0 != null) {
                        outlineM33655j0.setAlpha(m33654j());
                        outline = outlineM33655j0;
                    }
                    this.f29158a.mo33705n(outline, C3189s.m12082c((4294967295L & ((long) Math.round(rectFM33615C.height()))) | (((long) Math.round(rectFM33615C.width())) << 32)));
                    if (this.f29171n && this.f29180w) {
                        this.f29158a.mo33679E(false);
                        this.f29158a.mo33706o();
                    } else {
                        this.f29158a.mo33679E(this.f29180w);
                    }
                } else {
                    this.f29158a.mo33679E(this.f29180w);
                    C6461k.f20335b.m25627b();
                    Outline outlineM33614B = m33614B();
                    long jM12092d = AbstractC3190t.m12092d(this.f29178u);
                    long j10 = this.f29165h;
                    long j11 = this.f29166i;
                    long j12 = j11 == 9205357640488583168L ? jM12092d : j11;
                    int i10 = (int) (j10 >> 32);
                    int i11 = (int) (j10 & 4294967295L);
                    outlineM33614B.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j12 >> 32))), Math.round(Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 & 4294967295L))), this.f29167j);
                    outlineM33614B.setAlpha(m33654j());
                    this.f29158a.mo33705n(outlineM33614B, AbstractC3190t.m12090b(j12));
                }
            } else {
                this.f29158a.mo33679E(false);
                this.f29158a.mo33705n(null, C3189s.f8481b.m12088a());
            }
        }
        this.f29164g = false;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m33645e0(long j10) {
        if (C7128q1.m28131q(j10, this.f29158a.mo33681G())) {
            return;
        }
        this.f29158a.mo33683I(j10);
    }

    /* JADX INFO: renamed from: f */
    public final void m33646f() {
        if (this.f29176s && this.f29174q == 0) {
            m33648g();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m33647f0(long j10) {
        if (C3185o.m12048h(this.f29177t, j10)) {
            return;
        }
        this.f29177t = j10;
        m33632T(j10, this.f29178u);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m33648g() {
        /*
            r15 = this;
            v1.a r0 = r15.f29175r
            v1.c r1 = p305v1.C8757a.m33592b(r0)
            if (r1 == 0) goto Lf
            r1.m33617E()
            r1 = 0
            p305v1.C8757a.m33595e(r0, r1)
        Lf:
            i.s0 r0 = p305v1.C8757a.m33591a(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.f8093b
            long[] r2 = r0.f8092a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            v1.c r11 = (p305v1.C8761c) r11
            r11.m33617E()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.m11541m()
        L5d:
            v1.d r0 = r15.f29158a
            r0.mo33706o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305v1.C8761c.m33648g():void");
    }

    /* JADX INFO: renamed from: g0 */
    public final void m33649g0(float f10) {
        if (this.f29158a.mo33678D() == f10) {
            return;
        }
        this.f29158a.mo33682H(f10);
    }

    /* JADX INFO: renamed from: h */
    public final void m33650h(InterfaceC7088i1 interfaceC7088i1, C8761c c8761c) {
        boolean z10;
        boolean z11;
        if (this.f29176s) {
            return;
        }
        m33644e();
        m33620H();
        boolean z12 = m33667v() > 0.0f;
        if (z12) {
            interfaceC7088i1.mo27848x();
        }
        Canvas canvasM27862d = AbstractC7072f0.m27862d(interfaceC7088i1);
        boolean zIsHardwareAccelerated = canvasM27862d.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            m33653i0(canvasM27862d);
        }
        boolean z13 = !zIsHardwareAccelerated && this.f29180w;
        if (z13) {
            interfaceC7088i1.mo27841n();
            AbstractC7124p2 abstractC7124p2M33660o = m33660o();
            if (abstractC7124p2M33660o instanceof AbstractC7124p2.b) {
                InterfaceC7088i1.m27901m(interfaceC7088i1, ((AbstractC7124p2.b) abstractC7124p2M33660o).mo28086a(), 0, 2, null);
            } else if (abstractC7124p2M33660o instanceof AbstractC7124p2.c) {
                InterfaceC7144t2 interfaceC7144t2M28224a = this.f29170m;
                if (interfaceC7144t2M28224a != null) {
                    interfaceC7144t2M28224a.mo28183p();
                } else {
                    interfaceC7144t2M28224a = AbstractC7147u0.m28224a();
                    this.f29170m = interfaceC7144t2M28224a;
                }
                InterfaceC7144t2.m28219i(interfaceC7144t2M28224a, ((AbstractC7124p2.c) abstractC7124p2M33660o).m28089b(), null, 2, null);
                InterfaceC7088i1.m27903v(interfaceC7088i1, interfaceC7144t2M28224a, 0, 2, null);
            } else {
                if (!(abstractC7124p2M33660o instanceof AbstractC7124p2.a)) {
                    C5729x.m23182a();
                    return;
                }
                InterfaceC7088i1.m27903v(interfaceC7088i1, ((AbstractC7124p2.a) abstractC7124p2M33660o).m28087b(), 0, 2, null);
            }
        }
        if (c8761c != null) {
            c8761c.m33642d(this);
        }
        if (AbstractC7072f0.m27862d(interfaceC7088i1).isHardwareAccelerated() || this.f29158a.mo33690P()) {
            z10 = z12;
            z11 = z13;
            this.f29158a.mo33676B(interfaceC7088i1);
        } else {
            C8482a c8482a = this.f29172o;
            if (c8482a == null) {
                c8482a = new C8482a();
                this.f29172o = c8482a;
            }
            InterfaceC8487f interfaceC8487f = c8482a;
            InterfaceC3175e interfaceC3175e = this.f29159b;
            EnumC3191u enumC3191u = this.f29160c;
            long jM12092d = AbstractC3190t.m12092d(this.f29178u);
            InterfaceC3175e density = interfaceC8487f.mo18044n1().getDensity();
            EnumC3191u layoutDirection = interfaceC8487f.mo18044n1().getLayoutDirection();
            InterfaceC7088i1 interfaceC7088i1Mo32635i = interfaceC8487f.mo18044n1().mo32635i();
            long jMo32628b = interfaceC8487f.mo18044n1().mo32628b();
            z10 = z12;
            C8761c c8761cMo32634h = interfaceC8487f.mo18044n1().mo32634h();
            z11 = z13;
            InterfaceC8485d interfaceC8485dMo18044n1 = interfaceC8487f.mo18044n1();
            interfaceC8485dMo18044n1.mo32631e(interfaceC3175e);
            interfaceC8485dMo18044n1.mo32627a(enumC3191u);
            interfaceC8485dMo18044n1.mo32629c(interfaceC7088i1);
            interfaceC8485dMo18044n1.mo32633g(jM12092d);
            interfaceC8485dMo18044n1.mo32630d(this);
            interfaceC7088i1.mo27841n();
            try {
                m33652i(interfaceC8487f);
            } finally {
                interfaceC7088i1.mo27847w();
                InterfaceC8485d interfaceC8485dMo18044n12 = interfaceC8487f.mo18044n1();
                interfaceC8485dMo18044n12.mo32631e(density);
                interfaceC8485dMo18044n12.mo32627a(layoutDirection);
                interfaceC8485dMo18044n12.mo32629c(interfaceC7088i1Mo32635i);
                interfaceC8485dMo18044n12.mo32633g(jMo32628b);
                interfaceC8485dMo18044n12.mo32630d(c8761cMo32634h);
            }
        }
        if (z11) {
            interfaceC7088i1.mo27847w();
        }
        if (z10) {
            interfaceC7088i1.mo27842o();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasM27862d.restore();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m33651h0(float f10) {
        if (this.f29158a.mo33714w() == f10) {
            return;
        }
        this.f29158a.mo33704m(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m33652i(p290u1.InterfaceC8487f r15) {
        /*
            r14 = this;
            v1.a r0 = r14.f29175r
            v1.c r1 = p305v1.C8757a.m33592b(r0)
            p305v1.C8757a.m33597g(r0, r1)
            i.s0 r1 = p305v1.C8757a.m33591a(r0)
            if (r1 == 0) goto L28
            boolean r2 = r1.m11272e()
            if (r2 == 0) goto L28
            i.s0 r2 = p305v1.C8757a.m33593c(r0)
            if (r2 != 0) goto L22
            i.s0 r2 = p117i.AbstractC3050e1.m11284b()
            p305v1.C8757a.m33596f(r0, r2)
        L22:
            r2.m11537i(r1)
            r1.m11541m()
        L28:
            r1 = 1
            p305v1.C8757a.m33598h(r0, r1)
            a9.l r1 = r14.f29161d
            r1.mo27m(r15)
            r15 = 0
            p305v1.C8757a.m33598h(r0, r15)
            v1.c r1 = p305v1.C8757a.m33594d(r0)
            if (r1 == 0) goto L3e
            r1.m33617E()
        L3e:
            i.s0 r0 = p305v1.C8757a.m33593c(r0)
            if (r0 == 0) goto L91
            boolean r1 = r0.m11272e()
            if (r1 == 0) goto L91
            java.lang.Object[] r1 = r0.f8093b
            long[] r2 = r0.f8092a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8e
            r4 = r15
        L54:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L89
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6e:
            if (r9 >= r7) goto L87
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L83
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            v1.c r10 = (p305v1.C8761c) r10
            r10.m33617E()
        L83:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6e
        L87:
            if (r7 != r8) goto L8e
        L89:
            if (r4 == r3) goto L8e
            int r4 = r4 + 1
            goto L54
        L8e:
            r0.m11541m()
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305v1.C8761c.m33652i(u1.f):void");
    }

    /* JADX INFO: renamed from: i0 */
    public final void m33653i0(Canvas canvas) {
        Canvas canvas2;
        float fM12049i = C3185o.m12049i(this.f29177t);
        float fM12050j = C3185o.m12050j(this.f29177t);
        float fM12049i2 = C3185o.m12049i(this.f29177t) + ((int) (this.f29178u >> 32));
        float fM12050j2 = C3185o.m12050j(this.f29177t) + ((int) (this.f29178u & 4294967295L));
        float fM33654j = m33654j();
        AbstractC7133r1 abstractC7133r1M33658m = m33658m();
        int iM33656k = m33656k();
        if (fM33654j < 1.0f || !AbstractC7168z0.m28276E(iM33656k, AbstractC7168z0.f23700a.m28306B()) || abstractC7133r1M33658m != null || AbstractC8759b.m33605e(m33659n(), AbstractC8759b.f29150a.m33608c())) {
            InterfaceC7134r2 interfaceC7134r2M28093a = this.f29173p;
            if (interfaceC7134r2M28093a == null) {
                interfaceC7134r2M28093a = AbstractC7127q0.m28093a();
                this.f29173p = interfaceC7134r2M28093a;
            }
            interfaceC7134r2M28093a.mo28060e(fM33654j);
            interfaceC7134r2M28093a.mo28058c(iM33656k);
            interfaceC7134r2M28093a.mo28061f(abstractC7133r1M33658m);
            canvas2 = canvas;
            canvas2.saveLayer(fM12049i, fM12050j, fM12049i2, fM12050j2, interfaceC7134r2M28093a.mo28066k());
        } else {
            canvas.save();
            canvas2 = canvas;
        }
        canvas2.translate(fM12049i, fM12050j);
        canvas2.concat(this.f29158a.mo33689O());
    }

    /* JADX INFO: renamed from: j */
    public final float m33654j() {
        return this.f29158a.mo33692a();
    }

    /* JADX INFO: renamed from: j0 */
    public final Outline m33655j0(InterfaceC7144t2 interfaceC7144t2) {
        Outline outline;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || interfaceC7144t2.mo28172c()) {
            Outline outlineM33614B = m33614B();
            if (i10 >= 30) {
                C8780l0.f29293a.m33753a(outlineM33614B, interfaceC7144t2);
            } else {
                if (!(interfaceC7144t2 instanceof C7132r0)) {
                    C5725t.m23179a("Unable to obtain android.graphics.Path");
                    return null;
                }
                outlineM33614B.setConvexPath(((C7132r0) interfaceC7144t2).m28188v());
            }
            this.f29171n = !outlineM33614B.canClip();
            outline = outlineM33614B;
        } else {
            Outline outline2 = this.f29163f;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.f29171n = true;
            this.f29158a.mo33693b(true);
            outline = null;
        }
        this.f29169l = interfaceC7144t2;
        return outline;
    }

    /* JADX INFO: renamed from: k */
    public final int m33656k() {
        return this.f29158a.mo33698g();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m33657l() {
        return this.f29180w;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC7133r1 m33658m() {
        return this.f29158a.mo33695d();
    }

    /* JADX INFO: renamed from: n */
    public final int m33659n() {
        return this.f29158a.mo33708q();
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC7124p2 m33660o() {
        AbstractC7124p2 bVar;
        AbstractC7124p2 abstractC7124p2 = this.f29168k;
        InterfaceC7144t2 interfaceC7144t2 = this.f29169l;
        if (abstractC7124p2 != null) {
            return abstractC7124p2;
        }
        if (interfaceC7144t2 != null) {
            AbstractC7124p2.a aVar = new AbstractC7124p2.a(interfaceC7144t2);
            this.f29168k = aVar;
            return aVar;
        }
        long jM12092d = AbstractC3190t.m12092d(this.f29178u);
        long j10 = this.f29165h;
        long j11 = this.f29166i;
        if (j11 != 9205357640488583168L) {
            jM12092d = j11;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM12092d >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jM12092d & 4294967295L));
        float f10 = this.f29167j;
        if (f10 > 0.0f) {
            bVar = new AbstractC7124p2.c(AbstractC6460j.m25610c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, AbstractC6451a.m25527b((((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f10))))));
        } else {
            bVar = new AbstractC7124p2.b(new C6457g(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f29168k = bVar;
        return bVar;
    }

    /* JADX INFO: renamed from: p */
    public final long m33661p() {
        return this.f29179v;
    }

    /* JADX INFO: renamed from: q */
    public final float m33662q() {
        return this.f29158a.mo33680F();
    }

    /* JADX INFO: renamed from: r */
    public final float m33663r() {
        return this.f29158a.mo33709r();
    }

    /* JADX INFO: renamed from: s */
    public final float m33664s() {
        return this.f29158a.mo33710s();
    }

    /* JADX INFO: renamed from: t */
    public final float m33665t() {
        return this.f29158a.mo33700i();
    }

    /* JADX INFO: renamed from: u */
    public final float m33666u() {
        return this.f29158a.mo33686L();
    }

    /* JADX INFO: renamed from: v */
    public final float m33667v() {
        return this.f29158a.mo33691Q();
    }

    /* JADX INFO: renamed from: w */
    public final long m33668w() {
        return this.f29178u;
    }

    /* JADX INFO: renamed from: x */
    public final long m33669x() {
        return this.f29177t;
    }

    /* JADX INFO: renamed from: y */
    public final float m33670y() {
        return this.f29158a.mo33678D();
    }

    /* JADX INFO: renamed from: z */
    public final float m33671z() {
        return this.f29158a.mo33714w();
    }

    /* JADX INFO: renamed from: v1.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: v1.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final c f29183r = new c();

        public c() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m33673a((InterfaceC8487f) obj);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m33673a(InterfaceC8487f interfaceC8487f) {
        }
    }
}
