package p158f0;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p143c3.C1906h;

/* JADX INFO: renamed from: f0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2079k extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public long[] f6956f;

    /* JADX INFO: renamed from: g */
    public int f6957g;

    /* JADX INFO: renamed from: h */
    public int f6958h;

    /* JADX INFO: renamed from: i */
    public int f6959i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f6960j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2080l f6961k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2079k(C2080l c2080l, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f6961k = c2080l;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2079k) mo7n((InterfaceC1046d) obj2, (C1906h) obj)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2079k c2079k = new C2079k(this.f6961k, interfaceC1046d);
        c2079k.f6960j = obj;
        return c2079k;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:26:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bd -> B:37:0x00bf). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            f0.l r1 = r0.f6961k
            long r2 = r1.f6963d
            long r4 = r1.f6965f
            long r6 = r1.f6964e
            int r8 = r0.f6959i
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            P2.a r11 = p079P2.EnumC1152a.f3788d
            if (r8 == 0) goto L4d
            if (r8 == r10) goto L3e
            if (r8 == r13) goto L34
            if (r8 != r12) goto L2c
            int r1 = r0.f6957g
            java.lang.Object r6 = r0.f6960j
            c3.h r6 = (p143c3.C1906h) r6
            p127Z2.AbstractC1784a.m3205S(r23)
            r7 = r12
            goto Lbf
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            int r1 = r0.f6957g
            java.lang.Object r8 = r0.f6960j
            c3.h r8 = (p143c3.C1906h) r8
            p127Z2.AbstractC1784a.m3205S(r23)
            goto L95
        L3e:
            int r1 = r0.f6958h
            int r8 = r0.f6957g
            long[] r15 = r0.f6956f
            java.lang.Object r12 = r0.f6960j
            c3.h r12 = (p143c3.C1906h) r12
            p127Z2.AbstractC1784a.m3205S(r23)
            int r8 = r8 + r10
            goto L5b
        L4d:
            p127Z2.AbstractC1784a.m3205S(r23)
            java.lang.Object r8 = r0.f6960j
            r12 = r8
            c3.h r12 = (p143c3.C1906h) r12
            long[] r15 = r1.f6966g
            if (r15 == 0) goto L72
            int r1 = r15.length
            r8 = 0
        L5b:
            if (r8 >= r1) goto L72
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f6960j = r12
            r0.f6956f = r15
            r0.f6957g = r8
            r0.f6958h = r1
            r0.f6959i = r10
            r12.m3391b(r0, r4)
            return r11
        L72:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L98
            r8 = r12
            r1 = 0
        L78:
            if (r1 >= r14) goto L97
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r12 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r12 == 0) goto L95
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.f6960j = r8
            r0.f6956f = r9
            r0.f6957g = r1
            r0.f6959i = r13
            r8.m3391b(r0, r2)
            return r11
        L95:
            int r1 = r1 + r10
            goto L78
        L97:
            r12 = r8
        L98:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc2
            r6 = r12
            r15 = 0
        L9e:
            if (r15 >= r14) goto Lc2
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbd
            long r1 = (long) r15
            long r4 = r4 + r1
            long r1 = (long) r14
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.f6960j = r6
            r0.f6956f = r9
            r0.f6957g = r15
            r7 = 3
            r0.f6959i = r7
            r6.m3391b(r0, r1)
            return r11
        Lbd:
            r7 = 3
            r1 = r15
        Lbf:
            int r15 = r1 + 1
            goto L9e
        Lc2:
            K2.q r1 = p056K2.C0891q.f2780a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p158f0.C2079k.mo8p(java.lang.Object):java.lang.Object");
    }
}
