package p069f;

import ng.AbstractC3014l;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: f.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0947m0 extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public C0939i0 f2981g;

    /* JADX INFO: renamed from: h */
    public C0949n0 f2982h;

    /* JADX INFO: renamed from: i */
    public long[] f2983i;

    /* JADX INFO: renamed from: j */
    public int f2984j;

    /* JADX INFO: renamed from: k */
    public int f2985k;

    /* JADX INFO: renamed from: l */
    public int f2986l;

    /* JADX INFO: renamed from: m */
    public int f2987m;

    /* JADX INFO: renamed from: n */
    public long f2988n;

    /* JADX INFO: renamed from: o */
    public int f2989o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f2990p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0949n0 f2991q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0939i0 f2992r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0947m0(C0949n0 c0949n0, C0939i0 c0939i0, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f2991q = c0949n0;
        this.f2992r = c0939i0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        C0947m0 c0947m0 = new C0947m0(this.f2991q, this.f2992r, interfaceC5557c);
        c0947m0.f2990p = obj;
        return c0947m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0947m0) create((AbstractC3014l) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC3014l abstractC3014l;
        C0949n0 c0949n0;
        long[] jArr;
        int length;
        C0939i0 c0939i0;
        int i9;
        long j3;
        int i10 = this.f2989o;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            abstractC3014l = (AbstractC3014l) this.f2990p;
            c0949n0 = this.f2991q;
            jArr = c0949n0.f2995h.f2975a;
            length = jArr.length - 2;
            if (length >= 0) {
                c0939i0 = this.f2992r;
                i9 = 0;
                j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i9 != length) {
                }
            }
            return C3967n.f12976a;
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i11 = this.f2987m;
        int i12 = this.f2986l;
        long j4 = this.f2988n;
        int i13 = this.f2985k;
        int i14 = this.f2984j;
        long[] jArr2 = this.f2983i;
        C0949n0 c0949n02 = this.f2982h;
        C0939i0 c0939i02 = this.f2981g;
        AbstractC3014l abstractC3014l2 = (AbstractC3014l) this.f2990p;
        AbstractC1089i.m2732I0(obj);
        j4 >>= 8;
        i11++;
        if (i11 < i12) {
            if (i12 == 8) {
                length = i14;
                jArr = jArr2;
                c0949n0 = c0949n02;
                abstractC3014l = abstractC3014l2;
                i9 = i13;
                c0939i0 = c0939i02;
                if (i9 != length) {
                    i9++;
                    j3 = jArr[i9];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        abstractC3014l2 = abstractC3014l;
                        i11 = 0;
                        c0949n02 = c0949n0;
                        jArr2 = jArr;
                        i12 = 8 - ((~(i9 - length)) >>> 31);
                        c0939i02 = c0939i0;
                        i13 = i9;
                        i14 = length;
                        j4 = j3;
                        if (i11 < i12) {
                            if ((255 & j4) < 128) {
                                int i15 = (i13 << 3) + i11;
                                c0939i02.f2957h = i15;
                                Object obj2 = c0949n02.f2995h.f2976b[i15];
                                this.f2990p = abstractC3014l2;
                                this.f2981g = c0939i02;
                                this.f2982h = c0949n02;
                                this.f2983i = jArr2;
                                this.f2984j = i14;
                                this.f2985k = i13;
                                this.f2988n = j4;
                                this.f2986l = i12;
                                this.f2987m = i11;
                                this.f2989o = 1;
                                abstractC3014l2.mo6406a(obj2, this);
                                return EnumC5799a.f23547g;
                            }
                            j4 >>= 8;
                            i11++;
                            if (i11 < i12) {
                            }
                        }
                    }
                    if (i9 != length) {
                    }
                }
            }
            return C3967n.f12976a;
        }
    }
}
