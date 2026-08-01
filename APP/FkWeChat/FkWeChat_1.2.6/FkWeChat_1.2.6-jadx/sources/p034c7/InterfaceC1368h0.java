package p034c7;

import p035c8.C1399a;
import p172l8.C4700i0;
import p210o7.InterfaceC5655g;
import p227p7.AbstractC5970h;
import p227p7.C5966d;
import p227p7.InterfaceC5967e;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p323w6.C9194e;

/* JADX INFO: renamed from: c7.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1368h0 extends InterfaceC1355b {

    /* JADX INFO: renamed from: c7.h0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: c7.h0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10075a extends AbstractC6535d {

            /* JADX INFO: renamed from: q */
            public Object f4059q;

            /* JADX INFO: renamed from: r */
            public /* synthetic */ Object f4060r;

            /* JADX INFO: renamed from: s */
            public int f4061s;

            public C10075a(InterfaceC5976f interfaceC5976f) {
                super(interfaceC5976f);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) {
                this.f4060r = obj;
                this.f4061s |= Integer.MIN_VALUE;
                return a.m5401a(null, null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object m5401a(p034c7.InterfaceC1368h0 r6, p035c8.C1399a r7, p228p8.InterfaceC5976f r8) throws java.lang.Throwable {
            /*
                boolean r0 = r8 instanceof p034c7.InterfaceC1368h0.a.C10075a
                if (r0 == 0) goto L13
                r0 = r8
                c7.h0$a$a r0 = (p034c7.InterfaceC1368h0.a.C10075a) r0
                int r1 = r0.f4061s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f4061s = r1
                goto L18
            L13:
                c7.h0$a$a r0 = new c7.h0$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f4060r
                java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                int r2 = r0.f4061s
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2e
                java.lang.Object r6 = r0.f4059q
                r7 = r6
                c8.a r7 = (p035c8.C1399a) r7
                p172l8.AbstractC4713t.m18808b(r8)
                goto L75
            L2e:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r6)
                r6 = 0
                return r6
            L35:
                p172l8.AbstractC4713t.m18808b(r8)
                t7.b r8 = r6.getAttributes()
                t7.a r2 = p210o7.AbstractC5650b.m22850a()
                java.lang.Object r8 = r8.mo31832c(r2)
                o7.f r8 = (p210o7.C5654f) r8
                if (r8 != 0) goto L55
                t7.b r2 = r6.getAttributes()
                t7.a r4 = p210o7.AbstractC5650b.m22850a()
                o7.f r5 = p210o7.C5654f.f17784a
                r2.mo31833d(r4, r5)
            L55:
                p034c7.AbstractC1370i0.m5405c(r6, r7)
                if (r8 != 0) goto L62
                o7.g r8 = r6.mo5372m()
                io.ktor.utils.io.g r8 = r8.mo12245j()
            L62:
                o7.g r2 = r6.mo5372m()
                o7.c r2 = r2.mo12242a()
                r0.f4059q = r7
                r0.f4061s = r3
                java.lang.Object r8 = r2.m3738j(r6, r8, r0)
                if (r8 != r1) goto L75
                return r1
            L75:
                w6.e r6 = p323w6.C9194e.f31421a
                boolean r6 = p024b9.AbstractC1061t.m3842c(r8, r6)
                if (r6 == 0) goto L7f
                r6 = 0
                return r6
            L7f:
                o7.f r6 = p210o7.C5654f.f17784a
                if (r8 == r6) goto L9b
                g9.c r6 = r7.m5482b()
                boolean r6 = r6.mo3796y(r8)
                if (r6 == 0) goto L8e
                return r8
            L8e:
                m7.b r6 = new m7.b
                g9.n r7 = r7.m5481a()
                r7.getClass()
                r6.<init>(r7)
                throw r6
            L9b:
                o7.i r6 = new o7.i
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p034c7.InterfaceC1368h0.a.m5401a(c7.h0, c8.a, p8.f):java.lang.Object");
        }

        /* JADX INFO: renamed from: b */
        public static Object m5402b(InterfaceC1368h0 interfaceC1368h0, Object obj, C1399a c1399a, InterfaceC5976f interfaceC5976f) {
            AbstractC5970h.m23968b(interfaceC1368h0.mo5371k(), c1399a);
            C5966d c5966dMo12259a = interfaceC1368h0.mo5371k().mo12259a();
            if (obj == null) {
                obj = C9194e.f31421a;
            }
            Object objM3738j = c5966dMo12259a.m3738j(interfaceC1368h0, obj, interfaceC5976f);
            return objM3738j == AbstractC6325c.m24992g() ? objM3738j : C4700i0.f13910a;
        }
    }

    @Override // p034c7.InterfaceC1355b
    /* JADX INFO: renamed from: k */
    InterfaceC5967e mo5371k();

    @Override // p034c7.InterfaceC1355b
    /* JADX INFO: renamed from: m */
    InterfaceC5655g mo5372m();
}
