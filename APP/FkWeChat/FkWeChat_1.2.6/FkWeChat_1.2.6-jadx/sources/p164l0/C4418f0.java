package p164l0;

import androidx.compose.runtime.AbstractC0471c3;
import androidx.compose.runtime.InterfaceC0491f2;
import ec.AbstractC2148k;
import ec.AbstractC2169p0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0188p;
import p163l.AbstractC4284d1;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l0.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4418f0 {

    /* JADX INFO: renamed from: a */
    public final boolean f12912a;

    /* JADX INFO: renamed from: b */
    public AtomicReference f12913b = new AtomicReference(null);

    /* JADX INFO: renamed from: c */
    public final InterfaceC0491f2 f12914c = AbstractC0471c3.m1561a(0.0f);

    /* JADX INFO: renamed from: l0.f0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f12915q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f12916r;

        /* JADX INFO: renamed from: l0.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10141a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f12918q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ InterfaceC2198w1 f12919r;

            /* JADX INFO: renamed from: s */
            public final /* synthetic */ C4418f0 f12920s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10141a(InterfaceC2198w1 interfaceC2198w1, C4418f0 c4418f0, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f12919r = interfaceC2198w1;
                this.f12920s = c4418f0;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                return new C10141a(this.f12919r, this.f12920s, interfaceC5976f);
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((C10141a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
            
                if (ec.AbstractC2205y0.m7938b(500, r10) != r0) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:36:0x0075, B:30:0x005e, B:33:0x0067, B:14:0x0026, B:15:0x002a, B:28:0x0058, B:29:0x005d, B:23:0x0042, B:25:0x004f), top: B:40:0x000f }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0072 -> B:36:0x0075). Please report as a decompilation issue!!! */
            @Override // p257r8.AbstractC6532a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    r10 = this;
                    java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                    int r1 = r10.f12918q
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 1065353216(0x3f800000, float:1.0)
                    r6 = 4
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    if (r1 == 0) goto L32
                    if (r1 == r9) goto L2e
                    if (r1 == r8) goto L2a
                    if (r1 == r7) goto L26
                    if (r1 != r6) goto L1f
                    p172l8.AbstractC4713t.m18808b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L75
                L1d:
                    r11 = move-exception
                    goto L7b
                L1f:
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    p376zd.C10010p0.m38820a(r11)
                    r11 = 0
                    return r11
                L26:
                    p172l8.AbstractC4713t.m18808b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L67
                L2a:
                    p172l8.AbstractC4713t.m18808b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L58
                L2e:
                    p172l8.AbstractC4713t.m18808b(r11)
                    goto L42
                L32:
                    p172l8.AbstractC4713t.m18808b(r11)
                    ec.w1 r11 = r10.f12919r
                    if (r11 == 0) goto L42
                    r10.f12918q = r9
                    java.lang.Object r11 = ec.AbstractC2210z1.m7954g(r11, r10)
                    if (r11 != r0) goto L42
                    goto L74
                L42:
                    l0.f0 r11 = r10.f12920s     // Catch: java.lang.Throwable -> L1d
                    p164l0.C4418f0.m17234b(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    l0.f0 r11 = r10.f12920s     // Catch: java.lang.Throwable -> L1d
                    boolean r11 = r11.m17235c()     // Catch: java.lang.Throwable -> L1d
                    if (r11 != 0) goto L5e
                    r10.f12918q = r8     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = ec.AbstractC2205y0.m7937a(r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L58
                    goto L74
                L58:
                    l8.i r11 = new l8.i     // Catch: java.lang.Throwable -> L1d
                    r11.<init>()     // Catch: java.lang.Throwable -> L1d
                    throw r11     // Catch: java.lang.Throwable -> L1d
                L5e:
                    r10.f12918q = r7     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = ec.AbstractC2205y0.m7938b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L67
                    goto L74
                L67:
                    l0.f0 r11 = r10.f12920s     // Catch: java.lang.Throwable -> L1d
                    p164l0.C4418f0.m17234b(r11, r2)     // Catch: java.lang.Throwable -> L1d
                    r10.f12918q = r6     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = ec.AbstractC2205y0.m7938b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L75
                L74:
                    return r0
                L75:
                    l0.f0 r11 = r10.f12920s     // Catch: java.lang.Throwable -> L1d
                    p164l0.C4418f0.m17234b(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    goto L5e
                L7b:
                    l0.f0 r0 = r10.f12920s
                    p164l0.C4418f0.m17234b(r0, r2)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: p164l0.C4418f0.a.C10141a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = C4418f0.this.new a(interfaceC5976f);
            aVar.f12916r = obj;
            return aVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f12915q != 0) {
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            return AbstractC6533b.m25845a(AbstractC4284d1.m16830a(C4418f0.this.f12913b, null, AbstractC2148k.m7817d((InterfaceC2165o0) this.f12916r, null, null, new C10141a((InterfaceC2198w1) C4418f0.this.f12913b.getAndSet(null), C4418f0.this, null), 3, null)));
        }
    }

    public C4418f0(boolean z10) {
        this.f12912a = z10;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17235c() {
        return this.f12912a;
    }

    /* JADX INFO: renamed from: d */
    public final float m17236d() {
        return this.f12914c.mo1663b();
    }

    /* JADX INFO: renamed from: e */
    public final void m17237e(float f10) {
        this.f12914c.mo1664h(f10);
    }

    /* JADX INFO: renamed from: f */
    public final Object m17238f(InterfaceC5976f interfaceC5976f) {
        Object objM7882e = AbstractC2169p0.m7882e(new a(null), interfaceC5976f);
        return objM7882e == AbstractC6325c.m24992g() ? objM7882e : C4700i0.f13910a;
    }
}
