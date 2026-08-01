package p170h1;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: h1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2215f extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public int f7218h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f7219i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC2218i f7220j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f7221k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2215f(boolean z5, AbstractC2218i abstractC2218i, long j5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f7219i = z5;
        this.f7220j = abstractC2218i;
        this.f7221k = j5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2215f) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        return new C2215f(this.f7219i, this.f7220j, this.f7221k, interfaceC1046d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r11 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r11 == r3) goto L18;
     */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f7218h
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L16
            if (r0 != r1) goto Le
            p127Z2.AbstractC1784a.m3205S(r11)
            goto L4c
        Le:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L16:
            p127Z2.AbstractC1784a.m3205S(r11)
            r9 = r10
            goto L36
        L1b:
            p127Z2.AbstractC1784a.m3205S(r11)
            boolean r11 = r10.f7219i
            h1.i r0 = r10.f7220j
            P2.a r3 = p079P2.EnumC1152a.f3788d
            if (r11 != 0) goto L3c
            A0.e r4 = r0.f7231d
            r10.f7218h = r2
            r5 = 0
            long r7 = r10.f7221k
            r9 = r10
            java.lang.Object r11 = r4.m137a(r5, r7, r9)
            if (r11 != r3) goto L36
            goto L4b
        L36:
            e1.q r11 = (p153e1.C2021q) r11
            r11.getClass()
            goto L51
        L3c:
            r9 = r10
            A0.e r4 = r0.f7231d
            r9.f7218h = r1
            long r5 = r9.f7221k
            r7 = 0
            java.lang.Object r11 = r4.m137a(r5, r7, r9)
            if (r11 != r3) goto L4c
        L4b:
            return r3
        L4c:
            e1.q r11 = (p153e1.C2021q) r11
            r11.getClass()
        L51:
            K2.q r11 = p056K2.C0891q.f2780a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p170h1.C2215f.mo8p(java.lang.Object):java.lang.Object");
    }
}
