package p000A;

import me.dartcv.nuke.BuildConfig;
import p007B0.C0186T;
import p051J.C0818j;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p154e2.C2023b;
import p160f3.InterfaceC2160t;
import p216p.C2811D;
import p216p.C2822O;
import p216p.C2868y;
import p227r.C2981c0;
import p227r.InterfaceC2991h0;
import p255w.C3385p;

/* JADX INFO: renamed from: A.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0098y0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f456h;

    /* JADX INFO: renamed from: i */
    public int f457i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f458j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0098y0(int i5, InterfaceC1046d interfaceC1046d) {
        super(i5, interfaceC1046d);
        this.f456h = 6;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) throws Throwable {
        switch (this.f456h) {
            case 0:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 2:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 3:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 4:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 5:
                ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
            case 6:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 7:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 8:
                C0098y0 c0098y0 = (C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2991h0) obj);
                C0891q c0891q = C0891q.f2780a;
                c0098y0.mo8p(c0891q);
                return c0891q;
            default:
                return ((C0098y0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Q2.i, W2.c] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f456h) {
            case 0:
                return new C0098y0((C0818j) this.f458j, interfaceC1046d, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0098y0((C0186T) this.f458j, interfaceC1046d, 1);
            case 2:
                return new C0098y0((InterfaceC1601c) this.f458j, interfaceC1046d);
            case 3:
                return new C0098y0((C2868y) this.f458j, interfaceC1046d, 3);
            case 4:
                return new C0098y0((C2811D) this.f458j, interfaceC1046d, 4);
            case 5:
                return new C0098y0((C2822O) this.f458j, interfaceC1046d, 5);
            case 6:
                C0098y0 c0098y0 = new C0098y0(2, interfaceC1046d);
                c0098y0.f458j = obj;
                return c0098y0;
            case 7:
                return new C0098y0((C2981c0) this.f458j, interfaceC1046d, 7);
            case 8:
                return new C0098y0((C3385p) this.f458j, this.f457i, interfaceC1046d);
            default:
                return new C0098y0((C2023b) this.f458j, interfaceC1046d, 9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x014d, code lost:
    
        if (p095T.AbstractC1385s.m2626p(r1).m1209a(new p095T.C1342V(r9, 0), r8) == r4) goto L67;
     */
    /* JADX WARN: Path cross not found for [B:60:0x0124, B:63:0x012d], limit reached: 134 */
    /* JADX WARN: Path cross not found for [B:63:0x012d, B:60:0x0124], limit reached: 134 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131  */
    /* JADX WARN: Type inference failed for: r9v11, types: [Q2.i, W2.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x012f -> B:58:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014d -> B:68:0x0150). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000A.C0098y0.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0098y0(InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f456h = 2;
        this.f458j = (AbstractC1184i) interfaceC1601c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0098y0(Object obj, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f456h = i5;
        this.f458j = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098y0(C3385p c3385p, int i5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f456h = 8;
        this.f458j = c3385p;
        this.f457i = i5;
    }
}
