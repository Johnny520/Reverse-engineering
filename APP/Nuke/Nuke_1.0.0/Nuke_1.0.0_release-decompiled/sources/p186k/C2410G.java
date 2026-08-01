package p186k;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p124Z.C1779c;
import p143c3.C1906h;

/* JADX INFO: renamed from: k.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2410G extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public C1779c f7798f;

    /* JADX INFO: renamed from: g */
    public C2411H f7799g;

    /* JADX INFO: renamed from: h */
    public long[] f7800h;

    /* JADX INFO: renamed from: i */
    public int f7801i;

    /* JADX INFO: renamed from: j */
    public int f7802j;

    /* JADX INFO: renamed from: k */
    public int f7803k;

    /* JADX INFO: renamed from: l */
    public int f7804l;

    /* JADX INFO: renamed from: m */
    public long f7805m;

    /* JADX INFO: renamed from: n */
    public int f7806n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f7807o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C2411H f7808p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1779c f7809q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2410G(C2411H c2411h, C1779c c1779c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f7808p = c2411h;
        this.f7809q = c1779c;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2410G) mo7n((InterfaceC1046d) obj2, (C1906h) obj)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2410G c2410g = new C2410G(this.f7808p, this.f7809q, interfaceC1046d);
        c2410g.f7807o = obj;
        return c2410g;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0095). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f7806n
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L25
            int r1 = r0.f7804l
            int r5 = r0.f7803k
            long r6 = r0.f7805m
            int r8 = r0.f7802j
            int r9 = r0.f7801i
            long[] r10 = r0.f7800h
            k.H r11 = r0.f7799g
            Z.c r12 = r0.f7798f
            java.lang.Object r13 = r0.f7807o
            c3.h r13 = (p143c3.C1906h) r13
            p127Z2.AbstractC1784a.m3205S(r21)
            goto L95
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            p127Z2.AbstractC1784a.m3205S(r21)
            java.lang.Object r1 = r0.f7807o
            c3.h r1 = (p143c3.C1906h) r1
            k.H r5 = r0.f7808p
            k.F r6 = r5.f7811e
            long[] r6 = r6.f7793a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La5
            Z.c r8 = r0.f7809q
            r9 = r2
        L42:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L65:
            if (r1 >= r5) goto L98
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L95
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f6086f = r2
            k.F r3 = r11.f7811e
            java.lang.Object[] r3 = r3.f7794b
            r2 = r3[r2]
            r0.f7807o = r13
            r0.f7798f = r12
            r0.f7799g = r11
            r0.f7800h = r10
            r0.f7801i = r9
            r0.f7802j = r8
            r0.f7805m = r6
            r0.f7803k = r5
            r0.f7804l = r1
            r0.f7806n = r4
            r13.m3391b(r0, r2)
            P2.a r1 = p079P2.EnumC1152a.f3788d
            return r1
        L95:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L65
        L98:
            if (r5 != r3) goto La5
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        La0:
            if (r9 == r7) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            K2.q r1 = p056K2.C0891q.f2780a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p186k.C2410G.mo8p(java.lang.Object):java.lang.Object");
    }
}
