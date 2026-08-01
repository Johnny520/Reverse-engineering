package p113hc;

import p010a9.InterfaceC0188p;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: hc.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2978f {

    /* JADX INFO: renamed from: hc.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2972c {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ Iterable f7851q;

        /* JADX INFO: renamed from: hc.f$a$a, reason: collision with other inner class name */
        public static final class C10101a extends AbstractC6535d {

            /* JADX INFO: renamed from: q */
            public /* synthetic */ Object f7852q;

            /* JADX INFO: renamed from: r */
            public int f7853r;

            /* JADX INFO: renamed from: t */
            public Object f7855t;

            /* JADX INFO: renamed from: u */
            public Object f7856u;

            public C10101a(InterfaceC5976f interfaceC5976f) {
                super(interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) {
                this.f7852q = obj;
                this.f7853r |= Integer.MIN_VALUE;
                return a.this.mo399b(null, this);
            }
        }

        public a(Iterable iterable) {
            this.f7851q = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p113hc.InterfaceC2972c
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo399b(p113hc.InterfaceC2974d r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p113hc.AbstractC2978f.a.C10101a
                if (r0 == 0) goto L13
                r0 = r7
                hc.f$a$a r0 = (p113hc.AbstractC2978f.a.C10101a) r0
                int r1 = r0.f7853r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7853r = r1
                goto L18
            L13:
                hc.f$a$a r0 = new hc.f$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f7852q
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r0.f7853r
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f7856u
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f7855t
                hc.d r2 = (p113hc.InterfaceC2974d) r2
                p172l8.AbstractC4713t.m18808b(r7)
                r7 = r2
                goto L45
            L32:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r6)
                r6 = 0
                return r6
            L39:
                p172l8.AbstractC4713t.m18808b(r7)
                java.lang.Iterable r7 = r5.f7851q
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L45:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5c
                java.lang.Object r2 = r6.next()
                r0.f7855t = r7
                r0.f7856u = r6
                r0.f7853r = r3
                java.lang.Object r2 = r7.mo400a(r2, r0)
                if (r2 != r1) goto L45
                return r1
            L5c:
                l8.i0 r6 = p172l8.C4700i0.f13910a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2978f.a.mo399b(hc.d, p8.f):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: hc.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC2972c {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ Object f7857q;

        public b(Object obj) {
            this.f7857q = obj;
        }

        @Override // p113hc.InterfaceC2972c
        /* JADX INFO: renamed from: b */
        public Object mo399b(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
            Object objMo400a = interfaceC2974d.mo400a(this.f7857q, interfaceC5976f);
            return objMo400a == AbstractC6325c.m24992g() ? objMo400a : C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2972c m10996a(Iterable iterable) {
        return new a(iterable);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2972c m10997b(InterfaceC0188p interfaceC0188p) {
        return new C2997u(interfaceC0188p);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2972c m10998c(Object obj) {
        return new b(obj);
    }
}
