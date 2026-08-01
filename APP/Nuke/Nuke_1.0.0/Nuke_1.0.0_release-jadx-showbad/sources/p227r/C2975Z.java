package p227r;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p117X2.C1671p;
import p117X2.C1672q;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p203n.C2661j;

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2975Z) mo7n((InterfaceC1046d) obj2, (C3025y0) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2975Z c2975z = new C2975Z(this.f9417m, this.f9418n, this.f9419o, this.f9420p, this.f9421q, this.f9422r, this.f9423s, interfaceC1046d);
        c2975z.f9416l = obj;
        return c2975z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:43:0x01b0) to fix multi-entry loop: BACK_EDGE: B:43:0x01b0 -> B:14:0x006c */
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
    */
    public final Object mo8p(Object obj) throws Throwable {
        C3025y0 c3025y0;
        C1671p c1671p;
        C3025y0 c3025y02;
        char c5;
        int i5;
        C1675t c1675t;
        EnumC1152a enumC1152a;
        int i6;
        Object objM5175l;
        C1671p c1671p2;
        C2975Z c2975z = this;
        int i7 = c2975z.f9415k;
        C1675t c1675t2 = c2975z.f9419o;
        C1672q c1672q = c2975z.f9417m;
        char c6 = 3;
        int i8 = 2;
        int i9 = 1;
        C1675t c1675t3 = c2975z.f9418n;
        EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
        if (i7 == 0) {
            AbstractC1784a.m3205S(obj);
            c3025y0 = (C3025y0) c2975z.f9416l;
            C1671p c1671p3 = new C1671p();
            c1671p3.f5705d = true;
            c1671p = c1671p3;
        } else if (i7 == 1) {
            C1671p c1671p4 = c2975z.f9413i;
            C1671p c1671p5 = c2975z.f9412h;
            C3025y0 c3025y03 = (C3025y0) c2975z.f9416l;
            AbstractC1784a.m3205S(obj);
            c1671p4.f5705d = ((Boolean) obj).booleanValue();
            c2975z = this;
            c1675t3 = c1675t3;
            c3025y0 = c3025y03;
            enumC1152a2 = enumC1152a2;
            i9 = 1;
            c1671p = c1671p5;
            c6 = 3;
            i8 = 2;
        } else if (i7 == 2) {
            int i10 = c2975z.f9414j;
            C1671p c1671p6 = c2975z.f9412h;
            c3025y02 = (C3025y0) c2975z.f9416l;
            AbstractC1784a.m3205S(obj);
            C1675t c1675t4 = c1675t2;
            C1672q c1672q2 = c1672q;
            c1671p = c1671p6;
            if (c1671p.f5705d) {
                c3025y0 = c3025y02;
                c1675t2 = c1675t4;
                c1672q = c1672q2;
                i9 = 1;
                c6 = 3;
            } else {
                c2975z.f9416l = c3025y02;
                c2975z.f9412h = c1671p;
                c2975z.f9413i = c1671p;
                c5 = 3;
                c2975z.f9415k = 3;
                i5 = i8;
                c1675t = c1675t3;
                enumC1152a = enumC1152a2;
                i6 = 1;
                c1675t2 = c1675t4;
                c1672q = c1672q2;
                objM5175l = C2981c0.m5175l(c2975z.f9421q, c1675t2, c1672q, c2975z.f9423s, c1675t, 50 - ((long) i10), c2975z);
                if (objM5175l == enumC1152a) {
                    return enumC1152a;
                }
                c1671p2 = c1671p;
                c1671p.f5705d = ((Boolean) objM5175l).booleanValue();
                c1671p = c1671p2;
                c1675t3 = c1675t;
                enumC1152a2 = enumC1152a;
                c3025y0 = c3025y02;
                i8 = i5;
                i9 = i6;
                c6 = c5;
            }
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1671p c1671p7 = c2975z.f9413i;
            C1671p c1671p8 = c2975z.f9412h;
            c3025y02 = (C3025y0) c2975z.f9416l;
            AbstractC1784a.m3205S(obj);
            c1671p = c1671p7;
            i5 = 2;
            c1671p2 = c1671p8;
            c5 = 3;
            objM5175l = obj;
            i6 = 1;
            c1675t = c1675t3;
            enumC1152a = enumC1152a2;
            c1671p.f5705d = ((Boolean) objM5175l).booleanValue();
            c1671p = c1671p2;
            c1675t3 = c1675t;
            enumC1152a2 = enumC1152a;
            c3025y0 = c3025y02;
            i8 = i5;
            i9 = i6;
            c6 = c5;
        }
        while (true) {
            boolean z5 = c1671p.f5705d;
            C0891q c0891q = C0891q.f2780a;
            if (!z5) {
                return c0891q;
            }
            c1671p.f5705d = false;
            float fFloatValue = c1672q.f5706d - ((Number) ((C2661j) c1675t3.f5710e).f8478e.getValue()).floatValue();
            boolean z6 = ((C2973X) c1675t2.f5710e).f9405c;
            C2981c0 c2981c0 = c2975z.f9421q;
            if (!z6) {
                float fAbs = Math.abs(fFloatValue);
                float f2 = c2975z.f9420p;
                if (fAbs >= f2) {
                    break;
                }
            }
            C3025y0 c3025y04 = c3025y0;
            int i11 = i8;
            C1671p c1671p9 = c1671p;
            char c7 = c6;
            int i12 = i9;
            C1675t c1675t5 = c1675t3;
            EnumC1152a enumC1152a3 = enumC1152a2;
            c2981c0.m5187m(c3025y04, fFloatValue);
            c2975z.f9416l = c3025y04;
            c2975z.f9412h = c1671p9;
            c2975z.f9413i = c1671p9;
            c2975z.f9415k = i12;
            Object objM5175l2 = C2981c0.m5175l(c2975z.f9421q, c1675t2, c1672q, c2975z.f9423s, c1675t5, 50L, c2975z);
            if (objM5175l2 == enumC1152a3) {
                return enumC1152a3;
            }
            c1671p9.f5705d = ((Boolean) objM5175l2).booleanValue();
            c2975z = this;
            c1675t3 = c1675t5;
            c3025y0 = c3025y04;
            enumC1152a2 = enumC1152a3;
            i9 = i12;
            c1671p = c1671p9;
            c6 = c7;
            i8 = i11;
        }
    }
}
