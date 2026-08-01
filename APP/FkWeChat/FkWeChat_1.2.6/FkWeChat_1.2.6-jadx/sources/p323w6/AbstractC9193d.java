package p323w6;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p024b9.InterfaceC1049n;
import p113hc.AbstractC2976e;
import p113hc.InterfaceC2972c;
import p113hc.InterfaceC2974d;
import p172l8.C4700i0;
import p172l8.InterfaceC4695g;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;

/* JADX INFO: renamed from: w6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9193d {

    /* JADX INFO: renamed from: w6.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f31417q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f31418r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC9192c f31419s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC9192c interfaceC9192c, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f31419s = interfaceC9192c;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f31419s, interfaceC5976f);
            aVar.f31418r = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        
            if (r1.mo400a(r6, r5) == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004c -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // p257r8.AbstractC6532a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = p242q8.AbstractC6325c.m24992g()
                int r1 = r5.f31417q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L17
                java.lang.Object r1 = r5.f31418r
                hc.d r1 = (p113hc.InterfaceC2974d) r1
                p172l8.AbstractC4713t.m18808b(r6)
            L15:
                r6 = r1
                goto L2d
            L17:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                p376zd.C10010p0.m38820a(r6)
                r6 = 0
                return r6
            L1e:
                java.lang.Object r1 = r5.f31418r
                hc.d r1 = (p113hc.InterfaceC2974d) r1
                p172l8.AbstractC4713t.m18808b(r6)
                goto L3d
            L26:
                p172l8.AbstractC4713t.m18808b(r6)
                java.lang.Object r6 = r5.f31418r
                hc.d r6 = (p113hc.InterfaceC2974d) r6
            L2d:
                w6.c r1 = r5.f31419s
                r5.f31418r = r6
                r5.f31417q = r3
                java.lang.Object r1 = r1.mo32866a(r5)
                if (r1 != r0) goto L3a
                goto L4e
            L3a:
                r4 = r1
                r1 = r6
                r6 = r4
            L3d:
                w6.i r6 = (p323w6.AbstractC9198i) r6
                if (r6 != 0) goto L44
                l8.i0 r6 = p172l8.C4700i0.f13910a
                return r6
            L44:
                r5.f31418r = r1
                r5.f31417q = r2
                java.lang.Object r6 = r1.mo400a(r6, r5)
                if (r6 != r0) goto L15
            L4e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p323w6.AbstractC9193d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2974d, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: w6.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC2974d, InterfaceC1049n {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0188p f31420q;

        public b(InterfaceC0188p interfaceC0188p) {
            interfaceC0188p.getClass();
            this.f31420q = interfaceC0188p;
        }

        @Override // p113hc.InterfaceC2974d
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object mo400a(Object obj, InterfaceC5976f interfaceC5976f) {
            return this.f31420q.invoke(obj, interfaceC5976f);
        }

        @Override // p024b9.InterfaceC1049n
        /* JADX INFO: renamed from: b */
        public final InterfaceC4695g mo3805b() {
            return this.f31420q;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2974d) && (obj instanceof InterfaceC1049n)) {
                return AbstractC1061t.m3842c(mo3805b(), ((InterfaceC1049n) obj).mo3805b());
            }
            return false;
        }

        public final int hashCode() {
            return mo3805b().hashCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2972c m35817a(InterfaceC9192c interfaceC9192c) {
        interfaceC9192c.getClass();
        return AbstractC2976e.m10986n(new a(interfaceC9192c, null));
    }

    /* JADX INFO: renamed from: b */
    public static final Object m35818b(InterfaceC9192c interfaceC9192c, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        Object objMo399b = m35817a(interfaceC9192c).mo399b(new b(interfaceC0188p), interfaceC5976f);
        return objMo399b == AbstractC6325c.m24992g() ? objMo399b : C4700i0.f13910a;
    }
}
