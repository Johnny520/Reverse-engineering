package p233q;

import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p024b9.C1044k0;
import p080f9.AbstractC2368o;
import p121i3.C3179i;
import p163l.C4312j;
import p163l.InterfaceC4266a0;
import p163l.InterfaceC4317k;
import p172l8.C4700i0;
import p219p.InterfaceC5836c1;
import p219p.InterfaceC5902x1;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: q.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6091m {

    /* JADX INFO: renamed from: a */
    public static final float f19124a = C3179i.m12003k(400);

    /* JADX INFO: renamed from: q.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public float f19125q;

        /* JADX INFO: renamed from: r */
        public Object f19126r;

        /* JADX INFO: renamed from: s */
        public Object f19127s;

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f19128t;

        /* JADX INFO: renamed from: u */
        public int f19129u;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f19128t = obj;
            this.f19129u |= Integer.MIN_VALUE;
            return AbstractC6091m.m24237f(null, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: q.m$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public float f19130q;

        /* JADX INFO: renamed from: r */
        public float f19131r;

        /* JADX INFO: renamed from: s */
        public Object f19132s;

        /* JADX INFO: renamed from: t */
        public Object f19133t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f19134u;

        /* JADX INFO: renamed from: v */
        public int f19135v;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f19134u = obj;
            this.f19135v |= Integer.MIN_VALUE;
            return AbstractC6091m.m24239h(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m24232a(float f10, C1044k0 c1044k0, InterfaceC5836c1 interfaceC5836c1, InterfaceC0184l interfaceC0184l, C4312j c4312j) {
        if (Math.abs(((Number) c4312j.m16943e()).floatValue()) >= Math.abs(f10)) {
            float fM24243l = m24243l(((Number) c4312j.m16943e()).floatValue(), f10);
            m24238g(c4312j, interfaceC5836c1, interfaceC0184l, fM24243l - c1044k0.f3203q);
            c4312j.m16939a();
            c1044k0.f3203q = fM24243l;
        } else {
            m24238g(c4312j, interfaceC5836c1, interfaceC0184l, ((Number) c4312j.m16943e()).floatValue() - c1044k0.f3203q);
            c1044k0.f3203q = ((Number) c4312j.m16943e()).floatValue();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m24233b(float f10, C1044k0 c1044k0, InterfaceC5836c1 interfaceC5836c1, InterfaceC0184l interfaceC0184l, C4312j c4312j) {
        float fMo23523g;
        float fM24243l = m24243l(((Number) c4312j.m16943e()).floatValue(), f10);
        float f11 = fM24243l - c1044k0.f3203q;
        try {
            fMo23523g = interfaceC5836c1.mo23523g(f11);
        } catch (CancellationException unused) {
            c4312j.m16939a();
            fMo23523g = 0.0f;
        }
        interfaceC0184l.mo27m(Float.valueOf(fMo23523g));
        if (Math.abs(f11 - fMo23523g) > 0.5f || fM24243l != ((Number) c4312j.m16943e()).floatValue()) {
            c4312j.m16939a();
        }
        c1044k0.f3203q += fMo23523g;
        return C4700i0.f13910a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m24237f(final p219p.InterfaceC5836c1 r5, final float r6, p163l.C4327m r7, p163l.InterfaceC4266a0 r8, final p010a9.InterfaceC0184l r9, p228p8.InterfaceC5976f r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof p233q.AbstractC6091m.a
            if (r0 == 0) goto L13
            r0 = r10
            q.m$a r0 = (p233q.AbstractC6091m.a) r0
            int r1 = r0.f19129u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19129u = r1
            goto L18
        L13:
            q.m$a r0 = new q.m$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f19128t
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f19129u
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            float r6 = r0.f19125q
            java.lang.Object r5 = r0.f19127s
            b9.k0 r5 = (p024b9.C1044k0) r5
            java.lang.Object r7 = r0.f19126r
            l.m r7 = (p163l.C4327m) r7
            p172l8.AbstractC4713t.m18808b(r10)
            goto L6a
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L3a:
            p172l8.AbstractC4713t.m18808b(r10)
            b9.k0 r10 = new b9.k0
            r10.<init>()
            java.lang.Object r2 = r7.m16984l()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L53
            r2 = r3
            goto L54
        L53:
            r2 = 0
        L54:
            r2 = r2 ^ r3
            q.k r4 = new q.k
            r4.<init>()
            r0.f19126r = r7
            r0.f19127s = r10
            r0.f19125q = r6
            r0.f19129u = r3
            java.lang.Object r5 = p163l.AbstractC4394z1.m17185o(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L69
            return r1
        L69:
            r5 = r10
        L6a:
            q.a r8 = new q.a
            float r5 = r5.f3203q
            float r6 = r6 - r5
            java.lang.Float r5 = p257r8.AbstractC6533b.m25847c(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p233q.AbstractC6091m.m24237f(p.c1, float, l.m, l.a0, a9.l, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public static final void m24238g(C4312j c4312j, InterfaceC5836c1 interfaceC5836c1, InterfaceC0184l interfaceC0184l, float f10) {
        float fMo23523g;
        try {
            fMo23523g = interfaceC5836c1.mo23523g(f10);
        } catch (CancellationException unused) {
            c4312j.m16939a();
            fMo23523g = 0.0f;
        }
        interfaceC0184l.mo27m(Float.valueOf(fMo23523g));
        if (Math.abs(f10 - fMo23523g) > 0.5f) {
            c4312j.m16939a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m24239h(final p219p.InterfaceC5836c1 r20, float r21, final float r22, p163l.C4327m r23, p163l.InterfaceC4317k r24, final p010a9.InterfaceC0184l r25, p228p8.InterfaceC5976f r26) throws java.lang.Throwable {
        /*
            r0 = r26
            boolean r1 = r0 instanceof p233q.AbstractC6091m.b
            if (r1 == 0) goto L16
            r1 = r0
            q.m$b r1 = (p233q.AbstractC6091m.b) r1
            int r2 = r1.f19135v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f19135v = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            q.m$b r1 = new q.m$b
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f19134u
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r7.f19135v
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3b
            float r1 = r7.f19131r
            float r2 = r7.f19130q
            java.lang.Object r3 = r7.f19133t
            b9.k0 r3 = (p024b9.C1044k0) r3
            java.lang.Object r4 = r7.f19132s
            l.m r4 = (p163l.C4327m) r4
            p172l8.AbstractC4713t.m18808b(r0)
            r9 = r2
            r10 = r4
            goto L94
        L3b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r0)
            r0 = 0
            return r0
        L42:
            p172l8.AbstractC4713t.m18808b(r0)
            b9.k0 r0 = new b9.k0
            r0.<init>()
            java.lang.Object r2 = r23.m16984l()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r2 = p257r8.AbstractC6533b.m25847c(r21)
            java.lang.Object r4 = r23.m16984l()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L69
            r4 = r3
            goto L6a
        L69:
            r4 = 0
        L6a:
            r5 = r4 ^ 1
            q.l r6 = new q.l
            r4 = r20
            r9 = r22
            r10 = r25
            r6.<init>()
            r4 = r23
            r7.f19132s = r4
            r7.f19133t = r0
            r9 = r21
            r7.f19130q = r9
            r7.f19131r = r8
            r7.f19135v = r3
            r3 = r2
            r2 = r4
            r4 = r24
            java.lang.Object r3 = p163l.AbstractC4394z1.m17187q(r2, r3, r4, r5, r6, r7)
            if (r3 != r1) goto L90
            return r1
        L90:
            r10 = r23
            r3 = r0
            r1 = r8
        L94:
            java.lang.Object r0 = r10.m16984l()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r12 = m24243l(r0, r1)
            q.a r0 = new q.a
            float r1 = r3.f3203q
            float r9 = r9 - r1
            java.lang.Float r1 = p257r8.AbstractC6533b.m25847c(r9)
            r18 = 29
            r19 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            l.m r2 = p163l.AbstractC4332n.m16998g(r10, r11, r12, r13, r15, r17, r18, r19)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p233q.AbstractC6091m.m24239h(p.c1, float, float, l.m, l.k, a9.l, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: i */
    public static final Object m24240i(InterfaceC5836c1 interfaceC5836c1, float f10, float f11, InterfaceC6080b interfaceC6080b, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        return interfaceC6080b.mo24192a(interfaceC5836c1, AbstractC6533b.m25847c(f10), AbstractC6533b.m25847c(f11), interfaceC0184l, interfaceC5976f);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float m24241j(int r3, float r4, float r5) {
        /*
            q.d$a r0 = p233q.AbstractC6082d.f19083a
            int r1 = r0.m24199a()
            boolean r1 = p233q.AbstractC6082d.m24198e(r3, r1)
            r2 = 0
            if (r1 == 0) goto L1a
            float r3 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r4)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L32
            goto L24
        L1a:
            int r1 = r0.m24200b()
            boolean r1 = p233q.AbstractC6082d.m24198e(r3, r1)
            if (r1 == 0) goto L26
        L24:
            r4 = r5
            goto L32
        L26:
            int r5 = r0.m24201c()
            boolean r3 = p233q.AbstractC6082d.m24198e(r3, r5)
            if (r3 == 0) goto L31
            goto L32
        L31:
            r4 = r2
        L32:
            boolean r3 = m24242k(r4)
            if (r3 == 0) goto L39
            return r4
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p233q.AbstractC6091m.m24241j(int, float, float):float");
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m24242k(float f10) {
        return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static final float m24243l(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? AbstractC2368o.m8581h(f10, f11) : AbstractC2368o.m8577d(f10, f11);
    }

    /* JADX INFO: renamed from: m */
    public static final float m24244m() {
        return f19124a;
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC5902x1 m24245n(InterfaceC6092n interfaceC6092n, InterfaceC4266a0 interfaceC4266a0, InterfaceC4317k interfaceC4317k) {
        return new C6086h(interfaceC6092n, interfaceC4266a0, interfaceC4317k);
    }
}
