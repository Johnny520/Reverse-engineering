package p034c7;

import ec.AbstractC2179r2;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import ec.InterfaceC2208z;
import p010a9.InterfaceC0173a;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p257r8.AbstractC6535d;
import p270s6.C7193c;

/* JADX INFO: renamed from: c7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1353a extends C1357c implements InterfaceC2165o0 {

    /* JADX INFO: renamed from: G */
    public String f3997G;

    /* JADX INFO: renamed from: H */
    public final C7193c f3998H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC5980j f3999I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC0173a f4000J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC2208z f4001K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC5980j f4002L;

    /* JADX INFO: renamed from: c7.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f4003q;

        /* JADX INFO: renamed from: s */
        public int f4005s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f4003q = obj;
            this.f4005s |= Integer.MIN_VALUE;
            return C1353a.this.m5362T(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1353a(InterfaceC1359d interfaceC1359d, boolean z10, String str, C7193c c7193c, InterfaceC5980j interfaceC5980j, InterfaceC0173a interfaceC0173a) {
        super(z10, interfaceC1359d);
        interfaceC1359d.getClass();
        str.getClass();
        c7193c.getClass();
        interfaceC5980j.getClass();
        interfaceC0173a.getClass();
        this.f3997G = str;
        this.f3998H = c7193c;
        this.f3999I = interfaceC5980j;
        this.f4000J = interfaceC0173a;
        InterfaceC2208z interfaceC2208zM7895a = AbstractC2179r2.m7895a((InterfaceC2198w1) interfaceC5980j.mo1654h(InterfaceC2198w1.f6022g));
        this.f4001K = interfaceC2208zM7895a;
        this.f4002L = interfaceC5980j.mo1651c0(interfaceC2208zM7895a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5362T(p228p8.InterfaceC5976f r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p034c7.C1353a.a
            if (r0 == 0) goto L13
            r0 = r5
            c7.a$a r0 = (p034c7.C1353a.a) r0
            int r1 = r0.f4005s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4005s = r1
            goto L18
        L13:
            c7.a$a r0 = new c7.a$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4003q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f4005s
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p172l8.AbstractC4713t.m18808b(r5)
            goto L3e
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L30:
            p172l8.AbstractC4713t.m18808b(r5)
            ec.z r5 = r4.f4001K
            r0.f4005s = r3
            java.lang.Object r5 = ec.AbstractC2210z1.m7954g(r5, r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            p034c7.AbstractC1377m.m5442k(r4)
            l8.i0 r5 = p172l8.C4700i0.f13910a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C1353a.m5362T(p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: U */
    public final C7193c m5363U() {
        return this.f3998H;
    }

    /* JADX INFO: renamed from: W */
    public final InterfaceC5980j m5364W() {
        return this.f3999I;
    }

    /* JADX INFO: renamed from: X */
    public final String m5365X() {
        return this.f3997G;
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f4002L;
    }
}
