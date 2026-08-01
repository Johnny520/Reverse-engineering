package p095T;

import me.dartcv.nuke.BuildConfig;
import p011B4.AbstractC0231b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p127Z2.AbstractC1784a;
import p143c3.C1906h;
import p186k.C2404A;
import p186k.C2438t;

/* JADX INFO: renamed from: T.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1365i extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public int f4804f;

    /* JADX INFO: renamed from: g */
    public int f4805g;

    /* JADX INFO: renamed from: h */
    public int f4806h;

    /* JADX INFO: renamed from: i */
    public int f4807i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f4808j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1367j f4809k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365i(C1367j c1367j, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f4809k = c1367j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C1365i) mo7n((InterfaceC1046d) obj2, (C1906h) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C1365i c1365i = new C1365i(this.f4809k, interfaceC1046d);
        c1365i.f4808j = obj;
        return c1365i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        C1906h c1906h;
        int i5;
        int i6;
        int i7;
        String strM398i;
        int i8;
        int i9;
        String str;
        C1367j c1367j = this.f4809k;
        C2404A c2404a = c1367j.f4812d;
        C2438t c2438t = c1367j.f4814f;
        int i10 = this.f4807i;
        if (i10 == 0) {
            AbstractC1784a.m3205S(obj);
            c1906h = (C1906h) this.f4808j;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i5 = this.f4806h;
            i6 = this.f4805g;
            i7 = this.f4804f;
            c1906h = (C1906h) this.f4808j;
            AbstractC1784a.m3205S(obj);
        }
        if (i7 >= Math.min(c1367j.f4815g + 10, c2438t.f7878b)) {
            return C0891q.f2780a;
        }
        int i11 = i7 + 1;
        int iM4336c = c2438t.m4336c(i7);
        switch (iM4336c) {
            case 0:
                strM398i = "up";
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                Object objM4248f = c2404a.m4248f(i6);
                i6++;
                strM398i = "down " + objM4248f;
                break;
            case 2:
                strM398i = "remove " + c2438t.m4336c(i11) + ' ' + c2438t.m4336c(i7 + 2);
                i11 = i7 + 3;
                break;
            case 3:
                strM398i = "move " + c2438t.m4336c(i11) + ' ' + c2438t.m4336c(i7 + 2) + ' ' + c2438t.m4336c(i7 + 3);
                i11 = i7 + 4;
                break;
            case 4:
                strM398i = "clear";
                break;
            case 5:
                i8 = i7 + 2;
                int iM4336c2 = c2438t.m4336c(i11);
                i9 = i6 + 1;
                str = "insertBottomUp " + iM4336c2 + ' ' + c2404a.m4248f(i6);
                int i12 = i8;
                strM398i = str;
                i11 = i12;
                i6 = i9;
                break;
            case 6:
                i8 = i7 + 2;
                int iM4336c3 = c2438t.m4336c(i11);
                i9 = i6 + 1;
                str = "insertTopDown " + iM4336c3 + ' ' + c2404a.m4248f(i6);
                int i122 = i8;
                strM398i = str;
                i11 = i122;
                i6 = i9;
                break;
            case 7:
                Object objM4248f2 = c2404a.m4248f(i6);
                AbstractC1665j.m2983c(objM4248f2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                AbstractC1678w.m2998b(2, objM4248f2);
                i6 += 2;
                strM398i = "apply " + ((InterfaceC1603e) objM4248f2);
                break;
            case 8:
                strM398i = "reuse " + c1367j.f4813e.m4248f(i5);
                i5++;
                break;
            case 9:
                strM398i = "recompose pending";
                break;
            default:
                strM398i = AbstractC0231b.m398i("unknown op: ", iM4336c);
                break;
        }
        this.f4808j = c1906h;
        this.f4804f = i11;
        this.f4805g = i6;
        this.f4806h = i5;
        this.f4807i = 1;
        c1906h.m3391b(this, i7 + ": " + strM398i);
        return EnumC1152a.f3788d;
    }
}
