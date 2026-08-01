package p113hc;

import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p130ic.C3391i;
import p145jc.AbstractC3803e0;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6544m;

/* JADX INFO: renamed from: hc.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2991o {

    /* JADX INFO: renamed from: a */
    public static final int f7902a = AbstractC3803e0.m15153b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: hc.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f7903q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f7904r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f7905s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC0188p f7906t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
            this.f7906t = interfaceC0188p;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r1.mo400a(r6, r5) == r0) goto L15;
         */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r5.f7903q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                p172l8.AbstractC4713t.m18808b(r6)
                goto L44
            L12:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r6)
                r6 = 0
                return r6
            L19:
                java.lang.Object r1 = r5.f7904r
                hc.d r1 = (p113hc.InterfaceC2974d) r1
                p172l8.AbstractC4713t.m18808b(r6)
                goto L38
            L21:
                p172l8.AbstractC4713t.m18808b(r6)
                java.lang.Object r6 = r5.f7904r
                r1 = r6
                hc.d r1 = (p113hc.InterfaceC2974d) r1
                java.lang.Object r6 = r5.f7905s
                a9.p r4 = r5.f7906t
                r5.f7904r = r1
                r5.f7903q = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L38
                goto L43
            L38:
                r3 = 0
                r5.f7904r = r3
                r5.f7903q = r2
                java.lang.Object r6 = r1.mo400a(r6, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                l8.i0 r6 = p172l8.C4700i0.f13910a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2991o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(InterfaceC2974d interfaceC2974d, Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f7906t, interfaceC5976f);
            aVar.f7904r = interfaceC2974d;
            aVar.f7905s = obj;
            return aVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2972c m11038a(InterfaceC2972c interfaceC2972c, InterfaceC0188p interfaceC0188p) {
        return AbstractC2976e.m10991s(interfaceC2972c, new a(interfaceC0188p, null));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2972c m11039b(InterfaceC2972c interfaceC2972c, InterfaceC0189q interfaceC0189q) {
        return new C3391i(interfaceC0189q, interfaceC2972c, null, 0, null, 28, null);
    }
}
