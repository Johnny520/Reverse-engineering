package p113hc;

import p010a9.InterfaceC0188p;
import p024b9.C1042j0;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p215oc.C5706c;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: hc.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2975d0 implements InterfaceC2971b0 {

    /* JADX INFO: renamed from: hc.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f7835q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f7836r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC2979f0 f7837s;

        /* JADX INFO: renamed from: hc.d0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10099a implements InterfaceC2974d {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ C1042j0 f7838q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ InterfaceC2974d f7839r;

            /* JADX INFO: renamed from: hc.d0$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class C10100a extends AbstractC6535d {

                /* JADX INFO: renamed from: q */
                public /* synthetic */ Object f7840q;

                /* JADX INFO: renamed from: s */
                public int f7842s;

                public C10100a(InterfaceC5976f interfaceC5976f) {
                    super(interfaceC5976f);
                }

                @Override // p257r8.AbstractC6532a
                public final Object invokeSuspend(Object obj) {
                    this.f7840q = obj;
                    this.f7842s |= Integer.MIN_VALUE;
                    return C10099a.this.m10972b(0, this);
                }
            }

            public C10099a(C1042j0 c1042j0, InterfaceC2974d interfaceC2974d) {
                this.f7838q = c1042j0;
                this.f7839r = interfaceC2974d;
            }

            @Override // p113hc.InterfaceC2974d
            /* JADX INFO: renamed from: a */
            public /* bridge */ /* synthetic */ Object mo400a(Object obj, InterfaceC5976f interfaceC5976f) {
                return m10972b(((Number) obj).intValue(), interfaceC5976f);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX INFO: renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object m10972b(int r5, p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p113hc.C2975d0.a.C10099a.C10100a
                    if (r0 == 0) goto L13
                    r0 = r6
                    hc.d0$a$a$a r0 = (p113hc.C2975d0.a.C10099a.C10100a) r0
                    int r1 = r0.f7842s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f7842s = r1
                    goto L18
                L13:
                    hc.d0$a$a$a r0 = new hc.d0$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f7840q
                    java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
                    int r2 = r0.f7842s
                    r3 = 1
                    if (r2 == 0) goto L30
                    if (r2 != r3) goto L29
                    p172l8.AbstractC4713t.m18808b(r6)
                    goto L4a
                L29:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    p376zd.C10010p0.m38820a(r5)
                    r5 = 0
                    return r5
                L30:
                    p172l8.AbstractC4713t.m18808b(r6)
                    if (r5 <= 0) goto L4d
                    b9.j0 r5 = r4.f7838q
                    boolean r6 = r5.f3202q
                    if (r6 != 0) goto L4d
                    r5.f3202q = r3
                    hc.d r5 = r4.f7839r
                    hc.z r6 = p113hc.EnumC3002z.f7968q
                    r0.f7842s = r3
                    java.lang.Object r5 = r5.mo400a(r6, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    l8.i0 r5 = p172l8.C4700i0.f13910a
                    return r5
                L4d:
                    l8.i0 r5 = p172l8.C4700i0.f13910a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p113hc.C2975d0.a.C10099a.m10972b(int, p8.f):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2979f0 interfaceC2979f0, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f7837s = interfaceC2979f0;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f7837s, interfaceC5976f);
            aVar.f7836r = obj;
            return aVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f7835q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2974d interfaceC2974d = (InterfaceC2974d) this.f7836r;
                C1042j0 c1042j0 = new C1042j0();
                InterfaceC2979f0 interfaceC2979f0 = this.f7837s;
                C10099a c10099a = new C10099a(c1042j0, interfaceC2974d);
                this.f7835q = 1;
                if (interfaceC2979f0.mo399b(c10099a, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            C5706c.m23089a();
            return null;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2974d, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    @Override // p113hc.InterfaceC2971b0
    /* JADX INFO: renamed from: a */
    public InterfaceC2972c mo10966a(InterfaceC2979f0 interfaceC2979f0) {
        return AbstractC2976e.m10986n(new a(interfaceC2979f0, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
