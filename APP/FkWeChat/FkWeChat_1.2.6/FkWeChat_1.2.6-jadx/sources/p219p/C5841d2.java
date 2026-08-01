package p219p;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.C1047m;
import p049d9.AbstractC1927c;
import p163l.AbstractC4336n3;
import p163l.C4337o;
import p163l.InterfaceC4317k;
import p163l.InterfaceC4341o3;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: p.d2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5841d2 {

    /* JADX INFO: renamed from: f */
    public static final a f18315f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final int f18316g = 8;

    /* JADX INFO: renamed from: h */
    public static final C4337o f18317h = new C4337o(0.0f);

    /* JADX INFO: renamed from: a */
    public final InterfaceC4341o3 f18318a;

    /* JADX INFO: renamed from: b */
    public long f18319b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public C4337o f18320c = f18317h;

    /* JADX INFO: renamed from: d */
    public boolean f18321d;

    /* JADX INFO: renamed from: e */
    public float f18322e;

    /* JADX INFO: renamed from: p.d2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f18323q;

        /* JADX INFO: renamed from: r */
        public Object f18324r;

        /* JADX INFO: renamed from: s */
        public float f18325s;

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f18326t;

        /* JADX INFO: renamed from: v */
        public int f18328v;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f18326t = obj;
            this.f18328v |= Integer.MIN_VALUE;
            return C5841d2.this.m23533c(null, null, this);
        }
    }

    public C5841d2(InterfaceC4317k interfaceC4317k) {
        this.f18318a = interfaceC4317k.mo16829a(AbstractC4336n3.m17025t(C1047m.f3206a));
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m23531a(C5841d2 c5841d2, InterfaceC0184l interfaceC0184l, long j10) {
        float f10 = c5841d2.f18322e;
        c5841d2.f18322e = 0.0f;
        interfaceC0184l.mo27m(Float.valueOf(f10));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m23532b(C5841d2 c5841d2, float f10, InterfaceC0184l interfaceC0184l, long j10) {
        if (c5841d2.f18319b == Long.MIN_VALUE) {
            c5841d2.f18319b = j10;
        }
        C4337o c4337o = new C4337o(c5841d2.f18322e);
        long jMo17003b = f10 == 0.0f ? c5841d2.f18318a.mo17003b(new C4337o(c5841d2.f18322e), f18317h, c5841d2.f18320c) : AbstractC1927c.m6982f((j10 - c5841d2.f18319b) / f10);
        InterfaceC4341o3 interfaceC4341o3 = c5841d2.f18318a;
        C4337o c4337o2 = f18317h;
        float fM17037f = ((C4337o) interfaceC4341o3.mo16779d(jMo17003b, c4337o, c4337o2, c5841d2.f18320c)).m17037f();
        c5841d2.f18320c = (C4337o) c5841d2.f18318a.mo16780e(jMo17003b, c4337o, c4337o2, c5841d2.f18320c);
        c5841d2.f18319b = j10;
        float f11 = c5841d2.f18322e - fM17037f;
        c5841d2.f18322e = fM17037f;
        interfaceC0184l.mo27m(Float.valueOf(f11));
        return C4700i0.f13910a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if (androidx.compose.runtime.AbstractC0456a2.m1515c(r14, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0035, PHI: r12 r13 r14
  0x0076: PHI (r12v4 float) = (r12v2 float), (r12v5 float) binds: [B:29:0x0070, B:36:0x0099] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r13v6 a9.l) = (r13v2 a9.l), (r13v7 a9.l) binds: [B:29:0x0070, B:36:0x0099] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r14v16 a9.a) = (r14v8 a9.a), (r14v17 a9.a) binds: [B:29:0x0070, B:36:0x0099] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00ba, B:20:0x0049, B:35:0x0094, B:30:0x0076, B:32:0x0080, B:37:0x009b, B:40:0x00a7), top: B:48:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00ba, B:20:0x0049, B:35:0x0094, B:30:0x0076, B:32:0x0080, B:37:0x009b, B:40:0x00a7), top: B:48:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[Catch: all -> 0x0035, PHI: r13 r14
  0x009b: PHI (r13v3 a9.l) = (r13v6 a9.l), (r13v7 a9.l) binds: [B:31:0x007e, B:36:0x0099] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r14v11 a9.a) = (r14v16 a9.a), (r14v17 a9.a) binds: [B:31:0x007e, B:36:0x0099] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00ba, B:20:0x0049, B:35:0x0094, B:30:0x0076, B:32:0x0080, B:37:0x009b, B:40:0x00a7), top: B:48:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0091 -> B:35:0x0094). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m23533c(p010a9.InterfaceC0184l r12, p010a9.InterfaceC0173a r13, p228p8.InterfaceC5976f r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p219p.C5841d2.m23533c(a9.l, a9.a, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final void m23534d(float f10) {
        this.f18322e = f10;
    }

    /* JADX INFO: renamed from: p.d2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m23535a(float f10) {
            return Math.abs(f10) < 0.01f;
        }

        public a() {
        }
    }
}
