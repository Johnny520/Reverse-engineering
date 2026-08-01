package p189n;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.InterfaceC0512i2;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p049d9.AbstractC1927c;
import p073f2.AbstractC2234c0;
import p073f2.AbstractC2278y0;
import p073f2.InterfaceC2229a1;
import p073f2.InterfaceC2230b;
import p073f2.InterfaceC2254m0;
import p121i3.C3189s;
import p121i3.InterfaceC3175e;
import p166l2.InterfaceC4553j;
import p172l8.C4700i0;
import p219p.AbstractC5865l0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p250r1.AbstractC6462l;
import p250r1.C6455e;
import p250r1.C6461k;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6542k;
import p265s1.AbstractC7138s1;
import p274t.InterfaceC7887q2;

/* JADX INFO: renamed from: n.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5202d implements InterfaceC5225h2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3175e f15940a;

    /* JADX INFO: renamed from: b */
    public long f15941b;

    /* JADX INFO: renamed from: c */
    public final C5287u0 f15942c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0512i2 f15943d;

    /* JADX INFO: renamed from: e */
    public boolean f15944e;

    /* JADX INFO: renamed from: f */
    public boolean f15945f;

    /* JADX INFO: renamed from: g */
    public long f15946g;

    /* JADX INFO: renamed from: h */
    public long f15947h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2229a1 f15948i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC4553j f15949j;

    /* JADX INFO: renamed from: n.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public long f15950q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f15951r;

        /* JADX INFO: renamed from: t */
        public int f15953t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f15951r = obj;
            this.f15953t |= Integer.MIN_VALUE;
            return C5202d.this.mo21340a(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: n.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: n.d$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC6542k implements InterfaceC0188p {

            /* JADX INFO: renamed from: r */
            public int f15955r;

            /* JADX INFO: renamed from: s */
            public /* synthetic */ Object f15956s;

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ C5202d f15957t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C5202d c5202d, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f15957t = c5202d;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                a aVar = new a(this.f15957t, interfaceC5976f);
                aVar.f15956s = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
            
                if (r15 != r0) goto L18;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
            @Override // p257r8.AbstractC6532a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 223
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p189n.C5202d.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p010a9.InterfaceC0188p
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2230b interfaceC2230b, InterfaceC5976f interfaceC5976f) {
                return ((a) create(interfaceC2230b, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }
        }

        public b() {
        }

        @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC2254m0 interfaceC2254m0, InterfaceC5976f interfaceC5976f) {
            Object objM23631d = AbstractC5865l0.m23631d(interfaceC2254m0, new a(C5202d.this, null), interfaceC5976f);
            return objM23631d == AbstractC6325c.m24992g() ? objM23631d : C4700i0.f13910a;
        }
    }

    public C5202d(Context context, InterfaceC3175e interfaceC3175e, long j10, InterfaceC7887q2 interfaceC7887q2) {
        this.f15940a = interfaceC3175e;
        this.f15941b = C6455e.f20314b.m25568b();
        C5287u0 c5287u0 = new C5287u0(context, AbstractC7138s1.m28205i(j10));
        this.f15942c = c5287u0;
        this.f15943d = AbstractC0473c5.m1570i(C4700i0.f13910a, AbstractC0473c5.m1572k());
        this.f15944e = true;
        this.f15946g = C6461k.f20335b.m25627b();
        this.f15947h = AbstractC2234c0.m8063a(-1L);
        InterfaceC2229a1 interfaceC2229a1M8288a = AbstractC2278y0.m8288a(new b());
        this.f15948i = interfaceC2229a1M8288a;
        this.f15949j = Build.VERSION.SDK_INT >= 31 ? new C5276r3(interfaceC2229a1M8288a, this, c5287u0) : new C5199c1(interfaceC2229a1M8288a, this, c5287u0, interfaceC7887q2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r14.invoke(r12, r0) == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
    
        if (r15 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p189n.InterfaceC5225h2
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo21340a(long r12, p010a9.InterfaceC0188p r14, p228p8.InterfaceC5976f r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p189n.C5202d.mo21340a(long, a9.p, p8.f):java.lang.Object");
    }

    @Override // p189n.InterfaceC5225h2
    /* JADX INFO: renamed from: b */
    public boolean mo21341b() {
        C5287u0 c5287u0 = this.f15942c;
        EdgeEffect edgeEffect = c5287u0.f16245d;
        if (edgeEffect != null && C5278s0.f16212a.m21544c(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = c5287u0.f16246e;
        if (edgeEffect2 != null && C5278s0.f16212a.m21544c(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = c5287u0.f16247f;
        if (edgeEffect3 != null && C5278s0.f16212a.m21544c(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = c5287u0.f16248g;
        return (edgeEffect4 == null || C5278s0.f16212a.m21544c(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[PHI: r11
  0x00b8: PHI (r11v9 float) = (r11v8 float), (r11v12 float) binds: [B:43:0x00e9, B:32:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[PHI: r14
  0x0132: PHI (r14v9 float) = (r14v8 float), (r14v12 float) binds: [B:67:0x0162, B:56:0x012b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p189n.InterfaceC5225h2
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo21342c(long r20, int r22, p010a9.InterfaceC0184l r23) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p189n.C5202d.mo21342c(long, int, a9.l):long");
    }

    /* JADX INFO: renamed from: g */
    public final void m21343g() {
        boolean z10;
        C5287u0 c5287u0 = this.f15942c;
        EdgeEffect edgeEffect = c5287u0.f16245d;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = c5287u0.f16246e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 = !edgeEffect2.isFinished() || z10;
        }
        EdgeEffect edgeEffect3 = c5287u0.f16247f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 = !edgeEffect3.isFinished() || z10;
        }
        EdgeEffect edgeEffect4 = c5287u0.f16248g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            m21346j();
        }
    }

    /* JADX INFO: renamed from: h */
    public final long m21344h() {
        long jM25628a = this.f15941b;
        if ((9223372034707292159L & jM25628a) == 9205357640488583168L) {
            jM25628a = AbstractC6462l.m25628a(this.f15946g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM25628a >> 32)) / Float.intBitsToFloat((int) (this.f15946g >> 32));
        return C6455e.m25551e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM25628a & 4294967295L)) / Float.intBitsToFloat((int) (this.f15946g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0512i2 m21345i() {
        return this.f15943d;
    }

    /* JADX INFO: renamed from: j */
    public final void m21346j() {
        if (this.f15944e) {
            this.f15943d.setValue(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: k */
    public final float m21347k(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m21344h() >> 32));
        int i10 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f15946g & 4294967295L));
        EdgeEffect edgeEffectM21571g = this.f15942c.m21571g();
        C5278s0 c5278s0 = C5278s0.f16212a;
        return c5278s0.m21544c(edgeEffectM21571g) == 0.0f ? (-c5278s0.m21546e(edgeEffectM21571g, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.f15946g & 4294967295L)) : Float.intBitsToFloat(i10);
    }

    /* JADX INFO: renamed from: l */
    public final float m21348l(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m21344h() & 4294967295L));
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f15946g >> 32));
        EdgeEffect edgeEffectM21573i = this.f15942c.m21573i();
        C5278s0 c5278s0 = C5278s0.f16212a;
        return c5278s0.m21544c(edgeEffectM21573i) == 0.0f ? c5278s0.m21546e(edgeEffectM21573i, fIntBitsToFloat2, 1 - fIntBitsToFloat) * Float.intBitsToFloat((int) (this.f15946g >> 32)) : Float.intBitsToFloat(i10);
    }

    /* JADX INFO: renamed from: m */
    public final float m21349m(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m21344h() & 4294967295L));
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f15946g >> 32));
        EdgeEffect edgeEffectM21575k = this.f15942c.m21575k();
        C5278s0 c5278s0 = C5278s0.f16212a;
        return c5278s0.m21544c(edgeEffectM21575k) == 0.0f ? (-c5278s0.m21546e(edgeEffectM21575k, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.f15946g >> 32)) : Float.intBitsToFloat(i10);
    }

    /* JADX INFO: renamed from: n */
    public final float m21350n(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m21344h() >> 32));
        int i10 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f15946g & 4294967295L));
        EdgeEffect edgeEffectM21577m = this.f15942c.m21577m();
        C5278s0 c5278s0 = C5278s0.f16212a;
        return c5278s0.m21544c(edgeEffectM21577m) == 0.0f ? c5278s0.m21546e(edgeEffectM21577m, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (this.f15946g & 4294967295L)) : Float.intBitsToFloat(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m21351o(long r11) {
        /*
            r10 = this;
            n.u0 r0 = r10.f15942c
            boolean r0 = r0.m21583s()
            r1 = 32
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L2d
            long r4 = r11 >> r1
            int r0 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L2d
            n.s0 r4 = p189n.C5278s0.f16212a
            n.u0 r5 = r10.f15942c
            android.widget.EdgeEffect r5 = r5.m21573i()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r4.m21547f(r5, r0)
            n.u0 r0 = r10.f15942c
            boolean r0 = r0.m21583s()
            goto L2e
        L2d:
            r0 = r3
        L2e:
            n.u0 r4 = r10.f15942c
            boolean r4 = r4.m21586v()
            r5 = 1
            if (r4 == 0) goto L5f
            long r6 = r11 >> r1
            int r1 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5f
            n.s0 r4 = p189n.C5278s0.f16212a
            n.u0 r6 = r10.f15942c
            android.widget.EdgeEffect r6 = r6.m21575k()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.m21547f(r6, r1)
            if (r0 != 0) goto L5e
            n.u0 r0 = r10.f15942c
            boolean r0 = r0.m21586v()
            if (r0 == 0) goto L5c
            goto L5e
        L5c:
            r0 = r3
            goto L5f
        L5e:
            r0 = r5
        L5f:
            n.u0 r1 = r10.f15942c
            boolean r1 = r1.m21590z()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 == 0) goto L94
            long r8 = r11 & r6
            int r1 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r1)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L94
            n.s0 r4 = p189n.C5278s0.f16212a
            n.u0 r8 = r10.f15942c
            android.widget.EdgeEffect r8 = r8.m21577m()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r4.m21547f(r8, r1)
            if (r0 != 0) goto L93
            n.u0 r0 = r10.f15942c
            boolean r0 = r0.m21590z()
            if (r0 == 0) goto L91
            goto L93
        L91:
            r0 = r3
            goto L94
        L93:
            r0 = r5
        L94:
            n.u0 r1 = r10.f15942c
            boolean r1 = r1.m21580p()
            if (r1 == 0) goto Lc2
            long r11 = r11 & r6
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 <= 0) goto Lc2
            n.s0 r12 = p189n.C5278s0.f16212a
            n.u0 r1 = r10.f15942c
            android.widget.EdgeEffect r1 = r1.m21571g()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r12.m21547f(r1, r11)
            if (r0 != 0) goto Lc1
            n.u0 r11 = r10.f15942c
            boolean r11 = r11.m21580p()
            if (r11 == 0) goto Lc0
            goto Lc1
        Lc0:
            return r3
        Lc1:
            return r5
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p189n.C5202d.m21351o(long):boolean");
    }

    /* JADX INFO: renamed from: p */
    public final void m21352p(long j10) {
        boolean zM25618f = C6461k.m25618f(this.f15946g, C6461k.f20335b.m25627b());
        boolean zM25618f2 = C6461k.m25618f(j10, this.f15946g);
        this.f15946g = j10;
        if (!zM25618f2) {
            C5287u0 c5287u0 = this.f15942c;
            int iM6980d = AbstractC1927c.m6980d(Float.intBitsToFloat((int) (j10 >> 32)));
            c5287u0.m21568C(C3189s.m12082c((((long) AbstractC1927c.m6980d(Float.intBitsToFloat((int) (j10 & 4294967295L)))) & 4294967295L) | (((long) iM6980d) << 32)));
        }
        if (zM25618f || zM25618f2) {
            return;
        }
        m21343g();
    }

    @Override // p189n.InterfaceC5225h2
    /* JADX INFO: renamed from: z */
    public InterfaceC4553j mo21353z() {
        return this.f15949j;
    }

    public /* synthetic */ C5202d(Context context, InterfaceC3175e interfaceC3175e, long j10, InterfaceC7887q2 interfaceC7887q2, AbstractC1043k abstractC1043k) {
        this(context, interfaceC3175e, j10, interfaceC7887q2);
    }
}
