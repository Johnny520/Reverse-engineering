package p219p;

import p058e2.InterfaceC1999a;
import p228p8.InterfaceC5976f;
import p250r1.C6455e;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: p.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5863k1 implements InterfaceC1999a {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5832b1 f18433q;

    /* JADX INFO: renamed from: r */
    public boolean f18434r;

    /* JADX INFO: renamed from: p.k1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public long f18435q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f18436r;

        /* JADX INFO: renamed from: t */
        public int f18438t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f18436r = obj;
            this.f18438t |= Integer.MIN_VALUE;
            return C5863k1.this.mo7211V1(0L, 0L, this);
        }
    }

    public C5863k1(InterfaceC5832b1 interfaceC5832b1, boolean z10) {
        this.f18433q = interfaceC5832b1;
        this.f18434r = z10;
    }

    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: L1 */
    public long mo7210L1(long j10, long j11, int i10) {
        return this.f18434r ? this.f18433q.mo23521c(j11) : C6455e.f20314b.m25569c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p058e2.InterfaceC1999a
    /* JADX INFO: renamed from: V1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo7211V1(long r3, long r5, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r2 = this;
            boolean r3 = r7 instanceof p219p.C5863k1.a
            if (r3 == 0) goto L13
            r3 = r7
            p.k1$a r3 = (p219p.C5863k1.a) r3
            int r4 = r3.f18438t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f18438t = r4
            goto L18
        L13:
            p.k1$a r3 = new p.k1$a
            r3.<init>(r7)
        L18:
            java.lang.Object r4 = r3.f18436r
            java.lang.Object r7 = p242q8.AbstractC6325c.m24992g()
            int r0 = r3.f18438t
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            long r5 = r3.f18435q
            p172l8.AbstractC4713t.m18808b(r4)
            goto L55
        L2b:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r3)
            r3 = 0
            return r3
        L32:
            p172l8.AbstractC4713t.m18808b(r4)
            boolean r4 = r2.f18434r
            if (r4 == 0) goto L60
            p.b1 r4 = r2.f18433q
            boolean r4 = r4.mo23519a()
            if (r4 == 0) goto L48
            i3.z$a r3 = p121i3.C3196z.f8498b
            long r3 = r3.m12145a()
            goto L5b
        L48:
            p.b1 r4 = r2.f18433q
            r3.f18435q = r5
            r3.f18438t = r1
            java.lang.Object r4 = r4.mo23520b(r5, r3)
            if (r4 != r7) goto L55
            return r7
        L55:
            i3.z r4 = (p121i3.C3196z) r4
            long r3 = r4.m12144o()
        L5b:
            long r3 = p121i3.C3196z.m12140k(r5, r3)
            goto L66
        L60:
            i3.z$a r3 = p121i3.C3196z.f8498b
            long r3 = r3.m12145a()
        L66:
            i3.z r3 = p121i3.C3196z.m12131b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p219p.C5863k1.mo7211V1(long, long, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: a */
    public final void m23622a(boolean z10) {
        this.f18434r = z10;
    }
}
