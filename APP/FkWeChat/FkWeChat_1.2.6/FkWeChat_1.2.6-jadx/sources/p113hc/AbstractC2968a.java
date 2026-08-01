package p113hc;

import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: hc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2968a implements InterfaceC2972c {

    /* JADX INFO: renamed from: hc.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f7814q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f7815r;

        /* JADX INFO: renamed from: t */
        public int f7817t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f7815r = obj;
            this.f7817t |= Integer.MIN_VALUE;
            return AbstractC2968a.this.mo399b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p113hc.InterfaceC2972c
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo399b(p113hc.InterfaceC2974d r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p113hc.AbstractC2968a.a
            if (r0 == 0) goto L13
            r0 = r7
            hc.a$a r0 = (p113hc.AbstractC2968a.a) r0
            int r1 = r0.f7817t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7817t = r1
            goto L18
        L13:
            hc.a$a r0 = new hc.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7815r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f7817t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f7814q
            ic.r r6 = (p130ic.C3400r) r6
            p172l8.AbstractC4713t.m18808b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4e
        L2d:
            r7 = move-exception
            goto L58
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L36:
            p172l8.AbstractC4713t.m18808b(r7)
            ic.r r7 = new ic.r
            p8.j r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f7814q = r7     // Catch: java.lang.Throwable -> L54
            r0.f7817t = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r6 = r5.mo10965g(r7, r0)     // Catch: java.lang.Throwable -> L54
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r6 = r7
        L4e:
            r6.releaseIntercepted()
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        L54:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L58:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p113hc.AbstractC2968a.mo399b(hc.d, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo10965g(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f);
}
