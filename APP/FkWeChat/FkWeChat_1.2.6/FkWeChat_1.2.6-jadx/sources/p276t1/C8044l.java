package p276t1;

import p024b9.AbstractC1043k;
import p265s1.AbstractC7138s1;
import p265s1.C7128q1;
import p276t1.AbstractC8025b;

/* JADX INFO: renamed from: t1.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8044l {

    /* JADX INFO: renamed from: g */
    public static final a f26821g = new a(null);

    /* JADX INFO: renamed from: h */
    public static final int f26822h = 8;

    /* JADX INFO: renamed from: a */
    public final AbstractC8027c f26823a;

    /* JADX INFO: renamed from: b */
    public final AbstractC8027c f26824b;

    /* JADX INFO: renamed from: c */
    public final AbstractC8027c f26825c;

    /* JADX INFO: renamed from: d */
    public final AbstractC8027c f26826d;

    /* JADX INFO: renamed from: e */
    public final int f26827e;

    /* JADX INFO: renamed from: f */
    public final float[] f26828f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8044l(AbstractC8027c abstractC8027c, AbstractC8027c abstractC8027c2, int i10) {
        long jM30852e = abstractC8027c.m30852e();
        AbstractC8025b.a aVar = AbstractC8025b.f26749a;
        this(abstractC8027c, abstractC8027c2, AbstractC8025b.m30841e(jM30852e, aVar.m30846b()) ? AbstractC8029d.m30861d(abstractC8027c, C8047o.f26833a.m30973b(), null, 2, null) : abstractC8027c, AbstractC8025b.m30841e(abstractC8027c2.m30852e(), aVar.m30846b()) ? AbstractC8029d.m30861d(abstractC8027c2, C8047o.f26833a.m30973b(), null, 2, null) : abstractC8027c2, i10, f26821g.m30968b(abstractC8027c, abstractC8027c2, i10), null);
    }

    /* JADX INFO: renamed from: a */
    public long mo30966a(long j10) {
        float fM28136v = C7128q1.m28136v(j10);
        float fM28135u = C7128q1.m28135u(j10);
        float fM28133s = C7128q1.m28133s(j10);
        float fM28132r = C7128q1.m28132r(j10);
        long jMo30855h = this.f26825c.mo30855h(fM28136v, fM28135u, fM28133s);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo30855h >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo30855h & 4294967295L));
        float fMo30856i = this.f26825c.mo30856i(fM28136v, fM28135u, fM28133s);
        float[] fArr = this.f26828f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fMo30856i *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        return this.f26826d.mo30857j(f10, fIntBitsToFloat2, fMo30856i, fM28132r, this.f26824b);
    }

    /* JADX INFO: renamed from: t1.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final float[] m30968b(AbstractC8027c abstractC8027c, AbstractC8027c abstractC8027c2, int i10) {
            if (!AbstractC8050r.m30982e(i10, AbstractC8050r.f26851a.m30983a())) {
                return null;
            }
            long jM30852e = abstractC8027c.m30852e();
            AbstractC8025b.a aVar = AbstractC8025b.f26749a;
            boolean zM30841e = AbstractC8025b.m30841e(jM30852e, aVar.m30846b());
            boolean zM30841e2 = AbstractC8025b.m30841e(abstractC8027c2.m30852e(), aVar.m30846b());
            if (zM30841e && zM30841e2) {
                return null;
            }
            if (!zM30841e && !zM30841e2) {
                return null;
            }
            if (!zM30841e) {
                abstractC8027c = abstractC8027c2;
            }
            C8034f0 c8034f0 = (C8034f0) abstractC8027c;
            float[] fArrM30932c = zM30841e ? c8034f0.m30884B().m30932c() : C8047o.f26833a.m30974c();
            float[] fArrM30932c2 = zM30841e2 ? c8034f0.m30884B().m30932c() : C8047o.f26833a.m30974c();
            return new float[]{fArrM30932c[0] / fArrM30932c2[0], fArrM30932c[1] / fArrM30932c2[1], fArrM30932c[2] / fArrM30932c2[2]};
        }

        /* JADX INFO: renamed from: c */
        public final C8044l m30969c(AbstractC8027c abstractC8027c) {
            return new C10236a(abstractC8027c, AbstractC8050r.f26851a.m30985c());
        }

        public a() {
        }

        /* JADX INFO: renamed from: t1.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10236a extends C8044l {
            public C10236a(AbstractC8027c abstractC8027c, int i10) {
                super(abstractC8027c, abstractC8027c, i10, null);
            }

            @Override // p276t1.C8044l
            /* JADX INFO: renamed from: a */
            public long mo30966a(long j10) {
                return j10;
            }
        }
    }

    /* JADX INFO: renamed from: t1.l$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends C8044l {

        /* JADX INFO: renamed from: i */
        public final C8034f0 f26829i;

        /* JADX INFO: renamed from: j */
        public final C8034f0 f26830j;

        /* JADX INFO: renamed from: k */
        public final float[] f26831k;

        public b(C8034f0 c8034f0, C8034f0 c8034f02, int i10) {
            super(c8034f0, c8034f02, c8034f0, c8034f02, i10, null, null);
            this.f26829i = c8034f0;
            this.f26830j = c8034f02;
            this.f26831k = m30970b(c8034f0, c8034f02, i10);
        }

        @Override // p276t1.C8044l
        /* JADX INFO: renamed from: a */
        public long mo30966a(long j10) {
            float fM28136v = C7128q1.m28136v(j10);
            float fM28135u = C7128q1.m28135u(j10);
            float fM28133s = C7128q1.m28133s(j10);
            float fM28132r = C7128q1.m28132r(j10);
            float fMo30836a = (float) this.f26829i.m30886s().mo30836a(fM28136v);
            float fMo30836a2 = (float) this.f26829i.m30886s().mo30836a(fM28135u);
            float fMo30836a3 = (float) this.f26829i.m30886s().mo30836a(fM28133s);
            float[] fArr = this.f26831k;
            return AbstractC7138s1.m28197a((float) this.f26830j.m30890w().mo30836a((fArr[0] * fMo30836a) + (fArr[3] * fMo30836a2) + (fArr[6] * fMo30836a3)), (float) this.f26830j.m30890w().mo30836a((fArr[1] * fMo30836a) + (fArr[4] * fMo30836a2) + (fArr[7] * fMo30836a3)), (float) this.f26830j.m30890w().mo30836a((fArr[2] * fMo30836a) + (fArr[5] * fMo30836a2) + (fArr[8] * fMo30836a3)), fM28132r, this.f26830j);
        }

        /* JADX INFO: renamed from: b */
        public final float[] m30970b(C8034f0 c8034f0, C8034f0 c8034f02, int i10) {
            if (AbstractC8029d.m30863f(c8034f0.m30884B(), c8034f02.m30884B())) {
                return AbstractC8029d.m30869l(c8034f02.m30888u(), c8034f0.m30883A());
            }
            float[] fArrM30883A = c8034f0.m30883A();
            float[] fArrM30888u = c8034f02.m30888u();
            float[] fArrM30932c = c8034f0.m30884B().m30932c();
            float[] fArrM30932c2 = c8034f02.m30884B().m30932c();
            C8040i0 c8040i0M30884B = c8034f0.m30884B();
            C8047o c8047o = C8047o.f26833a;
            if (!AbstractC8029d.m30863f(c8040i0M30884B, c8047o.m30973b())) {
                fArrM30883A = AbstractC8029d.m30869l(AbstractC8029d.m30862e(AbstractC8023a.f26742b.m30835a().m30834b(), fArrM30932c, c8047o.m30977f()), c8034f0.m30883A());
            }
            if (!AbstractC8029d.m30863f(c8034f02.m30884B(), c8047o.m30973b())) {
                fArrM30888u = AbstractC8029d.m30868k(AbstractC8029d.m30869l(AbstractC8029d.m30862e(AbstractC8023a.f26742b.m30835a().m30834b(), fArrM30932c2, c8047o.m30977f()), c8034f02.m30883A()));
            }
            if (AbstractC8050r.m30982e(i10, AbstractC8050r.f26851a.m30983a())) {
                fArrM30883A = AbstractC8029d.m30870m(new float[]{fArrM30932c[0] / fArrM30932c2[0], fArrM30932c[1] / fArrM30932c2[1], fArrM30932c[2] / fArrM30932c2[2]}, fArrM30883A);
            }
            return AbstractC8029d.m30869l(fArrM30888u, fArrM30883A);
        }

        public /* synthetic */ b(C8034f0 c8034f0, C8034f0 c8034f02, int i10, AbstractC1043k abstractC1043k) {
            this(c8034f0, c8034f02, i10);
        }
    }

    public /* synthetic */ C8044l(AbstractC8027c abstractC8027c, AbstractC8027c abstractC8027c2, AbstractC8027c abstractC8027c3, AbstractC8027c abstractC8027c4, int i10, float[] fArr, AbstractC1043k abstractC1043k) {
        this(abstractC8027c, abstractC8027c2, abstractC8027c3, abstractC8027c4, i10, fArr);
    }

    public C8044l(AbstractC8027c abstractC8027c, AbstractC8027c abstractC8027c2, AbstractC8027c abstractC8027c3, AbstractC8027c abstractC8027c4, int i10, float[] fArr) {
        this.f26823a = abstractC8027c;
        this.f26824b = abstractC8027c2;
        this.f26825c = abstractC8027c3;
        this.f26826d = abstractC8027c4;
        this.f26827e = i10;
        this.f26828f = fArr;
    }

    public /* synthetic */ C8044l(AbstractC8027c abstractC8027c, AbstractC8027c abstractC8027c2, int i10, AbstractC1043k abstractC1043k) {
        this(abstractC8027c, abstractC8027c2, i10);
    }
}
