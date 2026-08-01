package p113hc;

import java.util.List;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p215oc.C5702a;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: hc.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2977e0 implements InterfaceC2971b0 {

    /* JADX INFO: renamed from: b */
    public final long f7843b;

    /* JADX INFO: renamed from: c */
    public final long f7844c;

    /* JADX INFO: renamed from: hc.e0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f7845q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f7846r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ int f7847s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
            return m10994r((InterfaceC2974d) obj, ((Number) obj2).intValue(), (InterfaceC5976f) obj3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        
            if (r1.mo400a(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
        
            if (r1.mo400a(r10, r9) != r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[PHI: r1
  0x008d: PHI (r1v5 hc.d) = (r1v3 hc.d), (r1v4 hc.d), (r1v11 hc.d) binds: [B:25:0x006d, B:30:0x008a, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r9.f7845q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3b
                if (r1 == r6) goto L37
                if (r1 == r5) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L18
                goto L37
            L18:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r10)
                r10 = 0
                return r10
            L1f:
                java.lang.Object r1 = r9.f7846r
                hc.d r1 = (p113hc.InterfaceC2974d) r1
                p172l8.AbstractC4713t.m18808b(r10)
                goto L8d
            L27:
                java.lang.Object r1 = r9.f7846r
                hc.d r1 = (p113hc.InterfaceC2974d) r1
                p172l8.AbstractC4713t.m18808b(r10)
                goto L7c
            L2f:
                java.lang.Object r1 = r9.f7846r
                hc.d r1 = (p113hc.InterfaceC2974d) r1
                p172l8.AbstractC4713t.m18808b(r10)
                goto L63
            L37:
                p172l8.AbstractC4713t.m18808b(r10)
                goto L9b
            L3b:
                p172l8.AbstractC4713t.m18808b(r10)
                java.lang.Object r10 = r9.f7846r
                r1 = r10
                hc.d r1 = (p113hc.InterfaceC2974d) r1
                int r10 = r9.f7847s
                if (r10 <= 0) goto L52
                hc.z r10 = p113hc.EnumC3002z.f7968q
                r9.f7845q = r6
                java.lang.Object r10 = r1.mo400a(r10, r9)
                if (r10 != r0) goto L9b
                goto L9a
            L52:
                hc.e0 r10 = p113hc.C2977e0.this
                long r6 = p113hc.C2977e0.m10993c(r10)
                r9.f7846r = r1
                r9.f7845q = r5
                java.lang.Object r10 = ec.AbstractC2205y0.m7938b(r6, r9)
                if (r10 != r0) goto L63
                goto L9a
            L63:
                hc.e0 r10 = p113hc.C2977e0.this
                long r5 = p113hc.C2977e0.m10992b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8d
                hc.z r10 = p113hc.EnumC3002z.f7969r
                r9.f7846r = r1
                r9.f7845q = r4
                java.lang.Object r10 = r1.mo400a(r10, r9)
                if (r10 != r0) goto L7c
                goto L9a
            L7c:
                hc.e0 r10 = p113hc.C2977e0.this
                long r4 = p113hc.C2977e0.m10992b(r10)
                r9.f7846r = r1
                r9.f7845q = r3
                java.lang.Object r10 = ec.AbstractC2205y0.m7938b(r4, r9)
                if (r10 != r0) goto L8d
                goto L9a
            L8d:
                hc.z r10 = p113hc.EnumC3002z.f7970s
                r3 = 0
                r9.f7846r = r3
                r9.f7845q = r2
                java.lang.Object r10 = r1.mo400a(r10, r9)
                if (r10 != r0) goto L9b
            L9a:
                return r0
            L9b:
                l8.i0 r10 = p172l8.C4700i0.f13910a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p113hc.C2977e0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: r */
        public final Object m10994r(InterfaceC2974d interfaceC2974d, int i10, InterfaceC5976f interfaceC5976f) {
            a aVar = C2977e0.this.new a(interfaceC5976f);
            aVar.f7846r = interfaceC2974d;
            aVar.f7847s = i10;
            return aVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: hc.e0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f7849q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f7850r;

        public b(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = new b(interfaceC5976f);
            bVar.f7850r = obj;
            return bVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f7849q == 0) {
                AbstractC4713t.m18808b(obj);
                return AbstractC6533b.m25845a(((EnumC3002z) this.f7850r) != EnumC3002z.f7968q);
            }
            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(EnumC3002z enumC3002z, InterfaceC5976f interfaceC5976f) {
            return ((b) create(enumC3002z, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C2977e0(long j10, long j11) {
        this.f7843b = j10;
        this.f7844c = j11;
        if (j10 < 0) {
            C5702a.m23079a("stopTimeout(", j10, " ms) cannot be negative");
            throw null;
        }
        if (j11 >= 0) {
            return;
        }
        C5702a.m23079a("replayExpiration(", j11, " ms) cannot be negative");
        throw null;
    }

    @Override // p113hc.InterfaceC2971b0
    /* JADX INFO: renamed from: a */
    public InterfaceC2972c mo10966a(InterfaceC2979f0 interfaceC2979f0) {
        return AbstractC2976e.m10980h(AbstractC2976e.m10981i(AbstractC2976e.m10991s(interfaceC2979f0, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2977e0)) {
            return false;
        }
        C2977e0 c2977e0 = (C2977e0) obj;
        return this.f7843b == c2977e0.f7843b && this.f7844c == c2977e0.f7844c;
    }

    public int hashCode() {
        return (Long.hashCode(this.f7843b) * 31) + Long.hashCode(this.f7844c);
    }

    public String toString() {
        List listM20788d = AbstractC5112w.m20788d(2);
        if (this.f7843b > 0) {
            listM20788d.add("stopTimeout=" + this.f7843b + "ms");
        }
        if (this.f7844c < Long.MAX_VALUE) {
            listM20788d.add("replayExpiration=" + this.f7844c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + AbstractC5081g0.m20585s0(AbstractC5112w.m20785a(listM20788d), null, null, null, 0, null, null, 63, null) + ')';
    }
}
