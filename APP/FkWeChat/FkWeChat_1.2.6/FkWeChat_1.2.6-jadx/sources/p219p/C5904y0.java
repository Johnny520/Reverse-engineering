package p219p;

import nc.AbstractC5568g;
import nc.InterfaceC5562a;
import p121i3.InterfaceC3175e;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: p.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5904y0 implements InterfaceC5901x0, InterfaceC3175e {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC3175e f18794q;

    /* JADX INFO: renamed from: r */
    public boolean f18795r;

    /* JADX INFO: renamed from: s */
    public boolean f18796s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC5562a f18797t = AbstractC5568g.m22626a(false);

    /* JADX INFO: renamed from: p.y0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f18798q;

        /* JADX INFO: renamed from: s */
        public int f18800s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f18798q = obj;
            this.f18800s |= Integer.MIN_VALUE;
            return C5904y0.this.m23805l(this);
        }
    }

    /* JADX INFO: renamed from: p.y0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f18801q;

        /* JADX INFO: renamed from: s */
        public int f18803s;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f18801q = obj;
            this.f18803s |= Integer.MIN_VALUE;
            return C5904y0.this.mo23800F1(this);
        }
    }

    public C5904y0(InterfaceC3175e interfaceC3175e) {
        this.f18794q = interfaceC3175e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p219p.InterfaceC5901x0
    /* JADX INFO: renamed from: F1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo23800F1(p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p219p.C5904y0.b
            if (r0 == 0) goto L13
            r0 = r6
            p.y0$b r0 = (p219p.C5904y0.b) r0
            int r1 = r0.f18803s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18803s = r1
            goto L18
        L13:
            p.y0$b r0 = new p.y0$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f18801q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f18803s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L2a
            p172l8.AbstractC4713t.m18808b(r6)
            goto L47
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L31:
            p172l8.AbstractC4713t.m18808b(r6)
            boolean r6 = r5.f18795r
            if (r6 != 0) goto L4c
            boolean r6 = r5.f18796s
            if (r6 != 0) goto L4c
            nc.a r6 = r5.f18797t
            r0.f18803s = r4
            java.lang.Object r6 = nc.InterfaceC5562a.a.m22610a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L47
            return r1
        L47:
            nc.a r6 = r5.f18797t
            nc.InterfaceC5562a.a.m22612c(r6, r3, r4, r3)
        L4c:
            boolean r6 = r5.f18795r
            java.lang.Boolean r6 = p257r8.AbstractC6533b.m25845a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p219p.C5904y0.mo23800F1(p8.f):java.lang.Object");
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: J0 */
    public long mo1223J0(float f10) {
        return this.f18794q.mo1223J0(f10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: J1 */
    public long mo1224J1(long j10) {
        return this.f18794q.mo1224J1(j10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: O0 */
    public float mo1225O0(int i10) {
        return this.f18794q.mo1225O0(i10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: O1 */
    public float mo1226O1(long j10) {
        return this.f18794q.mo1226O1(j10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: R0 */
    public float mo1227R0(float f10) {
        return this.f18794q.mo1227R0(f10);
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: a0 */
    public long mo1229a0(float f10) {
        return this.f18794q.mo1229a0(f10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: c0 */
    public long mo1230c0(long j10) {
        return this.f18794q.mo1230c0(j10);
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: c1 */
    public float mo1231c1() {
        return this.f18794q.mo1231c1();
    }

    /* JADX INFO: renamed from: d */
    public final void m23803d() {
        this.f18796s = true;
        if (this.f18797t.mo22607b()) {
            InterfaceC5562a.a.m22612c(this.f18797t, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23804g() {
        this.f18795r = true;
        if (this.f18797t.mo22607b()) {
            InterfaceC5562a.a.m22612c(this.f18797t, null, 1, null);
        }
    }

    @Override // p121i3.InterfaceC3175e
    public float getDensity() {
        return this.f18794q.getDensity();
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: i1 */
    public float mo1233i1(float f10) {
        return this.f18794q.mo1233i1(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m23805l(p228p8.InterfaceC5976f r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p219p.C5904y0.a
            if (r0 == 0) goto L13
            r0 = r5
            p.y0$a r0 = (p219p.C5904y0.a) r0
            int r1 = r0.f18800s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18800s = r1
            goto L18
        L13:
            p.y0$a r0 = new p.y0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f18798q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f18800s
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p172l8.AbstractC4713t.m18808b(r5)
            goto L3f
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L30:
            p172l8.AbstractC4713t.m18808b(r5)
            nc.a r5 = r4.f18797t
            r0.f18800s = r3
            r2 = 0
            java.lang.Object r5 = nc.InterfaceC5562a.a.m22610a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r5 = 0
            r4.f18795r = r5
            r4.f18796s = r5
            l8.i0 r5 = p172l8.C4700i0.f13910a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p219p.C5904y0.m23805l(p8.f):java.lang.Object");
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: m0 */
    public float mo1234m0(long j10) {
        return this.f18794q.mo1234m0(j10);
    }

    @Override // p121i3.InterfaceC3175e
    /* JADX INFO: renamed from: x1 */
    public int mo1236x1(float f10) {
        return this.f18794q.mo1236x1(f10);
    }
}
