package p186k;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p124Z.C1779c;
import p127Z2.AbstractC1784a;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2410G(C2411H c2411h, C1779c c1779c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f7808p = c2411h;
        this.f7809q = c1779c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2410G) mo7n((InterfaceC1046d) obj2, (C1906h) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2410G c2410g = new C2410G(this.f7808p, this.f7809q, interfaceC1046d);
        c2410g.f7807o = obj;
        return c2410g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    */
    public final Object mo8p(Object obj) {
        C1906h c1906h;
        C2411H c2411h;
        long[] jArr;
        int length;
        C1779c c1779c;
        int i5;
        long j5;
        int i6 = this.f7806n;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj);
            c1906h = (C1906h) this.f7807o;
            c2411h = this.f7808p;
            jArr = c2411h.f7811e.f7793a;
            length = jArr.length - 2;
            if (length >= 0) {
                c1779c = this.f7809q;
                i5 = 0;
                j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i5 != length) {
                }
            }
            return C0891q.f2780a;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i7 = this.f7804l;
        int i8 = this.f7803k;
        long j6 = this.f7805m;
        int i9 = this.f7802j;
        int i10 = this.f7801i;
        long[] jArr2 = this.f7800h;
        C2411H c2411h2 = this.f7799g;
        C1779c c1779c2 = this.f7798f;
        C1906h c1906h2 = (C1906h) this.f7807o;
        AbstractC1784a.m3205S(obj);
        j6 >>= 8;
        i7++;
        if (i7 < i8) {
            if (i8 == 8) {
                length = i10;
                jArr = jArr2;
                c2411h = c2411h2;
                c1906h = c1906h2;
                i5 = i9;
                c1779c = c1779c2;
                if (i5 != length) {
                    i5++;
                    j5 = jArr[i5];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        c1906h2 = c1906h;
                        i7 = 0;
                        c2411h2 = c2411h;
                        jArr2 = jArr;
                        i8 = 8 - ((~(i5 - length)) >>> 31);
                        c1779c2 = c1779c;
                        i9 = i5;
                        i10 = length;
                        j6 = j5;
                        if (i7 < i8) {
                            if ((255 & j6) < 128) {
                                int i11 = (i9 << 3) + i7;
                                c1779c2.f6086f = i11;
                                Object obj2 = c2411h2.f7811e.f7794b[i11];
                                this.f7807o = c1906h2;
                                this.f7798f = c1779c2;
                                this.f7799g = c2411h2;
                                this.f7800h = jArr2;
                                this.f7801i = i10;
                                this.f7802j = i9;
                                this.f7805m = j6;
                                this.f7803k = i8;
                                this.f7804l = i7;
                                this.f7806n = 1;
                                c1906h2.m3391b(this, obj2);
                                return EnumC1152a.f3788d;
                            }
                            j6 >>= 8;
                            i7++;
                            if (i7 < i8) {
                            }
                        }
                    }
                    if (i5 != length) {
                    }
                }
            }
            return C0891q.f2780a;
        }
    }
}
