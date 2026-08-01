package p227r;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p117X2.C1671p;
import p117X2.C1672q;
import p117X2.C1675t;

/* JADX INFO: renamed from: r.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C2975Z extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public C1671p f9412h;

    /* JADX INFO: renamed from: i */
    public C1671p f9413i;

    /* JADX INFO: renamed from: j */
    public int f9414j;

    /* JADX INFO: renamed from: k */
    public int f9415k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f9416l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1672q f9417m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C1675t f9418n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C1675t f9419o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ float f9420p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C2981c0 f9421q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ float f9422r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C2940A0 f9423s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2975Z(C1672q c1672q, C1675t c1675t, C1675t c1675t2, float f2, C2981c0 c2981c0, float f5, C2940A0 c2940a0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9417m = c1672q;
        this.f9418n = c1675t;
        this.f9419o = c1675t2;
        this.f9420p = f2;
        this.f9421q = c2981c0;
        this.f9422r = f5;
        this.f9423s = c2940a0;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2975Z) mo7n((InterfaceC1046d) obj2, (C3025y0) obj)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2975Z c2975z = new C2975Z(this.f9417m, this.f9418n, this.f9419o, this.f9420p, this.f9421q, this.f9422r, this.f9423s, interfaceC1046d);
        c2975z.f9416l = obj;
        return c2975z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        r9 = java.lang.Math.signum(r9) * r12;
        r11.m5187m(r0, r9);
        r10 = (p203n.C2661j) r5.f5710e;
        r9 = p203n.AbstractC2649d.m4613f(r10, ((java.lang.Number) r10.f8478e.getValue()).floatValue() + r9);
        r5.f5710e = r9;
        r9 = p127Z2.AbstractC1784a.m3200N(java.lang.Math.abs(r2.f5706d - ((java.lang.Number) r9.f8478e.getValue()).floatValue()) / r7.f9422r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e0, code lost:
    
        if (r9 <= 100) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e2, code lost:
    
        r9 = 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e3, code lost:
    
        r10 = (p203n.C2661j) r5.f5710e;
        r11 = r2.f5706d;
        r17 = r9;
        r9 = r7.f9421q;
        r11 = r2;
        r10 = r1;
        r8 = new p000A.C0096x0(r9, r10, r11, r7.f9423s, r13, 2);
        r8 = r13;
        r19 = r10;
        r20 = r11;
        r7.f9416l = r0;
        r7.f9412h = r8;
        r7.f9413i = null;
        r7.f9414j = r17;
        r7.f9415k = r3;
        r9.getClass();
        r10 = new p117X2.C1672q();
        r10.f5706d = ((java.lang.Number) r10.f8478e.getValue()).floatValue();
        r12 = r0;
        r0 = p203n.AbstractC2649d.m4610c(r10, new java.lang.Float(r11), p203n.AbstractC2649d.m4618k(r17, 0, p203n.AbstractC2676u.f8543b, r3), new p000A.C0006D(r10, r9, r12, r8, 4), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0146, code lost:
    
        if (r0 != r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0149, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x014b, code lost:
    
        if (r0 != r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0150, code lost:
    
        r0 = r17;
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ad, code lost:
    
        return r6;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x017b -> B:37:0x017c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x018d -> B:14:0x006c). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C2975Z.mo8p(java.lang.Object):java.lang.Object");
    }
}
