package p227r;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.C1675t;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: r.I */
/* JADX INFO: loaded from: classes.dex */
public final class C2955I extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9348h = 0;

    /* JADX INFO: renamed from: i */
    public C1675t f9349i;

    /* JADX INFO: renamed from: j */
    public C1675t f9350j;

    /* JADX INFO: renamed from: k */
    public int f9351k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f9352l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C3015t0 f9353m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2955I(C1675t c1675t, C3015t0 c3015t0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9350j = c1675t;
        this.f9353m = c3015t0;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f9348h) {
            case 0:
                return ((C2955I) mo7n((InterfaceC1046d) obj2, (InterfaceC1601c) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C2955I) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f9348h) {
            case 0:
                C2955I c2955i = new C2955I(this.f9350j, this.f9353m, interfaceC1046d);
                c2955i.f9352l = obj;
                return c2955i;
            default:
                C2955I c2955i2 = new C2955I(this.f9353m, interfaceC1046d);
                c2955i2.f9352l = obj;
                return c2955i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (p227r.C3015t0.m5209M0(r2, r10) != r4) goto L13;
     */
    /* JADX WARN: Path cross not found for [B:49:0x00d9, B:45:0x00c7], limit reached: 88 */
    /* JADX WARN: Path cross not found for [B:51:0x00dd, B:21:0x005d], limit reached: 88 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[PHI: r0 r5
  0x0039: PHI (r0v14 X2.t) = (r0v6 X2.t), (r0v18 X2.t) binds: [B:15:0x0036, B:41:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r5v6 f3.t) = (r5v4 f3.t), (r5v7 f3.t) binds: [B:15:0x0036, B:41:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[PHI: r6
  0x005d: PHI (r6v8 f3.t) = (r6v0 f3.t), (r6v3 f3.t), (r6v3 f3.t), (r6v3 f3.t), (r6v6 f3.t), (r6v9 f3.t) binds: [B:20:0x0055, B:50:0x00db, B:52:0x00e8, B:46:0x00d4, B:32:0x0089, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:43:0x00c1, B:45:0x00c7, B:49:0x00d9, B:51:0x00dd), top: B:91:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9 A[Catch: CancellationException -> 0x00d7, TryCatch #2 {CancellationException -> 0x00d7, blocks: (B:43:0x00c1, B:45:0x00c7, B:49:0x00d9, B:51:0x00dd), top: B:91:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0089 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d4 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00db -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e8 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00f6 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x014a -> B:81:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x014f -> B:83:0x0150). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C2955I.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2955I(C3015t0 c3015t0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9353m = c3015t0;
    }
}
